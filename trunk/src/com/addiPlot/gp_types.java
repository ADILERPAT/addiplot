package com.addiPlot;

public class gp_types {

	public static int MAX_ID_LEN = 50;
	public static int MAX_LINE_LEN = 1024;
	public static double DEG2RAD = (java.lang.Math.PI / 180.0);
	
	public enum DATA_TYPES {
		INTGR (1),
		CMPLX (2), 
		STRING (3); 
		
		public int value;
		DATA_TYPES(int value) {
		   this.value = value;	
		}
	};
	
	public enum MODE_PLOT_TYPE {
		MODE_QUERY, MODE_PLOT, MODE_SPLOT
	};

	public enum PLOT_TYPE {
		FUNC, DATA, FUNC3D, DATA3D, NODATA
	};
	
	/* we explicitly assign values to the types, such that we can
	 * perform bit tests to see if the style involves points and/or lines
	 * bit 0 (val 1) = line, bit 1 (val 2) = point, bit 2 (val 4)= error
	 * This allows rapid decisions about the sample drawn into the key,
	 * for example.
	 */
	public enum PLOT_STYLE_FLAGS {
	    PLOT_STYLE_HAS_LINE     (1<<0),
	    PLOT_STYLE_HAS_POINT    (1<<1),
	    PLOT_STYLE_HAS_ERRORBAR (1<<2),
	    PLOT_STYLE_HAS_FILL     (1<<3),
	    PLOT_STYLE_BITS         (1<<4);
	    
	    public int value;
		PLOT_STYLE_FLAGS (int value) {
		   this.value = value;	
		}
	};
	
	public enum PLOT_STYLE {
	    LINES           (0*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value),
	    POINTSTYLE      (1*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.value),
	    IMPULSES        (2*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value),
	    LINESPOINTS     (3*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value)),
	    DOTS            (4*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + 0),
	    XERRORBARS      (5*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR.value)),
	    YERRORBARS      (6*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR.value)),
	    XYERRORBARS     (7*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR.value)),
	    BOXXYERROR      (8*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.value)),
	    BOXES           (9*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.value)),
	    BOXERROR        (10*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.value)),
	    STEPS           (11*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value),
	    FSTEPS          (12*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value),
	    HISTEPS         (13*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value),
	    VECTOR          (14*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value),
	    CANDLESTICKS    (15*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.value)),
	    FINANCEBARS     (16*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value),
	    XERRORLINES     (17*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR.value)),
	    YERRORLINES     (18*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR.value)),
	    XYERRORLINES    (19*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + (PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.value | PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR.value)),
	    FILLEDCURVES    (21*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.value),
	    PM3DSURFACE     (22*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + 0),
	    LABELPOINTS     (23*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + 0),
	    HISTOGRAMS      (24*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.value),
	    IMAGE           (25*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + 0),
	    RGBIMAGE        (26*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + 0),
	    RGBA_IMAGE      (27*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + 0),
	    CIRCLES         (28*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.value),
	    BOXPLOT         (29*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.value),
	    ELLIPSES        (30*PLOT_STYLE_FLAGS.PLOT_STYLE_BITS.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE.value + PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.value);
	    
	    public int value;
		PLOT_STYLE (int value) {
		   this.value = value;	
		}
	};

	public enum PLOT_SMOOTH {
	    SMOOTH_NONE,
	    SMOOTH_ACSPLINES,
	    SMOOTH_BEZIER,
	    SMOOTH_CSPLINES,
	    SMOOTH_SBEZIER,
	    SMOOTH_UNIQUE,
	    SMOOTH_FREQUENCY,
	    SMOOTH_CUMULATIVE,
	    SMOOTH_KDENSITY,
	    SMOOTH_CUMULATIVE_NORMALISED
	};

	public class cmplx {
		double real, imag;
	};

	public class t_value {
	    DATA_TYPES type;
		int int_val;
		cmplx cmplx_val;
		String string_val;
	};

	/* Defines the type of a coordinate */
	/* INRANGE and OUTRANGE points have an x,y point associated with them */
	public enum coord_type {
	    INRANGE,			/* inside plot boundary */
	    OUTRANGE,			/* outside plot boundary, but defined */
	    UNDEFINED			/* not defined at all */
	};

	public static class coordinate {
	    public coord_type type;	/* see above */
	    public double x, y, z;
	    public double ylow, yhigh;	/* ignored in 3d */
	    public double xlow, xhigh;	/* also ignored in 3d */
	};

}