package com.addiPlot.gnuplot;

/* event types:
*/
//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum5:
public enum AnonymousEnum5
{
	GE_motion(0), // mouse has moved
	GE_buttonpress(1), // mouse button has been pressed; par1 = number of the button (1, 2, 3...)
	GE_buttonrelease(2), // mouse button has been released; par1 = number of the button (1, 2, 3...); par2 = time (ms) since previous button release
	GE_keypress(3), // keypress; par1 = keycode (either ASCII, or one of the GP_ enums defined below); par2 = ( |1 .. don't pass through bindings )
	GE_buttonpress_old(4), // same as GE_buttonpress but triggered from inactive window
	GE_buttonrelease_old(5), // same as GE_buttonrelease but triggered from inactive window
	GE_keypress_old(6), // same as GE_keypress but triggered from inactive window
	GE_modifier(7), // shift/ctrl/alt key pressed or released; par1 = is new mask, see Mod_ enums below
	GE_plotdone(8), // acknowledgement of plot completion (for synchronization)
	GE_replot(9), // used only by ggi.trm
	GE_reset(10), /* reset to a well-defined state
			   (e.g.  after an X11 error occured) */
	GE_fontprops(11); // par1 = hchar par2 = vchar
///#if defined(PIPE_IPC) || defined(WIN_IPC)
//    , GE_pending        // signal gp_exec_event() to send pending events 
///#endif

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum5> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum5> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum5.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum5>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum5(int value)
	{
		intValue = value;
		AnonymousEnum5.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum5 forValue(int value)
	{
		return getMappings().get(value);
	}
}