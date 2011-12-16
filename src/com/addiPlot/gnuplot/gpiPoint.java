package com.addiPlot.gnuplot;

///#define TC_DEFAULT 0
///#define TC_LT 1
///#define TC_LINESTYLE 2
///#define TC_RGB 3
///#define TC_CB 4
///#define TC_FRAC 5
///#define TC_Z 6

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define DEFAULT_COLORSPEC {TC_DEFAULT, 0, 0.0}
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define BLACK_COLORSPEC {TC_LT, LT_BLACK, 0.0}

///#ifdef EXTENDED_COLOR_SPECS
//typedef struct {
//    double gray;
// /* to be extended */
//} colorspec_t;
///#endif

/* EAM July 2004 - Disentangle polygon support and PM3D support  */
/* a point (with integer coordinates) for use in polygon drawing */
public class gpiPoint
{
	public int x;
	public int y;
///#ifdef EXTENDED_COLOR_SPECS
//    double z;
//    colorspec_t spec;
///#endif
	public int style;
}