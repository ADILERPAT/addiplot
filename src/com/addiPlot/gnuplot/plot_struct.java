package com.addiPlot.gnuplot;

import android.text.format.Time;

/* information about one window/plot */
public class plot_struct
{
	public Window window = new Window();
///#ifdef EXTERNAL_X11_WINDOW
	public Window external_container = new Window();
///#endif
	public Pixmap pixmap = new Pixmap();
	public int posn_flags;
	public int x;
	public int y;
	public int width; // window size
	public int height;
	public int gheight; /* height of the part of the window that
				 * contains the graph (i.e., excluding the
				 * status line at the bottom if mouse is
				 * enabled) */
	public int px;
	public int py;
	public int ncommands;
	public int max_commands;
	public String[] commands;
	public String titlestring;
///#ifdef USE_MOUSE
	public int button; // buttons which are currently pressed
	public String str = new String(new char[0xff]); // last displayed string
///#endif
	public Time time = new Time(); // time stamp of previous event
	public int lwidth; // this and the following 6 lines declare
	public int type; // variables used during drawing in exec_cmd()
	public int user_width;
	public JUSTIFY jmode;
	public double angle; // Text rotation angle in degrees
	public int lt;
///#ifdef USE_MOUSE
	public boolean mouse_on; // is mouse bar on?
	public boolean ruler_on; // is ruler on?
	public boolean ruler_lineto_on; // is line between ruler and mouse cursor on?
	public int ruler_x; // coordinates of ruler
	public int ruler_y;
	public int ruler_lineto_x; // draw line from ruler to current mouse pos
	public int ruler_lineto_y;
	public boolean zoombox_on; // is zoombox on?
	public int zoombox_x1; // coordinates of zoombox as last drawn
	public int zoombox_y1;
	public int zoombox_x2;
	public int zoombox_y2;
	public String zoombox_str1a = new String(new char[64]); // strings to be drawn at corners of zoombox ; 1/2 indicate corner; a/b indicate above/below
	public String zoombox_str1b = new String(new char[64]);
	public String zoombox_str2a = new String(new char[64]);
	public String zoombox_str2b = new String(new char[64]);
	public boolean resizing; // TRUE while waiting for an acknowledgement of resize
///#endif
	/* points to the cmap which is currently used for drawing.
	 * This is always the default colormap, if not in pm3d.
	 */
	public cmap_t cmap;
	public cmap_struct first_cmap_struct;
///#if defined(USE_MOUSE) && defined(MOUSE_ALL_WINDOWS)
	/* This array holds per-axis scaling information sufficient to reconstruct
	 * plot coordinates of a mouse click.  It is a snapshot of the contents of
	 * gnuplot's axis_array structure at the time the plot was drawn.
	 */
	public int almost2d;
	public int axis_mask; // Bits set to show which axes are active
	public axis_scale_t[] axis_scale = new axis_scale_t[2 * DefineConstants.SECOND_AXES];
///#endif
	/* Last text position  - used by enhanced text mode */
	public int xLast;
	public int yLast;
	/* Saved text position  - used by enhanced text mode */
	public int xSave;
	public int ySave;
	/* Last rgb color that was set */
	public int current_rgb;

	public plot_struct prev_plot; // Linked list pointers and number
	public plot_struct next_plot;
	public int plot_number;
}