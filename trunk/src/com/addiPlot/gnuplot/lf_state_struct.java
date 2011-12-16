package com.addiPlot.gnuplot;

import java.io.File;

/* State information for load_file(), to recover from errors
 * and properly handle recursive load_file calls
 */
public class lf_state_struct
{
	public File fp; // file pointer for load file
	public String name; // name of file
	public boolean interactive; // value of interactive flag on entry
	public boolean do_load_arg_substitution; // likewise ...
	public int inline_num; // inline_num on entry
	public int depth; // recursion depth
	public String input_line; // Input line text to restore
	public lexical_unit tokens; // Input line tokens to restore
	public int num_tokens; // How big is the above ?
	public int c_token; // Which one were we on ?
	public lf_state_struct prev; // defines a stack
	public String[] call_args = new String[10]; // args when file is 'call'ed instead of 'load'ed
}