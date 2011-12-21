package com.addiPlot.gnuplot;

import java.io.File;

import com.addiPlot.term;

public class GlobalMembersColor
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
	//	return GlobalMembersAlloc.RCSid("$Id: color.c,v 1.85.2.3 2009/11/04 16:10:48 mikulik Exp $");
	//}
	///#endif



	/* GLOBAL VARIABLES */

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern t_sm_palette sm_palette;

	/* *******************************************************************
  ROUTINES
	 */



	///#ifdef EXTENDED_COLOR_SPECS
	//extern int supply_extended_color_specs;
	///#endif


	/* ROUTINES */


	public static void init_color()
	{
		/* initialize global palette */
		sm_palette.colorFormulae = 37; // const
		sm_palette.formulaR = 7;
		sm_palette.formulaG = 5;
		sm_palette.formulaB = 15;
		sm_palette.positive = DefineConstants.SMPAL_POSITIVE;
		sm_palette.use_maxcolors = 0;
		sm_palette.colors = 0;
		sm_palette.color = null;
		sm_palette.ps_allcF = 0;
		sm_palette.gradient_num = 0;
		sm_palette.gradient = null;
		sm_palette.cmodel = color_models_id.C_MODEL_RGB.getValue();
		sm_palette.Afunc.at = sm_palette.Bfunc.at = sm_palette.Cfunc.at = null;
		sm_palette.gamma = 1.5;

		/* initialisation of smooth color box */
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
		//ORIGINAL LINE: color_box = default_color_box;
		GlobalMembersGadgets.color_box.copyFrom(GlobalMembersGadgets.default_color_box);
	}

	/*
   Make the colour palette. Return 0 on success
   Put number of allocated colours into sm_palette.colors
	 */


	/*
	  Make the colour palette. Return 0 on success
	  Put number of allocated colours into sm_palette.colors
	 */
	public static int make_palette()
	{
		int i;
		double gray;

		/* ask for suitable number of colours in the palette */
		i = term.make_palette(null);
		if (i == 0)
		{
			/* terminal with its own mapping (PostScript, for instance)
		   It will not change palette passed below, but non-NULL has to be
		   passed there to create the header or force its initialization
			 */
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcmp' has no equivalent in Java:
			//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			if (memcmp(prev_palette, sm_palette, sizeof(t_sm_palette)))
			{
				term.make_palette(sm_palette);
				//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
				//ORIGINAL LINE: prev_palette = sm_palette;
				prev_palette.copyFrom(sm_palette);
				GlobalMembersFit.a((stderr,"make_palette: calling term->make_palette for term with ncolors == 0\n"));
			}
			else
				GlobalMembersFit.a((stderr,"make_palette: skipping duplicate palette for term with ncolors == 0\n"));
			return 0;
		}

		/* set the number of colours to be used (allocated) */
		sm_palette.colors = i;
		if (sm_palette.use_maxcolors > 0 && i > sm_palette.use_maxcolors)
			sm_palette.colors = sm_palette.use_maxcolors;

		if (prev_palette.colorFormulae < 0 || sm_palette.colorFormulae != prev_palette.colorFormulae || sm_palette.colorMode != prev_palette.colorMode || sm_palette.formulaR != prev_palette.formulaR || sm_palette.formulaG != prev_palette.formulaG || sm_palette.formulaB != prev_palette.formulaB || sm_palette.positive != prev_palette.positive || sm_palette.colors != prev_palette.colors)
		{
			/* print the message only if colors have changed */
			if (GlobalMembersPlot.interactive)
				fprintf(stderr, "smooth palette in %s: available %i color positions; using %i of them\n", GlobalMembersTerm.term.name, i, sm_palette.colors);
		}

		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
		//ORIGINAL LINE: prev_palette = sm_palette;
		prev_palette.copyFrom(sm_palette);

		if (sm_palette.color != null)
		{
			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(sm_palette.color);
			sm_palette.color = null;
		}
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		sm_palette.color = GlobalMembersAlloc.gp_alloc(sm_palette.colors * sizeof(rgb_color), "pm3d palette color");

		/*  fill sm_palette.color[]  */
		for (i = 0; i < sm_palette.colors; i++)
		{
			gray = (double) i / (sm_palette.colors - 1); // rescale to [0;1]
			GlobalMembersGetcolor.rgb1_from_gray(gray, (sm_palette.color[i]));
		}

		/* let the terminal make the palette from the supplied RGB triplets */
		term.make_palette(sm_palette);

		return 0;
	}

	/*
	 * Force a mismatch between the current palette and whatever is sent next,
	 * so that the new one will always be loaded 
	 */

	public static void invalidate_palette()
	{
		prev_palette.colors = -1;
	}

	/*
   Set the colour on the terminal
   Currently, each terminal takes care of remembering the current colour,
   so there is not much to do here.
	 */

	/*
	   Set the colour on the terminal
	   Currently, each terminal takes care of remembering the current colour,
	   so there is not much to do here---well, except for reversing the gray
	   according to sm_palette.positive == SMPAL_POSITIVE or SMPAL_NEGATIVE
	 */
	public static void set_color(double gray)
	{
		t_colorspec color = new t_colorspec();
		color.type = DefineConstants.TC_FRAC;
		color.value = gray;
		term.set_color(color);
	}
	public static void set_rgbcolor(int rgblt)
	{
		t_colorspec color = new t_colorspec();
		color.type = DefineConstants.TC_RGB;
		color.lt = rgblt;
		term.set_color(color);
	}
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static ifilled_quadrangle_lp_style_type lp = new ifilled_quadrangle_lp_style_type(0, -2, 0, 0, 1.0, DefineConstants.PTSZ_DEFAULT, false, {DefineConstants.TC_DEFAULT, 0, 0.0});

	public static void ifilled_quadrangle(gpiPoint[] icorners)
	{
		if (GlobalMembersGadgets.default_fillstyle.fillstyle == t_fillstyle.FS_EMPTY.getValue())
			icorners.style = t_fillstyle.FS_SOLID.getValue() + (100 << 4);
		else
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: icorners->style = style_from_fill(&default_fillstyle);
			icorners.style = GlobalMembersTerm.style_from_fill(new fill_style_type(GlobalMembersGadgets.default_fillstyle));
		term.filled_polygon(4, icorners);

		if (GlobalMembersPm3d.pm3d.hidden3d_tag != 0)
		{

			int i;

			/* Colour has changed, so we must apply line properties again.
			 * FIXME: It would be cleaner to apply the general line properties
			 * outside this loop, and limit ourselves to apply_pm3dcolor().
			 */
			//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
			//	static struct lp_style_type lp = {0, -2, 0, 0, 1.0, DefineConstants.PTSZ_DEFAULT, false, {DefineConstants.TC_DEFAULT, 0, 0.0}};
			GlobalMembersTerm.lp_use_properties(lp, GlobalMembersPm3d.pm3d.hidden3d_tag);
			GlobalMembersTerm.term_apply_lp_properties(lp);

			term.move(icorners[0].x, icorners[0].y);
			for (i = 3; i >= 0; i--)
			{
				term.vector(icorners[i].x, icorners[i].y);
			}
		}
	}

	/* The routine above for 4 points explicitly.
	 * This is the only routine which supportes extended
	 * color specs currently.
	 */
	///#ifdef EXTENDED_COLOR_SPECS
	//void
	//filled_quadrangle(gpdPoint * corners, gpiPoint * icorners)
	///#else

	/*
	   The routine above for 4 points explicitly
	 */
	///#ifdef EXTENDED_COLOR_SPECS
	//void filled_quadrangle __PROTO((gpdPoint *corners, gpiPoint* icorners));
	///#else
	public static void filled_quadrangle(gpdPoint[] corners)
	///#endif
	{
		int i;
		double x;
		double y;
		///#ifndef EXTENDED_COLOR_SPECS
		gpiPoint[] icorners = new gpiPoint[4];
		///#endif
		for (i = 0; i < 4; i++)
		{
			GlobalMembersUtil3d.map3d_xy_double(corners[i].x, corners[i].y, corners[i].z, x, y);
			icorners[i].x = (int) x;
			icorners[i].y = (int) y;
		}

		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: ifilled_quadrangle(icorners);
		GlobalMembersColor.ifilled_quadrangle(new gpiPoint(icorners));
	}

	/*
   Makes mapping from real 3D coordinates, passed as coords array,
   to 2D terminal coordinates, then draws filled polygon
	 */
	///#endif

	/*
	   Makes mapping from real 3D coordinates, passed as coords array,
	   to 2D terminal coordinates, then draws filled polygon
	 */
	/* HBB 20010216: added 'GPHUGE' attribute */
	public static void filled_polygon_3dcoords(int points, coordinate[] coords)
	{
		int i;
		double x;
		double y;
		gpiPoint[] icorners;
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		icorners = GlobalMembersAlloc.gp_alloc(points * sizeof(gpiPoint), "filled_polygon3d corners");
		for (i = 0; i < points; i++)
		{
			GlobalMembersUtil3d.map3d_xy_double(coords[i].x, coords[i].y, coords[i].z, x, y);
			icorners[i].x = (int) x;
			icorners[i].y = (int) y;
		}
		///#ifdef EXTENDED_COLOR_SPECS
		//    if (supply_extended_color_specs) {
		//	icorners[0].spec.gray = -1;	// force solid color
		//    }
		///#endif
		if (GlobalMembersGadgets.default_fillstyle.fillstyle == t_fillstyle.FS_EMPTY.getValue())
			icorners.style = t_fillstyle.FS_SOLID.getValue() + (100 << 4);
		else
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: icorners->style = style_from_fill(&default_fillstyle);
			icorners.style = GlobalMembersTerm.style_from_fill(new fill_style_type(GlobalMembersGadgets.default_fillstyle));
		term.filled_polygon(points, icorners);
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(icorners);
	}

	/*
   Makes mapping from real 3D coordinates, passed as coords array, but at z coordinate
   fixed (base_z, for instance) to 2D terminal coordinates, then draws filled polygon
	 */

	/*
	   Makes mapping from real 3D coordinates, passed as coords array, but at z coordinate
	   fixed (base_z, for instance) to 2D terminal coordinates, then draws filled polygon
	 */
	public static void filled_polygon_3dcoords_zfixed(int points, coordinate[] coords, double z)
	{
		int i;
		double x;
		double y;
		gpiPoint[] icorners;
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		icorners = GlobalMembersAlloc.gp_alloc(points * sizeof(gpiPoint), "filled_polygon_zfix corners");
		for (i = 0; i < points; i++)
		{
			GlobalMembersUtil3d.map3d_xy_double(coords[i].x, coords[i].y, z, x, y);
			icorners[i].x = (int) x;
			icorners[i].y = (int) y;
		}
		///#ifdef EXTENDED_COLOR_SPECS
		//    if (supply_extended_color_specs) {
		//	icorners[0].spec.gray = -1;	// force solid color
		//    }
		///#endif
		if (GlobalMembersGadgets.default_fillstyle.fillstyle == t_fillstyle.FS_EMPTY.getValue())
			icorners.style = t_fillstyle.FS_SOLID.getValue() + (100 << 4);
		else
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: icorners->style = style_from_fill(&default_fillstyle);
			icorners.style = GlobalMembersTerm.style_from_fill(new fill_style_type(GlobalMembersGadgets.default_fillstyle));
		term.filled_polygon(points, icorners);
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(icorners);
	}

	/*
   Finally the main colour smooth box drawing routine
	 */

	/*
	  Draw colour smooth box
	 */
	public static void draw_color_smooth_box(int plot_mode)
	{
		double tmp;
		File out = GlobalMembersTerm.gppsfile; // either gpoutfile or PSLATEX_auxfile

		if (GlobalMembersGadgets.color_box.where == DefineConstants.SMCOLOR_BOX_NO)
			return;

		/*
		   firstly, choose some good position of the color box

		   user's position like that (?):
		   else {
		   x_from = color_box.xlow;
		   x_to   = color_box.xhigh;
		   }
		 */
		if (GlobalMembersGadgets.color_box.where == DefineConstants.SMCOLOR_BOX_USER)
		{
			if (!GlobalMembersGadgets.is_3d_plot)
			{
				double xtemp;
				double ytemp;
				//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
				//ORIGINAL LINE: map_position(&color_box.origin, &color_box.bounds.xleft, &color_box.bounds.ybot, "cbox");
				GlobalMembersGraphics.map_position(new position(GlobalMembersGadgets.color_box.origin), GlobalMembersGadgets.color_box.bounds.xleft, GlobalMembersGadgets.color_box.bounds.ybot, "cbox");
				//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
				//ORIGINAL LINE: map_position_r(&color_box.size, &xtemp, &ytemp, "cbox");
				GlobalMembersGraphics.map_position_r(new position(GlobalMembersGadgets.color_box.size), xtemp, ytemp, "cbox");
				GlobalMembersGadgets.color_box.bounds.xright = (int) xtemp;
				GlobalMembersGadgets.color_box.bounds.ytop = (int) ytemp;
			}
			else if (GlobalMembersGraph3d.splot_map != 0 && GlobalMembersGadgets.is_3d_plot)
			{
				/* In map view mode we allow any coordinate system for placement */
				double xtemp;
				double ytemp;
				//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
				//ORIGINAL LINE: map3d_position_double(&color_box.origin, &xtemp, &ytemp, "cbox");
				GlobalMembersGraph3d.map3d_position_double(new position(GlobalMembersGadgets.color_box.origin), xtemp, ytemp, "cbox");
				GlobalMembersGadgets.color_box.bounds.xleft = (int) xtemp;
				GlobalMembersGadgets.color_box.bounds.ybot = (int) ytemp;
				//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
				//ORIGINAL LINE: map3d_position_r(&color_box.size, &color_box.bounds.xright, &color_box.bounds.ytop, "cbox");
				GlobalMembersGraph3d.map3d_position_r(new position(GlobalMembersGadgets.color_box.size), GlobalMembersGadgets.color_box.bounds.xright, GlobalMembersGadgets.color_box.bounds.ytop, "cbox");
			}
			else
			{
				/* But in full 3D mode we only allow screen coordinates */
				GlobalMembersGadgets.color_box.bounds.xleft = (int) (GlobalMembersGadgets.color_box.origin.x * (GlobalMembersTerm.term.xmax) + 0.5);
				GlobalMembersGadgets.color_box.bounds.ybot = (int) (GlobalMembersGadgets.color_box.origin.y * (GlobalMembersTerm.term.ymax) + 0.5);
				GlobalMembersGadgets.color_box.bounds.xright = (int) (GlobalMembersGadgets.color_box.size.x * (GlobalMembersTerm.term.xmax - 1) + 0.5);
				GlobalMembersGadgets.color_box.bounds.ytop = (int) (GlobalMembersGadgets.color_box.size.y * (GlobalMembersTerm.term.ymax - 1) + 0.5);
			}
			GlobalMembersGadgets.color_box.bounds.xright += GlobalMembersGadgets.color_box.bounds.xleft;
			GlobalMembersGadgets.color_box.bounds.ytop += GlobalMembersGadgets.color_box.bounds.ybot;

		} // color_box.where == SMCOLOR_BOX_DEFAULT
		else
		{
			if (plot_mode == MODE_PLOT_TYPE.MODE_SPLOT.getValue() && GlobalMembersGraph3d.splot_map == 0)
			{
				/* HBB 20031215: new code.  Constants fixed to what the result
				 * of the old code in default view (set view 60,30,1,1)
				 * happened to be. Somebody fix them if they're not right! */
				GlobalMembersGadgets.color_box.bounds.xleft = (int) (GlobalMembersGraph3d.xmiddle + 0.709 * GlobalMembersGraph3d.xscaler);
				GlobalMembersGadgets.color_box.bounds.xright = (int) (GlobalMembersGraph3d.xmiddle + 0.778 * GlobalMembersGraph3d.xscaler);
				GlobalMembersGadgets.color_box.bounds.ybot = (int) (GlobalMembersGraph3d.ymiddle - 0.147 * GlobalMembersGraph3d.yscaler);
				GlobalMembersGadgets.color_box.bounds.ytop = (int) (GlobalMembersGraph3d.ymiddle + 0.497 * GlobalMembersGraph3d.yscaler);

			}
			else if (GlobalMembersGadgets.is_3d_plot)
			{
				/* MWS 09-Dec-05, make color box full size for splot maps. */
				double dx = (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min);
				GlobalMembersUtil3d.map3d_xy(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max + dx * 0.025, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min, GlobalMembersGraph3d.base_z, GlobalMembersGadgets.color_box.bounds.xleft, GlobalMembersGadgets.color_box.bounds.ybot);
				GlobalMembersUtil3d.map3d_xy(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max + dx * 0.075, GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max, GlobalMembersGraph3d.ceiling_z, GlobalMembersGadgets.color_box.bounds.xright, GlobalMembersGadgets.color_box.bounds.ytop);
			} // 2D plot
			else
			{
				position default_origin = new position(position_type.graph,position_type.graph,position_type.graph, 1.025, 0, 0);
				position default_size = new position(position_type.graph,position_type.graph,position_type.graph, 0.05, 1.0, 0);
				double xtemp;
				double ytemp;
				GlobalMembersGraphics.map_position(default_origin, GlobalMembersGadgets.color_box.bounds.xleft, GlobalMembersGadgets.color_box.bounds.ybot, "cbox");
				GlobalMembersGadgets.color_box.bounds.xleft += GlobalMembersGadgets.color_box.xoffset;
				GlobalMembersGraphics.map_position_r(default_size, xtemp, ytemp, "cbox");
				GlobalMembersGadgets.color_box.bounds.xright = (int) (xtemp + GlobalMembersGadgets.color_box.bounds.xleft);
				GlobalMembersGadgets.color_box.bounds.ytop = (int) (ytemp + GlobalMembersGadgets.color_box.bounds.ybot);
			}

			/* now corrections for outer tics */
			if (GlobalMembersGadgets.color_box.rotation == 'v')
			{
				int cblen = (int) ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].tic_in ? - 1 : 1) * GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].ticscale * (GlobalMembersTerm.term.h_tic)); // positive for outer tics
				int ylen = (int) ((GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].tic_in ? - 1 : 1) * GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].ticscale * (GlobalMembersTerm.term.h_tic)); // positive for outer tics
				if ((cblen > 0) && ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].ticmode & DefineConstants.TICS_MIRROR) != 0))
				{
					GlobalMembersGadgets.color_box.bounds.xleft += cblen;
					GlobalMembersGadgets.color_box.bounds.xright += cblen;
				}
				if ((ylen > 0) && ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].ticmode & DefineConstants.TICS_MIRROR) != 0))
				{
					GlobalMembersGadgets.color_box.bounds.xleft += ylen;
					GlobalMembersGadgets.color_box.bounds.xright += ylen;
				}
			}
		}

		if (GlobalMembersGadgets.color_box.bounds.ybot > GlobalMembersGadgets.color_box.bounds.ytop) // switch them
		{
			tmp = GlobalMembersGadgets.color_box.bounds.ytop;
			GlobalMembersGadgets.color_box.bounds.ytop = GlobalMembersGadgets.color_box.bounds.ybot;
			GlobalMembersGadgets.color_box.bounds.ybot = tmp;
		}

		/* Optimized version of the smooth colour box in postscript. Advantage:
		   only few lines of code is written into the output file.
		 */
		if (GlobalMembersTerm.gppsfile != null)
			GlobalMembersColor.draw_inside_color_smooth_box_postscript(out);
		else
			GlobalMembersColor.draw_inside_color_smooth_box_bitmap(out);

		if (GlobalMembersGadgets.color_box.border != 0)
		{
			/* now make boundary around the colour box */
			if (GlobalMembersGadgets.color_box.border_lt_tag >= 0)
			{
				/* user specified line type */
				lp_style_type lp = GlobalMembersGadgets.border_lp;
				GlobalMembersTerm.lp_use_properties(lp, GlobalMembersGadgets.color_box.border_lt_tag);
				GlobalMembersTerm.term_apply_lp_properties(lp);
			}
			else
			{
				/* black solid colour should be chosen, so it's border linetype */
				GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp);
			}
			GlobalMembersTerm.newpath();
			term.move(GlobalMembersGadgets.color_box.bounds.xleft, GlobalMembersGadgets.color_box.bounds.ybot);
			term.vector(GlobalMembersGadgets.color_box.bounds.xright, GlobalMembersGadgets.color_box.bounds.ybot);
			term.vector(GlobalMembersGadgets.color_box.bounds.xright, GlobalMembersGadgets.color_box.bounds.ytop);
			term.vector(GlobalMembersGadgets.color_box.bounds.xleft, GlobalMembersGadgets.color_box.bounds.ytop);
			term.vector(GlobalMembersGadgets.color_box.bounds.xleft, GlobalMembersGadgets.color_box.bounds.ybot);
			GlobalMembersTerm.closepath();

			/* Set line properties to some value, this also draws lines in postscript terminals. */
			GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp);
		}

		/* draw tics */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].ticmode != 0)
		{
			GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp); // border linetype
			GlobalMembersAxis.gen_tics(AXIS_INDEX.COLOR_AXIS, GlobalMembersColor.cbtick_callback);
		}

		/* write the colour box label */
		if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.text != null)
		{
			int x;
			int y;
			GlobalMembersGadgets.apply_pm3dcolor(GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.textcolor);
			if (GlobalMembersGadgets.color_box.rotation == 'h')
			{
				int len = (int) (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].ticscale * (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].tic_in ? 1 : -1) * (GlobalMembersTerm.term.v_tic));

				GlobalMembersGraph3d.map3d_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.offset), x, y, "smooth_box");
				x += (GlobalMembersGadgets.color_box.bounds.xleft + GlobalMembersGadgets.color_box.bounds.xright) / 2;

				y += GlobalMembersGadgets.color_box.bounds.ybot + (- DefineConstants.DEFAULT_Y_DISTANCE - 1.7) * GlobalMembersTerm.term.v_char;
				
				if (len < 0)
					y += len;
				if (x < 0)
					x = 0;
				if (y < 0)
					y = 0;
				GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_CENTRE, 0, GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.font);
			}
			else
			{
				int len = (int) (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].ticscale * (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].tic_in ? - 1 : 1) * (GlobalMembersTerm.term.h_tic));
				/* calculate max length of cb-tics labels */
				GlobalMembersAxis.widest_tic_strlen = 0;
				if ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].ticmode & ((DefineConstants.TICS_ON_BORDER != 0) ? 1 : 0)) != 0)
				{
					GlobalMembersAxis.widest_tic_strlen = 0; // reset the global variable
					GlobalMembersAxis.gen_tics(AXIS_INDEX.COLOR_AXIS, GlobalMembersAxis.widest_tic_callback); // 0,
				}
				GlobalMembersGraph3d.map3d_position_r((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.offset), x, y, "smooth_box");
				///#define DEFAULT_X_DISTANCE 0.0
				x += GlobalMembersGadgets.color_box.bounds.xright + (GlobalMembersAxis.widest_tic_strlen + DefineConstants.DEFAULT_X_DISTANCE + 1.5) * GlobalMembersTerm.term.h_char;
				//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
				///#undef DEFAULT_X_DISTANCE
				if (len > 0)
					x += len;
				y += (GlobalMembersGadgets.color_box.bounds.ybot + GlobalMembersGadgets.color_box.bounds.ytop) / 2;
				if (x < 0)
					x = 0;
				if (y < 0)
					y = 0;
				if (term.text_angle(GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.rotate) != 0)
				{
					GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.text, JUSTIFY.CENTRE, VERT_JUSTIFY.JUST_TOP, GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.rotate, GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.font);
					term.text_angle(0);
				}
				else
				{
					GlobalMembersTerm.write_multiline(x, y, GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.text, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_TOP, 0, GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.font);
				}
			}
			GlobalMembersGadgets.reset_textcolor(GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].label.textcolor);
		}

	}



	/* eof color.h */


	///#ifdef HAVE_STRING_H
	///#else
	///#include <strings.h>
	///#endif
	///#ifdef HAVE_BCOPY
	///#ifndef HAVE_MEMCPY
	///#define memcpy(d,s,n) bcopy((s),(d),(n))
	///#endif
	///#ifndef HAVE_MEMMOVE
	///#define memmove(d,s,n) bcopy((s),(d),(n))
	///#endif
	///#else
	///#ifndef HAVE_MEMCPY
	///#endif
	///#endif // HAVE_BCOPY 
	///#ifndef HAVE_STRCHR
	///#ifdef strchr
	///#endif
	///#ifdef HAVE_INDEX
	///#define strchr index
	///#else
	///#endif
	///#ifdef strrchr
	///#endif
	///#ifdef HAVE_RINDEX
	///#define strrchr rindex
	///#endif
	///#endif
	///#ifndef HAVE_STRCSPN
	///#define strcspn gp_strcspn
	///#endif
	///#ifndef HAVE_STRSTR
	///#endif
	///#ifndef HAVE_STDLIB_H
	///#ifdef HAVE_MALLOC_H
	///#include <malloc.h>
	///#else
	///#endif // HAVE_MALLOC_H 
	///#else // HAVE_STDLIB_H 
	///#ifndef VMS
	///#ifndef EXIT_FAILURE
	///#define EXIT_FAILURE (1)
	///#endif
	///#ifndef EXIT_SUCCESS
	///#define EXIT_SUCCESS (0)
	///#endif
	///#else // VMS 
	///#ifdef VAXC            // replacement values suppress some messages 
	///#ifdef  EXIT_FAILURE
	///#endif
	///#ifdef  EXIT_SUCCESS
	///#endif
	///#endif // VAXC 
	///#ifndef  EXIT_FAILURE
	///#define EXIT_FAILURE  0x10000002
	///#endif
	///#ifndef  EXIT_SUCCESS
	///#define EXIT_SUCCESS  1
	///#endif
	///#endif // VMS 
	///#endif // HAVE_STDLIB_H 
	///#if defined(HAVE_VFPRINTF) || defined(HAVE_DOPRNT)
	///#ifdef STDC_HEADERS
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define VA_START(args, lastarg) va_start(args, lastarg)
	///#else
	///#include <varargs.h>
	///#define VA_START(args, lastarg) va_start(args)
	///#endif // !STDC_HEADERS 
	///#else // HAVE_VFPRINTF || HAVE_DOPRNT 
	///#define va_dcl char *a1, char *a2, char *a3, char *a4, char *a5, char *a6, char *a7, char *a8
	///#endif // !(HAVE_VFPRINTF || HAVE_DOPRNT) 
	///#ifdef HAVE_UNISTD_H
	///#else
	///#ifdef HAVE_LIBC_H // NeXT uses libc instead of unistd 
	///#include <libc.h>
	///#endif
	///#endif // HAVE_UNISTD_H 
	///#ifdef HAVE_ERRNO_H
	///#endif
	///#ifdef EXTERN_ERRNO
	///#endif
	///#ifndef HAVE_STRERROR
	///#endif
	///#ifdef HAVE_SYS_TYPES_H
	///#endif
	///#ifdef HAVE_SYS_STAT_H
	///#if !S_IRUSR
	///#if S_IREAD
	///#define S_IRUSR S_IREAD
	///#else
	///#define S_IRUSR 00400
	///#endif
	///#endif
	///#if !S_IWUSR
	///#if S_IWRITE
	///#define S_IWUSR S_IWRITE
	///#else
	///#define S_IWUSR 00200
	///#endif
	///#endif
	///#if !S_IXUSR
	///#if S_IEXEC
	///#define S_IXUSR S_IEXEC
	///#else
	///#define S_IXUSR 00100
	///#endif
	///#endif
	///#ifdef STAT_MACROS_BROKEN
	///#endif // STAT_MACROS_BROKEN.  
	///#if !defined(S_ISBLK) && defined(S_IFBLK)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISBLK(m) (((m) & S_IFMT) == S_IFBLK)
	///#endif
	///#if !defined(S_ISCHR) && defined(S_IFCHR)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISCHR(m) (((m) & S_IFMT) == S_IFCHR)
	///#endif
	///#if !defined(S_ISDIR) && defined(S_IFDIR)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISDIR(m) (((m) & S_IFMT) == S_IFDIR)
	///#endif
	///#if !defined(S_ISREG) && defined(S_IFREG)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISREG(m) (((m) & S_IFMT) == S_IFREG)
	///#endif
	///#if !defined(S_ISFIFO) && defined(S_IFIFO)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISFIFO(m) (((m) & S_IFMT) == S_IFIFO)
	///#endif
	///#if !defined(S_ISLNK) && defined(S_IFLNK)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISLNK(m) (((m) & S_IFMT) == S_IFLNK)
	///#endif
	///#if !defined(S_ISSOCK) && defined(S_IFSOCK)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISSOCK(m) (((m) & S_IFMT) == S_IFSOCK)
	///#endif
	///#if !defined(S_ISMPB) && defined(S_IFMPB) // V7
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISMPB(m) (((m) & S_IFMT) == S_IFMPB)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISMPC(m) (((m) & S_IFMT) == S_IFMPC)
	///#endif
	///#if !defined(S_ISNWK) && defined(S_IFNWK) // HP/UX
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define S_ISNWK(m) (((m) & S_IFMT) == S_IFNWK)
	///#endif
	///#endif // HAVE_SYS_STAT_H 
	///#ifdef HAVE_LIMITS_H
	///#else
	///#ifdef HAVE_VALUES_H
	///#include <values.h>
	///#endif // HAVE_VALUES_H 
	///#endif // HAVE_LIMITS_H 
	///#ifdef HAVE_TIME_H
	///#endif
	///#ifndef HAVE_TIME_T_IN_TIME_H
	///#define time_t long
	///#endif
	///#if defined(PIPES) && (defined(VMS) || (defined(OSK) && defined(_ANSI_EXT))) || defined(PIPES) && defined(AMIGA_SC_6_1)
	///#endif
	///#ifdef HAVE_FLOAT_H
	///#endif
	///#ifndef DBL_EPSILON
	///#define DBL_EPSILON 2.2204460492503131E-16
	///#endif
	///#ifdef HAVE_LOCALE_H
	///#endif
	///#ifdef HAVE_MATH_H
	///#endif
	///#ifndef M_PI
	///#define M_PI 3.14159265358979323846
	///#endif
	///#ifndef M_PI_2
	///#define M_PI_2 1.57079632679489661923
	///#endif
	///#ifndef M_LN10
	///#define M_LN10 2.3025850929940456840e0
	///#endif
	///#if defined(DBL_MIN_10_EXP)
	///#define E_MINEXP (DBL_MIN_10_EXP * M_LN10)
	///#endif
	///#if defined(DBL_MAX_10_EXP)
	///#define E_MAXEXP (DBL_MAX_10_EXP * M_LN10)
	///#endif
	///#ifndef HAVE_STRCASECMP
	///#ifdef HAVE_STRICMP
	///#define strcasecmp stricmp
	///#else
	///#define strcasecmp gp_stricmp
	///#endif
	///#endif
	///#ifndef HAVE_STRNCASECMP
	///#ifdef HAVE_STRNICMP
	///#define strncasecmp strnicmp
	///#else
	///#define strncasecmp gp_strnicmp
	///#endif
	///#endif
	///#ifndef GP_GETCWD
	///#if defined(HAVE_GETCWD)
	///#if defined(__EMX__)
	///#define GP_GETCWD(path,len) _getcwd2 (path, len)
	///#else
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_GETCWD(path,len) getcwd (path, len)
	///#endif // __EMX__ 
	///#else
	///#define GP_GETCWD(path,len) getwd (path)
	///#endif
	///#endif
	///#ifdef WIN32
	///#include <windows.h>
	///#endif
	///#if defined(HAVE_USLEEP)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_SLEEP(delay) usleep((unsigned int) ((delay)*1e6))
	///#elif defined(__EMX__)
	///#define GP_SLEEP(delay) _sleep2((unsigned int) ((delay)*1e3))
	///#ifndef HAVE_SLEEP
	///#define HAVE_SLEEP
	///#endif
	///#elif defined(WIN32)
	///#define GP_SLEEP(delay) win_sleep((DWORD) 1000*delay)
	///#ifndef HAVE_SLEEP
	///#define HAVE_SLEEP
	///#endif
	///#endif
	///#ifndef GP_SLEEP
	///#ifdef __ZTC__
	///#define GP_SLEEP(delay) usleep ((unsigned long) (delay+0.5))
	///#else
	///#define GP_SLEEP(delay) sleep ((unsigned int) (delay+0.5))
	///#endif
	///#endif
	///#ifdef HAVE_ATEXIT
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_ATEXIT(x) atexit((x))
	///#elif defined(HAVE_ON_EXIT)
	///#define GP_ATEXIT(x) on_exit((x),0)
	///#else
	///#define GP_ATEXIT(x) // you lose 
	///#endif
	///#define NUL ('\0')
	///#ifdef DEBUG
	///#define DEBUG_WHERE do { fprintf(stderr,"%s:%d ",__FILE__,__LINE__); } while (0)
	///#define FPRINTF(a) do { DEBUG_WHERE; fprintf a; } while (0)
	///#else
	///#define DEBUG_WHERE
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FPRINTF(a)
	///#endif // DEBUG 
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define INT_STR_LEN (3*sizeof(int))
	///#if defined ( NEXT ) && NX_CURRENT_COMPILER_RELEASE<310
	///#if defined ( DBL_MAX)
	///#endif
	///#define DBL_MAX 1.7976931348623157e+308
	///#define HUGE    DBL_MAX
	///#define HUGE_VAL DBL_MAX
	///#endif // NEXT && NX_CURRENT_COMPILER_RELEASE<310 
	///#ifndef COORDVAL_FLOAT
	///#ifdef DBL_MAX
	///#define VERYLARGE (DBL_MAX/2-1)
	///#endif
	///#else // COORDVAL_FLOAT 
	///#ifdef FLT_MAX
	///#define VERYLARGE (FLT_MAX/2-1)
	///#endif
	///#endif // COORDVAL_FLOAT 
	///#ifndef VERYLARGE
	///#ifdef HUGE
	///#define VERYLARGE (HUGE/2-1)
	///#elif defined(HUGE_VAL)
	///#define VERYLARGE (HUGE_VAL/2-1)
	///#else
	///#define VERYLARGE (1e37)
	///#endif // HUGE 
	///#endif // VERYLARGE 
	///#ifdef HAVE_SYS_PARAM_H
	///#endif
	///#ifndef PATH_MAX
	///#ifndef MAXPATHLEN
	///#define PATH_MAX 1024
	///#else
	///#define PATH_MAX MAXPATHLEN
	///#endif
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PATH_CONCAT(path,file) { char *p = path; p += strlen(path); if (p!=path) p--; if (*p && (*p != DIRSEP1) && (*p != DIRSEP2)) { if (*p) p++; *p++ = DIRSEP1; *p = NUL; } strcat (path, file); }
	///#ifndef inrange
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define inrange(z,min,max) (((min)<(max)) ? (((z)>=(min)) && ((z)<=(max))) : (((z)>=(max)) && ((z)<=(min))))
	///#endif
	///#ifndef cliptorange
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define cliptorange(z,min,max) do { if ((min) < (max)) { if ((z) > (max)) (z) = (max); else if ((z) < (min)) (z) = (min); } else { if ((z) > (min)) (z) = (min); else if ((z) < (max)) (z) = (max); } } while (0)
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GPMAX(a,b) ( (a) > (b) ? (a) : (b) )
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GPMIN(a,b) ( (a) < (b) ? (a) : (b) )
	///#ifndef HAVE_SLEEP
	///#endif
	///#if defined(PIPE_IPC) || defined(WIN_IPC)
	///#endif
	///#ifdef OS2
	///#endif
	///#ifdef USE_MOUSE
	///#endif
	///#define LT_AXIS (-1)
	///#define LT_BLACK (-2)
	///#define LT_NODRAW (-3)
	///#define LT_BACKGROUND (-4)
	///#define LT_UNDEFINED (-5)
	///#define LT_COLORFROMCOLUMN (-6)
	///#define LT_DEFAULT (-7)
	///#define TEXT_VERTICAL (-270)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_LP_STYLE_TYPE {0, -2, 0, 0, 1.0, PTSZ_DEFAULT, FALSE, DEFAULT_COLORSPEC}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FS_OPAQUE (FS_SOLID + (100<<4))
	///#define TERM_CAN_MULTIPLOT 1
	///#define TERM_CANNOT_MULTIPLOT 2
	///#define TERM_BINARY 4
	///#define TERM_INIT_ON_REPLOT 8
	///#define TERM_IS_POSTSCRIPT 16
	///#define TERM_ENHANCED_TEXT 32
	///#define TERM_NO_OUTPUTFILE 64
	///#define TERM_CAN_CLIP 128
	///#define TERM_CAN_DASH 256
	///#define TERM_ALPHA_CHANNEL 512
	///#define TERM_MONOCHROME 1024
	///#define TERM_LINEWIDTH 2048
	///#ifdef WIN16
	///#else
	///#endif
	///#ifdef USE_MOUSE
	///#endif
	///#ifdef WIN16
	///#define termentry TERMENTRY far
	///#else
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define termentry TERMENTRY
	///#endif
	///#ifdef PIPE_IPC
	///#endif // PIPE_IPC 
	///#if 0 // UNUSED
	///#endif // UNUSED 
	///#ifdef EAM_OBJECTS
	///#endif
	///#ifdef LINUXVGA
	///#endif
	///#ifdef PC
	///#endif
	///#ifdef VMS
	///#endif
	///#ifdef OS2
	///#ifdef USE_MOUSE
	///#endif
	///#endif
	///#define PTSZ_DEFAULT (-2)
	///#define PTSZ_VARIABLE (-3)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define EMPTY_LABELSTRUCT {NULL, -2, {character, character, character, 0.0, 0.0, 0.0}, CENTRE, 0, 0, NULL, NULL, {TC_LT, -2, 0.0}, DEFAULT_LP_STYLE_TYPE, {character, character, character, 0.0, 0.0, 0.0}, FALSE }
	///#ifdef EAM_OBJECTS
	///#define OBJ_RECTANGLE (1)
	///#define OBJ_CIRCLE (2)
	///#define OBJ_ELLIPSE (3)
	///#define OBJ_POLYGON (4)
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define EMPTY_FILLEDCURVES_OPTS { 0, 0, 0.0, 0.0, 0 }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_HISTOGRAM_STYLE { HT_NONE, 2, 1, 0.0, 0.0, LT_UNDEFINED, LT_UNDEFINED, 0, NULL, EMPTY_LABELSTRUCT }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_KEYBOX_LP { 0, LT_NODRAW, 0, 1.0, 1.0, 0 }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_KEY_POSITION { graph, graph, graph, 0.9, 0.9, 0. }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_KEY_PROPS { TRUE, GPKEY_AUTO_INTERIOR_LRTBC, GPKEY_RMARGIN, DEFAULT_KEY_POSITION, JUST_TOP, RIGHT, GPKEY_RIGHT, GPKEY_VERTICAL, 4.0, 1.0, 0.0, 0.0, FILENAME_KEYTITLES, FALSE, FALSE, TRUE, DEFAULT_KEYBOX_LP, "", NULL, {TC_LT, LT_BLACK, 0.0} }
	///#define SMCOLOR_BOX_NO 'n'
	///#define SMCOLOR_BOX_DEFAULT 'd'
	///#define SMCOLOR_BOX_USER 'u'
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_MARGIN_POSITION {character, character, character, -1, -1, -1}
	///#ifdef EAM_OBJECTS
	///#endif
	///#ifndef DEFAULT_TIMESTAMP_FORMAT
	///#define DEFAULT_TIMESTAMP_FORMAT "%a %b %d %H:%M:%S %Y"
	///#endif
	///#define ZERO 1e-8
	///#define SOUTH 1
	///#define WEST 2
	///#define NORTH 4
	///#define EAST 8
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_east (draw_border & EAST)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_west (draw_border & WEST)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_south (draw_border & SOUTH)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_north (draw_border & NORTH)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define border_complete ((draw_border & 15) == 15)
	///#define SAMPLES 100
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ALMOST2D ( !is_3d_plot || ( fabs(fmod(surface_rot_z,90.0))<0.1 && (surface_rot_x>179.9 || surface_rot_x<0.1) ) )
	///#ifdef VOLATILE_REFRESH
	///#else
	///#define refresh_ok FALSE
	///#endif
	///#define LAYER_BEHIND -1
	///#define LAYER_BACK 0
	///#define LAYER_FRONT 1
	///#define LAYER_PLOTLABELS 99
	///#ifdef EAM_OBJECTS
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_RECTANGLE_STYLE { NULL, -1, 0, OBJ_RECTANGLE, {FS_SOLID, 100, 0, BLACK_COLORSPEC}, {1, LT_BACKGROUND, 0, 0, 1.0, 0.0, FALSE, DEFAULT_COLORSPEC}, {.rectangle = {0, {0,0.,0.,0.}, {0,0.,0.,0.}, {0,0.,0.,0.}, {0,0.,0.,0.}}} }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_CIRCLE_STYLE { NULL, -1, 0, OBJ_CIRCLE, {FS_SOLID, 100, 0, BLACK_COLORSPEC}, {1, LT_BACKGROUND, 0, 0, 1.0, 0.0, FALSE, DEFAULT_COLORSPEC}, {.circle = {1, {0,0.,0.,0.}, {0,0.,0.,0.}, 0., 360. }} }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_ELLIPSE_STYLE { NULL, -1, 0, OBJ_CIRCLE, {FS_SOLID, 100, 0, BLACK_COLORSPEC}, {1, LT_BACKGROUND, 0, 0, 1.0, 0.0, FALSE, DEFAULT_COLORSPEC}, {.ellipse = {1, {0,0.,0.,0.}, {0,0.,0.,0.}, 0. }} }
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_POLYGON_STYLE { NULL, -1, 0, OBJ_POLYGON, {FS_SOLID, 100, 0, BLACK_COLORSPEC}, {1, LT_BLACK, 0, 0, 1.0, 0.0, FALSE, DEFAULT_COLORSPEC}, {.polygon = {0, NULL} } }
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
	///#if defined(sun386) || defined(AMIGA_SC_6_1)
	///#endif
	///#ifdef EAM_OBJECTS
	///#else
	///#define place_objects(listhead,layer,dimensions,clip_area) // void() 
	///#endif
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
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_x3d(x) ((x-X_AXIS.min)*xscale3d + xcenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_y3d(y) ((y-Y_AXIS.min)*yscale3d + ycenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_z3d(z) ((z-floor_z)*zscale3d + zcenter3d -1.0)
	///#define ISO_SAMPLES 10
	///#ifdef USE_MOUSE
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

	/* COLOUR MODES - GLOBAL VARIABLES */

	public static t_sm_palette sm_palette = new t_sm_palette(); // initialized in init_color()

	/* Copy of palette previously in use.
	 * Exported so that change_term() can invalidate contents
	 * FIXME: better naming 
	 */
	public static t_sm_palette prev_palette = new t_sm_palette(-1, -1, -1, -1, -1, -1, -1, -1, (rgb_color *) 0, -1);

	/*
   Draw colour smooth box

   Firstly two helper routines for plotting inside of the box
   for postscript and for other terminals, finally the main routine
	 */


	/* plot the colour smooth box for from terminal's integer coordinates
   This routine is for postscript files --- actually, it writes a small
   PS routine.
	 */


	///#ifdef EXTENDED_COLOR_SPECS
	//int supply_extended_color_specs = 0;
	///#endif

	/* Internal prototype declarations: */

	public static void draw_inside_color_smooth_box_postscript(File out)
	{
		int scale_x = (GlobalMembersGadgets.color_box.bounds.xright - GlobalMembersGadgets.color_box.bounds.xleft);
		int scale_y = (GlobalMembersGadgets.color_box.bounds.ytop - GlobalMembersGadgets.color_box.bounds.ybot);
		fputs("stroke gsave\t%% draw gray scale smooth box\n" + "maxcolors 0 gt {/imax maxcolors def} {/imax 1024 def} ifelse\n", out);

		/* nb. of discrete steps (counted in the loop) */
		fprintf(out, "%i %i translate %i %i scale 0 setlinewidth\n", GlobalMembersGadgets.color_box.bounds.xleft, GlobalMembersGadgets.color_box.bounds.ybot, scale_x, scale_y);
		/* define left bottom corner and scale of the box so that all coordinates
		   of the box are from [0,0] up to [1,1]. Further, this normalization
		   makes it possible to pass y from [0,1] as parameter to setgray */
		fprintf(out, "/ystep 1 imax div def /y0 0 def /ii 0 def\n");
		/* local variables; y-step, current y position and counter ii;  */
		if (sm_palette.positive == DefineConstants.SMPAL_NEGATIVE) // inverted gray for negative figure
			fputs("{ 0.99999 y0 sub g ", out); // 1 > x > 1-1.0/1024
		else
			fputs("{ y0 g ", out);
		if (GlobalMembersGadgets.color_box.rotation == 'v')
			fputs("0 y0 N 1 0 V 0 ystep V -1 0 f\n", out);
		else
			fputs("y0 0 N 0 1 V ystep 0 V 0 -1 f\n", out);
		fputs("/y0 y0 ystep add def /ii ii 1 add def\n" + "ii imax ge {exit} if } loop\n" + "grestore 0 setgray\n", out);
	}

	/* plot the colour smooth box for from terminal's integer coordinates
   [x_from,y_from] to [x_to,y_to].
   This routine is for non-postscript files, as it does explicitly the loop
   over all thin rectangles
	 */
	public static void draw_inside_color_smooth_box_bitmap(File out)
	{
		int steps = 128; // I think that nobody can distinguish more colours drawn in the palette
		int i;
		int xy;
		int xy2;
		int xy_from;
		int xy_to;
		double xy_step;
		double gray;
		gpiPoint[] corners = new gpiPoint[4];

		if (GlobalMembersGadgets.color_box.rotation == 'v')
		{
			corners[0].x = corners[3].x = GlobalMembersGadgets.color_box.bounds.xleft;
			corners[1].x = corners[2].x = GlobalMembersGadgets.color_box.bounds.xright;
			xy_from = GlobalMembersGadgets.color_box.bounds.ybot;
			xy_to = GlobalMembersGadgets.color_box.bounds.ytop;
		}
		else
		{
			corners[0].y = corners[1].y = GlobalMembersGadgets.color_box.bounds.ybot;
			corners[2].y = corners[3].y = GlobalMembersGadgets.color_box.bounds.ytop;
			xy_from = GlobalMembersGadgets.color_box.bounds.xleft;
			xy_to = GlobalMembersGadgets.color_box.bounds.xright;
		}
		xy_step = (GlobalMembersGadgets.color_box.rotation == 'h' ? GlobalMembersGadgets.color_box.bounds.xright - GlobalMembersGadgets.color_box.bounds.xleft : GlobalMembersGadgets.color_box.bounds.ytop - GlobalMembersGadgets.color_box.bounds.ybot) / (double) steps;

		for (i = 0; i < steps; i++)
		{
			gray = (double) i / steps; // colours equidistantly from [0,1]
			if (sm_palette.positive == DefineConstants.SMPAL_NEGATIVE)
				gray = 1 - gray;
			/* Set the colour (also for terminals which support extended specs). */
			GlobalMembersColor.set_color(gray);
			xy = xy_from + (int)(xy_step * i);
			xy2 = xy_from + (int)(xy_step * (i + 1));
			if (GlobalMembersGadgets.color_box.rotation == 'v')
			{
				corners[0].y = corners[1].y = xy;
				corners[2].y = corners[3].y = (i == steps - 1) ? xy_to : xy2;
			}
			else
			{
				corners[0].x = corners[3].x = xy;
				corners[1].x = corners[2].x = (i == steps - 1) ? xy_to : xy2;
			}
			///#ifdef EXTENDED_COLOR_SPECS
			//	if (supply_extended_color_specs) {
			//	    corners[0].spec.gray = -1;	// force solid color
			//	}
			///#endif
			/* print the rectangle with the given colour */
			if (GlobalMembersGadgets.default_fillstyle.fillstyle == t_fillstyle.FS_EMPTY.getValue())
				corners.style = t_fillstyle.FS_SOLID.getValue() + (100 << 4);
			else
				//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
				//ORIGINAL LINE: corners->style = style_from_fill(&default_fillstyle);
				corners.style = GlobalMembersTerm.style_from_fill(new fill_style_type(GlobalMembersGadgets.default_fillstyle));
			term.filled_polygon(4, corners);
		}
	}

	/* Notice HBB 20010720: would be static, but HP-UX gcc bug forbids
	 * this, for now */
	public static void cbtick_callback(AXIS_INDEX axis, double place, String text, lp_style_type grid, ticmark userlabels)
	{
		int len = (int) ((text != null ? GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].ticscale : GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].miniticscale) * (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].tic_in ? - 1 : 1) * (term.h_tic));
		double cb_place = (place - GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min) / (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max - GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min);
		/* relative z position along the colorbox axis */
		int x1;
		int y1;
		int x2;
		int y2;

		/* calculate tic position */
		if (GlobalMembersGadgets.color_box.rotation == 'h')
		{
			x1 = x2 = (int) (GlobalMembersGadgets.color_box.bounds.xleft + cb_place * (GlobalMembersGadgets.color_box.bounds.xright - GlobalMembersGadgets.color_box.bounds.xleft));
			y1 = GlobalMembersGadgets.color_box.bounds.ybot;
			y2 = GlobalMembersGadgets.color_box.bounds.ybot - len;
		}
		else
		{
			x1 = GlobalMembersGadgets.color_box.bounds.xright;
			x2 = GlobalMembersGadgets.color_box.bounds.xright + len;
			y1 = y2 = (int) (GlobalMembersGadgets.color_box.bounds.ybot + cb_place * (GlobalMembersGadgets.color_box.bounds.ytop - GlobalMembersGadgets.color_box.bounds.ybot));
		}

		/* draw grid line */
		if (grid.l_type > DefineConstants.LT_NODRAW)
		{
			GlobalMembersTerm.term_apply_lp_properties(grid); // grid linetype
			if (GlobalMembersGadgets.color_box.rotation == 'h')
			{
				term.move(x1, GlobalMembersGadgets.color_box.bounds.ybot);
				term.vector(x1, GlobalMembersGadgets.color_box.bounds.ytop);
			}
			else
			{
				term.move(GlobalMembersGadgets.color_box.bounds.xleft, y1);
				term.vector(GlobalMembersGadgets.color_box.bounds.xright, y1);
			}
			GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp); // border linetype
		}

		/* draw tic */
		term.move(x1, y1);
		term.vector(x2, y2);

		/* draw label */
		if (text != null)
		{
			/* get offset */
			int offsetx;
			int offsety;
			GlobalMembersGraph3d.map3d_position_r((GlobalMembersAxis.axis_array[axis.getValue()].ticdef.offset), offsetx, offsety, "cbtics");
			/* User-specified different color for the tics text */
			if (GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor.type != DefineConstants.TC_DEFAULT)
				GlobalMembersGadgets.apply_pm3dcolor(GlobalMembersAxis.axis_array[axis.getValue()].ticdef.textcolor);
			if (GlobalMembersGadgets.color_box.rotation == 'h')
			{
				int y3 = GlobalMembersGadgets.color_box.bounds.ybot - (GlobalMembersTerm.term.v_char);
				int hrotate = 0;

				if (GlobalMembersAxis.axis_array[axis.getValue()].tic_rotate != 0 && (term.text_angle(GlobalMembersAxis.axis_array[axis.getValue()].tic_rotate) != 0))
					hrotate = GlobalMembersAxis.axis_array[axis.getValue()].tic_rotate;
				if (len > 0) // add outer tics len
					y3 -= len;
				if (y3 < 0)
					y3 = 0;
				GlobalMembersTerm.write_multiline(x2 + offsetx, y3 + offsety, text, (hrotate != 0 ? JUSTIFY.LEFT : JUSTIFY.CENTRE), VERT_JUSTIFY.JUST_CENTRE, hrotate, GlobalMembersAxis.axis_array[axis.getValue()].ticdef.font);
				if (hrotate != 0)
					term.text_angle(0);
			}
			else
			{
				int x3 = GlobalMembersGadgets.color_box.bounds.xright + (GlobalMembersTerm.term.h_char);
				if (len > 0) // add outer tics len
					x3 += len;
				GlobalMembersTerm.write_multiline(x3 + offsetx, y2 + offsety, text, JUSTIFY.LEFT, VERT_JUSTIFY.JUST_CENTRE, 0, GlobalMembersAxis.axis_array[axis.getValue()].ticdef.font);
			}
			GlobalMembersTerm.term_apply_lp_properties(GlobalMembersGadgets.border_lp); // border linetype
		}

		/* draw tic on the mirror side */
		if ((GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].ticmode & ((DefineConstants.TICS_MIRROR != 0) ? 1 : 0)) != 0)
		{
			if (GlobalMembersGadgets.color_box.rotation == 'h')
			{
				y1 = GlobalMembersGadgets.color_box.bounds.ytop;
				y2 = GlobalMembersGadgets.color_box.bounds.ytop + len;
			}
			else
			{
				x1 = GlobalMembersGadgets.color_box.bounds.xleft;
				x2 = GlobalMembersGadgets.color_box.bounds.xleft - len;
			}
			term.move(x1, y1);
			term.vector(x2, y2);
		}
	}
}