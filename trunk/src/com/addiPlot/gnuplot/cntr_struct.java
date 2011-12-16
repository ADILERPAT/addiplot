package com.addiPlot.gnuplot;

/* Contours are saved using this struct list. */
public class cntr_struct
{
	public double X; // The coordinates of this vertex.
	public double Y;
	public cntr_struct next; // To chain lists.
}