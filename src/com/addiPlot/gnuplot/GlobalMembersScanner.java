package com.addiPlot.gnuplot;

import com.addiPlot.gnuplot.tangible.RefObject;
import com.addiPlot.gnuplot.tangible.StringFunctions;

public class GlobalMembersScanner
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
	//	return GlobalMembersAlloc.RCSid("$Id: scanner.c,v 1.27.2.1 2010/01/30 05:07:52 sfeam Exp $");
	//}

	/*
	 * scanner() breaks expression[] into lexical units, storing them in token[].
	 *   The total number of tokens found is returned as the function
	 *   value.  Scanning will stop when '\0' is found in expression[], or
	 *   when token[] is full.  extend_input_line() is called to extend
	 *   expression array if needed.
	 *
	 *       Scanning is performed by following rules:
	 *
	 *      Current char    token should contain
	 *     -------------    -----------------------
	 *      1.  alpha,_     all following alpha-numerics
	 *      2.  digit       0 or more following digits, 0 or 1 decimal point,
	 *                              0 or more digits, 0 or 1 'e' or 'E',
	 *                              0 or more digits.
	 *      3.  ^,+,-,/     only current char
	 *          %,~,(,)
	 *          [,],;,:,
	 *          ?,comma
	 *          $           for using patch (div)
	 *      4.  &,|,=,*     current char; also next if next is same
	 *      5.  !,<,>       current char; also next if next is =
	 *      6.  ", '        all chars up until matching quote
	 *      7.  #           this token cuts off scanning of the line (DFK).
	 *      8.  `           (command substitution: all characters through the
	 *                      matching backtic are replaced by the output of
	 *                      the contained command, then scanning is restarted.)
	 * EAM Jan 2010:	Bugfix. No rule covered an initial period. This caused
	 *			string concatenation to fail for variables whose first
	 *			character is 'E' or 'e'.  Now we add a 9th rule:
	 *	9.  .		A period may be a token by itself (string concatenation)
	 *			or the start of a decimal number continuing with a digit
	 *
	 *                      white space between tokens is ignored
	 */
	///#endif

	/* GNUPLOT - scanner.c */

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
	 * $Id: scanner.h,v 1.6 2004/04/13 17:24:00 broeker Exp $
	 */

	/* GNUPLOT - scanner.h */

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

	/* Type definitions */

	/* Variables of scanner.c needed by other modules: */

	/* Prototypes of functions exported by scanner.c */

	public static int scanner(RefObject<String[]> expressionp, int expressionlenp)
	{
		int current; // index of current char in expression[]
		String expression = expressionp.argvalue;
		int quote;
		byte brace;

		for (current = t_num = 0; expression.charAt(current) != DefineConstants.NUL; current++)
		{
			if (t_num + 1 >= GlobalMembersCommand.token_table_size)
			{
				/* leave space for dummy end token */
				GlobalMembersCommand.extend_token_table();
			}
			if (Character.isWhitespace((byte) expression.charAt(current)))
				continue; // skip the whitespace
			GlobalMembersCommand.token[t_num].start_index = current;
			GlobalMembersCommand.token[t_num].length = 1;
			GlobalMembersCommand.token[t_num].is_token = true; // to start with...

			if (expression.charAt(current) == '`')
			{
				tangible.RefObject<String[]> tempRef_expressionp = new tangible.RefObject<String[]>(expressionp);
				GlobalMembersScanner.substitute(tempRef_expressionp, expressionlenp, current);
				expressionp.argvalue = tempRef_expressionp.argvalue;
				expression = expressionp.argvalue; // expression might have moved
				current--;
				continue;
			}
			/* allow _ to be the first character of an identifier */
			if (Character.isLetter((byte) expression.charAt(current)) || expression.charAt(current) == '_')
			{
				while ((Character.isLetterOrDigit((byte)expression.charAt(current + 1)) || (expression.charAt(current + 1)) == '_')) {GlobalMembersCommand.token[t_num].length++; current++;};
			}
			else if (Character.isDigit((byte) expression.charAt(current)))
			{
				GlobalMembersCommand.token[t_num].is_token = false;
				GlobalMembersCommand.token[t_num].length = GlobalMembersScanner.get_num(expression.charAt(current));
				current += (GlobalMembersCommand.token[t_num].length - 1);

			}
			else if (expression.charAt(current) == '.')
			{
				/* Rule 9 */
				if (Character.isDigit(expression.charAt(current + 1)))
				{
					GlobalMembersCommand.token[t_num].is_token = false;
					GlobalMembersCommand.token[t_num].length = GlobalMembersScanner.get_num(expression.charAt(current));
					current += (GlobalMembersCommand.token[t_num].length - 1);
				} // do nothing if the . is a token by itself

			}
			else if (expression.charAt(current) == DefineConstants.LBRACE)
			{
				GlobalMembersCommand.token[t_num].is_token = false;
				GlobalMembersCommand.token[t_num].l_val.type = DATA_TYPES.CMPLX;
				///#ifdef __PUREC__
				//	    {
				//		char l[80];
				//		if ((sscanf(&expression[++current], "%lf,%lf%[ }]s",
				//			    &token[t_num].l_val.v.cmplx_val.real,
				//			    &token[t_num].l_val.v.cmplx_val.imag,
				//			    &l) != 3) || (!strchr(l, RBRACE)))
				//		    int_error(t_num, "invalid complex constant");
				//	    }
				///#else
				if ((sscanf(expression.charAt(++current), "%lf , %lf %c", GlobalMembersCommand.token[t_num].l_val.v.cmplx_val.real, GlobalMembersCommand.token[t_num].l_val.v.cmplx_val.imag, brace) != 3) || (brace != DefineConstants.RBRACE))
					GlobalMembersBf_test.int_error(t_num, "invalid complex constant");
				///#endif
				GlobalMembersCommand.token[t_num].length += 2;
				while (expression.charAt(++current) != DefineConstants.RBRACE)
				{
					GlobalMembersCommand.token[t_num].length++;
					if (expression.charAt(current) == DefineConstants.NUL) // { for vi %
						GlobalMembersBf_test.int_error(t_num, "no matching '}'");
				}
			}
			else if (expression.charAt(current) == '\'' || expression.charAt(current) == '\"')
			{
				GlobalMembersCommand.token[t_num].length++;
				quote = expression.charAt(current);
				while (expression.charAt(++current) != quote)
				{
					if (!expression.charAt(current))
					{
						expression = StringFunctions.changeCharacter(expression, current, quote);
						expression = StringFunctions.changeCharacter(expression, current + 1, DefineConstants.NUL);
						break;
					}
					else if (quote == '\"' && expression.charAt(current) == '\\' && expression.charAt(current + 1))
					{
						current++;
						GlobalMembersCommand.token[t_num].length += 2;
					}
					else if (quote == '\"' && expression.charAt(current) == '`')
					{
						tangible.RefObject<String[]> tempRef_expressionp2 = new tangible.RefObject<String[]>(expressionp);
						GlobalMembersScanner.substitute(tempRef_expressionp2, expressionlenp, current);
						expressionp.argvalue = tempRef_expressionp2.argvalue;
						expression = expressionp.argvalue; // it might have moved
						current--;
					}
					else if (quote == '\'' && expression.charAt(current + 1) == '\'' && expression.charAt(current + 2) == '\'')
					{
						/* look ahead: two subsequent single quotes
						 * -> take them in
						 */
						current += 2;
						GlobalMembersCommand.token[t_num].length += 3;
					}
					else
						GlobalMembersCommand.token[t_num].length++;
				}
			}
			else
				switch (expression.charAt(current))
				{
				case '#': // DFK: add comments to gnuplot
					//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto endline; // ignore the rest of the line
				case '^':
				case '+':
				case '-':
				case '/':
				case '%':
				case '~':
				case '(':
				case ')':
				case '[':
				case ']':
				case ';':
				case ':':
				case '?':
				case ',':
				case '$': // div
					break;
				case '&':
				case '|':
				case '=':
				case '*':
					if (expression.charAt(current) == expression.charAt(current + 1))
					{GlobalMembersCommand.token[t_num].length++; current++;};
					break;
				case '!':
				case '<':
				case '>':
					if (expression.charAt(current + 1) == '=')
					{GlobalMembersCommand.token[t_num].length++; current++;};
					break;
				default:
					GlobalMembersBf_test.int_error(t_num, "invalid character %c",expression.charAt(current));
				}
			++t_num; // next token if not white space
		}

		//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		endline: // comments jump here to ignore line

			/* Now kludge an extra token which points to '\0' at end of expression[].
	   This is useful so printerror() looks nice even if we've fallen off the
	   line. */

			GlobalMembersCommand.token[t_num].start_index = current;
		GlobalMembersCommand.token[t_num].length = 0;
		/* print 3+4  then print 3+  is accepted without
		 * this, since string is ignored if it is not
		 * a token
		 */
		GlobalMembersCommand.token[t_num].is_token = true;
		return (t_num);
	}



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
	///#define NO_CARET (-1)
	///#define DATAFILE (-2)
	///#if 0 // UNUSED
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define isstringvalue(c_token) (isstring(c_token) || type_udv(c_token)==STRING)
	///#if defined(VA_START) && defined(STDC_HEADERS)
	///#else
	///#endif

	public static int get_num(tangible.RefObject<String> str)
	{
		int count = 0;

		GlobalMembersCommand.token[t_num].is_token = false;
		GlobalMembersCommand.token[t_num].l_val.type = DATA_TYPES.INTGR; // assume unless . or E found
		while (Character.isDigit((byte) str.argvalue[count]))
			count++;
		if (str.argvalue[count].equals('.'))
		{
			GlobalMembersCommand.token[t_num].l_val.type = DATA_TYPES.CMPLX;
			/* swallow up digits until non-digit */
			while (Character.isDigit((byte) str.argvalue[++count]));
			/* now str[count] is other than a digit */
		}
		if (str.argvalue[count].equals('e') || str.argvalue[count].equals('E'))
		{
			GlobalMembersCommand.token[t_num].l_val.type = DATA_TYPES.CMPLX;
			count++;
			if (str.argvalue[count].equals('-') || str.argvalue[count].equals('+'))
				count++;
			if (!Character.isDigit((byte) str.argvalue[count]))
			{
				GlobalMembersCommand.token[t_num].start_index += count;
				GlobalMembersBf_test.int_error(t_num, "expecting exponent");
			}
			while (Character.isDigit((byte) str.argvalue[++count]));
		}
		if (GlobalMembersCommand.token[t_num].l_val.type == DATA_TYPES.INTGR)
		{
			int lval;
			String endptr;
			errno = 0;
			lval = strtol(str.argvalue, endptr, 0);
			if (!errno && ((GlobalMembersCommand.token[t_num].l_val.v.int_val = lval) == lval))
				return (endptr - str.argvalue);
			GlobalMembersUtil.int_warn(t_num, "integer overflow; changing to floating point");
			GlobalMembersCommand.token[t_num].l_val.type = DATA_TYPES.CMPLX;
			/* Fall through */
		}
		GlobalMembersCommand.token[t_num].l_val.v.cmplx_val.imag = 0.0;
		GlobalMembersCommand.token[t_num].l_val.v.cmplx_val.real = Double.parseDouble(str.argvalue);
		return (count);
	}

	/* substitute output from ` `
	 * *strp points to the input string.  (*strp)[current] is expected to
	 * be the initial back tic.  Characters through the following back tic
	 * are replaced by the output of the command.  extend_input_line()
	 * is called to extend *strp array if needed.
	 */
	public static void substitute(tangible.RefObject<String[]> strp, int str_lenp, int current)
	{
		//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * last;
		byte c;
		String str;
		String pgm;
		String rest = DefineConstants.NULL;
		String output;
		int pgm_len;
		int rest_len = 0;
		int output_pos;

		/* forgive missing closing backquote at end of line */
		str = strp.argvalue + current;
		last = str;
		while (*++last)
		{
			if (*last == '`')
				break;
		}
		pgm_len = last - str;
		pgm = GlobalMembersAlloc.gp_alloc(pgm_len, "command string");
		GlobalMembersStdfn.safe_strncpy(pgm, str + 1, pgm_len); // omit ` to leave room for NUL

		/* save rest of line, if any */
		if (*last)
		{
			last++; // advance past `
			rest_len = last.length() + 1;
			if (rest_len > 1)
			{
				rest = GlobalMembersAlloc.gp_alloc(rest_len, "input line copy");
				rest = last;
			}
		}

		/* do system call */
		tangible.RefObject<String[]> tempRef_output = new tangible.RefObject<String[]>(output);
		() GlobalMembersCommand.do_system_func(pgm, tempRef_output);
		output = tempRef_output.argvalue;
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pgm);

		/* now replace ` ` with output */
		output_pos = 0;
		while ((c = output.charAt(output_pos++)))
		{
			if (c != '\n' && c != '\r')
				strp.argvalue[current++] = c;
			if (current == str_lenp)
				GlobalMembersCommand.extend_input_line();
		}
		strp.argvalue[current] = 0;
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(output);

		/* tack on rest of line to output */
		if (rest != null)
		{
			while (current + rest_len > str_lenp)
				GlobalMembersCommand.extend_input_line();
			strp.argvalue + current = rest;
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(rest);
		}
		GlobalMembersUtil.screen_ok = false;

	}

	///#ifdef AMIGA_AC_5
	///#define O_RDONLY	0
	//int open(const char *_name, int _mode,...);
	//int close(int);
	///#endif // AMIGA_AC_5 

	///#ifdef VMS
	///#include <descrip.h>
	///#define MAILBOX "PLOT$MAILBOX"
	///#define pclose(f) fclose(f)
	///#ifdef __DECC
	///#include <lib$routines.h>	// avoid some IMPLICITFNC warnings 
	///#include <starlet.h>
	///#endif // __DECC 
	///#endif // VMS 


	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define isident(c) (isalnum((unsigned char)c) || (c) == '_')

	///#define LBRACE '{'
	///#define RBRACE '}'

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define APPEND_TOKEN {token[t_num].length++; current++;}

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SCAN_IDENTIFIER while ((isalnum((unsigned char)expression[current + 1]) || (expression[current + 1]) == '_')) {token[t_num].length++; current++;}

	public static int t_num; // number of token I'm working on
}