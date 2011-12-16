package com.addiPlot.gnuplot;

/* HBB 20010831: new enum typedef, to make code using this more
 * self-explanatory */
/* The unit the tics of a given time/date axis are to interpreted in */
/* HBB 20040318: start at one, to avoid undershoot */
public enum e_timelevel
{
	TIMELEVEL_SECONDS(1),
	TIMELEVEL_MINUTES(2),
	TIMELEVEL_HOURS(3),
	TIMELEVEL_DAYS(4),
	TIMELEVEL_WEEKS(5),
	TIMELEVEL_MONTHS(6),
	TIMELEVEL_YEARS(7);

	private int intValue;
	private static java.util.HashMap<Integer, e_timelevel> mappings;
	private static java.util.HashMap<Integer, e_timelevel> getMappings()
	{
		if (mappings == null)
		{
			synchronized (e_timelevel.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, e_timelevel>();
				}
			}
		}
		return mappings;
	}

	private e_timelevel(int value)
	{
		intValue = value;
		e_timelevel.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static e_timelevel forValue(int value)
	{
		return getMappings().get(value);
	}
}
/* ---------------------- routines ----------------------- */

/* check range and take logs of min and max if logscale
 * this also restores min and max for ranges like [10:-10]
 */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define LOG_MSG(x) x " range must be greater than 0 for scale"

