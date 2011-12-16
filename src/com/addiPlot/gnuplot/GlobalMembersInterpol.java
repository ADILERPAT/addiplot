package com.addiPlot.gnuplot;

public class GlobalMembersInterpol
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
		return GlobalMembersAlloc.RCSid("$Id: interpol.c,v 1.38 2008/11/12 02:29:43 janert Exp $");
	}

/*
 * This is the main entry point used for everything except frequencies.
 * As stated in the header, it is fine, but I'm not too happy with it.
 */

	///#endif

	/* GNUPLOT - interpol.c */

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
	 * C-Source file identification Header
	 *
	 * This file belongs to a project which is:
	 *
	 * done 1993 by MGR-Software, Asgard  (Lars Hanke)
	 * written by Lars Hanke
	 *
	 * Contact me via:
	 *
	 *  InterNet: mgr@asgard.bo.open.de
	 *      FIDO: Lars Hanke @ 2:243/4802.22   (as long as they keep addresses)
	 *
	 **************************************************************************
	 *
	 *   Project: gnuplot
	 *    Module:
	 *      File: interpol.c
	 *
	 *   Revisor: Lars Hanke
	 *   Revised: 26/09/93
	 *  Revision: 1.0
	 *
	 **************************************************************************
	 *
	 * LEGAL
	 *  This module is part of gnuplot and distributed under whatever terms
	 *  gnuplot is or will be published, unless exclusive rights are claimed.
	 *
	 * DESCRIPTION
	 *  Supplies 2-D data interpolation and approximation routines
	 *
	 * IMPORTS
	 *  plot.h
	 *    - cp_extend()
	 *    - structs: curve_points, coordval, coordinate
	 *
	 *  setshow.h
	 *    - samples, axis array[] variables
	 *    - plottypes
	 *
	 *  proto.h
	 *    - solve_tri_diag()
	 *    - typedef tri_diag
	 *
	 * EXPORTS
	 *  gen_interp()
	 *  sort_points()
	 *  cp_implode()
	 *
	 * BUGS and TODO
	 *  I would really have liked to use Gershon Elbers contouring code for
	 *  all the stuff done here, but I failed. So I used my own code.
	 *  If somebody is able to consolidate Gershon's code for this purpose
	 *  a lot of gnuplot users would be very happy - due to memory problems.
	 *
	 **************************************************************************
	 *
	 * HISTORY
	 * Changes:
	 *  Nov 24, 1995  Markus Schuh (M.Schuh@meteo.uni-koeln.de):
	 *      changed the algorithm for csplines
	 *      added algorithm for approximation csplines
	 *      copied point storage and range fix from plot2d.c
	 *
	 *  Dec 12, 1995 David Denholm
	 *      oops - at the time this is called, stored co-ords are
	 *      internal (ie maybe log of data) but min/max are in
	 *      user co-ordinates.
	 *      Work with min and max of internal co-ords, and
	 *      check at the end whether external min and max need to
	 *      be increased. (since samples_1 is typically 100 ; we
	 *      dont want to take more logs than necessary)
	 *      Also, need to take into account which axes are active
	 *
	 *  Jun 30, 1996 Jens Emmerich
	 *      implemented handling of UNDEFINED points
	 */

	/*
	 * $Id: interpol.h,v 1.7 2004/04/13 17:23:58 broeker Exp $
	 */

	/* GNUPLOT - interpol.h */

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
	///#if defined(sun386) || defined(AMIGA_SC_6_1)
	///#endif
	///#ifdef EAM_OBJECTS
	///#else
	///#define place_objects(listhead,layer,dimensions,clip_area) // void() 
	///#endif

	/* Type definitions */

	/* Variables of interpol.c needed by other modules: */

	/* Prototypes of functions exported by interpol.c */
	public static void gen_interp(curve_points plot)
	{

		double[] sc = new double[spline_coeff_size];
		double bc;
		coordinate[] new_points;
		int i;
		int curves;
		int first_point;
		int num_points;

		curves = GlobalMembersInterpol.num_curves(plot);
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		new_points = GlobalMembersAlloc.gp_alloc((GlobalMembersGadgets.samples_1 + 1) * curves * sizeof(GlobalMembersMouse.struct coordinate), "interpolation table");

		first_point = 0;
		for (i = 0; i < curves; i++)
		{
		num_points = GlobalMembersInterpol.next_curve(plot, first_point);
		switch (plot.plot_smooth)
		{
		case SMOOTH_CSPLINES:
			sc = cp_tridiag(plot, first_point, num_points);
			GlobalMembersInterpol.do_cubic(plot, sc, first_point, num_points, new_points + i * (GlobalMembersGadgets.samples_1 + 1));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(sc);
			break;
		case SMOOTH_ACSPLINES:
			sc = cp_approx_spline(plot, first_point, num_points);
			GlobalMembersInterpol.do_cubic(plot, sc, first_point, num_points, new_points + i * (GlobalMembersGadgets.samples_1 + 1));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(sc);
			break;

		case SMOOTH_BEZIER:
		case SMOOTH_SBEZIER:
			bc = GlobalMembersInterpol.cp_binomial(num_points);
			GlobalMembersInterpol.do_bezier(plot, bc, first_point, num_points, new_points + i * (GlobalMembersGadgets.samples_1 + 1));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free((String) bc);
			break;
		case SMOOTH_KDENSITY:
		  GlobalMembersInterpol.do_kdensity(plot, first_point, num_points, new_points + i * (GlobalMembersGadgets.samples_1 + 1));
		  break;
		default: // keep gcc -Wall quiet
			;
		}
		new_points[(i + 1) * (GlobalMembersGadgets.samples_1 + 1) - 1].type = coord_type.UNDEFINED;
		first_point += num_points;
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(plot.points);
		plot.points = new_points;
		plot.p_max = curves * (GlobalMembersGadgets.samples_1 + 1);
		plot.p_count = plot.p_max - 1;

		return;
	}

/*
 * Frequency plots have don't need new points allocated; we just need
 * to adjust the plot ranges. Wedging this into gen_interp() would
 * make that code even harder to read.
 */

	public static void gen_interp_frequency(curve_points plot)
	{
		int i;
		int j;
		int curves;
		int first_point;
		int num_points;
		double y;

		curves = GlobalMembersInterpol.num_curves(plot);

		first_point = 0;
		for (i = 0; i < curves; i++)
		{
			num_points = GlobalMembersInterpol.next_curve(plot, first_point);

			/* If cumulative, replace the current y-value with the
			   sum of all previous y-values. This assumes that the
			   data has already been sorted by x-values. */
			if (plot.plot_smooth == PLOT_SMOOTH.SMOOTH_CUMULATIVE)
			{
				y = 0;
				for (j = first_point; j < first_point + num_points; j++)
				{
					if (plot.points[j].type == coord_type.UNDEFINED)
						continue;

					y += plot.points[j].y;
					plot.points[j].y = y;
				}
			}

			GlobalMembersInterpol.do_freq(plot, first_point, num_points);
			first_point += num_points + 1;
		}
		return;
	}
	public static void sort_points(curve_points plot)
	{
		int first_point;
		int num_points;

		first_point = 0;
		while ((num_points = GlobalMembersInterpol.next_curve(plot, first_point)) > 0)
		{
		/* Sort this set of points, does qsort handle 1 point correctly? */
		/* HBB 20010720: removed casts -- they don't help a thing, but
		 * may hide problems */
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(plot.points + first_point, num_points, sizeof(GlobalMembersMouse.struct coordinate), GlobalMembersInterpol.compare_points);
		first_point += num_points;
		}
		return;
	}

/*
 * cp_implode() if averaging is selected this function computes the new
 *              entries and shortens the whole thing to the necessary
 *              size
 * MGR Addendum
 */

	public static void cp_implode(curve_points cp)
	{
		int first_point;
		int num_points;
		int i;
		int j;
		int k;
		double x = 0.;
		double y = 0.;
		double sux = 0.;
		double slx = 0.;
		double suy = 0.;
		double sly = 0.;
		/* int x_axis = cp->x_axis; */
		/* int y_axis = cp->y_axis; */
		boolean all_inrange = false;

		GlobalMembersAxis.x_axis = cp.x_axis;
		GlobalMembersAxis.y_axis = cp.y_axis;
		j = 0;
		first_point = 0;
		while ((num_points = GlobalMembersInterpol.next_curve(cp, first_point)) > 0)
		{
		k = 0;
		for (i = first_point; i < first_point + num_points; i++)
		{
			/* HBB 20020801: don't try to use undefined datapoints */
			if (cp.points[i].type == coord_type.UNDEFINED)
				continue;
			if (k == 0)
			{
			x = cp.points[i].x;
			y = cp.points[i].y;
			sux = cp.points[i].xhigh;
			slx = cp.points[i].xlow;
			suy = cp.points[i].yhigh;
			sly = cp.points[i].ylow;
			all_inrange = (cp.points[i].type == coord_type.INRANGE);
			k = 1;
			}
			else if (cp.points[i].x == x)
			{
			y += cp.points[i].y;
			sux += cp.points[i].xhigh;
			slx += cp.points[i].xlow;
			suy += cp.points[i].yhigh;
			sly += cp.points[i].ylow;
			if (cp.points[i].type != coord_type.INRANGE)
				all_inrange = false;
			k++;
			}
			else
			{
			cp.points[j].x = x;
			 if (cp.plot_smooth == PLOT_SMOOTH.SMOOTH_FREQUENCY || cp.plot_smooth == PLOT_SMOOTH.SMOOTH_CUMULATIVE)
				k = 1;
			cp.points[j].y = y /= (double) k;
			cp.points[j].xhigh = sux / (double) k;
			cp.points[j].xlow = slx / (double) k;
			cp.points[j].yhigh = suy / (double) k;
			cp.points[j].ylow = sly / (double) k;
			/* HBB 20000405: I wanted to use STORE_AND_FIXUP_RANGE
			 * here, but won't: it assumes we want to modify the
			 * range, and that the range is given in 'input'
			 * coordinates.  For logarithmic axes, the overhead
			 * would be larger than the possible gain, so write it
			 * out explicitly, instead:
			 * */
			cp.points[j].type = coord_type.INRANGE;
			if (!all_inrange)
			{
				if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
				{
				if (x <= -DefineConstants.VERYLARGE)
				{
					cp.points[j].type = coord_type.OUTRANGE;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto is_outrange;
				}
				x = Math.exp((x) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base);
				}
				if (((x < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN)) || ((x > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX)))
				{
				cp.points[j].type = coord_type.OUTRANGE;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto is_outrange;
				}
				if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log)
				{
				if (y <= -DefineConstants.VERYLARGE)
				{
					cp.points[j].type = coord_type.OUTRANGE;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto is_outrange;
				}
				y = Math.exp((y) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base);
				}
				if (((y < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN)) || ((y > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX)))
				cp.points[j].type = coord_type.OUTRANGE;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			is_outrange:
				;
			} // if(! all inrange)

			j++; // next valid entry
			k = 0; // to read
			i--; // from this (-> last after for(;;)) entry
			} // else (same x position)
		} // for(points in curve)

		if (k != 0)
		{
			cp.points[j].x = x;
			if (cp.plot_smooth == PLOT_SMOOTH.SMOOTH_FREQUENCY || cp.plot_smooth == PLOT_SMOOTH.SMOOTH_CUMULATIVE)
			k = 1;
			cp.points[j].y = y /= (double) k;
			cp.points[j].xhigh = sux / (double) k;
			cp.points[j].xlow = slx / (double) k;
			cp.points[j].yhigh = suy / (double) k;
			cp.points[j].ylow = sly / (double) k;
			cp.points[j].type = coord_type.INRANGE;
			if (!all_inrange)
			{
				if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
				{
				if (x <= -DefineConstants.VERYLARGE)
				{
					cp.points[j].type = coord_type.OUTRANGE;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto is_outrange2;
				}
				x = Math.exp((x) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base);
				}
				if (((x < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN)) || ((x > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX)))
				{
				cp.points[j].type = coord_type.OUTRANGE;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto is_outrange2;
				}
				if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log)
				{
				if (y <= -DefineConstants.VERYLARGE)
				{
					cp.points[j].type = coord_type.OUTRANGE;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto is_outrange2;
				}
				y = Math.exp((y) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base);
				}
				if (((y < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN)) || ((y > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX)))
				cp.points[j].type = coord_type.OUTRANGE;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			is_outrange2:
				;
			}
			j++; // next valid entry
		}
		/* insert invalid point to separate curves */
		if (j < cp.p_count)
		{
			cp.points[j].type = coord_type.UNDEFINED;
			j++;
		}
		first_point += num_points;
		} // end while
		cp.p_count = j;
		GlobalMembersPlot2d.cp_extend(cp, j);
	}

