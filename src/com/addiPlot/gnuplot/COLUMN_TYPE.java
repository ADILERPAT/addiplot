package com.addiPlot.gnuplot;

/*}}} */

/*{{{  variables */

public enum COLUMN_TYPE
{
	CT_DEFAULT,
	CT_STRING,
	CT_KEYLABEL,
		CT_XTICLABEL,
		CT_X2TICLABEL,
		CT_YTICLABEL,
		CT_Y2TICLABEL,
		CT_ZTICLABEL,
		CT_CBTICLABEL;

	public int getValue()
	{
		return this.ordinal();
	}

	public static COLUMN_TYPE forValue(int value)
	{
		return values()[value];
	}
}