package com.addiPlot.gnuplot;

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define DF_DEFAULT_TYPE DF_FLOAT

/* Some macros for making the compiler figure out what function
 * the "machine independent" names should execute to read the
 * appropriately sized variable from a data file.
 */ 
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define SIGNED_TEST(val) ((val)==sizeof(long) ? DF_LONG : ((val)==sizeof(long long) ? DF_LONGLONG : ((val)==sizeof(int) ? DF_INT : ((val)==sizeof(short) ? DF_SHORT : ((val)==sizeof(char) ? DF_CHAR : DF_BAD_TYPE)))))
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define UNSIGNED_TEST(val) ((val)==sizeof(unsigned long) ? DF_ULONG : ((val)==sizeof(unsigned long long) ? DF_ULONGLONG : ((val)==sizeof(unsigned int) ? DF_UINT : ((val)==sizeof(unsigned short) ? DF_USHORT : ((val)==sizeof(unsigned char) ? DF_UCHAR : DF_BAD_TYPE)))))
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define FLOAT_TEST(val) ((val)==sizeof(float) ? DF_FLOAT : ((val)==sizeof(double) ? DF_DOUBLE : DF_BAD_TYPE))

public enum df_records_type
{
	DF_CURRENT_RECORDS,
	DF_DEFAULT_RECORDS;

	public int getValue()
	{
		return this.ordinal();
	}

	public static df_records_type forValue(int value)
	{
		return values()[value];
	}
}