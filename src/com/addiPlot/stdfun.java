package com.addiPlot;

public class stdfun {
	
	public static double VERYLARGE = Double.MAX_VALUE;

	public static boolean inrange(double z, double min, double max) {
		return (((min)<(max)) ? (((z)>=(min)) && ((z)<=(max))) : (((z)>=(max)) && ((z)<=(min))));
	}
	
	public static double GPMAX(double a, double b) {
		return ( (a) > (b) ? (a) : (b) );
	}
	public static double GPMIN(double a, double b) {
		return ( (a) < (b) ? (a) : (b) );
	}

}