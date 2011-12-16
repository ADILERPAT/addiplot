package com.addiPlot.gnuplot;

/* Datastructure implementing 'set style arrow' */
public class arrowstyle_def
{
	public arrowstyle_def next; // pointer to next arrowstyle in linked list
	public int tag; // identifies the arrowstyle
	public arrow_style_type arrow_properties = new arrow_style_type();
}