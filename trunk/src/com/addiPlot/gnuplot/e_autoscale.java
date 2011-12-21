package com.addiPlot.gnuplot;

/* Values to put in the axis_tics[] variables that decides where the
 * ticmarks should be drawn: not at all, on one or both plot borders,
 * or the zeroaxes. These look like a series of values, but TICS_MASK
 * shows that they're actually bit masks --> don't turn into an enum
 * */
///#define NO_TICS 0
///#define TICS_ON_BORDER 1
///#define TICS_ON_AXIS 2
///#define TICS_MASK 3
///#define TICS_MIRROR 4


///#if 0 // HBB 20010806 --- move GRID flags into axis struct
//// /* Need to allow user to choose grid at first and/or second axes tics.
////  * Also want to let user choose circles at x or y tics for polar grid.
////  * Also want to allow user rectangular grid for polar plot or polar
////  * grid for parametric plot. So just go for full configurability.
////  * These are bitmasks
////  */
////#define GRID_OFF    0
////#define GRID_X      (1<<0)
////#define GRID_Y      (1<<1)
////#define GRID_Z      (1<<2)
////#define GRID_X2     (1<<3)
////#define GRID_Y2     (1<<4)
////#define GRID_MX     (1<<5)
////#define GRID_MY     (1<<6)
////#define GRID_MZ     (1<<7)
////#define GRID_MX2    (1<<8)
////#define GRID_MY2    (1<<9)
////#define GRID_CB     (1<<10)
////#define GRID_MCB    (1<<11)
///#endif // 0 

/* HBB 20010610: new type for storing autoscale activity. Effectively
 * two booleans (bits) in a single variable, so I'm using an enum with
 * all 4 possible bit masks given readable names. */
public enum e_autoscale
{
	AUTOSCALE_NONE(0),
	AUTOSCALE_MIN(1 << 0),
	AUTOSCALE_MAX(1 << 1),
	AUTOSCALE_BOTH((1 << 0 | 1 << 1)),
	AUTOSCALE_FIXMIN(1 << 2),
	AUTOSCALE_FIXMAX(1 << 3);

	private int intValue;
	private static java.util.HashMap<Integer, e_autoscale> mappings;
	private static java.util.HashMap<Integer, e_autoscale> getMappings()
	{
		if (mappings == null)
		{
			synchronized (e_autoscale.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, e_autoscale>();
				}
			}
		}
		return mappings;
	}

	private e_autoscale(int value)
	{
		intValue = value;
		e_autoscale.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}
	
	public void setValue(int value)
	{
		intValue = value;
	}

	public static e_autoscale forValue(int value)
	{
		return getMappings().get(value);
	}
}