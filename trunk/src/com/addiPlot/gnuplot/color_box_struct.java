package com.addiPlot.gnuplot;

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define DEFAULT_KEYBOX_LP { 0, LT_NODRAW, 0, 1.0, 1.0, 0 }

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define DEFAULT_KEY_POSITION { graph, graph, graph, 0.9, 0.9, 0. }

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define DEFAULT_KEY_PROPS { TRUE, GPKEY_AUTO_INTERIOR_LRTBC, GPKEY_RMARGIN, DEFAULT_KEY_POSITION, JUST_TOP, RIGHT, GPKEY_RIGHT, GPKEY_VERTICAL, 4.0, 1.0, 0.0, 0.0, FILENAME_KEYTITLES, FALSE, FALSE, TRUE, DEFAULT_KEYBOX_LP, "", NULL, {TC_LT, LT_BLACK, 0.0} }


/*
 * EAM Jan 2006 - Move colorbox structure definition to here from color.h
 * in order to be able to use struct position
 */

///#define SMCOLOR_BOX_NO 'n'
///#define SMCOLOR_BOX_DEFAULT 'd'
///#define SMCOLOR_BOX_USER 'u'

public class color_box_struct
{
  public byte where;
	/* where
	SMCOLOR_BOX_NO .. do not draw the colour box
	SMCOLOR_BOX_DEFAULT .. draw it at default position and size
	SMCOLOR_BOX_USER .. draw it at the position given by user
	*/
  public byte rotation; // 'v' or 'h' vertical or horizontal box
  public byte border; // if non-null, a border will be drawn around the box (default)
  public int border_lt_tag;
  public int layer; // front or back
  public int xoffset; // To adjust left or right, e.g. for y2tics
  public position origin = new position();
  public position size = new position();
  public BoundingBox bounds = new BoundingBox();
}