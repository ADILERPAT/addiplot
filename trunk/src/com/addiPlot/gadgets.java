package com.addiPlot;

import java.io.File;

import com.addiPlot.color.t_colorspec;
import com.addiPlot.term_api.lp_style_type;

public class gadgets {
	
	/* Types and variables concerning graphical plot elements that are not
	 * *terminal-specific, are used by both* 2D and 3D plots, and are not
	 * *assignable to any particular * axis. I.e. they belong to neither
	 * *term_api, graphics, graph3d, nor * axis .h files.
	 */

	/* #if... / #include / #define collection: */

	/* Default point size is taken from the global "pointsize" variable */
	public static int PTSZ_DEFAULT = -2;
	public static int PTSZ_VARIABLE = -3;

	/* Type definitions */
	
	/* Coordinate system specifications: x1/y1, x2/y2, graph-box relative
	 * or screen relative coordinate systems */
	public enum position_type {
	    first_axes,
	    second_axes,
	    graph,
	    screen,
	    character
	};
	
	/* A full 3D position, with all 3 coordinates of possible using different axes.
	 * Used for 'set label', 'set arrow' positions and various offsets.
	 */
	public class t_position {
	    public position_type scalex;
	    public position_type scaley;
	    public position_type scalez;
	    public double x;
	    public double y;
	    public double z;
	};
	
	/* Linked list of structures storing 'set label' information */
	public class text_label {
	    public int tag;			/* identifies the label */
	    public t_position place;
	    public int rotate;
	    public int layer;
	    public String text;
	    public String font;		/* Entry font added by DJL */
	    public t_colorspec textcolor;
	    public lp_style_type lp_properties;
	    public t_position offset;
	    public boolean noenhanced;
	};
	
	/* This is the default state for the axis, timestamp, and plot title labels
	 * indicated by tag = -2 */
	//CCX
	//#define EMPTY_LABELSTRUCT \
	//    {NULL, -2, {character, character, character, 0.0, 0.0, 0.0}, CENTRE, 0, 0, \
	//     NULL, NULL, {TC_LT, -2, 0.0}, DEFAULT_LP_STYLE_TYPE, \
	//     {character, character, character, 0.0, 0.0, 0.0}, FALSE }
	
	/* Datastructure for implementing 'set arrow' */
	public class arrow_def {
	    //CCX struct arrow_def *next;	/* pointer to next arrow in linked list */
	    int tag;			/* identifies the arrow */
	    t_position start;
	    t_position end;
	    boolean relative;		/* second coordinate is relative to first */
	    term_api.arrow_style_type arrow_properties;
	};

	//#ifdef EAM_OBJECTS
	/* The object types supported so far are OBJ_RECTANGLE, OBJ_CIRCLE, and OBJ_ELLIPSE */
	public class t_rectangle {
	    int type;			/* 0 = corners;  1 = center + size */
	    t_position center;		/* center */
	    t_position extent;		/* width and height */
	    t_position bl;		/* bottom left */
	    t_position tr;		/* top right */
	};

	public static double DEFAULT_RADIUS = -1.0;
	public static double DEFAULT_ELLIPSE = -2.0;
	public class t_circle {
	    int type;			/* not used */
	    t_position center;		/* center */
	    t_position extent;		/* radius */
	    double arc_begin;
	    double arc_end;
	};

	public static int ELLIPSEAXES_XY = 0;
	public static int ELLIPSEAXES_XX = 1;
	public static int ELLIPSEAXES_YY = 2;
	public class t_ellipse {
	    int type;			/* mapping of axes: ELLIPSEAXES_XY, ELLIPSEAXES_XX or ELLIPSEAXES_YY */
	    t_position center;		/* center */
	    t_position extent;		/* major and minor axes */
	    double orientation;		/* angle of first axis to horizontal */
	};

	public class t_polygon {
	    int	type;			/* Number of vertices */
	    t_position[] vertex;		/* Array of vertices */
	};
	
