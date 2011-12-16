package com.addiPlot.gnuplot;

/* GNUPLOT - getcolor.c */

/*[
 *
 * Petr Mikulik, December 1998 -- June 1999
 * Copyright: open source as much as possible
 *
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
///#define NO_CARET (-1)
///#define DATAFILE (-2)
///#if 0 // UNUSED
///#endif
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define isstringvalue(c_token) (isstring(c_token) || type_udv(c_token)==STRING)
///#if defined(VA_START) && defined(STDC_HEADERS)
///#else
///#endif
/*
 * $Id: getcolor.h,v 1.9 2005/08/07 09:43:28 mikulik Exp $
 */

/* GNUPLOT - getcolor.h */

/* Routines + constants for mapping interval [0,1] into another [0,1] to be
 * used to get RGB triplets from gray (palette of smooth colours).
 *
 * Note: The code in getcolor.h,.c cannot be inside color.h,.c since gplt_x11.c
 * compiles with getcolor.o, so it cannot load the other huge staff.
 *
 */

/*[
 *
 * Petr Mikulik, since December 1998
 * Copyright: open source as much as possible
 *
]*/



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

public enum color_models_id
{
	C_MODEL_RGB('r'),
	C_MODEL_HSV('h'),
	C_MODEL_CMY('c'),
	C_MODEL_YIQ('y'),
	C_MODEL_XYZ('x');

	private int intValue;
	private static java.util.HashMap<Integer, color_models_id> mappings;
	private static java.util.HashMap<Integer, color_models_id> getMappings()
	{
		if (mappings == null)
		{
			synchronized (color_models_id.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, color_models_id>();
				}
			}
		}
		return mappings;
	}

	private color_models_id(int value)
	{
		intValue = value;
		color_models_id.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static color_models_id forValue(int value)
	{
		return getMappings().get(value);
	}
}
//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
///#undef CONSTRAIN


/* eof getcolor.c */
