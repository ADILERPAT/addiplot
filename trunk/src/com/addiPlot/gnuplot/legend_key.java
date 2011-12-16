package com.addiPlot.gnuplot;

public class legend_key
{
	public boolean visible; // Do we show this key at all?
	public en_key_region region; // if so: where?
	public en_key_ext_region margin; // if exterior: where outside?
	public position user_pos = new position(); // if user specified position, this is it
	public VERT_JUSTIFY vpos; // otherwise these guide auto-positioning
	public JUSTIFY hpos;
	public en_key_sample_positioning just;
	public en_key_stack_direction stack_dir;
	public double swidth; // 'width' of the linestyle sample line in the key
	public double vert_factor; // user specified vertical spacing multiplier
	public double width_fix; // user specified additional (+/-) width of key titles
	public double height_fix;
	public keytitle_type auto_titles; // auto title curves unless plotted 'with notitle'
	public boolean reverse; // key back to front
	public boolean invert; // key top to bottom
	public boolean enhanced; // enable/disable enhanced text of key titles
	public lp_style_type box = new lp_style_type(); // linetype of box around key:
	public String title = new String(new char[DefineConstants.MAX_LINE_LEN + 1]); // title line for the key as a whole
	public String font; // Will be used for both key title and plot titles
	public t_colorspec textcolor = new t_colorspec(); // Will be used for both key title and plot titles
	public BoundingBox bounds = new BoundingBox();
}