/*
 * position curve_start to index the next non-UNDEFINDED point,
 * start search at initial curve_start,
 * return number of non-UNDEFINDED points from there on,
 * if no more valid points are found, curve_start is set
 * to plot->p_count and 0 is returned
 */




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
	///#define map_x3d(x) ((x-X_AXIS.min)*xscale3d + xcenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_y3d(y) ((y-Y_AXIS.min)*yscale3d + ycenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_z3d(z) ((z-floor_z)*zscale3d + zcenter3d -1.0)
	///#define ISO_SAMPLES 10
	///#ifdef USE_MOUSE
	///#endif
	///#define DEFAULT_CONTOUR_LEVELS 5
	///#define DEFAULT_NUM_APPROX_PTS 5
	///#define DEFAULT_CONTOUR_ORDER 4
	///#define MAX_BSPLINE_ORDER 10
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define contour_levels_list ((double *)dyn_contour_levels_list.v)
	/*  #include "setshow.h" */


	/* in order to support multiple axes, and to simplify ranging in
	 * parametric plots, we use arrays to store some things. For 2d plots,
	 * elements are z=0,y1=1,x1=2,z2=4,y2=5,x2=6 these are given symbolic
	 * names in plot.h
	 */


	/*
	 * IMHO, code is getting too cluttered with repeated chunks of
	 * code. Some macros to simplify, I hope.
	 */


	/* store VALUE or log(VALUE) in STORE, set TYPE as appropriate Do
	 * OUT_ACTION or UNDEF_ACTION as appropriate. Adjust range provided
	 * type is INRANGE (ie dont adjust y if x is outrange). VALUE must not
	 * be same as STORE */
	/* FIXME 20010610: UNDEF_ACTION is completely unused ??? Furthermore,
	 * this is so similar to STORE_WITH_LOG_AND_UPDATE_RANGE() from axis.h
	 * that the two should probably be merged.  */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define STORE_AND_FIXUP_RANGE(store, value, type, min, max, auto, out_action, undef_action) do { store=value; if (type != INRANGE) break; if ((value) < (min)) { if ((auto) & AUTOSCALE_MIN) (min) = (value); else { (type) = OUTRANGE; out_action; break; } } if ((value) > (max)) { if ((auto) & AUTOSCALE_MAX) (max) = (value); else { (type) = OUTRANGE; out_action; } } } while(0)

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define UPDATE_RANGE(TEST,OLD,NEW,axis) do { if (TEST) (OLD) = (axis_array[axis].log ? exp((NEW) * axis_array[axis].log_base): (NEW)); } while(0)

	///#define spline_coeff_size 4

	public static int next_curve(curve_points plot, int curve_start)
	{
		int curve_length;

		/* Skip undefined points */
		while (curve_start < plot.p_count && plot.points[curve_start].type == coord_type.UNDEFINED)
		{
		curve_start++;
		};
		curve_length = 0;
		/* curve_length is first used as an offset, then the correct # points */
		while ((curve_start) + curve_length < plot.p_count && plot.points[(curve_start) + curve_length].type != coord_type.UNDEFINED)
		{
		curve_length++;
		};
		return (curve_length);
	}

