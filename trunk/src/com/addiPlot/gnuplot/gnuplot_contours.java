package com.addiPlot.gnuplot;

public class gnuplot_contours
{
	public gnuplot_contours next;
	public coordinate coords;
	public byte isNewLevel;
	public String label = new String(new char[32]);
	public int num_pts;
	public double z;
}