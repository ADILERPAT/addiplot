package com.addiPlot.gnuplot;

/* direction into which the polygon is facing (the corner with the
 * right angle, inside the mesh, that is). The reference identifiying
 * the whole cell is always the lower right, i.e. southeast one. */
public enum polygon_direction
{
	pdir_NE,
	pdir_SE,
	pdir_SW,
	pdir_NW;

	public int getValue()
	{
		return this.ordinal();
	}

	public static polygon_direction forValue(int value)
	{
		return values()[value];
	}
}