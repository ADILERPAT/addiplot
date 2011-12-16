package com.addiPlot.gnuplot;

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define EMPTY_FILLEDCURVES_OPTS { 0, 0, 0.0, 0.0, 0 }

public class histogram_style
{
	public int type; // enum t_histogram_type
	public int gap; // set style hist gap <n> (space between clusters)
	public int clustersize; // number of datasets in this histogram
	public double start; // X-coord of first histogram entry
	public double end; // X-coord of last histogram entry
	public int startcolor; // LT_UNDEFINED or explicit color for first entry
	public int startpattern; // LT_UNDEFINED or explicit pattern for first entry
	public double bar_lw; // linewidth for error bars
	public histogram_style next;
	public text_label title = new text_label();
}