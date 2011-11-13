package com.addiPlot;

import com.addiPlot.color.t_colorspec;
import com.addiPlot.term_api.lp_style_type;

public class gadgets {
	
	/* set clip */
	public static boolean clip_lines1 = true;
	public static boolean clip_lines2 = false;
	
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
	public class position {
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
	    public position place;
	    public int rotate;
	    public int layer;
	    public String text;
	    public String font;		/* Entry font added by DJL */
	    public t_colorspec textcolor;
	    public lp_style_type lp_properties;
	    public position offset;
	    public boolean noenhanced;
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
	
	/* EAM Feb 2003 - Move all global variables related to key into a */
	/* single structure. Eventually this will allow multiple keys.    */
	public enum keytitle_type {
	    NOAUTO_KEYTITLES, FILENAME_KEYTITLES, COLUMNHEAD_KEYTITLES
	};
	
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

	public class legend_key {
	    boolean visible;		/* Do we show this key at all? */
	    en_key_region region;	/* if so: where? */
	    en_key_ext_region margin;	/* if exterior: where outside? */
	    position user_pos;	/* if user specified position, this is it */
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
	
	public static BoundingBox clip_area; /* Current clipping box */  
	
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
}