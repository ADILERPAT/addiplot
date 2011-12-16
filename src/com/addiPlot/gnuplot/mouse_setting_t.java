package com.addiPlot.gnuplot;

public class mouse_setting_t
{
	public int on; // ...
	public int doubleclick; // Button1 double / single click resolution
	public int annotate_zoom_box; // draw coordinates at zoom box
	public int label; // draw real gnuplot labels on Button 2
	public int polardistance; // display dist. to ruler in polar coordinates
	public int verbose; // display ipc commands
	public int warp_pointer; // warp pointer after starting a zoom box
	public String fmt; // fprintf format for printing numbers
	public String labelopts; // label options
}