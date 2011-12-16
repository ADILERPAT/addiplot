package com.addiPlot.gnuplot;

/* standard/internal function table entry */
public class ft_entry
{
	public String f_name; // pointer to name of this function
	public FUNC_PTR func = new FUNC_PTR(); // address of function to call
}