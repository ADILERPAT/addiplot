package com.addiPlot.gnuplot;

///#define SUPPORT_MIDDLE_ENDIAN 1

///#if SUPPORT_MIDDLE_ENDIAN
/* To generate a swap, take the bit-wise complement of the lowest two bits. */
public enum df_byte_read_order_type
{
	DF_0123,
	DF_1032,
	DF_2301,
	DF_3210;

	public int getValue()
	{
		return this.ordinal();
	}

	public static df_byte_read_order_type forValue(int value)
	{
		return values()[value];
	}
}