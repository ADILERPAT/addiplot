package com.addiPlot.gnuplot;

public class lexical_unit // produced by scanner
{
	public boolean is_token; // true if token, false if a value
	public value l_val = new value();
	public int start_index; // index of first char in token
	public int length; // length of token in chars
}