package com.addiPlot.gnuplot;

public enum set_multiplot_id
{
	S_MULTIPLOT_LAYOUT,
	S_MULTIPLOT_COLUMNSFIRST,
	S_MULTIPLOT_ROWSFIRST,
	S_MULTIPLOT_SCALE,
	S_MULTIPLOT_DOWNWARDS,
	S_MULTIPLOT_UPWARDS,
	S_MULTIPLOT_OFFSET,
	S_MULTIPLOT_TITLE,
	S_MULTIPLOT_INVALID;

	public int getValue()
	{
		return this.ordinal();
	}

	public static set_multiplot_id forValue(int value)
	{
		return values()[value];
	}
}