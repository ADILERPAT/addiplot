package com.addiPlot.gnuplot;

public class GlobalMembersGraphics
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
	public static String RCSid()
	{
		return GlobalMembersAlloc.RCSid("$Id: graphics.c,v 1.302.2.13 2010/02/11 21:20:47 sfeam Exp $");
	}
	///#endif

	/* externally visible variables of graphics.h */

	/* 'set offset' status variables */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern position loff, roff, toff, boff;

	/* 'set bar' status */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double bar_size;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int bar_layer;

	/* function prototypes */

	public static void do_plot(curve_points plots, int pcount)
	{
		TERMENTRY t = GlobalMembersTerm.term;
		int curve;
		curve_points this_plot = DefineConstants.NULL;
		int xl = 0; // avoid gcc -Wall warning
		int yl = 0;
		int key_count = 0;
		legend_key key = GlobalMembersGadgets.keyT;

		GlobalMembersAxis.x_axis = AXIS_INDEX.FIRST_X_AXIS;
		GlobalMembersAxis.y_axis = AXIS_INDEX.FIRST_Y_AXIS;
		GlobalMembersGraphics.adjust_offsets();

		/* EAM June 2003 - Although the comment below implies that font dimensions
		 * are known after term_initialise(), this is not true at least for the X11
		 * driver.  X11 fonts are not set until an actual display window is
		 * opened, and that happens in term->graphics(), which is called from
		 * term_start_plot().
		 */
		GlobalMembersTerm.term_initialise(); // may set xmax/ymax
		GlobalMembersTerm.term_start_plot();

		/* Figure out if we need a colorbox for this plot */
		GlobalMembersPm3d.set_plot_with_palette(0, MODE_PLOT_TYPE.MODE_PLOT); // EAM FIXME - 1st parameter is a dummy

		/* compute boundary for plot (plot_bounds.xleft, plot_bounds.xright, plot_bounds.ytop, plot_bounds.ybot)
		 * also calculates tics, since xtics depend on plot_bounds.xleft
		 * but plot_bounds.xleft depends on ytics. Boundary calculations depend
		 * on term->v_char etc, so terminal must be initialised first.
		 */
		GlobalMembersGraphics.boundary(plots, pcount);

		/* Make palette */
		if (GlobalMembersPm3d.is_plot_with_palette())
		GlobalMembersColor.make_palette();

		/* Give a chance for rectangles to be behind everything else */
		GlobalMembersGraphics.place_objects(GlobalMembersGadgets.first_object, -1, 2, DefineConstants.NULL);

		GlobalMembersUtil.screen_ok = false;

		/* Sync point for epslatex text positioning */
		if (GlobalMembersTerm.term.layer)
		(GlobalMembersTerm.term.layer)(termlayer.TERM_LAYER_BACKTEXT);

		/* DRAW TICS AND GRID */
		if (GlobalMembersAxis.grid_layer == 0 || GlobalMembersAxis.grid_layer == -1)
		GlobalMembersGraphics.place_grid();

		/* DRAW AXES */
		/* after grid so that axes linetypes are on top */
		GlobalMembersAxis.x_axis = AXIS_INDEX.FIRST_X_AXIS;
		GlobalMembersAxis.y_axis = AXIS_INDEX.FIRST_Y_AXIS; // chose scaling

		GlobalMembersAxis.axis_draw_2d_zeroaxis(AXIS_INDEX.FIRST_X_AXIS, AXIS_INDEX.FIRST_Y_AXIS);
		GlobalMembersAxis.axis_draw_2d_zeroaxis(AXIS_INDEX.FIRST_Y_AXIS, AXIS_INDEX.FIRST_X_AXIS);

		GlobalMembersAxis.x_axis = AXIS_INDEX.SECOND_X_AXIS;
		GlobalMembersAxis.y_axis = AXIS_INDEX.SECOND_Y_AXIS; // chose scaling

		GlobalMembersAxis.axis_draw_2d_zeroaxis(AXIS_INDEX.SECOND_X_AXIS, AXIS_INDEX.SECOND_Y_AXIS);
		GlobalMembersAxis.axis_draw_2d_zeroaxis(AXIS_INDEX.SECOND_Y_AXIS, AXIS_INDEX.SECOND_X_AXIS);

		/* DRAW PLOT BORDER */
		if (GlobalMembersGadgets.draw_border != 0)
		GlobalMembersGraphics.plot_border();

		/* YLABEL */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.text != null)
		{
		GlobalMembersTerm.ignore_enhanced(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.noenhanced);
		GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.textcolor), t);
		/* we worked out x-posn in boundary() */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	if ((*t.text_angle)(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.rotate))
		{
			double tmpx;
			double tmpy;
			int x;
			int y;
			GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.offset), tmpx, tmpy, "doplot");

			x = ylabel_x + (t.v_char / 2);
			y = (GlobalMembersGadgets.plot_bounds.ytop + GlobalMembersGadgets.plot_bounds.ybot) / 2 + tmpy;

			GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.rotate, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.font);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.text_angle)(0);
		}
		else
		{
			/* really bottom just, but we know number of lines
			   so we need to adjust x-posn by one line */
			int x = ylabel_x;
			int y = ylabel_y;

			GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.text, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.font);
		}
		GlobalMembersGadgets.reset_textcolor((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.textcolor), t);
		GlobalMembersTerm.ignore_enhanced(false);
		}

		/* Y2LABEL */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.text != null)
		{
		GlobalMembersTerm.ignore_enhanced(GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.noenhanced);
		GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.textcolor), t);
		/* we worked out coordinates in boundary() */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	if ((*t.text_angle)(GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.rotate))
		{
			double tmpx;
			double tmpy;
			int x;
			int y;
			GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.offset), tmpx, tmpy, "doplot");
			x = y2label_x + (t.v_char / 2) - 1;
			y = (GlobalMembersGadgets.plot_bounds.ytop + GlobalMembersGadgets.plot_bounds.ybot) / 2 + tmpy;

			GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.rotate, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.font);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.text_angle)(0);
		}
		else
		{
			/* really bottom just, but we know number of lines */
			int x = y2label_x;
			int y = y2label_y;

			GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.text, JUSTIFY.RIGHT, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.font);
		}
		GlobalMembersGadgets.reset_textcolor((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.textcolor), t);
		GlobalMembersTerm.ignore_enhanced(false);
		}

		/* XLABEL */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.text != null)
		{
		double tmpx;
		double tmpy;
		int x;
		int y;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.offset), tmpx, tmpy, "doplot");

		x = (GlobalMembersGadgets.plot_bounds.xright + GlobalMembersGadgets.plot_bounds.xleft) / 2 + tmpx;
		y = xlabel_y - t.v_char / 2; // HBB

		GlobalMembersTerm.ignore_enhanced(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.noenhanced);
		GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.textcolor), t);
		GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.text, VERT_JUSTIFY.JUST_CENTRE, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.font);
		GlobalMembersGadgets.reset_textcolor((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.textcolor), t);
		GlobalMembersTerm.ignore_enhanced(false);
		}

		/* PLACE TITLE */
		if (GlobalMembersGadgets.title.text != null)
		{
		double tmpx;
		double tmpy;
		int x;
		int y;
		GlobalMembersGraphics.map_position_r((GlobalMembersGadgets.title.offset), tmpx, tmpy, "doplot");
		/* we worked out y-coordinate in boundary() */
		x = (GlobalMembersGadgets.plot_bounds.xleft + GlobalMembersGadgets.plot_bounds.xright) / 2 + tmpx;
		y = title_y - t.v_char / 2;

		GlobalMembersTerm.ignore_enhanced(GlobalMembersGadgets.title.noenhanced);
		GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersGadgets.title.textcolor), t);
		GlobalMembersTerm.write_multiline(x, y, GlobalMembersGadgets.title.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersGadgets.title.font);
		GlobalMembersGadgets.reset_textcolor((GlobalMembersGadgets.title.textcolor), t);
		GlobalMembersTerm.ignore_enhanced(false);
		}

		/* X2LABEL */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.text != null)
		{
		double tmpx;
		double tmpy;
		int x;
		int y;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.offset), tmpx, tmpy, "doplot");
		/* we worked out y-coordinate in boundary() */
		x = (GlobalMembersGadgets.plot_bounds.xright + GlobalMembersGadgets.plot_bounds.xleft) / 2 + tmpx;
		y = x2label_y - t.v_char / 2 - 1;
		GlobalMembersTerm.ignore_enhanced(GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.noenhanced);
		GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.textcolor), t);
		GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.font);
		GlobalMembersGadgets.reset_textcolor((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.textcolor), t);
		GlobalMembersTerm.ignore_enhanced(false);
		}

		/* PLACE TIMEDATE */
		if (GlobalMembersGadgets.timelabel.text != null)
		{
		/* we worked out coordinates in boundary() */
		String str;
		time_t now = new time_t();
		int x = time_x;
		int y = time_y;
		time(now);
		/* there is probably no way to find out in advance how many
		 * chars strftime() writes */
		str = GlobalMembersAlloc.gp_alloc(DefineConstants.MAX_LINE_LEN + 1, "timelabel.text");
		GlobalMembersStrftime.strftime(str, DefineConstants.MAX_LINE_LEN, GlobalMembersGadgets.timelabel.text, localtime(now));

//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	if (GlobalMembersGadgets.timelabel_rotate != 0 && (*t.text_angle)(DefineConstants.TEXT_VERTICAL))
		{
			x += t.v_char / 2; // HBB
			if (GlobalMembersGadgets.timelabel_bottom != 0)
			GlobalMembersTerm.write_multiline(x, y, str, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_TOP, DefineConstants.TEXT_VERTICAL, GlobalMembersGadgets.timelabel.font);
			else
			GlobalMembersTerm.write_multiline(x, y, str, JUSTIFY.RIGHT, VERT_JUSTIFY.JUST_TOP, DefineConstants.TEXT_VERTICAL, GlobalMembersGadgets.timelabel.font);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.text_angle)(0);
		}
		else
		{
			y -= t.v_char / 2; // HBB
			if (GlobalMembersGadgets.timelabel_bottom != 0)
			GlobalMembersTerm.write_multiline(x, y, str, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_BOT, 0, GlobalMembersGadgets.timelabel.font);
			else
			GlobalMembersTerm.write_multiline(x, y, str, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersGadgets.timelabel.font);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(str);
		}

		/* Add back colorbox if appropriate */
		if (GlobalMembersPm3d.is_plot_with_colorbox() && GlobalMembersTerm.term.set_color && GlobalMembersGadgets.color_box.layer == DefineConstants.LAYER_BACK)
			GlobalMembersColor.draw_color_smooth_box(MODE_PLOT_TYPE.MODE_PLOT);

		/* And rectangles */
		GlobalMembersGraphics.place_objects(GlobalMembersGadgets.first_object, 0, 2, GlobalMembersGadgets.clip_area);

		/* PLACE LABELS */
		GlobalMembersGraphics.place_labels(GlobalMembersGadgets.first_label, 0, false);

		/* PLACE ARROWS */
		GlobalMembersGraphics.place_arrows(0);

		/* Sync point for epslatex text positioning */
		if (GlobalMembersTerm.term.layer)
		(GlobalMembersTerm.term.layer)(termlayer.TERM_LAYER_FRONTTEXT);

		/* WORK OUT KEY SETTINGS AND DO KEY TITLE / BOX */
		if (lkey) // may have been cancelled if something went wrong
		{
		/* just use key->bounds.xleft etc worked out in boundary() */
		xl = key.bounds.xleft + key_size_left;
		yl = key.bounds.ytop;

		if (key.title != null)
		{
			int center = (key.bounds.xleft + key.bounds.xright) / 2;
			double extra_height = 0.0;

			if (key.textcolor.type == DefineConstants.TC_RGB && key.textcolor.value < 0)
			GlobalMembersGadgets.apply_pm3dcolor((key.box.pm3d_color), t);
			else
			GlobalMembersGadgets.apply_pm3dcolor((key.textcolor), t);
			if ((t.flags & DefineConstants.TERM_ENHANCED_TEXT) && tangible.StringFunctions.strChr(key.title,'^'))
			extra_height += 0.51;
			GlobalMembersTerm.write_multiline(center, yl - (0.5 + extra_height / 2.0) * t.v_char, key.title, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, 0, key.font);
			if ((t.flags & DefineConstants.TERM_ENHANCED_TEXT) && tangible.StringFunctions.strChr(key.title,'_'))
			extra_height += 0.3;
			ktitl_lines += extra_height;
			key.bounds.ybot -= extra_height * t.v_char;
			yl -= t.v_char * ktitl_lines;
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.linetype)(DefineConstants.LT_BLACK);
		}

		yl -= (int)(0.5 * key.height_fix * t.v_char);
		yl_ref = yl -= key_entry_height / 2; // centralise the keys
		key_count = 0;

		if (key.box.l_type > DefineConstants.LT_NODRAW)
		{
			BoundingBox clip_save = GlobalMembersGadgets.clip_area;
			if (GlobalMembersTerm.term.flags & DefineConstants.TERM_CAN_CLIP != 0)
			GlobalMembersGadgets.clip_area = DefineConstants.NULL;
			else
			GlobalMembersGadgets.clip_area = GlobalMembersGadgets.canvas;
			GlobalMembersTerm.term_apply_lp_properties(key.box);
			GlobalMembersTerm.newpath();
			GlobalMembersGadgets.draw_clip_line(key.bounds.xleft, key.bounds.ybot, key.bounds.xleft, key.bounds.ytop);
			GlobalMembersGadgets.draw_clip_line(key.bounds.xleft, key.bounds.ytop, key.bounds.xright, key.bounds.ytop);
			GlobalMembersGadgets.draw_clip_line(key.bounds.xright, key.bounds.ytop, key.bounds.xright, key.bounds.ybot);
			GlobalMembersGadgets.draw_clip_line(key.bounds.xright, key.bounds.ybot, key.bounds.xleft, key.bounds.ybot);
			GlobalMembersTerm.closepath();
			/* draw a horizontal line between key title and first entry */
			GlobalMembersGadgets.draw_clip_line(key.bounds.xleft, key.bounds.ytop - (ktitl_lines) * t.v_char, key.bounds.xright, key.bounds.ytop - (ktitl_lines) * t.v_char);
			GlobalMembersGadgets.clip_area = clip_save;
		}
		} // lkey

		/* DRAW CURVES */
		this_plot = plots;
		for (curve = 0; curve < pcount; this_plot = this_plot.next, curve++)
		{
		boolean localkey = lkey; // a local copy

		/* Sync point for start of new curve (used by svg, post, ...) */
		if (GlobalMembersTerm.term.layer)
			(GlobalMembersTerm.term.layer)(termlayer.TERM_LAYER_BEFORE_PLOT);

		/* set scaling for this plot's axes */
		GlobalMembersAxis.x_axis = this_plot.x_axis;
		GlobalMembersAxis.y_axis = this_plot.y_axis;

		GlobalMembersTerm.term_apply_lp_properties((this_plot.lp_properties));

		/* Why only for histograms? */
		if (this_plot.plot_style == PLOT_STYLE.HISTOGRAMS)
		{
			if (GlobalMembersGadgets.prefer_line_styles)
			GlobalMembersTerm.lp_use_properties(this_plot.lp_properties, this_plot.lp_properties.l_type + 1);
		}

		/* Skip a line in the key between histogram clusters */
		if (this_plot.plot_style == PLOT_STYLE.HISTOGRAMS && this_plot.histogram_sequence == 0 && yl != yl_ref)
		{
			if (++key_count >= key_rows)
			{
			yl = yl_ref;
			xl += key_col_wth;
			key_count = 0;
			}
			else
			yl = yl - key_entry_height;
		}

		/* Column-stacked histograms store their key titles internally */
		if (this_plot.plot_style == PLOT_STYLE.HISTOGRAMS && GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_TOWERS.getValue())
		{
			text_label key_entry;
			localkey = false;
			if (this_plot.labels != null)
			{
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: struct lp_style_type save_lp = this_plot->lp_properties;
			lp_style_type save_lp = new lp_style_type(this_plot.lp_properties);
			for (key_entry = this_plot.labels.next; key_entry; key_entry = key_entry.next)
			{
				key_count++;
				this_plot.lp_properties.l_type = key_entry.tag;
				this_plot.fill_properties.fillpattern = key_entry.tag;
				if (key_entry.text != null)
				{
				if (GlobalMembersGadgets.prefer_line_styles)
					GlobalMembersTerm.lp_use_properties(this_plot.lp_properties, key_entry.tag + 1);
				GlobalMembersGraphics.do_key_sample(this_plot, key, key_entry.text, t, xl, yl);
				}
				yl = yl - key_entry_height;
			}
			GlobalMembersGadgets.free_labels(this_plot.labels);
			this_plot.labels = DefineConstants.NULL;
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
//ORIGINAL LINE: this_plot->lp_properties = save_lp;
			this_plot.lp_properties.copyFrom(save_lp);
			}

		}
		else if (this_plot.title != null && this_plot.title == null)
		{
			localkey = false;
		}
		else if (this_plot.plot_type == PLOT_TYPE.NODATA)
		{
			localkey = false;
		}
		else
		{
			GlobalMembersTerm.ignore_enhanced(this_plot.title_no_enhanced);
			/* don't write filename or function enhanced */
			if (localkey && this_plot.title != null && !this_plot.title_is_suppressed)
			{
			key_count++;
			if (key.invert)
				yl = key.bounds.ybot + yl_ref + key_entry_height / 2 - yl;
			GlobalMembersGraphics.do_key_sample(this_plot, key, this_plot.title, t, xl, yl);
			}
			GlobalMembersTerm.ignore_enhanced(false);
		}

		/* If any plots have opted out of autoscaling, we need to recheck */
		/* whether their points are INRANGE or not.                       */
		if (this_plot.noautoscale)
			GlobalMembersGraphics.recheck_ranges(this_plot);

		/* and now the curves, plus any special key requirements */
		/* be sure to draw all lines before drawing any points */
		/* Skip missing/empty curves */
		if (this_plot.plot_type != PLOT_TYPE.NODATA)
		{

			switch (this_plot.plot_style)
			{
			case IMPULSES:
			GlobalMembersGraphics.plot_impulses(this_plot, GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_zero, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_zero);
			break;
			case LINES:
			GlobalMembersGraphics.plot_lines(this_plot);
			break;
			case STEPS:
			GlobalMembersGraphics.plot_steps(this_plot);
			break;
			case FSTEPS:
			GlobalMembersGraphics.plot_fsteps(this_plot);
			break;
			case HISTEPS:
			GlobalMembersGraphics.plot_histeps(this_plot);
			break;
			case POINTSTYLE:
			GlobalMembersGraphics.plot_points(this_plot);
			break;
			case LINESPOINTS:
			GlobalMembersGraphics.plot_lines(this_plot);
			GlobalMembersGraphics.plot_points(this_plot);
			break;
			case DOTS:
			if (localkey && this_plot.title != null && !this_plot.title_is_suppressed)
			{
				if (GlobalMembersTerm.on_page(xl + key_point_offset, yl))
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.point)(xl + key_point_offset, yl, -1);
			}
			GlobalMembersGraphics.plot_dots(this_plot);
			break;
			case YERRORLINES:
			case XERRORLINES:
			case XYERRORLINES:
			GlobalMembersGraphics.plot_lines(this_plot);
			GlobalMembersGraphics.plot_bars(this_plot);
			GlobalMembersGraphics.plot_points(this_plot);
			break;
			case YERRORBARS:
			case XERRORBARS:
			case XYERRORBARS:
			GlobalMembersGraphics.plot_bars(this_plot);
			GlobalMembersGraphics.plot_points(this_plot);
			break;
			case BOXXYERROR:
			case BOXES:
			GlobalMembersGraphics.plot_boxes(this_plot, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_zero);
			break;

			case HISTOGRAMS:
			if (bar_layer == DefineConstants.LAYER_FRONT)
				GlobalMembersGraphics.plot_boxes(this_plot, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_zero);
			/* Draw the bars first, so that the box will cover the bottom half */
			if (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_ERRORBARS.getValue())
			{
				(GlobalMembersTerm.term.linewidth)(GlobalMembersGadgets.histogram_opts.bar_lw);
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: if (!need_fill_border(&default_fillstyle))
				if (!GlobalMembersMisc.need_fill_border(new fill_style_type(GlobalMembersGadgets.default_fillstyle)))
				(GlobalMembersTerm.term.linetype)(this_plot.lp_properties.l_type);
				GlobalMembersGraphics.plot_bars(this_plot);
				GlobalMembersTerm.term_apply_lp_properties((this_plot.lp_properties));
			}
			if (bar_layer != DefineConstants.LAYER_FRONT)
				GlobalMembersGraphics.plot_boxes(this_plot, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_zero);
			break;

			case BOXERROR:
			if (bar_layer != DefineConstants.LAYER_FRONT)
				GlobalMembersGraphics.plot_bars(this_plot);
			GlobalMembersGraphics.plot_boxes(this_plot, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_zero);
			if (bar_layer == DefineConstants.LAYER_FRONT)
				GlobalMembersGraphics.plot_bars(this_plot);
			break;

			case FILLEDCURVES:
			if (this_plot.filledcurves_options.closeto == filledcurves_opts_id.FILLEDCURVES_BETWEEN.getValue())
			{
				GlobalMembersGraphics.plot_betweencurves(this_plot);
				/* FIXME: would like to call plot_lines() here twice, once for the lower */
				/* curve and once for the upper curve(), conditional on need_fill_border */
			}
			else
			{
				GlobalMembersGraphics.plot_filledcurves(this_plot);
				if (GlobalMembersMisc.need_fill_border(this_plot.fill_properties))
				GlobalMembersGraphics.plot_lines(this_plot);
			}
			break;

			case VECTOR:
			GlobalMembersGraphics.plot_vectors(this_plot);
			break;
			case FINANCEBARS:
			GlobalMembersGraphics.plot_f_bars(this_plot);
			break;
			case CANDLESTICKS:
			GlobalMembersGraphics.plot_c_bars(this_plot);
			break;

			case PM3DSURFACE:
			fprintf(stderr, "** warning: can't use pm3d for 2d plots -- please unset pm3d\n");
			break;

			case LABELPOINTS:
			GlobalMembersGraphics.place_labels(this_plot.labels.next, DefineConstants.LAYER_PLOTLABELS, true);
			break;

			case IMAGE:
			this_plot.image_properties.type = t_imagecolor.IC_PALETTE;
			GlobalMembersGraphics.plot_image_or_update_axes(this_plot, false);
			break;

			case RGBIMAGE:
			this_plot.image_properties.type = t_imagecolor.IC_RGB;
			GlobalMembersGraphics.plot_image_or_update_axes(this_plot, false);
			break;

			case RGBA_IMAGE:
			this_plot.image_properties.type = t_imagecolor.IC_RGBA;
			GlobalMembersGraphics.plot_image_or_update_axes(this_plot, false);
			break;

	///#ifdef EAM_OBJECTS
			case CIRCLES:
			GlobalMembersGraphics.plot_circles(this_plot);
			break;
	///#endif
			}
		}


		if (localkey && this_plot.title != null && !this_plot.title_is_suppressed)
		{
			/* we deferred point sample until now */
			if (this_plot.plot_style == PLOT_STYLE.LINESPOINTS && this_plot.lp_properties.p_interval < 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.linetype)(DefineConstants.LT_BACKGROUND);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.point)(xl + key_point_offset, yl, 6);
			GlobalMembersTerm.term_apply_lp_properties(this_plot.lp_properties);
			}
			if (this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT != 0)
			{
			if (this_plot.lp_properties.p_size == DefineConstants.PTSZ_VARIABLE)
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.pointsize)(GlobalMembersGadgets.pointsize);
			if (GlobalMembersTerm.on_page(xl + key_point_offset, yl))
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.point)(xl + key_point_offset, yl, this_plot.lp_properties.p_type);
			}
			if (key.invert)
			yl = key.bounds.ybot + yl_ref + key_entry_height / 2 - yl;
			if (key_count >= key_rows)
			{
			yl = yl_ref;
			xl += key_col_wth;
			key_count = 0;
			}
			else
			yl = yl - key_entry_height;
		}

		/* Sync point for end of this curve (used by svg, post, ...) */
		if (GlobalMembersTerm.term.layer)
			(GlobalMembersTerm.term.layer)(termlayer.TERM_LAYER_AFTER_PLOT);

		}

		/* DRAW TICS AND GRID */
		if (GlobalMembersAxis.grid_layer == 1)
		GlobalMembersGraphics.place_grid();

		/* REDRAW PLOT BORDER */
		if (GlobalMembersGadgets.draw_border != 0 && GlobalMembersGadgets.border_layer == 1)
		GlobalMembersGraphics.plot_border();

		/* Add front colorbox if appropriate */
		if (GlobalMembersPm3d.is_plot_with_colorbox() && GlobalMembersTerm.term.set_color && GlobalMembersGadgets.color_box.layer == DefineConstants.LAYER_FRONT)
			GlobalMembersColor.draw_color_smooth_box(MODE_PLOT_TYPE.MODE_PLOT);

		/* And rectangles */
		GlobalMembersGraphics.place_objects(GlobalMembersGadgets.first_object, 1, 2, GlobalMembersGadgets.clip_area);

		/* PLACE LABELS */
		GlobalMembersGraphics.place_labels(GlobalMembersGadgets.first_label, 1, false);

		/* PLACE HISTOGRAM TITLES */
		GlobalMembersGraphics.place_histogram_titles();

		/* PLACE ARROWS */
		GlobalMembersGraphics.place_arrows(1);

		/* Release the palette if we have used one (PostScript only?) */
		if (GlobalMembersPm3d.is_plot_with_palette() && GlobalMembersTerm.term.previous_palette)
		GlobalMembersTerm.term.previous_palette();

		GlobalMembersTerm.term_end_plot();
	}

/* STR points to a label string, possibly with several lines separated
   by \n.  Return the number of characters in the longest line.  If
   LINES is not NULL, set *LINES to the number of lines in the
   label. */
	public static int label_width(String str, int lines)
	{
		String lab = DefineConstants.NULL;
		String s;
		String e;
		int mlen;
		int len;
		int l;

		if (str == null || str.equals('\0'))
		{
		if (lines != 0)
			lines = 0;
		return (0);
		}

		l = mlen = len = 0;
		lab = GlobalMembersAlloc.gp_alloc(str.length() + 2, "in label_width");
		lab = str;
		lab += "\n";
		s = lab;
		while ((e = (String) tangible.StringFunctions.strChr(s, '\n')) != DefineConstants.NULL)
		{
		e = '\0';
		len = GlobalMembersTerm.estimate_s.length(); // = e-s ?
		if (len > mlen)
			mlen = len;
		if (len != 0 || l != 0 || str.equals('\n'))
			l++;
		s = ++e;
		}
		/* lines = NULL => not interested - div */
		if (lines != 0)
		lines = l;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(lab);
		return (mlen);
	}

/*{{{  map_position, wrapper, which maps double to int */
	public static void map_position(position pos, int x, int y, String what)
	{
		double xx;
		double yy;
		GlobalMembersGraphics.map_position_double(pos, xx, yy, what);
		x = xx;
		y = yy;
	}

/*}}} */

/*{{{  map_position_r */
	public static void map_position_r(position pos, double x, double y, String what)
	{
		switch (pos.scalex)
		{
		case first_axes:
		{
			double xx = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.FIRST_X_AXIS, pos.x, what);
			x = xx * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_scale;
			break;
		}
		case second_axes:
		{
			double xx = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.SECOND_X_AXIS, pos.x, what);
			x = xx * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].term_scale;
			break;
		}
		case graph:
		{
			x = pos.x * (GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft);
			break;
		}
		case screen:
		{
			TERMENTRY t = GlobalMembersTerm.term;
			x = pos.x * (t.xmax - 1);
			break;
		}
		case character:
		{
			register GlobalMembersMouse.struct TERMENTRY * t = GlobalMembersTerm.term;
			x = pos.x * t.h_char;
			break;
		}
		}
		switch (pos.scaley)
		{
		case first_axes:
		{
			double yy = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.FIRST_Y_AXIS, pos.y, what);
			y = yy * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_scale;
			return;
		}
		case second_axes:
		{
			double yy = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.SECOND_Y_AXIS, pos.y, what);
			y = yy * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].term_scale;
			return;
		}
		case graph:
		{
			y = pos.y * (GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot);
			return;
		}
		case screen:
		{
			TERMENTRY t = GlobalMembersTerm.term;
			y = pos.y * (t.ymax - 1);
			return;
		}
		case character:
		{
			register GlobalMembersMouse.struct TERMENTRY * t = GlobalMembersTerm.term;
			y = pos.y * t.v_char;
			break;
		}
		}
	}

/* FIXME HBB 20020225: this is shared with graph3d.c, so it shouldn't
 * be in this module */
	///#if defined(sun386) || defined(AMIGA_SC_6_1)
	//double CheckLog __PROTO((TBOOLEAN, double, double));
	///#endif
	public static void apply_head_properties(arrow_style_type arrow_properties)
	{
		GlobalMembersTerm.curr_arrow_headfilled = arrow_properties.head_filled;
		GlobalMembersTerm.curr_arrow_headlength = 0;
		if (arrow_properties.head_length > 0)
		{
		/* set head length+angle for term->arrow */
		int itmp;
		int x1;
		int x2;
		position headsize = new position(0,0,0,0.,0.,0.);

		headsize.x = arrow_properties.head_length;
		headsize.scalex = arrow_properties.head_lengthunit;

		headsize.y = 1.0; // any value, just avoid log y
		GlobalMembersGraphics.map_position(headsize, x2, itmp, "arrow");

		headsize.x = 0; // measure length from zero
		GlobalMembersGraphics.map_position(headsize, x1, itmp, "arrow");

		GlobalMembersTerm.curr_arrow_headangle = arrow_properties.head_angle;
		GlobalMembersTerm.curr_arrow_headbackangle = arrow_properties.head_backangle;
		GlobalMembersTerm.curr_arrow_headlength = x2 - x1;
		}
	}

	public static void init_histogram(histogram_style histogram, String title)
	{
		if (stackheight != null)
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(stackheight);
		stackheight = DefineConstants.NULL;
		if (histogram != null)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memcpy(histogram,GlobalMembersGadgets.histogram_opts,sizeof(GlobalMembersGadgets.histogram_opts));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset((histogram.title), 0, sizeof(text_label));
		/* Insert in linked list */
		GlobalMembersGadgets.histogram_opts.next = histogram;
		histogram.title.text = title;
		}
	}
	public static void free_histlist(histogram_style hist)
	{
		if (hist == null)
		return;
		if (hist.title.text != null)
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(hist.title.text);
		if (hist.next != null)
		{
		GlobalMembersGraphics.free_histlist(hist.next);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(hist.next);
		hist.next = DefineConstants.NULL;
		}
	}

