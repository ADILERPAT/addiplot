package com.addiPlot.gnuplot;

public class GlobalMembersTerm_api
{

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern String arrow_head_names[4];

	/* Variables of term.c needed by other modules: */

	/* the terminal info structure, being the heart of the whole module */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern struct TERMENTRY *term;
	/* Options string of the currently used terminal driver */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte term_options[];
	/* access head length + angle without changing API */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int curr_arrow_headlength;
	/* angle in degrees */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double curr_arrow_headangle;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double curr_arrow_headbackangle;
	/* arrow head filled or not */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int curr_arrow_headfilled;

	/* Current 'output' file: name and open filehandle */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte *outstr;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern FILE *gpoutfile;

	/* Output file where the PostScript output goes to.
	   In particular:
		gppsfile == gpoutfile
			for 'set term': postscript, pstex
		gppsfile == PSLATEX_auxfile
			for 'set term': pslatex
		gppsfile == 0
			for all other terminals
	   It is non-zero for for the family of postscript terminals, thus making
	   this a unique check for postscript output (pm3d has some code optimized
	   for PS, for instance).
	*/
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern FILE *gppsfile;

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean multiplot;

	/* 'set encoding' support: index of current encoding ... */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern enum set_encoding_id encoding;
	/* ... in table of encoding names: */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern String encoding_names[];
	/* parsing table for encodings */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern const struct gen_table set_encoding_tbl[];

	/* mouse module needs this */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean term_initialised;

	/* Support for enhanced text mode. */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte enhanced_text[];
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte *enhanced_cur_text;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double enhanced_fontscale;
	/* give array size to allow the use of sizeof */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte enhanced_escape_format[16];
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean ignore_enhanced_text;


	/* Prototypes of functions exported by term.c */

//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void term_set_output(String NamelessParameter);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void term_initialise();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void term_start_plot();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void term_end_plot();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void term_start_multiplot();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void term_end_multiplot();
	/* void term_suspend __PROTO((void)); */
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void term_reset();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void term_apply_lp_properties(lp_style_type lp);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void term_check_multiplot_okay(boolean NamelessParameter);

//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void write_multiline(int NamelessParameter1, int NamelessParameter2, String NamelessParameter3, JUSTIFY NamelessParameter4, VERT_JUSTIFY NamelessParameter5, int NamelessParameter6, String NamelessParameter7);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int estimate_strlen(String NamelessParameter);
	///#if 0 // UNUSED
	////int term_count __PROTO((void));
	///#endif // UNUSED 
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void list_terms();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//String get_terminals_names();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//TERMENTRY set_term();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void init_terminal();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void test_term();

	/* Support for enhanced text mode. */
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//String enhanced_recursion(String p, boolean brace, String fontname, double fontsize, double base, boolean widthflag, boolean showflag, int overprint);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void enh_err_check(String str);
	/* note: c is char, but must be declared int due to K&R compatibility. */
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void do_enh_writec(int c);
	/* flag: don't use enhanced output methods --- for output of
	 * filenames, which usually looks bad using subscripts */
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void ignore_enhanced(boolean flag);

	/* Simple-minded test that point is with drawable area */
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//boolean on_page(int x, int y);

	/* Convert a fill style into a backwards compatible packed form */
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int style_from_fill(fill_style_type);

	///#ifdef EAM_OBJECTS
	/* Terminal-independent routine to draw a circle or arc */
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void do_arc(int cx, int cy, double radius, double arc_start, double arc_end, int style);
	///#endif

	///#ifdef LINUXVGA
	//void LINUX_setup __PROTO((void));
	///#endif

	///#ifdef PC
	//void PC_setup __PROTO((void));
	///#endif

	///#ifdef VMS
	//void vms_reset();
	///#endif

	///#ifdef OS2
	//int PM_pause __PROTO((char *));
	//void PM_intc_cleanup __PROTO((void));
	///#ifdef USE_MOUSE
	//void PM_update_menu_items __PROTO((void));
	//void PM_set_gpPMmenu __PROTO((struct t_gpPMmenu * gpPMmenu));
	///#endif
	///#endif

	/* in misc.c */
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void lp_use_properties(lp_style_type lp, int tag);

	/* Wrappers for term->path() */
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void newpath();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void closepath();
}