package com.addiPlot.gnuplot;

///#define X11_POLYLINE 1
///#define MOUSE_ALL_WINDOWS 1

/* GNUPLOT - gplt_x11.c */

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


/* lph changes:
 * (a) make EXPORT_SELECTION the default and specify NOEXPORT to undefine
 * (b) append X11 terminal number to resource name
 * (c) change cursor for active terminal
 */

/*-----------------------------------------------------------------------------
 *   gnuplot_x11 - X11 outboard terminal driver for gnuplot 3.3
 *
 *   Requires installation of companion inboard x11 driver in gnuplot/term.c
 *
 *   Acknowledgements:
 *      Chris Peterson (MIT)
 *      Dana Chee (Bellcore)
 *      Arthur Smith (Cornell)
 *      Hendri Hondorp (University of Twente, The Netherlands)
 *      Bill Kucharski (Solbourne)
 *      Charlie Kline (University of Illinois)
 *      Yehavi Bourvine (Hebrew University of Jerusalem, Israel)
 *      Russell Lang (Monash University, Australia)
 *      O'Reilly & Associates: X Window System - Volumes 1 & 2
 *
 *   This code is provided as is and with no warranties of any kind.
 *
 * drd: change to allow multiple windows to be maintained independently
 *
 *---------------------------------------------------------------------------*/

/* drd : export the graph via ICCCM primary selection. well... not quite
 * ICCCM since we dont support full list of targets, but this
 * is a start.  define EXPORT_SELECTION if you want this feature
 */

/*lph: add a "feature" to undefine EXPORT_SELECTION
   The following makes EXPORT_SELECTION the default and
   defining NOEXPORT over-rides the default
 */

/* Petr Mikulik and Johannes Zellner: added mouse support (October 1999)
 * Implementation and functionality is based on os2/gclient.c; see mousing.c
 * Pieter-Tjerk de Boer <ptdeboer@cs.utwente.nl>: merged two versions
 * of mouse patches. (November 1999) (See also mouse.[ch]).
 */

/* X11 support for Petr Mikulik's pm3d
 * by Johannes Zellner <johannes@zellner.org>
 * (November 1999 - January 2000, Oct. 2000)
 */

/* Polyline support May 2003
 * Ethan Merritt <merritt@u.washington.edu>
 */

/* Dynamically created windows July 2003
 * Across-pipe title text and close command October 2003
 * Dan Sebald <daniel.sebald@ieee.org>
 */

/* Daniel Sebald: added X11 support for images. (27 February 2003)
 */

/* Shigeharu Takeno <shige@iee.niit.ac.jp> February 2005
 * Support for multi-byte fonts based, with permission, on the "gnuplot+"
 * patches by Masahito Yamaga <ma@yama-ga.com>
 */

///#ifdef USE_X11_MULTIBYTE
///#include <X11/Xlocale.h>
///#endif

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
/* GNUPLOT - gplt_x11.h */

/*[
 * Copyright 2000   Thomas Williams, Colin Kelley
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


///#if defined(HAVE_SYS_SELECT_H) && !defined(VMS)
///#endif

///#ifndef FD_SET
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define FD_SET(n, p) ((p)->fds_bits[0] |= (1 << ((n) % 32)))
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define FD_CLR(n, p) ((p)->fds_bits[0] &= ~(1 << ((n) % 32)))
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define FD_ISSET(n, p) ((p)->fds_bits[0] & (1 << ((n) % 32)))
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define FD_ZERO(p) memset((char *)(p), '\0', sizeof(*(p)))
///#endif // not FD_SET 

///#define X11_COMMAND_BUFFER_LENGTH 1024

/* The endian value sent across the pipe can't have '\n' or '\0' within. */
///#define ENDIAN_VALUE 0x50515253
///#define X11_GR_CHECK_ENDIANESS 'B'

