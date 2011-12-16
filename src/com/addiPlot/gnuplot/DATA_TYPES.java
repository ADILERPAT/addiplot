package com.addiPlot.gnuplot;

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

/*
 * $Id: gp_types.h,v 1.44 2009/03/26 00:49:13 sfeam Exp $
 */

/* GNUPLOT - gp_types.h */

/*[
 * Copyright 2000, 2004   Thomas Williams, Colin Kelley
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

/* type_udv() will return 0 rather than type if udv does not exist */
public enum DATA_TYPES
{
	INTGR(1),
	CMPLX(2),
	STRING(3);

	private int intValue;
	private static java.util.HashMap<Integer, DATA_TYPES> mappings;
	private static java.util.HashMap<Integer, DATA_TYPES> getMappings()
	{
		if (mappings == null)
		{
			synchronized (DATA_TYPES.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, DATA_TYPES>();
				}
			}
		}
		return mappings;
	}

	private DATA_TYPES(int value)
	{
		intValue = value;
		DATA_TYPES.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static DATA_TYPES forValue(int value)
	{
		return getMappings().get(value);
	}
}