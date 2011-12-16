package com.addiPlot.gnuplot;

/* NOTE TO THOSE WRITING FILE TYPE FUNCTIONS
 *
 * "cart" means Cartesian, i.e., the (x,y,z) [or (r,t,z)] coordinate
 * system of the plot.  "scan" refers to the scanning method of the
 * file in question, i.e., first points, then lines, then planes.
 * The important variables for a file type function to fill in are
 * those beginning with "scan".  There is a tricky set of rules
 * related to the "scan_cart" mapping, the file-specified variables,
 * the default variables, and the command-line variables.  Basically,
 * command line overrides data file which overrides default.  (Yes,
 * like a confusing version of rock, paper, scissors.) So, from the
 * file type function perspective, it is better to leave those
 * variables which are not specifically known from file data or
 * otherwise (e.g., sample periods "scan_delta") unaltered in case
 * the user has issued "set datafile" to define defaults.
 */
public class df_binary_file_record_struct
{
	public int[] cart_dim = new int[3]; // dimension array size, x/y/z
	public int[] cart_dir = new int[3]; // 1 scan in positive direction, -1 negative, x/y/z
	public double[] cart_delta = new double[3]; // spacing between array points, x/y/z
	public df_translation_type cart_trans; // translate via origin, center or default
	public double[] cart_cen_or_ori = new double[3]; // vector representing center or origin, x/y/z
	public double cart_alpha; // 2D rotation angle (rotate)
	public double[] cart_p = new double[3]; // 3D rotation normal vector (perpendicular)

	public df_sample_scan_type[] cart_scan = new df_sample_scan_type[3]; // how to assign the dimensions read from file when generating coordinates
	public boolean scan_generate_coord; // whether or not Gnuplot should generate coordinates.
	public int[] scan_skip = new int[3]; // skip bytes before the record, line, plane

	/* Not controllable by the user, only by file type functions.
	 * These are all points/lines/planes format.
	 */
	public int[] scan_dim = new int[3]; // number of points, lines, planes
	public int[] scan_dir = new int[3]; // 1 scan in positive direction wrt Cartesian coordinate system, -1 negative
	public double[] scan_delta = new double[3]; // sample period along points, lines, planes
	public df_translation_type scan_trans; // translate via origin, center or default
	public double[] scan_cen_or_ori = new double[3]; // vector representing center or origin, x/y/z

	/* *** Do not modify outside of datafile.c!!! *** */
	public String memory_data;
}