/* plot_image_or_update_axes:
 * Plot the coordinates similar to the points option except use
 *  pixels.  Check if the data forms a valid image array, i.e.,
 *  one for which points are spaced equidistant along two non-
 *  coincidence vectors.  If the two directions are orthogonal
 *  within some tolerance and they are aligned with the view
 *  box x and y directions, then use the image feature of the
 *  terminal if it has one.  Otherwise, use parallelograms via
 *  the polynomial function.  If it just necessary to update
 *  the axis ranges for `set autoscale`, do so and then return.
 */

	public static void plot_image_or_update_axes(Object plot, boolean update_axes)
	{

		coordinate points;
		int p_count;
		int i;
		double[] w_hyp = new double[2]; // Hyperlane vector and constant
		double b_hyp;
		double[] p_start_corner = new double[2]; // Points used for computing hyperplane.
		double[] p_end_corner = new double[2];
		int K = 0; // Dimensions of image grid. K = <scan line length>, L = <number of scan lines>.
		int L = 0;
		double[] p_mid_corner = new double[2]; // Point representing first corner found, i.e. p(K-1)
		double[] delta_x_grid = {0, 0}; // Spacings between points, two non-orthogonal directions.
		double[] delta_y_grid = {0, 0};
		int[] grid_corner = {-1, -1, -1, -1}; // The corner pixels of the image.
		double[] view_port_x = new double[2]; // Viewable portion of the image.
		double[] view_port_y = new double[2];
		double[] view_port_z = {0,0};
		t_imagecolor pixel_planes;
		boolean project_points = false; // True if 3D plot

		if (((GlobalMembersMouse.struct surface_points *)plot).plot_type == PLOT_TYPE.DATA3D)
		project_points = true;

		if (project_points)
		{
		points = ((GlobalMembersMouse.struct surface_points *)plot).iso_crvs.points;
		p_count = ((GlobalMembersMouse.struct surface_points *)plot).iso_crvs.p_count;
		pixel_planes = ((GlobalMembersMouse.struct surface_points *)plot).image_properties.type;
		}
		else
		{
		points = ((GlobalMembersMouse.struct curve_points *)plot).points;
		p_count = ((GlobalMembersMouse.struct curve_points *)plot).p_count;
		pixel_planes = ((GlobalMembersMouse.struct curve_points *)plot).image_properties.type;
		}

		if (p_count < 1)
		{
		fprintf(stderr, "\nGNUPLOT (plot_image):  " "No points (visible or invisible) to plot.\n\n");
		return;
		}

		if (p_count < 4)
		{
		fprintf(stderr, "\nGNUPLOT (plot_image):  " "Image grid must be at least 4 points (2 x 2).\n\n");
		return;
		}

		/* Check if the pixel data forms a valid rectangular grid for potential image
		 * matrix support.  A general grid orientation is considered.  If the grid
		 * points are orthogonal and oriented along the x/y dimensions the terminal
		 * function for images will be used.  Otherwise, the terminal function for
		 * filled polygons are used to construct parallelograms for the pixel elements.
		 */

		/* Compute the hyperplane representation of the cross diagonal from
		 * the very first point of the scan to the very last point of the
		 * scan.
		 */
		if (project_points)
		{
		GlobalMembersUtil3d.map3d_xy_double(points[0].x, points[0].y, points[0].z, p_start_corner[0], p_start_corner[1]);
		GlobalMembersUtil3d.map3d_xy_double(points[p_count - 1].x, points[p_count - 1].y, points[p_count - 1].z, p_end_corner[0], p_end_corner[1]);
		}
		else
		{
		p_start_corner[0] = points[0].x;
		p_start_corner[1] = points[0].y;
		p_end_corner[0] = points[p_count - 1].x;
		p_end_corner[1] = points[p_count - 1].y;
		}

		GlobalMembersGraphics.hyperplane_between_points(p_start_corner, p_end_corner, w_hyp, b_hyp);

		for (K = p_count, i = 1; i < p_count; i++)
		{
		double[] p = new double[2];
		if (project_points)
		{
			GlobalMembersUtil3d.map3d_xy_double(points[i].x, points[i].y, points[i].z, p[0], p[1]);
		}
		else
		{
			p[0] = points[i].x;
			p[1] = points[i].y;
		}
		if (i == 1)
		{
			/* Determine what side (sign) of the hyperplane the second point is on.
			 * If the second point is on the negative side of the plane, change
			 * the sign of hyperplane variables.  Then any remaining points on the
			 * first line will test positive in the hyperplane formula.  The first
			 * point on the second line will test negative.
			 */
			if ((w_hyp[0] * p[0] + w_hyp[1] * p[1] + b_hyp) < 0)
			{
			w_hyp[0] = -w_hyp[0];
			w_hyp[1] = -w_hyp[1];
			b_hyp = -b_hyp;
			}
		}
		else
		{
			/* The first point on the opposite side of the hyperplane is the
			 * candidate for the first point of the second scan line.
			 */
			if ((w_hyp[0] * p[0] + w_hyp[1] * p[1] + b_hyp) < 0)
			{
			K = i;
			break;
			}
		}
		}

		if (K == p_count)
		{
		fprintf(stderr, "\nGNUPLOT (plot_image):  " "Image grid must be at least 2 x 2.\n\n");
		return;
		}
		L = p_count / K;
		if (((double)L) != ((double)p_count / K))
		{
		fprintf(stderr, "\nGNUPLOT (plot_image):  " "Number of pixels cannot be factored into integers matching grid. N = %d  K = %d\n\n", p_count, K);
		return;
		}
		grid_corner[0] = 0;
		grid_corner[1] = K - 1;
		grid_corner[3] = p_count - 1;
		grid_corner[2] = p_count - K;
		if (project_points)
		{
		GlobalMembersUtil3d.map3d_xy_double(points[K - 1].x, points[K - 1].y, points[K - 1].z, p_mid_corner[0], p_mid_corner[1]);
		}
		else
		{
		p_mid_corner[0] = points[K - 1].x;
		p_mid_corner[1] = points[K - 1].y;
		}
		/* The grid spacing in one direction. */
		delta_x_grid[0] = (p_mid_corner[0] - p_start_corner[0]) / (K - 1);
		delta_y_grid[0] = (p_mid_corner[1] - p_start_corner[1]) / (K - 1);
		/* The grid spacing in the second direction. */
		delta_x_grid[1] = (p_end_corner[0] - p_mid_corner[0]) / (L - 1);
		delta_y_grid[1] = (p_end_corner[1] - p_mid_corner[1]) / (L - 1);

		if (update_axes)
		{
		for (i = 0; i < 4; i++)
		{
			coord_type dummy_type = coord_type.INRANGE;
			double x = points[grid_corner[i]].x;
			double y = points[grid_corner[i]].y;
			x -= (points[grid_corner[(5 - i) % 4]].x - points[grid_corner[i]].x) / (2 * (K - 1));
			y -= (points[grid_corner[(5 - i) % 4]].y - points[grid_corner[i]].y) / (2 * (K - 1));
			x -= (points[grid_corner[(i + 2) % 4]].x - points[grid_corner[i]].x) / (2 * (L - 1));
			y -= (points[grid_corner[(i + 2) % 4]].y - points[grid_corner[i]].y) / (2 * (L - 1));
			/* Update range and store value back into itself. */
			do
			{
				if (((GlobalMembersMouse.struct curve_points *)plot).x_axis == DefineConstants.NO_AXIS)
					break;
					if (!(x > -DefineConstants.VERYLARGE && x < DefineConstants.VERYLARGE))
					{
						dummy_type = coord_type.UNDEFINED;
						x = -DefineConstants.VERYLARGE;
						break;
					}
					if (GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].log)
					{
						if (x < 0.0)
						{
							dummy_type = coord_type.UNDEFINED;
							x = -DefineConstants.VERYLARGE;
							break;
						}
						else if (x == 0.0)
						{
							x = -DefineConstants.VERYLARGE;
							dummy_type = coord_type.OUTRANGE;
							()0;
							break;
						}
						else
						{
							x = (Math.log(x) / GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].log_base);
						}
					}
					else
						x = x;
						if (((GlobalMembersMouse.struct curve_points *)plot).noautoscale)
							break;
							if (dummy_type != coord_type.INRANGE)
								break;
								if ((int)((GlobalMembersMouse.struct curve_points *)plot).x_axis < 0)
									break;
									if (x < GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].data_min)
										GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].data_min = x;
										if (x < GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].min)
										{
											if (GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
												GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].min = x;
												else
												{
													dummy_type = coord_type.OUTRANGE;
													()0;
													break;
												}
										}
										if (x > GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].data_max)
											GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].data_max = x;
											if (x > GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].max)
											{
												if (GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
													GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).x_axis].max = x;
													else
													{
														dummy_type = coord_type.OUTRANGE;
														()0;
													}
											}
			} while (0);
			do
			{
				if (((GlobalMembersMouse.struct curve_points *)plot).y_axis == DefineConstants.NO_AXIS)
					break;
					if (!(y > -DefineConstants.VERYLARGE && y < DefineConstants.VERYLARGE))
					{
						dummy_type = coord_type.UNDEFINED;
						y = -DefineConstants.VERYLARGE;
						break;
					}
					if (GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].log)
					{
						if (y < 0.0)
						{
							dummy_type = coord_type.UNDEFINED;
							y = -DefineConstants.VERYLARGE;
							break;
						}
						else if (y == 0.0)
						{
							y = -DefineConstants.VERYLARGE;
							dummy_type = coord_type.OUTRANGE;
							()0;
							break;
						}
						else
						{
							y = (Math.log(y) / GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].log_base);
						}
					}
					else
						y = y;
						if (((GlobalMembersMouse.struct curve_points *)plot).noautoscale)
							break;
							if (dummy_type != coord_type.INRANGE)
								break;
								if ((int)((GlobalMembersMouse.struct curve_points *)plot).y_axis < 0)
									break;
									if (y < GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].data_min)
										GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].data_min = y;
										if (y < GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].min)
										{
											if (GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
												GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].min = y;
												else
												{
													dummy_type = coord_type.OUTRANGE;
													()0;
													break;
												}
										}
										if (y > GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].data_max)
											GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].data_max = y;
											if (y > GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].max)
											{
												if (GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
													GlobalMembersAxis.axis_array[((GlobalMembersMouse.struct curve_points *)plot).y_axis].max = y;
													else
													{
														dummy_type = coord_type.OUTRANGE;
														()0;
													}
											}
			} while (0);
		}
		return;
		}

		/* Check if the pixel grid is orthogonal and oriented with axes.
		 * If so, then can use efficient terminal image routines.
		 */
		{
		boolean rectangular_image = false;
		boolean fallback = false;

	///#define SHIFT_TOLERANCE 0.01
		if (((Math.abs(delta_x_grid[0]) < DefineConstants.SHIFT_TOLERANCE * Math.abs(delta_x_grid[1])) || (Math.abs(delta_x_grid[1]) < DefineConstants.SHIFT_TOLERANCE * Math.abs(delta_x_grid[0]))) && ((Math.abs(delta_y_grid[0]) < DefineConstants.SHIFT_TOLERANCE * Math.abs(delta_y_grid[1])) || (Math.abs(delta_y_grid[1]) < DefineConstants.SHIFT_TOLERANCE * Math.abs(delta_y_grid[0]))))
		{

		rectangular_image = true;

		/* If the terminal does not have image support then fall back to
		 * using polygons to construct pixels.
		 */
		if (project_points)
			fallback = GlobalMembersGraph3d.splot_map == 0 || ((GlobalMembersMouse.struct surface_points *)plot).image_properties.fallback;
		else
			fallback = ((GlobalMembersMouse.struct curve_points *)plot).image_properties.fallback;
		}

		if (pixel_planes == t_imagecolor.IC_PALETTE && GlobalMembersColor.make_palette() != 0)
		{
		/* int_warn(NO_CARET, "This terminal does not support palette-based images.\n\n"); */
		return;
		}
		if ((pixel_planes == t_imagecolor.IC_RGB || pixel_planes == t_imagecolor.IC_RGBA) && !GlobalMembersTerm.term.set_color)
		{
		/* int_warn(NO_CARET, "This terminal does not support rgb images.\n\n"); */
		return;
		}
		/* Use generic code to handle alpha channel if the terminal can't */
		if (pixel_planes == t_imagecolor.IC_RGBA && !(GlobalMembersTerm.term.flags & DefineConstants.TERM_ALPHA_CHANNEL))
		fallback = true;

		view_port_x[0] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].set_autoscale & e_autoscale.AUTOSCALE_MIN) ? GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min : GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].set_min;
		view_port_x[1] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].set_autoscale & e_autoscale.AUTOSCALE_MAX) ? GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max : GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].set_max;
		view_port_y[0] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].set_autoscale & e_autoscale.AUTOSCALE_MIN) ? GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min : GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].set_min;
		view_port_y[1] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].set_autoscale & e_autoscale.AUTOSCALE_MAX) ? GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max : GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].set_max;
		if (project_points)
		{
		view_port_z[0] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].set_autoscale & e_autoscale.AUTOSCALE_MIN) ? GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min : GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].set_min;
		view_port_z[1] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].set_autoscale & e_autoscale.AUTOSCALE_MAX) ? GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max : GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].set_max;
		}

		if (rectangular_image && GlobalMembersTerm.term.image && !fallback)
		{

		/* There are eight ways that a valid pixel grid can be entered.  Use table
		 * lookup instead of if() statements.  (Draw the various array combinations
		 * on a sheet of paper, or see the README file.)
		 */
		int line_length;
		int i_delta_pixel;
		int i_delta_line;
		int i_start;
		int pixel_1_1;
		int pixel_M_N;
		double image;
		int array_size;
		float xsts;
		float ysts;

		if (!project_points)
		{
			/* Determine axis direction according to the sign of the terminal scale. */
			xsts = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale > 0 ? + 1 : -1);
			ysts = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale > 0 ? + 1 : -1);
		}
		else
		{
			/* 3D plots do not use the term_scale mechanism AXIS_SETSCALE(). */
			xsts = 1F;
			ysts = 1F;
		}

		/* Set up parameters for indexing through the image matrix to transfer data.
		 * These formulas were derived for a terminal image routine which uses the
		 * upper left corner as pixel (1,1).
		 */
		if (Math.abs(delta_x_grid[0]) > Math.abs(delta_x_grid[1]))
		{
			line_length = K;
			i_start = (delta_y_grid[1] * ysts > 0 ? L : 1) * K - (delta_x_grid[0] * xsts > 0 ? K : 1);
			i_delta_pixel = (delta_x_grid[0] * xsts > 0 ? + 1 : -1);
			i_delta_line = (delta_x_grid[0] * xsts > 0 ? - K : +K) + (delta_y_grid[1] * ysts > 0 ? - K : +K);
		}
		else
		{
			line_length = L;
			i_start = (delta_x_grid[1] * xsts > 0 ? 1 : L) * K - (delta_y_grid[0] * ysts > 0 ? 1 : K);
			i_delta_pixel = (delta_x_grid[1] * xsts > 0 ? + K : -K);
			i_delta_line = K * L * (delta_x_grid[1] * xsts > 0 ? - 1 : +1) + (delta_y_grid[0] * ysts > 0 ? - 1 : +1);
		}

		/* Assign enough memory for the maximum image size. */
		array_size = K * L;

		/* If doing color, multiply size by three for RGB triples. */
		if (pixel_planes == t_imagecolor.IC_RGB)
			array_size *= 3;
		else if (pixel_planes == t_imagecolor.IC_RGBA)
			array_size *= 4;

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		image = (Double) GlobalMembersAlloc.gp_alloc(array_size * sizeof(image[0]), "image");

		/* Place points into image array based upon the arrangement of point indices and
		 * the visibility of pixels.
		 */
		if (image != DefineConstants.NULL)
		{

			int j;
			gpiPoint[] corners = new gpiPoint[4];
			int M = 0; /* M = number of columns, N = number of rows.  (K and L don't
			int N = 0;
					* have a set direction, but M and N do.)
					*/
			int i_image;
			int i_sub_image = 0;
			double d_x_o_2;
			double d_y_o_2;
			double d_z_o_2;
			int line_pixel_count = 0;

			d_x_o_2 = ((points[grid_corner[0]].x - points[grid_corner[1]].x) / (K - 1) + (points[grid_corner[0]].x - points[grid_corner[2]].x) / (L - 1)) / 2;
			d_y_o_2 = ((points[grid_corner[0]].y - points[grid_corner[1]].y) / (K - 1) + (points[grid_corner[0]].y - points[grid_corner[2]].y) / (L - 1)) / 2;
			d_z_o_2 = ((points[grid_corner[0]].z - points[grid_corner[1]].z) / (K - 1) + (points[grid_corner[0]].z - points[grid_corner[2]].z) / (L - 1)) / 2;

			pixel_1_1 = -1;
			pixel_M_N = -1;

			/* Step through the points placing them in the proper spot in the matrix array. */
			for (i = 0, j = line_length, i_image = i_start; i < p_count; i++)
			{

			boolean visible;
			double x;
			double y;
			double z;
			double x_low;
			double x_high;
			double y_low;
			double y_high;
			double z_low;
			double z_high;

			x = points[i_image].x;
			y = points[i_image].y;
			z = points[i_image].z;
			x_low = x - d_x_o_2;
			x_high = x + d_x_o_2;
			y_low = y - d_y_o_2;
			y_high = y + d_y_o_2;
			z_low = z - d_z_o_2;
			z_high = z + d_z_o_2;

			/* Check if a portion of this pixel will be visible.  Do not use the
			 * points[i].type == INRANGE test because a portion of a pixel can
			 * extend into view and the INRANGE type doesn't account for this.
			 *
			 * This series of tests is designed for speed.  If one of the corners
			 * of the pixel in question falls in the view port range then the pixel
			 * will be visible.  Do this test first because it is the more likely
			 * of situations.  It could also happen that the view port is smaller
			 * than a pixel.  In that case, if one of the view port corners lands
			 * inside the pixel then the pixel in question will be visible.  This
			 * won't be as common, so do those tests last.  Set up the if structure
			 * in such a way that as soon as one of the tests is true, the conditional
			 * tests stop.
			 */
			if (((((view_port_x[0])<(view_port_x[1])) ? (((x_low) >= (view_port_x[0])) && ((x_low) <= (view_port_x[1]))) : (((x_low) >= (view_port_x[1])) && ((x_low) <= (view_port_x[0])))) || (((view_port_x[0])<(view_port_x[1])) ? (((x_high) >= (view_port_x[0])) && ((x_high) <= (view_port_x[1]))) : (((x_high) >= (view_port_x[1])) && ((x_high) <= (view_port_x[0]))))) && ((((view_port_y[0])<(view_port_y[1])) ? (((y_low) >= (view_port_y[0])) && ((y_low) <= (view_port_y[1]))) : (((y_low) >= (view_port_y[1])) && ((y_low) <= (view_port_y[0])))) || (((view_port_y[0])<(view_port_y[1])) ? (((y_high) >= (view_port_y[0])) && ((y_high) <= (view_port_y[1]))) : (((y_high) >= (view_port_y[1])) && ((y_high) <= (view_port_y[0]))))) && (!project_points || (((view_port_z[0])<(view_port_z[1])) ? (((z_low) >= (view_port_z[0])) && ((z_low) <= (view_port_z[1]))) : (((z_low) >= (view_port_z[1])) && ((z_low) <= (view_port_z[0])))) || (((view_port_z[0])<(view_port_z[1])) ? (((z_high) >= (view_port_z[0])) && ((z_high) <= (view_port_z[1]))) : (((z_high) >= (view_port_z[1])) && ((z_high) <= (view_port_z[0]))))))
				visible = true;
			else if (((((x_low)<(x_high)) ? (((view_port_x[0]) >= (x_low)) && ((view_port_x[0]) <= (x_high))) : (((view_port_x[0]) >= (x_high)) && ((view_port_x[0]) <= (x_low)))) || (((x_low)<(x_high)) ? (((view_port_x[1]) >= (x_low)) && ((view_port_x[1]) <= (x_high))) : (((view_port_x[1]) >= (x_high)) && ((view_port_x[1]) <= (x_low))))) && ((((y_low)<(y_high)) ? (((view_port_y[0]) >= (y_low)) && ((view_port_y[0]) <= (y_high))) : (((view_port_y[0]) >= (y_high)) && ((view_port_y[0]) <= (y_low)))) || (((y_low)<(y_high)) ? (((view_port_y[1]) >= (y_low)) && ((view_port_y[1]) <= (y_high))) : (((view_port_y[1]) >= (y_high)) && ((view_port_y[1]) <= (y_low))))) && (!project_points || (((z_low)<(z_high)) ? (((view_port_z[0]) >= (z_low)) && ((view_port_z[0]) <= (z_high))) : (((view_port_z[0]) >= (z_high)) && ((view_port_z[0]) <= (z_low)))) || (((z_low)<(z_high)) ? (((view_port_z[1]) >= (z_low)) && ((view_port_z[1]) <= (z_high))) : (((view_port_z[1]) >= (z_high)) && ((view_port_z[1]) <= (z_low))))))
				visible = true;
			else
				visible = false;

			if (visible)
			{
				if (pixel_1_1 < 0)
				{
				/* First visible point. */
				pixel_1_1 = i_image;
				M = 0;
				N = 1;
				line_pixel_count = 1;
				}
				else
				{
				if (line_pixel_count == 0)
					N += 1;
				line_pixel_count++;
				if ((N != 1) && (line_pixel_count > M))
				{
					fprintf(stderr, "\nGNUPLOT (plot_image):  " "Visible pixel grid has a scan line longer than previous scan lines.");
					return;
				}
				}

				pixel_M_N = i_image;

				if (pixel_planes == t_imagecolor.IC_PALETTE)
				{
				image[i_sub_image++] = GlobalMembersPm3d.cb2gray(points[i_image].ylow);
				}
				else
				{
				image[i_sub_image++] = GlobalMembersPm3d.cb2gray(points[i_image].yhigh);
				image[i_sub_image++] = GlobalMembersPm3d.cb2gray(points[i_image].xlow);
				image[i_sub_image++] = GlobalMembersPm3d.cb2gray(points[i_image].xhigh);
				if (pixel_planes == t_imagecolor.IC_RGBA)
					image[i_sub_image++] = points[i_image].ylow;
				}

			}

			i_image += i_delta_pixel;
			j--;
			if (j == 0)
			{
				if (M == 0)
				M = line_pixel_count;
				else if ((line_pixel_count > 0) && (line_pixel_count != M))
				{
				fprintf(stderr, "\nGNUPLOT (plot_image):  " "Visible pixel grid has a scan line shorter than previous scan lines.");
				return;
				}
				line_pixel_count = 0;
				i_image += i_delta_line;
				j = line_length;
			}
			}

			if ((M > 0) && (N > 0))
			{

			/* The information collected to this point is:
			 *
			 * M = <number of columns>
			 * N = <number of rows>
			 * image[] = M x N array of pixel data.
			 * pixel_1_1 = position in points[] associated with pixel (1,1)
			 * pixel_M_N = position in points[] associated with pixel (M,N)
			 */

			/* One of the delta values in each direction is zero, so add. */
			if (project_points)
			{
				double x;
				double y;
				GlobalMembersUtil3d.map3d_xy_double(points[pixel_1_1].x, points[pixel_1_1].y, points[pixel_1_1].z, x, y);
				corners[0].x = x - Math.abs(delta_x_grid[0] + delta_x_grid[1]) / 2;
				corners[0].y = y + Math.abs(delta_y_grid[0] + delta_y_grid[1]) / 2;
				GlobalMembersUtil3d.map3d_xy_double(points[pixel_M_N].x, points[pixel_M_N].y, points[pixel_M_N].z, x, y);
				corners[1].x = x + Math.abs(delta_x_grid[0] + delta_x_grid[1]) / 2;
				corners[1].y = y - Math.abs(delta_y_grid[0] + delta_y_grid[1]) / 2;
				GlobalMembersUtil3d.map3d_xy_double(view_port_x[0], view_port_y[0], view_port_z[0], x, y);
				corners[2].x = x;
				corners[2].y = y;
				GlobalMembersUtil3d.map3d_xy_double(view_port_x[1], view_port_y[1], view_port_z[1], x, y);
				corners[3].x = x;
				corners[3].y = y;
			}
			else
			{
				corners[0].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((points[pixel_1_1].x - xsts * Math.abs(d_x_o_2)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				corners[0].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((points[pixel_1_1].y + ysts * Math.abs(d_y_o_2)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				corners[1].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((points[pixel_M_N].x + xsts * Math.abs(d_x_o_2)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				corners[1].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((points[pixel_M_N].y - ysts * Math.abs(d_y_o_2)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				corners[2].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((view_port_x[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				corners[2].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((view_port_y[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				corners[3].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((view_port_x[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				corners[3].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((view_port_y[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			}

			if ((pixel_planes == t_imagecolor.IC_PALETTE) || (pixel_planes == t_imagecolor.IC_RGB) || (pixel_planes == t_imagecolor.IC_RGBA))
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*GlobalMembersTerm.term.image)(M, N, image, corners, pixel_planes);
			else
				fprintf(stderr, "\nGNUPLOT (plot_image):  " "Invalid pixel color planes specified.\n\n");
			}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free((Object)image);

		}
		else
		{
			fprintf(stderr, "\nGNUPLOT (plot_image):  " "Could not allocate memory for image.");
			return;
		}

		} // no term->image  or "with image failsafe"
		else
		{

		/* Use sum of vectors to compute the pixel corners with respect to its center. */
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	GlobalMembersMouse.struct
	//	{
	//		double x;
	//		double y;
	//		double z;
	//	}
		delta_grid[2], delta_pixel[2];
		int j;
		int i_image;

		if (!GlobalMembersTerm.term.filled_polygon)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "This terminal does not support filled polygons");

		/* Grid spacing in 3D space. */
		delta_grid[0].x = (points[grid_corner[1]].x - points[grid_corner[0]].x) / (K - 1);
		delta_grid[0].y = (points[grid_corner[1]].y - points[grid_corner[0]].y) / (K - 1);
		delta_grid[0].z = (points[grid_corner[1]].z - points[grid_corner[0]].z) / (K - 1);
		delta_grid[1].x = (points[grid_corner[2]].x - points[grid_corner[0]].x) / (L - 1);
		delta_grid[1].y = (points[grid_corner[2]].y - points[grid_corner[0]].y) / (L - 1);
		delta_grid[1].z = (points[grid_corner[2]].z - points[grid_corner[0]].z) / (L - 1);

		/* Pixel dimensions in the 3D space. */
		delta_pixel[0].x = (delta_grid[0].x + delta_grid[1].x) / 2;
		delta_pixel[0].y = (delta_grid[0].y + delta_grid[1].y) / 2;
		delta_pixel[0].z = (delta_grid[0].z + delta_grid[1].z) / 2;
		delta_pixel[1].x = (delta_grid[0].x - delta_grid[1].x) / 2;
		delta_pixel[1].y = (delta_grid[0].y - delta_grid[1].y) / 2;
		delta_pixel[1].z = (delta_grid[0].z - delta_grid[1].z) / 2;

		i_image = 0;

		for (j = 0; j < L; j++)
		{

			double x_line_start;
			double y_line_start;
			double z_line_start;

			x_line_start = points[grid_corner[0]].x + j * delta_grid[1].x;
			y_line_start = points[grid_corner[0]].y + j * delta_grid[1].y;
			z_line_start = points[grid_corner[0]].z + j * delta_grid[1].z;

			for (i = 0; i < K; i++)
			{

			double x;
			double y;
			double z;
			boolean view_in_pixel = false;
			int corners_in_view = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//		GlobalMembersMouse.struct // Parallelogram corners.
	//		{
	//			double x;
	//			double y;
	//			double z;
	//		}
			p_corners[4];
			int k;

			/* If terminal can't handle alpha, treat it as all-or-none. */
			if (pixel_planes == t_imagecolor.IC_RGBA)
			{
				if ((points[i_image].ylow == 0) || (points[i_image].ylow < 128 && !(GlobalMembersTerm.term.flags & DefineConstants.TERM_ALPHA_CHANNEL)))
				{
				i_image++;
				continue;
				}
			}

			x = x_line_start + i * delta_grid[0].x;
			y = y_line_start + i * delta_grid[0].y;
			z = z_line_start + i * delta_grid[0].z;

			p_corners[0].x = x + delta_pixel[0].x;
			p_corners[0].y = y + delta_pixel[0].y;
			p_corners[0].z = z + delta_pixel[0].z;
			p_corners[1].x = x + delta_pixel[1].x;
			p_corners[1].y = y + delta_pixel[1].y;
			p_corners[1].z = z + delta_pixel[1].z;
			p_corners[2].x = x - delta_pixel[0].x;
			p_corners[2].y = y - delta_pixel[0].y;
			p_corners[2].z = z - delta_pixel[0].z;
			p_corners[3].x = x - delta_pixel[1].x;
			p_corners[3].y = y - delta_pixel[1].y;
			p_corners[3].z = z - delta_pixel[1].z;

			/* Check if any of the corners are viewable */
			for (k = 0; k < 4; k++)
			{
				if ((((view_port_x[0])<(view_port_x[1])) ? (((p_corners[k].x) >= (view_port_x[0])) && ((p_corners[k].x) <= (view_port_x[1]))) : (((p_corners[k].x) >= (view_port_x[1])) && ((p_corners[k].x) <= (view_port_x[0])))) && (((view_port_y[0])<(view_port_y[1])) ? (((p_corners[k].y) >= (view_port_y[0])) && ((p_corners[k].y) <= (view_port_y[1]))) : (((p_corners[k].y) >= (view_port_y[1])) && ((p_corners[k].y) <= (view_port_y[0])))) && ((((view_port_z[0])<(view_port_z[1])) ? (((p_corners[k].z) >= (view_port_z[0])) && ((p_corners[k].z) <= (view_port_z[1]))) : (((p_corners[k].z) >= (view_port_z[1])) && ((p_corners[k].z) <= (view_port_z[0])))) || !project_points || GlobalMembersGraph3d.splot_map != 0))
					corners_in_view++;
			}

			if (corners_in_view > 0 || view_in_pixel)
			{

				int N_corners = 0; // Number of corners.
				gpiPoint[] corners = new gpiPoint[5]; // At most 5 corners.

				corners[0].style = t_fillstyle.FS_DEFAULT.getValue();

				if (corners_in_view > 0)
				{
				int i_corners;

				N_corners = 4;

				for (i_corners = 0; i_corners < N_corners; i_corners++)
				{
					if (project_points)
					{
						GlobalMembersUtil3d.map3d_xy_double(p_corners[i_corners].x, p_corners[i_corners].y, p_corners[i_corners].z, x, y);
						corners[i_corners].x = x;
						corners[i_corners].y = y;
					}
					else
					{
						corners[i_corners].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((p_corners[i_corners].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
						corners[i_corners].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((p_corners[i_corners].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
					}
					/* Clip rectangle if necessary */
					if (rectangular_image && GlobalMembersTerm.term.fillbox && corners_in_view < 4)
					{
					if (corners[i_corners].x < GlobalMembersGadgets.clip_area.xleft)
						corners[i_corners].x = GlobalMembersGadgets.clip_area.xleft;
					if (corners[i_corners].x > GlobalMembersGadgets.clip_area.xright)
						corners[i_corners].x = GlobalMembersGadgets.clip_area.xright;
					if (corners[i_corners].y > GlobalMembersGadgets.clip_area.ytop)
						corners[i_corners].y = GlobalMembersGadgets.clip_area.ytop;
					if (corners[i_corners].y < GlobalMembersGadgets.clip_area.ybot)
						corners[i_corners].y = GlobalMembersGadgets.clip_area.ybot;
					}
				}
				}
				else
				{
				/* DJS FIXME:
				 * Could still be visible if any of the four corners of the view port are
				 * within the parallelogram formed by the pixel.  This is tricky geometry.
				 */
				}

				if (N_corners > 0)
				{
				if (pixel_planes == t_imagecolor.IC_PALETTE)
				{
					if (isnan(points[i_image].ylow))
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto skip_pixel;
					GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(points[i_image].ylow));
				}
				else
				{
					int r = GlobalMembersPm3d.cb2gray(points[i_image].yhigh) * 255.+ 0.5;
					int g = GlobalMembersPm3d.cb2gray(points[i_image].xlow) * 255.+ 0.5;
					int b = GlobalMembersPm3d.cb2gray(points[i_image].xhigh) * 255.+ 0.5;
					int rgblt = (r << 16) + (g << 8) + b;
					GlobalMembersColor.set_rgbcolor(rgblt);
				}
				if (pixel_planes == t_imagecolor.IC_RGBA)
				{
					int alpha = points[i_image].ylow * 100./255.;
					if (alpha == 0)
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto skip_pixel;
					if (GlobalMembersTerm.term.flags & DefineConstants.TERM_ALPHA_CHANNEL != 0)
					corners[0].style = t_fillstyle.FS_TRANSPARENT_SOLID.getValue() + (alpha << 4);
				}

				if (rectangular_image && GlobalMembersTerm.term.fillbox)
				{
					/* Some terminals (canvas) can do filled rectangles */
					/* more efficiently than filled polygons. */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*GlobalMembersTerm.term.fillbox)(corners[0].style, ((corners[0].x) < (corners[2].x) ? (corners[0].x) : (corners[2].x)), ((corners[0].y) < (corners[2].y) ? (corners[0].y) : (corners[2].y)), Math.abs(corners[2].x - corners[0].x), Math.abs(corners[2].y - corners[0].y));
				}
				else
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*GlobalMembersTerm.term.filled_polygon)(N_corners, corners);
				}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	skip_pixel:
			i_image++;
			}
		}
		}
		}

	}

///#ifdef EAM_OBJECTS

	///#ifdef EAM_OBJECTS
	public static void place_objects(object listhead, int layer, int dimensions, BoundingBox clip_area)
	{
		object this_object;
		double x1;
		double y1;
		int style;

		for (this_object = listhead; this_object != DefineConstants.NULL; this_object = this_object.next)
		{
		lp_style_type lpstyle = new lp_style_type();
		fill_style_type fillstyle;

		if (this_object.layer != layer)
			continue;

		/* Extract line and fill style, but don't apply it yet */
		if (this_object.lp_properties.l_type == DefineConstants.LT_DEFAULT && this_object.object_type == DefineConstants.OBJ_RECTANGLE)
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
//ORIGINAL LINE: lpstyle = default_rectangle.lp_properties;
			lpstyle.copyFrom(GlobalMembersGadgets.default_rectangle.lp_properties);
		else
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
//ORIGINAL LINE: lpstyle = this_object->lp_properties;
			lpstyle.copyFrom(this_object.lp_properties);

		if (this_object.fillstyle.fillstyle == t_fillstyle.FS_DEFAULT.getValue() && this_object.object_type == DefineConstants.OBJ_RECTANGLE)
			fillstyle = GlobalMembersGadgets.default_rectangle.fillstyle;
		else
			fillstyle = this_object.fillstyle;
		style = GlobalMembersTerm.style_from_fill(fillstyle);

		switch (this_object.object_type)
		{

		case DefineConstants.OBJ_CIRCLE:
		{
			circle e = this_object.o.circle;
			double radius;
			double junk;

			if (dimensions == 2 || e.center.scalex == position_type.screen)
			{
			GlobalMembersGraphics.map_position_double(e.center, x1, y1, "rect");
			GlobalMembersGraphics.map_position_r(e.extent, radius, junk, "rect");
			}
			else if (GlobalMembersGraph3d.splot_map != 0)
			{
			int junkw;
			int junkh;
			GlobalMembersGraph3d.map3d_position_double(e.center, x1, y1, "rect");
			GlobalMembersGraph3d.map3d_position_r(e.extent, junkw, junkh, "rect");
			radius = junkw;
			}
			else
			break;

			GlobalMembersTerm.term_apply_lp_properties(lpstyle);

			GlobalMembersTerm.do_arc((int)x1, (int)y1, radius, e.arc_begin, e.arc_end, style);

			/* Retrace the border if the style requests it */
			if (GlobalMembersMisc.need_fill_border(fillstyle))
			GlobalMembersTerm.do_arc((int)x1, (int)y1, radius, e.arc_begin, e.arc_end, 0);

			break;
		}

		case DefineConstants.OBJ_ELLIPSE:
		{
			GlobalMembersTerm.term_apply_lp_properties(lpstyle);

			if (dimensions == 2)
			GlobalMembersGraphics.do_ellipse(2, this_object.o.ellipse, style);
			else if (GlobalMembersGraph3d.splot_map != 0)
			GlobalMembersGraphics.do_ellipse(3, this_object.o.ellipse, style);
			else
			break;

			/* Retrace the border if the style requests it */
			if (GlobalMembersMisc.need_fill_border(fillstyle))
			GlobalMembersGraphics.do_ellipse(dimensions, this_object.o.ellipse, 0);

			break;
		}

		case DefineConstants.OBJ_POLYGON:
		{
			GlobalMembersTerm.term_apply_lp_properties(lpstyle);

			GlobalMembersGraphics.do_polygon(dimensions, this_object.o.polygon, style);

			/* Retrace the border if the style requests it */
			if (GlobalMembersMisc.need_fill_border(fillstyle))
				GlobalMembersGraphics.do_polygon(dimensions, this_object.o.polygon, 0);

			break;
		}

		case DefineConstants.OBJ_RECTANGLE:
		{
			GlobalMembersGraphics.do_rectangle(dimensions, this_object, style);
			break;
		}

		default:
			break;
		} // End switch(object_type)


		}
	}
	public static void do_ellipse(int dimensions, ellipse e, int style)
	{
		gpiPoint[] vertex = new gpiPoint[120];
		int i;
		double angle;
		double cx;
		double cy;
		double xoff;
		double yoff;
		int junkw;
		int junkh;
		double cosO = Math.cos(DefineConstants.M_PI / 180.0 * e.orientation);
		double sinO = Math.sin(DefineConstants.M_PI / 180.0 * e.orientation);
		double A = e.extent.x / 2.0; // Major axis radius
		double B = e.extent.y / 2.0; // Minor axis radius
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: struct position pos = e->extent;
		position pos = new position(e.extent); // working copy with axis info attached

		/* Choose how many segments to draw for this ellipse */
		int segments = 72;
		double ang_inc = DefineConstants.M_PI / 36.;

		/* Find the center of the ellipse */
		if (dimensions == 2)
		GlobalMembersGraphics.map_position_double(e.center, cx, cy, "ellipse");
		else
		GlobalMembersGraph3d.map3d_position_double(e.center, cx, cy, "ellipse");

		/* Calculate the vertices */
		vertex[0].style = style;
		for (i = 0, angle = 0.0; i <= segments; i++, angle += ang_inc)
		{
		pos.x = A * cosO * Math.cos(angle) - B * sinO * Math.sin(angle);
		pos.y = A * sinO * Math.cos(angle) + B * cosO * Math.sin(angle);
		if (dimensions == 2)
			GlobalMembersGraphics.map_position_r(pos, xoff, yoff, "ellipse");
		else
		{
			GlobalMembersGraph3d.map3d_position_r(pos, junkw, junkh, "ellipse");
			xoff = junkw;
			yoff = junkh;
		}
		vertex[i].x = cx + xoff;
		vertex[i].y = cy + yoff;
		}

		if (style != 0)
		{
		/* Fill in the center */
		if (GlobalMembersTerm.term.filled_polygon)
			GlobalMembersTerm.term.filled_polygon(segments, vertex);
		}
		else
		{
		/* Draw the arc */
		for (i = 0; i < segments; i++)
			GlobalMembersGadgets.draw_clip_line(vertex[i].x, vertex[i].y, vertex[i + 1].x, vertex[i + 1].y);
		}
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static gpiPoint do_polygon_corners = DefineConstants.NULL;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static gpiPoint do_polygon_clpcorn = DefineConstants.NULL;
	public static void do_polygon(int dimensions, polygon p, int style)
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static gpiPoint *corners = DefineConstants.NULL;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static gpiPoint *clpcorn = DefineConstants.NULL;
		BoundingBox clip_save = GlobalMembersGadgets.clip_area;
		boolean noclip = false;
		int nv;

		if (p.vertex == null)
		return;

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		do_polygon_corners = GlobalMembersAlloc.gp_realloc(do_polygon_corners, p.type * sizeof(gpiPoint), "polygon");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		do_polygon_clpcorn = GlobalMembersAlloc.gp_realloc(do_polygon_clpcorn, 2 * p.type * sizeof(gpiPoint), "polygon");
		for (nv = 0; nv < p.type; nv++)
		{
		if (dimensions == 3)
			GlobalMembersGraph3d.map3d_position(p.vertex[nv], do_polygon_corners[nv].x, do_polygon_corners[nv].y, "pvert");
		else
			GlobalMembersGraphics.map_position(p.vertex[nv], do_polygon_corners[nv].x, do_polygon_corners[nv].y, "pvert");

		/* Any vertex not given in plot coords will disable clipping */
		if (p.vertex[nv].scalex == position_type.screen || p.vertex[nv].scaley == position_type.screen)
			noclip = true;
		if (p.vertex[nv].scalex == position_type.graph || p.vertex[nv].scaley == position_type.graph)
			noclip = true;
		}

		if (noclip)
		GlobalMembersGadgets.clip_area = GlobalMembersGadgets.canvas;

		if (GlobalMembersTerm.term.filled_polygon && style != 0)
		{
		int i;
		int o;
		int clipped;
		gpiPoint temp = new gpiPoint();
		for (i = 0,o = 0; i < nv - 1; i++)
		{
			do_polygon_clpcorn[o] = do_polygon_corners[i];
			temp = do_polygon_corners[i + 1];
			clipped = GlobalMembersGadgets.clip_line(do_polygon_corners[i].x, do_polygon_corners[i].y, do_polygon_corners[i + 1].x, do_polygon_corners[i + 1].y);
			if (clipped == 0) // both ends out of range
				continue;
			if (clipped > 0) // both ends in range
				o++;
			if (clipped < 0) // clipped to range
			{
			do_polygon_clpcorn[o++] = do_polygon_corners[i];
			do_polygon_clpcorn[o++] = do_polygon_corners[i + 1];
			do_polygon_corners[i + 1] = temp;
			}
		}
		if (clipped == 1)
			do_polygon_clpcorn[o++] = do_polygon_corners[i];
		do_polygon_clpcorn[0].style = style;
		GlobalMembersTerm.term.filled_polygon(o, do_polygon_clpcorn);

		} // Just draw the outline?
		else
		{
		int i;
		 GlobalMembersTerm.newpath();
		for (i = 0; i < nv - 1; i++)
			GlobalMembersGadgets.draw_clip_line(do_polygon_corners[i].x, do_polygon_corners[i].y, do_polygon_corners[i + 1].x, do_polygon_corners[i + 1].y);
		if (do_polygon_corners[i].x != do_polygon_corners[0].x || do_polygon_corners[i].y != do_polygon_corners[0].y)
			GlobalMembersGadgets.draw_clip_line(do_polygon_corners[i].x, do_polygon_corners[i].y, do_polygon_corners[0].x, do_polygon_corners[0].y);
		GlobalMembersTerm.closepath();
		}

		GlobalMembersGadgets.clip_area = clip_save;

	}
	///#else
	///#define place_objects(listhead,layer,dimensions,clip_area) // void() 
	///#endif



	///#ifdef HAVE_CONFIG_H
	///#endif
	///#ifndef TERM_HELP
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_x3d(x) ((x-X_AXIS.min)*xscale3d + xcenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_y3d(y) ((y-Y_AXIS.min)*yscale3d + ycenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_z3d(z) ((z-floor_z)*zscale3d + zcenter3d -1.0)
	///#define ISO_SAMPLES 10
	///#ifdef USE_MOUSE
	///#endif
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
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define END_OF_COMMAND (c_token >= num_tokens || equals(c_token,";"))
	///#ifdef USE_MOUSE
	///#define PAUSE_BUTTON1 001
	///#define PAUSE_BUTTON2 002
	///#define PAUSE_BUTTON3 004
	///#define PAUSE_CLICK 007
	///#define PAUSE_KEYSTROKE 010
	///#define PAUSE_WINCLOSE 020
	///#define PAUSE_ANY 077
	///#endif
	///#ifdef GP_MACROS
	///#endif
	///#ifndef STDOUT
	///#define STDOUT 1
	///#endif
	///#if defined(MSDOS) || defined(DOS386)
	///#ifdef DJGPP
	///#endif                         // DJGPP 
	///#ifdef __TURBOC__
	///#ifndef _Windows
	///#endif                        // _Windows 
	///#endif                         // TURBOC 
	///#endif // MSDOS 
	///#ifdef _Windows
	///#define SET_CURSOR_WAIT SetCursor(LoadCursor((HINSTANCE) NULL, IDC_WAIT))
	///#define SET_CURSOR_ARROW SetCursor(LoadCursor((HINSTANCE) NULL, IDC_ARROW))
	///#else
	///#define SET_CURSOR_WAIT
	///#define SET_CURSOR_ARROW
	///#endif
	///#ifdef _Windows
	///#endif
	///#ifdef AMIGA_SC_6_1
	///#else
	///#endif
	///#ifdef OS2
	///#endif
	///#ifdef X11
	///#endif
	///#ifdef _Windows
	///#endif
	///#ifdef WXWIDGETS
	///#endif
	///#ifdef USE_MOUSE
	///#else
	///#define bind_command()
	///#endif
	///#ifdef VOLATILE_REFRESH
	///#endif
	///#ifdef USE_MOUSE
	///#endif
	///#ifdef VMS // HBB 990829: used only on VMS
	///#endif
	///#define ZERO_YEAR 2000
	///#define JAN_FIRST_WDAY 6
	///#define SEC_OFFS_SYS 946684800.0
	///#define YEAR_SEC 31557600.0
	///#define MON_SEC 2629800.0
	///#define WEEK_SEC 604800.0
	///#define DAY_SEC 86400.0
	/* FIXME HBB 20010822: this breaks the plan of disentangling graphics
	 * and plot2d, because each #include's the other's header: */


	/* Externally visible/modifiable status variables */

	/* 'set offset' --- artificial buffer zone between coordinate axes and
	 * the area actually covered by the data */
	public static position loff = new position(position_type.first_axes, 0.0);
	public static position roff = new position(position_type.first_axes, 0.0);
	public static position toff = new position(position_type.first_axes, 0.0);
	public static position boff = new position(position_type.first_axes, 0.0);

	/* set bars */
	public static double bar_size = 1.0;
	public static int bar_layer = DefineConstants.LAYER_FRONT;

	/* key placement is calculated in boundary, so we need file-wide variables
	 * To simplify adjustments to the key, we set all these once [depends on
	 * key->reverse] and use them throughout.
	 */

	/*{{{  local and global variables */
	public static int key_sample_width; // width of line sample
	public static int key_sample_left; // offset from x for left of line sample
	public static int key_sample_right; // offset from x for right of line sample
	public static int key_point_offset; // offset from x for point sample
	public static int key_text_left; // offset from x for left-justified text
	public static int key_text_right; // offset from x for right-justified text
	public static int key_size_left; // size of left bit of key (text or sample, depends on key->reverse)
	public static int key_size_right; // size of right part of key (including padding)
	public static int max_ptitl_len = 0; // max length of plot-titles (keys)
	public static double ktitl_lines = 0; // no lines in key->title (key header)
	public static int ptitl_cnt; // count keys with len > 0
	public static int key_rows;
	public static int key_col_wth;
	public static int yl_ref;

	/* set by tic_callback - how large to draw polar radii */
	public static double largest_polar_circle;

	public static int xlablin;
	public static int x2lablin;
	public static int ylablin;
	public static int y2lablin;
	public static int titlelin;
	public static int xticlin;
	public static int x2ticlin;

	public static int key_entry_height; // bigger of t->v_size, pointsize*t->v_tick
	public static int p_width; // pointsize * { t->h_tic | t->v_tic }
	public static int p_height;


	/* there are several things on right of plot - key, y2tics and y2label
	 * when working out boundary, save posn of y2label for later...
	 * Same goes for x2label.
	 */
	public static int ylabel_x;
	public static int y2label_x;
	public static int xlabel_y;
	public static int x2label_y;
	public static int title_y;
	public static int time_y;
	public static int time_x;
	public static int ylabel_y;
	public static int y2label_y;
	public static int xtic_y;
	public static int x2tic_y;
	public static int ytic_x;
	public static int y2tic_x;
	/*}}} */

	/* Status information for stacked histogram plots */
	public static coordinate stackheight = DefineConstants.NULL; // top of previous row
	public static int stack_count; // points actually used
	public static void place_histogram_titles()
	{
		histogram_style hist = GlobalMembersGadgets.histogram_opts;
		int x;
		int y;
		while ((hist = hist.next))
		{
		if (hist.title.text != null && *(hist.title.text))
		{
			double xoffset_d;
			double yoffset_d;
			GlobalMembersGraphics.map_position_r((GlobalMembersGadgets.histogram_opts.title.offset), xoffset_d, yoffset_d, "histogram");
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + (((hist.start + hist.end) / 2.) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = xlabel_y;
			x += (int)xoffset_d;
			y += (int)yoffset_d + 0.25 * GlobalMembersTerm.term.v_char;
			GlobalMembersGadgets.apply_pm3dcolor(hist.title.textcolor, GlobalMembersTerm.term);
			GlobalMembersTerm.write_multiline(x, y, hist.title.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_BOT, 0, hist.title.font);
			GlobalMembersGadgets.reset_textcolor(hist.title.textcolor, GlobalMembersTerm.term);
		}
		}
	}

/*
 * Plots marked "noautoscale" do not yet have INRANGE/OUTRANGE flags set.
 */

	/*{{{  static fns and local macros */
	public static void recheck_ranges(curve_points plot)
	{
		int i; // point index

		for (i = 0; i < plot.p_count; i++)
		{
		if (plot.noautoscale)
		{
			plot.points[i].type = coord_type.INRANGE;
			if (!(((GlobalMembersAxis.axis_array[plot.x_axis].min)<(GlobalMembersAxis.axis_array[plot.x_axis].max)) ? (((plot.points[i].x) >= (GlobalMembersAxis.axis_array[plot.x_axis].min)) && ((plot.points[i].x) <= (GlobalMembersAxis.axis_array[plot.x_axis].max))) : (((plot.points[i].x) >= (GlobalMembersAxis.axis_array[plot.x_axis].max)) && ((plot.points[i].x) <= (GlobalMembersAxis.axis_array[plot.x_axis].min)))))
			plot.points[i].type = coord_type.OUTRANGE;
			if (!(((GlobalMembersAxis.axis_array[plot.y_axis].min)<(GlobalMembersAxis.axis_array[plot.y_axis].max)) ? (((plot.points[i].y) >= (GlobalMembersAxis.axis_array[plot.y_axis].min)) && ((plot.points[i].y) <= (GlobalMembersAxis.axis_array[plot.y_axis].max))) : (((plot.points[i].y) >= (GlobalMembersAxis.axis_array[plot.y_axis].max)) && ((plot.points[i].y) <= (GlobalMembersAxis.axis_array[plot.y_axis].min)))))
			plot.points[i].type = coord_type.OUTRANGE;
		}
		}
	}
/*}}} */

	public static void plot_border()
	{
		int min;
		int max;

		GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp); // border linetype
		if ((GlobalMembersGadgets.draw_border & 15) == 15)
			GlobalMembersTerm.newpath();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.ytop);

		if (GlobalMembersGadgets.draw_border & DefineConstants.WEST && GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticdef.rangelimited)
		{
			max = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].data_max) - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_scale + 0.5);
			min = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].data_min) - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_scale + 0.5);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xleft, max);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(GlobalMembersGadgets.plot_bounds.xleft, min);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.ybot);
		}
		else if (GlobalMembersGadgets.draw_border & DefineConstants.WEST != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.ybot);
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.ybot);
		}

		if (GlobalMembersGadgets.draw_border & DefineConstants.SOUTH && GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticdef.rangelimited)
		{
			max = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].data_max) - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_scale + 0.5);
			min = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].data_min) - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_scale + 0.5);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(min, GlobalMembersGadgets.plot_bounds.ybot);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(max, GlobalMembersGadgets.plot_bounds.ybot);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xright, GlobalMembersGadgets.plot_bounds.ybot);
		}
		else if (GlobalMembersGadgets.draw_border & DefineConstants.SOUTH != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(GlobalMembersGadgets.plot_bounds.xright, GlobalMembersGadgets.plot_bounds.ybot);
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xright, GlobalMembersGadgets.plot_bounds.ybot);
		}

		if (GlobalMembersGadgets.draw_border & DefineConstants.EAST && GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].ticdef.rangelimited)
		{
			max = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].data_max) - GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].term_scale + 0.5);
			min = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].data_min) - GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].term_scale + 0.5);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xright, max);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(GlobalMembersGadgets.plot_bounds.xright, min);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xright, GlobalMembersGadgets.plot_bounds.ybot);
		}
		else if (GlobalMembersGadgets.draw_border & DefineConstants.EAST != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(GlobalMembersGadgets.plot_bounds.xright, GlobalMembersGadgets.plot_bounds.ytop);
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xright, GlobalMembersGadgets.plot_bounds.ytop);
		}

		if (GlobalMembersGadgets.draw_border & DefineConstants.NORTH && GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].ticdef.rangelimited)
		{
			max = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].data_max) - GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].term_scale + 0.5);
			min = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].data_min) - GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].term_scale + 0.5);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(min, GlobalMembersGadgets.plot_bounds.ytop);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(max, GlobalMembersGadgets.plot_bounds.ytop);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xright, GlobalMembersGadgets.plot_bounds.ytop);
		}
		else if (GlobalMembersGadgets.draw_border & DefineConstants.NORTH != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.ytop);
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.ytop);
		}

		if ((GlobalMembersGadgets.draw_border & 15) == 15)
			GlobalMembersTerm.closepath();
	}

