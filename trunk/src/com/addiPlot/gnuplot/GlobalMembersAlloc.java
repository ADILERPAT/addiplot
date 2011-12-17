package com.addiPlot.gnuplot;

public class GlobalMembersAlloc
{
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#1 "<built-in>"
	///#define __STDC__ 1
	///#define __STDC_HOSTED__ 1
	///#define __GNUC__ 4
	///#define __GNUC_MINOR__ 3
	///#define __GNUC_PATCHLEVEL__ 6
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __SIZE_TYPE__ long unsigned int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __PTRDIFF_TYPE__ long int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __WCHAR_TYPE__ int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __WINT_TYPE__ unsigned int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __INTMAX_TYPE__ long int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __UINTMAX_TYPE__ long unsigned int
	///#define __GXX_ABI_VERSION 1002
	///#define __SCHAR_MAX__ 127
	///#define __SHRT_MAX__ 32767
	///#define __INT_MAX__ 2147483647
	///#define __LONG_MAX__ 9223372036854775807L
	///#define __LONG_LONG_MAX__ 9223372036854775807LL
	///#define __WCHAR_MAX__ 2147483647
	///#define __CHAR_BIT__ 8
	///#define __INTMAX_MAX__ 9223372036854775807L
	///#define __FLT_EVAL_METHOD__ 0
	///#define __DEC_EVAL_METHOD__ 2
	///#define __FLT_RADIX__ 2
	///#define __FLT_MANT_DIG__ 24
	///#define __FLT_DIG__ 6
	///#define __FLT_MIN_EXP__ (-125)
	///#define __FLT_MIN_10_EXP__ (-37)
	///#define __FLT_MAX_EXP__ 128
	///#define __FLT_MAX_10_EXP__ 38
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __FLT_MAX__ 3.40282347e+38F
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __FLT_MIN__ 1.17549435e-38F
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __FLT_EPSILON__ 1.19209290e-7F
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __FLT_DENORM_MIN__ 1.40129846e-45F
	///#define __FLT_HAS_DENORM__ 1
	///#define __FLT_HAS_INFINITY__ 1
	///#define __FLT_HAS_QUIET_NAN__ 1
	///#define __DBL_MANT_DIG__ 53
	///#define __DBL_DIG__ 15
	///#define __DBL_MIN_EXP__ (-1021)
	///#define __DBL_MIN_10_EXP__ (-307)
	///#define __DBL_MAX_EXP__ 1024
	///#define __DBL_MAX_10_EXP__ 308
	///#define __DBL_MAX__ 1.7976931348623157e+308
	///#define __DBL_MIN__ 2.2250738585072014e-308
	///#define __DBL_EPSILON__ 2.2204460492503131e-16
	///#define __DBL_DENORM_MIN__ 4.9406564584124654e-324
	///#define __DBL_HAS_DENORM__ 1
	///#define __DBL_HAS_INFINITY__ 1
	///#define __DBL_HAS_QUIET_NAN__ 1
	///#define __LDBL_MANT_DIG__ 64
	///#define __LDBL_DIG__ 18
	///#define __LDBL_MIN_EXP__ (-16381)
	///#define __LDBL_MIN_10_EXP__ (-4931)
	///#define __LDBL_MAX_EXP__ 16384
	///#define __LDBL_MAX_10_EXP__ 4932
	///#define __DECIMAL_DIG__ 21
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __LDBL_MAX__ 1.18973149535723176502e+4932L
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __LDBL_MIN__ 3.36210314311209350626e-4932L
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __LDBL_EPSILON__ 1.08420217248550443401e-19L
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __LDBL_DENORM_MIN__ 3.64519953188247460253e-4951L
	///#define __LDBL_HAS_DENORM__ 1
	///#define __LDBL_HAS_INFINITY__ 1
	///#define __LDBL_HAS_QUIET_NAN__ 1
	///#define __DEC32_MANT_DIG__ 7
	///#define __DEC32_MIN_EXP__ (-95)
	///#define __DEC32_MAX_EXP__ 96
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC32_MIN__ 1E-95DF
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC32_MAX__ 9.999999E96DF
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC32_EPSILON__ 1E-6DF
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC32_DEN__ 0.000001E-95DF
	///#define __DEC64_MANT_DIG__ 16
	///#define __DEC64_MIN_EXP__ (-383)
	///#define __DEC64_MAX_EXP__ 384
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC64_MIN__ 1E-383DD
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC64_MAX__ 9.999999999999999E384DD
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC64_EPSILON__ 1E-15DD
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC64_DEN__ 0.000000000000001E-383DD
	///#define __DEC128_MANT_DIG__ 34
	///#define __DEC128_MIN_EXP__ (-6143)
	///#define __DEC128_MAX_EXP__ 6144
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC128_MIN__ 1E-6143DL
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC128_MAX__ 9.999999999999999999999999999999999E6144DL
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC128_EPSILON__ 1E-33DL
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC128_DEN__ 0.000000000000000000000000000000001E-6143DL
	///#define __REGISTER_PREFIX__
	///#define __USER_LABEL_PREFIX__
	///#define __VERSION__ "4.3.6"
	///#define __GNUC_GNU_INLINE__ 1
	///#define _LP64 1
	///#define __LP64__ 1
	///#define __OPTIMIZE__ 1
	///#define __FINITE_MATH_ONLY__ 0
	///#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_1 1
	///#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_2 1
	///#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_4 1
	///#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_8 1
	///#define __SIZEOF_INT__ 4
	///#define __SIZEOF_LONG__ 8
	///#define __SIZEOF_LONG_LONG__ 8
	///#define __SIZEOF_SHORT__ 2
	///#define __SIZEOF_FLOAT__ 4
	///#define __SIZEOF_DOUBLE__ 8
	///#define __SIZEOF_LONG_DOUBLE__ 16
	///#define __SIZEOF_SIZE_T__ 8
	///#define __SIZEOF_WCHAR_T__ 4
	///#define __SIZEOF_WINT_T__ 4
	///#define __SIZEOF_PTRDIFF_T__ 8
	///#define __SIZEOF_POINTER__ 8
	///#define __amd64 1
	///#define __amd64__ 1
	///#define __x86_64 1
	///#define __x86_64__ 1
	///#define __k8 1
	///#define __k8__ 1
	///#define __MMX__ 1
	///#define __SSE__ 1
	///#define __SSE2__ 1
	///#define __SSE_MATH__ 1
	///#define __SSE2_MATH__ 1
	///#define __gnu_linux__ 1
	///#define __linux 1
	///#define __linux__ 1
	///#define linux 1
	///#define __unix 1
	///#define __unix__ 1
	///#define unix 1
	///#define __ELF__ 1
	///#define __DECIMAL_BID_FORMAT__ 1
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#1 "<command-line>"
	///#define HAVE_CONFIG_H 1
	///#define BINDIR "/usr/local/bin"
	///#define X11_DRIVER_DIR "/usr/local/libexec/gnuplot/4.4"
	///#define GNUPLOT_PS_DIR "/usr/local/share/gnuplot/4.4/PostScript"
	///#define GNUPLOT_JS_DIR "/usr/local/share/gnuplot/4.4/js"
	///#define GNUPLOT_LUA_DIR "/usr/local/share/gnuplot/4.4/lua"
	///#define CONTACT "gnuplot-bugs@lists.sourceforge.net"
	///#define HELPFILE "/usr/local/share/gnuplot/4.4/gnuplot.gih"
	///#define GNUPLOT_X11 "gnuplot_x11"
	///#define XAPPLRESDIR "/etc/X11/app-defaults/"


