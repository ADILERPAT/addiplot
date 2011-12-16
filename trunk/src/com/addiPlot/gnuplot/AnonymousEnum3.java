package com.addiPlot.gnuplot;

/* These might work better as fuctions, but defines will do for now. */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define ERROR_NOTICE(str) "\nGNUPLOT (gplt_x11):  " str
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define ERROR_NOTICE_NEWLINE(str) "\n                     " str

//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum3:
public enum AnonymousEnum3
{
	NOT_AVAILABLE(-1);

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum3> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum3> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum3.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum3>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum3(int value)
	{
		intValue = value;
		AnonymousEnum3.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum3 forValue(int value)
	{
		return getMappings().get(value);
	}
}
/*
 * Shared code for setting fill style
 */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define plot current_plot
//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
///#undef plot
