package com.addiPlot.gnuplot;

public class at_type
{
	/* count of entries in .actions[] */
	public int a_count;
	/* will usually be less than MAX_AT_LEN is malloc()'d copy */
	public at_entry[] actions = new at_entry[DefineConstants.MAX_AT_LEN];
}