	///#ifndef lint
	public static String RCSid()
	{
		return GlobalMembersAlloc.RCSid("$Id: alloc.c,v 1.12 2006/03/17 16:09:03 broeker Exp $");
	}
	///#endif

	/* GNUPLOT - alloc.c */

	/*[
	 * Copyright 1986 - 1993, 1998, 2004   Thomas Williams, Colin Kelley
	 *
	 * Permission to use, copy, and distribute this software and its
	 * documentation for any purpose with or without fee is hereby granted,
	 * provided that the above copyright notice appear in all copies and
	 * that both that copyright notice and this permission notice appear
	 * in supporting documentation.
	 *
	 * Permission to modify the software is granted, but not the right to
	 * distribute the complete modified source code.  Modifications are to
	 * be distributed as patches to the released version.  Permission to
	 * distribute binaries produced by compiling modified sources is granted,
	 * provided you
	 *   1. distribute the corresponding source modifications from the
	 *    released version in the form of a patch file along with the binaries,
	 *   2. add special version identification to distinguish your version
	 *    in addition to the base release version number,
	 *   3. provide your name and address as the primary contact for the
	 *    support of your modified version, and
	 *   4. retain our contact information in regard to use of the base
	 *    software.
	 * Permission to distribute the released version of the source code along
	 * with corresponding source modifications in the form of a patch file is
	 * granted with same provisions 2 through 4 for binary distributions.
	 *
	 * This software is provided "as is" without express or implied warranty
	 * to the extent permitted by applicable law.
	]*/

	/*
	 * AUTHORS
	 *
	 * Alexander Lehmann (collected functions from misc.c and binary.c)
	 *
	 */


	///#ifndef NO_GIH
	///#ifdef HAVE_CONFIG_H
	/* config.h.  Generated from config.hin by configure.  */
	/* config.hin.  Generated from configure.in by autoheader.  */

	/* Define to allow use of deprecated syntax and terminal behaviour. */
	/* #undef BACKWARDS_COMPATIBLE */

	/* Define if you want to use the CGI terminal under SCO. */
	/* #undef CGI */

	/* Define if you want online help and subtopic tables sorted by column. */
	/* #undef COLUMN_HELP */

	/* Define to treat spacebar like any other keystroke. */
	/* #undef DISABLE_SPACE_RAISES_CONSOLE */

	/* Contact address for modified and binary distributed gnuplot versions */
	/* #undef DIST_CONTACT */

	/* Define if you want to use libgrx20 with MSDOS/djgpp. */
	/* #undef DJSVGA */

	/* Define if this system uses a 32-bit DOS extender (djgpp/emx). */
	/* #undef DOS32 */

	/* Define to allow placement of rectangles and other objects */
	///#define EAM_OBJECTS 1

	/* Define if color information should be passed for each vertex. */
	/* #undef EXTENDED_COLOR_SPECS */

	/* Define if you want to supply pre-existing X11 windows. */
	///#define EXTERNAL_X11_WINDOW 1

	/* Define if <errno.h> declares errno. */
	/* #undef EXTERN_ERRNO */

	/* Define if libgd supports animated gifs. */
	///#define GIF_ANIMATION 1

	/* Define if you want to use the GNU version of the Unix plot library. */
	/* #undef GNUGRAPH */

	/* Define if you want to use a gnuplot history file. */
	///#define GNUPLOT_HISTORY 1

	/* Define to allow 'fit' to create parameter error variables. */
	///#define GP_FIT_ERRVARS 1

	/* Define to allow command line macros. */
	///#define GP_MACROS 1

	/* Define if you want to use a newer version of libgrx under MSDOS/djgpp. */
	/* #undef GRX21 */

	/* Define to 1 if you have the <3dkit.h> header file. */
	/* #undef HAVE_3DKIT_H */

	/* Define to 1 if you have the `atexit' function. */
	///#define HAVE_ATEXIT 1

	/* Define to 1 if you have the `bcopy' function. */
	///#define HAVE_BCOPY 1

	/* Define to 1 if you have the `bzero' function. */
	///#define HAVE_BZERO 1

	/* Define if you want the cairo-based terminals. */
	///#define HAVE_CAIROPDF 1

	/* Define to 1 if you have the declaration of `signgam', and to 0 if you
	   don't. */
	///#define HAVE_DECL_SIGNGAM 1

	/* Define to 1 if you have the <dirent.h> header file. */
	///#define HAVE_DIRENT_H 1

	/* Define to 1 if you have the `doprnt' function. */
	/* #undef HAVE_DOPRNT */

	/* Define to 1 if you have the <editline/readline.h> header file. */
	/* #undef HAVE_EDITLINE_READLINE_H */

	/* Define to 1 if you have the `erf' function. */
	///#define HAVE_ERF 1

	/* Define to 1 if you have the `erfc' function. */
	///#define HAVE_ERFC 1

	/* Define to 1 if you have the <errno.h> header file. */
	///#define HAVE_ERRNO_H 1

	/* Define to 1 if you have the <float.h> header file. */
	///#define HAVE_FLOAT_H 1

	/* Define to 1 if you have the `fork' function. */
	/* #undef HAVE_FORK */

	/* Define to 1 if you have the `gamma' function. */
	///#define HAVE_GAMMA 1

	/* Define if libgd supports gif. */
	///#define HAVE_GD_GIF 1

	/* Define to 1 if you have the <gd.h> header file. */
	///#define HAVE_GD_H 1

	/* Define if libgd supports jpeg. */
	///#define HAVE_GD_JPEG 1

	/* Define if libgd supports png. */
	///#define HAVE_GD_PNG 1

	/* Define if libgd supports TrueType fonts through libfreetype. */
	///#define HAVE_GD_TTF 1

	/* Define to 1 if you have the `getcwd' function. */
	///#define HAVE_GETCWD 1

	/* Define to 1 if you have the <ggi/wmh.h> header file. */
	/* #undef HAVE_GGI_WMH_H */

	/* Define to 1 if you have the <ggi/xmi.h> header file. */
	/* #undef HAVE_GGI_XMI_H */

	/* Define to use gtk/gdk tweaks */
	/* #undef HAVE_GTK */

	/* Define to use gtk+ functions to handle cairo */
	/* #undef HAVE_GTK28 */

	/* Define to 1 if you have the `index' function. */
	///#define HAVE_INDEX 1

	/* Define to 1 if you have the <inttypes.h> header file. */
	///#define HAVE_INTTYPES_H 1

	/* Define to 1 if you have the `isnan' function. */
	///#define HAVE_ISNAN 1

	/* Define if you use have kpsexpand (TeX). */
	/* #undef HAVE_KPSEXPAND */

	/* Define to 1 if you have the `lgamma' function. */
	///#define HAVE_LGAMMA 1

	/* Define to 1 if you're using the aquaterm library on Mac OS X */
	/* #undef HAVE_LIBAQUATERM */

	/* Define to 1 if you have the <libc.h> header file. */
	/* #undef HAVE_LIBC_H */

	/* Define if you are using the BSD editline library. */
	/* #undef HAVE_LIBEDITLINE */

	/* Define if you have gd library. */
	///#define HAVE_LIBGD 1

	/* Define to 1 if you have the `m' library (-lm). */
	///#define HAVE_LIBM 1

