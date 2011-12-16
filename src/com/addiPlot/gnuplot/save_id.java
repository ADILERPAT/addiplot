package com.addiPlot.gnuplot;

/* plot smooth parameters in plot.h */

/* options for 'save' command */
public enum save_id
{
	SAVE_INVALID,
	SAVE_FUNCS,
	SAVE_TERMINAL,
	SAVE_SET,
	SAVE_VARS;

	public int getValue()
	{
		return this.ordinal();
	}

	public static save_id forValue(int value)
	{
		return values()[value];
	}
}