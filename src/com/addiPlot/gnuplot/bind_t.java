package com.addiPlot.gnuplot;

/* bind related stuff */

public class bind_t
{
	public bind_t prev;
	public int key;
	public byte modifier;
	public String command;
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//	sbyte *(*builtin)(struct gp_event_t * ge);
	public boolean allwindows;
	public bind_t next;
}
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define TICS_ON(ti) (((ti)&TICS_MASK)!=NO_TICS)
//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
///#undef MKSTR

///#endif // USE_MOUSE 
