package com.addiPlot;

import java.util.Vector;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.addiPlot.gnuplot.gpiPoint;
import com.addiPlot.gnuplot.t_colorspec;
import com.addiPlot.gnuplot.t_sm_palette;
import com.addiPlot.gnuplot.termlayer;
import com.addiPlot.gp_types.coordinate;
import com.addiPlot.graphics.curve_points;

public class term {
	
	private static Handler mHandler;
	
	public static graphics mGraphics = new graphics();
	
	public static Vector<curve_points> mCurves = new Vector<curve_points>();
	
	//start of termentry
	/* The terminal interface structure --- heart of the terminal layer.
	 *
	 * It should go without saying that additional entries may be made
	 * only at the end of this structure. Any fields added must be
	 * optional - a value of 0 (or NULL pointer) means an older driver
	 * does not support that feature - gnuplot must still be able to
	 * function without that terminal feature
	 */

	public static String name;
	public static String description;
	public static int xmax,ymax,v_char,h_char,v_tic,h_tic;

	public static void options() {
	}
	
	public static void init() {
	}
	
	public static void reset() {
	}
	
	public static void text() {
	}
	
	public static int scale(double a, double b) {
		return 0;
	}
	
	public static void graphics() {
	}
	
	public static void move (int x, int y) {
		Message msg = new Message();
    	Bundle bndl = new Bundle();
    	bndl.putInt("x", x);
    	bndl.putInt("y", y);
    	bndl.putString("command", "move");
    	msg.setData(bndl);
    	mHandler.sendMessage(msg);
	}
	
	public static void vector (int x, int y) {
		Message msg = new Message();
    	Bundle bndl = new Bundle();
    	bndl.putInt("x", x);
    	bndl.putInt("y", y);
    	bndl.putString("command", "vector");
    	msg.setData(bndl);
    	mHandler.sendMessage(msg);
	}
	
	public static void linetype(int linetype) {
	}
	
	public static void put_text (int x, int y, String text) {
	}
	
	/* the following are optional. set term ensures they are not NULL */
	public static int text_angle(int angle) {
		return 0;
	}
	
	public static int justify_text(term_api.JUSTIFY justify) {
		return 0;
	}
	
	public static void point(int a, int b, int c) {
	}
	
	public static void arrow(int a, int b, int c, int d, int e) {
	}
	
	public static int set_font(String font) {
		return 0;
	}
	
	public static void pointsize(double a) { /* change pointsize */
	}
	
	public static int flags;
	
	public static void suspend() {
	} /* called after one plot of multiplot */
	public static void resume() {
	} /* called before plots of multiplot */
	public static void fillbox(int a, int b, int c, int d, int e) { /* clear in multiplot mode */
	}
	public static void linewidth(double linewidth) {
	}
	public static int waitforinput() { /* used for mouse input */
		return 0;
	}     
	public static void put_tmptext(int a, String string) { /* draws temporary text; int determines where: 0=statusline, 1,2: at corners of zoom box, with \r separating text above and below the point */
	}
	public static void set_ruler(int a, int b) { /* set ruler location; x<0 switches ruler off */
	}
	public static void set_cursor(int a, int b, int c) { /* set cursor style and corner of rubber band */	
	}
	public static void set_clipboard(String string) { /* write text into cut&paste buffer (clipboard) */
	}
	//CCX
	public static int make_palette(t_sm_palette palette) {
		return 0;
	}
	    /* 1. if palette==NULL, then return nice/suitable
	       maximal number of colours supported by this terminal.
	       Returns 0 if it can make colours without palette (like
	       postscript).
	       2. if palette!=NULL, then allocate its own palette
	       return value is undefined
	       3. available: some negative values of max_colors for whatever
	       can be useful
	     */
	public static void previous_palette() {
	}
	    /* release the palette that the above routine allocated and get
	       back the palette that was active before.
	       Some terminals, like displays, may draw parts of the figure
	       using their own palette. Those terminals that possess only
	       one palette for the whole plot don't need this routine.
	     */
	public static void set_color(t_colorspec color) {
	}
	
	/* EAM November 2004 - revised to take a pointer to struct rgb_color,
	   so that a palette gray value is not the only option for
	   specifying color.
	 */
	public static void filled_polygon(int points, gpiPoint[] corners) {
	}
	
	public static void image(int a, int b, syscfg.coordval coordval, color.gpiPoint gpiPoint, term_api.t_imagecolor imagecolor) {
	}

	/* Enhanced text mode driver call-backs */
	public static void enhanced_open(String fontname, double fontsize,
			double base, boolean widthflag, boolean showflag,
			int overprint) {
	}
	
	public static void enhanced_flush() {
	}
	
	public static void enhanced_writec(int c) {
	}

	/* Driver-specific synchronization or other layering commands.
	 * Introduced as an alternative to the ugly sight of
	 * driver-specific code strewn about in the core routines.
	 * As of this point (July 2005) used only by pslatex.trm
	 */
	public static void layer(termlayer layer) {
	}

	/* Begin/End path control. 
	 * Needed by PostScript-like devices in order to join the endpoints of
	 * a polygon cleanly.
	 */
	public static void path(int p) {
	}

	/* Scale factor for converting terminal coordinates to output
	 * pixel coordinates.  Used to provide data for external mousing code.
	 */
	public static double tscale;
	
	//end of termentry

	public static void plotIt(Handler handler) {
		mHandler = handler;
		graphics.plot_lines(mCurves.get(0));
	}

	public static void usePlotDataString(String plotData) {
		String rows[] = plotData.split(";");
		int firstLoop = 1;
		term.mCurves.clear();
		for (int rowLoop = 0; rowLoop < rows.length; rowLoop++) {
	        String values[] = rows[rowLoop].split(",");
	        for (int curveLoop = 0; curveLoop < values.length/2; curveLoop++) {
	        	if (firstLoop == 1) {
	        		curve_points tempCurve = mGraphics.new curve_points();
	        		term.mCurves.add(tempCurve);
	        	}
	        	coordinate tempCoord = new coordinate();
	        	tempCoord.x = Double.valueOf(values[curveLoop*2]);
	        	tempCoord.y = Double.valueOf(values[curveLoop*2+1]);
	        	mCurves.get(curveLoop).points.add(tempCoord);
	        }
	        firstLoop = 0;
	    }
	}
	
	/*
	 * Wrappers for newpath and closepath
	 */

	public static void
	newpath()
	{
		path(0);
	}

	public static void
	closepath()
	{
		path(1);
	}
	
}