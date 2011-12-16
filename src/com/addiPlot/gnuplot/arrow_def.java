package com.addiPlot.gnuplot;

/* This is the default state for the axis, timestamp, and plot title labels
 * indicated by tag = -2 */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define EMPTY_LABELSTRUCT {NULL, -2, {character, character, character, 0.0, 0.0, 0.0}, CENTRE, 0, 0, NULL, NULL, {TC_LT, -2, 0.0}, DEFAULT_LP_STYLE_TYPE, {character, character, character, 0.0, 0.0, 0.0}, FALSE }

/* Datastructure for implementing 'set arrow' */
public class arrow_def
{
	public arrow_def next; // pointer to next arrow in linked list
	public int tag; // identifies the arrow
	public position start = new position();
	public position end = new position();
	public boolean relative; // second coordinate is relative to first
	public arrow_style_type arrow_properties = new arrow_style_type();
}