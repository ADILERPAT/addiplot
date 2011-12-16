package com.addiPlot.gnuplot;

/* Key sample to the left or the right of the plot title? */
public enum en_key_sample_positioning
{
	GPKEY_LEFT,
	GPKEY_RIGHT;

	public int getValue()
	{
		return this.ordinal();
	}

	public static en_key_sample_positioning forValue(int value)
	{
		return values()[value];
	}
}