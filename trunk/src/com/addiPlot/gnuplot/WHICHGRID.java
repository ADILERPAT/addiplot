package com.addiPlot.gnuplot;

public enum WHICHGRID
{
	ALLGRID,
	FRONTGRID,
	BACKGRID,
	BORDERONLY;

	public int getValue()
	{
		return this.ordinal();
	}

	public static WHICHGRID forValue(int value)
	{
		return values()[value];
	}
}
/* map xmin | xmax to 0 | 1 and same for y
 * 0.1 avoids any rounding errors
 */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define MAP_HEIGHT_X(x) ( (int) (((x)-X_AXIS.min)/(X_AXIS.max-X_AXIS.min)+0.1) )
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define MAP_HEIGHT_Y(y) ( (int) (((y)-Y_AXIS.min)/(Y_AXIS.max-Y_AXIS.min)+0.1) )
