package com.addiPlot.gnuplot;

public class GlobalMembersCommand
{
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
		return GlobalMembersAlloc.RCSid("$Id: command.c,v 1.181.2.5 2010/02/24 20:41:29 sfeam Exp $");
	}
	///#endif

	/* GNUPLOT - command.c */

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
	 * Changes:
	 *
	 * Feb 5, 1992  Jack Veenstra   (veenstra@cs.rochester.edu) Added support to
	 * filter data values read from a file through a user-defined function before
	 * plotting. The keyword "thru" was added to the "plot" command. Example
	 * syntax: f(x) = x / 100 plot "test.data" thru f(x) This example divides all
	 * the y values by 100 before plotting. The filter function processes the
	 * data before any log-scaling occurs. This capability should be generalized
	 * to filter x values as well and a similar feature should be added to the
	 * "splot" command.
	 *
	 * 19 September 1992  Lawrence Crowl  (crowl@cs.orst.edu)
	 * Added user-specified bases for log scaling.
	 *
	 * April 1999 Franz Bakan (bakan@ukezyk.desy.de)
	 * Added code to support mouse-input from OS/2 PM window
	 * Changes marked by USE_MOUSE
	 *
	 * May 1999, update by Petr Mikulik
	 * Use gnuplot's pid in shared mem name
	 *
	 * August 1999 Franz Bakan and Petr Mikulik
	 * Encapsulating read_line into a thread, acting on input when thread or
	 * gnupmdrv posts an event semaphore. Thus mousing works even when gnuplot
	 * is used as a plotting device (commands passed via pipe).
	 *
	 */

	/*
	 * $Id: command.h,v 1.48 2008/08/15 00:45:34 sfeam Exp $
	 */

	/* GNUPLOT - command.h */

	/*[
	 * Copyright 1999, 2004   Thomas Williams, Colin Kelley
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


	///#ifdef HAVE_CONFIG_H
	///#define EAM_OBJECTS 1
	///#define EXTERNAL_X11_WINDOW 1
	///#define GIF_ANIMATION 1
	///#define GNUPLOT_HISTORY 1
	///#define GP_FIT_ERRVARS 1
	///#define GP_MACROS 1
	///#define HAVE_ATEXIT 1
	///#define HAVE_BCOPY 1
	///#define HAVE_BZERO 1
	///#define HAVE_CAIROPDF 1
	///#define HAVE_DECL_SIGNGAM 1
	///#define HAVE_DIRENT_H 1
	///#define HAVE_ERF 1
	///#define HAVE_ERFC 1
	///#define HAVE_ERRNO_H 1
	///#define HAVE_FLOAT_H 1
	///#define HAVE_GAMMA 1
	///#define HAVE_GD_GIF 1
	///#define HAVE_GD_H 1
	///#define HAVE_GD_JPEG 1
	///#define HAVE_GD_PNG 1
	///#define HAVE_GD_TTF 1
	///#define HAVE_GETCWD 1
	///#define HAVE_INDEX 1
	///#define HAVE_INTTYPES_H 1
	///#define HAVE_ISNAN 1
	///#define HAVE_LGAMMA 1
	///#define HAVE_LIBGD 1
	///#define HAVE_LIBM 1
	///#define HAVE_LIBREADLINE 1
	///#define HAVE_LIBZ 1
	///#define HAVE_LIMITS_H 1
	///#define HAVE_LOCALE_H 1
	///#define HAVE_MALLOC_H 1
	///#define HAVE_MATH_H 1
	///#define HAVE_MEMCPY 1
	///#define HAVE_MEMMOVE 1
	///#define HAVE_MEMORY_H 1
	///#define HAVE_MEMSET 1
	///#define HAVE_ON_EXIT 1
	///#define HAVE_PCLOSE 1
	///#define HAVE_POLL 1
	///#define HAVE_POLL_H 1
	///#define HAVE_POPEN 1
	///#define HAVE_READLINE_HISTORY_H 1
	///#define HAVE_READLINE_READLINE_H 1
	///#define HAVE_READLINE_TILDE_H 1
	///#define HAVE_RINDEX 1
	///#define HAVE_SELECT 1
	///#define HAVE_SETVBUF 1
	///#define HAVE_SGTTY_H 1
	///#define HAVE_SIGSETJMP 1
	///#define HAVE_SLEEP 1
	///#define HAVE_SNPRINTF 1
	///#define HAVE_STDBOOL_H 1
	///#define HAVE_STDINT_H 1
	///#define HAVE_STDLIB_H 1
	///#define HAVE_STPCPY 1
	///#define HAVE_STRCASECMP 1
	///#define HAVE_STRCHR 1
	///#define HAVE_STRCSPN 1
	///#define HAVE_STRDUP 1
	///#define HAVE_STRERROR 1
	///#define HAVE_STRINGIZE 1
	///#define HAVE_STRINGS_H 1
	///#define HAVE_STRING_H 1
	///#define HAVE_STRNCASECMP 1
	///#define HAVE_STRRCHR 1
	///#define HAVE_STRSTR 1
	///#define HAVE_STRUCT_EXCEPTION_IN_MATH_H 1
	///#define HAVE_SYSINFO 1
	///#define HAVE_SYS_IOCTL_H 1
	///#define HAVE_SYS_PARAM_H 1
	///#define HAVE_SYS_SELECT_H 1
	///#define HAVE_SYS_SOCKET_H 1
	///#define HAVE_SYS_STAT_H 1
	///#define HAVE_SYS_TIMEB_H 1
	///#define HAVE_SYS_TIME_H 1
	///#define HAVE_SYS_TYPES_H 1
	///#define HAVE_SYS_UTSNAME_H 1
	///#define HAVE_TCGETATTR 1
	///#define HAVE_TERMIOS_H 1
	///#define HAVE_TIME_H 1
	///#define HAVE_TIME_T_IN_TIME_H 1
	///#define HAVE_UNISTD_H 1
	///#define HAVE_USLEEP 1
	///#define HAVE_VALUES_H 1
	///#define HAVE_VFPRINTF 1
	///#define HAVE__BOOL 1
	///#define HIDDEN3D_QUADTREE 1
	///#define HIDDEN3D_VAR_PTSIZE 1
	///#define PACKAGE "gnuplot"
	///#define PACKAGE_BUGREPORT ""
	///#define PACKAGE_NAME "gnuplot"
	///#define PACKAGE_STRING "gnuplot 4.4.0"
	///#define PACKAGE_TARNAME "gnuplot"
	///#define PACKAGE_URL ""
	///#define PACKAGE_VERSION "4.4.0"
	///#define PIPES 1
	///#define PIPE_IPC 1
	///#define PROTOTYPES 1
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define RETSIGTYPE void
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SELECT_TYPE_ARG1 int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SELECT_TYPE_ARG234 (fd_set *)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SELECT_TYPE_ARG5 (struct timeval *)
	///#define STDC_HEADERS 1
	///#define USE_MOUSE 1
	///#define USE_X11_MULTIBYTE 1
	///#define VERSION "4.4.0"
	///#define VOLATILE_REFRESH 1
	///#define X11 1
	///#define __PROTOTYPES 1
	///#ifndef __cplusplus
	///#endif
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

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte *gp_input_line;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int gp_input_line_len;

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int inline_num;

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern struct lexical_unit *token;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int token_table_size;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int plot_token;
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define END_OF_COMMAND (c_token >= num_tokens || equals(c_token,";"))

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte *replot_line;

	/* flag to disable `replot` when some data are sent through stdin;
	 * used by mouse/hotkey capable terminals */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean replot_disabled;

	///#ifdef USE_MOUSE
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int paused_for_mouse; // Flag the end condition we are paused until
	///#define PAUSE_BUTTON1 001
	///#define PAUSE_BUTTON2 002
	///#define PAUSE_BUTTON3 004
	///#define PAUSE_CLICK 007
	///#define PAUSE_KEYSTROKE 010
	///#define PAUSE_WINCLOSE 020
	///#define PAUSE_ANY 077
	///#endif

	///#ifdef GP_MACROS
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean expand_macros;
	///#endif

	/* output file for the print command */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern FILE *print_out;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte *print_out_name;

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern struct udft_entry *dummy_func;

	///#ifndef STDOUT
	///#define STDOUT 1
	///#endif

	///#if defined(MSDOS) || defined(DOS386)
	///#ifdef DJGPP
	//extern char HelpFile[];         // patch for do_help  - AP 
	///#endif                         // DJGPP 
	///#ifdef __TURBOC__
	///#ifndef _Windows
	//extern char HelpFile[];         // patch for do_help  - DJL 
	///#endif                        // _Windows 
	///#endif                         // TURBOC 
	///#endif // MSDOS 

	///#ifdef _Windows
	///#define SET_CURSOR_WAIT SetCursor(LoadCursor((HINSTANCE) NULL, IDC_WAIT))
	///#define SET_CURSOR_ARROW SetCursor(LoadCursor((HINSTANCE) NULL, IDC_ARROW))
	///#else
	///#define SET_CURSOR_WAIT
	///#define SET_CURSOR_ARROW
	///#endif

	/* wrapper for calling kill_pending_Pause_dialog() from win/winmain.c */
	///#ifdef _Windows
	//void call_kill_pending_Pause_dialog(void);
	///#endif

	/* input data, parsing variables */
	///#ifdef AMIGA_SC_6_1
	//extern __far int num_tokens, c_token;
	///#else
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int num_tokens, c_token;

/* process the 'raise' or 'lower' command */
	///#endif

	public static void raise_lower_command(int lower)
	{
		++c_token;

		if (c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
		{
		if (lower != 0)
		{
	///#ifdef OS2
	//	    pm_lower_terminal_window();
	///#endif
	///#ifdef X11
			x11_lower_terminal_group();
	///#endif
	///#ifdef _Windows
	//	    win_lower_terminal_window();
	///#endif
	///#ifdef WXWIDGETS
	//	    wxt_lower_terminal_group();
	///#endif
		}
		else
		{
	///#ifdef OS2
	//	    pm_raise_terminal_window();
	///#endif
	///#ifdef X11
			x11_raise_terminal_group();
	///#endif
	///#ifdef _Windows
	//	    win_raise_terminal_window();
	///#endif
	///#ifdef WXWIDGETS
	//	    wxt_raise_terminal_group();
	///#endif
		}
		return;
		}
		else
		{
		int number;
		int negative = GlobalMembersUtil.equals(c_token, "-");

		if (negative != 0 || GlobalMembersUtil.equals(c_token, "+") != 0)
			c_token++;
		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && GlobalMembersUtil.isanumber(c_token) != 0)
		{
			number = GlobalMembersParse.real_expression();
			if (negative != 0)
			number = -number;
			if (lower != 0)
			{
	///#ifdef OS2
	//		pm_lower_terminal_window();
	///#endif
	///#ifdef X11
			x11_lower_terminal_window(number);
	///#endif
	///#ifdef _Windows
	//		win_lower_terminal_window();
	///#endif
	///#ifdef WXWIDGETS
	//		wxt_lower_terminal_window(number);
	///#endif
			}
			else
			{
	///#ifdef OS2
	//		pm_raise_terminal_window();
	///#endif
	///#ifdef X11
			x11_raise_terminal_window(number);
	///#endif
	///#ifdef _Windows
	//		win_raise_terminal_window();
	///#endif
	///#ifdef WXWIDGETS
	//		wxt_raise_terminal_window(number);
	///#endif
			}
			++c_token;
			return;
		}
		}
		GlobalMembersBf_test.int_error(c_token, "usage: raise {x11_plot_n}");
	}
	public static void raise_command()
	{
		GlobalMembersCommand.raise_lower_command(0);
	}
	public static void lower_command()
	{
		GlobalMembersCommand.raise_lower_command(1);
	}
	///#ifdef OS2
	//extern void pm_raise_terminal_window __PROTO((void));
	//extern void pm_lower_terminal_window __PROTO((void));
	///#endif
	///#ifdef X11
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//extern void x11_raise_terminal_window(int NamelessParameter);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//extern void x11_raise_terminal_group();
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//extern void x11_lower_terminal_window(int NamelessParameter);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//extern void x11_lower_terminal_group();

