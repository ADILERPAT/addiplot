package com.addiPlot.gnuplot;

import java.io.File;

import com.addiPlot.gnuplot.tangible.StringFunctions;

public class GlobalMembersFit
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
	//public static String RCSid()
	//{
	//	return GlobalMembersAlloc.RCSid("$Id: fit.c,v 1.69 2009/03/13 01:28:57 sfeam Exp $");
	//}
	///#endif

	/*  NOTICE: Change of Copyright Status
	 *
	 *  The author of this module, Carsten Grammes, has expressed in
	 *  personal email that he has no more interest in this code, and
	 *  doesn't claim any copyright. He has agreed to put this module
	 *  into the public domain.
	 *
	 *  Lars Hecking  15-02-1999
	 */

	/*
	 *    Nonlinear least squares fit according to the
	 *      Marquardt-Levenberg-algorithm
	 *
	 *      added as Patch to Gnuplot (v3.2 and higher)
	 *      by Carsten Grammes
	 *
	 *      930726:     Recoding of the Unix-like raw console I/O routines by:
	 *                  Michele Marziani (marziani@ferrara.infn.it)
	 * drd: start unitialised variables at 1 rather than NEARLY_ZERO
	 *  (fit is more likely to converge if started from 1 than 1e-30 ?)
	 *
	 * HBB (broeker@physik.rwth-aachen.de) : fit didn't calculate the errors
	 * in the 'physically correct' (:-) way, if a third data column containing
	 * the errors (or 'uncertainties') of the input data was given. I think
	 * I've fixed that, but I'm not sure I really understood the M-L-algo well
	 * enough to get it right. I deduced my change from the final steps of the
	 * equivalent algorithm for the linear case, which is much easier to
	 * understand. (I also made some minor, mostly cosmetic changes)
	 *
	 * HBB (again): added error checking for negative covar[i][i] values and
	 * for too many parameters being specified.
	 *
	 * drd: allow 3d fitting. Data value is now called fit_z internally,
	 * ie a 2d fit is z vs x, and a 3d fit is z vs x and y.
	 *
	 * Lars Hecking : review update command, for VMS in particular, where
	 * it is not necessary to rename the old file.
	 *
	 * HBB, 971023: lifted fixed limit on number of datapoints, and number
	 * of parameters.
	 *
	 * Jim Van Zandt, 090201: allow fitting functions with up to five
	 * independent variables.
	 */

	/*
	 * $Id: fit.h,v 1.12 2004/04/13 17:23:53 broeker Exp $
	 */

	/* GNUPLOT - fit.h */

	/*  NOTICE: Change of Copyright Status
	 *
	 *  The author of this module, Carsten Grammes, has expressed in
	 *  personal email that he has no more interest in this code, and
	 *  doesn't claim any copyright. He has agreed to put this module
	 *  into the public domain.
	 *
	 *  Lars Hecking  15-02-1999
	 */

	/*
	 *	Header file: public functions in fit.c
	 *
	 *
	 *	Previous copyright of this module:   Carsten Grammes, 1993
	 *      Experimental Physics, University of Saarbruecken, Germany
	 *
	 *	Internet address: cagr@rz.uni-sb.de
	 *
	 *	Permission to use, copy, and distribute this software and its
	 *	documentation for any purpose with or without fee is hereby granted,
	 *	provided that the above copyright notice appear in all copies and
	 *	that both that copyright notice and this permission notice appear
	 *	in supporting documentation.
	 *
	 *      This software is provided "as is" without express or implied warranty.
	 */



	/* #if... / #include / #define collection: */

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

	/* compatible with gnuplot philosophy */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define STANDARD stderr

	/* Suffix of a backup file */
	///#define BACKUP_SUFFIX ".old"

	/*****************************************************************
	    Useful macros
	    We avoid any use of varargs/stdargs (not good style but portable)
	 *****************************************************************/
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Eex(a) {sprintf (fitbuf+9, (a)); error_ex ();}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Eex2(a,b) {sprintf (fitbuf+9, (a),(b)); error_ex ();}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Eex3(a,b,c) {sprintf (fitbuf+9, (a),(b),(c)); error_ex ();}

	/* Type definitions */

	/* Exported Variables of fit.c */

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte fitbuf[];
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte *fitlogfile;

	///#ifdef GP_FIT_ERRVARS
	/* NEW 20030131: should we place parameter errors into user-defined
	 * variables?  */
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean fit_errorvariables;

	/*****************************************************************
    getch that handles also function keys etc.
	 *****************************************************************/
	///#if defined(MSDOS) || defined(DOS386)
	//
	// /* HBB 980317: added a prototype... */
	//int getchx __PROTO((void));
	//
	//int
	//getchx()
	//{
	//    int c = getch();
	//    if (!c || c == 0xE0) {
	//	c <<= 8;
	//	c |= getch();
	//    }
	//    return c;
	//}
	///#endif

	/*****************************************************************
    in case of fatal errors
	 *****************************************************************/
	///#endif // GP_FIT_ERRVARS 


	/* Prototypes of functions exported by fit.c */

	public static void error_ex()
	{
		//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * sp;

		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(fitbuf, "         ", 9); // start after GNUPLOT>
		sp = StringFunctions.strChr(fitbuf, DefineConstants.NUL);
		while (*--sp == '\n');
		sp + 1 = "\n\n"; // terminate with exactly 2 newlines
		fputs(fitbuf, stderr);
		if (log_f != null)
		{
			fprintf(log_f, "BREAK: %s", fitbuf);
			fclose(log_f);
			log_f = DefineConstants.NULL;
		}
		if (func.at != null)
		{
			GlobalMembersEval.free_at(func.at); // release perm. action table
			func.at = null;
		}
		/* restore original SIGINT function */
		GlobalMembersPlot.interrupt_setup();

		GlobalMembersPlot.bail_to_command_line();
	}

	/*****************************************************************
    first time settings
	 *****************************************************************/
	public static void init_fit()
	{
		func.at = null; // need to parse 1 time
	}

	/*****************************************************************
    write the actual parameters to start parameter file
	 *****************************************************************/
	public static void update(String pfile, String npfile)
	{
		String fnam = new String(new char[256]);
		String path = new String(new char[256]);
		String sstr = new String(new char[256]);
		String pname = new String(new char[64]);
		String tail = new String(new char[127]);
		String s = sstr;
		String tmp;
		byte c;
		String ifilename = new String(new char[256]);
		String ofilename;
		File of;
		File nf;
		double pval;


		/* update pfile npfile:
		   if npfile is a valid file name,
		   take pfile as input file and
		   npfile as output file
		 */
		if (npfile != null && (!npfile.equals("")))
		{
			//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			GlobalMembersStdfn.safe_strncpy(ifilename, pfile, sizeof(ifilename));
			ofilename = npfile;
		}
		else
		{
			///#ifdef BACKUP_FILESYSTEM
			// /* filesystem will keep original as previous version */
			//	safe_strncpy(ifilename, pfile, sizeof(ifilename));
			///#else
			GlobalMembersFit.backup_file(ifilename, pfile); // will Eex if it fails
			///#endif
			ofilename = pfile;
		}

		/* split into path and filename */
		GlobalMembersFit.splitpath(ifilename, path, fnam);
		if (!(of = GlobalMembersMisc.loadpath_fopen(ifilename, "r")))
		{
			String.format(fitbuf + 9, ("parameter file %s could not be read"),(ifilename));
			GlobalMembersFit.error_ex();
		};

		if (!(nf = fopen(ofilename, "w")))
		{
			String.format(fitbuf + 9, ("new parameter file %s could not be created"),(ofilename));
			GlobalMembersFit.error_ex();
		};

		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		while (fgets(s = sstr, sizeof(sstr), of) != DefineConstants.NULL)
		{

			if (GlobalMembersFit.is_empty(s))
			{
				fputs(s, nf); // preserve comments
				continue;
			}
			if ((tmp = tangible.StringFunctions.strChr(s, '#')) != DefineConstants.NULL)
			{
				//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
				GlobalMembersStdfn.safe_strncpy(tail, tmp, sizeof(tail));
				tmp = DefineConstants.NUL;
			}
			else
				tail = "\n";

			tangible.RefObject<String[]> tempRef_s = new tangible.RefObject<String[]>(s);
			tmp = GlobalMembersFit.get_next_word(tempRef_s, c);
			s = tempRef_s.argvalue;
			if (!GlobalMembersFit.is_variable(tmp) || tmp.length() > DefineConstants.MAX_ID_LEN)
			{
				fclose(nf);
				fclose(of);
				{
					String.format(fitbuf + 9, ("syntax error in parameter file %s"),(fnam));
					GlobalMembersFit.error_ex();
				};
			}
			//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			GlobalMembersStdfn.safe_strncpy(pname, tmp, sizeof(pname));
			/* next must be '=' */
			if (c != '=')
			{
				tmp = tangible.StringFunctions.strChr(s, '=');
				if (tmp.equals(DefineConstants.NULL))
				{
					fclose(nf);
					fclose(of);
					{
						String.format(fitbuf + 9, ("syntax error in parameter file %s"),(fnam));
						GlobalMembersFit.error_ex();
					};
				}
				s = tmp + 1;
			}
			tangible.RefObject<String[]> tempRef_s2 = new tangible.RefObject<String[]>(s);
			tmp = GlobalMembersFit.get_next_word(tempRef_s2, c);
			s = tempRef_s2.argvalue;
			if (!sscanf(tmp, "%lf", pval))
			{
				fclose(nf);
				fclose(of);
				{
					String.format(fitbuf + 9, ("syntax error in parameter file %s"),(fnam));
					GlobalMembersFit.error_ex();
				};
			}
			tangible.RefObject<String[]> tempRef_s3 = new tangible.RefObject<String[]>(s);
			boolean tempVar = (tmp = GlobalMembersFit.get_next_word(tempRef_s3, c)) != DefineConstants.NULL;
			s = tempRef_s3.argvalue;
			if (tempVar)
			{
				fclose(nf);
				fclose(of);
				{
					String.format(fitbuf + 9, ("syntax error in parameter file %s"),(fnam));
					GlobalMembersFit.error_ex();
				};
			}
			/* now modify */

			if ((pval = GlobalMembersFit.getdvar(pname)) == 0)
				pval = (double) GlobalMembersFit.getivar(pname);

			String.format(sstr, "%g", pval);
			if (!tangible.StringFunctions.strChr(sstr, '.') && !tangible.StringFunctions.strChr(sstr, 'e'))
				sstr += ".0"; // assure CMPLX-type

			fprintf(nf, "%-15.15s = %-15.15s   %s", pname, sstr, tail);
		}

		if (fclose(nf) || fclose(of))
		{
			String.format(fitbuf + 9, ("I/O error during update"));
			GlobalMembersFit.error_ex();
		};

	}

	/*****************************************************************
    Interface to the classic gnuplot-software
	 *****************************************************************/

	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static int[] fit_command_var_order = {AXIS_INDEX.FIRST_X_AXIS, AXIS_INDEX.FIRST_Y_AXIS, AXIS_INDEX.T_AXIS, AXIS_INDEX.U_AXIS, AXIS_INDEX.V_AXIS, AXIS_INDEX.FIRST_Z_AXIS};
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static String[] fit_command_dummy_default = {"x","y","t","u","v","z"};
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static String fit_command_viafile = DefineConstants.NULL;
	public static void fit_command()
	{
		/* HBB 20000430: revised this completely, to make it more similar to
		 * what plot3drequest() does */

		int num_ranges = 0; // # range specs
		//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
		//	static int var_order[]={FIRST_X_AXIS, FIRST_Y_AXIS, T_AXIS, U_AXIS, V_AXIS, FIRST_Z_AXIS};
		//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
		//	static sbyte dummy_default[DefineConstants.MAX_NUM_VAR][DefineConstants.MAX_ID_LEN+1]={"x","y","t","u","v","z"};

		int[] dummy_token = {-1,-1,-1,-1,-1,-1,-1};
		int num_points = 0; // number of data points read from file
		int[] skipped = new int[12]; // num points out of range
		int zrange_token = -1;

		int i;
		int j;
		double[] v = new double[7];
		double tmpd;
		time_t timer = new time_t();
		int token1;
		int token2;
		int token3;
		String tmp;
		String file_name;

		GlobalMembersCommand.c_token++;

		/* first look for a restricted x fit range... */

		/* put stuff into arrays to simplify access */
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue() && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale & e_autoscale.AUTOSCALE_BOTH) == e_autoscale.AUTOSCALE_NONE && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (false && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MIN)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (false && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MAX)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.T_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale & e_autoscale.AUTOSCALE_BOTH) == e_autoscale.AUTOSCALE_NONE && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (false && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MIN)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (false && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MAX)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.U_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale & e_autoscale.AUTOSCALE_BOTH) == e_autoscale.AUTOSCALE_NONE && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (false && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MIN)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (false && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MAX)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.V_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale & e_autoscale.AUTOSCALE_BOTH) == e_autoscale.AUTOSCALE_NONE && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (0 && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MIN)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (0 && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MAX)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale & e_autoscale.AUTOSCALE_BOTH) == e_autoscale.AUTOSCALE_NONE && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MIN)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (true && (this_Renamed.set_autoscale & e_autoscale.AUTOSCALE_MAX)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);

		/* use global default indices in axis.c to simplify access to
		 * per-axis variables */
		GlobalMembersAxis.x_axis = AXIS_INDEX.FIRST_X_AXIS;
		GlobalMembersAxis.y_axis = AXIS_INDEX.FIRST_Y_AXIS;
		GlobalMembersAxis.z_axis = AXIS_INDEX.FIRST_Z_AXIS;

		/* JRV 20090201: Parsing the range specs would be much simpler if
		 * we knew how many independent variables we had, but we won't
		 * know that until parsing the using specs.  Assume we have one
		 * independent variable to start with (x), and adjust later
		 * if needed. */

		while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
		{
			int i;
			if (num_ranges > 5)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "only 6 range specs are permitted");
			i = fit_command_var_order[num_ranges];
			/* Store the Z axis dummy variable and range (if any) in the
			 * axis for the next independent variable.  Save the current
			 * values in an otherwise unused axis, so they can be restored
			 * later if there are fewer than 5 independent variables. */
			GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Z_AXIS.getValue()] = GlobalMembersAxis.axis_array[i]; // copy entire structure
			dummy_token[6] = dummy_token[i];

			dummy_token[num_ranges] = -1;
			do
			{
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
				{
					GlobalMembersCommand.c_token++;
					if (GlobalMembersUtil.isletter(GlobalMembersCommand.c_token) != 0)
					{
						if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token + 1, "=") != 0)
						{
							dummy_token[num_ranges] = GlobalMembersCommand.c_token;
							GlobalMembersCommand.c_token += 2;
						}
					}
					GlobalMembersAxis.axis_array[i].autoscale = GlobalMembersAxis.load_range(i, GlobalMembersAxis.axis_array[i].min, GlobalMembersAxis.axis_array[i].max, GlobalMembersAxis.axis_array[i].autoscale);
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
						GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
					GlobalMembersCommand.c_token++;
				}
			} while (false);
			zrange_token = GlobalMembersCommand.c_token;
			num_ranges++;
		}

		/* now compile the function */

		token1 = GlobalMembersCommand.c_token;

		if (func.at != null)
		{
			GlobalMembersEval.free_at(func.at);
			func.at = null; // in case perm_at() does int_error
		}
		GlobalMembersCommand.dummy_func = func;

		/* set all five dummy variable names, even if we're using fewer */

		fit_command_dummy_default[0] = GlobalMembersParse.set_dummy_var[0];
		fit_command_dummy_default[1] = GlobalMembersParse.set_dummy_var[1];
		for (i = 0; i < 5; i++)
		{
			if (dummy_token[i] >= 0)
				GlobalMembersUtil.copy_str(GlobalMembersParse.c_dummy_var[i], dummy_token[i], DefineConstants.MAX_ID_LEN);
			else
				GlobalMembersParse.c_dummy_var[i] = fit_command_dummy_default[i];
		}

		func.at = GlobalMembersParse.perm_at(); // parse expression and save action table
		GlobalMembersCommand.dummy_func = null;

		token2 = GlobalMembersCommand.c_token;

		/* get filename */
		file_name = GlobalMembersUtil.try_to_get_string();
		if (file_name == null)
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "missing filename");

		/* use datafile module to parse the datafile and qualifiers */
		GlobalMembersDatafile.df_set_plot_mode(MODE_PLOT_TYPE.MODE_QUERY); // Does nothing except for binary datafiles
		columns = GlobalMembersDatafile.df_open(file_name, 7, DefineConstants.NULL); // up to 7 using specs allowed
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(file_name);
		if (columns < 0)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Can't read data file");
		if (columns == 1)
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Need 2 to 7 using specs");

		num_indep = (columns < 3)?1:columns - 2;

		/* The following patch was made by Remko Scharroo, 25-Mar-1999
		 * We need to check if one of the columns is time data, like
		 * in plot2d and plot3d */

		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].is_timedata)
		{
			if (columns < 2)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Need full using spec for x time data");
		}
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].is_timedata)
		{
			if (columns < 1)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Need using spec for y time data");
		}
		/* No need for a time data check for the remaining axes.  Those
		 * axes are only used iff columns>3, i.e. there are using specs
		 * for all the columns, already. */

		for (i = 0; i < num_indep; i++)
			GlobalMembersDatafile.df_axis[i] = fit_command_var_order[i];
		GlobalMembersDatafile.df_axis[i++] = AXIS_INDEX.FIRST_Z_AXIS;
		/* don't parse sigma_z as times */
		GlobalMembersDatafile.df_axis[i] = DefineConstants.NO_AXIS;


		/* HBB 980401: if this is a single-variable fit, we shouldn't have
		 * allowed a variable name specifier for 'y': */
		if ((dummy_token[1] >= 0) && (num_indep == 1))
			GlobalMembersBf_test.int_error(dummy_token[1], "Can't re-name 'y' in a one-variable fit");

		/* depending on number of independent variables, the last range
		 * spec may be for the Z axis */
		if (num_ranges > num_indep + 1)
			GlobalMembersBf_test.int_error(zrange_token, "Too many range-specs for a %d-variable fit", num_indep);
		else if (num_ranges == num_indep + 1 && num_indep < 5)
		{
			/* last range spec is for the Z axis */
			int i = fit_command_var_order[num_ranges - 1]; // index for the last range spec

			GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].autoscale = GlobalMembersAxis.axis_array[i].autoscale;
			if (!(GlobalMembersAxis.axis_array[i].autoscale & e_autoscale.AUTOSCALE_MIN))
				GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min = GlobalMembersAxis.axis_array[i].min;
			if (!(GlobalMembersAxis.axis_array[i].autoscale & e_autoscale.AUTOSCALE_MAX))
				GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max = GlobalMembersAxis.axis_array[i].max;

			/* restore former values */
			GlobalMembersAxis.axis_array[i] = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Z_AXIS.getValue()]; // copy entire structure
			dummy_token[num_ranges - 1] = dummy_token[6];
		}

		/* defer actually reading the data until we have parsed the rest
		 * of the line */

		token3 = GlobalMembersCommand.c_token;

		tmpd = GlobalMembersFit.getdvar(FITLIMIT); // get epsilon if given explicitly
		if (tmpd < 1.0 && tmpd > 0.0)
			epsilon = tmpd;

		/* HBB 970304: maxiter patch */
		maxiter = GlobalMembersFit.getivar(FITMAXITER);

		/* get startup value for lambda, if given */
		tmpd = GlobalMembersFit.getdvar(FITSTARTLAMBDA);

		if (tmpd > 0.0)
		{
			startup_lambda = tmpd;
			System.out.printf("Lambda Start value set: %g\n", startup_lambda);
		}
		/* get lambda up/down factor, if given */
		tmpd = GlobalMembersFit.getdvar(FITLAMBDAFACTOR);

		if (tmpd > 0.0)
		{
			lambda_up_factor = lambda_down_factor = tmpd;
			System.out.printf("Lambda scaling factors reset:  %g\n", lambda_up_factor);
		}
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(fit_script);
		fit_script = DefineConstants.NULL;
		if ((tmp = getenv(FITSCRIPT)) != DefineConstants.NULL)
		{
			fit_script = GlobalMembersUtil.gp_strdup(tmp);
		}

		{
			byte logfile = GlobalMembersFit.getfitlogfile();

			if (log_f == null && !(log_f = fopen(logfile, "a")))
			{
				String.format(fitbuf + 9, ("could not open log-file %s"),(logfile));
				GlobalMembersFit.error_ex();
			};

			if (logfile != 0)
				//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(logfile);
		}

		fputs("\n\n*******************************************************************************\n", log_f);
		time(timer);
		fprintf(log_f, "%s\n\n", ctime(timer));
		{
			String line = DefineConstants.NULL;

			tangible.RefObject<String[]> tempRef_line = new tangible.RefObject<String[]>(line);
			GlobalMembersUtil.m_capture(tempRef_line, token2, token3 - 1);
			line = tempRef_line.argvalue;
			fprintf(log_f, "FIT:    data read from %s\n", line);
			fprintf(log_f, "        format = ");
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(line);
			for (i = 0; i < num_indep && i < columns - 1; i++)
				fprintf(log_f, "%s:", GlobalMembersParse.c_dummy_var[i]);
			fprintf(log_f, (columns <= 2) ? "z\n" : "z:s\n");
		}

		/* report all range specs */
		j = AXIS_INDEX.FIRST_Z_AXIS.getValue(); // check Z axis first
		for (i = 0; i <= num_indep; i++)
		{
			if ((GlobalMembersAxis.axis_array[j].autoscale & e_autoscale.AUTOSCALE_BOTH) != e_autoscale.AUTOSCALE_BOTH)
				GlobalMembersFit.log_axis_restriction(log_f, j, i != 0 ? GlobalMembersParse.c_dummy_var[i] : "z");
			j = fit_command_var_order[i];
		}

		max_data = DefineConstants.MAX_DATA;
		fit_x = GlobalMembersMatrix.vec(max_data * num_indep); // start with max. value
		fit_z = GlobalMembersMatrix.vec(max_data);
		err_data = GlobalMembersMatrix.vec(max_data);
		num_data = 0;

		//C++ TO JAVA CONVERTER WARNING: This 'sizeof' ratio was replaced with a direct reference to the array length:
		//ORIGINAL LINE: for (i=0; i<sizeof(skipped)/sizeof(int); i++)
		for (i = 0; i < skipped.length; i++)
			skipped[i] = 0;

		/* first read in experimental data */

		/* If the user has set an explicit locale for numeric input, apply it */
		/* here so that it affects data fields read from the input file.      */
		do {if (GlobalMembersUtil.numeric_locale != null && strcmp(GlobalMembersUtil.numeric_locale,"C")) setlocale(LC_NUMERIC,GlobalMembersUtil.numeric_locale);} while (false);

		while ((i = GlobalMembersDatafile.df_readline(v, 7)) != DefineConstants.DF_EOF)
		{
			if (num_data >= max_data)
			{
				/* increase max_data by factor of 1.5 */
				max_data = (max_data * 3) / 2;
				if (0 || GlobalMembersMatrix.redim_vec(fit_x, max_data * num_indep) == 0 || GlobalMembersMatrix.redim_vec(fit_z, max_data) == 0 || GlobalMembersMatrix.redim_vec(err_data, max_data) == 0)
				{
					/* Some of the reallocations went bad: */
					GlobalMembersDatafile.df_close();
					{
						String.format(fitbuf + 9, ("Out of memory in fit: too many datapoints (%d)?"),(max_data));
						GlobalMembersFit.error_ex();
					};
				}
				else
				{
					/* Just so we know that the routine is at work: */
					fprintf(stderr, "Max. number of data points scaled up to: %d\n", max_data);
				}
			} // if (need to extend storage space)

			switch (i)
			{
			case DefineConstants.DF_MISSING:
			case DefineConstants.DF_UNDEFINED:
			case DefineConstants.DF_FIRST_BLANK:
			case DefineConstants.DF_SECOND_BLANK:
				continue;
			case 0:
			{
				String.format(fitbuf + 9, ("bad data on line %d of datafile"),(GlobalMembersDatafile.df_line_number));
				GlobalMembersFit.error_ex();
			};
			break;
			case 1: // only z provided
				v[1] = v[0];
				v[0] = (double) GlobalMembersDatafile.df_datum;
				break;
			case 2: // x, z
			case 3: // x, z, error
			case 4: // x, y, z, error
			case 5: // x, y, t, z, error
			case 6: // x, y, t, u, z, error
			case 7: // x, y, t, u, v, z, error
				break;

			}
			num_points++;

			/* skip this point if it is out of range */
			for (i = 0; i < num_indep; i++)
			{
				int j = fit_command_var_order[i];
				axis this_Renamed = GlobalMembersAxis.axis_array + j;

				if (!(this_Renamed.autoscale & e_autoscale.AUTOSCALE_MIN) && (v[i] < this_Renamed.min))
				{
					skipped[j]++;
					//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto out_of_range;
				}
				if (!(this_Renamed.autoscale & e_autoscale.AUTOSCALE_MAX) && (v[i] > this_Renamed.max))
				{
					skipped[j]++;
					//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto out_of_range;
				}
				fit_x[num_data * num_indep + i] = v[i]; // save independent variable data
			}
			/* check Z value too */
			{
				axis this_Renamed = GlobalMembersAxis.axis_array + AXIS_INDEX.FIRST_Z_AXIS;

				if (!(this_Renamed.autoscale & e_autoscale.AUTOSCALE_MIN) && (v[i] < this_Renamed.min))
				{
					skipped[AXIS_INDEX.FIRST_Z_AXIS.getValue()]++;
					//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto out_of_range;
				}
				if (!(this_Renamed.autoscale & e_autoscale.AUTOSCALE_MAX) && (v[i] > this_Renamed.max))
				{
					skipped[AXIS_INDEX.FIRST_Z_AXIS.getValue()]++;
					//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto out_of_range;
				}
				fit_z[num_data] = v[i++]; // save dependent variable data
			}

			/* only use error from data file if _explicitly_ asked for by
			 * a using spec
			 */
			err_data[num_data++] = (columns > 2) ? v[i] : 1;

			//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			out_of_range:
				;
		}
		GlobalMembersDatafile.df_close();

		/* We are finished reading user input; return to C locale for internal use */
		do {if (GlobalMembersUtil.numeric_locale != null && strcmp(GlobalMembersUtil.numeric_locale,"C")) setlocale(LC_NUMERIC,"C");} while (false);

		if (num_data <= 1)
		{
			/* no data! Try to explain why. */
			System.out.printf("         Read %d points\n", num_points);
			for (i = 0; i < 6; i++)
			{
				int j = fit_command_var_order[i];
				axis this_Renamed = GlobalMembersAxis.axis_array + j;
				if (skipped[j] != 0)
				{
					System.out.printf("         Skipped %d points outside range [%s=", skipped[j], i < 5 ? GlobalMembersParse.c_dummy_var[i] : "z");
					if (this_Renamed.autoscale & e_autoscale.AUTOSCALE_MIN != 0)
						System.out.print("*:");
					else
						System.out.printf("%g:",this_Renamed.min);
					if (this_Renamed.autoscale & e_autoscale.AUTOSCALE_MAX != 0)
						System.out.print("*]\n");
					else
						System.out.printf("%g]\n",this_Renamed.max);
				}
			}
			{
				String.format(fitbuf + 9, ("No data to fit "));
				GlobalMembersFit.error_ex();
			};
		}

		/* now resize fields to actual length: */
		GlobalMembersMatrix.redim_vec(fit_x, num_data * num_indep);
		GlobalMembersMatrix.redim_vec(fit_z, num_data);
		GlobalMembersMatrix.redim_vec(err_data, num_data);

		fprintf(log_f, "        #datapoints = %d\n", num_data);

		if (columns < 3)
			fputs("        residuals are weighted equally (unit weight)\n\n", log_f);

		{
			String line = DefineConstants.NULL;

			tangible.RefObject<String[]> tempRef_line2 = new tangible.RefObject<String[]>(line);
			GlobalMembersUtil.m_capture(tempRef_line2, token1, token2 - 1);
			line = tempRef_line2.argvalue;
			fprintf(log_f, "function used for fitting: %s\n", line);
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(line);
		}

		/* read in parameters */

		max_params = DefineConstants.MAX_PARAMS; // HBB 971023: make this resizeable

		if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token++, "via") == 0)
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Need via and either parameter list or file");

		a = GlobalMembersMatrix.vec(max_params);
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		par_name = (byte[MAX_ID_LEN + 1] *) GlobalMembersAlloc.gp_alloc((max_params + 1) * sizeof(byte[MAX_ID_LEN + 1]), "fit param");
		num_params = 0;

		if ((GlobalMembersUtil.isstring(GlobalMembersCommand.c_token) != 0 || GlobalMembersUtil.type_udv(GlobalMembersCommand.c_token) == DATA_TYPES.STRING))
		{
			boolean fixed;
			double tmp_par;
			byte c;
			String s;
			String sstr = new String(new char[DefineConstants.MAX_LINE_LEN + 1]);
			FILE f;

			//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
			//	static sbyte *viafile = DefineConstants.NULL;
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(fit_command_viafile); // Free previous name, if any
			fit_command_viafile = GlobalMembersUtil.try_to_get_string(); // Cannot fail since isstringvalue succeeded
			fprintf(log_f, "fitted parameters and initial values from file: %s\n\n", fit_command_viafile);
			if (!(f = GlobalMembersMisc.loadpath_fopen(fit_command_viafile, "r")))
			{
				String.format(fitbuf + 9, ("could not read parameter-file \"%s\""),(fit_command_viafile));
				GlobalMembersFit.error_ex();
			};

			/* get parameters and values out of file and ignore fixed ones */

			while (true)
			{
				//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
				if (!fgets(s = sstr, sizeof(sstr), f)) // EOF found
					break;
				if ((tmp = tangible.StringFunctions.strStr(s, GP_FIXED)) != DefineConstants.NULL) // ignore fixed params
				{
					tmp = DefineConstants.NUL;
					fprintf(log_f, "FIXED:  %s\n", s);
					fixed = true;
				}
				else
					fixed = false;
				if ((tmp = tangible.StringFunctions.strChr(s, '#')) != DefineConstants.NULL)
					tmp = DefineConstants.NUL;
				if (GlobalMembersFit.is_empty(s))
					continue;
				tangible.RefObject<String[]> tempRef_s = new tangible.RefObject<String[]>(s);
				tmp = GlobalMembersFit.get_next_word(tempRef_s, c);
				s = tempRef_s.argvalue;
				if (!GlobalMembersFit.is_variable(tmp) || tmp.length() > DefineConstants.MAX_ID_LEN)
				{
					() fclose(f);
					{
						String.format(fitbuf + 9, ("syntax error in parameter file"));
						GlobalMembersFit.error_ex();
					};
				}
				//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
				GlobalMembersStdfn.safe_strncpy(par_name[num_params], tmp, sizeof(byte[MAX_ID_LEN + 1]));
				/* next must be '=' */
				if (c != '=')
				{
					tmp = tangible.StringFunctions.strChr(s, '=');
					if (tmp.equals(DefineConstants.NULL))
					{
						() fclose(f);
						{
							String.format(fitbuf + 9, ("syntax error in parameter file"));
							GlobalMembersFit.error_ex();
						};
					}
					s = tmp + 1;
				}
				tangible.RefObject<String[]> tempRef_s2 = new tangible.RefObject<String[]>(s);
				tmp = GlobalMembersFit.get_next_word(tempRef_s2, c);
				s = tempRef_s2.argvalue;
				if (sscanf(tmp, "%lf", tmp_par) != 1)
				{
					() fclose(f);
					{
						String.format(fitbuf + 9, ("syntax error in parameter file"));
						GlobalMembersFit.error_ex();
					};
				}
				/* make fixed params visible to GNUPLOT */
				if (fixed)
				{
					value tempval = new value();
					() GlobalMembersEval.Gcomplex(tempval, tmp_par, 0.0);
					/* use parname as temp */
					//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
					//ORIGINAL LINE: setvar(par_name[num_params], tempval);
					GlobalMembersFit.setvar(par_name[num_params], new value(tempval));
				}
				else
				{
					if (num_params >= max_params)
					{
						max_params = (max_params * 3) / 2;
						//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
						if (0 || GlobalMembersMatrix.redim_vec(a, max_params) == 0 || !(par_name = GlobalMembersAlloc.gp_realloc(par_name, (max_params + 1) * sizeof(byte[MAX_ID_LEN + 1]), "fit param resize")))
						{
							() fclose(f);
							{
								String.format(fitbuf + 9, ("Out of memory in fit: too many parameters?"));
								GlobalMembersFit.error_ex();
							};
						}
					}
					a[num_params++] = tmp_par;
				}

				tangible.RefObject<String[]> tempRef_s3 = new tangible.RefObject<String[]>(s);
				boolean tempVar = (tmp = GlobalMembersFit.get_next_word(tempRef_s3, c)) != DefineConstants.NULL;
				s = tempRef_s3.argvalue;
				if (tempVar)
				{
					() fclose(f);
					{
						String.format(fitbuf + 9, ("syntax error in parameter file"));
						GlobalMembersFit.error_ex();
					};
				}
			}
			() fclose(f);

		}
		else
		{
			/* not a string after via: it's a variable listing */

			fputs("fitted parameters initialized with current variable values\n\n", log_f);
			do
			{
				if (GlobalMembersUtil.isletter(GlobalMembersCommand.c_token) == 0)
				{
					String.format(fitbuf + 9, ("no parameter specified"));
					GlobalMembersFit.error_ex();
				};
				//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
				GlobalMembersUtil.capture(par_name[num_params], GlobalMembersCommand.c_token, GlobalMembersCommand.c_token, (int) sizeof(par_name[0]));
				if (num_params >= max_params)
				{
					max_params = (max_params * 3) / 2;
					//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
					if (0 || GlobalMembersMatrix.redim_vec(a, max_params) == 0 || !(par_name = GlobalMembersAlloc.gp_realloc(par_name, (max_params + 1) * sizeof(byte[MAX_ID_LEN + 1]), "fit param resize")))
					{
						{
							String.format(fitbuf + 9, ("Out of memory in fit: too many parameters?"));
							GlobalMembersFit.error_ex();
						};
					}
				}
				/* create variable if it doesn't exist */
				a[num_params] = GlobalMembersFit.createdvar(par_name[num_params], DefineConstants.INITIAL_VALUE);
				++num_params;
			} while (GlobalMembersUtil.equals(++GlobalMembersCommand.c_token, ",") != 0 && ++GlobalMembersCommand.c_token);
		}

		GlobalMembersMatrix.redim_vec(a, num_params);
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		par_name = (byte[MAX_ID_LEN + 1] *) GlobalMembersAlloc.gp_realloc(par_name, (num_params + 1) * sizeof(byte[MAX_ID_LEN + 1]), "fit param");

		if (num_data < num_params)
		{
			String.format(fitbuf + 9, ("Number of data points smaller than number of parameters"));
			GlobalMembersFit.error_ex();
		};

		/* avoid parameters being equal to zero */
		for (i = 0; i < num_params; i++)
			if (a[i] == 0)
				a[i] = DefineConstants.NEARLY_ZERO;


		if (num_params == 0)
			GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "No fittable parameters!\n");
		else
			() GlobalMembersFit.regress(a); // fit

		() fclose(log_f);
		log_f = DefineConstants.NULL;
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(fit_x);
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(fit_z);
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(err_data);
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(par_name);
		if (func.at != null)
		{
			GlobalMembersEval.free_at(func.at); // release perm. action table
			func.at = (GlobalMembersMouse.struct at_type *) DefineConstants.NULL;
		}
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		GlobalMembersStdfn.safe_strncpy(last_fit_command, GlobalMembersCommand.gp_input_line, sizeof(last_fit_command));
	}
	///#endif

	/*****************************************************************
    Small function to write the last fit command into a file
    Arg: Pointer to the file; if NULL, nothing is written,
         but only the size of the string is returned.
	 *****************************************************************/

	public static int wri_to_fil_last_fit_cmd(File fp)
	{
		if (fp == null)
			return last_fit_command.length();
		else
			return (int) fputs(last_fit_command, fp);
	}

	/* HBB/H.Harders NEW 20020927: make fit log filename exchangeable at
	 * run-time, not only by setting an environment variable. */
	/* HBB/H.Harders NEW 20020927 */
	public static String getfitlogfile()
	{
		String logfile = null;

		if (fitlogfile.equals(DefineConstants.NULL))
		{
			byte tmp = getenv(GNUFITLOG); // open logfile

			if (tmp != DefineConstants.NULL && tmp != '\0')
			{
				byte tmp2 = tmp + (tmp.length() - 1);

				/* if given log file name ends in path separator, treat it
				 * as a directory to store the default "fit.log" in */
				if (tmp2 == '/' || tmp2 == '\\')
				{
					logfile = GlobalMembersAlloc.gp_alloc(tmp.length() + fitlogfile_default.length() + 1, "logfile");
					logfile = tmp;
					logfile += fitlogfile_default;
				}
				else
				{
					logfile = GlobalMembersUtil.gp_strdup(tmp);
				}
			}
			else
			{
				logfile = GlobalMembersUtil.gp_strdup(fitlogfile_default);
			}
		}
		else
		{
			logfile = GlobalMembersUtil.gp_strdup(fitlogfile);
		}
		return logfile;
	}

	/*
	 * Print message to stderr and log file
	 */
	///#if defined(VA_START) && defined(STDC_HEADERS)




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
	///#define END_OF_COMMAND (c_token >= num_tokens || equals(c_token,";"))
	///#ifdef USE_MOUSE
	///#define PAUSE_BUTTON1 001
	///#define PAUSE_BUTTON2 002
	///#define PAUSE_BUTTON3 004
	///#define PAUSE_CLICK 007
	///#define PAUSE_KEYSTROKE 010
	///#define PAUSE_WINCLOSE 020
	///#define PAUSE_ANY 077
	///#endif
	///#ifdef GP_MACROS
	///#endif
	///#ifndef STDOUT
	///#define STDOUT 1
	///#endif
	///#if defined(MSDOS) || defined(DOS386)
	///#ifdef DJGPP
	///#endif                         // DJGPP 
	///#ifdef __TURBOC__
	///#ifndef _Windows
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
	///#ifdef _Windows
	///#endif
	///#ifdef AMIGA_SC_6_1
	///#else
	///#endif
	///#ifdef OS2
	///#endif
	///#ifdef X11
	///#endif
	///#ifdef _Windows
	///#endif
	///#ifdef WXWIDGETS
	///#endif
	///#ifdef USE_MOUSE
	///#else
	///#define bind_command()
	///#endif
	///#ifdef VOLATILE_REFRESH
	///#endif
	///#ifdef USE_MOUSE
	///#endif
	///#ifdef VMS // HBB 990829: used only on VMS
	///#endif
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
	///#ifdef NORWEGIAN
	///#define AMON01 "Jan"
	///#define AMON02 "Feb"
	///#define AMON03 "Mar"
	///#define AMON04 "Apr"
	///#define AMON05 "Mai"
	///#define AMON06 "Jun"
	///#define AMON07 "Jul"
	///#define AMON08 "Aug"
	///#define AMON09 "Sep"
	///#define AMON10 "Okt"
	///#define AMON11 "Nov"
	///#define AMON12 "Des"
	///#define FMON01 "January"
	///#define FMON02 "February"
	///#define FMON03 "March"
	///#define FMON04 "April"
	///#define FMON05 "May"
	///#define FMON06 "June"
	///#define FMON07 "July"
	///#define FMON08 "August"
	///#define FMON09 "September"
	///#define FMON10 "October"
	///#define FMON11 "November"
	///#define FMON12 "December"
	///#define ADAY0 "Sxn"
	///#define ADAY1 "Man"
	///#define ADAY2 "Tir"
	///#define ADAY3 "Ons"
	///#define ADAY4 "Tor"
	///#define ADAY5 "Fre"
	///#define ADAY6 "Lxr"
	///#define FDAY0 "Sunday"
	///#define FDAY1 "Monday"
	///#define FDAY2 "Tuesday"
	///#define FDAY3 "Wednesday"
	///#define FDAY4 "Thursday"
	///#define FDAY5 "Friday"
	///#define FDAY6 "Saturday"
	///#elif defined(HUNGARIAN)
	///#define AMON01 "jan"
	///#define AMON02 "febr"
	///#define AMON03 "m&aacute;rc"
	///#define AMON04 "&aacute;pr"
	///#define AMON05 "m&aacute;j"
	///#define AMON06 "j&uacute;n"
	///#define AMON07 "j&uacute;l"
	///#define AMON08 "aug"
	///#define AMON09 "szept"
	///#define AMON10 "okt"
	///#define AMON11 "nov"
	///#define AMON12 "dec"
	///#define FMON01 "janu&aacute;r"
	///#define FMON02 "febru&aacute;r"
	///#define FMON03 "m&aacute;rcius"
	///#define FMON04 "&aacute;prilis"
	///#define FMON05 "m&aacute;jus"
	///#define FMON06 "j&uacute;nius"
	///#define FMON07 "j&uacute;lius"
	///#define FMON08 "augusztus"
	///#define FMON09 "szeptember"
	///#define FMON10 "okt&oacute;ber"
	///#define FMON11 "november"
	///#define FMON12 "december"
	///#define ADAY0 "vas"
	///#define ADAY1 "h&eacute;t"
	///#define ADAY2 "kedd"
	///#define ADAY3 "sze"
	///#define ADAY4 "cs&uuml;t"
	///#define ADAY5 "p&eacute;n"
	///#define ADAY6 "szo"
	///#define FDAY0 "vas&aacute;rnap"
	///#define FDAY1 "h&eacute;tf&otilde;"
	///#define FDAY2 "kedd"
	///#define FDAY3 "szerda"
	///#define FDAY4 "cs&uacute;t&ouml;rt&ouml;k"
	///#define FDAY5 "p&eacute;ntek"
	///#define FDAY6 "szombat"
	///#else
	///#define AMON01 "Jan"
	///#define AMON02 "Feb"
	///#define AMON03 "Mar"
	///#define AMON04 "Apr"
	///#define AMON05 "May"
	///#define AMON06 "Jun"
	///#define AMON07 "Jul"
	///#define AMON08 "Aug"
	///#define AMON09 "Sep"
	///#define AMON10 "Oct"
	///#define AMON11 "Nov"
	///#define AMON12 "Dec"
	///#define FMON01 "January"
	///#define FMON02 "February"
	///#define FMON03 "March"
	///#define FMON04 "April"
	///#define FMON05 "May"
	///#define FMON06 "June"
	///#define FMON07 "July"
	///#define FMON08 "August"
	///#define FMON09 "September"
	///#define FMON10 "October"
	///#define FMON11 "November"
	///#define FMON12 "December"
	///#define ADAY0 "Sun"
	///#define ADAY1 "Mon"
	///#define ADAY2 "Tue"
	///#define ADAY3 "Wed"
	///#define ADAY4 "Thu"
	///#define ADAY5 "Fri"
	///#define ADAY6 "Sat"
	///#define FDAY0 "Sunday"
	///#define FDAY1 "Monday"
	///#define FDAY2 "Tuesday"
	///#define FDAY3 "Wednesday"
	///#define FDAY4 "Thursday"
	///#define FDAY5 "Friday"
	///#define FDAY6 "Saturday"
	///#endif // language 
	///#ifdef ACTION_NULL
	///#endif
	///#ifdef ACTION_INIT
	///#endif
	///#ifdef ACTION_SHOW
	///#endif
	///#ifdef ACTION_SET
	///#endif
	///#ifdef ACTION_GET
	///#endif
	///#ifndef ACTION_SAVE
	///#endif
	///#ifdef ACTION_CLEAR
	///#endif
	///#define ACTION_NULL 0
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_INIT (1<<0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_SHOW (1<<1)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_SET (1<<2)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_GET (1<<3)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_SAVE (1<<4)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_CLEAR (1<<5)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define init_loadpath() loadpath_handler(ACTION_INIT,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define set_var_loadpath(path) loadpath_handler(ACTION_SET,(path))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define get_loadpath() loadpath_handler(ACTION_GET,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define save_loadpath() loadpath_handler(ACTION_SAVE,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define clear_loadpath() loadpath_handler(ACTION_CLEAR,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define init_fontpath() fontpath_handler(ACTION_INIT,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define set_var_fontpath(path) fontpath_handler(ACTION_SET,(path))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define get_fontpath() fontpath_handler(ACTION_GET,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define save_fontpath() fontpath_handler(ACTION_SAVE,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define clear_fontpath() fontpath_handler(ACTION_CLEAR,NULL)
	///#define INITIAL_LOCALE ("C")
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define init_locale() locale_handler(ACTION_INIT,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define set_var_locale(path) locale_handler(ACTION_SET,(path))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define get_time_locale() locale_handler(ACTION_GET,NULL)
	///#ifdef HAVE_LOCALE_H
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define set_numeric_locale() do {if (numeric_locale && strcmp(numeric_locale,"C")) setlocale(LC_NUMERIC,numeric_locale);} while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define reset_numeric_locale() do {if (numeric_locale && strcmp(numeric_locale,"C")) setlocale(LC_NUMERIC,"C");} while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define get_decimal_locale() (localeconv()->decimal_point)
	///#else
	///#define set_numeric_locale()
	///#define reset_numeric_locale()
	///#define get_decimal_locale() "."
	///#endif

	/* Just temporary */
	///#if defined(VA_START) && defined(STDC_HEADERS)
	public static void Dblfn(String fmt, Object... LegacyParamArray)
	///#else
	//static void
	//Dblfn(const char *fmt, va_dcl)
	///#endif
	{
		///#ifdef VA_START
		//	va_list args;

		int ParamCount = -1;
		//	va_start(args, fmt);
		///#if defined(HAVE_VFPRINTF) || _LIBC
		//    vfprintf(STANDARD, fmt, args);
		//    va_end(args);
		//    VA_START(args, fmt);
		//    vfprintf(log_f, fmt, args);
		///#else
		_doprnt(fmt, args, stderr);
		_doprnt(fmt, args, log_f);
		///#endif
		//	va_end(args);
		///#else
		//    fprintf(STANDARD, fmt, a1, a2, a3, a4, a5, a6, a7, a8);
		//    fprintf(log_f, fmt, a1, a2, a3, a4, a5, a6, a7, a8);
		///#endif // VA_START
	}
	///#endif

	///#ifdef INFINITY
	///#undef INFINITY
	///#endif

	///#define INFINITY 1e30
	///#define NEARLY_ZERO 1e-30

	/* create new variables with this value (was NEARLY_ZERO) */
	///#define INITIAL_VALUE 1.0

	/* Relative change for derivatives */
	///#define DELTA 0.001

	///#define MAX_DATA 2048
	///#define MAX_PARAMS 32
	///#define MAX_LAMBDA 1e20
	///#define MIN_LAMBDA 1e-20
	///#define LAMBDA_UP_FACTOR 10
	///#define LAMBDA_DOWN_FACTOR 10

	///#if defined(MSDOS) || defined(OS2) || defined(DOS386)
	///#define PLUSMINUS   "\xF1"	// plusminus sign 
	///#else
	///#define PLUSMINUS "+/-"
	///#endif

	///#define LASTFITCMDLENGTH 511

	/* externally visible variables: */

	/* saved copy of last 'fit' command -- for output by "save" */
	public static String fitbuf = new String(new char[256]);

	/* log-file for fit command */
	public static String fitlogfile = null;

	///#ifdef GP_FIT_ERRVARS
	public static boolean fit_errorvariables = false;
	///#endif // GP_FIT_ERRVARS 

	/* private variables: */

	public static int max_data;
	public static int max_params;

	public static double epsilon = 1e-5; // convergence limit
	public static int maxiter = 0;

	public static String fit_script = null;

	/* HBB/H.Harders 20020927: log file name now changeable from inside
	 * gnuplot */
	public static final String fitlogfile_default = "fit.log";
	public static final String GNUFITLOG = "FIT_LOG";

	public static String GP_FIXED = "# FIXED";
	public static String FITLIMIT = "FIT_LIMIT";
	public static String FITSTARTLAMBDA = "FIT_START_LAMBDA";
	public static String FITLAMBDAFACTOR = "FIT_LAMBDA_FACTOR";
	public static String FITMAXITER = "FIT_MAXITER"; // HBB 970304: maxiter patch
	public static String FITSCRIPT = "FIT_SCRIPT";
	public static String DEFAULT_CMD = "replot"; // if no fitscript spec.
	public static String last_fit_command = "";

	public static File log_f = null;

	public static int num_data;
	public static int num_params;
	public static int num_indep; // # independent variables in fit function
	public static int columns; // # values read from data file for each point
	public static double fit_x = 0; /* all independent variable values,
					   e.g. value of the ith variable from
					   the jth data point is in
					   fit_x[j*num_indep+i] */
	public static double fit_z = 0; // dependent data values
	public static double err_data = 0; // standard deviations of dependent data
	public static double[] a = 0; // array of fitting parameters
	public static boolean ctrlc_flag = false;
	public static boolean user_stop = false;

	public static udft_entry func = new udft_entry();


	public static String[] par_name = new String[MAX_ID_LEN + 1];

	public static double startup_lambda = 0;
	public static double lambda_down_factor = DefineConstants.LAMBDA_DOWN_FACTOR;
	public static double lambda_up_factor = DefineConstants.LAMBDA_UP_FACTOR;

	/*****************************************************************
    This is called when a SIGINT occurs during fit
	 *****************************************************************/


	/*****************************************************************
				 internal Prototypes
	 *****************************************************************/

	public static void ctrlc_handle(int an_int)
	{
		/* reinstall signal handler (necessary on SysV) */
		signal(SIGINT, (sigfunc) GlobalMembersFit.ctrlc_handle);
		ctrlc_flag = true;
	}

	/*****************************************************************
    setup the ctrl_c signal handler
	 *****************************************************************/
	public static void ctrlc_setup()
	{
		/*
		 *  MSDOS defines signal(SIGINT) but doesn't handle it through
		 *  real interrupts. So there remain cases in which a ctrl-c may
		 *  be uncaught by signal. We must use kbhit() instead that really
		 *  serves the keyboard interrupt (or write an own interrupt func
		 *  which also generates #ifdefs)
		 *
		 *  I hope that other OSes do it better, if not... add #ifdefs :-(
		 */
		///#if (defined(__EMX__) || !defined(MSDOS) && !defined(DOS386))
		signal(SIGINT, (sigfunc) GlobalMembersFit.ctrlc_handle);
		///#endif
	}

	/* HBB 990829: removed the debug print routines */
	/*****************************************************************
    Marquardt's nonlinear least squares fit
	 *****************************************************************/
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static double marquardt_da = 0;
	double temp_a = 0;
	double d = 0;
	double tmp_d = 0;
	double[] tmp_C = 0;
	double residues = 0;
	public static marq_res marquardt(double[] a, double[] C, double chisq, double lambda)
	{
		int i;
		int j;
		//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
		//	static double *da = 0, *temp_a = 0, *d = 0, *tmp_d = 0, **tmp_C = 0, *residues = 0; // temptative new params set -  delta-step of the parameter
		double tmp_chisq;

		/* Initialization when lambda == -1 */

		if (lambda == -1) // Get first chi-square check
		{
			boolean analyze_ret;

			temp_a = GlobalMembersMatrix.vec(num_params);
			d = GlobalMembersMatrix.vec(num_data + num_params);
			tmp_d = GlobalMembersMatrix.vec(num_data + num_params);
			marquardt_da = GlobalMembersMatrix.vec(num_params);
			residues = GlobalMembersMatrix.vec(num_data + num_params);
			tmp_C = GlobalMembersMatrix.matr(num_data + num_params, num_params);

			analyze_ret = GlobalMembersFit.analyze(a, C, d, chisq);

			/* Calculate a useful startup value for lambda, as given by Schwarz */
			/* FIXME: this is doesn't turn out to be much better, really... */
			if (startup_lambda != 0)
				lambda = startup_lambda;
			else
			{
				lambda = 0;
				for (i = 0; i < num_data; i++)
					for (j = 0; j < num_params; j++)
						lambda += C[i][j] * C[i][j];
				lambda = Math.sqrt(lambda / num_data / num_params);
			}

			/* Fill in the lower square part of C (the diagonal is filled in on
		   each iteration, see below) */
			for (i = 0; i < num_params; i++)
				for (j = 0; j < i; j++) {
					C[num_data + i][j] = 0; 
					C[num_data + j][i] = 0;
				}
			return analyze_ret ? marq_res.OK : marq_res.ML_ERROR;
		}
		/* once converged, free dynamic allocated vars */

		if (lambda == -2)
		{
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(d);
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(tmp_d);
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(marquardt_da);
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(temp_a);
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(residues);
			GlobalMembersMatrix.free_matr(tmp_C);
			return marq_res.OK;
		}
		/* Givens calculates in-place, so make working copies of C and d */

		for (j = 0; j < num_data + num_params; j++)
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			memcpy(tmp_C[j], C[j], num_params * sizeof(double));
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memcpy(tmp_d, d, num_data * sizeof(double));

		/* fill in additional parts of tmp_C, tmp_d */

		for (i = 0; i < num_params; i++)
		{
			/* fill in low diag. of tmp_C ... */
			tmp_C[num_data + i][i] = lambda;
			/* ... and low part of tmp_d */
			tmp_d[num_data + i] = 0;
		}

		/* FIXME: residues[] isn't used at all. Why? Should it be used? */

		GlobalMembersMatrix.Givens(tmp_C, tmp_d, marquardt_da, residues, num_params + num_data, num_params, 1);

		/* check if trial did ameliorate sum of squares */

		for (j = 0; j < num_params; j++)
			temp_a[j] = a[j] + marquardt_da[j];

		if (!GlobalMembersFit.analyze(temp_a, tmp_C, tmp_d, tmp_chisq))
		{
			/* FIXME: will never be reached: always returns TRUE */
			return marq_res.ML_ERROR;
		}
		if (tmp_chisq < chisq) // Success, accept new solution
		{
			if (lambda > DefineConstants.MIN_LAMBDA)
			{
				() putc('/', stderr);
				lambda /= lambda_down_factor;
			}
			chisq = tmp_chisq;
			for (j = 0; j < num_data; j++)
			{
				//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
				//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
				memcpy(C[j], tmp_C[j], num_params * sizeof(double));
				d[j] = tmp_d[j];
			}
			for (j = 0; j < num_params; j++)
				a[j] = temp_a[j];
			return marq_res.BETTER;
		} // failure, increase lambda and return
		else
		{
			() putc('*', stderr);
			lambda *= lambda_up_factor;
			return marq_res.WORSE;
		}
	}

	/*****************************************************************
    compute chi-square and numeric derivations
	 *****************************************************************/
	/* used by marquardt to evaluate the linearized fitting matrix C and
	 * vector d, fills in only the top part of C and d I don't use a
	 * temporary array zfunc[] any more. Just use d[] instead.  */
	/* FIXME: in the new code, this function doesn't really do enough to
	 * be useful. Maybe it ought to be deleted, i.e. integrated with
	 * calculate() ? */
	public static boolean analyze(double[] a, double[] C, double[] d, double chisq)
	{
		int i;
		int j;

		chisq = 0;
		GlobalMembersFit.calculate(d, C, a);

		for (i = 0; i < num_data; i++)
		{
			/* note: order reversed, as used by Schwarz */
			d[i] = (d[i] - fit_z[i]) / err_data[i];
			chisq += d[i] * d[i];
			for (j = 0; j < num_params; j++)
				C[i][j] /= err_data[i];
		}
		/* FIXME: why return a value that is always TRUE ? */
		return true;
	}

	/* To use the more exact, but slower two-side formula, activate the
   following line: */
	/*#define TWO_SIDE_DIFFERENTIATION */
	/*****************************************************************
    compute function values and partial derivatives of chi-square
	 *****************************************************************/
	public static void calculate(double[] zfunc, double[] dzda, double[] a)
	{
		int k;
		int p;
		double tmp_a;
		double[] tmp_high;
		double[] tmp_pars;
		///#ifdef TWO_SIDE_DIFFERENTIATION
		//    double *tmp_low;
		///#endif

		tmp_high = GlobalMembersMatrix.vec(num_data); // numeric derivations
		///#ifdef TWO_SIDE_DIFFERENTIATION
		//    tmp_low = vec(num_data);
		///#endif
		tmp_pars = GlobalMembersMatrix.vec(num_params);

		/* first function values */

		GlobalMembersFit.call_gnuplot(a, zfunc);

		/* then derivatives */

		for (p = 0; p < num_params; p++)
			tmp_pars[p] = a[p];
		for (p = 0; p < num_params; p++)
		{
			tmp_a = Math.abs(a[p]) < DefineConstants.NEARLY_ZERO ? DefineConstants.NEARLY_ZERO : a[p];
			tmp_pars[p] = tmp_a * (1 + DefineConstants.DELTA);
			GlobalMembersFit.call_gnuplot(tmp_pars, tmp_high);
			///#ifdef TWO_SIDE_DIFFERENTIATION
			//	tmp_pars[p] = tmp_a * (1 - DELTA);
			//	call_gnuplot(tmp_pars, tmp_low);
			///#endif
			for (k = 0; k < num_data; k++)
				///#ifdef TWO_SIDE_DIFFERENTIATION
				//	    dzda[k][p] = (tmp_high[k] - tmp_low[k]) / (2 * tmp_a * DELTA);
				///#else
				dzda[k][p] = (tmp_high[k] - zfunc[k]) / (tmp_a * DefineConstants.DELTA);
			///#endif
			tmp_pars[p] = a[p];
		}

		///#ifdef TWO_SIDE_DIFFERENTIATION
		//    free(tmp_low);
		///#endif
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(tmp_high);
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(tmp_pars);
	}

	/*****************************************************************
    call internal gnuplot functions
	 *****************************************************************/
	public static void call_gnuplot(double[] par, double[] data)
	{
		int i;
		int j;
		value v = new value();

		/* set parameters first */
		for (i = 0; i < num_params; i++)
		{
			GlobalMembersEval.Gcomplex(v, par[i], 0.0);
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: setvar(par_name[i], v);
			GlobalMembersFit.setvar(par_name[i], new value(v));
		}

		for (i = 0; i < num_data; i++)
		{
			/* calculate fit-function value */
			/* initialize extra dummy variables from the corresponding
		 actual variables, if any. */
			for (j = 0; j < 5; j++)
			{
				udvt_entry udv = GlobalMembersEval.add_udv_by_name(GlobalMembersParse.c_dummy_var[j]);
				GlobalMembersEval.Gcomplex(func.dummy_values[j], udv.udv_undef ? 0 : GlobalMembersFit.getdvar(GlobalMembersParse.c_dummy_var[j]), 0.0);
			}
			/* set actual dummy variables from file data */
			for (j = 0; j < num_indep; j++)
				GlobalMembersEval.Gcomplex(func.dummy_values[j], fit_x[i * num_indep + j], 0.0);
			GlobalMembersEval.evaluate_at(func.at, v);
			if (GlobalMembersEval.undefined)
			{
				String.format(fitbuf + 9, ("Undefined value during function evaluation"));
				GlobalMembersFit.error_ex();
			};
			data[i] = GlobalMembersEval.real(v);
		}
	}

	/*****************************************************************
    handle user interrupts during fit
	 *****************************************************************/
	public static boolean fit_interrupt()
	{
		while (true)
		{
			fputs("\n\n(S)top fit, (C)ontinue, (E)xecute FIT_SCRIPT:  ", stderr);
			switch (getc(stdin))
			{

			case EOF:
			case 's':
			case 'S':
				fputs("Stop.", stderr);
				user_stop = true;
				return false;

			case 'c':
			case 'C':
				fputs("Continue.", stderr);
				return true;

			case 'e':
			case 'E':
			{
				int i;
				value v = new value();
				String tmp;

				tmp = fit_script != null ? fit_script : DEFAULT_CMD;
				fprintf(stderr, "executing: %s", tmp);
				/* set parameters visible to gnuplot */
				for (i = 0; i < num_params; i++)
				{
					GlobalMembersEval.Gcomplex(v, a[i], 0.0);
					//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
					//ORIGINAL LINE: setvar(par_name[i], v);
					GlobalMembersFit.setvar(par_name[i], new value(v));
				}
				GlobalMembersStdfn.safe_strncpy(GlobalMembersCommand.gp_input_line, tmp, GlobalMembersCommand.gp_input_line_len);
				GlobalMembersCommand.do_line();
			}
			}
		}
		return true;
	}

	/*****************************************************************
    frame routine for the marquardt-fit
	 *****************************************************************/
	public static boolean regress(double[] a)
	{
		double[] covar;
		double dpar;
		double[] C;
		double chisq;
		double last_chisq;
		double lambda;
		int iter;
		int i;
		int j;
		marq_res res;
		udvt_entry v; // For exporting results to the user

		chisq = last_chisq = DefineConstants.INFINITY;
		C = GlobalMembersMatrix.matr(num_data + num_params, num_params);
		lambda = -1; // use sign as flag
		iter = 0; // iteration counter

		/* ctrlc now serves as Hotkey */
		GlobalMembersFit.ctrlc_setup();

		/* Initialize internal variables and 1st chi-square check */
		if ((res = GlobalMembersFit.marquardt(a, C, chisq, lambda)) == marq_res.ML_ERROR)
		{
			String.format(fitbuf + 9, ("FIT: error occurred during fit"));
			GlobalMembersFit.error_ex();
		};
		res = marq_res.BETTER;

		GlobalMembersFit.show_fit(iter, chisq, chisq, a, lambda, stderr);
		GlobalMembersFit.show_fit(iter, chisq, chisq, a, lambda, log_f);

		/* Reset flag describing fit result status */
		v = GlobalMembersEval.add_udv_by_name("FIT_CONVERGED");
		v.udv_undef = false;
		GlobalMembersEval.Ginteger(v.udv_value, 0);

		/* MAIN FIT LOOP: do the regression iteration */

		/* HBB 981118: initialize new variable 'user_break' */
		user_stop = false;

		do
		{
			/*
			 *  MSDOS defines signal(SIGINT) but doesn't handle it through
			 *  real interrupts. So there remain cases in which a ctrl-c may
			 *  be uncaught by signal. We must use kbhit() instead that really
			 *  serves the keyboard interrupt (or write an own interrupt func
			 *  which also generates #ifdefs)
			 *
			 *  I hope that other OSes do it better, if not... add #ifdefs :-(
			 *  EMX does not have kbhit.
			 *
			 *  HBB: I think this can be enabled for DJGPP V2. SIGINT is actually
			 *  handled there, AFAIK.
			 */
			///#if ((defined(MSDOS) || defined(DOS386)) && !defined(__EMX__))
			//	if (kbhit()) {
			//	    do {
			//		getchx();
			//	    } while (kbhit());
			//	    ctrlc_flag = TRUE;
			//	}
			///#endif

			if (ctrlc_flag)
			{
				GlobalMembersFit.show_fit(iter, chisq, last_chisq, a, lambda, stderr);
				ctrlc_flag = false;
				if (!GlobalMembersFit.fit_interrupt()) // handle keys
					break;
			}
			if (res == marq_res.BETTER)
			{
				iter++;
				last_chisq = chisq;
			}
			if ((res = GlobalMembersFit.marquardt(a, C, chisq, lambda)) == marq_res.BETTER)
				GlobalMembersFit.show_fit(iter, chisq, last_chisq, a, lambda, stderr);
		} while ((res != marq_res.ML_ERROR) && (lambda < DefineConstants.MAX_LAMBDA) && ((maxiter == 0) || (iter <= maxiter)) && (res == marq_res.WORSE || ((chisq > DefineConstants.NEARLY_ZERO) ? ((last_chisq - chisq) / chisq) : (last_chisq - chisq)) > epsilon));

		/* fit done */

		/* restore original SIGINT function */
		GlobalMembersPlot.interrupt_setup();

		/* HBB 970304: the maxiter patch: */
		if ((maxiter > 0) && (iter > maxiter))
		{
			GlobalMembersFit.Dblfn("\nMaximum iteration count (%d) reached. Fit stopped.\n", maxiter);
		}
		else if (user_stop)
		{
			GlobalMembersFit.Dblfn("\nThe fit was stopped by the user after %d iterations.\n", iter);
		}
		else
		{
			GlobalMembersFit.Dblfn("\nAfter %d iterations the fit converged.\n", iter);
			v = GlobalMembersEval.add_udv_by_name("FIT_CONVERGED");
			v.udv_undef = false;
			GlobalMembersEval.Ginteger(v.udv_value, 1);
		}

		GlobalMembersFit.Dblfn("final sum of squares of residuals : %g\n", chisq);
		if (chisq > DefineConstants.NEARLY_ZERO)
		{
			GlobalMembersFit.Dblfn("rel. change during last iteration : %g\n\n", (chisq - last_chisq) / chisq);
		}
		else
		{
			GlobalMembersFit.Dblfn("abs. change during last iteration : %g\n\n", (chisq - last_chisq));
		}

		if (res == marq_res.ML_ERROR)
		{
			String.format(fitbuf + 9, ("FIT: error occurred during fit"));
			GlobalMembersFit.error_ex();
		};

		/* compute errors in the parameters */

		///#ifdef GP_FIT_ERRVARS
		if (fit_errorvariables)
			/* Set error variable to zero before doing this */
			/* Thus making sure they are created */
			for (i = 0; i < num_params; i++)
				GlobalMembersFit.setvarerr(par_name[i], 0.0);
		///#endif

		if (num_data == num_params)
		{
			int k;

			GlobalMembersFit.Dblfn("\nExactly as many data points as there are parameters.\n");
			GlobalMembersFit.Dblfn("In this degenerate case, all errors are zero by definition.\n\n");
			GlobalMembersFit.Dblfn("Final set of parameters \n");
			GlobalMembersFit.Dblfn("======================= \n\n");
			for (k = 0; k < num_params; k++)
				GlobalMembersFit.Dblfn("%-15.15s = %-15g\n", par_name[k], a[k]);
		}
		else if (chisq < DefineConstants.NEARLY_ZERO)
		{
			int k;

			GlobalMembersFit.Dblfn("\nHmmmm.... Sum of squared residuals is zero. Can't compute errors.\n\n");
			GlobalMembersFit.Dblfn("Final set of parameters \n");
			GlobalMembersFit.Dblfn("======================= \n\n");
			for (k = 0; k < num_params; k++)
				GlobalMembersFit.Dblfn("%-15.15s = %-15g\n", par_name[k], a[k]);
		}
		else
		{
			int ndf = num_data - num_params;
			double stdfit = Math.sqrt(chisq / ndf);

			GlobalMembersFit.Dblfn("degrees of freedom    (FIT_NDF)                        : %d\n", ndf);
			GlobalMembersFit.Dblfn("rms of residuals      (FIT_STDFIT) = sqrt(WSSR/ndf)    : %g\n", stdfit);
			GlobalMembersFit.Dblfn("variance of residuals (reduced chisquare) = WSSR/ndf   : %g\n\n", chisq / ndf);

			/* Export these to user-accessible variables */
			v = GlobalMembersEval.add_udv_by_name("FIT_NDF");
			v.udv_undef = false;
			GlobalMembersEval.Ginteger(v.udv_value, ndf);
			v = GlobalMembersEval.add_udv_by_name("FIT_STDFIT");
			v.udv_undef = false;
			GlobalMembersEval.Gcomplex(v.udv_value, stdfit, 0);
			v = GlobalMembersEval.add_udv_by_name("FIT_WSSR");
			v.udv_undef = false;
			GlobalMembersEval.Gcomplex(v.udv_value, chisq, 0);

			/* get covariance-, Correlations- and Kurvature-Matrix */
			/* and errors in the parameters                     */

			/* compute covar[][] directly from C */
			GlobalMembersMatrix.Givens(C, 0, 0, 0, num_data, num_params, 0);

			/* Use lower square of C for covar */
			covar = C + num_data;
			GlobalMembersMatrix.Invert_RtR(C, covar, num_params);

			/* calculate unscaled parameter errors in dpar[]: */
			dpar = GlobalMembersMatrix.vec(num_params);
			for (i = 0; i < num_params; i++)
			{
				/* FIXME: can this still happen ? */
				if (covar[i][i] <= 0.0) // HBB: prevent floating point exception later on
				{
					String.format(fitbuf + 9, ("Calculation error: non-positive diagonal element in covar. matrix"));
					GlobalMembersFit.error_ex();
				};
				dpar[i] = Math.sqrt(covar[i][i]);
			}

			/* transform covariances into correlations */
			for (i = 0; i < num_params; i++)
			{
				/* only lower triangle needs to be handled */
				for (j = 0; j <= i; j++)
					covar[i][j] /= dpar[i] * dpar[j];
			}

			/* scale parameter errors based on chisq */
			chisq = Math.sqrt(chisq / (num_data - num_params));
			for (i = 0; i < num_params; i++)
				dpar[i] *= chisq;

			GlobalMembersFit.Dblfn("Final set of parameters            Asymptotic Standard Error\n");
			GlobalMembersFit.Dblfn("=======================            ==========================\n\n");

			for (i = 0; i < num_params; i++)
			{
				double temp = (Math.abs(a[i]) < DefineConstants.NEARLY_ZERO) ? 0.0 : Math.abs(100.0 * dpar[i] / a[i]);

				GlobalMembersFit.Dblfn("%-15.15s = %-15g  %-3.3s %-12.4g (%.4g%%)\n", par_name[i], a[i], DefineConstants.PLUSMINUS, dpar[i], temp);
				///#ifdef GP_FIT_ERRVARS
				if (fit_errorvariables)
					GlobalMembersFit.setvarerr(par_name[i], dpar[i]);
				///#endif
			}

			GlobalMembersFit.Dblfn("\n\ncorrelation matrix of the fit parameters:\n\n");
			GlobalMembersFit.Dblfn("               ");

			for (j = 0; j < num_params; j++)
				GlobalMembersFit.Dblfn("%-6.6s ", par_name[j]);

			GlobalMembersFit.Dblfn("\n");
			for (i = 0; i < num_params; i++)
			{
				GlobalMembersFit.Dblfn("%-15.15s", par_name[i]);
				for (j = 0; j <= i; j++)
				{
					/* Only print lower triangle of symmetric matrix */
					GlobalMembersFit.Dblfn("%6.3f ", covar[i][j]);
				}
				GlobalMembersFit.Dblfn("\n");
			}

			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(dpar);
		}

		/* HBB 990220: re-imported this snippet from older versions. Finally,
		 * some user noticed that it *is* necessary, after all. Not even
		 * Carsten Grammes himself remembered what it was for... :-(
		 * The thing is: the value of the last parameter is not reset to
		 * its original one after the derivatives have been calculated
		 */
		/* restore last parameter's value (not done by calculate) */
		{
			value val = new value();
			GlobalMembersEval.Gcomplex(val, a[num_params - 1], 0.0);
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: setvar(par_name[num_params - 1], val);
			GlobalMembersFit.setvar(par_name[num_params - 1], new value(val));
		}

		/* call destructor for allocated vars */
		lambda = -2; // flag value, meaning 'destruct!'
		GlobalMembersFit.marquardt(a, C, chisq, lambda);

		GlobalMembersMatrix.free_matr(C);
		return true;
	}

	/*****************************************************************
    display actual state of the fit
	 *****************************************************************/
	public static void show_fit(int i, double chisq, double last_chisq, double[] a, double lambda, FILE device)
	{
		int k;

		fprintf(device, "\n\n Iteration %d\n WSSR        : %-15g   delta(WSSR)/WSSR   : %g\n delta(WSSR) : %-15g   limit for stopping : %g\n lambda	  : %g\n\n%s parameter values\n\n", i, chisq, chisq > DefineConstants.NEARLY_ZERO ? (chisq - last_chisq) / chisq : 0.0, chisq - last_chisq, epsilon, lambda, (i > 0 ? "resultant" : "initial set of free"));
		for (k = 0; k < num_params; k++)
			fprintf(device, "%-15.15s = %g\n", par_name[k], a[k]);
	}

	/* A modified copy of save.c:save_range(), but this one reports
	 * _current_ values, not the 'set' ones, by default */
	public static void log_axis_restriction(File log_f, AXIS_INDEX axis, String name)
	{
		String s = new String(new char[80]);
		axis this_axis = GlobalMembersAxis.axis_array[axis.getValue()];

		fprintf(log_f, "\t%s range restricted to [", name);
		if (this_axis.autoscale & e_autoscale.AUTOSCALE_MIN != 0)
		{
			putc('*', log_f);
		}
		else if (this_axis.is_timedata)
		{
			putc('"', log_f);
			GlobalMembersTime.gstrftime(s, 80, this_axis.timefmt, this_axis.min);
			fputs(s, log_f);
			putc('"', log_f);
		}
		else
		{
			fprintf(log_f, "%#g", this_axis.min);
		}

		fputs(" : ", log_f);
		if (this_axis.autoscale & e_autoscale.AUTOSCALE_MAX != 0)
		{
			putc('*', log_f);
		}
		else if (this_axis.is_timedata)
		{
			putc('"', log_f);
			GlobalMembersTime.gstrftime(s, 80, this_axis.timefmt, this_axis.max);
			fputs(s, log_f);
			putc('"', log_f);
		}
		else
		{
			fprintf(log_f, "%#g", this_axis.max);
		}
		fputs("]\n", log_f);
	}

	/*****************************************************************
    is_empty: check for valid string entries
	 *****************************************************************/
	public static boolean is_empty(String s)
	{
		while (s.equals(' ') || s.equals('\t') || s.equals('\n'))
			s++;
		return (boolean)(s.equals('#') || s.equals('\0'));
	}

	/*****************************************************************
    check for variable identifiers
	 *****************************************************************/
	public static boolean is_variable(String s)
	{
		while (!s.equals('\0'))
		{
			if (!Character.isLetterOrDigit((byte) s) && !s.equals('_'))
				return false;
			s++;
		}
		return true;
	}

	/*****************************************************************
    Read DOUBLE Variable value, return 0 if undefined or wrong type
   I don't think it's a problem that it's an integer - div
	 *****************************************************************/
	public static double getdvar(String varname)
	{
		udvt_entry udv_ptr = GlobalMembersEval.first_udv;

		for (; udv_ptr; udv_ptr = udv_ptr.next_udv)
			if (strcmp(varname, udv_ptr.udv_name) == 0)
				return GlobalMembersEval.real((udv_ptr.udv_value));

		/* get here => not found */
		return 0;
	}
	///#endif // GP_FIT_ERRVARS 

	/*****************************************************************
    Read INTGR Variable value, return 0 if undefined or wrong type
	 *****************************************************************/
	public static int getivar(String varname)
	{
		udvt_entry udv_ptr = GlobalMembersEval.first_udv;

		while (udv_ptr != null)
		{
			if (StringFunctions.strcmp(varname, udv_ptr.udv_name) == 0)
				return udv_ptr.udv_value.type == (DATA_TYPES.INTGR.getValue()) != 0 ? udv_ptr.udv_value.v.int_val : 0; // wrong type -  valid
			udv_ptr = udv_ptr.next_udv;
		}
		return 0; // not in table
	}

	/*****************************************************************
	    Set a GNUPLOT user-defined variable
	 ******************************************************************/

	public static void setvar(String varname, value data)
	{
		udvt_entry udv_ptr = GlobalMembersEval.add_udv_by_name(varname);
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
		//ORIGINAL LINE: udv_ptr->udv_value = data;
		udv_ptr.udv_value.copyFrom(data);
		udv_ptr.udv_undef = false;
	}

	/*****************************************************************
    get next word of a multi-word string, advance pointer
	 *****************************************************************/
	public static String get_next_word(tangible.RefObject<String[]> s, String subst)
	{
		//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * tmp = s.argvalue;

		while (*tmp == ' ' || *tmp == '\t' || *tmp == '=')
			tmp++;
		if (*tmp == '\n' || *tmp == '\0') // not found
			return DefineConstants.NULL;
		if ((s.argvalue = strpbrk(tmp, " =\t\n")) == DefineConstants.NULL)
			s.argvalue = tmp + tmp.length();
		subst = * s.argvalue;
		*(s.argvalue)++= '\0';
		return tmp;
	}

	/*****************************************************************
   like getdvar, but
   - convert it from integer to real if necessary
   - create it with value INITIAL_VALUE if not found or undefined
	 *****************************************************************/
	public static double createdvar(String varname, double value)
	{
		udvt_entry udv_ptr = GlobalMembersEval.first_udv;

		for (; udv_ptr; udv_ptr = udv_ptr.next_udv)
			if (strcmp(varname, udv_ptr.udv_name) == 0)
			{
				if (udv_ptr.udv_undef)
				{
					udv_ptr.udv_undef = false;
					GlobalMembersEval.Gcomplex(udv_ptr.udv_value, value, 0.0);
				}
				else if (udv_ptr.udv_value.type == DATA_TYPES.INTGR)
				{
					GlobalMembersEval.Gcomplex(udv_ptr.udv_value, (double) udv_ptr.udv_value.v.int_val, 0.0);
				}
				return GlobalMembersEval.real((udv_ptr.udv_value));
			}
		/* get here => not found */

		{
			value tempval = new value();
			GlobalMembersEval.Gcomplex(tempval, value, 0.0);
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: setvar(varname, tempval);
			GlobalMembersFit.setvar(varname, new value(tempval));
		}

		return value;
	}

	/*****************************************************************
    Split Identifier into path and filename
	 *****************************************************************/
	public static void splitpath(String s, String p, String f)
	{
		//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * tmp = s + s.length() - 1;

		while (tmp >= s && *tmp != '\\' && *tmp != '/' && *tmp != ':')
			tmp--;
		/* FIXME HBB 20010121: unsafe! Sizes of 'f' and 'p' are not known.
		 * May write past buffer end. */
		f = tmp + 1;
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(p, s, (int)(tmp - s + 1));
		p = tangible.StringFunctions.changeCharacter(p, tmp - s + 1, DefineConstants.NUL);
	}

	/*****************************************************************
    Backup a file by renaming it to something useful. Return
    the new name in tofile
	 *****************************************************************/

	/* tofile must point to a char array[] or allocated data. See update() */

	public static void backup_file(String tofile, String fromfile)
	{
		///#if defined (WIN32) || defined(MSDOS) || defined(VMS)
		//    char *tmpn;
		///#endif

		/* win32 needs to have two attempts at the rename, since it may
		 * be running on win32s with msdos 8.3 names
		 */

		/* first attempt, for all o/s other than MSDOS */

		///#ifndef MSDOS

		tofile = fromfile;

		///#ifdef VMS
		// /* replace all dots with _, since we will be adding the only
		//  * dot allowed in VMS names
		//  */
		//    while ((tmpn = strchr(tofile, '.')) != NULL)
		//	*tmpn = '_';
		///#endif //VMS

		tofile += DefineConstants.BACKUP_SUFFIX;

		if (rename(fromfile, tofile) == 0)
			return; // hurrah
		///#endif


		///#if defined (WIN32) || defined(MSDOS)
		//
		// /* first attempt for msdos. Second attempt for win32s */
		//
		// /* Copy only the first 8 characters of the filename, to comply
		//  * with the restrictions of FAT filesystems. */
		//    safe_strncpy(tofile, fromfile, 8 + 1);
		//
		//    while ((tmpn = strchr(tofile, '.')) != NULL)
		//	*tmpn = '_';
		//
		//    strcat(tofile, BACKUP_SUFFIX);
		//
		//    if (rename(fromfile, tofile) == 0)
		//	return;			// success
		//
		///#endif // win32 || msdos

		/* get here => rename failed. */
		{
			String.format(fitbuf + 9, ("Could not rename file %s to %s"),(fromfile),(tofile));
			GlobalMembersFit.error_ex();
		};
	}

	///#ifdef GP_FIT_ERRVARS
	/*****************************************************************
            Set a GNUPLOT user-defined variable for an error
            variable: so take the parameter name, turn it
            into an error parameter name (e.g. a to a_err)
            and then set it.
	 ******************************************************************/

	///#ifdef GP_FIT_ERRVARS
	public static void setvarerr(String varname, double value)
	{
		value errval = new value(); // This will hold the gnuplot value created from value
		String pErrValName; // The name of the (new) error variable

		/* Create the variable name by appending _err */
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pErrValName = GlobalMembersAlloc.gp_alloc(varname.length() + sizeof(byte) + 4, "");

		String.format(pErrValName,"%s_err",varname);
		GlobalMembersEval.Gcomplex(errval, value, 0.0);
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: setvar(pErrValName, errval);
		GlobalMembersFit.setvar(pErrValName, new value(errval));
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pErrValName);
	}
}