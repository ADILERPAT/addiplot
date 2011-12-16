package com.addiPlot.gnuplot;

 // special keys with "usual well-known" keycodes
//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum8:
public enum AnonymousEnum8 // other special keys
{
	GP_FIRST_KEY(1000),
	GP_Linefeed(1001),
	GP_Clear(1002),
	GP_Pause(1003),
	GP_Scroll_Lock(1004),
	GP_Sys_Req(1005),
	GP_Insert(1006),
	GP_Home(1007),
	GP_Left(1008),
	GP_Up(1009),
	GP_Right(1010),
	GP_Down(1011),
	GP_PageUp(1012),
	GP_PageDown(1013),
	GP_End(1014),
	GP_Begin(1015),
	GP_KP_Space(1016),
	GP_KP_Tab(1017),
	GP_KP_F1(1018),
	GP_KP_F2(1019),
	GP_KP_F3(1020),
	GP_KP_F4(1021),

	GP_KP_Insert(1022), // ~ KP_0
	GP_KP_End(1023), // ~ KP_1
	GP_KP_Down(1024), // ~ KP_2
	GP_KP_Page_Down(1025), // ~ KP_3
	GP_KP_Left(1026), // ~ KP_4
	GP_KP_Begin(1027), // ~ KP_5
	GP_KP_Right(1028), // ~ KP_6
	GP_KP_Home(1029), // ~ KP_7
	GP_KP_Up(1030), // ~ KP_8
	GP_KP_Page_Up(1031), // ~ KP_9

	GP_KP_Delete(1032),
	GP_KP_Equal(1033),
	GP_KP_Multiply(1034),
	GP_KP_Add(1035),
	GP_KP_Separator(1036),
	GP_KP_Subtract(1037),
	GP_KP_Decimal(1038),
	GP_KP_Divide(1039),
	GP_KP_0(1040),
	GP_KP_1(1041),
	GP_KP_2(1042),
	GP_KP_3(1043),
	GP_KP_4(1044),
	GP_KP_5(1045),
	GP_KP_6(1046),
	GP_KP_7(1047),
	GP_KP_8(1048),
	GP_KP_9(1049),
	GP_F1(1050),
	GP_F2(1051),
	GP_F3(1052),
	GP_F4(1053),
	GP_F5(1054),
	GP_F6(1055),
	GP_F7(1056),
	GP_F8(1057),
	GP_F9(1058),
	GP_F10(1059),
	GP_F11(1060),
	GP_F12(1061),
	GP_Cancel(1062),
	GP_LAST_KEY(1063);

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum8> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum8> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum8.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum8>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum8(int value)
	{
		intValue = value;
		AnonymousEnum8.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum8 forValue(int value)
	{
		return getMappings().get(value);
	}
}
 // other special keys

///#ifdef OS2
// /* Pass information necessary for (un)checking menu items in the
//    Presentation Manager terminal.
//    Thus this structure is required by pm.trm and gclient.c.
// */
//struct t_gpPMmenu {
//    int use_mouse;
//    int where_zoom_queue;
// /* logical or: 1..unzoom, 2..unzoom back, 4..zoom next */
//    int polar_distance;
//};
//
///#endif


