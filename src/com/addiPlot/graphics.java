package com.addiPlot;

import java.util.AbstractQueue;
import java.util.Queue;
import java.util.Vector;

import com.addiPlot.gadgets.BoundingBox;
import com.addiPlot.gadgets.text_label;
import com.addiPlot.gp_types.PLOT_SMOOTH;
import com.addiPlot.gp_types.PLOT_STYLE;
import com.addiPlot.gp_types.PLOT_TYPE;
import com.addiPlot.gp_types.coord_type;
import com.addiPlot.gp_types.coordinate;
import com.addiPlot.term_api.lp_style_type;
import com.addiPlot.axis;

public class graphics {

	/* types defined for 2D plotting */

	public class curve_points {
		//struct curve_points *next;	/* pointer to next plot in linked list */
		public int token;			/* last token used, for second parsing pass */
		public PLOT_TYPE plot_type;	/* DATA2D? DATA3D? FUNC2D FUNC3D? NODATA? */
		public PLOT_STYLE plot_style;	/* style set by "with" or by default */
		public String title;		/* plot title, a.k.a. key entry */
		public boolean title_no_enhanced;	/* don't typeset title in enhanced mode */
		public boolean title_is_filename;	/* TRUE if title was auto-generated from filename */
		public boolean title_is_suppressed;/* TRUE if 'notitle' was specified */
		public boolean noautoscale;	/* ignore data from this plot during autoscaling */
		public lp_style_type lp_properties;
		//public arrow_style_type arrow_properties;
		//public fill_style_type fill_properties;
		public text_label labels;	/* Only used if plot_style == LABELPOINTS */
		//public t_image image_properties;	/* only used if plot_style is IMAGE or RGB_IMAGE */

		/* 2D and 3D plot structure fields overlay only to this point */
		//public filledcurves_opts filledcurves_options;
		public int ellipseaxes_units;              /* Only used if plot_style == ELLIPSES */    
		//public histogram_style histogram;	/* Only used if plot_style == HISTOGRAM */
		public int histogram_sequence;	/* Ordering of this dataset within the histogram */
		public PLOT_SMOOTH plot_smooth; /* which "smooth" method to be used? */
		public int p_max;			/* how many points are allocated */
		public int p_count;		/* count of points in points */
		public int x_axis;			/* FIRST_X_AXIS or SECOND_X_AXIS */
		public int y_axis;			/* FIRST_Y_AXIS or SECOND_Y_AXIS */
		public int z_axis;			/* same as either x_axis or y_axis, for 5-column plot types */
		public Vector<Double> varcolor = new Vector<Double>();	/* Only used if plot has variable color */
		public Vector<coordinate> points=new Vector<coordinate>();
	};

	/* key placement is calculated in boundary, so we need file-wide variables
	 * To simplify adjustments to the key, we set all these once [depends on
	 * key->reverse] and use them throughout.
	 */

	/*{{{  local and global variables */
	static int key_sample_width;	/* width of line sample */
	static int key_sample_left;	/* offset from x for left of line sample */
	static int key_sample_right;	/* offset from x for right of line sample */
	static int key_point_offset;	/* offset from x for point sample */
	static int key_text_left;	/* offset from x for left-justified text */
	static int key_text_right;	/* offset from x for right-justified text */
	static int key_size_left;	/* size of left bit of key (text or sample, depends on key->reverse) */
	static int key_size_right;	/* size of right part of key (including padding) */
	static int max_ptitl_len = 0;	/* max length of plot-titles (keys) */
	static double ktitl_lines = 0;	/* no lines in key->title (key header) */
	static int ptitl_cnt;		/* count keys with len > 0  */
	static int key_rows, key_col_wth, yl_ref;

	/* set by tic_callback - how large to draw polar radii */
	static double largest_polar_circle;

	static int xlablin[], x2lablin[], ylablin[], y2lablin[], titlelin[], xticlin[], x2ticlin[];

	static int key_entry_height;	/* bigger of t->v_size, pointsize*t->v_tick */
	static int p_width, p_height;	/* pointsize * { t->h_tic | t->v_tic } */


	/* there are several things on right of plot - key, y2tics and y2label
	 * when working out boundary, save posn of y2label for later...
	 * Same goes for x2label.
	 */
	static int ylabel_x, y2label_x, xlabel_y, x2label_y, title_y, time_y, time_x;
	static int ylabel_y, y2label_y, xtic_y, x2tic_y, ytic_x, y2tic_x;
	/*}}} */

	/* externally visible variables of graphics.h */

	/* 'set offset' status variables */
	public static gadgets.t_position loff, roff, toff, boff;

	/* 'set bar' status */
	public static double bar_size;
	public static int bar_layer;

	public static boolean lkey;

	static int
	find_maxl_keys(curve_points plots, int count, int[] kcnt)
	{
		int mlen, len, curve, cnt;
		curve_points this_plot;

		mlen = cnt = 0;
		this_plot = plots;
		for (curve = 0; curve < count; this_plot = this_plot.next, curve++) {
			if ((this_plot.title != null) && !this_plot.title_is_suppressed) {
				term_api.ignore_enhanced(this_plot.title_no_enhanced);
				len = term_api.estimate_strlen(this_plot.title);
				if (len != 0) {
					cnt++;
					if (len > mlen)
						mlen = len;
				}
				term_api.ignore_enhanced(false);
			}

			/* Check for new histogram here and save space for divider */
			if (this_plot.plot_style == gp_types.PLOT_STYLE.HISTOGRAMS
					&&  this_plot.histogram_sequence == 0 && cnt > 1)
				cnt++;
			/* Check for column-stacked histogram with key entries */
			if (this_plot.plot_style == gp_types.PLOT_STYLE.HISTOGRAMS &&  (this_plot.labels != null)) {
				text_label key_entry = this_plot.labels.next;
				for (; key_entry; key_entry=key_entry.next) {
					cnt++;
					len = (key_entry.text != null) ? term_api.estimate_strlen(key_entry.text) : 0;
					if (len > mlen)
						mlen = len;
				}
			}
		}

		if (kcnt != null)
			kcnt[0] = cnt;
		return (mlen);
	}


	/*{{{  boundary() */
	/* borders of plotting area
	 * computed once on every call to do_plot
	 *
	 * The order in which things is done is getting pretty critical:
	 *  plot_bounds.ytop depends on title, x2label, ylabels (if no rotated text)
	 *  plot_bounds.ybot depends on key, if "under"
	 *  once we have these, we can setup the y1 and y2 tics and the
	 *  only then can we calculate plot_bounds.xleft and plot_bounds.xright
	 *  plot_bounds.xright depends also on key RIGHT
	 *  then we can do x and x2 tics
	 *
	 * For set size ratio ..., everything depends on everything else...
	 * not really a lot we can do about that, so we lose if the plot has to
	 * be reduced vertically. But the chances are the
	 * change will not be very big, so the number of tics will not
	 * change dramatically.
	 *
	 * Margin computation redone by Dick Crawford (rccrawford@lanl.gov) 4/98
	 */

