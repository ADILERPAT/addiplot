package com.addiPlot.gnuplot;

/* Datastructure for 'set object' */
public class object
{
	public object next;
	public int tag;
	public int layer; // behind or back or front
	public int object_type; // OBJ_RECTANGLE
	public fill_style_type fillstyle = new fill_style_type();
	public lp_style_type lp_properties = new lp_style_type();
//C++ TO JAVA CONVERTER TODO TASK: Unions are not supported in Java:
//ORIGINAL LINE: union o
	public final static class o
	{
		public rectangle rectangle = new rectangle();
		public circle circle = new circle();
		public ellipse ellipse = new ellipse();
		public polygon polygon = new polygon();
	}
	public o o = new o();
}