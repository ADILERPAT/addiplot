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


	/* plot_lines:
	 * Plot the curves in LINES style
	 */
	public static void plot_lines(curve_points plot) {
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
			if (key.textcolor.type == TC_RGB && key.textcolor.value < 0)
				apply_pm3dcolor(&(key.box.pm3d_color), t);
			else
				apply_pm3dcolor(&(key.textcolor), t);
			write_multiline(center, yl - (0.5 + extra_height/2.0) * term.v_char,
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
				gadgets.clip_area = NULL;
			else
				gadgets.clip_area = &canvas;
			term_apply_lp_properties(key.box);
			term.newpath();
			gadgets.draw_clip_line(key.bounds.xleft, key.bounds.ybot, key.bounds.xleft, key.bounds.ytop);
			gadgets.draw_clip_line(key.bounds.xleft, key.bounds.ytop, key.bounds.xright, key.bounds.ytop);
			gadgets.draw_clip_line(key.bounds.xright, key.bounds.ytop, key.bounds.xright, key.bounds.ybot);
			gadgets.draw_clip_line(key.bounds.xright, key.bounds.ybot, key.bounds.xleft, key.bounds.ybot);
			term.closepath();
			/* draw a horizontal line between key title and first entry */
			gadgets.draw_clip_line( key.bounds.xleft, key.bounds.ytop - (ktitl_lines) * term.v_char,
					key.bounds.xright, key.bounds.ytop - (ktitl_lines) * term.v_char);
			gadgets.clip_area = clip_save;
		}

		xinkey[0] = xl;
		yinkey[0] = yl;
	}

}