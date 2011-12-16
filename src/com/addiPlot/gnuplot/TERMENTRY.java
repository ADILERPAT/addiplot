package com.addiPlot.gnuplot;

/* values for the optional flags field - choose sensible defaults
 * these aren't really very sensible names - multiplot attributes
 * depend on whether stdout is redirected or not. Remember that
 * the default is 0. Thus most drivers can do multiplot only if
 * the output is redirected
 */
///#define TERM_CAN_MULTIPLOT 1
///#define TERM_CANNOT_MULTIPLOT 2
///#define TERM_BINARY 4
///#define TERM_INIT_ON_REPLOT 8
///#define TERM_IS_POSTSCRIPT 16
///#define TERM_ENHANCED_TEXT 32
///#define TERM_NO_OUTPUTFILE 64
///#define TERM_CAN_CLIP 128
///#define TERM_CAN_DASH 256
///#define TERM_ALPHA_CHANNEL 512
///#define TERM_MONOCHROME 1024
///#define TERM_LINEWIDTH 2048

/* The terminal interface structure --- heart of the terminal layer.
 *
 * It should go without saying that additional entries may be made
 * only at the end of this structure. Any fields added must be
 * optional - a value of 0 (or NULL pointer) means an older driver
 * does not support that feature - gnuplot must still be able to
 * function without that terminal feature
 */

public class TERMENTRY
{
	public String name;
///#ifdef WIN16
//    const char GPFAR description[80];  // to make text go in FAR segment 
///#else
	public String description;
///#endif
	public int xmax;
	public int ymax;
	public int v_char;
	public int h_char;
	public int v_tic;
	public int h_tic;

//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*options)();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*init)();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*reset)();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*text)();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	int(*scale)(double, double);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*graphics)();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*move)(int, int);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*vector)(int, int);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*linetype)(int);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*put_text)(int, int, String);
	/* the following are optional. set term ensures they are not NULL */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	int(*text_angle)(int);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	int(*justify_text)(enum JUSTIFY);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*point)(int, int, int);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*arrow)(int, int, int, int, int);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	int(*set_font)(String font);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*pointsize)(double);
	public int flags;
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*suspend)();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*resume)();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*fillbox)(int, int, int, int, int);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*linewidth)(double linewidth);
///#ifdef USE_MOUSE
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	int(*waitforinput)();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*put_tmptext)(int, const sbyte []);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*set_ruler)(int, int);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*set_cursor)(int, int, int);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*set_clipboard)(const sbyte[]);
///#endif
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	int(*make_palette)(t_sm_palette *palette);
	/* 1. if palette==NULL, then return nice/suitable
	   maximal number of colours supported by this terminal.
	   Returns 0 if it can make colours without palette (like
	   postscript).
	   2. if palette!=NULL, then allocate its own palette
	   return value is undefined
	   3. available: some negative values of max_colors for whatever
	   can be useful
	 */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*previous_palette)();
	/* release the palette that the above routine allocated and get
	   back the palette that was active before.
	   Some terminals, like displays, may draw parts of the figure
	   using their own palette. Those terminals that possess only
	   one palette for the whole plot don't need this routine.
	 */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*set_color)(t_colorspec *);
	/* EAM November 2004 - revised to take a pointer to struct rgb_color,
	   so that a palette gray value is not the only option for
	   specifying color.
	 */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*filled_polygon)(int points, gpiPoint *corners);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*image)(int, int, double *, gpiPoint *, t_imagecolor);

/* Enhanced text mode driver call-backs */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*enhanced_open)(sbyte * fontname, double fontsize, double base, boolean widthflag, boolean showflag, int overprint);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*enhanced_flush)();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*enhanced_writec)(int c);

/* Driver-specific synchronization or other layering commands.
 * Introduced as an alternative to the ugly sight of
 * driver-specific code strewn about in the core routines.
 * As of this point (July 2005) used only by pslatex.trm
 */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*layer)(termlayer);

/* Begin/End path control. 
 * Needed by PostScript-like devices in order to join the endpoints of
 * a polygon cleanly.
 */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	void(*path)(int p);

/* Scale factor for converting terminal coordinates to output
 * pixel coordinates.  Used to provide data for external mousing code.
 */
	public double tscale;

}