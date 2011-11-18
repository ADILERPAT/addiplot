package com.addiPlot;

import java.io.File;

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
	//#define DEFAULT_LP_STYLE_TYPE {0, LT_BLACK, 0, 0, 1.0, PTSZ_DEFAULT, FALSE, DEFAULT_COLORSPEC}

	public enum t_arrow_head {
		NOHEAD (0),
		END_HEAD (1),
		BACKHEAD (2),
		BOTH_HEADS (3);

		public int value;
		t_arrow_head(int value) {
			this.value = value;	
		}
	};

	public static String[] arrow_head_names = new String[4];

	public class arrow_style_type {    /* contains all Arrow properties */
		int layer;	                     /* 0 = back, 1 = front */
		lp_style_type lp_properties;
		/* head options */
		t_arrow_head head;               /* arrow head choice */
		/* struct position headsize; */  /* x = length, y = angle [deg] */
		double head_length;              /* length of head, 0 = default */
		int head_lengthunit;             /* unit (x1, x2, screen, graph) */
		double head_angle;               /* front angle / deg */
		double head_backangle;           /* back angle / deg */
		int head_filled;        /* filled heads: 0=not, 1=empty, 2=filled */
		/* ... more to come ? */
	};

	/* Operations used by the terminal entry point term->layer(). */
	public enum t_termlayer {
		TERM_LAYER_RESET,
		TERM_LAYER_BACKTEXT,
		TERM_LAYER_FRONTTEXT,
		TERM_LAYER_BEGIN_GRID,
		TERM_LAYER_END_GRID,
		TERM_LAYER_END_TEXT,
		TERM_LAYER_BEFORE_PLOT,
		TERM_LAYER_AFTER_PLOT
	};

	public class fill_style_type {
		int fillstyle;
		int filldensity;
		int fillpattern;
		t_colorspec border_color;
	};

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

	/* Holder for various image properties */
	public class t_image {
		t_imagecolor type; /* See above */
		boolean fallback; /* true == don't use terminal-specific code */
	};

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

	public enum set_encoding_id {
		S_ENC_DEFAULT, S_ENC_ISO8859_1, S_ENC_ISO8859_2, S_ENC_ISO8859_9, S_ENC_ISO8859_15,
		S_ENC_CP437, S_ENC_CP850, S_ENC_CP852, S_ENC_CP950, 
		S_ENC_CP1250, S_ENC_CP1251, S_ENC_CP1254, 
		S_ENC_KOI8_R, S_ENC_KOI8_U,
		S_ENC_UTF8,
		S_ENC_INVALID
	};

	/* HBB 20020225: this stuff used to be in a separate header, ipc.h,
	 * but I strongly disliked the way that was done */

	/*
	 * There are the following types of interprocess communication from
	 * (gnupmdrv, gnuplot_x11) => gnuplot:
	 *	OS2_IPC  ... the OS/2 shared memory + event semaphores approach
	 *	PIPE_IPC ... communication by using bidirectional pipe
	 */

	/*
	 * OS2_IPC: gnuplot's terminals communicate with it by shared memory + event
	 * semaphores => the code in gpexecute.c is used, and nothing more from here.
	 */

	//#ifdef PIPE_IPC

	public enum PIPE_IPC { 
		IPC_BACK_UNUSABLE (-2), 
		IPC_BACK_CLOSED (-1);
		public int value;
		PIPE_IPC(int value) {
			this.value = value;	
		}
	};
	
	/*
	 * Currently only used for PIPE_IPC, but in principle
	 * every term could use this file descriptor to write back
	 * commands to gnuplot.  Note, that terminals using this fd
	 * should set it to a negative value when closing. (joze)
	 */
	/* HBB 20020225: currently not used anywhere outside term.c --> make
	 * it static */
	/* extern int ipc_back_fd; */

	//# endif /* PIPE_IPC */

	/* options handling */
	public enum options_handling { 
		UNSET (-1), 
		no (0),
		yes (1);
		public int value;
		options_handling(int value) {
			this.value = value;	
		}
	};

	/* Variables of term.c needed by other modules: */

	/* Options string of the currently used terminal driver */
	public static String term_options;
	/* access head length + angle without changing API */
	public static int curr_arrow_headlength;
	/* angle in degrees */
	public static double curr_arrow_headangle;
	public static double curr_arrow_headbackangle;
	/* arrow head filled or not */
	public static int curr_arrow_headfilled;

	/* Recycle count for user-defined linetypes */
	public static int linetype_recycle_count;

	/* Current 'output' file: name and open filehandle */
	public static String outstr;
	public static File gpoutfile;

	/* Output file where the PostScript output goes to.
		   In particular:
			gppsfile == gpoutfile
				for 'set term': postscript, pstex
			gppsfile == PSLATEX_auxfile
				for 'set term': pslatex
			gppsfile == 0
				for all other terminals
		   It is non-zero for for the family of postscript terminals, thus making
		   this a unique check for postscript output (pm3d has some code optimized
		   for PS, for instance).
	 */
	public static File gppsfile;
	public static String PS_psdir;

	public static boolean multiplot;

	/* 'set encoding' support: index of current encoding ... */
	public static set_encoding_id encoding;
	/* ... in table of encoding names: */
	public static String encoding_names[];
	/* parsing table for encodings */
	public static tables.gen_table set_encoding_tbl[];

	/* mouse module needs this */
	public static boolean term_initialised;

	/* Support for enhanced text mode. */
	public static char enhanced_text[];
	public static String enhanced_cur_text;
	public static double enhanced_fontscale;
	/* give array size to allow the use of sizeof */
	public static char[] enhanced_escape_format = new char[16];
	public static boolean ignore_enhanced_text;


	/* Prototypes of functions exported by term.c */
	public static void term_set_output (String a) {
		//CCX
	}
	public static void term_initialise () {
		//CCX
	}
	public static void term_start_plot () {
		//CCx
	}
	public static void term_end_plot () {
		//CCX
	}
	public static void term_start_multiplot () {
		//CCX
	}
	public static void term_end_multiplot () {
		//CCX
	}
	/* void term_suspend __PROTO((void)); */
	public static void term_reset () {
		//CCX
	}
	public static void term_apply_lp_properties (lp_style_type lp) {
		//CCX
	}
	public static void term_check_multiplot_okay (boolean a) {
		//CCX
	}

	public static void write_multiline (int a, int b, String c, JUSTIFY d, VERT_JUSTIFY e, int f, String g) {
		//CCX
	}
	public static int estimate_strlen (String a) {
		//CCX
		return 0;
	}

	public static void list_terms () {
		//CCX
	}
	public static String get_terminals_names () {
		//CCX
		return "";
	}
	//public static struct termentry *set_term __PROTO((void));
	public static void init_terminal () {
		//CCX
	}
	public static void test_term () {
		//CCX
	}

	/* Support for enhanced text mode. */
	public static String enhanced_recursion (String p, boolean brace,
			String fontname, double fontsize,
			double base, boolean widthflag,
			boolean showflag, int overprint) {
		//CCX
		return "";
	}
	public static void enh_err_check (String str) {
		//CCX
	}
	/* note: c is char, but must be declared int due to K&R compatibility. */
	public static void do_enh_writec (int c) {
		//CCX
	}
	/* flag: don't use enhanced output methods --- for output of
	 * filenames, which usually looks bad using subscripts */
	public static void ignore_enhanced (boolean flag) {
		//CCX
	}

	/* Simple-minded test that point is with drawable area */
	public static boolean on_page (int x, int y) {
		//CCX
		return false;
	}

	/* Convert a fill style into a backwards compatible packed form */
	public static int style_from_fill (fill_style_type a) {
		//CCX
		return 0;
	}

	//#ifdef EAM_OBJECTS
	/* Terminal-independent routine to draw a circle or arc */
	public static void do_arc (int cx, int cy, double radius,
			double arc_start, double arc_end, int style) {
		//CCX
	}
	//#endif

	//#ifdef LINUXVGA
	//void LINUX_setup __PROTO((void));
	//#endif

	//#ifdef PC
	//void PC_setup __PROTO((void));
	//#endif

	//#ifdef VMS
	//void vms_reset();
	//#endif

	//#ifdef OS2
	//int PM_pause __PROTO((char *));
	//void PM_intc_cleanup __PROTO((void));
	//# ifdef USE_MOUSE
	//void PM_update_menu_items __PROTO((void));
	//void PM_set_gpPMmenu __PROTO((struct t_gpPMmenu * gpPMmenu));
	//# endif
	//#endif

	public static void lp_use_properties (lp_style_type lp, int tag) {
		//CCX
	}
	public static void load_linetype (lp_style_type lp, int tag) {
		//CCX;
	}

	/* Wrappers for term->path() */
	public static void newpath() {
		//CCX
	}
	public static void closepath() {
		//CCX
	}

}