package com.addiPlot.gnuplot;

/* In order to get multiple palettes on a plot, i.e., multiplot mode,
   we must keep track of all color maps on a plot so that a needed
   color map is not discarded prematurely. */
public class cmap_struct
{
	public cmap_t cmap;
	public cmap_struct next_cmap_struct;
}