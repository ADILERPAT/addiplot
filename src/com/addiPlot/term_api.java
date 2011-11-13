package com.addiPlot;

import com.addiPlot.color.t_colorspec;

public class term_api {
	

	/* this order means we can use  x-(just*strlen(text)*t->h_char)/2 if
	 * term cannot justify
	 */
	public enum JUSTIFY {
	    LEFT,
	    CENTRE,
	    RIGHT
	};

	/* we use a similar trick for vertical justification of multi-line labels */
	public enum VERT_JUSTIFY {
	    JUST_TOP,
	    JUST_CENTRE,
	    JUST_BOT
	};

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