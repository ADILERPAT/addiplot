package com.addiPlot.gnuplot;

/* rather than three arrays which all grow dynamically, make one
 * dynamic array of this structure
 */

public class df_column_struct
{
	public double datum;
//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum2:
	public enum AnonymousEnum2
	{
	DF_BAD,
	DF_GOOD;

		public int getValue()
		{
			return this.ordinal();
		}

		public static AnonymousEnum2 forValue(int value)
		{
			return values()[value];
		}
	}
	public AnonymousEnum2 good;
	public String position;
}