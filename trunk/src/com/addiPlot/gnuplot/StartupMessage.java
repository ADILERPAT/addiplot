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

/* $Id: amiga.c,v 1.4 2004/07/01 17:10:03 broeker Exp $ */

/* GNUPLOT - amiga.c */

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
 * amiga.c
 *
 * Written by Carsten Steger <stegerc@informatik.tu-muenchen.de>
 *
 * Popen and pclose have the same semantics as their UNIX counterparts.
 *
 * Additionally, they install an exit trap that closes all open pipes,
 * should the program terminate abnormally.
 */

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



///#ifdef PIPES // dont bother if pipes are not being used elsewhere

/* Maximum number of open pipes. If this is set to a number > 10, the code
 * that constructs the pipe names in popen () will have to be modified.
 */
///#define MAX_OPEN_PIPES 10

/* We need at least this Dos version to work. */
///#define DOS_VERSION 37


/* This data structure is sent to the child process with sm_Cmd set to the
 * command to be executed. When the child is done it sets sm_RetCode to
 * the return code of the executed command.
 */
public class StartupMessage
{
  public Message sm_Msg = new Message();
  public int sm_RetCode;
  public UBYTE sm_Cmd;
}