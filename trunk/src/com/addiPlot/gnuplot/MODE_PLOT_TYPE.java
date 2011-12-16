package com.addiPlot.gnuplot;

public enum MODE_PLOT_TYPE
{
	MODE_QUERY,
	MODE_PLOT,
	MODE_SPLOT;

	public int getValue()
	{
		return this.ordinal();
	}

	public static MODE_PLOT_TYPE forValue(int value)
	{
		return values()[value];
	}
}