/* plot_impulses:
 * Plot the curves in IMPULSES style
 */

	public static void plot_impulses(curve_points plot, int yaxis_x, int xaxis_y)
	{
		int i;
		int x;
		int y;
		TERMENTRY t = GlobalMembersTerm.term;

		for (i = 0; i < plot.p_count; i++)
		{
		switch (plot.points[i].type)
		{
		case INRANGE:
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((plot.points[i].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			break;
		case OUTRANGE:
			if (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((plot.points[i].x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((plot.points[i].x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((plot.points[i].x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((plot.points[i].x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
			continue;
			{
			double clipped_y = plot.points[i].y;

			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
				{
					if ((clipped_y) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(clipped_y) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
						else if ((clipped_y) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
							(clipped_y) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
				}
				else
				{
					if ((clipped_y) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(clipped_y) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
						else if ((clipped_y) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
							(clipped_y) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
				}
			} while (0);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((clipped_y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			break;
			}
		default: // just a safety
		case UNDEFINED:
		{
			continue;
		}
		}

		/* variable color read from data column */
		GlobalMembersGraph3d.check_for_variable_color(plot, plot.points[i]);

		if (GlobalMembersGadgets.polar)
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(yaxis_x, xaxis_y);
		else
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(x, xaxis_y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(x, y);
		}

	}

/* plot_lines:
 * Plot the curves in LINES style
 */
	public static void plot_lines(curve_points plot)
	{
		int i; // point index
		int x; // point in terminal coordinates
		int y;
		TERMENTRY t = GlobalMembersTerm.term;
		coord_type prev = coord_type.UNDEFINED; // type of previous point
		double ex; // an edge point
		double ey;
		double[] lx = new double[2]; // two edge points
		double[] ly = new double[2];

		for (i = 0; i < plot.p_count; i++)
		{

		/* rgb variable  -  color read from data column */
		GlobalMembersGraph3d.check_for_variable_color(plot, plot.points[i]);

		switch (plot.points[i].type)
		{
		case INRANGE:
		{
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((plot.points[i].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			if (prev == coord_type.INRANGE)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, y);
			}
			else if (prev == coord_type.OUTRANGE)
			{
				/* from outrange to inrange */
				if (!GlobalMembersGadgets.clip_lines1)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(x, y);
				}
				else
				{
				GlobalMembersGraphics.edge_intersect(plot.points, i, ex, ey);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, y);
				}
			} // prev == UNDEFINED
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(x, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, y);
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
				GlobalMembersGraphics.edge_intersect(plot.points, i, ex, ey);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
				}
			}
			else if (prev == coord_type.OUTRANGE)
			{
				/* from outrange to outrange */
				if (GlobalMembersGadgets.clip_lines2)
				{
				if (GlobalMembersGraphics.two_edge_intersect(plot.points, i, lx, ly))
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*t.move)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
				}
				}
			}
			break;
		}
		default: // just a safety
		case UNDEFINED:
		{
			break;
		}
		}
		prev = plot.points[i].type;
		}
	}

/* plot_points:
 * Plot the curves in POINTSTYLE style
 */
	public static void plot_points(curve_points plot)
	{
		int i;
		int x;
		int y;
		int interval = plot.lp_properties.p_interval;
		TERMENTRY t = GlobalMembersTerm.term;

		for (i = 0; i < plot.p_count; i++)
		{
		if ((plot.plot_style == PLOT_STYLE.LINESPOINTS) && (interval) && (i % interval))
		{
			continue;
		}
		if (plot.points[i].type == coord_type.INRANGE)
		{
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((plot.points[i].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			/* do clipping if necessary */
			if (!GlobalMembersGadgets.clip_points || (x >= GlobalMembersGadgets.plot_bounds.xleft + p_width && y >= GlobalMembersGadgets.plot_bounds.ybot + p_height && x <= GlobalMembersGadgets.plot_bounds.xright - p_width && y <= GlobalMembersGadgets.plot_bounds.ytop - p_height))
			{

			if ((plot.plot_style == PLOT_STYLE.POINTSTYLE || plot.plot_style == PLOT_STYLE.LINESPOINTS) && plot.lp_properties.p_size == DefineConstants.PTSZ_VARIABLE)
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.pointsize)(GlobalMembersGadgets.pointsize * plot.points[i].z);

			/* A negative interval indicates we should try to blank out the */
			/* area behind the point symbol. This could be done better by   */
			/* implementing a special point type, but that would require    */
			/* modification to all terminal drivers. It might be worth it.  */
			if (plot.plot_style == PLOT_STYLE.LINESPOINTS && interval < 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.linetype)(DefineConstants.LT_BACKGROUND);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.point)(x, y, 6);
				GlobalMembersTerm.term_apply_lp_properties((plot.lp_properties));
			}

			/* rgb variable  -  color read from data column */
			GlobalMembersGraph3d.check_for_variable_color(plot, plot.points[i]);

//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.point)(x, y, plot.lp_properties.p_type);
			}
		}
		}
	}
///#endif

/* plot_dots:
 * Plot the curves in DOTS style
 */
	public static void plot_dots(curve_points plot)
	{
		int i;
		int x;
		int y;
		TERMENTRY t = GlobalMembersTerm.term;

		for (i = 0; i < plot.p_count; i++)
		{
		if (plot.points[i].type == coord_type.INRANGE)
		{
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((plot.points[i].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			/* rgb variable  -  color read from data column */
			GlobalMembersGraph3d.check_for_variable_color(plot, plot.points[i]);
			/* point type -1 is a dot */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.point)(x, y, -1);
		}
		}
	}

/* plot_bars:
 * Plot the curves in ERRORBARS style
 *  we just plot the bars; the points are plotted in plot_points
 */
	public static void plot_bars(curve_points plot)
	{
		int i; // point index
		TERMENTRY t = GlobalMembersTerm.term;
		double x; // position of the bar
		double y;
		double ylow; // the ends of the bars
		double yhigh;
		double xlow;
		double xhigh;
		double x1; // parameters for polar error bars
		double y1;
		double x2;
		double y2;
		double slope;
		int xM; // the mapped version of above
		int ylowM;
		int yhighM;
		int yM;
		int xlowM;
		int xhighM;
		boolean low_inrange;
		boolean high_inrange;
		int tic = ((t.h_tic / 2)) > (1) ? ((t.h_tic / 2)) : (1);
		double halfwidth = 0; // Used to calculate full box width

		/* Limitation: no boxes with x errorbars */

		if ((plot.plot_style == PLOT_STYLE.YERRORBARS) || (plot.plot_style == PLOT_STYLE.XYERRORBARS) || (plot.plot_style == PLOT_STYLE.BOXERROR) || (plot.plot_style == PLOT_STYLE.YERRORLINES) || (plot.plot_style == PLOT_STYLE.XYERRORLINES) || (plot.plot_style == PLOT_STYLE.HISTOGRAMS) || (plot.plot_style == PLOT_STYLE.FILLEDCURVES)) // Only if term has no filled_polygon!
		{
		/* Draw the vertical part of the bar */
		for (i = 0; i < plot.p_count; i++)
		{
			/* undefined points don't count */
			if (plot.points[i].type == coord_type.UNDEFINED)
			continue;

			/* check to see if in xrange */
			x = plot.points[i].x;

			if (plot.plot_style == PLOT_STYLE.HISTOGRAMS)
			{
			/* Shrink each cluster to fit within one unit along X axis,   */
			/* centered about the integer representing the cluster number */
			/* 'start' is reset to 0 at the top of eval_plots(), and then */
			/* incremented if 'plot new histogram' is encountered.        */
			int clustersize = plot.histogram.clustersize + GlobalMembersGadgets.histogram_opts.gap;
			x += (i - 1) * (clustersize - 1) + plot.histogram_sequence;
			x += GlobalMembersGadgets.histogram_opts.gap / 2;
			x /= clustersize;
			x += plot.histogram.start + 0.5;
			/* Calculate width also */
			halfwidth = (plot.points[i].xhigh - plot.points[i].xlow) / (2.* clustersize);
			}

			if (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
			continue;
			xM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

			/* check to see if in yrange */
			y = plot.points[i].y;
			if (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
			continue;
			yM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			/* find low and high points of bar, and check yrange */
			yhigh = plot.points[i].yhigh;
			ylow = plot.points[i].ylow;

			high_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((yhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((yhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((yhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((yhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))));
			low_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((ylow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((ylow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((ylow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((ylow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))));

			/* compute the plot position of yhigh */
			if (high_inrange)
			yhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yhigh) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			else if (((yhigh - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= 0))
			yhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			else
			yhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			/* compute the plot position of ylow */
			if (low_inrange)
			ylowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ylow) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			else if (((ylow - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= 0))
			ylowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			else
			ylowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			if (!high_inrange && !low_inrange && ylowM == yhighM)
			/* both out of range on the same side */
			continue;

			/* find low and high points of bar, and check xrange */
			xhigh = plot.points[i].xhigh;
			xlow = plot.points[i].xlow;

			if (plot.plot_style == PLOT_STYLE.HISTOGRAMS)
			{
			xlowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x - halfwidth) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			xhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x + halfwidth) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			}
			else
			{
			high_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((xhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((xhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((xhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((xhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))));
			low_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((xlow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((xlow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((xlow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((xlow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))));

			/* compute the plot position of xhigh */
			if (high_inrange)
				xhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((xhigh) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			else if (((xhigh - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= 0))
				xhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			else
				xhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

			/* compute the plot position of xlow */
			if (low_inrange)
				xlowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((xlow) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			else if (((xlow - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= 0))
				xlowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			else
				xlowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

			if (!high_inrange && !low_inrange && xlowM == xhighM)
				/* both out of range on the same side */
				continue;
			}

			/* by here everything has been mapped */
			if (!GlobalMembersGadgets.polar)
			{
			/* HBB 981130: use Igor's routine *only* for polar errorbars */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xM, ylowM);
			/* draw the main bar */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xM, yhighM);
			if (bar_size < 0.0)
			{
				/* draw the bottom tic same width as box */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int)(xlowM), ylowM);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int)(xhighM), ylowM);
				/* draw the top tic same width as box */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int)(xlowM), yhighM);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int)(xhighM), yhighM);
			}
			else if (bar_size > 0.0)
			{
				/* draw the bottom tic */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int)(xM - bar_size * tic), ylowM);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int)(xM + bar_size * tic), ylowM);
				/* draw the top tic */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int)(xM - bar_size * tic), yhighM);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int)(xM + bar_size * tic), yhighM);
			}
			}
			else
			{
			/* HBB 981130: see above */
			/* The above has been replaced by Igor inorder to get errorbars
			   coming out in polar mode AND to stop the bar from going
			   through the symbol */
			if ((xhighM - xlowM) * (xhighM - xlowM) + (yhighM - ylowM) * (yhighM - ylowM) > GlobalMembersGadgets.pointsize * tic * GlobalMembersGadgets.pointsize * tic * 4.5)
			{
				/* Only plot the error bar if it is bigger than the
				 * symbol */
				/* The factor of 4.5 should strictly be 4.0, but it looks
				 * better to drop the error bar if it is only slightly
				 * bigger than the symbol, Igor. */
				if (xlowM == xhighM)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(xM, ylowM);
				/* draw the main bar to the symbol end */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(xM, (int)(yM - GlobalMembersGadgets.pointsize * tic));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(xM, (int)(yM + GlobalMembersGadgets.pointsize * tic));
				/* draw the other part of the main bar */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(xM, yhighM);
				}
				else
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(xlowM, ylowM);
				/* draw the main bar in polar mode. Note that here
				 * the bar is drawn through the symbol. I tried to
				 * fix this, but got into trouble with the two bars
				 * (on either side of symbol) not being perfectly
				 * parallel due to mapping considerations. Igor
				 */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(xhighM, yhighM);
				}
				if (bar_size > 0.0)
				{
				/* The following attempts to ensure that the tics
				 * are perpendicular to the error bar, Igor. */
				/*perpendicular to the main bar */
				slope = (xlowM * 1.0 - xhighM * 1.0) / (yhighM * 1.0 - ylowM * 1.0 + 1e-10);
				x1 = xlowM + bar_size * tic / Math.sqrt(1.0 + slope * slope);
				x2 = xlowM - bar_size * tic / Math.sqrt(1.0 + slope * slope);
				y1 = slope * (x1 - xlowM) + ylowM;
				y2 = slope * (x2 - xlowM) + ylowM;

				/* draw the bottom tic */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int) x1, (int) y1);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int) x2, (int) y2);

				x1 = xhighM + bar_size * tic / Math.sqrt(1.0 + slope * slope);
				x2 = xhighM - bar_size * tic / Math.sqrt(1.0 + slope * slope);
				y1 = slope * (x1 - xhighM) + yhighM;
				y2 = slope * (x2 - xhighM) + yhighM;
				/* draw the top tic */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int) x1, (int) y1);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int) x2, (int) y2);
				} // if error bar is bigger than symbol
			}
			} // HBB 981130: see above
		} // for loop
		} // if yerrorbars OR xyerrorbars OR yerrorlines OR xyerrorlines
		if ((plot.plot_style == PLOT_STYLE.XERRORBARS) || (plot.plot_style == PLOT_STYLE.XYERRORBARS) || (plot.plot_style == PLOT_STYLE.XERRORLINES) || (plot.plot_style == PLOT_STYLE.XYERRORLINES))
		{

		/* Draw the horizontal part of the bar */
		for (i = 0; i < plot.p_count; i++)
		{
			/* undefined points don't count */
			if (plot.points[i].type == coord_type.UNDEFINED)
			continue;

			/* check to see if in yrange */
			y = plot.points[i].y;
			if (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
			continue;
			yM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			/* find low and high points of bar, and check xrange */
			xhigh = plot.points[i].xhigh;
			xlow = plot.points[i].xlow;

			high_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((xhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((xhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((xhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((xhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))));
			low_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((xlow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((xlow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((xlow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((xlow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))));

			/* compute the plot position of xhigh */
			if (high_inrange)
			xhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((xhigh) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			else if (((xhigh - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= 0))
			xhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			else
			xhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

			/* compute the plot position of xlow */
			if (low_inrange)
			xlowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((xlow) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			else if (((xlow - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= 0))
			xlowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			else
			xlowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

			if (!high_inrange && !low_inrange && xlowM == xhighM)
			/* both out of range on the same side */
			continue;

			/* by here everything has been mapped */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xlowM, yM);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xhighM, yM); // draw the main bar
			if (bar_size > 0.0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xlowM, (int)(yM - bar_size * tic)); // draw the left tic
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xlowM, (int)(yM + bar_size * tic));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xhighM, (int)(yM - bar_size * tic)); // draw the right tic
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xhighM, (int)(yM + bar_size * tic));
			}
		} // for loop
		} // if xerrorbars OR xyerrorbars OR xerrorlines OR xyerrorlines
	}

/* plot_boxes:
 * EAM Sep 2002 - Consolidate BOXES and FILLEDBOXES
 */
	public static void plot_boxes(curve_points plot, int xaxis_y)
	{
		int i; // point index
		int xl; // point in terminal coordinates
		int xr;
		int yb;
		int yt;
		double dxl;
		double dxr;
		double dyt;
		TERMENTRY t = GlobalMembersTerm.term;
		coord_type prev = coord_type.UNDEFINED; // type of previous point
		double dyb = 0.0;

		/* The stackheight[] array contains the y coord of the top   */
		/* of the stack so far for each point.                       */
		if (plot.plot_style == PLOT_STYLE.HISTOGRAMS)
		{
		int newsize = plot.p_count;
		if (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_TOWERS.getValue())
			stack_count = 0;
		if (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_LAYERS.getValue() && plot.histogram_sequence == 0)
			stack_count = 0;
		if (stackheight == null)
		{
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			stackheight = GlobalMembersAlloc.gp_alloc(newsize * sizeof(GlobalMembersMouse.struct coordinate), "stackheight array");
			for (i = 0; i < newsize; i++)
			{
			stackheight[i].yhigh = 0;
			stackheight[i].ylow = 0;
			}
			stack_count = newsize;
		}
		else if (stack_count < newsize)
		{
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			stackheight = GlobalMembersAlloc.gp_realloc(stackheight, newsize * sizeof(GlobalMembersMouse.struct coordinate), "stackheight array");
			for (i = stack_count; i < newsize; i++)
			{
			stackheight[i].yhigh = 0;
			stackheight[i].ylow = 0;
			}
			stack_count = newsize;
		}
		}

		for (i = 0; i < plot.p_count; i++)
		{

		switch (plot.points[i].type)
		{
		case OUTRANGE:
		case INRANGE:
		{
			if (plot.points[i].z < 0.0)
			{
				/* need to auto-calc width */
				if (prev != coord_type.UNDEFINED)
				{
				if (GlobalMembersPlot2d.boxwidth < 0)
					dxl = (plot.points[i - 1].x - plot.points[i].x) / 2.0;
				else if (!GlobalMembersPlot2d.boxwidth_is_absolute)
					dxl = (plot.points[i - 1].x - plot.points[i].x) * GlobalMembersPlot2d.boxwidth / 2.0;
				else // Hits here on 3 column BOXERRORBARS
					dxl = -GlobalMembersPlot2d.boxwidth / 2.0;
				}
				else
				{
				if (GlobalMembersPlot2d.boxwidth_is_absolute)
					dxl = -GlobalMembersPlot2d.boxwidth / 2.0;
				else
					dxl = 0.0;
				}

				if (i < plot.p_count - 1)
				{
				if (plot.points[i + 1].type != coord_type.UNDEFINED)
				{
					if (GlobalMembersPlot2d.boxwidth < 0)
					dxr = (plot.points[i + 1].x - plot.points[i].x) / 2.0;
					else if (!GlobalMembersPlot2d.boxwidth_is_absolute)
					dxr = (plot.points[i + 1].x - plot.points[i].x) * GlobalMembersPlot2d.boxwidth / 2.0;
					else // Hits here on 3 column BOXERRORBARS
					dxr = GlobalMembersPlot2d.boxwidth / 2.0;
				}
				else
				{
					dxr = -dxl;
				}
				}
				else
				{
				dxr = -dxl;
				}

				if (prev == coord_type.UNDEFINED)
				dxl = -dxr;

				dxl = plot.points[i].x + dxl;
				dxr = plot.points[i].x + dxr;
			} // z >= 0
			else
			{
				dxr = plot.points[i].xhigh;
				dxl = plot.points[i].xlow;
			}

			/* HBB 20040521: ylow should be clipped to the y range. */
			if (plot.plot_style == PLOT_STYLE.BOXXYERROR)
			{
				double temp_y = plot.points[i].ylow;

				do
				{
					if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
					{
						if ((temp_y) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
							(temp_y) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
							else if ((temp_y) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
								(temp_y) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
					}
					else
					{
						if ((temp_y) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
							(temp_y) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
							else if ((temp_y) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
								(temp_y) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
					}
				} while (0);
				xaxis_y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((temp_y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				dyt = plot.points[i].yhigh;
			}
			else
			{
				dyt = plot.points[i].y;
			}

			if (plot.plot_style == PLOT_STYLE.HISTOGRAMS)
			{
				int ix = i;
				int histogram_linetype = i;
				if (plot.histogram.startcolor > 0)
				histogram_linetype += plot.histogram.startcolor;

				/* Shrink each cluster to fit within one unit along X axis,   */
				/* centered about the integer representing the cluster number */
				/* 'start' is reset to 0 at the top of eval_plots(), and then */
				/* incremented if 'plot new histogram' is encountered.        */
				if (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_CLUSTERED.getValue() || GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_ERRORBARS.getValue())
				{
				int clustersize = plot.histogram.clustersize + GlobalMembersGadgets.histogram_opts.gap;
				dxl += (i - 1) * (clustersize - 1) + plot.histogram_sequence;
				dxr += (i - 1) * (clustersize - 1) + plot.histogram_sequence;
				dxl += GlobalMembersGadgets.histogram_opts.gap / 2;
				dxr += GlobalMembersGadgets.histogram_opts.gap / 2;
				dxl /= clustersize;
				dxr /= clustersize;
				dxl += plot.histogram.start + 0.5;
				dxr += plot.histogram.start + 0.5;
				}
				else if (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_TOWERS.getValue())
				{
				dxl = plot.histogram.start - GlobalMembersPlot2d.boxwidth / 2.0;
				dxr = plot.histogram.start + GlobalMembersPlot2d.boxwidth / 2.0;
				dxl += plot.histogram_sequence;
				dxr += plot.histogram_sequence;
				}
				else if (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_LAYERS.getValue())
				{
				dxl += plot.histogram.start;
				dxr += plot.histogram.start;
				}

				switch (GlobalMembersGadgets.histogram_opts.type)
				{
				case HT_STACKED_IN_TOWERS:
				ix = 0;
				/* Line type (color) must match row number */
				if (GlobalMembersGadgets.prefer_line_styles)
				{
					lp_style_type ls = new lp_style_type();
					GlobalMembersTerm.lp_use_properties(ls, histogram_linetype + 1);
					GlobalMembersGadgets.apply_pm3dcolor(ls.pm3d_color, GlobalMembersTerm.term);
				}
				else
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*t.linetype)(histogram_linetype);
				plot.fill_properties.fillpattern = histogram_linetype;
				/* Fall through */
				case HT_STACKED_IN_LAYERS:

				if (plot.points[i].y >= 0)
				{
					dyb = stackheight[ix].yhigh;
					dyt += stackheight[ix].yhigh;
					stackheight[ix].yhigh += plot.points[i].y;
				}
				else
				{
					dyb = stackheight[ix].ylow;
					dyt += stackheight[ix].ylow;
					stackheight[ix].ylow += plot.points[i].y;
				}

				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max && dyb < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) || (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min && dyb > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
					dyb = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max && dyb > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) || (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min && dyb < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
					dyb = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
				break;
				case HT_CLUSTERED:
				case HT_ERRORBARS:
				break;
				}
			}

			/* clip to border */
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
				{
					if ((dyt) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(dyt) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
						else if ((dyt) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
							(dyt) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
				}
				else
				{
					if ((dyt) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(dyt) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
						else if ((dyt) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
							(dyt) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
				}
			} while (0);
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
				{
					if ((dxr) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(dxr) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
						else if ((dxr) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
							(dxr) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
				}
				else
				{
					if ((dxr) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(dxr) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
						else if ((dxr) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
							(dxr) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
				}
			} while (0);
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
				{
					if ((dxl) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(dxl) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
						else if ((dxl) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
							(dxl) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
				}
				else
				{
					if ((dxl) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(dxl) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
						else if ((dxl) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
							(dxl) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
				}
			} while (0);

			xl = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((dxl) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			xr = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((dxr) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			yt = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((dyt) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			yb = xaxis_y;

			if (plot.plot_style == PLOT_STYLE.HISTOGRAMS && (GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_LAYERS.getValue() || GlobalMembersGadgets.histogram_opts.type == histogram_type.HT_STACKED_IN_TOWERS.getValue()))
				yb = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((dyb) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			/* Variable color */
			if (plot.plot_style == PLOT_STYLE.BOXES)
			{
				GlobalMembersGraph3d.check_for_variable_color(plot, plot.points[i]);
			}

			if ((plot.fill_properties.fillstyle != t_fillstyle.FS_EMPTY.getValue()) && t.fillbox)
			{
				int x;
				int y;
				int w;
				int h;
				int style;

				x = xl;
				y = yb;
				w = xr - xl + 1;
				h = yt - yb + 1;
				/* avoid negative width/height */
				if (w <= 0)
				{
				x = xr;
				w = xl - xr + 1;
				}
				if (h <= 0)
				{
				y = yt;
				h = yb - yt + 1;
				}

				style = GlobalMembersTerm.style_from_fill(plot.fill_properties);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.fillbox)(style, x, y, w, h);

				if (!GlobalMembersMisc.need_fill_border(plot.fill_properties))
				break;
			}
			GlobalMembersTerm.newpath();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xl, yb);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xl, yt);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xr, yt);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xr, yb);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xl, yb);
			GlobalMembersTerm.closepath();

			if (t.fillbox && plot.fill_properties.border_color.type != DefineConstants.TC_DEFAULT)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.linetype)(plot.lp_properties.l_type);
				if (plot.lp_properties.use_palette)
				GlobalMembersGadgets.apply_pm3dcolor(plot.lp_properties.pm3d_color, t);
			}

			break;
		} // case OUTRANGE, INRANGE

		default: // just a safety
		case UNDEFINED:
		{
			break;
		}

		} // switch point-type

		prev = plot.points[i].type;

		} //loop
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static gpiPoint plot_filledcurves_corners = 0;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int plot_filledcurves_corners_allocated = 0;
	public static void plot_filledcurves(curve_points plot)
	{
		int i; // point index
		int x; // point in terminal coordinates
		int y;
		TERMENTRY t = GlobalMembersTerm.term;
		coord_type prev = coord_type.UNDEFINED; // type of previous point
		double ex; // an edge point
		double ey;
		double[] lx = new double[2]; // two edge points
		double[] ly = new double[2];
		int points = 0; // how many corners
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static gpiPoint *corners = 0; // array of corners
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int corners_allocated = 0; // how many allocated

		/* This set of variables is for tracking closed curve fill areas */
		int exit_edge = 0; // Which edge did an OUTRANGE point exit via?
		int reentry_edge = 0; // Where did it reenter?
		int out_updown = 0; // And where has it been in the meantime?
		int out_leftright = 0;
		int first_entry = 0; // If the start point of the curve was OUTRANGE

		if (!t.filled_polygon) // filled polygons are not available
		{
		GlobalMembersGraphics.plot_lines(plot);
		return;
		}

		if (plot.filledcurves_options.opt_given == 0)
		{
		/* no explicitly given filledcurves option for the current plot =>
		   use the default for data or function, respectively
		*/
		if (plot.plot_type == PLOT_TYPE.DATA)
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			memcpy(plot.filledcurves_options, GlobalMembersGadgets.filledcurves_opts_data, sizeof(filledcurves_opts));
		else
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			memcpy(plot.filledcurves_options, GlobalMembersGadgets.filledcurves_opts_func, sizeof(filledcurves_opts));
		}

		/* clip the "at" coordinate to the drawing area */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define MYNOMIN(x,ax) if (x<axis_array[ax].min) x=axis_array[ax].min;
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define MYNOMAX(x,ax) if (x>axis_array[ax].max) x=axis_array[ax].max;
		/* FIXME HBB 20030127: replace by cliptorange()!? */
		switch (plot.filledcurves_options.closeto)
		{
		case FILLEDCURVES_ATX1:
			if (plot.filledcurves_options.at < GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min;
			if (plot.filledcurves_options.at > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max;
			break;
		case FILLEDCURVES_ATX2:
			if (plot.filledcurves_options.at < GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min;
			if (plot.filledcurves_options.at > GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max;
			break;
		case FILLEDCURVES_ATY1:
			if (plot.filledcurves_options.at < GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min;
			if (plot.filledcurves_options.at > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max;
			break;
		case FILLEDCURVES_ATY2:
			if (plot.filledcurves_options.at < GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min;
			if (plot.filledcurves_options.at > GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].max)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].max;
			break;
		case FILLEDCURVES_ATXY:
			if (plot.filledcurves_options.at < GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min;
			if (plot.filledcurves_options.at > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)
				plot.filledcurves_options.at = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max;
			if (plot.filledcurves_options.aty < GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)
				plot.filledcurves_options.aty = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min;
			if (plot.filledcurves_options.aty > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)
				plot.filledcurves_options.aty = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max;
			break;
		}
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#undef MYNOMIN
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#undef MYNOMAX

		for (i = 0; i < plot.p_count; i++)
		{
		if (points + 2 >= plot_filledcurves_corners_allocated) // there are 2 side points
		{
			plot_filledcurves_corners_allocated += 128; // reallocate more corners
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			plot_filledcurves_corners = GlobalMembersAlloc.gp_realloc(plot_filledcurves_corners, plot_filledcurves_corners_allocated * sizeof(gpiPoint), "corners for filledcurves");
		}
		switch (plot.points[i].type)
		{
		case INRANGE:
		{
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((plot.points[i].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			if (prev == coord_type.INRANGE)
			{
				/* Split this segment if it crosses a bounding line */
				if (GlobalMembersGraphics.bound_intersect(plot.points, i, ex, ey, plot.filledcurves_options))
				{
				plot_filledcurves_corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				plot_filledcurves_corners[points++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				GlobalMembersGraphics.finish_filled_curve(points, plot_filledcurves_corners, plot);
				points = 0;
				plot_filledcurves_corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				plot_filledcurves_corners[points++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				}
				/* vector(x,y) */
				plot_filledcurves_corners[points].x = x;
				plot_filledcurves_corners[points++].y = y;
			}
			else if (prev == coord_type.OUTRANGE)
			{
				/* from outrange to inrange */
				if ((plot.filledcurves_options.closeto == filledcurves_opts_id.FILLEDCURVES_CLOSED.getValue()) || GlobalMembersGadgets.clip_lines2) // EAM concave bounding curves
				{
				reentry_edge = GlobalMembersGraphics.edge_intersect(plot.points, i, ex, ey);

				if (exit_edge == 0)
					/* Curve must have started outside the plot area */
					first_entry = reentry_edge;
				else if (reentry_edge != exit_edge)
					/* Fill in dummy points at plot corners if the bounding curve */
					/* went around the corner while out of range */
					GlobalMembersGraphics.fill_missing_corners(plot_filledcurves_corners, points, exit_edge, reentry_edge, out_updown, out_leftright);

				/* vector(map_x(ex),map_y(ey)); */
				plot_filledcurves_corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				plot_filledcurves_corners[points++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				/* vector(x,y); */
				plot_filledcurves_corners[points].x = x;
				plot_filledcurves_corners[points++].y = y;

				}
				else if (!GlobalMembersGadgets.clip_lines1)
				{
				GlobalMembersGraphics.finish_filled_curve(points, plot_filledcurves_corners, plot);
				points = 0;
				/* move(x,y) */
				plot_filledcurves_corners[points].x = x;
				plot_filledcurves_corners[points++].y = y;

				}
				else
				{
				GlobalMembersGraphics.finish_filled_curve(points, plot_filledcurves_corners, plot);
				points = 0;
				GlobalMembersGraphics.edge_intersect(plot.points, i, ex, ey);
				/* move(map_x(ex),map_y(ey)); */
				plot_filledcurves_corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				plot_filledcurves_corners[points++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				/* vector(x,y); */
				plot_filledcurves_corners[points].x = x;
				plot_filledcurves_corners[points++].y = y;
				}
			} // prev == UNDEFINED
			else
			{
				GlobalMembersGraphics.finish_filled_curve(points, plot_filledcurves_corners, plot);
				points = 0;
				/* move(x,y) */
				plot_filledcurves_corners[points].x = x;
				plot_filledcurves_corners[points++].y = y;
				/* vector(x,y); */
				plot_filledcurves_corners[points].x = x;
				plot_filledcurves_corners[points++].y = y;
			}
			break;
		}
		case OUTRANGE:
		{
			if ((plot.filledcurves_options.closeto == filledcurves_opts_id.FILLEDCURVES_CLOSED.getValue()) || GlobalMembersGadgets.clip_lines2)
			{
				int where_was_I = GlobalMembersGadgets.clip_point((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((plot.points[i].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
				if (where_was_I & (DefineConstants.LEFT_EDGE | DefineConstants.RIGHT_EDGE) != 0)
				out_leftright = where_was_I & (DefineConstants.LEFT_EDGE | DefineConstants.RIGHT_EDGE);
				if (where_was_I & (DefineConstants.TOP_EDGE | DefineConstants.BOTTOM_EDGE) != 0)
				out_updown = where_was_I & (DefineConstants.TOP_EDGE | DefineConstants.BOTTOM_EDGE);
			}
			if (prev == coord_type.INRANGE)
			{
				/* from inrange to outrange */
				if (GlobalMembersGadgets.clip_lines1 || (plot.filledcurves_options.closeto == filledcurves_opts_id.FILLEDCURVES_CLOSED.getValue()) || GlobalMembersGadgets.clip_lines2)
				{
				exit_edge = GlobalMembersGraphics.edge_intersect(plot.points, i, ex, ey);
				/* vector(map_x(ex),map_y(ey)); */
				plot_filledcurves_corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				plot_filledcurves_corners[points++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				}
			}
			else if (prev == coord_type.OUTRANGE)
			{
				/* from outrange to outrange */
				if ((plot.filledcurves_options.closeto == filledcurves_opts_id.FILLEDCURVES_CLOSED.getValue()) || GlobalMembersGadgets.clip_lines2)
				{
				if (GlobalMembersGraphics.two_edge_intersect(plot.points, i, lx, ly))
				{
					coordinate temp = new coordinate();

					/* vector(map_x(lx[0]),map_y(ly[0])); */
					plot_filledcurves_corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
					plot_filledcurves_corners[points++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

					/* Figure out which side we entered by */
					temp.x = plot.points[i].x;
					temp.y = plot.points[i].y;
					plot.points[i].x = lx[1];
					plot.points[i].y = ly[1];
					reentry_edge = GlobalMembersGraphics.edge_intersect(plot.points, i, ex, ey);
					plot.points[i].x = temp.x;
					plot.points[i].y = temp.y;

					if (exit_edge == 0)
					{
					/* Curve must have started outside the plot area */
					first_entry = reentry_edge;
					}
					else if (reentry_edge != exit_edge)
					{
					GlobalMembersGraphics.fill_missing_corners(plot_filledcurves_corners, points, exit_edge, reentry_edge, out_updown, out_leftright);
					}
					/* vector(map_x(lx[1]),map_y(ly[1])); */
					plot_filledcurves_corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
					plot_filledcurves_corners[points++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

					/* Figure out which side we left by */
					temp.x = plot.points[i - 1].x;
					temp.y = plot.points[i - 1].y;
					plot.points[i - 1].x = lx[0];
					plot.points[i - 1].y = ly[0];
					exit_edge = GlobalMembersGraphics.edge_intersect(plot.points, i, ex, ey);
					plot.points[i - 1].x = temp.x;
					plot.points[i - 1].y = temp.y;
				}
				}
				else if (GlobalMembersGadgets.clip_lines2)
				{
				if (GlobalMembersGraphics.two_edge_intersect(plot.points, i, lx, ly))
				{
					GlobalMembersGraphics.finish_filled_curve(points, plot_filledcurves_corners, plot);
					points = 0;
					/* move(map_x(lx[0]),map_y(ly[0])); */
					plot_filledcurves_corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
					plot_filledcurves_corners[points++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
					/* vector(map_x(lx[1]),map_y(ly[1])); */
					plot_filledcurves_corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
					plot_filledcurves_corners[points++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				}
				}
			}
			break;
		}
		case UNDEFINED:
		{
			/* UNDEFINED flags a blank line in the input file.
			 * Unfortunately, it can also mean that the point was undefined.
			 * Is there a clean way to detect or handle the latter case?
			 */
			if (prev != coord_type.UNDEFINED)
			{
				if (first_entry != 0 && first_entry != exit_edge)
				GlobalMembersGraphics.fill_missing_corners(plot_filledcurves_corners, points, exit_edge, first_entry, out_updown, out_leftright);
				GlobalMembersGraphics.finish_filled_curve(points, plot_filledcurves_corners, plot);
				points = 0;
				exit_edge = reentry_edge = first_entry = 0;
			}
			break;
		}
		default: // just a safety
			break;
		}
		prev = plot.points[i].type;
		}

		if ((plot.filledcurves_options.closeto == filledcurves_opts_id.FILLEDCURVES_CLOSED.getValue()) || GlobalMembersGadgets.clip_lines2) // Did we finish cleanly, or is there an unresolved corner-crossing?
		{
		if (first_entry != 0 && first_entry != exit_edge)
		{
			GlobalMembersGraphics.fill_missing_corners(plot_filledcurves_corners, points, exit_edge, first_entry, out_updown, out_leftright);
		}
		}

		GlobalMembersGraphics.finish_filled_curve(points, plot_filledcurves_corners, plot);
	}

/* plot_filledcurves:
 * Plot FILLED curves.
 * pm 8.9.2001 (main routine); pm 5.1.2002 (full support for options)
 */

/* finalize and draw the filled curve */
	public static void finish_filled_curve(int points, gpiPoint[] corners, curve_points plot)
	{
		filledcurves_opts filledcurves_options = plot.filledcurves_options;
		int side = 0;
		int i;

		if (points <= 0)
			return;
		/* add side (closing) points */
		switch (filledcurves_options.closeto)
		{
		case FILLEDCURVES_CLOSED:
			break;
		case FILLEDCURVES_X1:
			corners[points].x = corners[points - 1].x;
			corners[points + 1].x = corners[0].x;
			corners[points].y = corners[points + 1].y = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_lower;
			points += 2;
			break;
		case FILLEDCURVES_X2:
			corners[points].x = corners[points - 1].x;
			corners[points + 1].x = corners[0].x;
			corners[points].y = corners[points + 1].y = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_upper;
			points += 2;
			break;
		case FILLEDCURVES_Y1:
			corners[points].y = corners[points - 1].y;
			corners[points + 1].y = corners[0].y;
			corners[points].x = corners[points + 1].x = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_lower;
			points += 2;
			break;
		case FILLEDCURVES_Y2:
			corners[points].y = corners[points - 1].y;
			corners[points + 1].y = corners[0].y;
			corners[points].x = corners[points + 1].x = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_upper;
			points += 2;
			break;
		case FILLEDCURVES_ATX1:
			corners[points].x = corners[points + 1].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((filledcurves_options.at) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				/* should be mapping real x1axis/graph/screen => screen */
			corners[points].y = corners[points - 1].y;
			corners[points + 1].y = corners[0].y;
			for (i = 0; i < points; i++)
				side += corners[i].x - corners[points].x;
			points += 2;
			break;
		case FILLEDCURVES_ATX2:
			corners[points].x = corners[points + 1].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((filledcurves_options.at) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				/* should be mapping real x2axis/graph/screen => screen */
			corners[points].y = corners[points - 1].y;
			corners[points + 1].y = corners[0].y;
			for (i = 0; i < points; i++)
				side += corners[i].x - corners[points].x;
			points += 2;
			break;
		case FILLEDCURVES_ATY1:
			corners[points].y = corners[points + 1].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((filledcurves_options.at) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				/* should be mapping real y1axis/graph/screen => screen */
			corners[points].x = corners[points - 1].x;
			corners[points + 1].x = corners[0].x;
			for (i = 0; i < points; i++)
				side += corners[i].y - corners[points].y;
			points += 2;
			break;
		case FILLEDCURVES_ATY2:
			corners[points].y = corners[points + 1].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((filledcurves_options.at) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				/* should be mapping real y2axis/graph/screen => screen */
			corners[points].x = corners[points - 1].x;
			corners[points + 1].x = corners[0].x;
			for (i = 0; i < points; i++)
				side += corners[i].y - corners[points].y;
			points += 2;
			break;
		case FILLEDCURVES_ATXY:
			corners[points].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((filledcurves_options.at) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				/* should be mapping real x1axis/graph/screen => screen */
			corners[points].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((filledcurves_options.aty) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				/* should be mapping real y1axis/graph/screen => screen */
			points++;
			break;
		case FILLEDCURVES_BETWEEN:
			side = (corners[points].x > 0) ? 1 : -1;

			/* Prevent 1-pixel overlap of component rectangles, which */
			/* causes vertical stripe artifacts for transparent fill  */
			if (plot.fill_properties.fillstyle == t_fillstyle.FS_TRANSPARENT_SOLID.getValue())
			{
				int direction = (corners[2].x < corners[0].x) ? - 1 : 1;
				if (points >= 4 && corners[2].x == corners[3].x)
				{
				corners[2].x -= direction, corners[3].x -= direction;
				}
				else if (points >= 5 && corners[3].x == corners[4].x)
				{
				corners[3].x -= direction, corners[4].x -= direction;
				}
			}
			break;
		default: // the polygon is closed by default
			break;
		}

	///#if 0
	////    { // for debugging purposes
	////    int i;
	////    fprintf(stderr, "List of %i corners:\n", points);
	////    for (i=0; i<points; i++)
	////	fprintf(stderr, "%2i: %3i,%3i | ", i, corners[i].x, corners[i].y);
	////    fprintf(stderr, " side = %ld",side);
	////    fprintf(stderr, "\n");
	////    }
	///#endif

		/* Check for request to fill only on one side of a bounding line */
		if (filledcurves_options.oneside > 0 && side < 0)
		return;
		if (filledcurves_options.oneside < 0 && side > 0)
		return;

		/* EAM Mar 2004 - Apply fill style to filled curves */
		corners.style = GlobalMembersTerm.style_from_fill(plot.fill_properties);
		GlobalMembersTerm.term.filled_polygon(points, corners);
	}
/*
 * Fill the area between two curves
 */
	public static void plot_betweencurves(curve_points plot)
	{
		double x1;
		double x2;
		double yl1;
		double yu1;
		double yl2;
		double yu2;
		double xmid;
		double ymid;
		double xu1; // For polar plots
		double xu2;
		int i;

		/* If terminal doesn't support filled polygons, approximate with bars */
		if (!GlobalMembersTerm.term.filled_polygon)
		{
		GlobalMembersGraphics.plot_bars(plot);
		return;
		}

		/*
		 * Fill the region one quadrilateral at a time.
		 * Check each interval to see if the curves cross.
		 * If so, split the interval into two parts.
		 */
		for (i = 0; i < plot.p_count - 1; i++)
		{

		/* FIXME: This isn't really testing for undefined points, it	*/
		/* is looking for blank lines. We need to distinguish these.	*/
		/* Anyhow, if there's a blank line then start a new fill area.	*/
		if (plot.points[i].type == coord_type.UNDEFINED || plot.points[i + 1].type == coord_type.UNDEFINED)
			continue;

		x1 = plot.points[i].x;
		xu1 = plot.points[i].xhigh;
		yl1 = plot.points[i].y;
		yu1 = plot.points[i].yhigh;
		x2 = plot.points[i + 1].x;
		xu2 = plot.points[i + 1].xhigh;
		yl2 = plot.points[i + 1].y;
		yu2 = plot.points[i + 1].yhigh;

		/* EAM 19-July-2007  Special case for polar plots. */
		if (GlobalMembersGadgets.polar)
		{
			/* Find intersection of the two lines.                   */
			/* Probably could use this code in the general case too. */
			double A = (yl2 - yl1) / (x2 - x1);
			double C = (yu2 - yu1) / (xu2 - xu1);
			double b = yl1 - x1 * A;
			double d = yu1 - xu1 * C;
			xmid = (d - b) / (A - C);
			ymid = A * xmid + b;

			if ((x1 - xmid) * (xmid - x2) > 0)
			{
			GlobalMembersGraphics.fill_between(x1, xu1, yl1, yu1, xmid, xmid, ymid, ymid, plot);
			GlobalMembersGraphics.fill_between(xmid, xmid, ymid, ymid, x2, xu2, yl2, yu2, plot);
			}
			else
			GlobalMembersGraphics.fill_between(x1, xu1, yl1, yu1, x2, xu2, yl2, yu2, plot);

		}
		else if ((yu1 - yl1) * (yu2 - yl2) < 0)
		{
			/* Cheap test for intersection in the general case */
			xmid = (x1 * (yl2 - yu2) + x2 * (yu1 - yl1)) / ((yu1 - yl1) + (yl2 - yu2));
			ymid = yu1 + (yu2 - yu1) * (xmid - x1) / (x2 - x1);
			GlobalMembersGraphics.fill_between(x1, xu1, yl1, yu1, xmid, xmid, ymid, ymid, plot);
			GlobalMembersGraphics.fill_between(xmid, xmid, ymid, ymid, x2, xu2, yl2, yu2, plot);

		}
		else
			GlobalMembersGraphics.fill_between(x1, xu1, yl1, yu1, x2, xu2, yl2, yu2, plot);

		}
	}

/*
 * When the bounding curve of a filled area passes through the plot box but
 * exits through a different edge than it entered by, in order to properly
 * fill the enclosed area we must add dummy points at the plot corners.
 */
	public static void fill_missing_corners(gpiPoint[] corners, int points, int exit, int reentry, int updown, int leftright)
	{
		if ((exit | reentry) == (DefineConstants.LEFT_EDGE | DefineConstants.RIGHT_EDGE))
		{
		corners[(points)].x = (exit & DefineConstants.LEFT_EDGE) ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		corners[(points)++].y = (updown & DefineConstants.TOP_EDGE) ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		corners[(points)].x = (reentry & DefineConstants.LEFT_EDGE) ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		corners[(points)++].y = (updown & DefineConstants.TOP_EDGE) ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		}
		else if ((exit | reentry) == (DefineConstants.BOTTOM_EDGE | DefineConstants.TOP_EDGE))
		{
		corners[(points)].x = (leftright & DefineConstants.LEFT_EDGE) ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		corners[(points)++].y = (exit & DefineConstants.TOP_EDGE) ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		corners[(points)].x = (leftright & DefineConstants.LEFT_EDGE) ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		corners[(points)++].y = (reentry & DefineConstants.TOP_EDGE) ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		}
		else
		{
		corners[(points)].x = (exit | reentry) & DefineConstants.LEFT_EDGE ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		corners[(points)++].y = (exit | reentry) & DefineConstants.TOP_EDGE ? (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5) : (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		}
	}
	public static void fill_between(double x1, double xu1, double yl1, double yu1, double x2, double xu2, double yl2, double yu2, curve_points plot)
	{
		double xmin;
		double xmax;
		double ymin;
		double ymax;
		double dx;
		double dy1;
		double dy2;
		int axis;
		int ic;
		int iy;
		gpiPoint[] box = new gpiPoint[8];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	GlobalMembersMouse.struct
	//	{
	//		double x,y;
	//	}
		corners[8];

		/* Clip against x-axis range */
		/* It would be nice if we could trust xmin to be less than xmax */
		axis = plot.x_axis;
		xmin = ((GlobalMembersAxis.axis_array[axis].min) < (GlobalMembersAxis.axis_array[axis].max) ? (GlobalMembersAxis.axis_array[axis].min) : (GlobalMembersAxis.axis_array[axis].max));
		xmax = ((GlobalMembersAxis.axis_array[axis].min) > (GlobalMembersAxis.axis_array[axis].max) ? (GlobalMembersAxis.axis_array[axis].min) : (GlobalMembersAxis.axis_array[axis].max));
		if (!((((xmin)<(xmax)) ? (((x1) >= (xmin)) && ((x1) <= (xmax))) : (((x1) >= (xmax)) && ((x1) <= (xmin))))) && !((((xmin)<(xmax)) ? (((x2) >= (xmin)) && ((x2) <= (xmax))) : (((x2) >= (xmax)) && ((x2) <= (xmin))))))
			return;

		/* Clip end segments. It would be nice to use edge_intersect() here, */
		/* but as currently written it cannot handle the second curve.       */
		dx = x2 - x1;
		if (x1 < xmin)
		{
			yl1 += (yl2 - yl1) * (xmin - x1) / dx;
			yu1 += (yu2 - yu1) * (xmin - x1) / dx;
			x1 = xmin;
		}
		if (x2 > xmax)
		{
			yl2 += (yl2 - yl1) * (xmax - x2) / dx;
			yu2 += (yu2 - yu1) * (xmax - x2) / dx;
			x2 = xmax;
		}
		if (!GlobalMembersGadgets.polar)
		{
			xu1 = x1;
			xu2 = x2;
		}

		/* Clip against y-axis range */
		axis = plot.y_axis;
		ymin = ((GlobalMembersAxis.axis_array[axis].min) < (GlobalMembersAxis.axis_array[axis].max) ? (GlobalMembersAxis.axis_array[axis].min) : (GlobalMembersAxis.axis_array[axis].max));
		ymax = ((GlobalMembersAxis.axis_array[axis].min) > (GlobalMembersAxis.axis_array[axis].max) ? (GlobalMembersAxis.axis_array[axis].min) : (GlobalMembersAxis.axis_array[axis].max));
		if (yl1 < ymin && yu1 < ymin && yl2 < ymin && yu2 < ymin)
			return;
		if (yl1 > ymax && yu1 > ymax && yl2 > ymax && yu2 > ymax)
			return;

		ic = 0;
		corners[ic].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		corners[ic++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yl1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		corners[ic].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((xu1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		corners[ic++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yu1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define INTERPOLATE(Y1,Y2,YBOUND) do { dy1 = YBOUND - Y1; dy2 = YBOUND - Y2; if (dy1 != dy2 && dy1*dy2 < 0) { corners[ic].y = (int) ((axis_array[y_axis].term_lower) + ((YBOUND) - axis_array[y_axis].min) * axis_array[y_axis].term_scale + 0.5); corners[ic++].x = (int) ((axis_array[x_axis].term_lower) + ((x1 + dx * dy1 / (dy1-dy2)) - axis_array[x_axis].min) * axis_array[x_axis].term_scale + 0.5); } } while (0)

		do
		{
			dy1 = ymin - yu1;
			dy2 = ymin - yu2;
			if (dy1 != dy2 && dy1 * dy2 < 0)
			{
				corners[ic].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymin) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				corners[ic++].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x1 + dx * dy1 / (dy1 - dy2)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			}
		} while (0);
		do
		{
			dy1 = ymax - yu1;
			dy2 = ymax - yu2;
			if (dy1 != dy2 && dy1 * dy2 < 0)
			{
				corners[ic].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymax) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				corners[ic++].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x1 + dx * dy1 / (dy1 - dy2)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			}
		} while (0);

		corners[ic].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((xu2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		corners[ic++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yu2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		corners[ic].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		corners[ic++].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yl2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

		do
		{
			dy1 = ymin - yl1;
			dy2 = ymin - yl2;
			if (dy1 != dy2 && dy1 * dy2 < 0)
			{
				corners[ic].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymin) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				corners[ic++].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x1 + dx * dy1 / (dy1 - dy2)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			}
		} while (0);
		do
		{
			dy1 = ymax - yl1;
			dy2 = ymax - yl2;
			if (dy1 != dy2 && dy1 * dy2 < 0)
			{
				corners[ic].y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymax) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				corners[ic++].x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x1 + dx * dy1 / (dy1 - dy2)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			}
		} while (0);

	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#undef INTERPOLATE

		/* Copy the polygon vertices into a gpiPoints structure */
		for (iy = 0; iy < ic; iy++)
		{
			box[iy].x = corners[iy].x;
			do
			{
				if (((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymin) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5)) < ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymax) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5)))
				{
					if ((corners[iy].y) > ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymax) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5)))
						(corners[iy].y) = ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymax) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
						else if ((corners[iy].y) < ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymin) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5)))
							(corners[iy].y) = ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymin) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
				}
				else
				{
					if ((corners[iy].y) > ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymin) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5)))
						(corners[iy].y) = ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymin) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
						else if ((corners[iy].y) < ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymax) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5)))
							(corners[iy].y) = ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ymax) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
				}
			} while (0);
			box[iy].y = corners[iy].y;
		}

		/* finish_filled_curve() will handle   */
		/* current fill style (stored in plot) */
		/* above/below (stored in box[ic].x)   */
		if (GlobalMembersGadgets.polar)
		{
			/* "above" or "below" evaluated in terms of radial distance from origin */
			/* FIXME: Most of this should be offloaded to a separate subroutine */
			double ox = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((0) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			double oy = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((0) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			double plx = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			double ply = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yl1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			double pux = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((xu1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			double puy = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yu1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			double drl = (plx - ox) * (plx - ox) + (ply - oy) * (ply - oy);
			double dru = (pux - ox) * (pux - ox) + (puy - oy) * (puy - oy);
			double dx1 = dru - drl;

			double dx2;
			plx = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			ply = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yl2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			pux = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((xu2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			puy = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yu2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			drl = (plx - ox) * (plx - ox) + (ply - oy) * (ply - oy);
			dru = (pux - ox) * (pux - ox) + (puy - oy) * (puy - oy);
			dx2 = dru - drl;

			box[ic].x = (dx1 + dx2 < 0) ? 1 : 0;
		}
		else
			box[ic].x = ((yu1 - yl1) + (yu2 - yl2) < 0) ? 1 : 0;

//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: finish_filled_curve(ic, box, plot);
		GlobalMembersGraphics.finish_filled_curve(ic, new gpiPoint(box), plot);
	}

/* EAM April 2004 - If the line segment crosses a bounding line we will
 * interpolate an extra corner and split the filled polygon into two.
 */
	public static boolean bound_intersect(coordinate[] points, int i, double ex, double ey, filledcurves_opts filledcurves_options)
	{
		double dx1;
		double dx2;
		double dy1;
		double dy2;

		/* If there are no bounding lines in effect, don't bother */
		if (filledcurves_options.oneside == 0)
		return false;

		switch (filledcurves_options.closeto)
		{
		case FILLEDCURVES_ATX1:
		case FILLEDCURVES_ATX2:
			dx1 = filledcurves_options.at - points[i - 1].x;
			dx2 = filledcurves_options.at - points[i].x;
			dy1 = points[i].y - points[i - 1].y;
			if (dx1 * dx2 < 0)
			{
			ex = filledcurves_options.at;
			ey = points[i - 1].y + dy1 * dx1 / (dx1 - dx2);
			return true;
			}
			break;
		case FILLEDCURVES_ATY1:
		case FILLEDCURVES_ATY2:
			dy1 = filledcurves_options.at - points[i - 1].y;
			dy2 = filledcurves_options.at - points[i].y;
			dx1 = points[i].x - points[i - 1].x;
			if (dy1 * dy2 < 0)
			{
			ex = points[i - 1].x + dx1 * dy1 / (dy1 - dy2);
			ey = filledcurves_options.at;
			return true;
			}
			break;
		case FILLEDCURVES_ATXY:
		default:
			break;
		}

		return false;
	}

/* plot_vectors:
 * Plot the curves in VECTORS style
 */
	public static void plot_vectors(curve_points plot)
	{
		int i;
		int x1;
		int y1;
		int x2;
		int y2;
		TERMENTRY t = GlobalMembersTerm.term;
		coordinate[] points = new coordinate[2];
		double ex;
		double ey;
		double[] lx = new double[2];
		double[] ly = new double[2];

		/* Only necessary once because all arrows equal */
		GlobalMembersTerm.term_apply_lp_properties((plot.arrow_properties.lp_properties));
		GlobalMembersGraphics.apply_head_properties((plot.arrow_properties));

		for (i = 0; i < plot.p_count; i++)
		{

		points[0] = plot.points[i];
		if (points[0].type == coord_type.UNDEFINED)
			continue;

		points[1].x = plot.points[i].xhigh;
		points[1].y = plot.points[i].yhigh;

		/* variable color read from extra data column. Most styles */
		/* have this stored in yhigh, but VECTOR stuffed it into z */
		points[0].yhigh = points[0].z;
		GlobalMembersGraph3d.check_for_variable_color(plot, points[0]);

		if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((points[1].x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((points[1].x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((points[1].x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((points[1].x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))) && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((points[1].y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((points[1].y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((points[1].y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((points[1].y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
			/* to inrange */
			points[1].type = coord_type.INRANGE;
			x2 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((points[1].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y2 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((points[1].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			if (points[0].type == coord_type.INRANGE)
			{
			x1 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((points[0].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y1 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((points[0].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.arrow)(x1, y1, x2, y2, plot.arrow_properties.head);
			}
			else if (points[0].type == coord_type.OUTRANGE)
			{
			/* from outrange to inrange */
			if (GlobalMembersGadgets.clip_lines1)
			{
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: edge_intersect(points, 1, &ex, &ey);
				GlobalMembersGraphics.edge_intersect(new coordinate(points), 1, ex, ey);
				x1 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				y1 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				if (plot.arrow_properties.head & e_arrow_head.END_HEAD != 0)
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.arrow)(x1, y1, x2, y2, e_arrow_head.END_HEAD);
				else
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.arrow)(x1, y1, x2, y2, e_arrow_head.NOHEAD);
			}
			}
		}
		else
		{
			/* to outrange */
			points[1].type = coord_type.OUTRANGE;
			if (points[0].type == coord_type.INRANGE)
			{
			/* from inrange to outrange */
			if (GlobalMembersGadgets.clip_lines1)
			{
				x1 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((points[0].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				y1 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((points[0].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: edge_intersect(points, 1, &ex, &ey);
				GlobalMembersGraphics.edge_intersect(new coordinate(points), 1, ex, ey);
				x2 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				y2 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				if (plot.arrow_properties.head & e_arrow_head.BACKHEAD != 0)
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.arrow)(x2, y2, x1, y1, e_arrow_head.BACKHEAD);
				else
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.arrow)(x1, y1, x2, y2, e_arrow_head.NOHEAD);
			}
			}
			else if (points[0].type == coord_type.OUTRANGE)
			{
			/* from outrange to outrange */
			if (GlobalMembersGadgets.clip_lines2)
			{
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: if (two_edge_intersect(points, 1, lx, ly))
				if (GlobalMembersGraphics.two_edge_intersect(new coordinate(points), 1, lx, ly))
				{
				x1 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				y1 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
				x2 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
				y2 = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.arrow)(x1, y1, x2, y2, e_arrow_head.NOHEAD);
				}
			}
			}
		}
		}
	}

/* plot_f_bars() - finance bars */
	public static void plot_f_bars(curve_points plot)
	{
		int i; // point index
		TERMENTRY t = GlobalMembersTerm.term;
		double x; // position of the bar
		double ylow; // the ends of the bars
		double yhigh;
		double yclose;
		double yopen;
		int xM; // the mapped version of above
		int ylowM;
		int yhighM;
		boolean low_inrange;
		boolean high_inrange;
		int tic = ((((t.h_tic / 2)) > (1) ? ((t.h_tic / 2)) : (1) / 2) > (1) ? (((t.h_tic / 2)) > (1) ? ((t.h_tic / 2)) : (1) / 2) : (1));

		for (i = 0; i < plot.p_count; i++)
		{
		/* undefined points don't count */
		if (plot.points[i].type == coord_type.UNDEFINED)
			continue;

		/* check to see if in xrange */
		x = plot.points[i].x;
		if (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
			continue;
		xM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

		/* find low and high points of bar, and check yrange */
		yhigh = plot.points[i].yhigh;
		ylow = plot.points[i].ylow;
		yclose = plot.points[i].z;
		yopen = plot.points[i].y;

		high_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((yhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((yhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((yhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((yhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))));
		low_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((ylow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((ylow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((ylow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((ylow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))));

		/* compute the plot position of yhigh */
		if (high_inrange)
			yhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yhigh) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		else if (((yhigh - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= 0))
			yhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		else
			yhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

		/* compute the plot position of ylow */
		if (low_inrange)
			ylowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ylow) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		else if (((ylow - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= 0))
			ylowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		else
			ylowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

		if (!high_inrange && !low_inrange && ylowM == yhighM)
			/* both out of range on the same side */
			continue;

		/* by here everything has been mapped */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)(xM, ylowM);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(xM, yhighM); // draw the main bar
		/* draw the open tic */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)((int)(xM - bar_size * tic), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yopen) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(xM, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yopen) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
		/* draw the close tic */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)((int)(xM + bar_size * tic), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yclose) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(xM, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yclose) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
		}
	}

/* plot_c_bars:
 * Plot the curves in CANDLESTICSK style
 * EAM Apr 2008 - switch to using empty/fill rather than empty/striped 
 *		  to distinguish whether (open > close)
 */
	public static void plot_c_bars(curve_points plot)
	{
		TERMENTRY t = GlobalMembersTerm.term;
		int i;
		double x; // position of the bar
		double dxl; // the ends of the bars
		double dxr;
		double ylow;
		double yhigh;
		double yclose;
		double yopen;
		int xlowM; // mapped version of above
		int xhighM;
		int xM;
		int ylowM;
		int yhighM;
		int ymin; // clipped to plot extent
		int ymax;
		coord_type prev = coord_type.UNDEFINED; // type of previous point
		boolean low_inrange;
		boolean high_inrange;
		boolean open_inrange;
		boolean close_inrange;
		int tic = ((((t.h_tic / 2)) > (1) ? ((t.h_tic / 2)) : (1) / 2) > (1) ? (((t.h_tic / 2)) > (1) ? ((t.h_tic / 2)) : (1) / 2) : (1));

		for (i = 0; i < plot.p_count; i++)
		{
		boolean skip_box = false;

		/* undefined points don't count */
		if (plot.points[i].type == coord_type.UNDEFINED)
			continue;

		/* check to see if in xrange */
		x = plot.points[i].x;
		if (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
			continue;
		xM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

		/* find low and high points of bar, and check yrange */
		yhigh = plot.points[i].yhigh;
		ylow = plot.points[i].ylow;
		yclose = plot.points[i].z;
		yopen = plot.points[i].y;

		/* HBB 20010928: To make code match the documentation, ensure
		 * yhigh is actually higher than ylow */
		if (yhigh < ylow)
		{
			double temp = ylow;
			ylow = yhigh;
			yhigh = temp;
		}

		high_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((yhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((yhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((yhigh) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((yhigh) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))));
		low_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((ylow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((ylow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((ylow) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((ylow) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))));

		/* compute the plot position of yhigh */
		if (high_inrange)
			yhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yhigh) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		else if (((yhigh - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= 0))
			yhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		else
			yhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

		/* compute the plot position of ylow */
		if (low_inrange)
			ylowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ylow) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		else if (((ylow - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= 0))
			ylowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		else
			ylowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

		if (!high_inrange && !low_inrange && ylowM == yhighM)
			/* both out of range on the same side */
			continue;

		if (GlobalMembersPlot2d.boxwidth < 0.0)
		{
			xlowM = xM - bar_size * tic;
			xhighM = xM + bar_size * tic;

		}
		else
		{
			dxl = -GlobalMembersPlot2d.boxwidth / 2.0;
			if (prev != coord_type.UNDEFINED)
			if (!GlobalMembersPlot2d.boxwidth_is_absolute)
				dxl = (plot.points[i - 1].x - plot.points[i].x) * GlobalMembersPlot2d.boxwidth / 2.0;

			dxr = -dxl;
			if (i < plot.p_count - 1)
			{
			if (plot.points[i + 1].type != coord_type.UNDEFINED)
			{
				if (!GlobalMembersPlot2d.boxwidth_is_absolute)
				dxr = (plot.points[i + 1].x - plot.points[i].x) * GlobalMembersPlot2d.boxwidth / 2.0;
				else
				dxr = GlobalMembersPlot2d.boxwidth / 2.0;
			}
			}

		if (prev == coord_type.UNDEFINED)
			dxl = -dxr;

		dxl = plot.points[i].x + dxl;
		dxr = plot.points[i].x + dxr;
		do
		{
			if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
			{
				if ((dxr) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
					(dxr) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
					else if ((dxr) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(dxr) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
			}
			else
			{
				if ((dxr) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
					(dxr) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
					else if ((dxr) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(dxr) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
			}
		} while (0);
		do
		{
			if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
			{
				if ((dxl) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
					(dxl) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
					else if ((dxl) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(dxl) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
			}
			else
			{
				if ((dxl) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
					(dxl) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
					else if ((dxl) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(dxl) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
			}
		} while (0);
		xlowM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((dxl) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		xhighM = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((dxr) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		}

		/* EAM Feb 2007 Force width to be an odd number of pixels */
		/* so that the center bar can be centered perfectly.	  */
		if (((xhighM - xlowM) & 01) != 0)
		{
			xhighM++;
			if (xM - xlowM > xhighM - xM)
				xM--;
			if (xM - xlowM < xhighM - xM)
				xM++;
		}

		/* EAM Feb 2006 Clip to plot vertical extent */
		open_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((yopen) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((yopen) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((yopen) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((yopen) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))));
		close_inrange = (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((yclose) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((yclose) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((yclose) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((yclose) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))));
		do
		{
			if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
			{
				if ((yopen) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
					(yopen) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
					else if ((yopen) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(yopen) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
			}
			else
			{
				if ((yopen) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
					(yopen) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
					else if ((yopen) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(yopen) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
			}
		} while (0);
		do
		{
			if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
			{
				if ((yclose) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
					(yclose) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
					else if ((yclose) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(yclose) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
			}
			else
			{
				if ((yclose) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
					(yclose) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
					else if ((yclose) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(yclose) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
			}
		} while (0);
		if ((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yopen) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5) < (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yclose) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5))
		{
			ymin = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yopen) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			ymax = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yclose) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		}
		else
		{
			ymax = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yopen) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			ymin = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yclose) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		}
		if (!open_inrange && !close_inrange && ymin == ymax)
			skip_box = true;

		/* Reset to original color, if we changed it for the border */
		if (plot.fill_properties.border_color.type != DefineConstants.TC_DEFAULT && !(plot.fill_properties.border_color.type == DefineConstants.TC_LT && plot.fill_properties.border_color.lt == DefineConstants.LT_NODRAW))
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.linetype)(plot.lp_properties.l_type);
			if (plot.lp_properties.use_palette)
				GlobalMembersGadgets.apply_pm3dcolor(plot.lp_properties.pm3d_color, t);
		}

		/* Boxes are always filled if an explicit non-empty fillstyle is set. */
		/* If the fillstyle is FS_EMPTY, fill to indicate (open > close).     */
		if (GlobalMembersTerm.term.fillbox && !skip_box)
		{
			int style = GlobalMembersTerm.style_from_fill(plot.fill_properties);
			if ((style != t_fillstyle.FS_EMPTY.getValue()) || (yopen > yclose))
			{
			int x = xlowM;
			int y = ymin;
			int w = (xhighM - xlowM);
			int h = (ymax - ymin);

			if (style == t_fillstyle.FS_EMPTY.getValue())
				style = t_fillstyle.FS_SOLID.getValue() + (100 << 4);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.fillbox)(style, x, y, w, h);

			if (GlobalMembersTerm.style_from_fill(plot.fill_properties) != t_fillstyle.FS_EMPTY)
				GlobalMembersMisc.need_fill_border(plot.fill_properties);
			}
		}

		/* Draw whiskers and an open box */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xM, ylowM);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xM, ymin);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xM, ymax);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xM, yhighM);

			if (!skip_box)
			{
			GlobalMembersTerm.newpath();
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xlowM, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yopen) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xhighM, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yopen) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xhighM, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yclose) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xlowM, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yclose) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xlowM, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((yopen) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
			GlobalMembersTerm.closepath();
			}

		/* Some users prefer bars at the end of the whiskers */
		if (plot.arrow_properties.head == e_arrow_head.BOTH_HEADS)
		{
			double frac = plot.arrow_properties.head_length;
			int d = (frac <= 0) ? 0 : (xhighM - xlowM) * (1.-frac) / 2.;

			if (high_inrange)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xlowM+d, yhighM);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xhighM-d, yhighM);
			}
			if (low_inrange)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xlowM+d, ylowM);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xhighM-d, ylowM);
			}
		}

		/* Through 4.2 gnuplot would indicate (open > close) by drawing     */
		/* three vertical bars.  Now we use solid fill.  But if the current */
		/* terminal does not support filled boxes, fall back to the old way */
		if ((yopen > yclose) && !(GlobalMembersTerm.term.fillbox))
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(xM, ymin);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(xM, ymax);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)((xM + xlowM) / 2, ymin);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)((xM + xlowM) / 2, ymax);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)((xM + xhighM) / 2, ymin);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)((xM + xhighM) / 2, ymax);
		}

		prev = plot.points[i].type;
		}
	}

	public static void place_labels(text_label listhead, int layer, boolean clip)
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

		if (layer == DefineConstants.LAYER_PLOTLABELS)
		{
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((this_label.place.x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((this_label.place.y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		}
		else
			GlobalMembersGraphics.map_position(this_label.place, x, y, "label");

		if (clip)
		{
			if (this_label.place.scalex == position_type.first_axes)
			if (!((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? (((this_label.place.x) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && ((this_label.place.x) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : (((this_label.place.x) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && ((this_label.place.x) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min))))))
				continue;
			if (this_label.place.scalex == position_type.second_axes)
			if (!((((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max)) ? (((this_label.place.x) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min)) && ((this_label.place.x) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max))) : (((this_label.place.x) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max)) && ((this_label.place.x) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min))))))
				continue;
			if (this_label.place.scaley == position_type.first_axes)
			if (!((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? (((this_label.place.y) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && ((this_label.place.y) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : (((this_label.place.y) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && ((this_label.place.y) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min))))))
				continue;
			if (this_label.place.scaley == position_type.second_axes)
			if (!((((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].max)) ? (((this_label.place.y) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min)) && ((this_label.place.y) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].max))) : (((this_label.place.y) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].max)) && ((this_label.place.y) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min))))))
				continue;

		}

		GlobalMembersGadgets.write_label(x, y, this_label);
		}
	}
	public static void place_arrows(int layer)
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
		GlobalMembersGraphics.get_arrow(this_arrow, sx, sy, ex, ey);

		GlobalMembersTerm.term_apply_lp_properties((this_arrow.arrow_properties.lp_properties));
		GlobalMembersGraphics.apply_head_properties((this_arrow.arrow_properties));
		GlobalMembersGadgets.draw_clip_arrow(sx, sy, ex, ey, this_arrow.arrow_properties.head);
		}
		GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp);
		GlobalMembersGadgets.clip_area = clip_save;
	}
	public static void place_grid()
	{
		TERMENTRY t = GlobalMembersTerm.term;

		GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp); // border linetype
		largest_polar_circle = 0;

		/* select first mapping */
		GlobalMembersAxis.x_axis = AXIS_INDEX.FIRST_X_AXIS;
		GlobalMembersAxis.y_axis = AXIS_INDEX.FIRST_Y_AXIS;

		/* label first y axis tics */
		GlobalMembersAxis.axis_output_tics(AXIS_INDEX.FIRST_Y_AXIS, ytic_x, AXIS_INDEX.FIRST_X_AXIS, GlobalMembersGraphics.ytick2d_callback);
				 /* (GRID_Y | GRID_MY), */
		/* label first x axis tics */
		GlobalMembersAxis.axis_output_tics(AXIS_INDEX.FIRST_X_AXIS, xtic_y, AXIS_INDEX.FIRST_Y_AXIS, GlobalMembersGraphics.xtick2d_callback);
				 /* (GRID_X | GRID_MX), */

		/* select second mapping */
		GlobalMembersAxis.x_axis = AXIS_INDEX.SECOND_X_AXIS;
		GlobalMembersAxis.y_axis = AXIS_INDEX.SECOND_Y_AXIS;

		GlobalMembersAxis.axis_output_tics(AXIS_INDEX.SECOND_Y_AXIS, y2tic_x, AXIS_INDEX.SECOND_X_AXIS, GlobalMembersGraphics.ytick2d_callback);
				 /* (GRID_Y2 | GRID_MY2), */
		GlobalMembersAxis.axis_output_tics(AXIS_INDEX.SECOND_X_AXIS, x2tic_y, AXIS_INDEX.SECOND_Y_AXIS, GlobalMembersGraphics.xtick2d_callback);
				 /* (GRID_X2 | GRID_MX2), */


		/* select first mapping */
		GlobalMembersAxis.x_axis = AXIS_INDEX.FIRST_X_AXIS;
		GlobalMembersAxis.y_axis = AXIS_INDEX.FIRST_Y_AXIS;

	/* RADIAL LINES FOR POLAR GRID */

		/* note that draw_clip_line takes unsigneds, but (fortunately)
		 * clip_line takes signeds
		 */
		if (GlobalMembersAxis.polar_grid_angle != 0)
		{
		double theta = 0;
		int ox = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((0) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		int oy = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((0) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		GlobalMembersTerm.term_apply_lp_properties(GlobalMembersAxis.grid_lp);
		for (theta = 0; theta < 6.29; theta += GlobalMembersAxis.polar_grid_angle)
		{
			/* copy ox in case it gets moved (but it shouldn't) */
			int oox = ox;
			int ooy = oy;
			int x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((largest_polar_circle * Math.cos(theta)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			int y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((largest_polar_circle * Math.sin(theta)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			if (GlobalMembersGadgets.clip_line(oox, ooy, x, y) != 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)((int) oox, (int) ooy);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)((int) x, (int) y);
			}
		}
		GlobalMembersGadgets.draw_clip_line(ox, oy, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((largest_polar_circle * Math.cos(theta)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((largest_polar_circle * Math.sin(theta)) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
		}
	}

/* FIXME
 * there are LOADS of == style double comparisons in here!
 */
/* single edge intersection algorithm */
/* Given two points, one inside and one outside the plot, return
 * the point where an edge of the plot intersects the line segment defined
 * by the two points.
 */

	public static int edge_intersect(coordinate[] points, int i, double ex, double ey)
	{
		double ix = points[i - 1].x;
		double iy = points[i - 1].y;
		double ox = points[i].x;
		double oy = points[i].y;
		double x; // possible intersection point
		double y;

		if (points[i].type == coord_type.INRANGE)
		{
		/* swap points around so that ix/ix/iz are INRANGE and
		 * ox/oy/oz are OUTRANGE
		 */
		x = ix;
		ix = ox;
		ox = x;
		y = iy;
		iy = oy;
		oy = y;
		}
		/* nasty degenerate cases, effectively drawing to an infinity point (?)
		 * cope with them here, so don't process them as a "real" OUTRANGE point
		 *
		 * If more than one coord is -VERYLARGE, then can't ratio the "infinities"
		 * so drop out by returning the INRANGE point.
		 *
		 * Obviously, only need to test the OUTRANGE point (coordinates) */
		if (ox == -DefineConstants.VERYLARGE || oy == -DefineConstants.VERYLARGE)
		{
		ex = ix;
		ey = iy;

		if (ox == -DefineConstants.VERYLARGE)
		{
			/* can't get a direction to draw line, so simply
			 * return INRANGE point */
			if (oy == -DefineConstants.VERYLARGE)
			return DefineConstants.LEFT_EDGE | DefineConstants.BOTTOM_EDGE;

			ex = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
			return DefineConstants.LEFT_EDGE;
		}
		/* obviously oy is -VERYLARGE and ox != -VERYLARGE */
		ey = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
		return DefineConstants.BOTTOM_EDGE;
		}
		/*
		 * Can't have case (ix == ox && iy == oy) as one point
		 * is INRANGE and one point is OUTRANGE.
		 */
		if (iy == oy)
		{
		/* horizontal line */
		/* assume inrange(iy, Y_AXIS.min, Y_AXIS.max) */
		ey = iy; // == oy

		if ((((ix)<(ox)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) >= (ix)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) <= (ox))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) >= (ox)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) <= (ix)))))
		{
			ex = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
			return DefineConstants.RIGHT_EDGE;
		}
		else if ((((ix)<(ox)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= (ix)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) <= (ox))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= (ox)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) <= (ix)))))
		{
			ex = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
			return DefineConstants.LEFT_EDGE;
		}
		else
		{
			GlobalMembersUtil.graph_error("error in edge_intersect");
			return 0;
		}
		}
		else if (ix == ox)
		{
		/* vertical line */
		/* assume inrange(ix, X_AXIS.min, X_AXIS.max) */
		ex = ix; // == ox

		if ((((iy)<(oy)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) >= (iy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) <= (oy))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) >= (oy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) <= (iy)))))
		{
			ey = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
			return DefineConstants.TOP_EDGE;
		}
		else if ((((iy)<(oy)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= (iy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) <= (oy))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= (oy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) <= (iy)))))
		{
			ey = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
			return DefineConstants.BOTTOM_EDGE;
		}
		else
		{
			GlobalMembersUtil.graph_error("error in edge_intersect");
			return 0;
		}
		}
		/* slanted line of some kind */

		/* does it intersect Y_AXIS.min edge */
		if ((((iy)<(oy)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= (iy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) <= (oy))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= (oy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) <= (iy)))) && GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min != iy && GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min != oy)
		{
		x = ix + (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min - iy) * ((ox - ix) / (oy - iy));
		if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
			ex = x;
			ey = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
			return DefineConstants.BOTTOM_EDGE; // yes
		}
		}
		/* does it intersect Y_AXIS.max edge */
		if ((((iy)<(oy)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) >= (iy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) <= (oy))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) >= (oy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) <= (iy)))) && GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max != iy && GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max != oy)
		{
		x = ix + (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - iy) * ((ox - ix) / (oy - iy));
		if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((x) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((x) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
			ex = x;
			ey = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
			return DefineConstants.TOP_EDGE; // yes
		}
		}
		/* does it intersect X_AXIS.min edge */
		if ((((ix)<(ox)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= (ix)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) <= (ox))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= (ox)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) <= (ix)))) && GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min != ix && GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min != ox)
		{
		y = iy + (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min - ix) * ((oy - iy) / (ox - ix));
		if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
			ex = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
			ey = y;
			return DefineConstants.LEFT_EDGE;
		}
		}
		/* does it intersect X_AXIS.max edge */
		if ((((ix)<(ox)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) >= (ix)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) <= (ox))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) >= (ox)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) <= (ix)))) && GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max != ix && GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max != ox)
		{
		y = iy + (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - ix) * ((oy - iy) / (ox - ix));
		if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((y) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((y) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
			ex = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
			ey = y;
			return DefineConstants.RIGHT_EDGE;
		}
		}
		/* If we reach here, the inrange point is on the edge, and
		 * the line segment from the outrange point does not cross any
		 * other edges to get there. In this case, we return the inrange
		 * point as the 'edge' intersection point. This will basically draw
		 * line.
		 */
		ex = ix;
		ey = iy;
		return 0;
	}

/* double edge intersection algorithm */
/* Given two points, both outside the plot, return
 * the points where an edge of the plot intersects the line segment defined
 * by the two points. There may be zero, one, two, or an infinite number
 * of intersection points. (One means an intersection at a corner, infinite
 * means overlaying the edge itself). We return FALSE when there is nothing
 * to draw (zero intersections), and TRUE when there is something to
 * draw (the one-point case is a degenerate of the two-point case and we do
 * not distinguish it - we draw it anyway).
 */
	public static boolean two_edge_intersect(coordinate[] points, int i, double[] lx, double[] ly)
	{
		/* global X_AXIS.min, X_AXIS.max, Y_AXIS.min, X_AXIS.max */
		int count;
		double ix = points[i - 1].x;
		double iy = points[i - 1].y;
		double ox = points[i].x;
		double oy = points[i].y;
		double[] t = new double[4];
		double swap;
		double t_min;
		double t_max;

		/* nasty degenerate cases, effectively drawing to an infinity
		 * point (?)  cope with them here, so don't process them as a
		 * "real" OUTRANGE point
	
		 * If more than one coord is -VERYLARGE, then can't ratio the
		 * "infinities" so drop out by returning FALSE */

		count = 0;
		if (ix == -DefineConstants.VERYLARGE)
		count++;
		if (ox == -DefineConstants.VERYLARGE)
		count++;
		if (iy == -DefineConstants.VERYLARGE)
		count++;
		if (oy == -DefineConstants.VERYLARGE)
		count++;

		/* either doesn't pass through graph area *or* can't ratio
		 * infinities to get a direction to draw line, so simply
		 * return(FALSE) */
		if (count > 1)
		{
		return (false);
		}

		if (ox == -DefineConstants.VERYLARGE || ix == -DefineConstants.VERYLARGE)
		{
		/* Horizontal line */
		if (ix == -DefineConstants.VERYLARGE)
		{
			/* swap points so ix/iy don't have a -VERYLARGE component */
			swap = ix;
			ix = ox;
			ox = swap;
			swap = iy;
			iy = oy;
			oy = swap;
		}
		/* check actually passes through the graph area */
		if (ix > ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) ? (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((iy) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((iy) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((iy) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((iy) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
			lx[0] = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
			ly[0] = iy;

			lx[1] = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
			ly[1] = iy;
			return (true);
		}
		else
		{
			return (false);
		}
		}
		if (oy == -DefineConstants.VERYLARGE || iy == -DefineConstants.VERYLARGE)
		{
		/* Vertical line */
		if (iy == -DefineConstants.VERYLARGE)
		{
			/* swap points so ix/iy don't have a -VERYLARGE component */
			swap = ix;
			ix = ox;
			ox = swap;
			swap = iy;
			iy = oy;
			oy = swap;
		}
		/* check actually passes through the graph area */
		if (iy > ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) ? (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((ix) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((ix) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((ix) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((ix) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
			lx[0] = ix;
			ly[0] = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;

			lx[1] = ix;
			ly[1] = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
			return (true);
		}
		else
		{
			return (false);
		}
		}
		/*
		 * Special horizontal/vertical, etc. cases are checked and remaining
		 * slant lines are checked separately.
		 *
		 * The slant line intersections are solved using the parametric form
		 * of the equation for a line, since if we test x/y min/max planes explicitly
		 * then e.g. a  line passing through a corner point (X_AXIS.min,Y_AXIS.min)
		 * actually intersects 2 planes and hence further tests would be required
		 * to anticipate this and similar situations.
		 */

		/*
		 * Can have case (ix == ox && iy == oy) as both points OUTRANGE
		 */
		if (ix == ox && iy == oy)
		{
		/* but as only define single outrange point, can't intersect graph area */
		return (false);
		}
		if (ix == ox)
		{
		/* line parallel to y axis */

		/* x coord must be in range, and line must span both Y_AXIS.min and Y_AXIS.max */
		/* note that spanning Y_AXIS.min implies spanning Y_AXIS.max, as both points OUTRANGE */
		if (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((ix) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((ix) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((ix) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((ix) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
			return (false);
		}
		if ((((iy)<(oy)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= (iy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) <= (oy))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) >= (oy)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) <= (iy)))))
		{
			lx[0] = ix;
			ly[0] = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;

			lx[1] = ix;
			ly[1] = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
			return (true);
		}
		else
			return (false);
		}
		if (iy == oy)
		{
		/* already checked case (ix == ox && iy == oy) */

		/* line parallel to x axis */
		/* y coord must be in range, and line must span both X_AXIS.min and X_AXIS.max */
		/* note that spanning X_AXIS.min implies spanning X_AXIS.max, as both points OUTRANGE */
		if (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((iy) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((iy) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((iy) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((iy) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
			return (false);
		}
		if ((((ix)<(ox)) ? (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= (ix)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) <= (ox))) : (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) >= (ox)) && ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) <= (ix)))))
		{
			lx[0] = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
			ly[0] = iy;

			lx[1] = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
			ly[1] = iy;
			return (true);
		}
		else
			return (false);
		}
		/* nasty 2D slanted line in an xy plane */

		/* From here on, it's essentially the classical Cyrus-Beck, or
		 * Liang-Barsky algorithm for line clipping to a rectangle */
		/*
		   Solve parametric equation
	
		   (ix, iy) + t (diff_x, diff_y)
	
		   where 0.0 <= t <= 1.0 and
	
		   diff_x = (ox - ix);
		   diff_y = (oy - iy);
		 */

		t[0] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min - ix) / (ox - ix);
		t[1] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - ix) / (ox - ix);
		if (t[0] > t[1])
		{
		swap = t[0];
		t[0] = t[1];
		t[1] = swap;
		}

		t[2] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min - iy) / (oy - iy);
		t[3] = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - iy) / (oy - iy);
		if (t[2] > t[3])
		{
		swap = t[2];
		t[2] = t[3];
		t[3] = swap;
		}

		t_min = ((((t[0]) > (t[2]) ? (t[0]) : (t[2]))) > (0.0) ? (((t[0]) > (t[2]) ? (t[0]) : (t[2]))) : (0.0));
		t_max = ((((t[1]) < (t[3]) ? (t[1]) : (t[3]))) < (1.0) ? (((t[1]) < (t[3]) ? (t[1]) : (t[3]))) : (1.0));

		if (t_min > t_max)
		return (false);

		lx[0] = ix + t_min * (ox - ix);
		ly[0] = iy + t_min * (oy - iy);

		lx[1] = ix + t_max * (ox - ix);
		ly[1] = iy + t_max * (oy - iy);

		/*
		 * Can only have 0 or 2 intersection points -- only need test one coord
		 */
		/* FIXME: this is UGLY. Need an 'almost_inrange()' function */
		if (((((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min - 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))<((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max + 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))) ? (((lx[0]) >= ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min - 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))) && ((lx[0]) <= ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max + 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))))) : (((lx[0]) >= ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max + 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))) && ((lx[0]) <= ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min - 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))) && ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min - 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))<((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max + 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))) ? (((ly[0]) >= ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min - 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))) && ((ly[0]) <= ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max + 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))))) : (((ly[0]) >= ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max + 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))) && ((ly[0]) <= ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min - 1e-5 * (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))))
		{

		return (true);
		}
		return (false);
	}

/* XXX - JG  */
/* double edge intersection algorithm for "steps" plot */
/* Given two points, both outside the plot, return the points where an
 * edge of the plot intersects the line segments forming a step
 * by the two points. There may be zero, one, two, or an infinite number
 * of intersection points. (One means an intersection at a corner, infinite
 * means overlaying the edge itself). We return FALSE when there is nothing
 * to draw (zero intersections), and TRUE when there is something to
 * draw (the one-point case is a degenerate of the two-point case and we do
 * not distinguish it - we draw it anyway).
 *
 * Recall that if P1 = (x1,y1) and P2 = (x2,y2), the step from
 * P1 to P2 is drawn as two line segments: (x1,y1)->(x2,y1) and
 * (x2,y1)->(x2,y2).
 */
	public static boolean two_edge_intersect_steps(coordinate[] points, int i, double lx, double ly)
	{
		/* global X_AXIS.min, X_AXIS.max, Y_AXIS.min, X_AXIS.max */
		double ax = points[i - 1].x;
		double ay = points[i - 1].y;
		double bx = points[i].x;
		double by = points[i].y;

		if (((ax) > (bx) ? (ax) : (bx)) < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min || ((ax) < (bx) ? (ax) : (bx)) > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max || ((ay) > (by) ? (ay) : (by)) < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min || ((ay) < (by) ? (ay) : (by)) > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max || (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((ay) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((ay) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((ay) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((ay) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))) && !(((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((bx) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((bx) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((bx) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((bx) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))))))
		{
		return (false);
		}
		else if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((ay) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((ay) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((ay) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((ay) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))) && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((bx) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((bx) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((bx) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((bx) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
		/* corner of step inside plotspace */
		do
		{
			if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
			{
				if ((ax) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
					(ax) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
					else if ((ax) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(ax) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
			}
			else
			{
				if ((ax) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
					(ax) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
					else if ((ax) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(ax) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
			}
		} while (0);
		lx++= ax;
		ly++= ay;

		do
		{
			if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
			{
				if ((by) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
					(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
					else if ((by) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
			}
			else
			{
				if ((by) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
					(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
					else if ((by) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
			}
		} while (0);
		lx = bx;
		ly = by;

		return (true);
		}
		else if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((ay) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((ay) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((ay) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((ay) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
		/* cross plotspace in x-direction */
		lx++= GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
		ly++= ay;
		lx = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
		ly = ay;
		return (true);
		}
		else if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
		/* cross plotspace in y-direction */
		lx++= bx;
		ly++= GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
		lx = bx;
		ly = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
		return (true);
		}
		else
		return (false);
	}

/* XXX - JG  */
/* plot_steps:
 * Plot the curves in STEPS style
 */

	public static void plot_steps(curve_points plot)
	{
		int i; // point index
		int x; // point in terminal coordinates
		int y;
		TERMENTRY t = GlobalMembersTerm.term;
		coord_type prev = coord_type.UNDEFINED; // type of previous point
		double ex; // an edge point
		double ey;
		double[] lx = new double[2]; // two edge points
		double[] ly = new double[2];
		int yprev = 0; // previous point coordinates

		for (i = 0; i < plot.p_count; i++)
		{
		switch (plot.points[i].type)
		{
		case INRANGE:
		{
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((plot.points[i].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			if (prev == coord_type.INRANGE)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, yprev);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, y);
			}
			else if (prev == coord_type.OUTRANGE)
			{
				/* from outrange to inrange */
				if (!GlobalMembersGadgets.clip_lines1)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(x, y);
				} // find edge intersection
				else
				{
				GlobalMembersGraphics.edge_intersect_steps(plot.points, i, ex, ey);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, y);
				}
			} // prev == UNDEFINED
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(x, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, y);
			}
			yprev = y;
			break;
		}
		case OUTRANGE:
		{
			if (prev == coord_type.INRANGE)
			{
				/* from inrange to outrange */
				if (GlobalMembersGadgets.clip_lines1)
				{
				GlobalMembersGraphics.edge_intersect_steps(plot.points, i, ex, ey);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), yprev);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
				}
			}
			else if (prev == coord_type.OUTRANGE)
			{
				/* from outrange to outrange */
				if (GlobalMembersGadgets.clip_lines2)
				{
				if (GlobalMembersGraphics.two_edge_intersect_steps(plot.points, i, lx, ly))
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*t.move)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
				}
				}
			}
			break;
		}
		default: // just a safety
		case UNDEFINED:
		{
			break;
		}
		}
		prev = plot.points[i].type;
		}
	}

/* XXX - HOE  */
/* plot_fsteps:
 * Plot the curves in STEPS style by step on forward yvalue
 */
	public static void plot_fsteps(curve_points plot)
	{
		int i; // point index
		int x; // point in terminal coordinates
		int y;
		TERMENTRY t = GlobalMembersTerm.term;
		coord_type prev = coord_type.UNDEFINED; // type of previous point
		double ex; // an edge point
		double ey;
		double[] lx = new double[2]; // two edge points
		double[] ly = new double[2];
		int xprev = 0; // previous point coordinates

		for (i = 0; i < plot.p_count; i++)
		{
		switch (plot.points[i].type)
		{
		case INRANGE:
		{
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((plot.points[i].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

			if (prev == coord_type.INRANGE)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(xprev, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, y);
			}
			else if (prev == coord_type.OUTRANGE)
			{
				/* from outrange to inrange */
				if (!GlobalMembersGadgets.clip_lines1)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(x, y);
				} // find edge intersection
				else
				{
				GlobalMembersGraphics.edge_intersect_fsteps(plot.points, i, ex, ey);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, y);
				}
			} // prev == UNDEFINED
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(x, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, y);
			}
			xprev = x;
			break;
		}
		case OUTRANGE:
		{
			if (prev == coord_type.INRANGE)
			{
				/* from inrange to outrange */
				if (GlobalMembersGadgets.clip_lines1)
				{
				GlobalMembersGraphics.edge_intersect_fsteps(plot.points, i, ex, ey);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(xprev, (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((ex) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ey) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
				}
			}
			else if (prev == coord_type.OUTRANGE)
			{
				/* from outrange to outrange */
				if (GlobalMembersGadgets.clip_lines2)
				{
				if (GlobalMembersGraphics.two_edge_intersect_fsteps(plot.points, i, lx, ly))
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*t.move)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[0]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//				(*t.vector)((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((lx[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((ly[1]) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
				}
				}
			}
			break;
		}
		default: // just a safety
		case UNDEFINED:
		{
			break;
		}
		}
		prev = plot.points[i].type;
		}
	}

/* CAC  */
/* plot_histeps:
 * Plot the curves in HISTEPS style
 */
	public static void plot_histeps(curve_points plot)
	{
		int i; // point index
		int xl; // cursor position in terminal coordinates
		int yl;
		TERMENTRY t = GlobalMembersTerm.term;
		double x; // point position
		double y;
		double xn;
		double yn;
		double y_null; // y coordinate of histogram baseline
		int[] gl; // array to hold list of valid points
		int goodcount;

		/* preliminary count of points inside array */
		goodcount = 0;
		for (i = 0; i < plot.p_count; i++)
		if (plot.points[i].type == coord_type.INRANGE || plot.points[i].type == coord_type.OUTRANGE)
			++goodcount;
		if (goodcount < 2)
		return; // cannot plot less than 2 points

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		gl = GlobalMembersAlloc.gp_alloc(goodcount * sizeof(int), "histeps valid point mapping");

		/* fill gl array with indexes of valid (non-undefined) points.  */
		goodcount = 0;
		for (i = 0; i < plot.p_count; i++)
		if (plot.points[i].type == coord_type.INRANGE || plot.points[i].type == coord_type.OUTRANGE)
		{
			gl[goodcount] = i;
			++goodcount;
		}

		/* sort the data --- tell histeps_compare about the plot
		 * datastructure to look at, then call qsort() */
		histeps_current_plot = plot;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(gl, goodcount, sizeof(*gl), GlobalMembersGraphics.histeps_compare);
		/* play it safe: invalidate the static pointer after usage */
		histeps_current_plot = DefineConstants.NULL;

		/* HBB 20010625: log y axis must treat 0.0 as -infinity. Define
		 * the correct y position for the histogram's baseline once. It'll
		 * be used twice (once for each endpoint of the histogram). */
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log)
		y_null = ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) ? (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) : (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max));
		else
		y_null = 0.0;

		x = (3.0 * plot.points[gl[0]].x - plot.points[gl[1]].x) / 2.0;
		y = y_null;

		xl = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		yl = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

		if (GlobalMembersGadgets.clip_point(xl, yl) == 0)
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)(xl, yl);

		for (i = 0; i < goodcount - 1; i++) // loop over all points except last
		{
		yn = plot.points[gl[i]].y;
		xn = (plot.points[gl[i]].x + plot.points[gl[i + 1]].x) / 2.0;
		GlobalMembersGraphics.histeps_vertical(xl, yl, x, y, yn);
		GlobalMembersGraphics.histeps_horizontal(xl, yl, x, xn, yn);

		x = xn;
		y = yn;
		}

		yn = plot.points[gl[i]].y;
		xn = (3.0 * plot.points[gl[i]].x - plot.points[gl[i - 1]].x) / 2.0;
		GlobalMembersGraphics.histeps_vertical(xl, yl, x, y, yn);
		GlobalMembersGraphics.histeps_horizontal(xl, yl, x, xn, yn);
		GlobalMembersGraphics.histeps_vertical(xl, yl, xn, yn, y_null);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(gl);
	}

/* CAC
 * Draw horizontal line for the histeps routine.
 * Performs clipping.
 */
	public static void histeps_horizontal(int cur_x, int cur_y, double x1, double x2, double y)
	{
		TERMENTRY t = GlobalMembersTerm.term;
		int x1m;
		int x2m;
		int ym;

		/* HBB 20010215: reversed axes need special treatment, here: */

		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min <= GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
		{
		if ((y < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) || (y > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
			return;
		}
		else
		{
		if ((y < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) || (y > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
			return;
		}

		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min <= GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
		{
		if ((x1 < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min && x2 < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) || (x1 > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max && x2 > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
			return;

		if (x1 < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
			x1 = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
		if (x1 > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
			x1 = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
		if (x2 < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
			x2 = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
		if (x2 > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
			x2 = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
		}
		else
		{
		if ((x1 < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max && x2 < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) || (x1 > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min && x2 > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
			return;

		if (x1 < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
			x1 = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
		if (x1 > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
			x1 = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
		if (x2 < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
			x2 = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
		if (x2 > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
			x2 = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
		}
		ym = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		x1m = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		x2m = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

		if (x1m != cur_x || ym != cur_y)
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)(x1m, ym);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(x2m, ym);
		cur_x = x2m;
		cur_y = ym;

		return;
	}

/* CAC
 * Draw vertical line for the histeps routine.
 * Performs clipping.
 */
/* HBB 20010214: renamed parameters. xl vs. x1 is just _too_ easy to
 * mis-read */
	public static void histeps_vertical(int cur_x, int cur_y, double x, double y1, double y2)
	{
		TERMENTRY t = GlobalMembersTerm.term;
		int xm;
		int y1m;
		int y2m;

		/* FIXME HBB 20010215: wouldn't it be simpler to call
		 * draw_clip_line() instead? And in histeps_horizontal(), too, of
		 * course? */

		/* HBB 20010215: reversed axes need special treatment, here: */
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min <= GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
		{
		if ((x < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) || (x > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
			return;
		}
		else
		{
		if ((x < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max) || (x > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
			return;
		}

		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min <= GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
		{
		if ((y1 < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min && y2 < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) || (y1 > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max && y2 > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
			return;
		if (y1 < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)
			y1 = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
		if (y1 > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
			y1 = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
		if (y2 < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)
			y2 = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
		if (y2 > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
			y2 = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
		}
		else
		{
		if ((y1 < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max && y2 < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max) || (y1 > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min && y2 > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
			return;

		if (y1 < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
			y1 = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
		if (y1 > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)
			y1 = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
		if (y2 < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
			y2 = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
		if (y2 > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)
			y2 = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
		}
		xm = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		y1m = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((y1) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		y2m = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((y2) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

		if (y1m != cur_y || xm != cur_x)
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)(xm, y1m);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(xm, y2m);
		cur_x = xm;
		cur_y = y2m;

		return;
	}

/* XXX - JG  */
/* single edge intersection algorithm for "steps" curves */
/*
 * Given two points, one inside and one outside the plot, return
 * the point where an edge of the plot intersects the line segments
 * forming the step between the two points.
 *
 * Recall that if P1 = (x1,y1) and P2 = (x2,y2), the step from
 * P1 to P2 is drawn as two line segments: (x1,y1)->(x2,y1) and
 * (x2,y1)->(x2,y2).
 */
	public static void edge_intersect_steps(coordinate[] points, int i, double ex, double ey)
	{
		/* global X_AXIS.min, X_AXIS.max, Y_AXIS.min, X_AXIS.max */
		double ax = points[i - 1].x;
		double ay = points[i - 1].y;
		double bx = points[i].x;
		double by = points[i].y;

		if (points[i].type == coord_type.INRANGE) // from OUTRANGE to INRANG
		{
		if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((ay) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((ay) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((ay) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((ay) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
			ey = ay;
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
				{
					if ((ax) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(ax) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
						else if ((ax) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
							(ax) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
				}
				else
				{
					if ((ax) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(ax) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
						else if ((ax) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
							(ax) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
				}
			} while (0);
			ex = ax;
		}
		else
		{
			ex = bx;
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
				{
					if ((ay) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
						else if ((ay) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
							(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
				}
				else
				{
					if ((ay) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
						else if ((ay) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
							(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
				}
			} while (0);
			ey = ay;
		}
		} // from INRANGE to OUTRANGE
		else
		{
		if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((bx) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((bx) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((bx) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((bx) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
			ex = bx;
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
				{
					if ((by) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
						else if ((by) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
							(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
				}
				else
				{
					if ((by) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
						else if ((by) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
							(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
				}
			} while (0);
			ey = by;
		}
		else
		{
			ey = ay;
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
				{
					if ((bx) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
						else if ((bx) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
							(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
				}
				else
				{
					if ((bx) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
						else if ((bx) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
							(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
				}
			} while (0);
			ex = bx;
		}
		}
		return;
	}

/* XXX - HOE  */
/* single edge intersection algorithm for "fsteps" curves */
/* fsteps means step on forward y-value.
 * Given two points, one inside and one outside the plot, return
 * the point where an edge of the plot intersects the line segments
 * forming the step between the two points.
 *
 * Recall that if P1 = (x1,y1) and P2 = (x2,y2), the step from
 * P1 to P2 is drawn as two line segments: (x1,y1)->(x1,y2) and
 * (x1,y2)->(x2,y2).
 */
	public static void edge_intersect_fsteps(coordinate[] points, int i, double ex, double ey)
	{
		/* global X_AXIS.min, X_AXIS.max, Y_AXIS.min, X_AXIS.max */
		double ax = points[i - 1].x;
		double ay = points[i - 1].y;
		double bx = points[i].x;
		double by = points[i].y;

		if (points[i].type == coord_type.INRANGE) // from OUTRANGE to INRANG
		{
		if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
			ex = ax;
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
				{
					if ((ay) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
						else if ((ay) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
							(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
				}
				else
				{
					if ((ay) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
						else if ((ay) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
							(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
				}
			} while (0);
			ey = ay;
		}
		else
		{
			ey = by;
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
				{
					if ((bx) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
						else if ((bx) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
							(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
				}
				else
				{
					if ((bx) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
						else if ((bx) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
							(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
				}
			} while (0);
			ex = bx;
		}
		} // from INRANGE to OUTRANGE
		else
		{
		if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((by) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((by) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((by) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((by) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
			ey = by;
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
				{
					if ((bx) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
						else if ((bx) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
							(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
				}
				else
				{
					if ((bx) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
						else if ((bx) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
							(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
				}
			} while (0);
			ex = bx;
		}
		else
		{
			ex = ax;
			do
			{
				if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
				{
					if ((by) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
						else if ((by) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
							(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
				}
				else
				{
					if ((by) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
						else if ((by) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
							(by) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
				}
			} while (0);
			ey = by;
		}
		}
		return;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//static boolean two_edge_intersect_steps(coordinate points, int i, double lx, double ly);

/* XXX - HOE  */
/* double edge intersection algorithm for "fsteps" plot */
/* Given two points, both outside the plot, return the points where an
 * edge of the plot intersects the line segments forming a step
 * by the two points. There may be zero, one, two, or an infinite number
 * of intersection points. (One means an intersection at a corner, infinite
 * means overlaying the edge itself). We return FALSE when there is nothing
 * to draw (zero intersections), and TRUE when there is something to
 * draw (the one-point case is a degenerate of the two-point case and we do
 * not distinguish it - we draw it anyway).
 *
 * Recall that if P1 = (x1,y1) and P2 = (x2,y2), the step from
 * P1 to P2 is drawn as two line segments: (x1,y1)->(x1,y2) and
 * (x1,y2)->(x2,y2).
 */
	public static boolean two_edge_intersect_fsteps(coordinate[] points, int i, double lx, double ly)
	{
		/* global X_AXIS.min, X_AXIS.max, Y_AXIS.min, X_AXIS.max */
		double ax = points[i - 1].x;
		double ay = points[i - 1].y;
		double bx = points[i].x;
		double by = points[i].y;

		if (((ax) > (bx) ? (ax) : (bx)) < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min || ((ax) < (bx) ? (ax) : (bx)) > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max || ((ay) > (by) ? (ay) : (by)) < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min || ((ay) < (by) ? (ay) : (by)) > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max || (!(((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((by) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((by) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((by) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((by) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))) && !(((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))))))
		{
		return (false);
		}
		else if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((by) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((by) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((by) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((by) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))) && (((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
		/* corner of step inside plotspace */
		do
		{
			if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
			{
				if ((ay) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
					(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
					else if ((ay) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
						(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
			}
			else
			{
				if ((ay) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min))
					(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min);
					else if ((ay) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))
						(ay) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max);
			}
		} while (0);
		lx++= ax;
		ly++= ay;

		do
		{
			if ((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
			{
				if ((bx) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
					(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
					else if ((bx) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
						(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
			}
			else
			{
				if ((bx) > (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min))
					(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
					else if ((bx) < (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))
						(bx) = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max);
			}
		} while (0);
		lx = bx;
		ly = by;

		return (true);
		}
		else if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) ? (((by) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)) && ((by) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max))) : (((by) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)) && ((by) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)))))
		{
		/* cross plotspace in x-direction */
		lx++= GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min;
		ly++= by;
		lx = GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max;
		ly = by;
		return (true);
		}
		else if ((((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)<(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) ? (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max))) : (((ax) >= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)) && ((ax) <= (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)))))
		{
		/* cross plotspace in y-direction */
		lx++= ax;
		ly++= GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min;
		lx = ax;
		ly = GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max;
		return (true);
		}
		else
		return (false);
	}

/*{{{  boundary() */
/* borders of plotting area
 * computed once on every call to do_plot
 *
 * The order in which things is done is getting pretty critical:
 *  plot_bounds.ytop depends on title, x2label, ylabels (if no rotated text)
 *  plot_bounds.ybot depends on key, if "under"
 *  once we have these, we can setup the y1 and y2 tics and the
 *  only then can we calculate plot_bounds.xleft and plot_bounds.xright
 *  plot_bounds.xright depends also on key RIGHT
 *  then we can do x and x2 tics
 *
 * For set size ratio ..., everything depends on everything else...
 * not really a lot we can do about that, so we lose if the plot has to
 * be reduced vertically. But the chances are the
 * change will not be very big, so the number of tics will not
 * change dramatically.
 *
 * Margin computation redone by Dick Crawford (rccrawford@lanl.gov) 4/98
 */


	public static void boundary(curve_points plots, int count)
	{
		int yticlin = 0;
		int y2ticlin = 0;
		int timelin = 0;
		legend_key key = GlobalMembersGadgets.keyT;

		TERMENTRY t = GlobalMembersTerm.term;
		int key_h;
		int key_w;
		/* FIXME HBB 20000506: this line is the reason for the 'D0,1;D1,0'
		 * bug in the HPGL terminal: we actually carry out the switch of
		 * text orientation, just for finding out if the terminal can do
		 * that. *But* we're not in graphical mode, yet, so this call
		 * yields undesirable results */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	int can_rotate = (*t.text_angle)(DefineConstants.TEXT_VERTICAL);

		int xtic_textheight; // height of xtic labels
		int x2tic_textheight; // height of x2tic labels
		int title_textheight; // height of title
		int xlabel_textheight; // height of xlabel
		int x2label_textheight; // height of x2label
		int timetop_textheight; // height of timestamp (if at top)
		int timebot_textheight; // height of timestamp (if at bottom)
		int ylabel_textheight; // height of (unrotated) ylabel
		int y2label_textheight; // height of (unrotated) y2label
		int ylabel_textwidth; // width of (rotated) ylabel
		int y2label_textwidth; // width of (rotated) y2label
		int timelabel_textwidth; // width of timestamp
		int ytic_textwidth; // width of ytic labels
		int y2tic_textwidth; // width of y2tic labels
		int x2tic_height; // 0 for tic_in or no x2tics, ticscale*v_tic otherwise
		int xtic_textwidth = 0; // amount by which the xtic label protrude to the right
		int xtic_height;
		int ytic_width;
		int y2tic_width;

		int key_cols = 1; // # columns of keys

		/* figure out which rotatable items are to be rotated
		 * (ylabel and y2label are rotated if possible) */
		int vertical_timelabel = can_rotate != 0 ? GlobalMembersGadgets.timelabel_rotate : 0;
		int vertical_xtics = can_rotate != 0 ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].tic_rotate : 0;
		int vertical_x2tics = can_rotate != 0 ? GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].tic_rotate : 0;
		int vertical_ytics = can_rotate != 0 ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].tic_rotate : 0;
		int vertical_y2tics = can_rotate != 0 ? GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].tic_rotate : 0;

		boolean shift_labels_to_border = false;

		lkey = key.visible; // but we may have to disable it later

		xticlin = ylablin = y2lablin = xlablin = x2lablin = titlelin = 0;

		/*{{{  count lines in labels and tics */
		if (GlobalMembersGadgets.title.text != null)
		GlobalMembersGraphics.label_width(GlobalMembersGadgets.title.text, titlelin);
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.text != null)
		GlobalMembersGraphics.label_width(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.text, xlablin);

		/* This should go *inside* label_width(), but it messes up the key title */
		/* Imperfect check for subscripts or superscripts */
		if ((GlobalMembersTerm.term.flags & DefineConstants.TERM_ENHANCED_TEXT) && GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.text != null && strpbrk(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.text, "_^"))
			xlablin++;

		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.text != null)
		GlobalMembersGraphics.label_width(GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.text, x2lablin);
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.text != null)
		GlobalMembersGraphics.label_width(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.text, ylablin);
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.text != null)
		GlobalMembersGraphics.label_width(GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.text, y2lablin);

		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticmode != 0)
		{
		GlobalMembersGraphics.label_width(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].formatstring, xticlin);
		/* Reserve room for user tic labels even if format of autoticks is "" */
		if (xticlin == 0 && GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticdef.def.user != null)
			xticlin = 1;
		}

		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].ticmode != 0)
		GlobalMembersGraphics.label_width(GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].formatstring, x2ticlin);
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticmode != 0)
		GlobalMembersGraphics.label_width(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].formatstring, yticlin);
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].ticmode != 0)
		GlobalMembersGraphics.label_width(GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].formatstring, y2ticlin);
		if (GlobalMembersGadgets.timelabel.text != null)
		GlobalMembersGraphics.label_width(GlobalMembersGadgets.timelabel.text, timelin);
		/*}}} */

		/*{{{  preliminary plot_bounds.ytop  calculation */

		/*     first compute heights of things to be written in the margin */

		/* title */
		if (titlelin != 0)
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersGadgets.title.offset), tmpx, tmpy, "boundary");
		title_textheight = (int)((titlelin + 1) * (t.v_char) + tmpy);
		}
		else
		title_textheight = 0;

		/* x2label */
		if (x2lablin != 0)
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].label.offset), tmpx, tmpy, "boundary");
		x2label_textheight = (int)(x2lablin * t.v_char + tmpy);
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].ticmode == 0)
			x2label_textheight += 0.5 * t.v_char;
		}
		else
		x2label_textheight = 0;

		/* tic labels */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER != 0)
		{
		/* ought to consider tics on axes if axis near border */
		if (vertical_x2tics != 0)
		{
			/* guess at tic length, since we don't know it yet
			   --- we'll fix it after the tic labels have been created */
			x2tic_textheight = (int)(5 * t.h_char);
		}
		else
			x2tic_textheight = (int)(x2ticlin * t.v_char);
		}
		else
		x2tic_textheight = 0;

		/* tics */
		if (!GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].tic_in && ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER) || ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticmode & DefineConstants.TICS_MIRROR) && (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER))))
		x2tic_height = (int)(t.v_tic * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].ticscale);
		else
		x2tic_height = 0;

		/* timestamp */
		if (GlobalMembersGadgets.timelabel.text != null && GlobalMembersGadgets.timelabel_bottom == 0)
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersGadgets.timelabel.offset), tmpx, tmpy, "boundary");
		timetop_textheight = (int)((timelin + 2) * t.v_char + tmpy);
		}
		else
		timetop_textheight = 0;

		/* horizontal ylabel */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.text != null && can_rotate == 0)
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.offset), tmpx, tmpy, "boundary");
		ylabel_textheight = (int)(ylablin * t.v_char + tmpy);
		}
		else
		ylabel_textheight = 0;

		/* horizontal y2label */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.text != null && can_rotate == 0)
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.offset), tmpx, tmpy, "boundary");
		y2label_textheight = (int)(y2lablin * t.v_char + tmpy);
		}
		else
		y2label_textheight = 0;

		/* compute plot_bounds.ytop from the various components
		 *     unless tmargin is explicitly specified  */

		GlobalMembersGadgets.plot_bounds.ytop = (int)(0.5 + (GlobalMembersGadgets.ysize + GlobalMembersGadgets.yoffset) * (t.ymax - 1));

		if (GlobalMembersGadgets.tmargin.scalex == position_type.screen)
		{
		/* Specified as absolute position on the canvas */
		GlobalMembersGadgets.plot_bounds.ytop = (GlobalMembersGadgets.tmargin.x) * (float)(t.ymax - 1);
		}
		else if (GlobalMembersGadgets.tmargin.x >= 0)
		{
		/* Specified in terms of character height */
		GlobalMembersGadgets.plot_bounds.ytop -= (int)(GlobalMembersGadgets.tmargin.x * (float)t.v_char + 0.5);
		}
		else
		{
		/* Auto-calculation of space required */
		int top_margin = x2label_textheight + title_textheight;

		if (timetop_textheight + ylabel_textheight > top_margin)
			top_margin = timetop_textheight + ylabel_textheight;
		if (y2label_textheight > top_margin)
			top_margin = y2label_textheight;

		top_margin += x2tic_height + x2tic_textheight;
		/* x2tic_height and x2tic_textheight are computed as only the
		 *     relevant heights, but they nonetheless need a blank
		 *     space above them  */
		if (top_margin > x2tic_height)
			top_margin += (int) t.v_char;

		GlobalMembersGadgets.plot_bounds.ytop -= top_margin;
		if (GlobalMembersGadgets.plot_bounds.ytop >= (GlobalMembersGadgets.ysize + GlobalMembersGadgets.yoffset) * (t.ymax - 1))
		{
			/* make room for the end of rotated ytics or y2tics */
			GlobalMembersGadgets.plot_bounds.ytop -= (int)(t.h_char * 2);
		}
		}

		/*  end of preliminary plot_bounds.ytop calculation }}} */


		/*{{{  preliminary plot_bounds.xleft, needed for "under" */
		if (GlobalMembersGadgets.lmargin.scalex == position_type.screen)
		GlobalMembersGadgets.plot_bounds.xleft = GlobalMembersGadgets.lmargin.x * (float)t.xmax;
		else
		GlobalMembersGadgets.plot_bounds.xleft = GlobalMembersGadgets.xoffset * t.xmax + t.h_char * (GlobalMembersGadgets.lmargin.x >= 0 ? GlobalMembersGadgets.lmargin.x : 1);
		/*}}} */


		/*{{{  tentative plot_bounds.xright, needed for "under" */
		if (GlobalMembersGadgets.rmargin.scalex == position_type.screen)
		GlobalMembersGadgets.plot_bounds.xright = GlobalMembersGadgets.rmargin.x * (float)(t.xmax - 1);
		else
		GlobalMembersGadgets.plot_bounds.xright = (GlobalMembersGadgets.xsize + GlobalMembersGadgets.xoffset) * (t.xmax - 1) - t.h_char * (GlobalMembersGadgets.rmargin.x >= 0 ? GlobalMembersGadgets.rmargin.x : 2);
		/*}}} */


		/*{{{  preliminary plot_bounds.ybot calculation
		 *     first compute heights of labels and tics */

		/* tic labels */
		shift_labels_to_border = false;
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_AXIS != 0)
		{
		/* FIXME: This test for how close the axis is to the border does not match */
		/*        the tests in axis_output_tics(), and assumes FIRST_Y_AXIS.       */
		if (!(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? (((0.0) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && ((0.0) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : (((0.0) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && ((0.0) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))))
			shift_labels_to_border = true;
		if (0.05 > Math.abs(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min / (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))
			shift_labels_to_border = true;
		}
		if ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER) || shift_labels_to_border)
		{
		/* ought to consider tics on axes if axis near border */
		if (vertical_xtics != 0)
		{
			/* guess at tic length, since we don't know it yet */
			xtic_textheight = (int)(t.h_char * 5);
		}
		else
			xtic_textheight = (int)(t.v_char * (xticlin + 1));
		}
		else
		xtic_textheight = 0;

		/* tics */
		if (!GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].tic_in && ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER) || ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].ticmode & DefineConstants.TICS_MIRROR) && (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER))))
		xtic_height = (int)(t.v_tic * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticscale);
		else
		xtic_height = 0;

		/* xlabel */
		if (xlablin != 0)
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].label.offset), tmpx, tmpy, "boundary");
		/* offset is subtracted because if > 0, the margin is smaller */
		/* textheight is inflated by 0.2 to allow descenders to clear bottom of canvas */
		xlabel_textheight = (((float)xlablin + 0.2) * t.v_char - tmpy);
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticmode == 0)
			xlabel_textheight += 0.5 * t.v_char;
		}
		else
		xlabel_textheight = 0;

		/* timestamp */
		if (GlobalMembersGadgets.timelabel.text != null && GlobalMembersGadgets.timelabel_bottom != 0)
		{
		/* && !vertical_timelabel)
		 * DBT 11-18-98 resize plot for vertical timelabels too !
		 */
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersGadgets.timelabel.offset), tmpx, tmpy, "boundary");
		/* offset is subtracted because if . 0, the margin is smaller */
		timebot_textheight = (int)(timelin * t.v_char - tmpy);
		}
		else
		timebot_textheight = 0;

		/* compute plot_bounds.ybot from the various components
		 *     unless bmargin is explicitly specified  */

		GlobalMembersGadgets.plot_bounds.ybot = GlobalMembersGadgets.yoffset * (float)t.ymax;

		if (GlobalMembersGadgets.bmargin.scalex == position_type.screen)
		{
		/* Absolute position for bottom of plot */
		GlobalMembersGadgets.plot_bounds.ybot = GlobalMembersGadgets.bmargin.x * (float)t.ymax;
		}
		else if (GlobalMembersGadgets.bmargin.x >= 0)
		{
		/* Position based on specified character height */
		GlobalMembersGadgets.plot_bounds.ybot += GlobalMembersGadgets.bmargin.x * (float)t.v_char + 0.5;
		}
		else
		{
		GlobalMembersGadgets.plot_bounds.ybot += xtic_height + xtic_textheight;
		if (xlabel_textheight > 0)
			GlobalMembersGadgets.plot_bounds.ybot += xlabel_textheight;
		if (timebot_textheight > 0)
			GlobalMembersGadgets.plot_bounds.ybot += timebot_textheight;
		/* HBB 19990616: round to nearest integer, required to escape
		 * floating point inaccuracies */
		if (GlobalMembersGadgets.plot_bounds.ybot == (int)(t.ymax * GlobalMembersGadgets.yoffset))
		{
			/* make room for the end of rotated ytics or y2tics */
			GlobalMembersGadgets.plot_bounds.ybot += (int)(t.h_char * 2);
		}
		}

		/*  end of preliminary plot_bounds.ybot calculation }}} */

		if (lkey)
		{
		boolean key_panic = false;
		/*{{{  essential key features */

		p_width = GlobalMembersGadgets.pointsize * t.h_tic;
		p_height = GlobalMembersGadgets.pointsize * t.v_tic;

		if (key.swidth >= 0)
			key_sample_width = key.swidth * t.h_char + p_width;
		else
			key_sample_width = 0;

		key_entry_height = p_height * 1.25 * key.vert_factor;
		if (key_entry_height < t.v_char)
			key_entry_height = t.v_char * key.vert_factor;
		/* HBB 20020122: safeguard to prevent division by zero later */
		if (key_entry_height == 0)
			key_entry_height = 1;

		/* Count max_len key and number keys with len > 0 */
		max_ptitl_len = GlobalMembersGraphics.find_maxl_keys(plots, count, ptitl_cnt);

		/* Key title length and height */
		if (key.title != null)
		{
			int ytlen;
			int ytheight;
			ytlen = GlobalMembersGraphics.label_width(key.title, ytheight);
			ytlen -= key.swidth + 2;
			/* EAM FIXME */
			if ((ytlen > max_ptitl_len) && (key.stack_dir != en_key_stack_direction.GPKEY_HORIZONTAL))
			max_ptitl_len = ytlen;
			ktitl_lines = (int)ytheight;
		}

		if (key.reverse)
		{
			key_sample_left = -key_sample_width;
			key_sample_right = 0;
			/* if key width is being used, adjust right-justified text */
			key_text_left = t.h_char;
			key_text_right = t.h_char * (max_ptitl_len + 1 + key.width_fix);
			key_size_left = t.h_char - key_sample_left; // sample left is -ve
			key_size_right = key_text_right;
		}
		else
		{
			key_sample_left = 0;
			key_sample_right = key_sample_width;
			/* if key width is being used, adjust left-justified text */
			key_text_left = -(int)(t.h_char * (max_ptitl_len + 1 + key.width_fix));
			key_text_right = -(int) t.h_char;
			key_size_left = -key_text_left;
			key_size_right = key_sample_right + t.h_char;
		}
		key_point_offset = (key_sample_left + key_sample_right) / 2;

		/* advance width for cols */
		key_col_wth = key_size_left + key_size_right;

		key_rows = ptitl_cnt;
		key_cols = 1;

		/* calculate rows and cols for key */

		if (key.stack_dir == en_key_stack_direction.GPKEY_HORIZONTAL)
		{
			/* maximise no cols, limited by label-length */
			key_cols = (int)(GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft) / key_col_wth;
			/* EAM Dec 2004 - Rather than turn off the key, try to squeeze */
			if (key_cols == 0)
			{
			key_cols = 1;
			key_panic = true;
			key_col_wth = (GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft);
			}
			key_rows = (int)(ptitl_cnt + key_cols - 1) / key_cols;
			/* now calculate actual no cols depending on no rows */
			key_cols = (key_rows == 0) ? 1 : (int)(ptitl_cnt + key_rows - 1) / key_rows;
			if (key_cols == 0)
			{
			key_cols = 1;
			key_panic = true;
			}
		}
		else
		{
			/* maximise no rows, limited by plot_bounds.ytop-plot_bounds.ybot */
			int i = (int)(GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot - key.height_fix * t.v_char - (ktitl_lines + 1) * t.v_char) / key_entry_height;

			if (i == 0)
			{
			i = 1;
			key_panic = true;
			}
			if (ptitl_cnt > i)
			{
			key_cols = (int)(ptitl_cnt + i - 1) / i;
			/* now calculate actual no rows depending on no cols */
			if (key_cols == 0)
			{
				key_cols = 1;
				key_panic = true;
			}
			key_rows = (int)(ptitl_cnt + key_cols - 1) / key_cols;
			}
		}

		/* adjust for outside key, leave manually set margins alone */
		if ((key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC && (key.vpos != VERT_JUSTIFY.JUST_CENTRE || key.hpos != JUSTIFY.CENTRE)) || key.region == en_key_region.GPKEY_AUTO_EXTERIOR_MARGIN)
		{
			int more = 0;
			if (key.margin == en_key_ext_region.GPKEY_BMARGIN && GlobalMembersGadgets.bmargin.x < 0)
			{
			more = key_entry_height * key_rows + (int)(t.v_char * (ktitl_lines + 1)) + (int)(key.height_fix * t.v_char);
			if (GlobalMembersGadgets.plot_bounds.ybot + more > GlobalMembersGadgets.plot_bounds.ytop)
				key_panic = true;
			else
				GlobalMembersGadgets.plot_bounds.ybot += more;
			}
			else if (key.margin == en_key_ext_region.GPKEY_TMARGIN && GlobalMembersGadgets.tmargin.x < 0)
			{
			more = key_entry_height * key_rows + (int)(t.v_char * (ktitl_lines + 1)) - (int)(key.height_fix * t.v_char);
			if (GlobalMembersGadgets.plot_bounds.ytop - more < GlobalMembersGadgets.plot_bounds.ybot)
				key_panic = true;
			else
				GlobalMembersGadgets.plot_bounds.ytop -= more;
			}
			else if (key.margin == en_key_ext_region.GPKEY_LMARGIN && GlobalMembersGadgets.lmargin.x < 0)
			{
			more = key_col_wth * key_cols;
			if (GlobalMembersGadgets.plot_bounds.xleft + more > GlobalMembersGadgets.plot_bounds.xright)
				key_panic = true;
			else
				GlobalMembersGadgets.plot_bounds.xleft += more;
			}
			else if (key.margin == en_key_ext_region.GPKEY_RMARGIN && GlobalMembersGadgets.rmargin.x < 0)
			{
			more = key_col_wth * key_cols;
			if (GlobalMembersGadgets.plot_bounds.xright - more < GlobalMembersGadgets.plot_bounds.xleft)
				key_panic = true;
			else
				GlobalMembersGadgets.plot_bounds.xright -= more;
			}
		}

		/* warn if we had to punt on key size calculations */
		if (key_panic)
			GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "Warning - difficulty fitting plot titles into key");

		/*}}} */
		}

		/*{{{  set up y and y2 tics */
		GlobalMembersAxis.setup_tics(AXIS_INDEX.FIRST_Y_AXIS, 20);
		GlobalMembersAxis.setup_tics(AXIS_INDEX.SECOND_Y_AXIS, 20);
		/*}}} */

		/* Adjust color axis limits if necessary. */
		if (GlobalMembersPm3d.is_plot_with_palette())
		{
		GlobalMembersAxis.set_cbminmax();
		GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.COLOR_AXIS, "All points of color axis undefined.");
		if (GlobalMembersGadgets.color_box.where != DefineConstants.SMCOLOR_BOX_NO)
			GlobalMembersAxis.setup_tics(AXIS_INDEX.COLOR_AXIS, 20);
		}

		/*{{{  recompute plot_bounds.xleft based on widths of ytics, ylabel etc
		   unless it has been explicitly set by lmargin */

		/* tic labels */
		shift_labels_to_border = false;
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_AXIS != 0)
		{
		/* FIXME: This test for how close the axis is to the border does not match */
		/*        the tests in axis_output_tics(), and assumes FIRST_X_AXIS.       */
		if (!(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? (((0.0) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && ((0.0) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : (((0.0) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && ((0.0) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))))
			shift_labels_to_border = true;
		if (0.1 > Math.abs(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min / (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))
			shift_labels_to_border = true;
		}

		if ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER) || shift_labels_to_border)
		{
		if (vertical_ytics != 0)
			/* HBB: we will later add some white space as part of this, so
			 * reserve two more rows (one above, one below the text ...).
			 * Same will be done to similar calc.'s elsewhere */
			ytic_textwidth = (int)(t.v_char * (yticlin + 2));
		else
		{
			GlobalMembersAxis.widest_tic_strlen = 0; // reset the global variable ...
			/* get gen_tics to call widest_tic_callback with all labels
			 * the latter sets widest_tic_strlen to the length of the widest
			 * one ought to consider tics on axis if axis near border...
			 */
			GlobalMembersAxis.gen_tics(AXIS_INDEX.FIRST_Y_AXIS, GlobalMembersAxis.widest_tic_callback); // 0,

			ytic_textwidth = (int)(t.h_char * (GlobalMembersAxis.widest_tic_strlen + 2));
		}
		}
		else
		{
		ytic_textwidth = 0;
		}

		/* tics */
		if (!GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].tic_in && ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER) || ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_MIRROR) && (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER))))
		ytic_width = (int)(t.h_tic * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticscale);
		else
		ytic_width = 0;

		/* ylabel */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.text != null && can_rotate != 0)
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.offset), tmpx, tmpy, "boundary");
		ylabel_textwidth = (int)(ylablin * (t.v_char) - tmpx);
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticmode == 0)
			ylabel_textwidth += 0.5 * t.v_char;
		}
		else
		/* this should get large for NEGATIVE ylabel.xoffsets  DBT 11-5-98 */
		ylabel_textwidth = 0;

		/* timestamp */
		if (GlobalMembersGadgets.timelabel.text != null && vertical_timelabel != 0)
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersGadgets.timelabel.offset), tmpx, tmpy, "boundary");
		timelabel_textwidth = (int)((timelin + 1.5) * t.v_char - tmpx);
		}
		else
		timelabel_textwidth = 0;

		if (GlobalMembersGadgets.lmargin.x < 0)
		{
		/* Auto-calculation */
		double tmpx;
		double tmpy;

		GlobalMembersGadgets.plot_bounds.xleft += (timelabel_textwidth > ylabel_textwidth != 0 ? timelabel_textwidth : ylabel_textwidth) + ytic_width + ytic_textwidth;

		/* make sure plot_bounds.xleft is wide enough for a negatively
		 * x-offset horizontal timestamp
		 */
		GlobalMembersGraphics.map_position_r((GlobalMembersGadgets.timelabel.offset), tmpx, tmpy, "boundary");
		if (vertical_timelabel == 0 && GlobalMembersGadgets.plot_bounds.xleft - ytic_width - ytic_textwidth < -(int)(tmpx))
			GlobalMembersGadgets.plot_bounds.xleft = ytic_width + ytic_textwidth - (int)(tmpx);
		if (GlobalMembersGadgets.plot_bounds.xleft == (int)(t.xmax * GlobalMembersGadgets.xoffset))
		{
			/* make room for end of xtic or x2tic label */
			GlobalMembersGadgets.plot_bounds.xleft += (int)(t.h_char * 2);
		}
		/* DBT 12-3-98  extra margin just in case */
		GlobalMembersGadgets.plot_bounds.xleft += 0.5 * t.h_char;
		}
		/* Note: we took care of explicit 'set lmargin foo' at line 492 */

		/*  end of plot_bounds.xleft calculation }}} */

		/*{{{  recompute plot_bounds.xright based on widest y2tic. y2labels, key "outside"
		   unless it has been explicitly set by rmargin */

		/* tic labels */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER != 0)
		{
		if (vertical_y2tics != 0)
			y2tic_textwidth = (int)(t.v_char * (y2ticlin + 2));
		else
		{
			GlobalMembersAxis.widest_tic_strlen = 0; // reset the global variable ...
			/* get gen_tics to call widest_tic_callback with all labels
			 * the latter sets widest_tic_strlen to the length of the widest
			 * one ought to consider tics on axis if axis near border...
			 */
			GlobalMembersAxis.gen_tics(AXIS_INDEX.SECOND_Y_AXIS, GlobalMembersAxis.widest_tic_callback); // 0,

			y2tic_textwidth = (int)(t.h_char * (GlobalMembersAxis.widest_tic_strlen + 2));
		}
		}
		else
		{
		y2tic_textwidth = 0;
		}

		/* EAM May 2009
		 * Check to see if any xtic labels are so long that they extend beyond
		 * the right boundary of the plot. If so, allow extra room in the margin.
		 * If the labels are too long to fit even with a big margin, too bad.
		 */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticdef.def.user != null)
		{
		ticmark tic = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticdef.def.user;
		int maxrightlabel = GlobalMembersGadgets.plot_bounds.xright;
		while (tic != null)
		{
			if (tic.label != null)
			{
			double xx;
			int length = GlobalMembersTerm.estimate_tic.label.length() * Math.cos(DefineConstants.M_PI / 180.0 * (double)(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].tic_rotate)) * GlobalMembersTerm.term.h_char;

			/* We don't really know the plot layout yet, but try for an estimate */
			GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_scale = ((GlobalMembersGadgets.plot_bounds.xright) - (GlobalMembersGadgets.plot_bounds.xleft)) / (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min);
			GlobalMembersAxis.axis_set_graphical_range(AXIS_INDEX.FIRST_X_AXIS, GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.xright);
			xx = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.FIRST_X_AXIS, tic.position, "xtic");
				xx = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_lower) + ((xx) - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_scale + 0.5);
			xx += (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].tic_rotate) ? length : length / 2;
			if (maxrightlabel < xx)
				maxrightlabel = xx;
			}
			tic = tic.next;
		}
		xtic_textwidth = maxrightlabel - GlobalMembersGadgets.plot_bounds.xright;
		if (xtic_textwidth > GlobalMembersTerm.term.xmax / 2)
		{
			xtic_textwidth = GlobalMembersTerm.term.xmax / 2;
			GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "difficulty making room for xtic labels");
		}
		}

		/* tics */
		if (!GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].tic_in && ((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER) || ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_MIRROR) && (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER))))
		y2tic_width = (int)(t.h_tic * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].ticscale);
		else
		y2tic_width = 0;

		/* y2label */
		if (can_rotate != 0 && GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.text != null)
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.offset), tmpx, tmpy, "boundary");
		y2label_textwidth = (int)(y2lablin * t.v_char + tmpx);
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].ticmode == 0)
			y2label_textwidth += 0.5 * t.v_char;
		}
		else
		y2label_textwidth = 0;

		/* Make room for the color box if needed. */
		if (GlobalMembersGadgets.rmargin.scalex != position_type.screen)
		{
		if (GlobalMembersPm3d.is_plot_with_colorbox())
		{
	///#define COLORBOX_SCALE 0.100
	///#define WIDEST_COLORBOX_TICTEXT 3
			if ((GlobalMembersGadgets.color_box.where != DefineConstants.SMCOLOR_BOX_NO) && (GlobalMembersGadgets.color_box.where != DefineConstants.SMCOLOR_BOX_USER))
			{
			GlobalMembersGadgets.plot_bounds.xright -= (int)(GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft) * DefineConstants.COLORBOX_SCALE;
			GlobalMembersGadgets.plot_bounds.xright -= (int)((t.h_char) * DefineConstants.WIDEST_COLORBOX_TICTEXT);
			}
			GlobalMembersGadgets.color_box.xoffset = 0;
		}

		if (GlobalMembersGadgets.rmargin.x < 0)
		{
			GlobalMembersGadgets.color_box.xoffset = GlobalMembersGadgets.plot_bounds.xright;
			GlobalMembersGadgets.plot_bounds.xright -= y2tic_width + y2tic_textwidth;
			if (y2label_textwidth > 0)
			GlobalMembersGadgets.plot_bounds.xright -= y2label_textwidth;

			if (GlobalMembersGadgets.plot_bounds.xright == (int)(0.5 + (t.xmax - 1) * (GlobalMembersGadgets.xsize + GlobalMembersGadgets.xoffset)))
			{
			/* make room for end of xtic or x2tic label */
			GlobalMembersGadgets.plot_bounds.xright -= (int)(t.h_char * 2);
			}
			GlobalMembersGadgets.color_box.xoffset -= GlobalMembersGadgets.plot_bounds.xright;
			/* EAM 2009 - protruding xtic labels */
			if (GlobalMembersTerm.term.xmax - GlobalMembersGadgets.plot_bounds.xright < xtic_textwidth)
			GlobalMembersGadgets.plot_bounds.xright = GlobalMembersTerm.term.xmax - xtic_textwidth;
			/* DBT 12-3-98  extra margin just in case */
			GlobalMembersGadgets.plot_bounds.xright -= 0.5 * t.h_char;
		}
		/* Note: we took care of explicit 'set rmargin foo' at line 502 */
		}

		/*  end of plot_bounds.xright calculation }}} */


		/*{{{  set up x and x2 tics */
		/* we should base the guide on the width of the xtics, but we cannot
		 * use widest_tics until tics are set up. Bit of a downer - let us
		 * assume tics are 5 characters wide
		 */
		/* HBB 20001205: moved this block to before aspect_ratio is
		 * applied: setup_tics may extend the ranges, which would distort
		 * the aspect ratio */

		GlobalMembersAxis.setup_tics(AXIS_INDEX.FIRST_X_AXIS, 20);
		GlobalMembersAxis.setup_tics(AXIS_INDEX.SECOND_X_AXIS, 20);


		/* Modify the bounding box to fit the aspect ratio, if any was
		 * given. */
		if (GlobalMembersGadgets.aspect_ratio != 0.0)
		{
		double current_aspect_ratio;

		if (GlobalMembersGadgets.aspect_ratio < 0 && (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) != 0.0)
		{
			current_aspect_ratio = - GlobalMembersGadgets.aspect_ratio * Math.abs((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) / (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min));
		}
		else
			current_aspect_ratio = GlobalMembersGadgets.aspect_ratio;

		/* Set aspect ratio if valid and sensible */
		/* EAM Mar 2008 - fixed borders take precedence over centering */
		if (current_aspect_ratio >= 0.01 && current_aspect_ratio <= 100.0)
		{
			double current = ((double)(GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot)) / (GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft);
			double required = (current_aspect_ratio * t.v_tic) / t.h_tic;

			if (current > required)
			{
			/* too tall */
			int old_height = GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot;
			int new_height = required * (GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft);
			if (GlobalMembersGadgets.bmargin.scalex == position_type.screen)
				GlobalMembersGadgets.plot_bounds.ytop = GlobalMembersGadgets.plot_bounds.ybot + new_height;
			else if (GlobalMembersGadgets.tmargin.scalex == position_type.screen)
				GlobalMembersGadgets.plot_bounds.ybot = GlobalMembersGadgets.plot_bounds.ytop - new_height;
			else
			{
				GlobalMembersGadgets.plot_bounds.ybot += (old_height - new_height) / 2;
				GlobalMembersGadgets.plot_bounds.ytop -= (old_height - new_height) / 2;
			}

			}
			else
			{
			int old_width = GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft;
			int new_width = (GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot) / required;
			if (GlobalMembersGadgets.lmargin.scalex == position_type.screen)
				GlobalMembersGadgets.plot_bounds.xright = GlobalMembersGadgets.plot_bounds.xleft + new_width;
			else if (GlobalMembersGadgets.rmargin.scalex == position_type.screen)
				GlobalMembersGadgets.plot_bounds.xleft = GlobalMembersGadgets.plot_bounds.xright - new_width;
			else
			{
				GlobalMembersGadgets.plot_bounds.xleft += (old_width - new_width) / 2;
				GlobalMembersGadgets.plot_bounds.xright -= (old_width - new_width) / 2;
			}
			}
		}
		}

		/*  Calculate space needed for tic label rotation.
		 *  If [tb]margin is auto, move the plot boundary.
		 *  Otherwise use textheight to adjust placement of various titles.
		 */

		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER && vertical_x2tics != 0)
		{
		double projection = Math.sin((double)GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].tic_rotate * DefineConstants.M_PI / 180.0);
		GlobalMembersAxis.widest_tic_strlen = 0; // reset the global variable ...
		GlobalMembersAxis.gen_tics(AXIS_INDEX.SECOND_X_AXIS, GlobalMembersAxis.widest_tic_callback); // 0,
		if (GlobalMembersGadgets.tmargin.x < 0) // Undo original estimate
			GlobalMembersGadgets.plot_bounds.ytop += x2tic_textheight;
		/* Now compute a new one and use that instead: */
		if (projection > 0.0)
			x2tic_textheight = (int)(t.h_char * (GlobalMembersAxis.widest_tic_strlen)) * projection;
		else
			x2tic_textheight = t.v_char;
		if (GlobalMembersGadgets.tmargin.x < 0)
			GlobalMembersGadgets.plot_bounds.ytop -= x2tic_textheight;
		}
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].ticmode & DefineConstants.TICS_ON_BORDER && vertical_xtics != 0)
		{
		double projection;
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].tic_rotate == 90)
			projection = 1.0;
		else if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].tic_rotate == DefineConstants.TEXT_VERTICAL)
			projection = 1.0;
		else
			projection = -Math.sin((double)GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].tic_rotate * DefineConstants.M_PI / 180.0);
		GlobalMembersAxis.widest_tic_strlen = 0; // reset the global variable ...
		GlobalMembersAxis.gen_tics(AXIS_INDEX.FIRST_X_AXIS, GlobalMembersAxis.widest_tic_callback); // 0,

		if (GlobalMembersGadgets.bmargin.x < 0)
			GlobalMembersGadgets.plot_bounds.ybot -= xtic_textheight;
		if (projection > 0.0)
			xtic_textheight = (int)(t.h_char * GlobalMembersAxis.widest_tic_strlen) * projection + t.v_char;
		if (GlobalMembersGadgets.bmargin.x < 0)
			GlobalMembersGadgets.plot_bounds.ybot += xtic_textheight;
		}

		/* EAM - FIXME
		 * Notwithstanding all these fancy calculations, plot_bounds.ytop must always be above plot_bounds.ybot
		 */
		if (GlobalMembersGadgets.plot_bounds.ytop < GlobalMembersGadgets.plot_bounds.ybot)
		{
		int i = GlobalMembersGadgets.plot_bounds.ytop;

		GlobalMembersGadgets.plot_bounds.ytop = GlobalMembersGadgets.plot_bounds.ybot;
		GlobalMembersGadgets.plot_bounds.ybot = i;
		GlobalMembersFit.a((stderr,"boundary: Big problems! plot_bounds.ybot > plot_bounds.ytop\n"));
		}

		/*  compute coordinates for axis labels, title et al
		 *     (some of these may not be used) */

		x2label_y = GlobalMembersGadgets.plot_bounds.ytop + x2tic_height + x2tic_textheight + x2label_textheight;
		if (x2tic_textheight != 0 && (title_textheight != 0 || x2label_textheight != 0))
		x2label_y += t.v_char;

		title_y = x2label_y + title_textheight;

		ylabel_y = GlobalMembersGadgets.plot_bounds.ytop + x2tic_height + x2tic_textheight + ylabel_textheight;

		y2label_y = GlobalMembersGadgets.plot_bounds.ytop + x2tic_height + x2tic_textheight + y2label_textheight;

		/* Shift upward by 0.2 line to allow for descenders in xlabel text */
		xlabel_y = GlobalMembersGadgets.plot_bounds.ybot - xtic_height - xtic_textheight - xlabel_textheight + ((float)xlablin + 0.2) * t.v_char;
		ylabel_x = GlobalMembersGadgets.plot_bounds.xleft - ytic_width - ytic_textwidth;
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].label.text != null && can_rotate != 0)
		ylabel_x -= ylabel_textwidth;

		y2label_x = GlobalMembersGadgets.plot_bounds.xright + y2tic_width + y2tic_textwidth;
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].label.text != null && can_rotate != 0)
		y2label_x += y2label_textwidth - y2lablin * t.v_char;

		if (vertical_timelabel != 0)
		{
		if (GlobalMembersGadgets.timelabel_bottom != 0)
			time_y = xlabel_y - timebot_textheight + xlabel_textheight;
		else
		{
			time_y = title_y + timetop_textheight - title_textheight - x2label_textheight;
		}
		}
		else
		{
		if (GlobalMembersGadgets.timelabel_bottom != 0)
			time_y = GlobalMembersGadgets.plot_bounds.ybot - xtic_height - xtic_textheight - xlabel_textheight - timebot_textheight + t.v_char;
		else if (ylabel_textheight > 0)
			time_y = ylabel_y + timetop_textheight;
		else
			time_y = GlobalMembersGadgets.plot_bounds.ytop + x2tic_height + x2tic_textheight + timetop_textheight + (int) t.h_char;
		}
		if (vertical_timelabel != 0)
		time_x = GlobalMembersGadgets.plot_bounds.xleft - ytic_width - ytic_textwidth - timelabel_textwidth;
		else
		{
		double tmpx;
		double tmpy;
		GlobalMembersGraphics.map_position_r((GlobalMembersGadgets.timelabel.offset), tmpx, tmpy, "boundary");
		time_x = GlobalMembersGadgets.plot_bounds.xleft - ytic_width - ytic_textwidth + (int)(tmpx);
		}

		xtic_y = GlobalMembersGadgets.plot_bounds.ybot - xtic_height - (int)(vertical_xtics != 0 ? t.h_char : t.v_char);

		x2tic_y = GlobalMembersGadgets.plot_bounds.ytop + x2tic_height + (vertical_x2tics != 0 ? (int) t.h_char : x2tic_textheight);

		ytic_x = GlobalMembersGadgets.plot_bounds.xleft - ytic_width - (vertical_ytics != 0 ? (ytic_textwidth - (int) t.v_char) : (int) t.h_char);

		y2tic_x = GlobalMembersGadgets.plot_bounds.xright + y2tic_width + (int)(vertical_y2tics != 0 ? t.v_char : t.h_char);

		/* restore text to horizontal [we tested rotation above] */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	()(*t.text_angle)(0);

		/* needed for map_position() below */
		GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_scale = ((GlobalMembersGadgets.plot_bounds.ytop) - (GlobalMembersGadgets.plot_bounds.ybot)) / (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min);
		GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].term_scale = ((GlobalMembersGadgets.plot_bounds.ytop) - (GlobalMembersGadgets.plot_bounds.ybot)) / (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].max - GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min);
		GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_scale = ((GlobalMembersGadgets.plot_bounds.xright) - (GlobalMembersGadgets.plot_bounds.xleft)) / (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min);
		GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].term_scale = ((GlobalMembersGadgets.plot_bounds.xright) - (GlobalMembersGadgets.plot_bounds.xleft)) / (GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].max - GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min);
		/* HBB 20020122: moved here from do_plot, because map_position
		 * needs these, too */
		GlobalMembersAxis.axis_set_graphical_range(AXIS_INDEX.FIRST_X_AXIS, GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.xright);
		GlobalMembersAxis.axis_set_graphical_range(AXIS_INDEX.FIRST_Y_AXIS, GlobalMembersGadgets.plot_bounds.ybot, GlobalMembersGadgets.plot_bounds.ytop);
		GlobalMembersAxis.axis_set_graphical_range(AXIS_INDEX.SECOND_X_AXIS, GlobalMembersGadgets.plot_bounds.xleft, GlobalMembersGadgets.plot_bounds.xright);
		GlobalMembersAxis.axis_set_graphical_range(AXIS_INDEX.SECOND_Y_AXIS, GlobalMembersGadgets.plot_bounds.ybot, GlobalMembersGadgets.plot_bounds.ytop);

		/* Calculate space for keys (do_plot will use these to position key). */
		key_w = key_col_wth * key_cols;
		key_h = (ktitl_lines) * t.v_char + key_rows * key_entry_height;
		key_h += (int)(key.height_fix * t.v_char);
		if (key.region == en_key_region.GPKEY_AUTO_INTERIOR_LRTBC || (key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC && key.vpos == VERT_JUSTIFY.JUST_CENTRE && key.hpos == JUSTIFY.CENTRE))
		{
		if (key.vpos == VERT_JUSTIFY.JUST_TOP)
		{
			key.bounds.ytop = GlobalMembersGadgets.plot_bounds.ytop - t.v_tic;
			key.bounds.ybot = key.bounds.ytop - key_h;
		}
		else if (key.vpos == VERT_JUSTIFY.JUST_BOT)
		{
			key.bounds.ybot = GlobalMembersGadgets.plot_bounds.ybot + t.v_tic;
			key.bounds.ytop = key.bounds.ybot + key_h;
		} // (key->vpos == JUST_CENTRE)
		else
		{
			int key_box_half = key_h / 2;
			key.bounds.ybot = (GlobalMembersGadgets.plot_bounds.ybot + GlobalMembersGadgets.plot_bounds.ytop) / 2 - key_box_half;
			key.bounds.ytop = (GlobalMembersGadgets.plot_bounds.ybot + GlobalMembersGadgets.plot_bounds.ytop) / 2 + key_box_half;
		}
		if (key.hpos == JUSTIFY.LEFT)
		{
			key.bounds.xleft = GlobalMembersGadgets.plot_bounds.xleft + t.h_char;
			key.bounds.xright = key.bounds.xleft + key_w;
		}
		else if (key.hpos == JUSTIFY.RIGHT)
		{
			key.bounds.xright = GlobalMembersGadgets.plot_bounds.xright - t.h_char;
			key.bounds.xleft = key.bounds.xright - key_w;
		} // (key->hpos == CENTER)
		else
		{
			int key_box_half = key_w / 2;
			key.bounds.xleft = (GlobalMembersGadgets.plot_bounds.xright + GlobalMembersGadgets.plot_bounds.xleft) / 2 - key_box_half;
			key.bounds.xright = (GlobalMembersGadgets.plot_bounds.xright + GlobalMembersGadgets.plot_bounds.xleft) / 2 + key_box_half;
		}
		}
		else if (key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC || key.region == en_key_region.GPKEY_AUTO_EXTERIOR_MARGIN)
		{

		/* Vertical alignment */
		if (key.margin == en_key_ext_region.GPKEY_TMARGIN)
		{
			/* align top first since tmargin may be manual */
			key.bounds.ytop = (GlobalMembersGadgets.ysize + GlobalMembersGadgets.yoffset) * t.ymax - t.v_tic;
			key.bounds.ybot = key.bounds.ytop - key_h;
		}
		else if (key.margin == en_key_ext_region.GPKEY_BMARGIN)
		{
			/* align bottom first since bmargin may be manual */
			key.bounds.ybot = GlobalMembersGadgets.yoffset * t.ymax + t.v_tic;
			key.bounds.ytop = key.bounds.ybot + key_h;
		}
		else
		{
			if (key.vpos == VERT_JUSTIFY.JUST_TOP)
			{
			/* align top first since tmargin may be manual */
			key.bounds.ytop = GlobalMembersGadgets.plot_bounds.ytop;
			key.bounds.ybot = key.bounds.ytop - key_h;
			}
			else if (key.vpos == JUSTIFY.CENTRE)
			{
			int key_box_half = key_h / 2;
			key.bounds.ybot = (GlobalMembersGadgets.plot_bounds.ybot + GlobalMembersGadgets.plot_bounds.ytop) / 2 - key_box_half;
			key.bounds.ytop = (GlobalMembersGadgets.plot_bounds.ybot + GlobalMembersGadgets.plot_bounds.ytop) / 2 + key_box_half;
			}
			else
			{
			/* align bottom first since bmargin may be manual */
			key.bounds.ybot = GlobalMembersGadgets.plot_bounds.ybot;
			key.bounds.ytop = key.bounds.ybot + key_h;
			}
		}

		/* Horizontal alignment */
		if (key.margin == en_key_ext_region.GPKEY_LMARGIN)
		{
			/* align left first since lmargin may be manual */
			key.bounds.xleft = GlobalMembersGadgets.xoffset * t.xmax + t.h_char;
			key.bounds.xright = key.bounds.xleft + key_w;
		}
		else if (key.margin == en_key_ext_region.GPKEY_RMARGIN)
		{
			/* align right first since rmargin may be manual */
			key.bounds.xright = (GlobalMembersGadgets.xsize + GlobalMembersGadgets.xoffset) * (t.xmax - 1) - t.h_char;
			key.bounds.xleft = key.bounds.xright - key_w;
		}
		else
		{
			if (key.hpos == JUSTIFY.LEFT)
			{
			/* align left first since lmargin may be manual */
			key.bounds.xleft = GlobalMembersGadgets.plot_bounds.xleft;
			key.bounds.xright = key.bounds.xleft + key_w;
			}
			else if (key.hpos == JUSTIFY.CENTRE)
			{
			int key_box_half = key_w / 2;
			key.bounds.xleft = (GlobalMembersGadgets.plot_bounds.xright + GlobalMembersGadgets.plot_bounds.xleft) / 2 - key_box_half;
			key.bounds.xright = (GlobalMembersGadgets.plot_bounds.xright + GlobalMembersGadgets.plot_bounds.xleft) / 2 + key_box_half;
			}
			else
			{
			/* align right first since rmargin may be manual */
			key.bounds.xright = GlobalMembersGadgets.plot_bounds.xright;
			key.bounds.xleft = key.bounds.xright - key_w;
			}
		}

		}
		else
		{
		int x;
		int y;

		GlobalMembersGraphics.map_position(key.user_pos, x, y, "key");
	///#if 0
	//// /* FIXME!!!
	//// ** pm 22.1.2002: if key->user_pos.scalex or scaley == first_axes or second_axes,
	//// ** then the graph scaling is not yet known and the box is positioned incorrectly;
	//// ** you must do "replot" to avoid the wrong plot ... bad luck if output does not
	//// ** go to screen */
	////#define OK fprintf(stderr,"Line %i of %s is OK\n",__LINE__,__FILE__)
	////	OK;
	////	fprintf(stderr,"\tHELE: user pos: x=%i y=%i\n",key->user_pos.x,key->user_pos.y);
	////	fprintf(stderr,"\tHELE: user pos: x=%i y=%i\n",x,y);
	///#endif
		/* Here top, bottom, left, right refer to the alignment with respect to point. */
		key.bounds.xleft = x;
		if (key.hpos == JUSTIFY.CENTRE)
			key.bounds.xleft -= key_w / 2;
		else if (key.hpos == JUSTIFY.RIGHT)
			key.bounds.xleft -= key_w;
		key.bounds.xright = key.bounds.xleft + key_w;
		key.bounds.ytop = y;
		if (key.vpos == VERT_JUSTIFY.JUST_CENTRE)
			key.bounds.ytop += key_h / 2;
		else if (key.vpos == VERT_JUSTIFY.JUST_BOT)
			key.bounds.ytop += key_h;
		key.bounds.ybot = key.bounds.ytop - key_h;
		}
		/*}}} */

		/* Set default clipping to the plot boundary */
		GlobalMembersGadgets.clip_area = GlobalMembersGadgets.plot_bounds;

	}