/*
 * determine the number of curves in plot->points, separated by
 * UNDEFINED points
 */

	public static int num_curves(curve_points plot)
	{
		int curves;
		int first_point;
		int num_points;

		first_point = 0;
		curves = 0;
		while ((num_points = GlobalMembersInterpol.next_curve(plot, first_point)) > 0)
		{
		curves++;
		first_point += num_points;
		}
		return (curves);
	}

/* PKJ - May 2008 
   kdensity (short for Kernel Density) builds histograms using
   "Kernel Density Estimation" using Gaussian Kernels.
   Check: L. Wassermann: "All of Statistics" for example.

   The implementation is based closely on the implementation for Bezier
   curves, except for the way the actual interpolation is generated.
*/

/* eval_kdensity is a modification of eval_bezier */
	public static void eval_kdensity(curve_points cp, int first_point, int num_points, double sr, double px, double py)
	{

		int i;
		int n = num_points - 1;
		coordinate[] this_points = (cp.points) + first_point;

		double x;
		double y;
		double tmp;
		double avg;
		double sigma;
		double min = DBL_MAX;
		double max = -DBL_MAX;
		double bandwidth;
		double default_bandwidth;

		avg = 0.0;
		sigma = 0.0;
		for (i = 0; i <= n; i++)
		{
		  avg += this_points[i].x;
		  sigma += this_points[i].x * this_points[i].x;

		  /* Find min and max of x-range. Necessary since points not sorted! */
		  min = this_points[i].x < min != 0 ? this_points[i].x : min;
		  max = this_points[i].x > max != 0 ? this_points[i].x : max;
		}
		avg /= (double)n;
		sigma = Math.sqrt(sigma / (double)n - avg * avg); // Standard Deviation

		/* This is the optimal bandwidth if the point distribution is Gaussian.
		   (Applied Smoothing Techniques for Data Analysis
		   by Adrian W, Bowman & Adelchi Azzalini (1997)) */
		default_bandwidth = Math.pow(4.0 / (3.0 * num_points), 1.0 / 5.0) * sigma;

		/* If the supplied bandwidth is zero of less, the default bandwidth
		   is used. If only two columns have been specified in the using
		   declaration, the value of the third column (z-value) is set to
		   the value of '-1' in plot2d.c::get_data(). Therefore, a negative
		   value of z indicates that the default bandwidth should be used.
		   (I would prefer that a different magic value would be used to
		   indicate a missing third column, so that we we could fail if
		   the user supplies a negative bandwidth, but the -1 seems too
		   deeply ingrained.) */

		x = min + sr * (max - min); // The current x-value

		y = 0;
		for (i = 0; i <= n; i++)
		{
		  if (this_points[i].z <= 0)
		  {
		bandwidth = default_bandwidth;
		  }
		  else
		  {
		bandwidth = this_points[i].z;
		  }

		  tmp = (x - this_points[i].x) / bandwidth;
		  y += this_points[i].y * Math.exp(- 0.5 * tmp * tmp) / bandwidth;
		}
		y /= Math.sqrt(2.0 * DefineConstants.M_PI);

		px = x;
		py = y;
	}

