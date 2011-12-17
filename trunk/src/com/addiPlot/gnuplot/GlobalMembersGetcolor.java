package com.addiPlot.gnuplot;

import com.addiPlot.gnuplot.tangible.StringFunctions;

public class GlobalMembersGetcolor
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
	//	return GlobalMembersAlloc.RCSid("$Id: getcolor.c,v 1.24 2006/02/21 09:14:49 mikulik Exp $");
	//}
	///#endif

	/*
	 *  Map a gray value in [0,1] to the corresponding RGB values in [0,1],
	 *  according to the current colorMode and color space.
	 *
	 *  Note -- November 2003: this routine has been renamed from color_from_gray()
	 *  to rgb1_from_gray() in order to more clearly distinguish structures
	 *  rgb_color and rgb255_color.
	 */


	/* main gray --> rgb color mapping */
	public static void rgb1_from_gray(double gray, rgb_color color)
	{
		/* get the color */
		GlobalMembersGetcolor.color_components_from_gray(gray, color);
		if (GlobalMembersColor.sm_palette.colorMode == palette_color_mode.SMPAL_COLOR_MODE_GRAY)
			return;

		/* transform to RGB if necessary */
		switch (GlobalMembersColor.sm_palette.cmodel)
		{
		case color_models_id.C_MODEL_RGB.getValue():
			break;
		case color_models_id.C_MODEL_HSV.getValue():
			GlobalMembersGetcolor.HSV_2_RGB(color);
			break;
		case color_models_id.C_MODEL_CMY.getValue():
			GlobalMembersGetcolor.CMY_2_RGB(color);
			break;
		case color_models_id.C_MODEL_YIQ.getValue():
			GlobalMembersGetcolor.YIQ_2_RGB(color);
			break;
		case color_models_id.C_MODEL_XYZ.getValue():
			GlobalMembersGetcolor.CIEXYZ_2_RGB(color);
			break;
		default:
			//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
			//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
			fprintf(stderr, "%s:%d ooops: Unknown color model '%c'\n", __FILE__, __LINE__, (byte)(GlobalMembersColor.sm_palette.cmodel));
		}
	}

	/*
	 *  Convenience function to map R, G and B float values [0,1] to uchars [0,255].
	 */
	public static void rgb255_from_rgb1(rgb_color rgb1, rgb255_color rgb255)
	{
		rgb255.r = (byte)(255 * rgb1.r + 0.5);
		rgb255.g = (byte)(255 * rgb1.g + 0.5);
		rgb255.b = (byte)(255 * rgb1.b + 0.5);
	}

	/*
	 *  Convenience function to map gray values to R, G and B values in [0,1],
	 *  taking care of palette maxcolors (i.e., discrete nb of colors).
	 */
	/* main gray --> rgb color mapping as above, with take care of palette maxcolors */
	public static void rgb1maxcolors_from_gray(double gray, rgb_color color)
	{
		if (GlobalMembersColor.sm_palette.use_maxcolors != 0)
			gray = Math.floor(gray * GlobalMembersColor.sm_palette.use_maxcolors) / (GlobalMembersColor.sm_palette.use_maxcolors - 1);
		GlobalMembersGetcolor.rgb1_from_gray(gray, color);
	}

	/*
	 *  Convenience function to map gray values to R, G and B values in [0,255],
	 *  taking care of palette maxcolors (i.e., discrete nb of colors).
	 */
	public static void rgb255maxcolors_from_gray(double gray, rgb255_color rgb255)
	{
		rgb_color rgb1 = new rgb_color();
		GlobalMembersGetcolor.rgb1maxcolors_from_gray(gray, rgb1);
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: rgb255_from_rgb1(rgb1, rgb255);
		GlobalMembersGetcolor.rgb255_from_rgb1(new rgb_color(rgb1), rgb255);
	}

	/* Store a gradient entry in 8 characters which do not contain '\n' */
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static String gradient_entry_to_str_buf = new String(new char[20]);

	/* used to (de-)serialize color/gradient information */
	public static String gradient_entry_to_str(gradient_struct gs)
	{
		//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
		//	static sbyte buf[20];
		GlobalMembersGetcolor.dbl_to_str(gs.pos, gradient_entry_to_str_buf);
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: color_to_str(gs->col, buf + 2);
		GlobalMembersGetcolor.color_to_str(new rgb_color(gs.col), gradient_entry_to_str_buf + 2);
		return gradient_entry_to_str_buf;
	}

	/* Gestore gradient entry from string */
	public static void str_to_gradient_entry(String s, gradient_struct gs)
	{
		gs.pos = GlobalMembersGetcolor.str_to_dbl(s);
		GlobalMembersGetcolor.str_to_color(s + 2, (gs.col));
	}

	/* check if two palettes p1 and p2 differ significantly */

	/* check if two palettes p1 and p2 differ */
	public static int palettes_differ(t_sm_palette p1, t_sm_palette p2)
	{
		if (p1.colorMode != p2.colorMode)
			return 1;
		if (p1.positive != p2.positive)
			return 1;
		if (p1.cmodel != p2.cmodel)
			return 1;
		if (p1.use_maxcolors != p2.use_maxcolors)
			return 1;

		switch (p1.colorMode)
		{
		case SMPAL_COLOR_MODE_NONE:
			return 0; // ??
		case SMPAL_COLOR_MODE_GRAY:
			if (Math.abs(p1.gamma - p2.gamma) > 1e-3)
				return 1;
			break;
		case SMPAL_COLOR_MODE_RGB:
			if (p1.colorFormulae != p2.colorFormulae)
				return 1;
			if (p1.formulaR != p2.formulaR)
				return 1;
			if (p1.formulaG != p2.formulaG)
				return 1;
			if (p1.formulaB != p2.formulaB)
				return 1;
			/* if (p1->ps_allcF != p2->ps_allcF)
		   return 1; */
			break;
		case SMPAL_COLOR_MODE_FUNCTIONS:
			/* coarse check based on typed fnct definitions */
			if (StringFunctions.strcmp(p1.Afunc.definition, p2.Afunc.definition) != 0)
				return 1;
			if (StringFunctions.strcmp(p1.Bfunc.definition, p2.Bfunc.definition) != 0)
				return 1;
			if (StringFunctions.strcmp(p1.Cfunc.definition, p2.Cfunc.definition) != 0)
				return 1;
			break;
		case SMPAL_COLOR_MODE_GRADIENT:
		{
			int i = 0;

			if (p1.gradient_num != p2.gradient_num)
				return 1;
			for (i = 0; i < p1.gradient_num; ++i)
			{
				if (p1.gradient[i].pos != p2.gradient[i].pos)
					return 1;
				if (p1.gradient[i].col.r != p2.gradient[i].col.r)
					return 1;
				if (p1.gradient[i].col.g != p2.gradient[i].col.g)
					return 1;
				if (p1.gradient[i].col.b != p2.gradient[i].col.b)
					return 1;
			}
			break;
		} // case GRADIENT
		} // switch()

		return 0; // no real difference found
	}

	/*
	 *  This function takes a palette and constructs a gradient which can
	 *  be used to approximate the palette by linear interpolation.
	 *  The palette is sampled at samples+1 points equally spaced in [0,1].
	 *  From this huge gradient a much smaler one is constructed by selecting
	 *  just those sampling points which still do approximate the full sampled
	 *  one well enough.  allowed_deviation determines the maximum deviation
	 *  of all color components which is still acceptable for the reduced
	 *  gradient.  Use a sufficiently large number of samples (500 to 5000).
	 *  Please free() the returned gradient after use.  samples, allowed_deviation
	 *  and max_skip may be <=0 and useful defaults will be used.
	 *  Most probably it's useless to approximate a gradient- or rgbformulae-
	 *  palette.  Use it to build gradients from function palettes.
	 */

	/* construct minimal gradient to approximate palette */
	public static gradient_struct approximate_palette(t_sm_palette palette, int samples, double allowed_deviation, int gradient_num)
	{
		int i = 0;
		int j = 0;
		double gray = 0;
		int gradient_size = 50;
		gradient_struct[] gradient;
		int colors_size = 100;
		rgb_color[] colors;
		int cnt = 0;
		rgb_color color = new rgb_color();
		double max_dev = 0.0;
		/* int maximum_j=0, extrema=0; */

		/* useful defaults */
		if (samples <= 0)
			samples = 2000;
		if (allowed_deviation <= 0)
			allowed_deviation = 0.003;

		gradient = new gradient_struct[gradient_size];
		colors = new rgb_color[colors_size];
		assert gradient && colors != null;

		/* start (gray=0.0) is needed */
		cnt = 0;
		GlobalMembersGetcolor.color_components_from_gray(0.0, colors + 0);
		gradient[0].pos = 0.0;
		gradient[0].col = colors[0];
		++cnt;
		GlobalMembersGetcolor.color_components_from_gray(1.0 / samples, colors + 1);

		for (i = 0; i < samples; ++i)
		{
			for (j = 2; i + j <= samples; ++j)
			{
				gray = ((double)(i + j)) / samples;
				if (j == colors_size)
				{
					colors_size += 50;
					//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'realloc' has no equivalent in Java:
					//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
					colors = (rgb_color) realloc(colors, colors_size * sizeof(gradient_struct));
				}
				GlobalMembersGetcolor.color_components_from_gray(gray, colors + j);

				/* test for extremum */
				//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
				//ORIGINAL LINE: if(is_extremum(colors[j - 2], colors[j - 1], colors[j]))
				if (GlobalMembersGetcolor.is_extremum(new rgb_color(colors[j - 2]), new rgb_color(colors[j - 1]), new rgb_color(colors[j])) != 0)
				{
					/* fprintf(stderr,"Extremum at %g\n", gray); */
					/* ++extrema; */
					break;
				}

				/* to big deviation */
				//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
				//ORIGINAL LINE: max_dev = get_max_dev(colors, j, allowed_deviation);
				max_dev = GlobalMembersGetcolor.get_max_dev(new rgb_color(colors), j, allowed_deviation);
				if (max_dev > allowed_deviation)
				{
					/* fprintf(stderr,"Control Point at %.3g\n",gray); */
					break;
				}
			}
			do
			{
				if (cnt == gradient_size)
				{
					gradient_size += (25);
					//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'realloc' has no equivalent in Java:
					//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
					gradient = (gradient_struct) realloc(gradient, gradient_size * sizeof(gradient_struct));
				}
			} while (0);

			gradient[cnt].pos = gray;
			gradient[cnt].col = colors[j - 1];
			++cnt;

			/* if(j-1 > maximum_j) maximum_j = j-1; */

			colors[0] = colors[j - 1];
			colors[1] = colors[j];
			i += j - 1;
		}

		GlobalMembersGetcolor.color_components_from_gray(1.0, color);
		do
		{
			if (cnt == gradient_size)
			{
				gradient_size += (1);
				//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'realloc' has no equivalent in Java:
				//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
				gradient = (gradient_struct) realloc(gradient, gradient_size * sizeof(gradient_struct));
			}
		} while (0);
		gradient[cnt].pos = 1.0;
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
		//ORIGINAL LINE: gradient[cnt].col = color;
		gradient[cnt].col.copyFrom(color);
		++cnt;

		/***********
		fprintf(stderr,
			 "PS interpolation table: %d samples, allowed deviation %.2f%%:\n",
			 samples, 100*allowed_deviation);

		fprintf(stderr, "  --> new size %d, %d extrema, max skip %d\n",
			 cnt, extrema, maximum_j);
		 ************/
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(colors);
		gradient_num = cnt;
		return gradient; // don't forget to free() it once you'r done with it
	}

	/*
	 *  Original fixed color transformations
	 */

	public static double GetColorValueFromFormula(int formula, double x)
	{
		/* the input gray x is supposed to be in interval [0,1] */
		if (formula < 0) // negate the value for negative formula
		{
			x = 1 - x;
			formula = -formula;
		}
		switch (formula)
		{
		case 0:
			return 0;
		case 1:
			return 0.5;
		case 2:
			return 1;
		case 3: // x = x
			break;
		case 4:
			x = x * x;
			break;
		case 5:
			x = x * x * x;
			break;
		case 6:
			x = x * x * x * x;
			break;
		case 7:
			x = Math.sqrt(x);
			break;
		case 8:
			x = Math.sqrt(Math.sqrt(x));
			break;
		case 9:
			x = Math.sin(90 * x * DefineConstants.M_PI / 180.0);
			break;
		case 10:
			x = Math.cos(90 * x * DefineConstants.M_PI / 180.0);
			break;
		case 11:
			x = Math.abs(x - 0.5);
			break;
		case 12:
			x = (2 * x - 1) * (2.0 * x - 1);
			break;
		case 13:
			x = Math.sin(180 * x * DefineConstants.M_PI / 180.0);
			break;
		case 14:
			x = Math.abs(Math.cos(180 * x * DefineConstants.M_PI / 180.0));
			break;
		case 15:
			x = Math.sin(360 * x * DefineConstants.M_PI / 180.0);
			break;
		case 16:
			x = Math.cos(360 * x * DefineConstants.M_PI / 180.0);
			break;
		case 17:
			x = Math.abs(Math.sin(360 * x * DefineConstants.M_PI / 180.0));
			break;
		case 18:
			x = Math.abs(Math.cos(360 * x * DefineConstants.M_PI / 180.0));
			break;
		case 19:
			x = Math.abs(Math.sin(720 * x * DefineConstants.M_PI / 180.0));
			break;
		case 20:
			x = Math.abs(Math.cos(720 * x * DefineConstants.M_PI / 180.0));
			break;
		case 21:
			x = 3 * x;
			break;
		case 22:
			x = 3 * x - 1;
			break;
		case 23:
			x = 3 * x - 2;
			break;
		case 24:
			x = Math.abs(3 * x - 1);
			break;
		case 25:
			x = Math.abs(3 * x - 2);
			break;
		case 26:
			x = (1.5 * x - 0.5);
			break;
		case 27:
			x = (1.5 * x - 1);
			break;
		case 28:
			x = Math.abs(1.5 * x - 0.5);
			break;
		case 29:
			x = Math.abs(1.5 * x - 1);
			break;
		case 30:
			if (x <= 0.25)
				return 0;
			if (x >= 0.57)
				return 1;
			x = x / 0.32 - 0.78125;
			break;
		case 31:
			if (x <= 0.42)
				return 0;
			if (x >= 0.92)
				return 1;
			x = 2 * x - 0.84;
			break;
		case 32:
			if (x <= 0.42)
				x *= 4;
			else
				x = (x <= 0.92) ? - 2 * x + 1.84 : x / 0.08 - 11.5;
			break;
		case 33:
			x = Math.abs(2 * x - 0.5);
			break;
		case 34:
			x = 2 * x;
			break;
		case 35:
			x = 2 * x - 0.5;
			break;
		case 36:
			x = 2 * x - 1;
			break;
			/*
		   IMPORTANT: if any new formula is added here, then:
		   (1) its postscript counterpart must be added into term/post.trm,
		   search for "ps_math_color_formulae[]"
		   (2) number of colours must be incremented in color.c: variable
		   sm_palette, first item---search for "t_sm_palette sm_palette = "
			 */
		default:
			fprintf(stderr, "Fatal: undefined color formula (can be 0--%i)\n", GlobalMembersColor.sm_palette.colorFormulae - 1);
			System.exit(1);
		}
		if (x <= 0)
			return 0;
		if (x >= 1)
			return 1;
		return x;
	}

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern String ps_math_color_formulae[];

	///#ifndef GPLT_X11_MODE
	/*  Fills color with the values calculated from sm_palette.[ABC]func
	 *  The color values are clipped to [0,1] without further notice.
	 *  Returns 0 or does an int_error() when function evaluatin failed.
	 *  The result is not in RGB color space jet.
	 */


	/* eof getcolor.h */


	/*
	 * This file implements all the gray to color transforms except one:
	 * calculate_color_from_formulae() which can be found in color.c.
	 * calculate_color_from_formulae() belongs logicaly into this (getcolor.c)
	 * file, but it can't be here due to linkage problems:  gnuplot_x11
	 * needs a lot of code from getcolor.c but does not contain any function
	 * evaluation code [and does not call calculate_color_from_formulae()].
	 * This file is compiled twice:  Once as part of gnuplot and the second
	 * time with -DGPLT_X11_MODE resulting in getcolor_x11.o which is linked
	 * into gnuplot_x11.  With GPLT_X11_MODE defined this file does not
	 * contain code for calculating colors from gray by user defined functions.
	 */
	///#ifndef GPLT_X11_MODE
	public static int calculate_color_from_formulae(double gray, rgb_color color)
	{
		value v = new value();
		double a;
		double b;
		double c;

		///#define NO_CARET (-1)

		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: () Gcomplex(&sm_palette.Afunc.dummy_values[0], gray, 0.0);
		GlobalMembersEval.Gcomplex(new value(GlobalMembersColor.sm_palette.Afunc.dummy_values[0]), gray, 0.0);
		GlobalMembersEval.evaluate_at(GlobalMembersColor.sm_palette.Afunc.at, v);
		if (GlobalMembersEval.undefined)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Undefined value first color during function evaluation");
		a = GlobalMembersEval.real(v);
		a = ((a) < 0 ? 0 : ((a) > 1 ? 1 : (a)));

		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: () Gcomplex(&sm_palette.Bfunc.dummy_values[0], gray, 0.0);
		GlobalMembersEval.Gcomplex(new value(GlobalMembersColor.sm_palette.Bfunc.dummy_values[0]), gray, 0.0);
		GlobalMembersEval.evaluate_at(GlobalMembersColor.sm_palette.Bfunc.at, v);
		if (GlobalMembersEval.undefined)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Undefined value second color during function evaluation");
		b = GlobalMembersEval.real(v);
		b = ((b) < 0 ? 0 : ((b) > 1 ? 1 : (b)));

		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
		//ORIGINAL LINE: () Gcomplex(&sm_palette.Cfunc.dummy_values[0], gray, 0.0);
		GlobalMembersEval.Gcomplex(new value(GlobalMembersColor.sm_palette.Cfunc.dummy_values[0]), gray, 0.0);
		GlobalMembersEval.evaluate_at(GlobalMembersColor.sm_palette.Cfunc.at, v);
		if (GlobalMembersEval.undefined)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Undefined value third color during function evaluation");
		c = GlobalMembersEval.real(v);
		c = ((c) < 0 ? 0 : ((c) > 1 ? 1 : (c)));

		color.r = a;
		color.g = b;
		color.b = c;
		//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#undef NO_CARET
		return 0;
	}

	/* Store double value from [0,1] in 2 characters. Resolution is 6.1e-5.
	 * No '\n' are generated. */
	///#endif

	public static String dbl_to_str(double val, String dest)
	{
		int ival = (int)(((1 << 14) - 1) * val);

		dest = StringFunctions.changeCharacter(dest, 0, (ival >> 7) + 33);
		dest = StringFunctions.changeCharacter(dest, 1, (ival & 127) + 33);
		return dest;
	}

	/* Reverse of dbl_to_str(): map 2 characters to double in [0,1] */
	public static double str_to_dbl(String s)
	{
		int ival = (((int)(s.charAt(0) - 33) & 127) << 7) | (int)((s.charAt(1) - 33) & 127);
		double val = ((double) ival) / ((1 << 14) - 1);

		return val;
	}
	///#endif  // !GPLT_X11_MODE 


	/* Map gray in [0,1] to color components according to colorMode */
	public static void color_components_from_gray(double gray, rgb_color color)
	{
		if (gray < 0)
			gray = 0;
		else if (gray > 1.0)
			gray = 1.0;

		switch (GlobalMembersColor.sm_palette.colorMode)
		{
		case SMPAL_COLOR_MODE_GRAY:
			color.r = color.g = color.b = Math.pow(gray, 1.0 / GlobalMembersColor.sm_palette.gamma);
			return; // all done, no color space transformation needed
		case SMPAL_COLOR_MODE_RGB:
			color.r = GlobalMembersGetcolor.GetColorValueFromFormula(GlobalMembersColor.sm_palette.formulaR, gray);
			color.g = GlobalMembersGetcolor.GetColorValueFromFormula(GlobalMembersColor.sm_palette.formulaG, gray);
			color.b = GlobalMembersGetcolor.GetColorValueFromFormula(GlobalMembersColor.sm_palette.formulaB, gray);
			break;
		case SMPAL_COLOR_MODE_GRADIENT:
			GlobalMembersGetcolor.interpolate_color_from_gray(gray, color);
			break;
			///#ifndef GPLT_X11_MODE
		case SMPAL_COLOR_MODE_FUNCTIONS:
			GlobalMembersGetcolor.calculate_color_from_formulae(gray, color);
			break;
			///#endif // !GPLT_X11_MODE
		default:
			//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __LINE__ macro:
			//C++ TO JAVA CONVERTER TODO TASK: There is no direct equivalent in Java to the C++ __FILE__ macro:
			fprintf(stderr, "%s:%d ooops: Unknown colorMode '%c'.\n", __FILE__, __LINE__, (byte)(GlobalMembersColor.sm_palette.colorMode));
		}
	}

	/* Save rgb_color to 6 characters which are no '\n'. */
	public static String color_to_str(rgb_color col, String buf)
	{
		GlobalMembersGetcolor.dbl_to_str(col.r, buf + 0);
		GlobalMembersGetcolor.dbl_to_str(col.g, buf + 2);
		GlobalMembersGetcolor.dbl_to_str(col.b, buf + 4);
		buf = buf.substring(0, 6);
		return buf;
	}

	/* Restore rgb_color from 6 characters  */
	public static void str_to_color(String buf, rgb_color col)
	{
		col.r = GlobalMembersGetcolor.str_to_dbl(buf + 0);
		col.g = GlobalMembersGetcolor.str_to_dbl(buf + 2);
		col.b = GlobalMembersGetcolor.str_to_dbl(buf + 4);
	}

	/*  This one takes the gradient defined in sm_palette.gradient and
	 *  returns an interpolated color for the given gray value.  It
	 *  does not matter wether RGB or HSV or whatever values are stored
	 *  in sm_palette.gradient[i].col, they will simply be interpolated.
	 *  Return 0 on sucess, 1 if gray outside the range covered by the
	 *  gradient.  No gamma correction is done.  The user can implement
	 *  gamma correction specifying more points.
	 *  sm_palette.gradient[] should be sorted acording to .pos.
	 *  Returns 1 on failure and fills color with "nearest" color.
	 */
	public static int interpolate_color_from_gray(double gray, rgb_color color)
	{
		int idx;
		int maxidx;
		rgb_color col1;
		rgb_color col2;

		if (gray < 0)
		{
			color.r = GlobalMembersColor.sm_palette.gradient[0].col.r;
			color.g = GlobalMembersColor.sm_palette.gradient[0].col.g;
			color.b = GlobalMembersColor.sm_palette.gradient[0].col.b;
			return 1;
		}

		maxidx = GlobalMembersColor.sm_palette.gradient_num;
		if (gray > 1)
		{
			color.r = GlobalMembersColor.sm_palette.gradient[maxidx - 1].col.r;
			color.g = GlobalMembersColor.sm_palette.gradient[maxidx - 1].col.g;
			color.b = GlobalMembersColor.sm_palette.gradient[maxidx - 1].col.b;
			return 1;
		}

		/* find index by bisecting */
		idx = 0;
		if (maxidx > 1)
		{
			int topidx = maxidx - 1;
			/* treat idx as though it is bottom index */
			while (idx != topidx)
			{
				int tmpidx = (idx + topidx) / 2;
				if (GlobalMembersColor.sm_palette.gradient[tmpidx].pos < gray)
					idx = tmpidx + 1; // round up
				else
					topidx = tmpidx;
			}
		}

		col2 =  GlobalMembersColor.sm_palette.gradient[idx].col;
		if (gray == GlobalMembersColor.sm_palette.gradient[idx].pos)
		{
			/* exact hit */
			color.r = col2.r;
			color.g = col2.g;
			color.b = col2.b;
		}
		else
		{
			/* linear interpolation of two colors */
			double dx = GlobalMembersColor.sm_palette.gradient[idx].pos - GlobalMembersColor.sm_palette.gradient[idx - 1].pos;
			double f = (gray - GlobalMembersColor.sm_palette.gradient[idx - 1].pos) / dx;

			col1 =  GlobalMembersColor.sm_palette.gradient[idx - 1].col;
			color.r = (col1.r + f * (col2.r - col1.r));
			color.g = (col1.g + f * (col2.g - col1.g));
			color.b = (col1.b + f * (col2.b - col1.b));
		}
		return 0;
	}

	/*
	 *  Used by approximate_palette
	 */
	public static double get_max_dev(rgb_color[] colors, int j, double limit)
	{
		double max_dev = 0.0;
		double rdev;
		double gdev;
		double bdev;
		double r = colors[0].r;
		double g = colors[0].g;
		double b = colors[0].b;
		int i;
		double sr = (colors[j].r - r) / j;
		double sg = (colors[j].g - g) / j;
		double sb = (colors[j].b - b) / j;

		for (i = 1; i < j; ++i)
		{
			double dx = i;

			rdev = Math.abs(sr * dx + r - colors[i].r);
			gdev = Math.abs(sg * dx + g - colors[i].g);
			bdev = Math.abs(sb * dx + b - colors[i].b);
			if (rdev > max_dev)
				max_dev = rdev;
			if (gdev > max_dev)
				max_dev = gdev;
			if (bdev > max_dev)
				max_dev = bdev;
			if (max_dev >= limit)
				break;
		}
		return max_dev;
	}

	/*
	 *  Used by approximate_palette:  true if one color component in mid
	 *  is higher (or lower) than both left and right, flase other wise
	 */
	public static int is_extremum(rgb_color left, rgb_color mid, rgb_color right)
	{
		/* mid is maximum */
		if (left.r < mid.r && mid.r > right.r)
			return 1;
		if (left.g < mid.g && mid.g > right.g)
			return 1;
		if (left.b < mid.b && mid.b > right.b)
			return 1;

		/* mid is minimum */
		if (left.r > mid.r && mid.r < right.r)
			return 1;
		if (left.g > mid.g && mid.g < right.g)
			return 1;
		if (left.b > mid.b && mid.b < right.b)
			return 1;

		return 0;
	}
	/* /cF0  */	/* /cF1  */	/* /cF2  */	/* /cF3  */	/* /cF4  */	/* /cF5  */	/* /cF6  */	/* /cF7  */	/* /cF8  */	/* /cF9  */	/* /cF10 */	/* /cF11 */	/* /cF12 */	/* /cF13 */	/* /cF14 */	/* /cF15 */	/* /cF16 */	/* /cF17 */	/* /cF18 */	/* /cF19 */	/* /cF20 */	/* /cF21 */	/* /cF22 */	/* /cF23 */	/* /cF24 */	/* /cF25 */	/* /cF26 */	/* /cF27 */	/* /cF28 */	/* /cF29 */	/* /cF30 */	/* /cF31 */	/* /cF32 */	/* /cF33 */	/* /cF34 */	/* /cF35 */	/* /cF36 */

	/*
	 *  Color Conversion Algorithms
	 *  taken from http://www.cs.rit.edu/~ncs/color/t_convert.html
	 *  each color model should provide a conversion to RGB.
	 *  RGB values are clipped to [0,1] as some colors in some
	 *  models have no RGB value.
	 */
	public static void CMY_2_RGB(rgb_color col)
	{
		double c;
		double m;
		double y;
		c = col.r;
		m = col.g;
		y = col.b;
		col.r = ((1.0 - c) < 0 ? 0 : ((1.0 - c) > 1 ? 1 : (1.0 - c)));
		col.g = ((1.0 - m) < 0 ? 0 : ((1.0 - m) > 1 ? 1 : (1.0 - m)));
		col.b = ((1.0 - y) < 0 ? 0 : ((1.0 - y) > 1 ? 1 : (1.0 - y)));
	}
	public static void CIEXYZ_2_RGB(rgb_color col)
	{
		double x;
		double y;
		double z;

		x = col.r;
		y = col.g;
		z = col.b;
		col.r = ((1.9100 * x - 0.5338 * y - 0.2891 * z) < 0 ? 0 : ((1.9100 * x - 0.5338 * y - 0.2891 * z) > 1 ? 1 : (1.9100 * x - 0.5338 * y - 0.2891 * z)));
		col.g = ((-0.9844 * x + 1.9990 * y - 0.0279 * z) < 0 ? 0 : ((-0.9844 * x + 1.9990 * y - 0.0279 * z) > 1 ? 1 : (-0.9844 * x + 1.9990 * y - 0.0279 * z)));
		col.b = ((0.0585 * x - 0.1187 * y - 0.9017 * z) < 0 ? 0 : ((0.0585 * x - 0.1187 * y - 0.9017 * z) > 1 ? 1 : (0.0585 * x - 0.1187 * y - 0.9017 * z)));
	}
	public static void YIQ_2_RGB(rgb_color col)
	{
		double y;
		double i;
		double q;

		y = col.r;
		i = col.g;
		q = col.b;
		col.r = ((y - 0.956 * i + 0.621 * q) < 0 ? 0 : ((y - 0.956 * i + 0.621 * q) > 1 ? 1 : (y - 0.956 * i + 0.621 * q)));
		col.g = ((y - 0.272 * i - 0.647 * q) < 0 ? 0 : ((y - 0.272 * i - 0.647 * q) > 1 ? 1 : (y - 0.272 * i - 0.647 * q)));
		col.b = ((y - 1.105 * i - 1.702 * q) < 0 ? 0 : ((y - 1.105 * i - 1.702 * q) > 1 ? 1 : (y - 1.105 * i - 1.702 * q)));
	}
	public static void HSV_2_RGB(rgb_color col)
	{
		double h;
		double s;
		double v;
		double f;
		double p;
		double q;
		double t;
		int i;

		h = col.r;
		s = col.g;
		v = col.b;
		if (s == 0) // achromatic (gray)
		{
			col.r = col.g = col.b = v;
			return;
		}

		h *= 6.; // h range in gnuplot is [0,1] and not the usual [0,360]
		i = (int) Math.floor(h);
		f = h - i;
		p = v * (1.0 - s);
		q = v * (1.0 - s * f);
		t = v * (1.0 - s * (1.0 - f));
		switch (i % 6)
		{
		case 0:
			col.r = v;
			col.g = t;
			col.b = p;
			break;
		case 1:
			col.r = q;
			col.g = v;
			col.b = p;
			break;
		case 2:
			col.r = p;
			col.g = v;
			col.b = t;
			break;
		case 3:
			col.r = p;
			col.g = q;
			col.b = v;
			break;
		case 4:
			col.r = t;
			col.g = p;
			col.b = v;
			break;
		default:
			col.r = v;
			col.g = p;
			col.b = q;
			break;
		}
	}


	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CONSTRAIN(x) ((x) < 0 ? 0 : ((x) > 1 ? 1 : (x)))


	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GROW_GRADIENT(n) do { if(cnt == gradient_size) { gradient_size += (n); gradient = (gradient_struct*) realloc(gradient, gradient_size * sizeof(gradient_struct)); } } while(0)

	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#undef GROW_GRADIENT


	/* Implementation of pm3dGetColorValue() in the postscript way.
	   Notice that the description, i.e. the part after %, is important
	   since it is used in `show pm3d' for displaying the analytical formulae.
	   The postscript formulae will be expanded into lines like:
		"/cF0 {pop 0} bind def\t% 0",
		"/cF4 {dup mul} bind def\t% x^2",
	 */

	public static String[] ps_math_color_formulae = {"pop 0", "0", "pop 0.5", "0.5", "pop 1", "1", " ", "x", "dup mul", "x^2", "dup dup mul mul", "x^3", "dup mul dup mul", "x^4", "sqrt", "sqrt(x)", "sqrt sqrt", "sqrt(sqrt(x))", "90 mul sin", "sin(90x)", "90 mul cos", "cos(90x)", "0.5 sub abs", "|x-0.5|", "2 mul 1 sub dup mul", "(2x-1)^2", "180 mul sin", "sin(180x)", "180 mul cos abs", "|cos(180x)|", "360 mul sin", "sin(360x)", "360 mul cos", "cos(360x)", "360 mul sin abs", "|sin(360x)|", "360 mul cos abs", "|cos(360x)|", "720 mul sin abs", "|sin(720x)|", "720 mul cos abs", "|cos(720x)|", "3 mul", "3x", "3 mul 1 sub", "3x-1", "3 mul 2 sub", "3x-2", "3 mul 1 sub abs", "|3x-1|", "3 mul 2 sub abs", "|3x-2|", "1.5 mul .5 sub", "(3x-1)/2", "1.5 mul 1 sub", "(3x-2)/2", "1.5 mul .5 sub abs", "|(3x-1)/2|", "1.5 mul 1 sub abs", "|(3x-2)/2|", "0.32 div 0.78125 sub", "x/0.32-0.78125", "2 mul 0.84 sub", "2*x-0.84", "dup 0.42 le {4 mul} {dup 0.92 le {-2 mul 1.84 add} {0.08 div 11.5 sub} ifelse} ifelse", "4x;1;-2x+1.84;x/0.08-11.5", "2 mul 0.5 sub abs", "|2*x - 0.5|", "2 mul", "2*x", "2 mul 0.5 sub", "2*x - 0.5", "2 mul 1 sub", "2*x - 1", "", ""};
}