package com.addiPlot.gnuplot;

/* The stacking direction of the key box: (vertical, horizontal) */
public enum en_key_stack_direction
{
	GPKEY_VERTICAL,
	GPKEY_HORIZONTAL;

	public int getValue()
	{
		return this.ordinal();
	}

	public static en_key_stack_direction forValue(int value)
	{
		return values()[value];
	}
}