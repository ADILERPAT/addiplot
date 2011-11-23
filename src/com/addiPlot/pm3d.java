package com.addiPlot;

public class pm3d {
	


	public static void set_plot_with_palette(int plot_num, int plot_mode) {
		//CCX
	}
	
	
	public static double z2cb(double z) {
		//CCX
		return 0;
	}
	
	/*
	 * Rescale cb (color) value into the interval of grays [0,1], taking care
	 * of palette being positive or negative.
	 * Note that it is OK for logarithmic cb-axis too.
	 */
	public static double cb2gray(double cb)
	{
	    if (cb <= axis.CB_AXIS.min)
	    	return (color.sm_palette.positive == color.SMPAL_POSITIVE) ? 0 : 1;
	    if (cb >= axis.CB_AXIS.max)
	    	return (color.sm_palette.positive == color.SMPAL_POSITIVE) ? 1 : 0;
	    cb = (cb - axis.CB_AXIS.min)
	    		/ (axis.CB_AXIS.max - axis.CB_AXIS.min);
	    return (color.sm_palette.positive == color.SMPAL_POSITIVE) ? cb : 1-cb;
	}
	
	public static boolean is_plot_with_palette() {
		//CCX
		return false;
	}
}