package com.addiPlot.gnuplot;

/* options for plot/splot */
public enum plot_id
{
	P_INVALID,
	P_AXES,
	P_BINARY,
	P_EVERY,
	P_INDEX,
	P_MATRIX,
	P_SMOOTH,
	P_THRU,
	P_TITLE,
	P_NOTITLE,
	P_USING,
	P_WITH;

	public int getValue()
	{
		return this.ordinal();
	}

	public static plot_id forValue(int value)
	{
		return values()[value];
	}
}