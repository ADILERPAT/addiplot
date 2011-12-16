package com.addiPlot.gnuplot;

public enum en_contour_levels_kind
{
	/* How contour levels are set */
	LEVELS_AUTO, // automatically selected
	LEVELS_INCREMENTAL, // user specified start & incremnet
	LEVELS_DISCRETE; // user specified discrete levels

	public int getValue()
	{
		return this.ordinal();
	}

	public static en_contour_levels_kind forValue(int value)
	{
		return values()[value];
	}
}