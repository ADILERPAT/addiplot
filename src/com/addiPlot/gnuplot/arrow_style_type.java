package com.addiPlot.gnuplot;

public class arrow_style_type // contains all Arrow properties
{
	public int layer; // 0 = back, 1 = front
	public lp_style_type lp_properties = new lp_style_type();
	/* head options */
	public e_arrow_head head; // arrow head choice
	/* struct position headsize; */  /* x = length, y = angle [deg] */
	public double head_length; // length of head, 0 = default
	public int head_lengthunit; // unit (x1, x2, screen, graph)
	public double head_angle; // front angle / deg
	public double head_backangle; // back angle / deg
	public int head_filled; // filled heads: 0=not, 1=empty, 2=filled
	/* ... more to come ? */
}