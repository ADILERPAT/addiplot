package com.addiPlot;

import com.addiPlot.gadgets.text_label;
import com.addiPlot.term_api.lp_style_type;

public class axis {
	
	public static int widest_tic_strlen;  
	
	/* Values to put in the axis_tics[] variables that decides where the
	 * ticmarks should be drawn: not at all, on one or both plot borders,
	 * or the zeroaxes. These look like a series of values, but TICS_MASK
	 * shows that they're actually bit masks --> don't turn into an enum
	 * */
	public static int NO_TICS        = 0;
	public static int TICS_ON_BORDER = 1;
	public static int TICS_ON_AXIS   = 2;
	public static int TICS_MASK      = 3;
	public static int TICS_MIRROR    = 4;
	
	/* give some names to some array elements used in command.c and grap*.c
	 * maybe one day the relevant items in setshow will also be stored
	 * in arrays.
	 *
	 * Always keep the following conditions alive:
	 * SECOND_X_AXIS = FIRST_X_AXIS + SECOND_AXES
	 * FIRST_X_AXIS & SECOND_AXES == 0
	*/
	public static int FIRST_AXES = 0;
	public static int SECOND_AXES = 4;
	public static int NO_AXIS = 99;

	public enum AXIS_INDEX {
		FIRST_Z_AXIS  (0),
		FIRST_Y_AXIS  (1),
		FIRST_X_AXIS  (2),
		SECOND_Z_AXIS (4), /* not used, yet */
		SECOND_Y_AXIS (5),
		SECOND_X_AXIS (6),
		COLOR_AXIS (10);
		
		public int value;
		AXIS_INDEX(int value) {
		   this.value = value;	
		}
	};

	public static int AXIS_ARRAY_SIZE = 11;
	
	public class AXIS {
		/* range of this axis */
		public double min;			/* 'transient' axis extremal values */
		public double max;
		public double set_min;		/* set/show 'permanent' values */
		public double set_max;		    
		public double data_min;		/* Not necessarily the same as axis min */
		public double data_max;
		    
		/* output-related quantities */
		public int term_lower;		/* low and high end of the axis on output, */
		public int term_upper;		/* ... (in terminal coordinates)*/
		public double term_scale;	/* scale factor: plot --> term coords */
		public long term_zero;  	/* position of zero axis */

		/* log axis control */
		public boolean log;			/* log axis stuff: flag "islog?" */
		public double base;  		/* logarithm base value */
		public double log_base;		/* ln(base), for easier computations */

		/* time/date axis control */
		public boolean is_timedata;	/* is this a time/date axis? */
		public boolean format_is_numeric;	/* format string looks like numeric??? */
		public String timefmt;		/* format string for input */
		public String formatstring; /* the format string for output */

		/* ticmark control variables */
		public int ticmode;		/* tics on border/axis? mirrored? */
		public t_ticdef ticdef;	/* tic series definition */
		public int tic_rotate;		/* ticmarks rotated by this angle */
		public boolean gridmajor;		/* Grid lines wanted on major tics? */
	    public boolean gridminor;		/* Grid lines for minor tics? */
		public int minitics;		/* minor tic mode (none/auto/user)? */
		public double mtic_freq;		/* minitic stepsize */
		public double ticscale;		/* scale factor for tic marks (was (0..1])*/
		public double miniticscale;	/* and for minitics */
		public boolean tic_in;		/* tics to be drawn inward?  */

		/* other miscellaneous fields */
		public text_label label;		/* label string and position offsets *//* other miscellaneous fields */
	    public lp_style_type zeroaxis;	/* drawing style for zeroaxis, if any */

	}
		
	public static AXIS axis_array[] = new AXIS[AXIS_ARRAY_SIZE];
	
	/* axes being used by the current plot */
	public static AXIS_INDEX x_axis;
	public static AXIS_INDEX y_axis;
	public static AXIS_INDEX z_axis;
	
	/* macros to reduce code clutter caused by the array notation, mainly
	 * in graphics.c and fit.c */
	public static AXIS X_AXIS = axis_array[x_axis.value];
	public static AXIS Y_AXIS = axis_array[y_axis.value];
	public static AXIS Z_AXIS = axis_array[z_axis.value];
	public static AXIS CB_AXIS = axis_array[AXIS_INDEX.COLOR_AXIS.value];

