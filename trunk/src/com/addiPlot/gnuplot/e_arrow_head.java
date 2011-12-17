package com.addiPlot.gnuplot;

 // contains all Line and Point properties
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define DEFAULT_LP_STYLE_TYPE {0, -2, 0, 0, 1.0, PTSZ_DEFAULT, FALSE, DEFAULT_COLORSPEC}

public enum e_arrow_head
{
	NOHEAD(0),
	END_HEAD(1),
	BACKHEAD(2),
	BOTH_HEADS(3);

	private int intValue;
	private static java.util.HashMap<Integer, e_arrow_head> mappings;
	private static java.util.HashMap<Integer, e_arrow_head> getMappings()
	{
		if (mappings == null)
		{
			synchronized (e_arrow_head.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, e_arrow_head>();
				}
			}
		}
		return mappings;
	}

	private e_arrow_head(int value)
	{
		intValue = value;
		e_arrow_head.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}
	
	public void setValue(int value)
	{
		intValue = value;
	}

	public static e_arrow_head forValue(int value)
	{
		return getMappings().get(value);
	}
}