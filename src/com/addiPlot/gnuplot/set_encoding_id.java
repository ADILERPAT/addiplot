package com.addiPlot.gnuplot;

///#ifdef WIN16
///#define termentry TERMENTRY far
///#else
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define termentry TERMENTRY
///#endif

public enum set_encoding_id
{
   S_ENC_DEFAULT,
   S_ENC_ISO8859_1,
   S_ENC_ISO8859_2,
   S_ENC_ISO8859_9,
   S_ENC_ISO8859_15,
   S_ENC_CP437,
   S_ENC_CP850,
   S_ENC_CP852,
   S_ENC_CP1250,
   S_ENC_CP1254,
   S_ENC_KOI8_R,
   S_ENC_KOI8_U,
   S_ENC_UTF8,
   S_ENC_INVALID;

	public int getValue()
	{
		return this.ordinal();
	}

	public static set_encoding_id forValue(int value)
	{
		return values()[value];
	}
}