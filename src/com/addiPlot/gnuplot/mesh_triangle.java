package com.addiPlot.gnuplot;

/* One triangle of the surface mesh(es). */
///#define POLY_NVERT 3
public class mesh_triangle
{
	public int[] vertex = new int[DefineConstants.POLY_NVERT]; // The vertices (indices on vlist)
	/* min/max in all three directions */
	public double xmin;
	public double xmax;
	public double ymin;
	public double ymax;
	public double zmin;
	public double zmax;
	public double[] plane = new double[4]; // the plane coefficients
	public boolean frontfacing; // is polygon facing front- or backwards?
///#if ! HIDDEN3D_QUADTREE
//    long next;			// index of next polygon in z-sorted list 
///#endif
///#if HIDDEN3D_GRIDBOX
	public int xbits; // x coverage mask of bounding box
	public int ybits; // y coverage mask of bounding box
///#endif
}