package com.addiPlot.gnuplot;

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
///#define NO_CARET (-1)
///#define DATAFILE (-2)
///#if 0 // UNUSED
///#endif
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define isstringvalue(c_token) (isstring(c_token) || type_udv(c_token)==STRING)
///#if defined(VA_START) && defined(STDC_HEADERS)
///#else
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

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define PATHSEP_TO_NUL(arg) do { char *s = arg; while ((s = strchr(s, PATHSEP)) != NULL) *s++ = NUL; } while (0)

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define PRINT_PATHLIST(start, limit) do { char *s = start; while (s < limit) { fprintf(stderr, "\"%s\" ", s); s += strlen(s) + 1; } fputc('\n',stderr); } while (0)



public class path_table
{
	public String dir;
}