/* do_kdensity is based on do_bezier, except for the call to eval_bezier */
	public static void do_kdensity(curve_points cp, int first_point, int num_points, coordinate[] dest)
	{
		int i;
		double x;
		double y;

		/* min and max in internal (eg logged) co-ordinates. We update
		 * these, then update the external extrema in user co-ordinates
		 * at the end.
		 */

		double ixmin;
		double ixmax;
		double iymin;
		double iymax;
		double sxmin; // starting values of above
		double sxmax;
		double symin;
		double symax;

		GlobalMembersAxis.x_axis = cp.x_axis;
		GlobalMembersAxis.y_axis = cp.y_axis;

		ixmin = sxmin = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min));
		ixmax = sxmax = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max));
		iymin = symin = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min));
		iymax = symax = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max));

		for (i = 0; i < GlobalMembersGadgets.samples_1; i++)
		{
			GlobalMembersInterpol.eval_kdensity(cp, first_point, num_points, (double) i / (double)(GlobalMembersGadgets.samples_1 - 1), x, y);

		/* now we have to store the points and adjust the ranges */
		dest[i].type = coord_type.INRANGE;
		do
		{
			dest[i].x = x;
			if (dest[i].type != coord_type.INRANGE)
				break;
				if ((x) < (ixmin))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MIN)
						(ixmin) = (x);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
							break;
						}
				}
				if ((x) > (ixmax))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MAX)
						(ixmax) = (x);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
						}
				}
		} while (0);
		do
		{
			dest[i].y = y;
			if (dest[i].type != coord_type.INRANGE)
				break;
				if ((y) < (iymin))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MIN)
						(iymin) = (y);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
							break;
						}
				}
				if ((y) > (iymax))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MAX)
						(iymax) = (y);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
						}
				}
		} while (0);

		dest[i].xlow = dest[i].xhigh = dest[i].x;
		dest[i].ylow = dest[i].yhigh = dest[i].y;

		dest[i].z = -1;
		}

		do
		{
			if (ixmax > sxmax)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((ixmax) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (ixmax));
		} while (0);
		do
		{
			if (ixmin < sxmin)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((ixmin) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (ixmin));
		} while (0);
		do
		{
			if (iymax > symax)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((iymax) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (iymax));
		} while (0);
		do
		{
			if (iymin < symin)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((iymin) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (iymin));
		} while (0);
	}

/*
 * build up a cntr_struct list from curve_points
 * this funtion is only used for the alternate entry point to
 * Gershon's code and thus commented out
 ***deleted***
 */


/* HBB 990205: rewrote the 'bezier' interpolation routine,
 * to prevent numerical overflow and other undesirable things happening
 * for large data files (num_data about 1000 or so), where binomial
 * coefficients would explode, and powers of 'sr' (0 < sr < 1) become
 * extremely small. Method used: compute logarithms of these
 * extremely large and small numbers, and only go back to the
 * real numbers once they've cancelled out each other, leaving
 * a reasonable-sized one. */

/*
 * cp_binomial() computes the binomial coefficients needed for BEZIER stuff
 *   and stores them into an array which is hooked to sdat.
 * (MGR 1992)
 */
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: static double * cp_binomial(int points)
	public static double cp_binomial(int points)
	{
		double[] coeff;
		int n;
		int k;
		int e;

		e = points; // well we're going from k=0 to k=p_count-1
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		coeff = GlobalMembersAlloc.gp_alloc(e * sizeof(double), "bezier coefficients");

		n = points - 1;
		e = n / 2;
		/* HBB 990205: calculate these in 'logarithmic space',
		 * as they become _very_ large, with growing n (4^n) */
		coeff[0] = 0.0;

		for (k = 0; k < e; k++)
		{
		coeff[k + 1] = coeff[k] + Math.log(((double)(n - k)) / ((double)(k + 1)));
		}

		for (k = n; k >= e; k--)
		coeff[k] = coeff[n - k];

		return (coeff);
	}

/* This is a subfunction of do_bezier() for BEZIER style computations.
 * It is passed the stepration (STEP/MAXSTEPS) and the addresses of
 * the double values holding the next x and y coordinates.
 * (MGR 1992)
 */

	public static void eval_bezier(curve_points cp, int first_point, int num_points, double sr, double px, double py, double[] c)
	{
		int n = num_points - 1;
		coordinate[] this_points;

		this_points = (cp.points) + first_point;

		if (sr == 0.0)
		{
		px = this_points[0].x;
		py = this_points[0].y;
		}
		else if (sr == 1.0)
		{
		px = this_points[n].x;
		py = this_points[n].y;
		}
		else
		{
		/* HBB 990205: do calculation in 'logarithmic space',
		 * to avoid over/underflow errors, which would exactly cancel
		 * out each other, anyway, in an exact calculation
		 */
		int i;
		double lx = 0.0;
		double ly = 0.0;
		double log_dsr_to_the_n = n * Math.log(1 - sr);
		double log_sr_over_dsr = Math.log(sr) - Math.log(1 - sr);

		for (i = 0; i <= n; i++)
		{
			double u = Math.exp(c[i] + log_dsr_to_the_n + i * log_sr_over_dsr);

			lx += this_points[i].x * u;
			ly += this_points[i].y * u;
		}

		px = lx;
		py = ly;
		}
	}

