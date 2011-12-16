package com.addiPlot.gnuplot;

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define is_jump(operator) ((operator) >=(int)JUMP && (operator) <(int)SF_START)

/* user-defined function table entry */
public class udft_entry
{
	public udft_entry next_udf; // pointer to next udf in linked list
	public String udf_name; // name of this function entry
	public at_type at; // pointer to action table to execute
	public String definition; // definition of function as typed
	public int dummy_num; // required number of input variables
	public value[] dummy_values = new value[DefineConstants.MAX_NUM_VAR]; // current value of dummy variables
}