/* process the 'bind' command */
	///#endif
	///#ifdef _Windows
	//extern void win_raise_terminal_window();
	//extern void win_lower_terminal_window();
	///#endif
	///#ifdef WXWIDGETS
	//extern void wxt_raise_terminal_window __PROTO((int));
	//extern void wxt_raise_terminal_group __PROTO((void));
	//extern void wxt_lower_terminal_window __PROTO((int));
	//extern void wxt_lower_terminal_group __PROTO((void));
	///#endif

	///#ifdef USE_MOUSE
	public static void bind_command()
	{
		String lhs = (String) 0;
		String rhs = (String) 0;
		boolean allwindows = false;
		++c_token;

		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && GlobalMembersUtil.equals(c_token, "!") != 0)
		{
		GlobalMembersMouse.bind_remove_all();
		++c_token;
		return;
		}

		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && GlobalMembersUtil.almost_equals(c_token, "all$windows") != 0)
		{
		allwindows = true;
		c_token++;
		}

		/* get left hand side: the key or key sequence */
		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
		{
		String first = gp_input_line + token[c_token].start_index;
		int size = (int)(tangible.StringFunctions.strChr(first, ' ') - first);
		if (size < 0)
		{
			size = (int)(tangible.StringFunctions.strChr(first, '\0') - first);
		}
		if (size < 0)
		{
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
			fprintf(stderr, "(bind_command) %s:%d\n", __FILE__, __LINE__);
			return;
		}
		lhs = (String) GlobalMembersAlloc.gp_alloc(size + 1, "bind_command->lhs");
		if (GlobalMembersUtil.isstring(c_token) != 0)
		{
			GlobalMembersUtil.quote_str(lhs, c_token, GlobalMembersUtil.token_len(c_token));
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
			byte * ptr = lhs;
			while (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
			{
			GlobalMembersUtil.copy_str(ptr, c_token, GlobalMembersUtil.token_len(c_token) + 1);
			ptr += GlobalMembersUtil.token_len(c_token);
			if ((' ' == gp_input_line.charAt(token[c_token].start_index + token[c_token].length) || '\t' == gp_input_line.charAt(token[c_token].start_index + token[c_token].length) || '\0' == gp_input_line.charAt(token[c_token].start_index + token[c_token].length)))
			{
				break;
			}
			++c_token;
			}
		}
		++c_token;
		}

		/* get right hand side: the command. allocating the size
		 * of gp_input_line is too big, but shouldn't hurt too much. */
		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
		{
		rhs = (String) GlobalMembersAlloc.gp_alloc(gp_input_line.length() + 1, "bind_command->rhs");
		if (GlobalMembersUtil.isstring(c_token) != 0)
		{
			/* bind <lhs> "..." */
			GlobalMembersUtil.quote_str(rhs, c_token, GlobalMembersUtil.token_len(c_token));
			c_token++;
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
			byte * ptr = rhs;
			while (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
			{
			/* bind <lhs> ... ... ... */
			GlobalMembersUtil.copy_str(ptr, c_token, GlobalMembersUtil.token_len(c_token) + 1);
			ptr += GlobalMembersUtil.token_len(c_token);
			if ((' ' == gp_input_line.charAt(token[c_token].start_index + token[c_token].length) || '\t' == gp_input_line.charAt(token[c_token].start_index + token[c_token].length) || '\0' == gp_input_line.charAt(token[c_token].start_index + token[c_token].length)))
			{
				*ptr++= ' ';
				*ptr = (byte)'\0';
			}
			c_token++;
			}
		}
		}

		GlobalMembersFit.a((stderr, "(bind_command) |%s| |%s|\n", lhs, rhs));

		/* bind_process() will eventually free lhs / rhs ! */
		GlobalMembersMouse.bind_process(lhs, rhs, allwindows);

	}
	public static void restore_prompt()
	{
		if (GlobalMembersPlot.interactive)
		{
	///#if defined(HAVE_LIBREADLINE)
		rl_forced_update_display();
	///#else
	///#if defined(HAVE_LIBEDITLINE)
	// /* FIXME: editline does not support forced update,
	//           so this is probably not enough */
	//	rl_redisplay();
	///#endif
	//	fputs(PROMPT, stderr);
	//	fflush(stderr);
	///#endif
		}
	}
	///#else
	///#define bind_command()
	///#endif
	///#ifdef VOLATILE_REFRESH
	public static void refresh_request()
	{
		GlobalMembersFit.a((stderr,"refresh_request\n"));

		if ((GlobalMembersPlot2d.first_plot == DefineConstants.NULL && GlobalMembersGadgets.refresh_ok == 2) || (GlobalMembersPlot3d.first_3dplot == DefineConstants.NULL && GlobalMembersGadgets.refresh_ok == 3))
		GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "no active plot; cannot refresh");

		if (GlobalMembersGadgets.refresh_ok == 0)
		{
		GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "cannot refresh from this state. trying full replot");
		GlobalMembersCommand.replotrequest();
		return;
		}

		/* If the state has been reset to autoscale since the last plot,
		 * initialize the axis limits.
		 */
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array + AXIS_INDEX.FIRST_X_AXIS;
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MIN)) ? DefineConstants.VERYLARGE * 1e-3 : (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].log ? (Math.log(this_Renamed.set_min) / GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].log_base) : (this_Renamed.set_min));
			this_Renamed.max = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MAX)) ? - DefineConstants.VERYLARGE * 1e-3 : (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].log ? (Math.log(this_Renamed.set_max) / GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].log_base) : (this_Renamed.set_max));
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
		} while (0);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array + AXIS_INDEX.FIRST_Y_AXIS;
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MIN)) ? DefineConstants.VERYLARGE * 1e-3 : (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].log ? (Math.log(this_Renamed.set_min) / GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].log_base) : (this_Renamed.set_min));
			this_Renamed.max = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MAX)) ? - DefineConstants.VERYLARGE * 1e-3 : (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].log ? (Math.log(this_Renamed.set_max) / GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].log_base) : (this_Renamed.set_max));
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
		} while (0);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array + AXIS_INDEX.SECOND_X_AXIS;
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MIN)) ? DefineConstants.VERYLARGE * 1e-3 : (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].log ? (Math.log(this_Renamed.set_min) / GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].log_base) : (this_Renamed.set_min));
			this_Renamed.max = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MAX)) ? - DefineConstants.VERYLARGE * 1e-3 : (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].log ? (Math.log(this_Renamed.set_max) / GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].log_base) : (this_Renamed.set_max));
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
		} while (0);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array + AXIS_INDEX.SECOND_Y_AXIS;
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MIN)) ? DefineConstants.VERYLARGE * 1e-3 : (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].log ? (Math.log(this_Renamed.set_min) / GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].log_base) : (this_Renamed.set_min));
			this_Renamed.max = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MAX)) ? - DefineConstants.VERYLARGE * 1e-3 : (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].log ? (Math.log(this_Renamed.set_max) / GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].log_base) : (this_Renamed.set_max));
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
		} while (0);

		do
		{
			axis this_axis = GlobalMembersAxis.axis_array + AXIS_INDEX.T_AXIS;
			if ((this_axis.set_autoscale & e_autoscale.AUTOSCALE_MIN) == 0)
				this_axis.min = (GlobalMembersAxis.axis_array[AXIS_INDEX.T_AXIS.getValue()].log ? (Math.log(this_axis.set_min) / GlobalMembersAxis.axis_array[AXIS_INDEX.T_AXIS.getValue()].log_base) : (this_axis.set_min));
				if ((this_axis.set_autoscale & e_autoscale.AUTOSCALE_MAX) == 0)
					this_axis.max = (GlobalMembersAxis.axis_array[AXIS_INDEX.T_AXIS.getValue()].log ? (Math.log(this_axis.set_max) / GlobalMembersAxis.axis_array[AXIS_INDEX.T_AXIS.getValue()].log_base) : (this_axis.set_max));
		} while (0);
		do
		{
			axis this_axis = GlobalMembersAxis.axis_array + AXIS_INDEX.R_AXIS;
			if ((this_axis.set_autoscale & e_autoscale.AUTOSCALE_MIN) == 0)
				this_axis.min = (GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].log ? (Math.log(this_axis.set_min) / GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].log_base) : (this_axis.set_min));
				if ((this_axis.set_autoscale & e_autoscale.AUTOSCALE_MAX) == 0)
					this_axis.max = (GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].log ? (Math.log(this_axis.set_max) / GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].log_base) : (this_axis.set_max));
		} while (0);

		do
		{
			axis this_axis = GlobalMembersAxis.axis_array + AXIS_INDEX.FIRST_Z_AXIS;
			if ((this_axis.set_autoscale & e_autoscale.AUTOSCALE_MIN) == 0)
				this_axis.min = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log ? (Math.log(this_axis.set_min) / GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log_base) : (this_axis.set_min));
				if ((this_axis.set_autoscale & e_autoscale.AUTOSCALE_MAX) == 0)
					this_axis.max = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log ? (Math.log(this_axis.set_max) / GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log_base) : (this_axis.set_max));
		} while (0);
		do
		{
			axis this_axis = GlobalMembersAxis.axis_array + AXIS_INDEX.COLOR_AXIS;
			if ((this_axis.set_autoscale & e_autoscale.AUTOSCALE_MIN) == 0)
				this_axis.min = (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log ? (Math.log(this_axis.set_min) / GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log_base) : (this_axis.set_min));
				if ((this_axis.set_autoscale & e_autoscale.AUTOSCALE_MAX) == 0)
					this_axis.max = (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log ? (Math.log(this_axis.set_max) / GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log_base) : (this_axis.set_max));
		} while (0);

		if (GlobalMembersGadgets.refresh_ok == 2)
		GlobalMembersPlot2d.refresh_bounds(GlobalMembersPlot2d.first_plot, GlobalMembersGadgets.refresh_nplots);
		else if (GlobalMembersGadgets.refresh_ok == 3)
		GlobalMembersPlot3d.refresh_3dbounds(GlobalMembersPlot3d.first_3dplot, GlobalMembersGadgets.refresh_nplots);

	/* FIXME EAM
	 * The existing mechanism defined in axis.h does not work here for some reason.
	 * The following defined check works empirically.  Most of the time.  Maybe.
	 */
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#undef CHECK_REVERSE
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CHECK_REVERSE(axis) do { axis *ax = axis_array + axis; if ((ax->range_flags & RANGE_REVERSE)) { double temp = ax->max; ax->max = ax->min; ax->min = temp; } } while (0)


		do
		{
			axis ax = GlobalMembersAxis.axis_array + AXIS_INDEX.FIRST_X_AXIS;
			if ((ax.range_flags & DefineConstants.RANGE_REVERSE))
			{
				double temp = ax.max;
				ax.max = ax.min;
				ax.min = temp;
			}
		} while (0);
		do
		{
			axis ax = GlobalMembersAxis.axis_array + AXIS_INDEX.FIRST_Y_AXIS;
			if ((ax.range_flags & DefineConstants.RANGE_REVERSE))
			{
				double temp = ax.max;
				ax.max = ax.min;
				ax.min = temp;
			}
		} while (0);
		do
		{
			axis ax = GlobalMembersAxis.axis_array + AXIS_INDEX.SECOND_X_AXIS;
			if ((ax.range_flags & DefineConstants.RANGE_REVERSE))
			{
				double temp = ax.max;
				ax.max = ax.min;
				ax.min = temp;
			}
		} while (0);
		do
		{
			axis ax = GlobalMembersAxis.axis_array + AXIS_INDEX.SECOND_Y_AXIS;
			if ((ax.range_flags & DefineConstants.RANGE_REVERSE))
			{
				double temp = ax.max;
				ax.max = ax.min;
				ax.min = temp;
			}
		} while (0);
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#undef CHECK_REVERSE

		if (GlobalMembersGadgets.refresh_ok == 2)
		GlobalMembersGraphics.do_plot(GlobalMembersPlot2d.first_plot, GlobalMembersGadgets.refresh_nplots);
		else if (GlobalMembersGadgets.refresh_ok == 3)
		GlobalMembersGraph3d.do_3dplot(GlobalMembersPlot3d.first_3dplot, GlobalMembersGadgets.refresh_nplots, 0);
		else
		GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Internal error - refresh of unknown plot type");

	}
///#endif // USE_MOUSE 


/*
 * Command parser functions
 */

/* process the 'call' command */
	///#endif
	public static void call_command()
	{
		String save_file = DefineConstants.NULL;

		c_token++;
		save_file = GlobalMembersUtil.try_to_get_string();

		if (save_file == null)
		GlobalMembersBf_test.int_error(c_token, "expecting filename");
	tangible.RefObject<String[]> tempRef_save_file = new tangible.RefObject<String[]>(save_file);
		GlobalMembersPlot.gp_expand_tilde(tempRef_save_file);
		save_file = tempRef_save_file.argvalue;

		/* Argument list follows filename */
		GlobalMembersMisc.load_file(GlobalMembersMisc.loadpath_fopen(save_file, "r"), save_file, true);
	}

/* process the 'cd' command */
	public static void changedir_command()
	{
		String save_file = DefineConstants.NULL;

		c_token++;
		save_file = GlobalMembersUtil.try_to_get_string();
		if (save_file == null)
		GlobalMembersBf_test.int_error(c_token, "expecting directory name");

	tangible.RefObject<String[]> tempRef_save_file = new tangible.RefObject<String[]>(save_file);
		GlobalMembersPlot.gp_expand_tilde(tempRef_save_file);
		save_file = tempRef_save_file.argvalue;
		if (GlobalMembersCommand.changedir(save_file) != 0)
		GlobalMembersBf_test.int_error(c_token, "Can't change to this directory");
		else
		GlobalMembersEval.update_gpval_variables(5);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(save_file);
	}

/* process the 'clear' command */
	public static void clear_command()
	{

		GlobalMembersTerm.term_start_plot();

		if (GlobalMembersTerm.multiplot && GlobalMembersTerm.term.fillbox)
		{
		int xx1 = (int)(GlobalMembersGadgets.xoffset * GlobalMembersTerm.term.xmax);
		int yy1 = (int)(GlobalMembersGadgets.yoffset * GlobalMembersTerm.term.ymax);
		int width = (int)(GlobalMembersGadgets.xsize * GlobalMembersTerm.term.xmax);
		int height = (int)(GlobalMembersGadgets.ysize * GlobalMembersTerm.term.ymax);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*GlobalMembersTerm.term.fillbox)(0, xx1, yy1, width, height);
		}
		GlobalMembersTerm.term_end_plot();

		GlobalMembersUtil.screen_ok = false;
		c_token++;

	}

/* process the 'evaluate' command */
	public static void eval_command()
	{
		int save_token = ++c_token;
		String command;

		if (++eval_depth > 4)
		GlobalMembersBf_test.int_error(save_token, "Deep recursion in evaluate");
		if (!(command = GlobalMembersUtil.try_to_get_string()))
		GlobalMembersBf_test.int_error(c_token, "Expected command string");

		GlobalMembersCommand.do_string(command, true);
		--eval_depth;
	}

/* reset eval_depth counter */
	public static void reset_eval_depth()
	{
		eval_depth = 0;
	}

/* process the 'exit' and 'quit' commands */
	public static void exit_command()
	{
		/* If the command is "exit gnuplot" then do so */
		if (GlobalMembersUtil.equals(c_token + 1, "gnuplot") != 0)
		System.exit(0);

		/* else graphics will be tidied up in main */
		command_exit_status = 1;
	}

/* Support for input, shell, and help for various systems */

///#ifdef VMS
//
///#include <descrip.h>
///#include <rmsdef.h>
///#include <smgdef.h>
///#include <smgmsg.h>
///#include <ssdef.h>
//
//extern lib$get_input(), lib$put_output();
//extern smg$read_composed_line();
//extern sys$putmsg();
//extern lbr$output_help();
//extern lib$spawn();
//
//int vms_len;
//
//unsigned int status[2] = { 1, 0 };
//
//static char Help[MAX_LINE_LEN+1] = "gnuplot";
//
//$DESCRIPTOR(prompt_desc, PROMPT);
// /* temporary fix until change to variable length */
//struct dsc$descriptor_s line_desc =
//{0, DSC$K_DTYPE_T, DSC$K_CLASS_S, NULL};
//
//$DESCRIPTOR(help_desc, Help);
//$DESCRIPTOR(helpfile_desc, "GNUPLOT$HELP");
//
// /* HBB 990829: confirmed this to be used on VMS, only --> moved into
//  * the VMS-specific section */
//void
//done(int status)
//{
//    term_reset();
//    exit(status);
//}
//
// /* please note that the vms version of read_line doesn't support variable line
//    length (yet) */
//
//static int
//read_line(const char *prompt)
//{
//    int more, start = 0;
//    char expand_prompt[40];
//
//    current_prompt = prompt;	// HBB NEW 20040727 
//
//    prompt_desc.dsc$w_length = strlen(prompt);
//    prompt_desc.dsc$a_pointer = (char *) prompt;
//    strcpy(expand_prompt, "_");
//    strncat(expand_prompt, prompt, 38);
//    do {
//	line_desc.dsc$w_length = MAX_LINE_LEN - start;
//	line_desc.dsc$a_pointer = &gp_input_line[start];
//	switch (status[1] = smg$read_composed_line(&vms_vkid, &vms_ktid, &line_desc, &prompt_desc, &vms_len)) {
//	case SMG$_EOF:
//	    done(EXIT_SUCCESS);	// ^Z isn't really an error 
//	    break;
//	case RMS$_TNS:		// didn't press return in time 
//	    vms_len--;		// skip the last character 
//	    break;		// and parse anyway 
//	case RMS$_BES:		// Bad Escape Sequence 
//	case RMS$_PES:		// Partial Escape Sequence 
//	    sys$putmsg(status);
//	    vms_len = 0;	// ignore the line 
//	    break;
//	case SS$_NORMAL:
//	    break;		// everything's fine 
//	default:
//	    done(status[1]);	// give the error message 
//	}
//	start += vms_len;
//	gp_input_line[start] = NUL;
//	inline_num++;
//	if (gp_input_line[start - 1] == '\\') {
// /* Allow for a continuation line. */
//	    prompt_desc.dsc$w_length = strlen(expand_prompt);
//	    prompt_desc.dsc$a_pointer = expand_prompt;
//	    more = 1;
//	    --start;
//	} else {
//	    line_desc.dsc$w_length = strlen(gp_input_line);
//	    line_desc.dsc$a_pointer = gp_input_line;
//	    more = 0;
//	}
//    } while (more);
//    return 0;
//}
//
//
///#ifdef NO_GIH
//void
//help_command()
//{
//    int first = c_token;
//
//    while (!END_OF_COMMAND)
//	++c_token;
//
//    strcpy(Help, "GNUPLOT ");
//    capture(Help + 8, first, c_token - 1, sizeof(Help) - 9);
//    help_desc.dsc$w_length = strlen(Help);
//    if ((vaxc$errno = lbr$output_help(lib$put_output, 0, &help_desc,
//				      &helpfile_desc, 0, lib$get_input)) != SS$_NORMAL)
//	os_error(NO_CARET, "can't open GNUPLOT$HELP");
//}
///#endif				// NO_GIH 
//
//
//void
//do_shell()
//{
//    screen_ok = FALSE;
//    c_token++;
//
//    if ((vaxc$errno = lib$spawn()) != SS$_NORMAL) {
//	os_error(NO_CARET, "spawn error");
//    }
//}
//
//
//static void
//do_system(const char *cmd)
//{
//
//     if (!cmd)
//	return;
//
// /* gp_input_line is filled by read_line or load_file, but
//  * line_desc length is set only by read_line; adjust now
//  */
//    line_desc.dsc$w_length = strlen(cmd);
//    line_desc.dsc$a_pointer = (char *) cmd;
//
//    if ((vaxc$errno = lib$spawn(&line_desc)) != SS$_NORMAL)
//	os_error(NO_CARET, "spawn error");
//
//    (void) putc('\n', stderr);
//
//}
///#endif // VMS 


///#ifdef NO_GIH
///#if defined(_Windows)
//void
//help_command()
//{
//
//    if (END_OF_COMMAND)
//	WinHelp(textwin.hWndParent, (LPSTR) winhelpname, HELP_INDEX, (DWORD) NULL);
//    else {
//	char buf[128];
//	int start = ++c_token;
//	while (!(END_OF_COMMAND))
//	    c_token++;
//	capture(buf, start, c_token - 1, 128);
//	WinHelp(textwin.hWndParent, (LPSTR) winhelpname, HELP_PARTIALKEY, (DWORD) buf);
//    }
//}
///#else  // !_Windows 
//void
//help_command()
//{
//    while (!(END_OF_COMMAND))
//	c_token++;
//    fputs("This gnuplot was not built with inline help\n", stderr);
//}
///#endif // _Windows 
///#endif // NO_GIH 


/*
 * help_command: (not VMS, although it would work) Give help to the user. It
 * parses the command line into helpbuf and supplies help for that string.
 * Then, if there are subtopics available for that key, it prompts the user
 * with this string. If more input is given, help_command is called
 * recursively, with argument 0.  Thus a more specific help can be supplied.
 * This can be done repeatedly.  If null input is given, the function returns,
 * effecting a backward climb up the tree.
 * David Kotz (David.Kotz@Dartmouth.edu) 10/89
 * drd - The help buffer is first cleared when called with toplevel=1.
 * This is to fix a bug where help is broken if ^C is pressed whilst in the
 * help.
 * Lars - The "int toplevel" argument is gone. I have converted it to a
 * static variable.
 *
 * FIXME - helpbuf is never free()'d
 */