/*
 * generate a new set of coordinates representing the bezier curve and
 * set it to the plot
 */

	public static void do_bezier(curve_points cp, double bc, int first_point, int num_points, coordinate[] dest)
	{
		int i;
		double x;
		double y;

		/* min and max in internal (eg logged) co-ordinates. We update
		 * these, then update the external extrema in user co-ordinates
		 * at the end.
		 */

		double ixmin;
		double ixmax;
		double iymin;
		double iymax;
		double sxmin; // starting values of above
		double sxmax;
		double symin;
		double symax;

		GlobalMembersAxis.x_axis = cp.x_axis;
		GlobalMembersAxis.y_axis = cp.y_axis;

		ixmin = sxmin = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min));
		ixmax = sxmax = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max));
		iymin = symin = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min));
		iymax = symax = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max));

		for (i = 0; i < GlobalMembersGadgets.samples_1; i++)
		{
		GlobalMembersInterpol.eval_bezier(cp, first_point, num_points, (double) i / (double)(GlobalMembersGadgets.samples_1 - 1), x, y, bc);

		/* now we have to store the points and adjust the ranges */

		dest[i].type = coord_type.INRANGE;
		do
		{
			dest[i].x = x;
			if (dest[i].type != coord_type.INRANGE)
				break;
				if ((x) < (ixmin))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MIN)
						(ixmin) = (x);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
							break;
						}
				}
				if ((x) > (ixmax))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MAX)
						(ixmax) = (x);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
						}
				}
		} while (0);
		do
		{
			dest[i].y = y;
			if (dest[i].type != coord_type.INRANGE)
				break;
				if ((y) < (iymin))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MIN)
						(iymin) = (y);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
							break;
						}
				}
				if ((y) > (iymax))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MAX)
						(iymax) = (y);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
						}
				}
		} while (0);

		dest[i].xlow = dest[i].xhigh = dest[i].x;
		dest[i].ylow = dest[i].yhigh = dest[i].y;

		dest[i].z = -1;
		}

		do
		{
			if (ixmax > sxmax)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((ixmax) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (ixmax));
		} while (0);
		do
		{
			if (ixmin < sxmin)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((ixmin) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (ixmin));
		} while (0);
		do
		{
			if (iymax > symax)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((iymax) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (iymax));
		} while (0);
		do
		{
			if (iymin < symin)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((iymin) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (iymin));
		} while (0);
	}

/*
 * call contouring routines -- main entry
 */

/*
 * it should be like this, but it doesn't run. If you find out why,
 * contact me: mgr@asgard.bo.open.de or Lars Hanke 2:243/4802.22@fidonet
 *
 * Well, all this had originally been inside contour.c, so maybe links
 * to functions and of contour.c are broken.
 * ***deleted***
 * end of unused entry point to Gershon's code
 *
 */