	/* Define to 1 if you have the `pdf' library (-lpdf). */
	/* #undef HAVE_LIBPDF */

	/* Define if your pdf library is too old to use PDF_begin_document. */
	/* #undef HAVE_LIBPDF_OPEN_FILE */

	/* Define if you are using the GNU readline library. */
	///#define HAVE_LIBREADLINE 1

	/* Define if you have zlib. */
	///#define HAVE_LIBZ 1

	/* Define to 1 if you have the <limits.h> header file. */
	///#define HAVE_LIMITS_H 1

	/* Define to 1 if you have the <locale.h> header file. */
	///#define HAVE_LOCALE_H 1

	/* Define if you want the lua/TikZ terminal. */
	/* #undef HAVE_LUA */

	/* Define to 1 if you have the <lua.h> header file. */
	/* #undef HAVE_LUA_H */

	/* Define to 1 if you have the <malloc.h> header file. */
	///#define HAVE_MALLOC_H 1

	/* Define to 1 if you have the <math.h> header file. */
	///#define HAVE_MATH_H 1

	/* Define to 1 if you have the `memcpy' function. */
	///#define HAVE_MEMCPY 1

	/* Define to 1 if you have the `memmove' function. */
	///#define HAVE_MEMMOVE 1

	/* Define to 1 if you have the <memory.h> header file. */
	///#define HAVE_MEMORY_H 1

	/* Define to 1 if you have the `memset' function. */
	///#define HAVE_MEMSET 1

	/* Define if your pdf library doesn't support dash patterns. */
	/* #undef HAVE_NODASH_LIBPDF */

	/* Define if your pdf library is too old to support patterns. */
	/* #undef HAVE_OLD_LIBPDF */

	/* Define to 1 if you have the `on_exit' function. */
	///#define HAVE_ON_EXIT 1

	/* Define to 1 if you have the `pclose' function. */
	///#define HAVE_PCLOSE 1

	/* Define to 1 if you have the <pdflib.h> header file. */
	/* #undef HAVE_PDFLIB_H */

	/* Define to 1 if you have the `poll' function. */
	///#define HAVE_POLL 1

	/* Define to 1 if you have the <poll.h> header file. */
	///#define HAVE_POLL_H 1

	/* Define to 1 if you have the `popen' function. */
	///#define HAVE_POPEN 1

	/* Define to 1 if you have the <readline/history.h> header file. */
	///#define HAVE_READLINE_HISTORY_H 1

	/* Define to 1 if you have the <readline/readline.h> header file. */
	///#define HAVE_READLINE_READLINE_H 1

	/* Define to 1 if you have the <readline/tilde.h> header file. */
	///#define HAVE_READLINE_TILDE_H 1

	/* Define to 1 if you have the `rindex' function. */
	///#define HAVE_RINDEX 1

	/* Define to 1 if you have the `select' function. */
	///#define HAVE_SELECT 1

	/* Define to 1 if you have the `setvbuf' function. */
	///#define HAVE_SETVBUF 1

	/* Define to 1 if you have the <sgtty.h> header file. */
	///#define HAVE_SGTTY_H 1

	/* Define if we have sigsetjmp(). */
	///#define HAVE_SIGSETJMP 1

	/* Define to 1 if you have the `sleep' function. */
	///#define HAVE_SLEEP 1

	/* Define to 1 if you have the `snprintf' function. */
	///#define HAVE_SNPRINTF 1

	/* Define to 1 if stdbool.h conforms to C99. */
	///#define HAVE_STDBOOL_H 1

	/* Define to 1 if you have the <stdint.h> header file. */
	///#define HAVE_STDINT_H 1

	/* Define to 1 if you have the <stdlib.h> header file. */
	///#define HAVE_STDLIB_H 1

	/* Define to 1 if you have the `stpcpy' function. */
	///#define HAVE_STPCPY 1

	/* Define to 1 if you have the `strcasecmp' function. */
	///#define HAVE_STRCASECMP 1

	/* Define to 1 if you have the `strchr' function. */
	///#define HAVE_STRCHR 1

	/* Define to 1 if you have the `strcspn' function. */
	///#define HAVE_STRCSPN 1

	/* Define to 1 if you have the `strdup' function. */
	///#define HAVE_STRDUP 1

	/* Define to 1 if you have the `strerror' function. */
	///#define HAVE_STRERROR 1

	/* Define to 1 if you have the `stricmp' function. */
	/* #undef HAVE_STRICMP */

	/* Define to 1 if cpp supports the ANSI # stringizing operator. */
	///#define HAVE_STRINGIZE 1

	/* Define to 1 if you have the <strings.h> header file. */
	///#define HAVE_STRINGS_H 1

	/* Define to 1 if you have the <string.h> header file. */
	///#define HAVE_STRING_H 1

	/* Define to 1 if you have the `strncasecmp' function. */
	///#define HAVE_STRNCASECMP 1

	/* Define to 1 if you have the `strnicmp' function. */
	/* #undef HAVE_STRNICMP */

	/* Define to 1 if you have the `strrchr' function. */
	///#define HAVE_STRRCHR 1

	/* Define to 1 if you have the `strstr' function. */
	///#define HAVE_STRSTR 1

	/* Define if math.h declares struct exception for matherr(). */
	///#define HAVE_STRUCT_EXCEPTION_IN_MATH_H 1

	/* Define to 1 if you have the `sysinfo' function. */
	///#define HAVE_SYSINFO 1

	/* Define to 1 if you have the <sys/bsdtypes.h> header file. */
	/* #undef HAVE_SYS_BSDTYPES_H */

	/* Define to 1 if you have the <sys/ioctl.h> header file. */
	///#define HAVE_SYS_IOCTL_H 1

	/* Define to 1 if you have the <sys/param.h> header file. */
	///#define HAVE_SYS_PARAM_H 1

	/* Define to 1 if you have the <sys/select.h> header file. */
	///#define HAVE_SYS_SELECT_H 1

	/* Define to 1 if you have the <sys/socket.h> header file. */
	///#define HAVE_SYS_SOCKET_H 1

	/* Define to 1 if you have the <sys/stat.h> header file. */
	///#define HAVE_SYS_STAT_H 1

	/* Define to 1 if you have the <sys/systeminfo.h> header file. */
	/* #undef HAVE_SYS_SYSTEMINFO_H */

	/* Define to 1 if you have the <sys/timeb.h> header file. */
	///#define HAVE_SYS_TIMEB_H 1

	/* Define to 1 if you have the <sys/time.h> header file. */
	///#define HAVE_SYS_TIME_H 1

	/* Define to 1 if you have the <sys/types.h> header file. */
	///#define HAVE_SYS_TYPES_H 1

	/* Define to 1 if you have the <sys/utsname.h> header file. */
	///#define HAVE_SYS_UTSNAME_H 1

	/* Define to 1 if you have the `tcgetattr' function. */
	///#define HAVE_TCGETATTR 1

	/* Define to 1 if you have the <termios.h> header file. */
	///#define HAVE_TERMIOS_H 1

	/* Define to 1 if you have the <time.h> header file. */
	///#define HAVE_TIME_H 1

	/* Define if time_t is declared in time.h. */
	///#define HAVE_TIME_T_IN_TIME_H 1

	/* Define to 1 if you have the <unistd.h> header file. */
	///#define HAVE_UNISTD_H 1

	/* Define to 1 if you have the `usleep' function. */
	///#define HAVE_USLEEP 1

	/* Define to 1 if you have the <values.h> header file. */
	///#define HAVE_VALUES_H 1

