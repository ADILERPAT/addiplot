package com.addiPlot.gnuplot;

public enum set_colorbox_id
{
	S_COLORBOX_INVALID,
	S_COLORBOX_VERTICAL,
	S_COLORBOX_HORIZONTAL,
	S_COLORBOX_DEFAULT,
	S_COLORBOX_USER,
	S_COLORBOX_BORDER,
	S_COLORBOX_BDEFAULT,
	S_COLORBOX_NOBORDER,
	S_COLORBOX_ORIGIN,
	S_COLORBOX_SIZE,
	S_COLORBOX_FRONT,
	S_COLORBOX_BACK;

	public int getValue()
	{
		return this.ordinal();
	}

	public static set_colorbox_id forValue(int value)
	{
		return values()[value];
	}
}