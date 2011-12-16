package com.addiPlot.gnuplot;

/* position of edge in mesh */
public enum en_edge_position
{
	INNER_MESH(1),
	BOUNDARY(2),
	DIAGONAL(3);

	private int intValue;
	private static java.util.HashMap<Integer, en_edge_position> mappings;
	private static java.util.HashMap<Integer, en_edge_position> getMappings()
	{
		if (mappings == null)
		{
			synchronized (en_edge_position.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, en_edge_position>();
				}
			}
		}
		return mappings;
	}

	private en_edge_position(int value)
	{
		intValue = value;
		en_edge_position.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static en_edge_position forValue(int value)
	{
		return getMappings().get(value);
	}
}