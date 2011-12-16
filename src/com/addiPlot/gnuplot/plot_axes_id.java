package com.addiPlot.gnuplot;

/* options for plot ax[ei]s */
public enum plot_axes_id
{
	AXES_X1Y1,
	AXES_X2Y2,
	AXES_X1Y2,
	AXES_X2Y1,
	AXES_NONE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static plot_axes_id forValue(int value)
	{
		return values()[value];
	}
}