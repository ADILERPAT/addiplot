package com.addiPlot.gnuplot;

/* HBB 20020225: this stuff used to be in a separate header, ipc.h,
 * but I strongly disliked the way that was done */

/*
 * There are the following types of interprocess communication from
 * (gnupmdrv, gnuplot_x11) => gnuplot:
 *	OS2_IPC  ... the OS/2 shared memory + event semaphores approach
 *	PIPE_IPC ... communication by using bidirectional pipe
 */


/*
 * OS2_IPC: gnuplot's terminals communicate with it by shared memory + event
 * semaphores => the code in gpexecute.c is used, and nothing more from here.
 */

///#ifdef PIPE_IPC

//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum9:
public enum AnonymousEnum9
{
	IPC_BACK_UNUSABLE(-2),
	IPC_BACK_CLOSED(-1);

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum9> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum9> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum9.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum9>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum9(int value)
	{
		intValue = value;
		AnonymousEnum9.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum9 forValue(int value)
	{
		return getMappings().get(value);
	}
}