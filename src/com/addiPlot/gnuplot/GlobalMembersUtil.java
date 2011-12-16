package com.addiPlot.gnuplot;

public class GlobalMembersUtil
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
		return GlobalMembersAlloc.RCSid("$Id: util.c,v 1.84.2.2 2010/03/07 00:50:12 sfeam Exp $");
	}
	///#endif

	/* GNUPLOT - util.c */

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
	 * $Id: util.h,v 1.31 2008/03/18 00:16:33 sfeam Exp $
	 */

	/* GNUPLOT - util.h */

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

	/* special token number meaning 'do not draw the "caret"', for
	 * int_error and friends: */
	///#define NO_CARET (-1)

	/* token number meaning 'the error was in the datafile, not the
	   command line' */
	///#define DATAFILE (-2)

	/* TRUE if command just typed; becomes FALSE whenever we
	 * send some other output to screen.  If FALSE, the command line
	 * will be echoed to the screen before the ^ error message.
	 */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean screen_ok;

	/* decimal sign */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte *decimalsign;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte *numeric_locale; // LC_NUMERIC
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte *current_locale; // LC_TIME

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern String current_prompt; // needed by is_error() and friends

///#if 0 // UNUSED
//// /*
////  * chr_in_str() compares the characters in the string of token number t_num
////  * with c, and returns TRUE if a match was found.
////  */
////int
////chr_in_str(int t_num, int c)
////{
////    int i;
////
////    if (!token[t_num].is_token)
////	return (FALSE);		// must be a value--can't be equal 
////    for (i = 0; i < token[t_num].length; i++) {
////	if (input_line[token[t_num].start_index + i] == c)
////	    return (TRUE);
////    }
////    return FALSE;
////}
///#endif

/*
 * equals() compares string value of token number t_num with str[], and
 *   returns TRUE if they are identical.
 */

	/* Functions exported by util.c: */

	/* Command parsing helpers: */
	///#if 0 // UNUSED
	////int chr_in_str __PROTO((int, int));
	///#endif
	public static int equals(int t_num, String str)
	{
		int i;

		if (!GlobalMembersCommand.token[t_num].is_token)
		return (false); // must be a value--can't be equal
		for (i = 0; i < GlobalMembersCommand.token[t_num].length; i++)
		{
		if (GlobalMembersCommand.gp_input_line.charAt(GlobalMembersCommand.token[t_num].start_index + i) != str.charAt(i))
			return (false);
		}
		/* now return TRUE if at end of str[], FALSE if not */
		return (str.charAt(i) == DefineConstants.NUL);
	}

/*
 * almost_equals() compares string value of token number t_num with str[], and
 *   returns TRUE if they are identical up to the first $ in str[].
 */
	public static int almost_equals(int t_num, String str)
	{
		int i;
		int after = 0;
		int start = GlobalMembersCommand.token[t_num].start_index;
		int length = GlobalMembersCommand.token[t_num].length;

		if (str == null)
		return false;
		if (!GlobalMembersCommand.token[t_num].is_token)
		return false; // must be a value--can't be equal
		for (i = 0; i < length + after; i++)
		{
		if (str.charAt(i) != GlobalMembersCommand.gp_input_line.charAt(start + i))
		{
			if (str.charAt(i) != '$')
			return (false);
			else
			{
			after = 1;
			start--; // back up token ptr
			}
		}
		}

		/* i now beyond end of token string */

		return (after != 0 || str.charAt(i) == '$' || str.charAt(i) == DefineConstants.NUL);
	}
	public static int isstring(int t_num)
	{

		return (GlobalMembersCommand.token[t_num].is_token && (GlobalMembersCommand.gp_input_line.charAt(GlobalMembersCommand.token[t_num].start_index) == '\'' || GlobalMembersCommand.gp_input_line.charAt(GlobalMembersCommand.token[t_num].start_index) == '"'));
	}
	public static int isanumber(int t_num)
	{
		return (!GlobalMembersCommand.token[t_num].is_token);
	}
	public static int isletter(int t_num)
	{
		return (GlobalMembersCommand.token[t_num].is_token && ((Character.isLetter((byte) GlobalMembersCommand.gp_input_line.charAt(GlobalMembersCommand.token[t_num].start_index))) || (GlobalMembersCommand.gp_input_line.charAt(GlobalMembersCommand.token[t_num].start_index) == '_')));
	}

/*
 * is_definition() returns TRUE if the next tokens are of the form
 *   identifier =
 *              -or-
 *   identifier ( identifer {,identifier} ) =
 */
	public static int is_definition(int t_num)
	{
		/* variable? */
		if (GlobalMembersUtil.isletter(t_num) != 0 && GlobalMembersUtil.equals(t_num + 1, "=") != 0)
		return 1;

		/* function? */
		/* look for dummy variables */
		if (GlobalMembersUtil.isletter(t_num) != 0 && GlobalMembersUtil.equals(t_num + 1, "(") != 0 && GlobalMembersUtil.isletter(t_num + 2) != 0)
		{
		t_num += 3; // point past first dummy
		while (GlobalMembersUtil.equals(t_num, ",") != 0)
		{
			if (GlobalMembersUtil.isletter(++t_num) == 0)
			return 0;
			t_num += 1;
		}
		return (GlobalMembersUtil.equals(t_num, ")") != 0 && GlobalMembersUtil.equals(t_num + 1, "=") != 0);
		}
		/* neither */
		return 0;
	}