/*
 * Solve five diagonal linear system equation. The five diagonal matrix is
 * defined via matrix M, right side is r, and solution X i.e. M * X = R.
 * Size of system given in n. Return TRUE if solution exist.
 *  G. Engeln-Muellges/ F.Reutter:
 *  "Formelsammlung zur Numerischen Mathematik mit Standard-FORTRAN-Programmen"
 *  ISBN 3-411-01677-9
 *
 * /  m02 m03 m04   0   0   0   0    .       .       . \   /  x0  \    / r0
 * I  m11 m12 m13 m14   0   0   0    .       .       . I   I  x1  I   I  r1  I
 * I  m20 m21 m22 m23 m24   0   0    .       .       . I * I  x2  I = I  r2  I
 * I    0 m30 m31 m32 m33 m34   0    .       .       . I   I  x3  I   I  r3  I
 *      .   .   .   .   .   .   .    .       .       .        .        .
 * \                           m(n-3)0 m(n-2)1 m(n-1)2 /   \x(n-1)/   \r(n-1)/
 *
 */
	public static int solve_five_diag(double[][] m, double[] r, double[] x, int n)
	{
		int i;
		double[] hv = new double[5];

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		hv = GlobalMembersAlloc.gp_alloc((n + 1) * sizeof(double[5]), "five_diag help vars");

		hv[0][0] = m[0][2];
		if (hv[0][0] == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(hv);
		return false;
		}
		hv[0][1] = m[0][3] / hv[0][0];
		hv[0][2] = m[0][4] / hv[0][0];

		hv[1][3] = m[1][1];
		hv[1][0] = m[1][2] - hv[1][3] * hv[0][1];
		if (hv[1][0] == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(hv);
		return false;
		}
		hv[1][1] = (m[1][3] - hv[1][3] * hv[0][2]) / hv[1][0];
		hv[1][2] = m[1][4] / hv[1][0];

		for (i = 2; i < n; i++)
		{
		hv[i][3] = m[i][1] - m[i][0] * hv[i - 2][1];
		hv[i][0] = m[i][2] - m[i][0] * hv[i - 2][2] - hv[i][3] * hv[i - 1][1];
		if (hv[i][0] == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(hv);
			return false;
		}
		hv[i][1] = (m[i][3] - hv[i][3] * hv[i - 1][2]) / hv[i][0];
		hv[i][2] = m[i][4] / hv[i][0];
		}

		hv[0][4] = 0;
		hv[1][4] = r[0] / hv[0][0];
		for (i = 1; i < n; i++)
		{
		hv[i + 1][4] = (r[i] - m[i][0] * hv[i - 1][4] - hv[i][3] * hv[i][4]) / hv[i][0];
		}

		x[n - 1] = hv[n][4];
		x[n - 2] = hv[n - 1][4] - hv[n - 2][1] * x[n - 1];
		for (i = n - 3; i >= 0; i--)
		x[i] = hv[i + 1][4] - hv[i][1] * x[i + 1] - hv[i][2] * x[i + 2];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(hv);
		return true;
	}
	static double * cp_approx_spline[spline_coeff_size](struct curve_points * plot, int first_point, int num_points);
	static double * cp_tridiag[spline_coeff_size](struct curve_points * plot, int first_point, int num_points);
	public static void do_cubic(curve_points plot, double[] sc, int first_point, int num_points, coordinate[] dest)
	{
		double xdiff;
		double temp;
		double x;
		double y;
		double xstart; // Endpoints of the sampled x range
		double xend;
		int i;
		int l;
		coordinate[] this_points;

		/* min and max in internal (eg logged) co-ordinates. We update
		 * these, then update the external extrema in user co-ordinates
		 * at the end.
		 */
		double ixmin;
		double ixmax;
		double iymin;
		double iymax;
		double sxmin; // starting values of above
		double sxmax;
		double symin;
		double symax;

		GlobalMembersAxis.x_axis = plot.x_axis;
		GlobalMembersAxis.y_axis = plot.y_axis;

		ixmin = sxmin = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min));
		ixmax = sxmax = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max));
		iymin = symin = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min));
		iymax = symax = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? (Math.log(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max));

		this_points = (plot.points) + first_point;

		l = 0;

		/* HBB 20010727: Sample only across the actual x range, not the
		 * full range of input data */
	///#if SAMPLE_CSPLINES_TO_FULL_RANGE
	//    xstart = this_points[0].x;
	//    xend = this_points[num_points - 1].x;
	///#else
		xstart = ((this_points[0].x) > (sxmin) ? (this_points[0].x) : (sxmin));
		xend = ((this_points[num_points - 1].x) < (sxmax) ? (this_points[num_points - 1].x) : (sxmax));

		if (xstart >= xend)
		GlobalMembersBf_test.int_error(plot.token, "Cannot smooth: no data within fixed xrange!");
	///#endif
		xdiff = (xend - xstart) / (GlobalMembersGadgets.samples_1 - 1);

		for (i = 0; i < GlobalMembersGadgets.samples_1; i++)
		{
		x = xstart + i * xdiff;

		/* Move forward to the spline interval this point is in */
		while ((x >= this_points[l + 1].x) && (l < num_points - 2))
			l++;

		/* KB 981107: With logarithmic x axis the values were
			 * converted back to linear scale before calculating the
			 * coefficients. Use exponential for log x values. */
		temp = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((x) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (x)) - (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((this_points[l].x) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (this_points[l].x));

		/* Evaluate cubic spline polynomial */
		y = ((sc[l][3] * temp + sc[l][2]) * temp + sc[l][1]) * temp + sc[l][0];

		/* With logarithmic y axis, we need to convert from linear to
			 * log scale now. */
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log)
		{
			if (y > 0.)
			y = (Math.log(y) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base);
			else
			y = symin - (symax - symin);
		}

		dest[i].type = coord_type.INRANGE;
		do
		{
			dest[i].x = x;
			if (dest[i].type != coord_type.INRANGE)
				break;
				if ((x) < (ixmin))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MIN)
						(ixmin) = (x);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
							break;
						}
				}
				if ((x) > (ixmax))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MAX)
						(ixmax) = (x);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
						}
				}
		} while (0);
		do
		{
			dest[i].y = y;
			if (dest[i].type != coord_type.INRANGE)
				break;
				if ((y) < (iymin))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MIN)
						(iymin) = (y);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
							break;
						}
				}
				if ((y) > (iymax))
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale) & e_autoscale.AUTOSCALE_MAX)
						(iymax) = (y);
						else
						{
							(dest[i].type) = coord_type.OUTRANGE;
							()0;
						}
				}
		} while (0);

		dest[i].xlow = dest[i].xhigh = dest[i].x;
		dest[i].ylow = dest[i].yhigh = dest[i].y;

		dest[i].z = -1;

		}

		do
		{
			if (ixmax > sxmax)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((ixmax) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (ixmax));
		} while (0);
		do
		{
			if (ixmin < sxmin)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((ixmin) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (ixmin));
		} while (0);
		do
		{
			if (iymax > symax)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((iymax) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (iymax));
		} while (0);
		do
		{
			if (iymin < symin)
				(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((iymin) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (iymin));
		} while (0);

	}