///#ifndef NO_GIH
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String help_command_helpbuf = DefineConstants.NULL;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String help_command_prompt = DefineConstants.NULL;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int help_command_toplevel = 1;
	public static void help_command()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static sbyte *helpbuf = DefineConstants.NULL;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static sbyte *prompt = DefineConstants.NULL;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int toplevel = 1;
		int base; // index of first char AFTER help string
		int len; // length of current help string
		boolean more_help;
		boolean only; // TRUE if only printing subtopics
		boolean subtopics; // 0 if no subtopics for this topic
		int start; // starting token of help string
		String help_ptr; // name of help file
	///#if defined(SHELFIND)
	//    static char help_fname[256] = "";	// keep helpfilename across calls
	///#endif

		if ((help_ptr = getenv("GNUHELP")) == (String) DefineConstants.NULL)
	///#ifndef SHELFIND
		/* if can't find environment variable then just use HELPFILE */

	/* patch by David J. Liu for getting GNUHELP from home directory */
	///#if (defined(__TURBOC__) && (defined(MSDOS) || defined(DOS386))) || defined(__DJGPP__)
	//	help_ptr = HelpFile;
	///#else			// __TURBOC__
		help_ptr = DefineConstants.HELPFILE;
	///#endif
	///#ifdef OS2
	//  {
	// /* look in the path where the executable lives */
	//  static char buf[MAXPATHLEN];
	//  char *ptr;
	//
	//  _execname(buf, sizeof(buf));
	//  _fnslashify(buf);
	//  ptr=strrchr(buf, '/');
	//  if (ptr) {
	//     *(ptr+1)='\0';
	//     strcat(buf, HELPFILE);
	//     help_ptr=&buf[0];
	//  }
	//  else
	//     help_ptr = HELPFILE;
	//  }
	///#endif
	/* end of patch  - DJL */

	///#else				// !SHELFIND
	// /* try whether we can find the helpfile via shell_find. If not, just
	//    use the default. (tnx Andreas) */
	//
	//    if (!strchr(HELPFILE, ':') && !strchr(HELPFILE, '/') &&
	//	!strchr(HELPFILE, '\\')) {
	//	if (strlen(help_fname) == 0) {
	//	    strcpy(help_fname, HELPFILE);
	//	    if (shel_find(help_fname) == 0) {
	//		strcpy(help_fname, HELPFILE);
	//	    }
	//	}
	//	help_ptr = help_fname;
	//    } else {
	//	help_ptr = HELPFILE;
	//    }
	///#endif				// !SHELFIND

		/* Since MSDOS DGROUP segment is being overflowed we can not allow such  */
		/* huge static variables (1k each). Instead we dynamically allocate them */
		/* on the first call to this function...                                 */
		if (help_command_helpbuf.equals(DefineConstants.NULL))
		{
		help_command_helpbuf = GlobalMembersAlloc.gp_alloc(DefineConstants.MAX_LINE_LEN, "help buffer");
		help_command_prompt = GlobalMembersAlloc.gp_alloc(DefineConstants.MAX_LINE_LEN, "help prompt");
		help_command_helpbuf = tangible.StringFunctions.changeCharacter(help_command_helpbuf, 0, help_command_prompt[0] = 0);
		}
		if (help_command_toplevel != 0)
		help_command_helpbuf = tangible.StringFunctions.changeCharacter(help_command_helpbuf, 0, help_command_prompt[0] = 0); // in case user hit ^c last time

		/* if called recursively, toplevel == 0; toplevel must == 1 if called
		 * from command() to get the same behaviour as before when toplevel
		 * supplied as function argument
		 */
		help_command_toplevel = 1;

		len = base = help_command_helpbuf.length();

		start = ++c_token;

		/* find the end of the help command */
		while (!(c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0))
		c_token++;

		/* copy new help input into helpbuf */
		if (len > 0)
		help_command_helpbuf = tangible.StringFunctions.changeCharacter(help_command_helpbuf, len++, ' '); // add a space
		GlobalMembersUtil.capture(help_command_helpbuf + len, start, c_token - 1, DefineConstants.MAX_LINE_LEN - len);
		GlobalMembersUtil.squash_spaces(help_command_helpbuf + base); // only bother with new stuff
		GlobalMembersUtil.lower_case(help_command_helpbuf + base); // only bother with new stuff
		len = help_command_helpbuf.length();

		/* now, a lone ? will print subtopics only */
		if (strcmp(help_command_helpbuf + (base != 0 ? base + 1 : 0), "?") == 0)
		{
		/* subtopics only */
		subtopics = true;
		only = true;
		help_command_helpbuf = tangible.StringFunctions.changeCharacter(help_command_helpbuf, base, DefineConstants.NUL); // cut off question mark
		}
		else
		{
		/* normal help request */
		subtopics = false;
		only = false;
		}

		switch (GlobalMembersHelp.help(help_command_helpbuf, help_ptr, subtopics))
		{
		case DefineConstants.H_FOUND:
		{
			/* already printed the help info */
			/* subtopics now is true if there were any subtopics */
			GlobalMembersUtil.screen_ok = false;

			do
			{
			if (subtopics && !only)
			{
				/* prompt for subtopic with current help string */
				if (len > 0)
				{
				help_command_prompt = "Subtopic of ";
				strncat(help_command_prompt, help_command_helpbuf, DefineConstants.MAX_LINE_LEN - 16);
				help_command_prompt += ": ";
				}
				else
				help_command_prompt = "Help topic: ";
				GlobalMembersCommand.read_line(help_command_prompt);
			tangible.RefObject<String[]> tempRef_gp_input_line = new tangible.RefObject<String[]>(gp_input_line);
				num_tokens = GlobalMembersScanner.scanner(tempRef_gp_input_line, gp_input_line_len);
				gp_input_line = tempRef_gp_input_line.argvalue;
				c_token = 0;
				more_help = !(c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0);
				if (more_help)
				{
				c_token--;
				help_command_toplevel = 0;
				/* base for next level is all of current helpbuf */
				GlobalMembersCommand.help_command();
				}
			}
			else
				more_help = false;
			} while (more_help);

			break;
		}
		case DefineConstants.H_NOTFOUND:
		System.out.printf("Sorry, no help for '%s'\n", help_command_helpbuf);
		break;
		case DefineConstants.H_ERROR:
		perror(help_ptr);
		break;
		default:
		GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Impossible case in switch");
		break;
		}

		help_command_helpbuf = tangible.StringFunctions.changeCharacter(help_command_helpbuf, base, DefineConstants.NUL); // cut it off where we started
	}

/* fit_command() is in fit.c */


/* help_command() is below */


/* process the 'history' command */
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String history_command_search_str = DefineConstants.NULL;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String history_command_gpil_copy = DefineConstants.NULL;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String history_command_name = DefineConstants.NULL;
	public static void history_command()
	{
	///#if defined(READLINE) || defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)
		c_token++;

		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && GlobalMembersUtil.equals(c_token, "?") != 0)
		{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static sbyte *search_str = DefineConstants.NULL; // string from command line to search for

		/* find and show the entries */
		c_token++;
	tangible.RefObject<String[]> tempRef_history_command_search_str = new tangible.RefObject<String[]>(history_command_search_str);
		GlobalMembersUtil.m_capture(tempRef_history_command_search_str, c_token, c_token); // reallocates memory
		history_command_search_str = tempRef_history_command_search_str.argvalue;
		System.out.printf("history ?%s\n", history_command_search_str);
		if (GlobalMembersHistory.history_find_all(history_command_search_str) == 0)
			GlobalMembersBf_test.int_error(c_token, "not in history");
		c_token++;

		}
		else if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && GlobalMembersUtil.equals(c_token, "!") != 0)
		{
		String history_command_search_str = DefineConstants.NULL; // string from command line to search for
		String line_to_do = DefineConstants.NULL; // command to execute at end if necessary
		int c_token_copy;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static sbyte *gpil_copy = DefineConstants.NULL;

		c_token++;
	tangible.RefObject<String[]> tempRef_history_command_search_str2 = new tangible.RefObject<String[]>(history_command_search_str);
		GlobalMembersUtil.m_capture(tempRef_history_command_search_str2, c_token, c_token);
		history_command_search_str = tempRef_history_command_search_str2.argvalue;
		line_to_do = GlobalMembersHistory.history_find(history_command_search_str);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(history_command_search_str);
		if (line_to_do.equals(DefineConstants.NULL))
			GlobalMembersBf_test.int_error(c_token, "not in history");

		/* Must keep current input line in case there are some remaining lines
		 * to process after a semicolon.  However, could int_error() some where
		 * during do_line() so a static copy is kept.
		 */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(history_command_gpil_copy);
		history_command_gpil_copy = GlobalMembersUtil.gp_strdup(gp_input_line);
		c_token_copy = c_token;

		while (gp_input_line_len < line_to_do.length() + 1)
			GlobalMembersCommand.extend_input_line();
		gp_input_line = line_to_do;
	tangible.RefObject<String[]> tempRef_gp_input_line = new tangible.RefObject<String[]>(gp_input_line);
		boolean tempVar = GlobalMembersScanner.scanner(tempRef_gp_input_line, gp_input_line_len);
	gp_input_line = tempRef_gp_input_line.argvalue;
	if (tempVar)
	{
			if (GlobalMembersUtil.almost_equals(0, "hi$story") != 0 && GlobalMembersUtil.equals(1, "!") != 0)
			GlobalMembersBf_test.int_error(c_token - 1, "petitio principii"); // Oops... infinite loop
			else
			{
			System.out.printf("  Executing:\n\t%s\n", line_to_do);
			GlobalMembersCommand.do_line();
			}
	}
		/* Restore previous state of line and parser, gpil_copy will be freed next time */
		gp_input_line = history_command_gpil_copy;
	tangible.RefObject<String[]> tempRef_gp_input_line2 = new tangible.RefObject<String[]>(gp_input_line);
		num_tokens = GlobalMembersScanner.scanner(tempRef_gp_input_line2, gp_input_line_len);
		gp_input_line = tempRef_gp_input_line2.argvalue;
		c_token = c_token_copy + 1;

		}
		else
		{
		int n = 0; // print only <last> entries
		boolean append = false; // rewrite output file or append it
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static sbyte *name = DefineConstants.NULL; // name of the output file; NULL for stdout

		boolean quiet = false;
		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && GlobalMembersUtil.almost_equals(c_token, "q$uiet") != 0)
		{
			/* option quiet to suppress history entry numbers */
			quiet = true;
			c_token++;
		}
		/* show history entries */
		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && GlobalMembersUtil.isanumber(c_token) != 0)
		{
			n = GlobalMembersParse.int_expression();
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(history_command_name);
		if ((history_command_name = GlobalMembersUtil.try_to_get_string()))
		{
			if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && GlobalMembersUtil.almost_equals(c_token, "ap$pend") != 0)
			{
			append = true;
			c_token++;
			}
		}
		GlobalMembersHistory.write_history_n(n, (quiet ? "" : history_command_name), (append ? "a" : "w"));
		}

	///#else
	//    c_token++;
	//    int_warn(NO_CARET, "You have to compile gnuplot with builtin readline or GNU readline to enable history support.");
	///#endif // defined(READLINE) || defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)
	}

///#if 0
////#define PRINT_TOKEN(tok)                                                    do {                                                                            int i;                                                                      int end_index = token[tok].start_index + token[tok].length;                 for (i = token[tok].start_index; i < end_index && gp_input_line[i]; i++) { 	fputc(gp_input_line[i], stderr);                                           }                                                                           fputc('\n', stderr);                                                        fflush(stderr);                                                         } while (0)
////ignore
////ignore
////ignore
////ignore
////ignore
////ignore
////ignore
////ignore
////ignore
///#endif

/* process the 'if' command */
	public static void if_command()
	{
		double exprval;

		if_depth++;

		if (GlobalMembersUtil.equals(++c_token, "(") == 0) // no expression
		GlobalMembersBf_test.int_error(c_token, "expecting (expression)");
		exprval = GlobalMembersParse.real_expression();
		if (exprval != 0.0)
		{
		/* fake the condition of a ';' between commands */
		int eolpos = token[num_tokens - 1].start_index + token[num_tokens - 1].length;
		--c_token;
		token[c_token].length = 1;
		token[c_token].start_index = eolpos + 2;
		gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, eolpos + 2, ';');
		gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, eolpos + 3, DefineConstants.NUL);

		if_condition = true;
		}
		else
		{
		while (c_token < num_tokens)
		{
			/* skip over until the next command */
			while (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
			{
			++c_token;
			}
			if (++c_token < num_tokens && (GlobalMembersUtil.equals(c_token, "else")))
			{
			/* break if an "else" was found */
			if_condition = false;
			--c_token; // go back to ';'
			return;
			}
		}
		/* no else found */
		c_token = num_tokens = 0;
		}
	}

/* process the 'else' command */
	public static void else_command()
	{
		if (if_depth <= 0)
		{
		GlobalMembersBf_test.int_error(c_token, "else without if");
		return;
		}
		else
		{
		if_depth--;
		}

		if (true == if_condition)
		{
		/* First part of line was true so
		 * discard the rest of the line. */
		c_token = num_tokens = 0;
		}
		else
		{
		do
		{
			int idx = token[c_token].start_index;
			token[c_token].length = 1;
			gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, idx++, ';');
			gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, idx++, ' ');
			gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, idx++, ' ');
			gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, idx++, ' ');
		} while (0);
		if_condition = true;
		}
	}

/* process invalid commands and, on OS/2, REXX commands */
	public static void invalid_command()
	{
	///#ifdef OS2
	//   if (token[c_token].is_token) {
	//      int rc;
	//      rc = ExecuteMacro(gp_input_line + token[c_token].start_index,
	//	      token[c_token].length);
	//      if (rc == 0) {
	//	 c_token = num_tokens = 0;
	//	 return;
	//      }
	//    }
	///#endif
		GlobalMembersBf_test.int_error(c_token, "invalid command");
	}

/* process the 'load' command */
	public static void load_command()
	{
		FILE fp;
		String save_file;

		c_token++;
		save_file = GlobalMembersUtil.try_to_get_string();
		if (save_file == null)
		GlobalMembersBf_test.int_error(c_token, "expecting filename");
	tangible.RefObject<String[]> tempRef_save_file = new tangible.RefObject<String[]>(save_file);
		GlobalMembersPlot.gp_expand_tilde(tempRef_save_file);
		save_file = tempRef_save_file.argvalue;

		fp = strcmp(save_file, "-") ? GlobalMembersMisc.loadpath_fopen(save_file, "r") : stdout;
		GlobalMembersMisc.load_file(fp, save_file, false);
	}

/* null command */
	public static void null_command()
	{
		return;
	}

/* process the 'pause' command */
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String pause_command_buf = DefineConstants.NULL;
	public static void pause_command()
	{
		int text = 0;
		double sleep_time;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static sbyte *buf = DefineConstants.NULL;

		c_token++;

	///#ifdef USE_MOUSE
		paused_for_mouse = 0;
		if (GlobalMembersUtil.equals(c_token, "mouse") != 0)
		{
		sleep_time = -1;
		c_token++;

	/*	EAM FIXME - This is not the correct test; what we really want */
	/*	to know is whether or not the terminal supports mouse feedback */
	/*	if (term_initialised) { */
		if (mouse_setting.on && GlobalMembersTerm.term != null)
		{
			udvt_entry current;
			int end_condition = 0;

			while (!(c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0))
			{
			if (GlobalMembersUtil.almost_equals(c_token, "key$press") != 0)
			{
				end_condition |= DefineConstants.PAUSE_KEYSTROKE;
				c_token++;
			}
			else if (GlobalMembersUtil.equals(c_token, ",") != 0)
			{
				c_token++;
			}
			else if (GlobalMembersUtil.equals(c_token, "any") != 0)
			{
				end_condition |= DefineConstants.PAUSE_ANY;
				c_token++;
			}
			else if (GlobalMembersUtil.equals(c_token, "button1") != 0)
			{
				end_condition |= DefineConstants.PAUSE_BUTTON1;
				c_token++;
			}
			else if (GlobalMembersUtil.equals(c_token, "button2") != 0)
			{
				end_condition |= DefineConstants.PAUSE_BUTTON2;
				c_token++;
			}
			else if (GlobalMembersUtil.equals(c_token, "button3") != 0)
			{
				end_condition |= DefineConstants.PAUSE_BUTTON3;
				c_token++;
			}
			else if (GlobalMembersUtil.equals(c_token, "close") != 0)
			{
				end_condition |= DefineConstants.PAUSE_WINCLOSE;
				c_token++;
			}
			else
				break;
			}

			if (end_condition != 0)
				paused_for_mouse = end_condition;
			else
				paused_for_mouse = DefineConstants.PAUSE_CLICK;

			/* Set the pause mouse return codes to -1 */
			current = GlobalMembersEval.add_udv_by_name("MOUSE_KEY");
			current.udv_undef = false;
			GlobalMembersEval.Ginteger(current.udv_value, -1);
			current = GlobalMembersEval.add_udv_by_name("MOUSE_BUTTON");
			current.udv_undef = false;
			GlobalMembersEval.Ginteger(current.udv_value, -1);
		}
		else
			GlobalMembersUtil.int_warn(DefineConstants.NO_CARET,"Mousing not active");
		}
		else
	///#endif
		sleep_time = GlobalMembersParse.real_expression();

		if (c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pause_command_buf); // remove the previous message
		pause_command_buf = GlobalMembersUtil.gp_strdup("paused"); // default message, used in Windows GUI pause dialog
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pause_command_buf);
		pause_command_buf = GlobalMembersUtil.try_to_get_string();
		if (pause_command_buf == null)
			GlobalMembersBf_test.int_error(c_token, "expecting string");
		else
		{
	///#ifdef _Windows
	//	    if (sleep_time >= 0)
	///#elif defined(OS2)
	//		if (strcmp(term->name, "pm") != 0 || sleep_time >= 0)
	///#endif // _Windows
				fputs(pause_command_buf, stderr);
			text = 1;
		}
		}

		if (sleep_time < 0)
		{
	///#if defined(_Windows)
	///#ifdef WXWIDGETS
	//	if (!strcmp(term->name, "wxt")) {
	// /* copy of the code below:  !(_Windows || OS2 || _Macintosh) */
	//	    if (term && term->waitforinput && paused_for_mouse){
	//		fprintf(stderr,"%s\n", buf);
	//		term->waitforinput();
	//	    } else {
	///#if defined(WGP_CONSOLE)
	//		fprintf(stderr,"%s\n", buf);
	//		if (term && term->waitforinput)
	//		  while (term->waitforinput() != (int)'\r') {}; // waiting for Enter
	///#else // !WGP_CONSOLE
	//		if (!Pause(buf))
	//		bail_to_command_line();
	///#endif
	//	    }
	//	} else
	///#endif // _Windows && WXWIDGETS
	//	{
	//	    if (paused_for_mouse && !graphwin.hWndGraph) {
	//		if (interactive) { // cannot wait for Enter in a non-interactive session without the graph window
	//		    if (buf) fprintf(stderr,"%s\n", buf);
	//		    fgets(buf, sizeof(buf), stdin); // graphical window not yet initialized, wait for any key here
	//		}
	//	    } else { // pausing via graphical windows
	//		int tmp = paused_for_mouse;
	//		if (buf && paused_for_mouse) fprintf(stderr,"%s\n", buf);
	//		if (!tmp) {
	///#if defined(WGP_CONSOLE)
	//		    fprintf(stderr,"%s\n", buf);
	//			if (term && term->waitforinput)
	//		      while (term->waitforinput() != (int)'\r') {}; // waiting for Enter
	///#else
	//		    if (!Pause(buf))
	//		       bail_to_command_line();
	///#endif
	//		} else {
	//		    if (!Pause(buf))
	//		      if (!graphwin.hWndGraph)
	//		        bail_to_command_line();
	//		}
	//	    }
	//	}
	///#elif defined(OS2)
	//	if (strcmp(term->name, "pm") == 0 && sleep_time < 0) {
	//	    int rc;
	//	    if ((rc = PM_pause(buf)) == 0) {
	// /* if (!CallFromRexx)
	//  * would help to stop REXX programs w/o raising an error message
	//  * in RexxInterface() ...
	//  */
	//		bail_to_command_line();
	//	    } else if (rc == 2) {
	//		fputs(buf, stderr);
	//		text = 1;
	//		(void) fgets(buf, strlen(buf), stdin);
	//	    }
	//	}
	///#elif defined(_Macintosh)
	//	if (strcmp(term->name, "macintosh") == 0 && sleep_time < 0)
	//	    Pause( (int)sleep_time );
	///#else // !(_Windows || OS2 || _Macintosh)
	///#ifdef USE_MOUSE
		if (GlobalMembersTerm.term != null && GlobalMembersTerm.term.waitforinput)
		{
			/* term->waitforinput() will return,
			 * if CR was hit */
			GlobalMembersTerm.term.waitforinput();
		}
		else
		{
	///#endif // USE_MOUSE
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		() fgets(pause_command_buf, sizeof(pause_command_buf), stdin);
		/* Hold until CR hit. */
	///#ifdef USE_MOUSE
		}
	///#endif // USE_MOUSE
	///#endif // !(_Windows || OS2 || _Macintosh)
		}
		if (sleep_time > 0)
		usleep((int)((sleep_time) * 1e6));

		if (text != 0 && sleep_time >= 0)
		fputc('\n', stderr);
		GlobalMembersUtil.screen_ok = false;

	}

