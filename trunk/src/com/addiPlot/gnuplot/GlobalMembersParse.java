package com.addiPlot.gnuplot;

import com.addiPlot.gnuplot.tangible.RefObject;

public class GlobalMembersParse
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
	//	return GlobalMembersAlloc.RCSid("$Id: parse.c,v 1.57 2009/04/01 00:02:40 vanzandt Exp $");
	//}
	///#endif

	/* GNUPLOT - parse.c */

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
	 * $Id: parse.h,v 1.19 2008/09/09 06:05:05 sfeam Exp $
	 */

	/* GNUPLOT - parse.h */

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

	///#define STACK_DEPTH 100
	///#define MAX_AT_LEN 150
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define is_jump(operator) ((operator) >=(int)JUMP && (operator) <(int)SF_START)
	///#ifdef __ZTC__
	///#else
	///#endif
	///#ifdef APOLLO
	///#endif

	/* externally usable types defined by parse.h */

	/* exported variables of parse.c */

	/* The choice of dummy variables, as set by 'set dummy', 'set polar'
	 * and 'set parametric' */
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte set_dummy_var[DefineConstants.MAX_NUM_VAR][DefineConstants.MAX_ID_LEN+1];
	/* the currently used 'dummy' variables. Usually a copy of
	 * set_dummy_var, but may be changed by the '(s)plot' command
	 * containing an explicit range (--> 'plot [phi=0..pi]') */
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte c_dummy_var[DefineConstants.MAX_NUM_VAR][DefineConstants.MAX_ID_LEN+1];

	/* This is used by the using_spec parsing code in plot_option_using() */
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int at_highest_column_used;

	/* Prototypes of exported functions in parse.c */

	public static int int_expression()
	{
		return (int)GlobalMembersParse.real_expression();
	}
	public static double real_expression()
	{
		double result;
		value a = new value();
		result = GlobalMembersEval.real(GlobalMembersParse.const_express(a));
		GlobalMembersEval.gpfree_string(a);
		return result;
	}

	/* JW 20051126:
	 * Wrapper around const_express() called by try_to_get_string().
	 * Disallows top level + and - operators.
	 * This enables things like set xtics ('-\pi' -pi, '-\pi/2' -pi/2.)
	 */
	public static value const_string_express(value valptr)
	{
		string_result_only = true;
		GlobalMembersParse.const_express(valptr);
		string_result_only = false;
		return (valptr);
	}
	public static value const_express(value valptr)
	{
		int tkn = GlobalMembersCommand.c_token;

		if (GlobalMembersCommand.c_token >= GlobalMembersCommand.num_tokens || GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ";") != 0)
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "constant expression required");

		/* div - no dummy variables in a constant expression */
		GlobalMembersCommand.dummy_func = null;

		GlobalMembersEval.evaluate_at(GlobalMembersParse.temp_at(), valptr); // run it and send answer back

		if (GlobalMembersEval.undefined)
		{
			GlobalMembersBf_test.int_error(tkn, "undefined value");
		}
		return (valptr);
	}

	/* Used by plot2d/plot3d/fit:
	 * Parse an expression that may return a string or may return a constant or may
	 * be a dummy function using dummy variables x, y, ...
	 * If any dummy variables are present, set (*atptr) to point to an action table
	 * corresponding to the parsed expression, and return NULL.
	 * Otherwise evaluate the expression and return a string if there is one.
	 * The return value "str" and "*atptr" both point to locally-managed memory,
	 * which must not be freed by the caller!
	 */
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static String string_or_express_str = null;
	public static String string_or_express(at_type[] atptr)
	{
		int i;
		boolean has_dummies;

		//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
		//	static sbyte* str = DefineConstants.NULL;
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(string_or_express_str);
		string_or_express_str = null;

		if (GlobalMembersCommand.c_token >= GlobalMembersCommand.num_tokens || GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ";") != 0)
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "expression expected");

		if (GlobalMembersUtil.isstring(GlobalMembersCommand.c_token) != 0)
		{
			if (atptr != null)
				atptr = null;
			string_or_express_str = GlobalMembersUtil.try_to_get_string();
			return string_or_express_str;
		}

		/* parse expression */
		GlobalMembersParse.temp_at();

		/* check if any dummy variables are used */
		has_dummies = false;
		for (i = 0; i < at.a_count; i++)
		{
			operators op_index = at.actions[i].index;
			if (op_index == operators.PUSHD1 || op_index == operators.PUSHD2 || op_index == operators.PUSHD)
			{
				has_dummies = true;
				break;
			}
		}

		if (!has_dummies)
		{
			/* no dummy variables: evaluate expression */
			value val = new value();

			GlobalMembersEval.evaluate_at(at, val);
			if (!GlobalMembersEval.undefined && val.type == DATA_TYPES.STRING)
				string_or_express_str = val.v.string_val;
		}

		/* prepare return */
		if (atptr != null)
			atptr = at;
		return string_or_express_str;
	}

	/* build an action table and return its pointer, but keep a pointer in at
	 * so that we can free it later if the caller hasn't taken over management
	 * of this table.
	 */

	public static at_type temp_at()
	{
		if (at != null)
			GlobalMembersEval.free_at(at);

		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		at = (GlobalMembersMouse.struct at_type *) GlobalMembersAlloc.gp_alloc(sizeof(GlobalMembersMouse.struct at_type), "action table");

		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(at, 0, sizeof(at)); // reset action table !!!
		at_size = DefineConstants.MAX_AT_LEN;

		parse_recursion_level = 0;
		GlobalMembersParse.parse_expression();
		return (at);
	}

	/* build an action table, put it in dynamic memory, and return its pointer */

	public static at_type perm_at()
	{
		at_type at_ptr;
		int len;

		GlobalMembersParse.temp_at();
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		len = sizeof(GlobalMembersMouse.struct at_type) + (at.a_count - DefineConstants.MAX_AT_LEN) * sizeof(GlobalMembersMouse.struct at_entry);
		at_ptr = (GlobalMembersMouse.struct at_type *) GlobalMembersAlloc.gp_realloc(at, len, "perm_at");
		at = null; // invalidate at pointer
		return (at_ptr);
	}

	/* find or add value and return pointer */
	public static udvt_entry add_udv(int t_num)
	{
		String varname = new String(new char[DefineConstants.MAX_ID_LEN + 1]);
		GlobalMembersUtil.copy_str(varname, t_num, DefineConstants.MAX_ID_LEN);
		return GlobalMembersEval.add_udv_by_name(varname);
	}

	/* find or add function at index <t_num>, and return pointer */
	public static udft_entry add_udf(int t_num)
	{
		udft_entry[] udf_ptr = GlobalMembersEval.first_udf;

		int i;
		while (udf_ptr != null)
		{
			if (GlobalMembersUtil.equals(t_num, (udf_ptr).udf_name) != 0)
				return (udf_ptr);
			udf_ptr = &((udf_ptr).next_udf);
		}

		/* get here => not found. udf_ptr points at first_udf or
		 * next_udf field of last udf
		 */

		if (GlobalMembersParse.is_builtin_function(t_num) != 0)
			GlobalMembersUtil.int_warn(t_num, "Warning : udf shadowed by built-in function of the same name");

		/* create and return a new udf slot */

		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		udf_ptr = (GlobalMembersMouse.struct udft_entry *) GlobalMembersAlloc.gp_alloc(sizeof(GlobalMembersMouse.struct udft_entry), "function");
		udf_ptr.next_udf = (GlobalMembersMouse.struct udft_entry *) DefineConstants.NULL;
		udf_ptr.definition = DefineConstants.NULL;
		udf_ptr.at = DefineConstants.NULL;
		udf_ptr.udf_name = GlobalMembersAlloc.gp_alloc(GlobalMembersUtil.token_len(t_num) + 1, "user func");
		GlobalMembersUtil.copy_str((udf_ptr).udf_name, t_num, GlobalMembersUtil.token_len(t_num) + 1);
		for (i = 0; i < DefineConstants.MAX_NUM_VAR; i++)
			() GlobalMembersEval.Ginteger(((udf_ptr).dummy_values[i]), 0);
		return (udf_ptr);
	}
	//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void cleanup_udvlist();

	/* Look for an iterate-over-plot construct, of the form
	 *    {s}plot  for [<var> = <start> : <end> { : <increment>}] ...
	 */

	/* These are used by the iterate-over-plot code */
	public static void check_for_iteration()
	{
		String errormsg = "Expecting iterator \tfor [<var> = <start> : <end>]\n\t\t\tor\tfor [<var> in \"string of words\"]";

		iteration_udv = null;
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(iteration_string);
		iteration_string = null;
		iteration_increment = 1;
		iteration = 0;

		if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "for") == 0)
			return;

		GlobalMembersCommand.c_token++;
		if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token++, "[") == 0 || GlobalMembersUtil.isletter(GlobalMembersCommand.c_token) == 0)
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token - 1, errormsg);
		iteration_udv = GlobalMembersParse.add_udv(GlobalMembersCommand.c_token++);

		if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "=") != 0)
		{
			GlobalMembersCommand.c_token++;
			iteration_start = GlobalMembersParse.int_expression();
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token++, ":") == 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token - 1, errormsg);
			iteration_end = GlobalMembersParse.int_expression();
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ":") != 0)
			{
				GlobalMembersCommand.c_token++;
				iteration_increment = GlobalMembersParse.int_expression();
			}
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token++, "]") == 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token - 1, errormsg);
			if (iteration_udv.udv_undef == false)
				GlobalMembersEval.gpfree_string(iteration_udv.udv_value);
			GlobalMembersEval.Ginteger((iteration_udv.udv_value), iteration_start);
			iteration_udv.udv_undef = false;
		}

		else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token++, "in") != 0)
		{
			iteration_string = GlobalMembersUtil.try_to_get_string();
			if (iteration_string == null)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token - 1, errormsg);
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token++, "]") == 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token - 1, errormsg);
			iteration_start = 1;
			iteration_end = GlobalMembersEval.gp_words(iteration_string);
			if (iteration_udv.udv_undef == false)
				GlobalMembersEval.gpfree_string(iteration_udv.udv_value);
			GlobalMembersEval.Gstring((iteration_udv.udv_value), GlobalMembersEval.gp_word(iteration_string, 1));
			iteration_udv.udv_undef = false;
		}

		else // Neither [i=B:E] or [s in "foo"]
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token - 1, errormsg);

		iteration_current = iteration_start;

	}

	/* Set up next iteration.
	 * Return TRUE if there is one, FALSE if we're done
	 */
	public static boolean next_iteration()
	{
		if (iteration_udv == null)
		{
			iteration = 0;
			return false;
		}
		iteration++;
		iteration_current += iteration_increment;
		if (iteration_string != null)
		{
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(iteration_udv.udv_value.v.string_val);
			iteration_udv.udv_value.v.string_val = GlobalMembersEval.gp_word(iteration_string, iteration_current);
		}
		else
			iteration_udv.udv_value.v.int_val = iteration_current;
		return iteration_increment && ((iteration_end - iteration_current) * iteration_increment >= 0); // no infinite loops!
	}
	public static boolean empty_iteration()
	{
		if (iteration_udv != null && ((iteration_end - iteration_start) * iteration_increment < 0))
			return true;
		else
			return false;
	}

	/* Some commands, e.g. set xtics, need to know if this is the first time
	 * or a subsequent time through the iteration.  Export a counter.
	 */
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int iteration;



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
	///#define H_FOUND 0
	///#define H_NOTFOUND 1
	///#define H_ERROR (-1)
	///#define NO_CARET (-1)
	///#define DATAFILE (-2)
	///#if 0 // UNUSED
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define isstringvalue(c_token) (isstring(c_token) || type_udv(c_token)==STRING)
	///#if defined(VA_START) && defined(STDC_HEADERS)
	///#else
	///#endif

	/* protection mechanism for parsing string followed by + or - sign */
	public static int parse_recursion_level;
	public static boolean string_result_only = false;

	/* Exported globals: the current 'dummy' variable names */
	public static byte[][] c_dummy_var = new byte[DefineConstants.MAX_NUM_VAR][DefineConstants.MAX_ID_LEN + 1];
	public static String[] set_dummy_var = {"x", "y"};

	/* This is used by plot_option_using() */
	public static int at_highest_column_used = -1;

	/* These are used by the iterate-over-plot code */
	public static udvt_entry iteration_udv = null;
	public static int iteration_start = 0;
	public static int iteration_end = 0;
	public static int iteration_increment = 1;
	public static int iteration_current = 0;
	public static String iteration_string = null;
	public static int iteration = 0;

	/* Internal prototypes: */

	public static void convert(value val_ptr, int t_num)
	{
		val_ptr = GlobalMembersCommand.token[t_num].l_val;
	}
	public static void extend_at()
	{
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		int newsize = sizeof(GlobalMembersMouse.struct at_type) + at_size * sizeof(GlobalMembersMouse.struct at_entry);

		at = GlobalMembersAlloc.gp_realloc(at, newsize, "extend_at");
		at_size += DefineConstants.MAX_AT_LEN;
		GlobalMembersFit.a((stderr, "Extending at size to %d\n", at_size));
	}

	/* Add function number <sf_index> to the current action table */
	public static argument add_action(operators sf_index)
	{
		if (at.a_count >= at_size)
		{
			GlobalMembersParse.extend_at();
		}
		at.actions[at.a_count].index = sf_index;
		return ((at.actions[at.a_count++].arg));
	}

	/* For external calls to parse_expressions() 
	 * parse_recursion_level is expected to be 0 */
	public static void parse_expression()
	{ // full expressions

		if (GlobalMembersParse.parse_assignment_expression() != 0)
			return;

		parse_recursion_level++;
		GlobalMembersParse.accept_logical_OR_expression();
		GlobalMembersParse.parse_conditional_expression();
		parse_recursion_level--;
	}
	public static void accept_logical_OR_expression()
	{ // ? : expressions
		GlobalMembersParse.accept_logical_AND_expression();
		GlobalMembersParse.parse_logical_OR_expression();
	}
	public static void accept_logical_AND_expression()
	{
		GlobalMembersParse.accept_inclusive_OR_expression();
		GlobalMembersParse.parse_logical_AND_expression();
	}
	public static void accept_inclusive_OR_expression()
	{
		GlobalMembersParse.accept_exclusive_OR_expression();
		GlobalMembersParse.parse_inclusive_OR_expression();
	}
	public static void accept_exclusive_OR_expression()
	{
		GlobalMembersParse.accept_AND_expression();
		GlobalMembersParse.parse_exclusive_OR_expression();
	}
	public static void accept_AND_expression()
	{
		GlobalMembersParse.accept_equality_expression();
		GlobalMembersParse.parse_AND_expression();
	}
	public static void accept_equality_expression()
	{
		GlobalMembersParse.accept_relational_expression();
		GlobalMembersParse.parse_equality_expression();
	}
	public static void accept_relational_expression()
	{
		GlobalMembersParse.accept_additive_expression();
		GlobalMembersParse.parse_relational_expression();
	}
	public static void accept_additive_expression()
	{
		GlobalMembersParse.accept_multiplicative_expression();
		GlobalMembersParse.parse_additive_expression();
	}
	public static void accept_multiplicative_expression()
	{
		GlobalMembersParse.parse_unary_expression(); // - things
		GlobalMembersParse.parse_multiplicative_expression(); // * / %
	}

	/* add action table entries for primary expressions, i.e. either a
	 * parenthesized expression, a variable names, a numeric constant, a
	 * function evaluation, a power operator or postfix '!' (factorial)
	 * expression */
	public static void parse_primary_expression()
	{
		if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "(") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.parse_expression();

			/* Expressions may be separated by a comma */
			while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.add_action(operators.POP);
				GlobalMembersParse.parse_expression();
			}

			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ")") == 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "')' expected");
			GlobalMembersCommand.c_token++;
		}
		else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "$") != 0)
		{
			value a = new value();

			if (GlobalMembersUtil.isanumber(++GlobalMembersCommand.c_token) == 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Column number expected");
			GlobalMembersParse.convert(a, GlobalMembersCommand.c_token++);
			if (a.type != DATA_TYPES.INTGR || a.v.int_val < 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Positive integer expected");
			if (at_highest_column_used < a.v.int_val)
				at_highest_column_used = a.v.int_val;
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
			//ORIGINAL LINE: add_action(DOLLARS)->v_arg = a;
			GlobalMembersParse.add_action(operators.DOLLARS).v_arg.copyFrom(a);
		}
		else if (GlobalMembersUtil.isanumber(GlobalMembersCommand.c_token) != 0)
		{
			/* work around HP 9000S/300 HP-UX 9.10 cc limitation ... */
			/* HBB 20010724: use this code for all platforms, then */
			argument foo = GlobalMembersParse.add_action(operators.PUSHC);

			GlobalMembersParse.convert((foo.v_arg), GlobalMembersCommand.c_token);
			GlobalMembersCommand.c_token++;
		}
		else if (GlobalMembersUtil.isletter(GlobalMembersCommand.c_token) != 0)
		{
			/* Found an identifier --- check whether its a function or a
			 * variable by looking for the parentheses of a function
			 * argument list */
			if ((GlobalMembersCommand.c_token + 1 < GlobalMembersCommand.num_tokens) && GlobalMembersUtil.equals(GlobalMembersCommand.c_token + 1, "(") != 0)
			{
				operators whichfunc = GlobalMembersParse.is_builtin_function(GlobalMembersCommand.c_token);
				value num_params = new value();
				num_params.type = DATA_TYPES.INTGR;

				if (((int)whichfunc) != 0)
				{
					///#ifdef BACKWARDS_COMPATIBLE
					// /* Deprecated syntax:   if (defined(foo)) ...  */
					// /* New syntax:          if (exists("foo")) ... */
					//		if (strcmp(ft[whichfunc].f_name,"defined")==0) {
					//		    struct udvt_entry *udv = add_udv(c_token+2);
					//		    union argument *foo = add_action(PUSHC);
					//		    foo->v_arg.type = INTGR;
					//		    foo->v_arg.v.int_val = udv->udv_undef ? 0 : 1;
					//		    c_token += 4;  // skip past "defined ( <foo> ) "
					//		    return;
					//		}
					///#endif
					GlobalMembersCommand.c_token += 2; // skip fnc name and '('
					GlobalMembersParse.parse_expression(); // parse fnc argument
					num_params.v.int_val = 1;
					while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0)
					{
						GlobalMembersCommand.c_token++;
						num_params.v.int_val++;
						GlobalMembersParse.parse_expression();
					}

					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ")") == 0)
						GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "')' expected");
					GlobalMembersCommand.c_token++;

					/* So far sprintf is the only built-in function */
					/* with a variable number of arguments.         */
					if (!strcmp(GlobalMembersEval.ft[whichfunc.getValue()].f_name,"sprintf"))
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
						//ORIGINAL LINE: add_action(PUSHC)->v_arg = num_params;
						GlobalMembersParse.add_action(operators.PUSHC).v_arg.copyFrom(num_params);
					/* And "words(s)" is implemented as "word(s,-1)" */
					if (!strcmp(GlobalMembersEval.ft[whichfunc.getValue()].f_name,"words"))
					{
						num_params.v.int_val = -1;
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
						//ORIGINAL LINE: add_action(PUSHC)->v_arg = num_params;
						GlobalMembersParse.add_action(operators.PUSHC).v_arg.copyFrom(num_params);
					}

					GlobalMembersParse.add_action(whichfunc);

				}
				else
				{
					/* it's a call to a user-defined function */
					operators call_type =  operators.CALL.getValue();
					int tok = GlobalMembersCommand.c_token;

					GlobalMembersCommand.c_token += 2; // skip func name and '('
					GlobalMembersParse.parse_expression();
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0) // more than 1 argument?
					{
						num_params.v.int_val = 1;
						while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0)
						{
							num_params.v.int_val += 1;
							GlobalMembersCommand.c_token += 1;
							GlobalMembersParse.parse_expression();
						}
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
						//ORIGINAL LINE: add_action(PUSHC)->v_arg = num_params;
						GlobalMembersParse.add_action(operators.PUSHC).v_arg.copyFrom(num_params);
						call_type =  operators.CALLN.getValue();
					}
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ")") == 0)
						GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "')' expected");
					GlobalMembersCommand.c_token++;
					GlobalMembersParse.add_action(call_type).udf_arg = GlobalMembersParse.add_udf(tok);
				}
				/* dummy_func==NULL is a flag to say no dummy variables active */
			}
			else if (GlobalMembersCommand.dummy_func != null)
			{
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, c_dummy_var[0]) != 0)
				{
					GlobalMembersCommand.c_token++;
					GlobalMembersParse.add_action(operators.PUSHD1).udf_arg = GlobalMembersCommand.dummy_func;
				}
				else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, c_dummy_var[1]) != 0)
				{
					GlobalMembersCommand.c_token++;
					GlobalMembersParse.add_action(operators.PUSHD2).udf_arg = GlobalMembersCommand.dummy_func;
				}
				else
				{
					int i;
					int param = 0;

					for (i = 2; i < DefineConstants.MAX_NUM_VAR; i++)
					{
						if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, c_dummy_var[i]) != 0)
						{
							value num_params = new value();
							num_params.type = DATA_TYPES.INTGR;
							num_params.v.int_val = i;
							param = 1;
							GlobalMembersCommand.c_token++;
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
							//ORIGINAL LINE: add_action(PUSHC)->v_arg = num_params;
							GlobalMembersParse.add_action(operators.PUSHC).v_arg.copyFrom(num_params);
							GlobalMembersParse.add_action(operators.PUSHD).udf_arg = GlobalMembersCommand.dummy_func;
							break;
						}
					}
					if (param == 0) // defined variable
					{
						GlobalMembersParse.add_action(operators.PUSH).udv_arg = GlobalMembersParse.add_udv(GlobalMembersCommand.c_token);
						GlobalMembersCommand.c_token++;
					}
				}
				/* its a variable, with no dummies active - div */
			}
			else
			{
				GlobalMembersParse.add_action(operators.PUSH).udv_arg = GlobalMembersParse.add_udv(GlobalMembersCommand.c_token);
				GlobalMembersCommand.c_token++;
			}
		}
		/* end if letter */

		/* Maybe it's a string constant */
		else if (GlobalMembersUtil.isstring(GlobalMembersCommand.c_token) != 0)
		{
			argument foo = GlobalMembersParse.add_action(operators.PUSHC);
			foo.v_arg.type = DATA_TYPES.STRING;
			foo.v_arg.v.string_val = DefineConstants.NULL;
			/* this dynamically allocated string will be freed by free_at() */
			GlobalMembersUtil.m_quote_capture((foo.v_arg.v.string_val), GlobalMembersCommand.c_token, GlobalMembersCommand.c_token);
			GlobalMembersCommand.c_token++;
		}
		else
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "invalid expression ");

		/* add action code for ! (factorial) operator */
		while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "!") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.add_action(operators.FACTORIAL);
		}
		/* add action code for ** operator */
		if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "**") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.parse_unary_expression();
			GlobalMembersParse.add_action(operators.POWER);
		}

		/* Parse and add actions for range specifier applying to previous entity.
		 * Currently only used to generate substrings, but could also be used to
		 * extract vector slices.
		 */
		if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
		{
			/* handle '*' or empty start of range */
			if (GlobalMembersUtil.equals(++GlobalMembersCommand.c_token, "*") != 0 || GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ":") != 0)
			{
				argument empty = GlobalMembersParse.add_action(operators.PUSHC);
				empty.v_arg.type = DATA_TYPES.INTGR;
				empty.v_arg.v.int_val = 1;
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "*") != 0)
					GlobalMembersCommand.c_token++;
			}
			else
				GlobalMembersParse.parse_expression();
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ":") == 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "':' expected");
			/* handle '*' or empty end of range */
			if (GlobalMembersUtil.equals(++GlobalMembersCommand.c_token, "*") != 0 || GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") != 0)
			{
				argument empty = GlobalMembersParse.add_action(operators.PUSHC);
				empty.v_arg.type = DATA_TYPES.INTGR;
				empty.v_arg.v.int_val = 65535; // should be MAXINT
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "*") != 0)
					GlobalMembersCommand.c_token++;
			}
			else
				GlobalMembersParse.parse_expression();
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.add_action(operators.RANGE);
		}
	}

	/* HBB 20010309: Here and below: can't store pointers into the middle
	 * of at->actions[]. That array may be realloc()ed by add_action() or
	 * express() calls!. Access via index savepc1/savepc2, instead. */

	public static void parse_conditional_expression()
	{
		/* create action code for ? : expressions */

		if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "?") != 0)
		{
			int savepc1;
			int savepc2;

			/* Fake same recursion level for alternatives
			 *   set xlabel a>b ? 'foo' : 'bar' -1, 1
			 * FIXME: This won't work:
			 *   set xlabel a-b>c ? 'foo' : 'bar'  offset -1, 1
			 */
			parse_recursion_level--;

			GlobalMembersCommand.c_token++;
			savepc1 = at.a_count;
			GlobalMembersParse.add_action(operators.JTERN);
			GlobalMembersParse.parse_expression();
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ":") == 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "expecting ':'");

			GlobalMembersCommand.c_token++;
			savepc2 = at.a_count;
			GlobalMembersParse.add_action(operators.JUMP);
			at.actions[savepc1].arg.j_arg = at.a_count - savepc1;
			GlobalMembersParse.parse_expression();
			at.actions[savepc2].arg.j_arg = at.a_count - savepc2;
			parse_recursion_level++;
		}
	}
	public static void parse_logical_OR_expression()
	{
		/* create action codes for || operator */

		while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "||") != 0)
		{
			int savepc;

			GlobalMembersCommand.c_token++;
			savepc = at.a_count;
			GlobalMembersParse.add_action(operators.JUMPNZ); // short-circuit if already TRUE
			GlobalMembersParse.accept_logical_AND_expression();
			/* offset for jump */
			at.actions[savepc].arg.j_arg = at.a_count - savepc;
			GlobalMembersParse.add_action(operators.BOOLE);
		}
	}
	public static void parse_logical_AND_expression()
	{
		/* create action code for && operator */

		while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "&&") != 0)
		{
			int savepc;

			GlobalMembersCommand.c_token++;
			savepc = at.a_count;
			GlobalMembersParse.add_action(operators.JUMPZ); // short-circuit if already FALSE
			GlobalMembersParse.accept_inclusive_OR_expression();
			at.actions[savepc].arg.j_arg = at.a_count - savepc; // offset for jump
			GlobalMembersParse.add_action(operators.BOOLE);
		}
	}
	public static void parse_inclusive_OR_expression()
	{
		/* create action code for | operator */

		while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "|") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.accept_exclusive_OR_expression();
			GlobalMembersParse.add_action(operators.BOR);
		}
	}
	public static void parse_exclusive_OR_expression()
	{
		/* create action code for ^ operator */

		while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "^") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.accept_AND_expression();
			GlobalMembersParse.add_action(operators.XOR);
		}
	}
	public static void parse_AND_expression()
	{
		/* create action code for & operator */

		while (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "&") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.accept_equality_expression();
			GlobalMembersParse.add_action(operators.BAND);
		}
	}
	public static void parse_equality_expression()
	{
		/* create action codes for == and != numeric operators
		 * eq and ne string operators */

		while (true)
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "==") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_relational_expression();
				GlobalMembersParse.add_action(operators.EQ);
			}
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "!=") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_relational_expression();
				GlobalMembersParse.add_action(operators.NE);
			}
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "eq") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_relational_expression();
				GlobalMembersParse.add_action(operators.EQS);
			}
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "ne") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_relational_expression();
				GlobalMembersParse.add_action(operators.NES);
			}
			else
				break;
		}
	}
	public static void parse_relational_expression()
	{
		/* create action code for < > >= or <=
		 * operators */

		while (true)
		{
			/* I hate "else if" statements */
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ">") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_additive_expression();
				GlobalMembersParse.add_action(operators.GT);
			}
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "<") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_additive_expression();
				GlobalMembersParse.add_action(operators.LT);
			}
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ">=") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_additive_expression();
				GlobalMembersParse.add_action(operators.GE);
			}
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "<=") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_additive_expression();
				GlobalMembersParse.add_action(operators.LE);
			}
			else
				break;
		}

	}
	public static void parse_additive_expression()
	{
		/* create action codes for +, - and . operators */
		while (true)
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ".") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_multiplicative_expression();
				GlobalMembersParse.add_action(operators.CONCATENATE);
				/* If only string results are wanted
				 * do not accept '-' or '+' at the top level. */
			}
			else if (string_result_only && parse_recursion_level == 1)
				break;
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "+") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_multiplicative_expression();
				GlobalMembersParse.add_action(operators.PLUS);
			}
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "-") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.accept_multiplicative_expression();
				GlobalMembersParse.add_action(operators.MINUS);
			}
			else
				break;
		}
	}
	public static void parse_multiplicative_expression()
	{
		/* add action code for * / and % operators */

		while (true)
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "*") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.parse_unary_expression();
				GlobalMembersParse.add_action(operators.MULT);
			}
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "/") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.parse_unary_expression();
				GlobalMembersParse.add_action(operators.DIV);
			}
			else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "%") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.parse_unary_expression();
				GlobalMembersParse.add_action(operators.MOD);
			}
			else
				break;
		}
	}
	public static void parse_unary_expression()
	{
		/* add code for unary operators */

		if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "!") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.parse_unary_expression();
			GlobalMembersParse.add_action(operators.LNOT);
		}
		else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "~") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.parse_unary_expression();
			GlobalMembersParse.add_action(operators.BNOT);
		}
		else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "-") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.parse_unary_expression();
			GlobalMembersParse.add_action(operators.UMINUS);
		} // unary + is no-op
		else if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "+") != 0)
		{
			GlobalMembersCommand.c_token++;
			GlobalMembersParse.parse_unary_expression();
		}
		else
			GlobalMembersParse.parse_primary_expression();
	}
	public static int parse_assignment_expression()
	{
		/* Check for assignment operator */
		if (GlobalMembersUtil.isletter(GlobalMembersCommand.c_token) != 0 && (GlobalMembersCommand.c_token + 1 < GlobalMembersCommand.num_tokens) && GlobalMembersUtil.equals(GlobalMembersCommand.c_token + 1, "=") != 0)
		{
			/* push the variable name */
			argument foo = GlobalMembersParse.add_action(operators.PUSHC);
			String varname = null;
			RefObject<String[]> tempRef_varname = new RefObject<String[]>(varname);
			GlobalMembersUtil.m_capture(tempRef_varname, GlobalMembersCommand.c_token, GlobalMembersCommand.c_token);
			varname = tempRef_varname.argvalue;
			foo.v_arg.type = DATA_TYPES.STRING;
			foo.v_arg.v.string_val = varname;
			GlobalMembersCommand.c_token += 2;
			/* and the expression whose value it will get */
			GlobalMembersParse.parse_expression();
			/* and the actual assignment operation */
			GlobalMembersParse.add_action(operators.ASSIGN);
			return 1;
		}
		return 0;
	}

	/* return standard function index or 0 */
	public static int is_builtin_function(int t_num)
	{
		int i;

		for (i =  operators.SF_START.getValue(); !GlobalMembersEval.ft[i].f_name.equals(DefineConstants.NULL); i++)
		{
			if (GlobalMembersUtil.equals(t_num, GlobalMembersEval.ft[i].f_name) != 0)
				return (i);
		}
		return (0);
	}

	/* Internal variables: */

	public static at_type at = null;
	public static int at_size = 0;
}