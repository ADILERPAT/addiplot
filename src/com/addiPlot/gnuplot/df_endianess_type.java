package com.addiPlot.gnuplot;

/* To generate a swap, take the bit-wise complement of the lowest two bits. */
public enum df_endianess_type
{
	DF_LITTLE_ENDIAN,
	DF_PDP_ENDIAN,
	DF_DPD_ENDIAN,
	DF_BIG_ENDIAN,
	DF_ENDIAN_TYPE_LENGTH; // Must be last

	public int getValue()
	{
		return this.ordinal();
	}

	public static df_endianess_type forValue(int value)
	{
		return values()[value];
	}
}