/* process the 'plot' command */
	public static void plot_command()
	{
		plot_token = c_token++;
		GlobalMembersDatafile.plotted_data_from_stdin = false;
		;
	///#ifdef USE_MOUSE
		GlobalMembersMouse.plot_mode(MODE_PLOT_TYPE.MODE_PLOT);
		GlobalMembersEval.add_udv_by_name("MOUSE_X").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_Y").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_X2").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_Y2").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_BUTTON").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_SHIFT").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_ALT").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_CTRL").udv_undef = true;
	///#endif
		GlobalMembersPlot2d.plotrequest();
		;
	}

/* process the 'print' command */
	public static void print_command()
	{
		value a = new value();
		/* space printed between two expressions only */
		int need_space = 0;

		if (print_out == null)
		{
		print_out = stderr;
		}
		GlobalMembersUtil.screen_ok = false;
		do
		{
		++c_token;
		GlobalMembersParse.const_express(a);
		if (a.type == DATA_TYPES.STRING)
		{
			fputs(a.v.string_val, print_out);
			GlobalMembersEval.gpfree_string(a);
			need_space = 0;
		}
		else
		{
			if (need_space != 0)
			putc(' ', print_out);
			disp_value(print_out, a, false);
			need_space = 1;
		}
		} while (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && GlobalMembersUtil.equals(c_token, ",") != 0);

		() putc('\n', print_out);
		fflush(print_out);
	}

/* process the 'pwd' command */
	public static void pwd_command()
	{
		String save_file = DefineConstants.NULL;

		save_file = (String) GlobalMembersAlloc.gp_alloc(DefineConstants.PATH_MAX, "print current dir");
		if (save_file != null)
		{
		getcwd(save_file, DefineConstants.PATH_MAX);
		fprintf(stderr, "%s\n", save_file);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(save_file);
		}
		c_token++;
	}

///#ifdef VOLATILE_REFRESH
/* EAM April 2007
 * The "refresh" command replots the previous graph without going back to read
 * the original data. This allows zooming or other operations on data that was
 * only transiently available in the input stream.
 */
	public static void refresh_command()
	{
		c_token++;
		GlobalMembersCommand.refresh_request();
	}

///#endif
/* process the 'replot' command */
	public static void replot_command()
	{
		if (replot_line == null)
		GlobalMembersBf_test.int_error(c_token, "no previous plot");
		/* Disable replot for some reason; currently used by the mouse/hotkey
		   capable terminals to avoid replotting when some data come from stdin,
		   i.e. when  plotted_data_from_stdin==1  after plot "-".
		*/
		if (replot_disabled)
		{
		replot_disabled = false;
		GlobalMembersPlot.bail_to_command_line(); // be silent --- don't mess the screen
		}
		if (GlobalMembersTerm.term == null) // unknown terminal
		GlobalMembersBf_test.int_error(c_token, "use 'set term' to set terminal type first");

		c_token++;
		;
		if (GlobalMembersTerm.term.flags & DefineConstants.TERM_INIT_ON_REPLOT != 0)
		GlobalMembersTerm.term.init();
		GlobalMembersCommand.replotrequest();
		;
	}

/* process the 'reread' command */
	public static void reread_command()
	{
		FILE fp = GlobalMembersMisc.lf_top();

		if (fp != (FILE) DefineConstants.NULL)
		rewind(fp);
		c_token++;
	}

/* process the 'save' command */
	public static void save_command()
	{
		FILE fp;
		String save_file = DefineConstants.NULL;
		int what;

		c_token++;
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: what = lookup_table(&save_tbl[0], c_token);
		what = GlobalMembersTables.lookup_table(new gen_table(GlobalMembersTables.save_tbl[0]), c_token);

		switch (what)
		{
		case SAVE_FUNCS:
		case SAVE_SET:
		case SAVE_TERMINAL:
		case SAVE_VARS:
			c_token++;
			break;
		default:
			break;
		}

		save_file = GlobalMembersUtil.try_to_get_string();
		if (save_file == null)
			GlobalMembersBf_test.int_error(c_token, "expecting filename");
	///#ifdef PIPES
		if (save_file.charAt(0) == '|')
		fp = GlobalMembersAmiga.popen(save_file + 1, "w");
		else
	///#endif
		{
	tangible.RefObject<String[]> tempRef_save_file = new tangible.RefObject<String[]>(save_file);
		GlobalMembersPlot.gp_expand_tilde(tempRef_save_file);
		save_file = tempRef_save_file.argvalue;
		fp = strcmp(save_file,"-") ? GlobalMembersMisc.loadpath_fopen(save_file, "w") : stdout;
		}

		if (fp == null)
		GlobalMembersUtil.os_error(c_token, "Cannot open save file");

		switch (what)
		{
		case SAVE_FUNCS:
			GlobalMembersSave.save_functions(fp);
		break;
		case SAVE_SET:
			GlobalMembersSave.save_set(fp);
		break;
		case SAVE_TERMINAL:
			GlobalMembersSave.save_term(fp);
		break;
		case SAVE_VARS:
			GlobalMembersSave.save_variables(fp);
		break;
		default:
			GlobalMembersSave.save_all(fp);
		}

		if (stdout != fp)
		{
	///#ifdef PIPES
		if (save_file.charAt(0) == '|')
			() GlobalMembersAmiga.pclose(fp);
		else
	///#endif
			() fclose(fp);
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(save_file);
	}

/* process the 'screendump' command */
	public static void screendump_command()
	{
		c_token++;
	///#ifdef _Windows
	//    screen_dump();
	///#else
		fputs("screendump not implemented\n", stderr);
	///#endif
	}

/* set_command() is in set.c */

/* 'shell' command is processed by do_shell(), see below */

/* show_command() is in show.c */


/* process the 'splot' command */
	public static void splot_command()
	{
		plot_token = c_token++;
		GlobalMembersDatafile.plotted_data_from_stdin = false;
		;
	///#ifdef USE_MOUSE
		GlobalMembersMouse.plot_mode(MODE_PLOT_TYPE.MODE_SPLOT);
		GlobalMembersEval.add_udv_by_name("MOUSE_X").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_Y").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_X2").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_Y2").udv_undef = true;
		GlobalMembersEval.add_udv_by_name("MOUSE_BUTTON").udv_undef = true;
	///#endif
		GlobalMembersPlot3d.plot3drequest();
		;
	}

/* process the 'system' command */
	public static void system_command()
	{
		String cmd;
		++c_token;
		cmd = GlobalMembersUtil.try_to_get_string();
		GlobalMembersCommand.do_system(cmd);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(cmd);
	}

/* process the 'test' command */
	public static void test_command()
	{
		int what;
		c_token++;
		if (c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
		{
		GlobalMembersTerm.test_term();
		return;
		}

//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: what = lookup_table(&test_tbl[0], c_token);
		what = GlobalMembersTables.lookup_table(new gen_table(GlobalMembersTables.test_tbl[0]), c_token);
		switch (what)
		{
		case TEST_TERMINAL:
			GlobalMembersTerm.test_term();
			break;
		case TEST_PALETTE:
			GlobalMembersCommand.test_palette_subcommand();
			break;
		case TEST_TIME:
			GlobalMembersCommand.test_time_subcommand();
			break;
		default:
			GlobalMembersBf_test.int_error(c_token, "only keywords are 'terminal' and 'palette'");
		}
	}

/* unset_command is in unset.c */


/* process the 'update' command */
	public static void update_command()
	{
		/* old parameter filename */
		String opfname = DefineConstants.NULL;
		/* new parameter filename */
		String npfname = DefineConstants.NULL;

		c_token++;
		if (!(opfname = GlobalMembersUtil.try_to_get_string()))
		GlobalMembersBf_test.int_error(c_token, "Parameter filename expected");
		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0 && !(npfname = GlobalMembersUtil.try_to_get_string()))
		GlobalMembersBf_test.int_error(c_token, "New parameter filename expected");

		GlobalMembersFit.update(opfname, npfname);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(npfname);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(opfname);
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String do_shell_exec = DefineConstants.EXEC;
	public static void do_shell()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static sbyte exec[100] = DefineConstants.EXEC;

		GlobalMembersUtil.screen_ok = false;
		c_token++;

		if (GlobalMembersPlot.user_shell != null)
		{
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		if (system(GlobalMembersStdfn.safe_strncpy(do_shell_exec.charAt(sizeof(DefineConstants.EXEC) - 1), GlobalMembersPlot.user_shell, sizeof(do_shell_exec) - sizeof(DefineConstants.EXEC) - 1)))
			GlobalMembersUtil.os_error(DefineConstants.NO_CARET, "system() failed");
		}
		() putc('\n', stderr);
	}
	public static void undefine_command()
	{
		String key = new String(new char[DefineConstants.MAX_ID_LEN + 1]);
		udvt_entry[] udv_ptr = GlobalMembersEval.first_udv;
		c_token++;
		while (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
		{
		GlobalMembersUtil.copy_str(key, c_token, DefineConstants.MAX_ID_LEN);
		if (strncmp(key, "GPVAL_", 6) && strncmp(key, "MOUSE_", 6))
		{
			udv_ptr = GlobalMembersEval.first_udv;
			while (udv_ptr != null)
			{
			if (!strcmp(key, (udv_ptr).udv_name))
			{
				udv_ptr.udv_undef = true;
				GlobalMembersEval.gpfree_string(((udv_ptr).udv_value));
				break;
			}
			udv_ptr = &((udv_ptr).next_udv);
			}
		}
		c_token++;
		}
	}

/* support for dynamic size of input line */

	/* Prototypes for functions exported by command.c */
	public static void extend_input_line()
	{
		if (gp_input_line_len == 0)
		{
		/* first time */
		gp_input_line = GlobalMembersAlloc.gp_alloc(DefineConstants.MAX_LINE_LEN, "gp_input_line");
		gp_input_line_len = DefineConstants.MAX_LINE_LEN;
		gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, 0, DefineConstants.NUL);

	///#ifdef OS2_IPC
	//	sprintf( mouseSharedMemName, "\\SHAREMEM\\GP%i_Mouse_Input", getpid() );
	//	if (DosAllocSharedMem((PVOID) & input_from_PM_Terminal,
	//		mouseSharedMemName, MAX_LINE_LEN, PAG_WRITE | PAG_COMMIT))
	//	    fputs("command.c: DosAllocSharedMem ERROR\n",stderr);
	///#endif // OS2_IPC

		}
		else
		{
		gp_input_line = GlobalMembersAlloc.gp_realloc(gp_input_line, gp_input_line_len + DefineConstants.MAX_LINE_LEN, "extend input line");
		gp_input_line_len += DefineConstants.MAX_LINE_LEN;
		GlobalMembersFit.a((stderr, "extending input line to %d chars\n", gp_input_line_len));
		}
	}
	public static void extend_token_table()
	{
		if (token_table_size == 0)
		{
		/* first time */
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		token = (GlobalMembersMouse.struct lexical_unit *) GlobalMembersAlloc.gp_alloc(DefineConstants.MAX_TOKENS * sizeof(GlobalMembersMouse.struct lexical_unit), "token table");
		token_table_size = DefineConstants.MAX_TOKENS;
		/* HBB: for checker-runs: */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(token, 0, DefineConstants.MAX_TOKENS * sizeof(token));
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		token = GlobalMembersAlloc.gp_realloc(token, (token_table_size + DefineConstants.MAX_TOKENS) * sizeof(GlobalMembersMouse.struct lexical_unit), "extend token table");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(token + token_table_size, 0, DefineConstants.MAX_TOKENS * sizeof(token));
		token_table_size += DefineConstants.MAX_TOKENS;
		GlobalMembersFit.a((stderr, "extending token table to %d elements\n", token_table_size));
		}
	}

