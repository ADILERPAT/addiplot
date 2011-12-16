package com.addiPlot.gnuplot;

/* Defines one ticmark for TIC_USER style.
 * If label==NULL, the value is printed with the usual format string.
 * else, it is used as the format string (note that it may be a constant
 * string, like "high" or "low").
 */
public class ticmark
{
	public double position; // where on axis is this
	public String label; // optional (format) string label
	public int level; // 0=major tic, 1=minor tic
	public ticmark next; // linked list
}