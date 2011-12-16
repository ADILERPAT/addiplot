package com.addiPlot.gnuplot;

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define DEFAULT_AXIS_TICDEF {TIC_COMPUTED, NULL, {TC_DEFAULT, 0, 0}, {NULL, {0,0}, FALSE}, { character, character, character, 0., 0., 0. }, FALSE }
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define DEFAULT_AXIS_ZEROAXIS {0, -3, 0, 1.0, 1.0, 0}

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define DEFAULT_AXIS_STRUCT { AUTOSCALE_BOTH, AUTOSCALE_BOTH, 0, FALSE, -10.0, 10.0, -10.0, 10.0, -10.0, 10.0, 0.0, 0.0, 0, 0, 0, 0, FALSE, 0.0, 0.0, 0, 1, DEF_FORMAT, TIMEFMT, NO_TICS, DEFAULT_AXIS_TICDEF, 0, FALSE, FALSE, MINI_DEFAULT, 10, 1.0, 0.5, TRUE, EMPTY_LABELSTRUCT, DEFAULT_AXIS_ZEROAXIS }

/* Table of default behaviours --- a subset of the struct above. Only
 * those fields are present that differ from axis to axis. */
public class axis_defaults
{
	public double min; // default axis endpoints
	public double max;
	public String name = new String(new char[4]); // axis name, like in "x2" or "t"
	public int ticmode; // tics on border/axis? mirrored?
}