	public static int map_x(double x) {
		return AXIS_MAP(x_axis, x);
	}
	
	public static int map_y(double y) {
		return AXIS_MAP(y_axis, y);
	}
	
	public static int AXIS_MAP(AXIS_INDEX axis, double variable) {
		/* Macros to map from user to terminal coordinates and back */
		return (int) ((axis_array[axis.value].term_lower) + ((variable) - axis_array[axis.value].min) * axis_array[axis.value].term_scale + 0.5);
	}
	
	/* {{{ axis_log_value_checked() */
	public static double
	axis_log_value_checked(AXIS_INDEX axis, double coord, String what)
	{
	    if (axis_array[axis.value].log) {
		if (coord <= 0.0) {
		    graph_error("%s has %s coord of %g; must be above 0 for log scale!",
				what, axis_defaults[axis.value].name, coord);
		} else
		    return (AXIS_DO_LOG(axis,coord));
	    }
	    return (coord);
	}
	
	/* {{{ axis_checked_extend_empty_range() */
	/*
	 * === SYNOPSIS ===
	 *
	 * This function checks whether the data and/or plot range in a given axis
	 * is too small (which would cause divide-by-zero and/or infinite-loop
	 * problems later on).  If so,
	 * - if autoscaling is in effect for this axis, we widen the range
	 * - otherwise, we abort with a call to  int_error()  (which prints out
	 *   a suitable error message, then (hopefully) aborts this command and
	 *   returns to the command prompt or whatever).
	 *
	 *
	 * === HISTORY AND DESIGN NOTES ===
	 *
	 * 1998 Oct 4, Jonathan Thornburg <jthorn@galileo.thp.univie.ac.at>
	 *
	 * This function used to be a (long) macro  FIXUP_RANGE(AXIS, WHICH)
	 * which was (identically!) defined in  plot2d.c  and  plot3d.c .  As
	 * well as now being a function instead of a macro, the logic is also
	 * changed:  The "too small" range test no longer depends on 'set zero'
	 * and is now properly scaled relative to the data magnitude.
	 *
	 * The key question in designing this function is the policy for just how
	 * much to widen the data range by, as a function of the data magnitude.
	 * This is to some extent a matter of taste.  IMHO the key criterion is
	 * that (at least) all of the following should (a) not infinite-loop, and
	 * (b) give correct plots, regardless of the 'set zero' setting:
	 *      plot 6.02e23            # a huge number >> 1 / FP roundoff level
	 *      plot 3                  # a "reasonable-sized" number
	 *      plot 1.23e-12           # a small number still > FP roundoff level
	 *      plot 1.23e-12 * sin(x)  # a small function still > FP roundoff level
	 *      plot 1.23e-45           # a tiny number << FP roundoff level
	 *      plot 1.23e-45 * sin(x)  # a tiny function << FP roundoff level
	 *      plot 0          # or (more commonly) a data file of all zeros
	 * That is, IMHO gnuplot should *never* infinite-loop, and it should *never*
	 * producing an incorrect or misleading plot.  In contrast, the old code
	 * would infinite-loop on most of these examples with 'set zero 0.0' in
	 * effect, or would plot the small-amplitude sine waves as the zero function
	 * with 'zero' set larger than the sine waves' amplitude.
	 *
	 * The current code plots all the above examples correctly and without
	 * infinite looping.
	 *
	 * HBB 2000/05/01: added an additional up-front test, active only if
	 *   the new 'mesg' parameter is non-NULL.
	 *
	 * === USAGE ===
	 *
	 * Arguments:
	 * axis = (in) An integer specifying which axis (x1, x2, y1, y2, z, etc)
	 *             we should do our stuff for.  We use this argument as an
	 *             index into the global arrays  {min,max,auto}_array .  In
	 *             practice this argument will typically be one of the constants
	 *              {FIRST,SECOND}_{X,Y,Z}_AXIS  defined in plot.h.
	 * mesg = (in) if non-NULL, will check if the axis range is valid (min
	 *             not +VERYLARGE, max not -VERYLARGE), and int_error() out
	 *             if it isn't.
	 *
	 * Global Variables:
	 * auto_array, min_array, max_array (in out) (defined in axis.[ch]):
	 *    variables describing the status of autoscaling and range ends, for
	 *    each of the possible axes.
	 *
	 * c_token = (in) (defined in plot.h) Used in formatting an error message.
	 *
	 */
	public static void
	axis_checked_extend_empty_range(AXIS_INDEX axis, String mesg)
	{
	    /* These two macro definitions set the range-widening policy: */

	    /* widen [0:0] by +/- this absolute amount */
	#define FIXUP_RANGE__WIDEN_ZERO_ABS	1.0
	    /* widen [nonzero:nonzero] by -/+ this relative amount */
	#define FIXUP_RANGE__WIDEN_NONZERO_REL	0.01

	    double dmin = axis_array[axis].min;
	    double dmax = axis_array[axis].max;

	    /* HBB 20000501: this same action was taken just before most of
	     * the invocations of this function, so I moved it into here.
	     * Only do this if 'mesg' is non-NULL --> pass NULL if you don't
	     * want the test */
	    if (mesg
		&& (axis_array[axis].min == VERYLARGE
		    || axis_array[axis].max == -VERYLARGE))
		int_error(c_token, mesg);

	    if (dmax - dmin == 0.0) {
		/* empty range */
		if (axis_array[axis].autoscale) {
		    /* range came from autoscaling ==> widen it */
		    double widen = (dmax == 0.0) ?
			FIXUP_RANGE__WIDEN_ZERO_ABS
			: FIXUP_RANGE__WIDEN_NONZERO_REL * fabs(dmax);
		    if (!(axis == FIRST_Z_AXIS && !mesg)) /* set view map */
			fprintf(stderr, "Warning: empty %s range [%g:%g], ",
			    axis_defaults[axis].name, dmin, dmax);
		    /* HBB 20010525: correctly handle single-ended
		     * autoscaling, too: */
		    if (axis_array[axis].autoscale & AUTOSCALE_MIN)
			axis_array[axis].min -= widen;
		    if (axis_array[axis].autoscale & AUTOSCALE_MAX)
			axis_array[axis].max += widen;
		    if (!(axis == FIRST_Z_AXIS && !mesg)) /* set view map */
			fprintf(stderr, "adjusting to [%g:%g]\n",
			    axis_array[axis].min, axis_array[axis].max);
		} else {
		    /* user has explicitly set the range (to something empty)
	               ==> we're in trouble */
		    /* FIXME HBB 20000416: is c_token always set properly,
		     * when this is called? We might be better off using
		     * NO_CARET..., here */
		    int_error(c_token, "Can't plot with an empty %s range!",
			      axis_defaults[axis].name);
		}
	    }
	}

