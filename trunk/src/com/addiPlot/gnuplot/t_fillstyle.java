package com.addiPlot.gnuplot;

public enum t_fillstyle
{
	FS_EMPTY,
	FS_SOLID,
	FS_PATTERN,
	FS_DEFAULT,
			   FS_TRANSPARENT_SOLID,
			   FS_TRANSPARENT_PATTERN;

	public int getValue()
	{
		return this.ordinal();
	}

	public static t_fillstyle forValue(int value)
	{
		return values()[value];
	}
}