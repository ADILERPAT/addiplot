package com.addiPlot.gnuplot;

/* The various types of numerical types that can be read from a data file. */
public enum df_data_type
{
	DF_CHAR,
	DF_UCHAR,
	DF_SHORT,
	DF_USHORT,
	DF_INT,
	DF_UINT,
	DF_LONG,
	DF_ULONG,
	DF_FLOAT,
	DF_DOUBLE,
	DF_LONGLONG,
	DF_ULONGLONG,
	DF_BAD_TYPE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static df_data_type forValue(int value)
	{
		return values()[value];
	}
}