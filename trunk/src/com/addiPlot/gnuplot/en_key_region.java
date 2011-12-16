package com.addiPlot.gnuplot;

/* The region, with respect to the border, key is located: (inside, outside) */
public enum en_key_region
{
	GPKEY_AUTO_INTERIOR_LRTBC, // Auto placement, left/right/top/bottom/center
	GPKEY_AUTO_EXTERIOR_LRTBC, // Auto placement, left/right/top/bottom/center
	GPKEY_AUTO_EXTERIOR_MARGIN, // Auto placement, margin plus lrc or tbc
	GPKEY_USER_PLACEMENT; // User specified placement

	public int getValue()
	{
		return this.ordinal();
	}

	public static en_key_region forValue(int value)
	{
		return values()[value];
	}
}