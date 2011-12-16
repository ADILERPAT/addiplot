package com.addiPlot.gnuplot;

///#if HIDDEN3D_QUADTREE
/* HBB 20000716: spatially oriented hierarchical data structure to
 * store polygons in. For now, it's a simple xy grid of z-sorted
 * lists. A single polygon can appear in several lists, if it spans
 * cell borders */
public class qtreelist
{
	public int p; // the polygon
	public int next; // next element in this chain
}
///#endif // HIDDEN3D_QUADTREE

/* Emacs editing help for HBB:
 * Local Variables: ***
 * c-basic-offset: 4 ***
 * End: ***
 */