	/* Datastructure for 'set object' */
	public class t_object {
	    //CCX struct object *next;
	    int tag;
	    int layer;			/* behind or back or front */
	    int object_type;		/* OBJ_RECTANGLE */
	    term_api.fill_style_type fillstyle;
	    term_api.lp_style_type lp_properties;
	    t_rectangle rectangle; 
	    t_circle circle; 
	    t_ellipse ellipse; 
	    t_polygon polygon;
	};
	public static int OBJ_RECTANGLE = 1;
	public static int OBJ_CIRCLE = 2;
	public static int OBJ_ELLIPSE = 3;
	public static int OBJ_POLYGON = 4;
	
	/* Datastructure implementing 'set style line' */
	public class linestyle_def {
	    //CCX struct linestyle_def *next;	/* pointer to next linestyle in linked list */
	    int tag;			/* identifies the linestyle */
	    term_api.lp_style_type lp_properties;
	};

	/* Datastructure implementing 'set style arrow' */
	public class arrowstyle_def {
	    //CCX struct arrowstyle_def *next;/* pointer to next arrowstyle in linked list */
	    int tag;			/* identifies the arrowstyle */
	    term_api.arrow_style_type arrow_properties;
	};
		
	/* The stacking direction of the key box: (vertical, horizontal) */
	public enum en_key_stack_direction {
	    GPKEY_VERTICAL,
	    GPKEY_HORIZONTAL
	};
	
	/* The region, with respect to the border, key is located: (inside, outside) */
	public enum en_key_region {
	    GPKEY_AUTO_INTERIOR_LRTBC,   /* Auto placement, left/right/top/bottom/center */
	    GPKEY_AUTO_EXTERIOR_LRTBC,   /* Auto placement, left/right/top/bottom/center */
	    GPKEY_AUTO_EXTERIOR_MARGIN,  /* Auto placement, margin plus lrc or tbc */
	    GPKEY_USER_PLACEMENT         /* User specified placement */
	};
	/* If exterior, there are 12 possible auto placements.  Since
	   left/right/center with top/bottom/center can only define 9
	   locations, further subdivide the exterior region into four
	   subregions for which left/right/center (TMARGIN/BMARGIN)
	   and top/bottom/center (LMARGIN/RMARGIN) creates 12 locations. */
	public enum en_key_ext_region {
	    GPKEY_TMARGIN,
	    GPKEY_BMARGIN,
	    GPKEY_LMARGIN,
	    GPKEY_RMARGIN
	};
	
	/* Key sample to the left or the right of the plot title? */
	public enum en_key_sample_positioning {
	    GPKEY_LEFT,
	    GPKEY_RIGHT
	};
	
	 public class filledcurves_opts {
	    int opt_given; /* option given / not given (otherwise default) */
	    int closeto;   /* from list FILLEDCURVES_CLOSED, ... */
	    double at;	   /* value for FILLEDCURVES_AT... */
	    double aty;	   /* the other value for FILLEDCURVES_ATXY */
	    int oneside;   /* -1 if fill below bound only; +1 if fill above bound only */
	};
	//CCX #define EMPTY_FILLEDCURVES_OPTS { 0, 0, 0.0, 0.0, 0 }
	
	public class histogram_style {
	    int type;		/* enum t_histogram_type */
	    int gap;		/* set style hist gap <n> (space between clusters) */
	    int clustersize;	/* number of datasets in this histogram */
	    double start;	/* X-coord of first histogram entry */
	    double end;		/* X-coord of last histogram entry */
	    int startcolor;	/* LT_UNDEFINED or explicit color for first entry */
	    int startpattern;	/* LT_UNDEFINED or explicit pattern for first entry */
	    double bar_lw;	/* linewidth for error bars */
	    //CCX struct histogram_style *next;
	    text_label title;
	};
	
	public enum t_histogram_type {
		HT_NONE,
		HT_STACKED_IN_LAYERS,
		HT_STACKED_IN_TOWERS,
		HT_CLUSTERED,
		HT_ERRORBARS
	}
	//CCX #define DEFAULT_HISTOGRAM_STYLE { HT_NONE, 2, 1, 0.0, 0.0, LT_UNDEFINED, LT_UNDEFINED, 0, NULL, EMPTY_LABELSTRUCT }