	/* }}} */

	/* }}} */
	
	/* {{{ setup_tics */
	/* setup_tics allows max number of tics to be specified but users dont
	 * like it to change with size and font, so we use value of 20, which
	 * is 3.5 behaviour.  Note also that if format is '', yticlin = 0, so
	 * this gives division by zero.  */

	public static void
	setup_tics(AXIS_INDEX axis, int max)
	{
	    double tic = 0;
	    AXIS *this = axis_array + axis;
	    struct ticdef *ticdef = &(this->ticdef);

	    /* HBB 20010703: New: allow _not_ to autoextend the axis endpoints
	     * to an integer multiple of the ticstep, for autoscaled axes with
	     * automatic tics */
	    TBOOLEAN autoextend_min = (this->autoscale & AUTOSCALE_MIN)
		&& ! (this->autoscale & AUTOSCALE_FIXMIN);
	    TBOOLEAN autoextend_max = (this->autoscale & AUTOSCALE_MAX)
		&& ! (this->autoscale & AUTOSCALE_FIXMAX);

	    /*  Apply constraints on autoscaled axis if requested:
	     *  The range is _expanded_ here only.  Limiting the range is done
	     *  in the macro STORE_WITH_LOG_AND_UPDATE_RANGE() of axis.h  */
	    if (this->autoscale & AUTOSCALE_MIN) {
	      	if (this->min_constraint & CONSTRAINT_UPPER) {
		    if (this->min > this->min_ub)
			this->min = this->min_ub;
		}
	    }
	    if (this->autoscale & AUTOSCALE_MAX) {
		if (this->max_constraint & CONSTRAINT_LOWER) {
		    if (this->max < this->max_lb)
			this->max = this->max_lb;
		}
	    }

	    /* HBB 20000506: if no tics required for this axis, do
	     * nothing. This used to be done exactly before each call of
	     * setup_tics, anyway... */
	    if (! this->ticmode)
		return;

	    if (ticdef->type == TIC_SERIES) {
		ticstep[axis] = tic = ticdef->def.series.incr;
		autoextend_min = autoextend_min
		                 && (ticdef->def.series.start == -VERYLARGE);
		autoextend_max = autoextend_max
		                 && (ticdef->def.series.end == VERYLARGE);
	    } else if (ticdef->type == TIC_COMPUTED) {
		ticstep[axis] = tic = make_tics(axis, max);
	    } else {
		/* user-defined, day or month */
		autoextend_min = autoextend_max = FALSE;
	    }

	    /* If an explicit stepsize was set, timelevel[axis] wasn't defined,
	     * leading to strange misbehaviours of minor tics on time axes.
	     * We used to call quantize_time_tics, but that also caused strangeness.
	     */
	    if (this->is_timedata && ticdef->type == TIC_SERIES) {
		if      (tic >= 365*24*60*60.) timelevel[axis] = TIMELEVEL_YEARS;
		else if (tic >=  28*24*60*60.) timelevel[axis] = TIMELEVEL_MONTHS;
		else if (tic >=   7*24*60*60.) timelevel[axis] = TIMELEVEL_WEEKS;
		else if (tic >=     24*60*60.) timelevel[axis] = TIMELEVEL_DAYS;
		else if (tic >=        60*60.) timelevel[axis] = TIMELEVEL_HOURS;
		else if (tic >=           60.) timelevel[axis] = TIMELEVEL_MINUTES;
		else                           timelevel[axis] = TIMELEVEL_SECONDS;
	    }

	    if (autoextend_min) {
		this->min = round_outward(axis, ! (this->min < this->max), this->min);
		if (this->min_constraint & CONSTRAINT_LOWER && this->min < this->min_lb)
		    this->min = this->min_lb;
	    }

	    if (autoextend_max) {
		this->max = round_outward(axis, this->min < this->max, this->max);
		if (this->max_constraint & CONSTRAINT_UPPER && this->max > this->max_ub)
		    this->max = this->max_ub;
	    }


	    /* Set up ticfmt[axis] correctly. If necessary (time axis, but not
	     * time/date output format), make up a formatstring that suits the
	     * range of data */
	    copy_or_invent_formatstring(axis);
	}

