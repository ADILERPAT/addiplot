package com.addiPlot.gnuplot;

/* Linked list of structures storing 'set label' information */
public class text_label
{
	public text_label next; // pointer to next label in linked list
	public int tag; // identifies the label
	public position place = new position();
	public JUSTIFY pos;
	public int rotate;
	public int layer;
	public String text;
	public String font; // Entry font added by DJL
	public t_colorspec textcolor = new t_colorspec();
	public lp_style_type lp_properties = new lp_style_type();
	public position offset = new position();
	public boolean noenhanced;
}