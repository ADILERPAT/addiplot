package com.addiPlot.gnuplot;

public class filledcurves_opts
{
	public int opt_given; // option given / not given (otherwise default)
	public int closeto; // from list FILLEDCURVES_CLOSED, ...
	public double at; // value for FILLEDCURVES_AT...
	public double aty; // the other value for FILLEDCURVES_ATXY
	public int oneside; // -1 if fill below bound only; +1 if fill above bound only
}