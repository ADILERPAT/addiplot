package com.addiPlot.gnuplot;

public class key_s
{
	public String key; // the name of this key
	public int pos; // ftell position
	public line_s text; // the text for this key
	public boolean primary; // TRUE -> is a primary name for a text block
}
///#define SCREENSIZE 24


/* ShowSubtopics:
 *  Print a list of subtopic names
 */
/* The maximum number of subtopics per line */
///#define PER_LINE 4

///#endif  // #ifdef NO_GIH 
