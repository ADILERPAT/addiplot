package com.addiPlot.gnuplot;

public class poly_struct
{
	public edge_struct[] edge = new edge_struct[3]; // As we do triangolation here...
	public poly_struct next; // To chain lists.
}