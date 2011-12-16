package com.addiPlot.gnuplot;

/*
 * Currently only used for PIPE_IPC, but in principle
 * every term could use this file descriptor to write back
 * commands to gnuplot.  Note, that terminals using this fd
 * should set it to a negative value when closing. (joze)
 */
/* HBB 20020225: currently not used anywhere outside term.c --> make
 * it static */
/* extern int ipc_back_fd; */

///#endif // PIPE_IPC 

/* options handling */
//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum10:
public enum AnonymousEnum10
{
	UNSET(-1),
	no(0),
	yes(1);

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum10> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum10> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum10.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum10>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum10(int value)
	{
		intValue = value;
		AnonymousEnum10.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum10 forValue(int value)
	{
		return getMappings().get(value);
	}
}