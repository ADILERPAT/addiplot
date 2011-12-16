package com.addiPlot.gnuplot;

/* Tic-mark labelling definition; see set xtics */
public class ticdef
{
	public en_ticseries_type type;
	public String font;
	public t_colorspec textcolor = new t_colorspec();
//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
	public static class AnonymousClass
	{
	   public ticmark user; // for TIC_USER
//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass2:
	   public static class AnonymousClass2 // for TIC_SERIES
	   {
		  public double start;
		  public double incr;
		  public double end; // ymax, if VERYLARGE
	   }
	   public AnonymousClass2 series = new AnonymousClass2();
	   public boolean mix; // TRUE to use both the above
	}
	public AnonymousClass def = new AnonymousClass();
	public position offset = new position();
	public boolean rangelimited; // Limit tics to data range
}