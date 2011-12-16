package com.addiPlot.gnuplot;

/* p-code argument */
//C++ TO JAVA CONVERTER TODO TASK: Unions are not supported in Java:
//ORIGINAL LINE: typedef union argument
public final class argument
{
	public int j_arg; // offset for jump
	public value v_arg = new value(); // constant value
	public udvt_entry udv_arg; // pointer to dummy variable
	public udft_entry udf_arg; // pointer to udf to execute
}