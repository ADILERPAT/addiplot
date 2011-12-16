package com.addiPlot.gnuplot;

 // contains all Arrow properties
/* Operations used by the terminal entry point term->layer(). */
public enum termlayer
{
	TERM_LAYER_RESET,
	TERM_LAYER_BACKTEXT,
	TERM_LAYER_FRONTTEXT,
	TERM_LAYER_BEGIN_GRID,
	TERM_LAYER_END_GRID,
	TERM_LAYER_END_TEXT,
	TERM_LAYER_BEFORE_PLOT,
	TERM_LAYER_AFTER_PLOT;

	public int getValue()
	{
		return this.ordinal();
	}

	public static termlayer forValue(int value)
	{
		return values()[value];
	}
}