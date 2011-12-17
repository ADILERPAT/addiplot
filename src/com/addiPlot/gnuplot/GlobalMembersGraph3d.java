package com.addiPlot.gnuplot;

import com.addiPlot.term;

public class GlobalMembersGraph3d
{
	///#define __STDC__ 1
	///#define __STDC_HOSTED__ 1
	///#define __GNUC__ 4
	///#define __GNUC_MINOR__ 3
	///#define __GNUC_PATCHLEVEL__ 6
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __SIZE_TYPE__ long unsigned int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __PTRDIFF_TYPE__ long int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __WCHAR_TYPE__ int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __WINT_TYPE__ unsigned int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __INTMAX_TYPE__ long int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __UINTMAX_TYPE__ long unsigned int
	///#define __GXX_ABI_VERSION 1002
	///#define __SCHAR_MAX__ 127
	///#define __SHRT_MAX__ 32767
	///#define __INT_MAX__ 2147483647
	///#define __LONG_MAX__ 9223372036854775807L
	///#define __LONG_LONG_MAX__ 9223372036854775807LL
	///#define __WCHAR_MAX__ 2147483647
	///#define __CHAR_BIT__ 8
	///#define __INTMAX_MAX__ 9223372036854775807L
	///#define __FLT_EVAL_METHOD__ 0
	///#define __DEC_EVAL_METHOD__ 2
	///#define __FLT_RADIX__ 2
	///#define __FLT_MANT_DIG__ 24
	///#define __FLT_DIG__ 6
	///#define __FLT_MIN_EXP__ (-125)
	///#define __FLT_MIN_10_EXP__ (-37)
	///#define __FLT_MAX_EXP__ 128
	///#define __FLT_MAX_10_EXP__ 38
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __FLT_MAX__ 3.40282347e+38F
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __FLT_MIN__ 1.17549435e-38F
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __FLT_EPSILON__ 1.19209290e-7F
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __FLT_DENORM_MIN__ 1.40129846e-45F
	///#define __FLT_HAS_DENORM__ 1
	///#define __FLT_HAS_INFINITY__ 1
	///#define __FLT_HAS_QUIET_NAN__ 1
	///#define __DBL_MANT_DIG__ 53
	///#define __DBL_DIG__ 15
	///#define __DBL_MIN_EXP__ (-1021)
	///#define __DBL_MIN_10_EXP__ (-307)
	///#define __DBL_MAX_EXP__ 1024
	///#define __DBL_MAX_10_EXP__ 308
	///#define __DBL_MAX__ 1.7976931348623157e+308
	///#define __DBL_MIN__ 2.2250738585072014e-308
	///#define __DBL_EPSILON__ 2.2204460492503131e-16
	///#define __DBL_DENORM_MIN__ 4.9406564584124654e-324
	///#define __DBL_HAS_DENORM__ 1
	///#define __DBL_HAS_INFINITY__ 1
	///#define __DBL_HAS_QUIET_NAN__ 1
	///#define __LDBL_MANT_DIG__ 64
	///#define __LDBL_DIG__ 18
	///#define __LDBL_MIN_EXP__ (-16381)
	///#define __LDBL_MIN_10_EXP__ (-4931)
	///#define __LDBL_MAX_EXP__ 16384
	///#define __LDBL_MAX_10_EXP__ 4932
	///#define __DECIMAL_DIG__ 21
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __LDBL_MAX__ 1.18973149535723176502e+4932L
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __LDBL_MIN__ 3.36210314311209350626e-4932L
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __LDBL_EPSILON__ 1.08420217248550443401e-19L
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __LDBL_DENORM_MIN__ 3.64519953188247460253e-4951L
	///#define __LDBL_HAS_DENORM__ 1
	///#define __LDBL_HAS_INFINITY__ 1
	///#define __LDBL_HAS_QUIET_NAN__ 1
	///#define __DEC32_MANT_DIG__ 7
	///#define __DEC32_MIN_EXP__ (-95)
	///#define __DEC32_MAX_EXP__ 96
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC32_MIN__ 1E-95DF
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC32_MAX__ 9.999999E96DF
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC32_EPSILON__ 1E-6DF
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC32_DEN__ 0.000001E-95DF
	///#define __DEC64_MANT_DIG__ 16
	///#define __DEC64_MIN_EXP__ (-383)
	///#define __DEC64_MAX_EXP__ 384
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC64_MIN__ 1E-383DD
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC64_MAX__ 9.999999999999999E384DD
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC64_EPSILON__ 1E-15DD
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC64_DEN__ 0.000000000000001E-383DD
	///#define __DEC128_MANT_DIG__ 34
	///#define __DEC128_MIN_EXP__ (-6143)
	///#define __DEC128_MAX_EXP__ 6144
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC128_MIN__ 1E-6143DL
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC128_MAX__ 9.999999999999999999999999999999999E6144DL
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC128_EPSILON__ 1E-33DL
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __DEC128_DEN__ 0.000000000000000000000000000000001E-6143DL
	///#define __REGISTER_PREFIX__
	///#define __USER_LABEL_PREFIX__
	///#define __VERSION__ "4.3.6"
	///#define __GNUC_GNU_INLINE__ 1
	///#define _LP64 1
	///#define __LP64__ 1
	///#define __OPTIMIZE__ 1
	///#define __FINITE_MATH_ONLY__ 0
	///#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_1 1
	///#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_2 1
	///#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_4 1
	///#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_8 1
	///#define __SIZEOF_INT__ 4
	///#define __SIZEOF_LONG__ 8
	///#define __SIZEOF_LONG_LONG__ 8
	///#define __SIZEOF_SHORT__ 2
	///#define __SIZEOF_FLOAT__ 4
	///#define __SIZEOF_DOUBLE__ 8
	///#define __SIZEOF_LONG_DOUBLE__ 16
	///#define __SIZEOF_SIZE_T__ 8
	///#define __SIZEOF_WCHAR_T__ 4
	///#define __SIZEOF_WINT_T__ 4
	///#define __SIZEOF_PTRDIFF_T__ 8
	///#define __SIZEOF_POINTER__ 8
	///#define __amd64 1
	///#define __amd64__ 1
	///#define __x86_64 1
	///#define __x86_64__ 1
	///#define __k8 1
	///#define __k8__ 1
	///#define __MMX__ 1
	///#define __SSE__ 1
	///#define __SSE2__ 1
	///#define __SSE_MATH__ 1
	///#define __SSE2_MATH__ 1
	///#define __gnu_linux__ 1
	///#define __linux 1
	///#define __linux__ 1
	///#define linux 1
	///#define __unix 1
	///#define __unix__ 1
	///#define unix 1
	///#define __ELF__ 1
	///#define __DECIMAL_BID_FORMAT__ 1
	///#define HAVE_CONFIG_H 1
	///#define BINDIR "/usr/local/bin"
	///#define X11_DRIVER_DIR "/usr/local/libexec/gnuplot/4.4"
	///#define GNUPLOT_PS_DIR "/usr/local/share/gnuplot/4.4/PostScript"
	///#define GNUPLOT_JS_DIR "/usr/local/share/gnuplot/4.4/js"
	///#define GNUPLOT_LUA_DIR "/usr/local/share/gnuplot/4.4/lua"
	///#define CONTACT "gnuplot-bugs@lists.sourceforge.net"
	///#define HELPFILE "/usr/local/share/gnuplot/4.4/gnuplot.gih"
	///#define GNUPLOT_X11 "gnuplot_x11"
	///#define XAPPLRESDIR "/etc/X11/app-defaults/"

	///#ifndef lint
	//public static String RCSid()
	//{
	//	return GlobalMembersAlloc.RCSid("$Id: graph3d.c,v 1.222.2.4 2010/02/27 21:52:38 sfeam Exp $");
	//}
	///#endif

	/* Variables of graph3d.c needed by other modules: */

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int xmiddle, ymiddle, xscaler, yscaler;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double floor_z;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double ceiling_z, base_z; // made exportable for PM3D
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double trans_mat[4][4];
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double xscale3d, yscale3d, zscale3d;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double xcenter3d, ycenter3d, zcenter3d;

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern en_contour_placement draw_contour;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean label_contours;

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean draw_surface;

	/* is hidden3d display wanted? */
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean hidden3d;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int hidden3d_layer; // LAYER_FRONT or LAYER_BACK

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern float surface_rot_z;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern float surface_rot_x;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern float surface_scale;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern float surface_zscale;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int splot_map;

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern t_xyplane xyplane;

	///#define ISO_SAMPLES 10
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int iso_samples_1;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int iso_samples_2;

	///#ifdef USE_MOUSE
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int axis3d_o_x, axis3d_o_y, axis3d_x_dx, axis3d_x_dy, axis3d_y_dx, axis3d_y_dy;
	///#endif

	/* Prototypes from file "graph3d.c" */

