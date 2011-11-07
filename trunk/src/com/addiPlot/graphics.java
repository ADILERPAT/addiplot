package com.addiPlot;

import java.util.AbstractQueue;
import java.util.Queue;
import java.util.Vector;

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

	    for (i = 0; i < plot.p_count; i++) {

	    	/* rgb variable  -  color read from data column */
	    	check_for_variable_color(plot, plot.varcolor.get(i));

	    	switch (plot.points.get(i).type) {
	    		case INRANGE:{
	    			x = axis.map_x(plot.points.get(i).x);
	    			y = axis.map_y(plot.points.get(i).y);

	    			if (prev == coord_type.INRANGE) {
	    				t.vector(x, y);
	    			} else if (prev == coord_type.OUTRANGE) {
	    				/* from outrange to inrange */
	    				if (!gadgets.clip_lines1) {
	    					t.move(x, y);
	    				} else {
	    					tempCoord = edge_intersect(plot.points, i);
	    					t.move(axis.map_x(tempCoord.x), axis.map_y(tempCoord.y));
	    					t.vector(x, y);
	    				}
	    			} else {	/* prev == UNDEFINED */
	    				t.move(x, y);
	    				t.vector(x, y);
	    			}

	    			break;
	    		}
	    		case OUTRANGE:{
	    			if (prev == coord_type.INRANGE) {
	    				/* from inrange to outrange */
	    				if (gadgets.clip_lines1) {
	    					tempCoord = edge_intersect(plot.points, i);
	    					t.vector(axis.map_x(tempCoord.x), axis.map_y(tempCoord.y));
	    				}
	    			} else if (prev == coord_type.OUTRANGE) {
	    				/* from outrange to outrange */
	    				if (gadgets.clip_lines2) {
	    					//if (two_edge_intersect(plot.points, i, lx, ly)) {
	    					//	t.move(axis.map_x(lx[0]), axis.map_y(ly[0]));
	    					//	t.vector(axis.map_x(lx[1]), axis.map_y(ly[1]));
	    					//}
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
//	public static Vector<coordinate> two_edge_intersect(
//		Vector<coordinate> points, /* the points array */
//	    int i)			/* line segment from point i-1 to point i */
//	{
//	    /* global X_AXIS.min, X_AXIS.max, Y_AXIS.min, X_AXIS.max */
//	    int count;
//	    double ix = points.get(i-1).x;
//	    double iy = points.get(i-1).y;
//	    double ox = points.get(i).x;
//	    double oy = points.get(i).y;
//	    double t[4];
//	    double swap;
//	    double t_min, t_max;
//
//	    /* nasty degenerate cases, effectively drawing to an infinity
//	     * point (?)  cope with them here, so don't process them as a
//	     * "real" OUTRANGE point
//
//	     * If more than one coord is -VERYLARGE, then can't ratio the
//	     * "infinities" so drop out by returning FALSE */
//
//	    count = 0;
//	    if (ix == -VERYLARGE)
//		count++;
//	    if (ox == -VERYLARGE)
//		count++;
//	    if (iy == -VERYLARGE)
//		count++;
//	    if (oy == -VERYLARGE)
//		count++;
//
//	    /* either doesn't pass through graph area *or* can't ratio
//	     * infinities to get a direction to draw line, so simply
//	     * return(FALSE) */
//	    if (count > 1) {
//		return (FALSE);
//	    }
//
//	    if (ox == -VERYLARGE || ix == -VERYLARGE) {
//		/* Horizontal line */
//		if (ix == -VERYLARGE) {
//		    /* swap points so ix/iy don't have a -VERYLARGE component */
//		    swap = ix;
//		    ix = ox;
//		    ox = swap;
//		    swap = iy;
//		    iy = oy;
//		    oy = swap;
//		}
//		/* check actually passes through the graph area */
//		if (ix > GPMAX(X_AXIS.max, X_AXIS.min)
//		    && inrange(iy, Y_AXIS.min, Y_AXIS.max)) {
//		    lx[0] = X_AXIS.min;
//		    ly[0] = iy;
//
//		    lx[1] = X_AXIS.max;
//		    ly[1] = iy;
//		    return (TRUE);
//		} else {
//		    return (FALSE);
//		}
//	    }
//	    if (oy == -VERYLARGE || iy == -VERYLARGE) {
//		/* Vertical line */
//		if (iy == -VERYLARGE) {
//		    /* swap points so ix/iy don't have a -VERYLARGE component */
//		    swap = ix;
//		    ix = ox;
//		    ox = swap;
//		    swap = iy;
//		    iy = oy;
//		    oy = swap;
//		}
//		/* check actually passes through the graph area */
//		if (iy > GPMAX(Y_AXIS.min, Y_AXIS.max)
//		    && inrange(ix, X_AXIS.min, X_AXIS.max)) {
//		    lx[0] = ix;
//		    ly[0] = Y_AXIS.min;
//
//		    lx[1] = ix;
//		    ly[1] = Y_AXIS.max;
//		    return (TRUE);
//		} else {
//		    return (FALSE);
//		}
//	    }
//	    /*
//	     * Special horizontal/vertical, etc. cases are checked and remaining
//	     * slant lines are checked separately.
//	     *
//	     * The slant line intersections are solved using the parametric form
//	     * of the equation for a line, since if we test x/y min/max planes explicitly
//	     * then e.g. a  line passing through a corner point (X_AXIS.min,Y_AXIS.min)
//	     * actually intersects 2 planes and hence further tests would be required
//	     * to anticipate this and similar situations.
//	     */
//
//	    /*
//	     * Can have case (ix == ox && iy == oy) as both points OUTRANGE
//	     */
//	    if (ix == ox && iy == oy) {
//		/* but as only define single outrange point, can't intersect graph area */
//		return (FALSE);
//	    }
//	    if (ix == ox) {
//		/* line parallel to y axis */
//
//		/* x coord must be in range, and line must span both Y_AXIS.min and Y_AXIS.max */
//		/* note that spanning Y_AXIS.min implies spanning Y_AXIS.max, as both points OUTRANGE */
//		if (!inrange(ix, X_AXIS.min, X_AXIS.max)) {
//		    return (FALSE);
//		}
//		if (inrange(Y_AXIS.min, iy, oy)) {
//		    lx[0] = ix;
//		    ly[0] = Y_AXIS.min;
//
//		    lx[1] = ix;
//		    ly[1] = Y_AXIS.max;
//		    return (TRUE);
//		} else
//		    return (FALSE);
//	    }
//	    if (iy == oy) {
//		/* already checked case (ix == ox && iy == oy) */
//
//		/* line parallel to x axis */
//		/* y coord must be in range, and line must span both X_AXIS.min and X_AXIS.max */
//		/* note that spanning X_AXIS.min implies spanning X_AXIS.max, as both points OUTRANGE */
//		if (!inrange(iy, Y_AXIS.min, Y_AXIS.max)) {
//		    return (FALSE);
//		}
//		if (inrange(X_AXIS.min, ix, ox)) {
//		    lx[0] = X_AXIS.min;
//		    ly[0] = iy;
//
//		    lx[1] = X_AXIS.max;
//		    ly[1] = iy;
//		    return (TRUE);
//		} else
//		    return (FALSE);
//	    }
//	    /* nasty 2D slanted line in an xy plane */
//
//	    /* From here on, it's essentially the classical Cyrus-Beck, or
//	     * Liang-Barsky algorithm for line clipping to a rectangle */
//	    /*
//	       Solve parametric equation
//
//	       (ix, iy) + t (diff_x, diff_y)
//
//	       where 0.0 <= t <= 1.0 and
//
//	       diff_x = (ox - ix);
//	       diff_y = (oy - iy);
//	     */
//
//	    t[0] = (X_AXIS.min - ix) / (ox - ix);
//	    t[1] = (X_AXIS.max - ix) / (ox - ix);
//	    if (t[0] > t[1]) {
//		swap = t[0];
//		t[0] = t[1];
//		t[1] = swap;
//	    }
//
//	    t[2] = (Y_AXIS.min - iy) / (oy - iy);
//	    t[3] = (Y_AXIS.max - iy) / (oy - iy);
//	    if (t[2] > t[3]) {
//		swap = t[2];
//		t[2] = t[3];
//		t[3] = swap;
//	    }
//
//	    t_min = GPMAX(GPMAX(t[0], t[2]), 0.0);
//	    t_max = GPMIN(GPMIN(t[1], t[3]), 1.0);
//
//	    if (t_min > t_max)
//		return (FALSE);
//
//	    lx[0] = ix + t_min * (ox - ix);
//	    ly[0] = iy + t_min * (oy - iy);
//
//	    lx[1] = ix + t_max * (ox - ix);
//	    ly[1] = iy + t_max * (oy - iy);
//
//	    /*
//	     * Can only have 0 or 2 intersection points -- only need test one coord
//	     */
//	    /* FIXME: this is UGLY. Need an 'almost_inrange()' function */
//	    if (inrange(lx[0],
//			(X_AXIS.min - 1e-5 * (X_AXIS.max - X_AXIS.min)),
//			(X_AXIS.max + 1e-5 * (X_AXIS.max - X_AXIS.min)))
//		&& inrange(ly[0],
//			   (Y_AXIS.min - 1e-5 * (Y_AXIS.max - Y_AXIS.min)),
//			   (Y_AXIS.max + 1e-5 * (Y_AXIS.max - Y_AXIS.min))))
//	    {
//
//		return (TRUE);
//	    }
//	    return (FALSE);
//	}
}