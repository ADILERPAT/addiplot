package com.addiPlot.gnuplot;

public enum set_palette_id
{
	S_PALETTE_INVALID,
	S_PALETTE_POSITIVE,
	S_PALETTE_NEGATIVE,
	S_PALETTE_GRAY,
	S_PALETTE_COLOR,
	S_PALETTE_RGBFORMULAE,
	S_PALETTE_NOPS_ALLCF,
	S_PALETTE_PS_ALLCF,
	S_PALETTE_MAXCOLORS,
	S_PALETTE_DEFINED,
	S_PALETTE_FILE,
	S_PALETTE_FUNCTIONS,
	S_PALETTE_MODEL,
	S_PALETTE_GAMMA;

	public int getValue()
	{
		return this.ordinal();
	}

	public static set_palette_id forValue(int value)
	{
		return values()[value];
	}
}