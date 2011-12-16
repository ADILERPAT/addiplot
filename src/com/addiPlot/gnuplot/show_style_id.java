package com.addiPlot.gnuplot;

public enum show_style_id
{
	SHOW_STYLE_INVALID,
	SHOW_STYLE_DATA,
	SHOW_STYLE_FUNCTION,
	SHOW_STYLE_LINE,
	SHOW_STYLE_FILLING,
	SHOW_STYLE_ARROW,
	SHOW_STYLE_RECTANGLE,
	SHOW_STYLE_INCREMENT,
	SHOW_STYLE_HISTOGRAM;

	public int getValue()
	{
		return this.ordinal();
	}

	public static show_style_id forValue(int value)
	{
		return values()[value];
	}
}