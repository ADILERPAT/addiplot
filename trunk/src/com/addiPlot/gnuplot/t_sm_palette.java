package com.addiPlot.gnuplot;

/*
  inverting the colour for negative picture (default is positive picture)
  (for pm3d.positive)
*/
///#define SMPAL_NEGATIVE 'n'
///#define SMPAL_POSITIVE 'p'


/* Declaration of smooth palette, i.e. palette for smooth colours */

public class t_sm_palette
{
  /** Constants: **/

  /* (Fixed) number of formulae implemented for gray index to RGB
   * mapping in color.c.  Usage: somewhere in `set' command to check
   * that each of the below-given formula R,G,B are lower than this
   * value. */
  public int colorFormulae;

  /** Values that can be changed by `set' and shown by `show' commands: **/

  /* can be SMPAL_COLOR_MODE_GRAY or SMPAL_COLOR_MODE_RGB */
  public palette_color_mode colorMode;
  /* mapping formulae for SMPAL_COLOR_MODE_RGB */
  public int formulaR;
  public int formulaG;
  public int formulaB;
  public byte positive; // positive or negative figure

  /* Now the variables that contain the discrete approximation of the
   * desired palette of smooth colours as created by make_palette in
   * pm3d.c.  This is then passed into terminal's make_palette, who
   * transforms this [0;1] into whatever it supports.  */

  /* Only this number of colour positions will be used even though
   * there are some more available in the discrete palette of the
   * terminal.  Useful for multiplot.  Max. number of colours is taken
   * if this value equals 0.  Unused by: PostScript */
  public int use_maxcolors;
  /* Number of colours used for the discrete palette. Equals to the
   * result from term->make_palette(NULL), or restricted by
   * use_maxcolor.  Used by: pm, gif. Unused by: PostScript */
  public int colors;
  /* Table of RGB triplets resulted from applying the formulae. Used
   * in the 2nd call to term->make_palette for a terminal with
   * discrete colours. Unused by PostScript which calculates them
   * analytically. */
  public rgb_color color;

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
  public byte ps_allcF;

  /* These variables are used to define interpolated color palettes:
   * gradient is an array if (gray,color) pairs.  This array is
   * gradient_num entries big.
   * Interpolated tables are used if colorMode==SMPAL_COLOR_MODE_GRADIENT */
  public int gradient_num;
  public gradient_struct gradient;

  /* the used color model: RGB, HSV, XYZ, etc. */
  public int cmodel;

  /* Three mapping function for gray->RGB/HSV/XYZ/etc. mapping
   * used if colorMode == SMPAL_COLOR_MODE_FUNCTIONS */
  public udft_entry Afunc = new udft_entry(); // R for RGB, H for HSV, C for CMY, ...
  public udft_entry Bfunc = new udft_entry(); // G for RGB, S for HSV, M for CMY, ...
  public udft_entry Cfunc = new udft_entry(); // B for RGB, V for HSV, Y for CMY, ...

  /* gamma for gray scale palettes only */
  public double gamma;
}