package com.addiPlot.gnuplot;

/* the status of the shift, ctrl and alt keys
*/
//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum6:
public enum AnonymousEnum6
{
	Mod_Shift((1)),
	Mod_Ctrl((1 << 1)),
	Mod_Alt((1 << 2));

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum6> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum6> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum6.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum6>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum6(int value)
	{
		intValue = value;
		AnonymousEnum6.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum6 forValue(int value)
	{
		return getMappings().get(value);
	}
}