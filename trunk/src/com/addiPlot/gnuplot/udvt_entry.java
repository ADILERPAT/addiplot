package com.addiPlot.gnuplot;

/* user-defined variable table entry */
public class udvt_entry
{
	public udvt_entry next_udv; // pointer to next value in linked list
	public String udv_name; // name of this value entry
	public boolean udv_undef; // true if not defined yet
	public value udv_value = new value(); // value it has
}