/* display a y-axis ticmark - called by gen_ticks */
/* also uses global tic_start, tic_direction, tic_text and tic_just */

	/* HBB 20010118: these should be static, but can't --- HP-UX assembler bug */
	public static void ytick2d_callback(AXIS_INDEX axis, double place, String text, lp_style_type grid, ticmark userlabels)
	{
		TERMENTRY t = GlobalMembersTerm.term;
		/* minitick if text is NULL - v_tic is unsigned */
		int ticsize = GlobalMembersAxis.tic_direction * (int) t.h_tic * (text != null ? GlobalMembersAxis.axis_array[axis.getValue()].ticscale : GlobalMembersAxis.axis_array[axis.getValue()].miniticscale);
		int y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((place) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);

		() axis; // avoid "unused parameter" warning

		/* Skip label if we've already written a user-specified one */
		while (userlabels != null)
		{
		int here = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + (((GlobalMembersAxis.axis_array[axis.getValue()].log ? (Math.log(userlabels.position) / GlobalMembersAxis.axis_array[axis.getValue()].log_base) : (userlabels.position))) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
		if (Math.abs(here - y) <= 1) // FIXME: min separation could be configurable
		{
			text = DefineConstants.NULL;
			break;
		}
		userlabels = userlabels.next;
		}

		if (grid.l_type > DefineConstants.LT_NODRAW)
		{
		if (t.layer)
			(t.layer)(termlayer.TERM_LAYER_BEGIN_GRID);
		GlobalMembersTerm.term_apply_lp_properties(grid);
		if (GlobalMembersAxis.polar_grid_angle != 0)
		{
			double x = 0;
			double y = place;
			double s = Math.sin(0.1);
			double c = Math.cos(0.1);
			int i;
			if (place > largest_polar_circle)
			largest_polar_circle = place;
			else if (-place > largest_polar_circle)
			largest_polar_circle = -place;
			GlobalMembersGadgets.clip_move((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
			for (i = 1; i <= 63 ; ++i) // 2pi/0.1
			{
			{
				/* cos(t+dt) = cos(t)cos(dt)-sin(t)cos(dt) */
				double tx = x * c - y * s;
				/* sin(t+dt) = sin(t)cos(dt)+cos(t)sin(dt) */
				y = y * c + x * s;
				x = tx;
			}
			GlobalMembersGadgets.clip_vector((int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5), (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5));
			}
		}
		else
		{
			/* Make the grid avoid the key box */
			legend_key key = GlobalMembersGadgets.keyT;
			if (lkey && y < key.bounds.ytop && y > key.bounds.ybot && key.bounds.xleft < GlobalMembersGadgets.plot_bounds.xright && key.bounds.xright > GlobalMembersGadgets.plot_bounds.xleft)
			{
			if (key.bounds.xleft > GlobalMembersGadgets.plot_bounds.xleft)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(GlobalMembersGadgets.plot_bounds.xleft, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(key.bounds.xleft, y);
			}
			if (key.bounds.xright < GlobalMembersGadgets.plot_bounds.xright)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(key.bounds.xright, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(GlobalMembersGadgets.plot_bounds.xright, y);
			}
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(GlobalMembersGadgets.plot_bounds.xleft, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(GlobalMembersGadgets.plot_bounds.xright, y);
			}
		}
		GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp); // border linetype
		if (t.layer)
			(t.layer)(termlayer.TERM_LAYER_END_GRID);
		}
		/* we precomputed tic posn and text posn */

//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)(GlobalMembersAxis.tic_start, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(GlobalMembersAxis.tic_start + ticsize, y);

		if (GlobalMembersAxis.tic_mirror >= 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)(GlobalMembersAxis.tic_mirror, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(GlobalMembersAxis.tic_mirror - ticsize, y);
		}
		if (text != null)
		{
		/* get offset */
		double offsetx_d;
		double offsety_d;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.offset), offsetx_d, offsety_d, "ytics");
		/* User-specified different color for the tics text */
		if (GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor.type != DefineConstants.TC_DEFAULT)
			GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor), t);
		GlobalMembersTerm.write_multiline(GlobalMembersAxis.tic_text + (int)offsetx_d, y + (int)offsety_d, text, GlobalMembersAxis.tic_hjust, GlobalMembersAxis.tic_vjust, GlobalMembersAxis.rotate_tics, GlobalMembersAxis.axis_array[axis.getValue()].ticdef.font);
		GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp); // reset to border linetype
		}
	}