///#ifdef OS2_IPC
//void thread_read_line()
//{
//   thread_rl_Running = 1;
//   thread_rl_RetCode = ( read_line(PROMPT) );
//   thread_rl_Running = 0;
//   DosPostEventSem(semInputReady);
//}
///#endif // OS2_IPC 


	public static int com_line()
	{
	///#ifdef OS2_IPC
	//static char *input_line_SharedMem = NULL;
	//
	//    if (input_line_SharedMem == NULL) {  // get shared mem only once
	//    if (DosGetNamedSharedMem((PVOID) &input_line_SharedMem,
	//		mouseSharedMemName, PAG_WRITE | PAG_READ))
	//	fputs("readline.c: DosGetNamedSharedMem ERROR\n", stderr);
	//    else
	//	*input_line_SharedMem = 0;
	//    }
	///#endif // OS2_IPC

		if (GlobalMembersTerm.multiplot)
		{
		/* calls int_error() if it is not happy */
		GlobalMembersTerm.term_check_multiplot_okay(GlobalMembersPlot.interactive);

		if (GlobalMembersCommand.read_line("multiplot> ") != 0)
			return (1);
		}
		else
		{

	///#ifndef USE_MOUSE
	//	if (read_line(PROMPT))
	//	    return (1);
	///#else
	///#ifdef OS2_IPC
	//	ULONG u;
	//        if (thread_rl_Running == 0) {
	//	    int res = _beginthread(thread_read_line,NULL,32768,NULL);
	//	    if (res == -1)
	//		fputs("error command.c could not begin thread\n",stderr);
	//	}
	// /* wait until a line is read or gnupmdrv makes shared mem available */
	//	DosWaitEventSem(semInputReady,SEM_INDEFINITE_WAIT);
	//	DosResetEventSem(semInputReady,&u);
	//	if (thread_rl_Running) {
	//	    if (input_line_SharedMem == NULL || !*input_line_SharedMem)
	//		return (0);
	//	    if (*input_line_SharedMem=='%') {
	//		do_event( (struct gp_event_t*)(input_line_SharedMem+1) ); // pass terminal's event
	//		input_line_SharedMem[0] = 0; // discard the whole command line
	//		thread_rl_RetCode = 0;
	//		return (0);
	//	    }
	//	    if (*input_line_SharedMem &&
	//	        strstr(input_line_SharedMem,"plot") != NULL &&
	//		(strcmp(term->name,"pm") && strcmp(term->name,"x11"))) {
	// /* avoid plotting if terminal is not PM or X11 */
	//		fprintf(stderr,"\n\tCommand(s) ignored for other than PM and X11 terminals\a\n");
	//		if (interactive) fputs(PROMPT,stderr);
	//		input_line_SharedMem[0] = 0; // discard the whole command line
	//		return (0);
	//	    }
	///#if 0
	//	    fprintf(stderr,"shared mem received: |%s|\n",input_line_SharedMem);
	//	    if (*input_line_SharedMem && input_line_SharedMem[strlen(input_line_SharedMem)-1] != '\n') fprintf(stderr,"\n");
	///#endif
	//	    strcpy(gp_input_line, input_line_SharedMem);
	//	    input_line_SharedMem[0] = 0;
	//	    thread_rl_RetCode = 0;
	//	}
	//	if (thread_rl_RetCode)
	//	    return (1);
	///#else // OS2_IPC
		if (GlobalMembersCommand.read_line(DefineConstants.PROMPT) != 0)
			return (1);
	///#endif // OS2_IPC
	///#endif // USE_MOUSE
		}

		/* So we can flag any new output: if false at time of error,
		 * we reprint the command line before printing caret.
		 * TRUE for interactive terminals, since the command line is typed.
		 * FALSE for non-terminal stdin, so command line is printed anyway.
		 * (DFK 11/89)
		 */
		GlobalMembersUtil.screen_ok = GlobalMembersPlot.interactive;

		if (GlobalMembersCommand.do_line() != 0)
		return (1);
		else
		return (0);
	}
	public static int do_line()
	{
		/* Line continuation has already been handled
		 * by read_line() */
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * inlptr = gp_input_line;

		/* Skip leading whitespace */
		while (Character.isWhitespace((byte) * inlptr))
		inlptr++;

		if (!gp_input_line.equals(inlptr))
		{
		/* If there was leading whitespace, copy the actual
		 * command string to the front. use memmove() because
		 * source and target may overlap */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memmove' has no equivalent in Java:
		memmove(gp_input_line, inlptr, inlptr.length());
		/* Terminate resulting string */
		gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, inlptr.length(), DefineConstants.NUL);
		}
		GlobalMembersFit.a((stderr, "Input line: \"%s\"\n", gp_input_line));

	///#ifdef GP_MACROS
		/* Expand any string variables in the current input line.
		 * Allow up to 4 levels of recursion */
		if (expand_macros)
		if (GlobalMembersCommand.string_expand() != 0 && GlobalMembersCommand.string_expand() != 0 && GlobalMembersCommand.string_expand() != 0 && GlobalMembersCommand.string_expand() != 0 && GlobalMembersCommand.string_expand() != 0)
		GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Too many levels of nested macros");
	///#endif

		/* also used in load_file */
		if (((gp_input_line.charAt(0)) == '!'))
		{
		GlobalMembersCommand.do_system(gp_input_line + 1);
		if (GlobalMembersPlot.interactive) // 3.5 did it unconditionally
			() fputs("!\n", stderr); // why do we need this ?
		return (0);
		}

		if_depth = 0;
		if_condition = true;
	tangible.RefObject<String[]> tempRef_gp_input_line = new tangible.RefObject<String[]>(gp_input_line);
		num_tokens = GlobalMembersScanner.scanner(tempRef_gp_input_line, gp_input_line_len);
		gp_input_line = tempRef_gp_input_line.argvalue;
		c_token = 0;
		while (c_token < num_tokens)
		{
		GlobalMembersCommand.command();
		if (command_exit_status != 0)
		{
			command_exit_status = 0;
			return 1;
		}
		if (c_token < num_tokens) // something after command
		{
			if (GlobalMembersUtil.equals(c_token, ";") != 0)
			c_token++;
			else
			GlobalMembersBf_test.int_error(c_token, "';' expected");
		}
		}
		return (0);
	}
	public static void do_string(String s, boolean throwaway_s)
	{
		boolean screen_was_ok = GlobalMembersUtil.screen_ok;

	///#ifdef USE_MOUSE
		if (GlobalMembersCommand.display_ipc_commands() != 0)
		fprintf(stderr, "%s\n", s);
	///#endif

		GlobalMembersMisc.lf_push(DefineConstants.NULL); // save state for errors and recursion
		GlobalMembersMisc.lf_head.c_token = c_token;
		GlobalMembersMisc.lf_head.num_tokens = num_tokens;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		GlobalMembersMisc.lf_head.tokens = GlobalMembersAlloc.gp_alloc(num_tokens * sizeof(GlobalMembersMouse.struct lexical_unit), "lf tokens");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memcpy(GlobalMembersMisc.lf_head.tokens, token, num_tokens * sizeof(GlobalMembersMouse.struct lexical_unit));
		GlobalMembersMisc.lf_head.input_line = GlobalMembersUtil.gp_strdup(gp_input_line);
		while (gp_input_line_len < s.length() + 1)
		GlobalMembersCommand.extend_input_line();
		gp_input_line = s;
		if (throwaway_s)
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(s);
		GlobalMembersUtil.screen_ok = false;
		GlobalMembersCommand.do_line();
		GlobalMembersUtil.screen_ok = screen_was_ok;

		GlobalMembersMisc.lf_pop();
	}

///#ifdef USE_MOUSE
	///#ifdef USE_MOUSE
	public static void toggle_display_of_ipc_commands()
	{
		if (mouse_setting.verbose)
		mouse_setting.verbose = 0;
		else
		mouse_setting.verbose = 1;
	}
	public static int display_ipc_commands()
	{
		return mouse_setting.verbose;
	}
	public static void do_string_replot(String s)
	{
		byte orig_input_line = GlobalMembersUtil.gp_strdup(gp_input_line);

		while (gp_input_line_len < s.length() + 1)
		GlobalMembersCommand.extend_input_line();
		gp_input_line = s;
		if (GlobalMembersCommand.display_ipc_commands() != 0)
		fprintf(stderr, "%s\n", s);

		GlobalMembersCommand.do_line();

	///#ifdef VOLATILE_REFRESH
		if (GlobalMembersGadgets.volatile_data && GlobalMembersGadgets.refresh_ok != 0)
		{
		if (GlobalMembersCommand.display_ipc_commands() != 0)
			fprintf(stderr, "refresh\n");
		GlobalMembersCommand.refresh_request();
		}
		else
	///#endif

		if (!replot_disabled)
		GlobalMembersCommand.replotrequest();
		else
		GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "refresh not possible and replot is disabled");

		gp_input_line = orig_input_line;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(orig_input_line);
	}