	/* }}} */
	
	/*
	   Check and set the cb-range for use by pm3d or other palette using styles.
	   Return 0 on wrong range, otherwise 1.
	 */
	public static int
	set_cbminmax()
	{
	    if (CB_AXIS.set_autoscale & AUTOSCALE_MIN) {
		/* -VERYLARGE according to AXIS_INI3D */
		if (CB_AXIS.min >= VERYLARGE)
		    CB_AXIS.min = AXIS_DE_LOG_VALUE(FIRST_Z_AXIS,Z_AXIS.min);
	    }
	    CB_AXIS.min = axis_log_value_checked(COLOR_AXIS, CB_AXIS.min, "color axis");

	    if (CB_AXIS.set_autoscale & AUTOSCALE_MAX) {
		/* -VERYLARGE according to AXIS_INI3D */
		if (CB_AXIS.max <= -VERYLARGE)
		    CB_AXIS.max = AXIS_DE_LOG_VALUE(FIRST_Z_AXIS,Z_AXIS.max);
	    }
	    CB_AXIS.max = axis_log_value_checked(COLOR_AXIS, CB_AXIS.max, "color axis");

	    if (CB_AXIS.min > CB_AXIS.max) {
		/* exchange min and max values */
		double tmp = CB_AXIS.max;
		CB_AXIS.max = CB_AXIS.min;
		CB_AXIS.min = tmp;
	    }

	    return 1;
	}

	
}