/* HBB 20010118: all the *_callback() functions made non-static. This
 * is necessary to work around a bug in HP's assembler shipped with
 * HP-UX 10 and higher, if GCC tries to use it */

/* display a x-axis ticmark - called by gen_ticks */
/* also uses global tic_start, tic_direction, tic_text and tic_just */
	public static void xtick2d_callback(AXIS_INDEX axis, double place, String text, lp_style_type grid, ticmark userlabels)
	{
		TERMENTRY t = GlobalMembersTerm.term;
		/* minitick if text is NULL - beware - h_tic is unsigned */
		int ticsize = GlobalMembersAxis.tic_direction * (int) t.v_tic * (text != null ? GlobalMembersAxis.axis_array[axis.getValue()].ticscale : GlobalMembersAxis.axis_array[axis.getValue()].miniticscale);
		int x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((place) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

		() axis; // avoid "unused parameter" warning

		/* Skip label if we've already written a user-specified one */
	///#define MINIMUM_SEPARATION 2
		while (userlabels != null)
		{
		int here = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + (((GlobalMembersAxis.axis_array[axis.getValue()].log ? (Math.log(userlabels.position) / GlobalMembersAxis.axis_array[axis.getValue()].log_base) : (userlabels.position))) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
		if (Math.abs(here - x) <= DefineConstants.MINIMUM_SEPARATION)
		{
			text = DefineConstants.NULL;
			break;
		}
		userlabels = userlabels.next;
		}

		if (grid.l_type > DefineConstants.LT_NODRAW)
		{
		if (t.layer)
			(t.layer)(termlayer.TERM_LAYER_BEGIN_GRID);
		GlobalMembersTerm.term_apply_lp_properties(grid);
		if (GlobalMembersAxis.polar_grid_angle != 0)
		{
			double x = place;
			double y = 0;
			double s = Math.sin(0.1);
			double c = Math.cos(0.1);
			int i;
			int ogx = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			int ogy = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((0) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			int tmpgx;
			int tmpgy;
			int gx;
			int gy;

			if (place > largest_polar_circle)
			largest_polar_circle = place;
			else if (-place > largest_polar_circle)
			largest_polar_circle = -place;
			for (i = 1; i <= 63 ; ++i) // 2pi/0.1
			{
			{
				/* cos(t+dt) = cos(t)cos(dt)-sin(t)cos(dt) */
				double tx = x * c - y * s;
				/* sin(t+dt) = sin(t)cos(dt)+cos(t)sin(dt) */
				y = y * c + x * s;
				x = tx;
			}
			tmpgx = gx = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			tmpgy = gy = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			if (GlobalMembersGadgets.clip_line(ogx, ogy, tmpgx, tmpgy) != 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)((int) ogx, (int) ogy);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)((int) tmpgx, (int) tmpgy);
			}
			ogx = gx;
			ogy = gy;
			}
		}
		else
		{
			legend_key key = GlobalMembersGadgets.keyT;
			if (lkey && x < key.bounds.xright && x > key.bounds.xleft && key.bounds.ytop > GlobalMembersGadgets.plot_bounds.ybot && key.bounds.ybot < GlobalMembersGadgets.plot_bounds.ytop)
			{
			if (key.bounds.ybot > GlobalMembersGadgets.plot_bounds.ybot)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(x, GlobalMembersGadgets.plot_bounds.ybot);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, key.bounds.ybot);
			}
			if (key.bounds.ytop < GlobalMembersGadgets.plot_bounds.ytop)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.move)(x, key.bounds.ytop);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//			(*t.vector)(x, GlobalMembersGadgets.plot_bounds.ytop);
			}
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.move)(x, GlobalMembersGadgets.plot_bounds.ybot);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.vector)(x, GlobalMembersGadgets.plot_bounds.ytop);
			}
		}
		GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp); // border linetype
		if (t.layer)
			(t.layer)(termlayer.TERM_LAYER_END_GRID);
		} // End of grid code


		/* we precomputed tic posn and text posn in global vars */

