package com.addiPlot.gnuplot;

//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum9:
public enum AnonymousEnum11
{
	__LC_CTYPE(0),
	__LC_NUMERIC(1),
	__LC_TIME(2),
	__LC_COLLATE(3),
	__LC_MONETARY(4),
	__LC_MESSAGES(5),
	__LC_ALL(6),
	__LC_PAPER(7),
	__LC_NAME(8),
	__LC_ADDRESS(9),
	__LC_TELEPHONE(10), 
	__LC_MEASUREMENT(11), 
	__LC_IDENTIFICATION(12);

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum11> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum11> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum11.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum11>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum11(int value)
	{
		intValue = value;
		AnonymousEnum11.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum11 forValue(int value)
	{
		return getMappings().get(value);
	}
}