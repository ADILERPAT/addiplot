package com.addiPlot.gnuplot;

public class surface_points
{

	public surface_points next_sp; // pointer to next plot in linked list
	public int token; // last token used, for second parsing pass
	public PLOT_TYPE plot_type; // DATA2D? DATA3D? FUNC2D FUNC3D? NODATA?
	public PLOT_STYLE plot_style; // style set by "with" or by default
	public String title; // plot title, a.k.a. key entry
	public boolean title_no_enhanced; // don't typeset title in enhanced mode
	public boolean title_is_filename; // not used in 3D
	public boolean title_is_suppressed; // TRUE if 'notitle' was specified
	public boolean noautoscale; // ignore data from this plot during autoscaling
	public lp_style_type lp_properties = new lp_style_type();
	public arrow_style_type arrow_properties = new arrow_style_type();
	public fill_style_type fill_properties = new fill_style_type(); // FIXME: ignored in 3D
	public text_label labels; // Only used if plot_style == LABELPOINTS
	public t_image image_properties = new t_image(); // only used if plot_style is IMAGE or RGB_IMAGE

	/* 2D and 3D plot structure fields overlay only to this point */

	public boolean opt_out_of_hidden3d; // set by "nohidden" option to splot command
	public boolean opt_out_of_contours; // set by "nocontours" option to splot command
	public boolean opt_out_of_surface; // set by "nosurface" option to splot command
	public boolean pm3d_color_from_column;
	public int has_grid_topology;
	public int iteration; // needed for tracking iteration

	/* Data files only - num of isolines read from file. For functions,  */
	/* num_iso_read is the number of 'primary' isolines (in x direction) */
	public int num_iso_read;
	public gnuplot_contours contours; // NULL if not doing contours.
	public iso_curve iso_crvs; // the actual data
	public String pm3d_where = new String(new char[7]); // explicitly given base, top, surface

}