///#endif // USE_MOUSE 


	///#endif
	///#ifdef VMS // HBB 990829: used only on VMS
	//void done __PROTO((int status));
	///#endif
	public static void define()
	{
		int start_token; // the 1st token in the function definition
		udvt_entry udv;
		udft_entry udf;
		value result = new value();

		if (GlobalMembersUtil.equals(c_token + 1, "(") != 0)
		{
		/* function ! */
		int dummy_num = 0;
		at_type at_tmp;
		byte[][] save_dummy = new byte[DefineConstants.MAX_NUM_VAR][DefineConstants.MAX_ID_LEN + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memcpy(save_dummy, GlobalMembersParse.c_dummy_var, sizeof(save_dummy));
		start_token = c_token;
		do
		{
			c_token += 2; // skip to the next dummy
			GlobalMembersUtil.copy_str(GlobalMembersParse.c_dummy_var[dummy_num++], c_token, DefineConstants.MAX_ID_LEN);
		} while (GlobalMembersUtil.equals(c_token + 1, ",") != 0 && (dummy_num < DefineConstants.MAX_NUM_VAR));
		if (GlobalMembersUtil.equals(c_token + 1, ",") != 0)
			GlobalMembersBf_test.int_error(c_token + 2, "function contains too many parameters");
		c_token += 3; // skip (, dummy, ) and =
		if (c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
			GlobalMembersBf_test.int_error(c_token, "function definition expected");
		udf = dummy_func = GlobalMembersParse.add_udf(start_token);
		udf.dummy_num = dummy_num;
		if ((at_tmp = GlobalMembersParse.perm_at()) == (GlobalMembersMouse.struct at_type *) DefineConstants.NULL)
			GlobalMembersBf_test.int_error(start_token, "not enough memory for function");
		if (udf.at != null) // already a dynamic a.t. there
			GlobalMembersEval.free_at(udf.at); // so free it first
		udf.at = at_tmp; // before re-assigning it.
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memcpy(GlobalMembersParse.c_dummy_var, save_dummy, sizeof(save_dummy));
		GlobalMembersUtil.m_capture((udf.definition), start_token, c_token - 1);
		dummy_func = DefineConstants.NULL; // dont let anyone else use our workspace

		/* Save function definition in a user-accessible variable */
		if (true)
		{
			byte tmpnam = GlobalMembersAlloc.gp_alloc(8 + udf.udf_name.length(), "varname");
			tmpnam = "GPFUN_";
			tmpnam += udf.udf_name;
			GlobalMembersEval.fill_gpval_string(tmpnam, udf.definition);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(tmpnam);
		}
		}
		else
		{
		/* variable ! */
		String varname = gp_input_line + token[c_token].start_index;
		if (!strncmp(varname, "GPVAL_", 6) || !strncmp(varname, "MOUSE_", 6))
			GlobalMembersBf_test.int_error(c_token, "Cannot set internal variables GPVAL_ and MOUSE_");
		start_token = c_token;
		c_token += 2;
		udv = GlobalMembersParse.add_udv(start_token);
		() GlobalMembersParse.const_express(result);
		/* Prevents memory leak if the variable name is re-used */
		if (!udv.udv_undef)
			GlobalMembersEval.gpfree_string(udv.udv_value);
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
//ORIGINAL LINE: udv->udv_value = result;
		udv.udv_value.copyFrom(result);
		udv.udv_undef = false;
		}
	}

/* used by replot_command() */

	public static void replotrequest()
	{
		if (GlobalMembersUtil.equals(c_token, "[") != 0)
		GlobalMembersBf_test.int_error(c_token, "cannot set range with replot");

		/* do not store directly into the replot_line string, until the
		 * new plot line has been successfully plotted. This way,
		 * if user makes a typo in a replot line, they do not have
		 * to start from scratch. The replot_line will be committed
		 * after do_plot has returned, whence we know all is well
		 */
		if (c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
		{
		String rest_args = gp_input_line.charAt(token[c_token].start_index);
		int replot_len = replot_line.length();
		int rest_len = rest_args.length();

		/* preserve commands following 'replot ;' */
		/* move rest of input line to the start
		 * necessary because of realloc() in extend_input_line() */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memmove' has no equivalent in Java:
		memmove(gp_input_line,rest_args,rest_len + 1);
		/* reallocs if necessary */
		while (gp_input_line_len < replot_len + rest_len + 1)
			GlobalMembersCommand.extend_input_line();
		/* move old rest args off begin of input line to
		 * make space for replot_line */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memmove' has no equivalent in Java:
		memmove(gp_input_line + replot_len,gp_input_line,rest_len + 1);
		/* copy previous plot command to start of input line */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(gp_input_line, replot_line, replot_len);
		}
		else
		{
		String replot_args = DefineConstants.NULL; // else m_capture will free it
		int last_token = num_tokens - 1;

		/* length = length of old part + length of new part + ", " + \0 */
		int newlen = replot_line.length() + token[last_token].start_index + token[last_token].length - token[c_token].start_index + 3;

	tangible.RefObject<String[]> tempRef_replot_args = new tangible.RefObject<String[]>(replot_args);
		GlobalMembersUtil.m_capture(tempRef_replot_args, c_token, last_token); // might be empty
		replot_args = tempRef_replot_args.argvalue;
		while (gp_input_line_len < newlen)
			GlobalMembersCommand.extend_input_line();
		gp_input_line = replot_line;
		gp_input_line += ", ";
		gp_input_line += replot_args;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(replot_args);
		}
		plot_token = 0; // whole line to be saved as replot line

		GlobalMembersUtil.screen_ok = false;
	tangible.RefObject<String[]> tempRef_gp_input_line = new tangible.RefObject<String[]>(gp_input_line);
		num_tokens = GlobalMembersScanner.scanner(tempRef_gp_input_line, gp_input_line_len);
		gp_input_line = tempRef_gp_input_line.argvalue;
		c_token = 1; // skip the 'plot' part

		if (GlobalMembersGadgets.is_3d_plot)
		GlobalMembersPlot3d.plot3drequest();
		else
		GlobalMembersPlot2d.plotrequest();
	}

	public static void print_set_output(String name, boolean append_p)
	{
		if (print_out != null && print_out != stderr && print_out != stdout)
		{
	///#ifdef PIPES
		if (print_out_name.charAt(0) == '|')
		{
			if (0 > GlobalMembersAmiga.pclose(print_out))
			perror(print_out_name);
		}
		else
	///#endif
			if (0 > fclose(print_out))
			perror(print_out_name);
		}

		if (print_out_name != null)
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(print_out_name);

		print_out_name = DefineConstants.NULL;

		if (name == null)
		{
		print_out = stderr;
		return;
		}

		if (!strcmp(name, "-"))
		{
		print_out = stdout;
		return;
		}

	///#ifdef PIPES
		if (name.charAt(0) == '|')
		{
		print_out = GlobalMembersAmiga.popen(name + 1, "w");
		if (print_out == null)
			perror(name);
		else
			print_out_name = name;
		return;
		}
	///#endif

		print_out = fopen(name, append_p ? "a" : "w");
		if (print_out == null)
		{
		perror(name);
		return;
		}

		print_out_name = name;
	}
	public static String print_show_output()
	{
		if (print_out == stdout)
		return "<stdout>";
		if (print_out == null || print_out == stderr || print_out_name == null)
		return "<stderr>";
		return print_out_name;
	}

/* This routine is called at the beginning of 'splot'. It sets up some splot
 * parameters needed to present the 'set view map'.
 */

	/* Activate/deactive effects of 'set view map' before 'splot'/'plot',
	 * respectively. Required for proper mousing during 'set view map';
	 * actually it won't be necessary if gnuplot keeps a copy of all variables for
	 * the current plot and don't share them with 'set' commands.
	 *   These routines need to be executed before each plotrequest() and
	 * plot3drequest().
	 */
	public static void splot_map_activate()
	{
		if (splot_map_active != 0)
		return;
		splot_map_active = 1;
		/* save current values */
		splot_map_surface_rot_x = GlobalMembersGraph3d.surface_rot_x;
		splot_map_surface_rot_z = GlobalMembersGraph3d.surface_rot_z;
		splot_map_surface_scale = GlobalMembersGraph3d.surface_scale;
		/* set new values */
		GlobalMembersGraph3d.surface_rot_x = 180F;
		GlobalMembersGraph3d.surface_rot_z = 0F;
		GlobalMembersGraph3d.surface_scale = 1.3F;
		GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags ^= DefineConstants.RANGE_REVERSE;
		GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].range_flags ^= DefineConstants.RANGE_REVERSE;
		/* note: ^ is xor */
	}

/* This routine is called when the current 'set view map' is no more needed,
 * i.e., when calling "plot" --- the reversed y-axis et al must still be
 * available for mousing.
 */
	public static void splot_map_deactivate()
	{
		if (splot_map_active == 0)
		return;
		splot_map_active = 0;
		/* restore the original values */
		GlobalMembersGraph3d.surface_rot_x = splot_map_surface_rot_x;
		GlobalMembersGraph3d.surface_rot_z = splot_map_surface_rot_z;
		GlobalMembersGraph3d.surface_scale = splot_map_surface_scale;
		GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags ^= DefineConstants.RANGE_REVERSE;
		GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].range_flags ^= DefineConstants.RANGE_REVERSE;
		/* note: ^ is xor */
	}

	public static int do_system_func(String cmd, tangible.RefObject<String[]> output)
	{

	///#if defined(VMS) || defined(PIPES)
		int c;
		FILE f;
		int cmd_len;
		int result_allocated;
		int result_pos;
		String result;
		int ierr = 0;
	///#ifdef AMIGA_AC_5
	//    int fd;
	///#elif defined(VMS)
	//    int chan, one = 1;
	//    struct dsc$descriptor_s pgmdsc = {0, DSC$K_DTYPE_T, DSC$K_CLASS_S, 0};
	//    static $DESCRIPTOR(lognamedsc, "PLOT$MAILBOX");
	///#endif // VMS

		cmd_len = cmd.length();

		/* open stream */
	///#ifdef VMS
	//    pgmdsc.dsc$a_pointer = cmd;
	//    pgmdsc.dsc$w_length = cmd_len;
	//    if (!((vaxc$errno = sys$crembx(0, &chan, 0, 0, 0, 0, &lognamedsc)) & 1))
	//	os_error(NO_CARET, "sys$crembx failed");
	//
	//    if (!((vaxc$errno = lib$spawn(&pgmdsc, 0, &lognamedsc, &one)) & 1))
	//	os_error(NO_CARET, "lib$spawn failed");
	//
	//    if ((f = fopen("PLOT$MAILBOX", "r")) == NULL)
	//	os_error(NO_CARET, "mailbox open failed");
	///#elif defined(AMIGA_AC_5)
	//	if ((fd = open(cmd, "O_RDONLY")) == -1)
	///#else	// everyone else
			if ((f = GlobalMembersAmiga.popen(cmd, "r")) == DefineConstants.NULL)
			GlobalMembersUtil.os_error(DefineConstants.NO_CARET, "popen failed");
	///#endif	// everyone else

		/* get output */
		result_pos = 0;
		result_allocated = DefineConstants.MAX_LINE_LEN;
		result = GlobalMembersAlloc.gp_alloc(DefineConstants.MAX_LINE_LEN, "do_system_func");
		result = tangible.StringFunctions.changeCharacter(result, 0, DefineConstants.NUL);
		while (true)
		{
	///#if defined(AMIGA_AC_5)
	//	char ch;
	//	if (read(fd, &ch, 1) != 1)
	//	    break;
	//	c = ch;
	///#else
		if ((c = getc(f)) == EOF)
			break;
	///#endif				// !AMIGA_AC_5
		/* result <- c */
		result = tangible.StringFunctions.changeCharacter(result, result_pos++, c);
		if (result_pos == result_allocated)
		{
			if (result_pos >= 1024 * DefineConstants.MAX_LINE_LEN)
			{
			result_pos--;
			GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "*very* long system call output has been truncated");
			break;
			}
			else
			{
			result = GlobalMembersAlloc.gp_realloc(result, result_allocated + DefineConstants.MAX_LINE_LEN, "extend in do_system_func");
			result_allocated += DefineConstants.MAX_LINE_LEN;
			}
		}
		}
		result = tangible.StringFunctions.changeCharacter(result, result_pos, DefineConstants.NUL);

		/* close stream */
	///#ifdef AMIGA_AC_5
	//    (void) close(fd);
	///#else				// Rest of the world
		ierr = GlobalMembersAmiga.pclose(f);
	///#endif

		result = GlobalMembersAlloc.gp_realloc(result, result.length() + 1, "do_system_func");
		output.argvalue = result;
		return ierr;

	///#else // VMS || PIPES
	//
	//    int_warn(NO_CARET, "system evaluation not supported by %s", OS);
	//    *output = gp_strdup("");
	//    return 0;
	//
	///#endif // VMS || PIPES

	}



	///#ifdef HAVE_CONFIG_H
	///#endif
	///#define TC_DEFAULT 0
	///#define TC_LT 1
	///#define TC_LINESTYLE 2
	///#define TC_RGB 3
	///#define TC_CB 4
	///#define TC_FRAC 5
	///#define TC_Z 6
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_COLORSPEC {TC_DEFAULT, 0, 0.0}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define BLACK_COLORSPEC {TC_LT, LT_BLACK, 0.0}
	///#ifdef EXTENDED_COLOR_SPECS
	///#endif
	///#ifdef EXTENDED_COLOR_SPECS
	///#endif
	///#define STACK_DEPTH 100
	///#define MAX_AT_LEN 150
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define is_jump(operator) ((operator) >=(int)JUMP && (operator) <(int)SF_START)
	///#ifdef __ZTC__
	///#else
	///#endif
	///#ifdef APOLLO
	///#endif
	///#define SMPAL_NEGATIVE 'n'
	///#define SMPAL_POSITIVE 'p'
	///#ifdef EXTENDED_COLOR_SPECS
	///#endif
	///#ifdef EXTENDED_COLOR_SPECS
	///#else
	///#endif
	///#if defined(PIPE_IPC) || defined(WIN_IPC)
	///#endif
	///#ifdef OS2
	///#endif
	///#ifdef USE_MOUSE
	///#endif
	///#define LT_AXIS (-1)
	///#define LT_BLACK (-2)
	///#define LT_NODRAW (-3)
	///#define LT_BACKGROUND (-4)
	///#define LT_UNDEFINED (-5)
	///#define LT_COLORFROMCOLUMN (-6)
	///#define LT_DEFAULT (-7)
	///#define TEXT_VERTICAL (-270)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_LP_STYLE_TYPE {0, -2, 0, 0, 1.0, PTSZ_DEFAULT, FALSE, DEFAULT_COLORSPEC}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FS_OPAQUE (FS_SOLID + (100<<4))
	///#define TERM_CAN_MULTIPLOT 1
	///#define TERM_CANNOT_MULTIPLOT 2
	///#define TERM_BINARY 4
	///#define TERM_INIT_ON_REPLOT 8
	///#define TERM_IS_POSTSCRIPT 16
	///#define TERM_ENHANCED_TEXT 32
	///#define TERM_NO_OUTPUTFILE 64
	///#define TERM_CAN_CLIP 128
	///#define TERM_CAN_DASH 256
	///#define TERM_ALPHA_CHANNEL 512
	///#define TERM_MONOCHROME 1024
	///#define TERM_LINEWIDTH 2048
	///#ifdef WIN16
	///#else
	///#endif
	///#ifdef USE_MOUSE
	///#endif
	///#ifdef WIN16
	///#define termentry TERMENTRY far
	///#else
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define termentry TERMENTRY
	///#endif
	///#ifdef PIPE_IPC
	///#endif // PIPE_IPC 
	///#if 0 // UNUSED
	///#endif // UNUSED 
	///#ifdef EAM_OBJECTS
	///#endif
	///#ifdef LINUXVGA
	///#endif
	///#ifdef PC
	///#endif
	///#ifdef VMS
	///#endif
	///#ifdef OS2
	///#ifdef USE_MOUSE
	///#endif
	///#endif
	///#define PTSZ_DEFAULT (-2)
	///#define PTSZ_VARIABLE (-3)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define EMPTY_LABELSTRUCT {NULL, -2, {character, character, character, 0.0, 0.0, 0.0}, CENTRE, 0, 0, NULL, NULL, {TC_LT, -2, 0.0}, DEFAULT_LP_STYLE_TYPE, {character, character, character, 0.0, 0.0, 0.0}, FALSE }
	///#ifdef EAM_OBJECTS
	///#define OBJ_RECTANGLE (1)
	///#define OBJ_CIRCLE (2)
	///#define OBJ_ELLIPSE (3)
	///#define OBJ_POLYGON (4)
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define EMPTY_FILLEDCURVES_OPTS { 0, 0, 0.0, 0.0, 0 }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_HISTOGRAM_STYLE { HT_NONE, 2, 1, 0.0, 0.0, LT_UNDEFINED, LT_UNDEFINED, 0, NULL, EMPTY_LABELSTRUCT }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_KEYBOX_LP { 0, LT_NODRAW, 0, 1.0, 1.0, 0 }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_KEY_POSITION { graph, graph, graph, 0.9, 0.9, 0. }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_KEY_PROPS { TRUE, GPKEY_AUTO_INTERIOR_LRTBC, GPKEY_RMARGIN, DEFAULT_KEY_POSITION, JUST_TOP, RIGHT, GPKEY_RIGHT, GPKEY_VERTICAL, 4.0, 1.0, 0.0, 0.0, FILENAME_KEYTITLES, FALSE, FALSE, TRUE, DEFAULT_KEYBOX_LP, "", NULL, {TC_LT, LT_BLACK, 0.0} }
	///#define SMCOLOR_BOX_NO 'n'
	///#define SMCOLOR_BOX_DEFAULT 'd'
	///#define SMCOLOR_BOX_USER 'u'
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_MARGIN_POSITION {character, character, character, -1, -1, -1}
	///#ifdef EAM_OBJECTS
	///#endif
	///#ifndef DEFAULT_TIMESTAMP_FORMAT
	///#define DEFAULT_TIMESTAMP_FORMAT "%a %b %d %H:%M:%S %Y"
	///#endif
	///#define ZERO 1e-8
	///#define SOUTH 1
	///#define WEST 2
	///#define NORTH 4
	///#define EAST 8
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_east (draw_border & EAST)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_west (draw_border & WEST)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_south (draw_border & SOUTH)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_north (draw_border & NORTH)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_complete ((draw_border & 15) == 15)
	///#define SAMPLES 100
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ALMOST2D ( !is_3d_plot || ( fabs(fmod(surface_rot_z,90.0))<0.1 && (surface_rot_x>179.9 || surface_rot_x<0.1) ) )
	///#ifdef VOLATILE_REFRESH
	///#else
	///#define refresh_ok FALSE
	///#endif
	///#define LAYER_BEHIND -1
	///#define LAYER_BACK 0
	///#define LAYER_FRONT 1
	///#define LAYER_PLOTLABELS 99
	///#ifdef EAM_OBJECTS
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_RECTANGLE_STYLE { NULL, -1, 0, OBJ_RECTANGLE, {FS_SOLID, 100, 0, BLACK_COLORSPEC}, {1, LT_BACKGROUND, 0, 0, 1.0, 0.0, FALSE, DEFAULT_COLORSPEC}, {.rectangle = {0, {0,0.,0.,0.}, {0,0.,0.,0.}, {0,0.,0.,0.}, {0,0.,0.,0.}}} }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_CIRCLE_STYLE { NULL, -1, 0, OBJ_CIRCLE, {FS_SOLID, 100, 0, BLACK_COLORSPEC}, {1, LT_BACKGROUND, 0, 0, 1.0, 0.0, FALSE, DEFAULT_COLORSPEC}, {.circle = {1, {0,0.,0.,0.}, {0,0.,0.,0.}, 0., 360. }} }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_ELLIPSE_STYLE { NULL, -1, 0, OBJ_CIRCLE, {FS_SOLID, 100, 0, BLACK_COLORSPEC}, {1, LT_BACKGROUND, 0, 0, 1.0, 0.0, FALSE, DEFAULT_COLORSPEC}, {.ellipse = {1, {0,0.,0.,0.}, {0,0.,0.,0.}, 0. }} }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_POLYGON_STYLE { NULL, -1, 0, OBJ_POLYGON, {FS_SOLID, 100, 0, BLACK_COLORSPEC}, {1, LT_BLACK, 0, 0, 1.0, 0.0, FALSE, DEFAULT_COLORSPEC}, {.polygon = {0, NULL} } }
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
	///#define FIRST_AXES 0
	///#define SECOND_AXES 4
	///#define NO_AXIS 99
	///#define AXIS_ARRAY_SIZE 11
	///#define NO_TICS 0
	///#define TICS_ON_BORDER 1
	///#define TICS_ON_AXIS 2
	///#define TICS_MASK 3
	///#define TICS_MIRROR 4
	///#if 0 // HBB 20010806 --- move GRID flags into axis struct
	////#define GRID_OFF    0
	////#define GRID_X      (1<<0)
	////#define GRID_Y      (1<<1)
	////#define GRID_Z      (1<<2)
	////#define GRID_X2     (1<<3)
	////#define GRID_Y2     (1<<4)
	////#define GRID_MX     (1<<5)
	////#define GRID_MY     (1<<6)
	////#define GRID_MZ     (1<<7)
	////#define GRID_MX2    (1<<8)
	////#define GRID_MY2    (1<<9)
	////#define GRID_CB     (1<<10)
	////#define GRID_MCB    (1<<11)
	///#endif // 0 
	///#define RANGE_WRITEBACK 1
	///#define RANGE_REVERSE 2
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_AXIS_TICDEF {TIC_COMPUTED, NULL, {TC_DEFAULT, 0, 0}, {NULL, {0,0}, FALSE}, { character, character, character, 0., 0., 0. }, FALSE }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_AXIS_ZEROAXIS {0, -3, 0, 1.0, 1.0, 0}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_AXIS_STRUCT { AUTOSCALE_BOTH, AUTOSCALE_BOTH, 0, FALSE, -10.0, 10.0, -10.0, 10.0, -10.0, 10.0, 0.0, 0.0, 0, 0, 0, 0, FALSE, 0.0, 0.0, 0, 1, DEF_FORMAT, TIMEFMT, NO_TICS, DEFAULT_AXIS_TICDEF, 0, FALSE, FALSE, MINI_DEFAULT, 10, 1.0, 0.5, TRUE, EMPTY_LABELSTRUCT, DEFAULT_AXIS_ZEROAXIS }
	///#define DEF_FORMAT "% g"
	///#define TIMEFMT "%d/%m/%y,%H:%M"
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define X_AXIS axis_array[x_axis]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Y_AXIS axis_array[y_axis]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Z_AXIS axis_array[z_axis]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CB_AXIS axis_array[COLOR_AXIS]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_MAP(axis, variable) (int) ((axis_array[axis].term_lower) + ((variable) - axis_array[axis].min) * axis_array[axis].term_scale + 0.5)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_MAPBACK(axis, pos) (((double)(pos)-axis_array[axis].term_lower)/axis_array[axis].term_scale + axis_array[axis].min)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_x(x) (int) ((axis_array[x_axis].term_lower) + ((x) - axis_array[x_axis].min) * axis_array[x_axis].term_scale + 0.5)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_y(y) (int) ((axis_array[y_axis].term_lower) + ((y) - axis_array[y_axis].min) * axis_array[y_axis].term_scale + 0.5)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_SETSCALE(axis, out_low, out_high) axis_array[axis].term_scale = ((out_high) - (out_low)) / (axis_array[axis].max - axis_array[axis].min)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_WRITEBACK(axis) do { axis *this = axis_array + axis; if (this->range_flags & RANGE_WRITEBACK) { if (this->autoscale & AUTOSCALE_MIN) this->set_min = this->min; if (this->autoscale & AUTOSCALE_MAX) this->set_max = this->max; } } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_DO_LOG(axis,value) (log(value) / axis_array[axis].log_base)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_UNDO_LOG(axis,value) exp((value) * axis_array[axis].log_base)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_LOG_VALUE(axis,value) (axis_array[axis].log ? (log(value) / axis_array[axis].log_base) : (value))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_DE_LOG_VALUE(axis,coordinate) (axis_array[axis].log ? exp((coordinate) * axis_array[axis].log_base): (coordinate))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_INIT3D(axis, islog_override, infinite) do { axis *this = axis_array + axis; this->autoscale = this->set_autoscale; if ((this->autoscale & AUTOSCALE_BOTH) == AUTOSCALE_NONE && this->set_max < this->set_min) { this->min = this->set_max; this->max = this->set_min; } else { this->min = (infinite && (this->set_autoscale & AUTOSCALE_MIN)) ? VERYLARGE : this->set_min; this->max = (infinite && (this->set_autoscale & AUTOSCALE_MAX)) ? -VERYLARGE : this->set_max; } if (islog_override) { this->log = 0; this->base = 1; this->log_base = 0; } else { this->log_base = this->log ? log(this->base) : 0; } this->data_min = VERYLARGE; this->data_max = -VERYLARGE; } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_INIT2D(axis, infinite) do { axis *this = axis_array + axis; this->autoscale = this->set_autoscale; this->min = (infinite && (this->set_autoscale & AUTOSCALE_MIN)) ? VERYLARGE : this->set_min; this->max = (infinite && (this->set_autoscale & AUTOSCALE_MAX)) ? -VERYLARGE : this->set_max; this->log_base = this->log ? log(this->base) : 0; this->data_min = VERYLARGE; this->data_max = -VERYLARGE; } while(0)
	///#ifdef VOLATILE_REFRESH
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_INIT2D_REFRESH(axis, infinite) do { axis *this = axis_array + axis; this->autoscale = this->set_autoscale; this->min = (infinite && (this->set_autoscale & AUTOSCALE_MIN)) ? VERYLARGE*1e-3 : (axis_array[axis].log ? (log(this->set_min) / axis_array[axis].log_base) : (this->set_min)); this->max = (infinite && (this->set_autoscale & AUTOSCALE_MAX)) ? -VERYLARGE*1e-3 : (axis_array[axis].log ? (log(this->set_max) / axis_array[axis].log_base) : (this->set_max)); this->log_base = this->log ? log(this->base) : 0; } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_UPDATE2D_REFRESH(axis) do { axis *this_axis = axis_array + axis; if ((this_axis->set_autoscale & AUTOSCALE_MIN) == 0) this_axis->min = (axis_array[axis].log ? (log(this_axis->set_min) / axis_array[axis].log_base) : (this_axis->set_min)); if ((this_axis->set_autoscale & AUTOSCALE_MAX) == 0) this_axis->max = (axis_array[axis].log ? (log(this_axis->set_max) / axis_array[axis].log_base) : (this_axis->set_max)); } while (0)
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CHECK_REVERSE(axis) do { axis *this = axis_array + axis; if (((this->autoscale & AUTOSCALE_BOTH) == AUTOSCALE_NONE) && (this->max < this->min)) { double temp = this->min; this->min = this->max; this->max = temp; this->range_is_reverted = 1; } else this->range_is_reverted = (this->range_flags & RANGE_REVERSE); } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_ACTUAL_MIN(axis) (axis_array[axis].range_flags & RANGE_REVERSE ? axis_array[axis].max : axis_array[axis].min)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_ACTUAL_MAX(axis) (axis_array[axis].range_flags & RANGE_REVERSE ? axis_array[axis].min : axis_array[axis].max)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SAVE_WRITEBACK_ALL_AXES do { AXIS_INDEX axis; for (axis = 0; axis < AXIS_ARRAY_SIZE; axis++) if(axis_array[axis].range_flags & RANGE_WRITEBACK) { set_writeback_min(axis); set_writeback_max(axis); } } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PARSE_RANGE(axis) do { if (equals(c_token, "[")) { c_token++; axis_array[axis].autoscale = load_range(axis, &axis_array[axis].min, &axis_array[axis].max, axis_array[axis].autoscale); if (!equals(c_token, "]")) int_error(c_token, "']' expected"); c_token++; } } while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PARSE_NAMED_RANGE(axis, dummy_token) do { if (equals(c_token, "[")) { c_token++; if (isletter(c_token)) { if (equals(c_token + 1, "=")) { dummy_token = c_token; c_token += 2; } } axis_array[axis].autoscale = load_range(axis, &axis_array[axis].min, &axis_array[axis].max, axis_array[axis].autoscale); if (!equals(c_token, "]")) int_error(c_token, "']' expected"); c_token++; } } while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GET_NUMBER_OR_TIME(store,axes,axis) do { if (((axes) >= 0) && (axis_array[(axes)+(axis)].is_timedata) && (isstring(c_token) || type_udv(c_token)==STRING)) { struct tm tm; char *ss = try_to_get_string(); if (gstrptime(ss,axis_array[axis].timefmt,&tm)) (store) = (double) gtimegm(&tm); free(ss); } else { (store) = real_expression(); } } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GET_NUM_OR_TIME(store,axis) do { (store) = 0; do { if (((FIRST_AXES) >= 0) && (axis_array[(FIRST_AXES)+(axis)].is_timedata) && (isstring(c_token) || type_udv(c_token)==STRING)) { struct tm tm; char *ss = try_to_get_string(); if (gstrptime(ss,axis_array[axis].timefmt,&tm)) (store) = (double) gtimegm(&tm); free(ss); } else { (store) = real_expression(); } } while(0); } while (0);
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define STORE_WITH_LOG_AND_UPDATE_RANGE(STORE, VALUE, TYPE, axis, NOAUTOSCALE, OUT_ACTION, UNDEF_ACTION) do { if (axis == NO_AXIS) break; if (! (VALUE > -VERYLARGE && VALUE < VERYLARGE)) { TYPE = UNDEFINED; UNDEF_ACTION; break; } if (axis_array[axis].log) { if (VALUE<0.0) { TYPE = UNDEFINED; UNDEF_ACTION; break; } else if (VALUE == 0.0) { STORE = -VERYLARGE; TYPE = OUTRANGE; OUT_ACTION; break; } else { STORE = (log(VALUE) / axis_array[axis].log_base); } } else STORE = VALUE; if (NOAUTOSCALE) break; if (TYPE != INRANGE) break; if ((int)axis < 0) break; if ( VALUE<axis_array[axis].data_min ) axis_array[axis].data_min = VALUE; if ( VALUE<axis_array[axis].min ) { if (axis_array[axis].autoscale & AUTOSCALE_MIN) axis_array[axis].min = VALUE; else { TYPE = OUTRANGE; OUT_ACTION; break; } } if ( VALUE>axis_array[axis].data_max ) axis_array[axis].data_max = VALUE; if ( VALUE>axis_array[axis].max ) { if (axis_array[axis].autoscale & AUTOSCALE_MAX) axis_array[axis].max = VALUE; else { TYPE = OUTRANGE; OUT_ACTION; } } } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define COLOR_STORE_WITH_LOG_AND_UPDATE_RANGE(STORE, VALUE, TYPE, axis, NOAUTOSCALE, OUT_ACTION, UNDEF_ACTION) { coord_type c_type_tmp = TYPE; do { if (axis == NO_AXIS) break; if (! (VALUE > -VERYLARGE && VALUE < VERYLARGE)) { c_type_tmp = UNDEFINED; UNDEF_ACTION; break; } if (axis_array[axis].log) { if (VALUE<0.0) { c_type_tmp = UNDEFINED; UNDEF_ACTION; break; } else if (VALUE == 0.0) { STORE = -VERYLARGE; c_type_tmp = OUTRANGE; OUT_ACTION; break; } else { STORE = (log(VALUE) / axis_array[axis].log_base); } } else STORE = VALUE; if (NOAUTOSCALE) break; if (c_type_tmp != INRANGE) break; if ((int)axis < 0) break; if ( VALUE<axis_array[axis].data_min ) axis_array[axis].data_min = VALUE; if ( VALUE<axis_array[axis].min ) { if (axis_array[axis].autoscale & AUTOSCALE_MIN) axis_array[axis].min = VALUE; else { c_type_tmp = OUTRANGE; OUT_ACTION; break; } } if ( VALUE>axis_array[axis].data_max ) axis_array[axis].data_max = VALUE; if ( VALUE>axis_array[axis].max ) { if (axis_array[axis].autoscale & AUTOSCALE_MAX) axis_array[axis].max = VALUE; else { c_type_tmp = OUTRANGE; OUT_ACTION; } } } while(0); }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define NOOP ((void)0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define INIT_AXIS_ARRAY(field, value) do { int tmp; for (tmp=0; tmp<AXIS_ARRAY_SIZE; tmp++) axis_array[tmp].field=(value); } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_ARRAY_INITIALIZER(value) { value, value, value, value, value, value, value, value, value, value, value }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SET_DEFFORMAT(axis, flag_array) if (flag_array[axis]) { (void) strcpy(axis_array[axis].formatstring,DEF_FORMAT); axis_array[axis].format_is_numeric = 1; }
	///#define SIGNIF (0.01)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CheckZero(x,tic) (fabs(x) < ((tic) * SIGNIF) ? 0.0 : (x))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define NEED_PALETTE(plot) (PM3DSURFACE == (plot)->plot_style || PM3D_IMPLICIT == pm3d.implicit || 1 == (plot)->lp_properties.use_palette)

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define STANDARD stderr
	///#define BACKUP_SUFFIX ".old"
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Eex(a) {sprintf (fitbuf+9, (a)); error_ex ();}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Eex2(a,b) {sprintf (fitbuf+9, (a),(b)); error_ex ();}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Eex3(a,b,c) {sprintf (fitbuf+9, (a),(b),(c)); error_ex ();}
	///#ifdef GP_FIT_ERRVARS
	///#endif // GP_FIT_ERRVARS 
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_x3d(x) ((x-X_AXIS.min)*xscale3d + xcenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_y3d(y) ((y-Y_AXIS.min)*yscale3d + ycenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_z3d(z) ((z-floor_z)*zscale3d + zcenter3d -1.0)
	///#define ISO_SAMPLES 10
	///#ifdef USE_MOUSE
	///#endif
	///#if defined(sun386) || defined(AMIGA_SC_6_1)
	///#endif
	///#ifdef EAM_OBJECTS
	///#else
	///#define place_objects(listhead,layer,dimensions,clip_area) // void() 
	///#endif
	///#define DF_EOF (-1)
	///#define DF_UNDEFINED (-2)
	///#define DF_FIRST_BLANK (-3)
	///#define DF_SECOND_BLANK (-4)
	///#define DF_MISSING (-5)
	///#define DF_FOUND_KEY_TITLE (-6)
	///#define DF_KEY_TITLE_MISSING (-7)
	///#define DF_STRINGDATA (-8)
	///#ifndef MAXINT // should there be one already defined ?
	///#ifdef INT_MAX // in limits.h ?
	///#define MAXINT INT_MAX
	///#else
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define MAXINT ((~0)>>1)
	///#endif
	///#endif
	///#define MAXDATACOLS 7
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DF_DEFAULT_TYPE DF_FLOAT
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SIGNED_TEST(val) ((val)==sizeof(long) ? DF_LONG : ((val)==sizeof(long long) ? DF_LONGLONG : ((val)==sizeof(int) ? DF_INT : ((val)==sizeof(short) ? DF_SHORT : ((val)==sizeof(char) ? DF_CHAR : DF_BAD_TYPE)))))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define UNSIGNED_TEST(val) ((val)==sizeof(unsigned long) ? DF_ULONG : ((val)==sizeof(unsigned long long) ? DF_ULONGLONG : ((val)==sizeof(unsigned int) ? DF_UINT : ((val)==sizeof(unsigned short) ? DF_USHORT : ((val)==sizeof(unsigned char) ? DF_UCHAR : DF_BAD_TYPE)))))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FLOAT_TEST(val) ((val)==sizeof(float) ? DF_FLOAT : ((val)==sizeof(double) ? DF_DOUBLE : DF_BAD_TYPE))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define df_set_skip_after(col,bytes) df_set_skip_before(col+1,bytes)
	///#ifdef GNUPLOT_HISTORY
	///#endif
	///#ifdef HAVE_LIBREADLINE
	///#endif
	///#if defined(HAVE_LIBEDITLINE)
	///#include <editline/readline.h>
	///#endif
	///#if defined(READLINE) && !defined(HAVE_LIBREADLINE) && !defined(HAVE_LIBEDITLINE)
	///#elif defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)
	///#endif // READLINE && !HAVE_LIBREADLINE 
	///#define ZERO_YEAR 2000
	///#define JAN_FIRST_WDAY 6
	///#define SEC_OFFS_SYS 946684800.0
	///#define YEAR_SEC 31557600.0
	///#define MON_SEC 2629800.0
	///#define WEEK_SEC 604800.0
	///#define DAY_SEC 86400.0
	///#ifdef USE_MOUSE
	///#ifdef _MOUSE_C
	///#endif // _MOUSE_C 
	///#if 0
	///#endif
	///#if defined(_MOUSE_C)
	///#else
	///#endif
	///#endif
	///#ifdef OS2
	///#endif
	///#ifdef LINUXVGA
	///#endif // LINUXVGA 
	///#ifdef OS2
	///#endif
	///#if defined(HAVE_LIBREADLINE)
	///#endif
	///#if defined(HAVE_LIBEDITLINE)
	///#include <editline/readline.h>
	///#endif
	///#if defined(HAVE_LIBEDITLINE)
	///#endif
	///#if defined(READLINE) && !defined(HAVE_LIBREADLINE) && !defined(HAVE_LIBEDITLINE)
	///#endif
	///#ifdef EAM_OBJECTS
	///#endif
	///#define PROGRAM "G N U P L O T"
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SAVE_NUM_OR_TIME(fp, x, axis) do{ if (axis_array[axis].is_timedata) { char s[80]; putc('"', fp); gstrftime(s,80,axis_array[axis].timefmt,(double)(x)); fputs(conv_text(s), fp); putc('"', fp); } else { fprintf(fp,"%#g",x); } } while(0)

	///#ifdef USE_MOUSE
	///#endif

	///#define PROMPT "gnuplot> "

	///#if (defined(MSDOS) || defined(DOS386)) && defined(__TURBOC__) && !defined(_Windows)
	//unsigned _stklen = 16394;        // increase stack size 
	///#endif // MSDOS && TURBOC 

	///#ifdef OS2_IPC
	///#define INCL_DOSMEMMGR
	///#define INCL_DOSPROCESS
	///#define INCL_DOSSEMAPHORES
	///#include <os2.h>
	//PVOID input_from_PM_Terminal = NULL;
	//char mouseSharedMemName[40] = "";
	//HEV semInputReady = 0;      // semaphore to be created in plot.c 
	//int thread_rl_Running = 0;  // running status 
	//int thread_rl_RetCode = -1; // return code from readline in a thread 
	///#endif // OS2_IPC 


	///#ifndef _Windows
	///#define H_FOUND 0
	///#define H_NOTFOUND 1
	///#define H_ERROR (-1)
	///#else
	///#ifdef USE_OWN_WINSYSTEM_FUNCTION
	//static int winsystem __PROTO((const char *));
	///#endif
	///#endif // _Windows 

	///#ifdef _Windows
	///#include <windows.h>
	///#ifdef __MSC__
	///#include <malloc.h>
	///#include <direct.h>          // getcwd() 
	///#else
	///#include <alloc.h>
	///#ifndef __WATCOMC__
	///#include <dir.h>		// setdisk() 
	///#endif
	///#endif				// !MSC 
	///#include "win/winmain.h"
	///#endif // _Windows 

	///#ifdef VMS
	//int vms_vkid;			// Virtual keyboard id 
	//int vms_ktid;			// key table id, for translating keystrokes 
	///#endif // VMS 


	/* static prototypes */
	public static void command()
	{
		int i;

		for (i = 0; i < DefineConstants.MAX_NUM_VAR; i++)
		GlobalMembersParse.c_dummy_var[i][0] = DefineConstants.NUL; // no dummy variables

		if (GlobalMembersUtil.is_definition(c_token) != 0)
		GlobalMembersCommand.define();
		else
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: (*lookup_ftable(&command_ftbl[0],c_token))();
	//	(*GlobalMembersTables.lookup_ftable(new gen_ftable(GlobalMembersTables.command_ftbl[0]), c_token))();

		return;
	}

/*
 * Auxiliary routines
 */

/* used by changedir_command() */
	public static int changedir(String path)
	{
	///#if defined(MSDOS) || defined(WIN16) || defined(DOS386)
	///#if defined(__ZTC__)
	//    unsigned dummy;		// it's a parameter needed for dos_setdrive
	///#endif
	//
	// /* first deal with drive letter */
	//
	//    if (isalpha(path[0]) && (path[1] == ':')) {
	//	int driveno = toupper(path[0]) - 'A';	// 0=A, 1=B, ...
	//
	///#if defined(__ZTC__)
	//	(void) dos_setdrive(driveno + 1, &dummy);
	///#endif
	//
	///#if (defined(MSDOS) && defined(__EMX__)) || defined(__MSC__)
	//	(void) _chdrive(driveno + 1);
	///#endif
	//
	//
	// /* HBB: recent versions of DJGPP also have setdisk():,
	//  * so I del'ed the special code */
	///#if ((defined(MSDOS) || defined(_Windows)) && defined(__TURBOC__)) || defined(DJGPP)
	//	(void) setdisk(driveno);
	///#endif
	//	path += 2;		// move past drive letter
	//    }
	// /* then change to actual directory */
	//    if (*path)
	//	if (chdir(path))
	//	    return 1;
	//
	//    return 0;			// should report error with setdrive also
	//
	///#elif defined(WIN32)
	//    return !(SetCurrentDirectory(path));
	///#elif defined(__EMX__) && defined(OS2)
	//    return _chdir2(path);
	///#else
		return chdir(path);
	///#endif // MSDOS etc.
	}

///#endif				// !MSDOS 

/* read from stdin, everything except VMS */

///#if !defined(READLINE) && !defined(HAVE_LIBREADLINE) && !defined(HAVE_LIBEDITLINE)
///#if (defined(MSDOS) || defined(DOS386)) && !defined(_Windows) && !defined(__EMX__) && !defined(DJGPP)
//
// /* if interactive use console IO so CED will work */
//
///#define PUT_STRING(s) cputs(s)
///#define GET_STRING(s,l) ((interactive) ? cgets_emu(s,l) : fgets(s,l,stdin))
//
///#ifdef __TURBOC__
// /* cgets implemented using dos functions */
// /* Maurice Castro 22/5/91 */
//static char *doscgets __PROTO((char *));
//
//static char *
//doscgets(char *s)
//{
//    long datseg;
//
// /* protect and preserve segments - call dos to do the dirty work */
//    datseg = _DS;
//
//    _DX = FP_OFF(s);
//    _DS = FP_SEG(s);
//    _AH = 0x0A;
//    geninterrupt(33);
//    _DS = datseg;
//
// /* check for a carriage return and then clobber it with a null */
//    if (s[s[1] + 2] == '\r')
//	s[s[1] + 2] = 0;
//
// /* return the input string */
//    return (&(s[2]));
//}
///#endif			// __TURBOC__ 
//
///#ifdef __ZTC__
//void
//cputs(char *s)
//{
//    int i = 0;
//    while (s[i] != NUL)
//	bdos(0x02, s[i++], NULL);
//}
//
//char *
//cgets(char *s)
//{
//    bdosx(0x0A, s, NULL);
//
//    if (s[s[1] + 2] == '\r')
//	s[s[1] + 2] = 0;
//
// /* return the input string */
//    return (&(s[2]));
//}
///#endif			// __ZTC__ 
//
// /* emulate a fgets like input function with DOS cgets */
//char *
//cgets_emu(char *str, int len)
//{
//    static char buffer[128] = "";
//    static int leftover = 0;
//
//    if (buffer[leftover] == NUL) {
//	buffer[0] = 126;
///#ifdef __TURBOC__
//	doscgets(buffer);
///#else
//	cgets(buffer);
///#endif
//	fputc('\n', stderr);
//	if (buffer[2] == 26)
//	    return NULL;
//	leftover = 2;
//    }
//    safe_strncpy(str, buffer + leftover, len);
//    leftover += strlen(str);
//    return str;
//}
///#else				// !plain DOS 
//
///#define PUT_STRING(s) fputs(s, stderr)
///#define GET_STRING(s,l) fgets(s, l, stdin)
//
///#endif			// !plain DOS 
///#endif				// !READLINE && !HAVE_LIBREADLINE) 

/* this function is called for non-interactive operation. Its usage is
 * like fgets(), but additionally it checks for ipc events from the
 * terminals waitforinput() (if USE_MOUSE, and terminal is
 * mouseable). This function will be used when reading from a pipe.
 * fgets() reads in at most one less than size characters from stream and
 * stores them into the buffer pointed to by s.
 * Reading stops after an EOF or a newline.  If a newline is read, it is
 * stored into the buffer.  A '\0' is stored  after the last character in
 * the buffer. */
	public static String fgets_ipc(String dest, int len)
	{
	///#ifdef USE_MOUSE
		if (GlobalMembersTerm.term != null && GlobalMembersTerm.term.waitforinput)
		{
		/* This a mouseable terminal --- must expect input from it */
		int c; // char got from waitforinput()
		int i = 0; // position inside dest

		dest = tangible.StringFunctions.changeCharacter(dest, 0, '\0');
		for (i = 0; i < len - 1; i++)
		{
			c = GlobalMembersTerm.term.waitforinput();
			if ('\n' == c)
			{
			dest = tangible.StringFunctions.changeCharacter(dest, i, '\n');
			i++;
			break;
			}
			else if (EOF == c)
			{
			dest = tangible.StringFunctions.changeCharacter(dest, i, '\0');
			return (String) 0;
			}
			else
			{
			dest = tangible.StringFunctions.changeCharacter(dest, i, c);
			}
		}
		dest = tangible.StringFunctions.changeCharacter(dest, i, '\0');
		return dest;
		}
		else
	///#endif
		return fgets(dest, len, stdin);
	}

/* get a line from stdin, and display a prompt if interactive */
	public static String gp_get_string(String buffer, int len, String prompt)
	{
	///#if defined(READLINE) || defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)
		if (GlobalMembersPlot.interactive)
		return GlobalMembersCommand.rlgets(buffer, len, prompt);
		else
		return GlobalMembersCommand.fgets_ipc(buffer, len);
	///#else // !(READLINE || HAVE_LIBREADLINE)
	//    if (interactive)
	//	PUT_STRING(prompt);
	//
	//    return GET_STRING(buffer, len);
	///#endif // !(READLINE || HAVE_LIBREADLINE)
	}

/* Non-VMS version */
	public static int read_line(String prompt)
	{
		int start = 0;
		boolean more = false;
		int last = 0;

		GlobalMembersUtil.current_prompt = prompt; // HBB NEW 20040727

		do
		{
		/* grab some input */
		if (GlobalMembersCommand.gp_get_string(gp_input_line + start, gp_input_line_len - start, ((more) ? ">" : prompt)).equals((String) DefineConstants.NULL))
		{
			/* end-of-file */
			if (GlobalMembersPlot.interactive)
			() putc('\n', stderr);
			gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, start, DefineConstants.NUL);
			inline_num++;
			if (start > 0) // don't quit yet - process what we have
			more = false;
			else
			return (1); // exit gnuplot
		}
		else
		{
			/* normal line input */
			/* gp_input_line must be NUL-terminated for strlen not to pass the
			 * the bounds of this array */
			last = gp_input_line.length() - 1;
			if (last >= 0)
			{
			if (gp_input_line.charAt(last) == '\n') // remove any newline
			{
				gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, last, DefineConstants.NUL);
				if (last > 0 && gp_input_line.charAt(last - 1) == '\r')
				{
					gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, --last, DefineConstants.NUL);
				}
				/* Watch out that we don't backup beyond 0 (1-1-1) */
				if (last > 0)
				--last;
			}
			else if (last + 2 >= gp_input_line_len)
			{
				GlobalMembersCommand.extend_input_line();
				/* read rest of line, don't print "> " */
				start = last + 1;
				more = true;
				continue;
				/* else fall through to continuation handling */
			} // if(grow buffer?)
			if (gp_input_line.charAt(last) == '\\')
			{
				/* line continuation */
				start = last;
				more = true;
			}
			else
				more = false;
			}
			else
			more = false;
		}
		} while (more);
		return (0);
	}
