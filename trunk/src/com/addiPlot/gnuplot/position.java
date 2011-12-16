package com.addiPlot.gnuplot;

/* A full 3D position, with all 3 coordinates of possible using different axes.
 * Used for 'set label', 'set arrow' positions and various offsets.
 */
public class position
{
	public position_type scalex;
	public position_type scaley;
	public position_type scalez;
	public double x;
	public double y;
	public double z;
}