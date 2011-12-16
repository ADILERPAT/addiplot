package com.addiPlot.gnuplot;

/* Some inexact operations: == , > , >=, sign() */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define EQ(X,Y) (fabs( (X) - (Y) ) < EPSILON)
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define GR(X,Y) ((X) > (Y) + EPSILON)
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define GE(X,Y) ((X) >= (Y) - EPSILON)
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define SIGN(X) ( ((X)<-EPSILON) ? -1: ((X)>EPSILON) )

/* A plane equation, stored as a four-element vector. The equation
 * itself is: x*p[0]+y*p[1]+z*p[2]+1*p[3]=0 */

/* One edge of the mesh. The edges are (currently) organized into a
 * linked list as a method of traversing them back-to-front. */
public class edge
{
	public int v1; // the vertices at either end
	public int v2;
	public int style; // linetype index
	public lp_style_type lp; // line/point style attributes
	public int next; // index of next edge in z-sorted list
}