/*
 * copy_str() copies the string in token number t_num into str, appending
 *   a null.  No more than max chars are copied (including \0).
 */
	public static void copy_str(String str, int t_num, int max)
	{
		int i = 0;
		int start = GlobalMembersCommand.token[t_num].start_index;
		int count = GlobalMembersCommand.token[t_num].length;

		if (count >= max)
		{
		count = max - 1;
		GlobalMembersFit.a((stderr, "str buffer overflow in copy_str"));
		}

		do
		{
		str = tangible.StringFunctions.changeCharacter(str, i++, GlobalMembersCommand.gp_input_line.charAt(start++));
		} while (i != count);
		str = tangible.StringFunctions.changeCharacter(str, i, DefineConstants.NUL);

	}

/* length of token string */
	public static int token_len(int t_num)
	{
		return (int)(GlobalMembersCommand.token[t_num].length);
	}

/*
 * quote_str() does the same thing as copy_str, except it ignores the
 *   quotes at both ends.  This seems redundant, but is done for
 *   efficency.
 */
	public static void quote_str(String str, int t_num, int max)
	{
		int i = 0;
		int start = GlobalMembersCommand.token[t_num].start_index + 1;
		int count;

		if ((count = GlobalMembersCommand.token[t_num].length - 2) >= max)
		{
		count = max - 1;
		GlobalMembersFit.a((stderr, "str buffer overflow in quote_str"));
		}
		if (count > 0)
		{
		do
		{
			str = tangible.StringFunctions.changeCharacter(str, i++, GlobalMembersCommand.gp_input_line.charAt(start++));
		} while (i != count);
		}
		str = tangible.StringFunctions.changeCharacter(str, i, DefineConstants.NUL);
		/* convert \t and \nnn (octal) to char if in double quotes */
		if (GlobalMembersCommand.gp_input_line.charAt(GlobalMembersCommand.token[t_num].start_index) == '"')
		GlobalMembersUtil.parse_esc(str);
		else
			GlobalMembersUtil.parse_sq(str);
	}

/*
 * capture() copies into str[] the part of gp_input_line[] which lies between
 * the begining of token[start] and end of token[end].
 */
	public static void capture(String str, int start, int end, int max)
	{
		int i;
		int e;

		e = GlobalMembersCommand.token[end].start_index + GlobalMembersCommand.token[end].length;
		if (e - GlobalMembersCommand.token[start].start_index >= max)
		{
		e = GlobalMembersCommand.token[start].start_index + max - 1;
		GlobalMembersFit.a((stderr, "str buffer overflow in capture"));
		}
		for (i = GlobalMembersCommand.token[start].start_index; i < e && GlobalMembersCommand.gp_input_line.charAt(i) != DefineConstants.NUL; i++)
		str++= GlobalMembersCommand.gp_input_line.charAt(i);
		str = DefineConstants.NUL;
	}

/*
 * m_capture() is similar to capture(), but it mallocs storage for the
 * string.
 */
	public static void m_capture(tangible.RefObject<String[]> str, int start, int end)
	{
		int i;
		int e;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * s;

		e = GlobalMembersCommand.token[end].start_index + GlobalMembersCommand.token[end].length;
		str.argvalue = GlobalMembersAlloc.gp_realloc(str.argvalue, (e - GlobalMembersCommand.token[start].start_index + 1), "string");
		s = str.argvalue;
		for (i = GlobalMembersCommand.token[start].start_index; i < e && GlobalMembersCommand.gp_input_line.charAt(i) != DefineConstants.NUL; i++)
		*s++= GlobalMembersCommand.gp_input_line.charAt(i);
		*s = DefineConstants.NUL;
	}

/*
 * m_quote_capture() is similar to m_capture(), but it removes
 * quotes from either end of the string.
 */
	public static void m_quote_capture(tangible.RefObject<String[]> str, int start, int end)
	{
		int i;
		int e;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * s;

		e = GlobalMembersCommand.token[end].start_index + GlobalMembersCommand.token[end].length - 1;
		str.argvalue = GlobalMembersAlloc.gp_realloc(str.argvalue, (e - GlobalMembersCommand.token[start].start_index + 1), "string");
		s = str.argvalue;
		for (i = GlobalMembersCommand.token[start].start_index + 1; i < e && GlobalMembersCommand.gp_input_line.charAt(i) != DefineConstants.NUL; i++)
		*s++= GlobalMembersCommand.gp_input_line.charAt(i);
		*s = DefineConstants.NUL;

		if (GlobalMembersCommand.gp_input_line.charAt(GlobalMembersCommand.token[start].start_index) == '"')
		GlobalMembersUtil.parse_esc(str.argvalue);
		else
			GlobalMembersUtil.parse_sq(str.argvalue);

	}

/*
 * Wrapper for isstring + m_quote_capture that can be used with
 * or without GP_STRING_VARS enabled.
 * EAM Aug 2004
 */
	public static String try_to_get_string()
	{
		String newstring = DefineConstants.NULL;
		value a = new value();
		int save_token = GlobalMembersCommand.c_token;

		if (GlobalMembersCommand.c_token >= GlobalMembersCommand.num_tokens || GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ";") != 0)
		return DefineConstants.NULL;
		GlobalMembersParse.const_string_express(a);
		if (a.type == DATA_TYPES.STRING)
		newstring = a.v.string_val;
		else
		GlobalMembersCommand.c_token = save_token;

		return newstring;
	}
	public static void parse_esc(String instr)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * s = instr;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * t = instr;

		/* the string will always get shorter, so we can do the
		 * conversion in situ
		 */

		while (*s != DefineConstants.NUL)
		{
		if (*s == '\\')
		{
			s++;
			if (*s == '\\')
			{
			*t++= '\\';
			s++;
			}
			else if (*s == 'n')
			{
			*t++= '\n';
			s++;
			}
			else if (*s == 'r')
			{
			*t++= '\r';
			s++;
			}
			else if (*s == 't')
			{
			*t++= '\t';
			s++;
			}
			else if (*s == '\"')
			{
			*t++= '\"';
			s++;
			}
			else if (*s >= '0' && *s <= '7')
			{
			int i;
			int n;
			byte octal = (*s == '0' ? "%4o%n" : "%3o%n");
			if (sscanf(s, octal, i, n) > 0)
			{
				*t++= i;
				s += n;
			}
			else
			{
				/* int_error("illegal octal number ", c_token); */
				*t++= '\\';
				*t++= *s++;
			}
			}
		}
		else if (GlobalMembersDatafile.df_separator != 0 && *s == '\"' && *(s + 1) == '\"')
		{
		/* EAM Mar 2003 - For parsing CSV strings with quoted quotes */
			*t++= *s++;
			s++;
		}
		else
		{
			*t++= *s++;
		}
		}
		*t = DefineConstants.NUL;
	}

