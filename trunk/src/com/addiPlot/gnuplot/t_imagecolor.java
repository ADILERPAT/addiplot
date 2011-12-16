package com.addiPlot.gnuplot;

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define FS_OPAQUE (FS_SOLID + (100<<4))

/* Color construction for an image, palette lookup or rgb components. */
public enum t_imagecolor
{
	IC_PALETTE,
	IC_RGB,
	IC_RGBA;

	public int getValue()
	{
		return this.ordinal();
	}

	public static t_imagecolor forValue(int value)
	{
		return values()[value];
	}
}