///#endif // !NO_GIH 

///#ifndef VMS

	public static void do_system(String cmd)
	{
	///#ifdef AMIGA_AC_5
	//    static char *parms[80];
	//    if (!cmd)
	//	return;
	//    getparms(input_line + 1, parms);
	//    fexecv(parms[0], parms);
	///#elif defined(_Windows) && defined(USE_OWN_WINSYSTEM_FUNCTION)
	//    if (!cmd)
	//	return;
	//    winsystem(cmd);
	///#else // !(AMIGA_AC_5 || _Windows)
	/* (am, 19980929)
	 * OS/2 related note: cmd.exe returns 255 if called w/o argument.
	 * i.e. calling a shell by "!" will always end with an error message.
	 * A workaround has to include checking for EMX,OS/2, two environment
	 *  variables,...
	 */
		if (cmd == null)
		return;
		system(cmd);
	///#endif // !(AMIGA_AC_5 || _Windows)
	}

/* process the 'test palette' command
 *
 * note 1: it works on terminals supporting as well as not supporting pm3d
 * note 2: due to the call to load_file(), the rest of the current command
 *	   line after 'test palette ;' is discarded
 */
	public static void test_palette_subcommand()
	{

		double gray;
		double[] z = new double[test_palette_colors];
		rgb_color[] rgb1 = new rgb_color[test_palette_colors];
		int i;
		final String pre1 = "reset;set multi;uns border;uns key;set tic in;uns xtics;uns ytics;se cbtic 0,0.1,1 mirr format '';se xr[0:1];se yr[0:1];se zr[0:1];se cbr[0:1];se pm3d map;set colorbox hor user orig 0.05,0.02 size 0.925,0.12;";
		final String pre2 = "splot 1/0;\n\n\n";
		/* note: those \n's are because of x11 terminal problems with blocking pipe */
		final String pre3 = "uns pm3d;se lmarg scre 0.05;se rmarg scre 0.975; se bmarg scre 0.22; se tmarg scre 0.86;se grid;se tics scale 0; se xtics 0,0.1;se ytics 0,0.1;se key top right at scre 0.975,0.975 horizontal title 'R,G,B profiles of the current color palette';";
		final String post = "\n\n\nuns multi;\n";
		/* AnonymousEnum2.no final 'reset' GlobalMembersAnsi2knr.in favour of mousing * / int GlobalMembersGraph3d.can_pm3d = (GlobalMembersTerm.term.make_palette && GlobalMembersTerm.term.set_color);
		String order = "rgb";
		String save_replot_line;
		boolean save_is_3d_plot;
		FILE f = tmpfile();

		c_token++;
		/* parse optional option */
		if (!c_token >= num_tokens || GlobalMembersUtil.equals(c_token, ";") != 0)
		{
		int err = (token[c_token].length != 3);

		order = gp_input_line + token[c_token].start_index;
		if (err == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memchr' has no equivalent in Java:
			err += (memchr(order, 'r', 3) == DefineConstants.NULL);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memchr' has no equivalent in Java:
			err += (memchr(order, 'g', 3) == DefineConstants.NULL);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memchr' has no equivalent in Java:
			err += (memchr(order, 'b', 3) == DefineConstants.NULL);
		}
		if (err != 0)
			GlobalMembersBf_test.int_error(c_token, "combination rgb or gbr or brg etc. expected");
		c_token++;
		}
		if (f == null)
		GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "cannot write temporary file");

		/* generate r,g,b curves */
		for (i = 0; i < test_palette_colors; i++)
		{
		/* colours equidistantly from [0,1] */
		z[i] = (double)i / (test_palette_colors - 1);
		gray = (GlobalMembersColor.sm_palette.positive == DefineConstants.SMPAL_NEGATIVE) ? 1 - z[i] : z[i];
		GlobalMembersGetcolor.rgb1_from_gray(gray, rgb1[i]);
		}

		/* commands to setup the test palette plot */
		GlobalMembersSet.enable_reset_palette = 0;
		save_replot_line = GlobalMembersUtil.gp_strdup(replot_line);
		save_is_3d_plot = GlobalMembersGadgets.is_3d_plot;
		fputs(pre1, f);
		if (GlobalMembersGraph3d.can_pm3d)
		fputs(pre2, f);
		fputs(pre3, f);
		/* put inline data of the r,g,b curves */
		fputs("p", f);
		for (i = 0; i < order.length(); i++)
		{
		if (i > 0)
			fputs(",", f);
		fputs("'-'tit'", f);
		switch (order.charAt(i))
		{
		case 'r':
			fputs("red'w l lt 1", f);
			break;
		case 'g':
			fputs("green'w l lt 2", f);
			break;
		case 'b':
			fputs("blue'w l lt 3", f);
			break;
		} // switch(order[i])
		} // for (i)
		fputs("\n", f);
		for (i = 0; i < 3; i++)
		{
		int k;
		int c = order.charAt(i);

		for (k = 0; k < test_palette_colors; k++)
		{
			double rgb = (c == 'r') ? rgb1[k].r : ((c == 'g') ? rgb1[k].g : rgb1[k].b);

			fprintf(f, "%0.4f\t%0.4f\n", z[k], rgb);
		}
		fputs("e\n", f);
		}
		fputs(post, f);

		/* save current gnuplot 'set' status because of the tricky sets
		 * for our temporary testing plot.
		 */
		GlobalMembersSave.save_set(f);

		/* execute all commands from the temporary file */
		rewind(f);
		GlobalMembersMisc.load_file(f, DefineConstants.NULL, false); // note: it does fclose(f)

		/* enable reset_palette() and restore replot line */
		GlobalMembersSet.enable_reset_palette = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(replot_line);
		replot_line = save_replot_line;
		GlobalMembersGadgets.is_3d_plot = save_is_3d_plot;

		/* further, gp_input_line[] and token[] now destroyed! */
		c_token = num_tokens = 0;
	}

