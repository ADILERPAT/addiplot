package com.addiPlot.gnuplot;

///#define OBJ_RECTANGLE (1)
///#define OBJ_CIRCLE (2)
///#define OBJ_ELLIPSE (3)
///#define OBJ_POLYGON (4)
///#endif

/* Datastructure implementing 'set style line' */
public class linestyle_def
{
	public linestyle_def next; // pointer to next linestyle in linked list
	public int tag; // identifies the linestyle
	public lp_style_type lp_properties = new lp_style_type();
}