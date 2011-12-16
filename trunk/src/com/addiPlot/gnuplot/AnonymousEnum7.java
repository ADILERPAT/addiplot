package com.addiPlot.gnuplot;

/* the below depends on the ascii character set lying in the
 * range from 0 to 255 (below 1000) */
//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum7:
public enum AnonymousEnum7 // special keys with "usual well-known" keycodes
{
	GP_BackSpace(0x08),
	GP_Tab(0x09),
	GP_KP_Enter(0x0A),
	GP_Return(0x0D),
	GP_Escape(0x1B),
	GP_Delete(127);

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum7> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum7> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum7.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum7>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum7(int value)
	{
		intValue = value;
		AnonymousEnum7.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum7 forValue(int value)
	{
		return getMappings().get(value);
	}
}