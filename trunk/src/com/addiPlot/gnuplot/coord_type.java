package com.addiPlot.gnuplot;

/* Defines the type of a coordinate */
/* INRANGE and OUTRANGE points have an x,y point associated with them */
public enum coord_type
{
	INRANGE, // inside plot boundary
	OUTRANGE, // outside plot boundary, but defined
	UNDEFINED; // not defined at all

	public int getValue()
	{
		return this.ordinal();
	}

	public static coord_type forValue(int value)
	{
		return values()[value];
	}
}