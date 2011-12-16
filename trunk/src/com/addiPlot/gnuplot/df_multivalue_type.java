package com.addiPlot.gnuplot;

public enum df_multivalue_type
{
	DF_DELTA,
	DF_FLIP_AXIS,
	DF_FLIP,
	DF_SCAN,
	DF_ORIGIN,
	DF_CENTER,
	DF_ROTATION,
	DF_PERPENDICULAR,
	DF_SKIP;

	public int getValue()
	{
		return this.ordinal();
	}

	public static df_multivalue_type forValue(int value)
	{
		return values()[value];
	}
}