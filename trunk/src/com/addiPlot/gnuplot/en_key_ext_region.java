package com.addiPlot.gnuplot;

/* If exterior, there are 12 possible auto placements.  Since
   left/right/center with top/bottom/center can only define 9
   locations, further subdivide the exterior region into four
   subregions for which left/right/center (TMARGIN/BMARGIN)
   and top/bottom/center (LMARGIN/RMARGIN) creates 12 locations. */
public enum en_key_ext_region
{
	GPKEY_TMARGIN,
	GPKEY_BMARGIN,
	GPKEY_LMARGIN,
	GPKEY_RMARGIN;

	public int getValue()
	{
		return this.ordinal();
	}

	public static en_key_ext_region forValue(int value)
	{
		return values()[value];
	}
}