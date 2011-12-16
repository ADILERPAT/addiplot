package com.addiPlot.gnuplot;

/* Used by terminals and by shared routine parse_term_size() */
public enum size_units
{
	PIXELS,
	INCHES,
	CM;

	public int getValue()
	{
		return this.ordinal();
	}

	public static size_units forValue(int value)
	{
		return values()[value];
	}
}