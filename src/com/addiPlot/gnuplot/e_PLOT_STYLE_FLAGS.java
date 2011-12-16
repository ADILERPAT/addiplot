package com.addiPlot.gnuplot;

/* we explicitly assign values to the types, such that we can
 * perform bit tests to see if the style involves points and/or lines
 * bit 0 (val 1) = line, bit 1 (val 2) = point, bit 2 (val 4)= error
 * This allows rapid decisions about the sample drawn into the key,
 * for example.
 */
/* HBB 20010610: new enum, to make mnemonic names for these flags
 * accessible everywhere */
public enum e_PLOT_STYLE_FLAGS
{
	PLOT_STYLE_HAS_LINE((1 << 0)),
	PLOT_STYLE_HAS_POINT((1 << 1)),
	PLOT_STYLE_HAS_ERRORBAR((1 << 2)),
	PLOT_STYLE_HAS_FILL((1 << 3)),
	PLOT_STYLE_BITS((1 << 4));

	private int intValue;
	private static java.util.HashMap<Integer, e_PLOT_STYLE_FLAGS> mappings;
	private static java.util.HashMap<Integer, e_PLOT_STYLE_FLAGS> getMappings()
	{
		if (mappings == null)
		{
			synchronized (e_PLOT_STYLE_FLAGS.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, e_PLOT_STYLE_FLAGS>();
				}
			}
		}
		return mappings;
	}

	private e_PLOT_STYLE_FLAGS(int value)
	{
		intValue = value;
		e_PLOT_STYLE_FLAGS.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static e_PLOT_STYLE_FLAGS forValue(int value)
	{
		return getMappings().get(value);
	}
}