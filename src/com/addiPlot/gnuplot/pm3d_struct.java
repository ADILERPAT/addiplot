package com.addiPlot.gnuplot;

/*
  structure defining all properties of pm3d plotting mode
  (except for the properties of the smooth color box, see color_box instead)
*/
public class pm3d_struct
{
  public String where = new String(new char[7]); // base, top, surface
  public byte flush; // left, right, center
  public byte ftriangles; // 0/1 (don't) draw flushing triangles
  public byte direction; // forward, backward
  public byte clip; // 1in, 4in
  public int hidden3d_tag; /* if this is > 0, pm3d hidden lines are drawn with
			   this linestyle (which must naturally present). */
  public PM3D_IMPL_MODE implicit;
			/* 1: [default] draw ALL surfaces with pm3d
			   0: only surfaces specified with 'with pm3d' */
  public PM3D_WHICH_CORNERS2COLOR which_corner_color;
			/* default: average color from all 4 points */
  public int interp_i; // # of interpolation steps along scanline
  public int interp_j; // # of interpolation steps between scanlines
}