	/* Define to 1 if you have the `vfork' function. */
	/* #undef HAVE_VFORK */

	/* Define to 1 if you have the <vfork.h> header file. */
	/* #undef HAVE_VFORK_H */

	/* Define to 1 if you have the `vfprintf' function. */
	///#define HAVE_VFPRINTF 1

	/* Define to 1 if you have the <vgagl.h> header file. */
	/* #undef HAVE_VGAGL_H */

	/* Define to 1 if `fork' works. */
	/* #undef HAVE_WORKING_FORK */

	/* Define to 1 if `vfork' works. */
	/* #undef HAVE_WORKING_VFORK */

	/* Define to 1 if the system has the type `_Bool'. */
	///#define HAVE__BOOL 1

	/* Define to enable gridbox optimization in hidden3d code. */
	/* #undef HIDDEN3D_GRIDBOX */

	/* Define to enable quadtree optimization in hidden3d code. */
	///#define HIDDEN3D_QUADTREE 1

	/* Define to enable handling point size in hidden3d code. */
	///#define HIDDEN3D_VAR_PTSIZE 1

	/* Define if this is a Linux system with SuperVGA library. */
	/* #undef LINUXVGA */

	/* Define if you want to use the MGR Window system. */
	/* #undef MGR */

	/* Define if this is an MSDOS system. */
	/* #undef MSDOS */

	/* Define if you do not want to read .gnuplot in the current directory. */
	/* #undef NOCWDRC */

	/* Name of package */
	///#define PACKAGE "gnuplot"

	/* Define to the address where bug reports for this package should be sent. */
	///#define PACKAGE_BUGREPORT ""

	/* Define to the full name of this package. */
	///#define PACKAGE_NAME "gnuplot"

	/* Define to the full name and version of this package. */
	///#define PACKAGE_STRING "gnuplot 4.4.0"

	/* Define to the one symbol short name of this package. */
	///#define PACKAGE_TARNAME "gnuplot"

	/* Define to the home page for this package. */
	///#define PACKAGE_URL ""

	/* Define to the version of this package. */
	///#define PACKAGE_VERSION "4.4.0"

	/* Define if you do have the popen and pclose functions. */
	///#define PIPES 1

	/* Unix-type of Interprocess Communication is required for mouse support. */
	///#define PIPE_IPC 1

	/* Define to 1 if the C compiler supports function prototypes. */
	///#define PROTOTYPES 1

	/* Define if you want to use the included readline function. */
	/* #undef READLINE */

	/* Define as the return type of signal handlers (`int' or `void'). */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define RETSIGTYPE void

	/* Define if you want to use the Redwood Graphics Interface Protocol. */
	/* #undef RGIP */

	/* Define to the type of arg 1 for `select'. */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SELECT_TYPE_ARG1 int

	/* Define to the type of args 2, 3 and 4 for `select'. */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SELECT_TYPE_ARG234 (fd_set *)

	/* Define to the type of arg 5 for `select'. */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SELECT_TYPE_ARG5 (struct timeval *)

	/* Define to 1 if the `S_IS*' macros in <sys/stat.h> do not work properly. */
	/* #undef STAT_MACROS_BROKEN */

	/* Define to 1 if you have the ANSI C header files. */
	///#define STDC_HEADERS 1

	/* Define if you want to use the sunview terminal (sun). */
	/* #undef SUN */

	/* Define to use thin plate spines. */
	/* #undef THIN_PLATE_SPLINES_GRID */

	/* Define if the 3dkit libray is present. */
	/* #undef THREEDKIT */

	/* Define if you want to use the standard Unix plot library. */
	/* #undef UNIXPLOT */

	/* Define if you want to use the experimental ggi driver. */
	/* #undef USE_GGI_DRIVER */

	/* Define if you want to have mouse support in interactive terminals. */
	///#define USE_MOUSE 1

	/* Define to enable multi-byte font support for x11 */
	///#define USE_X11_MULTIBYTE 1

	/* Version number of package */
	///#define VERSION "4.4.0"

	/* Define if the vgagl libray is present. */
	/* #undef VGAGL */

	/* Define to allow zooming or refresh of volatile data. EXPERIMENTAL */
	///#define VOLATILE_REFRESH 1

	/* Define if you want the wxwidgets terminal. */
	/* #undef WXWIDGETS */

	/* Define if you are using the X11 window system. */
	///#define X11 1

	/* Define to 1 if the X Window System is missing or not being used. */
	/* #undef X_DISPLAY_MISSING */

	/* Define like PROTOTYPES; this can be used by system headers. */
	///#define __PROTOTYPES 1

	/* Define to empty if `const' does not conform to ANSI C. */
	/* #undef const */

	/* libgd versions < 1.8.4 need gdImageStringTTF rather than gdImageStringFT */
	/* #undef gdImageStringFT */

	/* Define to `__inline__' or `__inline' if that's what the C compiler
	   calls it, or to nothing if 'inline' is not supported under any name.  */
	///#ifndef __cplusplus
	/* #undef inline */
	///#endif

	/* Define to `int' if <sys/types.h> does not define. */
	/* #undef pid_t */

	/* Define to `unsigned int' if <sys/types.h> does not define. */
	/* #undef size_t */

	/* Define as `fork' if `vfork' does not work. */
	/* #undef vfork */

