package com.addiPlot.gnuplot;

///#ifdef HAVE_CONFIG_H
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

/*
 *    color modes
 */
public enum palette_color_mode
{
	SMPAL_COLOR_MODE_NONE('0'),
	SMPAL_COLOR_MODE_GRAY('g'), // grayscale only
	SMPAL_COLOR_MODE_RGB('r'), // one of several fixed transforms
	SMPAL_COLOR_MODE_FUNCTIONS('f'), // user defined transforms
	SMPAL_COLOR_MODE_GRADIENT('d'); /* interpolated table:
				       * explicitly defined or read from file */

	private int intValue;
	private static java.util.HashMap<Integer, palette_color_mode> mappings;
	private static java.util.HashMap<Integer, palette_color_mode> getMappings()
	{
		if (mappings == null)
		{
			synchronized (palette_color_mode.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, palette_color_mode>();
				}
			}
		}
		return mappings;
	}

	private palette_color_mode(int value)
	{
		intValue = value;
		palette_color_mode.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static palette_color_mode forValue(int value)
	{
		return getMappings().get(value);
	}
}