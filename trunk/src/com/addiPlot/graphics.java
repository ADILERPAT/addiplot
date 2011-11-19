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

	static int xlablin, x2lablin, ylablin, y2lablin, titlelin, xticlin, x2ticlin;

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
		term_initialise();		/* may set xmax/ymax */
		term_start_plot();

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