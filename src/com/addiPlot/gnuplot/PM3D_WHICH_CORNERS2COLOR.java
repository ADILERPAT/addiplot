package com.addiPlot.gnuplot;

/*
  from which corner take the color?
*/
public enum PM3D_WHICH_CORNERS2COLOR
{
	/* keep the following order of PM3D_WHICHCORNER_C1 .. _C4 */
	PM3D_WHICHCORNER_C1(0), // corner 1: first scan, first point
	PM3D_WHICHCORNER_C2(1), // corner 2: first scan, second point
	PM3D_WHICHCORNER_C3(2), // corner 3: second scan, first point
	PM3D_WHICHCORNER_C4(3), // corner 4: second scan, second point
	/* now in any order */
	PM3D_WHICHCORNER_MEAN(4), // average z-value from all 4 corners
	PM3D_WHICHCORNER_GEOMEAN(5), // geometrical mean of 4 corners
	PM3D_WHICHCORNER_MEDIAN(6), // median of 4 corners
	PM3D_WHICHCORNER_MIN(7), // minimum of 4 corners
	PM3D_WHICHCORNER_MAX(8); // maximum of 4 corners

	private int intValue;
	private static java.util.HashMap<Integer, PM3D_WHICH_CORNERS2COLOR> mappings;
	private static java.util.HashMap<Integer, PM3D_WHICH_CORNERS2COLOR> getMappings()
	{
		if (mappings == null)
		{
			synchronized (PM3D_WHICH_CORNERS2COLOR.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, PM3D_WHICH_CORNERS2COLOR>();
				}
			}
		}
		return mappings;
	}

	private PM3D_WHICH_CORNERS2COLOR(int value)
	{
		intValue = value;
		PM3D_WHICH_CORNERS2COLOR.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static PM3D_WHICH_CORNERS2COLOR forValue(int value)
	{
		return getMappings().get(value);
	}
}