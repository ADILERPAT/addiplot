package com.addiPlot.gnuplot;

/* to build up gradients:  whether it is really red, green and blue or maybe
 * hue saturation and value in col depends on cmodel */
public class gradient_struct
{
  public double pos;
  public rgb_color col = new rgb_color();
}