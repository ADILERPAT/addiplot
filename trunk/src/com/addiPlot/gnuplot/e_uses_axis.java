package com.addiPlot.gnuplot;

/*
 * print_points: a debugging routine to print out the points of a curve, and
 * the curve structure. If curve<0, then we print the list of curves.
 */

///#if 0 // not used
////static char *plot_type_names[] =
////{
////    "Function", "Data", "3D Function", "3d data"
////};
////static char *plot_style_names[] =
////{
////    "Lines", "Points", "Impulses", "LinesPoints", "Dots", "XErrorbars",
////    "YErrorbars", "XYErrorbars", "BoxXYError", "Boxes", "Boxerror", "Steps",
////    "FSteps", "Vector",
////    "XErrorlines", "YErrorlines", "XYErrorlines"
////};
////static char *plot_smooth_names[] =
////{
////    "None", "Unique", "Frequency", "CSplines", "ACSplines", "Bezier", "SBezier"
////};
////
////static void
////print_points(int curve)
////{
////    struct curve_points *this_plot;
////    int i;
////
////    if (curve < 0) {
////	for (this_plot = first_plot, i = 0;
////	     this_plot != NULL;
////	     i++, this_plot = this_plot->next) {
////	    printf("Curve %d:\n", i);
////	    if ((int) this_plot->plot_type >= 0 && (int) (this_plot->plot_type) < 4)
////		printf("Plot type %d: %s\n", (int) (this_plot->plot_type),
////			plot_type_names[(int) (this_plot->plot_type)]);
////	    else
////		printf("Plot type %d: BAD\n", (int) (this_plot->plot_type));
////	    if ((int) this_plot->plot_style >= 0 && (int) (this_plot->plot_style) < 14)
////		printf("Plot style %d: %s\n", (int) (this_plot->plot_style),
////			plot_style_names[(int) (this_plot->plot_style)]);
////	    else
////		printf("Plot style %d: BAD\n", (int) (this_plot->plot_style));
////	    if ((int) this_plot->plot_smooth >= 0 && (int) (this_plot->plot_smooth) < 6)
////		printf("Plot smooth style %d: %s\n", (int) (this_plot->plot_style),
////			plot_smooth_names[(int) (this_plot->plot_smooth)]);
////	    else
////		printf("Plot smooth style %d: BAD\n", (int) (this_plot->plot_smooth));
////	    printf("
////Plot title: '%s'\n
////Line type %d\n
////Point type %d\n
////max points %d\n
////current points %d\n\n",
////		   this_plot->title,
////		   this_plot->line_type,
////		   this_plot->point_type,
////		   this_plot->p_max,
////		   this_plot->p_count);
////	}
////    } else {
////	for (this_plot = first_plot, i = 0;
////	     i < curve && this_plot != NULL;
////	     i++, this_plot = this_plot->next);
////	if (this_plot == NULL)
////	    printf("Curve %d does not exist; list has %d curves\n", curve, i);
////	else {
////	    printf("Curve %d, %d points\n", curve, this_plot->p_count);
////	    for (i = 0; i < this_plot->p_count; i++) {
////		printf("%c x=%g y=%g z=%g xlow=%g xhigh=%g ylow=%g yhigh=%g\n",
////			this_plot->points[i].type == INRANGE ? 'i'
////			: this_plot->points[i].type == OUTRANGE ? 'o'
////			: 'u',
////			this_plot->points[i].x,
////			this_plot->points[i].y,
////			this_plot->points[i].z,
////			this_plot->points[i].xlow,
////			this_plot->points[i].xhigh,
////			this_plot->points[i].ylow,
////			this_plot->points[i].yhigh);
////	    }
////	    printf("\n");
////	}
////    }
////}
///#endif // not used 

/* HBB 20010610: mnemonic names for the bits stored in 'uses_axis' */
public enum e_uses_axis
{
	USES_AXIS_FOR_DATA(1),
	USES_AXIS_FOR_FUNC(2);

	private int intValue;
	private static java.util.HashMap<Integer, e_uses_axis> mappings;
	private static java.util.HashMap<Integer, e_uses_axis> getMappings()
	{
		if (mappings == null)
		{
			synchronized (e_uses_axis.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, e_uses_axis>();
				}
			}
		}
		return mappings;
	}

	private e_uses_axis(int value)
	{
		intValue = value;
		e_uses_axis.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static e_uses_axis forValue(int value)
	{
		return getMappings().get(value);
	}
}