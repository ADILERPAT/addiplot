package com.addiPlot.gnuplot;

public class pipe_details
{
	public pipe_details next;
	public FILE fp;
	public int pid;
	public int completion;
}
/* vax c doesn't come with strftime - watch out for redefn of RCSid */
///#ifdef VAXCRTL
///#define RCSid RCSid2
///#include "strftime.c"
///#endif