	public class boxplot_style {
	    int limit_type;	/* 0 = multiple of interquartile 1 = fraction of points */
	    double limit_value;
	    boolean outliers;
	    int pointtype;
	    int plotstyle;	/* CANDLESTICKS or FINANCEBARS */
	};
	public static boxplot_style boxplot_opts;
	//CCX #define DEFAULT_BOXPLOT_STYLE { 0, 1.5, TRUE, 6, CANDLESTICKS }
	
	/***********************************************************/
	/* Variables defined by gadgets.c needed by other modules. */
	/***********************************************************/
	
	/* bounding box position, in terminal coordinates */
	public class BoundingBox {
	    int xleft;
	    int xright;
	    int ybot;
	    int ytop;
	};
	
	/* EAM Feb 2003 - Move all global variables related to key into a */
	/* single structure. Eventually this will allow multiple keys.    */
	public enum keytitle_type {
	    NOAUTO_KEYTITLES, FILENAME_KEYTITLES, COLUMNHEAD_KEYTITLES
	};

	public class legend_key {
	    boolean visible;		/* Do we show this key at all? */
	    en_key_region region;	/* if so: where? */
	    en_key_ext_region margin;	/* if exterior: where outside? */
	    t_position user_pos;	/* if user specified position, this is it */
	    term_api.VERT_JUSTIFY vpos;		/* otherwise these guide auto-positioning */
	    term_api.JUSTIFY hpos;
	    en_key_sample_positioning just;
	    en_key_stack_direction stack_dir;
	    double swidth;		/* 'width' of the linestyle sample line in the key */
	    double vert_factor;		/* user specified vertical spacing multiplier */
	    double width_fix;		/* user specified additional (+/-) width of key titles */
	    double height_fix;
	    keytitle_type auto_titles;	/* auto title curves unless plotted 'with notitle' */
	    boolean front;		/* draw key in a second pass after the rest of the graph */
	    boolean reverse;		/* key back to front */
	    boolean invert;		/* key top to bottom */
	    boolean enhanced;		/* enable/disable enhanced text of key titles */
	    term_api.lp_style_type box;	/* linetype of box around key:  */
	    String title;	/* title line for the key as a whole */
	    String font;			/* Will be used for both key title and plot titles */
	    color.t_colorspec textcolor;	/* Will be used for both key title and plot titles */
	    BoundingBox bounds;
	    int maxcols;		/* maximum no of columns for horizontal keys */
	    int maxrows;		/* maximum no of rows for vertical keys */
	};
	
	public static legend_key keyT;

	//CCX # define DEFAULT_KEYBOX_LP { 0, LT_NODRAW, 0, 1.0, 1.0, 0 }

	//CCX #define DEFAULT_KEY_POSITION { graph, graph, graph, 0.9, 0.9, 0. }

	//CCX #define DEFAULT_KEY_PROPS \
	//		{ TRUE, \
	//		GPKEY_AUTO_INTERIOR_LRTBC, GPKEY_RMARGIN, \
	//		DEFAULT_KEY_POSITION, \
	//		JUST_TOP, RIGHT, \
	//		GPKEY_RIGHT, GPKEY_VERTICAL, \
	//		4.0, 1.0, 0.0, 0.0, \
	//		FILENAME_KEYTITLES, \
	//		FALSE, FALSE, FALSE, TRUE, \
	//		DEFAULT_KEYBOX_LP, \
	//		"", \
	//		NULL, {TC_LT, LT_BLACK, 0.0} }

	/*
	 * EAM Jan 2006 - Move colorbox structure definition to here from color.h
	 * in order to be able to use struct position
	 */

	public static char SMCOLOR_BOX_NO = 'n';
	public static char SMCOLOR_BOX_DEFAULT = 'd';
	public static char SMCOLOR_BOX_USER = 'u';

	public class color_box_struct{
	  char where;
	    /* where
		SMCOLOR_BOX_NO .. do not draw the colour box
		SMCOLOR_BOX_DEFAULT .. draw it at default position and size
		SMCOLOR_BOX_USER .. draw it at the position given by user
	    */
	  char rotation; /* 'v' or 'h' vertical or horizontal box */
	  char border; /* if non-null, a border will be drawn around the box (default) */
	  int border_lt_tag;
	  int layer; /* front or back */
	  int xoffset;	/* To adjust left or right, e.g. for y2tics */
	  t_position origin;
	  t_position size;
	  BoundingBox bounds;
	};

