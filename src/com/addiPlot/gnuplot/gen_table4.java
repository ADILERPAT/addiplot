package com.addiPlot.gnuplot;

/* Reader for the ESRF Header File format files (EDF / EHF).
 */

/* gen_table4 */
public class gen_table4
{
	public String key;
	public int value;
	public short signum; // 0..unsigned, 1..signed, 2..float or double
	public short sajzof; // sizeof on 32bit architecture
}