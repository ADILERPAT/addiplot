package com.addiPlot.gnuplot;

/* EAM Feb 2003 - Move all global variables related to key into a */
/* single structure. Eventually this will allow multiple keys.    */

public enum keytitle_type
{
	NOAUTO_KEYTITLES,
	FILENAME_KEYTITLES,
	COLUMNHEAD_KEYTITLES;

	public int getValue()
	{
		return this.ordinal();
	}

	public static keytitle_type forValue(int value)
	{
		return values()[value];
	}
}