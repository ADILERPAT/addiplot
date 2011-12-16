package com.addiPlot.gnuplot;

/* FIXME HBB 2000052: yet another local copy of 'epsilon'. Why? */
///#define EPSILON 1e-5

///#define FALSE 0

///#define MAX_POINTS_PER_CNTR 100

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define SQR(x) ((x) * (x))

public class edge_struct
{
	public poly_struct[] poly = new poly_struct[2]; // Each edge belongs to up to 2 polygons
	public coordinate[] vertex = new coordinate[2]; // The two extreme points of this edge.
	public edge_struct next; // To chain lists
	public boolean is_active; // is edge is 'active' at certain Z level?
	public en_edge_position position; // position of edge in mesh
}