package com.addiPlot.gnuplot;

public enum histogram_type
{
	HT_NONE,
	HT_STACKED_IN_LAYERS,
	HT_STACKED_IN_TOWERS,
	HT_CLUSTERED,
	HT_ERRORBARS;

	public int getValue()
	{
		return this.ordinal();
	}

	public static histogram_type forValue(int value)
	{
		return values()[value];
	}
}