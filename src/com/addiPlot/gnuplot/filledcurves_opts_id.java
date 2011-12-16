package com.addiPlot.gnuplot;

public enum filledcurves_opts_id
{
	FILLEDCURVES_CLOSED(0),
	FILLEDCURVES_X1(1),
	FILLEDCURVES_Y1(2),
	FILLEDCURVES_X2(3),
	FILLEDCURVES_Y2(4),
	/* requirement: FILLEDCURVES_ATX1 = FILLEDCURVES_X1+4 */
	FILLEDCURVES_ATX1(5),
	FILLEDCURVES_ATY1(6),
	FILLEDCURVES_ATX2(7),
	FILLEDCURVES_ATY2(8),
	FILLEDCURVES_ATXY(9),
	FILLEDCURVES_ABOVE(10),
	FILLEDCURVES_BELOW(11),
	FILLEDCURVES_BETWEEN(12);

	private int intValue;
	private static java.util.HashMap<Integer, filledcurves_opts_id> mappings;
	private static java.util.HashMap<Integer, filledcurves_opts_id> getMappings()
	{
		if (mappings == null)
		{
			synchronized (filledcurves_opts_id.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, filledcurves_opts_id>();
				}
			}
		}
		return mappings;
	}

	private filledcurves_opts_id(int value)
	{
		intValue = value;
		filledcurves_opts_id.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static filledcurves_opts_id forValue(int value)
	{
		return getMappings().get(value);
	}
}