//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)(x, GlobalMembersAxis.tic_start);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(x, GlobalMembersAxis.tic_start + ticsize);

		if (GlobalMembersAxis.tic_mirror >= 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.move)(x, GlobalMembersAxis.tic_mirror);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.vector)(x, GlobalMembersAxis.tic_mirror - ticsize);
		}
		if (text != null)
		{
		/* get offset */
		double offsetx_d;
		double offsety_d;
		GlobalMembersGraphics.map_position_r((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.offset), offsetx_d, offsety_d, "xtics");
		/* User-specified different color for the tics text */
		if (GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor.type != DefineConstants.TC_DEFAULT)
			GlobalMembersGadgets.apply_pm3dcolor((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor), t);
		GlobalMembersTerm.write_multiline(x + (int)offsetx_d, GlobalMembersAxis.tic_text + (int)offsety_d, text, GlobalMembersAxis.tic_hjust, GlobalMembersAxis.tic_vjust, GlobalMembersAxis.rotate_tics, GlobalMembersAxis.axis_array[axis.getValue()].ticdef.font);
		GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp); // reset to border linetype
		}
	}

/* NOTE: I'd have made the comp.function 'static', but the HP-sUX gcc
 * bug seems to forbid that :-( */
	public static int histeps_compare(Object p1, Object p2)
	{
		double x1 = histeps_current_plot.points[(Integer)p1].x;
		double x2 = histeps_current_plot.points[(Integer)p2].x;

		if (x1 < x2)
		return -1;
		else
		return (x1 > x2);
	}

