package com.addiPlot.gnuplot;

public enum df_sample_scan_type
{
	DF_SCAN_POINT(-3), // fastest
	DF_SCAN_LINE(-4),
	DF_SCAN_PLANE(-5); // slowest

	private int intValue;
	private static java.util.HashMap<Integer, df_sample_scan_type> mappings;
	private static java.util.HashMap<Integer, df_sample_scan_type> getMappings()
	{
		if (mappings == null)
		{
			synchronized (df_sample_scan_type.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, df_sample_scan_type>();
				}
			}
		}
		return mappings;
	}

	private df_sample_scan_type(int value)
	{
		intValue = value;
		df_sample_scan_type.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static df_sample_scan_type forValue(int value)
	{
		return getMappings().get(value);
	}
}