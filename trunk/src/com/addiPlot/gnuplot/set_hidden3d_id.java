package com.addiPlot.gnuplot;

public enum set_hidden3d_id
{
	S_HI_INVALID,
	S_HI_DEFAULTS,
	S_HI_OFFSET,
	S_HI_NOOFFSET,
	S_HI_TRIANGLEPATTERN,
	S_HI_UNDEFINED,
	S_HI_NOUNDEFINED,
	S_HI_ALTDIAGONAL,
	S_HI_NOALTDIAGONAL,
	S_HI_BENTOVER,
	S_HI_NOBENTOVER,
	S_HI_FRONT,
	S_HI_BACK;

	public int getValue()
	{
		return this.ordinal();
	}

	public static set_hidden3d_id forValue(int value)
	{
		return values()[value];
	}
}