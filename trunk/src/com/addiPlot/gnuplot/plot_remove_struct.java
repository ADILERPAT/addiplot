package com.addiPlot.gnuplot;

/* information about window/plot to be removed */
public class plot_remove_struct
{
	public Window plot_window_to_remove = new Window();
	public plot_remove_struct next_remove;
	public int processed;
}