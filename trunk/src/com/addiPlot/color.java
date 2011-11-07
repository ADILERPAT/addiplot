package com.addiPlot;

public class color {
	
	public class t_colorspec {
	    public int type;			/* TC_<type> definitions below */
	    public int lt;			/* used for TC_LT, TC_LINESTYLE and TC_RGB */
	    public double value;		/* used for TC_CB and TC_FRAC */
	};
	
	public static int TC_DEFAULT    = 0;	/* Use default color, set separately */
	public static int TC_LT		    = 1;	/* Use the color of linetype <n> */
	public static int TC_LINESTYLE	= 2;	/* Use the color of line style <n> */
	public static int TC_RGB		= 3;	/* Explicit RGB triple provided by user */
	public static int TC_CB		    = 4;	/* "palette cb <value>" */
	public static int TC_FRAC		= 5;	/* "palette frac <value> */
	public static int TC_Z		    = 6;	/* "palette z" */
	public static int TC_VARIABLE	= 7;	/* only used for "tc", never "lc" */
	
}