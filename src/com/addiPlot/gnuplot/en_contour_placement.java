package com.addiPlot.gnuplot;

public enum en_contour_placement
{
	/* Where to place contour maps if at all. */
	CONTOUR_NONE,
	CONTOUR_BASE,
	CONTOUR_SRF,
	CONTOUR_BOTH;

	public int getValue()
	{
		return this.ordinal();
	}

	public static en_contour_placement forValue(int value)
	{
		return values()[value];
	}
}