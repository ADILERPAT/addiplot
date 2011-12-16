package com.addiPlot.gnuplot;

	/* see KP_0 - KP_9 */

//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum4:
public enum AnonymousEnum4
{
	MOUSE_COORDINATES_REAL(0),
	MOUSE_COORDINATES_REAL1(1), // w/o brackets
	MOUSE_COORDINATES_FRACTIONAL(2),
///#if 0
////    MOUSE_COORDINATES_PIXELS,
////    MOUSE_COORDINATES_SCREEN,
///#endif
	MOUSE_COORDINATES_TIMEFMT(3),
	MOUSE_COORDINATES_XDATE(4),
	MOUSE_COORDINATES_XTIME(5),
	MOUSE_COORDINATES_XDATETIME(6),
	MOUSE_COORDINATES_ALT(7); // alternative format as specified by the user

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum4> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum4> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum4.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum4>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum4(int value)
	{
		intValue = value;
		AnonymousEnum4.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum4 forValue(int value)
	{
		return getMappings().get(value);
	}
}