/*}}} */



	public static void get_arrow(arrow_def arrow, int sx, int sy, int ex, int ey)
	{
		double sx_d;
		double sy_d;
		double ex_d;
		double ey_d;
		GlobalMembersGraphics.map_position_double(arrow.start, sx_d, sy_d, "arrow");
		sx = (int)(sx_d);
		sy = (int)(sy_d);
		if (arrow.relative)
		{
		/* different coordinate systems:
		 * add the values in the drivers coordinate system.
		 * For log scale: relative coordinate is factor */
		GlobalMembersGraphics.map_position_r(arrow.end, ex_d, ey_d, "arrow");
		ex = (int)(ex_d + sx_d);
		ey = (int)(ey_d + sy_d);
		}
		else
		{
		GlobalMembersGraphics.map_position_double(arrow.end, ex_d, ey_d, "arrow");
		ex = (int)(ex_d);
		ey = (int)(ey_d);
		}
	}

/*}}} */

/*{{{  map_position_double */
	public static void map_position_double(position pos, double x, double y, String what)
	{
		switch (pos.scalex)
		{
		case first_axes:
		{
			double xx = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.FIRST_X_AXIS, pos.x, what);
			x = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_lower) + ((xx) - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].term_scale + 0.5);
			break;
		}
		case second_axes:
		{
			double xx = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.SECOND_X_AXIS, pos.x, what);
			x = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].term_lower) + ((xx) - GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_X_AXIS.getValue()].term_scale + 0.5);
			break;
		}
		case graph:
		{
			x = GlobalMembersGadgets.plot_bounds.xleft + pos.x * (GlobalMembersGadgets.plot_bounds.xright - GlobalMembersGadgets.plot_bounds.xleft);
			break;
		}
		case screen:
		{
			TERMENTRY t = GlobalMembersTerm.term;
			x = pos.x * (t.xmax - 1);
			break;
		}
		case character:
		{
			register GlobalMembersMouse.struct TERMENTRY * t = GlobalMembersTerm.term;
			x = pos.x * t.h_char;
			break;
		}
		}
		switch (pos.scaley)
		{
		case first_axes:
		{
			double yy = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.FIRST_Y_AXIS, pos.y, what);
			y = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_lower) + ((yy) - GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].term_scale + 0.5);
			break;
		}
		case second_axes:
		{
			double yy = GlobalMembersAxis.axis_log_value_checked(AXIS_INDEX.SECOND_Y_AXIS, pos.y, what);
			y = (int)((GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].term_lower) + ((yy) - GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].min) * GlobalMembersAxis.axis_array[AXIS_INDEX.SECOND_Y_AXIS.getValue()].term_scale + 0.5);
			break;
		}
		case graph:
		{
			y = GlobalMembersGadgets.plot_bounds.ybot + pos.y * (GlobalMembersGadgets.plot_bounds.ytop - GlobalMembersGadgets.plot_bounds.ybot);
			break;
		}
		case screen:
		{
			TERMENTRY t = GlobalMembersTerm.term;
			y = pos.y * (t.ymax - 1);
			break;
		}
		case character:
		{
			register GlobalMembersMouse.struct TERMENTRY * t = GlobalMembersTerm.term;
			y = pos.y * t.v_char;
			break;
		}
		}
		x += 0.5;
		y += 0.5;
	}