/*
 * do_freq() is like the other smoothers only in that it
 * needs to adjust the plot ranges. We don't have to copy
 * approximated curves or anything like that.
 */

	public static void do_freq(curve_points plot, int first_point, int num_points)
	{
		double x;
		double y;
		int i;
		int x_axis = plot.x_axis;
		int y_axis = plot.y_axis;
		coordinate[] this_Renamed;

		/* min and max in internal (eg logged) co-ordinates. We update
		 * these, then update the external extrema in user co-ordinates
		 * at the end.
		 */

		double ixmin;
		double ixmax;
		double iymin;
		double iymax;
		double sxmin; // starting values of above
		double sxmax;
		double symin;
		double symax;

		ixmin = sxmin = (GlobalMembersAxis.axis_array[x_axis].log ? (Math.log(GlobalMembersAxis.axis_array[x_axis].min) / GlobalMembersAxis.axis_array[x_axis].log_base) : (GlobalMembersAxis.axis_array[x_axis].min));
		ixmax = sxmax = (GlobalMembersAxis.axis_array[x_axis].log ? (Math.log(GlobalMembersAxis.axis_array[x_axis].max) / GlobalMembersAxis.axis_array[x_axis].log_base) : (GlobalMembersAxis.axis_array[x_axis].max));
		iymin = symin = (GlobalMembersAxis.axis_array[y_axis].log ? (Math.log(GlobalMembersAxis.axis_array[y_axis].min) / GlobalMembersAxis.axis_array[y_axis].log_base) : (GlobalMembersAxis.axis_array[y_axis].min));
		iymax = symax = (GlobalMembersAxis.axis_array[y_axis].log ? (Math.log(GlobalMembersAxis.axis_array[y_axis].max) / GlobalMembersAxis.axis_array[y_axis].log_base) : (GlobalMembersAxis.axis_array[y_axis].max));

		this_Renamed = (plot.points) + first_point;

		for (i = 0; i < num_points; i++)
		{

		x = this_Renamed[i].x;
		y = this_Renamed[i].y;

		this_Renamed[i].type = coord_type.INRANGE;

		do
		{
			this_Renamed[i].x = x;
			if (this_Renamed[i].type != coord_type.INRANGE)
				break;
				if ((x) < (ixmin))
				{
					if ((GlobalMembersAxis.axis_array[x_axis].autoscale) & e_autoscale.AUTOSCALE_MIN)
						(ixmin) = (x);
						else
						{
							(this_Renamed[i].type) = coord_type.OUTRANGE;
							()0;
							break;
						}
				}
				if ((x) > (ixmax))
				{
					if ((GlobalMembersAxis.axis_array[x_axis].autoscale) & e_autoscale.AUTOSCALE_MAX)
						(ixmax) = (x);
						else
						{
							(this_Renamed[i].type) = coord_type.OUTRANGE;
							()0;
						}
				}
		} while (0);
		do
		{
			this_Renamed[i].y = y;
			if (this_Renamed[i].type != coord_type.INRANGE)
				break;
				if ((y) < (iymin))
				{
					if ((GlobalMembersAxis.axis_array[y_axis].autoscale) & e_autoscale.AUTOSCALE_MIN)
						(iymin) = (y);
						else
						{
							(this_Renamed[i].type) = coord_type.OUTRANGE;
							()0;
							break;
						}
				}
				if ((y) > (iymax))
				{
					if ((GlobalMembersAxis.axis_array[y_axis].autoscale) & e_autoscale.AUTOSCALE_MAX)
						(iymax) = (y);
						else
						{
							(this_Renamed[i].type) = coord_type.OUTRANGE;
							()0;
						}
				}
		} while (0);

		this_Renamed[i].xlow = this_Renamed[i].xhigh = this_Renamed[i].x;
		this_Renamed[i].ylow = this_Renamed[i].yhigh = this_Renamed[i].y;
		this_Renamed[i].z = -1;
		}

		do
		{
			if (ixmax > sxmax)
				(GlobalMembersAxis.axis_array[x_axis].max) = (GlobalMembersAxis.axis_array[x_axis].log ? Math.exp((ixmax) * GlobalMembersAxis.axis_array[x_axis].log_base): (ixmax));
		} while (0);
		do
		{
			if (ixmin < sxmin)
				(GlobalMembersAxis.axis_array[x_axis].min) = (GlobalMembersAxis.axis_array[x_axis].log ? Math.exp((ixmin) * GlobalMembersAxis.axis_array[x_axis].log_base): (ixmin));
		} while (0);
		do
		{
			if (iymax > symax)
				(GlobalMembersAxis.axis_array[y_axis].max) = (GlobalMembersAxis.axis_array[y_axis].log ? Math.exp((iymax) * GlobalMembersAxis.axis_array[y_axis].log_base): (iymax));
		} while (0);
		do
		{
			if (iymin < symin)
				(GlobalMembersAxis.axis_array[y_axis].min) = (GlobalMembersAxis.axis_array[y_axis].log ? Math.exp((iymin) * GlobalMembersAxis.axis_array[y_axis].log_base): (iymin));
		} while (0);
	}

/*
 * sort_points
 *
 * sort data succession for further evaluation by plot_splines, etc.
 * This routine is mainly introduced for compilers *NOT* supporting the
 * UNIX qsort() routine. You can then easily replace it by more convenient
 * stuff for your compiler.
 * (MGR 1992)
 */

/* HBB 20010720: To avoid undefined behaviour that would be caused by
 * casting functions pointers around, changed arguments to what
 * qsort() *really* wants */
