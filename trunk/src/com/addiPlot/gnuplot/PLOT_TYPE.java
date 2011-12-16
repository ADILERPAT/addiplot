package com.addiPlot.gnuplot;

public enum PLOT_TYPE
{
	FUNC,
	DATA,
	FUNC3D,
	DATA3D,
	NODATA;

	public int getValue()
	{
		return this.ordinal();
	}

	public static PLOT_TYPE forValue(int value)
	{
		return values()[value];
	}
}