/*}}} */


	public static int find_maxl_keys(curve_points plots, int count, int kcnt)
	{
		int mlen;
		int len;
		int curve;
		int cnt;
		curve_points this_plot;

		mlen = cnt = 0;
		this_plot = plots;
		for (curve = 0; curve < count; this_plot = this_plot.next, curve++)
		{
		if (this_plot.title != null && !this_plot.title_is_suppressed)
		{
			GlobalMembersTerm.ignore_enhanced(this_plot.title_no_enhanced);
			len = GlobalMembersTerm.estimate_this_plot.title.length();
			if (len != 0)
			{
			cnt++;
			if (len > mlen)
				mlen = len;
			}
			GlobalMembersTerm.ignore_enhanced(false);
		}

		/* Check for new histogram here and save space for divider */
		if (this_plot.plot_style == PLOT_STYLE.HISTOGRAMS && this_plot.histogram_sequence == 0 && cnt > 1)
			cnt++;
		/* Check for column-stacked histogram with key entries */
		if (this_plot.plot_style == PLOT_STYLE.HISTOGRAMS && this_plot.labels != null)
		{
			text_label key_entry = this_plot.labels.next;
			for (; key_entry; key_entry = key_entry.next)
			{
			cnt++;
			len = key_entry.text != null ? GlobalMembersTerm.estimate_key_entry.text.length() : 0;
			if (len > mlen)
				mlen = len;
			}
		}
		}

		if (kcnt != DefineConstants.NULL)
		kcnt = cnt;
		return (mlen);
	}

/*
 * Make this code a subroutine, rather than in-line, so that it can
 * eventually be shared by other callers. It would be nice to share it
 * with the 3d code also, but as of now the two code sections are not
 * very parallel.  EAM Nov 2003
 */


	public static void do_key_sample(curve_points this_plot, legend_key key, String title, TERMENTRY t, int xl, int yl)
	{
		/* Clip key box against canvas */
		BoundingBox clip_save = GlobalMembersGadgets.clip_area;
		if (GlobalMembersTerm.term.flags & DefineConstants.TERM_CAN_CLIP != 0)
		GlobalMembersGadgets.clip_area = DefineConstants.NULL;
		else
		GlobalMembersGadgets.clip_area = GlobalMembersGadgets.canvas;

		if (key.textcolor.type == DefineConstants.TC_RGB && key.textcolor.value < 0)
		/* Draw key text in same color as plot */
		;
		else if (key.textcolor.type != DefineConstants.TC_DEFAULT)
		/* Draw key text in same color as key title */
		GlobalMembersGadgets.apply_pm3dcolor(key.textcolor, t);
		else
		/* Draw key text in black */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.linetype)(DefineConstants.LT_BLACK);

		if (key.just == en_key_sample_positioning.GPKEY_LEFT)
		{
		GlobalMembersTerm.write_multiline(xl + key_text_left, yl, title, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_TOP, 0, key.font);
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	if ((*t.justify_text)(JUSTIFY.RIGHT))
		{
			GlobalMembersTerm.write_multiline(xl + key_text_right, yl, title, JUSTIFY.RIGHT, VERT_JUSTIFY.JUST_TOP, 0, key.font);
		}
		else
		{
			int x = xl + key_text_right - t.h_char * GlobalMembersTerm.estimate_title.length();
			if (key.region == en_key_region.GPKEY_AUTO_EXTERIOR_LRTBC || key.region == en_key_region.GPKEY_AUTO_EXTERIOR_MARGIN || ((((GlobalMembersGadgets.plot_bounds.xleft))<((GlobalMembersGadgets.plot_bounds.xright))) ? ((((x)) >= ((GlobalMembersGadgets.plot_bounds.xleft))) && (((x)) <= ((GlobalMembersGadgets.plot_bounds.xright)))) : ((((x)) >= ((GlobalMembersGadgets.plot_bounds.xright))) && (((x)) <= ((GlobalMembersGadgets.plot_bounds.xleft))))))
			GlobalMembersTerm.write_multiline(x, yl, title, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_TOP, 0, key.font);
		}
		}

		/* Draw sample in same style and color as the corresponding plot */
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//	(*t.linetype)(this_plot.lp_properties.l_type);
		if (this_plot.lp_properties.use_palette)
		GlobalMembersGadgets.apply_pm3dcolor(this_plot.lp_properties.pm3d_color, t);

		/* draw sample depending on bits set in plot_style */
		if (this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_FILL && t.fillbox)
		{
		fill_style_type fs = this_plot.fill_properties;
		int style = GlobalMembersTerm.style_from_fill(fs);
		int x = xl + key_sample_left;
		int y = yl - key_entry_height / 4;
		int w = key_sample_right - key_sample_left;
		int h = key_entry_height / 2;

	///#ifdef EAM_OBJECTS
		if (this_plot.plot_style == PLOT_STYLE.CIRCLES && w > 0)
		{
			GlobalMembersTerm.do_arc(xl + key_point_offset, yl, key_entry_height / 4, 0., 360., style);
		}
		else
	///#endif
		if (w > 0) // All other plot types with fill
		{
			if (style != t_fillstyle.FS_EMPTY.getValue())
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.fillbox)(style,x,y,w,h);

			/* need_fill_border will set the border linetype, but candlesticks don't want it */
			if ((this_plot.plot_style == PLOT_STYLE.CANDLESTICKS && fs.border_color.type == DefineConstants.TC_LT && fs.border_color.lt == DefineConstants.LT_NODRAW) || style == t_fillstyle.FS_EMPTY.getValue() || GlobalMembersMisc.need_fill_border(fs))
			{
			GlobalMembersTerm.newpath();
			GlobalMembersGadgets.draw_clip_line(xl + key_sample_left, yl - key_entry_height / 4, xl + key_sample_right, yl - key_entry_height / 4);
			GlobalMembersGadgets.draw_clip_line(xl + key_sample_right, yl - key_entry_height / 4, xl + key_sample_right, yl + key_entry_height / 4);
			GlobalMembersGadgets.draw_clip_line(xl + key_sample_right, yl + key_entry_height / 4, xl + key_sample_left, yl + key_entry_height / 4);
			GlobalMembersGadgets.draw_clip_line(xl + key_sample_left, yl + key_entry_height / 4, xl + key_sample_left, yl - key_entry_height / 4);
			GlobalMembersTerm.closepath();
			}
			if (fs.fillstyle != t_fillstyle.FS_EMPTY.getValue() && fs.fillstyle != t_fillstyle.FS_DEFAULT.getValue() && !(fs.border_color.type == DefineConstants.TC_LT && fs.border_color.lt == DefineConstants.LT_NODRAW))
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*t.linetype)(this_plot.lp_properties.l_type);
			if (this_plot.lp_properties.use_palette)
				GlobalMembersGadgets.apply_pm3dcolor(this_plot.lp_properties.pm3d_color, t);
			}
		}

		}
		else if (this_plot.plot_style == PLOT_STYLE.VECTOR && t.arrow)
		{
			GlobalMembersGraphics.apply_head_properties((this_plot.arrow_properties));
			GlobalMembersTerm.curr_arrow_headlength = -1;
			GlobalMembersGadgets.draw_clip_arrow(xl + key_sample_left, yl, xl + key_sample_right, yl, this_plot.arrow_properties.head);

		}
		else if ((this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_LINE) || ((this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR) && this_plot.plot_type == PLOT_TYPE.DATA))
		{
			/* errors for data plots only */
			GlobalMembersGadgets.draw_clip_line(xl + key_sample_left, yl, xl + key_sample_right, yl);
		}

		if ((this_plot.plot_type == PLOT_TYPE.DATA) && (this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR) && (this_plot.plot_style != PLOT_STYLE.CANDLESTICKS) && (bar_size > 0.0))
		{
		GlobalMembersGadgets.draw_clip_line(xl + key_sample_left, yl + ((t.h_tic / 2)) > (1) ? ((t.h_tic / 2)) : (1), xl + key_sample_left, yl - ((t.h_tic / 2)) > (1) ? ((t.h_tic / 2)) : (1));
		GlobalMembersGadgets.draw_clip_line(xl + key_sample_right, yl + ((t.h_tic / 2)) > (1) ? ((t.h_tic / 2)) : (1), xl + key_sample_right, yl - ((t.h_tic / 2)) > (1) ? ((t.h_tic / 2)) : (1));
		}

		/* oops - doing the point sample now would break the postscript
		 * terminal for example, which changes current line style
		 * when drawing a point, but does not restore it. We must wait
		 then draw the point sample at the end of do_plot (line 2058)
		 */

		/* Restore previous clipping area */
		GlobalMembersGadgets.clip_area = clip_save;
	}
///#endif


	public static boolean check_for_variable_color(curve_points plot, coordinate point)
	{
		if ((plot.lp_properties.pm3d_color.value < 0.0) && (plot.lp_properties.pm3d_color.type == DefineConstants.TC_RGB))
		{
		GlobalMembersColor.set_rgbcolor(point.yhigh);
		return true;
		}
		else if (plot.lp_properties.pm3d_color.type == DefineConstants.TC_Z)
		{
		GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(point.yhigh));
		return true;
		}
		else if (plot.lp_properties.l_type == DefineConstants.LT_COLORFROMCOLUMN)
		{
		lp_style_type lptmp = new lp_style_type();
		GlobalMembersTerm.lp_use_properties(lptmp, (int)(point.yhigh));
		GlobalMembersGadgets.apply_pm3dcolor((lptmp.pm3d_color), GlobalMembersTerm.term);
		return true;
		}
		else
		return false;
	}

///#ifdef EAM_OBJECTS
/* plot_circles:
 * Plot the curves in CIRCLES style
 */

	///#ifdef EAM_OBJECTS
	public static void plot_circles(curve_points plot)
	{
		int i;
		int x;
		int y;
		double radius;
		fill_style_type fillstyle = plot.fill_properties;
		int style = GlobalMembersTerm.style_from_fill(fillstyle);
		boolean withborder = false;

		if (fillstyle.border_color.type != DefineConstants.TC_LT || fillstyle.border_color.lt != DefineConstants.LT_NODRAW)
		withborder = true;

		for (i = 0; i < plot.p_count; i++)
		{
		if (plot.points[i].type == coord_type.INRANGE)
		{
			x = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].x) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);
			y = (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_lower) + ((plot.points[i].y) - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].term_scale + 0.5);
			radius = x - (int)((GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_lower) + ((plot.points[i].xlow) - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].term_scale + 0.5);

			/* rgb variable  -  color read from data column */
			if (!GlobalMembersGraph3d.check_for_variable_color(plot, plot.points[i]) && withborder)
			GlobalMembersTerm.term_apply_lp_properties(plot.lp_properties);
			GlobalMembersTerm.do_arc(x, y, radius, 0., 360., style);
			if (withborder)
			{
			GlobalMembersMisc.need_fill_border(plot.fill_properties);
			GlobalMembersTerm.do_arc(x, y, radius, 0., 360., 0);
			}
		}
		}
	}

///#ifdef EAM_OBJECTS
	public static void do_rectangle(int dimensions, object this_object, int style)
	{
		double x1;
		double y1;
		double x2;
		double y2;
		int x;
		int y;
		int w;
		int h;
		boolean clip_x = false;
		boolean clip_y = false;
		lp_style_type lpstyle = new lp_style_type();
		fill_style_type fillstyle;
		rectangle this_rect = this_object.o.rectangle;

		if (this_rect.type == 1)
		{
			double width;
			double height;

			if (dimensions == 2 || this_rect.center.scalex == position_type.screen)
			{
			GlobalMembersGraphics.map_position_double(this_rect.center, x1, y1, "rect");
			GlobalMembersGraphics.map_position_r(this_rect.extent, width, height, "rect");
			}
			else if (GlobalMembersGraph3d.splot_map != 0)
			{
			int junkw;
			int junkh;
			GlobalMembersGraph3d.map3d_position_double(this_rect.center, x1, y1, "rect");
			GlobalMembersGraph3d.map3d_position_r(this_rect.extent, junkw, junkh, "rect");
			width = junkw;
			height = junkh;
			}
			else
			return;

			x1 -= width / 2;
			y1 -= height / 2;
			x2 = x1 + width;
			y2 = y1 + height;
			w = width;
			h = height;
			if (this_rect.extent.scalex == position_type.first_axes || this_rect.extent.scalex == position_type.second_axes)
			clip_x = true;
			if (this_rect.extent.scaley == position_type.first_axes || this_rect.extent.scaley == position_type.second_axes)
			clip_y = true;

		}
		else
		{
			if ((dimensions == 2) || (this_rect.bl.scalex == position_type.screen && this_rect.tr.scalex == position_type.screen))
			{
			GlobalMembersGraphics.map_position_double(this_rect.bl, x1, y1, "rect");
			GlobalMembersGraphics.map_position_double(this_rect.tr, x2, y2, "rect");
			}
			else if (GlobalMembersGraph3d.splot_map != 0)
			{
			GlobalMembersGraph3d.map3d_position_double(this_rect.bl, x1, y1, "rect");
			GlobalMembersGraph3d.map3d_position_double(this_rect.tr, x2, y2, "rect");
			}
			else
			return;

			if (x1 > x2)
			{
				double t = x1;
				x1 = x2;
				x2 = t;
			}
			if (y1 > y2)
			{
				double t = y1;
				y1 = y2;
				y2 = t;
			}
			if (this_rect.bl.scalex == position_type.first_axes || this_rect.bl.scalex == position_type.second_axes)
			clip_x = true;
			if (this_rect.bl.scaley == position_type.first_axes || this_rect.bl.scaley == position_type.second_axes)
			clip_y = true;
		}

		/* FIXME - Should there be a generic clip_rectangle() routine?	*/
		/* Clip to the graph boundaries, but only if the rectangle 	*/
		/* itself was specified in plot coords.				*/
		if (GlobalMembersGadgets.clip_area != null)
		{
			if (clip_x && x1 < GlobalMembersGadgets.clip_area.xleft)
			x1 = GlobalMembersGadgets.clip_area.xleft;
			if (clip_x && x2 > GlobalMembersGadgets.clip_area.xright)
			x2 = GlobalMembersGadgets.clip_area.xright;
			if (clip_y && y1 < GlobalMembersGadgets.clip_area.ybot)
			y1 = GlobalMembersGadgets.clip_area.ybot;
			if (clip_y && y2 > GlobalMembersGadgets.clip_area.ytop)
			y2 = GlobalMembersGadgets.clip_area.ytop;
			if (x1 > x2 || y1 > y2)
			return;
		}

		w = x2 - x1;
		h = y2 - y1;
		x = x1;
		y = y1;

		if (w == 0 || h == 0)
			return;

		if (this_object.lp_properties.l_type == DefineConstants.LT_DEFAULT)
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
//ORIGINAL LINE: lpstyle = default_rectangle.lp_properties;
			lpstyle.copyFrom(GlobalMembersGadgets.default_rectangle.lp_properties);
		else
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
//ORIGINAL LINE: lpstyle = this_object->lp_properties;
			lpstyle.copyFrom(this_object.lp_properties);
		if (lpstyle.l_width > 0)
			lpstyle.l_width = this_object.lp_properties.l_width;

		if (this_object.fillstyle.fillstyle == t_fillstyle.FS_DEFAULT.getValue())
			fillstyle = GlobalMembersGadgets.default_rectangle.fillstyle;
		else
			fillstyle = this_object.fillstyle;

		GlobalMembersTerm.term_apply_lp_properties(lpstyle);
		style = GlobalMembersTerm.style_from_fill(fillstyle);

		if (style != t_fillstyle.FS_EMPTY.getValue() && GlobalMembersTerm.term.fillbox)
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.fillbox)(style, x, y, w, h);

		if (GlobalMembersMisc.need_fill_border(fillstyle))
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.move)(x, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(x, y+h);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(x+w, y+h);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(x+w, y);
//C++ TO JAVA CONVERTER TODO TASK: There are no simple equivalents to function pointers in Java:
	//		(*GlobalMembersTerm.term.vector)(x, y);
		}

		return;
	}
	///#endif

	/* for plotting error bars
	 * half the width of error bar tic mark
	 */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ERRORBARTIC ( ((t->h_tic/2)) > (1) ? ((t->h_tic/2)) : (1) )

	/* For tracking exit and re-entry of bounding curves that extend out of plot */
	/* these must match the bit values returned by clip_point(). */
	///#define LEFT_EDGE 1
	///#define RIGHT_EDGE 2
	///#define BOTTOM_EDGE 4
	///#define TOP_EDGE 8

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define clip_fill ((plot->filledcurves_options.closeto == FILLEDCURVES_CLOSED) || clip_lines2)

	/*
	 * The Amiga SAS/C 6.2 compiler moans about macro envocations causing
	 * multiple calls to functions. I converted these macros to inline
	 * functions coping with the problem without losing speed.
	 * If your compiler supports __inline, you should add it to the
	 * #ifdef directive
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
	//    return (GPMAX(a, b));
	//}
	//
	//GP_INLINE static double
	//f_min(double a, double b)
	//{
	//    return (GPMIN(a, b));
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

	/* True if a and b have the same sign or zero (positive or negative) */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define samesign(a,b) ((a) * (b) >= 0)
	/*}}} */

	/*{{{  more variables */

	/* we make a local copy of the 'key' variable so that if something
	 * goes wrong, we can switch it off temporarily
	 */

	public static boolean lkey;

	/*
	 * Apply axis range expansions from "set offsets" command
	 */
	public static void adjust_offsets()
	{
		double b = boff.scaley == (position_type.graph.getValue()) != 0 ? Math.abs(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * boff.y : boff.y;
		double t = toff.scaley == (position_type.graph.getValue()) != 0 ? Math.abs(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * toff.y : toff.y;
		double l = loff.scalex == (position_type.graph.getValue()) != 0 ? Math.abs(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * loff.x : loff.x;
		double r = roff.scalex == (position_type.graph.getValue()) != 0 ? Math.abs(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * roff.x : roff.x;

		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
		{
		GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min -= b;
		GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max += t;
		}
		else
		{
		GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max -= b;
		GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min += t;
		}
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
		{
		GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min -= l;
		GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max += r;
		}
		else
		{
		GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max -= l;
		GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min += r;
		}

		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min == GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
		GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "x_min should not equal x_max!");
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min == GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
		GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "y_min should not equal y_max!");
	}

	/* HBB 20010625: replaced homegrown bubblesort in plot_histeps() by
	 * call of standard routine qsort(). Need to tell the compare function
	 * about the plotted dataset via this file scope variable: */
	public static curve_points histeps_current_plot;


	/* Similar to HBB's comment above, this routine is shared with
	 * graph3d.c, so it shouldn't be in this module (graphics.c).
	 * However, I feel that 2d and 3d graphing routines should be
	 * made as much in common as possible.  They seem to be
	 * bifurcating a bit too much.  (Dan Sebald)
	 */
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

	/* These might work better as fuctions, but defines will do for now. */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ERROR_NOTICE(str) "\nGNUPLOT (plot_image):  " str

	/* hyperplane_between_points:
	 * Compute the hyperplane representation of a line passing
	 *  between two points.
	 */
	public static void hyperplane_between_points(double[] p1, double[] p2, double[] w, double b)
	{
		w[0] = p1[1] - p2[1];
		w[1] = p2[0] - p1[0];
		b = -(w[0] * p1[0] + w[1] * p1[1]);
	}
}