package com.addiPlot.gnuplot;

import com.addiPlot.gnuplot.tangible.RefObject;

public class GlobalMembersPlot
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
	//	return GlobalMembersAlloc.RCSid("$Id: plot.c,v 1.104.2.4 2010/02/18 05:52:49 sfeam Exp $");
	//}
	///#endif

	/* GNUPLOT - plot.c */

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
	/*
	 * $Id: plot.h,v 1.45 2008/03/30 03:27:54 sfeam Exp $
	 */

	/* GNUPLOT - plot.h */

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


	/* #if... / #include / #define collection: */

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

	///#ifdef USE_MOUSE
	///#if defined(PIPE_IPC) || defined(WIN_IPC)
	///#endif
	///#ifdef OS2
	///#endif
	///#ifdef _MOUSE_C
	///#endif // _MOUSE_C 
	///#if 0
	///#endif
	///#if defined(_MOUSE_C)
	///#else
	///#endif
	///#endif

	/* Type definitions */

	/* Variables of plot.c needed by other modules: */

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean interactive;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean persist_cl;

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern String user_shell;

	///#ifdef LINUXVGA
	// /* utility functions to ensure that setuid gnuplot
	//  * assumes root privileges only for those parts
	//  * of the code which require root rights.
	//  *
	//  * By "Dr. Werner Fink" <werner@suse.de>
	//  */
	//static uid_t euid, ruid;
	//static gid_t egid, rgid;
	//static int asked_privi = 0;
	//
	//void
	//drop_privilege()
	//{
	//    if (!asked_privi) {
	//	euid = geteuid();
	//	egid = getegid();
	//	ruid = getuid();
	//	rgid = getgid();
	//	asked_privi = 1;
	//    }
	//    if (setegid(rgid) == -1)
	//	(void) fprintf(stderr, "setegid(%d): %s\n",
	//		       (int) rgid, strerror(errno));
	//    if (seteuid(ruid) == -1)
	//	(void) fprintf(stderr, "seteuid(%d): %s\n",
	//		       (int) ruid, strerror(errno));
	//}
	//
	//void
	//take_privilege()
	//{
	//    if (!asked_privi) {
	//	euid = geteuid();
	//	egid = getegid();
	//	ruid = getuid();
	//	rgid = getgid();
	//	asked_privi = 1;
	//    }
	//    if (setegid(egid) == -1)
	//	(void) fprintf(stderr, "setegid(%d): %s\n",
	//		       (int) egid, strerror(errno));
	//    if (seteuid(euid) == -1)
	//	(void) fprintf(stderr, "seteuid(%d): %s\n",
	//		       (int) euid, strerror(errno));
	//}
	//
	///#endif // LINUXVGA 

	/* a wrapper for longjmp so we can keep everything local */

	///#ifdef OS2
	//extern TBOOLEAN CallFromRexx;
	///#endif

	/* Prototypes of functions exported by plot.c */

	public static void bail_to_command_line()
	{
		///#ifdef _Windows
		//    call_kill_pending_Pause_dialog();
		///#endif
		siglongjmp(command_line_env, true);
	}

	/* Set up to catch interrupts */
	public static void interrupt_setup()
	{
		///#ifdef __PUREC__
		//    setmatherr(purec_matherr);
		///#endif

		///#if defined(WGP_CONSOLE)
		// /* FIXME. CTRC+C crashes console mode gnuplot for windows.
		//    Failure of longjmp() is not easy to fix so that the signal
		//    of SIGINT is just ignored at the moment.
		// */
		//    (void) signal(SIGINT, SIG_IGN);
		///#else
		signal(SIGINT, (sigfunc) GlobalMembersPlot.inter);
		///#endif

		///#ifdef SIGPIPE
		// /* ignore pipe errors, this might happen with set output "|head" */
		//    (void) signal(SIGPIPE, SIG_IGN);
		///#endif // SIGPIPE
	}

	/* expand tilde in path
	 * path cannot be a static array!
	 * tilde must be the first character in *pathp;
	 * we may change that later
	 */
	public static void gp_expand_tilde(RefObject<String[]> pathp)
	{
		if (pathp.argvalue == null)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Cannot expand empty path");

		if ((pathp.argvalue)[0] == '~' && (pathp.argvalue)[1] == DefineConstants.DIRSEP1)
		{
			if (user_homedir != null)
			{
				int n = String.valueOf(pathp.argvalue).length();

				pathp.argvalue = GlobalMembersAlloc.gp_realloc(pathp.argvalue, n + user_homedir.length(), "tilde expansion");
				/* include null at the end ... */
				//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memmove' has no equivalent in Java:
				memmove(pathp.argvalue + user_homedir.length() - 1, pathp.argvalue, n + 1);
				//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
				memcpy(pathp.argvalue, user_homedir, user_homedir.length());
			}
			else
				GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "HOME not set - cannot expand tilde");
		}
	}
	public static void get_user_env()
	{
		if (user_homedir.equals(DefineConstants.NULL))
		{
			String env_home;

			///#ifdef WIN32
			//    if ((env_home = getenv(HOME))|| (env_home = appdata_directory())
			//	    || (env_home = getenv("USERPROFILE"))
			///#else
			///#endif
			///#ifndef VMS
			if ((env_home = getenv(DefineConstants.HOME)) || (env_home = getenv("HOME")))
				///#else
				//    if ((env_home = getenv(HOME))
				///#endif
				user_homedir = (String) GlobalMembersUtil.gp_strdup(env_home);
			else if (interactive)
				GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "no HOME found");
		}
		/* Hhm ... what about VMS? */
		if (user_shell.equals(DefineConstants.NULL))
		{
			String env_shell;

			if ((env_shell = getenv("SHELL")) == DefineConstants.NULL)
				///#if defined(MSDOS) || defined(_Windows) || defined(DOS386) || defined(OS2)
				//	    if ((env_shell = getenv("COMSPEC")) == NULL)
				///#endif
				env_shell = DefineConstants.SHELL;

			user_shell = (String) GlobalMembersUtil.gp_strdup(env_shell);
		}
	}

	///#ifdef LINUXVGA
	//void drop_privilege __PROTO((void));
	//void take_privilege __PROTO((void));
	///#endif // LINUXVGA 

	///#ifdef OS2
	//int ExecuteMacro __PROTO((char *, int));
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
	///#define STACK_DEPTH 100
	///#define MAX_AT_LEN 150
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define is_jump(operator) ((operator) >=(int)JUMP && (operator) <(int)SF_START)
	///#ifdef __ZTC__
	///#else
	///#endif
	///#ifdef APOLLO
	///#endif
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
	///#define SMPAL_NEGATIVE 'n'
	///#define SMPAL_POSITIVE 'p'
	///#ifdef EXTENDED_COLOR_SPECS
	///#endif
	///#ifdef EXTENDED_COLOR_SPECS
	///#else
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
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_x3d(x) ((x-X_AXIS.min)*xscale3d + xcenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_y3d(y) ((y-Y_AXIS.min)*yscale3d + ycenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_z3d(z) ((z-floor_z)*zscale3d + zcenter3d -1.0)
	///#define ISO_SAMPLES 10
	///#ifdef USE_MOUSE
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


	///#ifdef OS2 // os2.h required for gpexecute.h
	///#define INCL_DOS
	///#define INCL_REXXSAA
	///#ifdef OS2_IPC
	///#define INCL_DOSSEMAPHORES
	///#endif
	///#include <os2.h>
	///#endif // OS2 

	///#ifdef USE_MOUSE
	///#ifdef OS2_IPC
	///#define INCL_DOSPROCESS
	///#define INCL_DOSSEMAPHORES
	///#include <os2.h>
	///#endif // OS2_IPC 
	///#ifdef PIPE_IPC
	///#endif // PIPE_IPC 
	///#if defined(PIPE_IPC) || defined(WIN_IPC)
	///#endif // PIPE_IPC || WIN_IPC 
	///#endif

	/* on OS/2 this is needed even without USE_MOUSE */
	///#if defined(OS2_IPC) && !defined(USE_MOUSE)
	///#include "gpexecute.h"
	///#endif

	/* Used nowhere else */
	///#ifdef HAVE_SYS_UTSNAME_H
	///#endif

	///#if defined(MSDOS) || defined(DOS386) || defined(__EMX__)
	///#include <io.h>
	///#endif

	///#ifdef VMS
	///#ifndef __GNUC__
	///#include <unixio.h>
	///#endif
	///#include <smgdef.h>
	///#include <ssdef.h>
	//extern int vms_vkid;
	//extern smg$create_virtual_keyboard();
	//extern int vms_ktid;
	//extern smg$create_key_table();
	///#endif // VMS 

	///#ifdef AMIGA_SC_6_1
	///#include <proto/dos.h>
	///#endif

	///#ifdef _Windows
	///#include <windows.h>
	///#ifndef SIGINT
	///#define SIGINT 2		// for MSC 
	///#endif
	///#include "win/wgnuplib.h"
	///#include "win/wcommon.h"
	///#endif // _Windows 

	/* GNU readline
	 * Only required by two files directly,
	 * so I don't put this into a header file. -lh
	 */
	///#ifdef HAVE_LIBREADLINE
	///#ifdef GNUPLOT_HISTORY
	///#endif
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int rl_complete_with_tilde_expansion;
	///#endif

	/* BSD editline
	 */
	///#ifdef HAVE_LIBEDITLINE
	///#include <editline/readline.h>
	///#endif

	/* enable gnuplot history with readline */
	///#ifdef GNUPLOT_HISTORY
	///#ifndef GNUPLOT_HISTORY_FILE
	///#define GNUPLOT_HISTORY_FILE "~/.gnuplot_history"
	///#endif
	/*
	 * The next variable is a pointer to the value returned from 'tilde_expand()'.
	 * This function expands '~' to the user's home directory, or $HOME, with
	 * UN*X, AmigaOS, MSDOS.
	 * Depending on your OS you have to make sure that the "$HOME" environment
	 * variable exitsts.  You are responsible for valid values.
	 */
	public static String expanded_history_filename;

	///#ifdef OS2
	//
	//int
	//ExecuteMacro(char *argv, int namelength)
	//{
	//    RXSTRING rxRc;
	//    RXSTRING rxArg[2];
	//    int rxArgCount = 0;
	//    char pszName[CCHMAXPATH];
	//    char *rxArgStr;
	//    short sRc;
	//    long rc;
	//
	//    if (namelength >= sizeof(pszName))
	//	return 1;
	// /* FIXME HBB 20010121: 3rd argument doesn't make sense. Either
	//  * this should be sizeof(pszName), or it shouldn't use
	//  * safe_strncpy(), here */
	//    safe_strncpy(pszName, argv, namelength + 1);
	//    rxArgStr = &argv[namelength];
	//    RXSTRPTR(rxRc) = NULL;
	//
	///#if 0
	// /*
	//    C-like calling of function: program name is first
	//    parameter.
	//    In REXX you would have to use
	//    Parse Arg param0, param1
	//    to get the program name in param0 and the arguments in param1.
	//
	//    Some versions before gnuplot 3.7pl1 used a similar approach but
	//    passed program name and arguments in a single string:
	//    (==> Parse Arg param0 param1)
	//  */
	//
	//    MAKERXSTRING(rxArg[0], pszName, strlen(pszName));
	//    rxArgCount++;
	//    if (*rxArgStr) {
	//	MAKERXSTRING(rxArg[1], rxArgStr, strlen(rxArgStr));
	//	rxArgCount++;
	//    }
	///#else
	// /*
	//    REXX standard calling (gnuplot 3.7pl1 and above):
	//    The program name is not supplied and so all actual arguments
	//    are in a single string:
	//    Parse Arg param
	//    We even handle blanks like cmd.exe when calling REXX programs.
	//  */
	//
	//    if (*rxArgStr) {
	//	MAKERXSTRING(rxArg[0], rxArgStr, strlen(rxArgStr));
	//	rxArgCount++;
	//    }
	///#endif
	//
	//    CallFromRexx = TRUE;
	//    rc = RexxStart(
	//		      rxArgCount,
	//		      rxArg,
	//		      pszName,
	//		      NULL,
	//		      "GNUPLOT",
	//		      RXCOMMAND,
	//		      NULL,
	//		      &sRc,
	//		      &rxRc);
	//    CallFromRexx = FALSE;
	//
	// /* am: a word WRT errors codes:
	//    the negative ones don't seem to have symbolic names, you can get
	//    them from the OREXX reference, they're not in REXX Programming Guide -
	//    no idea where to retrieve them from a Warp 3 reference ??
	//    The positive ones are somehow referenced in REXXPG
	// */
	//    if (rc < 0) {
	// /* REXX error */
	//    } else if (rc > 0) {
	// /* Interpreter couldn't be started */
	//	if (rc == -4)
	// /* run was cancelled, but don't give error message */
	//	    rc = 0;
	//    } else if (rc==0) {
	// /* all was fine */
	//    }
	//
	// /* We don't we try to use rxRc ?
	//    BTW, don't use free() instead since it's allocated inside RexxStart()
	//    and not in our executable using the EMX libraries */
	//   if (RXSTRPTR(rxRc))
	// /* I guess it's NULL if something major went wrong,
	// NULL strings are usually not part of the REXX language ... */
	//       DosFreeMem(rxRc.strptr);
	//
	//   return rc;
	//}
	//
	// /* Rexx command line interface */
	//ULONG
	//RexxInterface(PRXSTRING rxCmd, PUSHORT pusErr, PRXSTRING rxRc)
	//{
	//    int rc;
	//    static JMP_BUF keepenv;
	//    int cmdlen;
	//
	//    memcpy(keepenv, command_line_env, sizeof(JMP_BUF));
	//    if (!SETJMP(command_line_env, 1)) {
	// /* Set variable gp_input_line.
	//    Watch out for line length of NOT_ZERO_TERMINATED strings ! */
	//	cmdlen = rxCmd->strlength + 1;
	// /* FIXME HBB 20010121: 3rd argument doesn't make sense. Either
	//  * this should be gp_input_line_len, or it shouldn't use
	//  * safe_strncpy(), here */
	//	safe_strncpy(gp_input_line, rxCmd->strptr, cmdlen);
	//	gp_input_line[cmdlen] = NUL;
	//	rc = do_line();
	//	*pusErr = RXSUBCOM_OK;
	//	rxRc->strptr[0] = rc + '0';
	//	rxRc->strptr[1] = NUL;
	//	rxRc->strlength = strlen(rxRc->strptr);
	//    } else {
	// /*
	//    We end up here when bail_to_command_line() is called.
	//    Therefore sometimes this call should be avoided when
	//    executing a REXX program (e.g. 'Cancel' from
	//    PM GUI after a 'pause -1' command)
	// */
	//	*pusErr = RXSUBCOM_ERROR;
	//	RexxSetHalt(getpid(), 1);
	//    }
	//    memcpy(command_line_env, keepenv, sizeof(JMP_BUF));
	//    return 0;
	//}
	///#endif

	///#ifdef GNUPLOT_HISTORY
	///#if defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)


	public static void wrapper_for_write_history()
	{
		///#if 1
		/* Alternative code, saves one disk access */
		if (history_is_stifled())
			unstifle_history();
		if (GlobalMembersHistory.gnuplot_history_size >= 0)
			stifle_history(GlobalMembersHistory.gnuplot_history_size);

		/* returns 0 on success */
		if (write_history(expanded_history_filename))
			fprintf(stderr, "Warning:  Could not write history file!!!\n");

		unstifle_history();
		///#else
		// /* if writing was successful, truncate history
		//  *  to gnuplot_history_size lines
		//  */
		//    if (write_history(expanded_history_filename)) {
		//	if (gnuplot_history_size >= 0)
		//	    history_truncate_file(expanded_history_filename, gnuplot_history_size);
		//    }
		///#endif
	}

	///#endif				// GNUPLOT_HISTORY 

	public static boolean interactive = true; // FALSE if stdin not a terminal
	public static boolean noinputfiles = true; // FALSE if there are script files
	public static boolean persist_cl = false; // TRUE if -persist is parsed in the command line

	/* user home directory */
	public static String user_homedir = DefineConstants.NULL;

	/* user shell */
	public static String user_shell = DefineConstants.NULL;

	///#ifdef X11
	//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//extern int X11_args(int NamelessParameter1, tangible.RefObject<String[]> NamelessParameter2);
	///#endif

	/* patch to get home dir, see command.c */
	///#if (defined (__TURBOC__) && (defined (MSDOS) || defined(DOS386))) || defined(DJGPP)
	///#include <dir.h>               // MAXPATH 
	//char HelpFile[MAXPATH];
	///#endif //   - DJL 

	/* a longjmp buffer to get back to the command line */
	/* FIXME HBB 20001103: should probably just use GPFAR, rather than
	 * check for _Windows */
	///#ifdef _Windows
	//static JMP_BUF far command_line_env;
	///#else
	public static sigjmp_buf command_line_env = new sigjmp_buf();

	/* Look for a gnuplot init file in current or home directory */
	///#endif

	public static void load_rcfile()
	{
		FILE plotrc = DefineConstants.NULL;
		String rcfile = DefineConstants.NULL;

		///#ifdef NOCWDRC
		// /* inhibit check of init file in current directory for security reasons */
		///#else
		plotrc = fopen(DefineConstants.PLOTRC, "r");
		///#endif // !NOCWDRC

		if (plotrc == DefineConstants.NULL)
		{
			if (user_homedir != null)
			{
				/* len of homedir + directory separator + len of file name + \0 */
				rcfile = (String) GlobalMembersAlloc.gp_alloc((user_homedir != null ? user_homedir.length() : 0) + 1 + DefineConstants.PLOTRC.length() + 1, "rcfile");
				rcfile = user_homedir;
				{
					//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
					byte * p = rcfile;
					p += rcfile.length();
					if (!rcfile.equals(p))
						p--;
					if (*p && (*p != DefineConstants.DIRSEP1) && (*p != DefineConstants.NUL))
					{
						if (*p)
							p++;
						*p++= DefineConstants.DIRSEP1;
						*p = DefineConstants.NUL;
					}
					rcfile += DefineConstants.PLOTRC;
				};
				plotrc = fopen(rcfile, "r");
			}
		}
		if (plotrc != null)
		{
			byte rc = GlobalMembersUtil.gp_strdup(rcfile != null ? rcfile : DefineConstants.PLOTRC);
			GlobalMembersMisc.load_file(plotrc, rc, false);
			GlobalMembersMisc.push_terminal(0); // needed if terminal or its options were changed
		}

		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(rcfile);
	}

	///#ifdef OS2
	///#include <process.h>
	//static ULONG RexxInterface(PRXSTRING, PUSHORT, PRXSTRING);
	//TBOOLEAN CallFromRexx = FALSE;
	///#endif // OS2 

	public static void inter(int anint)
	{
		() anint; // aovid -Wunused warning
		() signal(SIGINT, (sigfunc) GlobalMembersPlot.inter);

		///#ifndef DOSX286
		() signal(SIGFPE, SIG_DFL); // turn off FPE trapping
		///#endif

		///#ifdef OS2
		//    if (!strcmp(term->name,"pm")) {
		//	PM_intc_cleanup();
		// /* ??
		//   putc('\n', stderr);
		//   LONGJMP(command_line_env, TRUE);
		//  */
		//    } else
		///#endif
		{
			GlobalMembersTerm.term_reset();
			() putc('\n', stderr);
			GlobalMembersPlot.bail_to_command_line(); // return to prompt
		}
	}
	public static void init_memory()
	{
		GlobalMembersCommand.extend_input_line();
		GlobalMembersCommand.extend_token_table();
		GlobalMembersCommand.replot_line = GlobalMembersAlloc.gp_alloc(1, "string");
		GlobalMembersCommand.replot_line = DefineConstants.NUL;
	}

	public static int exit_status = DefineConstants.EXIT_SUCCESS;

	///#if defined(_Windows) || defined(_Macintosh)
	//int
	//gnu_main(int argc, char **argv)
	///#else
	public static int Main(int argc, String[] args)
	///#endif
	{
		int i;

		///#ifdef LINUXVGA
		//    LINUX_setup();		// setup VGA before dropping privilege DBT 4/5/99 
		//    drop_privilege();
		///#endif
		/* make sure that we really have revoked root access, this might happen if
	   gnuplot is compiled without vga support but is installed suid by mistake */
		///#ifdef __linux__
		setuid(getuid());
		///#endif

		///#if defined(MSDOS) && !defined(_Windows) && !defined(__GNUC__)
		//    PC_setup();
		///#endif // MSDOS !Windows 

		/* HBB: Seems this isn't needed any more for DJGPP V2? */
		/* HBB: disable all floating point exceptions, just keep running... */
		///#if defined(DJGPP) && (DJGPP!=2)
		//    _control87(MCW_EM, MCW_EM);
		///#endif

		///#if defined(OS2)
		//    int rc;
		///#ifdef OS2_IPC
		//    char semInputReadyName[40];
		//    sprintf( semInputReadyName, "\\SEM32\\GP%i_Input_Ready", getpid() );
		//    rc = DosCreateEventSem(semInputReadyName,&semInputReady,0,0);
		//    if (rc != 0)
		//      fputs("DosCreateEventSem error\n",stderr);
		///#endif
		//    rc = RexxRegisterSubcomExe("GNUPLOT", (PFN) RexxInterface, NULL);
		///#endif

		/* malloc large blocks, otherwise problems with fragmented mem */
		///#ifdef OSK
		//    _mallocmin(102400);
		///#endif

		///#ifdef MALLOCDEBUG
		//    malloc_debug(7);
		///#endif

		/* get helpfile from home directory */
		///#ifndef DOSX286
		///#ifndef _Windows
		///#if defined (__TURBOC__) && (defined (MSDOS) || defined(DOS386))
		//    strcpy(HelpFile, args[0]);
		//    strcpy(strrchr(HelpFile, DIRSEP1), "\\gnuplot.gih");
		///#endif			//   - DJL 
		///#endif				// !_Windows 
		///#endif // !DOSX286 
		///#ifdef __DJGPP__
		//    {
		//	char *s;
		//	strcpy(HelpFile, args[0]);
		//	for (s = HelpFile; *s; s++)
		//	    if (*s == DIRSEP1)
		//		*s = DIRSEP2;	// '\\' to '/' 
		//	strcpy(strrchr(HelpFile, DIRSEP2), "/gnuplot.gih");
		//    }			// Add also some "paranoid" tests for '\\':  AP 
		///#endif // DJGPP 

		///#ifdef VMS
		//    unsigned int status[2] = { 1, 0 };
		///#endif

		///#if defined(HAVE_LIBEDITLINE)
		//    rl_getc_function = getc_wrapper;
		///#endif
		///#if defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)
		using_history();
		/* T.Walter 1999-06-24: 'rl_readline_name' must be this fix name.
		 * It is used to parse a 'gnuplot' specific section in '~/.inputrc' */
		rl_readline_name = "Gnuplot";
		rl_terminal_name = getenv("TERM");
		///#endif
		///#if defined(HAVE_LIBREADLINE)
		rl_complete_with_tilde_expansion = 1;
		///#endif

		for (i = 1; i < argc; i++)
		{
			if (args[i] == null)
				continue;

			if (!strcmp(args[i], "-V") || !strcmp(args[i], "--version"))
			{
				System.out.printf("gnuplot %s patchlevel %s\n", GlobalMembersVersion.gnuplot_version, GlobalMembersVersion.gnuplot_patchlevel);

			}
			else if (!strcmp(args[i], "-h") || !strcmp(args[i], "--help"))
			{
				///#ifdef X11
				///#ifdef DIST_CONTACT
				///#else
				//        printf( "Usage: gnuplot [OPTION]... [FILE]\n"
				///#endif
				//        printf( "Usage: gnuplot [OPTION]... [FILE]\n""for X11 options see 'help X11->command-line-options'\n" + "  -V, --version\n" + "  -h, --help\n" + "  -p  --persist\n" + "  -e  \"command1; command2; ...\"\n" + "gnuplot %s patchlevel %s\n""Report bugs to "DIST_CONTACT"\n"
				//		    "            or %s\n",
				///#else
				System.out.printf("Usage: gnuplot [OPTION]... [FILE]\n""for X11 options see 'help X11->command-line-options'\n" + "  -V, --version\n" + "  -h, --help\n" + "  -p  --persist\n" + "  -e  \"command1; command2; ...\"\n" + "gnuplot %s patchlevel %s\n""Report bugs to %s\n", GlobalMembersVersion.gnuplot_version, GlobalMembersVersion.gnuplot_patchlevel, GlobalMembersVersion.bug_report);
				///#endif

			}
			else if (!strncmp(args[i], "-persist", 2) || !strcmp(args[i], "--persist"))
			{
				persist_cl = true;
			}
		}

		///#ifdef X11
		/* the X11 terminal removes tokens that it recognizes from args. */
		{
			tangible.RefObject<String[]> tempRef_args = new tangible.RefObject<String[]>(args);
			int n = X11_args(argc, tempRef_args);
			args = tempRef_args.argvalue;
			args += n;
			argc -= n;
		}
		///#endif

		///#ifdef APOLLO
		//    apollo_pfm_catch();
		///#endif

		setbuf(stderr, (String) DefineConstants.NULL);

		///#ifdef HAVE_SETVBUF
		/* this was once setlinebuf(). Docs say this is
		 * identical to setvbuf(,NULL,_IOLBF,0), but MS C
		 * faults this (size out of range), so we try with
		 * size of 1024 instead. [SAS/C does that, too. -lh]
		 * Failing this, I propose we just make the call and
		 * ignore the return : its probably not a big deal
		 */
		if (setvbuf(stdout, (String) DefineConstants.NULL, _IOLBF, (int) 1024) != 0)
			() fputs("Could not linebuffer stdout\n", stderr);

		///#ifdef X11
		/* This call used to be in x11.trm, with the following comment:
		 *   Multi-character inputs like escape sequences but also mouse-pasted
		 *   text got buffered and therefore didn't trigger the select() function
		 *   in X11_waitforinput(). Switching to unbuffered input solved this.
		 *   23 Jan 2002 (joze)
		 * But switching to unbuffered mode causes all characters in the input
		 * buffer to be lost. So the only safe time to do it is on program entry.
		 * The #ifdef X11 is probably unnecessary, but makes the change minimal.
		 * Do any non-X platforms suffer from the same problem?
		 * EAM - Jan 2004.
		 */
		setvbuf(stdin, (String) DefineConstants.NULL, _IONBF, 0);
		///#endif

		///#endif

		GlobalMembersTerm.gpoutfile = stdout;

		/* Initialize pre-loaded user variables */
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: () Gcomplex(&udv_pi.udv_value, DefineConstants.M_PI, 0.0);
		() GlobalMembersEval.Gcomplex(new value(GlobalMembersEval.udv_pi.udv_value), DefineConstants.M_PI, 0.0);
		///#ifdef HAVE_ISNAN
		GlobalMembersEval.udv_NaN = GlobalMembersEval.add_udv_by_name("NaN");
		() GlobalMembersEval.Gcomplex((GlobalMembersEval.udv_NaN.udv_value), GlobalMembersStdfn.not_a_number(), 0.0);
		GlobalMembersEval.udv_NaN.udv_undef = false;
		///#endif

		GlobalMembersPlot.init_memory();

		interactive = false;
		GlobalMembersTerm.init_terminal(); // can set term type if it likes
		GlobalMembersMisc.push_terminal(0); // remember the default terminal

		/* reset the terminal when exiting */
		/* this is done through gp_atexit so that other terminal functions
		 * can be registered to be executed before the terminal is reset. */
		atexit((GlobalMembersTerm.term_reset));

		///#ifdef AMIGA_SC_6_1
		//    if (IsInteractive(Input()) == DOSTRUE)
		//	interactive = TRUE;
		//    else
		//	interactive = FALSE;
		///#else
		///#if ((defined(__MSC__) && defined(_Windows)) || defined(__WIN32__)) && ! defined(WGP_CONSOLE)
		//    interactive = TRUE;
		///#else
		interactive = GlobalMembersOs9.isatty(fileno(stdin));
		///#endif
		///#endif // !AMIGA_SC_6_1 

		if (argc > 1)
			interactive = noinputfiles = false;
		else
			noinputfiles = true;

		/* Need this before show_version is called for the first time */

		///#ifdef HAVE_SYS_UTSNAME_H
		{
			utsname uts = new utsname();

			/* something is fundamentally wrong if this fails ... */
			if (uname(uts) > -1)
			{
				///#ifdef _AIX
				//	    strcpy(os_name, uts.sysname);
				//	    sprintf(os_name, "%s.%s", uts.version, uts.release);
				///#elif defined(SCO)
				//	    strcpy(os_name, "SCO");
				//	    strcpy(os_rel, uts.release);
				///#elif defined(DJGPP)
				//	    if (!strncmp(uts.sysname, "??Un", 4)) // don't print ??Unknow" 
				//		strcpy(os_name, "Unknown");
				//	    else {
				//		strcpy(os_name, uts.sysname);
				//		strcpy(os_rel, uts.release);
				//	    }
				///#else
				GlobalMembersVersion.os_name = uts.sysname;
				GlobalMembersVersion.os_rel = uts.release;
				///#ifdef OS2
				//	    if (!strchr(os_rel,'.'))
				// /* write either "2.40" or "4.0", or empty -- don't print "OS/2 1" */
				//		strcpy(os_rel, "");
				///#endif

				///#endif
			}
		}
		///#else // ! HAVE_SYS_UTSNAME_H 
		//
		//    strcpy(os_name, OS);
		//    strcpy(os_rel, "");
		//
		///#endif // HAVE_SYS_UTSNAME_H 

		if (interactive)
			GlobalMembersShow.show_version(stderr);
		else
			GlobalMembersShow.show_version(DefineConstants.NULL); // Only load GPVAL_COMPILE_OPTIONS

		GlobalMembersEval.update_gpval_variables(3); // update GPVAL_ variables available to user

		///#ifdef VMS
		// /* initialise screen management routines for command recall */
		//    if (status[1] = smg$create_virtual_keyboard(&vms_vkid) != SS$_NORMAL)
		//	done(status[1]);
		//    if (status[1] = smg$create_key_table(&vms_ktid) != SS$_NORMAL)
		//	done(status[1]);
		///#endif // VMS 

		if (!sigsetjmp(command_line_env, 1))
		{
			/* first time */
			GlobalMembersPlot.interrupt_setup();
			/* should move this stuff another initialisation routine,
			 * something like init_set() maybe */
			GlobalMembersPlot.get_user_env();
			() GlobalMembersVariable.loadpath_handler(1 << 0, DefineConstants.NULL)();
			() GlobalMembersVariable.locale_handler(1 << 0, DefineConstants.NULL)();
			/* HBB: make sure all variables start in the same mode 'reset'
			 * would set them to. Since the axis variables aren't in
			 * initialized arrays any more, this is now necessary... */
			GlobalMembersUnset.reset_command();
			GlobalMembersColor.init_color(); //  Initialization of color
			GlobalMembersPlot.load_rcfile();
			GlobalMembersFit.init_fit(); // Initialization of fitting module

			if (interactive && GlobalMembersTerm.term != 0) // not unknown
			{
				///#ifdef GNUPLOT_HISTORY
				GlobalMembersFit.a((stderr, "Before read_history\n"));
				///#if defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)
				expanded_history_filename = tilde_expand(DefineConstants.GNUPLOT_HISTORY_FILE);
				///#else
				//	    expanded_history_filename = gp_strdup(GNUPLOT_HISTORY_FILE);
				//	    gp_expand_tilde(&expanded_history_filename);
				///#endif
				GlobalMembersFit.a((stderr, "expanded_history_filename = %s\n", expanded_history_filename));
				read_history(expanded_history_filename);
				{
					/* BEGIN: Go local to get environment variable */
					String temp_env = getenv("GNUPLOT_HISTORY_SIZE");
					if (temp_env != null)
						GlobalMembersHistory.gnuplot_history_size = strtol(temp_env, (String) DefineConstants.NULL, 10);
				} // END: Go local to get environment variable

				/*
				 * It is safe to ignore the return values of 'atexit()' and
				 * 'on_exit()'. In the worst case, there is no history of your
				 * currrent session and you have to type all again in your next
				 * session.
				 * This is the default behaviour (traditional reasons), too.
				 * In case you don't have one of these functions, or you don't
				 * want to use them, 'write_history()' is called directly.
				 */
				atexit((GlobalMembersPlot.wrapper_for_write_history));
				///#endif // GNUPLOT_HISTORY 

				fprintf(stderr, "\nTerminal type set to '%s'\n", GlobalMembersTerm.term.name);
			} // if (interactive && term != 0)
		}
		else
		{
			/* come back here from int_error() */
			if (interactive == false)
				exit_status = DefineConstants.EXIT_FAILURE;
			///#ifdef HAVE_LIBREADLINE
			else
			{
				/* reset properly readline after a SIGINT+longjmp */
				rl_reset_after_signal();
			}
			///#endif

			///#ifdef AMIGA_SC_6_1
			//	(void) rawcon(0);
			///#endif
			GlobalMembersMisc.load_file_error(); // if we were in load_file(), cleanup
			GlobalMembersCommand.reset_eval_depth(); // reset evaluate command recursion counter
			;

			///#ifdef VMS
			// /* after catching interrupt */
			// /* VAX stuffs up stdout on SIGINT while writing to stdout,
			//    so reopen stdout. */
			//	if (gpoutfile == stdout) {
			//	    if ((stdout = freopen("SYS$OUTPUT", "w", stdout)) == NULL) {
			// /* couldn't reopen it so try opening it instead */
			//		if ((stdout = fopen("SYS$OUTPUT", "w")) == NULL) {
			// /* don't use int_error here - causes infinite loop! */
			//		    fputs("Error opening SYS$OUTPUT as stdout\n", stderr);
			//		}
			//	    }
			//	    gpoutfile = stdout;
			//	}
			///#endif // VMS 
			if (!interactive && !noinputfiles)
			{
				GlobalMembersTerm.term_reset();
				System.exit(DefineConstants.EXIT_FAILURE); // exit on non-interactive error
			}
		}

		if (argc > 1)
		{
			///#ifdef _Windows
			//	TBOOLEAN noend = persist_cl;
			///#endif

			/* load filenames given as arguments */
			while (--argc > 0)
			{
				++args;
				GlobalMembersCommand.c_token = DefineConstants.NO_CARET; // in case of file not found
				///#ifdef _Windows
				//	    if (stricmp(*args, "-noend") == 0 || stricmp(*args, "/noend") == 0
				//	       	|| stricmp(*args, "-persist") == 0)
				//		noend = TRUE;
				//	    else
				///#endif
				if (!strncmp(args, "-persist", 2) || !strcmp(args, "--persist"))
				{
					GlobalMembersFit.a((stderr,"'persist' command line option recognized\n"));

				}
				else if (strcmp(args, "-") == 0)
				{
					/* DBT 10-7-98  go interactive if "-" on command line */

					interactive = true;
					/* will this work on all platforms? */

					while (GlobalMembersCommand.com_line() == 0);

					interactive = false;

				}
				else if (strcmp(args, "-e") == 0)
				{
					--argc;
					++args;
					if (argc <= 0)
					{
						fprintf(stderr, "syntax:  gnuplot -e \"commands\"\n");
					}
					GlobalMembersCommand.do_string(args, false);

				}
				else
					GlobalMembersMisc.load_file(GlobalMembersMisc.loadpath_fopen(args, "r"), GlobalMembersUtil.gp_strdup(args), false);
			}
			///#ifdef _Windows
			//	if (noend) {
			//	    interactive = TRUE;
			//	    while (!com_line());
			//	}
			///#endif
		}
		else
		{
			/* take commands from stdin */
			while (GlobalMembersCommand.com_line() == 0);
		}

		///#if (defined(HAVE_LIBREADLINE) || defined(HAVE_LIBEDITLINE)) && defined(GNUPLOT_HISTORY)
		///#if !defined(HAVE_ATEXIT) && !defined(HAVE_ON_EXIT)
		// /* You should be here if you neither have 'atexit()' nor 'on_exit()' */
		//    wrapper_for_write_history();
		///#endif // !HAVE_ATEXIT && !HAVE_ON_EXIT 
		///#endif // (HAVE_LIBREADLINE || HAVE_LIBEDITLINE) && GNUPLOT_HISTORY 

		///#ifdef OS2
		//    RexxDeregisterSubcom("GNUPLOT", NULL);
		///#endif

		/* HBB 20040223: Not all compilers like exit() to end main() */
		/* exit(exit_status); */
		return exit_status;
	}
	///#endif // HAVE_LIBREADLINE || HAVE_LIBEDITLINE 
}
///#else // HAVE_LIBREADLINE || HAVE_LIBEDITLINE 
//
// /* version for gnuplot's own write_history */
//static void
//wrapper_for_write_history()
//{
// /* What we really want to do is truncate(expanded_history_filename),
//    but this is only available on BSD compatible systems */
//    remove(expanded_history_filename);
//    if (gnuplot_history_size < 0)
//    	write_history(expanded_history_filename);
//    else
//	write_history_n(gnuplot_history_size, expanded_history_filename, "w");
//}
//
///#endif // GNUPLOT_HISTORY 

