package com.addiPlot.gnuplot;

///#endif // TERM_HELP 

public class quadrangle
{
	public double gray;
	public double z; // maximal z value after rotation to graph coordinate system
	public gpdPoint[] corners = new gpdPoint[4];
	public gpiPoint[] icorners = new gpiPoint[4]; // also if EXTENDED_COLOR_SPECS is not defined
}