	///#endif
	///#if defined(AMIGA_SC_6_1) || defined(AMIGA_AC_5) || defined(__amigaos__)
	///#ifndef __amigaos__
	///#define OS "Amiga"
	///#define HELPFILE "S:gnuplot.gih"
	///#define HOME     "GNUPLOT"
	///#define SHELL    "NewShell"
	///#define DIRSEP2  ':'
	///#define PATHSEP  ';'
	///#endif
	///#ifndef AMIGA
	///#define AMIGA
	///#endif
	///#ifdef AMIGA_SC_6_1
	///#define S_IFIFO S_IREAD
	///#endif
	///#endif // Amiga 
	///#ifdef DOS386
	///#define OS       "DOS 386"
	///#define HELPFILE "gnuplot.gih"
	///#define HOME     "GNUPLOT"
	///#define PLOTRC   "gnuplot.ini"
	///#define SHELL    "\\command.com"
	///#define DIRSEP1  '\\'
	///#define PATHSEP  ';'
	///#endif // DOS386 
	///#if defined(__NeXT__) || defined(NEXT)
	///#ifndef NEXT
	///#define NEXT
	///#endif
	///#endif // NeXT 
	///#ifdef OS2
	///#define OS       "OS/2"
	///#define HELPFILE "gnuplot.gih"
	///#define HOME     "GNUPLOT"
	///#define PLOTRC   "gnuplot.ini"
	///#define SHELL    "c:\\os2\\cmd.exe"
	///#define DIRSEP1  '\\'
	///#define PATHSEP  ';'
	///#define GNUPLOT_HISTORY_FILE "~\\gnuplot_history"
	///#endif // OS/2 
	///#ifdef OSK
	///#define OS    "OS-9"
	///#define SHELL "/dd/cmds/shell"
	///#endif // OS-9 
	///#if defined(vms) || defined(VMS)
	///#define OS "VMS"
	///#ifndef VMS
	///#define VMS
	///#endif
	///#define HOME   "sys$login:"
	///#define PLOTRC "gnuplot.ini"
	///#ifdef NO_GIH
	///#define HELPFILE "GNUPLOT$HELP"
	///#endif
	///#if !defined(VAXCRTL) && !defined(DECCRTL)
	///#define VAXCRTL VAXCRTL_AND_DECCRTL_UNDEFINED
	///#define DECCRTL VAXCRTL_AND_DECCRTL_UNDEFINED
	///#endif
	///#ifdef __DECC
	///#include <starlet.h>
	///#endif  // __DECC 
	///#endif // VMS 
	///#if defined(_WINDOWS) || defined(_Windows)
	///#ifndef _Windows
	///#define _Windows
	///#endif
	///#ifdef WIN32
	///#define OS "MS-Windows 32 bit"
	///#define far
	///#define S_IFIFO  _S_IFIFO
	///#else
	///#define OS "MS-Windows"
	///#ifndef WIN16
	///#define WIN16
	///#endif
	///#endif // WIN32 
	///#define HOME    "GNUPLOT"
	///#define PLOTRC  "gnuplot.ini"
	///#define SHELL   "\\command.com"
	///#define DIRSEP1 '\\'
	///#define PATHSEP ';'
	///#define GNUPLOT_HISTORY_FILE "~\\gnuplot_history"
	///#endif // _WINDOWS 
	///#if defined(MSDOS) && !defined(_Windows)
	///#if !defined(DOS32) && !defined(DOS16)
	///#define DOS16
	///#endif
	///#define OS       "MS-DOS"
	///#define HELPFILE "gnuplot.gih"
	///#define HOME     "GNUPLOT"
	///#define PLOTRC   "gnuplot.ini"
	///#define SHELL    "\\command.com"
	///#define DIRSEP1  '\\'
	///#define PATHSEP  ';'
	///#ifdef __DJGPP__
	///#define DIRSEP2 '/'
	///#endif
	///#define GNUPLOT_HISTORY_FILE "~\\gnuplot.his"
	///#endif // MSDOS 
	///#ifndef OS
	///#define OS "non-recognized OS"
	///#endif
	///#ifndef HELPFILE
	///#define HELPFILE "docs/gnuplot.gih"
	///#endif
	///#ifndef HOME
	///#define HOME "HOME"
	///#endif
	///#ifndef PLOTRC
	///#define PLOTRC ".gnuplot"
	///#endif
	///#ifndef SHELL
	///#define SHELL "/bin/sh"
	///#endif
	///#ifndef DIRSEP1
	///#define DIRSEP1 '/'
	///#endif
	///#ifndef DIRSEP2
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DIRSEP2 NUL
	///#endif
	///#ifndef PATHSEP
	///#define PATHSEP ':'
	///#endif
	///#ifdef PROTOTYPES
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __PROTO(proto) proto
	///#else
	///#define __PROTO(proto) ()
	///#endif
	///#if defined(MSDOS) || defined(DOS386)
	///#ifdef DJGPP
	///#include <dos.h>
	///#include <dir.h>              // HBB: for setdisk() 
	///#else
	///#include <process.h>
	///#endif                         // !DJGPP 
	///#ifdef __ZTC__
	///#define HAVE_SLEEP 1
	///#define P_WAIT 0
	///#elif defined(__TURBOC__)
	///#include <dos.h>		// for sleep() prototype 
	///#ifndef _Windows
	///#define HAVE_SLEEP 1
	///#include <conio.h>
	///#include <dir.h>            // setdisk() 
	///#endif                       // _Windows 
	///#ifdef WIN32
	///#define HAVE_SLEEP 1
	///#endif
	///#else                         // must be MSC 
	///#if !defined(__EMX__) && !defined(DJGPP)
	///#ifdef __MSC__
	///#include <direct.h>        // for _chdrive() 
	///#endif                      // __MSC__ 
	///#endif                       // !__EMX__ && !DJGPP 
	///#endif                        // !ZTC 
	///#endif // MSDOS 
	///#ifdef __WATCOMC__
	///#include <direct.h>
	///#include <dos.h>
	///#define HAVE_GETCWD 1
	///#define GP_EXCEPTION_NAME _exception
	///#endif
	///#ifdef apollo
	///#ifndef APOLLO
	///#define APOLLO
	///#endif
	///#define GPR
	///#endif
	///#if defined(APOLLO) || defined(alliant)
	///#endif
	///#ifdef sequent
	///#endif
	///#ifdef unixpc
	///#ifndef UNIXPC
	///#define UNIXPC
	///#endif
	///#endif
	///#if (defined(__TURBOC__) && defined(MSDOS)) || defined(WIN16)
	///#define GPHUGE huge
	///#define GPFAR far
	///#else // not TurboC || WIN16 
	///#define GPHUGE
	///#define GPFAR
	///#endif // not TurboC || WIN16 
	///#if defined(DOS16) || defined(WIN16)
	///#define COORDVAL_FLOAT 1
	///#else
	///#endif
	///#ifdef DOS16
	///#define MAX_NUM_VAR	3
	///#else
	///#define MAX_NUM_VAR 12
	///#endif
	///#ifdef VMS
	///#define DEFAULT_COMMENTS_CHARS "#!"
	///#define is_system(c) ((c) == '$')
	///#define BACKUP_FILESYSTEM 1
	///#else // not VMS 
	///#define DEFAULT_COMMENTS_CHARS "#"
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define is_system(c) ((c) == '!')
	///#endif // not VMS 
	///#ifndef RETSIGTYPE
	///#define RETSIGTYPE void
	///#endif
	///#ifndef SIGFUNC_NO_INT_ARG
	///#else
	///#endif
	///#ifdef HAVE_SIGSETJMP
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SETJMP(env, save_signals) sigsetjmp(env, save_signals)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define LONGJMP(env, retval) siglongjmp(env, retval)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define JMP_BUF sigjmp_buf
	///#else
	///#define SETJMP(env, save_signals) setjmp(env)
	///#define LONGJMP(env, retval) longjmp(env, retval)
	///#define JMP_BUF jmp_buf
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define generic void
	///#ifndef SORTFUNC_ARGS
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SORTFUNC_ARGS const generic *
	///#endif
	///#ifdef HAVE_STRINGIZE
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CONCAT(x,y) x##y
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CONCAT3(x,y,z) x##y##z
	///#else
	///#define CONCAT(x,y) x//
	///#define CONCAT3(x,y,z) x//
	///#endif
	///#if defined(_Windows) && !defined(WINDOWS_NO_GUI)
	///#include "win/wtext.h"
	///#endif
	///#ifndef GP_EXCEPTION_NAME
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_EXCEPTION_NAME exception
	///#endif
	///#ifndef GP_MATHERR
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_MATHERR matherr
	///#endif
	///#ifdef HAVE_STRUCT_EXCEPTION_IN_MATH_H
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define STRUCT_EXCEPTION_P_X struct GP_EXCEPTION_NAME *x
	///#else
	///#define STRUCT_EXCEPTION_P_X // nothing 
	///#endif
	///#ifndef GP_INLINE
	///#ifdef __GNUC__
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_INLINE __inline__
	///#else
	///#define GP_INLINE //nothing
	///#endif
	///#endif
	///#if HAVE_STDBOOL_H
	///#else
	///#if ! HAVE__BOOL
	///#ifdef __cplusplus
	///#else
	///#endif
	///#endif
	///#define bool _Bool
	///#define false 0
	///#define true 1
	///#define __bool_true_false_are_defined 1
	///#endif
	///#if defined(__SUNPRO_CC) && !defined(bool)
	///#define bool unsigned char
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define TRUE true
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FALSE false
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define TBOOLEAN bool
	///#define MAX_ID_LEN 50
	///#define MAX_LINE_LEN 1024
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEG2RAD (M_PI / 180.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_COLOR ylow
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_R yhigh
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_G xlow
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_B xhigh
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_A ylow
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_PTSIZE xlow
	///#if 0
	///#endif
	///#if defined(WIN16) || (defined(MSDOS) && defined(__TURBOC__))
	///#endif
	///#define H_FOUND 0
	///#define H_NOTFOUND 1
	///#define H_ERROR (-1)
	///#endif
	///#ifdef HAVE_STRING_H
	///#else
	///#include <strings.h>
	///#endif
	///#ifdef HAVE_BCOPY
	///#ifndef HAVE_MEMCPY
	///#define memcpy(d,s,n) bcopy((s),(d),(n))
	///#endif
	///#ifndef HAVE_MEMMOVE
	///#define memmove(d,s,n) bcopy((s),(d),(n))
	///#endif
	///#else
	///#ifndef HAVE_MEMCPY
	///#endif
	///#endif // HAVE_BCOPY 
	///#ifndef HAVE_STRCHR
	///#ifdef strchr
	///#endif
	///#ifdef HAVE_INDEX
	///#define strchr index
	///#else
	///#endif
	///#ifdef strrchr
	///#endif
	///#ifdef HAVE_RINDEX
	///#define strrchr rindex
	///#endif
	///#endif
	///#ifndef HAVE_STRCSPN
	///#define strcspn gp_strcspn
	///#endif
	///#ifndef HAVE_STRSTR
	///#endif
	///#ifndef HAVE_STDLIB_H
	///#ifdef HAVE_MALLOC_H
	///#include <malloc.h>
	///#else
	///#endif // HAVE_MALLOC_H 
	///#else // HAVE_STDLIB_H 
	///#ifndef VMS
	///#ifndef EXIT_FAILURE
	///#define EXIT_FAILURE (1)
	///#endif
	///#ifndef EXIT_SUCCESS
	///#define EXIT_SUCCESS (0)
	///#endif
	///#else // VMS 
	///#ifdef VAXC            // replacement values suppress some messages 
	///#ifdef  EXIT_FAILURE
	///#endif
	///#ifdef  EXIT_SUCCESS
	///#endif
	///#endif // VAXC 
	///#ifndef  EXIT_FAILURE
	///#define EXIT_FAILURE  0x10000002
	///#endif
	///#ifndef  EXIT_SUCCESS
	///#define EXIT_SUCCESS  1
	///#endif
	///#endif // VMS 
	///#endif // HAVE_STDLIB_H 
	///#if defined(HAVE_VFPRINTF) || defined(HAVE_DOPRNT)
	///#ifdef STDC_HEADERS
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define VA_START(args, lastarg) va_start(args, lastarg)
	///#else
	///#include <varargs.h>
	///#define VA_START(args, lastarg) va_start(args)
	///#endif // !STDC_HEADERS 
	///#else // HAVE_VFPRINTF || HAVE_DOPRNT 
	///#define va_dcl char *a1, char *a2, char *a3, char *a4, char *a5, char *a6, char *a7, char *a8
	///#endif // !(HAVE_VFPRINTF || HAVE_DOPRNT) 
	///#ifdef HAVE_UNISTD_H
	///#else
	///#ifdef HAVE_LIBC_H // NeXT uses libc instead of unistd 
	///#include <libc.h>
	///#endif
	///#endif // HAVE_UNISTD_H 
	///#ifdef HAVE_ERRNO_H
	///#endif
	///#ifdef EXTERN_ERRNO
	///#endif
	///#ifndef HAVE_STRERROR
	///#endif
	///#ifdef HAVE_SYS_TYPES_H
	///#endif
	///#ifdef HAVE_SYS_STAT_H
	///#if !S_IRUSR
	///#if S_IREAD
	///#define S_IRUSR S_IREAD
	///#else
	///#define S_IRUSR 00400
	///#endif
	///#endif
	///#if !S_IWUSR
	///#if S_IWRITE
	///#define S_IWUSR S_IWRITE
	///#else
	///#define S_IWUSR 00200
	///#endif
	///#endif
	///#if !S_IXUSR
	///#if S_IEXEC
	///#define S_IXUSR S_IEXEC
	///#else
	///#define S_IXUSR 00100
	///#endif
	///#endif
	///#ifdef STAT_MACROS_BROKEN
	///#endif // STAT_MACROS_BROKEN.  
	///#if !defined(S_ISBLK) && defined(S_IFBLK)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISBLK(m) (((m) & S_IFMT) == S_IFBLK)
	///#endif
	///#if !defined(S_ISCHR) && defined(S_IFCHR)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISCHR(m) (((m) & S_IFMT) == S_IFCHR)
	///#endif
	///#if !defined(S_ISDIR) && defined(S_IFDIR)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISDIR(m) (((m) & S_IFMT) == S_IFDIR)
	///#endif
	///#if !defined(S_ISREG) && defined(S_IFREG)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISREG(m) (((m) & S_IFMT) == S_IFREG)
	///#endif
	///#if !defined(S_ISFIFO) && defined(S_IFIFO)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISFIFO(m) (((m) & S_IFMT) == S_IFIFO)
	///#endif
	///#if !defined(S_ISLNK) && defined(S_IFLNK)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISLNK(m) (((m) & S_IFMT) == S_IFLNK)
	///#endif
	///#if !defined(S_ISSOCK) && defined(S_IFSOCK)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISSOCK(m) (((m) & S_IFMT) == S_IFSOCK)
	///#endif
	///#if !defined(S_ISMPB) && defined(S_IFMPB) // V7
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISMPB(m) (((m) & S_IFMT) == S_IFMPB)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISMPC(m) (((m) & S_IFMT) == S_IFMPC)
	///#endif
	///#if !defined(S_ISNWK) && defined(S_IFNWK) // HP/UX
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISNWK(m) (((m) & S_IFMT) == S_IFNWK)
	///#endif
	///#endif // HAVE_SYS_STAT_H 
	///#ifdef HAVE_LIMITS_H
	///#else
	///#ifdef HAVE_VALUES_H
	///#include <values.h>
	///#endif // HAVE_VALUES_H 
	///#endif // HAVE_LIMITS_H 
	///#ifdef HAVE_TIME_H
	///#endif
	///#ifndef HAVE_TIME_T_IN_TIME_H
	///#define time_t long
	///#endif
	///#if defined(PIPES) && (defined(VMS) || (defined(OSK) && defined(_ANSI_EXT))) || defined(PIPES) && defined(AMIGA_SC_6_1)
	///#endif
	///#ifdef HAVE_FLOAT_H
	///#endif
	///#ifndef DBL_EPSILON
	///#define DBL_EPSILON 2.2204460492503131E-16
	///#endif
	///#ifdef HAVE_LOCALE_H
	///#endif
	///#ifdef HAVE_MATH_H
	///#endif
	///#ifndef M_PI
	///#define M_PI 3.14159265358979323846
	///#endif
	///#ifndef M_PI_2
	///#define M_PI_2 1.57079632679489661923
	///#endif
	///#ifndef M_LN10
	///#define M_LN10 2.3025850929940456840e0
	///#endif
	///#if defined(DBL_MIN_10_EXP)
	///#define E_MINEXP (DBL_MIN_10_EXP * M_LN10)
	///#endif
	///#if defined(DBL_MAX_10_EXP)
	///#define E_MAXEXP (DBL_MAX_10_EXP * M_LN10)
	///#endif
	///#ifndef HAVE_STRCASECMP
	///#ifdef HAVE_STRICMP
	///#define strcasecmp stricmp
	///#else
	///#define strcasecmp gp_stricmp
	///#endif
	///#endif
	///#ifndef HAVE_STRNCASECMP
	///#ifdef HAVE_STRNICMP
	///#define strncasecmp strnicmp
	///#else
	///#define strncasecmp gp_strnicmp
	///#endif
	///#endif
	///#ifndef GP_GETCWD
	///#if defined(HAVE_GETCWD)
	///#if defined(__EMX__)
	///#define GP_GETCWD(path,len) _getcwd2 (path, len)
	///#else
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_GETCWD(path,len) getcwd (path, len)
	///#endif // __EMX__ 
	///#else
	///#define GP_GETCWD(path,len) getwd (path)
	///#endif
	///#endif
	///#ifdef WIN32
	///#include <windows.h>
	///#endif
	///#if defined(HAVE_USLEEP)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_SLEEP(delay) usleep((unsigned int) ((delay)*1e6))
	///#elif defined(__EMX__)
	///#define GP_SLEEP(delay) _sleep2((unsigned int) ((delay)*1e3))
	///#ifndef HAVE_SLEEP
	///#define HAVE_SLEEP
	///#endif
	///#elif defined(WIN32)
	///#define GP_SLEEP(delay) win_sleep((DWORD) 1000*delay)
	///#ifndef HAVE_SLEEP
	///#define HAVE_SLEEP
	///#endif
	///#endif
	///#ifndef GP_SLEEP
	///#ifdef __ZTC__
	///#define GP_SLEEP(delay) usleep ((unsigned long) (delay+0.5))
	///#else
	///#define GP_SLEEP(delay) sleep ((unsigned int) (delay+0.5))
	///#endif
	///#endif
	///#ifdef HAVE_ATEXIT
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_ATEXIT(x) atexit((x))
	///#elif defined(HAVE_ON_EXIT)
	///#define GP_ATEXIT(x) on_exit((x),0)
	///#else
	///#define GP_ATEXIT(x) // you lose 
	///#endif
	///#define NUL ('\0')
	///#ifdef DEBUG
	///#define DEBUG_WHERE do { fprintf(stderr,"%s:%d ",__FILE__,__LINE__); } while (0)
	///#define FPRINTF(a) do { DEBUG_WHERE; fprintf a; } while (0)
	///#else
	///#define DEBUG_WHERE
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FPRINTF(a)
	///#endif // DEBUG 
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define INT_STR_LEN (3*sizeof(int))
	///#if defined ( NEXT ) && NX_CURRENT_COMPILER_RELEASE<310
	///#if defined ( DBL_MAX)
	///#endif
	///#define DBL_MAX 1.7976931348623157e+308
	///#define HUGE    DBL_MAX
	///#define HUGE_VAL DBL_MAX
	///#endif // NEXT && NX_CURRENT_COMPILER_RELEASE<310 
	///#ifndef COORDVAL_FLOAT
	///#ifdef DBL_MAX
	///#define VERYLARGE (DBL_MAX/2-1)
	///#endif
	///#else // COORDVAL_FLOAT 
	///#ifdef FLT_MAX
	///#define VERYLARGE (FLT_MAX/2-1)
	///#endif
	///#endif // COORDVAL_FLOAT 
	///#ifndef VERYLARGE
	///#ifdef HUGE
	///#define VERYLARGE (HUGE/2-1)
	///#elif defined(HUGE_VAL)
	///#define VERYLARGE (HUGE_VAL/2-1)
	///#else
	///#define VERYLARGE (1e37)
	///#endif // HUGE 
	///#endif // VERYLARGE 
	///#ifdef HAVE_SYS_PARAM_H
	///#endif
	///#ifndef PATH_MAX
	///#ifndef MAXPATHLEN
	///#define PATH_MAX 1024
	///#else
	///#define PATH_MAX MAXPATHLEN
	///#endif
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PATH_CONCAT(path,file) { char *p = path; p += strlen(path); if (p!=path) p--; if (*p && (*p != DIRSEP1) && (*p != DIRSEP2)) { if (*p) p++; *p++ = DIRSEP1; *p = NUL; } strcat (path, file); }
	///#ifndef inrange
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define inrange(z,min,max) (((min)<(max)) ? (((z)>=(min)) && ((z)<=(max))) : (((z)>=(max)) && ((z)<=(min))))
	///#endif
	///#ifndef cliptorange
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define cliptorange(z,min,max) do { if ((min) < (max)) { if ((z) > (max)) (z) = (max); else if ((z) < (min)) (z) = (min); } else { if ((z) > (min)) (z) = (min); else if ((z) < (max)) (z) = (max); } } while (0)
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GPMAX(a,b) ( (a) > (b) ? (a) : (b) )
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GPMIN(a,b) ( (a) < (b) ? (a) : (b) )
	///#ifndef HAVE_SLEEP
	///#endif
	///#define NO_CARET (-1)
	///#define DATAFILE (-2)
	///#if 0 // UNUSED
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define isstringvalue(c_token) (isstring(c_token) || type_udv(c_token)==STRING)
	///#if defined(VA_START) && defined(STDC_HEADERS)
	///#else
	///#endif

	///#if defined(MSDOS) && defined(__TURBOC__) && !defined(DOSX286)
	///#include <alloc.h>		// for farmalloc, farrealloc 
	///#endif

	///#if defined(_Windows) && !defined(WIN32)
	///#include <windows.h>
	///#include <windowsx.h>
	///#define farmalloc(s) GlobalAllocPtr(GHND,s)
	///#define farrealloc(p,s) GlobalReAllocPtr(p,s,GHND)
	///#endif



	///#ifndef GP_FARMALLOC
	///#ifdef FARALLOC
	///#define GP_FARMALLOC(size) farmalloc ((size))
	///#define GP_FARREALLOC(p,size) farrealloc ((p), (size))
	///#else
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_FARMALLOC(size) malloc ((size_t)(size))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_FARREALLOC(p,size) realloc ((p), (size_t)(size))
	///#endif
	///#endif

	/* uncomment if you want to trace all allocs */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define TRACE_ALLOC(x)


	///#ifdef CHECK_HEAP_USE
	//
	// /* This is in no way supported, and in particular it breaks the
	//  * online help. But it is useful to leave it in in case any
	//  * heap-corruption bugs turn up. Wont work with FARALLOC
	//  */
	//
	//struct frame_struct {
	//    char *use;
	//    int requested_size;
	//    int pad;			// preserve 8-byte alignment 
	//    int checksum;
	//};
	//
	//struct leak_struct {
	//    char *file;
	//    int line;
	//    int allocated;
	//};
	//
	//static struct leak_struct leak_stack[40];	// up to 40 nested leak checks 
	//static struct leak_struct *leak_frame = leak_stack;
	//
	//static long bytes_allocated = 0;
	//
	///#define RESERVED_SIZE sizeof(struct frame_struct)
	///#define CHECKSUM_INT 0xcaac5e1f
	///#define CHECKSUM_FREE 0xf3eed222
	///#define CHECKSUM_CHAR 0xc5
	//
	//static void
	//mark(struct frame_struct *p, unsigned long size, char *usage)
	//{
	//    p->use = usage;
	//    p->requested_size = size;
	//    p->checksum = (CHECKSUM_INT ^ (int) (p->use) ^ size);
	//    ((unsigned char *) (p + 1))[size] = CHECKSUM_CHAR;
	//}
	//
	///#define mark_free(p) ( ((struct frame_struct *)p)[-1].checksum = CHECKSUM_FREE)
	//
	//static void
	//validate(generic *x)
	//{
	//    struct frame_struct *p = (struct frame_struct *) x - 1;
	//    if (p->checksum != (CHECKSUM_INT ^ (int) (p->use) ^ p->requested_size)) {
	//	fprintf(stderr, "Heap corruption at start of block for %s\n", p->use);
	//	if (p->checksum == CHECKSUM_FREE)
	//	    fprintf(stderr, "Looks like it has already been freed ?\n");
	//	abort();
	//    }
	//    if (((unsigned char *) (p + 1))[p->requested_size] != CHECKSUM_CHAR) {
	//	fprintf(stderr, "Heap corruption at end of block for %-60s\n", p->use);
	//	int_error(NO_CARET, "Argh !");
	//    }
	//}
	//
	// /* used to confirm that a pointer is inside an allocated region via
	//  * macro CHECK_POINTER. Nowhere near as good as using a bounds-checking
	//  * compiler (such as gcc-with-bounds-checking), but when we do
	//  * come across problems, we can add these guards to the code until
	//  * we find the problem, and then leave the guards in (as CHECK_POINTER
	//  * macros which expand to nothing, until we need to re-enable them)
	//  */
	//
	//void
	//check_pointer_in_block(generic *block, generic *p, int size, char *file, int line)
	//{
	//    struct frame_struct *f = (struct frame_struct *) block - 1;
	//    validate(block);
	//    if (p < block || p >= (block + f->requested_size)) {
	//	fprintf(stderr, "argh - pointer %p outside block %p->%p for %s at %s:%d\n",
	//		p, block, (char *) block + f->requested_size, f->use, file, line);
	//	int_error(NO_CARET, "argh - pointer misuse !");
	//    }
	//}
	//
	//generic *
	//gp_alloc(size_t size, const char *usage)
	//{
	//    struct frame_struct *p;
	//    size_t total_size = size + RESERVED_SIZE + 1;
	//
	//    TRACE_ALLOC(("gp_alloc %d for %s\n", (int) size,
	//		 usage ? usage : "<unknown>"));
	//
	//    p = malloc(total_size);
	//    if (!p)
	//	int_error(NO_CARET, "Out of memory");
	//
	//    bytes_allocated += size;
	//
	//    mark(p, size, usage);
	//
	// /* Cast possibly needed for K&R compilers */
	//    return (generic *) (p + 1);
	//}
	//
	//generic *
	//gp_realloc(generic *old, size_t size, const char *usage)
	//{
	//    if (!old)
	//	return gp_alloc(size, usage);
	//    validate(old);
	// /* if block gets moved, old block is marked free.  If not, we'll
	//  * remark it later */
	//    mark_free(old);		
	//
	//    {
	//	struct frame_struct *p = (struct frame_struct *) old - 1;
	//	size_t total = size + RESERVED_SIZE + 1;
	//
	//	p = realloc(p, total);
	//
	//	if (!p)
	//	    int_error(NO_CARET, "Out of memory");
	//
	//	TRACE_ALLOC(("gp_realloc %d for %s (was %d)\n", (int) size,
	//		     usage ? usage : "<unknown>", p->requested_size));
	//
	//	bytes_allocated += size - p->requested_size;
	//
	//	mark(p, size, usage);
	//
	//	return (generic *) (p + 1);
	//    }
	//}
	//
	///#undef free
	//
	//void
	//checked_free(generic *p)
	//{
	//    struct frame_struct *frame;
	//
	//    validate(p);
	//    mark_free(p);		// trap attempts to free twice 
	//    frame = (struct frame_struct *) p - 1;
	//    TRACE_ALLOC(("free %d for %s\n",
	//		 frame->requested_size,
	//		 (frame->use ? frame->use : "(NULL)")));
	//    bytes_allocated -= frame->requested_size;
	//    free(frame);
	//}
	//
	//
	// /* this leak checking stuff will be broken by first int_error or interrupt */
	//
	//void
	//start_leak_check(char *file, int line)
	//{
	//    if (leak_frame >= leak_stack + 40) {
	//	fprintf(stderr, "too many nested memory-leak checks - %s:%d\n",
	//		file, line);
	//	return;
	//    }
	//    leak_frame->file = file;
	//    leak_frame->line = line;
	//    leak_frame->allocated = bytes_allocated;
	//
	//    ++leak_frame;
	//}
	//
	//void
	//end_leak_check(char *file, int line)
	//{
	//    if (--leak_frame < leak_stack) {
	//	fprintf(stderr, "memory-leak stack underflow at %s:%d\n", file, line);
	//	return;
	//    }
	//    if (leak_frame->allocated != bytes_allocated) {
	//	fprintf(stderr,
	//		"net change of %+d heap bytes between %s:%d and %s:%d\n",
	//		(int) (bytes_allocated - leak_frame->allocated),
	//		leak_frame->file, leak_frame->line, file, line);
	//    }
	//}
	//
	///#else // CHECK_HEAP_USE 

	/* gp_alloc:
	 * allocate memory
	 * This is a protected version of malloc. It causes an int_error
	 * if there is not enough memory, but first it tries FreeHelp()
	 * to make some room, and tries again. If message is NULL, we
	 * allow NULL return. Otherwise, we handle the error, using the
	 * message to create the int_error string. Note cp/sp_extend uses realloc,
	 * so it depends on this using malloc().
	 */

	public static Object gp_alloc(int size, String message)
	{
		String p; // the new allocation

		///#ifndef NO_GIH
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = malloc((int)(size));
		if (p.equals((String) null))
		{
			GlobalMembersBf_test.FreeHelp(); // out of memory, try to make some room
			///#endif // NO_GIH 
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = malloc((int)(size));
			if (p == null)
			{
				/* really out of memory */
				if (message != null)
				{
					GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "out of memory for %s", message);
					/* NOTREACHED */
				}
				/* else we return NULL */
			}
			///#ifndef NO_GIH
		}
		///#endif
		return (p);
	}

	/*
	 * note gp_realloc assumes that failed realloc calls leave the original mem
	 * block allocated. If this is not the case with any C compiler, a substitue
	 * realloc function has to be used.
	 */

	public static Object gp_realloc(Object p, int size, String message)
	{
		String res; // the new allocation

		/* realloc(NULL,x) is meant to do malloc(x), but doesn't always */
		if (p == null)
			return GlobalMembersAlloc.gp_alloc(size, message);

		///#ifndef NO_GIH
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'realloc' has no equivalent in Java:
		res = realloc((p), (int)(size));
		if (res.equals((String) null))
		{
			GlobalMembersBf_test.FreeHelp(); // out of memory, try to make some room
			///#endif // NO_GIH 
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'realloc' has no equivalent in Java:
			res = realloc((p), (int)(size));
			if (res.equals((String) null))
			{
				/* really out of memory */
				if (message != null)
				{
					GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "out of memory for %s", message);
					/* NOTREACHED */
				}
				/* else we return NULL */
			}
			///#ifndef NO_GIH
		}
		///#endif
		return (res);
	}
	///#endif // CHECK_HEAP_USE 
}