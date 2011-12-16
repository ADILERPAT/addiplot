package com.addiPlot.gnuplot;

///#ifdef EAM_OBJECTS
/* The object types supported so far are OBJ_RECTANGLE, OBJ_CIRCLE, and OBJ_ELLIPSE */
public class rectangle
{
	public int type; // 0 = corners;  1 = center + size
	public position center = new position(); // center
	public position extent = new position(); // width and height
	public position bl = new position(); // bottom left
	public position tr = new position(); // top right
}