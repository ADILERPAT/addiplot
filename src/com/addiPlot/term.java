package com.addiPlot;

import java.util.Vector;

import com.addiPlot.gp_types.coordinate;
import com.addiPlot.graphics.curve_points;

public class term {
	
	public static graphics mGraphics = new graphics();
	
	public static Vector<curve_points> mCurves = new Vector<curve_points>();
	
	public static void move (int x, int y) {
		addiPlot.move(x, y);
	}
	
	public static void vector (int x, int y) {
		addiPlot.vector(x, y);
	}

	public static void plotIt() {
	}

	public static void usePlotDataString(String plotData) {
		String rows[] = plotData.split(";");
		int firstLoop = 1;
		term.mCurves.clear();
		for (int rowLoop = 0; rowLoop < rows.length; rowLoop++) {
	        String values[] = rows[rowLoop].split(",");
	        for (int curveLoop = 0; curveLoop < values.length/2; curveLoop++) {
	        	if (firstLoop == 1) {
	        		curve_points tempCurve = mGraphics.new curve_points();
	        		term.mCurves.add(tempCurve);
	        	}
	        	coordinate tempCoord = new coordinate();
	        	tempCoord.x = Double.valueOf(values[curveLoop*2]);
	        	tempCoord.y = Double.valueOf(values[curveLoop*2+1]);
	        	mCurves.get(curveLoop).points.add(tempCoord);
	        }
	        firstLoop = 0;
	    }
	}
	
}