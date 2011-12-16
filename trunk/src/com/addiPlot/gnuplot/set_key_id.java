package com.addiPlot.gnuplot;

public enum set_key_id
{
	S_KEY_INVALID,
	S_KEY_TOP,
	S_KEY_BOTTOM,
	S_KEY_LEFT,
	S_KEY_RIGHT,
	S_KEY_CENTER,
	S_KEY_VERTICAL,
	S_KEY_HORIZONTAL,
	S_KEY_OVER,
	S_KEY_UNDER,
	S_KEY_MANUAL,
	S_KEY_INSIDE,
	S_KEY_OUTSIDE,
	S_KEY_ABOVE,
	S_KEY_BELOW,
	S_KEY_TMARGIN,
	S_KEY_BMARGIN,
	S_KEY_LMARGIN,
	S_KEY_RMARGIN,
	S_KEY_LLEFT,
	S_KEY_RRIGHT,
	S_KEY_REVERSE,
	S_KEY_NOREVERSE,
	S_KEY_INVERT,
	S_KEY_NOINVERT,
	S_KEY_ENHANCED,
	S_KEY_NOENHANCED,
	S_KEY_BOX,
	S_KEY_NOBOX,
	S_KEY_SAMPLEN,
	S_KEY_SPACING,
	S_KEY_WIDTH,
	S_KEY_HEIGHT,
	S_KEY_TITLE,
	S_KEY_NOTITLE,
	S_KEY_FONT,
	S_KEY_TEXTCOLOR,
	S_KEY_AUTOTITLES,
	S_KEY_NOAUTOTITLES,
	S_KEY_DEFAULT,
	S_KEY_ON,
	S_KEY_OFF;

	public int getValue()
	{
		return this.ordinal();
	}

	public static set_key_id forValue(int value)
	{
		return values()[value];
	}
}