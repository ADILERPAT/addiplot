package com.addiPlot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Vector;

import com.addiPlot.gp_types.coordinate;
import com.addiPlot.graphics.curve_points;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class addiPlot extends Activity {
	DemoView demoview;

	private static Canvas _canvas = new Canvas();
	private static int _x;
	private static int _y;
	private graphics _graphics = new graphics();
	private Vector<curve_points> _curves = new Vector<curve_points>();
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		demoview = new DemoView(this);
		setContentView(demoview);
		onNewIntent(getIntent());
	}
	
	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
	    setIntent(intent);
	    String plotData = intent.getStringExtra("plotData"); 
	    
	    if (plotData != null) {
			String rows[] = plotData.split(";");
			int firstLoop = 1;
			_curves.clear();
			for (int rowLoop = 0; rowLoop < rows.length; rowLoop++) {
		        String values[] = rows[rowLoop].split(",");
		        for (int curveLoop = 0; curveLoop < values.length/2; curveLoop++) {
		        	if (firstLoop == 1) {
		        		curve_points tempCurve = _graphics.new curve_points();
		        		_curves.add(tempCurve);
		        	}
		        	coordinate tempCoord = new coordinate();
		        	tempCoord.x = Double.valueOf(values[curveLoop*2]);
		        	tempCoord.y = Double.valueOf(values[curveLoop*2+1]);
		        	_curves.get(curveLoop).points.add(tempCoord);
		        }
		        firstLoop = 0;
		    }
			
			demoview.invalidate();
	    }
	}
	
	public static void move (int x, int y) {
		_x = x;
		_y = y;
	}
	
	public static void vector (int x, int y) {
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(4);
		paint.setColor(Color.RED);
		_canvas.drawLine(_x, _y , x, y, paint);
		_x = x;
		_y = y;
	}

	private class DemoView extends View{
		
		public DemoView(Context context){
			super(context);
		}

		@Override protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			_canvas = canvas;

			// custom drawing code here
			// remember: y increases from top to bottom
			// x increases from left to right
			//int x = 0;
			//int y = 0;
			Paint paint = new Paint();
			paint.setStyle(Paint.Style.FILL);

			// make the entire canvas white
			paint.setColor(Color.GRAY);
			_canvas.drawPaint(paint);
			// another way to do this is to use:
			// canvas.drawColor(Color.WHITE);

			// draw a solid blue circle
			//paint.setColor(Color.BLUE);
			//canvas.drawCircle(20, 20, 15, paint);

			// draw blue circle with antialiasing turned on
			//paint.setAntiAlias(true);
			//paint.setColor(Color.BLUE);
			//canvas.drawCircle(60, 20, 15, paint);

			// compare the above circles once drawn
			// the fist circle has a jagged perimeter
			// the second circle has a smooth perimeter

			// draw a solid red rectangle
			//paint.setAntiAlias(false);
			//paint.setColor(Color.RED);

			// create and draw triangles
			// use a Path object to store the 3 line segments
			// use .offset to draw in many locations
			// note: this triangle is not centered at 0,0
			//paint.setStyle(Paint.Style.STROKE);
			//paint.setStrokeWidth(2);
			//paint.setColor(Color.RED);
			//path.moveTo(0, -10);
			//path.lineTo(5, 0);
			//path.lineTo(-5, 0);
			//path.close();
			//path.offset(10, 40);
			//canvas.drawPath(path, paint);
			//path.offset(50, 100);
			//canvas.drawPath(path, paint);
			// offset is cumlative
			// next draw displaces 50,100 from previous
			//path.offset(50, 100);
			//canvas.drawPath(path, paint);

			// draw some text using STROKE style
			//paint.setStyle(Paint.Style.STROKE);
			//paint.setStrokeWidth(1);
			//paint.setColor(Color.MAGENTA);
			//paint.setTextSize(30);
			//canvas.drawText("Style.STROKE", 75, 75, paint);

			// draw some text using FILL style
			//paint.setStyle(Paint.Style.FILL);
			//turn antialiasing on
			//paint.setAntiAlias(true);
			//paint.setTextSize(30);
			//canvas.drawText("Style.FILL", 75, 110, paint);

			// draw some rotated text
			// get text width and height
			// set desired drawing location
			//x = 75;
			//y = 185;
			//paint.setColor(Color.GRAY);
			//paint.setTextSize(25);
			//String str2rotate = "Rotated!";

			// draw bounding rect before rotating text
			//Rect rect = new Rect();
			//paint.getTextBounds(str2rotate, 0, str2rotate.length(), rect);
			//canvas.translate(x, y);
			//paint.setStyle(Paint.Style.FILL);
			// draw unrotated text
			//canvas.drawText("!Rotated", 0, 0, paint);
			//paint.setStyle(Paint.Style.STROKE);
			//canvas.drawRect(rect, paint);
			// undo the translate
			//canvas.translate(-x, -y);

			// rotate the canvas on center of the text to draw
			//canvas.rotate(-45, x + rect.exactCenterX(),
            //                                   y + rect.exactCenterY());
			// draw the rotated text
			//paint.setStyle(Paint.Style.FILL);
			//canvas.drawText(str2rotate, x, y, paint);

			//undo the rotate
			//canvas.restore();
			//canvas.drawText("After canvas.restore()", 50, 250, paint);

			// draw a thick dashed line
			//DashPathEffect dashPath =
            //                new DashPathEffect(new float[]{20,5}, 1);
			//paint.setPathEffect(dashPath);
			//paint.setStrokeWidth(8);
			//canvas.drawLine(0, 300 , 320, 300, paint);
			
			//move(0,0);
			//vector(100,100);
			int padding = 20;
			int width = getWidth() - 2*padding;
			int height = getHeight() - 2*padding;
			paint.setColor(Color.WHITE);
			_canvas.drawRect(padding, padding, padding+width, padding+height, paint);
			
			if (!_curves.isEmpty()) {
				NumberFormat exp = DecimalFormat.getInstance();
				if (exp instanceof DecimalFormat) {
				    ((DecimalFormat)exp).applyPattern("0.00E0");
				}
				double xMin = 0;
		    	double xMax = 0;
		    	double yMin = 0;
		    	double yMax = 0;
		    	double xRange = 0;
		    	double yRange = 0;
		    	for (int curveLoop=0; curveLoop < _curves.size(); curveLoop++) {
		    		for (int pointLoop = 0; pointLoop < _curves.get(curveLoop).points.size(); pointLoop++) {
		    			if ((curveLoop == 0) && (pointLoop == 0)) {
		    				xMin = _curves.get(curveLoop).points.get(pointLoop).x;
		    				xMax = _curves.get(curveLoop).points.get(pointLoop).x;
		    				yMin = _curves.get(curveLoop).points.get(pointLoop).y;
		    				yMax = _curves.get(curveLoop).points.get(pointLoop).y;
		    			} else {
		    				if (_curves.get(curveLoop).points.get(pointLoop).x < xMin) {
		    					xMin = _curves.get(curveLoop).points.get(pointLoop).x;
		    				}
		    				if (_curves.get(curveLoop).points.get(pointLoop).x > xMax) {
		    					xMax = _curves.get(curveLoop).points.get(pointLoop).x;
		    				}
		    				if (_curves.get(curveLoop).points.get(pointLoop).y < yMin) {
		    					yMin = _curves.get(curveLoop).points.get(pointLoop).y;
		    				}
		    				if (_curves.get(curveLoop).points.get(pointLoop).y > yMax) {
		    					yMax = _curves.get(curveLoop).points.get(pointLoop).y;
		    				}
		    			}
		    		}
		    	}
		    	xRange = xMax-xMin;
		    	yRange = yMax-yMin;
		    	for (int curveLoop=0; curveLoop < _curves.size(); curveLoop++) {
		    		for (int pointLoop = 0; pointLoop < _curves.get(curveLoop).points.size(); pointLoop++) {
		    			int xNorm = padding + (int)(width * (_curves.get(curveLoop).points.get(pointLoop).x-xMin)/xRange);
		    			int yNorm = padding + height - (int)(height * (_curves.get(curveLoop).points.get(pointLoop).y-yMin)/yRange);
		    			if (pointLoop == 0) {
		    			   move(xNorm,yNorm);	
		    			} else {
		    			   vector(xNorm,yNorm);
		    			}
		    		}
		    	}
		    	paint.setColor(Color.BLACK);
		    	_canvas.drawText(exp.format(xMax), width - 10, height + padding + 10, paint);
		    	_canvas.drawText(exp.format(xMin), padding, height + padding + 10, paint);
		    	_canvas.drawText(exp.format(yMax), 0, padding + 10, paint);
		    	_canvas.drawText(exp.format(yMin), 0, height + padding, paint);
			}
		}
	}
}