	public static void do_3dplot(surface_points plots, int pcount, int quick)
	{
		TERMENTRY t = GlobalMembersTerm.term;
		int surface;
		surface_points this_plot = null;
		int xl;
		int yl;
		double[][] mat = new double[4][4];
		int key_count;
		legend_key key = GlobalMembersGadgets.keyT;
		boolean pm3d_order_depth = false;

		/* Initiate transformation matrix using the global view variables. */
		GlobalMembersUtil3d.mat_rot_z(surface_rot_z, trans_mat);
		GlobalMembersUtil3d.mat_rot_x(surface_rot_x, mat);
		GlobalMembersUtil3d.mat_mult(trans_mat, trans_mat, mat);
		GlobalMembersUtil3d.mat_scale(surface_scale / 2.0, surface_scale / 2.0, surface_scale / 2.0, mat);
		GlobalMembersUtil3d.mat_mult(trans_mat, trans_mat, mat);

		/* The extrema need to be set even when a surface is not being
		 * drawn.   Without this, gnuplot used to assume that the X and
		 * Y axis started at zero.   -RKC
		 */

		if (GlobalMembersGadgets.polar)
			GlobalMembersUtil.graph_error("Cannot splot in polar coordinate system.");

		/* done in plot3d.c
		 *    if (z_min3d == VERYLARGE || z_max3d == -VERYLARGE ||
		 *      x_min3d == VERYLARGE || x_max3d == -VERYLARGE ||
		 *      y_min3d == VERYLARGE || y_max3d == -VERYLARGE)
		 *      graph_error("all points undefined!");
		 */

		/* absolute or relative placement of xyplane along z */
		if (xyplane.absolute)
			base_z = (GlobalMembersAxis.axis_array[0].log ? (Math.log(xyplane.z) / GlobalMembersAxis.axis_array[0].log_base) : (xyplane.z));
		else
			base_z = GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min - (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) * xyplane.z;

		/* If we are to draw the bottom grid make sure zmin is updated properly. */
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticmode != 0 || GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].ticmode != 0 || GlobalMembersAxis.some_grid_selected())
		{
			if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].range_flags & ((DefineConstants.RANGE_REVERSE != 0) ? 1 : 0)) != 0)
			{
				floor_z = ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) > (base_z) ? (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) : (base_z));
				ceiling_z = ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max) < (base_z) ? (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max) : (base_z));
			}
			else
			{
				floor_z = ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) < (base_z) ? (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) : (base_z));
				ceiling_z = ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max) > (base_z) ? (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max) : (base_z));
			}
		}
		else
		{
			floor_z = GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min;
			ceiling_z = GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max;
		}

		/*  see comment accompanying similar tests of x_min/x_max and y_min/y_max
		 *  in graphics.c:do_plot(), for history/rationale of these tests */
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min == GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
			GlobalMembersUtil.graph_error("x_min3d should not equal x_max3d!");
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min == GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
			GlobalMembersUtil.graph_error("y_min3d should not equal y_max3d!");
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min == GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max)
			GlobalMembersUtil.graph_error("z_min3d should not equal z_max3d!");

		GlobalMembersTerm.term_start_plot();

		GlobalMembersUtil.screen_ok = false;

		/* Sync point for epslatex text positioning */
		term.layer(termlayer.TERM_LAYER_BACKTEXT);

		/* now compute boundary for plot */
		GlobalMembersGraph3d.boundary3d(plots, pcount);

		GlobalMembersAxis.axis_set_graphical_range(AXIS_INDEX.FIRST_X_AXIS, GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.xright);
		GlobalMembersAxis.axis_set_graphical_range(AXIS_INDEX.FIRST_Y_AXIS, GlobalMembersGadgets.plot_bounds.ybot, GlobalMembersGadgets.plot_bounds.ytop);
		GlobalMembersAxis.axis_set_graphical_range(AXIS_INDEX.FIRST_Z_AXIS, (int)floor_z, (int)ceiling_z);

		/* SCALE FACTORS */
		zscale3d = 2.0 / (ceiling_z - floor_z) * surface_zscale;
		yscale3d = 2.0 / (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
		xscale3d = 2.0 / (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);

		/* Allow 'set view equal xy' to adjust rendered length of the X and/or Y axes. */
		/* FIXME EAM - This only works correctly if the coordinate system of the       */
		/* terminal itself is isotropic.  E.g. x11 does not work because the x and y   */
		/* coordinates always run from 0-4095 regardless of the shape of the window.   */
		xcenter3d = ycenter3d = zcenter3d = 0.0;
		if (GlobalMembersGadgets.aspect_ratio_3D >= 2)
		{
			if (yscale3d > xscale3d)
			{
				ycenter3d = 1.0 - xscale3d / yscale3d;
				yscale3d = xscale3d;
			}
			else if (xscale3d > yscale3d)
			{
				xcenter3d = 1.0 - yscale3d / xscale3d;
				xscale3d = yscale3d;
			}
			if (GlobalMembersGadgets.aspect_ratio_3D >= 3)
				zscale3d = xscale3d;
		}

		/* Initialize palette */
		if (quick == 0)
		{
			can_pm3d = GlobalMembersPm3d.is_plot_with_palette() && GlobalMembersColor.make_palette() == 0 && GlobalMembersTerm.term.set_color;
		}

		/* Give a chance for rectangles to be behind everything else */
		GlobalMembersGraphics.place_objects(GlobalMembersGadgets.first_object, -1, 3, null);

		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: term_apply_lp_properties(&border_lp);
		GlobalMembersTerm.term_apply_lp_properties(new lp_style_type(GlobalMembersGadgets.border_lp)); // border linetype

		/* must come before using draw_3d_graphbox() the first time */
		GlobalMembersGraph3d.setup_3d_box_corners();

		/* DRAW GRID AND BORDER */
		/* Original behaviour: draw entire grid in back, if 'set grid back': */
		/* HBB 20040331: but not if in hidden3d mode */
		if (!hidden3d && GlobalMembersAxis.grid_layer == 0)
			GlobalMembersGraph3d.draw_3d_graphbox(plots, pcount, WHICHGRID.ALLGRID, DefineConstants.LAYER_BACK);
		else if (splot_map != 0 && GlobalMembersGadgets.border_layer == 0)
			GlobalMembersGraph3d.draw_3d_graphbox(plots, pcount, WHICHGRID.BORDERONLY, DefineConstants.LAYER_BACK);

		///#ifdef USE_GRID_LAYERS
		if (!hidden3d && (GlobalMembersAxis.grid_layer == -1))
			/* Default layering mode.  Draw the back part now, but not if
			 * hidden3d is in use, because that relies on all isolated
			 * lines being output after all surfaces have been defined. */
			GlobalMembersGraph3d.draw_3d_graphbox(plots, pcount, WHICHGRID.BACKGRID, DefineConstants.LAYER_BACK);
		///#endif // USE_GRID_LAYERS

		/* Clipping in 'set view map' mode should be like 2D clipping */
		if (splot_map != 0)
		{
			int map_x1;
			int map_y1;
			int map_x2;
			int map_y2;
			GlobalMembersUtil3d.map3d_xy(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min, base_z, map_x1, map_y1);
			GlobalMembersUtil3d.map3d_xy(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max, base_z, map_x2, map_y2);
			GlobalMembersGadgets.plot_bounds.xleft = map_x1;
			GlobalMembersGadgets.plot_bounds.xright = map_x2;
			GlobalMembersGadgets.plot_bounds.ybot = map_y2;
			GlobalMembersGadgets.plot_bounds.ytop = map_y1;
		}

		/* Mar 2009 - This is a change!
		 * Define the clipping area in 3D to lie between the left-most and
		 * right-most graph box edges.  This is introduced for the benefit of
		 * zooming in the canvas terminal.  It may or may not make any practical
		 * difference for other terminals.  If it causes problems, then we will need
		 * a separate BoundingBox structure to track the actual 3D graph box.
		 */
		else
		{
			int xl;
			int xb;
			int xr;
			int xf;
			int yl;
			int yb;
			int yr;
			int yf;

			GlobalMembersUtil3d.map3d_xy(zaxis_x, zaxis_y, base_z, xl, yl);
			GlobalMembersUtil3d.map3d_xy(back_x, back_y, base_z, xb, yb);
			GlobalMembersUtil3d.map3d_xy(right_x, right_y, base_z, xr, yr);
			GlobalMembersUtil3d.map3d_xy(front_x, front_y, base_z, xf, yf);
			GlobalMembersGadgets.plot_bounds.xleft = ((xl) < (xb) ? (xl) : (xb));
			GlobalMembersGadgets.plot_bounds.xright = ((xb) > (xr) ? (xb) : (xr));
		}

		/* PLACE TITLE */
		if (!GlobalMembersGadgets.title.text.equals(0))
		{
			int x;
			int y;
			int tmpx;
			int tmpy;
			if (splot_map != 0) // case 'set view map'
			{
				int map_x1;
				int map_y1;
				int map_x2;
				int map_y2;
				int tics_len = 0;
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticmode & ((DefineConstants.TICS_MIRROR != 0) ? 1 : 0)) != 0)
				{
					tics_len = (int)(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticscale * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].tic_in ? - 1 : 1) * (GlobalMembersTerm.term.v_tic));
					if (tics_len < 0) // take care only about upward tics
						tics_len = 0;
				}
				GlobalMembersUtil3d.map3d_xy(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min, base_z, map_x1, map_y1);
				GlobalMembersUtil3d.map3d_xy(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max, base_z, map_x2, map_y2);
				/* Distance between the title base line and graph top line or the upper part of
			   tics is as given by character height: */
				GlobalMembersGraph3d.map3d_position_r((GlobalMembersGadgets.title.offset), tmpx, tmpy, "3dplot");
				///#define DEFAULT_Y_DISTANCE 1.0
				x = (int)((map_x1 + map_x2) / 2 + tmpx);
				y = (int)(map_y1 + tics_len + tmpy + (DefineConstants.DEFAULT_Y_DISTANCE + titlelin - 0.5) * (t.v_char));
				//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
				///#undef DEFAULT_Y_DISTANCE
			} // usual 3d set view ...
			else
			{
				GlobalMembersGraph3d.map3d_position_r((GlobalMembersGadgets.title.offset), tmpx, tmpy, "3dplot");
				x = (int)((GlobalMembersGadgets.plot_bounds.xleft + GlobalMembersGadgets.plot_bounds.xright) / 2 + tmpx);
				y = (int)(GlobalMembersGadgets.plot_bounds.ytop + tmpy + titlelin * (t.h_char));
			}
			GlobalMembersTerm.ignore_enhanced(GlobalMembersGadgets.title.noenhanced);
			GlobalMembersGadgets.apply_pm3dcolor(GlobalMembersGadgets.title.textcolor);
			/* PM: why there is JUST_TOP and not JUST_BOT? We should draw above baseline!
			 * But which terminal understands that? It seems vertical justification does
			 * not work... */
			GlobalMembersTerm.write_multiline(x, y, GlobalMembersGadgets.title.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersGadgets.title.font);
			GlobalMembersGadgets.reset_textcolor(GlobalMembersGadgets.title.textcolor);
			GlobalMembersTerm.ignore_enhanced(false);
		}

		/* PLACE TIMEDATE */
		if (GlobalMembersGadgets.timelabel.text != null)
		{
			String str = new String(new char[DefineConstants.MAX_LINE_LEN + 1]);
			time_t now = new time_t();
			int tmpx;
			int tmpy;
			int x;
			int y;

			GlobalMembersGraph3d.map3d_position_r((GlobalMembersGadgets.timelabel.offset), tmpx, tmpy, "3dplot");
			x = t.v_char + tmpx;
			y = (int) (GlobalMembersGadgets.timelabel_bottom != 0 ? GlobalMembersGadgets.yoffset * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max + tmpy + t.v_char : GlobalMembersGadgets.plot_bounds.ytop + tmpy - t.v_char);

			time(now);
			GlobalMembersStrftime.strftime(str, DefineConstants.MAX_LINE_LEN, GlobalMembersGadgets.timelabel.text, localtime(now));

			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	if (GlobalMembersGadgets.timelabel_rotate != 0 && (*t.text_angle)(DefineConstants.TEXT_VERTICAL))
			{
				if (GlobalMembersGadgets.timelabel_bottom != 0)
					GlobalMembersTerm.write_multiline(x, y, str, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_TOP, DefineConstants.TEXT_VERTICAL, GlobalMembersGadgets.timelabel.font);
				else
					GlobalMembersTerm.write_multiline(x, y, str, JUSTIFY.RIGHT, VERT_JUSTIFY.JUST_TOP, DefineConstants.TEXT_VERTICAL, GlobalMembersGadgets.timelabel.font);

				//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
				//		(*t.text_angle)(0);
			}
			else
			{
				if (GlobalMembersGadgets.timelabel_bottom != 0)
					GlobalMembersTerm.write_multiline(x, y, str, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_BOT, 0, GlobalMembersGadgets.timelabel.font);
				else
					GlobalMembersTerm.write_multiline(x, y, str, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersGadgets.timelabel.font);
			}
		}

		/* Add 'back' color box */
		if (quick == 0 && can_pm3d && GlobalMembersPm3d.is_plot_with_colorbox() && GlobalMembersGadgets.color_box.layer == DefineConstants.LAYER_BACK)
			GlobalMembersColor.draw_color_smooth_box(MODE_PLOT_TYPE.MODE_SPLOT.getValue());

		/* Add 'back' rectangles */
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: place_objects(first_object, 0, 3, &plot_bounds);
		GlobalMembersGraphics.place_objects(GlobalMembersGadgets.first_object, 0, 3, new BoundingBox(GlobalMembersGadgets.plot_bounds));

		/* PLACE LABELS */
		GlobalMembersGraph3d.place_labels3d(GlobalMembersGadgets.first_label, 0);

		/* PLACE ARROWS */
		GlobalMembersGraph3d.place_arrows3d(0);

		/* Sync point for epslatex text positioning */
		GlobalMembersTerm.term.layer(termlayer.TERM_LAYER_FRONTTEXT);

		///#ifndef LITE
		if (hidden3d && draw_surface && quick == 0)
		{
			GlobalMembersHidden3d.init_hidden_line_removal();
			GlobalMembersHidden3d.reset_hidden_line_removal();
		}
		///#endif // not LITE

		/* WORK OUT KEY SETTINGS AND DO KEY TITLE / BOX */

		if (key.reverse)
		{
			key_sample_left = -key_sample_width;
			key_sample_right = 0;
			key_text_left = t.h_char;
			key_text_right = t.h_char * (max_ptitl_len + 1);
			key_size_right = (int) (t.h_char * (max_ptitl_len + 2 + key.width_fix));
			key_size_left = t.h_char + key_sample_width;
		}
		else
		{
			key_sample_left = 0;
			key_sample_right = key_sample_width;
			key_text_left = -(int)(t.h_char * (max_ptitl_len + 1));
			key_text_right = -(int) t.h_char;
			key_size_left = (int) (t.h_char * (max_ptitl_len + 2 + key.width_fix));
			key_size_right = t.h_char + key_sample_width;
		}
		key_point_offset = (key_sample_left + key_sample_right) / 2;

		if (key.visible)
			if (key.region != en_key_region.GPKEY_USER_PLACEMENT)
			{
				if (key.region != en_key_region.GPKEY_AUTO_INTERIOR_LRTBC && key.margin == en_key_ext_region.GPKEY_BMARGIN)
				{
					/* HBB 19990608: why calculate these again? boundary3d has already
					 * done it... */
					if (ptitl_cnt > 0)
					{
						/* maximise no cols, limited by label-length */
						key_cols = (int)(GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft) / key_col_wth;
						if (key_cols < 1)
							key_cols = 1;
						key_rows = (int)(ptitl_cnt + key_cols - 1) / key_cols;
						/* now calculate actual no cols depending on no rows */
						key_cols = (int)(ptitl_cnt + key_rows - 1) / key_rows;
						key_col_wth = (int)(GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft) / key_cols;
						/* we divide into columns, then centre in column by considering
						 * ratio of key_left_size to key_right_size
						 * key_size_left/(key_size_left+key_size_right)
						 *  * (plot_bounds.xright-plot_bounds.xleft)/key_cols
						 * do one integer division to maximise accuracy (hope we dont
						 * overflow !)
						 */
						xl = GlobalMembersGadgets.plot_bounds.xleft + ((GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft) * key_size_left) / (key_cols * (key_size_left + key_size_right));
						yl = (int) (GlobalMembersGadgets.yoffset * t.ymax + (key_rows) * key_entry_height + (ktitle_lines + 2) * t.v_char);
					}

				}
				else
				{
					if (key.vpos == VERT_JUSTIFY.JUST_TOP)
					{
						yl = GlobalMembersGadgets.plot_bounds.ytop - t.v_tic - t.v_char;
					}
					else
					{
						yl = (int) (GlobalMembersGadgets.plot_bounds.ybot + t.v_tic + key_entry_height * key_rows + ktitle_lines * t.v_char);
					}
					if (key.region != en_key_region.GPKEY_AUTO_INTERIOR_LRTBC && key.margin == en_key_ext_region.GPKEY_RMARGIN)
					{
						/* keys outside plot border (right) */
						xl = GlobalMembersGadgets.plot_bounds.xright + t.h_tic + key_size_left;
					}
					else if (key.region != en_key_region.GPKEY_AUTO_INTERIOR_LRTBC && key.margin == en_key_ext_region.GPKEY_LMARGIN)
					{
						/* keys outside plot border (left) */
						xl = key_size_left + 2 * t.h_char;
					}
					else if (key.hpos == JUSTIFY.LEFT)
					{
						xl = GlobalMembersGadgets.plot_bounds.xleft + t.h_tic + key_size_left;
					}
					else if (GlobalMembersGadgets.rmargin.scalex == position_type.screen && (key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC || key.region == en_key_region.GPKEY_AUTO_EXTERIOR_MARGIN))
					{
						xl = GlobalMembersGadgets.plot_bounds.xright - key_size_right + key_col_wth - 2 * t.h_char;
					}
					else
					{
						xl = GlobalMembersGadgets.plot_bounds.xright - key_size_right - key_col_wth * (key_cols - 1);
					}
				}
				yl_ref = (int) (yl - ktitle_lines * t.v_char);
			}
		if (key.region == en_key_region.GPKEY_USER_PLACEMENT)
		{
			GlobalMembersGraph3d.map3d_position(key.user_pos, xl, yl, "key");
		}

		/* Key bounds */
		key.bounds.xright = xl + key_col_wth * (key_cols - 1) + key_size_right;
		key.bounds.xleft = xl - key_size_left;
		key.bounds.ytop = (int) (yl + t.v_char * ktitle_lines);
		key.bounds.ybot = yl - key_entry_height * key_rows;

		/* Key title */
		if (key.visible && (key.title != null))
		{
			int center = (key.bounds.xright + key.bounds.xleft) / 2;
			double extra_height = 0.0;

			if (key.textcolor.type == DefineConstants.TC_RGB && key.textcolor.value < 0)
				GlobalMembersGadgets.apply_pm3dcolor(key.box.pm3d_color);
			else
				GlobalMembersGadgets.apply_pm3dcolor(key.textcolor);
			if ((t.flags & DefineConstants.TERM_ENHANCED_TEXT) && StringFunctions.strChr(key.title,'^'))
				extra_height += 0.51;
			GlobalMembersTerm.write_multiline(center, key.bounds.ytop - (0.5 + extra_height / 2.0) * t.v_char, key.title, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, 0, key.font);
			if ((t.flags & DefineConstants.TERM_ENHANCED_TEXT) && StringFunctions.strChr(key.title,'_'))
				extra_height += 0.3;
			ktitle_lines += extra_height;
			yl -= t.v_char * extra_height;
			key.bounds.ybot -= t.v_char * extra_height;
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*t.linetype)(DefineConstants.LT_BLACK);
		}

		/* Key box */
		if (key.visible && key.box.l_type > DefineConstants.LT_NODRAW)
		{
			int tmp = (int)(0.5 * key.height_fix * t.v_char);
			key.bounds.ybot -= 2 * tmp;
			yl -= tmp;

			GlobalMembersTerm.term_apply_lp_properties(key.box);
			GlobalMembersTerm.newpath();
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*t.move)(key.bounds.xleft, key.bounds.ybot);
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*t.vector)(key.bounds.xleft, key.bounds.ytop);
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*t.vector)(key.bounds.xright, key.bounds.ytop);
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*t.vector)(key.bounds.xright, key.bounds.ybot);
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*t.vector)(key.bounds.xleft, key.bounds.ybot);
			GlobalMembersTerm.closepath();

			/* draw a horizontal line between key title and first entry  JFi */
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*t.move)(key.bounds.xleft, key.bounds.ytop - (ktitle_lines) * t.v_char);
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*t.vector)(key.bounds.xright, key.bounds.ytop - (ktitle_lines) * t.v_char);
		}


		/* DRAW SURFACES AND CONTOURS */

		///#ifndef LITE
		if (hidden3d && (hidden3d_layer == DefineConstants.LAYER_BACK) && draw_surface && quick == 0)
			GlobalMembersHidden3d.plot3d_hidden(plots, pcount);
		///#endif // not LITE

		/* Set up bookkeeping for the individual key titles */
		//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
		///#define NEXT_KEY_LINE() do { if ( ++key_count >= key_rows ) { yl = yl_ref; xl += key_col_wth; key_count = 0; } else yl -= key_entry_height; } while (0)
		key_count = 0;
		yl_ref = yl -= key_entry_height / 2; // centralise the keys


		/* PM January 2005: The mistake of missing blank lines in the data file is
		 * so frequently made (see questions at comp.graphics.apps.gnuplot) that it
		 * really deserves this warning. But don't show it too often --- only if it
		 * is a single surface in the plot.
		 */
		if (pcount == 1 && plots.num_iso_read == 1 && can_pm3d && (plots.plot_style == PLOT_STYLE.PM3DSURFACE || PM3D_IMPL_MODE.PM3D_IMPLICIT == GlobalMembersPm3d.pm3d.implicit))
			fprintf(stderr, "  Warning: Single isoline (scan) is not enough for a pm3d plot.\n\t   Hint: Missing blank lines in the data file? See 'help pm3d' and FAQ.\n");


		pm3d_order_depth = (can_pm3d && ((int)draw_contour) == 0 && GlobalMembersPm3d.pm3d.direction == DefineConstants.PM3D_DEPTH);

		if (pm3d_order_depth)
		{
			GlobalMembersPm3d.pm3d_depth_queue_clear();
		}

		this_plot = plots;
		if (quick == 0)
			for (surface = 0; surface < pcount; this_plot = this_plot.next_sp, surface++)
			{
				/* just an abbreviation */
				boolean use_palette = can_pm3d && this_plot.lp_properties.use_palette;
				boolean lkey;

				/* Skip over abortive data structures */
				if (this_plot.plot_type == PLOT_TYPE.NODATA)
					continue;

				if (can_pm3d && PM3D_IMPL_MODE.PM3D_IMPLICIT == GlobalMembersPm3d.pm3d.implicit)
					GlobalMembersPm3d.pm3d_draw_one(this_plot);

				/* Sync point for start of new curve (used by svg, post, ...) */
				GlobalMembersTerm.term.layer(termlayer.TERM_LAYER_BEFORE_PLOT);

				if (pm3d_order_depth && this_plot.plot_style != PLOT_STYLE.PM3DSURFACE)
					GlobalMembersPm3d.pm3d_depth_queue_flush(); // draw pending plots

				lkey = (key.visible && this_plot.title != null && this_plot.title.charAt(0) && !this_plot.title_is_suppressed);

				if (lkey)
				{
					/* EAM - force key text to black, then restore */
					//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
					//		(*t.linetype)(DefineConstants.LT_BLACK);
					GlobalMembersTerm.ignore_enhanced(this_plot.title_no_enhanced);
					GlobalMembersGraph3d.key_text(xl, yl, this_plot.title);
					GlobalMembersTerm.ignore_enhanced(false);
				}
				GlobalMembersTerm.term_apply_lp_properties((this_plot.lp_properties));

				switch (this_plot.plot_style)
				{
				case BOXES: // can't do boxes in 3d yet so use impulses
				case FILLEDCURVES:
				case IMPULSES:
				{
					if (lkey)
					{
						GlobalMembersGraph3d.key_sample_line(xl, yl);
					}
					if (!(hidden3d && draw_surface && !this_plot.opt_out_of_surface))
						GlobalMembersGraph3d.plot3d_impulses(this_plot);
					break;
				}
				case STEPS: // HBB: I think these should be here
				case FSTEPS:
				case HISTEPS:
				case LINES:
					if (draw_surface && !this_plot.opt_out_of_surface)
					{
						if (lkey)
						{
							if (this_plot.lp_properties.use_palette)
								GlobalMembersGraph3d.key_sample_line_pm3d(this_plot, xl, yl);
							else
								GlobalMembersGraph3d.key_sample_line(xl, yl);
						}
						if (!hidden3d || this_plot.opt_out_of_hidden3d)
						{
							if (use_palette)
								GlobalMembersGraph3d.plot3d_lines_pm3d(this_plot);
							else
								GlobalMembersGraph3d.plot3d_lines(this_plot);
						}
					}
					break;
				case YERRORLINES: // ignored; treat like points
				case XERRORLINES: // ignored; treat like points
				case XYERRORLINES: // ignored; treat like points
				case YERRORBARS: // ignored; treat like points
				case XERRORBARS: // ignored; treat like points
				case XYERRORBARS: // ignored; treat like points
				case BOXXYERROR: // HBB: ignore these as well
				case BOXERROR:
				case CANDLESTICKS: // HBB: dito
				case FINANCEBARS:
				case CIRCLES:
				case POINTSTYLE:
					if (draw_surface && !this_plot.opt_out_of_surface)
					{
						if (lkey)
						{
							if (this_plot.lp_properties.use_palette)
								GlobalMembersGraph3d.key_sample_point_pm3d(this_plot, xl, yl, this_plot.lp_properties.p_type);
							else
								GlobalMembersGraph3d.key_sample_point(xl, yl, this_plot.lp_properties.p_type);
						}
						if (!hidden3d || this_plot.opt_out_of_hidden3d)
							GlobalMembersGraph3d.plot3d_points(this_plot, this_plot.lp_properties.p_type);
					}
					break;

				case LINESPOINTS:
					if (draw_surface && !this_plot.opt_out_of_surface)
					{

						/* put lines */
						if (lkey)
						{
							if (this_plot.lp_properties.use_palette)
								GlobalMembersGraph3d.key_sample_line_pm3d(this_plot, xl, yl);
							else
								GlobalMembersGraph3d.key_sample_line(xl, yl);
						}

						if (!hidden3d || this_plot.opt_out_of_hidden3d)
						{
							if (use_palette)
								GlobalMembersGraph3d.plot3d_lines_pm3d(this_plot);
							else
								GlobalMembersGraph3d.plot3d_lines(this_plot);
						}

						/* put points */
						if (lkey)
						{
							if (this_plot.lp_properties.use_palette)
								GlobalMembersGraph3d.key_sample_point_pm3d(this_plot, xl, yl, this_plot.lp_properties.p_type);
							else
								GlobalMembersGraph3d.key_sample_point(xl, yl, this_plot.lp_properties.p_type);
						}

						if (!hidden3d || this_plot.opt_out_of_hidden3d)
							GlobalMembersGraph3d.plot3d_points(this_plot, this_plot.lp_properties.p_type);

					}
					break;

				case DOTS:
					if (draw_surface && !this_plot.opt_out_of_surface)
					{
						this_plot.lp_properties.p_type = -1;
						this_plot.lp_properties.pointflag = 1;
						if (lkey)
						{
							if (this_plot.lp_properties.use_palette)
								GlobalMembersGraph3d.key_sample_point_pm3d(this_plot, xl, yl, -1);
							else
								GlobalMembersGraph3d.key_sample_point(xl, yl, -1);
						}
						if (!hidden3d || this_plot.opt_out_of_hidden3d)
							GlobalMembersGraph3d.plot3d_points(this_plot, -1);
					}
					break;

				case VECTOR:
					if (lkey)
					{
						if (this_plot.lp_properties.use_palette)
							GlobalMembersGraph3d.key_sample_line_pm3d(this_plot, xl, yl);
						else
							GlobalMembersGraph3d.key_sample_line(xl, yl);
					}
					if (!hidden3d || this_plot.opt_out_of_hidden3d)
						GlobalMembersGraph3d.plot3d_vectors(this_plot);
					break;

				case PM3DSURFACE:
					if (draw_surface && !this_plot.opt_out_of_surface)
					{
						if (can_pm3d && PM3D_IMPL_MODE.PM3D_IMPLICIT != GlobalMembersPm3d.pm3d.implicit)
						{
							GlobalMembersPm3d.pm3d_draw_one(this_plot);
							if (!pm3d_order_depth)
								GlobalMembersPm3d.pm3d_depth_queue_flush(); // draw plot immediately
						}
					}
					break;

				case LABELPOINTS:
					if (!hidden3d || this_plot.opt_out_of_hidden3d)
						GlobalMembersGraph3d.place_labels3d(this_plot.labels.next, DefineConstants.LAYER_PLOTLABELS);
					break;

				case HISTOGRAMS: // Cannot happen
					break;

				case IMAGE:
					/* Plot image using projection of 3D plot coordinates to 2D viewing coordinates. */
					this_plot.image_properties.type = t_imagecolor.IC_PALETTE;
					GlobalMembersGraphics.plot_image_or_update_axes(this_plot, false);
					break;

				case RGBIMAGE:
					/* Plot image using projection of 3D plot coordinates to 2D viewing coordinates. */
					this_plot.image_properties.type = t_imagecolor.IC_RGB;
					GlobalMembersGraphics.plot_image_or_update_axes(this_plot, false);
					break;

				case RGBA_IMAGE:
					this_plot.image_properties.type = t_imagecolor.IC_RGBA;
					GlobalMembersGraphics.plot_image_or_update_axes(this_plot, false);
					break;

				} // switch(plot-style)

				/* move key on a line */
				if (lkey)
					do {if (++key_count >= key_rows) {yl = yl_ref; xl += key_col_wth; key_count = 0;} else yl -= key_entry_height;} while (0)();

				if ((draw_contour.getValue() != 0) && (this_plot.contours != null))
				{
					gnuplot_contours cntrs = this_plot.contours;
					//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
					//ORIGINAL LINE: struct lp_style_type thiscontour_lp_properties = this_plot->lp_properties;
					lp_style_type thiscontour_lp_properties = new lp_style_type(this_plot.lp_properties);

					thiscontour_lp_properties.l_type += (hidden3d ? 1 : 0);

					GlobalMembersTerm.term_apply_lp_properties((thiscontour_lp_properties));

					if (key.visible && this_plot.title != null && this_plot.title.charAt(0) && !this_plot.title_is_suppressed && !draw_surface && !label_contours)
					{
						/* unlabelled contours but no surface : put key entry in now */
						/* EAM - force key text to black, then restore */
						//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
						//			(*t.linetype)(DefineConstants.LT_BLACK);
						GlobalMembersGraph3d.key_text(xl, yl, this_plot.title);
						GlobalMembersTerm.term_apply_lp_properties((thiscontour_lp_properties));

						switch (this_plot.plot_style)
						{
						case IMPULSES:
						case LINES:
						case BOXES: // HBB: I think these should be here...
						case FILLEDCURVES:
						case VECTOR:
						case STEPS:
						case FSTEPS:
						case HISTEPS:
							GlobalMembersGraph3d.key_sample_line(xl, yl);
							break;
						case YERRORLINES: // ignored; treat like points
						case XERRORLINES: // ignored; treat like points
						case XYERRORLINES: // ignored; treat like points
						case YERRORBARS: // ignored; treat like points
						case XERRORBARS: // ignored; treat like points
						case XYERRORBARS: // ignored; treat like points
						case BOXERROR: // HBB: ignore these as well
						case BOXXYERROR:
						case CANDLESTICKS: // HBB: dito
						case FINANCEBARS:
						case CIRCLES:
						case POINTSTYLE:
							if (this_plot.lp_properties.use_palette)
								GlobalMembersGraph3d.key_sample_point_pm3d(this_plot, xl, yl, this_plot.lp_properties.p_type);
							else
								GlobalMembersGraph3d.key_sample_point(xl, yl, this_plot.lp_properties.p_type);
							break;
						case LINESPOINTS:
							if (this_plot.lp_properties.use_palette)
								GlobalMembersGraph3d.key_sample_line_pm3d(this_plot, xl, yl);
							else
								GlobalMembersGraph3d.key_sample_line(xl, yl);
							break;
						case DOTS:
							if (this_plot.lp_properties.use_palette)
								GlobalMembersGraph3d.key_sample_point_pm3d(this_plot, xl, yl, this_plot.lp_properties.p_type);
							else
								GlobalMembersGraph3d.key_sample_point(xl, yl, -1);
							break;

						default:
							break;
						}
						do {if (++key_count >= key_rows) {yl = yl_ref; xl += key_col_wth; key_count = 0;} else yl -= key_entry_height;} while (false);
					}
					while (cntrs != null)
					{
						if (label_contours && cntrs.isNewLevel != 0)
						{
							if (key.visible)
							{
								//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
								//				(*t.linetype)(DefineConstants.LT_BLACK);
								GlobalMembersGraph3d.key_text(xl, yl, cntrs.label);
							}
							if (use_palette && thiscontour_lp_properties.pm3d_color.type == DefineConstants.TC_Z)
								GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(GlobalMembersPm3d.z2cb(cntrs.z)));
							else
							{
								if (GlobalMembersGadgets.prefer_line_styles && label_contours)
								{
									//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
									//ORIGINAL LINE: struct lp_style_type ls = thiscontour_lp_properties;
									lp_style_type ls = new lp_style_type(thiscontour_lp_properties);
									GlobalMembersTerm.lp_use_properties(ls, ++thiscontour_lp_properties.l_type + 1);
									GlobalMembersTerm.term_apply_lp_properties(ls);
								}
								else
								{
									//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
									//				(*t.linetype)(++thiscontour_lp_properties.l_type);
									thiscontour_lp_properties.use_palette = false;
								}
							}

							if (key.visible)
							{

								switch (this_plot.plot_style)
								{
								case IMPULSES:
								case LINES:
								case LINESPOINTS:
								case BOXES: // HBB: these should be treated as well...
								case FILLEDCURVES:
								case VECTOR:
								case STEPS:
								case FSTEPS:
								case HISTEPS:
								case PM3DSURFACE:
									GlobalMembersGraph3d.key_sample_line(xl, yl);
									break;
								case YERRORLINES: // ignored; treat like points
								case XERRORLINES: // ignored; treat like points
								case XYERRORLINES: // ignored; treat like points
								case YERRORBARS: // ignored; treat like points
								case XERRORBARS: // ignored; treat like points
								case XYERRORBARS: // ignored; treat like points
								case BOXERROR: // HBB: treat these likewise
								case BOXXYERROR:
								case CANDLESTICKS: // HBB: ditto
								case FINANCEBARS:
								case CIRCLES:
								case POINTSTYLE:
									if (this_plot.lp_properties.use_palette)
										GlobalMembersGraph3d.key_sample_point_pm3d(this_plot, xl, yl, this_plot.lp_properties.p_type);
									else
										GlobalMembersGraph3d.key_sample_point(xl, yl, this_plot.lp_properties.p_type);
									break;
								case DOTS:
									if (this_plot.lp_properties.use_palette)
										GlobalMembersGraph3d.key_sample_point_pm3d(this_plot, xl, yl, this_plot.lp_properties.p_type);
									else
										GlobalMembersGraph3d.key_sample_point(xl, yl, -1);
									break;

								default:
									break;
								} // switch

								do {if (++key_count >= key_rows) {yl = yl_ref; xl += key_col_wth; key_count = 0;} else yl -= key_entry_height;} while (false);

							} // key
						} // label_contours

						/* now draw the contour */
						switch (this_plot.plot_style)
						{
						/* treat boxes like impulses: */
						case BOXES:
						case FILLEDCURVES:
						case VECTOR:
						case IMPULSES:
							GlobalMembersGraph3d.cntr3d_impulses(cntrs, thiscontour_lp_properties);
							break;

						case STEPS:
						case FSTEPS:
						case HISTEPS:
							/* treat all the above like 'lines' */
						case LINES:
						case PM3DSURFACE:
							GlobalMembersGraph3d.cntr3d_lines(cntrs, thiscontour_lp_properties);
							break;

						case LINESPOINTS:
							GlobalMembersGraph3d.cntr3d_lines(cntrs, thiscontour_lp_properties);
							/* FALLTHROUGH to draw the points */
						case YERRORLINES:
						case XERRORLINES:
						case XYERRORLINES:
						case YERRORBARS:
						case XERRORBARS:
						case XYERRORBARS:
						case BOXERROR:
						case BOXXYERROR:
						case CANDLESTICKS:
						case FINANCEBARS:
						case CIRCLES:
							/* treat all the above like points */
						case DOTS:
						case POINTSTYLE:
							/* the following is needed, because
							 * 'draw3d_point_unconditional()' in 'util3d.c'
							 * calls 'term_apply_lp_properties()' again
							 */
						{
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: struct lp_style_type ls = thiscontour_lp_properties;
							lp_style_type ls = new lp_style_type(thiscontour_lp_properties);
							if (GlobalMembersGadgets.prefer_line_styles && label_contours)
								GlobalMembersTerm.lp_use_properties(ls, thiscontour_lp_properties.l_type + 1);
							GlobalMembersGraph3d.cntr3d_points(cntrs, ls);
						}
						break;

						default:
							break;
						} //switch

						cntrs = cntrs.next;
					} // loop over contours
				} // draw contours

				/* Sync point for end of this curve (used by svg, post, ...) */
				GlobalMembersTerm.term.layer(termlayer.TERM_LAYER_AFTER_PLOT);

			} // loop over surfaces

		if (pm3d_order_depth)
		{
			GlobalMembersPm3d.pm3d_depth_queue_flush(); // draw pending plots
		}

		///#ifndef LITE
		if (hidden3d && (hidden3d_layer == DefineConstants.LAYER_FRONT) && draw_surface && quick == 0)
			GlobalMembersHidden3d.plot3d_hidden(plots, pcount);
		///#endif // not LITE

		/* DRAW GRID AND BORDER */
		///#ifndef USE_GRID_LAYERS
		// /* Old behaviour: draw entire grid now, unless it was requested to
		//  * be in the back. */
		//    if (grid_layer != 0)
		//	draw_3d_graphbox(plots, pcount, ALLGRID, LAYER_FRONT);
		///#else
		/* HBB NEW 20040311: do front part now, after surfaces have been
		 * output. If "set grid front", or hidden3d is active, must output
		 * the whole shebang now, otherwise only the front part. */
		if (hidden3d || GlobalMembersAxis.grid_layer == 1)
			GlobalMembersGraph3d.draw_3d_graphbox(plots, pcount, WHICHGRID.ALLGRID, DefineConstants.LAYER_FRONT);
		else if (GlobalMembersAxis.grid_layer == -1)
			GlobalMembersGraph3d.draw_3d_graphbox(plots, pcount, WHICHGRID.FRONTGRID, DefineConstants.LAYER_FRONT);
		if (splot_map != 0 && (GlobalMembersGadgets.border_layer == 1))
			GlobalMembersGraph3d.draw_3d_graphbox(plots, pcount, WHICHGRID.BORDERONLY, DefineConstants.LAYER_FRONT);

		///#endif // USE_GRID_LAYERS

		/* Add 'front' color box */
		if (quick == 0 && can_pm3d && GlobalMembersPm3d.is_plot_with_colorbox() && GlobalMembersGadgets.color_box.layer == DefineConstants.LAYER_FRONT)
			GlobalMembersColor.draw_color_smooth_box(MODE_PLOT_TYPE.MODE_SPLOT.getValue());

		/* Add 'front' rectangles */
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: place_objects(first_object, 1, 3, &plot_bounds);
		GlobalMembersGraphics.place_objects(GlobalMembersGadgets.first_object, 1, 3, new BoundingBox(GlobalMembersGadgets.plot_bounds));

		/* PLACE LABELS */
		GlobalMembersGraph3d.place_labels3d(GlobalMembersGadgets.first_label, 1);

		/* PLACE ARROWS */
		GlobalMembersGraph3d.place_arrows3d(1);

		///#ifdef USE_MOUSE
		/* finally, store the 2d projection of the x and y axis, to enable zooming by mouse */
		{
			int x;
			int y;
			GlobalMembersUtil3d.map3d_xy(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min, base_z, axis3d_o_x, axis3d_o_y);
			GlobalMembersUtil3d.map3d_xy(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min, base_z, x, y);
			axis3d_x_dx = x - axis3d_o_x;
			axis3d_x_dy = y - axis3d_o_y;
			GlobalMembersUtil3d.map3d_xy(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max, base_z, x, y);
			axis3d_y_dx = x - axis3d_o_x;
			axis3d_y_dy = y - axis3d_o_y;
		}
		///#endif

		/* Release the palette if we have used one (PostScript only?) */
		if (GlobalMembersPm3d.is_plot_with_palette() && GlobalMembersTerm.term.previous_palette)
			GlobalMembersTerm.term.previous_palette();

		GlobalMembersTerm.term_end_plot();

		///#ifndef LITE
		if (hidden3d && draw_surface)
		{
			GlobalMembersHidden3d.term_hidden_line_removal();
		}
		///#endif // not LITE
	}

	/*
	 * map3d_position()  wrapper for map3d_position_double
	 */
	public static void map3d_position(position pos, int x, int y, String what)
	{
		double xx;
		double yy;

		GlobalMembersGraph3d.map3d_position_double(pos, xx, yy, what);
		x = (int) xx;
		y = (int) yy;
	}
	public static void map3d_position_double(position pos, double x, double y, String what)
	{
		double xpos = pos.x;
		double ypos = pos.y;
		double zpos = pos.z;

		if (GlobalMembersGraph3d.map3d_getposition(pos, what, xpos, ypos, zpos) == 0)
		{
			GlobalMembersUtil3d.map3d_xy_double(xpos, ypos, zpos, x, y);
		}
		else
		{
			/* Screen or character coordinates */
			x = xpos;
			y = ypos;
		}
	}
	public static void map3d_position_r(position pos, int x, int y, String what)
	{
		double xpos = pos.x;
		double ypos = pos.y;
		double zpos = pos.z;

		/* startpoint in graph coordinates */
		if (GlobalMembersGraph3d.map3d_getposition(pos, what, xpos, ypos, zpos) == 0)
		{
			int xoriginlocal;
			int yoriginlocal;
			double xx;
			double yy;
			GlobalMembersUtil3d.map3d_xy_double(xpos, ypos, zpos, xx, yy);
			x = (int) xx;
			y = (int) yy;
			if (pos.scalex == position_type.graph)
				xpos = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
			else
				xpos = 0;
			if (pos.scaley == position_type.graph)
				ypos = (splot_map) ? GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max : GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
				else
					ypos = (splot_map) ? GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max : 0;
					if (pos.scalez == position_type.graph)
						zpos = GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min;
					else
						zpos = 0;
					GlobalMembersUtil3d.map3d_xy(xpos, ypos, zpos, xoriginlocal, yoriginlocal);
					x -= xoriginlocal;
					y -= yoriginlocal;
		}
		else
		{
			/* endpoint `screen' or 'character' coordinates */
			x = xpos;
			y = ypos;
		}
		return;
	}




	///#define NO_CARET (-1)
	///#define DATAFILE (-2)
	///#if 0 // UNUSED
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define isstringvalue(c_token) (isstring(c_token) || type_udv(c_token)==STRING)
	///#if defined(VA_START) && defined(STDC_HEADERS)
	///#else
	///#endif
	///#define FIRST_AXES 0
	///#define SECOND_AXES 4
	///#define NO_AXIS 99
	///#define AXIS_ARRAY_SIZE 11
	///#define NO_TICS 0
	///#define TICS_ON_BORDER 1
	///#define TICS_ON_AXIS 2
	///#define TICS_MASK 3
	///#define TICS_MIRROR 4
	///#if 0 // HBB 20010806 --- move GRID flags into axis struct
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
	///#define RANGE_WRITEBACK 1
	///#define RANGE_REVERSE 2
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_AXIS_TICDEF {TIC_COMPUTED, NULL, {TC_DEFAULT, 0, 0}, {NULL, {0,0}, FALSE}, { character, character, character, 0., 0., 0. }, FALSE }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_AXIS_ZEROAXIS {0, -3, 0, 1.0, 1.0, 0}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_AXIS_STRUCT { AUTOSCALE_BOTH, AUTOSCALE_BOTH, 0, FALSE, -10.0, 10.0, -10.0, 10.0, -10.0, 10.0, 0.0, 0.0, 0, 0, 0, 0, FALSE, 0.0, 0.0, 0, 1, DEF_FORMAT, TIMEFMT, NO_TICS, DEFAULT_AXIS_TICDEF, 0, FALSE, FALSE, MINI_DEFAULT, 10, 1.0, 0.5, TRUE, EMPTY_LABELSTRUCT, DEFAULT_AXIS_ZEROAXIS }
	///#define DEF_FORMAT "% g"
	///#define TIMEFMT "%d/%m/%y,%H:%M"
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define X_AXIS axis_array[x_axis]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Y_AXIS axis_array[y_axis]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define Z_AXIS axis_array[z_axis]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CB_AXIS axis_array[COLOR_AXIS]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_MAP(axis, variable) (int) ((axis_array[axis].term_lower) + ((variable) - axis_array[axis].min) * axis_array[axis].term_scale + 0.5)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_MAPBACK(axis, pos) (((double)(pos)-axis_array[axis].term_lower)/axis_array[axis].term_scale + axis_array[axis].min)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_x(x) (int) ((axis_array[x_axis].term_lower) + ((x) - axis_array[x_axis].min) * axis_array[x_axis].term_scale + 0.5)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_y(y) (int) ((axis_array[y_axis].term_lower) + ((y) - axis_array[y_axis].min) * axis_array[y_axis].term_scale + 0.5)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_SETSCALE(axis, out_low, out_high) axis_array[axis].term_scale = ((out_high) - (out_low)) / (axis_array[axis].max - axis_array[axis].min)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_WRITEBACK(axis) do { axis *this = axis_array + axis; if (this->range_flags & RANGE_WRITEBACK) { if (this->autoscale & AUTOSCALE_MIN) this->set_min = this->min; if (this->autoscale & AUTOSCALE_MAX) this->set_max = this->max; } } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_DO_LOG(axis,value) (log(value) / axis_array[axis].log_base)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_UNDO_LOG(axis,value) exp((value) * axis_array[axis].log_base)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_LOG_VALUE(axis,value) (axis_array[axis].log ? (log(value) / axis_array[axis].log_base) : (value))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_DE_LOG_VALUE(axis,coordinate) (axis_array[axis].log ? exp((coordinate) * axis_array[axis].log_base): (coordinate))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_INIT3D(axis, islog_override, infinite) do { axis *this = axis_array + axis; this->autoscale = this->set_autoscale; if ((this->autoscale & AUTOSCALE_BOTH) == AUTOSCALE_NONE && this->set_max < this->set_min) { this->min = this->set_max; this->max = this->set_min; } else { this->min = (infinite && (this->set_autoscale & AUTOSCALE_MIN)) ? VERYLARGE : this->set_min; this->max = (infinite && (this->set_autoscale & AUTOSCALE_MAX)) ? -VERYLARGE : this->set_max; } if (islog_override) { this->log = 0; this->base = 1; this->log_base = 0; } else { this->log_base = this->log ? log(this->base) : 0; } this->data_min = VERYLARGE; this->data_max = -VERYLARGE; } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_INIT2D(axis, infinite) do { axis *this = axis_array + axis; this->autoscale = this->set_autoscale; this->min = (infinite && (this->set_autoscale & AUTOSCALE_MIN)) ? VERYLARGE : this->set_min; this->max = (infinite && (this->set_autoscale & AUTOSCALE_MAX)) ? -VERYLARGE : this->set_max; this->log_base = this->log ? log(this->base) : 0; this->data_min = VERYLARGE; this->data_max = -VERYLARGE; } while(0)
	///#ifdef VOLATILE_REFRESH
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_INIT2D_REFRESH(axis, infinite) do { axis *this = axis_array + axis; this->autoscale = this->set_autoscale; this->min = (infinite && (this->set_autoscale & AUTOSCALE_MIN)) ? VERYLARGE*1e-3 : (axis_array[axis].log ? (log(this->set_min) / axis_array[axis].log_base) : (this->set_min)); this->max = (infinite && (this->set_autoscale & AUTOSCALE_MAX)) ? -VERYLARGE*1e-3 : (axis_array[axis].log ? (log(this->set_max) / axis_array[axis].log_base) : (this->set_max)); this->log_base = this->log ? log(this->base) : 0; } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_UPDATE2D_REFRESH(axis) do { axis *this_axis = axis_array + axis; if ((this_axis->set_autoscale & AUTOSCALE_MIN) == 0) this_axis->min = (axis_array[axis].log ? (log(this_axis->set_min) / axis_array[axis].log_base) : (this_axis->set_min)); if ((this_axis->set_autoscale & AUTOSCALE_MAX) == 0) this_axis->max = (axis_array[axis].log ? (log(this_axis->set_max) / axis_array[axis].log_base) : (this_axis->set_max)); } while (0)
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CHECK_REVERSE(axis) do { axis *this = axis_array + axis; if (((this->autoscale & AUTOSCALE_BOTH) == AUTOSCALE_NONE) && (this->max < this->min)) { double temp = this->min; this->min = this->max; this->max = temp; this->range_is_reverted = 1; } else this->range_is_reverted = (this->range_flags & RANGE_REVERSE); } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_ACTUAL_MIN(axis) (axis_array[axis].range_flags & RANGE_REVERSE ? axis_array[axis].max : axis_array[axis].min)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_ACTUAL_MAX(axis) (axis_array[axis].range_flags & RANGE_REVERSE ? axis_array[axis].min : axis_array[axis].max)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SAVE_WRITEBACK_ALL_AXES do { AXIS_INDEX axis; for (axis = 0; axis < AXIS_ARRAY_SIZE; axis++) if(axis_array[axis].range_flags & RANGE_WRITEBACK) { set_writeback_min(axis); set_writeback_max(axis); } } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PARSE_RANGE(axis) do { if (equals(c_token, "[")) { c_token++; axis_array[axis].autoscale = load_range(axis, &axis_array[axis].min, &axis_array[axis].max, axis_array[axis].autoscale); if (!equals(c_token, "]")) int_error(c_token, "']' expected"); c_token++; } } while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PARSE_NAMED_RANGE(axis, dummy_token) do { if (equals(c_token, "[")) { c_token++; if (isletter(c_token)) { if (equals(c_token + 1, "=")) { dummy_token = c_token; c_token += 2; } } axis_array[axis].autoscale = load_range(axis, &axis_array[axis].min, &axis_array[axis].max, axis_array[axis].autoscale); if (!equals(c_token, "]")) int_error(c_token, "']' expected"); c_token++; } } while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GET_NUMBER_OR_TIME(store,axes,axis) do { if (((axes) >= 0) && (axis_array[(axes)+(axis)].is_timedata) && (isstring(c_token) || type_udv(c_token)==STRING)) { struct tm tm; char *ss = try_to_get_string(); if (gstrptime(ss,axis_array[axis].timefmt,&tm)) (store) = (double) gtimegm(&tm); free(ss); } else { (store) = real_expression(); } } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GET_NUM_OR_TIME(store,axis) do { (store) = 0; do { if (((FIRST_AXES) >= 0) && (axis_array[(FIRST_AXES)+(axis)].is_timedata) && (isstring(c_token) || type_udv(c_token)==STRING)) { struct tm tm; char *ss = try_to_get_string(); if (gstrptime(ss,axis_array[axis].timefmt,&tm)) (store) = (double) gtimegm(&tm); free(ss); } else { (store) = real_expression(); } } while(0); } while (0);
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define STORE_WITH_LOG_AND_UPDATE_RANGE(STORE, VALUE, TYPE, axis, NOAUTOSCALE, OUT_ACTION, UNDEF_ACTION) do { if (axis == NO_AXIS) break; if (! (VALUE > -VERYLARGE && VALUE < VERYLARGE)) { TYPE = UNDEFINED; UNDEF_ACTION; break; } if (axis_array[axis].log) { if (VALUE<0.0) { TYPE = UNDEFINED; UNDEF_ACTION; break; } else if (VALUE == 0.0) { STORE = -VERYLARGE; TYPE = OUTRANGE; OUT_ACTION; break; } else { STORE = (log(VALUE) / axis_array[axis].log_base); } } else STORE = VALUE; if (NOAUTOSCALE) break; if (TYPE != INRANGE) break; if ((int)axis < 0) break; if ( VALUE<axis_array[axis].data_min ) axis_array[axis].data_min = VALUE; if ( VALUE<axis_array[axis].min ) { if (axis_array[axis].autoscale & AUTOSCALE_MIN) axis_array[axis].min = VALUE; else { TYPE = OUTRANGE; OUT_ACTION; break; } } if ( VALUE>axis_array[axis].data_max ) axis_array[axis].data_max = VALUE; if ( VALUE>axis_array[axis].max ) { if (axis_array[axis].autoscale & AUTOSCALE_MAX) axis_array[axis].max = VALUE; else { TYPE = OUTRANGE; OUT_ACTION; } } } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define COLOR_STORE_WITH_LOG_AND_UPDATE_RANGE(STORE, VALUE, TYPE, axis, NOAUTOSCALE, OUT_ACTION, UNDEF_ACTION) { coord_type c_type_tmp = TYPE; do { if (axis == NO_AXIS) break; if (! (VALUE > -VERYLARGE && VALUE < VERYLARGE)) { c_type_tmp = UNDEFINED; UNDEF_ACTION; break; } if (axis_array[axis].log) { if (VALUE<0.0) { c_type_tmp = UNDEFINED; UNDEF_ACTION; break; } else if (VALUE == 0.0) { STORE = -VERYLARGE; c_type_tmp = OUTRANGE; OUT_ACTION; break; } else { STORE = (log(VALUE) / axis_array[axis].log_base); } } else STORE = VALUE; if (NOAUTOSCALE) break; if (c_type_tmp != INRANGE) break; if ((int)axis < 0) break; if ( VALUE<axis_array[axis].data_min ) axis_array[axis].data_min = VALUE; if ( VALUE<axis_array[axis].min ) { if (axis_array[axis].autoscale & AUTOSCALE_MIN) axis_array[axis].min = VALUE; else { c_type_tmp = OUTRANGE; OUT_ACTION; break; } } if ( VALUE>axis_array[axis].data_max ) axis_array[axis].data_max = VALUE; if ( VALUE>axis_array[axis].max ) { if (axis_array[axis].autoscale & AUTOSCALE_MAX) axis_array[axis].max = VALUE; else { c_type_tmp = OUTRANGE; OUT_ACTION; } } } while(0); }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define NOOP ((void)0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define INIT_AXIS_ARRAY(field, value) do { int tmp; for (tmp=0; tmp<AXIS_ARRAY_SIZE; tmp++) axis_array[tmp].field=(value); } while(0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define AXIS_ARRAY_INITIALIZER(value) { value, value, value, value, value, value, value, value, value, value, value }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SET_DEFFORMAT(axis, flag_array) if (flag_array[axis]) { (void) strcpy(axis_array[axis].formatstring,DEF_FORMAT); axis_array[axis].format_is_numeric = 1; }
	///#define SIGNIF (0.01)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CheckZero(x,tic) (fabs(x) < ((tic) * SIGNIF) ? 0.0 : (x))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define NEED_PALETTE(plot) (PM3DSURFACE == (plot)->plot_style || PM3D_IMPLICIT == pm3d.implicit || 1 == (plot)->lp_properties.use_palette)
	///#ifdef HIDDEN3D_VAR_PTSIZE // Needed for variable pointsize, but takes space
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FLAG_VERTEX_AS_UNDEFINED(v) do { (v).z = -2.0; } while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define VERTEX_IS_UNDEFINED(v) ((v).z == -2.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define V_EQUAL(a,b) ( GE(0.0, fabs((a)->x - (b)->x) + fabs((a)->y - (b)->y) + fabs((a)->z - (b)->z)) )
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define TERMCOORD(v,xvar,yvar) { xvar = ((int)((v)->x * xscaler)) + xmiddle; yvar = ((int)((v)->y * yscaler)) + ymiddle; }
	///#ifndef LITE
	///#endif
	///#if defined(sun386) || defined(AMIGA_SC_6_1)
	///#endif
	///#ifdef EAM_OBJECTS
	///#else
	///#define place_objects(listhead,layer,dimensions,clip_area) // void() 
	///#endif

	///#ifdef HAVE_CONFIG_H
	///#endif
	///#ifndef TERM_HELP
	///#define PM3D_AT_BASE 'b'
	///#define PM3D_AT_TOP 't'
	///#define PM3D_AT_SURFACE 's'
	///#define PM3D_FLUSH_BEGIN 'b'
	///#define PM3D_FLUSH_END 'r'
	///#define PM3D_FLUSH_CENTER 'c'
	///#define PM3D_SCANS_AUTOMATIC 'a'
	///#define PM3D_SCANS_FORWARD 'f'
	///#define PM3D_SCANS_BACKWARD 'b'
	///#define PM3D_DEPTH 'd'
	///#define PM3D_CLIP_1IN '1'
	///#define PM3D_CLIP_4IN '4'
	///#endif // TERM_HELP 

	///#ifdef USE_MOUSE
	///#ifdef _MOUSE_C
	///#endif // _MOUSE_C 
	///#if 0
	///#endif
	///#if defined(_MOUSE_C)
	///#else
	///#endif
	///#endif
	///#ifdef OS2
	///#endif
	///#ifdef LINUXVGA
	///#endif // LINUXVGA 
	///#ifdef OS2
	///#endif

	/* HBB NEW 20040311: PM3D did already split up grid drawing into two
	 * parts, one before, the other after drawing the main surfaces, as a
	 * poor-man's depth-sorting algorithm.  Make this independent of
	 * PM3D. Turn the new option on by default. */
	///#define USE_GRID_LAYERS 1


	public static int p_height;
	public static int p_width; // pointsize * t->h_tic
	public static int key_entry_height; // bigger of t->v_size, pointsize*t->v_tick

	/* is contouring wanted ? */
	public static en_contour_placement draw_contour = en_contour_placement.CONTOUR_NONE;
	/* different linestyles are used for contours when set */
	public static boolean label_contours = true;

	/* Want to draw surfaces? FALSE mainly useful in contouring mode */
	public static boolean draw_surface = true;

	/* Was hidden3d display selected by user? */
	public static boolean hidden3d = false;
	public static int hidden3d_layer = DefineConstants.LAYER_BACK;

	/* Rotation and scale of the 3d view, as controlled by 'set view': */
	public static float surface_rot_z = 30.0F;
	public static float surface_rot_x = 60.0F;
	public static float surface_scale = 1.0F;
	public static float surface_zscale = 1.0F;

	/* Set by 'set view map': */
	public static int splot_map = 0;

	/* position of the base plane, as given by 'set ticslevel' or 'set xyplane' */
	public static t_xyplane xyplane = new t_xyplane(0.5, false);

	/* 'set isosamples' settings */
	public static int iso_samples_1 = DefineConstants.ISO_SAMPLES;
	public static int iso_samples_2 = DefineConstants.ISO_SAMPLES;

	public static double xscale3d;
	public static double yscale3d;
	public static double zscale3d;
	public static double xcenter3d = 0.0;
	public static double ycenter3d = 0.0;
	public static double zcenter3d = 0.0;

	/* plot3d_impulses:
	 * Plot the surfaces in IMPULSES style
	 */

	public static void plot3d_impulses(surface_points plot)
	{
		int i; // point index
		int x; // point in terminal coordinates
		int y;
		int xx0;
		int yy0;
		iso_curve icrvs = plot.iso_crvs;
		int colortype = plot.lp_properties.pm3d_color.type;

		boolean rgb_from_column = can_pm3d && plot.pm3d_color_from_column && plot.lp_properties.pm3d_color.value < 0.0;

		if (colortype == DefineConstants.TC_RGB && !rgb_from_column)
			GlobalMembersColor.set_rgbcolor(plot.lp_properties.pm3d_color.lt);

		while (icrvs != null)
		{
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: struct coordinate  *points = icrvs->points;
			coordinate[] points = new coordinate(icrvs.points);

			for (i = 0; i < icrvs.p_count; i++)
			{

				GlobalMembersGraph3d.check_for_variable_color(plot, points[i]);

				switch (points[i].type)
				{
				case INRANGE:
				{
					GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, points[i].z, x, y);

					if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max)) ? (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max))) : (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min)))))
					{
						GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, 0.0, xx0, yy0);
					}
					else if ((((0.0)<(points[i].z)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) >= (0.0)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) <= (points[i].z))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) >= (points[i].z)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) <= (0.0)))))
					{
						GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min, xx0, yy0);
					}
					else
					{
						GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max, xx0, yy0);
					}

					GlobalMembersGadgets.clip_move(xx0, yy0);
					GlobalMembersGadgets.clip_vector(x, y);

					break;
				}
				case OUTRANGE:
				{
					if (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((points[i].x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((points[i].x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((points[i].x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((points[i].x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))) || !(((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((points[i].y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((points[i].y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((points[i].y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((points[i].y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
						break;

					if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max)) ? (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max))) : (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min)))))
					{
						/* zero point is INRANGE */
						GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, 0.0, xx0, yy0);

						/* must cross z = Z_AXIS.min or Z_AXIS.max limits */
						if ((((0.0)<(points[i].z)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) >= (0.0)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) <= (points[i].z))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) >= (points[i].z)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) <= (0.0)))) && GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min != 0.0 && GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min != points[i].z)
						{
							GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min, x, y);
						}
						else
						{
							GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max, x, y);
						}
					}
					else
					{
						/* zero point is also OUTRANGE */
						if ((((0.0)<(points[i].z)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) >= (0.0)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) <= (points[i].z))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) >= (points[i].z)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) <= (0.0)))) && (((0.0)<(points[i].z)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max) >= (0.0)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max) <= (points[i].z))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max) >= (points[i].z)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max) <= (0.0)))))
						{
							/* crosses z = Z_AXIS.min or Z_AXIS.max limits */
							GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max, x, y);
							GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min, xx0, yy0);
						}
						else
						{
							/* doesn't cross z = Z_AXIS.min or Z_AXIS.max limits */
							break;
						}
					}

					GlobalMembersGadgets.clip_move(xx0, yy0);
					GlobalMembersGadgets.clip_vector(x, y);

					break;
				}
				default: // just a safety
				case UNDEFINED:
				{
					break;
				}
				}
			}

			icrvs = icrvs.next;
		}
	}

	/* plot3d_lines:
	 * Plot the surfaces in LINES style
	 */
	/* We want to always draw the lines in the same direction, otherwise when
   we draw an adjacent box we might get the line drawn a little differently
   and we get splotches.  */

	public static void plot3d_lines(surface_points plot)
	{
		int i;
		int x; // point in terminal coordinates
		int y;
		int xx0;
		int yy0;
		double clip_x;
		double clip_y;
		double clip_z;
		iso_curve icrvs = plot.iso_crvs;
		coordinate[] points;
		double[] lx = new double[2]; // two edge points
		double[] ly = new double[2];
		double[] lz = new double[2];
		boolean rgb_from_column;

		///#ifndef LITE
		/* These are handled elsewhere.  */
		if (plot.has_grid_topology != 0 && hidden3d)
			return;
		///#endif // not LITE

		rgb_from_column = can_pm3d && plot.pm3d_color_from_column && plot.lp_properties.pm3d_color.type == DefineConstants.TC_RGB && plot.lp_properties.pm3d_color.value < 0.0;

		while (icrvs != null)
		{
			coord_type prev = coord_type.UNDEFINED; // type of previous plot

			for (i = 0, points = icrvs.points; i < icrvs.p_count; i++)
			{

				if (rgb_from_column)
					GlobalMembersColor.set_rgbcolor((int)points[i].ylow);
				else if (can_pm3d && plot.lp_properties.pm3d_color.type == DefineConstants.TC_LINESTYLE)
				{
					plot.lp_properties.pm3d_color.lt = (int)(points[i].ylow);
					GlobalMembersGadgets.apply_pm3dcolor((plot.lp_properties.pm3d_color), GlobalMembersTerm.term);
				}

				switch (points[i].type)
				{
				case INRANGE:
				{
					GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, points[i].z, x, y);

					if (prev == coord_type.INRANGE)
					{
						GlobalMembersGadgets.clip_vector(x, y);
					}
					else
					{
						if (prev == coord_type.OUTRANGE)
						{
							/* from outrange to inrange */
							if (!GlobalMembersGadgets.clip_lines1)
							{
								GlobalMembersGadgets.clip_move(x, y);
							}
							else
							{
								/*
								 * Calculate intersection point and draw
								 * vector from there
								 */
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
								//ORIGINAL LINE: edge3d_intersect(points, i, &clip_x, &clip_y, &clip_z);
								GlobalMembersUtil3d.edge3d_intersect(new coordinate(points), i, clip_x, clip_y, clip_z);

								GlobalMembersUtil3d.map3d_xy(clip_x, clip_y, clip_z, xx0, yy0);

								GlobalMembersGadgets.clip_move(xx0, yy0);
								GlobalMembersGadgets.clip_vector(x, y);
							}
						}
						else
						{
							GlobalMembersGadgets.clip_move(x, y);
						}
					}

					break;
				}
				case OUTRANGE:
				{
					if (prev == coord_type.INRANGE)
					{
						/* from inrange to outrange */
						if (GlobalMembersGadgets.clip_lines1)
						{
							/*
							 * Calculate intersection point and draw
							 * vector to it
							 */

							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: edge3d_intersect(points, i, &clip_x, &clip_y, &clip_z);
							GlobalMembersUtil3d.edge3d_intersect(new coordinate(points), i, clip_x, clip_y, clip_z);

							GlobalMembersUtil3d.map3d_xy(clip_x, clip_y, clip_z, xx0, yy0);

							GlobalMembersGadgets.clip_vector(xx0, yy0);
						}
					}
					else if (prev == coord_type.OUTRANGE)
					{
						/* from outrange to outrange */
						if (GlobalMembersGadgets.clip_lines2)
						{
							/*
							 * Calculate the two 3D intersection points
							 * if present
							 */
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: if (two_edge3d_intersect(points, i, lx, ly, lz))
							if (GlobalMembersUtil3d.two_edge3d_intersect(new coordinate(points), i, lx, ly, lz))
							{

								GlobalMembersUtil3d.map3d_xy(lx[0], ly[0], lz[0], x, y);

								GlobalMembersUtil3d.map3d_xy(lx[1], ly[1], lz[1], xx0, yy0);

								GlobalMembersGadgets.clip_move(x, y);
								GlobalMembersGadgets.clip_vector(xx0, yy0);
							}
						}
					}
					break;
				}
				case UNDEFINED:
				{
					break;
				}
				default:
					GlobalMembersUtil.graph_error("Unknown point type in plot3d_lines");
				}

				prev = points[i].type;
			}

			icrvs = icrvs.next;
		}
	}

	/* plot3d_points:
	 * Plot the surfaces in POINTSTYLE style
	 */
	public static void plot3d_points(surface_points plot, int p_type)
	{
		int i;
		int x;
		int y;
		TERMENTRY t = GlobalMembersTerm.term;
		iso_curve icrvs = plot.iso_crvs;

		while (icrvs != null)
		{
			coordinate point;
			int colortype = plot.lp_properties.pm3d_color.type;
			boolean rgb_from_column = plot.pm3d_color_from_column && plot.lp_properties.pm3d_color.value < 0.0;

			/* Apply constant color outside of the loop */
			if (colortype == DefineConstants.TC_RGB && !rgb_from_column)
				GlobalMembersColor.set_rgbcolor(plot.lp_properties.pm3d_color.lt);

			for (i = 0; i < icrvs.p_count; i++)
			{
				point = (icrvs.points[i]);
				if (point.type == coord_type.INRANGE)
				{
					GlobalMembersUtil3d.map3d_xy(point.x, point.y, point.z, x, y);

					if (GlobalMembersGadgets.clip_point(x, y) == 0)
					{
						GlobalMembersGraph3d.check_for_variable_color(plot, point);

						if ((plot.plot_style == PLOT_STYLE.POINTSTYLE || plot.plot_style == PLOT_STYLE.LINESPOINTS) && plot.lp_properties.p_size == DefineConstants.PTSZ_VARIABLE)
							//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
							//			(*t.pointsize)(GlobalMembersGadgets.pointsize * point.xlow);
							//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
							//			(*t.point)(x, y, p_type);
					}
				}
			}

			icrvs = icrvs.next;
		}
	}

	/* plot_vectors:
	 * Plot the curves in VECTORS style
	 */
	public static void plot3d_vectors(surface_points plot)
	{
		int i;
		double x1;
		double y1;
		double x2;
		double y2;
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: struct coordinate  *heads = plot->iso_crvs->points;
		coordinate[] heads = new coordinate(plot.iso_crvs.points);
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: struct coordinate  *tails = plot->iso_crvs->next->points;
		coordinate[] tails = new coordinate(plot.iso_crvs.next.points);

		/* Only necessary once because all arrows equal */
		GlobalMembersTerm.term_apply_lp_properties((plot.arrow_properties.lp_properties));
		GlobalMembersGraphics.apply_head_properties((plot.arrow_properties));

		for (i = 0; i < plot.iso_crvs.p_count; i++)
		{

			if (heads[i].type == coord_type.UNDEFINED || tails[i].type == coord_type.UNDEFINED)
				continue;

			GlobalMembersGraph3d.check_for_variable_color(plot, heads[i]);

			if (heads[i].type == coord_type.INRANGE && tails[i].type == coord_type.INRANGE)
			{
				GlobalMembersUtil3d.map3d_xy_double(heads[i].x, heads[i].y, heads[i].z, x1, y1);
				GlobalMembersUtil3d.map3d_xy_double(tails[i].x, tails[i].y, tails[i].z, x2, y2);
				GlobalMembersGadgets.draw_clip_arrow((int)x1, (int)y1, (int)x2, (int)y2, plot.arrow_properties.head);
			}
		}
	}

	/* this is basically the same function as above, but:
	 *  - it splits the bunch of scans in two sets corresponding to
	 *    the two scan directions.
	 *  - reorders the two sets -- from behind to front
	 *  - checks if inside on scan of a set the order should be inverted
	 */
	/* no pm3d for impulses */
	public static void plot3d_lines_pm3d(surface_points plot)
	{
		iso_curve[] * * icrvs_pair = new iso_curve[2];
		int[] invert = new int[2];
		int[] n = new int[2];

		int i;
		int set;
		int scan;
		int x; // point in terminal coordinates
		int y;
		int xx0;
		int yy0;
		double clip_x;
		double clip_y;
		double clip_z;
		coordinate points;
		coord_type prev = coord_type.UNDEFINED;
		double[] lx = new double[2]; // two edge points
		double[] ly = new double[2];
		double[] lz = new double[2];
		double z;

		/* just a shortcut */
		boolean color_from_column = plot.pm3d_color_from_column;

		/* If plot really uses RGB rather than pm3d colors, let plot3d_lines take over */
		if (plot.lp_properties.pm3d_color.type == DefineConstants.TC_RGB)
		{
			GlobalMembersGadgets.apply_pm3dcolor((plot.lp_properties.pm3d_color), GlobalMembersTerm.term);
			GlobalMembersGraph3d.plot3d_lines(plot);
			return;
		}
		else if (plot.lp_properties.pm3d_color.type == DefineConstants.TC_LINESTYLE)
		{
			GlobalMembersGraph3d.plot3d_lines(plot);
			return;
		}

		///#ifndef LITE
		/* These are handled elsewhere.  */
		if (plot.has_grid_topology != 0 && hidden3d)
			return;
		///#endif // not LITE

		/* split the bunch of scans in two sets in
		 * which the scans are already depth ordered */
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: pm3d_rearrange_scan_array(plot, icrvs_pair, n, invert, icrvs_pair + 1, n + 1, invert + 1);
		GlobalMembersPm3d.pm3d_rearrange_scan_array(plot, new iso_curve(icrvs_pair), n, invert, icrvs_pair + 1, n + 1, invert + 1);

		for (set = 0; set < 2; set++)
		{

			int begin = 0;
			int step;

			if (invert[set] != 0)
			{
				/* begin is set below to the length of the scan - 1 */
				step = -1;
			}
			else
			{
				step = 1;
			}

			for (scan = 0; scan < n[set] && icrvs_pair[set] != null; scan++)
			{

				int cnt;
				iso_curve[] icrvs = icrvs_pair[set][scan];

				if (invert[set] != 0)
				{
					begin = icrvs.p_count - 1;
				}

				prev = coord_type.UNDEFINED; // type of previous plot

				for (cnt = 0, i = begin, points = icrvs.points; cnt < icrvs.p_count; cnt++, i += step)
				{
					switch (points[i].type)
					{
					case INRANGE:
						GlobalMembersUtil3d.map3d_xy(points[i].x, points[i].y, points[i].z, x, y);

						if (prev == coord_type.INRANGE)
						{
							if (color_from_column)
								z = (points[i - step].ylow + points[i].ylow) * 0.5;
							else
								z = (GlobalMembersPm3d.z2cb(points[i - step].z) + GlobalMembersPm3d.z2cb(points[i].z)) * 0.5;
							GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(z));
							GlobalMembersGadgets.clip_vector(x, y);
						}
						else
						{
							if (prev == coord_type.OUTRANGE)
							{
								/* from outrange to inrange */
								if (!GlobalMembersGadgets.clip_lines1)
								{
									GlobalMembersGadgets.clip_move(x, y);
								}
								else
								{
									/*
									 * Calculate intersection point and draw
									 * vector from there
									 */
									GlobalMembersUtil3d.edge3d_intersect(points, i, clip_x, clip_y, clip_z);

									GlobalMembersUtil3d.map3d_xy(clip_x, clip_y, clip_z, xx0, yy0);

									GlobalMembersGadgets.clip_move(xx0, yy0);
									if (color_from_column)
										z = (points[i - step].ylow + points[i].ylow) * 0.5;
									else
										z = (GlobalMembersPm3d.z2cb(points[i - step].z) + GlobalMembersPm3d.z2cb(points[i].z)) * 0.5;
									GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(z));
									GlobalMembersGadgets.clip_vector(x, y);
								}
							}
							else
							{
								GlobalMembersGadgets.clip_move(x, y);
							}
						}

						break;
					case OUTRANGE:
						if (prev == coord_type.INRANGE)
						{
							/* from inrange to outrange */
							if (GlobalMembersGadgets.clip_lines1)
							{
								/*
								 * Calculate intersection point and draw
								 * vector to it
								 */

								GlobalMembersUtil3d.edge3d_intersect(points, i, clip_x, clip_y, clip_z);

								GlobalMembersUtil3d.map3d_xy(clip_x, clip_y, clip_z, xx0, yy0);

								if (color_from_column)
									z = (points[i - step].ylow + points[i].ylow) * 0.5;
								else
									z = (GlobalMembersPm3d.z2cb(points[i - step].z) + GlobalMembersPm3d.z2cb(points[i].z)) * 0.5;
								GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(z));
								GlobalMembersGadgets.clip_vector(xx0, yy0);
							}
						}
						else if (prev == coord_type.OUTRANGE)
						{
							/* from outrange to outrange */
							if (GlobalMembersGadgets.clip_lines2)
							{
								/*
								 * Calculate the two 3D intersection points
								 * if present
								 */
								if (GlobalMembersUtil3d.two_edge3d_intersect(points, i, lx, ly, lz))
								{

									GlobalMembersUtil3d.map3d_xy(lx[0], ly[0], lz[0], x, y);

									GlobalMembersUtil3d.map3d_xy(lx[1], ly[1], lz[1], xx0, yy0);

									GlobalMembersGadgets.clip_move(x, y);
									if (color_from_column)
										z = (points[i - step].ylow + points[i].ylow) * 0.5;
									else
										z = (GlobalMembersPm3d.z2cb(points[i - step].z) + GlobalMembersPm3d.z2cb(points[i].z)) * 0.5;
									GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(z));
									GlobalMembersGadgets.clip_vector(xx0, yy0);
								}
							}
						}
						break;
					case UNDEFINED:
						break;
					default:
						GlobalMembersUtil.graph_error("Unknown point type in plot3d_lines");
					}

					prev = points[i].type;

				} // one scan

			} // while (icrvs)

		} // for (scan = 0; scan < 2; scan++)

		if (icrvs_pair[0] != null)
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(icrvs_pair[0]);
		if (icrvs_pair[1] != null)
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(icrvs_pair[1]);
	}

	/*
	 * returns minimal and maximal values of the cb-range (or z-range if taking the
	 * color from the z value) of the given surface
	 */
	public static void get_surface_cbminmax(surface_points plot, double cbmin, double cbmax)
	{
		int i;
		int curve = 0;
		boolean color_from_column = plot.pm3d_color_from_column; // just a shortcut
		double cb;
		iso_curve icrvs = plot.iso_crvs;
		coordinate[] points;

		cbmin = DefineConstants.VERYLARGE;
		cbmax = -DefineConstants.VERYLARGE;

		while (icrvs != null && curve < plot.num_iso_read)
		{
			/* fprintf(stderr,"**** NEW ISOCURVE - nb of pts: %i ****\n", icrvs->p_count); */
			for (i = 0, points = icrvs.points; i < icrvs.p_count; i++)
			{
				/* fprintf(stderr,"  point i=%i => x=%4g y=%4g z=%4lg cb=%4lg\n",i, points[i].x,points[i].y,points[i].z,points[i].CRD_COLOR); */
				if (points[i].type == coord_type.INRANGE)
				{
					/* ?? if (!clip_point(x, y)) ... */
					cb = color_from_column ? points[i].ylow : points[i].z;
					if (cb < cbmin)
						cbmin = cb;
					if (cb > cbmax)
						cbmax = cb;
				}
			} // points on one scan
			icrvs = icrvs.next;
			curve++;
		} // surface
	}

	/* cntr3d_impulses:
	 * Plot a surface contour in IMPULSES style
	 */
	public static void cntr3d_impulses(gnuplot_contours cntr, lp_style_type lp)
	{
		int i; // point index
		vertex vertex_on_surface = new vertex();
		vertex vertex_on_base = new vertex();

		if ((draw_contour.getValue() & ((en_contour_placement.CONTOUR_SRF.getValue() != 0) ? 1 : 0)) != 0)
		{
			for (i = 0; i < cntr.num_pts; i++)
			{
				GlobalMembersUtil3d.map3d_xyz(cntr.coords[i].x, cntr.coords[i].y, cntr.coords[i].z, vertex_on_surface);
				GlobalMembersUtil3d.map3d_xyz(cntr.coords[i].x, cntr.coords[i].y, base_z, vertex_on_base);
				/* HBB 20010822: Provide correct color-coding for
				 * "linetype palette" PM3D mode */
				vertex_on_base.real_z = cntr.coords[i].z;
				GlobalMembersUtil3d.draw3d_line(vertex_on_surface, vertex_on_base, lp);
			}
		}
		else
		{
			/* Must be on base grid, so do points. */
			GlobalMembersGraph3d.cntr3d_points(cntr, lp);
		}
	}

	/* cntr3d_lines: Plot a surface contour in LINES style */
	/* HBB NEW 20031218: changed to use move/vector() style polyline
	 * drawing. Gets rid of variable "previous_vertex" */
	public static void cntr3d_lines(gnuplot_contours cntr, lp_style_type lp)
	{
		int i; // point index
		vertex this_vertex = new vertex();

		/* In the case of "set view map" (only) clip the contour lines to the graph */
		BoundingBox clip_save = GlobalMembersGadgets.clip_area;
		if (splot_map != 0)
			GlobalMembersGadgets.clip_area = GlobalMembersGadgets.plot_bounds;
		
		if ((draw_contour.getValue() & ((en_contour_placement.CONTOUR_SRF.getValue() != 0) ? 1 : 0)) != 0)
		{
			GlobalMembersUtil3d.map3d_xyz(cntr.coords[0].x, cntr.coords[0].y, cntr.coords[0].z, this_vertex);
			/* move slightly frontward, to make sure the contours are
			 * visible in front of the the triangles they're in, if this
			 * is a hidden3d plot */
			if (hidden3d && !((this_vertex).z == -2.0))
				this_vertex.z += 1e-2;

			GlobalMembersUtil3d.polyline3d_start(this_vertex);

			for (i = 1; i < cntr.num_pts; i++)
			{
				GlobalMembersUtil3d.map3d_xyz(cntr.coords[i].x, cntr.coords[i].y, cntr.coords[i].z, this_vertex);
				/* move slightly frontward, to make sure the contours are
				 * visible in front of the the triangles they're in, if this
				 * is a hidden3d plot */
				if (hidden3d && !((this_vertex).z == -2.0))
					this_vertex.z += 1e-2;
				GlobalMembersUtil3d.polyline3d_next(this_vertex, lp);
			}
		}

		if (draw_contour & en_contour_placement.CONTOUR_BASE != 0)
		{
			GlobalMembersUtil3d.map3d_xyz(cntr.coords[0].x, cntr.coords[0].y, base_z, this_vertex);
			this_vertex.real_z = cntr.coords[0].z;
			GlobalMembersUtil3d.polyline3d_start(this_vertex);

			for (i = 1; i < cntr.num_pts; i++)
			{
				GlobalMembersUtil3d.map3d_xyz(cntr.coords[i].x, cntr.coords[i].y, base_z, this_vertex);
				this_vertex.real_z = cntr.coords[i].z;
				GlobalMembersUtil3d.polyline3d_next(this_vertex, lp);
			}
		}

		if (splot_map != 0)
			GlobalMembersGadgets.clip_area = clip_save;
	}

	/* cntr3d_points:
	 * Plot a surface contour in POINTSTYLE style
	 */
	/* HBB UNUSED 20031219 */
	/* static void cntr3d_linespoints __PROTO((struct gnuplot_contours * cntr, */
	/* 					struct lp_style_type * lp)); */
	public static void cntr3d_points(gnuplot_contours cntr, lp_style_type lp)
	{
		int i;
		vertex v = new vertex();

		if ((draw_contour.getValue() & ((en_contour_placement.CONTOUR_SRF.getValue() != 0) ? 1 : 0)) != 0)
		{
			for (i = 0; i < cntr.num_pts; i++)
			{
				GlobalMembersUtil3d.map3d_xyz(cntr.coords[i].x, cntr.coords[i].y, cntr.coords[i].z, v);
				/* move slightly frontward, to make sure the contours and
				 * points are visible in front of the triangles they're
				 * in, if this is a hidden3d plot */
				if (hidden3d && !((v).z == -2.0))
					v.z += 1e-2;
				GlobalMembersUtil3d.draw3d_point(v, lp);
			}
		}
		if (draw_contour & en_contour_placement.CONTOUR_BASE != 0)
		{
			for (i = 0; i < cntr.num_pts; i++)
			{
				GlobalMembersUtil3d.map3d_xyz(cntr.coords[i].x, cntr.coords[i].y, base_z, v);
				/* HBB 20010822: see above */
				v.real_z = cntr.coords[i].z;
				GlobalMembersUtil3d.draw3d_point(v, lp);
			}
		}
	}

	/* if point is at corner, update height[][] and depth[][]
	 * we are still assuming that extremes of surfaces are at corners,
	 * but we are not assuming order of corners
	 */
	public static void check_corner_height(coordinate p, double[][] height, double[][] depth)
	{
		if (p.type != coord_type.INRANGE)
			return;
		/* FIXME HBB 20010121: don't compare 'zero' to data values in
		 * absolute terms. */
		if ((Math.abs(p.x - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < GlobalMembersGadgets.zero || Math.abs(p.x - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) < GlobalMembersGadgets.zero) && (Math.abs(p.y - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < GlobalMembersGadgets.zero || Math.abs(p.y - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) < GlobalMembersGadgets.zero))
		{
			int x = ((int)(((p.x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) / (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) + 0.1));
			int y = ((int)(((p.y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) / (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) + 0.1));
			if (height[x][y] < p.z)
				height[x][y] = p.z;
			if (depth[x][y] > p.z)
				depth[x][y] = p.z;
		}
	}

	/* work out where the axes and tics are drawn */
	public static void setup_3d_box_corners()
	{
		int quadrant = (int) (surface_rot_z / 90);
		if (((quadrant + 1) & 2) != 0)
		{
			zaxis_x = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
			right_x = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
			back_y = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
			front_y = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
		}
		else
		{
			zaxis_x = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
			right_x = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
			back_y = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
			front_y = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
		}

		if ((quadrant & 2) != 0)
		{
			zaxis_y = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
			right_y = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
			back_x = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
			front_x = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
		}
		else
		{
			zaxis_y = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
			right_y = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
			back_x = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
			front_x = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
		}

		if (surface_rot_x > 90)
		{
			/* labels on the back axes */
			yaxis_x = back_x;
			xaxis_y = back_y;
		}
		else
		{
			yaxis_x = front_x;
			xaxis_y = front_y;
		}
	}

	/* Draw all elements of the 3d graph box, including borders, zeroaxes,
	 * tics, gridlines, ticmarks, axis labels and the base plane. */
	public static void draw_3d_graphbox(surface_points plot, int plot_num, WHICHGRID whichgrid, int current_layer)
	{
		int x; // point in terminal coordinates
		int y;
		TERMENTRY t = GlobalMembersTerm.term;
		BoundingBox clip_save;

		if (GlobalMembersGadgets.draw_border != 0 && splot_map != 0)
		{
			if (GlobalMembersGadgets.border_layer == current_layer)
			{
				GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp);
				if ((GlobalMembersGadgets.draw_border & 15) == 15)
					GlobalMembersTerm.newpath();
				GlobalMembersUtil3d.map3d_xy(zaxis_x, zaxis_y, base_z, x, y);
				GlobalMembersTerm.term.move(x, y);
				GlobalMembersUtil3d.map3d_xy(back_x, back_y, base_z, x, y);
				if (GlobalMembersGadgets.draw_border & 2 != 0)
					GlobalMembersTerm.term.vector(x, y);
				else
					GlobalMembersTerm.term.move(x, y);
				GlobalMembersUtil3d.map3d_xy(right_x, right_y, base_z, x, y);
				if (GlobalMembersGadgets.draw_border & 8 != 0)
					GlobalMembersTerm.term.vector(x, y);
				else
					GlobalMembersTerm.term.move(x, y);
				GlobalMembersUtil3d.map3d_xy(front_x, front_y, base_z, x, y);
				if (GlobalMembersGadgets.draw_border & 4 != 0)
					GlobalMembersTerm.term.vector(x, y);
				else
					GlobalMembersTerm.term.move(x, y);
				GlobalMembersUtil3d.map3d_xy(zaxis_x, zaxis_y, base_z, x, y);
				if (GlobalMembersGadgets.draw_border & 1 != 0)
					GlobalMembersTerm.term.vector(x, y);
				else
					GlobalMembersTerm.term.move(x, y);
				if ((GlobalMembersGadgets.draw_border & 15) == 15)
					GlobalMembersTerm.closepath();
			}
		}
		else

			if (GlobalMembersGadgets.draw_border != 0)
			{
				/* the four corners of the base plane, in normalized view
				 * coordinates (-1..1) on all three axes. */
				vertex bl = new vertex();
				vertex bb = new vertex();
				vertex br = new vertex();
				vertex bf = new vertex();

				/* map to normalized view coordinates the corners of the
				 * baseplane: left, back, right and front, in that order: */
				GlobalMembersUtil3d.map3d_xyz(zaxis_x, zaxis_y, base_z, bl);
				GlobalMembersUtil3d.map3d_xyz(back_x, back_y, base_z, bb);
				GlobalMembersUtil3d.map3d_xyz(right_x, right_y, base_z, br);
				GlobalMembersUtil3d.map3d_xyz(front_x, front_y, base_z, bf);

				///#ifdef USE_GRID_LAYERS
				if (WHICHGRID.BACKGRID != whichgrid)
					///#endif
				{
					/* Draw front part of base grid, right to front corner: */
					if (GlobalMembersGadgets.draw_border & 4 != 0)
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
						//ORIGINAL LINE: draw3d_line(&br, &bf, &border_lp);
						GlobalMembersUtil3d.draw3d_line(br, bf, new lp_style_type(GlobalMembersGadgets.border_lp));
					/* ... and left to front: */
					if (GlobalMembersGadgets.draw_border & 1 != 0)
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
						//ORIGINAL LINE: draw3d_line(&bl, &bf, &border_lp);
						GlobalMembersUtil3d.draw3d_line(bl, bf, new lp_style_type(GlobalMembersGadgets.border_lp));
				}
				///#ifdef USE_GRID_LAYERS
				if (WHICHGRID.FRONTGRID != whichgrid)
					///#endif
				{
					/* Draw back part of base grid: left to back corner: */
					if (GlobalMembersGadgets.draw_border & 2 != 0)
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
						//ORIGINAL LINE: draw3d_line(&bl, &bb, &border_lp);
						GlobalMembersUtil3d.draw3d_line(bl, bb, new lp_style_type(GlobalMembersGadgets.border_lp));
					/* ... and right to back: */
					if (GlobalMembersGadgets.draw_border & 8 != 0)
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
						//ORIGINAL LINE: draw3d_line(&br, &bb, &border_lp);
						GlobalMembersUtil3d.draw3d_line(br, bb, new lp_style_type(GlobalMembersGadgets.border_lp));
				}

				/* if surface is drawn, draw the rest of the graph box, too: */
				if (draw_surface || (draw_contour & en_contour_placement.CONTOUR_SRF) || (GlobalMembersPm3d.pm3d.implicit == PM3D_IMPL_MODE.PM3D_IMPLICIT && strpbrk(GlobalMembersPm3d.pm3d.where,"st") != DefineConstants.NULL))
				{
					vertex fl = new vertex(); // floor left/back/right/front corners
					vertex fb = new vertex();
					vertex fr = new vertex();
					vertex ff = new vertex();
					vertex tl = new vertex(); // top left/back/right/front corners
					vertex tb = new vertex();
					vertex tr = new vertex();
					vertex tf = new vertex();

					GlobalMembersUtil3d.map3d_xyz(zaxis_x, zaxis_y, floor_z, fl);
					GlobalMembersUtil3d.map3d_xyz(back_x, back_y, floor_z, fb);
					GlobalMembersUtil3d.map3d_xyz(right_x, right_y, floor_z, fr);
					GlobalMembersUtil3d.map3d_xyz(front_x, front_y, floor_z, ff);

					GlobalMembersUtil3d.map3d_xyz(zaxis_x, zaxis_y, ceiling_z, tl);
					GlobalMembersUtil3d.map3d_xyz(back_x, back_y, ceiling_z, tb);
					GlobalMembersUtil3d.map3d_xyz(right_x, right_y, ceiling_z, tr);
					GlobalMembersUtil3d.map3d_xyz(front_x, front_y, ceiling_z, tf);

					if ((GlobalMembersGadgets.draw_border & 0xf0) == 0xf0)
					{
						/* all four verticals are drawn - save some time by
						 * drawing them to the full height, regardless of
						 * where the surface lies */
						///#ifdef USE_GRID_LAYERS
						if (WHICHGRID.FRONTGRID != whichgrid)
						{
							///#endif
							/* Draw the back verticals floor-to-ceiling, left: */
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: draw3d_line(&fl, &tl, &border_lp);
							GlobalMembersUtil3d.draw3d_line(fl, tl, new lp_style_type(GlobalMembersGadgets.border_lp));
							/* ... back: */
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: draw3d_line(&fb, &tb, &border_lp);
							GlobalMembersUtil3d.draw3d_line(fb, tb, new lp_style_type(GlobalMembersGadgets.border_lp));
							/* ... and right */
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: draw3d_line(&fr, &tr, &border_lp);
							GlobalMembersUtil3d.draw3d_line(fr, tr, new lp_style_type(GlobalMembersGadgets.border_lp));
							///#ifdef USE_GRID_LAYERS
						}
						if (WHICHGRID.BACKGRID != whichgrid)
							///#endif
							/* Draw the front vertical: floor-to-ceiling, front: */
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: draw3d_line(&ff, &tf, &border_lp);
							GlobalMembersUtil3d.draw3d_line(ff, tf, new lp_style_type(GlobalMembersGadgets.border_lp));
					}
					else
					{
						/* find heights of surfaces at the corners of the xy
						 * rectangle */
						double[][] height = new double[2][2];
						double[][] depth = new double[2][2];
						int zaxis_i = ((int)(((zaxis_x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) / (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) + 0.1));
						int zaxis_j = ((int)(((zaxis_y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) / (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) + 0.1));
						int back_i = ((int)(((back_x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) / (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) + 0.1));
						int back_j = ((int)(((back_y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) / (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) + 0.1));

						height[0][0] = height[0][1] = height[1][0] = height[1][1] = base_z;
						depth[0][0] = depth[0][1] = depth[1][0] = depth[1][1] = base_z;

						/* FIXME HBB 20000617: this method contains the
						 * assumption that the topological corners of the
						 * surface mesh(es) are also the geometrical ones of
						 * their xy projections. This is only true for
						 * 'explicit' surface datasets, i.e. z(x,y) */
						for (; --plot_num >= 0; plot = plot.next_sp)
						{
							iso_curve curve = plot.iso_crvs;
							int count;
							int iso;

							if (plot.plot_type == PLOT_TYPE.NODATA)
								continue;
							if (plot.plot_type == PLOT_TYPE.DATA3D)
							{
								if (plot.has_grid_topology == 0)
									continue;
								iso = plot.num_iso_read;
							}
							else
								iso = iso_samples_2;

							count = curve.p_count;
							GlobalMembersGraph3d.check_corner_height(curve.points, height, depth);
							GlobalMembersGraph3d.check_corner_height(curve.points + count - 1, height, depth);
							while (--iso)
								curve = curve.next;
							GlobalMembersGraph3d.check_corner_height(curve.points, height, depth);
							GlobalMembersGraph3d.check_corner_height(curve.points + count - 1, height, depth);
						}

						//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
						///#define VERTICAL(mask,x,y,i,j,bottom,top) if (draw_border&mask) { draw3d_line(bottom,top, &border_lp); } else if (height[i][j] != depth[i][j]) { vertex a, b; map3d_xyz(x,y,depth[i][j],&a); map3d_xyz(x,y,height[i][j],&b); draw3d_line(&a, &b, &border_lp); }

						///#ifdef USE_GRID_LAYERS
						if (WHICHGRID.FRONTGRID != whichgrid)
						{
							///#endif
							/* Draw back verticals: floor-to-ceiling left: */
							if (GlobalMembersGadgets.draw_border & 0x10 != 0)
							{
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
								//ORIGINAL LINE: draw3d_line(&fl,&tl, &border_lp);
								GlobalMembersUtil3d.draw3d_line(fl, tl, new lp_style_type(GlobalMembersGadgets.border_lp));
							}
							else if (height[zaxis_i][zaxis_j] != depth[zaxis_i][zaxis_j])
							{
								vertex a = new vertex();
								vertex b = new vertex();
								GlobalMembersUtil3d.map3d_xyz(zaxis_x, zaxis_y, depth[zaxis_i][zaxis_j], a);
								GlobalMembersUtil3d.map3d_xyz(zaxis_x, zaxis_y, height[zaxis_i][zaxis_j], b);
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
								//ORIGINAL LINE: draw3d_line(&a, &b, &border_lp);
								GlobalMembersUtil3d.draw3d_line(a, b, new lp_style_type(GlobalMembersGadgets.border_lp));
							};
							/* ... back: */
							if (GlobalMembersGadgets.draw_border & 0x20 != 0)
							{
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
								//ORIGINAL LINE: draw3d_line(&fb,&tb, &border_lp);
								GlobalMembersUtil3d.draw3d_line(fb, tb, new lp_style_type(GlobalMembersGadgets.border_lp));
							}
							else if (height[back_i][back_j] != depth[back_i][back_j])
							{
								vertex a = new vertex();
								vertex b = new vertex();
								GlobalMembersUtil3d.map3d_xyz(back_x, back_y, depth[back_i][back_j], a);
								GlobalMembersUtil3d.map3d_xyz(back_x, back_y, height[back_i][back_j], b);
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
								//ORIGINAL LINE: draw3d_line(&a, &b, &border_lp);
								GlobalMembersUtil3d.draw3d_line(a, b, new lp_style_type(GlobalMembersGadgets.border_lp));
							};
							/* ... and right: */
							if (GlobalMembersGadgets.draw_border & 0x40 != 0)
							{
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
								//ORIGINAL LINE: draw3d_line(&fr,&tr, &border_lp);
								GlobalMembersUtil3d.draw3d_line(fr, tr, new lp_style_type(GlobalMembersGadgets.border_lp));
							}
							else if (height[1 - zaxis_i][1 - zaxis_j] != depth[1 - zaxis_i][1 - zaxis_j])
							{
								vertex a = new vertex();
								vertex b = new vertex();
								GlobalMembersUtil3d.map3d_xyz(right_x, right_y, depth[1 - zaxis_i][1 - zaxis_j], a);
								GlobalMembersUtil3d.map3d_xyz(right_x, right_y, height[1 - zaxis_i][1 - zaxis_j], b);
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
								//ORIGINAL LINE: draw3d_line(&a, &b, &border_lp);
								GlobalMembersUtil3d.draw3d_line(a, b, new lp_style_type(GlobalMembersGadgets.border_lp));
							};
							///#ifdef USE_GRID_LAYERS
						}
						if (WHICHGRID.BACKGRID != whichgrid)
						{
							///#endif
							/* Draw front verticals: floor-to-ceiling front */
							if (GlobalMembersGadgets.draw_border & 0x80 != 0)
							{
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
								//ORIGINAL LINE: draw3d_line(&ff,&tf, &border_lp);
								GlobalMembersUtil3d.draw3d_line(ff, tf, new lp_style_type(GlobalMembersGadgets.border_lp));
							}
							else if (height[1 - back_i][1 - back_j] != depth[1 - back_i][1 - back_j])
							{
								vertex a = new vertex();
								vertex b = new vertex();
								GlobalMembersUtil3d.map3d_xyz(front_x, front_y, depth[1 - back_i][1 - back_j], a);
								GlobalMembersUtil3d.map3d_xyz(front_x, front_y, height[1 - back_i][1 - back_j], b);
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
								//ORIGINAL LINE: draw3d_line(&a, &b, &border_lp);
								GlobalMembersUtil3d.draw3d_line(a, b, new lp_style_type(GlobalMembersGadgets.border_lp));
							};
							///#ifdef USE_GRID_LAYERS
						}
						///#endif
						//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
						///#undef VERTICAL
					} // else (all 4 verticals drawn?)

					/* now border lines on top */
					///#ifdef USE_GRID_LAYERS
					if (WHICHGRID.FRONTGRID != whichgrid)
						///#endif
					{
						/* Draw back part of top of box: top left to back corner: */
						if (GlobalMembersGadgets.draw_border & 0x100 != 0)
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: draw3d_line(&tl, &tb, &border_lp);
							GlobalMembersUtil3d.draw3d_line(tl, tb, new lp_style_type(GlobalMembersGadgets.border_lp));
						/* ... and top right to back: */
						if (GlobalMembersGadgets.draw_border & 0x200 != 0)
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: draw3d_line(&tr, &tb, &border_lp);
							GlobalMembersUtil3d.draw3d_line(tr, tb, new lp_style_type(GlobalMembersGadgets.border_lp));
					}
					///#ifdef USE_GRID_LAYERS
					if (WHICHGRID.BACKGRID != whichgrid)
						///#endif
					{
						/* Draw front part of top of box: top left to front corner: */
						if (GlobalMembersGadgets.draw_border & 0x400 != 0)
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: draw3d_line(&tl, &tf, &border_lp);
							GlobalMembersUtil3d.draw3d_line(tl, tf, new lp_style_type(GlobalMembersGadgets.border_lp));
						/* ... and top right to front: */
						if (GlobalMembersGadgets.draw_border & 0x800 != 0)
							//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
							//ORIGINAL LINE: draw3d_line(&tr, &tf, &border_lp);
							GlobalMembersUtil3d.draw3d_line(tr, tf, new lp_style_type(GlobalMembersGadgets.border_lp));
					}
				} // else (surface is drawn)
			} // if (draw_border)

		/* In 'set view map' mode, treat grid as in 2D plots */
		if (splot_map != 0 && current_layer != Math.abs(GlobalMembersAxis.grid_layer))
			return;
		if (whichgrid == WHICHGRID.BORDERONLY)
			return;

		if (splot_map != 0)
		{
			clip_save = GlobalMembersGadgets.clip_area;
			GlobalMembersGadgets.clip_area = DefineConstants.NULL;
		}

		/* Draw ticlabels and axis labels. x axis, first:*/
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticmode != 0 || GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.text != null)
		{
			vertex v0 = new vertex();
			vertex v1 = new vertex();
			double other_end = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min + GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - xaxis_y;
			double mid_x = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max + GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) / 2;

			GlobalMembersUtil3d.map3d_xyz(mid_x, xaxis_y, base_z, v0);
			GlobalMembersUtil3d.map3d_xyz(mid_x, other_end, base_z, v1);

			tic_unitx = (v1.x - v0.x) / (double)yscaler;
			tic_unity = (v1.y - v0.y) / (double)yscaler;
			tic_unitz = (v1.z - v0.z) / (double)yscaler;

			///#ifdef USE_GRID_LAYERS
			/* Don't output tics and grids if this is the front part of a
			 * two-part grid drawing process: */
			if ((surface_rot_x <= 90 && WHICHGRID.FRONTGRID != whichgrid) || (surface_rot_x > 90 && WHICHGRID.BACKGRID != whichgrid))
				///#endif
				if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticmode != 0)
				{
					GlobalMembersAxis.gen_tics(AXIS_INDEX.FIRST_X_AXIS, GlobalMembersGraph3d.xtick_callback);
				}

			if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.text != null)
			{
				/* label at xaxis_y + 1/4 of (xaxis_y-other_y) */
				///#ifdef USE_GRID_LAYERS // FIXME: still needed??? what for?
				if ((surface_rot_x <= 90 && WHICHGRID.BACKGRID != whichgrid) || (surface_rot_x > 90 && WHICHGRID.FRONTGRID != whichgrid) || splot_map != 0)
				{
					///#endif
					int x1;
					int y1;
					int tmpx;
					int tmpy;

					if (splot_map != 0) // case 'set view map'
					{
						/* copied from xtick_callback(): baseline of tics labels */
						vertex v1 = new vertex();
						vertex v2 = new vertex();
						GlobalMembersUtil3d.map3d_xyz(mid_x, xaxis_y, base_z, v1);
						v2.x = v1.x;
						v2.y = v1.y - tic_unity * t.v_char * 1;
						if (!GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].tic_in)
						{
							/* FIXME
							 * This code and its source in xtick_callback() is wrong --- tics
							 * can be "in" but ticscale <0 ! To be corrected in both places!
							 */
							v2.y -= tic_unity * t.v_tic * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticscale;
						}
						///#if 0
						//// /* PM: correct implementation for map should probably be like this: */
						////		if (X_AXIS.ticmode) {
						////		    int tics_len = (int)(X_AXIS.ticscale * (X_AXIS.tic_in ? -1 : 1) * (term->v_tic));
						////		    if (tics_len < 0) tics_len = 0; // take care only about upward tics
						////		    v2.y += tics_len;
						////		}
						///#endif
						{
							x1 = ((int)((v2).x * xscaler)) + xmiddle;
							y1 = ((int)((v2).y * yscaler)) + ymiddle;
						};
						/* DEFAULT_Y_DISTANCE is with respect to baseline of tics labels */
						///#define DEFAULT_Y_DISTANCE 0.5
						y1 -= (int)((1 + DefineConstants.DEFAULT_Y_DISTANCE) * t.v_char);
						//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
						///#undef DEFAULT_Y_DISTANCE
					} // usual 3d set view ...
					else
					{
						double step = (xaxis_y - other_end) / 4;

						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticmode & DefineConstants.TICS_ON_AXIS != 0)
						{
							GlobalMembersUtil3d.map3d_xyz(mid_x, (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].tic_in ? step : -step) / 2., base_z, v1);
						}
						else
						{
							GlobalMembersUtil3d.map3d_xyz(mid_x, xaxis_y + step, base_z, v1);
						}
						if (!GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].tic_in)
						{
							v1.x -= tic_unitx * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticscale * t.v_tic;
							v1.y -= tic_unity * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticscale * t.v_tic;
						}
						{
							x1 = ((int)((v1).x * xscaler)) + xmiddle;
							y1 = ((int)((v1).y * yscaler)) + ymiddle;
						};
					}

					GlobalMembersGraph3d.map3d_position_r((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.offset), tmpx, tmpy, "graphbox");
					x1 += tmpx; // user-defined label offset
					y1 += tmpy;
					GlobalMembersTerm.ignore_enhanced(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.noenhanced);
					GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.textcolor), t);
					if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.rotate != 0 && splot_map != 0 && (GlobalMembersTerm.term.text_angle)(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.rotate))
					{
						GlobalMembersTerm.write_multiline(x1, y1, GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.rotate, GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.font);
						term.text_angle(0);
					}
					else
					{
						GlobalMembersTerm.write_multiline(x1, y1, GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.font);
					}
					GlobalMembersGadgets.reset_textcolor((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].label.textcolor), t);
					GlobalMembersTerm.ignore_enhanced(false);
					///#ifdef USE_GRID_LAYERS
				}
				///#endif
			}
		}

		/* y axis: */
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].ticmode != 0 || GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.text != null)
		{
			vertex v0 = new vertex();
			vertex v1 = new vertex();
			double other_end = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min + GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - yaxis_x;
			double mid_y = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max + GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) / 2;

			GlobalMembersUtil3d.map3d_xyz(yaxis_x, mid_y, base_z, v0);
			GlobalMembersUtil3d.map3d_xyz(other_end, mid_y, base_z, v1);

			tic_unitx = (v1.x - v0.x) / (double)xscaler;
			tic_unity = (v1.y - v0.y) / (double)xscaler;
			tic_unitz = (v1.z - v0.z) / (double)xscaler;

			///#ifdef USE_GRID_LAYERS
			/* Don't output tics and grids if this is the front part of a
			 * two-part grid drawing process: */
			if ((surface_rot_x <= 90 && WHICHGRID.FRONTGRID != whichgrid) || (surface_rot_x > 90 && WHICHGRID.BACKGRID != whichgrid))
				///#endif
				if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].ticmode != 0)
				{
					GlobalMembersAxis.gen_tics(AXIS_INDEX.FIRST_Y_AXIS, GlobalMembersGraph3d.ytick_callback);
				}
			if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.text != null)
			{
				///#ifdef USE_GRID_LAYERS
				if ((surface_rot_x <= 90 && WHICHGRID.BACKGRID != whichgrid) || (surface_rot_x > 90 && WHICHGRID.FRONTGRID != whichgrid) || splot_map != 0)
				{
					///#endif
					int x1;
					int y1;
					int tmpx;
					int tmpy;
					int h_just;
					int v_just;
					int angle;

					if (splot_map != 0) // case 'set view map'
					{
						/* copied from ytick_callback(): baseline of tics labels */
						vertex v1 = new vertex();
						vertex v2 = new vertex();
						GlobalMembersUtil3d.map3d_xyz(yaxis_x, mid_y, base_z, v1);
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].ticmode & DefineConstants.TICS_ON_AXIS && !GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
						{
							GlobalMembersUtil3d.map3d_xyz(0.0, yaxis_x, base_z, v1);
						}
						v2.x = v1.x - tic_unitx * t.h_char * 1;
						v2.y = v1.y;
						if (!GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].tic_in)
							v2.x -= tic_unitx * t.h_tic * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticscale;
						{
							x1 = ((int)((v2).x * xscaler)) + xmiddle;
							y1 = ((int)((v2).y * yscaler)) + ymiddle;
						};
						/* calculate max length of y-tics labels */
						GlobalMembersAxis.widest_tic_strlen = 0;
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].ticmode & DefineConstants.TICS_ON_BORDER != 0)
						{
							GlobalMembersAxis.widest_tic_strlen = 0; // reset the global variable
							GlobalMembersAxis.gen_tics(AXIS_INDEX.FIRST_Y_AXIS, GlobalMembersAxis.widest_tic_callback);
						}
						/* DEFAULT_Y_DISTANCE is with respect to baseline of tics labels */
						///#define DEFAULT_X_DISTANCE 0.
						x1 -= (int)((DefineConstants.DEFAULT_X_DISTANCE + 0.5 + GlobalMembersAxis.widest_tic_strlen) * t.h_char);
						//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
						///#undef DEFAULT_X_DISTANCE
						///#if 0
						//// /* another method ... but not compatible */
						////		    unsigned int map_y1, map_x2, map_y2;
						////		    int tics_len = 0;
						////		    if (Y_AXIS.ticmode) {
						////			tics_len = (int)(X_AXIS.ticscale * (X_AXIS.tic_in ? 1 : -1) * (term->v_tic));
						////			if (tics_len > 0) tics_len = 0; // take care only about left tics
						////		    }
						////		    map3d_xy(X_AXIS.min, Y_AXIS.min, base_z, &x1, &map_y1);
						////		    map3d_xy(X_AXIS.max, Y_AXIS.max, base_z, &map_x2, &map_y2);
						////		    y1 = (unsigned int)((map_y1 + map_y2) * 0.5);
						//// /* Distance between the title base line and graph top line or the upper part of
						////    tics is as given by character height: */
						////#define DEFAULT_X_DISTANCE 0
						////		    x1 += (unsigned int) (tics_len + (-0.5 + Y_AXIS.label.xoffset) * t->h_char);
						////		    y1 += (unsigned int) ((DEFAULT_X_DISTANCE + Y_AXIS.label.yoffset) * t->v_char);
						////#undef DEFAULT_X_DISTANCE
						///#endif
						h_just = JUSTIFY.CENTRE.getValue(); // vertical justification for rotated text
						v_just = VERT_JUSTIFY.JUST_BOT.getValue(); // horizontal -- does not work for rotated text?
						angle = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.rotate;
					} // usual 3d set view ...
					else
					{
						double step = (other_end - yaxis_x) / 4;
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].ticmode & DefineConstants.TICS_ON_AXIS != 0)
						{
							GlobalMembersUtil3d.map3d_xyz((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].tic_in ? - step : step) / 2., mid_y, base_z, v1);
						}
						else
						{
							GlobalMembersUtil3d.map3d_xyz(yaxis_x - step, mid_y, base_z, v1);
						}
						if (!GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].tic_in)
						{
							v1.x -= tic_unitx * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticscale * t.h_tic;
							v1.y -= tic_unity * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticscale * t.h_tic;
						}
						{
							x1 = ((int)((v1).x * xscaler)) + xmiddle;
							y1 = ((int)((v1).y * yscaler)) + ymiddle;
						};
						h_just = JUSTIFY.CENTRE.getValue();
						v_just = VERT_JUSTIFY.JUST_TOP.getValue();
						/* No Y-label rotation in 3D plot mode */
						angle = 0;
					}

					GlobalMembersGraph3d.map3d_position_r((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.offset), tmpx, tmpy, "graphbox");
					x1 += tmpx; // user-defined label offset
					y1 += tmpy;

					/* write_multiline mods it */
					GlobalMembersTerm.ignore_enhanced(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.noenhanced);
					GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.textcolor), t);

					if (angle != 0 && splot_map != 0 && (GlobalMembersTerm.term.text_angle)(angle))
					{
						GlobalMembersTerm.write_multiline(x1, y1, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.text, h_just, v_just, angle, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.font);
						term.text_angle(0);
					}
					else
					{
						GlobalMembersTerm.write_multiline(x1, y1, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.text, h_just, v_just, 0, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.font);
					}

					GlobalMembersGadgets.reset_textcolor((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].label.textcolor), t);
					GlobalMembersTerm.ignore_enhanced(false);
					///#ifdef USE_GRID_LAYERS
				}
				///#endif
			}
		}

		/* do z tics */
		///#ifdef USE_GRID_LAYERS
		/* Don't output tics and grids if this is the front part of a
		 * two-part grid drawing process: */
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].ticmode != 0 && (WHICHGRID.FRONTGRID != whichgrid) && (splot_map == false) && (draw_surface || (draw_contour & en_contour_placement.CONTOUR_SRF) || tangible.StringFunctions.strChr(GlobalMembersPm3d.pm3d.where,'s') != DefineConstants.NULL))
			///#else
			//    if (Z_AXIS.ticmode
			///#endif
		{
			GlobalMembersAxis.gen_tics(AXIS_INDEX.FIRST_Z_AXIS, GlobalMembersGraph3d.ztick_callback);
		}
		if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].zeroaxis.l_type > DefineConstants.LT_NODRAW) && !GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
			vertex v1 = new vertex();
			vertex v2 = new vertex();

			/* line through x=0 */
			GlobalMembersUtil3d.map3d_xyz(0.0, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min, base_z, v1);
			GlobalMembersUtil3d.map3d_xyz(0.0, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max, base_z, v2);
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: draw3d_line(&v1, &v2, &axis_array[y_axis].zeroaxis);
			GlobalMembersUtil3d.draw3d_line(v1, v2, new lp_style_type(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].zeroaxis));
		}
		if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].zeroaxis.l_type > DefineConstants.LT_NODRAW) && !GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
			vertex v1 = new vertex();
			vertex v2 = new vertex();

			/* line through x=0 y=0 */
			GlobalMembersUtil3d.map3d_xyz(0.0, 0.0, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min, v1);
			GlobalMembersUtil3d.map3d_xyz(0.0, 0.0, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max, v2);
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: draw3d_line(&v1, &v2, &axis_array[z_axis].zeroaxis);
			GlobalMembersUtil3d.draw3d_line(v1, v2, new lp_style_type(GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].zeroaxis));
		}
		if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].zeroaxis.l_type > DefineConstants.LT_NODRAW) && !GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
			vertex v1 = new vertex();
			vertex v2 = new vertex();

			GlobalMembersTerm.term_apply_lp_properties(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].zeroaxis);
			/* line through y=0 */
			GlobalMembersUtil3d.map3d_xyz(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min, 0.0, base_z, v1);
			GlobalMembersUtil3d.map3d_xyz(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max, 0.0, base_z, v2);
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: draw3d_line(&v1, &v2, &axis_array[x_axis].zeroaxis);
			GlobalMembersUtil3d.draw3d_line(v1, v2, new lp_style_type(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].zeroaxis));
		}
		/* PLACE ZLABEL - along the middle grid Z axis - eh ? */
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.text != null && (splot_map == false) && (draw_surface || (draw_contour & en_contour_placement.CONTOUR_SRF) || strpbrk(GlobalMembersPm3d.pm3d.where,"st") != DefineConstants.NULL))
		{
			int tmpx;
			int tmpy;
			vertex v1 = new vertex();
			int h_just = JUSTIFY.CENTRE.getValue();
			int v_just = VERT_JUSTIFY.JUST_TOP.getValue();
			double other_end = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min + GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - zaxis_x;
			double mid_z = (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max + GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min) / 2.;
			double step = (other_end - zaxis_x) / 4.;

			if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].ticmode & DefineConstants.TICS_ON_AXIS != 0)
			{
				GlobalMembersUtil3d.map3d_xyz(0, 0, mid_z, v1);
				{
					x = ((int)((v1).x * xscaler)) + xmiddle;
					y = ((int)((v1).y * yscaler)) + ymiddle;
				};
				x -= 5 * t.h_char;
				h_just = JUSTIFY.RIGHT.getValue();
			}
			else
			{
				GlobalMembersUtil3d.map3d_xyz(zaxis_x - step, zaxis_y, mid_z, v1);
				{
					x = ((int)((v1).x * xscaler)) + xmiddle;
					y = ((int)((v1).y * yscaler)) + ymiddle;
				};
				h_just = JUSTIFY.CENTRE.getValue();
			}

			GlobalMembersGraph3d.map3d_position_r((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.offset), tmpx, tmpy, "graphbox");
			x += tmpx;
			y += tmpy;

			GlobalMembersTerm.ignore_enhanced(GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.noenhanced);
			GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.textcolor), t);
			if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.rotate != 0 && (GlobalMembersTerm.term.text_angle)(GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.rotate))
			{
				GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.text, h_just, v_just, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.rotate, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.font);
				term.text_angle(0);
			}
			else
			{
				GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.text, h_just, v_just, 0, GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.font);
			}
			GlobalMembersGadgets.reset_textcolor((GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].label.textcolor), t);
			GlobalMembersTerm.ignore_enhanced(false);
		}

		if (splot_map != 0)
			GlobalMembersGadgets.clip_area = clip_save;
	}

	/* HBB 20010118: all the *_callback() functions made non-static. This
	 * is necessary to work around a bug in HP's assembler shipped with
	 * HP-UX 10 and higher, if GCC tries to use it */

	/* HBB 20010118: these should be static, but can't --- HP-UX assembler bug */
	public static void xtick_callback(AXIS_INDEX axis, double place, String text, lp_style_type grid, ticmark userlabels)
	{
		vertex v1 = new vertex();
		vertex v2 = new vertex();
		double scale = (text != null ? GlobalMembersAxis.axis_array[axis.getValue()].ticscale : GlobalMembersAxis.axis_array[axis.getValue()].miniticscale) * (GlobalMembersAxis.axis_array[axis.getValue()].tic_in ? 1 : -1);
		double other_end = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min + GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - xaxis_y;

		GlobalMembersUtil3d.map3d_xyz(place, xaxis_y, base_z, v1);
		if (grid.l_type > DefineConstants.LT_NODRAW)
		{
			term.layer(termlayer.TERM_LAYER_BEGIN_GRID);
			/* to save mapping twice, map non-axis y */
			GlobalMembersUtil3d.map3d_xyz(place, other_end, base_z, v2);
			GlobalMembersUtil3d.draw3d_line(v1, v2, grid);
			term.layer(termlayer.TERM_LAYER_END_GRID);
		}
		if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticmode & DefineConstants.TICS_ON_AXIS) && !GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
			GlobalMembersUtil3d.map3d_xyz(place, 0.0, base_z, v1);
		}
		v2.x = v1.x + tic_unitx * scale * t.v_tic;
		v2.y = v1.y + tic_unity * scale * t.v_tic;
		v2.z = v1.z + tic_unitz * scale * t.v_tic;
		v2.real_z = v1.real_z;
		GlobalMembersUtil3d.draw3d_line(v1, v2, GlobalMembersGadgets.border_lp);
		GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp);

		if (text != null)
		{
			int just;
			int x2;
			int y2;
			int angle;

			/* get offset */
			int offsetx;
			int offsety;
			GlobalMembersGraph3d.map3d_position_r((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.offset), offsetx, offsety, "xtics");
			if (tic_unitx * xscaler < -0.9)
				just = JUSTIFY.LEFT.getValue();
			else if (tic_unitx * xscaler < 0.9)
				just = JUSTIFY.CENTRE.getValue();
			else
				just = JUSTIFY.RIGHT.getValue();
			v2.x = v1.x - tic_unitx * t.h_char * 1;
			v2.y = v1.y - tic_unity * t.v_char * 1;
			if (!GlobalMembersAxis.axis_array[axis.getValue()].tic_in)
			{
				v2.x -= tic_unitx * t.v_tic * GlobalMembersAxis.axis_array[axis.getValue()].ticscale;
				v2.y -= tic_unity * t.v_tic * GlobalMembersAxis.axis_array[axis.getValue()].ticscale;
			}
			{
				x2 = ((int)((v2).x * xscaler)) + xmiddle;
				y2 = ((int)((v2).y * yscaler)) + ymiddle;
			};
			/* User-specified different color for the tics text */
			if (GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor.type != DefineConstants.TC_DEFAULT)
				GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor), t);
			angle = GlobalMembersAxis.axis_array[axis.getValue()].tic_rotate;
			if (!(splot_map != 0 && angle != 0 && GlobalMembersTerm.term.text_angle(angle)))
				angle = 0;
			GlobalMembersTerm.write_multiline(x2 + offsetx, y2 + offsety, text, just, VERT_JUSTIFY.JUST_TOP, angle, GlobalMembersAxis.axis_array[axis.getValue()].ticdef.font);
			GlobalMembersTerm.term.text_angle(0);
			GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp);
		}

		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].ticmode & DefineConstants.TICS_MIRROR != 0)
		{
			GlobalMembersUtil3d.map3d_xyz(place, other_end, base_z, v1);
			v2.x = v1.x - tic_unitx * scale * t.v_tic;
			v2.y = v1.y - tic_unity * scale * t.v_tic;
			v2.z = v1.z - tic_unitz * scale * t.v_tic;
			v2.real_z = v1.real_z;
			GlobalMembersUtil3d.draw3d_line(v1, v2, GlobalMembersGadgets.border_lp);
		}
	}
	public static void ytick_callback(AXIS_INDEX axis, double place, String text, lp_style_type grid, ticmark userlabels)
	{
		vertex v1 = new vertex();
		vertex v2 = new vertex();
		double scale = (text != null ? GlobalMembersAxis.axis_array[axis.getValue()].ticscale : GlobalMembersAxis.axis_array[axis.getValue()].miniticscale) * (GlobalMembersAxis.axis_array[axis.getValue()].tic_in ? 1 : -1);
		double other_end = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min + GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - yaxis_x;

		GlobalMembersUtil3d.map3d_xyz(yaxis_x, place, base_z, v1);
		if (grid.l_type > DefineConstants.LT_NODRAW)
		{
			term.layer(termlayer.TERM_LAYER_BEGIN_GRID);
			GlobalMembersUtil3d.map3d_xyz(other_end, place, base_z, v2);
			GlobalMembersUtil3d.draw3d_line(v1, v2, grid);
			term.layer(termlayer.TERM_LAYER_END_GRID);
		}
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].ticmode & DefineConstants.TICS_ON_AXIS && !GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((0.0) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((0.0) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
			GlobalMembersUtil3d.map3d_xyz(0.0, place, base_z, v1);
		}

		v2.x = v1.x + tic_unitx * scale * t.h_tic;
		v2.y = v1.y + tic_unity * scale * t.h_tic;
		v2.z = v1.z + tic_unitz * scale * t.h_tic;
		v2.real_z = v1.real_z;
		GlobalMembersUtil3d.draw3d_line(v1, v2, GlobalMembersGadgets.border_lp);

		if (text != null)
		{
			int just;
			int x2;
			int y2;
			int angle;

			/* get offset */
			int offsetx;
			int offsety;
			GlobalMembersGraph3d.map3d_position_r((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.offset), offsetx, offsety, "ytics");

			if (tic_unitx * xscaler < -0.9)
				just = JUSTIFY.LEFT.getValue();
			else if (tic_unitx * xscaler < 0.9)
				just = JUSTIFY.CENTRE.getValue();
			else
				just = JUSTIFY.RIGHT.getValue();
			v2.x = v1.x - tic_unitx * t.h_char * 1;
			v2.y = v1.y - tic_unity * t.v_char * 1;
			if (!GlobalMembersAxis.axis_array[axis.getValue()].tic_in)
			{
				v2.x -= tic_unitx * t.h_tic * GlobalMembersAxis.axis_array[axis.getValue()].ticscale;
				v2.y -= tic_unity * t.v_tic * GlobalMembersAxis.axis_array[axis.getValue()].ticscale;
			}
			/* User-specified different color for the tics text */
			if (GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor.type != DefineConstants.TC_DEFAULT)
				GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor), t);
			{
				x2 = ((int)((v2).x * xscaler)) + xmiddle;
				y2 = ((int)((v2).y * yscaler)) + ymiddle;
			};
			angle = GlobalMembersAxis.axis_array[axis.getValue()].tic_rotate;
			if (!(splot_map != 0 && angle != 0 && GlobalMembersTerm.term.text_angle(angle)))
				angle = 0;
			GlobalMembersTerm.write_multiline(x2 + offsetx, y2 + offsety, text, just, VERT_JUSTIFY.JUST_TOP, angle, GlobalMembersAxis.axis_array[axis.getValue()].ticdef.font);
			GlobalMembersTerm.term.text_angle(0);
			GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp);
		}

		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].ticmode & DefineConstants.TICS_MIRROR != 0)
		{
			GlobalMembersUtil3d.map3d_xyz(other_end, place, base_z, v1);
			v2.x = v1.x - tic_unitx * scale * t.h_tic;
			v2.y = v1.y - tic_unity * scale * t.h_tic;
			v2.z = v1.z - tic_unitz * scale * t.h_tic;
			v2.real_z = v1.real_z;
			GlobalMembersUtil3d.draw3d_line(v1, v2, GlobalMembersGadgets.border_lp);
		}
	}
	public static void ztick_callback(AXIS_INDEX axis, double place, String text, lp_style_type grid, ticmark userlabels)
	{
		/* HBB: inserted some ()'s to shut up gcc -Wall, here and below */
		int len = (text != null ? GlobalMembersAxis.axis_array[axis.getValue()].ticscale : GlobalMembersAxis.axis_array[axis.getValue()].miniticscale) * (GlobalMembersAxis.axis_array[axis.getValue()].tic_in ? 1 : -1) * (GlobalMembersTerm.term.h_tic);
		vertex v1 = new vertex();
		vertex v2 = new vertex();
		vertex v3 = new vertex();

		() axis; // avoid -Wunused warning

		if (GlobalMembersAxis.axis_array[axis.getValue()].ticmode & DefineConstants.TICS_ON_AXIS != 0)
			GlobalMembersUtil3d.map3d_xyz(0., 0., place, v1);
		else
			GlobalMembersUtil3d.map3d_xyz(zaxis_x, zaxis_y, place, v1);
		if (grid.l_type > DefineConstants.LT_NODRAW)
		{
			if (t.layer)
				(t.layer)(termlayer.TERM_LAYER_BEGIN_GRID);
			GlobalMembersUtil3d.map3d_xyz(back_x, back_y, place, v2);
			GlobalMembersUtil3d.map3d_xyz(right_x, right_y, place, v3);
			GlobalMembersUtil3d.draw3d_line(v1, v2, grid);
			GlobalMembersUtil3d.draw3d_line(v2, v3, grid);
			if (t.layer)
				(t.layer)(termlayer.TERM_LAYER_END_GRID);
		}
		v2.x = v1.x + len / (double)xscaler;
		v2.y = v1.y;
		v2.z = v1.z;
		v2.real_z = v1.real_z;
		GlobalMembersUtil3d.draw3d_line(v1, v2, GlobalMembersGadgets.border_lp);

		if (text != null)
		{
			int x1;
			int y1;
			/* get offset */
			int offsetx;
			int offsety;
			GlobalMembersGraph3d.map3d_position_r((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.offset), offsetx, offsety, "ztics");

			{
				x1 = ((int)((v1).x * xscaler)) + xmiddle;
				y1 = ((int)((v1).y * yscaler)) + ymiddle;
			};
			x1 -= (GlobalMembersTerm.term.h_tic) * 2;
			if (!GlobalMembersAxis.axis_array[axis.getValue()].tic_in)
				x1 -= (GlobalMembersTerm.term.h_tic) * GlobalMembersAxis.axis_array[axis.getValue()].ticscale;
			/* User-specified different color for the tics text */
			if (GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor.type == DefineConstants.TC_Z)
				GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor.value = place;
			if (GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor.type != DefineConstants.TC_DEFAULT)
				GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor), GlobalMembersTerm.term);
			GlobalMembersTerm.write_multiline(x1 + offsetx, y1 + offsety, text, JUSTIFY.RIGHT, VERT_JUSTIFY.JUST_CENTRE, 0, GlobalMembersAxis.axis_array[axis.getValue()].ticdef.font);
			GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp);
		}

		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].ticmode & DefineConstants.TICS_MIRROR != 0)
		{
			GlobalMembersUtil3d.map3d_xyz(right_x, right_y, place, v1);
			v2.x = v1.x - len / (double)xscaler;
			v2.y = v1.y;
			v2.z = v1.z;
			v2.real_z = v1.real_z;
			GlobalMembersUtil3d.draw3d_line(v1, v2, GlobalMembersGadgets.border_lp);
		}
	}

	public static int find_maxl_cntr(gnuplot_contours contours, int count)
	{
		int cnt;
		int mlen;
		int len;
		gnuplot_contours cntrs = contours;

		mlen = cnt = 0;
		while (cntrs != null)
		{
			if (label_contours && cntrs.isNewLevel != 0)
			{
				len = GlobalMembersTerm.estimate_cntrs.label.length() - strspn(cntrs.label," ");
				if (len != 0)
					cnt++;
				if (len > mlen)
					mlen = len;
			}
			cntrs = cntrs.next;
		}
		count += cnt;
		return (mlen);
	}

	/* calculate the number and max-width of the keys for an splot.
	 * Note that a blank line is issued after each set of contours
	 */
	public static int find_maxl_keys3d(surface_points plots, int count, int kcnt)
	{
		int mlen;
		int len;
		int surf;
		int cnt;
		surface_points this_plot;

		mlen = cnt = 0;
		this_plot = plots;
		for (surf = 0; surf < count; this_plot = this_plot.next_sp, surf++)
		{

			/* we draw a main entry if there is one, and we are
			 * drawing either surface, or unlabelled contours
			 */
			if (this_plot.title != null && this_plot.title != null && !this_plot.title_is_suppressed)
			{
				++cnt;
				len = GlobalMembersTerm.estimate_this_plot.title.length();
				if (len > mlen)
					mlen = len;
			}
			if (((int)draw_contour) != 0 && label_contours && this_plot.contours != DefineConstants.NULL)
			{
				len = GlobalMembersGraph3d.find_maxl_cntr(this_plot.contours, cnt);
				if (len > mlen)
					mlen = len;
			}
		}

		if (kcnt != DefineConstants.NULL)
			kcnt = cnt;
		return (mlen);
	}

	/* borders of plotting area */
	/* computed once on every call to do_plot */
	public static void boundary3d(surface_points plots, int count)
	{
		legend_key key = GlobalMembersGadgets.keyT;
		TERMENTRY t = GlobalMembersTerm.term;
		int ytlen;
		int i;

		titlelin = 0;

		p_height = (int) (GlobalMembersGadgets.pointsize * t.v_tic);
		p_width = GlobalMembersGadgets.pointsize * t.h_tic;
		if (key.swidth >= 0)
			key_sample_width = key.swidth * t.h_char + GlobalMembersGadgets.pointsize * t.h_tic;
		else
			key_sample_width = 0;
		key_entry_height = GlobalMembersGadgets.pointsize * t.v_tic * 1.25 * key.vert_factor;
		if (key_entry_height < t.v_char)
		{
			/* is this reasonable ? */
			key_entry_height = t.v_char * key.vert_factor;
		}
		/* count max_len key and number keys (plot-titles and contour labels) with len > 0 */
		max_ptitl_len = GlobalMembersGraph3d.find_maxl_keys3d(plots, count, ptitl_cnt);
		ytlen = GlobalMembersGraphics.label_width(key.title, i) - (key.swidth + 2);
		ktitle_lines = i;
		if (ytlen > max_ptitl_len)
			max_ptitl_len = ytlen;
		key_col_wth = (max_ptitl_len + 4) * t.h_char + key_sample_width;

		if (GlobalMembersGadgets.lmargin.scalex == position_type.screen)
			GlobalMembersGadgets.plot_bounds.xleft = GlobalMembersGadgets.lmargin.x * (float)t.xmax + 0.5;
		else if (GlobalMembersGadgets.lmargin.x >= 0)
			GlobalMembersGadgets.plot_bounds.xleft = GlobalMembersGadgets.lmargin.x * (float)t.h_char + 0.5;
		else
			GlobalMembersGadgets.plot_bounds.xleft = t.h_char * 2 + t.h_tic;

		if (GlobalMembersGadgets.rmargin.scalex == position_type.screen)
			GlobalMembersGadgets.plot_bounds.xright = GlobalMembersGadgets.rmargin.x * (float)t.xmax + 0.5;
		else // No tic label on the right side, so ignore rmargin
			GlobalMembersGadgets.plot_bounds.xright = GlobalMembersGadgets.xsize * t.xmax - t.h_char * 2 - t.h_tic;

		key_rows = ptitl_cnt;
		key_cols = 1;
		if (key.visible)
			if ((key.region == en_key_region.GPKEY_AUTO_EXTERIOR_MARGIN || key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC) && key.margin == en_key_ext_region.GPKEY_BMARGIN)
			{
				if (ptitl_cnt > 0)
				{
					/* calculate max no cols, limited by label-length */
					key_cols = (int)(GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft) / ((max_ptitl_len + 4) * t.h_char + key_sample_width);
					/* HBB 991019: fix division by zero problem */
					if (key_cols == 0)
						key_cols = 1;
					key_rows = (int)((ptitl_cnt - 1) / key_cols) + 1;
					/* now calculate actual no cols depending on no rows */
					key_cols = (int)((ptitl_cnt - 1) / key_rows) + 1;
					key_col_wth = (int)(GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft) / key_cols;
				}
				else
				{
					key_rows = key_cols = key_col_wth = 0;
				}
			}
		/* this should also consider the view and number of lines in
		 * xformat || yformat || xlabel || ylabel */

		if (GlobalMembersGadgets.bmargin.scalex == position_type.screen)
			GlobalMembersGadgets.plot_bounds.ybot = GlobalMembersGadgets.bmargin.x * (float)t.ymax + 0.5;
		else if (splot_map != 0 && GlobalMembersGadgets.bmargin.x >= 0)
			GlobalMembersGadgets.plot_bounds.ybot = (float)t.v_char * GlobalMembersGadgets.bmargin.x;
		else
			GlobalMembersGadgets.plot_bounds.ybot = t.v_char * 2.5 + 1;

		if (key.visible)
			if (key_rows != 0 && (key.region == en_key_region.GPKEY_AUTO_EXTERIOR_MARGIN || key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC) && key.margin == en_key_ext_region.GPKEY_BMARGIN)
				GlobalMembersGadgets.plot_bounds.ybot += key_rows * key_entry_height + ktitle_lines * t.v_char;

		if (GlobalMembersGadgets.title.text != null)
		{
			titlelin++;
			for (i = 0; i < GlobalMembersGadgets.title.text.length(); i++)
			{
				if (GlobalMembersGadgets.title.text.charAt(i) == '\\')
					titlelin++;
			}
		}

		if (GlobalMembersGadgets.tmargin.scalex == position_type.screen)
			GlobalMembersGadgets.plot_bounds.ytop = GlobalMembersGadgets.tmargin.x * (float)t.ymax + 0.5;
		else // FIXME: Why no provision for tmargin in terms of character height?
			GlobalMembersGadgets.plot_bounds.ytop = GlobalMembersGadgets.ysize * t.ymax - t.v_char * (titlelin + 1.5) - 1;

		if (key.visible)
			if (key.region == en_key_region.GPKEY_AUTO_INTERIOR_LRTBC || ((key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC || key.region == en_key_region.GPKEY_AUTO_EXTERIOR_MARGIN) && key.margin == en_key_ext_region.GPKEY_RMARGIN))
			{
				/* calculate max no rows, limited by plot_bounds.ytop-plot_bounds.ybot */
				i = (int)(GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot) / t.v_char - 1 - ktitle_lines;
				/* HBB 20030321: div by 0 fix like above */
				if (i == 0)
					i = 1;
				if (ptitl_cnt > i)
				{
					key_cols = (int)((ptitl_cnt - 1) / i) + 1;
					/* now calculate actual no rows depending on no cols */
					key_rows = (int)((ptitl_cnt - 1) / key_cols) + 1;
				}
			}
		if (key.visible)
			if ((key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC || key.region == en_key_region.GPKEY_AUTO_EXTERIOR_MARGIN) && key.margin == en_key_ext_region.GPKEY_RMARGIN)
			{
				int key_width = key_col_wth * (key_cols - 1) + key_col_wth - 2 * t.h_char;
				if (GlobalMembersGadgets.rmargin.scalex != position_type.screen)
					GlobalMembersGadgets.plot_bounds.xright -= key_width;
			}

		if (key.visible)
			if ((key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC || key.region == en_key_region.GPKEY_AUTO_EXTERIOR_MARGIN) && key.margin == en_key_ext_region.GPKEY_LMARGIN)
			{
				int key_width = key_col_wth * (key_cols - 1) + key_col_wth - 2 * t.h_char;
				if (GlobalMembersGadgets.lmargin.scalex != position_type.screen)
					GlobalMembersGadgets.plot_bounds.xleft += key_width;
			}

		if (splot_map == 0 && GlobalMembersGadgets.aspect_ratio_3D > 0)
		{
			int height = (GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot);
			int width = (GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft);
			if (height > width)
			{
				GlobalMembersGadgets.plot_bounds.ybot += (height - width) / 2;
				GlobalMembersGadgets.plot_bounds.ytop -= (height - width) / 2;
			}
			else
			{
				GlobalMembersGadgets.plot_bounds.xleft += (width - height) / 2;
				GlobalMembersGadgets.plot_bounds.xright -= (width - height) / 2;
			}
		}

		if (GlobalMembersGadgets.lmargin.scalex != position_type.screen)
			GlobalMembersGadgets.plot_bounds.xleft += t.xmax * GlobalMembersGadgets.xoffset;
		if (GlobalMembersGadgets.rmargin.scalex != position_type.screen)
			GlobalMembersGadgets.plot_bounds.xright += t.xmax * GlobalMembersGadgets.xoffset;
		if (GlobalMembersGadgets.tmargin.scalex != position_type.screen)
			GlobalMembersGadgets.plot_bounds.ytop += t.ymax * GlobalMembersGadgets.yoffset;
		if (GlobalMembersGadgets.bmargin.scalex != position_type.screen)
			GlobalMembersGadgets.plot_bounds.ybot += t.ymax * GlobalMembersGadgets.yoffset;
		xmiddle = (GlobalMembersGadgets.plot_bounds.xright + GlobalMembersGadgets.plot_bounds.xleft) / 2;
		ymiddle = (GlobalMembersGadgets.plot_bounds.ytop + GlobalMembersGadgets.plot_bounds.ybot) / 2;


		/* HBB: Magic number alert! */
		xscaler = ((GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft) * 4) / 7;
		yscaler = ((GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot) * 4) / 7;

		/* EAM Aug 2006 - Allow explicit control via set {}margin screen */
		if (GlobalMembersGadgets.tmargin.scalex == position_type.screen || GlobalMembersGadgets.bmargin.scalex == position_type.screen)
			yscaler = (GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot) / surface_scale;
		if (GlobalMembersGadgets.rmargin.scalex == position_type.screen || GlobalMembersGadgets.lmargin.scalex == position_type.screen)
			xscaler = (GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft) / surface_scale;

		/* HBB 20011011: 'set size {square|ratio}' for splots */
		if (splot_map != 0 && GlobalMembersGadgets.aspect_ratio != 0.0)
		{
			double current_aspect_ratio;

			if (GlobalMembersGadgets.aspect_ratio < 0 && (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) != 0.0)
			{
				current_aspect_ratio = - GlobalMembersGadgets.aspect_ratio * Math.abs((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) / (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min));
			}
			else
				current_aspect_ratio = GlobalMembersGadgets.aspect_ratio;

			/*{{{  set aspect ratio if valid and sensible */
			if (current_aspect_ratio >= 0.01 && current_aspect_ratio <= 100.0)
			{
				double current = (double)yscaler / xscaler;
				double required = current_aspect_ratio * t.v_tic / t.h_tic;

				if (current > required)
					/* too tall */
					yscaler = xscaler * required;
				else
					/* too wide */
					xscaler = yscaler / required;
			}
		}

		/* Set default clipping */
		if (splot_map != 0)
			GlobalMembersGadgets.clip_area = GlobalMembersGadgets.plot_bounds;
		else if (GlobalMembersTerm.term.flags & DefineConstants.TERM_CAN_CLIP != 0)
			GlobalMembersGadgets.clip_area = DefineConstants.NULL;
		else
			GlobalMembersGadgets.clip_area = GlobalMembersGadgets.canvas;
	}

	/* put entries in the key */
	public static void key_sample_line(int xl, int yl)
	{
		BoundingBox clip_save = GlobalMembersGadgets.clip_area;

		/* Clip against canvas */
		if (term.flags & DefineConstants.TERM_CAN_CLIP != 0)
			GlobalMembersGadgets.clip_area = DefineConstants.NULL;
		else
			GlobalMembersGadgets.clip_area = GlobalMembersGadgets.canvas;

		GlobalMembersGadgets.draw_clip_line(xl + key_sample_left, yl, xl + key_sample_right, yl);

		GlobalMembersGadgets.clip_area = clip_save;
	}
	public static void key_sample_point(int xl, int yl, int pointtype)
	{
		BoundingBox clip_save = GlobalMembersGadgets.clip_area;

		/* Clip against canvas */
		if (term.flags & DefineConstants.TERM_CAN_CLIP != 0)
			GlobalMembersGadgets.clip_area = DefineConstants.NULL;
		else
			GlobalMembersGadgets.clip_area = GlobalMembersGadgets.canvas;

		if (GlobalMembersGadgets.clip_point(xl + key_point_offset, yl) == 0)
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*GlobalMembersTerm.term.point)(xl + key_point_offset, yl, pointtype);

			GlobalMembersGadgets.clip_area = clip_save;
	}

	/*
	 * Draw a gradient color line for a key (legend).
	 */
	public static void key_sample_line_pm3d(surface_points plot, int xl, int yl)
	{
		legend_key key = GlobalMembersGadgets.keyT;
		int steps = ((24) < (Math.abs(key_sample_right - key_sample_left)) ? (24) : (Math.abs(key_sample_right - key_sample_left)));
		/* don't multiply by key->swidth --- could be >> palette.maxcolors */
		int x_to = xl + key_sample_right;
		double step = ((double)(key_sample_right - key_sample_left)) / steps;
		int i = 1;
		int x1 = xl + key_sample_left;
		int x2;
		double cbmin;
		double cbmax;
		double gray;
		double gray_from;
		double gray_to;
		double gray_step;

		/* If plot uses a constant color, set it here and then let simpler routine take over */
		if (plot.lp_properties.use_palette && plot.lp_properties.pm3d_color.type == DefineConstants.TC_RGB)
		{
			GlobalMembersGadgets.apply_pm3dcolor((plot.lp_properties.pm3d_color), GlobalMembersTerm.term);
			GlobalMembersGraph3d.key_sample_line(xl, yl);
			return;
		}

		/* color gradient only over the cb-values of the surface, if smaller than the
		 * cb-axis range (the latter are gray values [0:1]) */
		GlobalMembersGraph3d.get_surface_cbminmax(plot, cbmin, cbmax);
		if (cbmin > cbmax) // splot 1/0, for example
			return;
		cbmin = ((cbmin) > (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min) ? (cbmin) : (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min));
		cbmax = ((cbmax) < (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max) ? (cbmax) : (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max));
		gray_from = GlobalMembersPm3d.cb2gray(cbmin);
		gray_to = GlobalMembersPm3d.cb2gray(cbmax);
		gray_step = (gray_to - gray_from) / steps;

		if (key.region != en_key_region.GPKEY_USER_PLACEMENT)
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*GlobalMembersTerm.term.move)(x1, yl);
			else
				GlobalMembersGadgets.clip_move(x1, yl);
		x2 = x1;
		while (i <= steps)
		{
			/* if (i>1) set_color( i==steps ? 1 : (i-0.5)/steps ); ... range [0:1] */
			gray = (i == steps) ? gray_to : gray_from + i * gray_step;
			GlobalMembersColor.set_color(gray);
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*GlobalMembersTerm.term.move)(x2, yl);
			x2 = (i == steps) ? x_to : x1 + (int)(i * step + 0.5);
			if (key.region != en_key_region.GPKEY_USER_PLACEMENT)
				//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
				//		(*GlobalMembersTerm.term.vector)(x2, yl);
				else
					GlobalMembersGadgets.clip_vector(x2, yl);
			i++;
		}
	}

	/*
	 * Draw a sequence of points with gradient color a key (legend).
	 */
	public static void key_sample_point_pm3d(surface_points plot, int xl, int yl, int pointtype)
	{
		BoundingBox clip_save = GlobalMembersGadgets.clip_area;
		int x_to = xl + key_sample_right;
		int i = 0;
		int x1 = xl + key_sample_left;
		int x2;
		double cbmin;
		double cbmax;
		double gray;
		double gray_from;
		double gray_to;
		double gray_step;
		/* rule for number of steps: 3*char_width*pointsize or char_width for dots,
		 * but at least 3 points */
		double step = GlobalMembersTerm.term.h_char * (pointtype == -1 ? 1 : 3 * (1 + (GlobalMembersGadgets.pointsize-1) / 2));
		int steps = (int)(((double)(key_sample_right - key_sample_left)) / step + 0.5);
		if (steps < 2)
			steps = 2;
		step = ((double)(key_sample_right - key_sample_left)) / steps;

		/* If plot uses a constant color, set it here and then let simpler routine take over */
		if (plot.lp_properties.use_palette && plot.lp_properties.pm3d_color.type == DefineConstants.TC_RGB)
		{
			GlobalMembersGadgets.apply_pm3dcolor((plot.lp_properties.pm3d_color), GlobalMembersTerm.term);
			GlobalMembersGraph3d.key_sample_point(xl, yl, pointtype);
			return;
		}

		/* color gradient only over the cb-values of the surface, if smaller than the
		 * cb-axis range (the latter are gray values [0:1]) */
		GlobalMembersGraph3d.get_surface_cbminmax(plot, cbmin, cbmax);
		if (cbmin > cbmax) // splot 1/0, for example
			return;
		cbmin = ((cbmin) > (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min) ? (cbmin) : (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min));
		cbmax = ((cbmax) < (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max) ? (cbmax) : (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max));
		gray_from = GlobalMembersPm3d.cb2gray(cbmin);
		gray_to = GlobalMembersPm3d.cb2gray(cbmax);
		gray_step = (gray_to - gray_from) / steps;
		///#if 0
		////    fprintf(stderr,"POINT_pm3D: cbmin=%g  cbmax=%g\n",cbmin, cbmax);
		////    fprintf(stderr,"steps=%i gray_from=%g gray_to=%g gray_step=%g\n",steps,gray_from,gray_to,gray_step);
		///#endif
		/* Clip to canvas */
		if (GlobalMembersTerm.term.flags & DefineConstants.TERM_CAN_CLIP != 0)
			GlobalMembersGadgets.clip_area = DefineConstants.NULL;
		else
			GlobalMembersGadgets.clip_area = GlobalMembersGadgets.canvas;

		while (i <= steps)
		{
			/* if (i>0) set_color( i==steps ? gray_to : (i-0.5)/steps ); ... range [0:1] */
			gray = (i == steps) ? gray_to : gray_from + i * gray_step;
			GlobalMembersColor.set_color(gray);
			x2 = i == 0 ? x1 : (i == steps != 0 ? x_to : x1 + (int)(i * step + 0.5));
			/* x2 += key_point_offset; ... that's if there is only 1 point */
			if (GlobalMembersGadgets.clip_point(x2, yl) == 0)
				//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
				//		(*GlobalMembersTerm.term.point)(x2, yl, pointtype);
				i++;
		}

		GlobalMembersGadgets.clip_area = clip_save;
	}
	public static boolean can_pm3d = false;

	/*
	 * these code blocks were moved to functions, to make the code simpler
	 */

	public static void key_text(int xl, int yl, String text)
	{
		legend_key key = GlobalMembersGadgets.keyT;

		if (key.just == en_key_sample_positioning.GPKEY_LEFT && key.region != en_key_region.GPKEY_USER_PLACEMENT)
		{
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*GlobalMembersTerm.term.justify_text)(JUSTIFY.LEFT);
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*GlobalMembersTerm.term.put_text)(xl + key_text_left, yl, text);
		}
		else
		{
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	if ((*GlobalMembersTerm.term.justify_text)(JUSTIFY.RIGHT))
			{
				//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
				//		(*GlobalMembersTerm.term.put_text)(xl + key_text_right, yl, text);
			}
			else
			{
				int x = xl + key_text_right - (GlobalMembersTerm.term.h_char) * GlobalMembersTerm.estimate_text.length();
				//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
				//		(*GlobalMembersTerm.term.put_text)(x, yl, text);
			}
		}
	}
	public static void check_for_variable_color(surface_points plot, coordinate point)
	{
		int colortype = plot.lp_properties.pm3d_color.type;

		switch (colortype)
		{
		case DefineConstants.TC_RGB:
			if (plot.pm3d_color_from_column)
				GlobalMembersColor.set_rgbcolor((int)point.ylow);
			break;
		case DefineConstants.TC_Z:
		case DefineConstants.TC_DEFAULT: // pm3d mode assumes this is default
			if (can_pm3d && plot.lp_properties.use_palette)
			{
				if (plot.pm3d_color_from_column)
					GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(point.ylow));
				else
					GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(GlobalMembersPm3d.z2cb(point.z)));
			}
			break;
		case DefineConstants.TC_LINESTYLE: // color from linestyle in data column
			plot.lp_properties.pm3d_color.lt = (int)(point.ylow);
			GlobalMembersGadgets.apply_pm3dcolor((plot.lp_properties.pm3d_color), GlobalMembersTerm.term);
			break;
		default:
			/* The other cases were taken care of already */
			break;
		}
	}

	public static boolean get_arrow3d(arrow_def arrow, int sx, int sy, int ex, int ey)
	{
		GlobalMembersGraph3d.map3d_position((arrow.start), sx, sy, "arrow");

		if (arrow.relative)
		{
			GlobalMembersGraph3d.map3d_position_r((arrow.end), ex, ey, "arrow");
			ex += sx;
			ey += sy;
		}
		else
		{
			GlobalMembersGraph3d.map3d_position((arrow.end), ex, ey, "arrow");
		}

		return true;
	}
	public static void place_arrows3d(int layer)
	{
		arrow_def this_arrow;
		BoundingBox clip_save = GlobalMembersGadgets.clip_area;

		/* Allow arrows to run off the plot, so long as they are still on the canvas */
		if (GlobalMembersTerm.term.flags & DefineConstants.TERM_CAN_CLIP != 0)
			GlobalMembersGadgets.clip_area = DefineConstants.NULL;
		else
			GlobalMembersGadgets.clip_area = GlobalMembersGadgets.canvas;

		for (this_arrow = GlobalMembersGadgets.first_arrow; this_arrow != DefineConstants.NULL; this_arrow = this_arrow.next)
		{
			int sx;
			int sy;
			int ex;
			int ey;

			if (this_arrow.arrow_properties.layer != layer)
				continue;
			if (GlobalMembersGraph3d.get_arrow3d(this_arrow, sx, sy, ex, ey))
			{
				GlobalMembersTerm.term_apply_lp_properties((this_arrow.arrow_properties.lp_properties));
				GlobalMembersGraphics.apply_head_properties((this_arrow.arrow_properties));
				GlobalMembersGadgets.draw_clip_arrow(sx, sy, ex, ey, this_arrow.arrow_properties.head);
			}
			else
			{
				GlobalMembersFit.a((stderr,"place_arrows3d: skipping out-of-bounds arrow\n"));
			}
		}
		GlobalMembersGadgets.clip_area = clip_save;
	}
	public static void place_labels3d(text_label listhead, int layer)
	{
		text_label this_label;
		int x;
		int y;

		if (GlobalMembersTerm.term.pointsize)
			//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
			//	(*GlobalMembersTerm.term.pointsize)(GlobalMembersGadgets.pointsize);

			for (this_label = listhead; this_label != DefineConstants.NULL; this_label = this_label.next)
			{

				if (this_label.layer != layer)
					continue;

				/* HBB FIXME 20050428: conflicting types for &x,&y in these
				 * two routines.  One takes pointers to unsigned, the other to
				 * signed ints. */
				if (layer == DefineConstants.LAYER_PLOTLABELS)
				{
					double xx;
					double yy;
					GlobalMembersUtil3d.map3d_xy_double(this_label.place.x, this_label.place.y, this_label.place.z, xx, yy);
					x = xx;
					y = yy;
					/* Only clip in 2D.   EAM - why? */
					if (splot_map != 0 && GlobalMembersGadgets.clip_point(x, y) != 0)
						continue;
				}
				else
					GlobalMembersGraph3d.map3d_position(this_label.place, x, y, "label");

				GlobalMembersGadgets.write_label(x, y, this_label);
			}
	}
	public static int map3d_getposition(position pos, String what, double xpos, double ypos, double zpos)
	{
		boolean screen_coords = false;
		boolean char_coords = false;
		boolean plot_coords = false;

		switch (pos.scalex)
		{
		case first_axes:
		case second_axes:
			xpos = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.FIRST_X_AXIS, xpos, what);
			plot_coords = true;
			break;
		case graph:
			xpos = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min + xpos * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
			plot_coords = true;
			break;
		case screen:
			xpos = xpos * (GlobalMembersTerm.term.xmax - 1) + 0.5;
			screen_coords = true;
			break;
		case character:
			xpos = xpos * GlobalMembersTerm.term.h_char + 0.5;
			char_coords = true;
			break;
		}

		switch (pos.scaley)
		{
		case first_axes:
		case second_axes:
			ypos = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.FIRST_Y_AXIS, ypos, what);
			plot_coords = true;
			break;
		case graph:
			if (splot_map != 0)
				ypos = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - ypos * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
			else
				ypos = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min + ypos * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
			plot_coords = true;
			break;
		case screen:
			ypos = ypos * (GlobalMembersTerm.term.ymax - 1) + 0.5;
			screen_coords = true;
			break;
		case character:
			ypos = ypos * GlobalMembersTerm.term.v_char + 0.5;
			char_coords = true;
			break;
		}

		switch (pos.scalez)
		{
		case first_axes:
		case second_axes:
			zpos = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.FIRST_Z_AXIS, zpos, what);
			plot_coords = true;
			break;
		case graph:
			zpos = GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min + zpos * (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min);
			plot_coords = true;
			break;
		case screen:
			screen_coords = true;
			break;
		case character:
			char_coords = true;
			break;
		}

		if (plot_coords && (screen_coords || char_coords))
			GlobalMembersUtil.graph_error("Cannot mix screen or character coords with plot coords");

		return (screen_coords || char_coords);
	}

	/*
	 * The Amiga SAS/C 6.2 compiler moans about macro envocations causing
	 * multiple calls to functions. I converted these macros to inline
	 * functions coping with the problem without loosing speed.
	 * (MGR, 1993)
	 */
	///#ifdef AMIGA_SC_6_1
	//GP_INLINE static TBOOLEAN
	//i_inrange(int z, int min, int max)
	//{
	//    return ((min < max)
	//	    ? ((z >= min) && (z <= max))
	//	    : ((z >= max) && (z <= min)));
	//}
	//
	//GP_INLINE static double
	//f_max(double a, double b)
	//{
	//    return (max(a, b));
	//}
	//
	//GP_INLINE static double
	//f_min(double a, double b)
	//{
	//    return (min(a, b));
	//}
	//
	///#else
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define f_max(a,b) ( ((a)) > ((b)) ? ((a)) : ((b)) )
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define f_min(a,b) ( ((a)) < ((b)) ? ((a)) : ((b)) )
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define i_inrange(z,a,b) ((((a))<((b))) ? ((((z))>=((a))) && (((z))<=((b)))) : ((((z))>=((b))) && (((z))<=((a)))))
	///#endif

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define apx_eq(x,y) (fabs(x-y) < 0.001)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ABS(x) ((x) >= 0 ? (x) : -(x))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SQR(x) ((x) * (x))

	/* Define the boundary of the plot
	 * These are computed at each call to do_plot, and are constant over
	 * the period of one do_plot. They actually only change when the term
	 * type changes and when the 'set size' factors change.
	 */

	public static int xmiddle;
	public static int ymiddle;
	public static int xscaler;
	public static int yscaler;
	public static int ptitl_cnt;
	public static int max_ptitl_len;
	public static int titlelin;
	public static int key_sample_width;
	public static int key_rows;
	public static int key_cols;
	public static int key_col_wth;
	public static int yl_ref;
	public static double ktitle_lines = 0;


	/* Boundary and scale factors, in user coordinates */

	/* There are several z's to take into account - I hope I get these
	 * right !
	 *
	 * ceiling_z is the highest z in use
	 * floor_z   is the lowest z in use
	 * base_z is the z of the base
	 * min3d_z is the lowest z of the graph area
	 * max3d_z is the highest z of the graph area
	 *
	 * ceiling_z is either max3d_z or base_z, and similarly for floor_z
	 * There should be no part of graph drawn outside
	 * min3d_z:max3d_z  - apart from arrows, perhaps
	 */

	public static double floor_z;
	public static double ceiling_z; // made exportable for PM3D
	public static double base_z;

	public static double[][] trans_mat = new double[4][4];

	/* x and y input range endpoints where the three axes are to be
	 * displayed (left, front-left, and front-right edges of the cube) */
	public static double xaxis_y;
	public static double yaxis_x;
	public static double zaxis_x;
	public static double zaxis_y;

	/* ... and the same for the back, right, and front corners */
	public static double back_x;
	public static double back_y;
	public static double right_x;
	public static double right_y;
	public static double front_x;
	public static double front_y;

	///#ifdef USE_MOUSE
	public static int axis3d_o_x;
	public static int axis3d_o_y;
	public static int axis3d_x_dx;
	public static int axis3d_x_dy;
	public static int axis3d_y_dx;
	public static int axis3d_y_dy;
	///#endif

	/* the penalty for convenience of using tic_gen to make callbacks
	 * to tick routines is that we cannot pass parameters very easily.
	 * We communicate with the tick_callbacks using static variables
	 */

	/* unit vector (terminal coords) */
	public static double tic_unitx;
	public static double tic_unity;
	public static double tic_unitz;

	/* we precalculate features of the key, to save lots of nested
	 * ifs in code - x,y = user supplied or computed position of key
	 * taken to be inner edge of a line sample
	 */
	public static int key_sample_left; // offset from x for left of line sample
	public static int key_sample_right; // offset from x for right of line sample
	public static int key_point_offset; // offset from x for point sample
	public static int key_text_left; // offset from x for left-justified text
	public static int key_text_right; // offset from x for right-justified text
	public static int key_size_left; // distance from x to left edge of box
	public static int key_size_right; // distance from x to right edge of box
}