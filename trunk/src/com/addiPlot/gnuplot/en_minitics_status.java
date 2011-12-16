package com.addiPlot.gnuplot;

/* we want two auto modes for minitics - default where minitics are
 * auto for log/time and off for linear, and auto where auto for all
 * graphs I've done them in this order so that logscale-mode can
 * simply test bit 0 to see if it must do the minitics automatically.
 * similarly, conventional plot can test bit 1 to see if minitics are
 * required */
public enum en_minitics_status
{
	MINI_OFF,
	MINI_DEFAULT,
	MINI_USER,
	MINI_AUTO;

	public int getValue()
	{
		return this.ordinal();
	}

	public static en_minitics_status forValue(int value)
	{
		return values()[value];
	}
}