/* HBB 20010720: removed 'static' to avoid HP-sUX gcc bug */
	public static int compare_points(Object arg1, Object arg2)
	{
		final coordinate p1 = arg1;
		final coordinate p2 = arg2;

		if (p1.x > p2.x)
		return (1);
		if (p1.x < p2.x)
		return (-1);
		return (0);
	}


	/*
	 * Calculation of approximation cubic splines
	 * Input:  x[i], y[i], weights z[i]
	 *
	 * Returns matrix of spline coefficients
	 */
	public static double * cp_approx_spline[spline_coeff_size](curve_points plot, int first_point, int num_points) // to determine end in plot->points -  where to start in plot->points
	{
		double[] sc = new double[spline_coeff_size];
		double[] m = new double[5];
		double r;
		double x;
		double[] h;
		double[] xp;
		double[] yp;
		coordinate[] this_points;
		int i;

		GlobalMembersAxis.x_axis = plot.x_axis;
		GlobalMembersAxis.y_axis = plot.y_axis;

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		sc = GlobalMembersAlloc.gp_alloc((num_points) * sizeof(double[spline_coeff_size]), "spline matrix");

		if (num_points < 4)
		GlobalMembersBf_test.int_error(plot.token, "Can't calculate approximation splines, need at least 4 points");

		this_points = (plot.points) + first_point;

		for (i = 0; i < num_points; i++)
		if (this_points[i].z <= 0)
			GlobalMembersBf_test.int_error(plot.token, "Can't calculate approximation splines, all weights have to be > 0");

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		m = GlobalMembersAlloc.gp_alloc((num_points - 2) * sizeof(double[5]), "spline help matrix");

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		r = GlobalMembersAlloc.gp_alloc((num_points - 2) * sizeof(double), "spline right side");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		x = GlobalMembersAlloc.gp_alloc((num_points - 2) * sizeof(double), "spline solution vector");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		h = GlobalMembersAlloc.gp_alloc((num_points - 1) * sizeof(double), "spline help vector");

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		xp = GlobalMembersAlloc.gp_alloc((num_points) * sizeof(double), "x pos");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		yp = GlobalMembersAlloc.gp_alloc((num_points) * sizeof(double), "y pos");

		/* KB 981107: With logarithmic axis first convert back to linear scale */

		xp[0] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((this_points[0].x) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (this_points[0].x));
		yp[0] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((this_points[0].y) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (this_points[0].y));
		for (i = 1; i < num_points; i++)
		{
		xp[i] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((this_points[i].x) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (this_points[i].x));
		yp[i] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((this_points[i].y) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (this_points[i].y));
		h[i - 1] = xp[i] - xp[i - 1];
		}

		/* set up the matrix and the vector */

		for (i = 0; i <= num_points - 3; i++)
		{
		r[i] = 3 * ((yp[i + 2] - yp[i + 1]) / h[i + 1] - (yp[i + 1] - yp[i]) / h[i]);

		if (i < 2)
			m[i][0] = 0;
		else
			m[i][0] = 6 / this_points[i].z / h[i - 1] / h[i];

		if (i < 1)
			m[i][1] = 0;
		else
			m[i][1] = h[i] - 6 / this_points[i].z / h[i] * (1 / h[i - 1] + 1 / h[i]) - 6 / this_points[i + 1].z / h[i] * (1 / h[i] + 1 / h[i + 1]);

		m[i][2] = 2 * (h[i] + h[i + 1]) + 6 / this_points[i].z / h[i] / h[i] + 6 / this_points[i + 1].z * (1 / h[i] + 1 / h[i + 1]) * (1 / h[i] + 1 / h[i + 1]) + 6 / this_points[i + 2].z / h[i + 1] / h[i + 1];

		if (i > num_points - 4)
			m[i][3] = 0;
		else
			m[i][3] = h[i + 1] - 6 / this_points[i + 1].z / h[i + 1] * (1 / h[i] + 1 / h[i + 1]) - 6 / this_points[i + 2].z / h[i + 1] * (1 / h[i + 1] + 1 / h[i + 2]);

		if (i > num_points - 5)
			m[i][4] = 0;
		else
			m[i][4] = 6 / this_points[i + 2].z / h[i + 1] / h[i + 2];
		}

		/* solve the matrix */
		if (GlobalMembersInterpol.solve_five_diag(m, r, x, num_points - 2) == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(h);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(r);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(xp);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(yp);
		GlobalMembersBf_test.int_error(plot.token, "Can't calculate approximation splines");
		}
		sc[0][2] = 0;
		for (i = 1; i <= num_points - 2; i++)
		sc[i][2] = x[i - 1];
		sc[num_points - 1][2] = 0;

		sc[0][0] = yp[0] + 2 / this_points[0].z / h[0] * (sc[0][2] - sc[1][2]);
		for (i = 1; i <= num_points - 2; i++)
		sc[i][0] = yp[i] - 2 / this_points[i].z * (sc[i - 1][2] / h[i - 1] - sc[i][2] * (1 / h[i - 1] + 1 / h[i]) + sc[i + 1][2] / h[i]);
		sc[num_points - 1][0] = yp[num_points - 1] - 2 / this_points[num_points - 1].z / h[num_points - 2] * (sc[num_points - 2][2] - sc[num_points - 1][2]);

		for (i = 0; i <= num_points - 2; i++)
		{
		sc[i][1] = (sc[i + 1][0] - sc[i][0]) / h[i] - h[i] / 3 * (sc[i + 1][2] + 2 * sc[i][2]);
		sc[i][3] = (sc[i + 1][2] - sc[i][2]) / 3 / h[i];
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(h);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(r);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(xp);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(yp);

		return (sc);
	}


	/*
	 * Calculation of cubic splines
	 *
	 * This can be treated as a special case of approximation cubic splines, with
	 * all weights -> infinity.
	 *
	 * Returns matrix of spline coefficients
	 */
	public static double * cp_tridiag[spline_coeff_size](curve_points plot, int first_point, int num_points)
	{
		double[] sc = new double[spline_coeff_size];
		double[] m = new double[3];
		double r;
		double x;
		double[] h;
		double[] xp;
		double[] yp;
		coordinate[] this_points;
		int i;

		GlobalMembersAxis.x_axis = plot.x_axis;
		GlobalMembersAxis.y_axis = plot.y_axis;
		if (num_points < 3)
		GlobalMembersBf_test.int_error(plot.token, "Can't calculate splines, need at least 3 points");

		this_points = (plot.points) + first_point;

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		sc = GlobalMembersAlloc.gp_alloc((num_points) * sizeof(double[spline_coeff_size]), "spline matrix");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		m = GlobalMembersAlloc.gp_alloc((num_points - 2) * sizeof(double[3]), "spline help matrix");

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		r = GlobalMembersAlloc.gp_alloc((num_points - 2) * sizeof(double), "spline right side");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		x = GlobalMembersAlloc.gp_alloc((num_points - 2) * sizeof(double), "spline solution vector");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		h = GlobalMembersAlloc.gp_alloc((num_points - 1) * sizeof(double), "spline help vector");

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		xp = GlobalMembersAlloc.gp_alloc((num_points) * sizeof(double), "x pos");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		yp = GlobalMembersAlloc.gp_alloc((num_points) * sizeof(double), "y pos");

		/* KB 981107: With logarithmic axis first convert back to linear scale */

		xp[0] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((this_points[0].x) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (this_points[0].x));
		yp[0] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((this_points[0].y) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (this_points[0].y));
		for (i = 1; i < num_points; i++)
		{
		xp[i] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((this_points[i].x) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (this_points[i].x));
		yp[i] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log ? Math.exp((this_points[i].y) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base): (this_points[i].y));
		h[i - 1] = xp[i] - xp[i - 1];
		}

		/* set up the matrix and the vector */

		for (i = 0; i <= num_points - 3; i++)
		{
		r[i] = 3 * ((yp[i + 2] - yp[i + 1]) / h[i + 1] - (yp[i + 1] - yp[i]) / h[i]);

		if (i < 1)
			m[i][0] = 0;
		else
			m[i][0] = h[i];

		m[i][1] = 2 * (h[i] + h[i + 1]);

		if (i > num_points - 4)
			m[i][2] = 0;
		else
			m[i][2] = h[i + 1];
		}

		/* solve the matrix */
		if (GlobalMembersContour.solve_tri_diag(m, r, x, num_points - 2) == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(h);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(r);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(xp);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(yp);
		GlobalMembersBf_test.int_error(plot.token, "Can't calculate cubic splines");
		}
		sc[0][2] = 0;
		for (i = 1; i <= num_points - 2; i++)
		sc[i][2] = x[i - 1];
		sc[num_points - 1][2] = 0;

		for (i = 0; i <= num_points - 1; i++)
		sc[i][0] = yp[i];

		for (i = 0; i <= num_points - 2; i++)
		{
		sc[i][1] = (sc[i + 1][0] - sc[i][0]) / h[i] - h[i] / 3 * (sc[i + 1][2] + 2 * sc[i][2]);
		sc[i][3] = (sc[i + 1][2] - sc[i][2]) / 3 / h[i];
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(h);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(r);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(xp);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(yp);

		return (sc);
	}
}