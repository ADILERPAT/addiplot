package com.addiPlot;

import com.addiPlot.session.TermSession;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class addiPlot extends Activity {
	DemoView demoview = null;

	private Canvas _canvas;
	private Bitmap _bitmap;
	private int _screenHeight;
	private int _screenWidth;
	private int _x;
	private int _y;
	private LinearLayout mTerminalLayout;
	private LinearLayout mPlotLayout;
	private ViewSwitcher mSwitcher;
	public TextView mTextView;
	public ScrollView mScrollView;
	public EditText mCmdEditText;
	private String textViewString = "";
	private String partialLine = "";
	private int _linetype;
	private int _linewidth;
	private String _justMode = "LEFT";

	private TermSession mTermSession;

	// Need handler for callbacks to the UI thread
	public final Handler mHandler = new Handler() {
		public void handleMessage(Message msg) { 
			if (msg.getData().getString("command").equals("move")) {
				move(msg.getData().getInt("x"),msg.getData().getInt("y"));
			} else if (msg.getData().getString("command").equals("vector")) {
				vector(msg.getData().getInt("x"),msg.getData().getInt("y"));
			}
		};
	};

	// Create runnable for thread run
	final Runnable mRunThread = new Runnable() {
		public void run() {
			//do something compute intensive
			//term.plotIt(mHandler);
			mHandler.post(mUpdateResults);
		}
	};

	// Create runnable for posting
	final Runnable mUpdateResults = new Runnable() {
		public void run() {
			updateResultsInUi();
		}
	};

	private void updateResultsInUi() {
		// Back in the UI thread -- update our UI elements based on the data in mResults
	}

	public void plotIt() {
		// Fire off a thread to do some work that we shouldn't do directly in the UI thread
		ThreadGroup threadGroup = new ThreadGroup("plotItCmdGroup");
		Thread t = new Thread(threadGroup, mRunThread, "plotItCmd", 16*1024*1024) {};
		t.start();
	}


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mTerminalLayout = (LinearLayout)findViewById(R.id.terminalLayout);
		
		mPlotLayout = (LinearLayout)findViewById(R.id.plotLayout);
		
		mTextView = (TextView)findViewById(R.id.termWindow);

		mScrollView = (ScrollView)findViewById(R.id.scrollView);

		mCmdEditText = (EditText)findViewById(R.id.edit_command);
		
		mSwitcher = (ViewSwitcher) findViewById(R.id.viewSwitcher);

		mCmdEditText.setOnKeyListener(new OnKeyListener() {
			@Override
			public boolean onKey(View view, int keyCode, KeyEvent event) { 
				if (event.getAction() == KeyEvent.ACTION_DOWN) {
					if (keyCode == KeyEvent.KEYCODE_ENTER) {
						String command = mCmdEditText.getText().toString();
						mCmdEditText.setText("");
						mTermSession.write(command + "\n");
						return true;
					}
				}
				return false;
			}
		});

		onNewIntent(getIntent());
	}

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		setIntent(intent);
		String plotData = intent.getStringExtra("plotData");

		mTermSession = new TermSession(this);
		mTermSession.updateSize(1024, 1024);
	}

	public void scrollToBottom()
	{
		mScrollView.post(new Runnable()
		{ 
			public void run()
			{ 
				mScrollView.smoothScrollTo(0, mTextView.getBottom());
			} 
		});
	}

	private void init() {
		_screenHeight = mTerminalLayout.getHeight();
		_screenWidth = mTerminalLayout.getWidth();
		if (_screenWidth < _screenHeight) {
			_screenHeight = _screenWidth;
		}
		_bitmap = Bitmap.createBitmap(480, 480, Bitmap.Config.ARGB_8888);
		_canvas = new Canvas(_bitmap);
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);

		// make the entire canvas white
		paint.setColor(Color.WHITE);
		_canvas.drawPaint(paint);
		
		if (demoview == null) {
			demoview = new DemoView(this);
			demoview.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.FILL_PARENT,
                    ViewGroup.LayoutParams.FILL_PARENT));
			mPlotLayout.addView(demoview);
			mPlotLayout.invalidate();
			mSwitcher.invalidate();
		}
	}
	

	private void linewidth(int width) {
		_linewidth = width;
	}

	private void linetype(int type) {
		_linetype = type;
	}
	
	private void justify_text(String mode) {
		_justMode = mode;
	}

	private void move (int x, int y) {
		_x = x;
		_y = y;
	}

	private void vector (int x, int y) {
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(_linewidth);
		
		if (_linetype < 0) {
			paint.setColor(Color.BLACK);
		} else if ((_linetype % 9) == 0) {
			paint.setColor(Color.RED);
		} else if ((_linetype % 9) == 1) {
			paint.setColor(Color.GREEN);
		} else if ((_linetype % 9) == 2) {
			paint.setColor(Color.BLUE);
		} else if ((_linetype % 9) == 3) {
			paint.setColor(Color.MAGENTA);
		} else if ((_linetype % 9) == 4) {
			paint.setColor(Color.CYAN);
		} else if ((_linetype % 9) == 5) {
			paint.setColor(Color.YELLOW);
		} else if ((_linetype % 9) == 6) {
			paint.setColor(Color.BLACK);
		} else if ((_linetype % 9) == 7) {
			paint.setARGB(1,139,69,19);
		} else if ((_linetype % 9) == 8) {
			paint.setColor(Color.LTGRAY);
		} else {
			paint.setColor(Color.BLACK);
		}
		_canvas.drawLine(_x, 480-_y , x, 480-y, paint);
		_x = x;
		_y = y;
	}

	private void text(int x, int y, String text) {
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(_linewidth);
		paint.setColor(Color.BLACK);
		paint.setTextSize(18);
		paint.setTypeface(Typeface.MONOSPACE);
		if (_justMode.equals("RIGHT")) {
			paint.setTextAlign(Align.RIGHT);
		} else if (_justMode.equals("CENTRE")) {
			paint.setTextAlign(Align.CENTER);
		} else {
			paint.setTextAlign(Align.LEFT);
		}
		_canvas.drawText(text, x, 480-y, paint);
	}

	private class DemoView extends View{

		public DemoView(Context context){
			super(context);
		}

		@Override protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			canvas.drawBitmap(_bitmap,0,0,null);
			//_canvas = canvas;

			// custom drawing code here
			// remember: y increases from top to bottom
			// x increases from left to right
			//int x = 0;
			//int y = 0;
			//Paint paint = new Paint();
			//paint.setStyle(Paint.Style.FILL);

			// make the entire canvas white
			//paint.setColor(Color.GRAY);
			//_canvas.drawPaint(paint);
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
			/*			int padding = 20;
			int width = getWidth() - 2*padding;
			int height = getHeight() - 2*padding;
			paint.setColor(Color.WHITE);
			_canvas.drawRect(padding, padding, padding+width, padding+height, paint);

			if (!term.mCurves.isEmpty()) {
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
		    	for (int curveLoop=0; curveLoop < term.mCurves.size(); curveLoop++) {
		    		for (int pointLoop = 0; pointLoop < term.mCurves.get(curveLoop).points.size(); pointLoop++) {
		    			if ((curveLoop == 0) && (pointLoop == 0)) {
		    				xMin = term.mCurves.get(curveLoop).points.get(pointLoop).x;
		    				xMax = term.mCurves.get(curveLoop).points.get(pointLoop).x;
		    				yMin = term.mCurves.get(curveLoop).points.get(pointLoop).y;
		    				yMax = term.mCurves.get(curveLoop).points.get(pointLoop).y;
		    			} else {
		    				if (term.mCurves.get(curveLoop).points.get(pointLoop).x < xMin) {
		    					xMin = term.mCurves.get(curveLoop).points.get(pointLoop).x;
		    				}
		    				if (term.mCurves.get(curveLoop).points.get(pointLoop).x > xMax) {
		    					xMax = term.mCurves.get(curveLoop).points.get(pointLoop).x;
		    				}
		    				if (term.mCurves.get(curveLoop).points.get(pointLoop).y < yMin) {
		    					yMin = term.mCurves.get(curveLoop).points.get(pointLoop).y;
		    				}
		    				if (term.mCurves.get(curveLoop).points.get(pointLoop).y > yMax) {
		    					yMax = term.mCurves.get(curveLoop).points.get(pointLoop).y;
		    				}
		    			}
		    		}
		    	}
		    	xRange = xMax-xMin;
		    	yRange = yMax-yMin;
		    	for (int curveLoop=0; curveLoop < term.mCurves.size(); curveLoop++) {
		    		for (int pointLoop = 0; pointLoop < term.mCurves.get(curveLoop).points.size(); pointLoop++) {
		    			int xNorm = padding + (int)(width * (term.mCurves.get(curveLoop).points.get(pointLoop).x-xMin)/xRange);
		    			int yNorm = padding + height - (int)(height * (term.mCurves.get(curveLoop).points.get(pointLoop).y-yMin)/yRange);
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
			}*/
		}
	}

	public void processString(String newTermOut) {
		String modifiedTermOut = partialLine + newTermOut;
		int incompleteLine;
		String lines[] = modifiedTermOut.split("\\r?\\n");
		if ((lines.length > 0) && (modifiedTermOut.length() > 0)) {
			if ((modifiedTermOut.charAt(modifiedTermOut.length()-1) == '\n') || (modifiedTermOut.charAt(modifiedTermOut.length()-1) == '\r')) {
				incompleteLine = 0;
				partialLine = "";
			} else {
				incompleteLine = 1;
				partialLine = lines[lines.length-1];
			}
			for (int lineNum = 0; lineNum < lines.length - incompleteLine; lineNum++) {
				if (lines[lineNum].startsWith("ANDROIDTERM")) {
					lines[lineNum] = lines[lineNum].replaceAll("\\r|\\n", "");
					String termCommand[] = lines[lineNum].split(",");
					if (termCommand[1].equals("move")) {
						try {
							move(Integer.parseInt(termCommand[2]), Integer.parseInt(termCommand[3]));
						} catch(NumberFormatException ex) {
							//Toast.makeText(getBaseContext(), "why am I here", Toast.LENGTH_LONG).show();
						}
					} else if (termCommand[1].equals("vector")) {
						try {
							vector(Integer.parseInt(termCommand[2]), Integer.parseInt(termCommand[3]));
						} catch(NumberFormatException ex) {
							//Toast.makeText(getBaseContext(), "why am I here", Toast.LENGTH_LONG).show();
						}
					} else if (termCommand[1].equals("put_text")) {
						text(Integer.parseInt(termCommand[2]), Integer.parseInt(termCommand[3]), termCommand[4]);
					} else if (termCommand[1].equals("linetype")) {
						linetype(Integer.parseInt(termCommand[2]));
					} else if (termCommand[1].equals("linewidth")) {
						linewidth(Integer.parseInt(termCommand[2]));
					} else if (termCommand[1].equals("justify_text")) {
						justify_text(termCommand[2]);
					} else if (termCommand[1].equals("init")) {
						init();
					} else if (termCommand[1].equals("text")) {
						demoview.invalidate();
						mSwitcher.showNext();
					}
				} else {
					textViewString = textViewString + lines[lineNum] + "\n";
				}
			}
		}
		mTextView.setText(textViewString);
		scrollToBottom();
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_BACK) {
	        if (mSwitcher.getDisplayedChild() != 0) {
	        	mSwitcher.showPrevious();
	        	return true;
	        } else {
	        	return super.onKeyDown(keyCode, event);
	        }
	    }
	    return super.onKeyDown(keyCode, event);
	}

	
	

}
