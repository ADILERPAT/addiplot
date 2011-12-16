package com.addiPlot.gnuplot;

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define MP_LAYOUT_DEFAULT { FALSE, 0, 0, FALSE, TRUE, 0, 0, 1, 1, 0, 0, 0,0,0,0, EMPTY_LABELSTRUCT, 0.0 }

//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass4:
public class AnonymousClass4
{
	public boolean auto_layout; // automatic layout if true
	public int num_rows; // number of rows in layout
	public int num_cols; // number of columns in layout
	public boolean row_major; // row major mode if true, column major else
	public boolean downwards; // prefer downwards or upwards direction
	public int act_row; // actual row in layout
	public int act_col; // actual column in layout
	public double xscale; // factor for horizontal scaling
	public double yscale; // factor for vertical scaling
	public double xoffset; // horizontal shift
	public double yoffset; // horizontal shift
	public double prev_xsize;
	public double prev_ysize;
	public double prev_xoffset;
	public double prev_yoffset;
			   /* values before 'set multiplot layout' */
	public text_label title = new text_label(); // goes above complete set of plots
	public double title_height; // fractional height reserved for title
}