/* Test for the existence of a variable without triggering errors.
 * Return values:
 *  0	variable does not exist or is not defined
 * >0	type of variable: INTGR, CMPLX, STRING
 */
	public static int type_udv(int t_num)
	{
		udvt_entry[] udv_ptr = GlobalMembersEval.first_udv;

		while (udv_ptr != null)
		{
		if (GlobalMembersUtil.equals(t_num, (udv_ptr).udv_name) != 0)
		{
			if ((udv_ptr).udv_undef)
			return 0;
			else
			return (udv_ptr).udv_value.type;
		}
		udv_ptr = &((udv_ptr).next_udv);
		}
		return 0;
	}

/*
 * Allocate a new string and initialize it by concatenating two
 * existing strings.
 */

	public static String gp_stradd(String a, String b)
	{
		byte * new() = GlobalMembersAlloc.gp_alloc(a.length() + b.length() + 1, "gp_stradd");
		new_Renamed = a;
		new_Renamed += b;
		return new_Renamed;
	}

/* Our own version of strdup()
 * Make copy of string into gp_alloc'd memory
 * As with all conforming str*() functions,
 * it is the caller's responsibility to pass
 * valid parameters!
 */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define isstringvalue(c_token) (isstring(c_token) || type_udv(c_token)==STRING)

	/* HBB 20010726: IMHO this one belongs into alloc.c: */
	public static String gp_strdup(String s)
	{
		String d;

		if (s == null)
		return DefineConstants.NULL;

	///#ifndef HAVE_STRDUP
	//    d = gp_alloc(strlen(s) + 1, "gp_strdup");
	//    if (d)
	//	memcpy (d, s, strlen(s) + 1);
	///#else
		d = s;
	///#endif
		return d;
	}
///#endif