	public static color_box_struct color_box;
	public static color_box_struct default_color_box;

	public static BoundingBox plot_bounds;	/* Plot Boundary */
	public static BoundingBox canvas; 	/* Writable area on terminal */
	public static BoundingBox clip_area; /* Current clipping box */  
	
	public static float xsize;		/* x scale factor for size */
	public static float ysize;		/* y scale factor for size */
	public static float zsize;		/* z scale factor for size */
	public static float xoffset;		/* x origin setting */
	public static float yoffset;		/* y origin setting */
	public static float aspect_ratio;	/* 1.0 for square */
	public static int aspect_ratio_3D;	/* 2 for equal scaling of x and y; 3 for z also */

	/* plot border autosizing overrides, in characters (-1: autosize) */
	public static t_position lmargin, bmargin, rmargin, tmargin;
	//CCX #define DEFAULT_MARGIN_POSITION {character, character, character, -1, -1, -1}

	public static File table_outfile;
	public static boolean table_mode;

	public static arrow_def first_arrow;

	public static text_label first_label;

	public static linestyle_def first_linestyle;
	public static linestyle_def first_perm_linestyle;

	public static arrowstyle_def first_arrowstyle;

	//#ifdef EAM_OBJECTS
	public static t_object first_object;
	//#endif

	public static text_label title;

	public static text_label timelabel;
	//CCX #ifndef DEFAULT_TIMESTAMP_FORMAT
	/* asctime() format */
	//# define DEFAULT_TIMESTAMP_FORMAT "%a %b %d %H:%M:%S %Y"
	//#endif
	public static int timelabel_rotate;
	public static int timelabel_bottom;

	public static boolean polar;

	public static double ZERO = 1e-8;		/* default for 'zero' set option */
	public static double zero;		/* zero threshold, not 0! */

	public static double pointsize;

	public static int SOUTH	= 1; /* 0th bit */
	public static int WEST = 2; /* 1th bit */
	public static int NORTH = 4; /* 2th bit */
	public static int EAST = 8; /* 3th bit */
	//CCX public static int border_east	(draw_border & EAST)
	//public static int border_west	(draw_border & WEST)
	//public static int border_south	(draw_border & SOUTH)
	//public static int border_north	(draw_border & NORTH)
	//#define border_complete	((draw_border & 15) == 15)
	public static int draw_border;
	public static int user_border;
	public static int border_layer;

	public static lp_style_type border_lp;
	public static lp_style_type background_lp;
	public static lp_style_type default_border_lp;

	public static boolean clip_lines1;
	public static boolean clip_lines2;
	public static boolean clip_points;

	public static int SAMPLES = 100; /* default number of samples for a plot */
	public static int samples_1;
	public static int samples_2;

	public static double ang2rad; /* 1 or pi/180 */

	public static gp_types.PLOT_STYLE data_style;
	public static gp_types.PLOT_STYLE func_style;

	public static boolean parametric;

	/* If last plot was a 3d one. */
	public static boolean is_3d_plot;

	/* A macro to check whether 2D functionality is allowed in the last plot:
	   either the plot is a 2D plot, or it is a suitably oriented 3D plot (e.g. map).
	*/
	//CCX #define ALMOST2D      \
	//    ( !is_3d_plot ||  \
	//      ( fabs(fmod(surface_rot_z,90.0))<0.1  \
	//        && fabs(fmod(surface_rot_x,180.0))<0.1 ) )

	//CCX #ifdef VOLATILE_REFRESH
	public static int refresh_ok;		/* 0 = no;  2 = 2D ok;  3 = 3D ok */
	public static int refresh_nplots;
	//#else
	//#define refresh_ok FALSE
	//#endif
	//extern TBOOLEAN volatile_data;

	/* WINDOWID to be filled by terminals running on X11 (x11, wxt, qt, ...) */
	public static int current_x11_windowid;

	/* Plot layer definitions are collected here. */
	/* Someday they might actually be used.       */
	public static int LAYER_BEHIND = -1;
	public static int LAYER_BACK = 0;
	public static int LAYER_FRONT = 1;
	public static int LAYER_PLOTLABELS = 99;
	
