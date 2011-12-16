package com.addiPlot.gnuplot;

public enum test_id
{
	TEST_INVALID,
	TEST_TERMINAL,
	TEST_PALETTE,
	TEST_TIME;

	public int getValue()
	{
		return this.ordinal();
	}

	public static test_id forValue(int value)
	{
		return values()[value];
	}
}