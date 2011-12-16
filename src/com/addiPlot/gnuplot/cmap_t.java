package com.addiPlot.gnuplot;

///#endif

///#endif // USE_MOUSE 

///#ifdef __EMX__
// /* for gethostname ... */
///#include <netdb.h>
// /* for __XOS2RedirRoot */
///#include <X11/Xlibint.h>
///#endif


///#ifdef VMS
///#ifdef __DECC
///#include <starlet.h>
///#endif
///#define EXIT(status) sys$delprc(0, 0)	// VMS does not drop itself 
///#else // !VMS 
///#ifdef PIPE_IPC
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define EXIT(status) do { gp_exec_event(GE_pending, 0, 0, 0, 0, 0); close(1); close(0); exit(status); } while (0)
///#else
///#define EXIT(status) exit(status)
///#endif	// PIPE_IPC 
///#endif // !VMS 

///#ifdef OSK
///#define EINTR	E_ILLFNC
///#endif


///#define Ncolors 13

public class cmap_t
{
	public cmap_t prev_cmap; // Linked list pointers and number
	public cmap_t next_cmap;
	public Colormap colormap = new Colormap();
	public int[] colors = new int[DefineConstants.Ncolors]; // line colors as pixel values
	public int[] rgbcolors = new int[DefineConstants.Ncolors]; // line colors in rgb format
	public int xorpixel; // line colors
	public int total;
	public int allocated;
	public int byte_Renamed; // pm3d colors
}