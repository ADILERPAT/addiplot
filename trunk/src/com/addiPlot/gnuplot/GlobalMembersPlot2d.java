package com.addiPlot.gnuplot;

import java.util.LinkedList;

import com.addiPlot.gnuplot.tangible.PrintfFunctions;
import com.addiPlot.gnuplot.tangible.StringFunctions;

public class GlobalMembersPlot2d
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
	//	return GlobalMembersAlloc.RCSid("$Id: plot2d.c,v 1.193.2.7 2010/03/06 19:14:37 sfeam Exp $");
	//}
	///#endif

	/* GNUPLOT - plot2d.c */

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
	/*
	 * $Id: plot2d.h,v 1.14 2008/03/13 19:53:35 sfeam Exp $
	 */

	/* GNUPLOT - plot2d.h */

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



	/* Variables of plot2d.c needed by other modules: */

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern struct curve_points *first_plot;

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double boxwidth;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean boxwidth_is_absolute;

	/*
	 * In the parametric case we can say plot [a= -4:4] [-2:2] [-1:1] sin(a),a**2
	 * while in the non-parametric case we would say only plot [b= -2:2] [-1:1]
	 * sin(b)
	 */

	/* prototypes from plot2d.c */

	public static void plotrequest()
	{
		int dummy_token = -1;
		AXIS_INDEX t_axis;

		if (GlobalMembersTerm.term == null) // unknown
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "use 'set term' to set terminal type first");

		GlobalMembersGadgets.is_3d_plot = false;

		/* Deactivate if 'set view map' is still running after the previous 'splot': */
		GlobalMembersCommand.splot_map_deactivate();

		if (GlobalMembersGadgets.parametric && StringFunctions.strcmp(GlobalMembersParse.set_dummy_var[0], "u") == 0)
			GlobalMembersParse.set_dummy_var[0] = "t";

		/* initialise the arrays from the 'set' scalars */

		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
			this_Renamed.max = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
			this_Renamed.max = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
			this_Renamed.max = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
			this_Renamed.max = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.T_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
			this_Renamed.max = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
			this_Renamed.max = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			this_Renamed.min = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
			this_Renamed.max = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);

		t_axis = (GlobalMembersGadgets.parametric || GlobalMembersGadgets.polar) ? AXIS_INDEX.T_AXIS : AXIS_INDEX.FIRST_X_AXIS;

		do
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
			{
				GlobalMembersCommand.c_token++;
				if (GlobalMembersUtil.isletter(GlobalMembersCommand.c_token) != 0)
				{
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token + 1, "=") != 0)
					{
						dummy_token = GlobalMembersCommand.c_token;
						GlobalMembersCommand.c_token += 2;
					}
				}
				GlobalMembersAxis.axis_array[t_axis.getValue()].autoscale = GlobalMembersAxis.load_range(t_axis, GlobalMembersAxis.axis_array[t_axis.getValue()].min, GlobalMembersAxis.axis_array[t_axis.getValue()].max, GlobalMembersAxis.axis_array[t_axis.getValue()].autoscale);
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
					GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
				GlobalMembersCommand.c_token++;
			}
		} while (false);
		if (GlobalMembersGadgets.parametric || GlobalMembersGadgets.polar) // set optional x ranges
			do
			{
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
				{
					GlobalMembersCommand.c_token++;
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale = GlobalMembersAxis.load_range(AXIS_INDEX.FIRST_X_AXIS, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale);
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
						GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
					GlobalMembersCommand.c_token++;
				}
			} while (false);

		/* possible reversal of x range *does* matter, even in parametric
		 * or polar mode */
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()];
			if (((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue()) && (this_Renamed.max < this_Renamed.min))
			{
				double temp = this_Renamed.min;
				this_Renamed.min = this_Renamed.max;
				this_Renamed.max = temp;
				this_Renamed.range_is_reverted = true;
			}
			else
				this_Renamed.range_is_reverted = ((this_Renamed.range_flags & DefineConstants.RANGE_REVERSE) != 0);
		} while (false);

		do
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale = GlobalMembersAxis.load_range(AXIS_INDEX.FIRST_Y_AXIS, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale);
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
					GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
				GlobalMembersCommand.c_token++;
			}
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()];
			if (((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue()) && (this_Renamed.max < this_Renamed.min))
			{
				double temp = this_Renamed.min;
				this_Renamed.min = this_Renamed.max;
				this_Renamed.max = temp;
				this_Renamed.range_is_reverted = true;
			}
			else
				this_Renamed.range_is_reverted = ((this_Renamed.range_flags & DefineConstants.RANGE_REVERSE) != 0);
		} while (false);
		do
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale = GlobalMembersAxis.load_range(AXIS_INDEX.SECOND_X_AXIS, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale);
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
					GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
				GlobalMembersCommand.c_token++;
			}
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()];
			if (((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue()) && (this_Renamed.max < this_Renamed.min))
			{
				double temp = this_Renamed.min;
				this_Renamed.min = this_Renamed.max;
				this_Renamed.max = temp;
				this_Renamed.range_is_reverted = true;
			}
			else
				this_Renamed.range_is_reverted = ((this_Renamed.range_flags & DefineConstants.RANGE_REVERSE) != 0);
		} while (false);
		do
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].autoscale = GlobalMembersAxis.load_range(AXIS_INDEX.SECOND_Y_AXIS, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].max, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].autoscale);
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
					GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
				GlobalMembersCommand.c_token++;
			}
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()];
			if (((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue()) && (this_Renamed.max < this_Renamed.min))
			{
				double temp = this_Renamed.min;
				this_Renamed.min = this_Renamed.max;
				this_Renamed.max = temp;
				this_Renamed.range_is_reverted = true;
			}
			else
				this_Renamed.range_is_reverted = ((this_Renamed.range_flags & DefineConstants.RANGE_REVERSE) != 0);
		} while (false);

		/* Clear out any tick labels read from data files in previous plot */
		for (int axisLoop; axisLoop < DefineConstants.AXIS_ARRAY_SIZE; axisLoop++)
		{
			ticdef ticdef = GlobalMembersAxis.axis_array[axisLoop].ticdef;
			if (ticdef.def.user != null)
				ticdef.def.user = GlobalMembersSet.prune_dataticks(ticdef.def.user);
			if (ticdef.def.user == null && ticdef.type == en_ticseries_type.TIC_USER)
				ticdef.type = en_ticseries_type.TIC_COMPUTED;
		}

		/* use the default dummy variable unless changed */
		if (dummy_token >= 0)
			GlobalMembersUtil.copy_str(GlobalMembersParse.c_dummy_var[0], dummy_token, DefineConstants.MAX_ID_LEN);
		else
			StringFunctions.strcpy(GlobalMembersParse.c_dummy_var[0], GlobalMembersParse.set_dummy_var[0]);

		GlobalMembersPlot2d.eval_plots();
	}

	///#ifdef VOLATILE_REFRESH
	/* Helper function for refresh command.  Reexamine each data point and update the
	 * flags for INRANGE/OUTRANGE/UNDEFINED based on the current limits for that axis.
	 * Normally the axis limits are already known at this point. But if the user has
	 * forced "set autoscale" since the previous plot or refresh, we need to reset the
	 * axis limits and try to approximate the full auto-scaling behaviour.
	 */
	public static void refresh_bounds(LinkedList<curve_points> first_plot, int nplots)
	{
		curve_points this_plot = first_plot.getFirst();
		int iplot; // plot index

		for (iplot = 0; iplot < nplots; iplot++, this_plot = first_plot.get(iplot))
		{
			int i; // point index
			axis x_axis = GlobalMembersAxis.axis_array[this_plot.x_axis];
			axis y_axis = GlobalMembersAxis.axis_array[this_plot.y_axis];

			/* IMAGE clipping is done elsewhere, so we don't need INRANGE/OUTRANGE
			 * checks.
			 */
			if (this_plot.plot_style == PLOT_STYLE.IMAGE || this_plot.plot_style == PLOT_STYLE.RGBIMAGE)
			{
				if (x_axis.set_autoscale.getValue() != 0)
					GlobalMembersGraphics.plot_image_or_update_axes(this_plot, true);
				continue;
			}

			for (i = 0; i < this_plot.p_count; i++)
			{
				coordinate point = this_plot.points.get(i);

				if (point.type == coord_type.UNDEFINED)
					continue;
				else
					point.type = coord_type.INRANGE;

				/* If the state has been set to autoscale since the last plot,
				 * mark everything INRANGE and re-evaluate the axis limits now.
				 * Otherwise test INRANGE/OUTRANGE against previous axis limits.
				 */
				if (!this_plot.noautoscale && ((x_axis.set_autoscale.getValue() & (e_autoscale.AUTOSCALE_MIN.getValue() | e_autoscale.AUTOSCALE_MAX.getValue())) != 0))
				{
					if (point.x > x_axis.max)
						x_axis.max = point.x;
					if (point.x < x_axis.min)
						x_axis.min = point.x;
				}
				else if (!(((x_axis.min)<(x_axis.max)) ? (((point.x) >= (x_axis.min)) && ((point.x) <= (x_axis.max))) : (((point.x) >= (x_axis.max)) && ((point.x) <= (x_axis.min)))))
				{
					point.type = coord_type.OUTRANGE;
					continue;
				}

				if (!this_plot.noautoscale && ((y_axis.set_autoscale.getValue() & (e_autoscale.AUTOSCALE_MIN.getValue() | e_autoscale.AUTOSCALE_MAX.getValue())) != 0))
				{
					if (point.y > y_axis.max)
						y_axis.max = point.y;
					if (point.y < y_axis.min)
						y_axis.min = point.y;
				}
				else if (!(((y_axis.min)<(y_axis.max)) ? (((point.y) >= (y_axis.min)) && ((point.y) <= (y_axis.max))) : (((point.y) >= (y_axis.max)) && ((point.y) <= (y_axis.min)))))
				{
					point.type = coord_type.OUTRANGE;
					continue;
				}
			}

		}
	}

	/*
	 * cp_free() releases any memory which was previously malloc()'d to hold
	 *   curve points (and recursively down the linked list).
	 */
	/* HBB 20000506: instead of risking stack havoc by recursion, operate
	 * iteratively */

	/* internal and external variables */
	public static void cp_free(LinkedList<curve_points> cp)
	{
		cp.clear();
	}

	/*
	 * cp_extend() reallocates a curve_points structure to hold "num"
	 * points. This will either expand or shrink the storage.
	 */
	public static void cp_extend(curve_points cp, int num)
	{

		///#if defined(DOS16) || defined(WIN16)
		// /* Make sure we do not allocate more than 64k points in msdos since
		//  * indexing is done with 16-bit int
		//  * Leave some bytes for malloc maintainance.
		//  */
		//    if (num > 32700)
		//	int_error(NO_CARET, "Array index must be less than 32k in msdos");
		///#endif // MSDOS

		if (num == cp.p_max)
			return;

		if (num > 0)
		{
			//if (cp.points == null)
			//{
			//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			//cp.points = GlobalMembersAlloc.gp_alloc(num * sizeof(cp.points[0]), "curve points");
			//}
			//else
			//{
			//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			//cp.points = GlobalMembersAlloc.gp_realloc(cp.points, num * sizeof(cp.points[0]), "expanding curve points");
			//}
			cp.p_max = num;
		}
		else
		{
			//if (cp.points != null)
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			//free(cp.points);
			cp.points = null;
			cp.p_max = 0;
		}
	}

	/* store_label() is called by get_data for each point */
	/* This routine is exported so it can be shared by plot3d */

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
	public static void store_label(LinkedList<text_label> listhead, coordinate cp, int i, String string, double colorval)
	{
		text_label tl = new text_label();
		int textlen;

		if (listhead == null)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "text_label list was not initialized");

		tl.tag = i;
		tl.place.x = cp.x;
		tl.place.y = cp.y;
		tl.place.z = cp.z;

		/* Check for optional (textcolor palette ...) */
		if (tl.textcolor.type == DefineConstants.TC_Z)
			tl.textcolor.value = colorval;
		/* Check for optional (textcolor rgb variable) */
		else if (tl.textcolor.type == DefineConstants.TC_RGB && tl.textcolor.value < 0)
			tl.textcolor.lt = (int) colorval;

		/* Check for null string (no label) */
		if (string == null)
			string = "";

		textlen = 0;
		/* FIXME EAM - this code is ugly but seems to work */
		/* We need to handle quoted separators and quoted quotes */
		if (GlobalMembersDatafile.df_separator != 0)
		{
			boolean in_quote = false;
			while (textlen < string.length() - 1)
			{
				if (string.charAt(textlen) == '"')
					in_quote = !in_quote;
				else if (string.charAt(textlen) == GlobalMembersDatafile.df_separator && !in_quote)
					break;
				textlen++;
			}
			while (textlen > 0 && Character.isWhitespace(string.charAt(textlen - 1)))
				textlen--;
		}
		else
		{
			/* This is the normal case (no special separator character) */
			if (string.equals('"'))
			{
				for (textlen = 1; (textlen < string.length()-1) && string.charAt(textlen) != '"'; textlen++)
					;
			}
			while ((textlen < string.length()-1) && !Character.isWhitespace(string.charAt(textlen)))
				textlen++;
		}

		/* Strip double quote from both ends */
		int startChar = 0;
		if (string.charAt(0) == '"' && string.charAt(textlen - 1) == '"') {
			textlen -= 2;
			startChar = 1;
		}

		tl.text = string.substring(startChar, textlen-1);
		GlobalMembersUtil.parse_esc(tl.text);

		PrintfFunctions.fprintf(DefineConstants.stderr,"LABELPOINT %f %f \"%s\" \n", tl.place.x, tl.place.y, tl.text);
	}

	/* function implementations */

	/* HBB 20000508: moved cp_alloc() &friends to the main module using them, and
	 * made cp_alloc 'static'.
	 */
	/*
	 * cp_alloc() allocates a curve_points structure that can hold 'num'
	 * points.   Initialize all fields to NULL.
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
	///#define PROGRAM "G N U P L O T"
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SAVE_NUM_OR_TIME(fp, x, axis) do{ if (axis_array[axis].is_timedata) { char s[80]; putc('"', fp); gstrftime(s,80,axis_array[axis].timefmt,(double)(x)); fputs(conv_text(s), fp); putc('"', fp); } else { fprintf(fp,"%#g",x); } } while(0)
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

	///#ifndef _Windows
	///#define H_FOUND 0
	///#define H_NOTFOUND 1
	///#define H_ERROR (-1)
	///#endif

	/* minimum size of points[] in curve_points */
	///#define MIN_CRV_POINTS 100

	/* static prototypes */

	public static curve_points cp_alloc(int num)
	{
		curve_points cp;
		lp_style_type default_lp_properties = new lp_style_type(0, -2, 0, 0, 1.0, DefineConstants.PTSZ_DEFAULT, false, {DefineConstants.TC_DEFAULT, 0, 0.0});

		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		cp = (GlobalMembersMouse.struct curve_points *) GlobalMembersAlloc.gp_alloc(sizeof(GlobalMembersMouse.struct curve_points), "curve");
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(cp,0,sizeof(GlobalMembersMouse.struct curve_points));

		cp.p_max = (num >= 0 ? num : 0);
		if (num > 0)
			//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			cp.points = (GlobalMembersMouse.struct coordinate  *) GlobalMembersAlloc.gp_alloc(num * sizeof(GlobalMembersMouse.struct coordinate), "curve points");

		/* Initialize various fields */
		cp.lp_properties = default_lp_properties;
		GlobalMembersGadgets.default_arrow_style((cp.arrow_properties));
		cp.fill_properties = GlobalMembersGadgets.default_fillstyle;

		return (cp);
	}
	///#endif


	/* A quick note about boxes style. For boxwidth auto, we cannot
	 * calculate widths yet, since it may be sorted, etc. But if
	 * width is set, we must do it now, before logs of xmin/xmax
	 * are taken.
	 * We store -1 in point->z as a marker to mean width needs to be
	 * calculated, or 0 to mean that xmin/xmax are set correctly
	 */
	/* current_plot->token is after datafile spec, for error reporting
	 * it will later be moved passed title/with/linetype/pointtype
	 */
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static String get_data_errmsg = "Not enough columns for variable color";
	public static int get_data(curve_points current_plot)
	{
		int i; // num. points !
		int j;
		int max_cols; // allowed range of column numbers
		int min_cols;
		double[] v = new double[DefineConstants.MAXDATACOLS];
		int storetoken = current_plot.token;
		coordinate cp;

		boolean variable_color = false;
		double variable_color_value;
		if ((current_plot.lp_properties.pm3d_color.type == DefineConstants.TC_RGB) && (current_plot.lp_properties.pm3d_color.value < 0))
			variable_color = true;
		if (current_plot.lp_properties.pm3d_color.type == DefineConstants.TC_Z)
			variable_color = true;
		if (current_plot.lp_properties.l_type == DefineConstants.LT_COLORFROMCOLUMN)
			variable_color = true;

		/* eval_plots has already opened file */

		/* HBB 2000504: For most 2D plot styles the 'z' coordinate is unused.
		 * Set it to NO_AXIS to account for that. For styles that use
		 * the z coordinate as a real coordinate (i.e. not a width or
		 * 'delta' component, change the setting inside the switch: */
		current_plot.z_axis = DefineConstants.NO_AXIS;

		/* HBB NEW 20060427: if there's only one, explicit using column,
		 * it's y data.  df_axis[] has to reflect that, so df_readline()
		 * will expect time/date input. */
		if (GlobalMembersDatafile.df_no_use_specs == 1)
			GlobalMembersDatafile.df_axis[0] = GlobalMembersDatafile.df_axis[1];

		switch (current_plot.plot_style) // set maximum columns to scan
		{
		case XYERRORLINES:
		case XYERRORBARS:
		case BOXXYERROR:
			min_cols = 4;
			max_cols = 7; // HBB FIXME 20060427: what's 7th?

			if (GlobalMembersDatafile.df_no_use_specs >= 6)
			{
				/* HBB 20060427: signal 3rd and 4th column are absolute x
				 * data --- needed so time/date parsing works */
				GlobalMembersDatafile.df_axis[2] = GlobalMembersDatafile.df_axis[3] = GlobalMembersDatafile.df_axis[0];
				/* and 5th and 6th are absolute y data */
				GlobalMembersDatafile.df_axis[4] = GlobalMembersDatafile.df_axis[5] = GlobalMembersDatafile.df_axis[1];
			}

			break;

		case FINANCEBARS:
		case CANDLESTICKS:
			/* HBB 20000504: use 'z' coordinate for y-axis quantity */
			current_plot.z_axis = current_plot.y_axis;
			min_cols = max_cols = 5;
			/* HBB 20060427: signal 3rd and 4th column are absolute y data
			 * --- needed so time/date parsing works */
			GlobalMembersDatafile.df_axis[2] = GlobalMembersDatafile.df_axis[3] = GlobalMembersDatafile.df_axis[4] = GlobalMembersDatafile.df_axis[1];
			break;

		case BOXERROR:
			min_cols = 3; // HBB 20040520: fixed, was 4
			max_cols = 5;

			/* There are four(!) possible cases: */
			/* 3 cols --> (x,y,dy), auto dx */
			/* 4 cols, boxwidth==-2 --> (x,y,ylow,yhigh), auto dx */
			/* 4 cols, boxwidth!=-2 --> (x,y,dy,dx) */
			/* 5 cols --> (x,y,ylow,yhigh,dx) */
			if ((GlobalMembersDatafile.df_no_use_specs == 4 && boxwidth == -2) || GlobalMembersDatafile.df_no_use_specs == 5)
				/* HBB 20060427: signal 3rd and 4th column are absolute y
				 * data --- needed so time/date parsing works */
				GlobalMembersDatafile.df_axis[2] = GlobalMembersDatafile.df_axis[3] = GlobalMembersDatafile.df_axis[1];
			break;

		case VECTOR: // x, y, dx, dy, variable_color
			min_cols = 4;
			max_cols = 5;
			break;

		case XERRORLINES:
		case XERRORBARS:
			min_cols = 3;
			max_cols = 4;
			if (GlobalMembersDatafile.df_no_use_specs == 4)
				/* HBB 20060427: signal 3rd and 4th column are absolute x
				 * data --- needed so time/date parsing works */
				GlobalMembersDatafile.df_axis[2] = GlobalMembersDatafile.df_axis[3] = GlobalMembersDatafile.df_axis[0];
			break;

		case YERRORLINES:
		case YERRORBARS:
			min_cols = 3;
			max_cols = 4;
			if (GlobalMembersDatafile.df_no_use_specs == 4)
				/* HBB 20060427: signal 3rd and 4th column are absolute y
				 * data --- needed so time/date parsing works */
				GlobalMembersDatafile.df_axis[2] = GlobalMembersDatafile.df_axis[3] = GlobalMembersDatafile.df_axis[1];
			break;

		case HISTOGRAMS:
			min_cols = 1;
			max_cols = 3;
			break;

		case BOXES:
			min_cols = 1;
			max_cols = 4;

			break;

		case FILLEDCURVES:
			min_cols = 1;
			max_cols = 3;
			GlobalMembersDatafile.df_axis[2] = GlobalMembersDatafile.df_axis[1]; // Both curves use same y axis
			break;

		case IMPULSES: // 2 + possible variable color
		case LINES:
		case DOTS:
			min_cols = 1;
			max_cols = 3;
			break;

		case LABELPOINTS:
			/* 3 column data: X Y Label */
			/* 4th column allows rgb variable */
			min_cols = 3;
			max_cols = 4;
			GlobalMembersDatafile.expect_string((byte) 3);
			break;

		case IMAGE:
			min_cols = 3;
			max_cols = 3;
			break;

		case RGBIMAGE:
			min_cols = 5;
			max_cols = 6;
			break;

		case RGBA_IMAGE:
			min_cols = 6;
			max_cols = 6;
			break;

			///#ifdef EAM_OBJECTS
		case CIRCLES: // 3 + possible variable color
			min_cols = 3;
			max_cols = 4;
			break;
			///#endif

		case POINTSTYLE:
		case LINESPOINTS:
			/* Allow 3rd column because of 'pointsize variable' */
			/* Allow 4th column because of 'lc rgb variable' */
			min_cols = 1;
			max_cols = 4;
			break;

		default:
			min_cols = 1;
			max_cols = 2;
			break;
		}

		if (current_plot.plot_smooth == PLOT_SMOOTH.SMOOTH_ACSPLINES)
		{
			max_cols = 3;
			current_plot.z_axis = AXIS_INDEX.FIRST_Z_AXIS.getValue();
			GlobalMembersDatafile.df_axis[2] = AXIS_INDEX.FIRST_Z_AXIS;
		}

		if (GlobalMembersDatafile.df_no_use_specs > max_cols)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Too many using specs for this style");

		if (GlobalMembersDatafile.df_no_use_specs > 0 && GlobalMembersDatafile.df_no_use_specs < min_cols)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Not enough columns for this style");

		i = 0;

		/* If the user has set an explicit locale for numeric input, apply it */
		/* here so that it affects data fields read from the input file.      */
		do {if (GlobalMembersUtil.numeric_locale != null && (StringFunctions.strcmp(GlobalMembersUtil.numeric_locale,"C") != 0)) setlocale(__LC_NUMERIC,GlobalMembersUtil.numeric_locale);} while (false);

		while ((j = GlobalMembersDatafile.df_readline(v, max_cols)) != DefineConstants.DF_EOF)
		{
			boolean doImage = false;
			boolean doHErrBar = false;

			/* j <= max_cols */

			if (i >= current_plot.p_max)
			{
				/* overflow about to occur. Extend size of points[]
				 * array. Double the size, and add 1000 points, to avoid
				 * needlessly small steps. */
				GlobalMembersPlot2d.cp_extend(current_plot, i + i + 1000);
			}

			if (j > 0)
			{
				/* Allow for optional columns.  Currently only used for a few styles, */
				/* but could be extended to a more general mechanism.                 */
				variable_color_value = 0;
				if (variable_color)
				{
					//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
					//				static sbyte *errmsg = "Not enough columns for variable color";
					switch (current_plot.plot_style)
					{
					case VECTOR:
						if (j < 5)
							GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, get_data_errmsg);
					case CIRCLES:
						if (j < 4)
							GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, get_data_errmsg);
					case BOXES:
						if (j < 3)
							GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, get_data_errmsg);
						variable_color_value = v[--j];
					default:
						break;
					}
				}
			}
			switch (j)
			{
			default:
			{
				GlobalMembersDatafile.df_close();
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "internal error : df_readline returned %d : datafile line %d", j, GlobalMembersDatafile.df_line_number);
			}

			case DefineConstants.DF_MISSING:
				/* Plot type specific handling of missing points goes here. */
				if (current_plot.plot_style == PLOT_STYLE.HISTOGRAMS)
				{
					current_plot.points.get(i).type = coord_type.UNDEFINED;
					i++;
					continue;
				}

				/* Jun 2006 - Return to behavior of 3.7 and current docs:
				 *            do not interrupt plotted line because of missing data
				 */
				PrintfFunctions.fprintf(DefineConstants.stderr,"Missing datum %d\n", i);
				continue;

			case DefineConstants.DF_UNDEFINED:
				/* NaN or bad result from extended using expression */
				current_plot.points.get(i).type = coord_type.UNDEFINED;
				i++;
				continue;

			case DefineConstants.DF_FIRST_BLANK:
				/* The binary input routines generate DF_FIRST_BLANK at the end
				 * of scan lines, so that the data may be used for the isometric
				 * splots.  Rather than turning that off inside the binary
				 * reading routine based upon the plot mode, DF_FIRST_BLANK is
				 * ignored for certain plot types requiring 3D coordinates in
				 * MODE_PLOT.
				 */
				if (current_plot.plot_style == PLOT_STYLE.IMAGE || current_plot.plot_style == PLOT_STYLE.RGBIMAGE || current_plot.plot_style == PLOT_STYLE.RGBA_IMAGE)
					continue;

				/* break in data, make next point undefined */
				/* FIXME: We really should distinguish between a blank	*/
				/*        line and an undefined value on a non-blank line.	*/
				current_plot.points.get(i).type = coord_type.UNDEFINED;
				i++;
				continue;

			case DefineConstants.DF_SECOND_BLANK:
				/* second blank line. We dont do anything
				 * (we did everything when we got FIRST one)
				 */
				continue;

			case DefineConstants.DF_FOUND_KEY_TITLE:
				GlobalMembersDatafile.df_set_key_title(current_plot);
				continue;
			case DefineConstants.DF_KEY_TITLE_MISSING:
				PrintfFunctions.fprintf(DefineConstants.stderr,"get_data: key title not found in requested column\n");
				continue;

			case 0: // not blank line, but df_readline couldn't parse it
			{
				GlobalMembersDatafile.df_close();
				GlobalMembersBf_test.int_error(current_plot.token, "Bad data on line %d", GlobalMembersDatafile.df_line_number);
			}

			case 1:
			{ // only one number
				/* x is index, assign number to y */
				v[1] = v[0];
				v[0] = GlobalMembersDatafile.df_datum;
				/* nobreak */
			}

			case 2:
				doHErrBar = true;
				break;


			case 3:
				/* x, y, ydelta OR x, y, xdelta OR x, y, width */
				if (current_plot.plot_smooth == PLOT_SMOOTH.SMOOTH_ACSPLINES)
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0], v[1], v[1], v[2]);
				else
					switch (current_plot.plot_style)
					{

					case HISTOGRAMS:
						if (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_ERRORBARS.getValue()) {
							doHErrBar = true;
							break;
						} else {
							/* fall through */
						}
					default:
						GlobalMembersUtil.int_warn(storetoken, "This plot style does not work with 3 cols. Setting to yerrorbars");
						current_plot.plot_style = PLOT_STYLE.YERRORBARS;
						/* fall through */

					case FILLEDCURVES:
						current_plot.filledcurves_options.closeto = filledcurves_opts_id.FILLEDCURVES_BETWEEN.getValue();
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0], v[1], v[2], -1.0);
						break;

					case YERRORLINES:
					case YERRORBARS:
					case BOXERROR: // x, y, dy
						/* auto width if boxes, else ignored */
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0], v[1] - v[2], v[1] + v[2], -1.0);
						break;

					case XERRORLINES:
					case XERRORBARS:
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] - v[2], v[0] + v[2], v[1], v[1], 0.0);
						break;

					case BOXES:
						/* calculate xmin and xmax here, so that logs are taken if if necessary */
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] - v[2] / 2, v[0] + v[2] / 2, v[1], variable_color_value, 0.0);
						break;

					case LABELPOINTS:
						/* Load the coords just as we would have for a point plot */
						GlobalMembersPlot2d.store2d_point(current_plot, i, v[0], v[1], v[0], v[0], v[1], v[1], -1.0);
						/* Allocate and fill in a text_label structure to match it */
						GlobalMembersPlot2d.store_label(current_plot.labels, (current_plot.points.get(i)), i, GlobalMembersDatafile.df_tokens[2], 0.0);
						i++;
						break;

					case IMAGE: // x_center y_center color_value
						GlobalMembersPlot2d.store2d_point(current_plot, i, v[0], v[1], v[0], v[0], v[1], v[1], v[2]);
						cp = (current_plot.points.get(i));
						{
							coord_type c_type_tmp = cp.type;
							do
							{
								if (AXIS_INDEX.COLOR_AXIS.getValue() == DefineConstants.NO_AXIS)
									break;
								if (!(v[2] > -DefineConstants.VERYLARGE && v[2] < DefineConstants.VERYLARGE))
								{
									c_type_tmp = coord_type.UNDEFINED;
									cp.ylow = v[2];
									break;
								}
								if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log)
								{
									if (v[2] < 0.0)
									{
										c_type_tmp = coord_type.UNDEFINED;
										cp.ylow = v[2];
										break;
									}
									else if (v[2] == 0.0)
									{
										cp.ylow = -DefineConstants.VERYLARGE;
										c_type_tmp = coord_type.OUTRANGE;
										break;
									}
									else
									{
										cp.ylow = (Math.log(v[2]) / GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log_base);
									}
								}
								else
									cp.ylow = v[2];
								if (current_plot.noautoscale)
									break;
								if (c_type_tmp != coord_type.INRANGE)
									break;
								if (AXIS_INDEX.COLOR_AXIS.getValue() < 0)
									break;
								if (v[2] < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min)
									GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min = v[2];
								if (v[2] < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min)
								{
									if ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
										GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min = v[2];
									else
									{
										c_type_tmp = coord_type.OUTRANGE;
										break;
									}
								}
								if (v[2] > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max)
									GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max = v[2];
								if (v[2] > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max)
								{
									if ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
										GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max = v[2];
									else
									{
										c_type_tmp = coord_type.OUTRANGE;
									}
								}
							} while (false);
						};
						i++;
						break;

					case POINTSTYLE: // x, y, variable point size or variable color
					case LINESPOINTS:
					case IMPULSES:
					case LINES:
					case DOTS:
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0], v[1], v[2], v[2]);
						break;

						///#ifdef EAM_OBJECTS
					case CIRCLES: // x, y, radius
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] - v[2], v[0] + v[2], v[1], variable_color_value, v[2]);
						break;
						///#endif
					} //inner switch

				break;



			case 4:
				/* x, y, ylow, yhigh OR
				 * x, y, xlow, xhigh OR
				 * x, y, xdelta, ydelta OR
				 * x, y, ydelta, width
				 */

				switch (current_plot.plot_style)
				{
				default:
					GlobalMembersUtil.int_warn(storetoken, "This plot style does not work with 4 cols. Setting to yerrorbars");
					current_plot.plot_style = PLOT_STYLE.YERRORBARS;
					/* fall through */

				case YERRORLINES:
				case YERRORBARS:
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0], v[2], v[3], -1.0);
					break;

				case BOXXYERROR: // x, y, dx, dy
				case XYERRORLINES:
				case XYERRORBARS:
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] - v[2], v[0] + v[2], v[1] - v[3], v[1] + v[3], 0.0);
					break;


				case BOXES:
					/* x, y, xmin, xmax */
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[2], v[3], v[1], variable_color_value, 0.0);
					break;

				case XERRORLINES:
				case XERRORBARS:
					/* x, y, xmin, xmax */
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[2], v[3], v[1], v[1], 0.0);
					break;

				case BOXERROR:
					if (boxwidth == -2)
						/* x,y, ylow, yhigh --- width automatic */
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0], v[2], v[3], -1.0);
					else
						/* x, y, dy, width */
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] - v[3] / 2, v[0] + v[3] / 2, v[1] - v[2], v[1] + v[2], 0.0);
					break;

				case VECTOR:
					/* x,y,dx,dy */
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0] + v[2], v[1], v[1] + v[3], variable_color_value);
					break;

				case POINTSTYLE: // x, y, variable point size and variable color
				case LINESPOINTS:
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0], v[1], v[3], v[2]);
					break;

				case LABELPOINTS:
					/* Load the coords just as we would have for a point plot */
					GlobalMembersPlot2d.store2d_point(current_plot, i, v[0], v[1], v[0], v[0], v[1], v[1], -1.0);
					/* Allocate and fill in a text_label structure to match it */
					GlobalMembersPlot2d.store_label(current_plot.labels, (current_plot.points.get(i)), i, GlobalMembersDatafile.df_tokens[2], v[3]);
					i++;
					break;

				} //inner switch

				break;


			case 5:
			{ // x, y, ylow, yhigh, width  or  x open low high close
				switch (current_plot.plot_style)
				{
				default:
					GlobalMembersUtil.int_warn(storetoken, "Unrecognized 5 column plot style; resetting to boxerrorbars");
					current_plot.plot_style = PLOT_STYLE.BOXERROR;
					/*fall through */

				case BOXERROR: // x, y, ylow, yhigh, width
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] - v[4] / 2, v[0] + v[4] / 2, v[2], v[3], 0.0);
					break;

				case FINANCEBARS: // x yopen ylow yhigh yclose
				case CANDLESTICKS:
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0], v[2], v[3], v[4]);
					break;

				case RGBIMAGE: // x_center y_center r_value g_value b_value (rgb)
					doImage = true;
					break;
				}
				break;
			}

			case 7:
				/* same as six columns. Width ignored */
				/* eh ? - fall through */
			case 6:
				/* x, y, xlow, xhigh, ylow, yhigh */
				switch (current_plot.plot_style)
				{
				default:
					GlobalMembersUtil.int_warn(storetoken, "This plot style not work with 6 cols. Setting to xyerrorbars");
					current_plot.plot_style = PLOT_STYLE.XYERRORBARS;
					/*fall through */
				case XYERRORLINES:
				case XYERRORBARS:
				case BOXXYERROR:
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[2], v[3], v[4], v[5], 0.0);
					break;
				case RGBA_IMAGE: // x_cent y_cent red green blue alpha
				case RGBIMAGE: // x_cent y_cent red green blue
					doImage = true;
					break;
				}

			} //switch

			if (doImage) {
				GlobalMembersPlot2d.store2d_point(current_plot, i, v[0], v[1], v[0], v[0], v[1], v[1], v[2]);
				/* We will autoscale the RGB components to  a total range [0:255]
				 * so we don't need to do any fancy scaling here.
				 */
				cp = (current_plot.points.get(i));
				cp.yhigh = v[2];
				cp.xlow = v[3];
				cp.xhigh = v[4];
				cp.ylow = v[5]; // Alpha channel
				i++;
			}

			if (doHErrBar) {
				if (current_plot.plot_style == PLOT_STYLE.HISTOGRAMS)
				{
					if (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_ERRORBARS.getValue())
					{
						/* The code is a tangle, but we can get here with j = 1, 2, or 3 */
						if (j == 1)
							GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Not enough columns in using specification");
						else if (j == 2)
						{
							v[3] = v[0] + v[1];
							v[2] = v[0] - v[1];
						}
						else
						{
							v[3] = v[2];
							v[2] = v[1];
						}
						v[1] = v[0];
						v[0] = GlobalMembersDatafile.df_datum;
					}
					else if (j >= 2)
						GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Too many columns in using specification");
					else
						v[2] = v[3] = v[1];

					if (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_TOWERS.getValue())
					{
						histogram_rightmost = current_plot.histogram_sequence + current_plot.histogram.start;
						current_plot.histogram.end = histogram_rightmost;
					}
					else if (v[0] + current_plot.histogram.start > histogram_rightmost)
					{
						histogram_rightmost = v[0] + current_plot.histogram.start;
						current_plot.histogram.end = histogram_rightmost;
					}
					/* Histogram boxwidths are always absolute */
					if (boxwidth > 0)
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] - boxwidth / 2, v[0] + boxwidth / 2, v[2], v[3], 0.0);
					else
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] - 0.5, v[0] + 0.5, v[2], v[3], 0.0);

					/* x, y */
					/* ylow and yhigh are same as y */

				}
				else if ((current_plot.plot_style == PLOT_STYLE.BOXES) && boxwidth > 0 && boxwidth_is_absolute)
				{
					/* calculate width now */
					if (GlobalMembersAxis.axis_array[current_plot.x_axis].log)
					{
						double base = GlobalMembersAxis.axis_array[current_plot.x_axis].base;
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] * Math.pow(base, -boxwidth / 2.), v[0] * Math.pow(base, boxwidth / 2.), v[1], variable_color_value, 0.0);
					}
					else
						GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0] - boxwidth / 2, v[0] + boxwidth / 2, v[1], variable_color_value, 0.0);

				}
				else
				{
					if (current_plot.plot_style == PLOT_STYLE.CANDLESTICKS || current_plot.plot_style == PLOT_STYLE.FINANCEBARS)
					{
						GlobalMembersUtil.int_warn(storetoken, "This plot style does not work with 1 or 2 cols. Setting to points");
						current_plot.plot_style = PLOT_STYLE.POINTSTYLE;
					}
					/* xlow and xhigh are same as x */
					/* auto width if boxes, else ignored */
					GlobalMembersPlot2d.store2d_point(current_plot, i++, v[0], v[1], v[0], v[0], v[1], variable_color_value, -1.0);
				}
			}

		} //while

		current_plot.p_count = i;
		GlobalMembersPlot2d.cp_extend(current_plot, i); // shrink to fit

		GlobalMembersDatafile.df_close();

		/* We are finished reading user input; return to C locale for internal use */
		do {if (GlobalMembersUtil.numeric_locale != null && StringFunctions.strcmp(GlobalMembersUtil.numeric_locale,"C")) setlocale(__LC_NUMERIC,"C");} while (false);

		return i; // i==0 indicates an 'empty' file
	}

	/* called by get_data for each point */
	public static void store2d_point(curve_points current_plot, int i, double x, double y, double xlow, double xhigh, double ylow, double yhigh, double width)
	{
		coordinate cp = (current_plot.points.get(i));
		coord_type dummy_type = coord_type.INRANGE; // sometimes we dont care about outranging

		/* jev -- pass data values thru user-defined function */
		/* div -- y is dummy variable 2 - copy value there */
		if (GlobalMembersDatafile.ydata_func.at != null)
		{
			value val = new value();

			GlobalMembersEval.Gcomplex(GlobalMembersDatafile.ydata_func.dummy_values[0], y, 0.0);
			GlobalMembersDatafile.ydata_func.dummy_values[2] = GlobalMembersDatafile.ydata_func.dummy_values[0];
			GlobalMembersEval.evaluate_at(GlobalMembersDatafile.ydata_func.at, val);
			y = GlobalMembersEval.undefined ? 0.0 : GlobalMembersEval.real(val);

			/* EAM FIXME - filtering ylow and yhigh is nonsense for many plot styles */

			GlobalMembersEval.Gcomplex(GlobalMembersDatafile.ydata_func.dummy_values[0], ylow, 0.0);
			GlobalMembersDatafile.ydata_func.dummy_values[2] = GlobalMembersDatafile.ydata_func.dummy_values[0];
			GlobalMembersEval.evaluate_at(GlobalMembersDatafile.ydata_func.at, val);
			ylow = GlobalMembersEval.undefined ? 0 : GlobalMembersEval.real(val);

			GlobalMembersEval.Gcomplex(GlobalMembersDatafile.ydata_func.dummy_values[0], yhigh, 0.0);
			GlobalMembersDatafile.ydata_func.dummy_values[2] = GlobalMembersDatafile.ydata_func.dummy_values[0];
			GlobalMembersEval.evaluate_at(GlobalMembersDatafile.ydata_func.at, val);
			yhigh = GlobalMembersEval.undefined ? 0 : GlobalMembersEval.real(val);
		}
		dummy_type = cp.type = coord_type.INRANGE;

		if (GlobalMembersGadgets.polar)
		{
			double newx;
			double newy;
			if (((GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) == 0) && y > GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].max)
			{
				cp.type = coord_type.OUTRANGE;
			}
			if ((GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) == 0)
			{
				/* we store internally as if plotting r(t)-rmin */
				y -= GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].min;
			}
			newx = y * Math.cos(x * GlobalMembersGadgets.ang2rad);
			newy = y * Math.sin(x * GlobalMembersGadgets.ang2rad);
			y = newy;
			x = newx;

			if (((GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) == 0) && yhigh > GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].max)
			{
				cp.type = coord_type.OUTRANGE;
			}
			if ((GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) == 0)
			{
				/* we store internally as if plotting r(t)-rmin */
				yhigh -= GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].min;
			}
			newx = yhigh * Math.cos(xhigh * GlobalMembersGadgets.ang2rad);
			newy = yhigh * Math.sin(xhigh * GlobalMembersGadgets.ang2rad);
			yhigh = newy;
			xhigh = newx;

			if (((GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) == 0) && ylow > GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].max)
			{
				cp.type = coord_type.OUTRANGE;
			}
			if ((GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) == 0)
			{
				/* we store internally as if plotting r(t)-rmin */
				ylow -= GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].min;
			}
			newx = ylow * Math.cos(xlow * GlobalMembersGadgets.ang2rad);
			newy = ylow * Math.sin(xlow * GlobalMembersGadgets.ang2rad);
			ylow = newy;
			xlow = newx;
		}
		/* return immediately if x or y are undefined
		 * we dont care if outrange for high/low.
		 * BUT if high/low undefined (ie log( < 0 ), no number is stored,
		 * but graphics.c doesn't know.
		 * explicitly store -VERYLARGE;
		 */
		do
		{
			if (current_plot.x_axis == DefineConstants.NO_AXIS)
				break;
			if (!(x > -DefineConstants.VERYLARGE && x < DefineConstants.VERYLARGE))
			{
				cp.type = coord_type.UNDEFINED;
				return;
			}
			if (GlobalMembersAxis.axis_array[current_plot.x_axis].log)
			{
				if (x < 0.0)
				{
					cp.type = coord_type.UNDEFINED;
					return;
				}
				else if (x == 0.0)
				{
					cp.x = -DefineConstants.VERYLARGE;
					cp.type = coord_type.OUTRANGE;
					break;
				}
				else
				{
					cp.x = (Math.log(x) / GlobalMembersAxis.axis_array[current_plot.x_axis].log_base);
				}
			}
			else
				cp.x = x;
			if (current_plot.noautoscale)
				break;
			if (cp.type != coord_type.INRANGE)
				break;
			if ((int)current_plot.x_axis < 0)
				break;
			if (x < GlobalMembersAxis.axis_array[current_plot.x_axis].data_min)
				GlobalMembersAxis.axis_array[current_plot.x_axis].data_min = x;
			if (x < GlobalMembersAxis.axis_array[current_plot.x_axis].min)
			{
				if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
					GlobalMembersAxis.axis_array[current_plot.x_axis].min = x;
				else
				{
					cp.type = coord_type.OUTRANGE;
					break;
				}
			}
			if (x > GlobalMembersAxis.axis_array[current_plot.x_axis].data_max)
				GlobalMembersAxis.axis_array[current_plot.x_axis].data_max = x;
			if (x > GlobalMembersAxis.axis_array[current_plot.x_axis].max)
			{
				if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
					GlobalMembersAxis.axis_array[current_plot.x_axis].max = x;
				else
				{
					cp.type = coord_type.OUTRANGE;
				}
			}
		} while (false);
		do
		{
			if (current_plot.y_axis == DefineConstants.NO_AXIS)
				break;
			if (!(y > -DefineConstants.VERYLARGE && y < DefineConstants.VERYLARGE))
			{
				cp.type = coord_type.UNDEFINED;
				return;
			}
			if (GlobalMembersAxis.axis_array[current_plot.y_axis].log)
			{
				if (y < 0.0)
				{
					cp.type = coord_type.UNDEFINED;
					return;
				}
				else if (y == 0.0)
				{
					cp.y = -DefineConstants.VERYLARGE;
					cp.type = coord_type.OUTRANGE;
					break;
				}
				else
				{
					cp.y = (Math.log(y) / GlobalMembersAxis.axis_array[current_plot.y_axis].log_base);
				}
			}
			else
				cp.y = y;
			if (current_plot.noautoscale)
				break;
			if (cp.type != coord_type.INRANGE)
				break;
			if ((int)current_plot.y_axis < 0)
				break;
			if (y < GlobalMembersAxis.axis_array[current_plot.y_axis].data_min)
				GlobalMembersAxis.axis_array[current_plot.y_axis].data_min = y;
			if (y < GlobalMembersAxis.axis_array[current_plot.y_axis].min)
			{
				if ((GlobalMembersAxis.axis_array[current_plot.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
					GlobalMembersAxis.axis_array[current_plot.y_axis].min = y;
				else
				{
					cp.type = coord_type.OUTRANGE;
					break;
				}
			}
			if (y > GlobalMembersAxis.axis_array[current_plot.y_axis].data_max)
				GlobalMembersAxis.axis_array[current_plot.y_axis].data_max = y;
			if (y > GlobalMembersAxis.axis_array[current_plot.y_axis].max)
			{
				if ((GlobalMembersAxis.axis_array[current_plot.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
					GlobalMembersAxis.axis_array[current_plot.y_axis].max = y;
				else
				{
					cp.type = coord_type.OUTRANGE;
				}
			}
		} while (false);

		switch (current_plot.plot_style)
		{
		case POINTSTYLE: // Only x and y are relevant to axis scaling
		case LINES:
		case LINESPOINTS:
		case LABELPOINTS:
		case DOTS:
		case IMPULSES:
		case STEPS:
		case FSTEPS:
		case HISTEPS:
			cp.xlow = xlow;
			cp.xhigh = xhigh;
			cp.ylow = ylow;
			cp.yhigh = yhigh;
			break;
		case BOXES: // auto-scale to xlow xhigh
		case CIRCLES:
			cp.ylow = y;
			cp.yhigh = yhigh; // really variable_color_data
			do
			{
				if (current_plot.x_axis == DefineConstants.NO_AXIS)
					break;
				if (!(xlow > -DefineConstants.VERYLARGE && xlow < DefineConstants.VERYLARGE))
				{
					dummy_type = coord_type.UNDEFINED;
					cp.xlow = -DefineConstants.VERYLARGE;
					break;
				}
				if (GlobalMembersAxis.axis_array[current_plot.x_axis].log)
				{
					if (xlow < 0.0)
					{
						dummy_type = coord_type.UNDEFINED;
						cp.xlow = -DefineConstants.VERYLARGE;
						break;
					}
					else if (xlow == 0.0)
					{
						cp.xlow = -DefineConstants.VERYLARGE;
						dummy_type = coord_type.OUTRANGE;
						break;
					}
					else
					{
						cp.xlow = (Math.log(xlow) / GlobalMembersAxis.axis_array[current_plot.x_axis].log_base);
					}
				}
				else
					cp.xlow = xlow;
				if (current_plot.noautoscale)
					break;
				if (dummy_type != coord_type.INRANGE)
					break;
				if ((int)current_plot.x_axis < 0)
					break;
				if (xlow < GlobalMembersAxis.axis_array[current_plot.x_axis].data_min)
					GlobalMembersAxis.axis_array[current_plot.x_axis].data_min = xlow;
				if (xlow < GlobalMembersAxis.axis_array[current_plot.x_axis].min)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.x_axis].min = xlow;
					else
					{
						dummy_type = coord_type.OUTRANGE;
						break;
					}
				}
				if (xlow > GlobalMembersAxis.axis_array[current_plot.x_axis].data_max)
					GlobalMembersAxis.axis_array[current_plot.x_axis].data_max = xlow;
				if (xlow > GlobalMembersAxis.axis_array[current_plot.x_axis].max)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.x_axis].max = xlow;
					else
					{
						dummy_type = coord_type.OUTRANGE;
					}
				}
			} while (false);
			do
			{
				if (current_plot.x_axis == DefineConstants.NO_AXIS)
					break;
				if (!(xhigh > -DefineConstants.VERYLARGE && xhigh < DefineConstants.VERYLARGE))
				{
					dummy_type = coord_type.UNDEFINED;
					cp.xhigh = -DefineConstants.VERYLARGE;
					break;
				}
				if (GlobalMembersAxis.axis_array[current_plot.x_axis].log)
				{
					if (xhigh < 0.0)
					{
						dummy_type = coord_type.UNDEFINED;
						cp.xhigh = -DefineConstants.VERYLARGE;
						break;
					}
					else if (xhigh == 0.0)
					{
						cp.xhigh = -DefineConstants.VERYLARGE;
						dummy_type = coord_type.OUTRANGE;
						break;
					}
					else
					{
						cp.xhigh = (Math.log(xhigh) / GlobalMembersAxis.axis_array[current_plot.x_axis].log_base);
					}
				}
				else
					cp.xhigh = xhigh;
				if (current_plot.noautoscale)
					break;
				if (dummy_type != coord_type.INRANGE)
					break;
				if ((int)current_plot.x_axis < 0)
					break;
				if (xhigh < GlobalMembersAxis.axis_array[current_plot.x_axis].data_min)
					GlobalMembersAxis.axis_array[current_plot.x_axis].data_min = xhigh;
				if (xhigh < GlobalMembersAxis.axis_array[current_plot.x_axis].min)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.x_axis].min = xhigh;
					else
					{
						dummy_type = coord_type.OUTRANGE;
						break;
					}
				}
				if (xhigh > GlobalMembersAxis.axis_array[current_plot.x_axis].data_max)
					GlobalMembersAxis.axis_array[current_plot.x_axis].data_max = xhigh;
				if (xhigh > GlobalMembersAxis.axis_array[current_plot.x_axis].max)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.x_axis].max = xhigh;
					else
					{
						dummy_type = coord_type.OUTRANGE;
					}
				}
			} while (false);
			break;
		default: // auto-scale to xlow xhigh ylow yhigh
			do
			{
				if (current_plot.x_axis == DefineConstants.NO_AXIS)
					break;
				if (!(xlow > -DefineConstants.VERYLARGE && xlow < DefineConstants.VERYLARGE))
				{
					dummy_type = coord_type.UNDEFINED;
					cp.xlow = -DefineConstants.VERYLARGE;
					break;
				}
				if (GlobalMembersAxis.axis_array[current_plot.x_axis].log)
				{
					if (xlow < 0.0)
					{
						dummy_type = coord_type.UNDEFINED;
						cp.xlow = -DefineConstants.VERYLARGE;
						break;
					}
					else if (xlow == 0.0)
					{
						cp.xlow = -DefineConstants.VERYLARGE;
						dummy_type = coord_type.OUTRANGE;
						break;
					}
					else
					{
						cp.xlow = (Math.log(xlow) / GlobalMembersAxis.axis_array[current_plot.x_axis].log_base);
					}
				}
				else
					cp.xlow = xlow;
				if (current_plot.noautoscale)
					break;
				if (dummy_type != coord_type.INRANGE)
					break;
				if ((int)current_plot.x_axis < 0)
					break;
				if (xlow < GlobalMembersAxis.axis_array[current_plot.x_axis].data_min)
					GlobalMembersAxis.axis_array[current_plot.x_axis].data_min = xlow;
				if (xlow < GlobalMembersAxis.axis_array[current_plot.x_axis].min)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.x_axis].min = xlow;
					else
					{
						dummy_type = coord_type.OUTRANGE;
						break;
					}
				}
				if (xlow > GlobalMembersAxis.axis_array[current_plot.x_axis].data_max)
					GlobalMembersAxis.axis_array[current_plot.x_axis].data_max = xlow;
				if (xlow > GlobalMembersAxis.axis_array[current_plot.x_axis].max)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.x_axis].max = xlow;
					else
					{
						dummy_type = coord_type.OUTRANGE;
					}
				}
			} while (false);
			do
			{
				if (current_plot.x_axis == DefineConstants.NO_AXIS)
					break;
				if (!(xhigh > -DefineConstants.VERYLARGE && xhigh < DefineConstants.VERYLARGE))
				{
					dummy_type = coord_type.UNDEFINED;
					cp.xhigh = -DefineConstants.VERYLARGE;
					break;
				}
				if (GlobalMembersAxis.axis_array[current_plot.x_axis].log)
				{
					if (xhigh < 0.0)
					{
						dummy_type = coord_type.UNDEFINED;
						cp.xhigh = -DefineConstants.VERYLARGE;
						break;
					}
					else if (xhigh == 0.0)
					{
						cp.xhigh = -DefineConstants.VERYLARGE;
						dummy_type = coord_type.OUTRANGE;
						break;
					}
					else
					{
						cp.xhigh = (Math.log(xhigh) / GlobalMembersAxis.axis_array[current_plot.x_axis].log_base);
					}
				}
				else
					cp.xhigh = xhigh;
				if (current_plot.noautoscale)
					break;
				if (dummy_type != coord_type.INRANGE)
					break;
				if ((int)current_plot.x_axis < 0)
					break;
				if (xhigh < GlobalMembersAxis.axis_array[current_plot.x_axis].data_min)
					GlobalMembersAxis.axis_array[current_plot.x_axis].data_min = xhigh;
				if (xhigh < GlobalMembersAxis.axis_array[current_plot.x_axis].min)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.x_axis].min = xhigh;
					else
					{
						dummy_type = coord_type.OUTRANGE;
						break;
					}
				}
				if (xhigh > GlobalMembersAxis.axis_array[current_plot.x_axis].data_max)
					GlobalMembersAxis.axis_array[current_plot.x_axis].data_max = xhigh;
				if (xhigh > GlobalMembersAxis.axis_array[current_plot.x_axis].max)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.x_axis].max = xhigh;
					else
					{
						dummy_type = coord_type.OUTRANGE;
					}
				}
			} while (false);
			do
			{
				if (current_plot.y_axis == DefineConstants.NO_AXIS)
					break;
				if (!(ylow > -DefineConstants.VERYLARGE && ylow < DefineConstants.VERYLARGE))
				{
					dummy_type = coord_type.UNDEFINED;
					cp.ylow = -DefineConstants.VERYLARGE;
					break;
				}
				if (GlobalMembersAxis.axis_array[current_plot.y_axis].log)
				{
					if (ylow < 0.0)
					{
						dummy_type = coord_type.UNDEFINED;
						cp.ylow = -DefineConstants.VERYLARGE;
						break;
					}
					else if (ylow == 0.0)
					{
						cp.ylow = -DefineConstants.VERYLARGE;
						dummy_type = coord_type.OUTRANGE;
						break;
					}
					else
					{
						cp.ylow = (Math.log(ylow) / GlobalMembersAxis.axis_array[current_plot.y_axis].log_base);
					}
				}
				else
					cp.ylow = ylow;
				if (current_plot.noautoscale)
					break;
				if (dummy_type != coord_type.INRANGE)
					break;
				if ((int)current_plot.y_axis < 0)
					break;
				if (ylow < GlobalMembersAxis.axis_array[current_plot.y_axis].data_min)
					GlobalMembersAxis.axis_array[current_plot.y_axis].data_min = ylow;
				if (ylow < GlobalMembersAxis.axis_array[current_plot.y_axis].min)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.y_axis].min = ylow;
					else
					{
						dummy_type = coord_type.OUTRANGE;
						break;
					}
				}
				if (ylow > GlobalMembersAxis.axis_array[current_plot.y_axis].data_max)
					GlobalMembersAxis.axis_array[current_plot.y_axis].data_max = ylow;
				if (ylow > GlobalMembersAxis.axis_array[current_plot.y_axis].max)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.y_axis].max = ylow;
					else
					{
						dummy_type = coord_type.OUTRANGE;
					}
				}
			} while (false);
			do
			{
				if (current_plot.y_axis == DefineConstants.NO_AXIS)
					break;
				if (!(yhigh > -DefineConstants.VERYLARGE && yhigh < DefineConstants.VERYLARGE))
				{
					dummy_type = coord_type.UNDEFINED;
					cp.yhigh = -DefineConstants.VERYLARGE;
					break;
				}
				if (GlobalMembersAxis.axis_array[current_plot.y_axis].log)
				{
					if (yhigh < 0.0)
					{
						dummy_type = coord_type.UNDEFINED;
						cp.yhigh = -DefineConstants.VERYLARGE;
						break;
					}
					else if (yhigh == 0.0)
					{
						cp.yhigh = -DefineConstants.VERYLARGE;
						dummy_type = coord_type.OUTRANGE;
						break;
					}
					else
					{
						cp.yhigh = (Math.log(yhigh) / GlobalMembersAxis.axis_array[current_plot.y_axis].log_base);
					}
				}
				else
					cp.yhigh = yhigh;
				if (current_plot.noautoscale)
					break;
				if (dummy_type != coord_type.INRANGE)
					break;
				if ((int)current_plot.y_axis < 0)
					break;
				if (yhigh < GlobalMembersAxis.axis_array[current_plot.y_axis].data_min)
					GlobalMembersAxis.axis_array[current_plot.y_axis].data_min = yhigh;
				if (yhigh < GlobalMembersAxis.axis_array[current_plot.y_axis].min)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.y_axis].min = yhigh;
					else
					{
						dummy_type = coord_type.OUTRANGE;
						break;
					}
				}
				if (yhigh > GlobalMembersAxis.axis_array[current_plot.y_axis].data_max)
					GlobalMembersAxis.axis_array[current_plot.y_axis].data_max = yhigh;
				if (yhigh > GlobalMembersAxis.axis_array[current_plot.y_axis].max)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.y_axis].max = yhigh;
					else
					{
						dummy_type = coord_type.OUTRANGE;
					}
				}
			} while (false);
			break;
		}

		/* HBB 20010214: if z is not used for some actual value, just
		 * store 'width' to that axis and be done with it */
		if ((int)current_plot.z_axis != DefineConstants.NO_AXIS)
			do
			{
				if (current_plot.z_axis == DefineConstants.NO_AXIS)
					break;
				if (!(width > -DefineConstants.VERYLARGE && width < DefineConstants.VERYLARGE))
				{
					dummy_type = coord_type.UNDEFINED;
					cp.z = -DefineConstants.VERYLARGE;
					break;
				}
				if (GlobalMembersAxis.axis_array[current_plot.z_axis].log)
				{
					if (width < 0.0)
					{
						dummy_type = coord_type.UNDEFINED;
						cp.z = -DefineConstants.VERYLARGE;
						break;
					}
					else if (width == 0.0)
					{
						cp.z = -DefineConstants.VERYLARGE;
						dummy_type = coord_type.OUTRANGE;
						break;
					}
					else
					{
						cp.z = (Math.log(width) / GlobalMembersAxis.axis_array[current_plot.z_axis].log_base);
					}
				}
				else
					cp.z = width;
				if (current_plot.noautoscale)
					break;
				if (dummy_type != coord_type.INRANGE)
					break;
				if ((int)current_plot.z_axis < 0)
					break;
				if (width < GlobalMembersAxis.axis_array[current_plot.z_axis].data_min)
					GlobalMembersAxis.axis_array[current_plot.z_axis].data_min = width;
				if (width < GlobalMembersAxis.axis_array[current_plot.z_axis].min)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.z_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.z_axis].min = width;
					else
					{
						dummy_type = coord_type.OUTRANGE;
						break;
					}
				}
				if (width > GlobalMembersAxis.axis_array[current_plot.z_axis].data_max)
					GlobalMembersAxis.axis_array[current_plot.z_axis].data_max = width;
				if (width > GlobalMembersAxis.axis_array[current_plot.z_axis].max)
				{
					if ((GlobalMembersAxis.axis_array[current_plot.z_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[current_plot.z_axis].max = width;
					else
					{
						dummy_type = coord_type.OUTRANGE;
					}
				}
			} while (false);
		else
			cp.z = width;

		/* If we have variable color corresponding to a z-axis value, use it to autoscale */
		if (current_plot.lp_properties.pm3d_color.type == DefineConstants.TC_Z)
			do
			{
				if (AXIS_INDEX.COLOR_AXIS.getValue() == DefineConstants.NO_AXIS)
					break;
				if (!(cp.z > -DefineConstants.VERYLARGE && cp.z < DefineConstants.VERYLARGE))
				{
					dummy_type = coord_type.UNDEFINED;
					break;
				}
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log)
				{
					if (cp.z < 0.0)
					{
						dummy_type = coord_type.UNDEFINED;
						break;
					}
					else if (cp.z == 0.0)
					{
						cp.z = -DefineConstants.VERYLARGE;
						dummy_type = coord_type.OUTRANGE;
						break;
					}
					else
					{
						cp.z = (Math.log(cp.z) / GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log_base);
					}
				}
				else
					cp.z = cp.z;
				if (current_plot.noautoscale)
					break;
				if (dummy_type != coord_type.INRANGE)
					break;
				if (AXIS_INDEX.COLOR_AXIS.getValue() < 0)
					break;
				if (cp.z < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min)
					GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min = cp.z;
				if (cp.z < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min)
				{
					if ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min = cp.z;
					else
					{
						dummy_type = coord_type.OUTRANGE;
						break;
					}
				}
				if (cp.z > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max)
					GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max = cp.z;
				if (cp.z > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max)
				{
					if ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max = cp.z;
					else
					{
						dummy_type = coord_type.OUTRANGE;
					}
				}
			} while (false);

	} // store2d_point

	/*
	 * This parses the plot command after any range specifications. To support
	 * autoscaling on the x axis, we want any data files to define the x range,
	 * then to plot any functions using that range. We thus parse the input
	 * twice, once to pick up the data files, and again to pick up the functions.
	 * Definitions are processed twice, but that won't hurt.
	 * div - okay, it doesn't hurt, but every time an option as added for
	 * datafiles, code to parse it has to be added here. Change so that
	 * we store starting-token in the plot structure.
	 */
	public static void eval_plots()
	{
		int i;
		curve_points this_plot;
		curve_points tp_ptr;
		e_uses_axis[] uses_axis = new e_uses_axis[DefineConstants.AXIS_ARRAY_SIZE];
		int some_functions = 0;
		int plot_num;
		int line_num;
		int point_num;
		boolean in_parametric = false;
		boolean was_definition = false;
		int pattern_num;
		String xtitle = null;
		int begin_token = GlobalMembersCommand.c_token; // so we can rewind for second pass
		int start_token = 0;
		int end_token;
		legend_key key = GlobalMembersGadgets.keyT;

		double newhist_start = 0.0;
		int histogram_sequence = -1;
		int newhist_color = 0;
		int newhist_pattern = DefineConstants.LT_UNDEFINED;
		histogram_rightmost = 0.0;

		GlobalMembersGraphics.free_histlist(GlobalMembersGadgets.histogram_opts);
		GlobalMembersGraphics.init_histogram(null, null);

		uses_axis[AXIS_INDEX.FIRST_X_AXIS.getValue()].setValue(0);
		uses_axis[AXIS_INDEX.FIRST_Y_AXIS.getValue()].setValue(0);
		uses_axis[AXIS_INDEX.SECOND_X_AXIS.getValue()].setValue(0);
		uses_axis[AXIS_INDEX.SECOND_Y_AXIS.getValue()].setValue(0);

		/* Original Comment follows: */
		/* Reset first_plot. This is usually done at the end of this function.
		 * If there is an error within this function, the memory is left allocated,
		 * since we cannot call cp_free if the list is incomplete. Making sure that
		 * the list structure is always valid requires some rewriting */
		/* EAM Apr 2007 - but we need to keep the previous structures around in
		 * order to be able to refresh/zoom them without re-reading all the data.
		 */
		if (first_plot != null)
			GlobalMembersPlot2d.cp_free(first_plot);
		first_plot = null;

		tp_ptr = first_plot.getFirst();
		plot_num = 0;
		line_num = 0; // default line type
		point_num = 0; // default point type
		pattern_num = GlobalMembersGadgets.default_fillstyle.fillpattern; // default fill pattern

		xtitle = null;

		/* Assume that the input data can be re-read later */
		GlobalMembersGadgets.volatile_data = false;

		/* ** First Pass: Read through data files ***
		 * This pass serves to set the xrange and to parse the command, as well
		 * as filling in every thing except the function data. That is done after
		 * the xrange is defined.
		 */
		GlobalMembersParse.check_for_iteration();
		while (true)
		{
			if (GlobalMembersCommand.c_token >= GlobalMembersCommand.num_tokens || GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ";") != 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "function to plot expected");

			this_plot = null;
			if (!in_parametric && !was_definition)
				start_token = GlobalMembersCommand.c_token;

			if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "newhist$ogram") != 0)
			{
				lp_style_type lp = new lp_style_type(0, -2, 0, 0, 1.0, DefineConstants.PTSZ_DEFAULT, false, {DefineConstants.TC_DEFAULT, 0, 0.0});
				fill_style_type fs = new fill_style_type();
				int previous_token;
				GlobalMembersCommand.c_token++;
				histogram_sequence = -1;
				histogram_title = null;

				if (histogram_rightmost > 0)
					newhist_start = histogram_rightmost + 2;

				lp.l_type = line_num;
				fs.fillpattern = DefineConstants.LT_UNDEFINED;

				do
				{
					previous_token = GlobalMembersCommand.c_token;

					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "at") != 0)
					{
						GlobalMembersCommand.c_token++;
						newhist_start = GlobalMembersParse.real_expression();
					}

					/* Store title in temporary variable and then copy into the */
					/* new histogram structure when it is allocated.            */
					if (histogram_title == null && (GlobalMembersUtil.isstring(GlobalMembersCommand.c_token) != 0 || GlobalMembersUtil.type_udv(GlobalMembersCommand.c_token) == DATA_TYPES.STRING.getValue()))
						histogram_title = GlobalMembersUtil.try_to_get_string();

					/* Allow explicit starting color or pattern for this histogram */
					GlobalMembersMisc.lp_parse(lp, false, false);
					//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
					//ORIGINAL LINE: parse_fillstyle(&fs, FS_SOLID, 100, fs.fillpattern, default_fillstyle.border_color);
					GlobalMembersMisc.parse_fillstyle(fs, t_fillstyle.FS_SOLID.getValue(), 100, fs.fillpattern, GlobalMembersGadgets.default_fillstyle.border_color);

				} while (GlobalMembersCommand.c_token != previous_token);

				newhist_color = lp.l_type;
				newhist_pattern = fs.fillpattern;
			}
			else

				if (GlobalMembersUtil.is_definition(GlobalMembersCommand.c_token) != 0)
				{
					GlobalMembersCommand.define();
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") == 0)
					{
						was_definition = true;
						continue;
					}

				}
				else
				{
					int specs = 0;

					/* for datafile plot, record datafile spec for title */
					String name_str;

					boolean duplication = false;
					boolean set_smooth = false;
					boolean set_axes = false;
					boolean set_title = false;
					boolean set_with = false;
					boolean set_lpstyle = false;
					boolean set_fillstyle = false;
					boolean set_labelstyle = false;

					plot_num++;

					was_definition = false;
					GlobalMembersCommand.dummy_func = plot_func;
					/* should this be saved in "this_plot"? */
					name_str = GlobalMembersParse.string_or_express(null);
					GlobalMembersCommand.dummy_func = null;

					if (name_str != null) // data file to plot
					{
						if (GlobalMembersGadgets.parametric && in_parametric)
							GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "previous parametric function not fully specified");

						if (tp_ptr != null)
							this_plot = tp_ptr;
						else // no memory malloc()'d there yet
						{
							this_plot = GlobalMembersPlot2d.cp_alloc(DefineConstants.MIN_CRV_POINTS);
							tp_ptr = this_plot;
						}
						this_plot.plot_type = PLOT_TYPE.DATA;
						this_plot.plot_style = GlobalMembersGadgets.data_style;
						this_plot.plot_smooth = PLOT_SMOOTH.SMOOTH_NONE;
						this_plot.filledcurves_options.opt_given = 0;
						/* default no palette */
						this_plot.lp_properties.use_palette = false;

						/* up to MAXDATACOLS cols */
						GlobalMembersDatafile.df_set_plot_mode(MODE_PLOT_TYPE.MODE_PLOT.getValue()); // Needed for binary datafiles
						specs = GlobalMembersDatafile.df_open(name_str, DefineConstants.MAXDATACOLS, this_plot);

						/* include modifiers in default title */
						this_plot.token = end_token = GlobalMembersCommand.c_token - 1;

					}
					else
					{

						/* function to plot */

						some_functions = 1;
						if (GlobalMembersGadgets.parametric) // working on x parametric function
							in_parametric = !in_parametric;
						if (tp_ptr != null)
						{
							this_plot = tp_ptr;
							GlobalMembersPlot2d.cp_extend(this_plot, GlobalMembersGadgets.samples_1 + 1);
						} // no memory malloc()'d there yet
						else
						{
							this_plot = GlobalMembersPlot2d.cp_alloc(GlobalMembersGadgets.samples_1 + 1);
							tp_ptr = this_plot;
						}
						this_plot.plot_type = PLOT_TYPE.FUNC;
						this_plot.plot_style = GlobalMembersGadgets.func_style;
						this_plot.filledcurves_options.opt_given = 0;
						/* default no palette */
						this_plot.lp_properties.use_palette = false;
						end_token = GlobalMembersCommand.c_token - 1;
					} // end of IS THIS A FILE OR A FUNC block

					/* axis defaults */
					GlobalMembersAxis.x_axis = AXIS_INDEX.FIRST_X_AXIS;
					GlobalMembersAxis.y_axis = AXIS_INDEX.FIRST_Y_AXIS;

					/* pm 25.11.2001 allow any order of options */
					while (!GlobalMembersCommand.c_token >= GlobalMembersCommand.num_tokens || GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ";") != 0)
					{

						/*  deal with smooth */
						if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "s$mooth") != 0)
						{
							int found_token;

							if (set_smooth)
							{
								duplication = true;
								break;
							}
							
							found_token = GlobalMembersTables.lookup_table(GlobalMembersTables.plot_smooth_tbl, ++GlobalMembersCommand.c_token);

							switch (found_token)
							{
							case PLOT_SMOOTH.SMOOTH_ACSPLINES.getValue():
							case PLOT_SMOOTH.SMOOTH_BEZIER.getValue():
							case PLOT_SMOOTH.SMOOTH_CSPLINES.getValue():
							case PLOT_SMOOTH.SMOOTH_SBEZIER.getValue():
							case PLOT_SMOOTH.SMOOTH_UNIQUE.getValue():
							case PLOT_SMOOTH.SMOOTH_FREQUENCY.getValue():
							case PLOT_SMOOTH.SMOOTH_CUMULATIVE.getValue():
							case PLOT_SMOOTH.SMOOTH_KDENSITY.getValue():
								this_plot.plot_smooth = found_token;
								break;
							case PLOT_SMOOTH.SMOOTH_NONE.getValue():
							default:
								GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "expecting 'unique', 'frequency', 'cumulative', 'kdensity', 'acsplines', 'csplines', 'bezier' or 'sbezier'");
								break;
							}
							this_plot.plot_style = PLOT_STYLE.LINES;
							GlobalMembersCommand.c_token++; // skip format
							set_smooth = true;
							continue;
						}

						/* look for axes/axis */
						if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "ax$es") != 0 || GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "ax$is") != 0)
						{
							if (set_axes)
							{
								duplication = true;
								break;
							}
							if (GlobalMembersGadgets.parametric && in_parametric)
								GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "previous parametric function not fully specified");

							GlobalMembersCommand.c_token++;
							switch (GlobalMembersTables.lookup_table(GlobalMembersTables.plot_axes_tbl, GlobalMembersCommand.c_token))
							{
							case plot_axes_id.AXES_X1Y1.getValue():
								GlobalMembersAxis.x_axis = AXIS_INDEX.FIRST_X_AXIS;
								GlobalMembersAxis.y_axis = AXIS_INDEX.FIRST_Y_AXIS;
								++GlobalMembersCommand.c_token;
								break;
							case plot_axes_id.AXES_X2Y2.getValue():
								GlobalMembersAxis.x_axis = AXIS_INDEX.SECOND_X_AXIS;
								GlobalMembersAxis.y_axis = AXIS_INDEX.SECOND_Y_AXIS;
								++GlobalMembersCommand.c_token;
								break;
							case plot_axes_id.AXES_X1Y2.getValue():
								GlobalMembersAxis.x_axis = AXIS_INDEX.FIRST_X_AXIS;
								GlobalMembersAxis.y_axis = AXIS_INDEX.SECOND_Y_AXIS;
								++GlobalMembersCommand.c_token;
								break;
							case plot_axes_id.AXES_X2Y1.getValue():
								GlobalMembersAxis.x_axis = AXIS_INDEX.SECOND_X_AXIS;
								GlobalMembersAxis.y_axis = AXIS_INDEX.FIRST_Y_AXIS;
								++GlobalMembersCommand.c_token;
								break;
							case plot_axes_id.AXES_NONE.getValue():
							default:
								GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "axes must be x1y1, x1y2, x2y1 or x2y2");
								break;
							}
							set_axes = true;
							continue;
						}

						/* deal with title */
						if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "t$itle") != 0)
						{
							if (set_title)
							{
								duplication = true;
								break;
							}
							this_plot.title_no_enhanced = !key.enhanced;
							/* title can be enhanced if not explicitly disabled */
							if (GlobalMembersGadgets.parametric)
							{
								if (in_parametric)
									GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "\"title\" allowed only after parametric function fully specified");
								else if (!xtitle.equals(DefineConstants.NULL))
									xtitle = StringFunctions.changeCharacter(xtitle, 0, '\0'); // Remove default title .
							}
							GlobalMembersCommand.c_token++;

							if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "col$umnheader") != 0)
							{
								GlobalMembersDatafile.df_set_key_title_columnhead(this_plot.plot_type);
							}
							else

								///#ifdef BACKWARDS_COMPATIBLE
								// /* Annoying backwards-compatibility hack - deprecate! */
								//		    if (isanumber(c_token)) {
								//			c_token--;
								//			df_set_key_title_columnhead(this_plot->plot_type);
								//		    } else
								///#endif
								this_plot.title = GlobalMembersUtil.try_to_get_string();
								if (this_plot.title == null)
									GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "expecting \"title\" for plot");
							set_title = true;
							continue;
						}

						if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "not$itle") != 0)
						{
							if (set_title)
							{
								duplication = true;
								break;
							}
							GlobalMembersCommand.c_token++;
							if ((GlobalMembersUtil.isstring(GlobalMembersCommand.c_token) != 0 || GlobalMembersUtil.type_udv(GlobalMembersCommand.c_token) == DATA_TYPES.STRING.getValue()))
								GlobalMembersUtil.try_to_get_string(); // ignore optionally given title string
							this_plot.title_is_suppressed = true;
							if (!xtitle.equals(DefineConstants.NULL))
								xtitle = StringFunctions.changeCharacter(xtitle, 0, '\0');
							set_title = true;
							continue;
						}

						/* deal with style */
						if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "w$ith") != 0)
						{
							if (set_with)
							{
								duplication = true;
								break;
							}
							if (GlobalMembersGadgets.parametric && in_parametric)
								GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "\"with\" allowed only after parametric function fully specified");
							this_plot.plot_style = GlobalMembersMisc.get_style();
							if (this_plot.plot_style == PLOT_STYLE.FILLEDCURVES)
							{
								/* read a possible option for 'with filledcurves' */
								GlobalMembersMisc.get_filledcurves_style_options(this_plot.filledcurves_options);
							}
							if (this_plot.plot_style == PLOT_STYLE.IMAGE || this_plot.plot_style == PLOT_STYLE.RGBIMAGE || this_plot.plot_style == PLOT_STYLE.RGBA_IMAGE)
								GlobalMembersMisc.get_image_options(this_plot.image_properties);

							if ((this_plot.plot_type == PLOT_TYPE.FUNC) && (((this_plot.plot_style.getValue() & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR.getValue()) != 0) || (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)))
							{
								GlobalMembersUtil.int_warn(GlobalMembersCommand.c_token, "This plot style is only for datafiles, reverting to \"points\"");
								this_plot.plot_style = PLOT_STYLE.POINTSTYLE;
							}
							set_with = true;
							continue;
						}

						/* Labels can have font and text property info as plot options */
						/* In any case we must allocate one instance of the text style */
						/* that all labels in the plot will share.                     */
						if (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)
						{
							int stored_token = GlobalMembersCommand.c_token;

							if (this_plot.labels == null)
							{
								this_plot.labels.add(0, GlobalMembersSet.new_text_label(-1));
								this_plot.labels.get(0).pos = JUSTIFY.CENTRE;
								this_plot.labels.get(0).layer = DefineConstants.LAYER_PLOTLABELS;
							}
							GlobalMembersSet.parse_label_options(this_plot.labels.get(0));
							if (stored_token != GlobalMembersCommand.c_token)
							{
								if (set_labelstyle)
								{
									duplication = true;
									break;
								}
								else
								{
									set_labelstyle = true;
									continue;
								}
							}
						}

						/* pick up line/point specs and other style-specific keywords
						 * - point spec allowed if style uses points, ie style&2 != 0
						 * - keywords for lt and pt are optional
						 */
						if (this_plot.plot_style == PLOT_STYLE.CANDLESTICKS)
						{
							if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "whisker$bars") != 0)
							{
								this_plot.arrow_properties.head = e_arrow_head.BOTH_HEADS;
								GlobalMembersCommand.c_token++;
								if (GlobalMembersUtil.isanumber(GlobalMembersCommand.c_token) != 0 || GlobalMembersUtil.type_udv(GlobalMembersCommand.c_token) == DATA_TYPES.INTGR.getValue() || GlobalMembersUtil.type_udv(GlobalMembersCommand.c_token) == DATA_TYPES.CMPLX.getValue())
									this_plot.arrow_properties.head_length = GlobalMembersParse.real_expression();
							}
						}

						if (this_plot.plot_style == PLOT_STYLE.VECTOR)
						{
							int stored_token = GlobalMembersCommand.c_token;

							if (!set_lpstyle)
							{
								GlobalMembersGadgets.default_arrow_style((this_plot.arrow_properties));
								if (GlobalMembersGadgets.prefer_line_styles)
									GlobalMembersTerm.lp_use_properties((this_plot.arrow_properties.lp_properties), line_num + 1);
								else
									this_plot.arrow_properties.lp_properties.l_type = line_num;
							}

							GlobalMembersMisc.arrow_parse((this_plot.arrow_properties), true);
							if (stored_token != GlobalMembersCommand.c_token)
							{
								if (set_lpstyle)
								{
									duplication = true;
									break;
								}
								else
								{
									set_lpstyle = true;
									continue;
								}
							}
						}
						else
						{
							int stored_token = GlobalMembersCommand.c_token;
							lp_style_type lp = new lp_style_type(0, -2, 0, 0, 1.0, DefineConstants.PTSZ_DEFAULT, false, {DefineConstants.TC_DEFAULT, 0, 0.0});

							lp.l_type = line_num;
							lp.p_type = point_num;

							/* user may prefer explicit line styles */
							if (GlobalMembersGadgets.prefer_line_styles)
								GlobalMembersTerm.lp_use_properties(lp, line_num + 1);

							GlobalMembersMisc.lp_parse(lp, true, (this_plot.plot_style.getValue() & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.getValue()) != 0);
							if (stored_token != GlobalMembersCommand.c_token)
							{
								if (set_lpstyle)
								{
									duplication = true;
									break;
								}
								else
								{
									this_plot.lp_properties = lp;
									set_lpstyle = true;
									continue;
								}
							}
						}

						/* Some plots have a fill style as well */
						if ((this_plot.plot_style.getValue() & ((e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.getValue() != 0) ? 1 : 0)) != 0)
						{
							if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "fs") != 0 || GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "fill$style") != 0)
							{
								int stored_token = GlobalMembersCommand.c_token;
								
								GlobalMembersMisc.parse_fillstyle(this_plot.fill_properties, GlobalMembersGadgets.default_fillstyle.fillstyle, GlobalMembersGadgets.default_fillstyle.filldensity, pattern_num, GlobalMembersGadgets.default_fillstyle.border_color);
								if (this_plot.plot_style == PLOT_STYLE.FILLEDCURVES && this_plot.fill_properties.fillstyle == t_fillstyle.FS_EMPTY.getValue())
									this_plot.fill_properties.fillstyle = t_fillstyle.FS_SOLID.getValue();
								set_fillstyle = true;
								if (stored_token != GlobalMembersCommand.c_token)
									continue;
							}
						}

						break; // unknown option

					} // while (!END_OF_COMMAND)

					if (duplication)
						GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "duplicated or contradicting arguments in plot options");

					/* set default values for title if this has not been specified */
					this_plot.title_is_filename = false;
					if (!set_title)
					{
						this_plot.title_no_enhanced = true; // filename or function cannot be enhanced
						if (key.auto_titles == keytitle_type.FILENAME_KEYTITLES)
						{
							GlobalMembersUtil.m_capture((this_plot.title), start_token, end_token);
							if (in_parametric)
								xtitle = this_plot.title;
							this_plot.title_is_filename = true;
						}
						else if (!xtitle.equals(DefineConstants.NULL))
							xtitle = tangible.StringFunctions.changeCharacter(xtitle, 0, '\0');
					}

					/* Vectors will be drawn using linetype from arrow style, so we
					 * copy this to overall plot linetype so that the key sample matches */
					if (this_plot.plot_style == PLOT_STYLE.VECTOR)
					{
						if (!set_lpstyle)
						{
							if (GlobalMembersGadgets.prefer_line_styles)
								GlobalMembersTerm.lp_use_properties((this_plot.arrow_properties.lp_properties), line_num + 1);
							else
								this_plot.arrow_properties.lp_properties.l_type = line_num;
							GlobalMembersMisc.arrow_parse(this_plot.arrow_properties, true);
						}
						this_plot.lp_properties = this_plot.arrow_properties.lp_properties;
						set_lpstyle = true;
					}
					/* No line/point style given. As lp_parse also supplies
					 * the defaults for linewidth and pointsize, call it now
					 * to define them. */
					if (!set_lpstyle)
					{
						this_plot.lp_properties.l_type = line_num;
						this_plot.lp_properties.l_width = 1.0;
						this_plot.lp_properties.p_type = point_num;
						this_plot.lp_properties.p_size = GlobalMembersGadgets.pointsize;
						this_plot.lp_properties.use_palette = false;

						/* user may prefer explicit line styles */
						if (GlobalMembersGadgets.prefer_line_styles)
							GlobalMembersTerm.lp_use_properties(this_plot.lp_properties, line_num + 1);

						GlobalMembersMisc.lp_parse(this_plot.lp_properties, true, (this_plot.plot_style.getValue() & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.getValue()) != 0);

						///#ifdef BACKWARDS_COMPATIBLE
						// /* allow old-style syntax - ignore case lt 3 4 for example */
						//		if (!END_OF_COMMAND && isanumber(c_token)) {
						//		    this_plot->lp_properties.l_type =
						//			this_plot->lp_properties.p_type = int_expression() - 1;
						//		    if (isanumber(c_token))
						//			this_plot->lp_properties.p_type = int_expression() - 1;
						//		}
						///#endif // BACKWARDS_COMPATIBLE

					}

					/* Some low-level routines expect to find the pointflag attribute */
					/* in lp_properties (they don't have access to the full header.   */
					if ((this_plot.plot_style.getValue() & ((e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.getValue() != 0) ? 1 : 0)) != 0)
						this_plot.lp_properties.pointflag = 1;

					/* Rule out incompatible line/point/style options */
					if (this_plot.plot_type == PLOT_TYPE.FUNC)
					{
						if (((this_plot.plot_style.getValue() & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.getValue()) != 0) && (this_plot.lp_properties.p_size == DefineConstants.PTSZ_VARIABLE))
							this_plot.lp_properties.p_size = 1;
					}

					///#if (0) // FIXME:  restore this after fixing initialization problems with df_matrix
					//	    if (df_matrix) {
					//		if (!(this_plot->plot_style == IMAGE || this_plot->plot_style == RGBIMAGE
					//	              || this_plot->plot_style == RGBA_IMAGE || this_plot->plot_style == LINES
					//		      || this_plot->plot_style == POINTSTYLE))
					//		int_error(NO_CARET, "this 2D plot style cannot handle matrix data");
					//	    }
					///#endif

					/* Similar argument for check that all fill styles were set */
					if ((this_plot.plot_style.getValue() & ((e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL.getValue() != 0) ? 1 : 0)) != 0)
					{
						if (!set_fillstyle)
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: parse_fillstyle(&this_plot->fill_properties, default_fillstyle.fillstyle, default_fillstyle.filldensity, pattern_num, default_fillstyle.border_color);
							GlobalMembersMisc.parse_fillstyle(this_plot.fill_properties, GlobalMembersGadgets.default_fillstyle.fillstyle, GlobalMembersGadgets.default_fillstyle.filldensity, pattern_num, GlobalMembersGadgets.default_fillstyle.border_color);
						if ((this_plot.fill_properties.fillstyle == t_fillstyle.FS_PATTERN.getValue()) || (this_plot.fill_properties.fillstyle == t_fillstyle.FS_TRANSPARENT_PATTERN.getValue()))
							pattern_num = this_plot.fill_properties.fillpattern + 1;
						if (this_plot.plot_style == PLOT_STYLE.FILLEDCURVES && this_plot.fill_properties.fillstyle == t_fillstyle.FS_EMPTY.getValue())
							this_plot.fill_properties.fillstyle = t_fillstyle.FS_SOLID.getValue();
					}

					this_plot.x_axis = GlobalMembersAxis.x_axis.getValue();
					this_plot.y_axis = GlobalMembersAxis.y_axis.getValue();

					/* If we got this far without initializing the label list, do it now */
					if (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)
					{
						if (this_plot.labels == null)
						{
							this_plot.labels.add(0, GlobalMembersSet.new_text_label(-1));
							this_plot.labels.get(0).pos = JUSTIFY.CENTRE;
							this_plot.labels.get(0).layer = DefineConstants.LAYER_PLOTLABELS;
						}
						this_plot.labels.place.scalex = (GlobalMembersAxis.x_axis == AXIS_INDEX.SECOND_X_AXIS) ? position_type.second_axes : position_type.first_axes;
						this_plot.labels.place.scaley = (GlobalMembersAxis.y_axis == AXIS_INDEX.SECOND_Y_AXIS) ? position_type.second_axes : position_type.first_axes;
					}

					/* Initialize histogram data structure */
					if (this_plot.plot_style == PLOT_STYLE.HISTOGRAMS)
					{
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
							GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Log scale on X is incompatible with histogram plots\n");

						if ((GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_LAYERS.getValue() || GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_TOWERS.getValue()) && GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log)
							GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Log scale on Y is incompatible with stacked histogram plot\n");
						this_plot.histogram_sequence = ++histogram_sequence;
						/* Current histogram always goes at the front of the list */
						if (this_plot.histogram_sequence == 0)
						{
							GlobalMembersGraphics.init_histogram(this_plot.histogram, histogram_title);
							histogram_title = null;
							this_plot.histogram.start = newhist_start;
							this_plot.histogram.startcolor = newhist_color;
							this_plot.histogram.startpattern = newhist_pattern;
						}
						else
						{
							this_plot.histogram = GlobalMembersGadgets.histogram_opts.next;
							this_plot.histogram.clustersize++;
						}

						/* Normally each histogram gets a new set of colors, but in */
						/* 'newhistogram' you can force a starting color instead.   */
						if (!set_lpstyle && this_plot.histogram.startcolor != DefineConstants.LT_UNDEFINED)
							this_plot.lp_properties.l_type = this_plot.histogram_sequence + this_plot.histogram.startcolor;
						if (this_plot.histogram.startpattern != DefineConstants.LT_UNDEFINED)
							this_plot.fill_properties.fillpattern = this_plot.histogram_sequence + this_plot.histogram.startpattern;
					}

					/* Styles that use palette */
					if (this_plot.plot_style == PLOT_STYLE.IMAGE)
						this_plot.lp_properties.use_palette = true;

					/* we can now do some checks that we deferred earlier */

					if (this_plot.plot_type == PLOT_TYPE.DATA)
					{
						if (specs < 0)
						{
							/* Error check to handle missing or unreadable file */
							if ((this_plot.plot_style.getValue() & ((e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.getValue() != 0) ? 1 : 0)) != 0)
								++point_num;
							++line_num;
							this_plot.plot_type = PLOT_TYPE.NODATA;
							//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto SKIPPED_EMPTY_FILE;
						}
						if (((uses_axis[GlobalMembersAxis.x_axis.getValue()].getValue() & e_uses_axis.USES_AXIS_FOR_DATA.getValue()) == 0) && GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() != 0)
						{
							if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min = DefineConstants.VERYLARGE;
							if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max = -DefineConstants.VERYLARGE;
						}
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].is_timedata)
						{
							if (specs < 2)
								GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Need full using spec for x time data");
						}
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].is_timedata)
						{
							if (specs < 1)
								GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Need using spec for y time data");
						}
						/* need other cols, but I'm lazy */
						GlobalMembersDatafile.df_axis[0] = GlobalMembersAxis.x_axis;
						GlobalMembersDatafile.df_axis[1] = GlobalMembersAxis.y_axis;

						/* separate record of datafile and func */
						uses_axis[GlobalMembersAxis.x_axis.getValue()].setValue(uses_axis[GlobalMembersAxis.x_axis.getValue()].getValue() | e_uses_axis.USES_AXIS_FOR_DATA.getValue());
						uses_axis[GlobalMembersAxis.y_axis.getValue()].setValue(uses_axis[GlobalMembersAxis.y_axis.getValue()].getValue() | e_uses_axis.USES_AXIS_FOR_DATA.getValue());
					}
					else if (!GlobalMembersGadgets.parametric || !in_parametric)
					{
						/* for x part of a parametric function, axes are
						 * possibly wrong */
						/* separate record of data and func */
						uses_axis[GlobalMembersAxis.x_axis.getValue()].setValue(uses_axis[GlobalMembersAxis.x_axis.getValue()].getValue() | e_uses_axis.USES_AXIS_FOR_FUNC.getValue());
						uses_axis[GlobalMembersAxis.y_axis.getValue()].setValue(uses_axis[GlobalMembersAxis.y_axis.getValue()].getValue() | e_uses_axis.USES_AXIS_FOR_FUNC.getValue());
					}

					if (!in_parametric && this_plot.plot_style != PLOT_STYLE.IMAGE && this_plot.plot_style != PLOT_STYLE.RGBIMAGE && this_plot.plot_style != PLOT_STYLE.RGBA_IMAGE)
						/* don't increment the default line/point properties if
						 * this_plot is an image */
					{
						if ((this_plot.plot_style.getValue() & ((e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT.getValue() != 0) ? 1 : 0)) != 0)
							++point_num;
						++line_num;
					}
					if (this_plot.plot_type == PLOT_TYPE.DATA)
					{
						/* actually get the data now */
						if (GlobalMembersPlot2d.get_data(this_plot) == 0)
						{
							/* EAM 2005 - warn, but keep going */
							GlobalMembersUtil.int_warn(GlobalMembersCommand.c_token - 1,"Skipping data file with no valid points");
							this_plot.plot_type = PLOT_TYPE.NODATA;
							//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto SKIPPED_EMPTY_FILE;
						}

						/* Fiddle the auto-scaling data for specific plot styles */
						if (this_plot.plot_style == PLOT_STYLE.HISTOGRAMS)
							GlobalMembersPlot2d.histogram_range_fiddling(this_plot);
						if (this_plot.plot_style == PLOT_STYLE.BOXES)
							GlobalMembersPlot2d.box_range_fiddling(this_plot);
						if (this_plot.plot_style == PLOT_STYLE.RGBIMAGE || this_plot.plot_style == PLOT_STYLE.RGBA_IMAGE)
						{
							if ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
								GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min = 0;
							if ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
								GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max = 255;
						}

						/* sort */
						switch (this_plot.plot_smooth)
						{
						/* sort and average, if the style requires */
						case SMOOTH_UNIQUE:
						case SMOOTH_FREQUENCY:
						case SMOOTH_CUMULATIVE:
						case SMOOTH_CSPLINES:
						case SMOOTH_ACSPLINES:
						case SMOOTH_SBEZIER:
							GlobalMembersInterpol.sort_points(this_plot);
							GlobalMembersInterpol.cp_implode(this_plot);
						case SMOOTH_NONE:
						case SMOOTH_BEZIER:
						case SMOOTH_KDENSITY:
						default:
							break;
						}
						switch (this_plot.plot_smooth)
						{
						/* create new data set by evaluation of
						 * interpolation routines */
						case SMOOTH_FREQUENCY:
						case SMOOTH_CUMULATIVE:
							GlobalMembersInterpol.gen_interp_frequency(this_plot);
							break;
						case SMOOTH_CSPLINES:
						case SMOOTH_ACSPLINES:
						case SMOOTH_BEZIER:
						case SMOOTH_SBEZIER:
						case SMOOTH_KDENSITY:
							GlobalMembersInterpol.gen_interp(this_plot);
						case SMOOTH_NONE:
						case SMOOTH_UNIQUE:
						default:
							break;
						}

						/* now that we know the plot style, adjust the x- and yrange */
						/* adjust_range(this_plot); no longer needed */

						/* Images are defined by a grid representing centers of pixels.
						 * Compensate for extent of the image so `set autoscale fix`
						 * uses outer edges of outer pixels in axes adjustment.
						 */
						if ((this_plot.plot_style == PLOT_STYLE.IMAGE || this_plot.plot_style == PLOT_STYLE.RGBIMAGE || this_plot.plot_style == PLOT_STYLE.RGBA_IMAGE))
						{
							this_plot.image_properties.type = t_imagecolor.IC_PALETTE;
							GlobalMembersGraphics.plot_image_or_update_axes(this_plot, true);
						}

					}

					//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					SKIPPED_EMPTY_FILE:
						/* Note position in command line for second pass */
						this_plot.token = GlobalMembersCommand.c_token;
					tp_ptr = &(this_plot.next);

				} // !is_defn

			if (in_parametric)
			{
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0)
				{
					GlobalMembersCommand.c_token++;
					continue;
				}
				else
					break;
			}

			/* Iterate-over-plot mechanism */
			if (GlobalMembersParse.empty_iteration() && this_plot != null)
			{
				this_plot.plot_type = PLOT_TYPE.NODATA;
			}
			else if (GlobalMembersParse.next_iteration())
			{
				GlobalMembersCommand.c_token = start_token;
				continue;
			}

			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.check_for_iteration();
			}
			else
				break;
		}

		if (GlobalMembersGadgets.parametric && in_parametric)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "parametric function not fully specified");


		/*** Second Pass: Evaluate the functions ***/
		/*
		 * Everything is defined now, except the function data. We expect
		 * no syntax errors, etc, since the above parsed it all. This
		 * makes the code below simpler. If y is autoscaled, the yrange
		 * may still change.  we stored last token of each plot, so we
		 * dont need to do everything again */

		/* parametric or polar fns can still affect x ranges */
		if (!GlobalMembersGadgets.parametric && !GlobalMembersGadgets.polar)
		{
			/* If we were expecting to autoscale on X but found no usable
			 * points in the data files, then the axis limits are still sitting
			 * at +/- VERYLARGE.  The default range for bare functions is [-10:10].
			 * Or we could give up and fall through to "x range invalid".
			 */
			if (some_functions != 0 && uses_axis[AXIS_INDEX.FIRST_X_AXIS.getValue()].getValue() != 0)
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max == -DefineConstants.VERYLARGE || GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min == DefineConstants.VERYLARGE)
				{
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min = -10;
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max = 10;
				}

			/* check that xmin -> xmax is not too small */
			GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.FIRST_X_AXIS, "x range is invalid");

			if (uses_axis[AXIS_INDEX.SECOND_X_AXIS.getValue()] & e_uses_axis.USES_AXIS_FOR_DATA.getValue() != 0)
			{
				/* check that x2min -> x2max is not too small */
				GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.SECOND_X_AXIS, "x2 range is invalid");
			}
			else if (((int)GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale) != 0)
			{
				/* copy x1's range */
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
					GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min;
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
					GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max;
			}
		}
		if (some_functions != 0)
		{

			/* call the controlled variable t, since x_min can also mean
			 * smallest x */
			double t_min = 0.;
			double t_max = 0.;
			double t_step = 0.;

			if (GlobalMembersGadgets.parametric || GlobalMembersGadgets.polar)
			{
				if ((uses_axis[AXIS_INDEX.FIRST_X_AXIS.getValue()].getValue() & e_uses_axis.USES_AXIS_FOR_DATA.getValue()) == 0)
				{
					/* these have not yet been set to full width */
					if ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min = DefineConstants.VERYLARGE;
					if ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max = -DefineConstants.VERYLARGE;
				}
				if ((uses_axis[AXIS_INDEX.SECOND_X_AXIS.getValue()].getValue() & e_uses_axis.USES_AXIS_FOR_DATA.getValue()) == 0)
				{
					if ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min = DefineConstants.VERYLARGE;
					if ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
						GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max = -DefineConstants.VERYLARGE;
				}
			}

			/* FIXME HBB 20000430: here and elsewhere, the code explicitly
			 * assumes that the dummy variables (t, u, v) cannot possibly
			 * be logscaled in parametric or polar mode. Does this
			 * *really* hold? */
			if (GlobalMembersGadgets.parametric || GlobalMembersGadgets.polar)
			{
				t_min = GlobalMembersAxis.axis_array[AXIS_INDEX.T_AXIS.getValue()].min;
				t_max = GlobalMembersAxis.axis_array[AXIS_INDEX.T_AXIS.getValue()].max;
				t_step = (t_max - t_min) / (GlobalMembersGadgets.samples_1 - 1);
			}
			/* else we'll do it on each plot (see below) */

			tp_ptr = first_plot.getFirst();
			plot_num = 0;
			this_plot = first_plot.getFirst();
			GlobalMembersCommand.c_token = begin_token; // start over

			GlobalMembersParse.check_for_iteration();

			/* Read through functions */
			while (true)
			{
				if (!in_parametric && !was_definition)
					start_token = GlobalMembersCommand.c_token;

				if (GlobalMembersUtil.is_definition(GlobalMembersCommand.c_token) != 0)
				{
					GlobalMembersCommand.define();
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") == 0)
					{
						was_definition = true;
						continue;
					}

				}
				else
				{
					at_type at_ptr[];
					String name_str;
					was_definition = false;

					/* HBB 20000820: now globals in 'axis.c' */
					GlobalMembersAxis.x_axis.setValue(this_plot.x_axis);
					GlobalMembersAxis.y_axis.setValue(this_plot.y_axis);

					plot_num++;

					GlobalMembersCommand.dummy_func = plot_func;
					/* WARNING: do NOT free name_str */
					/* FIXME: should this be saved in "this_plot"? */
					name_str = GlobalMembersParse.string_or_express(at_ptr);
					
					boolean come_here_if_undefined = false;

					if (name_str == null) // function to plot
					{
						if (GlobalMembersGadgets.parametric) // toggle parametric axes
						{
							in_parametric = !in_parametric;
						}
						plot_func.at = at_ptr[0];

						if (!GlobalMembersGadgets.parametric && !GlobalMembersGadgets.polar)
						{
							t_min = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
							t_max = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
							GlobalMembersAxis.axis_unlog_interval(GlobalMembersAxis.x_axis, t_min, t_max, true);
							t_step = (t_max - t_min) / (GlobalMembersGadgets.samples_1 - 1);
						}
						for (i = 0; i < GlobalMembersGadgets.samples_1; i++)
						{
							double temp;
							value a = new value();
							double t = t_min + i * t_step;
							/* parametric/polar => NOT a log quantity */
							double x = (!GlobalMembersGadgets.parametric && !GlobalMembersGadgets.polar) ? (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log ? Math.exp((t) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base): (t)) : t;

							GlobalMembersEval.Gcomplex(plot_func.dummy_values[0], x, 0.0);
							GlobalMembersEval.evaluate_at(plot_func.at, a);

							if (GlobalMembersEval.undefined || (Math.abs(GlobalMembersEval.imag(a)) > GlobalMembersGadgets.zero))
							{
								this_plot.points.get(i).type = coord_type.UNDEFINED;
								continue;
							}
							temp = GlobalMembersEval.real(a);

							/* width of box not specified */
							this_plot.points.get(i).z = -1.0;
							/* for the moment */
							this_plot.points.get(i).type = coord_type.INRANGE;

							if (GlobalMembersGadgets.parametric)
							{
								/* we cannot do range-checking now, since for
								 * the x function we did not know which axes
								 * we were using
								 * DO NOT TAKE LOGS YET - do it in parametric_fixup
								 */
								/* ignored, actually... */
								this_plot.points.get(i).x = t;
								this_plot.points.get(i).y = temp;
								if (boxwidth >= 0 && boxwidth_is_absolute)
									this_plot.points.get(i).z = 0;
							}
							else if (GlobalMembersGadgets.polar)
							{
								double y;
								if (((GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) == 0) && temp > GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].max)
									this_plot.points.get(i).type = coord_type.OUTRANGE;
								if ((GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) == 0)
									temp -= GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].min;
								y = temp * Math.sin(x * GlobalMembersGadgets.ang2rad);
								x = temp * Math.cos(x * GlobalMembersGadgets.ang2rad);
								if (boxwidth >= 0 && boxwidth_is_absolute)
								{
									double xlow;
									double xhigh;
									coord_type dmy_type = coord_type.INRANGE;
									this_plot.points.get(i).z = 0;
									if (GlobalMembersAxis.axis_array[this_plot.x_axis].log)
									{
										double base = GlobalMembersAxis.axis_array[this_plot.x_axis].base;
										xlow = x * Math.pow(base, -boxwidth / 2.);
										xhigh = x * Math.pow(base, boxwidth / 2.);
									}
									else
									{
										xlow = x - boxwidth / 2;
										xhigh = x + boxwidth / 2;
									}
									do
									{
										if (GlobalMembersAxis.x_axis.getValue() == DefineConstants.NO_AXIS)
											break;
										if (!(xlow > -DefineConstants.VERYLARGE && xlow < DefineConstants.VERYLARGE))
										{
											dmy_type = coord_type.UNDEFINED;
											break;
										}
										if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
										{
											if (xlow < 0.0)
											{
												dmy_type = coord_type.UNDEFINED;
												break;
											}
											else if (xlow == 0.0)
											{
												this_plot.points.get(i).xlow = -DefineConstants.VERYLARGE;
												dmy_type = coord_type.OUTRANGE;
												break;
											}
											else
											{
												this_plot.points.get(i).xlow = (Math.log(xlow) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base);
											}
										}
										else
											this_plot.points.get(i).xlow = xlow;
										if (this_plot.noautoscale)
											break;
										if (dmy_type != coord_type.INRANGE)
											break;
										if (GlobalMembersAxis.x_axis.getValue() < 0)
											break;
										if (xlow < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min = xlow;
										if (xlow < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
										{
											if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
												GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min = xlow;
											else
											{
												dmy_type = coord_type.OUTRANGE;
												break;
											}
										}
										if (xlow > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max = xlow;
										if (xlow > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
										{
											if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
												GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max = xlow;
											else
											{
												dmy_type = coord_type.OUTRANGE;
											}
										}
									} while (false);
									dmy_type = coord_type.INRANGE;
									do
									{
										if (GlobalMembersAxis.x_axis.getValue() == DefineConstants.NO_AXIS)
											break;
										if (!(xhigh > -DefineConstants.VERYLARGE && xhigh < DefineConstants.VERYLARGE))
										{
											dmy_type = coord_type.UNDEFINED;
											break;
										}
										if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
										{
											if (xhigh < 0.0)
											{
												dmy_type = coord_type.UNDEFINED;
												break;
											}
											else if (xhigh == 0.0)
											{
												this_plot.points.get(i).xhigh = -DefineConstants.VERYLARGE;
												dmy_type = coord_type.OUTRANGE;
												break;
											}
											else
											{
												this_plot.points.get(i).xhigh = (Math.log(xhigh) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base);
											}
										}
										else
											this_plot.points.get(i).xhigh = xhigh;
										if (this_plot.noautoscale)
											break;
										if (dmy_type != coord_type.INRANGE)
											break;
										if (GlobalMembersAxis.x_axis.getValue() < 0)
											break;
										if (xhigh < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min = xhigh;
										if (xhigh < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
										{
											if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
												GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min = xhigh;
											else
											{
												dmy_type = coord_type.OUTRANGE;
												break;
											}
										}
										if (xhigh > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max = xhigh;
										if (xhigh > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
										{
											if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
												GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max = xhigh;
											else
											{
												dmy_type = coord_type.OUTRANGE;
											}
										}
									} while (false);
								}
								temp = y;
								do
								{
									if (GlobalMembersAxis.x_axis.getValue() == DefineConstants.NO_AXIS)
										break;
									if (!(x > -DefineConstants.VERYLARGE && x < DefineConstants.VERYLARGE))
									{
										this_plot.points.get(i).type = coord_type.UNDEFINED;
										come_here_if_undefined = true;
										break;
									}
									if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
									{
										if (x < 0.0)
										{
											this_plot.points.get(i).type = coord_type.UNDEFINED;
											//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
											goto come_here_if_undefined;
											break;
										}
										else if (x == 0.0)
										{
											this_plot.points.get(i).x = -DefineConstants.VERYLARGE;
											this_plot.points.get(i).type = coord_type.OUTRANGE;
											break;
										}
										else
										{
											this_plot.points.get(i).x = (Math.log(x) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base);
										}
									}
									else
										this_plot.points.get(i).x = x;
									if (this_plot.noautoscale)
										break;
									if (this_plot.points.get(i).type != coord_type.INRANGE)
										break;
									if (GlobalMembersAxis.x_axis.getValue() < 0)
										break;
									if (x < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min)
										GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min = x;
									if (x < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
									{
										if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min = x;
										else
										{
											this_plot.points.get(i).type = coord_type.OUTRANGE;
											break;
										}
									}
									if (x > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max)
										GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max = x;
									if (x > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
									{
										if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max = x;
										else
										{
											this_plot.points.get(i).type = coord_type.OUTRANGE;
										}
									}
								} while (false);
								do
								{
									if (GlobalMembersAxis.y_axis.getValue() == DefineConstants.NO_AXIS)
										break;
									if (!(y > -DefineConstants.VERYLARGE && y < DefineConstants.VERYLARGE))
									{
										this_plot.points.get(i).type = coord_type.UNDEFINED;
										//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
										goto come_here_if_undefined;
										break;
									}
									if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log)
									{
										if (y < 0.0)
										{
											this_plot.points.get(i).type = coord_type.UNDEFINED;
											//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
											goto come_here_if_undefined;
											break;
										}
										else if (y == 0.0)
										{
											this_plot.points.get(i).y = -DefineConstants.VERYLARGE;
											this_plot.points.get(i).type = coord_type.OUTRANGE;
											break;
										}
										else
										{
											this_plot.points.get(i).y = (Math.log(y) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base);
										}
									}
									else
										this_plot.points.get(i).y = y;
									if (this_plot.noautoscale)
										break;
									if (this_plot.points.get(i).type != coord_type.INRANGE)
										break;
									if (GlobalMembersAxis.y_axis.getValue() < 0)
										break;
									if (y < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_min)
										GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_min = y;
									if (y < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)
									{
										if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min = y;
										else
										{
											this_plot.points.get(i).type = coord_type.OUTRANGE;
											break;
										}
									}
									if (y > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_max)
										GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_max = y;
									if (y > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
									{
										if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max = y;
										else
										{
											this_plot.points.get(i).type = coord_type.OUTRANGE;
										}
									}
								} while (false);
							} // neither parametric or polar
							else
							{
								/* If non-para, it must be INRANGE */
								/* logscale ? log(x) : x */
								this_plot.points.get(i).x = t;
								if (boxwidth >= 0 && boxwidth_is_absolute)
								{
									double xlow;
									double xhigh;
									int dmy_type = coord_type.INRANGE.getValue();
									this_plot.points.get(i).z = 0;
									if (GlobalMembersAxis.axis_array[this_plot.x_axis].log)
									{
										double base = GlobalMembersAxis.axis_array[this_plot.x_axis].base;
										xlow = x * Math.pow(base, -boxwidth / 2.);
										xhigh = x * Math.pow(base, boxwidth / 2.);
									}
									else
									{
										xlow = x - boxwidth / 2;
										xhigh = x + boxwidth / 2;
									}
									do
									{
										if (GlobalMembersAxis.x_axis.getValue() == DefineConstants.NO_AXIS)
											break;
										if (!(xlow > -DefineConstants.VERYLARGE && xlow < DefineConstants.VERYLARGE))
										{
											dmy_type = coord_type.UNDEFINED.getValue();
											break;
										}
										if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
										{
											if (xlow < 0.0)
											{
												dmy_type = coord_type.UNDEFINED.getValue();
												break;
											}
											else if (xlow == 0.0)
											{
												this_plot.points.get(i).xlow = -DefineConstants.VERYLARGE;
												dmy_type = coord_type.OUTRANGE.getValue();
												break;
											}
											else
											{
												this_plot.points.get(i).xlow = (Math.log(xlow) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base);
											}
										}
										else
											this_plot.points.get(i).xlow = xlow;
										if (this_plot.noautoscale)
											break;
										if (dmy_type != coord_type.INRANGE.getValue())
											break;
										if (GlobalMembersAxis.x_axis.getValue() < 0)
											break;
										if (xlow < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min = xlow;
										if (xlow < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
										{
											if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
												GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min = xlow;
											else
											{
												dmy_type = coord_type.OUTRANGE.getValue();
												break;
											}
										}
										if (xlow > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max = xlow;
										if (xlow > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
										{
											if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
												GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max = xlow;
											else
											{
												dmy_type = coord_type.OUTRANGE.getValue();
											}
										}
									} while (false);
									dmy_type = coord_type.INRANGE.getValue();
									do
									{
										if (GlobalMembersAxis.x_axis.getValue() == DefineConstants.NO_AXIS)
											break;
										if (!(xhigh > -DefineConstants.VERYLARGE && xhigh < DefineConstants.VERYLARGE))
										{
											dmy_type = coord_type.UNDEFINED.getValue();
											break;
										}
										if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
										{
											if (xhigh < 0.0)
											{
												dmy_type = coord_type.UNDEFINED.getValue();
												break;
											}
											else if (xhigh == 0.0)
											{
												this_plot.points.get(i).xhigh = -DefineConstants.VERYLARGE;
												dmy_type = coord_type.OUTRANGE.getValue();
												break;
											}
											else
											{
												this_plot.points.get(i).xhigh = (Math.log(xhigh) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base);
											}
										}
										else
											this_plot.points.get(i).xhigh = xhigh;
										if (this_plot.noautoscale)
											break;
										if (dmy_type != coord_type.INRANGE.getValue())
											break;
										if (GlobalMembersAxis.x_axis.getValue() < 0)
											break;
										if (xhigh < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min = xhigh;
										if (xhigh < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
										{
											if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
												GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min = xhigh;
											else
											{
												dmy_type = coord_type.OUTRANGE.getValue();
												break;
											}
										}
										if (xhigh > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max)
											GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max = xhigh;
										if (xhigh > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
										{
											if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
												GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max = xhigh;
											else
											{
												dmy_type = coord_type.OUTRANGE.getValue();
											}
										}
									} while (false);
								}
								do
								{
									if (in_parametric ? (GlobalMembersAxis.x_axis.getValue() != 0) : GlobalMembersAxis.y_axis.getValue() == DefineConstants.NO_AXIS)
										break;
									if (!(temp > -DefineConstants.VERYLARGE && temp < DefineConstants.VERYLARGE))
									{
										this_plot.points.get(i).type = coord_type.UNDEFINED;
										//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
										goto come_here_if_undefined;
										break;
									}
									if (GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].log)
									{
										if (temp < 0.0)
										{
											this_plot.points.get(i).type = coord_type.UNDEFINED;
											//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
											goto come_here_if_undefined;
											break;
										}
										else if (temp == 0.0)
										{
											this_plot.points.get(i).y = -DefineConstants.VERYLARGE;
											this_plot.points.get(i).type = coord_type.OUTRANGE;
											break;
										}
										else
										{
											this_plot.points.get(i).y = (Math.log(temp) / GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].log_base);
										}
									}
									else
										this_plot.points.get(i).y = temp;
									if (this_plot.noautoscale)
										break;
									if (this_plot.points.get(i).type != coord_type.INRANGE)
										break;
									if (in_parametric ? GlobalMembersAxis.x_axis.getValue() != 0 : GlobalMembersAxis.y_axis.getValue() < 0)
										break;
									if (temp < GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].data_min)
										GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].data_min = temp;
									if (temp < GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].min)
									{
										if ((GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
											GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].min = temp;
										else
										{
											this_plot.points.get(i).type = coord_type.OUTRANGE;
											break;
										}
									}
									if (temp > GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].data_max)
										GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].data_max = temp;
									if (temp > GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].max)
									{
										if ((GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
											GlobalMembersAxis.axis_array[in_parametric ? GlobalMembersAxis.x_axis.getValue() : GlobalMembersAxis.y_axis.getValue()].max = temp;
										else
										{
											this_plot.points.get(i).type = coord_type.OUTRANGE;
										}
									}
								} while (false);

								/* could not use a continue in this case */
								//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								come_here_if_undefined:
									; // ansi requires a statement after a label
							}

						} // loop over samples_1
						this_plot.p_count = i; // samples_1
					}
					/* skip all modifers func / whole of data plots */
					GlobalMembersCommand.c_token = this_plot.token;

					/* used below */
					tp_ptr = &(this_plot.next);
					this_plot = this_plot.next;
				}

				/* Iterate-over-plot mechanism */
				if (!in_parametric && GlobalMembersParse.next_iteration())
				{
					GlobalMembersCommand.c_token = start_token;
					continue;
				}

				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0)
				{
					GlobalMembersCommand.c_token++;
					if (!in_parametric)
						GlobalMembersParse.check_for_iteration();
				}
				else
					break;
			}
			/* when step debugging, set breakpoint here to get through
			 * the 'read function' loop above quickly */
			if (GlobalMembersGadgets.parametric)
			{
				/* Now actually fix the plot pairs to be single plots
				 * also fixes up polar&&parametric fn plots */
				GlobalMembersPlot2d.parametric_fixup(first_plot, plot_num);
				/* we omitted earlier check for range too small */
				GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.FIRST_X_AXIS, null);
				if (uses_axis[AXIS_INDEX.SECOND_X_AXIS.getValue()].getValue() != 0)
				{
					GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.SECOND_X_AXIS, null);
				}
			}
		} // some_functions

		/* if first_plot is NULL, we have no functions or data at all. This can
		 * happen, if you type "plot x=5", since x=5 is a variable assignment */

		if (plot_num == 0 || first_plot == null)
		{
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "no functions or data to plot");
		}

		if ((uses_axis[AXIS_INDEX.FIRST_X_AXIS.getValue()].getValue() == 0 && ((int)uses_axis[AXIS_INDEX.SECOND_X_AXIS.getValue()]) == 0)
			if (first_plot.plot_type == PLOT_TYPE.NODATA)
				GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "No data in plot");

		if (uses_axis[AXIS_INDEX.FIRST_X_AXIS.getValue()].getValue() != 0)
		{
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max == -DefineConstants.VERYLARGE || GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min == DefineConstants.VERYLARGE)
				GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "all points undefined!");
			GlobalMembersAxis.axis_revert_and_unlog_range(AXIS_INDEX.FIRST_X_AXIS);
		}
		if (uses_axis[AXIS_INDEX.SECOND_X_AXIS.getValue()].getValue() != 0)
		{
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max == -DefineConstants.VERYLARGE || GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min == DefineConstants.VERYLARGE)
				GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "all points undefined!");
			GlobalMembersAxis.axis_revert_and_unlog_range(AXIS_INDEX.SECOND_X_AXIS);
		}
		else
		{
			assert uses_axis[AXIS_INDEX.FIRST_X_AXIS.getValue()];
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
				GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min;
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
				GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max;
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].autoscale.getValue() == 0)
				GlobalMembersAxis.axis_revert_and_unlog_range(AXIS_INDEX.SECOND_X_AXIS);
		}
		if (uses_axis[AXIS_INDEX.FIRST_X_AXIS.getValue()].getValue() == 0)
		{
			assert uses_axis[AXIS_INDEX.SECOND_X_AXIS.getValue()];
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
				GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min;
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
				GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max;
		}


		if (uses_axis[AXIS_INDEX.FIRST_Y_AXIS.getValue()].getValue() != 0)
		{
			GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.FIRST_Y_AXIS, "all points y value undefined!");
			GlobalMembersAxis.axis_revert_and_unlog_range(AXIS_INDEX.FIRST_Y_AXIS);
		}
		if (uses_axis[AXIS_INDEX.SECOND_Y_AXIS.getValue()].getValue() != 0)
		{
			GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.SECOND_Y_AXIS, "all points y2 value undefined!");
			GlobalMembersAxis.axis_revert_and_unlog_range(AXIS_INDEX.SECOND_Y_AXIS);
		}
		else
		{
			/* else we want to copy y2 range */
			assert uses_axis[AXIS_INDEX.FIRST_Y_AXIS.getValue()];
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
				GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min;
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
				GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].max = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max;
			/* Log() fixup is only necessary if the range was *not* copied from
			 * the (already logarithmized) yrange */
			if (((int)GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].autoscale) == 0)
				GlobalMembersAxis.axis_revert_and_unlog_range(AXIS_INDEX.SECOND_Y_AXIS);
		}
		if (uses_axis[AXIS_INDEX.FIRST_Y_AXIS.getValue()].getValue() == 0)
		{
			assert uses_axis[AXIS_INDEX.SECOND_Y_AXIS.getValue()];
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
				GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min;
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
				GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].max;
		}

		/* the following ~5 lines were moved from the end of the
		 * function to here, as do_plot calles term->text, which
		 * itself might process input events in mouse enhanced
		 * terminals. For redrawing to work, line capturing and
		 * setting the plot_num must already be done before
		 * entering do_plot(). Thu Jan 27 23:56:24 2000 (joze) */
		/* if we get here, all went well, so record this line for replot */
		if (GlobalMembersCommand.plot_token != -1)
		{
			/* note that m_capture also frees the old replot_line */
			tangible.RefObject<String[]> tempRef_replot_line = new tangible.RefObject<String[]>(GlobalMembersCommand.replot_line);
			GlobalMembersUtil.m_capture(tempRef_replot_line, GlobalMembersCommand.plot_token, GlobalMembersCommand.c_token - 1);
			GlobalMembersCommand.replot_line = tempRef_replot_line.argvalue;
			GlobalMembersCommand.plot_token = -1;
			GlobalMembersEval.fill_gpval_string("GPVAL_LAST_PLOT", GlobalMembersCommand.replot_line);
		}

		if (GlobalMembersGadgets.table_mode)
			GlobalMembersTabulate.print_table(first_plot, plot_num);
		else
		{
			START_LEAK_CHECK(); // check for memory leaks in this routine

			/* do_plot now uses axis_array[] */
			GlobalMembersGraphics.do_plot(first_plot, plot_num);

			END_LEAK_CHECK();

			/* after do_plot(), axis_array[].min and .max
			 * contain the plotting range actually used (rounded
			 * to tic marks, not only the min/max data values)
			 *  --> save them now for writeback if requested
			 */
			do {AXIS_INDEX axis; for (axis.setValue(0); axis.getValue() < DefineConstants.AXIS_ARRAY_SIZE; axis.setValue(axis.getValue()+1)) if ((GlobalMembersAxis.axis_array[axis.getValue()].range_flags & DefineConstants.RANGE_WRITEBACK) != 0) {GlobalMembersAxis.set_writeback_min(axis); GlobalMembersAxis.set_writeback_max(axis);}} while (false);
			/* update GPVAL_ variables available to user */
			GlobalMembersEval.update_gpval_variables(1);

			///#ifdef VOLATILE_REFRESH
			/* Mark these plots as safe for quick refresh */
			GlobalMembersGadgets.refresh_nplots = plot_num;
			GlobalMembersGadgets.refresh_ok = 2;
			///#endif
		}

	} // eval_plots

	/*
	 * The hardest part of this routine is collapsing the FUNC plot types in the
	 * list (which are garanteed to occur in (x,y) pairs while preserving the
	 * non-FUNC type plots intact.  This means we have to work our way through
	 * various lists.  Examples (hand checked): start_plot:F1->F2->NULL ==>
	 * F2->NULL start_plot:F1->F2->F3->F4->F5->F6->NULL ==> F2->F4->F6->NULL
	 * start_plot:F1->F2->D1->D2->F3->F4->D3->NULL ==> F2->D1->D2->F4->D3->NULL
	 *
	 */
	public static void parametric_fixup(curve_points start_plot, int plot_num)
	{
		curve_points xp;
		curve_points new_list = null;
		curve_points free_list = null;
		curve_points last_pointer = new_list;
		int tlen;
		int i;
		int curve;
		String new_title;

		/*
		 * Ok, go through all the plots and move FUNC types together.  Note: this
		 * originally was written to look for a NULL next pointer, but gnuplot
		 * wants to be sticky in grabbing memory and the right number of items in
		 * the plot list is controlled by the plot_num variable.
		 *
		 * Since gnuplot wants to do this sticky business, a free_list of
		 * curve_points is kept and then tagged onto the end of the plot list as
		 * this seems more in the spirit of the original memory behavior than
		 * simply freeing the memory.  I'm personally not convinced this sort of
		 * concern is worth it since the time spent computing points seems to
		 * dominate any garbage collecting that might be saved here...
		 */
		new_list = xp = start_plot;
		curve = 0;

		while (++curve <= plot_num)
		{
			if (xp.plot_type == PLOT_TYPE.FUNC)
			{
				/* Here's a FUNC parametric function defined as two parts. */
				curve_points yp = xp.next;

				--(plot_num);

				assert xp.p_count == yp.p_count;

				/* because syntax is   plot x(t), y(t) axes ..., only
				 * the y function axes are correct
				 */


				/*
				 * Go through all the points assigning the y's from xp to be
				 * the x's for yp. In polar mode, we need to check max's and
				 * min's as we go.
				 */

				for (i = 0; i < yp.p_count; ++i)
				{
					if (GlobalMembersGadgets.polar)
					{
						double r = yp.points.get(i).y;
						double t = xp.points.get(i).y * GlobalMembersGadgets.ang2rad;
						double x;
						double y;
						if (!(GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX) && r > GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].max)
							yp.points.get(i).type = coord_type.OUTRANGE;
						if (!(GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN))
						{
							/* store internally as if plotting r(t)-rmin */
							r -= GlobalMembersAxis.axis_array[AXIS_INDEX.R_AXIS.getValue()].min;
						}
						x = r * Math.cos(t);
						y = r * Math.sin(t);
						if (boxwidth >= 0 && boxwidth_is_absolute)
						{
							int dmy_type = coord_type.INRANGE.getValue();
							do
							{
								if (xp.x_axis == DefineConstants.NO_AXIS)
									break;
								if (!(x - boxwidth / 2 > -DefineConstants.VERYLARGE && x - boxwidth / 2 < DefineConstants.VERYLARGE))
								{
									dmy_type = coord_type.UNDEFINED.getValue();
									break;
								}
								if (GlobalMembersAxis.axis_array[xp.x_axis].log)
								{
									if (x - boxwidth / 2 < 0.0)
									{
										dmy_type = coord_type.UNDEFINED.getValue();
										break;
									}
									else if (x - boxwidth / 2 == 0.0)
									{
										yp.points.get(i).xlow = -DefineConstants.VERYLARGE;
										dmy_type = coord_type.OUTRANGE.getValue();
										break;
									}
									else
									{
										yp.points.get(i).xlow = (Math.log(x - boxwidth / 2) / GlobalMembersAxis.axis_array[xp.x_axis].log_base);
									}
								}
								else
									yp.points.get(i).xlow = x - boxwidth / 2;
								if (xp.noautoscale)
									break;
								if (dmy_type != coord_type.INRANGE.getValue())
									break;
								if ((int)xp.x_axis < 0)
									break;
								if (x - boxwidth / 2 < GlobalMembersAxis.axis_array[xp.x_axis].data_min)
									GlobalMembersAxis.axis_array[xp.x_axis].data_min = x - boxwidth / 2;
								if (x - boxwidth / 2 < GlobalMembersAxis.axis_array[xp.x_axis].min)
								{
									if ((GlobalMembersAxis.axis_array[xp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 :  0)) != 0)
										GlobalMembersAxis.axis_array[xp.x_axis].min = x - boxwidth / 2;
									else
									{
										dmy_type = coord_type.OUTRANGE.getValue();
										break;
									}
								}
								if (x - boxwidth / 2 > GlobalMembersAxis.axis_array[xp.x_axis].data_max)
									GlobalMembersAxis.axis_array[xp.x_axis].data_max = x - boxwidth / 2;
								if (x - boxwidth / 2 > GlobalMembersAxis.axis_array[xp.x_axis].max)
								{
									if ((GlobalMembersAxis.axis_array[xp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 :  0)) != 0)
										GlobalMembersAxis.axis_array[xp.x_axis].max = x - boxwidth / 2;
									else
									{
										dmy_type = coord_type.OUTRANGE.getValue();
									}
								}
							} while (false);
							dmy_type = coord_type.INRANGE.getValue();
							do
							{
								if (xp.x_axis == DefineConstants.NO_AXIS)
									break;
								if (!(x + boxwidth / 2 > -DefineConstants.VERYLARGE && x + boxwidth / 2 < DefineConstants.VERYLARGE))
								{
									dmy_type = coord_type.UNDEFINED.getValue();
									break;
								}
								if (GlobalMembersAxis.axis_array[xp.x_axis].log)
								{
									if (x + boxwidth / 2 < 0.0)
									{
										dmy_type = coord_type.UNDEFINED.getValue();
										break;
									}
									else if (x + boxwidth / 2 == 0.0)
									{
										yp.points.get(i).xhigh = -DefineConstants.VERYLARGE;
										dmy_type = coord_type.OUTRANGE.getValue();
										break;
									}
									else
									{
										yp.points.get(i).xhigh = (Math.log(x + boxwidth / 2) / GlobalMembersAxis.axis_array[xp.x_axis].log_base);
									}
								}
								else
									yp.points.get(i).xhigh = x + boxwidth / 2;
								if (xp.noautoscale)
									break;
								if (dmy_type != coord_type.INRANGE.getValue())
									break;
								if ((int)xp.x_axis < 0)
									break;
								if (x + boxwidth / 2 < GlobalMembersAxis.axis_array[xp.x_axis].data_min)
									GlobalMembersAxis.axis_array[xp.x_axis].data_min = x + boxwidth / 2;
								if (x + boxwidth / 2 < GlobalMembersAxis.axis_array[xp.x_axis].min)
								{
									if ((GlobalMembersAxis.axis_array[xp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 :  0)) != 0)
										GlobalMembersAxis.axis_array[xp.x_axis].min = x + boxwidth / 2;
									else
									{
										dmy_type = coord_type.OUTRANGE.getValue();
										break;
									}
								}
								if (x + boxwidth / 2 > GlobalMembersAxis.axis_array[xp.x_axis].data_max)
									GlobalMembersAxis.axis_array[xp.x_axis].data_max = x + boxwidth / 2;
								if (x + boxwidth / 2 > GlobalMembersAxis.axis_array[xp.x_axis].max)
								{
									if ((GlobalMembersAxis.axis_array[xp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 :  0)) != 0)
										GlobalMembersAxis.axis_array[xp.x_axis].max = x + boxwidth / 2;
									else
									{
										dmy_type = coord_type.OUTRANGE.getValue();
									}
								}
							} while (false);
						}
						/* we hadn't done logs when we stored earlier */
						do
						{
							if (xp.x_axis == DefineConstants.NO_AXIS)
								break;
							if (!(x > -DefineConstants.VERYLARGE && x < DefineConstants.VERYLARGE))
							{
								yp.points.get(i).type = coord_type.UNDEFINED;
								break;
							}
							if (GlobalMembersAxis.axis_array[xp.x_axis].log)
							{
								if (x < 0.0)
								{
									yp.points.get(i).type = coord_type.UNDEFINED;
									break;
								}
								else if (x == 0.0)
								{
									yp.points.get(i).x = -DefineConstants.VERYLARGE;
									yp.points.get(i).type = coord_type.OUTRANGE;
									break;
								}
								else
								{
									yp.points.get(i).x = (Math.log(x) / GlobalMembersAxis.axis_array[xp.x_axis].log_base);
								}
							}
							else
								yp.points.get(i).x = x;
							if (xp.noautoscale)
								break;
							if (yp.points.get(i).type != coord_type.INRANGE)
								break;
							if ((int)xp.x_axis < 0)
								break;
							if (x < GlobalMembersAxis.axis_array[xp.x_axis].data_min)
								GlobalMembersAxis.axis_array[xp.x_axis].data_min = x;
							if (x < GlobalMembersAxis.axis_array[xp.x_axis].min)
							{
								if ((GlobalMembersAxis.axis_array[xp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 :  0)) != 0)
									GlobalMembersAxis.axis_array[xp.x_axis].min = x;
								else
								{
									yp.points.get(i).type = coord_type.OUTRANGE;
									break;
								}
							}
							if (x > GlobalMembersAxis.axis_array[xp.x_axis].data_max)
								GlobalMembersAxis.axis_array[xp.x_axis].data_max = x;
							if (x > GlobalMembersAxis.axis_array[xp.x_axis].max)
							{
								if ((GlobalMembersAxis.axis_array[xp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 :  0)) != 0)
									GlobalMembersAxis.axis_array[xp.x_axis].max = x;
								else
								{
									yp.points.get(i).type = coord_type.OUTRANGE;
								}
							}
						} while (false);
						do
						{
							if (xp.y_axis == DefineConstants.NO_AXIS)
								break;
							if (!(y > -DefineConstants.VERYLARGE && y < DefineConstants.VERYLARGE))
							{
								yp.points.get(i).type = coord_type.UNDEFINED;
								break;
							}
							if (GlobalMembersAxis.axis_array[xp.y_axis].log)
							{
								if (y < 0.0)
								{
									yp.points.get(i).type = coord_type.UNDEFINED;
									break;
								}
								else if (y == 0.0)
								{
									yp.points.get(i).y = -DefineConstants.VERYLARGE;
									yp.points.get(i).type = coord_type.OUTRANGE;
									break;
								}
								else
								{
									yp.points.get(i).y = (Math.log(y) / GlobalMembersAxis.axis_array[xp.y_axis].log_base);
								}
							}
							else
								yp.points.get(i).y = y;
							if (xp.noautoscale)
								break;
							if (yp.points.get(i).type != coord_type.INRANGE)
								break;
							if ((int)xp.y_axis < 0)
								break;
							if (y < GlobalMembersAxis.axis_array[xp.y_axis].data_min)
								GlobalMembersAxis.axis_array[xp.y_axis].data_min = y;
							if (y < GlobalMembersAxis.axis_array[xp.y_axis].min)
							{
								if ((GlobalMembersAxis.axis_array[xp.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 :  0)) != 0)
									GlobalMembersAxis.axis_array[xp.y_axis].min = y;
								else
								{
									yp.points.get(i).type = coord_type.OUTRANGE;
									break;
								}
							}
							if (y > GlobalMembersAxis.axis_array[xp.y_axis].data_max)
								GlobalMembersAxis.axis_array[xp.y_axis].data_max = y;
							if (y > GlobalMembersAxis.axis_array[xp.y_axis].max)
							{
								if ((GlobalMembersAxis.axis_array[xp.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 :  0)) != 0)
									GlobalMembersAxis.axis_array[xp.y_axis].max = y;
								else
								{
									yp.points.get(i).type = coord_type.OUTRANGE;
								}
							}
						} while (false);
					}
					else
					{
						double x = xp.points.get(i).y;
						double y = yp.points.get(i).y;

						if (boxwidth >= 0 && boxwidth_is_absolute)
						{
							int dmy_type = coord_type.INRANGE.getValue();
							do
							{
								if (yp.x_axis == DefineConstants.NO_AXIS)
									break;
								if (!(x - boxwidth / 2 > -DefineConstants.VERYLARGE && x - boxwidth / 2 < DefineConstants.VERYLARGE))
								{
									dmy_type = coord_type.UNDEFINED.getValue();
									break;
								}
								if (GlobalMembersAxis.axis_array[yp.x_axis].log)
								{
									if (x - boxwidth / 2 < 0.0)
									{
										dmy_type = coord_type.UNDEFINED.getValue();
										break;
									}
									else if (x - boxwidth / 2 == 0.0)
									{
										yp.points.get(i).xlow = -DefineConstants.VERYLARGE;
										dmy_type = coord_type.OUTRANGE.getValue();
										break;
									}
									else
									{
										yp.points.get(i).xlow = (Math.log(x - boxwidth / 2) / GlobalMembersAxis.axis_array[yp.x_axis].log_base);
									}
								}
								else
									yp.points.get(i).xlow = x - boxwidth / 2;
								if (xp.noautoscale)
									break;
								if (dmy_type != coord_type.INRANGE.getValue())
									break;
								if ((int)yp.x_axis < 0)
									break;
								if (x - boxwidth / 2 < GlobalMembersAxis.axis_array[yp.x_axis].data_min)
									GlobalMembersAxis.axis_array[yp.x_axis].data_min = x - boxwidth / 2;
								if (x - boxwidth / 2 < GlobalMembersAxis.axis_array[yp.x_axis].min)
								{
									if ((GlobalMembersAxis.axis_array[yp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 :  0)) != 0)
										GlobalMembersAxis.axis_array[yp.x_axis].min = x - boxwidth / 2;
									else
									{
										dmy_type = coord_type.OUTRANGE.getValue();
										break;
									}
								}
								if (x - boxwidth / 2 > GlobalMembersAxis.axis_array[yp.x_axis].data_max)
									GlobalMembersAxis.axis_array[yp.x_axis].data_max = x - boxwidth / 2;
								if (x - boxwidth / 2 > GlobalMembersAxis.axis_array[yp.x_axis].max)
								{
									if ((GlobalMembersAxis.axis_array[yp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 :  0)) != 0)
										GlobalMembersAxis.axis_array[yp.x_axis].max = x - boxwidth / 2;
									else
									{
										dmy_type = coord_type.OUTRANGE.getValue();
									}
								}
							} while (false);
							dmy_type = coord_type.INRANGE.getValue();
							do
							{
								if (yp.x_axis == DefineConstants.NO_AXIS)
									break;
								if (!(x + boxwidth / 2 > -DefineConstants.VERYLARGE && x + boxwidth / 2 < DefineConstants.VERYLARGE))
								{
									dmy_type = coord_type.UNDEFINED.getValue();
									break;
								}
								if (GlobalMembersAxis.axis_array[yp.x_axis].log)
								{
									if (x + boxwidth / 2 < 0.0)
									{
										dmy_type = coord_type.UNDEFINED.getValue();
										break;
									}
									else if (x + boxwidth / 2 == 0.0)
									{
										yp.points.get(i).xhigh = -DefineConstants.VERYLARGE;
										dmy_type = coord_type.OUTRANGE.getValue();
										break;
									}
									else
									{
										yp.points.get(i).xhigh = (Math.log(x + boxwidth / 2) / GlobalMembersAxis.axis_array[yp.x_axis].log_base);
									}
								}
								else
									yp.points.get(i).xhigh = x + boxwidth / 2;
								if (xp.noautoscale)
									break;
								if (dmy_type != coord_type.INRANGE.getValue())
									break;
								if ((int)yp.x_axis < 0)
									break;
								if (x + boxwidth / 2 < GlobalMembersAxis.axis_array[yp.x_axis].data_min)
									GlobalMembersAxis.axis_array[yp.x_axis].data_min = x + boxwidth / 2;
								if (x + boxwidth / 2 < GlobalMembersAxis.axis_array[yp.x_axis].min)
								{
									if ((GlobalMembersAxis.axis_array[yp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 :  0)) != 0)
										GlobalMembersAxis.axis_array[yp.x_axis].min = x + boxwidth / 2;
									else
									{
										dmy_type = coord_type.OUTRANGE.getValue();
										break;
									}
								}
								if (x + boxwidth / 2 > GlobalMembersAxis.axis_array[yp.x_axis].data_max)
									GlobalMembersAxis.axis_array[yp.x_axis].data_max = x + boxwidth / 2;
								if (x + boxwidth / 2 > GlobalMembersAxis.axis_array[yp.x_axis].max)
								{
									if ((GlobalMembersAxis.axis_array[yp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 :  0)) != 0)
										GlobalMembersAxis.axis_array[yp.x_axis].max = x + boxwidth / 2;
									else
									{
										dmy_type = coord_type.OUTRANGE.getValue();
									}
								}
							} while (false);
						}
						do
						{
							if (yp.x_axis == DefineConstants.NO_AXIS)
								break;
							if (!(x > -DefineConstants.VERYLARGE && x < DefineConstants.VERYLARGE))
							{
								yp.points.get(i).type = coord_type.UNDEFINED;
								break;
							}
							if (GlobalMembersAxis.axis_array[yp.x_axis].log)
							{
								if (x < 0.0)
								{
									yp.points.get(i).type = coord_type.UNDEFINED;
									break;
								}
								else if (x == 0.0)
								{
									yp.points.get(i).x = -DefineConstants.VERYLARGE;
									yp.points.get(i).type = coord_type.OUTRANGE;
									break;
								}
								else
								{
									yp.points.get(i).x = (Math.log(x) / GlobalMembersAxis.axis_array[yp.x_axis].log_base);
								}
							}
							else
								yp.points.get(i).x = x;
							if (xp.noautoscale)
								break;
							if (yp.points.get(i).type != coord_type.INRANGE)
								break;
							if ((int)yp.x_axis < 0)
								break;
							if (x < GlobalMembersAxis.axis_array[yp.x_axis].data_min)
								GlobalMembersAxis.axis_array[yp.x_axis].data_min = x;
							if (x < GlobalMembersAxis.axis_array[yp.x_axis].min)
							{
								if ((GlobalMembersAxis.axis_array[yp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 :  0)) != 0)
									GlobalMembersAxis.axis_array[yp.x_axis].min = x;
								else
								{
									yp.points.get(i).type = coord_type.OUTRANGE;
									break;
								}
							}
							if (x > GlobalMembersAxis.axis_array[yp.x_axis].data_max)
								GlobalMembersAxis.axis_array[yp.x_axis].data_max = x;
							if (x > GlobalMembersAxis.axis_array[yp.x_axis].max)
							{
								if ((GlobalMembersAxis.axis_array[yp.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 :  0)) != 0)
									GlobalMembersAxis.axis_array[yp.x_axis].max = x;
								else
								{
									yp.points.get(i).type = coord_type.OUTRANGE;
								}
							}
						} while (false);
						do
						{
							if (yp.y_axis == DefineConstants.NO_AXIS)
								break;
							if (!(y > -DefineConstants.VERYLARGE && y < DefineConstants.VERYLARGE))
							{
								yp.points.get(i).type = coord_type.UNDEFINED;
								break;
							}
							if (GlobalMembersAxis.axis_array[yp.y_axis].log)
							{
								if (y < 0.0)
								{
									yp.points.get(i).type = coord_type.UNDEFINED;
									break;
								}
								else if (y == 0.0)
								{
									yp.points.get(i).y = -DefineConstants.VERYLARGE;
									yp.points.get(i).type = coord_type.OUTRANGE;
									break;
								}
								else
								{
									yp.points.get(i).y = (Math.log(y) / GlobalMembersAxis.axis_array[yp.y_axis].log_base);
								}
							}
							else
								yp.points.get(i).y = y;
							if (xp.noautoscale)
								break;
							if (yp.points.get(i).type != coord_type.INRANGE)
								break;
							if ((int)yp.y_axis < 0)
								break;
							if (y < GlobalMembersAxis.axis_array[yp.y_axis].data_min)
								GlobalMembersAxis.axis_array[yp.y_axis].data_min = y;
							if (y < GlobalMembersAxis.axis_array[yp.y_axis].min)
							{
								if ((GlobalMembersAxis.axis_array[yp.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 :  0)) != 0)
									GlobalMembersAxis.axis_array[yp.y_axis].min = y;
								else
								{
									yp.points.get(i).type = coord_type.OUTRANGE;
									break;
								}
							}
							if (y > GlobalMembersAxis.axis_array[yp.y_axis].data_max)
								GlobalMembersAxis.axis_array[yp.y_axis].data_max = y;
							if (y > GlobalMembersAxis.axis_array[yp.y_axis].max)
							{
								if ((GlobalMembersAxis.axis_array[yp.y_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 :  0)) != 0)
									GlobalMembersAxis.axis_array[yp.y_axis].max = y;
								else
								{
									yp.points.get(i).type = coord_type.OUTRANGE;
								}
							}
						} while (false);
					}
				}

				/* Ok, fix up the title to include both the xp and yp plots. */
				if (xp.title != null && xp.title.charAt(0) != '\0' && yp.title != null)
				{
					tlen = yp.title.length() + xp.title.length() + 3;
					new_title = GlobalMembersAlloc.gp_alloc(tlen, "string");
					new_title = xp.title;
					new_title += ", ";
					new_title += yp.title;
					//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(yp.title);
					yp.title = new_title;
				}
				/* move xp to head of free list */
				xp.next = free_list;
				free_list = xp;

				/* append yp to new_list */
				last_pointer = yp;
				last_pointer = &(yp.next);
				xp = yp.next;

			} // data plot
			else
			{
				assert last_pointer == xp;
				last_pointer = &(xp.next);
				xp = xp.next;
			}
		} // loop over plots

		first_plot = new_list;

		/* Ok, stick the free list at the end of the curve_points plot list. */
		last_pointer = free_list;
	}

	/* Autoscaling of box plots cuts off half of the box on each end. */
	/* Add a half-boxwidth to the range in this case.  EAM Aug 2007   */
	public static void box_range_fiddling(curve_points plot)
	{
		double xlow;
		double xhigh;

		if ((GlobalMembersAxis.axis_array[plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MIN.getValue() != 0) ? 1 : 0)) != 0)
		{
			if (plot.points.get(0).type != coord_type.UNDEFINED && plot.points.get(1).type != coord_type.UNDEFINED)
			{
				xlow = plot.points.get(0).x - (plot.points.get(1).x - plot.points.get(0).x) / 2.;
				if (GlobalMembersAxis.axis_array[plot.x_axis].min > xlow)
					GlobalMembersAxis.axis_array[plot.x_axis].min = xlow;
			}
		}
		if ((GlobalMembersAxis.axis_array[plot.x_axis].autoscale.getValue() & ((e_autoscale.AUTOSCALE_MAX.getValue() != 0) ? 1 : 0)) != 0)
		{
			int i = plot.p_count - 1;
			if (plot.points.get(i).type != coord_type.UNDEFINED && plot.points.get(i-1).type != coord_type.UNDEFINED)
			{
				xhigh = plot.points.get(i).x + (plot.points.get(i).x - plot.points.get(i - 1).x) / 2.;
				if (GlobalMembersAxis.axis_array[plot.x_axis].max < xhigh)
					GlobalMembersAxis.axis_array[plot.x_axis].max = xhigh;
			}
		}
	}

	/* Since the stored x values for histogrammed data do not correspond exactly */
	/* to the eventual x coordinates, we need to modify the x axis range bounds. */
	/* Also the two stacked histogram modes need adjustment of the y axis bounds.*/
	public static void histogram_range_fiddling(curve_points plot)
	{
		double xlow;
		double xhigh;
		int i;
		/*
		 * EAM FIXME - HT_STACKED_IN_TOWERS forcibly resets xmin, which is only
		 *   correct if no other plot came first.
		 */
		switch (GlobalMembersGadgets.histogram_opts.type)
		{
		case histogram_type.HT_STACKED_IN_LAYERS.getValue():
			if (GlobalMembersAxis.axis_array[plot.y_axis].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
			{
				if (plot.histogram_sequence == 0)
				{
					if (stackheight != null)
						//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
						free(stackheight);
					//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
					stackheight = GlobalMembersAlloc.gp_alloc(plot.p_count * sizeof(GlobalMembersMouse.struct coordinate), "stackheight array");
					for (stack_count = 0; stack_count < plot.p_count; stack_count++)
					{
						stackheight[stack_count].yhigh = 0;
						stackheight[stack_count].ylow = 0;
					}
				}
				else if (plot.p_count > stack_count)
				{
					//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
					stackheight = GlobalMembersAlloc.gp_realloc(stackheight, plot.p_count * sizeof(GlobalMembersMouse.struct coordinate), "stackheight array");
					for (; stack_count < plot.p_count; stack_count++)
					{
						stackheight[stack_count].yhigh = 0;
						stackheight[stack_count].ylow = 0;
					}
				}
				for (i = 0; i < stack_count; i++)
				{
					if (plot.points[i].type == coord_type.UNDEFINED)
						continue;
					if (plot.points[i].y >= 0)
						stackheight[i].yhigh += plot.points[i].y;
					else
						stackheight[i].ylow += plot.points[i].y;

					if (GlobalMembersAxis.axis_array[plot.y_axis].max < stackheight[i].yhigh)
						GlobalMembersAxis.axis_array[plot.y_axis].max = stackheight[i].yhigh;
					if (GlobalMembersAxis.axis_array[plot.y_axis].min > stackheight[i].ylow)
						GlobalMembersAxis.axis_array[plot.y_axis].min = stackheight[i].ylow;

				}
			}
			/* fall through to checks on x range */
		case histogram_type.HT_CLUSTERED.getValue():
		case histogram_type.HT_ERRORBARS.getValue():
			if (((int)GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale) == 0)
				break;
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
			{
				xlow = plot.histogram.start - 1.0;
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min > xlow)
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min = xlow;
			}
			if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
			{
				/* FIXME - why did we increment p_count on UNDEFINED points? */
				while (plot.points[plot.p_count - 1].type == coord_type.UNDEFINED)
				{
					plot.p_count--;
					if (plot.p_count == 0)
						GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "All points in histogram UNDEFINED");
				}
				xhigh = plot.points[plot.p_count - 1].x;
				xhigh += plot.histogram.start + 1.0;
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max < xhigh)
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max = xhigh;
			}
			break;
		case histogram_type.HT_STACKED_IN_TOWERS.getValue():
			/* FIXME: Rather than trying to reproduce the layout along X */
			/* we should just track the actual xmin/xmax as we go.       */
			if (((int)GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].set_autoscale) != 0)
			{
				xlow = -1.0;
				xhigh = plot.histogram_sequence;
				xhigh += plot.histogram.start + 1.0;
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min > xlow)
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min = xlow;
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max != xhigh)
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max = xhigh;
			}
			if (((int)GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].set_autoscale) != 0)
			{
				double ylow;
				double yhigh;
				for (i = 0, yhigh = ylow = 0.0; i < plot.p_count; i++)
					if (plot.points[i].type != coord_type.UNDEFINED)
					{
						if (plot.points[i].y >= 0)
							yhigh += plot.points[i].y;
						else
							ylow += plot.points[i].y;
					}
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].set_autoscale & e_autoscale.AUTOSCALE_MAX != 0)
					if (GlobalMembersAxis.axis_array[plot.y_axis].max < yhigh)
						GlobalMembersAxis.axis_array[plot.y_axis].max = yhigh;
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].set_autoscale & e_autoscale.AUTOSCALE_MIN != 0)
					if (GlobalMembersAxis.axis_array[plot.y_axis].min > ylow)
						GlobalMembersAxis.axis_array[plot.y_axis].min = ylow;
			}
			break;
		}
	}

	/* internal and external variables */

	/* the curves/surfaces of the plot */
	public static LinkedList<curve_points> first_plot = null;
	public static udft_entry plot_func = new udft_entry();

	/* box width (automatic) */
	public static double boxwidth = -1.0;
	/* whether box width is absolute (default) or relative */
	public static boolean boxwidth_is_absolute = true;

	public static double histogram_rightmost = 0.0; // Highest x-coord of histogram so far
	public static String histogram_title = null; // Subtitle for this histogram
	public static coordinate stackheight = null; // Scratch space for y autoscale
	public static int stack_count = 0; // counter for stackheight
}