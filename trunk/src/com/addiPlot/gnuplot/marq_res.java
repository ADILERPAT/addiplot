package com.addiPlot.gnuplot;

///#else
//static void Dblfn __PROTO(());
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define Dblf Dblfn
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define Dblf2 Dblfn
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define Dblf3 Dblfn
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define Dblf5 Dblfn
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define Dblf6 Dblfn

///#if defined(MSDOS) || defined(DOS386) // non-blocking IO stuff
///#include <io.h>
///#ifndef _Windows		// WIN16 does define MSDOS .... 
///#include <conio.h>
///#endif
///#include <dos.h>
///#else // !(MSDOS || DOS386) 
///#ifndef VMS
///#endif				// !VMS 
///#endif // !(MSDOS || DOS386) 

public enum marq_res
{
	OK,
	ML_ERROR,
	BETTER,
	WORSE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static marq_res forValue(int value)
	{
		return values()[value];
	}
}
/* argument: char *fn */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define VALID_FILENAME(fn) ((fn) != NULL && (*fn) != '\0')
