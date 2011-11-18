package com.addiPlot;

import com.addiPlot.color.t_colorspec;

public class term_api {
	
	/* Constants that are interpreted by terminal driver routines */

	/* Default line type is LT_BLACK; reset to this after changing colors */
	public static int LT_AXIS = -1;
	public static int LT_BLACK = -2;
	public static int LT_NODRAW = -3;
	public static int LT_BACKGROUND = -4;
	public static int LT_UNDEFINED = -5;
	public static int LT_COLORFROMCOLUMN = -6;	/* Used by hidden3d code */
	public static int LT_DEFAULT = -7;

	/* Constant value passed to (term->text_angle)(ang) to generate vertical
	 * text corresponding to old keyword "rotate", which produced the equivalent
	 * of "rotate by 90 right-justified".
	 */
	public static int TEXT_VERTICAL = -270;

	/* Type definitions */

	/* this order means we can use  x-(just*strlen(text)*t->h_char)/2 if
	 * term cannot justify
	 */
	public enum JUSTIFY {
	    LEFT,
	    CENTRE,
	    RIGHT
	};

	/* we use a similar trick for vertical justification of multi-line labels */
	public enum VERT_JUSTIFY {
	    JUST_TOP,
	    JUST_CENTRE,
	    JUST_BOT
	};

	public class lp_style_type {	/* contains all Line and Point properties */
    	public int     pointflag;		/* 0 if points not used, otherwise 1 */
    	public int     l_type;
    	public int     p_type;
    	public int     p_interval;		/* Every Nth point in style LINESPOINTS */
    	public double  l_width;
    	public double  p_size;
    	public boolean use_palette;
    	public t_colorspec pm3d_color;
	};
	
	public static lp_style_type DEFAULT_LP_STYLE_TYPE;
	
	
	= {0, LT_BLACK, 0, 0, 1.0, PTSZ_DEFAULT, FALSE, DEFAULT_COLORSPEC};
	
	public enum t_fillstyle {
		FS_EMPTY (0),
		FS_SOLID (1), 
		FS_PATTERN (2),
		FS_DEFAULT (3),
		FS_TRANSPARENT_SOLID (4),
		FS_TRANSPARENT_PATTERN (5);
		
		public int value;
		t_fillstyle(int value) {
		   this.value = value;	
		}
	};
		   
	public static int FS_OPAQUE = (t_fillstyle.FS_SOLID.value + (100<<4));
	
	/* Color construction for an image, palette lookup or rgb components. */
	public enum t_imagecolor { IC_PALETTE, IC_RGB, IC_RGBA };
	
	/* Values for the flags field of TERMENTRY
	 */
	public static int TERM_CAN_MULTIPLOT = 1;  /* tested if stdout not redirected */
	public static int TERM_CANNOT_MULTIPLOT = 2;  /* tested if stdout is redirected  */
	public static int TERM_BINARY = 4;  /* open output file with "b"       */
	public static int TERM_INIT_ON_REPLOT = 8;  /* call term->init() on replot     */
	public static int TERM_IS_POSTSCRIPT = 16;  /* post, next, pslatex, etc        */
	public static int TERM_ENHANCED_TEXT = 32;  /* enhanced text mode is enabled   */
	public static int TERM_NO_OUTPUTFILE = 64;  /* terminal doesnt write to a file */
	public static int TERM_CAN_CLIP = 128;  /* terminal does its own clipping  */
	public static int TERM_CAN_DASH = 256;  /* terminal supports dashed lines  */
	public static int TERM_ALPHA_CHANNEL = 512;  /* alpha channel transparency      */
	public static int TERM_MONOCHROME = 1024;  /* term is running in mono mode    */
	public static int TERM_LINEWIDTH = 2048;  /* support for set term linewidth  */
	public static int TERM_FONTSCALE = 4096;  /* terminal supports fontscale     */
	public static int TERM_IS_LATEX = 8192;  /* text uses TeX markup            */

}