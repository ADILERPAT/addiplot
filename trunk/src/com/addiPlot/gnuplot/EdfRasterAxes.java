package com.addiPlot.gnuplot;

/* Orientation of axes of the raster, as the binary matrix is saved in 
 * the file.
 */
public enum EdfRasterAxes
{
	EDF_RASTER_AXES_XrightYdown, // matricial format: rows, columns
	EDF_RASTER_AXES_XrightYup; // cartesian coordinate system
	/* other 6 combinations not available (not needed until now) */

	public int getValue()
	{
		return this.ordinal();
	}

	public static EdfRasterAxes forValue(int value)
	{
		return values()[value];
	}
}