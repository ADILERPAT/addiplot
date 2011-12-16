package com.addiPlot.gnuplot;

/* GNUPLOT - eval.c */

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

/* HBB 20010724: I moved several variables and functions from parse.c
 * to here, because they're involved with *evaluating* functions, not
 * with parsing them: evaluate_at(), fpe(), the APOLLO signal handling
 * stuff, and fpe_env */

/*
 * $Id: eval.h,v 1.32 2008/07/21 20:19:25 sfeam Exp $
 */

/* GNUPLOT - eval.h */

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


///#define STACK_DEPTH 100
///#define MAX_AT_LEN 150

/* Type definitions */

/* HBB 20010725: Moved here, from parse.h */
public enum operators
{
	/* keep this in line with table in eval.c */
	PUSH,
	PUSHC,
	PUSHD1,
	PUSHD2,
	PUSHD,
	POP,
	CALL,
	CALLN,
	LNOT,
	BNOT,
	UMINUS,
	LOR,
	LAND,
	BOR,
	XOR,
	BAND,
	EQ,
	NE,
	GT,
	LT,
	GE,
	LE,
	PLUS,
	MINUS,
	MULT,
	DIV,
	MOD,
	POWER,
	FACTORIAL,
	BOOLE,
	DOLLARS, // for using extension - div
	CONCATENATE,
	EQS,
	NES,
	RANGE,
	ASSIGN,
	/* only jump operators go between jump and sf_start, for is_jump() */
	JUMP,
	JUMPZ,
	JUMPNZ,
	JTERN,
	SF_START;

	public int getValue()
	{
		return this.ordinal();
	}

	public static operators forValue(int value)
	{
		return values()[value];
	}
}