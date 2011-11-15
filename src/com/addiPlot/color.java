package com.addiPlot;

public class color {
	
	public class t_colorspec {
	    public int type;			/* TC_<type> definitions below */
	    public int lt;			/* used for TC_LT, TC_LINESTYLE and TC_RGB */
	    public double value;		/* used for TC_CB and TC_FRAC */
	};
	
	/* EAM July 2004 - Disentangle polygon support and PM3D support  */
	/* a point (with integer coordinates) for use in polygon drawing */
	public class gpiPoint {
	    int x, y;
	    double z;
	    t_colorspec spec;
	    int style;
	};
	
	public static int TC_DEFAULT    = 0;	/* Use default color, set separately */
	public static int TC_LT		    = 1;	/* Use the color of linetype <n> */
	public static int TC_LINESTYLE	= 2;	/* Use the color of line style <n> */
	public static int TC_RGB		= 3;	/* Explicit RGB triple provided by user */
	public static int TC_CB		    = 4;	/* "palette cb <value>" */
	public static int TC_FRAC		= 5;	/* "palette frac <value> */
	public static int TC_Z		    = 6;	/* "palette z" */
	public static int TC_VARIABLE	= 7;	/* only used for "tc", never "lc" */
	
	/*
	  inverting the colour for negative picture (default is positive picture)
	  (for pm3d.positive)
	*/
	public static char SMPAL_NEGATIVE = 'n';
	public static char SMPAL_POSITIVE = 'p';
	
	/* Declaration of smooth palette, i.e. palette for smooth colours */

	public class t_sm_palette {
	  /** Constants: **/

	  /* (Fixed) number of formulae implemented for gray index to RGB
	   * mapping in color.c.  Usage: somewhere in `set' command to check
	   * that each of the below-given formula R,G,B are lower than this
	   * value. */
	  int colorFormulae;

	  /** Values that can be changed by `set' and shown by `show' commands: **/

	  /* can be SMPAL_COLOR_MODE_GRAY or SMPAL_COLOR_MODE_RGB */
	  palette_color_mode colorMode;
	  /* mapping formulae for SMPAL_COLOR_MODE_RGB */
	  int formulaR, formulaG, formulaB;
	  char positive;		/* positive or negative figure */

	  /* Now the variables that contain the discrete approximation of the
	   * desired palette of smooth colours as created by make_palette in
	   * pm3d.c.  This is then passed into terminal's make_palette, who
	   * transforms this [0;1] into whatever it supports.  */

	  /* Only this number of colour positions will be used even though
	   * there are some more available in the discrete palette of the
	   * terminal.  Useful for multiplot.  Max. number of colours is taken
	   * if this value equals 0.  Unused by: PostScript */
	  int use_maxcolors;
	  /* Number of colours used for the discrete palette. Equals to the
	   * result from term->make_palette(NULL), or restricted by
	   * use_maxcolor.  Used by: pm, gif. Unused by: PostScript */
	  int colors;
	  /* Table of RGB triplets resulted from applying the formulae. Used
	   * in the 2nd call to term->make_palette for a terminal with
	   * discrete colours. Unused by PostScript which calculates them
	   * analytically. */
	  rgb_color color;

	  /** Variables used by some terminals **/

	  /* Option unique for output to PostScript file.  By default,
	   * ps_allcF=0 and only the 3 selected rgb color formulae are written
	   * into the header preceding pm3d map in the file.  If ps_allcF is
	   * non-zero, then print there all color formulae, so that it is easy
	   * to play with choosing manually any color scheme in the PS file
	   * (see the definition of "/g"). Like that you can get the
	   * Rosenbrock multiplot figure on my gnuplot.html#pm3d demo page.
	   * Note: this option is used by all terminals of the postscript
	   * family, i.e. postscript, pslatex, epslatex, so it will not be
	   * comfortable to move it to the particular .trm files. */
	  char ps_allcF;

	  /* These variables are used to define interpolated color palettes:
	   * gradient is an array if (gray,color) pairs.  This array is
	   * gradient_num entries big.
	   * Interpolated tables are used if colorMode==SMPAL_COLOR_MODE_GRADIENT */
	  int gradient_num;
	  gradient_struct gradient;

	  /* the used color model: RGB, HSV, XYZ, etc. */
	  int cmodel;

	  /* Three mapping function for gray->RGB/HSV/XYZ/etc. mapping
	   * used if colorMode == SMPAL_COLOR_MODE_FUNCTIONS */
	  struct udft_entry Afunc;  /* R for RGB, H for HSV, C for CMY, ... */
	  struct udft_entry Bfunc;  /* G for RGB, S for HSV, M for CMY, ... */
	  struct udft_entry Cfunc;  /* B for RGB, V for HSV, Y for CMY, ... */

	  /* gamma for gray scale palettes only */
	  double gamma;
	} ;



	/* GLOBAL VARIABLES */

	extern t_sm_palette sm_palette;
	
}