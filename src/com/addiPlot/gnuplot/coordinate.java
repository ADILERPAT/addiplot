package com.addiPlot.gnuplot;

/* These fields of 'struct coordinate' used for storing the color of 3D data
 * points (if requested by NEED_PALETTE(this_plot), for instance).
 */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define CRD_COLOR ylow
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define CRD_R yhigh
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define CRD_G xlow
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define CRD_B xhigh
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define CRD_A ylow
/* The field of 'struct coordinate' used for storing the point size in plot
 * style POINTSTYLE with variable point size
 */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define CRD_PTSIZE xlow


public class coordinate
{
	public coord_type type; // see above
	public double x;
	public double y;
	public double z;
	public double ylow; // ignored in 3d
	public double yhigh;
	public double xlow; // also ignored in 3d
	public double xhigh;
///#if 0
//// /* Currently color information is overloaded onto yhigh by the defintion
////  * of CRD_COLOR. This saves 8 bytes, but limits the use of variable color
////  * data to plot styles that do not already use the full set of coordinate
////  * fields (e.g. candlesticks, boxxyerror).
////  */
////    coordval color;		// PM3D's color value to be used 
//// /* Note: accessed only if NEED_PALETTE(this_plot) */
///#endif
///#if defined(WIN16) || (defined(MSDOS) && defined(__TURBOC__))
// /* FIXME HBB 20020301: addition of 'color' probably broke this */
//    char pad[2];		// pad to 32 byte boundary 
///#endif
}