///#define X11_GR_MAKE_PALETTE 'p'
///#define X11_GR_RELEASE_PALETTE 'e'
///#define X11_GR_SET_COLOR 'k'
///#define X11_GR_BINARY_COLOR 'c'
///#define X11_GR_SET_RGBCOLOR 'g'
///#define X11_GR_SET_LINECOLOR 'l'
///#define X11_GR_FILLED_POLYGON 'I'
///#define X11_GR_BINARY_POLYGON 'f'
///#define X11_GR_IMAGE 'i'

///#ifdef EXTERNAL_X11_WINDOW
///#define X11_GR_SET_WINDOW_ID 'w'
///#endif

/* One character for function code, and perhaps one or two for the core
 * routine to do something strange with end of buffer.  So shorten by a
 * few by trial and error.
 */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define BINARY_MAX_CHAR_PER_TRANSFER (X11_COMMAND_BUFFER_LENGTH-3)

/* Encoding character for removing '\n' and '\0' from data stream.
 * The strategy is as follows, we pick a character half way between
 * '\0' and '\n'.  Then the encoded characters occupy a range
 * of 10.  Next, by observing statistics of the occurrances
 * of the encoded characters in the binary data, the translation
 * character is chosen so that these encoded characters are moved
 * to locations having the least occurances of bytes.
 */
///#define SET_COLOR_CODE_CHAR 5
///#define FILLED_POLYGON_CODE_CHAR 5
///#define IMAGE_CODE_CHAR 1

/* Translation value for making '\0', '\n' and the CODE_CHAR
 * less prevalent in the encoded data.
 */
///#define SET_COLOR_TRANSLATION_CHAR 3
///#define FILLED_POLYGON_TRANSLATION_CHAR -13
///#define IMAGE_TRANSLATION_CHAR 45

/* Maximum image plane value of data transfer.  */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define IMAGE_PALETTE_VALUE_MAX USHRT_MAX



///#ifdef EXPORT_SELECTION
///#undef EXPORT_SELECTION
///#endif // EXPORT SELECTION 
///#ifndef NOEXPORT
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define EXPORT_SELECTION XA_PRIMARY
///#endif // NOEXPORT 


///#if !(defined(VMS) || defined(CRIPPLED_SELECT))
///#define DEFAULT_X11
///#endif

///#if defined(VMS) && defined(CRIPPLED_SELECT)
//Error. Incompatible options.
///#endif


///#ifdef USE_MOUSE
///#else
///#define XC_crosshair 34
///#endif


///#ifdef HAVE_SYS_BSDTYPES_H
///#include <sys/bsdtypes.h>
///#endif

///#if defined(HAVE_SYS_SYSTEMINFO_H) && defined(HAVE_SYSINFO)
///#include <sys/systeminfo.h>
///#define SYSINFO_METHOD "sysinfo"
///#define GP_SYSTEMINFO(host) sysinfo (SI_HOSTNAME, (host), MAXHOSTNAMELEN)
///#else
///#define SYSINFO_METHOD "gethostname"
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define GP_SYSTEMINFO(host) gethostname ((host), MAXHOSTNAMELEN)
///#endif // HAVE_SYS_SYSTEMINFO_H && HAVE_SYSINFO 

///#ifdef USE_MOUSE
///#ifdef OS2_IPC
///#define INCL_DOSPROCESS
///#define INCL_DOSSEMAPHORES
///#include <os2.h>
///#endif
///#ifdef OS2_IPC
///#define INCL_DOSPROCESS
///#define INCL_DOSSEMAPHORES
///#include <os2.h>
///#endif // OS2_IPC 
///#ifdef PIPE_IPC
///#endif // PIPE_IPC 
///#if defined(PIPE_IPC) || defined(WIN_IPC)
///#endif // PIPE_IPC || WIN_IPC 
///#ifdef _MOUSE_C
///#endif // _MOUSE_C 
///#if 0
///#endif
///#if defined(_MOUSE_C)
///#else
///#endif

///#ifdef MOUSE_ALL_WINDOWS
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
public class axis_scale_t
{
	public int term_lower;
	public double term_scale;
	public double min;
	public double logbase;
}