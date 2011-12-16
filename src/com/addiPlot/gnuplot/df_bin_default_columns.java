package com.addiPlot.gnuplot;

/* Not the most elegant way of defining the default columns, but I prefer
 * this to switch and conditional statements when there are so many styles.
 */
///#define LAST_PLOT_STYLE 27
public class df_bin_default_columns
{
	public PLOT_STYLE plot_style;
	public short excluding_gen_coords; // Number of columns of information excluding generated coordinates.
	public short dimen_in_2d; // Number of additional columns required (in 2D plot) if coordinates not generated.
}
/* Evaluate a tuple of up to specified dimension. */
///#define TUPLE_SEPARATOR_CHAR ":"
///#define LEFT_TUPLE_CHAR "("
///#define RIGHT_TUPLE_CHAR ")"
