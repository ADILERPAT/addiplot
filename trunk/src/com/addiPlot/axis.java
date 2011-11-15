package com.addiPlot;

import com.addiPlot.gadgets.text_label;
import com.addiPlot.term_api.lp_style_type;

public class axis {
	
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
	
}