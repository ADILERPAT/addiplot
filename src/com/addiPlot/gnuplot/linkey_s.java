package com.addiPlot.gnuplot;

public class linkey_s
{
	public String key; // the name of this key
	public int pos; // ftell position
	public line_s text; // the text for this key
	public boolean primary; // TRUE -> is a primary name for a text block
	public linkey_s next; // the next key in linked list
}