	/*****************************************************************/
	/* Routines that deal with global objects defined in this module */
	/*****************************************************************/

	/* Clipping to the bounding box: */

	/* Test a single point to be within the BoundingBox.
	 * Sets the returned integers 4 l.s.b. as follows:
	 * bit 0 if to the left of xleft.
	 * bit 1 if to the right of xright.
	 * bit 2 if below of ybot.
	 * bit 3 if above of ytop.
	 * 0 is returned if inside.
	 */
	static int
	clip_point(int x, int y)
	{
	    int ret_val = 0;

	    if (x < clip_area.xleft)
		ret_val |= 0x01;
	    if (x > clip_area.xright)
		ret_val |= 0x02;
	    if (y < clip_area.ybot)
		ret_val |= 0x04;
	    if (y > clip_area.ytop)
		ret_val |= 0x08;

	    return ret_val;
	}
	
	/* Clip the given line to drawing coords defined by BoundingBox.
	 *   This routine uses the cohen & sutherland bit mapping for fast clipping -
	 * see "Principles of Interactive Computer Graphics" Newman & Sproull page 65.
	 */
	public static void
	draw_clip_line(int x1, int y1, int x2, int y2)
	{
		int temp_x1[] = new int[0];
		int temp_y1[] = new int[0];
		int temp_x2[] = new int[0];
		int temp_y2[] = new int[0];
	    
	    /* HBB 20000522: I've made this routine use the clippling in
	     * clip_line(), in a movement to reduce code duplication. There
	     * was one very small difference between these two routines. See
	     * clip_line() for a comment about it, at the relevant place. */
		temp_x1[0] = x1;
		temp_y1[0] = y1;
		temp_x2[0] = x2;
		temp_y2[0] = y2;
	    if (clip_line(temp_x1, temp_y1, temp_x2, temp_y2) == 0)
		/* clip_line() returns zero --> segment completely outside
		 * bounding box */
		return;
	    
	    x1=temp_x1[0];
		y1=temp_y1[0];
		x2=temp_x2[0];
		y2=temp_y2[0];

	    term.move(x1, y1);
	    term.vector(x2, y2);
	}
	
