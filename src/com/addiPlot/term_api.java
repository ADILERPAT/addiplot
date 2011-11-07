package com.addiPlot;

import com.addiPlot.color.t_colorspec;

public class term_api {

	public class lp_style_type {	/* contains all Line and Point properties */
    	public int     pointflag;		/* 0 if points not used, otherwise 1 */
    	public int     l_type;
    	public int     p_type;
    	public int     p_interval;		/* Every Nth point in style LINESPOINTS */
    	public double  l_width;
    	public double  p_size;
    	public boolean use_palette;
    	public t_colorspec pm3d_color;
	};
}