/*{{{  gprintf */
/* extended s(n)printf */
/* HBB 20010121: added code to maintain consistency between mantissa
 * and exponent across sprintf() calls.  The problem: format string
 * '%t*10^%T' will display 9.99 as '10.0*10^0', but 10.01 as
 * '1.0*10^1'.  This causes problems for people using the %T part,
 * only, with logscaled axes, in combination with the occasional
 * round-off error. */

	/* HBB 20020405: moved this here, from axis.[ch] */
	public static void gprintf(String dest, int count, String format, double log10_base, double x)
	{
		String temp = new String(new char[DefineConstants.MAX_LINE_LEN + 1]);
		String t;
		boolean seen_mantissa = false; /* memorize if mantissa has been
	                                       output, already */
		int stored_power = 0; /* power that matches the mantissa
	                                   output earlier */
		boolean got_hash = false;

		() do {if (numeric_locale != null && strcmp(numeric_locale,"C")) setlocale(LC_NUMERIC,numeric_locale);} while (0)();

		for (;;)
		{
		/*{{{  copy to dest until % */
		while (!format.equals('%'))
			if (!(dest++= format++))
			{
			() do {if (numeric_locale != null && strcmp(numeric_locale,"C")) setlocale(LC_NUMERIC,"C");} while (0)();
			return; // end of format
			}
		/*}}} */

		/*{{{  check for %% */
		if (format.charAt(1) == '%')
		{
			dest++= '%';
			format += 2;
			continue;
		}
		/*}}} */

		/*{{{  copy format part to temp, excluding conversion character */
		t = temp;
		t++= '%';
		if (format.charAt(1) == '#')
		{
			t++= '#';
			format++;
			got_hash = true;
		}
		/* dont put isdigit first since sideeffect in macro is bad */
		while (*++format == '.' || Character.isDigit((byte) format) || format.equals('-') || format.equals('+') || format.equals(' ') || format.equals('\''))
			t++= format;
		/*}}} */

		/*{{{  convert conversion character */
		switch (format)
		{
			/*{{{  x and o */
		case 'x':
		case 'X':
		case 'o':
		case 'O':
			t = tangible.StringFunctions.changeCharacter(t, 0, format);
			t = t.substring(0, 1);
			if (snprintf((dest),count,(temp),((int) x)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
				fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			break;
			/*}}} */
			/*{{{  e, f and g */
		case 'e':
		case 'E':
		case 'f':
		case 'F':
		case 'g':
		case 'G':
			t = tangible.StringFunctions.changeCharacter(t, 0, format);
			t = t.substring(0, 1);
			if (snprintf((dest),count,(temp),(x)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
				fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			break;
			/*}}} */
			/*{{{  l --- mantissa to current log base */
		case 'l':
		{
			double mantissa;

			t = tangible.StringFunctions.changeCharacter(t, 0, 'f');
			t = t.substring(0, 1);
			GlobalMembersUtil.mant_exp(log10_base, x, false, mantissa, stored_power, temp);
			seen_mantissa = true;
			if (snprintf((dest),count,(temp),(mantissa)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
				fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			break;
		}
			/*}}} */
			/*{{{  t --- base-10 mantissa */
		case 't':
		{
			double mantissa;

			t = tangible.StringFunctions.changeCharacter(t, 0, 'f');
			t = t.substring(0, 1);
			GlobalMembersUtil.mant_exp(1.0, x, false, mantissa, stored_power, temp);
			seen_mantissa = true;
			if (snprintf((dest),count,(temp),(mantissa)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
				fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			break;
		}
			/*}}} */
			/*{{{  s --- base-1000 / 'scientific' mantissa */
		case 's':
		{
			double mantissa;

			t = tangible.StringFunctions.changeCharacter(t, 0, 'f');
			t = t.substring(0, 1);
			GlobalMembersUtil.mant_exp(1.0, x, true, mantissa, stored_power, temp);
			seen_mantissa = true;
			if (snprintf((dest),count,(temp),(mantissa)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
				fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			break;
		}
			/*}}} */
			/*{{{  L --- power to current log base */
		case 'L':
		{
			int power;

			t = tangible.StringFunctions.changeCharacter(t, 0, 'd');
			t = t.substring(0, 1);
			if (seen_mantissa)
				power = stored_power;
			else
				GlobalMembersUtil.mant_exp(log10_base, x, false, DefineConstants.NULL, power, "%.0f");
			if (snprintf((dest),count,(temp),(power)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
				fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			break;
		}
			/*}}} */
			/*{{{  T --- power of ten */
		case 'T':
		{
			int power;

			t = tangible.StringFunctions.changeCharacter(t, 0, 'd');
			t = t.substring(0, 1);
			if (seen_mantissa)
				power = stored_power;
			else
				GlobalMembersUtil.mant_exp(1.0, x, false, DefineConstants.NULL, power, "%.0f");
			if (snprintf((dest),count,(temp),(power)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
				fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			break;
		}
			/*}}} */
			/*{{{  S --- power of 1000 / 'scientific' */
		case 'S':
		{
			int power;

			t = tangible.StringFunctions.changeCharacter(t, 0, 'd');
			t = t.substring(0, 1);
			if (seen_mantissa)
				power = stored_power;
			else
				GlobalMembersUtil.mant_exp(1.0, x, true, DefineConstants.NULL, power, "%.0f");
			if (snprintf((dest),count,(temp),(power)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
				fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			break;
		}
			/*}}} */
			/*{{{  c --- ISO decimal unit prefix letters */
		case 'c':
		{
			int power;

			t = tangible.StringFunctions.changeCharacter(t, 0, 'c');
			t = t.substring(0, 1);
			if (seen_mantissa)
				power = stored_power;
			else
				GlobalMembersUtil.mant_exp(1.0, x, true, DefineConstants.NULL, power, "%.0f");

			if (power >= -18 && power <= 18)
			{
				/* -18 -> 0, 0 -> 6, +18 -> 12, ... */
				/* HBB 20010121: avoid division of -ve ints! */
				power = (power + 18) / 3;
				if (snprintf((dest),count,(temp),("afpnum kMGTPE"[power])) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
					fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			}
			else
			{
				/* please extend the range ! */
				/* name  power   name  power
				   -------------------------
				   atto   -18    Exa    18
				   femto  -15    Peta   15
				   pico   -12    Tera   12
				   nano    -9    Giga    9
				   micro   -6    Mega    6
				   milli   -3    kilo    3   */

				/* for the moment, print e+21 for example */
				if (snprintf((dest),count,("e%+02d"),((power - 6) * 3)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
					fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			}

			break;
		}
			/*}}} */
			/*{{{  P --- multiple of pi */
		case 'P':
		{
			t = tangible.StringFunctions.changeCharacter(t, 0, 'f');
			t = t.substring(0, 1);
			if (snprintf((dest),count,(temp),(x / DefineConstants.M_PI)) > count)
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
	//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
				fprintf(stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__);
			break;
		}
			/*}}} */
		default:
		   () do {if (numeric_locale != null && strcmp(numeric_locale,"C")) setlocale(LC_NUMERIC,"C");} while (0)();
		   GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Bad format character");
		} // switch
		/*}}} */

		if (got_hash && (!format.equals(strpbrk(format,"oeEfFgG"))))
		{
		   () do {if (numeric_locale != null && strcmp(numeric_locale,"C")) setlocale(LC_NUMERIC,"C");} while (0)();
		   GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Bad format character");
		}

		/* change decimal `.' to the actual entry in decimalsign */
		if (!decimalsign.equals(DefineConstants.NULL))
		{
			String dotpos1 = dest;
			String dotpos2;
			int newlength = decimalsign.length();
			int dot;

			/* dot is the default decimalsign we will be replacing */
			dot = *()(localeconv().decimal_point)();

			/* replace every dot by the contents of decimalsign */
			while ((dotpos2 = tangible.StringFunctions.strChr(dotpos1,dot)) != DefineConstants.NULL)
			{
			int taillength = dotpos2.length();

			dotpos1 = dotpos2 + newlength;
			/* test if the new value for dest would be too long */
			if (dotpos1 - dest + taillength > count)
				GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "format too long due to long decimalsign string");
			/* move tail end of string out of the way */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memmove' has no equivalent in Java:
			memmove(dotpos1, dotpos2 + 1, taillength);
			/* insert decimalsign */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(dotpos2, decimalsign, newlength);
			}
			/* clear temporary variables for safety */
			dotpos1 = DefineConstants.NULL;
			dotpos2 = DefineConstants.NULL;
		}

		/* this was at the end of every single case, before: */
		dest += dest.length();
		++format;
		} // for ever

		() do {if (numeric_locale != null && strcmp(numeric_locale,"C")) setlocale(LC_NUMERIC,"C");} while (0)();
	}

///#if defined(VA_START) && defined(STDC_HEADERS)

	/* Error message handling */
	///#if defined(VA_START) && defined(STDC_HEADERS)
	public static void os_error(int t_num, String str, Object... LegacyParamArray)
	///#else
	//void
	//os_error(int t_num, const char *str, va_dcl)
	///#endif
	{
	///#ifdef VA_START
	//	va_list args;
	///#endif
	///#ifdef VMS
	//    static status[2] = { 1, 0 };		// 1 is count of error msgs
	///#endif // VMS

		/* reprint line if screen has been written to */

		if (t_num == DefineConstants.DATAFILE)
		{
		GlobalMembersDatafile.df_showdata();
		} // put caret under error
		else if (t_num != DefineConstants.NO_CARET)
		{
		if (!screen_ok)
			do {fprintf(stderr, "\n%s%s\n", current_prompt != null ? current_prompt : "", GlobalMembersCommand.gp_input_line);} while (0);

		do {String GlobalMembersAnsi2knr.p; if (current_prompt == null) break; for (GlobalMembersAnsi2knr.p = current_prompt; * GlobalMembersAnsi2knr.p != '\0'; GlobalMembersAnsi2knr.p++)() fputc(' ', stderr);} while (0);
		do {int i; for (i = 0; i < GlobalMembersCommand.token[t_num].start_index; i++)() fputc((GlobalMembersCommand.gp_input_line.charAt(i) == '\t') ? '\t' : ' ', stderr);} while (0);
		fputs("^\n",stderr);;
		}
		do {String GlobalMembersAnsi2knr.p; if (current_prompt == null) break; for (GlobalMembersAnsi2knr.p = current_prompt; * GlobalMembersAnsi2knr.p != '\0'; GlobalMembersAnsi2knr.p++)() fputc(' ', stderr);} while (0);

	///#ifdef VA_START
	int ParamCount = -1;
	//	va_start(args, str);
	///#if defined(HAVE_VFPRINTF) || _LIBC
	//    vfprintf(stderr, str, args);
	///#else
		_doprnt(str, args, stderr);
	///#endif
	//	va_end(args);
	///#else
	//    fprintf(stderr, str, a1, a2, a3, a4, a5, a6, a7, a8);
	///#endif
		putc('\n', stderr);

		do {String GlobalMembersAnsi2knr.p; if (current_prompt == null) break; for (GlobalMembersAnsi2knr.p = current_prompt; * GlobalMembersAnsi2knr.p != '\0'; GlobalMembersAnsi2knr.p++)() fputc(' ', stderr);} while (0);
		if (!GlobalMembersPlot.interactive) {if (GlobalMembersMisc.lf_head != null && GlobalMembersMisc.lf_head.name != null) fprintf(stderr, "\"%s\", line %d: ", GlobalMembersMisc.lf_head.name, GlobalMembersCommand.inline_num); else fprintf(stderr, "line %d: ", GlobalMembersCommand.inline_num);};

	///#ifdef VMS
	//    status[1] = vaxc$errno;
	//    sys$putmsg(status);
	//    (void) putc('\n', stderr);
	///#else // VMS
		perror("util.c");
		putc('\n', stderr);
	///#endif // VMS

		GlobalMembersPlot.bail_to_command_line();
	}

///#if defined(VA_START) && defined(STDC_HEADERS)
	public static void int_error(int t_num, String str, Object... LegacyParamArray)
	///#else
	//void
	//int_error(int t_num, const char str[], va_dcl)
	///#endif
	{
	///#ifdef VA_START
	//	va_list args;
	///#endif

		String error_message = "";

		/* reprint line if screen has been written to */

		if (t_num == DefineConstants.DATAFILE)
		{
			GlobalMembersDatafile.df_showdata();
		} // put caret under error
		else if (t_num != DefineConstants.NO_CARET)
		{
		if (!screen_ok)
			do {fprintf(stderr, "\n%s%s\n", current_prompt != null ? current_prompt : "", GlobalMembersCommand.gp_input_line);} while (0);

		do {String GlobalMembersAnsi2knr.p; if (current_prompt == null) break; for (GlobalMembersAnsi2knr.p = current_prompt; * GlobalMembersAnsi2knr.p != '\0'; GlobalMembersAnsi2knr.p++)() fputc(' ', stderr);} while (0);
		do {int i; for (i = 0; i < GlobalMembersCommand.token[t_num].start_index; i++)() fputc((GlobalMembersCommand.gp_input_line.charAt(i) == '\t') ? '\t' : ' ', stderr);} while (0);
		fputs("^\n",stderr);;
		}
		do {String GlobalMembersAnsi2knr.p; if (current_prompt == null) break; for (GlobalMembersAnsi2knr.p = current_prompt; * GlobalMembersAnsi2knr.p != '\0'; GlobalMembersAnsi2knr.p++)() fputc(' ', stderr);} while (0);
		if (!GlobalMembersPlot.interactive) {if (GlobalMembersMisc.lf_head != null && GlobalMembersMisc.lf_head.name != null) fprintf(stderr, "\"%s\", line %d: ", GlobalMembersMisc.lf_head.name, GlobalMembersCommand.inline_num); else fprintf(stderr, "line %d: ", GlobalMembersCommand.inline_num);};

	///#ifdef VA_START
	int ParamCount = -1;
	//	va_start(args, str);
	///#if defined(HAVE_VFPRINTF) || _LIBC
	//    vsnprintf(error_message, sizeof(error_message), str, args);
	//    fprintf(stderr,"%.120s",error_message);
	///#else
		_doprnt(str, args, stderr);
	///#endif
	//	va_end(args);
	///#else
	//    fprintf(stderr, str, a1, a2, a3, a4, a5, a6, a7, a8);
	///#ifdef HAVE_SNPRINTF
	//    snprintf(error_message, sizeof(error_message), str, a1, a2, a3, a4, a5, a6, a7, a8);
	///#else
	//    sprintf(error_message, str, a1, a2, a3, a4, a5, a6, a7, a8);
	///#endif
	///#endif

		fputs("\n\n", stderr);

		/* We are bailing out of nested context without ever reaching */
		/* the normal cleanup code. Reset any flags before bailing.   */
		GlobalMembersDatafile.df_reset_after_error();

		/* Load error state variables */
		GlobalMembersEval.update_gpval_variables(2);
		GlobalMembersEval.fill_gpval_string("GPVAL_ERRMSG", error_message);

		GlobalMembersPlot.bail_to_command_line();
	}

/* Warn without bailing out to command line. Not a user error */
///#if defined(VA_START) && defined(STDC_HEADERS)
	public static void int_warn(int t_num, String str, Object... LegacyParamArray)
	///#else
	//void
	//int_warn(int t_num, const char str[], va_dcl)
	///#endif
	{
	///#ifdef VA_START
	//	va_list args;
	///#endif

		/* reprint line if screen has been written to */

		if (t_num == DefineConstants.DATAFILE)
		{
			GlobalMembersDatafile.df_showdata();
		} // put caret under error
		else if (t_num != DefineConstants.NO_CARET)
		{
		if (!screen_ok)
			do {fprintf(stderr, "\n%s%s\n", current_prompt != null ? current_prompt : "", GlobalMembersCommand.gp_input_line);} while (0);

		do {String GlobalMembersAnsi2knr.p; if (current_prompt == null) break; for (GlobalMembersAnsi2knr.p = current_prompt; * GlobalMembersAnsi2knr.p != '\0'; GlobalMembersAnsi2knr.p++)() fputc(' ', stderr);} while (0);
		do {int i; for (i = 0; i < GlobalMembersCommand.token[t_num].start_index; i++)() fputc((GlobalMembersCommand.gp_input_line.charAt(i) == '\t') ? '\t' : ' ', stderr);} while (0);
		fputs("^\n",stderr);;
		}
		do {String GlobalMembersAnsi2knr.p; if (current_prompt == null) break; for (GlobalMembersAnsi2knr.p = current_prompt; * GlobalMembersAnsi2knr.p != '\0'; GlobalMembersAnsi2knr.p++)() fputc(' ', stderr);} while (0);
		if (!GlobalMembersPlot.interactive) {if (GlobalMembersMisc.lf_head != null && GlobalMembersMisc.lf_head.name != null) fprintf(stderr, "\"%s\", line %d: ", GlobalMembersMisc.lf_head.name, GlobalMembersCommand.inline_num); else fprintf(stderr, "line %d: ", GlobalMembersCommand.inline_num);};

		fputs("warning: ", stderr);
	///#ifdef VA_START
	int ParamCount = -1;
	//	va_start(args, str);
	///#if defined(HAVE_VFPRINTF) || _LIBC
	//    vfprintf(stderr, str, args);
	///#else
		_doprnt(str, args, stderr);
	///#endif
	//	va_end(args);
	///#else  // VA_START
	//    fprintf(stderr, str, a1, a2, a3, a4, a5, a6, a7, a8);
	///#endif // VA_START
		putc('\n', stderr);
	}

/*{{{  graph_error() */
/* handle errors during graph-plot in a consistent way */
/* HBB 20000430: move here, from graphics.c */
///#if defined(VA_START) && defined(STDC_HEADERS)
	public static void graph_error(String fmt, Object... LegacyParamArray)
	///#else
	//void
	//graph_error(const char *fmt, va_dcl)
	///#endif
	{
	///#ifdef VA_START
	//	va_list args;
	///#endif

		GlobalMembersTerm.multiplot = false;
		GlobalMembersTerm.term_end_plot();

	///#ifdef VA_START
	int ParamCount = -1;
	//	va_start(args, fmt);
	///#if 0
	//// /* HBB 20001120: this seems not to work at all. Probably because a
	////  * va_list argument, is, after all, something else than a varargs
	////  * list (i.e. a '...') */
	////    int_error(NO_CARET, fmt, args);
	///#else
		/* HBB 20001120: instead, copy the core code from int_error() to
		 * here: */
		do {String GlobalMembersAnsi2knr.p; if (current_prompt == null) break; for (GlobalMembersAnsi2knr.p = current_prompt; * GlobalMembersAnsi2knr.p != '\0'; GlobalMembersAnsi2knr.p++)() fputc(' ', stderr);} while (0);
		if (!GlobalMembersPlot.interactive) {if (GlobalMembersMisc.lf_head != null && GlobalMembersMisc.lf_head.name != null) fprintf(stderr, "\"%s\", line %d: ", GlobalMembersMisc.lf_head.name, GlobalMembersCommand.inline_num); else fprintf(stderr, "line %d: ", GlobalMembersCommand.inline_num);};

	///#if defined(HAVE_VFPRINTF) || _LIBC
	//    vfprintf(stderr, fmt, args);
	///#else
		_doprnt(fmt, args, stderr);
	///#endif
	//	va_end(args);
		fputs("\n\n", stderr);

		GlobalMembersPlot.bail_to_command_line();
	///#endif // 1/0
	//	va_end(args);
	///#else
	//    int_error(NO_CARET, fmt, a1, a2, a3, a4, a5, a6, a7, a8);
	///#endif

	}

/*}}} */


/* Lower-case the given string (DFK) */
/* Done in place. */
	///#else
	//void os_error __PROTO(());
	//void int_error __PROTO(());
	//void int_warn __PROTO(());
	//void graph_error __PROTO(());
	///#endif

	/* Helper functions for help_command() */
	/* FIXME HBB 20010726: should be moved to where help_comamnd() is, and
	 * made static. Currently, that's command.c, but it should probably
	 * move to help.c, instead. */
	public static void lower_case(String s)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * p = s;

		while (*p)
		{
		if (Character.isUpperCase((byte) * p))
			*p = Character.toLowerCase((byte) * p);
		p++;
		}
	}

/* Squash spaces in the given string (DFK) */
/* That is, reduce all multiple white-space chars to single spaces */
/* Done in place. */
	public static void squash_spaces(String s)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * r = s; // reading point
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * w = s; // writing point
		boolean space = false; // TRUE if we've already copied a space

		for (w = r = s; * r != DefineConstants.NUL; r++)
		{
		if (Character.isWhitespace((byte) * r))
		{
			/* white space; only copy if we haven't just copied a space */
			if (!space)
			{
			space = true;
			*w++= ' ';
			} // else ignore multiple spaces
		}
		else
		{
			/* non-space character; copy it and clear flag */
			*w++= *r;
			space = false;
		}
		}
		*w = DefineConstants.NUL; // null terminate string
	}

/* FIXME HH 20020915: This function does nothing if dirent.h and windows.h
 * not available. */

	public static boolean existdir(String name)
	{
	///#ifdef HAVE_DIRENT_H
		DIR dp;
		if (!(dp = opendir(name)))
		return false;

		closedir(dp);
		return true;
	///#elif defined(_Windows)
	//    HANDLE FileHandle;
	//    WIN32_FIND_DATA finddata;
	//
	//    FileHandle = FindFirstFile(name, &finddata);
	//    if (FileHandle != INVALID_HANDLE_VALUE) {
	//	if (finddata.dwFileAttributes & FILE_ATTRIBUTE_DIRECTORY)
	//	    return TRUE;
	//    }
	//    return FALSE;
	///#elif defined(VMS)
	//    return FALSE;
	///#else
	//    int_warn(NO_CARET,
	//	     "Test on directory existence not supported\n\t('%s!')",
	//	     name);
	//    return FALSE;
	///#endif
	}

	public static String getusername()
	{
		String username = DefineConstants.NULL;

		username = getenv("USER");
		if (username == null)
		username = getenv("USERNAME");

		return GlobalMembersUtil.gp_strdup(username);
	}

	public static boolean contains8bit(String s)
	{
		while (s != null)
		{
		if ((s++ & 0x80))
			return true;
		}
		return false;
	}

/* Convert UTF-8 multibyte sequence from string to unsigned long character.
   Returns TRUE on success.
*/
	public static boolean utf8toulong(int wch, String str)
	{
	  byte c;

	  c = (byte) * (str)++;
	  if ((c & 0x80) == 0)
	  {
		wch = (int) c;
		return true;
	  }

	  if ((c & 0xe0) == 0xc0)
	  {
		wch = c & 0x1f;
		return GlobalMembersUtil.utf8_getmore(wch, str, 1);
	  }

	  if ((c & 0xf0) == 0xe0)
	  {
		wch = c & 0x0f;
		return GlobalMembersUtil.utf8_getmore(wch, str, 2);
	  }

	  if ((c & 0xf8) == 0xf0)
	  {
		wch = c & 0x07;
		return GlobalMembersUtil.utf8_getmore(wch, str, 3);
	  }

	  if ((c & 0xfc) == 0xf8)
	  {
		wch = c & 0x03;
		return GlobalMembersUtil.utf8_getmore(wch, str, 4);
	  }

	  if ((c & 0xfe) == 0xfc)
	  {
		wch = c & 0x01;
		return GlobalMembersUtil.utf8_getmore(wch, str, 5);
	  }

	  wch = DefineConstants.INVALID_UTF8;
	  return false;
	}



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

	///#if defined(HAVE_DIRENT_H)
	///#elif defined(_Windows)
	///#include <windows.h>
	///#endif

	/* Exported (set-table) variables */

	/* decimal sign */
	public static String decimalsign = DefineConstants.NULL;

	/* Holds the name of the current LC_NUMERIC as set by "set decimal locale" */
	public static String numeric_locale = DefineConstants.NULL;

	/* Holds the name of the current LC_TIME as set by "set locale" */
	public static String current_locale = DefineConstants.NULL;

	public static String current_prompt = DefineConstants.NULL; // to be set by read_line()

/* HBB 20020405: moved these functions here from axis.c, where they no
 * longer truly belong. */
/*{{{  mant_exp - split into mantissa and/or exponent */
/* HBB 20010121: added code that attempts to fix rounding-induced
 * off-by-one errors in 10^%T and similar output formats */

	/* internal prototypes */

	public static void mant_exp(double log10_base, double x, boolean scientific, double m, int p, String format)
	{
		int sign = 1;
		double l10;
		int power;
		double mantissa;

		/*{{{  check 0 */
		if (x == 0)
		{
		if (m != 0)
			m = 0;
		if (p != 0)
			p = 0;
		return;
		}
		/*}}} */
		/*{{{  check -ve */
		if (x < 0)
		{
		sign = (-1);
		x = (-x);
		}
		/*}}} */

		l10 = Math.log10(x) / log10_base;
		power = Math.floor(l10);
		mantissa = Math.pow(10.0, log10_base * (l10 - power));

		/* round power to an integer multiple of 3, to get what's
		 * sometimes called 'scientific' or 'engineering' notation. Also
		 * useful for handling metric unit prefixes like 'kilo' or 'micro'
		 * */
		if (scientific)
		{
		/* Scientific mode makes no sense whatsoever if the base of
		 * the logarithmic axis is anything but 10.0 */
		assert log10_base == 1.0;

		/* HBB FIXED 20040701: negative modulo positive may yield
		 * negative result.  But we always want an effectively
		 * positive modulus --> adjust input by one step */
		switch (power % 3)
		{
		case -1:
			power -= 3;
		case 2:
			mantissa *= 100;
			break;
		case -2:
			power -= 3;
		case 1:
			mantissa *= 10;
			break;
		case 0:
			break;
		default:
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Internal error in scientific number formatting");
		}
		power -= (power % 3);
		}

		/* HBB 20010121: new code for decimal mantissa fixups.  Looks at
		 * format string to see how many decimals will be put there.  Iff
		 * the number is so close to an exact power of 10 that it will be
		 * rounded up to 10.0e??? by an sprintf() with that many digits of
		 * precision, increase the power by 1 to get a mantissa in the
		 * region of 1.0.  If this handling is not wanted, pass NULL as
		 * the format string */
		/* HBB 20040521: extended to also work for bases other than 10.0 */
		if (format != null)
		{
		double actual_base = (scientific ? 1000 : Math.pow(10.0, log10_base));
		int precision = 0;
		double tolerance;

		format = tangible.StringFunctions.strChr(format, '.');
		if (!format.equals(DefineConstants.NULL))
			/* a decimal point was found in the format, so use that
			 * precision. */
			precision = strtol(format + 1, DefineConstants.NULL, 10);

		/* See if mantissa would be right on the border.  The
		 * condition to watch out for is that the mantissa is within
		 * one printing precision of the next power of the logarithm
		 * base.  So add the 0.5*10^-precision to the mantissa, and
		 * see if it's now larger than the base of the scale */
		tolerance = Math.pow(10.0, -precision) / 2;
		if (mantissa + tolerance >= actual_base)
		{
			mantissa /= actual_base;
			power += (scientific ? 3 : 1);
		}
		}
		if (m != 0)
		m = sign * mantissa;
		if (p != 0)
		p = power;
	}

/* postprocess single quoted strings: replace "''" by "'"
*/
	public static void parse_sq(String instr)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * s = instr;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		byte * t = instr;

		/* the string will always get shorter, so we can do the
		 * conversion in situ
		 */

		while (*s != DefineConstants.NUL)
		{
			if (*s == '\'' && *(s + 1) == '\'')
				s++;
			*t++= *s++;
		}
		*t = DefineConstants.NUL;
	}

	/*}}} */

	/*
	 * Kludge alert!!
	 * Workaround until we have a better solution ...
	 * Note: this assumes that all calls to sprintf in gprintf have
	 * exactly three args. Lars
	 */
	///#ifdef HAVE_SNPRINTF
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define sprintf(str,fmt,arg) if (snprintf((str),count,(fmt),(arg)) > count) fprintf (stderr,"%s:%d: Warning: too many digits for format\n",__FILE__,__LINE__)

	/*}}} */
	///#ifdef HAVE_SNPRINTF
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#undef sprintf
	///#endif

	/* some macros for the error and warning functions below
	 * may turn this into a utility function later
	 */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PRINT_MESSAGE_TO_STDERR do { fprintf(stderr, "\n%s%s\n", current_prompt ? current_prompt : "", gp_input_line); } while (0)

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PRINT_SPACES_UNDER_PROMPT do { const char *p; if (!current_prompt) break; for (p = current_prompt; *p != '\0'; p++) (void) fputc(' ', stderr); } while (0)

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PRINT_SPACES_UPTO_TOKEN do { int i; for (i = 0; i < token[t_num].start_index; i++) (void) fputc((gp_input_line[i] == '\t') ? '\t' : ' ', stderr); } while(0)

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PRINT_CARET fputs("^\n",stderr);

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PRINT_FILE_AND_LINE if (!interactive) { if (lf_head && lf_head->name) fprintf(stderr, "\"%s\", line %d: ", lf_head->name, inline_num); else fprintf(stderr, "line %d: ", inline_num); }

	/* TRUE if command just typed; becomes FALSE whenever we
	 * send some other output to screen.  If FALSE, the command line
	 * will be echoed to the screen before the ^ error message.
	 */
	public static boolean screen_ok;

	///#define INVALID_UTF8 0xfffful

	/* Read from second byte to end of UTF-8 sequence.
	   used by utf8toulong() */
	public static boolean utf8_getmore(int wch, String str, int nbytes)
	{
	  int i;
	  byte c;
	  int[] minvalue = {0x80, 0x800, 0x10000, 0x200000, 0x4000000};

	  for (i = 0; i < nbytes; i++)
	  {
		c = (byte) * str;

		if ((c & 0xc0) != 0x80)
		{
		  wch = DefineConstants.INVALID_UTF8;
		  return false;
		}
		wch = (wch << 6) | (c & 0x3f);
		str++;
	  }

	  /* check for overlong UTF-8 sequences */
	  if (wch < minvalue[nbytes - 1])
	  {
		wch = DefineConstants.INVALID_UTF8;
		return false;
	  }
	  return true;
	}
}