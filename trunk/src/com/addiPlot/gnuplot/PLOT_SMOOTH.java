package com.addiPlot.gnuplot;

public enum PLOT_SMOOTH
{
	SMOOTH_NONE,
	SMOOTH_ACSPLINES,
	SMOOTH_BEZIER,
	SMOOTH_CSPLINES,
	SMOOTH_SBEZIER,
	SMOOTH_UNIQUE,
	SMOOTH_FREQUENCY,
	SMOOTH_CUMULATIVE,
	SMOOTH_KDENSITY;

	public int getValue()
	{
		return this.ordinal();
	}

	public static PLOT_SMOOTH forValue(int value)
	{
		return values()[value];
	}
}