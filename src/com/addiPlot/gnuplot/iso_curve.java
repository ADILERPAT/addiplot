package com.addiPlot.gnuplot;

public class iso_curve
{
	public iso_curve next;
	public int p_max; // how many points are allocated
	public int p_count; // count of points in points
	public coordinate points;
}