/* process the undocumented 'test time' command
 *	test time 'format' 'string'
 * to assist testing of time routines
 */
	public static void test_time_subcommand()
	{
		String format = DefineConstants.NULL;
		String String = DefineConstants.NULL;
		tm tm = new tm();
		double secs;

		/* given a format and a time string, exercise the time code */

		if (GlobalMembersUtil.isstring(++c_token) != 0)
		{
	tangible.RefObject<String[]> tempRef_format = new tangible.RefObject<String[]>(format);
		GlobalMembersUtil.m_quote_capture(tempRef_format, c_token, c_token);
		format = tempRef_format.argvalue;
		if (GlobalMembersUtil.isstring(++c_token) != 0)
		{
		tangible.RefObject<String[]> tempRef_String = new tangible.RefObject<String[]>(String);
			GlobalMembersUtil.m_quote_capture(tempRef_String, c_token, c_token);
			String = tempRef_String.argvalue;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			memset(tm, 0, sizeof(tm));
			GlobalMembersTime.gstrptime(String, format, tm);
			secs = GlobalMembersTime.gtimegm(tm);
			fprintf(stderr, "internal = %f - %d/%d/%d::%d:%d:%d , wday=%d, yday=%d\n", secs, tm.tm_mday, tm.tm_mon + 1, tm.tm_year % 100, tm.tm_hour, tm.tm_min, tm.tm_sec, tm.tm_wday, tm.tm_yday);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			memset(tm, 0, sizeof(tm));
			GlobalMembersTime.ggmtime(tm, secs);
			GlobalMembersTime.gstrftime(String, String.length(), format, secs);
			fprintf(stderr, "convert back \"%s\" - %d/%d/%d::%d:%d:%d , wday=%d, yday=%d\n", String, tm.tm_mday, tm.tm_mon + 1, tm.tm_year % 100, tm.tm_hour, tm.tm_min, tm.tm_sec, tm.tm_wday, tm.tm_yday);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(String);
			++c_token;
		} // else: expecting time string
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(format);
		} // else: expecting format string
	}

	///#ifdef AMIGA_AC_5
	//static void getparms __PROTO((char *, char **));
	///#endif
	///#ifdef GP_MACROS
	public static int string_expand()
	{
		boolean in_squote = false;
		boolean in_dquote = false;
		boolean after_backslash = false;
		boolean in_comment = false;
		int len;
		int o = 0;
		int nfound = 0;
		String c;
		String temp_string;
		byte temp_char;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * m;
		udvt_entry udv;

		/* Most lines have no macros */
		if (!tangible.StringFunctions.strChr(gp_input_line,'@'))
		return (0);

		temp_string = GlobalMembersAlloc.gp_alloc(gp_input_line_len, "string variable");
		len = gp_input_line.length();
		if (len >= gp_input_line_len)
			len = gp_input_line_len - 1;
		temp_string = gp_input_line.substring(0, len);
		temp_string = tangible.StringFunctions.changeCharacter(temp_string, len, '\0');

		for (c = temp_string; len && c != null && c != null; c++, len--)
		{
		switch (c)
		{
		case '@': // The only tricky bit
			if (!in_squote && !in_dquote && !in_comment && Character.isLetter(c.charAt(1)))
			{
				/* Isolate the udv key as a null-terminated substring */
				m = ++c;
				while (Character.isLetterOrDigit(c) || (c.equals('_')))
					c++;
				temp_char = c;
				c = '\0';
				/* Look up the key and restore the original following char */
				udv = GlobalMembersEval.add_udv_by_name(m);
				if (udv != null && udv.udv_value.type == DATA_TYPES.STRING)
				{
				nfound++;
				m = udv.udv_value.v.string_val;
				GlobalMembersFit.a((stderr,"Replacing @%s with \"%s\"\n",udv.udv_name,m));
				while (m.length() + o + len > gp_input_line_len)
					GlobalMembersCommand.extend_input_line();
				while (*m)
					gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, o++, (*m++));
				}
				else
				{
				GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "%s is not a string variable", m);
				}
				c--= temp_char;
			}
			else
				gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, o++, c; after_backslash = false);
			break;

		case '"':
					if (!after_backslash)
				in_dquote = !in_dquote;
			gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, o++, c; after_backslash = false);
			break;
		case '\'':
			in_squote = !in_squote;
			gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, o++, c; after_backslash = false);
			break;
			case '\\':
					if (in_dquote)
						after_backslash = !after_backslash;
					gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, o++, c);
					break;
		case '#':
			if (!in_squote && !in_dquote)
				in_comment = true;
		default :
				gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, o++, c; after_backslash = false);
				break;
		}
		}
		gp_input_line = tangible.StringFunctions.changeCharacter(gp_input_line, o, '\0');
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(temp_string);

		if (nfound != 0)
		GlobalMembersFit.a((stderr, "After string substitution command line is:\n\t%s\n", gp_input_line));

		return (nfound);
	}
	public static boolean expand_macros = false;
	///#endif

	public static lexical_unit[] token;
	public static int token_table_size;


	public static String gp_input_line;
	public static int gp_input_line_len;
	public static int inline_num; // input line number

	public static udft_entry dummy_func;

	/* support for replot command */
	public static String replot_line;
	public static int plot_token; // start of 'plot' command

	/* flag to disable `replot` when some data are sent through stdin;
	 * used by mouse/hotkey capable terminals */
	public static boolean replot_disabled = false;

	///#ifdef USE_MOUSE
	public static int paused_for_mouse = 0;
	///#endif

	/* output file for the print command */
	public static FILE print_out = DefineConstants.NULL;
	public static String print_out_name = DefineConstants.NULL;

	/* input data, parsing variables */
	///#ifdef AMIGA_SC_6_1
	//__far int num_tokens, c_token;
	///#else
	public static int num_tokens;
	public static int c_token;
	///#endif

	public static int if_depth = 0;
	public static boolean if_condition = false;

	public static int eval_depth = 0;

	public static int command_exit_status = 0;

	/* constant by which token table grows */
	///#define MAX_TOKENS 400


	///#ifdef USE_MOUSE

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define WHITE_AFTER_TOKEN(x) (' ' == gp_input_line[token[x].start_index + token[x].length] || '\t' == gp_input_line[token[x].start_index + token[x].length] || '\0' == gp_input_line[token[x].start_index + token[x].length])

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define REPLACE_ELSE(tok) do { int idx = token[tok].start_index; token[tok].length = 1; gp_input_line[idx++] = ';'; gp_input_line[idx++] = ' '; gp_input_line[idx++] = ' '; gp_input_line[idx++] = ' '; } while (0)


	/* Is 'set view map' currently working inside 'splot' or not? Calculation of
	 * mouse coordinates and the corresponding routines must know it, because
	 * 'splot' can be either true 3D plot or a 2D map.
	 * This flag is set when entering splot command and 'set view map', i.e. by
	 * splot_map_activate(), and reset when calling splot_map_deactivate().
	 */
	public static int splot_map_active = 0;
	/* Store values reset by 'set view map' during splot, used by those two
	 * routines below.
	 */
	public static float splot_map_surface_rot_x;
	public static float splot_map_surface_rot_z;
	public static float splot_map_surface_scale;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String rlgets_line = (String) DefineConstants.NULL;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int rlgets_leftover = -1;


	///#ifdef AMIGA_AC_5
	// /******************************************************************************
	//  * Parses the command string (for fexecv use) and  converts the first token
	//  * to lower case
	//  *****************************************************************************/
	//static void
	//getparms(char *command, char **parms)
	//{
	//    static char strg0[256];
	//    int i = 0, j = 0, k = 0;		// A bunch of indices 
	//
	//    while (command[j] != NUL) {	// Loop on string characters 
	//	parms[k++] = strg0 + i;
	//	while (command[j] == ' ')
	//	    ++j;
	//	while (command[j] != ' ' && command[j] != NUL) {
	//	    if (command[j] == '"') {	// Get quoted string 
	//		do {
	//		    strg0[i++] = command[j++];
	//		} while (command[j] != '"' && command[j] != NUL);
	//	    }
	//	    strg0[i++] = command[j++];
	//	}
	//	if (strg0[i] != NUL)
	//	    strg0[i++] = NUL;	// NUL terminate every token 
	//    }
	//    parms[k] = NUL;
	//
	// /* Convert to lower case */
	// /* FIXME HBB 20010621: do we really want to stop on char *before*
	//  * the actual end of the string strg0[]? */
	//    for (k=0; strg0[k+1] != NUL; k++)
	//	if (strg0[k] >= 'A' && (strg0[k] <= 'Z'))
	//	    strg0[k] += ('a' - 'A');
	//}
	//
	///#endif				// AMIGA_AC_5 


	///#if defined(READLINE) || defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)
	/* keep some compilers happy */
	public static String rlgets(String s, int n, String prompt)
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static sbyte *line = (sbyte *) DefineConstants.NULL;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int leftover = -1; // index of 1st char leftover from last call

		if (rlgets_leftover == -1)
		{
		/* If we already have a line, first free it */
		if (!rlgets_line.equals((String) DefineConstants.NULL))
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(rlgets_line);
			rlgets_line = DefineConstants.NULL;
			/* so that ^C or int_error during readline() does
			 * not result in line being free-ed twice */
		}
		rlgets_line = GlobalMembersReadline.readline_ipc((GlobalMembersPlot.interactive) ? prompt : "");
		rlgets_leftover = 0;
		/* If it's not an EOF */
		if (rlgets_line != null && rlgets_line != null)
		{
	///#if defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)
			int found;
			/* Initialize readline history functions */
			using_history();

			/* search in the history for entries containing line.
			 * They may have other tokens before and after line, hence
			 * the check on strcmp below. */
			found = history_search(rlgets_line, -1);
			if (found != -1 && !strcmp(current_history().line,rlgets_line))
			{
			/* this line is already in the history, remove the earlier entry */
	///#if defined(HAVE_LIBREADLINE)
			HIST_ENTRY removed = remove_history(where_history());
			/* according to history docs we are supposed to free the stuff */
			if (removed.line)
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(removed.line);
			if (removed.data)
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(removed.data);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(removed);
	///#else
	//		remove_history(where_history());
	///#endif // !HAVE_LIBREADLINE
			}
			add_history(rlgets_line);
	///#else // !HAVE_LIBREADLINE && !HAVE_LIBEDITLINE
	//	    add_history(line);
	///#endif
		}
		}
		if (rlgets_line != null)
		{
		/* s will be NUL-terminated here */
		GlobalMembersStdfn.safe_strncpy(s, rlgets_line + rlgets_leftover, n);
		rlgets_leftover += s.length();
		if (rlgets_line.charAt(rlgets_leftover) == DefineConstants.NUL)
			rlgets_leftover = -1;
		return s;
		}
		return DefineConstants.NULL;
	}
	///#endif				// READLINE || HAVE_LIBREADLINE 
	///#endif			// !(_Windows || DJGPP) 
}