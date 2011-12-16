package com.addiPlot.gnuplot;

/* we use a similar trick for vertical justification of multi-line labels */
public enum VERT_JUSTIFY
{
	JUST_TOP,
	JUST_CENTRE,
	JUST_BOT;

	public int getValue()
	{
		return this.ordinal();
	}

	public static VERT_JUSTIFY forValue(int value)
	{
		return values()[value];
	}
}