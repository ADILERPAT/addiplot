package com.addiPlot.gnuplot;

public class GlobalMembersGp_hist
{

	/* Variables of history.c needed by other modules: */

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern struct hist *history;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern struct hist *cur_entry;

	///#ifdef GNUPLOT_HISTORY
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int gnuplot_history_size;
	///#endif

	/* Prototypes of functions exported by history.c */

	/* GNU readline
	 * Only required by two files directly,
	 * so I don't put this into a header file. -lh
	 */
	///#ifdef HAVE_LIBREADLINE
	///#endif

	/* NetBSD editline
	 * (almost) compatible readline relacement
	 */
	///#if defined(HAVE_LIBEDITLINE)
	///#include <editline/readline.h>
	///#endif

	///#if defined(READLINE) && !defined(HAVE_LIBREADLINE) && !defined(HAVE_LIBEDITLINE)
	//void add_history __PROTO((char *line));
	//void write_history_n __PROTO((const int, const char *, const char *));
	//void write_history __PROTO((char *));
	//void read_history __PROTO((char *));
	//const char *history_find __PROTO((char *));
	//int history_find_all __PROTO((char *));
	///#elif defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void write_history_n(int NamelessParameter1, String NamelessParameter2, String NamelessParameter3);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//String history_find(String NamelessParameter);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int history_find_all(String NamelessParameter);
	///#endif // READLINE && !HAVE_LIBREADLINE 
}