	static void
	boundary(curve_points plots, int count)
	{
		int yticlin[] = new int[1];
		int y2ticlin[] = new int[1];
		int timelin[] = new int[1];
		yticlin[0] = y2ticlin[0] = timelin[0] = 0;
		gadgets.legend_key key = gadgets.keyT;

		int key_h, key_w;
		/* FIXME HBB 20000506: this line is the reason for the 'D0,1;D1,0'
		 * bug in the HPGL terminal: we actually carry out the switch of
		 * text orientation, just for finding out if the terminal can do
		 * that. *But* we're not in graphical mode, yet, so this call
		 * yields undesirable results */
		int can_rotate = term.text_angle(term_api.TEXT_VERTICAL);

		int xtic_textheight;	/* height of xtic labels */
		int x2tic_textheight;	/* height of x2tic labels */
		int title_textheight;	/* height of title */
		int xlabel_textheight;	/* height of xlabel */
		int x2label_textheight;	/* height of x2label */
		int timetop_textheight;	/* height of timestamp (if at top) */
		int timebot_textheight;	/* height of timestamp (if at bottom) */
		int ylabel_textheight;	/* height of (unrotated) ylabel */
		int y2label_textheight;	/* height of (unrotated) y2label */
		int ylabel_textwidth;	/* width of (rotated) ylabel */
		int y2label_textwidth;	/* width of (rotated) y2label */
		int timelabel_textwidth;	/* width of timestamp */
		int ytic_textwidth;		/* width of ytic labels */
		int y2tic_textwidth;	/* width of y2tic labels */
		int x2tic_height;		/* 0 for tic_in or no x2tics, ticscale*v_tic otherwise */
		int xtic_textwidth=0;	/* amount by which the xtic label protrude to the right */
		int xtic_height;
		int ytic_width;
		int y2tic_width;

		int key_cols = 1;		/* # columns of keys */

		/* figure out which rotatable items are to be rotated
		 * (ylabel and y2label are rotated if possible) */
		int vertical_timelabel = (can_rotate != 0) ? gadgets.timelabel_rotate : 0;
		int vertical_xtics  = (can_rotate != 0) ? axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].tic_rotate : 0;
		int vertical_x2tics = (can_rotate != 0) ? axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].tic_rotate : 0;
		int vertical_ytics  = (can_rotate != 0) ? axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].tic_rotate : 0;
		int vertical_y2tics = (can_rotate != 0) ? axis.axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].tic_rotate : 0;

		boolean shift_labels_to_border = false;

		lkey = key.visible;	/* but we may have to disable it later */

		xticlin = new int[1];
		ylablin = new int[1];
		y2lablin = new int[1];
		xlablin = new int[1];
		x2lablin = new int[1];
		titlelin = new int[1];
		xticlin[0] = ylablin[0] = y2lablin[0] = xlablin[0] = x2lablin[0] = titlelin[0] = 0;

		/*{{{  count lines in labels and tics */
		if (gadgets.title.text != null)
			label_width(gadgets.title.text, titlelin);
		if (axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].label.text != null)
			label_width(axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].label.text, xlablin);

		/* This should go *inside* label_width(), but it messes up the key title */
		/* Imperfect check for subscripts or superscripts */
		if (((term.flags & term_api.TERM_ENHANCED_TEXT) != 0) && (axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].label.text != null)
				&& (axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].label.text.indexOf("_^") != -1))
			xlablin[0]++;

		if (axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].label.text != null)
			label_width(axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].label.text, x2lablin);
		if (axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].label.text != null)
			label_width(axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].label.text, ylablin);
		if (axis.axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].label.text != null)
			label_width(axis.axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].label.text, y2lablin);

		if (axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticmode != 0) {
			label_width(axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].formatstring, xticlin);
			/* Reserve room for user tic labels even if format of autoticks is "" */
			if (xticlin[0] == 0 && axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticdef.def.user)
				xticlin[0] = 1;
		}

		if (axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].ticmode != 0)
			label_width(axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].formatstring, x2ticlin);
		if (axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].ticmode != 0)
			label_width(axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].formatstring, yticlin);
		if (axis.axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].ticmode != 0)
			label_width(axis.axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].formatstring, y2ticlin);
		if (gadgets.timelabel.text != null)
			label_width(gadgets.timelabel.text, timelin);
		/*}}} */

		/*{{{  preliminary plot_bounds.ytop  calculation */

		/*     first compute heights of things to be written in the margin */

		/* title */
		if (titlelin[0] != 0) {
			double tmpx[], tmpy[];
			tmpx = tmpy = new double[1];
			map_position_r(gadgets.title.offset, tmpx, tmpy, "boundary");
			title_textheight = (int) ((titlelin[0] + 1) * (term.v_char) + tmpy[0]);
		} else
			title_textheight = 0;

		/* x2label */
		if (x2lablin[0] != 0) {
			double tmpx[], tmpy[];
			tmpx = tmpy = new double[1];
			map_position_r(axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].label.offset),
			tmpx, tmpy, "boundary");
			x2label_textheight = (int) (x2lablin[0] * term.v_char + tmpy[0]);
			if (axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].ticmode == 0)
				x2label_textheight += 0.5 * term.v_char;
		} else
			x2label_textheight = 0;

		/* tic labels */
		if (axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].ticmode & TICS_ON_BORDER) {
			/* ought to consider tics on axes if axis near border */
			if (vertical_x2tics) {
				/* guess at tic length, since we don't know it yet
		       --- we'll fix it after the tic labels have been created */
				x2tic_textheight = (int) (5 * term.h_char);
			} else
				x2tic_textheight = (int) (x2ticlin[0] * term.v_char);
		} else
			x2tic_textheight = 0;

		/* tics */
		if (!axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].tic_in
				&& ((axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].ticmode & TICS_ON_BORDER)
						|| ((axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticmode & TICS_MIRROR)
								&& (axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticmode & TICS_ON_BORDER))))
			x2tic_height = (int) (term.v_tic * axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].ticscale);
		else
			x2tic_height = 0;

		/* timestamp */
		if ((gadgets.timelabel.text != null) && (gadgets.timelabel_bottom == 0)) {
			double tmpx[], tmpy[];
			tmpx = tmpy = new double[1];
			map_position_r(timelabel.offset, tmpx, tmpy, "boundary");
			timetop_textheight = (int) ((timelin[0] + 2) * term.v_char + tmpy[0]);
		} else
			timetop_textheight = 0;

		/* horizontal ylabel */
		if (axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].label.text && !can_rotate) {
			double tmpx[], tmpy[];
			tmpx = tmpy = new double[1];
			map_position_r(axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].label.offset,
					tmpx, tmpy, "boundary");
			ylabel_textheight = (int) (ylablin[0] * term.v_char + tmpy[0]);
		} else
			ylabel_textheight = 0;

		/* horizontal y2label */
		if (axis.axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].label.text && !can_rotate) {
			double tmpx[], tmpy[];
			tmpx = tmpy = new double[1];
			map_position_r(axis.axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].label.offset,
					tmpx, tmpy, "boundary");
			y2label_textheight = (int) (y2lablin[0] * term.v_char + tmpy[0]);
		} else
			y2label_textheight = 0;

		/* compute plot_bounds.ytop from the various components
		 *     unless tmargin is explicitly specified  */

		gadgets.plot_bounds.ytop = (int) (0.5 + (ysize + yoffset) * (term.ymax-1));

		if (tmargin.scalex == screen) {
			/* Specified as absolute position on the canvas */
			gadgets.plot_bounds.ytop = (tmargin.x) * (float)(term.ymax-1);
		} else if (tmargin.x >=0) {
			/* Specified in terms of character height */
			gadgets.plot_bounds.ytop -= (int)(tmargin.x * (float)term.v_char + 0.5);
		} else {
			/* Auto-calculation of space required */
			int top_margin = x2label_textheight + title_textheight;

			if (timetop_textheight + ylabel_textheight > top_margin)
				top_margin = timetop_textheight + ylabel_textheight;
			if (y2label_textheight > top_margin)
				top_margin = y2label_textheight;

			top_margin += x2tic_height + x2tic_textheight;
			/* x2tic_height and x2tic_textheight are computed as only the
			 *     relevant heights, but they nonetheless need a blank
			 *     space above them  */
			if (top_margin > x2tic_height)
				top_margin += (int) term.v_char;

				gadgets.plot_bounds.ytop -= top_margin;
				if (gadgets.plot_bounds.ytop == (int)(0.5 + (ysize + yoffset) * (term.ymax-1))) {
					/* make room for the end of rotated ytics or y2tics */
					gadgets.plot_bounds.ytop -= (int) (term.h_char * 2);
				}
		}

		/*  end of preliminary plot_bounds.ytop calculation }}} */


		/*{{{  preliminary plot_bounds.xleft, needed for "under" */
		if (lmargin.scalex == screen)
			gadgets.plot_bounds.xleft = lmargin.x * (float)term.xmax;
			else
				gadgets.plot_bounds.xleft = xoffset * term.xmax
				+ term.h_char * (lmargin.x >= 0 ? lmargin.x : 1);
				/*}}} */


				/*{{{  tentative plot_bounds.xright, needed for "under" */
				if (rmargin.scalex == screen)
					gadgets.plot_bounds.xright = rmargin.x * (float)(term.xmax - 1);
				else
					gadgets.plot_bounds.xright = (xsize + xoffset) * (term.xmax - 1)
					- term.h_char * (rmargin.x >= 0 ? rmargin.x : 2);
					/*}}} */


					/*{{{  preliminary plot_bounds.ybot calculation
					 *     first compute heights of labels and tics */

					/* tic labels */
					shift_labels_to_border = FALSE;
					if (axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticmode & TICS_ON_AXIS) {
						/* FIXME: This test for how close the axis is to the border does not match */
						/*        the tests in axis_output_tics(), and assumes FIRST_Y_AXIS.       */
						if (!inrange(0.0, axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].min, axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].max))
							shift_labels_to_border = TRUE;
						if (0.05 > Math.abs( axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].min
								/ (axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].max - axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].min)))
							shift_labels_to_border = TRUE;
					}
					if ((axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticmode & TICS_ON_BORDER)
							||  shift_labels_to_border) {
						/* ought to consider tics on axes if axis near border */
						if (vertical_xtics) {
							/* guess at tic length, since we don't know it yet */
							xtic_textheight = (int) (term.h_char * 5);
						} else
							xtic_textheight = (int) (term.v_char * (xticlin[0] + 1));
					} else
						xtic_textheight =  0;

					/* tics */
					if (!axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].tic_in
							&& ((axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticmode & TICS_ON_BORDER)
									|| ((axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].ticmode & TICS_MIRROR)
											&& (axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].ticmode & TICS_ON_BORDER))))
						xtic_height = (int) (term.v_tic * axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticscale);
					else
						xtic_height = 0;

					/* xlabel */
					if (xlablin[0]) {
						double tmpx[], tmpy[];
						tmpx = tmpy = new double[1];
						map_position_r(axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].label.offset,
								tmpx, tmpy, "boundary");
						/* offset is subtracted because if > 0, the margin is smaller */
						/* textheight is inflated by 0.2 to allow descenders to clear bottom of canvas */
						xlabel_textheight = (int) (((float)xlablin[0] + 0.2) * term.v_char - tmpy[0]);
						if (axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticmode == 0)
							xlabel_textheight += 0.5 * term.v_char;
					} else
						xlabel_textheight = 0;

					/* timestamp */
					if ((gadgets.timelabel.text != null) && (gadgets.timelabel_bottom != 0)) {
						/* && !vertical_timelabel)
						 * DBT 11-18-98 resize plot for vertical timelabels too !
						 */
						double tmpx[], tmpy[];
						tmpx = tmpy = new double[1];
						map_position_r(gadgets.timelabel.offset, tmpx, tmpy, "boundary");
						/* offset is subtracted because if . 0, the margin is smaller */
						timebot_textheight = (int) (timelin[0] * term.v_char - tmpy[0]);
					} else
						timebot_textheight = 0;

					/* compute plot_bounds.ybot from the various components
					 *     unless bmargin is explicitly specified  */

					gadgets.plot_bounds.ybot = yoffset * (float)term.ymax;

					if (bmargin.scalex == screen) {
						/* Absolute position for bottom of plot */
						plot_bounds.ybot = bmargin.x * (float)t->ymax;
					} else if (bmargin.x >= 0) {
						/* Position based on specified character height */
						plot_bounds.ybot += bmargin.x * (float)t->v_char + 0.5;
					} else {
						plot_bounds.ybot += xtic_height + xtic_textheight;
						if (xlabel_textheight > 0)
							plot_bounds.ybot += xlabel_textheight;
						if (timebot_textheight > 0)
							plot_bounds.ybot += timebot_textheight;
						/* HBB 19990616: round to nearest integer, required to escape
						 * floating point inaccuracies */
						if (plot_bounds.ybot == (int) (t->ymax * yoffset)) {
							/* make room for the end of rotated ytics or y2tics */
							plot_bounds.ybot += (int) (t->h_char * 2);
						}
					}

					/*  end of preliminary plot_bounds.ybot calculation }}} */

					if (lkey) {
						TBOOLEAN key_panic = FALSE;
						/*{{{  essential key features */

						p_width = pointsize * t->h_tic;
						p_height = pointsize * t->v_tic;

						if (key->swidth >= 0)
							key_sample_width = key->swidth * t->h_char + p_width;
							else
								key_sample_width = 0;

						key_entry_height = p_height * 1.25 * key->vert_factor;
						if (key_entry_height < t->v_char)
							key_entry_height = t->v_char * key->vert_factor;
							/* HBB 20020122: safeguard to prevent division by zero later */
							if (key_entry_height == 0)
								key_entry_height = 1;

							/* Count max_len key and number keys with len > 0 */
							max_ptitl_len = find_maxl_keys(plots, count, &ptitl_cnt);

							/* Key title length and height */
							if (key->title) {
								int ytlen, ytheight;
								ytlen = label_width(key->title, &ytheight);
								ytlen -= key->swidth + 2;
								/* EAM FIXME */
								if ((ytlen > max_ptitl_len) && (key->stack_dir != GPKEY_HORIZONTAL))
									max_ptitl_len = ytlen;
								ktitl_lines = (int)ytheight;
							}

							if (key->reverse) {
								key_sample_left = -key_sample_width;
								key_sample_right = 0;
								/* if key width is being used, adjust right-justified text */
								key_text_left = t->h_char;
								key_text_right = t->h_char * (max_ptitl_len + 1 + key->width_fix);
								key_size_left = t->h_char - key_sample_left; /* sample left is -ve */
								key_size_right = key_text_right;
							} else {
								key_sample_left = 0;
								key_sample_right = key_sample_width;
								/* if key width is being used, adjust left-justified text */
								key_text_left = -(int) (t->h_char
										* (max_ptitl_len + 1 + key->width_fix));
								key_text_right = -(int) t->h_char;
								key_size_left = -key_text_left;
								key_size_right = key_sample_right + t->h_char;
							}
							key_point_offset = (key_sample_left + key_sample_right) / 2;

							/* advance width for cols */
							key_col_wth = key_size_left + key_size_right;

							key_rows = ptitl_cnt;
							key_cols = 1;

							/* calculate rows and cols for key */

							if (key->stack_dir == GPKEY_HORIZONTAL) {
								/* maximise no cols, limited by label-length */
								key_cols = (int) (plot_bounds.xright - plot_bounds.xleft) / key_col_wth;
								if (key->maxcols > 0 && key_cols > key->maxcols)
									key_cols = key->maxcols;
									/* EAM Dec 2004 - Rather than turn off the key, try to squeeze */
									if (key_cols == 0) {
										key_cols = 1;
										key_panic = TRUE;
										key_col_wth = (plot_bounds.xright - plot_bounds.xleft);
									}
									key_rows = (int) (ptitl_cnt + key_cols - 1) / key_cols;
									/* now calculate actual no cols depending on no rows */
									key_cols = (key_rows == 0) ? 1
											: (int) (ptitl_cnt + key_rows - 1) / key_rows;
									if (key_cols == 0) {
										key_cols = 1;
										key_panic = TRUE;
									}
							} else {
								/* maximise no rows, limited by plot_bounds.ytop-plot_bounds.ybot */
								int i = (int) (plot_bounds.ytop - plot_bounds.ybot - key->height_fix * t->v_char
										- (ktitl_lines + 1) * t->v_char)
										/ key_entry_height;
								if (key->maxrows > 0 && i > key->maxrows)
									i = key->maxrows;

									if (i == 0) {
										i = 1;
										key_panic = TRUE;
									}
									if (ptitl_cnt > i) {
										key_cols = (int) (ptitl_cnt + i - 1) / i;
										/* now calculate actual no rows depending on no cols */
										if (key_cols == 0) {
											key_cols = 1;
											key_panic = TRUE;
										}
										key_rows = (int) (ptitl_cnt + key_cols - 1) / key_cols;
									}
							}

							/* adjust for outside key, leave manually set margins alone */
							if ((key->region == GPKEY_AUTO_EXTERIOR_LRTBC && (key->vpos != JUST_CENTRE || key->hpos != CENTRE))
									|| key->region == GPKEY_AUTO_EXTERIOR_MARGIN) {
								int more = 0;
								if (key->margin == GPKEY_BMARGIN && bmargin.x < 0) {
									more = key_entry_height * key_rows + (int) (t->v_char * (ktitl_lines + 1))
											+ (int) (key->height_fix * t->v_char);
									if (plot_bounds.ybot + more > plot_bounds.ytop)
										key_panic = TRUE;
									else
										plot_bounds.ybot += more;
								} else if (key->margin == GPKEY_TMARGIN && tmargin.x < 0) {
									more = key_entry_height * key_rows + (int) (t->v_char * (ktitl_lines + 1))
											- (int) (key->height_fix * t->v_char);
									if (plot_bounds.ytop - more < plot_bounds.ybot)
										key_panic = TRUE;
									else
										plot_bounds.ytop -= more;
								} else if (key->margin == GPKEY_LMARGIN && lmargin.x < 0) {
									more = key_col_wth * key_cols;
									if (plot_bounds.xleft + more > plot_bounds.xright)
										key_panic = TRUE;
									else
										plot_bounds.xleft += more;
								} else if (key->margin == GPKEY_RMARGIN && rmargin.x < 0) {
									more = key_col_wth * key_cols;
									if (plot_bounds.xright - more < plot_bounds.xleft)
										key_panic = TRUE;
									else
										plot_bounds.xright -= more;
								}
							}

							/* warn if we had to punt on key size calculations */
							if (key_panic)
								int_warn(NO_CARET, "Warning - difficulty fitting plot titles into key");

							/*}}} */
					}

					/*{{{  set up y and y2 tics */
					setup_tics(FIRST_Y_AXIS, 20);
					setup_tics(SECOND_Y_AXIS, 20);
					/*}}} */

					/* Adjust color axis limits if necessary. */
					if (is_plot_with_palette()) {
						set_cbminmax();
						axis_checked_extend_empty_range(COLOR_AXIS, "All points of color axis undefined.");
						if (color_box.where != SMCOLOR_BOX_NO)
							setup_tics(COLOR_AXIS, 20);
					}

					/*{{{  recompute plot_bounds.xleft based on widths of ytics, ylabel etc
	       unless it has been explicitly set by lmargin */

					/* tic labels */
					shift_labels_to_border = FALSE;
					if (axis_array[FIRST_Y_AXIS].ticmode & TICS_ON_AXIS) {
						/* FIXME: This test for how close the axis is to the border does not match */
						/*        the tests in axis_output_tics(), and assumes FIRST_X_AXIS.       */
						if (!inrange(0.0, axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].min, axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].max))
							shift_labels_to_border = TRUE;
						if (0.1 > fabs( axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].min
								/  (axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].max - axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].min)))
							shift_labels_to_border = TRUE;
					}

					if ((axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].ticmode & TICS_ON_BORDER)
							||  shift_labels_to_border) {
						if (vertical_ytics)
							/* HBB: we will later add some white space as part of this, so
							 * reserve two more rows (one above, one below the text ...).
							 * Same will be done to similar calc.'s elsewhere */
							ytic_textwidth = (int) (t->v_char * (yticlin + 2));
						else {
							widest_tic_strlen = 0;	/* reset the global variable ... */
							/* get gen_tics to call widest_tic_callback with all labels
							 * the latter sets widest_tic_strlen to the length of the widest
							 * one ought to consider tics on axis if axis near border...
							 */
							gen_tics(FIRST_Y_AXIS, /* 0, */ widest_tic_callback);

							ytic_textwidth = (int) (t->h_char * (widest_tic_strlen + 2));
						}
					} else {
						ytic_textwidth = 0;
					}

					/* tics */
					if (!axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].tic_in
							&& ((axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].ticmode & TICS_ON_BORDER)
									|| ((axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].ticmode & TICS_MIRROR)
											&& (axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].ticmode & TICS_ON_BORDER))))
						ytic_width = (int) (t->h_tic * axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].ticscale);
					else
						ytic_width = 0;

					/* ylabel */
					if (axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].label.text && can_rotate) {
						double tmpx, tmpy;
						map_position_r(&(axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].label.offset),
								&tmpx, &tmpy, "boundary");
						ylabel_textwidth = (int) (ylablin * (t->v_char) - tmpx);
						if (!axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].ticmode)
							ylabel_textwidth += 0.5 * t->v_char;
					} else
						/* this should get large for NEGATIVE ylabel.xoffsets  DBT 11-5-98 */
						ylabel_textwidth = 0;

					/* timestamp */
					if (timelabel.text && vertical_timelabel) {
						double tmpx, tmpy;
						map_position_r(&(timelabel.offset), &tmpx, &tmpy, "boundary");
						timelabel_textwidth = (int) ((timelin + 1.5) * t->v_char - tmpx);
					} else
						timelabel_textwidth = 0;

					if (lmargin.x < 0) {	
						/* Auto-calculation */
						double tmpx, tmpy;

						plot_bounds.xleft = xoffset * t->xmax;
						plot_bounds.xleft += (timelabel_textwidth > ylabel_textwidth
								? timelabel_textwidth : ylabel_textwidth)
								+ ytic_width + ytic_textwidth;

						/* make sure plot_bounds.xleft is wide enough for a negatively
						 * x-offset horizontal timestamp
						 */
						map_position_r(&(timelabel.offset), &tmpx, &tmpy, "boundary");
						if (!vertical_timelabel
								&& plot_bounds.xleft - ytic_width - ytic_textwidth < -(int) (tmpx))
							plot_bounds.xleft = ytic_width + ytic_textwidth - (int) (tmpx);
						if (plot_bounds.xleft == (int) (t->xmax * xoffset)) {
							/* make room for end of xtic or x2tic label */
							plot_bounds.xleft += (int) (t->h_char * 2);
						}
						/* DBT 12-3-98  extra margin just in case */
						plot_bounds.xleft += 0.5 * t->h_char;
					}
					/* Note: we took care of explicit 'set lmargin foo' at line 492 */

					/*  end of plot_bounds.xleft calculation }}} */

					/*{{{  recompute plot_bounds.xright based on widest y2tic. y2labels, key "outside"
	       unless it has been explicitly set by rmargin */

					/* tic labels */
					if (axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].ticmode & TICS_ON_BORDER) {
						if (vertical_y2tics)
							y2tic_textwidth = (int) (t->v_char * (y2ticlin + 2));
						else {
							widest_tic_strlen = 0;	/* reset the global variable ... */
							/* get gen_tics to call widest_tic_callback with all labels
							 * the latter sets widest_tic_strlen to the length of the widest
							 * one ought to consider tics on axis if axis near border...
							 */
							gen_tics(SECOND_Y_AXIS, /* 0, */ widest_tic_callback);

							y2tic_textwidth = (int) (t->h_char * (widest_tic_strlen + 2));
						}
					} else {
						y2tic_textwidth = 0;
					}

					/* EAM May 2009
					 * Check to see if any xtic labels are so long that they extend beyond
					 * the right boundary of the plot. If so, allow extra room in the margin.
					 * If the labels are too long to fit even with a big margin, too bad.
					 */
					if (axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticdef.def.user) {
						struct ticmark *tic = axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticdef.def.user;
						int maxrightlabel = plot_bounds.xright;

						/* We don't really know the plot layout yet, but try for an estimate */
						AXIS_SETSCALE(FIRST_X_AXIS, plot_bounds.xleft, plot_bounds.xright);
						axis_set_graphical_range(FIRST_X_AXIS, plot_bounds.xleft, plot_bounds.xright);

						while (tic) {
							if (tic->label) {
								double xx;
								int length = estimate_strlen(tic->label)
										* cos(DEG2RAD * (double)(axis_array[FIRST_X_AXIS].tic_rotate))
										* term->h_char;

										if (inrange(tic->position, 
												axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].set_min, 
												axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].set_max)) {
											xx = axis_log_value_checked(FIRST_X_AXIS, tic->position, "xtic");
											xx = AXIS_MAP(FIRST_X_AXIS, xx);
											xx += (axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].tic_rotate) ? length : length /2;
											if (maxrightlabel < xx)
												maxrightlabel = xx;
										}
							}
							tic = tic->next;
						}
						xtic_textwidth = maxrightlabel - plot_bounds.xright;
						if (xtic_textwidth > term->xmax/4) {
							xtic_textwidth = term->xmax/4;
							int_warn(NO_CARET, "difficulty making room for xtic labels");
						}
					}

					/* tics */
					if (!axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].tic_in
							&& ((axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].ticmode & TICS_ON_BORDER)
									|| ((axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].ticmode & TICS_MIRROR)
											&& (axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].ticmode & TICS_ON_BORDER))))
						y2tic_width = (int) (t->h_tic * axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].ticscale);
					else
						y2tic_width = 0;

					/* y2label */
					if (can_rotate && axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].label.text) {
						double tmpx, tmpy;
						map_position_r(&(axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].label.offset),
								&tmpx, &tmpy, "boundary");
						y2label_textwidth = (int) (y2lablin * t->v_char + tmpx);
						if (!axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].ticmode)
							y2label_textwidth += 0.5 * t->v_char;
					} else
						y2label_textwidth = 0;

					/* Make room for the color box if needed. */
					if (rmargin.scalex != screen) {
						if (is_plot_with_colorbox()) {
							#define COLORBOX_SCALE 0.100
							#define WIDEST_COLORBOX_TICTEXT 3
							if ((color_box.where != SMCOLOR_BOX_NO) && (color_box.where != SMCOLOR_BOX_USER)) {
								plot_bounds.xright -= (int) (plot_bounds.xright-plot_bounds.xleft)*COLORBOX_SCALE;
								plot_bounds.xright -= (int) ((t->h_char) * WIDEST_COLORBOX_TICTEXT);
							}
							color_box.xoffset = 0;
						}

						if (rmargin.x < 0) {
							color_box.xoffset = plot_bounds.xright;
							plot_bounds.xright -= y2tic_width + y2tic_textwidth;
							if (y2label_textwidth > 0)
								plot_bounds.xright -= y2label_textwidth;

							if (plot_bounds.xright > (xsize+xoffset)*(t->xmax-1) - (t->h_char * 2))
								plot_bounds.xright = (xsize+xoffset)*(t->xmax-1) - (t->h_char * 2);

							color_box.xoffset -= plot_bounds.xright;
							/* EAM 2009 - protruding xtic labels */
							if (term->xmax - plot_bounds.xright < xtic_textwidth)
								plot_bounds.xright = term->xmax - xtic_textwidth;
								/* DBT 12-3-98  extra margin just in case */
								plot_bounds.xright -= 1.0 * t->h_char;
						}
						/* Note: we took care of explicit 'set rmargin foo' at line 502 */
					}

					/*  end of plot_bounds.xright calculation }}} */


					/*{{{  set up x and x2 tics */
					/* we should base the guide on the width of the xtics, but we cannot
					 * use widest_tics until tics are set up. Bit of a downer - let us
					 * assume tics are 5 characters wide
					 */
					/* HBB 20001205: moved this block to before aspect_ratio is
					 * applied: setup_tics may extend the ranges, which would distort
					 * the aspect ratio */

					setup_tics(FIRST_X_AXIS, 20);
					setup_tics(SECOND_X_AXIS, 20);


					/* Modify the bounding box to fit the aspect ratio, if any was
					 * given. */
					if (aspect_ratio != 0.0) {
						double current_aspect_ratio;

						if (aspect_ratio < 0
								&& (X_AXIS.max - X_AXIS.min) != 0.0
								) {
							current_aspect_ratio = - aspect_ratio
									* fabs((Y_AXIS.max - Y_AXIS.min) / (X_AXIS.max - X_AXIS.min));
						} else
							current_aspect_ratio = aspect_ratio;

						/* Set aspect ratio if valid and sensible */
						/* EAM Mar 2008 - fixed borders take precedence over centering */
						if (current_aspect_ratio >= 0.01 && current_aspect_ratio <= 100.0) {
							double current = ((double) (plot_bounds.ytop - plot_bounds.ybot)) 
									/ (plot_bounds.xright - plot_bounds.xleft);
							double required = (current_aspect_ratio * t->v_tic) / t->h_tic;

							if (current > required) {
								/* too tall */
								int old_height = plot_bounds.ytop - plot_bounds.ybot;
								int new_height = required * (plot_bounds.xright - plot_bounds.xleft);
								if (bmargin.scalex == screen)
									plot_bounds.ytop = plot_bounds.ybot + new_height;
								else if (tmargin.scalex == screen)
									plot_bounds.ybot = plot_bounds.ytop - new_height;
								else {
									plot_bounds.ybot += (old_height - new_height) / 2;
									plot_bounds.ytop -= (old_height - new_height) / 2;
								}

							} else {
								int old_width = plot_bounds.xright - plot_bounds.xleft;
								int new_width = (plot_bounds.ytop - plot_bounds.ybot) / required;
								if (lmargin.scalex == screen)
									plot_bounds.xright = plot_bounds.xleft + new_width;
								else if (rmargin.scalex == screen)
									plot_bounds.xleft = plot_bounds.xright - new_width;
								else {
									plot_bounds.xleft += (old_width - new_width) / 2;
									plot_bounds.xright -= (old_width - new_width) / 2;
								}
							}
						}
					}

					/*  Calculate space needed for tic label rotation.
					 *  If [tb]margin is auto, move the plot boundary.
					 *  Otherwise use textheight to adjust placement of various titles.
					 */

					if (axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].ticmode & TICS_ON_BORDER && vertical_x2tics) {
						double projection = sin((double)axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].tic_rotate*DEG2RAD);
						widest_tic_strlen = 0;		/* reset the global variable ... */
						gen_tics(SECOND_X_AXIS, /* 0, */ widest_tic_callback);
						if (tmargin.x < 0) /* Undo original estimate */
							plot_bounds.ytop += x2tic_textheight;
						/* Now compute a new one and use that instead: */
						if (projection > 0.0)
							x2tic_textheight = (int) (t->h_char * (widest_tic_strlen)) * projection;
						else
							x2tic_textheight = t->v_char;
							if (tmargin.x < 0)
								plot_bounds.ytop -= x2tic_textheight;
					}
					if (axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].ticmode & TICS_ON_BORDER && vertical_xtics) {
						double projection;
						if (axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].tic_rotate == 90)
							projection = 1.0;
						else if (axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].tic_rotate == TEXT_VERTICAL)
							projection = 1.0;
						else
							projection = -sin((double)axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].tic_rotate*DEG2RAD);
						widest_tic_strlen = 0;		/* reset the global variable ... */
						gen_tics(FIRST_X_AXIS, /* 0, */ widest_tic_callback);

						if (bmargin.x < 0)
							plot_bounds.ybot -= xtic_textheight;
						if (projection > 0.0)
							xtic_textheight = (int) (t->h_char * widest_tic_strlen) * projection
							+ t->v_char;
							if (bmargin.x < 0)
								plot_bounds.ybot += xtic_textheight;
					}

					/* EAM - FIXME
					 * Notwithstanding all these fancy calculations, plot_bounds.ytop must always be above plot_bounds.ybot
					 */
					if (plot_bounds.ytop < plot_bounds.ybot) {
						int i = plot_bounds.ytop;

						plot_bounds.ytop = plot_bounds.ybot;
						plot_bounds.ybot = i;
						FPRINTF((stderr,"boundary: Big problems! plot_bounds.ybot > plot_bounds.ytop\n"));
					}

					/*  compute coordinates for axis labels, title et al
					 *     (some of these may not be used) */

					x2label_y = plot_bounds.ytop + x2tic_height + x2tic_textheight + x2label_textheight;
					if (x2tic_textheight && (title_textheight || x2label_textheight))
						x2label_y += t->v_char;

						title_y = x2label_y + title_textheight;

						ylabel_y = plot_bounds.ytop + x2tic_height + x2tic_textheight + ylabel_textheight;

						y2label_y = plot_bounds.ytop + x2tic_height + x2tic_textheight + y2label_textheight;

						/* Shift upward by 0.2 line to allow for descenders in xlabel text */
						xlabel_y = plot_bounds.ybot - xtic_height - xtic_textheight - xlabel_textheight
								+ ((float)xlablin+0.2) * t->v_char;
								ylabel_x = plot_bounds.xleft - ytic_width - ytic_textwidth;
								if (axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].label.text && can_rotate)
									ylabel_x -= ylabel_textwidth;

								y2label_x = plot_bounds.xright + y2tic_width + y2tic_textwidth;
								if (axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].label.text && can_rotate)
									y2label_x += y2label_textwidth - y2lablin * t->v_char;

									if (vertical_timelabel) {
										if (timelabel_bottom)
											time_y = xlabel_y - timebot_textheight + xlabel_textheight;
										else {
											time_y = title_y + timetop_textheight - title_textheight
													- x2label_textheight;
										}
									} else {
										if (timelabel_bottom)
											time_y = plot_bounds.ybot - xtic_height - xtic_textheight - xlabel_textheight
											- timebot_textheight + t->v_char;
											else if (ylabel_textheight > 0)
												time_y = ylabel_y + timetop_textheight;
											else
												time_y = plot_bounds.ytop + x2tic_height + x2tic_textheight
												+ timetop_textheight + (int) t->h_char;
									}
									if (vertical_timelabel)
										time_x = plot_bounds.xleft - ytic_width - ytic_textwidth - timelabel_textwidth;
									else {
										double tmpx, tmpy;
										map_position_r(&(timelabel.offset), &tmpx, &tmpy, "boundary");
										time_x = plot_bounds.xleft - ytic_width - ytic_textwidth + (int) (tmpx);
									}

									xtic_y = plot_bounds.ybot - xtic_height
											- (int) (vertical_xtics ? t->h_char : t->v_char);

									x2tic_y = plot_bounds.ytop + x2tic_height
											+ (vertical_x2tics ? (int) t->h_char : x2tic_textheight);

									ytic_x = plot_bounds.xleft - ytic_width
											- (vertical_ytics
													? (ytic_textwidth - (int) t->v_char)
															: (int) t->h_char);

									y2tic_x = plot_bounds.xright + y2tic_width
											+ (int) (vertical_y2tics ? t->v_char : t->h_char);

									/* restore text to horizontal [we tested rotation above] */
									(void) (*t->text_angle) (0);

									/* needed for map_position() below */
									AXIS_SETSCALE(FIRST_Y_AXIS, plot_bounds.ybot, plot_bounds.ytop);
									AXIS_SETSCALE(SECOND_Y_AXIS, plot_bounds.ybot, plot_bounds.ytop);
									AXIS_SETSCALE(FIRST_X_AXIS, plot_bounds.xleft, plot_bounds.xright);
									AXIS_SETSCALE(SECOND_X_AXIS, plot_bounds.xleft, plot_bounds.xright);
									/* HBB 20020122: moved here from do_plot, because map_position
									 * needs these, too */
									axis_set_graphical_range(FIRST_X_AXIS, plot_bounds.xleft, plot_bounds.xright);
									axis_set_graphical_range(FIRST_Y_AXIS, plot_bounds.ybot, plot_bounds.ytop);
									axis_set_graphical_range(SECOND_X_AXIS, plot_bounds.xleft, plot_bounds.xright);
									axis_set_graphical_range(SECOND_Y_AXIS, plot_bounds.ybot, plot_bounds.ytop);

									/* Calculate space for keys (do_plot will use these to position key). */
									key_w = key_col_wth * key_cols;
									key_h = (ktitl_lines) * t->v_char + key_rows * key_entry_height;
									key_h += (int) (key->height_fix * t->v_char);
									if (key->region == GPKEY_AUTO_INTERIOR_LRTBC
											|| (key->region == GPKEY_AUTO_EXTERIOR_LRTBC && key->vpos == JUST_CENTRE && key->hpos == CENTRE)) {
										if (key->vpos == JUST_TOP) {
											key->bounds.ytop = plot_bounds.ytop - t->v_tic;
											key->bounds.ybot = key->bounds.ytop - key_h;
										} else if (key->vpos == JUST_BOT) {
											key->bounds.ybot = plot_bounds.ybot + t->v_tic;
											key->bounds.ytop = key->bounds.ybot + key_h;
										} else /* (key->vpos == JUST_CENTRE) */ {
											int key_box_half = key_h / 2;
											key->bounds.ybot = (plot_bounds.ybot + plot_bounds.ytop) / 2 - key_box_half;
											key->bounds.ytop = (plot_bounds.ybot + plot_bounds.ytop) / 2 + key_box_half;
										}
										if (key->hpos == LEFT) {
											key->bounds.xleft = plot_bounds.xleft + t->h_char;
											key->bounds.xright = key->bounds.xleft + key_w;
										} else if (key->hpos == RIGHT) {
											key->bounds.xright = plot_bounds.xright - t->h_char;
											key->bounds.xleft = key->bounds.xright - key_w;
										} else /* (key->hpos == CENTER) */ {
											int key_box_half = key_w / 2;
											key->bounds.xleft = (plot_bounds.xright + plot_bounds.xleft) / 2 - key_box_half;
											key->bounds.xright = (plot_bounds.xright + plot_bounds.xleft) / 2 + key_box_half;
										}
									} else if (key->region == GPKEY_AUTO_EXTERIOR_LRTBC || key->region == GPKEY_AUTO_EXTERIOR_MARGIN) {

										/* Vertical alignment */
										if (key->margin == GPKEY_TMARGIN) {
											/* align top first since tmargin may be manual */
											key->bounds.ytop = (ysize + yoffset) * t->ymax - t->v_tic;
											key->bounds.ybot = key->bounds.ytop - key_h;
										} else if (key->margin == GPKEY_BMARGIN) {
											/* align bottom first since bmargin may be manual */
											key->bounds.ybot = yoffset * t->ymax + t->v_tic;
											key->bounds.ytop = key->bounds.ybot + key_h;
										} else {
											if (key->vpos == JUST_TOP) {
												/* align top first since tmargin may be manual */
												key->bounds.ytop = plot_bounds.ytop;
												key->bounds.ybot = key->bounds.ytop - key_h;
											} else if (key->vpos == CENTRE) {
												int key_box_half = key_h / 2;
												key->bounds.ybot = (plot_bounds.ybot + plot_bounds.ytop) / 2 - key_box_half;
												key->bounds.ytop = (plot_bounds.ybot + plot_bounds.ytop) / 2 + key_box_half;
											} else {
												/* align bottom first since bmargin may be manual */
												key->bounds.ybot = plot_bounds.ybot;
												key->bounds.ytop = key->bounds.ybot + key_h;
											}
										}

										/* Horizontal alignment */
										if (key->margin == GPKEY_LMARGIN) {
											/* align left first since lmargin may be manual */
											key->bounds.xleft = xoffset * t->xmax + t->h_char;
											key->bounds.xright = key->bounds.xleft + key_w;
										} else if (key->margin == GPKEY_RMARGIN) {
											/* align right first since rmargin may be manual */
											key->bounds.xright = (xsize + xoffset) * (t->xmax-1) - t->h_char;
											key->bounds.xleft = key->bounds.xright - key_w;
										} else {
											if (key->hpos == LEFT) {
												/* align left first since lmargin may be manual */
												key->bounds.xleft = plot_bounds.xleft;
												key->bounds.xright = key->bounds.xleft + key_w;
											} else if (key->hpos == CENTRE) {
												int key_box_half = key_w / 2;
												key->bounds.xleft = (plot_bounds.xright + plot_bounds.xleft) / 2 - key_box_half;
												key->bounds.xright = (plot_bounds.xright + plot_bounds.xleft) / 2 + key_box_half;
											} else {
												/* align right first since rmargin may be manual */
												key->bounds.xright = plot_bounds.xright;
												key->bounds.xleft = key->bounds.xright - key_w;
											}
										}

									} else {
										int x, y;

										map_position(&key->user_pos, &x, &y, "key");
										#if 0
										/* FIXME!!!
										 ** pm 22.1.2002: if key->user_pos.scalex or scaley == first_axes or second_axes,
										 ** then the graph scaling is not yet known and the box is positioned incorrectly;
										 ** you must do "replot" to avoid the wrong plot ... bad luck if output does not
										 ** go to screen */
										#define OK fprintf(stderr,"Line %i of %s is OK\n",__LINE__,__FILE__)
										OK;
										fprintf(stderr,"\tHELE: user pos: x=%i y=%i\n",key->user_pos.x,key->user_pos.y);
										fprintf(stderr,"\tHELE: user pos: x=%i y=%i\n",x,y);
										#endif
										/* Here top, bottom, left, right refer to the alignment with respect to point. */
										key->bounds.xleft = x;
										if (key->hpos == CENTRE)
											key->bounds.xleft -= key_w/2;
											else if (key->hpos == RIGHT)
												key->bounds.xleft -= key_w;
												key->bounds.xright = key->bounds.xleft + key_w;
												key->bounds.ytop = y;
												if (key->vpos == JUST_CENTRE)
													key->bounds.ytop += key_h/2;
													else if (key->vpos == JUST_BOT)
														key->bounds.ytop += key_h;
														key->bounds.ybot = key->bounds.ytop - key_h;
									}
									/*}}} */

									/* Set default clipping to the plot boundary */
									clip_area = &plot_bounds;

	}

	/*}}} */

	/*
	 * Apply axis range expansions from "set offsets" command
	 */
	public static void adjust_offsets()
	{ 
		double b = boff.scaley == gadgets.position_type.graph ? Math.abs(axis.Y_AXIS.max - axis.Y_AXIS.min)*boff.y : boff.y;
		double t = toff.scaley == gadgets.position_type.graph ? Math.abs(axis.Y_AXIS.max - axis.Y_AXIS.min)*toff.y : toff.y;
		double l = loff.scalex == gadgets.position_type.graph ? Math.abs(axis.X_AXIS.max - axis.X_AXIS.min)*loff.x : loff.x;
		double r = roff.scalex == gadgets.position_type.graph ? Math.abs(axis.X_AXIS.max - axis.X_AXIS.min)*roff.x : roff.x;

		if (axis.Y_AXIS.min < axis.Y_AXIS.max) {
			axis.Y_AXIS.min -= b;
			axis.Y_AXIS.max += t;
		} else {
			axis.Y_AXIS.max -= b;
			axis.Y_AXIS.min += t;
		}
		if (axis.X_AXIS.min < axis.X_AXIS.max) {
			axis.X_AXIS.min -= l;
			axis.X_AXIS.max += r;
		} else {
			axis.X_AXIS.max -= l;
			axis.X_AXIS.min += r;
		}

		if (axis.X_AXIS.min == axis.X_AXIS.max)
			util.int_error(util.NO_CARET, "x_min should not equal x_max!");
		if (axis.Y_AXIS.min == axis.Y_AXIS.max)
			util.int_error(util.NO_CARET, "y_min should not equal y_max!");
	}

	void
	do_plot(curve_points plots, int pcount)
	{
		int curve;
		curve_points this_plot = null;
		int xl = 0, yl = 0;
		int key_count = 0;
		boolean key_pass = false;
		gadgets.legend_key key = gadgets.keyT;

		axis.x_axis = axis.AXIS_INDEX.FIRST_X_AXIS;
		axis.y_axis = axis.AXIS_INDEX.FIRST_Y_AXIS;
		adjust_offsets();

		/* EAM June 2003 - Although the comment below implies that font dimensions
		 * are known after term_initialise(), this is not true at least for the X11
		 * driver.  X11 fonts are not set until an actual display window is
		 * opened, and that happens in term->graphics(), which is called from
		 * term_start_plot().
		 */
		term_api.term_initialise();		/* may set xmax/ymax */
		term_api.term_start_plot();

		/* Figure out if we need a colorbox for this plot */
		pm3d.set_plot_with_palette(0, gp_types.MODE_PLOT_TYPE.MODE_PLOT); /* EAM FIXME - 1st parameter is a dummy */

		/* compute boundary for plot (plot_bounds.xleft, plot_bounds.xright, plot_bounds.ytop, plot_bounds.ybot)
		 * also calculates tics, since xtics depend on plot_bounds.xleft
		 * but plot_bounds.xleft depends on ytics. Boundary calculations depend
		 * on term->v_char etc, so terminal must be initialised first.
		 */
		boundary(plots, pcount);

		/* Make palette */
		if (is_plot_with_palette())
			make_palette();

		/* Give a chance for rectangles to be behind everything else */
		place_objects( first_object, -1, 2, NULL );

		screen_ok = false;

		/* Sync point for epslatex text positioning */
		term.layer(TERM_LAYER_BACKTEXT);

		/* DRAW TICS AND GRID */
		if (grid_layer == 0 || grid_layer == -1)
			place_grid();

		/* DRAW AXES */
		/* after grid so that axes linetypes are on top */
		x_axis = FIRST_X_AXIS;
		y_axis = FIRST_Y_AXIS;	/* chose scaling */

		axis_draw_2d_zeroaxis(FIRST_X_AXIS,FIRST_Y_AXIS);
		axis_draw_2d_zeroaxis(FIRST_Y_AXIS,FIRST_X_AXIS);

		x_axis = SECOND_X_AXIS;
		y_axis = SECOND_Y_AXIS;	/* chose scaling */

		axis_draw_2d_zeroaxis(SECOND_X_AXIS,SECOND_Y_AXIS);
		axis_draw_2d_zeroaxis(SECOND_Y_AXIS,SECOND_X_AXIS);

		/* DRAW PLOT BORDER */
		if (draw_border)
			plot_border();

		/* YLABEL */
		if (axis_array[FIRST_Y_AXIS].label.text) {
			ignore_enhanced(axis_array[FIRST_Y_AXIS].label.noenhanced);
			apply_pm3dcolor(&(axis_array[FIRST_Y_AXIS].label.textcolor),t);
			/* we worked out x-posn in boundary() */
			if (term.text_angle(axis_array[FIRST_Y_AXIS].label.rotate)) {
				double tmpx, tmpy;
				int x, y;
				map_position_r(&(axis_array[FIRST_Y_AXIS].label.offset),
						&tmpx, &tmpy, "doplot");

				x = ylabel_x + (term.v_char / 2);
				y = (plot_bounds.ytop + plot_bounds.ybot) / 2 + tmpy;

				term_api.write_multiline(x, y, axis_array[FIRST_Y_AXIS].label.text,
						CENTRE, JUST_TOP, axis_array[FIRST_Y_AXIS].label.rotate,
						axis_array[FIRST_Y_AXIS].label.font);
				term.text_angle(0);
			} else {
				/* really bottom just, but we know number of lines
		       so we need to adjust x-posn by one line */
				int x = ylabel_x;
				int y = ylabel_y;

				term_api.write_multiline(x, y, axis_array[FIRST_Y_AXIS].label.text,
						LEFT, JUST_TOP, 0,
						axis_array[FIRST_Y_AXIS].label.font);
			}
			reset_textcolor(&(axis_array[FIRST_Y_AXIS].label.textcolor),t);
			ignore_enhanced(FALSE);
		}

		/* Y2LABEL */
		if (axis_array[SECOND_Y_AXIS].label.text) {
			ignore_enhanced(axis_array[SECOND_Y_AXIS].label.noenhanced);
			apply_pm3dcolor(&(axis_array[SECOND_Y_AXIS].label.textcolor),t);
			/* we worked out coordinates in boundary() */
			if ((*t->text_angle) (axis_array[SECOND_Y_AXIS].label.rotate)) {
				double tmpx, tmpy;
				unsigned int x, y;
				map_position_r(&(axis_array[SECOND_Y_AXIS].label.offset),
						&tmpx, &tmpy, "doplot");
				x = y2label_x + (t->v_char / 2) - 1;
				y = (plot_bounds.ytop + plot_bounds.ybot) / 2 + tmpy;

				write_multiline(x, y, axis_array[SECOND_Y_AXIS].label.text,
						CENTRE, JUST_TOP, 
						axis_array[SECOND_Y_AXIS].label.rotate,
						axis_array[SECOND_Y_AXIS].label.font);
				(*t->text_angle) (0);
			} else {
				/* really bottom just, but we know number of lines */
				unsigned int x = y2label_x;
				unsigned int y = y2label_y;

				write_multiline(x, y, axis_array[SECOND_Y_AXIS].label.text,
						RIGHT, JUST_TOP, 0,
						axis_array[SECOND_Y_AXIS].label.font);
			}
			reset_textcolor(&(axis_array[SECOND_Y_AXIS].label.textcolor),t);
			ignore_enhanced(FALSE);
		}

		/* XLABEL */
		if (axis_array[FIRST_X_AXIS].label.text) {
			double tmpx, tmpy;
			unsigned int x, y;
			map_position_r(&(axis_array[FIRST_X_AXIS].label.offset),
					&tmpx, &tmpy, "doplot");

			x = (plot_bounds.xright + plot_bounds.xleft) / 2 +  tmpx;
			y = xlabel_y - t->v_char / 2;   /* HBB */

			ignore_enhanced(axis_array[FIRST_X_AXIS].label.noenhanced);
			apply_pm3dcolor(&(axis_array[FIRST_X_AXIS].label.textcolor), t);
			write_multiline(x, y, axis_array[FIRST_X_AXIS].label.text,
					JUST_CENTRE, JUST_TOP, 0,
					axis_array[FIRST_X_AXIS].label.font);
			reset_textcolor(&(axis_array[FIRST_X_AXIS].label.textcolor), t);
			ignore_enhanced(FALSE);
		}

		/* PLACE TITLE */
		if (title.text) {
			double tmpx, tmpy;
			unsigned int x, y;
			map_position_r(&(title.offset), &tmpx, &tmpy, "doplot");
			/* we worked out y-coordinate in boundary() */
			x = (plot_bounds.xleft + plot_bounds.xright) / 2 + tmpx;
			y = title_y - t->v_char / 2;

			ignore_enhanced(title.noenhanced);
			apply_pm3dcolor(&(title.textcolor), t);
			write_multiline(x, y, title.text, CENTRE, JUST_TOP, 0, title.font);
			reset_textcolor(&(title.textcolor), t);
			ignore_enhanced(FALSE);
		}

		/* X2LABEL */
		if (axis_array[SECOND_X_AXIS].label.text) {
			double tmpx, tmpy;
			unsigned int x, y;
			map_position_r(&(axis_array[SECOND_X_AXIS].label.offset),
					&tmpx, &tmpy, "doplot");
			/* we worked out y-coordinate in boundary() */
			x = (plot_bounds.xright + plot_bounds.xleft) / 2 + tmpx;
			y = x2label_y - t->v_char / 2 - 1;
			ignore_enhanced(axis_array[SECOND_X_AXIS].label.noenhanced);
			apply_pm3dcolor(&(axis_array[SECOND_X_AXIS].label.textcolor),t);
			write_multiline(x, y, axis_array[SECOND_X_AXIS].label.text, CENTRE,
					JUST_TOP, 0, axis_array[SECOND_X_AXIS].label.font);
			reset_textcolor(&(axis_array[SECOND_X_AXIS].label.textcolor),t);
			ignore_enhanced(FALSE);
		}

		/* PLACE TIMEDATE */
		if (timelabel.text) {
			/* we worked out coordinates in boundary() */
			char *str;
			time_t now;
			unsigned int x = time_x;
			unsigned int y = time_y;
			time(&now);
			/* there is probably no way to find out in advance how many
			 * chars strftime() writes */
			str = gp_alloc(MAX_LINE_LEN + 1, "timelabel.text");
			strftime(str, MAX_LINE_LEN, timelabel.text, localtime(&now));

			if (timelabel_rotate && (*t->text_angle) (TEXT_VERTICAL)) {
				x += t->v_char / 2;	/* HBB */
				if (timelabel_bottom)
					write_multiline(x, y, str, LEFT, JUST_TOP, TEXT_VERTICAL, timelabel.font);
				else
					write_multiline(x, y, str, RIGHT, JUST_TOP, TEXT_VERTICAL, timelabel.font);
				(*t->text_angle) (0);
			} else {
				y -= t->v_char / 2;	/* HBB */
				if (timelabel_bottom)
					write_multiline(x, y, str, LEFT, JUST_BOT, 0, timelabel.font);
				else
					write_multiline(x, y, str, LEFT, JUST_TOP, 0, timelabel.font);
			}
			free(str);
		}

		/* Add back colorbox if appropriate */
		if (is_plot_with_colorbox() && term->set_color
				&& color_box.layer == LAYER_BACK)
			draw_color_smooth_box(MODE_PLOT);

		/* And rectangles */
		place_objects( first_object, 0, 2, clip_area );

		/* PLACE LABELS */
		place_labels( first_label, 0, FALSE );

		/* PLACE ARROWS */
		place_arrows( 0 );

		/* Sync point for epslatex text positioning */
		if (term->layer)
			(term->layer)(TERM_LAYER_FRONTTEXT);

		/* Draw the key, or at least reserve space for it (pass 1) */
		if (lkey)
			do_key_layout( key, key_pass, &xl, &yl );
		SECOND_KEY_PASS:

			/* DRAW CURVES */
			this_plot = plots;
		for (curve = 0; curve < pcount; this_plot = this_plot->next, curve++) {

			TBOOLEAN localkey = lkey;	/* a local copy */

			/* Sync point for start of new curve (used by svg, post, ...) */
			if (term->layer)
				(term->layer)(TERM_LAYER_BEFORE_PLOT);

			/* set scaling for this plot's axes */
			x_axis = this_plot->x_axis;
			y_axis = this_plot->y_axis;

			term_apply_lp_properties(&(this_plot->lp_properties));

			/* Why only for histograms? */
			if (this_plot->plot_style == HISTOGRAMS) {
				if (prefer_line_styles)
					lp_use_properties(&this_plot->lp_properties, this_plot->lp_properties.l_type+1);
			}

			/* Skip a line in the key between histogram clusters */
			if (this_plot->plot_style == HISTOGRAMS
					&&  this_plot->histogram_sequence == 0 && yl != yl_ref) {
				if (++key_count >= key_rows) {
					yl = yl_ref;
					xl += key_col_wth;
					key_count = 0;
				} else
					yl = yl - key_entry_height;
			}

			/* Column-stacked histograms store their key titles internally */
			if (this_plot->plot_style == HISTOGRAMS
					&&  histogram_opts.type == HT_STACKED_IN_TOWERS) {
				text_label *key_entry;
				localkey = 0;
				if (this_plot->labels && (key_pass || !key->front)) {
					struct lp_style_type save_lp = this_plot->lp_properties;
					for (key_entry = this_plot->labels->next; key_entry; key_entry = key_entry->next) {
						key_count++;
						this_plot->lp_properties.l_type = key_entry->tag;
						this_plot->fill_properties.fillpattern = key_entry->tag;
						if (key_entry->text) {
							if (prefer_line_styles)
								lp_use_properties(&this_plot->lp_properties, key_entry->tag + 1);
							else
								load_linetype(&this_plot->lp_properties, key_entry->tag + 1);
							do_key_sample(this_plot, key, key_entry->text, t, xl, yl);
						}
						yl = yl - key_entry_height;
					}
					free_labels(this_plot->labels);
					this_plot->labels = NULL;
					this_plot->lp_properties = save_lp;
				}

			} else if (this_plot->title && !*this_plot->title) {
				localkey = FALSE;
			} else if (this_plot->plot_type == NODATA) {
				localkey = FALSE;
			} else if (key_pass || !key->front) {
				ignore_enhanced(this_plot->title_no_enhanced);
				/* don't write filename or function enhanced */
				if (localkey && this_plot->title && !this_plot->title_is_suppressed) {
					key_count++;
					if (key->invert)
						yl = key->bounds.ybot + yl_ref + key_entry_height/2 - yl;
						do_key_sample(this_plot, key, this_plot->title, t, xl, yl);
				}
				ignore_enhanced(FALSE);
			}

			/* If any plots have opted out of autoscaling, we need to recheck */
			/* whether their points are INRANGE or not.                       */
			if (this_plot->noautoscale  &&  !key_pass)
				recheck_ranges(this_plot);

			/* and now the curves, plus any special key requirements */
			/* be sure to draw all lines before drawing any points */
			/* Skip missing/empty curves */
			if (this_plot->plot_type != NODATA  &&  !key_pass) {

				switch (this_plot->plot_style) {
				case IMPULSES:
					plot_impulses(this_plot, X_AXIS.term_zero, Y_AXIS.term_zero);
					break;
				case LINES:
					plot_lines(this_plot);
					break;
				case STEPS:
					plot_steps(this_plot);
					break;
				case FSTEPS:
					plot_fsteps(this_plot);
					break;
				case HISTEPS:
					plot_histeps(this_plot);
					break;
				case POINTSTYLE:
					plot_points(this_plot);
					break;
				case LINESPOINTS:
					plot_lines(this_plot);
					plot_points(this_plot);
					break;
				case DOTS:
					plot_dots(this_plot);
					break;
				case YERRORLINES:
				case XERRORLINES:
				case XYERRORLINES:
					plot_lines(this_plot);
					plot_bars(this_plot);
					plot_points(this_plot);
					break;
				case YERRORBARS:
				case XERRORBARS:
				case XYERRORBARS:
					plot_bars(this_plot);
					plot_points(this_plot);
					break;
				case BOXXYERROR:
				case BOXES:
					plot_boxes(this_plot, Y_AXIS.term_zero);
					break;

				case HISTOGRAMS:
					if (bar_layer == LAYER_FRONT)
						plot_boxes(this_plot, Y_AXIS.term_zero);
					/* Draw the bars first, so that the box will cover the bottom half */
					if (histogram_opts.type == HT_ERRORBARS) {
						(term->linewidth)(histogram_opts.bar_lw);
						if (!need_fill_border(&default_fillstyle))
							(term->linetype)(this_plot->lp_properties.l_type);
						plot_bars(this_plot);
						term_apply_lp_properties(&(this_plot->lp_properties));
					}
					if (bar_layer != LAYER_FRONT)
						plot_boxes(this_plot, Y_AXIS.term_zero);
					break;

				case BOXERROR:
					if (bar_layer != LAYER_FRONT)
						plot_bars(this_plot);
					plot_boxes(this_plot, Y_AXIS.term_zero);
					if (bar_layer == LAYER_FRONT)
						plot_bars(this_plot);
					break;

				case FILLEDCURVES:
					if (this_plot->filledcurves_options.closeto == FILLEDCURVES_BETWEEN) {
						plot_betweencurves(this_plot);
						/* FIXME: would like to call plot_lines() here twice, once for the lower */
						/* curve and once for the upper curve(), conditional on need_fill_border */
					} else {
						plot_filledcurves(this_plot);
						if (need_fill_border(&this_plot->fill_properties))
							plot_lines(this_plot);
					}
					break;

				case VECTOR:
					plot_vectors(this_plot);
					break;
				case FINANCEBARS:
					plot_f_bars(this_plot);
					break;
				case CANDLESTICKS:
					plot_c_bars(this_plot);
					break;

				case BOXPLOT:
					plot_boxplot(this_plot);
					break;

				case PM3DSURFACE:
					int_warn(NO_CARET, "Can't use pm3d for 2d plots");
					break;

				case LABELPOINTS:
					place_labels( this_plot->labels->next, LAYER_PLOTLABELS, TRUE);
					break;

				case IMAGE:
					this_plot->image_properties.type = IC_PALETTE;
					plot_image_or_update_axes(this_plot, FALSE);
					break;

				case RGBIMAGE:
					this_plot->image_properties.type = IC_RGB;
					plot_image_or_update_axes(this_plot, FALSE);
					break;

				case RGBA_IMAGE:
					this_plot->image_properties.type = IC_RGBA;
					plot_image_or_update_axes(this_plot, FALSE);
					break;

					#ifdef EAM_OBJECTS
				case CIRCLES:
					plot_circles(this_plot);
					break;

				case ELLIPSES:
					plot_ellipses(this_plot);
					break;

					#endif
				}
			}


			if (localkey && this_plot->title && !this_plot->title_is_suppressed) {
				/* If there are two passes, defer point sample till the second */
				if (key->front && !key_pass) {
					; /* Do nothing during first pass */

					/* we deferred point sample until now */
				} else if (this_plot->plot_style == LINESPOINTS
						&&  this_plot->lp_properties.p_interval < 0) {
					(*t->linetype)(LT_BACKGROUND);
					(*t->point)(xl + key_point_offset, yl, 6);
					term_apply_lp_properties(&this_plot->lp_properties);

				} else if (this_plot->plot_style == BOXPLOT) {
					;	/* Don't draw a sample point in the key */

				} else if (this_plot->plot_style == DOTS) {
					if (on_page(xl + key_point_offset, yl))
						(*t->point) (xl + key_point_offset, yl, -1);

				} else if (this_plot->plot_style & PLOT_STYLE_HAS_POINT) {
					if (this_plot->lp_properties.p_size == PTSZ_VARIABLE)
						(*t->pointsize)(pointsize);
					if (on_page(xl + key_point_offset, yl))
						(*t->point) (xl + key_point_offset, yl, this_plot->lp_properties.p_type);
				}

				if (key->invert)
					yl = key->bounds.ybot + yl_ref + key_entry_height/2 - yl;
					if (key_count >= key_rows) {
						yl = yl_ref;
						xl += key_col_wth;
						key_count = 0;
					} else
						yl = yl - key_entry_height;
			}

			/* Sync point for end of this curve (used by svg, post, ...) */
			if (term->layer)
				(term->layer)(TERM_LAYER_AFTER_PLOT);

		}

		/* Go back and draw the legend in a separate pass if necessary */
		if (lkey && key->front && !key_pass) {
			key_pass = TRUE;
			do_key_layout( key, key_pass, &xl, &yl );
			goto SECOND_KEY_PASS;
		}

		/* DRAW TICS AND GRID */
		if (grid_layer == 1)
			place_grid();

		/* REDRAW PLOT BORDER */
		if (draw_border && border_layer == 1)
			plot_border();

		/* Add front colorbox if appropriate */
		if (is_plot_with_colorbox() && term->set_color
				&& color_box.layer == LAYER_FRONT)
			draw_color_smooth_box(MODE_PLOT);

		/* And rectangles */
		place_objects( first_object, 1, 2, clip_area );

		/* PLACE LABELS */
		place_labels( first_label, 1, FALSE );

		/* PLACE HISTOGRAM TITLES */
		place_histogram_titles();

		/* PLACE ARROWS */
		place_arrows( 1 );

		/* Release the palette if we have used one (PostScript only?) */
		if (is_plot_with_palette() && term->previous_palette)
			term->previous_palette();

			term_end_plot();
	}


	/* plot_lines:
	 * Plot the curves in LINES style
	 */
	public void plot_lines(curve_points plot) {
		term t = new term();
		int i;							/* point index */
		int x, y;						/* point in terminal coordinates */
		coord_type prev = coord_type.UNDEFINED;	/* type of previous point */
		double lx[] = new double[2];  	/* two edge points */
		double ly[] = new double[2];  	/* two edge points */
		coordinate tempCoord = new coordinate();

		for (i = 0; i < plot.points.size(); i++) {

			/* rgb variable  -  color read from data column */
			check_for_variable_color(plot, plot.varcolor.get(i));

			switch (plot.points.get(i).type) {
			case INRANGE:{
				x = axis.map_x(plot.points.get(i).x);
				y = axis.map_y(plot.points.get(i).y);

				if (prev == coord_type.INRANGE) {
					term.vector(x, y);
				} else if (prev == coord_type.OUTRANGE) {
					/* from outrange to inrange */
					if (!gadgets.clip_lines1) {
						term.move(x, y);
					} else {
						tempCoord = edge_intersect(plot.points, i);
						term.move(axis.map_x(tempCoord.x), axis.map_y(tempCoord.y));
						term.vector(x, y);
					}
				} else {	/* prev == UNDEFINED */
					term.move(x, y);
					term.vector(x, y);
				}

				break;
			}
			case OUTRANGE:{
				if (prev == coord_type.INRANGE) {
					/* from inrange to outrange */
					if (gadgets.clip_lines1) {
						tempCoord = edge_intersect(plot.points, i);
						term.vector(axis.map_x(tempCoord.x), axis.map_y(tempCoord.y));
					}
				} else if (prev == coord_type.OUTRANGE) {
					/* from outrange to outrange */
					if (gadgets.clip_lines2) {
						if (two_edge_intersect(plot.points, i, lx, ly)) {
							term.move(axis.map_x(lx[0]), axis.map_y(ly[0]));
							term.vector(axis.map_x(lx[1]), axis.map_y(ly[1]));
						}
					}
				}
				break;
			}
			default:		/* just a safety */
			case UNDEFINED:{
				break;
			}
			}
			prev = plot.points.get(i).type;
		}
	}

	static boolean check_for_variable_color(curve_points plot, double colorvalue) {
		return false;
	}


	/* FIXME
	 * there are LOADS of == style double comparisons in here!
	 */
	/* single edge intersection algorithm */
	/* Given two points, one inside and one outside the plot, return
	 * the point where an edge of the plot intersects the line segment defined
	 * by the two points.
	 */
	static coordinate edge_intersect(
			Vector<coordinate> points, /* the points array */
			int i)			/* line segment from point i-1 to point i */
	{
		double ix = points.get(i-1).x;
		double iy = points.get(i-1).y;
		double ox = points.get(i).x;
		double oy = points.get(i).y;
		double x, y;		/* possible intersection point */
		coordinate retCoord = new coordinate();

		if (points.get(i).type == coord_type.INRANGE) {
			/* swap points around so that ix/ix/iz are INRANGE and
			 * ox/oy/oz are OUTRANGE
			 */
			x = ix;
			ix = ox;
			ox = x;
			y = iy;
			iy = oy;
			oy = y;
		}
		/* nasty degenerate cases, effectively drawing to an infinity point (?)
		 * cope with them here, so don't process them as a "real" OUTRANGE point
		 *
		 * If more than one coord is -VERYLARGE, then can't ratio the "infinities"
		 * so drop out by returning the INRANGE point.
		 *
		 * Obviously, only need to test the OUTRANGE point (coordinates) */
		if (ox == -stdfun.VERYLARGE || oy == -stdfun.VERYLARGE) {
			retCoord.x = ix;
			retCoord.y = iy;
			if (ox == -stdfun.VERYLARGE) {
				/* can't get a direction to draw line, so simply
				 * return INRANGE point */
				if (oy == -stdfun.VERYLARGE)
					return retCoord;

				retCoord.x = axis.X_AXIS.min;
				return retCoord;
			}
			/* obviously oy is -VERYLARGE and ox != -VERYLARGE */
			retCoord.y = axis.Y_AXIS.min;
			return retCoord;
		}
		/*
		 * Can't have case (ix == ox && iy == oy) as one point
		 * is INRANGE and one point is OUTRANGE.
		 */
		if (iy == oy) {
			/* horizontal line */
			/* assume inrange(iy, Y_AXIS.min, Y_AXIS.max) */
			retCoord.y = iy;		/* == oy */

			if (stdfun.inrange(axis.X_AXIS.max, ix, ox)) {
				retCoord.x = axis.X_AXIS.max;
				return retCoord;
			}
			retCoord.x = axis.X_AXIS.min;
			return retCoord;

		} else if (ix == ox) {
			/* vertical line */
			/* assume inrange(ix, X_AXIS.min, X_AXIS.max) */
			retCoord.x = ix;		/* == ox */

			if (stdfun.inrange(axis.Y_AXIS.max, iy, oy)) {
				retCoord.y = axis.Y_AXIS.max;
				return retCoord;
			}
			retCoord.y = axis.Y_AXIS.min;
			return retCoord;
		}
		/* slanted line of some kind */

		/* does it intersect Y_AXIS.min edge */
		if (stdfun.inrange(axis.Y_AXIS.min, iy, oy) && axis.Y_AXIS.min != iy && axis.Y_AXIS.min != oy) {
			x = ix + (axis.Y_AXIS.min - iy) * ((ox - ix) / (oy - iy));
			if (stdfun.inrange(x, axis.X_AXIS.min, axis.X_AXIS.max)) {
				retCoord.x = x;
				retCoord.y = axis.Y_AXIS.min;
				return retCoord;		/* yes */
			}
		}
		/* does it intersect Y_AXIS.max edge */
		if (stdfun.inrange(axis.Y_AXIS.max, iy, oy) && axis.Y_AXIS.max != iy && axis.Y_AXIS.max != oy) {
			x = ix + (axis.Y_AXIS.max - iy) * ((ox - ix) / (oy - iy));
			if (stdfun.inrange(x, axis.X_AXIS.min, axis.X_AXIS.max)) {
				retCoord.x = x;
				retCoord.y = axis.Y_AXIS.max;
				return retCoord;		/* yes */
			}
		}
		/* does it intersect X_AXIS.min edge */
		if (stdfun.inrange(axis.X_AXIS.min, ix, ox) && axis.X_AXIS.min != ix && axis.X_AXIS.min != ox) {
			y = iy + (axis.X_AXIS.min - ix) * ((oy - iy) / (ox - ix));
			if (stdfun.inrange(y, axis.Y_AXIS.min, axis.Y_AXIS.max)) {
				retCoord.x = axis.X_AXIS.min;
				retCoord.y = y;
				return retCoord;
			}
		}
		/* does it intersect X_AXIS.max edge */
		if (stdfun.inrange(axis.X_AXIS.max, ix, ox) && axis.X_AXIS.max != ix && axis.X_AXIS.max != ox) {
			y = iy + (axis.X_AXIS.max - ix) * ((oy - iy) / (ox - ix));
			if (stdfun.inrange(y, axis.Y_AXIS.min, axis.Y_AXIS.max)) {
				retCoord.x = axis.X_AXIS.max;
				retCoord.y = y;
				return retCoord;
			}
		}
		/* If we reach here, the inrange point is on the edge, and
		 * the line segment from the outrange point does not cross any
		 * other edges to get there. In this case, we return the inrange
		 * point as the 'edge' intersection point. This will basically draw
		 * line.
		 */
		retCoord.x = ix;
		retCoord.y = iy;
		return retCoord;
	}

	/* double edge intersection algorithm */
	/* Given two points, both outside the plot, return
	 * the points where an edge of the plot intersects the line segment defined
	 * by the two points. There may be zero, one, two, or an infinite number
	 * of intersection points. (One means an intersection at a corner, infinite
	 * means overlaying the edge itself). We return FALSE when there is nothing
	 * to draw (zero intersections), and TRUE when there is something to
	 * draw (the one-point case is a degenerate of the two-point case and we do
	 * not distinguish it - we draw it anyway).
	 */
	static boolean			/* any intersection? */
	two_edge_intersect(
			Vector<coordinate> points, /* the points array */
			int i,			/* line segment from point i-1 to point i */
			double lx[], double ly[])	/* lx[2], ly[2]: points where it crosses edges */
	{
		/* global X_AXIS.min, X_AXIS.max, Y_AXIS.min, X_AXIS.max */
		int count;
		double ix = points.get(i-1).x;
		double iy = points.get(i-1).y;
		double ox = points.get(i).x;
		double oy = points.get(i).y;
		double t[] = new double[4];
		double swap;
		double t_min, t_max;

		/* nasty degenerate cases, effectively drawing to an infinity
		 * point (?)  cope with them here, so don't process them as a
		 * "real" OUTRANGE point

		 * If more than one coord is -VERYLARGE, then can't ratio the
		 * "infinities" so drop out by returning FALSE */

		count = 0;
		if (ix == -Double.MAX_VALUE)
			count++;
		if (ox == -Double.MAX_VALUE)
			count++;
		if (iy == -Double.MAX_VALUE)
			count++;
		if (oy == -Double.MAX_VALUE)
			count++;

		/* either doesn't pass through graph area *or* can't ratio
		 * infinities to get a direction to draw line, so simply
		 * return(FALSE) */
		if (count > 1) {
			return (false);
		}

		if (ox == -Double.MAX_VALUE || ix == -Double.MAX_VALUE) {
			/* Horizontal line */
			if (ix == -Double.MAX_VALUE) {
				/* swap points so ix/iy don't have a -VERYLARGE component */
				swap = ix;
				ix = ox;
				ox = swap;
				swap = iy;
				iy = oy;
				oy = swap;
			}
			/* check actually passes through the graph area */
			if (ix > stdfun.GPMAX(axis.X_AXIS.max, axis.X_AXIS.min)
					&& stdfun.inrange(iy, axis.Y_AXIS.min, axis.Y_AXIS.max)) {
				lx[0] = axis.X_AXIS.min;
				ly[0] = iy;

				lx[1] = axis.X_AXIS.max;
				ly[1] = iy;
				return (true);
			} else {
				return (false);
			}
		}
		if (oy == -Double.MAX_VALUE || iy == -Double.MAX_VALUE) {
			/* Vertical line */
			if (iy == -Double.MAX_VALUE) {
				/* swap points so ix/iy don't have a -VERYLARGE component */
				swap = ix;
				ix = ox;
				ox = swap;
				swap = iy;
				iy = oy;
				oy = swap;
			}
			/* check actually passes through the graph area */
			if (iy > stdfun.GPMAX(axis.Y_AXIS.min, axis.Y_AXIS.max)
					&& stdfun.inrange(ix, axis.X_AXIS.min, axis.X_AXIS.max)) {
				lx[0] = ix;
				ly[0] = axis.Y_AXIS.min;

				lx[1] = ix;
				ly[1] = axis.Y_AXIS.max;
				return (true);
			} else {
				return (false);
			}
		}
		/*
		 * Special horizontal/vertical, etc. cases are checked and remaining
		 * slant lines are checked separately.
		 *
		 * The slant line intersections are solved using the parametric form
		 * of the equation for a line, since if we test x/y min/max planes explicitly
		 * then e.g. a  line passing through a corner point (X_AXIS.min,Y_AXIS.min)
		 * actually intersects 2 planes and hence further tests would be required
		 * to anticipate this and similar situations.
		 */

		/*
		 * Can have case (ix == ox && iy == oy) as both points OUTRANGE
		 */
		if (ix == ox && iy == oy) {
			/* but as only define single outrange point, can't intersect graph area */
			return (false);
		}
		if (ix == ox) {
			/* line parallel to y axis */

			/* x coord must be in range, and line must span both Y_AXIS.min and Y_AXIS.max */
			/* note that spanning Y_AXIS.min implies spanning Y_AXIS.max, as both points OUTRANGE */
			if (!stdfun.inrange(ix, axis.X_AXIS.min, axis.X_AXIS.max)) {
				return (false);
			}
			if (stdfun.inrange(axis.Y_AXIS.min, iy, oy)) {
				lx[0] = ix;
				ly[0] = axis.Y_AXIS.min;

				lx[1] = ix;
				ly[1] = axis.Y_AXIS.max;
				return (true);
			} else
				return (false);
		}
		if (iy == oy) {
			/* already checked case (ix == ox && iy == oy) */

			/* line parallel to x axis */
			/* y coord must be in range, and line must span both X_AXIS.min and X_AXIS.max */
			/* note that spanning X_AXIS.min implies spanning X_AXIS.max, as both points OUTRANGE */
			if (!stdfun.inrange(iy, axis.Y_AXIS.min, axis.Y_AXIS.max)) {
				return (false);
			}
			if (stdfun.inrange(axis.X_AXIS.min, ix, ox)) {
				lx[0] = axis.X_AXIS.min;
				ly[0] = iy;

				lx[1] = axis.X_AXIS.max;
				ly[1] = iy;
				return (true);
			} else
				return (false);
		}
		/* nasty 2D slanted line in an xy plane */

		/* From here on, it's essentially the classical Cyrus-Beck, or
		 * Liang-Barsky algorithm for line clipping to a rectangle */
		/*
	       Solve parametric equation

	       (ix, iy) + t (diff_x, diff_y)

	       where 0.0 <= t <= 1.0 and

	       diff_x = (ox - ix);
	       diff_y = (oy - iy);
		 */

		t[0] = (axis.X_AXIS.min - ix) / (ox - ix);
		t[1] = (axis.X_AXIS.max - ix) / (ox - ix);
		if (t[0] > t[1]) {
			swap = t[0];
			t[0] = t[1];
			t[1] = swap;
		}

		t[2] = (axis.Y_AXIS.min - iy) / (oy - iy);
		t[3] = (axis.Y_AXIS.max - iy) / (oy - iy);
		if (t[2] > t[3]) {
			swap = t[2];
			t[2] = t[3];
			t[3] = swap;
		}

		t_min = stdfun.GPMAX(stdfun.GPMAX(t[0], t[2]), 0.0);
		t_max = stdfun.GPMIN(stdfun.GPMIN(t[1], t[3]), 1.0);

		if (t_min > t_max)
			return (false);

		lx[0] = ix + t_min * (ox - ix);
		ly[0] = iy + t_min * (oy - iy);

		lx[1] = ix + t_max * (ox - ix);
		ly[1] = iy + t_max * (oy - iy);

		/*
		 * Can only have 0 or 2 intersection points -- only need test one coord
		 */
		/* FIXME: this is UGLY. Need an 'almost_inrange()' function */
		if (stdfun.inrange(lx[0],
				(axis.X_AXIS.min - 1e-5 * (axis.X_AXIS.max - axis.X_AXIS.min)),
				(axis.X_AXIS.max + 1e-5 * (axis.X_AXIS.max - axis.X_AXIS.min)))
				&& stdfun.inrange(ly[0],
						(axis.Y_AXIS.min - 1e-5 * (axis.Y_AXIS.max - axis.Y_AXIS.min)),
						(axis.Y_AXIS.max + 1e-5 * (axis.Y_AXIS.max - axis.Y_AXIS.min))))
		{

			return (true);
		}
		return (false);
	}

	/* STR points to a label string, possibly with several lines separated
	   by \n.  Return the number of characters in the longest line.  If
	   LINES is not NULL, set *LINES to the number of lines in the
	   label. */
	static int
	label_width(String str, int lines[])
	{
		int longestLine = 0;

		if (str == null) {
			return 0;
		}

		String[] strLines = str.split("\n");

		if (lines != null) {
			lines[0] = strLines.length;
		}

		for (int i = 0; i < strLines.length; i++){
			if (strLines[i].length() > longestLine) {
				longestLine = strLines[i].length();
			}
		}

		return longestLine;

	}


	/*{{{  map_position, wrapper, which maps double to int */
	void
	map_position(
			gadgets.t_position pos,
			int x[], int y[],
			String what)
	{
		double xx[] = new double[1];
		double yy[] = new double[1];
		map_position_double(pos, xx, yy, what);
		x[0] = (int) xx[0];
		y[0] = (int) yy[0];
	}

	/*}}} */

	/*{{{  map_position_double */
	static void
	map_position_double(
			gadgets.t_position pos,
			double x[], double y[],
			String what)
	{
		switch (pos.scalex) {
		case first_axes:
		{
			double xx = axis.axis_log_value_checked(axis.AXIS_INDEX.FIRST_X_AXIS, pos.x, what);
			x[0] = axis.AXIS_MAP(axis.AXIS_INDEX.FIRST_X_AXIS, xx);
			break;
		}
		case second_axes:
		{
			double xx = axis.axis_log_value_checked(axis.AXIS_INDEX.SECOND_X_AXIS, pos.x, what);
			x[0] = axis.AXIS_MAP(axis.AXIS_INDEX.SECOND_X_AXIS, xx);
			break;
		}
		case graph:
		{
			x[0] = gadgets.plot_bounds.xleft + pos.x * (gadgets.plot_bounds.xright - gadgets.plot_bounds.xleft);
			break;
		}
		case screen:
		{
			x[0] = pos.x * (term.xmax - 1);
			break;
		}
		case character:
		{
			x[0] = pos.x * term.h_char;
			break;
		}
		}
		switch (pos.scaley) {
		case first_axes:
		{
			double yy = axis.axis_log_value_checked(axis.AXIS_INDEX.FIRST_Y_AXIS, pos.y, what);
			y[0] = axis.AXIS_MAP(axis.AXIS_INDEX.FIRST_Y_AXIS, yy);
			break;
		}
		case second_axes:
		{
			double yy = axis.axis_log_value_checked(axis.AXIS_INDEX.SECOND_Y_AXIS, pos.y, what);
			y[0] = axis.AXIS_MAP(axis.AXIS_INDEX.SECOND_Y_AXIS, yy);
			break;
		}
		case graph:
		{
			y[0] = gadgets.plot_bounds.ybot + pos.y * (gadgets.plot_bounds.ytop - gadgets.plot_bounds.ybot);
			break;
		}
		case screen:
		{
			y[0] = pos.y * (term.ymax -1);
			break;
		}
		case character:
		{
			y[0] = pos.y * term.v_char;
			break;
		}
		}
		x[0] += 0.5;
		y[0] += 0.5;
	}

	/*}}} */

	/*{{{  map_position_r */
	static void
	map_position_r(
			gadgets.t_position pos,
			double x[], double y[],
			String what)
	{
		switch (pos.scalex) {
		case first_axes:
		{
			double xx = axis.axis_log_value_checked(axis.AXIS_INDEX.FIRST_X_AXIS, pos.x, what);
			x[0] = xx * axis.axis_array[axis.AXIS_INDEX.FIRST_X_AXIS.value].term_scale;
			break;
		}
		case second_axes:
		{
			double xx = axis.axis_log_value_checked(axis.AXIS_INDEX.SECOND_X_AXIS, pos.x, what);
			x[0] = xx * axis.axis_array[axis.AXIS_INDEX.SECOND_X_AXIS.value].term_scale;
			break;
		}
		case graph:
		{
			x[0] = pos.x * (gadgets.plot_bounds.xright - gadgets.plot_bounds.xleft);
			break;
		}
		case screen:
		{
			x[0] = pos.x * (term.xmax - 1);
			break;
		}
		case character:
		{
			x[0] = pos.x * term.h_char;
			break;
		}
		}
		switch (pos.scaley) {
		case first_axes:
		{
			double yy = axis.axis_log_value_checked(axis.AXIS_INDEX.FIRST_Y_AXIS, pos.y, what);
			y[0] = yy * axis.axis_array[axis.AXIS_INDEX.FIRST_Y_AXIS.value].term_scale;
			return;
		}
		case second_axes:
		{
			double yy = axis.axis_log_value_checked(axis.AXIS_INDEX.SECOND_Y_AXIS, pos.y, what);
			y[0] = yy * axis.axis_array[axis.AXIS_INDEX.SECOND_Y_AXIS.value].term_scale;
			return;
		}
		case graph:
		{
			y[0] = pos.y * (gadgets.plot_bounds.ytop - gadgets.plot_bounds.ybot);
			return;
		}
		case screen:
		{
			y[0] = pos.y * (term.ymax -1);
			return;
		}
		case character:
		{
			y[0] = pos.y * term.v_char;
			break;
		}
		}
	}
	/*}}} */

	/* Graph legend is now optionally done in two passes. The first pass calculates	*/
	/* and reserves the necessary space.  Next the individual plots in the graph 	*/
	/* are drawn. Then the reserved space for the legend is blanked out, and 	*/
	/* finally the second pass through this code draws the legend.			*/
	static void
	do_key_layout(gadgets.legend_key key, boolean key_pass, int xinkey[], int yinkey[])
	{

		int xl = key.bounds.xleft + key_size_left;
		int yl = key.bounds.ytop;

		/* In two-pass mode, we blank out the key area after the graph	*/
		/* is drawn and then redo the key in the blank area.		*/
		if (key_pass) {
			term.linetype(term_api.LT_BACKGROUND);
			term.fillbox(term_api.FS_OPAQUE, key.bounds.xleft, key.bounds.ybot,
					key.bounds.xright - key.bounds.xleft,
					key.bounds.ytop - key.bounds.ybot);
		}

		int center = (key.bounds.xleft + key.bounds.xright) / 2;
		double extra_height = 0.0;

		if (((term.flags & term_api.TERM_ENHANCED_TEXT) != 0) && (key.title.indexOf('^') != -1))
			extra_height += 0.51;

		/* Only draw the title once */
		if (key_pass || !key.front) {
			if (key.textcolor.type == color.TC_RGB && key.textcolor.value < 0)
				gadgets.apply_pm3dcolor(key.box.pm3d_color);
			else
				gadgets.apply_pm3dcolor(key.textcolor);
			term_api.write_multiline(center, (int) (yl - (0.5 + extra_height/2.0) * term.v_char),
					key.title, term_api.JUSTIFY.CENTRE, term_api.VERT_JUSTIFY.JUST_TOP, 0, key.font);
			term.linetype(term_api.LT_BLACK);
		}

		if (((term.flags & term_api.TERM_ENHANCED_TEXT) != 0) && (key.title.indexOf('_') != -1))
			extra_height += 0.3;
		ktitl_lines += extra_height;
		key.bounds.ybot -= extra_height * term.v_char;
		yl -= term.v_char * ktitl_lines;

		yl -= (int)(0.5 * key.height_fix * term.v_char);
		yl_ref = yl -= key_entry_height / 2;	/* centralise the keys */

		if (key.box.l_type > term_api.LT_NODRAW) {
			BoundingBox clip_save = gadgets.clip_area;
			if ((term.flags & term_api.TERM_CAN_CLIP) != 0)
				gadgets.clip_area = null;
			else
				gadgets.clip_area = gadgets.canvas;
			term_api.term_apply_lp_properties(key.box);
			term.newpath();
			gadgets.draw_clip_line(key.bounds.xleft, key.bounds.ybot, key.bounds.xleft, key.bounds.ytop);
			gadgets.draw_clip_line(key.bounds.xleft, key.bounds.ytop, key.bounds.xright, key.bounds.ytop);
			gadgets.draw_clip_line(key.bounds.xright, key.bounds.ytop, key.bounds.xright, key.bounds.ybot);
			gadgets.draw_clip_line(key.bounds.xright, key.bounds.ybot, key.bounds.xleft, key.bounds.ybot);
			term.closepath();
			/* draw a horizontal line between key title and first entry */
			gadgets.draw_clip_line( key.bounds.xleft, (int)(key.bounds.ytop - (ktitl_lines) * term.v_char),
					key.bounds.xright, (int)(key.bounds.ytop - (ktitl_lines) * term.v_char));
			gadgets.clip_area = clip_save;
		}

		xinkey[0] = xl;
		yinkey[0] = yl;
	}

}