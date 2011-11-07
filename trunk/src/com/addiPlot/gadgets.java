package com.addiPlot;

import com.addiPlot.color.t_colorspec;
import com.addiPlot.term_api.lp_style_type;

public class gadgets {
	
	/* set clip */
	public static boolean clip_lines1 = true;
	public static boolean clip_lines2 = false;
	
	/* Coordinate system specifications: x1/y1, x2/y2, graph-box relative
	 * or screen relative coordinate systems */
	public enum position_type {
	    first_axes,
	    second_axes,
	    graph,
	    screen,
	    character
	};

	/* A full 3D position, with all 3 coordinates of possible using different axes.
	 * Used for 'set label', 'set arrow' positions and various offsets.
	 */
	public class position {
	    public position_type scalex;
	    public position_type scaley;
	    public position_type scalez;
	    public double x;
	    public double y;
	    public double z;
	};
	
	/* Linked list of structures storing 'set label' information */
	public class text_label {
	    public int tag;			/* identifies the label */
	    public position place;
	    public int rotate;
	    public int layer;
	    public String text;
	    public String font;		/* Entry font added by DJL */
	    public t_colorspec textcolor;
	    public lp_style_type lp_properties;
	    public position offset;
	    public boolean noenhanced;
	};
}