package com.addiPlot.gnuplot;

import java.io.File;

public class pipe_details
{
	public pipe_details next;
	public File fp;
	public int pid;
	public int completion;
}
/* vax c doesn't come with strftime - watch out for redefn of RCSid */
///#ifdef VAXCRTL
///#define RCSid RCSid2
///#include "strftime.c"
///#endif
