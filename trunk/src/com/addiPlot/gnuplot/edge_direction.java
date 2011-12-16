package com.addiPlot.gnuplot;

///#if HIDDEN3D_GRIDBOX
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define UINT_BITS (CHAR_BIT * sizeof(unsigned int))
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define COORD_TO_BITMASK(x,shift) (~0U << (unsigned int) ((((x) / surface_scale) + 1.0) / 2.0 * UINT_BITS + (shift)))
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define CALC_BITRANGE(range_min, range_max) ((~(~0U << (unsigned int) (((((range_max)) / surface_scale) + 1.0) / 2.0 * CHAR_BIT * sizeof(unsigned int) + (1)))) & (~0U << (unsigned int) ((((range_min) / surface_scale) + 1.0) / 2.0 * CHAR_BIT * sizeof(unsigned int) + (0))))
///#endif

/* Enumeration of possible types of line, for use with the
 * store_edge() function. Influences the position in the grid the
 * second vertex will be put to, relative to the one that is passed
 * in, as another argument to that function. edir_none is for
 * single-pixel 'blind' edges, which exist only to facilitate output
 * of 'points' style splots.
 *
 * Directions are interpreted in a pseudo-geographical coordinate
 * system of the data grid: within the isoline, we count from left to
 * right (west to east), and the isolines themselves are counted from
 * top to bottom, described as north and south. */
public enum edge_direction
{
	edir_west,
	edir_north,
	edir_NW,
	edir_NE,
	edir_impulse,
	edir_point,
	edir_vector;

	public int getValue()
	{
		return this.ordinal();
	}

	public static edge_direction forValue(int value)
	{
		return values()[value];
	}
}