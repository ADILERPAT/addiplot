package com.addiPlot.gnuplot;

/* Details about the records contained in a binary data file. */

public enum df_translation_type
{
	DF_TRANSLATE_DEFAULT, // Gnuplot will position in first quadrant at origin.
	DF_TRANSLATE_VIA_ORIGIN,
	DF_TRANSLATE_VIA_CENTER;

	public int getValue()
	{
		return this.ordinal();
	}

	public static df_translation_type forValue(int value)
	{
		return values()[value];
	}
}