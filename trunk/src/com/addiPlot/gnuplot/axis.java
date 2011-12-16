package com.addiPlot.gnuplot;

/* FIXME 20000725: collect some of those various TBOOLEAN fields into
 * a larger int (or -- shudder -- a bitfield?) */
public class axis
{
/* range of this axis */
	public e_autoscale autoscale; // Which end(s) are autoscaled?
	public e_autoscale set_autoscale; // what does 'set' think autoscale to be?
	public int range_flags; // flag bits about autoscale/writeback:
	/* write auto-ed ranges back to variables for autoscale */
	public static final int RANGE_WRITEBACK = 1;
	/* allow auto and reversed ranges */
	public static final int RANGE_REVERSE = 2;
	public boolean range_is_reverted; // range [high:low] silently reverted?
	public double min; // 'transient' axis extremal values
	public double max;
	public double set_min; // set/show 'permanent' values
	public double set_max;
	public double writeback_min; // ULIG's writeback implementation
	public double writeback_max;
	public double data_min; // Not necessarily the same as axis min
	public double data_max;

/* output-related quantities */
	public int term_lower; // low and high end of the axis on output,
	public int term_upper; // ... (in terminal coordinates)
	public double term_scale; // scale factor: plot --> term coords
	public int term_zero; // position of zero axis

/* log axis control */
	public boolean log; // log axis stuff: flag "islog?"
	public double base; // logarithm base value
	public double log_base; // ln(base), for easier computations

/* time/date axis control */
	public boolean is_timedata; // is this a time/date axis?
	public boolean format_is_numeric; // format string looks like numeric???
	public String timefmt = new String(new char[DefineConstants.MAX_ID_LEN + 1]); // format string for input
	public String formatstring = new String(new char[DefineConstants.MAX_ID_LEN + 1]);
				/* the format string for output */

/* ticmark control variables */
	public int ticmode; // tics on border/axis? mirrored?
	public ticdef ticdef = new ticdef(); // tic series definition
	public int tic_rotate; // ticmarks rotated by this angle
	public boolean gridmajor; // Grid lines wanted on major tics?
	public boolean gridminor; // Grid lines for minor tics?
	public int minitics; // minor tic mode (none/auto/user)?
	public double mtic_freq; // minitic stepsize
	public double ticscale; // scale factor for tic marks (was (0..1])
	public double miniticscale; // and for minitics
	public boolean tic_in; // tics to be drawn inward?

/* other miscellaneous fields */
	public text_label label = new text_label(); // label string and position offsets
	public lp_style_type zeroaxis = new lp_style_type(); // drawing style for zeroaxis, if any
}