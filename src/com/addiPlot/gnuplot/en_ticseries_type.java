package com.addiPlot.gnuplot;

///#define AXIS_ARRAY_SIZE 11

/* What kind of ticmarking is wanted? */
public enum en_ticseries_type
{
	TIC_COMPUTED(1), // default; gnuplot figures them
	TIC_SERIES(2), // user-defined series
	TIC_USER(3), // user-defined points
	TIC_MONTH(4), // print out month names ((mo-1)%12)+1
	TIC_DAY(5); // print out day of week

	private int intValue;
	private static java.util.HashMap<Integer, en_ticseries_type> mappings;
	private static java.util.HashMap<Integer, en_ticseries_type> getMappings()
	{
		if (mappings == null)
		{
			synchronized (en_ticseries_type.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, en_ticseries_type>();
				}
			}
		}
		return mappings;
	}

	private en_ticseries_type(int value)
	{
		intValue = value;
		en_ticseries_type.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static en_ticseries_type forValue(int value)
	{
		return getMappings().get(value);
	}
}