	/* Clip the given line to drawing coords defined by BoundingBox.
	 *   This routine uses the cohen & sutherland bit mapping for fast clipping -
	 * see "Principles of Interactive Computer Graphics" Newman & Sproull page 65.
	 * Return 0: entire line segment is outside bounding box
	 *        1: entire line segment is inside bounding box
	 *       -1: line segment has been clipped to bounding box
	 */
	static int
	clip_line(int x1[], int y1[], int x2[], int y2[])
	{
	    int x, y, dx, dy, count, pos1, pos2;
	    int x_intr[] = new int[4];
	    int y_intr[] = new int[4];
	    int x_max, x_min, y_max, y_min;
	    pos1 = clip_point(x1[0], y1[0]);
	    pos2 = clip_point(x2[0], y2[0]);
	    if ((pos1==0) && (pos2==0))
		return 1;		/* segment is totally in */
	    if ((pos1 & pos2) != 0)
		return 0;		/* segment is totally out. */
	    /* Here part of the segment MAY be inside. test the intersection
	     * of this segment with the 4 boundaries for hopefully 2 intersections
	     * in. If none are found segment is totaly out.
	     * Under rare circumstances there may be up to 4 intersections (e.g.
	     * when the line passes directly through at least one corner). In
	     * this case it is sufficient to take any 2 intersections (e.g. the
	     * first two found).
	     */
	    count = 0;
	    dx = x2[0] - x1[0];
	    dy = y2[0] - y1[0];
	    /* Find intersections with the x parallel bbox lines: */
	    if (dy != 0) {
		x = (clip_area.ybot - y2[0]) * dx / dy + x2[0];	/* Test for clip_area->ybot boundary. */
		if (x >= clip_area.xleft && x <= clip_area.xright) {
		    x_intr[count] = x;
		    y_intr[count++] = clip_area.ybot;
		}
		x = (clip_area.ytop - y2[0]) * dx / dy + x2[0];	/* Test for clip_area->ytop boundary. */
		if (x >= clip_area.xleft && x <= clip_area.xright) {
		    x_intr[count] = x;
		    y_intr[count++] = clip_area.ytop;
		}
	    }
	    /* Find intersections with the y parallel bbox lines: */
	    if (dx != 0) {
		y = (clip_area.xleft - x2[0]) * dy / dx + y2[0];	/* Test for clip_area->xleft boundary. */
		if (y >= clip_area.ybot && y <= clip_area.ytop) {
		    x_intr[count] = clip_area.xleft;
		    y_intr[count++] = y;
		}
		y = (clip_area.xright - x2[0]) * dy / dx + y2[0];	/* Test for clip_area->xright boundary. */
		if (y >= clip_area.ybot && y <= clip_area.ytop) {
		    x_intr[count] = clip_area.xright;
		    y_intr[count++] = y;
		}
	    }
	    if (count < 2)
		return 0;

	    if (x1[0] < x2[0]) {
		x_min = x1[0];
		x_max = x2[0];
	    } else {
		x_min = x2[0];
		x_max = x1[0];
	    }
	    if (y1[0] < y2[0]) {
		y_min = y1[0];
		y_max = y2[0];
	    } else {
		y_min = y2[0];
		y_max = y1[0];
	    }

	    if ((pos1 != 0) && (pos2 != 0)) {		/* Both were out - update both */
		/* EAM Sep 2008 - preserve direction of line segment */
		if ((dx*(x_intr[1]-x_intr[0]) < 0)
		||  (dy*(y_intr[1]-y_intr[0]) < 0)) {
		    x1[0] = x_intr[1];
		    y1[0] = y_intr[1];
		    x2[0] = x_intr[0];
		    y2[0] = y_intr[0];
		} else {
		    x1[0] = x_intr[0];
		    y1[0] = y_intr[0];
		    x2[0] = x_intr[1];
		    y2[0] = y_intr[1];
		}
	    } else if (pos1 != 0) {		/* Only x1/y1 was out - update only it */
		/* This is about the only real difference between this and
		 * draw_clip_line(): it compares for '>0', here */
		if (dx * (x2[0] - x_intr[0]) + dy * (y2[0] - y_intr[0]) >= 0) {
		    x1[0] = x_intr[0];
		    y1[0] = y_intr[0];
		} else {
		    x1[0] = x_intr[1];
		    y1[0] = y_intr[1];
		}
	    } else {			/* Only x2/y2 was out - update only it */
		/* Same difference here, again */
		if (dx * (x_intr[0] - x1[0]) + dy * (y_intr[0] - y1[0]) >= 0) {
		    x2[0] = x_intr[0];
		    y2[0] = y_intr[0];
		} else {
		    x2[0] = x_intr[1];
		    y2[0] = y_intr[1];
		}
	    }

	    if (x1[0] < x_min || x1[0] > x_max || x2[0] < x_min || x2[0] > x_max || y1[0] < y_min || y1[0] > y_max || y2[0] < y_min || y2[0] > y_max)
		return 0;

	    return -1;
	}
	
	public static void apply_pm3dcolor(color.t_colorspec tc)
	{

	    /* Replace colorspec with that of the requested line style */
	    term_api.lp_style_type style = null;
	    if (tc.type == color.TC_LINESTYLE) {
	    	term_api.lp_use_properties(style, tc.lt);
	    	tc = style.pm3d_color;
	    }
	    if (tc.type == color.TC_DEFAULT) {
	    	term.linetype(term_api.LT_BLACK);
	    	return;
	    }
	    if (tc.type == color.TC_LT) {
		    term.set_color(tc);
		    return;
	    }
	    if (tc.type == color.TC_RGB) {
	    	term.set_color(tc);
	    	return;
	    }
	    switch (tc.type) {
			case color.TC_Z:    color.set_color(pm3d.cb2gray(pm3d.z2cb(tc.value))); break;
			case color.TC_CB:   color.set_color(pm3d.cb2gray(tc.value));       break;
			case color.TC_FRAC: color.set_color(color.sm_palette.positive == color.SMPAL_POSITIVE ?
							tc.value : 1-tc.value);
			      			break;
	    }
	}
	
}