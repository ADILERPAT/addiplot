package com.addiPlot.gnuplot;

import com.addiPlot.gnuplot.tangible.StringFunctions;

public class GlobalMembersPlot3d
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
	//	return GlobalMembersAlloc.RCSid("$Id: plot3d.c,v 1.171.2.5 2010/02/27 21:52:38 sfeam Exp $");
	//}
	///#endif

	/* Variables of plot3d.c needed by other modules: */

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern struct surface_points *first_3dplot;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int plot3d_num;

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern en_data_mapping mapping3d;

	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int dgrid3d_row_fineness;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int dgrid3d_col_fineness;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int dgrid3d_norm_value;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int dgrid3d_mode;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double dgrid3d_x_scale;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern double dgrid3d_y_scale;
	//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern boolean dgrid3d;

	/* support for dynamic size of input line */


	/* prototypes from plot3d.c */

	public static void plot3drequest()
	/*
	 * in the parametric case we would say splot [u= -Pi:Pi] [v= 0:2*Pi] [-1:1]
	 * [-1:1] [-1:1] sin(v)*cos(u),sin(v)*cos(u),sin(u) in the non-parametric
	 * case we would say only splot [x= -2:2] [y= -5:5] sin(x)*cos(y)
	 *
	 */
	{
		int dummy_token0 = -1;
		int dummy_token1 = -1;
		AXIS_INDEX u_axis;
		AXIS_INDEX v_axis;

		GlobalMembersGadgets.is_3d_plot = true;

		/* change view to become map if requested by 'set view map' */
		if (GlobalMembersGraph3d.splot_map != 0)
			GlobalMembersCommand.splot_map_activate();

		if (GlobalMembersGadgets.parametric && StringFunctions.strcmp(GlobalMembersParse.set_dummy_var[0], "t") == 0)
		{
			GlobalMembersParse.set_dummy_var[0] = "u";
			GlobalMembersParse.set_dummy_var[1] = "v";
		}

		/* put stuff into arrays to simplify access */
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue() && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue() && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue() && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.U_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue() && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (true)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.V_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue() && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (false && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (true)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()];
			this_Renamed.autoscale = this_Renamed.set_autoscale;
			if ((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue() && this_Renamed.set_max < this_Renamed.set_min)
			{
				this_Renamed.min = this_Renamed.set_max;
				this_Renamed.max = this_Renamed.set_min;
			}
			else
			{
				this_Renamed.min = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MIN.getValue()) != 0)) ? DefineConstants.VERYLARGE : this_Renamed.set_min;
				this_Renamed.max = (true && ((this_Renamed.set_autoscale.getValue() & e_autoscale.AUTOSCALE_MAX.getValue()) != 0)) ? - DefineConstants.VERYLARGE : this_Renamed.set_max;
			}
			if (false)
			{
				this_Renamed.log = false;
				this_Renamed.base = 1;
				this_Renamed.log_base = 0;
			}
			else
			{
				this_Renamed.log_base = this_Renamed.log ? Math.log(this_Renamed.base) : 0;
			}
			this_Renamed.data_min = DefineConstants.VERYLARGE;
			this_Renamed.data_max = -DefineConstants.VERYLARGE;
		} while (false);

		if (GlobalMembersTerm.term == null) // unknown
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "use 'set term' to set terminal type first");

		u_axis = (GlobalMembersGadgets.parametric ? AXIS_INDEX.U_AXIS : AXIS_INDEX.FIRST_X_AXIS);
		v_axis = (GlobalMembersGadgets.parametric ? AXIS_INDEX.V_AXIS : AXIS_INDEX.FIRST_Y_AXIS);

		do
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
			{
				GlobalMembersCommand.c_token++;
				if (GlobalMembersUtil.isletter(GlobalMembersCommand.c_token) != 0)
				{
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token + 1, "=") != 0)
					{
						dummy_token0 = GlobalMembersCommand.c_token;
						GlobalMembersCommand.c_token += 2;
					}
				}
				GlobalMembersAxis.axis_array[u_axis.getValue()].autoscale = GlobalMembersAxis.load_range(u_axis, GlobalMembersAxis.axis_array[u_axis.getValue()].min, GlobalMembersAxis.axis_array[u_axis.getValue()].max, GlobalMembersAxis.axis_array[u_axis.getValue()].autoscale);
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
					GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
				GlobalMembersCommand.c_token++;
			}
		} while (false);
		if ((GlobalMembersGraph3d.splot_map != 0) && !GlobalMembersGadgets.parametric) // v_axis==FIRST_Y_AXIS
			GlobalMembersCommand.splot_map_deactivate();
		do
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
			{
				GlobalMembersCommand.c_token++;
				if (GlobalMembersUtil.isletter(GlobalMembersCommand.c_token) != 0)
				{
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token + 1, "=") != 0)
					{
						dummy_token1 = GlobalMembersCommand.c_token;
						GlobalMembersCommand.c_token += 2;
					}
				}
				GlobalMembersAxis.axis_array[v_axis.getValue()].autoscale = GlobalMembersAxis.load_range(v_axis, GlobalMembersAxis.axis_array[v_axis.getValue()].min, GlobalMembersAxis.axis_array[v_axis.getValue()].max, GlobalMembersAxis.axis_array[v_axis.getValue()].autoscale);
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
					GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
				GlobalMembersCommand.c_token++;
			}
		} while (false);
		if ((GlobalMembersGraph3d.splot_map != 0) && !GlobalMembersGadgets.parametric) // v_axis==FIRST_Y_AXIS
			GlobalMembersCommand.splot_map_activate();

		if (GlobalMembersGadgets.parametric)
		{
			do
			{
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
				{
					GlobalMembersCommand.c_token++;
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale = GlobalMembersAxis.load_range(AXIS_INDEX.FIRST_X_AXIS, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale);
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
						GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
					GlobalMembersCommand.c_token++;
				}
			} while (false);
			if (GlobalMembersGraph3d.splot_map != 0)
				GlobalMembersCommand.splot_map_deactivate();
			do
			{
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
				{
					GlobalMembersCommand.c_token++;
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale = GlobalMembersAxis.load_range(AXIS_INDEX.FIRST_Y_AXIS, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale);
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
						GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
					GlobalMembersCommand.c_token++;
				}
			} while (false);
			if (GlobalMembersGraph3d.splot_map != 0)
				GlobalMembersCommand.splot_map_activate();
		} // parametric
		do
		{
			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "[") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].autoscale = GlobalMembersAxis.load_range(AXIS_INDEX.FIRST_Z_AXIS, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max, GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].autoscale);
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "]") == 0)
					GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "']' expected");
				GlobalMembersCommand.c_token++;
			}
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()];
			if (((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue()) && (this_Renamed.max < this_Renamed.min))
			{
				double temp = this_Renamed.min;
				this_Renamed.min = this_Renamed.max;
				this_Renamed.max = temp;
				this_Renamed.range_is_reverted = true;
			}
			else
				this_Renamed.range_is_reverted = ((this_Renamed.range_flags & DefineConstants.RANGE_REVERSE) != 0);
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()];
			if (((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue()) && (this_Renamed.max < this_Renamed.min))
			{
				double temp = this_Renamed.min;
				this_Renamed.min = this_Renamed.max;
				this_Renamed.max = temp;
				this_Renamed.range_is_reverted = true;
			}
			else
				this_Renamed.range_is_reverted = ((this_Renamed.range_flags & DefineConstants.RANGE_REVERSE) != 0);
		} while (false);
		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()];
			if (((this_Renamed.autoscale.getValue() & e_autoscale.AUTOSCALE_BOTH.getValue()) == e_autoscale.AUTOSCALE_NONE.getValue()) && (this_Renamed.max < this_Renamed.min))
			{
				double temp = this_Renamed.min;
				this_Renamed.min = this_Renamed.max;
				this_Renamed.max = temp;
				this_Renamed.range_is_reverted = true;
			}
			else
				this_Renamed.range_is_reverted = ((this_Renamed.range_flags & DefineConstants.RANGE_REVERSE) != 0);
		} while (false);

		/* Clear out any tick labels read from data files in previous plot */
		for (u_axis = 0; u_axis < DefineConstants.AXIS_ARRAY_SIZE; u_axis++)
		{
			ticdef ticdef = GlobalMembersAxis.axis_array[u_axis.getValue()].ticdef;
			if (ticdef.def.user != null)
				ticdef.def.user = GlobalMembersSet.prune_dataticks(ticdef.def.user);
			if (ticdef.def.user == null && ticdef.type == en_ticseries_type.TIC_USER)
				ticdef.type = en_ticseries_type.TIC_COMPUTED;
		}

		/* use the default dummy variable unless changed */
		if (dummy_token0 >= 0)
			GlobalMembersUtil.copy_str(GlobalMembersParse.c_dummy_var[0], dummy_token0, DefineConstants.MAX_ID_LEN);
		else
			strcpy(GlobalMembersParse.c_dummy_var[0], GlobalMembersParse.set_dummy_var[0]);

		if (dummy_token1 >= 0)
			GlobalMembersUtil.copy_str(GlobalMembersParse.c_dummy_var[1], dummy_token1, DefineConstants.MAX_ID_LEN);
		else
			strcpy(GlobalMembersParse.c_dummy_var[1], GlobalMembersParse.set_dummy_var[1]);

		GlobalMembersPlot3d.eval_3dplots();
	}

	///#ifdef VOLATILE_REFRESH
	/* Helper function for refresh command.  Reexamine each data point and update the
	 * flags for INRANGE/OUTRANGE/UNDEFINED based on the current limits for that axis.
	 * Normally the axis limits are already known at this point. But if the user has
	 * forced "set autoscale" since the previous plot or refresh, we need to reset the
	 * axis limits and try to approximate the full auto-scaling behaviour.
	 */
	public static void refresh_3dbounds(surface_points first_plot, int nplots)
	{
		surface_points this_plot = first_plot;
		int iplot; // plot index

		for (iplot = 0; iplot < nplots; iplot++, this_plot = this_plot.next_sp)
		{
			int i; // point index
			axis x_axis = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()];
			axis y_axis = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()];
			iso_curve this_curve;

			/* IMAGE clipping is done elsewhere, so we don't need INRANGE/OUTRANGE
			 * checks.
			 */
			if (this_plot.plot_style == PLOT_STYLE.IMAGE || this_plot.plot_style == PLOT_STYLE.RGBIMAGE || this_plot.plot_style == PLOT_STYLE.RGBA_IMAGE)
			{
				if (x_axis.set_autoscale.getValue() != 0)
					GlobalMembersGraphics.plot_image_or_update_axes(this_plot, true);
				continue;
			}

			for (this_curve = this_plot.iso_crvs; this_curve; this_curve = this_curve.next)
			{

				for (i = 0; i < this_curve.p_count; i++)
				{
					coordinate point = this_curve.points[i];

					if (point.type == coord_type.UNDEFINED)
						continue;
					else
						point.type = coord_type.INRANGE;

					/* If the state has been set to autoscale since the last plot,
					 * mark everything INRANGE and re-evaluate the axis limits now.
					 * Otherwise test INRANGE/OUTRANGE against previous axis limits.
					 */
					if ((x_axis.set_autoscale.getValue() & (((e_autoscale.AUTOSCALE_MIN.getValue() | e_autoscale.AUTOSCALE_MAX.getValue()) != 0) ? 1 : 0)) != 0)
					{
						if (point.x > x_axis.max)
							x_axis.max = point.x;
						if (point.x < x_axis.min)
							x_axis.min = point.x;
					}
					else if (!(((x_axis.min)<(x_axis.max)) ? (((point.x) >= (x_axis.min)) && ((point.x) <= (x_axis.max))) : (((point.x) >= (x_axis.max)) && ((point.x) <= (x_axis.min)))))
					{
						point.type = coord_type.OUTRANGE;
						continue;
					}

					if ((y_axis.set_autoscale.getValue() & (((e_autoscale.AUTOSCALE_MIN.getValue() | e_autoscale.AUTOSCALE_MAX.getValue()) != 0) ? 1 : 0)) != 0)
					{
						if (point.y > y_axis.max)
							y_axis.max = point.y;
						if (point.y < y_axis.min)
							y_axis.min = point.y;
					}
					else if (!(((y_axis.min)<(y_axis.max)) ? (((point.y) >= (y_axis.min)) && ((point.y) <= (y_axis.max))) : (((point.y) >= (y_axis.max)) && ((point.y) <= (y_axis.min)))))
					{
						point.type = coord_type.OUTRANGE;
						continue;
					}
				} // End of this curve
			} // End of this plot

		}
	}

	/*
	 * sp_free() releases any memory which was previously malloc()'d to hold
	 *   surface points.
	 */
	/* HBB 20000506: don't risk stack havoc by recursion, use iterative list
	 * cleanup unstead */
	public static void sp_free(surface_points sp)
	{
		while (sp != null)
		{
			surface_points next = sp.next_sp;
			if (sp.title != null)
				//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(sp.title);

			while (sp.contours != null)
			{
				gnuplot_contours next_cntrs = sp.contours.next;

				//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(sp.contours.coords);
				//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(sp.contours);
				sp.contours = next_cntrs;
			}

			while (sp.iso_crvs != null)
			{
				iso_curve next_icrvs = sp.iso_crvs.next;

				GlobalMembersMisc.iso_free(sp.iso_crvs);
				sp.iso_crvs = next_icrvs;
			}

			if (sp.labels != null)
			{
				GlobalMembersGadgets.free_labels(sp.labels);
				sp.labels = (GlobalMembersMouse.struct text_label *)DefineConstants.NULL;
			}

			//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(sp);
			sp = next;
		}
	}


	///#define MAX_ID_LEN 50
	///#define MAX_LINE_LEN 1024
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEG2RAD (M_PI / 180.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_COLOR ylow
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_R yhigh
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_G xlow
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_B xhigh
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_A ylow
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CRD_PTSIZE xlow
	///#if 0
	///#endif
	///#if defined(WIN16) || (defined(MSDOS) && defined(__TURBOC__))
	///#endif

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
	///#ifdef HAVE_CONFIG_H
	///#endif
	///#define TC_DEFAULT 0
	///#define TC_LT 1
	///#define TC_LINESTYLE 2
	///#define TC_RGB 3
	///#define TC_CB 4
	///#define TC_FRAC 5
	///#define TC_Z 6
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DEFAULT_COLORSPEC {TC_DEFAULT, 0, 0.0}
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define BLACK_COLORSPEC {TC_LT, LT_BLACK, 0.0}
	///#ifdef EXTENDED_COLOR_SPECS
	///#endif
	///#ifdef EXTENDED_COLOR_SPECS
	///#endif
	///#define STACK_DEPTH 100
	///#define MAX_AT_LEN 150
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define is_jump(operator) ((operator) >=(int)JUMP && (operator) <(int)SF_START)
	///#ifdef __ZTC__
	///#else
	///#endif
	///#ifdef APOLLO
	///#endif
	///#define SMPAL_NEGATIVE 'n'
	///#define SMPAL_POSITIVE 'p'
	///#ifdef EXTENDED_COLOR_SPECS
	///#endif
	///#ifdef EXTENDED_COLOR_SPECS
	///#else
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
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_x3d(x) ((x-X_AXIS.min)*xscale3d + xcenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_y3d(y) ((y-Y_AXIS.min)*yscale3d + ycenter3d -1.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define map_z3d(z) ((z-floor_z)*zscale3d + zcenter3d -1.0)
	///#define ISO_SAMPLES 10
	///#ifdef USE_MOUSE
	///#endif
	///#define DEFAULT_CONTOUR_LEVELS 5
	///#define DEFAULT_NUM_APPROX_PTS 5
	///#define DEFAULT_CONTOUR_ORDER 4
	///#define MAX_BSPLINE_ORDER 10
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define contour_levels_list ((double *)dyn_contour_levels_list.v)
	///#if defined(sun386) || defined(AMIGA_SC_6_1)
	///#endif
	///#ifdef EAM_OBJECTS
	///#else
	///#define place_objects(listhead,layer,dimensions,clip_area) // void() 
	///#endif
	///#define DF_EOF (-1)
	///#define DF_UNDEFINED (-2)
	///#define DF_FIRST_BLANK (-3)
	///#define DF_SECOND_BLANK (-4)
	///#define DF_MISSING (-5)
	///#define DF_FOUND_KEY_TITLE (-6)
	///#define DF_KEY_TITLE_MISSING (-7)
	///#define DF_STRINGDATA (-8)
	///#ifndef MAXINT // should there be one already defined ?
	///#ifdef INT_MAX // in limits.h ?
	///#define MAXINT INT_MAX
	///#else
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define MAXINT ((~0)>>1)
	///#endif
	///#endif
	///#define MAXDATACOLS 7
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DF_DEFAULT_TYPE DF_FLOAT
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SIGNED_TEST(val) ((val)==sizeof(long) ? DF_LONG : ((val)==sizeof(long long) ? DF_LONGLONG : ((val)==sizeof(int) ? DF_INT : ((val)==sizeof(short) ? DF_SHORT : ((val)==sizeof(char) ? DF_CHAR : DF_BAD_TYPE)))))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define UNSIGNED_TEST(val) ((val)==sizeof(unsigned long) ? DF_ULONG : ((val)==sizeof(unsigned long long) ? DF_ULONGLONG : ((val)==sizeof(unsigned int) ? DF_UINT : ((val)==sizeof(unsigned short) ? DF_USHORT : ((val)==sizeof(unsigned char) ? DF_UCHAR : DF_BAD_TYPE)))))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FLOAT_TEST(val) ((val)==sizeof(float) ? DF_FLOAT : ((val)==sizeof(double) ? DF_DOUBLE : DF_BAD_TYPE))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define df_set_skip_after(col,bytes) df_set_skip_before(col+1,bytes)
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
	///#define PROGRAM "G N U P L O T"
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SAVE_NUM_OR_TIME(fp, x, axis) do{ if (axis_array[axis].is_timedata) { char s[80]; putc('"', fp); gstrftime(s,80,axis_array[axis].timefmt,(double)(x)); fputs(conv_text(s), fp); putc('"', fp); } else { fprintf(fp,"%#g",x); } } while(0)
	///#ifdef NORWEGIAN
	///#define AMON01 "Jan"
	///#define AMON02 "Feb"
	///#define AMON03 "Mar"
	///#define AMON04 "Apr"
	///#define AMON05 "Mai"
	///#define AMON06 "Jun"
	///#define AMON07 "Jul"
	///#define AMON08 "Aug"
	///#define AMON09 "Sep"
	///#define AMON10 "Okt"
	///#define AMON11 "Nov"
	///#define AMON12 "Des"
	///#define FMON01 "January"
	///#define FMON02 "February"
	///#define FMON03 "March"
	///#define FMON04 "April"
	///#define FMON05 "May"
	///#define FMON06 "June"
	///#define FMON07 "July"
	///#define FMON08 "August"
	///#define FMON09 "September"
	///#define FMON10 "October"
	///#define FMON11 "November"
	///#define FMON12 "December"
	///#define ADAY0 "Sxn"
	///#define ADAY1 "Man"
	///#define ADAY2 "Tir"
	///#define ADAY3 "Ons"
	///#define ADAY4 "Tor"
	///#define ADAY5 "Fre"
	///#define ADAY6 "Lxr"
	///#define FDAY0 "Sunday"
	///#define FDAY1 "Monday"
	///#define FDAY2 "Tuesday"
	///#define FDAY3 "Wednesday"
	///#define FDAY4 "Thursday"
	///#define FDAY5 "Friday"
	///#define FDAY6 "Saturday"
	///#elif defined(HUNGARIAN)
	///#define AMON01 "jan"
	///#define AMON02 "febr"
	///#define AMON03 "m&aacute;rc"
	///#define AMON04 "&aacute;pr"
	///#define AMON05 "m&aacute;j"
	///#define AMON06 "j&uacute;n"
	///#define AMON07 "j&uacute;l"
	///#define AMON08 "aug"
	///#define AMON09 "szept"
	///#define AMON10 "okt"
	///#define AMON11 "nov"
	///#define AMON12 "dec"
	///#define FMON01 "janu&aacute;r"
	///#define FMON02 "febru&aacute;r"
	///#define FMON03 "m&aacute;rcius"
	///#define FMON04 "&aacute;prilis"
	///#define FMON05 "m&aacute;jus"
	///#define FMON06 "j&uacute;nius"
	///#define FMON07 "j&uacute;lius"
	///#define FMON08 "augusztus"
	///#define FMON09 "szeptember"
	///#define FMON10 "okt&oacute;ber"
	///#define FMON11 "november"
	///#define FMON12 "december"
	///#define ADAY0 "vas"
	///#define ADAY1 "h&eacute;t"
	///#define ADAY2 "kedd"
	///#define ADAY3 "sze"
	///#define ADAY4 "cs&uuml;t"
	///#define ADAY5 "p&eacute;n"
	///#define ADAY6 "szo"
	///#define FDAY0 "vas&aacute;rnap"
	///#define FDAY1 "h&eacute;tf&otilde;"
	///#define FDAY2 "kedd"
	///#define FDAY3 "szerda"
	///#define FDAY4 "cs&uacute;t&ouml;rt&ouml;k"
	///#define FDAY5 "p&eacute;ntek"
	///#define FDAY6 "szombat"
	///#else
	///#define AMON01 "Jan"
	///#define AMON02 "Feb"
	///#define AMON03 "Mar"
	///#define AMON04 "Apr"
	///#define AMON05 "May"
	///#define AMON06 "Jun"
	///#define AMON07 "Jul"
	///#define AMON08 "Aug"
	///#define AMON09 "Sep"
	///#define AMON10 "Oct"
	///#define AMON11 "Nov"
	///#define AMON12 "Dec"
	///#define FMON01 "January"
	///#define FMON02 "February"
	///#define FMON03 "March"
	///#define FMON04 "April"
	///#define FMON05 "May"
	///#define FMON06 "June"
	///#define FMON07 "July"
	///#define FMON08 "August"
	///#define FMON09 "September"
	///#define FMON10 "October"
	///#define FMON11 "November"
	///#define FMON12 "December"
	///#define ADAY0 "Sun"
	///#define ADAY1 "Mon"
	///#define ADAY2 "Tue"
	///#define ADAY3 "Wed"
	///#define ADAY4 "Thu"
	///#define ADAY5 "Fri"
	///#define ADAY6 "Sat"
	///#define FDAY0 "Sunday"
	///#define FDAY1 "Monday"
	///#define FDAY2 "Tuesday"
	///#define FDAY3 "Wednesday"
	///#define FDAY4 "Thursday"
	///#define FDAY5 "Friday"
	///#define FDAY6 "Saturday"
	///#endif // language 
	///#ifdef ACTION_NULL
	///#endif
	///#ifdef ACTION_INIT
	///#endif
	///#ifdef ACTION_SHOW
	///#endif
	///#ifdef ACTION_SET
	///#endif
	///#ifdef ACTION_GET
	///#endif
	///#ifndef ACTION_SAVE
	///#endif
	///#ifdef ACTION_CLEAR
	///#endif
	///#define ACTION_NULL 0
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_INIT (1<<0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_SHOW (1<<1)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_SET (1<<2)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_GET (1<<3)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_SAVE (1<<4)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define ACTION_CLEAR (1<<5)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define init_loadpath() loadpath_handler(ACTION_INIT,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define set_var_loadpath(path) loadpath_handler(ACTION_SET,(path))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define get_loadpath() loadpath_handler(ACTION_GET,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define save_loadpath() loadpath_handler(ACTION_SAVE,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define clear_loadpath() loadpath_handler(ACTION_CLEAR,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define init_fontpath() fontpath_handler(ACTION_INIT,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define set_var_fontpath(path) fontpath_handler(ACTION_SET,(path))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define get_fontpath() fontpath_handler(ACTION_GET,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define save_fontpath() fontpath_handler(ACTION_SAVE,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define clear_fontpath() fontpath_handler(ACTION_CLEAR,NULL)
	///#define INITIAL_LOCALE ("C")
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define init_locale() locale_handler(ACTION_INIT,NULL)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define set_var_locale(path) locale_handler(ACTION_SET,(path))
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define get_time_locale() locale_handler(ACTION_GET,NULL)
	///#ifdef HAVE_LOCALE_H
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define set_numeric_locale() do {if (numeric_locale && strcmp(numeric_locale,"C")) setlocale(LC_NUMERIC,numeric_locale);} while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define reset_numeric_locale() do {if (numeric_locale && strcmp(numeric_locale,"C")) setlocale(LC_NUMERIC,"C");} while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define get_decimal_locale() (localeconv()->decimal_point)
	///#else
	///#define set_numeric_locale()
	///#define reset_numeric_locale()
	///#define get_decimal_locale() "."
	///#endif



	///#ifndef _Windows
	///#define H_FOUND 0
	///#define H_NOTFOUND 1
	///#define H_ERROR (-1)
	///#endif

	/* global variables exported by this module */

	public static en_data_mapping mapping3d = en_data_mapping.MAP3D_CARTESIAN;

	public static int dgrid3d_row_fineness = 10;
	public static int dgrid3d_col_fineness = 10;
	public static int dgrid3d_norm_value = 1;
	public static int dgrid3d_mode = en_dgrid3d_mode.DGRID3D_QNORM.getValue();
	public static double dgrid3d_x_scale = 1.0;
	public static double dgrid3d_y_scale = 1.0;
	public static boolean dgrid3d = false;

	/* HBB 20000501: code isolated from eval_3dplots(), where practically
	 * identical code occured twice, for direct and crossing isolines,
	 * respectively.  The latter only are done for in non-hidden3d
	 * mode. */

	/* static prototypes */

	public static void calculate_set_of_isolines(AXIS_INDEX value_axis, boolean cross, iso_curve[] this_iso, AXIS_INDEX iso_axis, double iso_min, double iso_step, int num_iso_to_use, AXIS_INDEX sam_axis, double sam_min, double sam_step, int num_sam_to_use, boolean need_palette)
	{
		int i;
		int j;
		coordinate[] points = (this_iso).points;
		int do_update_color = need_palette && (!GlobalMembersGadgets.parametric || (GlobalMembersGadgets.parametric && value_axis == AXIS_INDEX.FIRST_Z_AXIS));

		for (j = 0; j < num_iso_to_use; j++)
		{
			double iso = iso_min + j * iso_step;
			/* HBB 20000501: with the new code, it should
			 * be safe to rely on the actual 'v' axis not
			 * to be improperly logscaled... */
			() GlobalMembersEval.Gcomplex(plot_func.dummy_values[cross ? 0 : 1], (GlobalMembersAxis.axis_array[iso_axis.getValue()].log ? Math.exp((iso) * GlobalMembersAxis.axis_array[iso_axis.getValue()].log_base): (iso)), 0.0);

			for (i = 0; i < num_sam_to_use; i++)
			{
				double sam = sam_min + i * sam_step;
				value a = new value();
				double temp;

				() GlobalMembersEval.Gcomplex(plot_func.dummy_values[cross ? 1 : 0], (GlobalMembersAxis.axis_array[sam_axis.getValue()].log ? Math.exp((sam) * GlobalMembersAxis.axis_array[sam_axis.getValue()].log_base): (sam)), 0.0);

				if (cross)
				{
					points[i].x = iso;
					points[i].y = sam;
				}
				else
				{
					points[i].x = sam;
					points[i].y = iso;
				}

				GlobalMembersEval.evaluate_at(plot_func.at, a);

				if (GlobalMembersEval.undefined || (Math.abs(GlobalMembersEval.imag(a)) > GlobalMembersGadgets.zero))
				{
					points[i].type = coord_type.UNDEFINED;
					continue;
				}

				temp = GlobalMembersEval.real(a);
				points[i].type = coord_type.INRANGE;
				do
				{
					if (value_axis == DefineConstants.NO_AXIS)
						break;
					if (!(temp > -DefineConstants.VERYLARGE && temp < DefineConstants.VERYLARGE))
					{
						points[i].type = coord_type.UNDEFINED;
						()0;
						break;
					}
					if (GlobalMembersAxis.axis_array[value_axis.getValue()].log)
					{
						if (temp < 0.0)
						{
							points[i].type = coord_type.UNDEFINED;
							()0;
							break;
						}
						else if (temp == 0.0)
						{
							points[i].z = -DefineConstants.VERYLARGE;
							points[i].type = coord_type.OUTRANGE;
							()0;
							break;
						}
						else
						{
							points[i].z = (Math.log(temp) / GlobalMembersAxis.axis_array[value_axis.getValue()].log_base);
						}
					}
					else
						points[i].z = temp;
					if (false)
						break;
					if (points[i].type != coord_type.INRANGE)
						break;
					if (value_axis.getValue() < 0)
						break;
					if (temp < GlobalMembersAxis.axis_array[value_axis.getValue()].data_min)
						GlobalMembersAxis.axis_array[value_axis.getValue()].data_min = temp;
					if (temp < GlobalMembersAxis.axis_array[value_axis.getValue()].min)
					{
						if (GlobalMembersAxis.axis_array[value_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
							GlobalMembersAxis.axis_array[value_axis.getValue()].min = temp;
						else
						{
							points[i].type = coord_type.OUTRANGE;
							()0;
							break;
						}
					}
					if (temp > GlobalMembersAxis.axis_array[value_axis.getValue()].data_max)
						GlobalMembersAxis.axis_array[value_axis.getValue()].data_max = temp;
					if (temp > GlobalMembersAxis.axis_array[value_axis.getValue()].max)
					{
						if (GlobalMembersAxis.axis_array[value_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
							GlobalMembersAxis.axis_array[value_axis.getValue()].max = temp;
						else
						{
							points[i].type = coord_type.OUTRANGE;
							()0;
						}
					}
				} while (0);
				if (do_update_color != 0)
				{
					{
						coord_type c_type_tmp = points[i].type;
						do
						{
							if (AXIS_INDEX.COLOR_AXIS == DefineConstants.NO_AXIS)
								break;
							if (!(temp > -DefineConstants.VERYLARGE && temp < DefineConstants.VERYLARGE))
							{
								c_type_tmp = coord_type.UNDEFINED;
								()0;
								break;
							}
							if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log)
							{
								if (temp < 0.0)
								{
									c_type_tmp = coord_type.UNDEFINED;
									()0;
									break;
								}
								else if (temp == 0.0)
								{
									points[i].ylow = -DefineConstants.VERYLARGE;
									c_type_tmp = coord_type.OUTRANGE;
									()0;
									break;
								}
								else
								{
									points[i].ylow = (Math.log(temp) / GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log_base);
								}
							}
							else
								points[i].ylow = temp;
							if (false)
								break;
							if (c_type_tmp != coord_type.INRANGE)
								break;
							if (AXIS_INDEX.COLOR_AXIS.getValue() < 0)
								break;
							if (temp < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min)
								GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min = temp;
							if (temp < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min)
							{
								if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
									GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min = temp;
								else
								{
									c_type_tmp = coord_type.OUTRANGE;
									()0;
									break;
								}
							}
							if (temp > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max)
								GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max = temp;
							if (temp > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max)
							{
								if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
									GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max = temp;
								else
								{
									c_type_tmp = coord_type.OUTRANGE;
									()0;
								}
							}
						} while (0);
					};
				}
			}
			this_iso.p_count = num_sam_to_use;
			this_iso = (this_iso).next;
			points = (this_iso) ? (this_iso).points : DefineConstants.NULL;
		}
	}

	/* Get 3D data from file, and store into this_plot data
	 * structure. Takes care of 'set mapping' and 'set dgrid3d'.
	 *
	 * Notice: this_plot->token is end of datafile spec, before title etc
	 * will be moved past title etc after we return */
	public static int get_3ddata(surface_points this_plot)
	{
		int xdatum = 0;
		int ydatum = 0;
		int j;
		double[] v = new double[DefineConstants.MAXDATACOLS];
		int pt_in_iso_crv = 0;
		iso_curve this_iso;
		int retval = 0;

		if (mapping3d == en_data_mapping.MAP3D_CARTESIAN)
		{
			/* do this check only, if we have PM3D / PM3D-COLUMN not compiled in */
			if (GlobalMembersDatafile.df_no_use_specs == 2)
				GlobalMembersBf_test.int_error(this_plot.token, "Need 1 or 3 columns for cartesian data");
			/* HBB NEW 20060427: if there's only one, explicit using
			 * column, it's z data.  df_axis[] has to reflect that, so
			 * df_readline() will expect time/date input. */
			if (GlobalMembersDatafile.df_no_use_specs == 1)
				GlobalMembersDatafile.df_axis[0] = AXIS_INDEX.FIRST_Z_AXIS;
		}
		else
		{
			if (GlobalMembersDatafile.df_no_use_specs == 1)
				GlobalMembersBf_test.int_error(this_plot.token, "Need 2 or 3 columns for polar data");
		}

		this_plot.num_iso_read = 0;
		this_plot.has_grid_topology = true;
		this_plot.pm3d_color_from_column = false;

		/* we ought to keep old memory - most likely case
		 * is a replot, so it will probably exactly fit into
		 * memory already allocated ?
		 */
		if (this_plot.iso_crvs != DefineConstants.NULL)
		{
			iso_curve icrv;
			iso_curve icrvs = this_plot.iso_crvs;

			while (icrvs != null)
			{
				icrv = icrvs;
				icrvs = icrvs.next;
				GlobalMembersMisc.iso_free(icrv);
			}
			this_plot.iso_crvs = DefineConstants.NULL;
		}
		/* data file is already open */

		if (GlobalMembersDatafile.df_matrix)
			this_plot.has_grid_topology = true;

		{
			/*{{{  read surface from text file */
			iso_curve local_this_iso = GlobalMembersMisc.iso_alloc(GlobalMembersGadgets.samples_1);
			coordinate cp;
			coordinate cptail = DefineConstants.NULL; // Only for VECTOR plots
			double x;
			double y;
			double z;
			double xtail;
			double ytail;
			double ztail;
			double color = DefineConstants.VERYLARGE;
			int pm3d_color_from_column = false;
			//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
			///#define color_from_column(x) pm3d_color_from_column = x

			if (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)
				GlobalMembersDatafile.expect_string(4);

			if (this_plot.plot_style == PLOT_STYLE.VECTOR)
			{
				local_this_iso.next = GlobalMembersMisc.iso_alloc(GlobalMembersGadgets.samples_1);
				local_this_iso.next.p_count = 0;
			}

			/* If the user has set an explicit locale for numeric input, apply it */
			/* here so that it affects data fields read from the input file.      */
			() do {if (GlobalMembersUtil.numeric_locale != null && strcmp(GlobalMembersUtil.numeric_locale,"C")) setlocale(LC_NUMERIC,GlobalMembersUtil.numeric_locale);} while (0)();

			while ((retval = GlobalMembersDatafile.df_readline(v, DefineConstants.MAXDATACOLS)) != DefineConstants.DF_EOF)
			{
				j = retval;

				if (j == DefineConstants.DF_SECOND_BLANK)
					break; // two blank lines
				if (j == DefineConstants.DF_FIRST_BLANK)
				{

					/* Images are in a sense similar to isocurves.
					 * However, the routine for images is written to
					 * compute the two dimensions of coordinates by
					 * examining the data alone.  That way it can be used
					 * in the 2D plots, for which there is no isoline
					 * record.  So, toss out isoline information for
					 * images.
					 */
					if ((this_plot.plot_style == PLOT_STYLE.IMAGE) || (this_plot.plot_style == PLOT_STYLE.RGBIMAGE) || (this_plot.plot_style == PLOT_STYLE.RGBA_IMAGE))
						continue;

					if (this_plot.plot_style == PLOT_STYLE.VECTOR)
						continue;

					/* one blank line */
					if (pt_in_iso_crv == 0)
					{
						if (xdatum == 0)
							continue;
						pt_in_iso_crv = xdatum;
					}
					if (xdatum > 0)
					{
						local_this_iso.p_count = xdatum;
						local_this_iso.next = this_plot.iso_crvs;
						this_plot.iso_crvs = local_this_iso;
						this_plot.num_iso_read++;

						if (xdatum != pt_in_iso_crv)
							this_plot.has_grid_topology = false;

						local_this_iso = GlobalMembersMisc.iso_alloc(pt_in_iso_crv);
						xdatum = 0;
						ydatum++;
					}
					continue;
				}

				else if (j == DefineConstants.DF_FOUND_KEY_TITLE)
				{
					/* only the shared part of the 2D and 3D headers is used */
					GlobalMembersDatafile.df_set_key_title((GlobalMembersMouse.struct curve_points *)this_plot);
					continue;
				}
				else if (j == DefineConstants.DF_KEY_TITLE_MISSING)
				{
					fprintf(stderr, "get_data: key title not found in requested column\n");
					continue;
				}

				/* its a data point or undefined */
				if (xdatum >= local_this_iso.p_max)
				{
					/* overflow about to occur. Extend size of points[]
					 * array. Double the size, and add 1000 points, to
					 * avoid needlessly small steps. */
					GlobalMembersMisc.iso_extend(local_this_iso, xdatum + xdatum + 1000);
					if (this_plot.plot_style == PLOT_STYLE.VECTOR)
					{
						GlobalMembersMisc.iso_extend(local_this_iso.next, xdatum + xdatum + 1000);
						local_this_iso.next.p_count = 0;
					}
				}
				cp = local_this_iso.points + xdatum;

				if (this_plot.plot_style == PLOT_STYLE.VECTOR)
				{
					if (j < 6)
					{
						cp.type = coord_type.UNDEFINED;
						continue;
					}
					cptail = local_this_iso.next.points + xdatum;
				}

				if (j == DefineConstants.DF_UNDEFINED || j == DefineConstants.DF_MISSING)
				{
					cp.type = coord_type.UNDEFINED;
					//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto come_here_if_undefined;
				}
				cp.type = coord_type.INRANGE; // unless we find out different

				/* EAM Oct 2004 - Substantially rework this section */
				/* now that there are many more plot types.         */

				x = y = z = 0.0;
				xtail = ytail = ztail = 0.0;

				/* The x, y, z coordinates depend on the mapping type */
				switch (mapping3d)
				{

				case MAP3D_CARTESIAN:
					if (j == 1)
					{
						x = xdatum;
						y = ydatum;
						z = v[0];
						j = 3;
						break;
					}

					if (j == 2)
					{
						if (PLOT_STYLE.PM3DSURFACE != this_plot.plot_style)
							GlobalMembersBf_test.int_error(this_plot.token, "2 columns only possible with explicit pm3d style (line %d)", GlobalMembersDatafile.df_line_number);
						x = xdatum;
						y = ydatum;
						z = v[0];
						pm3d_color_from_column = true;
						color = v[1];
						j = 3;
						break;
					}

					/* Assume everybody agrees that x,y,z are the first three specs */
					if (j >= 3)
					{
						x = v[0];
						y = v[1];
						z = v[2];
						break;
					}

					break;

				case MAP3D_SPHERICAL:
					if (j < 2)
						GlobalMembersBf_test.int_error(this_plot.token, "Need 2 or 3 columns");
					if (j < 3)
					{
						v[2] = 1; // default radius
						j = 3;
					}

					/* Convert to radians. */
					v[0] *= GlobalMembersGadgets.ang2rad;
					v[1] *= GlobalMembersGadgets.ang2rad;

					x = v[2] * Math.cos(v[0]) * Math.cos(v[1]);
					y = v[2] * Math.sin(v[0]) * Math.cos(v[1]);
					z = v[2] * Math.sin(v[1]);

					break;

				case MAP3D_CYLINDRICAL:
					if (j < 2)
						GlobalMembersBf_test.int_error(this_plot.token, "Need 2 or 3 columns");
					if (j < 3)
					{
						v[2] = 1; // default radius
						j = 3;
					}

					/* Convert to radians. */
					v[0] *= GlobalMembersGadgets.ang2rad;

					x = v[2] * Math.cos(v[0]);
					y = v[2] * Math.sin(v[0]);
					z = v[1];

					break;

				default:
					GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Internal error: Unknown mapping type");
					return retval;
				}

				if (j < GlobalMembersDatafile.df_no_use_specs)
					GlobalMembersBf_test.int_error(this_plot.token, "Wrong number of columns in input data - line %d", GlobalMembersDatafile.df_line_number);

				/* After the first three columns it gets messy because */
				/* different plot styles assume different contents in the columns */
				if (j >= 4)
				{
					if ((this_plot.plot_style == PLOT_STYLE.POINTSTYLE || this_plot.plot_style == PLOT_STYLE.LINESPOINTS) && this_plot.lp_properties.p_size == DefineConstants.PTSZ_VARIABLE)
					{
						cp.xlow = v[3];
						color = z;
						pm3d_color_from_column = false;
					}

					else if (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)
					{
						/* 4th column holds label text rather than color */
						/* text = df_tokens[3]; */
						color = z;
						pm3d_color_from_column = false;
					}

					else
					{
						color = v[3];
						pm3d_color_from_column = true;
					}
				}

				if (j >= 5)
				{
					if ((this_plot.plot_style == PLOT_STYLE.POINTSTYLE || this_plot.plot_style == PLOT_STYLE.LINESPOINTS) && this_plot.lp_properties.p_size == DefineConstants.PTSZ_VARIABLE)
					{
						color = v[4];
						pm3d_color_from_column = true;
					}

					if (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)
					{
						/* take color from an explicitly given 5th column */
						color = v[4];
						pm3d_color_from_column = true;
					}

				}

				if (j >= 6)
				{
					if (this_plot.plot_style == PLOT_STYLE.VECTOR)
					{
						xtail = x + v[3];
						ytail = y + v[4];
						ztail = z + v[5];
						if (j >= 7)
						{
							color = v[6];
							pm3d_color_from_column = true;
						}
						else
						{
							color = z;
							pm3d_color_from_column = false;
						}
					}
				}
				//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
				///#undef color_from_column


				/* Adjust for logscales. Set min/max and point types. Store in cp.
				 * The macro cannot use continue, as it is wrapped in a loop.
				 * I regard this as correct goto use
				 */
				cp.type = coord_type.INRANGE;
				do
				{
					if (GlobalMembersAxis.x_axis == DefineConstants.NO_AXIS)
						break;
					if (!(x > -DefineConstants.VERYLARGE && x < DefineConstants.VERYLARGE))
					{
						cp.type = coord_type.UNDEFINED;
						//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto come_here_if_undefined;
						break;
					}
					if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
					{
						if (x < 0.0)
						{
							cp.type = coord_type.UNDEFINED;
							//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto come_here_if_undefined;
							break;
						}
						else if (x == 0.0)
						{
							cp.x = -DefineConstants.VERYLARGE;
							cp.type = coord_type.OUTRANGE;
							()0;
							break;
						}
						else
						{
							cp.x = (Math.log(x) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base);
						}
					}
					else
						cp.x = x;
					if (this_plot.noautoscale)
						break;
					if (cp.type != coord_type.INRANGE)
						break;
					if ((int)GlobalMembersAxis.x_axis < 0)
						break;
					if (x < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min)
						GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min = x;
					if (x < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
					{
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min = x;
						else
						{
							cp.type = coord_type.OUTRANGE;
							()0;
							break;
						}
					}
					if (x > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max)
						GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max = x;
					if (x > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
					{
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max = x;
						else
						{
							cp.type = coord_type.OUTRANGE;
							()0;
						}
					}
				} while (0);
				do
				{
					if (GlobalMembersAxis.y_axis == DefineConstants.NO_AXIS)
						break;
					if (!(y > -DefineConstants.VERYLARGE && y < DefineConstants.VERYLARGE))
					{
						cp.type = coord_type.UNDEFINED;
						//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto come_here_if_undefined;
						break;
					}
					if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log)
					{
						if (y < 0.0)
						{
							cp.type = coord_type.UNDEFINED;
							//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto come_here_if_undefined;
							break;
						}
						else if (y == 0.0)
						{
							cp.y = -DefineConstants.VERYLARGE;
							cp.type = coord_type.OUTRANGE;
							()0;
							break;
						}
						else
						{
							cp.y = (Math.log(y) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base);
						}
					}
					else
						cp.y = y;
					if (this_plot.noautoscale)
						break;
					if (cp.type != coord_type.INRANGE)
						break;
					if ((int)GlobalMembersAxis.y_axis < 0)
						break;
					if (y < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_min)
						GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_min = y;
					if (y < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)
					{
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min = y;
						else
						{
							cp.type = coord_type.OUTRANGE;
							()0;
							break;
						}
					}
					if (y > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_max)
						GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_max = y;
					if (y > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
					{
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max = y;
						else
						{
							cp.type = coord_type.OUTRANGE;
							()0;
						}
					}
				} while (0);
				if (this_plot.plot_style == PLOT_STYLE.VECTOR)
				{
					cptail.type = coord_type.INRANGE;
					do
					{
						if (GlobalMembersAxis.x_axis == DefineConstants.NO_AXIS)
							break;
						if (!(xtail > -DefineConstants.VERYLARGE && xtail < DefineConstants.VERYLARGE))
						{
							cp.type = coord_type.UNDEFINED;
							//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto come_here_if_undefined;
							break;
						}
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log)
						{
							if (xtail < 0.0)
							{
								cp.type = coord_type.UNDEFINED;
								//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto come_here_if_undefined;
								break;
							}
							else if (xtail == 0.0)
							{
								cptail.x = -DefineConstants.VERYLARGE;
								cp.type = coord_type.OUTRANGE;
								()0;
								break;
							}
							else
							{
								cptail.x = (Math.log(xtail) / GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].log_base);
							}
						}
						else
							cptail.x = xtail;
						if (this_plot.noautoscale)
							break;
						if (cp.type != coord_type.INRANGE)
							break;
						if ((int)GlobalMembersAxis.x_axis < 0)
							break;
						if (xtail < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_min = xtail;
						if (xtail < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min)
						{
							if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min = xtail;
							else
							{
								cp.type = coord_type.OUTRANGE;
								()0;
								break;
							}
						}
						if (xtail > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].data_max = xtail;
						if (xtail > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max)
						{
							if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max = xtail;
							else
							{
								cp.type = coord_type.OUTRANGE;
								()0;
							}
						}
					} while (0);
					do
					{
						if (GlobalMembersAxis.y_axis == DefineConstants.NO_AXIS)
							break;
						if (!(ytail > -DefineConstants.VERYLARGE && ytail < DefineConstants.VERYLARGE))
						{
							cp.type = coord_type.UNDEFINED;
							//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto come_here_if_undefined;
							break;
						}
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log)
						{
							if (ytail < 0.0)
							{
								cp.type = coord_type.UNDEFINED;
								//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto come_here_if_undefined;
								break;
							}
							else if (ytail == 0.0)
							{
								cptail.y = -DefineConstants.VERYLARGE;
								cp.type = coord_type.OUTRANGE;
								()0;
								break;
							}
							else
							{
								cptail.y = (Math.log(ytail) / GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].log_base);
							}
						}
						else
							cptail.y = ytail;
						if (this_plot.noautoscale)
							break;
						if (cp.type != coord_type.INRANGE)
							break;
						if ((int)GlobalMembersAxis.y_axis < 0)
							break;
						if (ytail < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_min)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_min = ytail;
						if (ytail < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min)
						{
							if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min = ytail;
							else
							{
								cp.type = coord_type.OUTRANGE;
								()0;
								break;
							}
						}
						if (ytail > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_max)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].data_max = ytail;
						if (ytail > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max)
						{
							if (GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max = ytail;
							else
							{
								cp.type = coord_type.OUTRANGE;
								()0;
							}
						}
					} while (0);
				}

				if (dgrid3d)
				{
					/* HBB 20010424: in dgrid3d mode, delay log() taking
					 * and scaling until after the dgrid process. Only for
					 * z, not for x and y, so we can layout the newly
					 * created created grid more easily. */
					cp.z = z;
					if (this_plot.plot_style == PLOT_STYLE.VECTOR)
						cptail.z = ztail;
				}
				else
				{
					/* EAM Sep 2008 - Otherwise z=Nan or z=Inf or DF_MISSING fails */
					/* to set CRD_COLOR at all, since the z test bails to a goto.  */
					if (this_plot.plot_style == PLOT_STYLE.IMAGE)
					{
						cp.ylow = z;
					}

					do
					{
						if (GlobalMembersAxis.z_axis == DefineConstants.NO_AXIS)
							break;
						if (!(z > -DefineConstants.VERYLARGE && z < DefineConstants.VERYLARGE))
						{
							cp.type = coord_type.UNDEFINED;
							//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto come_here_if_undefined;
							break;
						}
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].log)
						{
							if (z < 0.0)
							{
								cp.type = coord_type.UNDEFINED;
								//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto come_here_if_undefined;
								break;
							}
							else if (z == 0.0)
							{
								cp.z = -DefineConstants.VERYLARGE;
								cp.type = coord_type.OUTRANGE;
								()0;
								break;
							}
							else
							{
								cp.z = (Math.log(z) / GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].log_base);
							}
						}
						else
							cp.z = z;
						if (this_plot.noautoscale)
							break;
						if (cp.type != coord_type.INRANGE)
							break;
						if ((int)GlobalMembersAxis.z_axis < 0)
							break;
						if (z < GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_min)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_min = z;
						if (z < GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min)
						{
							if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min = z;
							else
							{
								cp.type = coord_type.OUTRANGE;
								()0;
								break;
							}
						}
						if (z > GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_max)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_max = z;
						if (z > GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max)
						{
							if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max = z;
							else
							{
								cp.type = coord_type.OUTRANGE;
								()0;
							}
						}
					} while (0);
					if (this_plot.plot_style == PLOT_STYLE.VECTOR)
						do
						{
							if (GlobalMembersAxis.z_axis == DefineConstants.NO_AXIS)
								break;
							if (!(ztail > -DefineConstants.VERYLARGE && ztail < DefineConstants.VERYLARGE))
							{
								cp.type = coord_type.UNDEFINED;
								//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto come_here_if_undefined;
								break;
							}
							if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].log)
							{
								if (ztail < 0.0)
								{
									cp.type = coord_type.UNDEFINED;
									//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
									goto come_here_if_undefined;
									break;
								}
								else if (ztail == 0.0)
								{
									cptail.z = -DefineConstants.VERYLARGE;
									cp.type = coord_type.OUTRANGE;
									()0;
									break;
								}
								else
								{
									cptail.z = (Math.log(ztail) / GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].log_base);
								}
							}
							else
								cptail.z = ztail;
							if (this_plot.noautoscale)
								break;
							if (cp.type != coord_type.INRANGE)
								break;
							if ((int)GlobalMembersAxis.z_axis < 0)
								break;
							if (ztail < GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_min)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_min = ztail;
							if (ztail < GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min)
							{
								if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
									GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min = ztail;
								else
								{
									cp.type = coord_type.OUTRANGE;
									()0;
									break;
								}
							}
							if (ztail > GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_max)
								GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_max = ztail;
							if (ztail > GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max)
							{
								if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
									GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max = ztail;
								else
								{
									cp.type = coord_type.OUTRANGE;
									()0;
								}
							}
						} while (0);

					if (this_plot.lp_properties.l_type == DefineConstants.LT_COLORFROMCOLUMN)
						cp.ylow = color;

					if ((PLOT_STYLE.PM3DSURFACE == (this_plot).plot_style || PM3D_IMPL_MODE.PM3D_IMPLICIT == GlobalMembersPm3d.pm3d.implicit || 1 == (this_plot).lp_properties.use_palette))
					{
						if (pm3d_color_from_column != 0)
						{
							{
								coord_type c_type_tmp = cp.type;
								do
								{
									if (AXIS_INDEX.COLOR_AXIS == DefineConstants.NO_AXIS)
										break;
									if (!(color > -DefineConstants.VERYLARGE && color < DefineConstants.VERYLARGE))
									{
										c_type_tmp = coord_type.UNDEFINED;
										//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
										goto come_here_if_undefined;
										break;
									}
									if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log)
									{
										if (color < 0.0)
										{
											c_type_tmp = coord_type.UNDEFINED;
											//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
											goto come_here_if_undefined;
											break;
										}
										else if (color == 0.0)
										{
											cp.ylow = -DefineConstants.VERYLARGE;
											c_type_tmp = coord_type.OUTRANGE;
											()0;
											break;
										}
										else
										{
											cp.ylow = (Math.log(color) / GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log_base);
										}
									}
									else
										cp.ylow = color;
									if (this_plot.noautoscale)
										break;
									if (c_type_tmp != coord_type.INRANGE)
										break;
									if (AXIS_INDEX.COLOR_AXIS.getValue() < 0)
										break;
									if (color < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min)
										GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min = color;
									if (color < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min)
									{
										if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
											GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min = color;
										else
										{
											c_type_tmp = coord_type.OUTRANGE;
											()0;
											break;
										}
									}
									if (color > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max)
										GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max = color;
									if (color > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max)
									{
										if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
											GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max = color;
										else
										{
											c_type_tmp = coord_type.OUTRANGE;
											()0;
										}
									}
								} while (0);
							};
						}
						else
						{
							{
								coord_type c_type_tmp = cp.type;
								do
								{
									if (AXIS_INDEX.COLOR_AXIS == DefineConstants.NO_AXIS)
										break;
									if (!(z > -DefineConstants.VERYLARGE && z < DefineConstants.VERYLARGE))
									{
										c_type_tmp = coord_type.UNDEFINED;
										//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
										goto come_here_if_undefined;
										break;
									}
									if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log)
									{
										if (z < 0.0)
										{
											c_type_tmp = coord_type.UNDEFINED;
											//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
											goto come_here_if_undefined;
											break;
										}
										else if (z == 0.0)
										{
											cp.ylow = -DefineConstants.VERYLARGE;
											c_type_tmp = coord_type.OUTRANGE;
											()0;
											break;
										}
										else
										{
											cp.ylow = (Math.log(z) / GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log_base);
										}
									}
									else
										cp.ylow = z;
									if (this_plot.noautoscale)
										break;
									if (c_type_tmp != coord_type.INRANGE)
										break;
									if (AXIS_INDEX.COLOR_AXIS.getValue() < 0)
										break;
									if (z < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min)
										GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min = z;
									if (z < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min)
									{
										if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
											GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min = z;
										else
										{
											c_type_tmp = coord_type.OUTRANGE;
											()0;
											break;
										}
									}
									if (z > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max)
										GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max = z;
									if (z > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max)
									{
										if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
											GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max = z;
										else
										{
											c_type_tmp = coord_type.OUTRANGE;
											()0;
										}
									}
								} while (0);
							};
						}
					}
				}

				/* At this point we have stored the point coordinates. Now we need to copy */
				/* x,y,z into the text_label structure and add the actual text string.     */
				if (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)
					GlobalMembersPlot2d.store_label(this_plot.labels, cp, xdatum, GlobalMembersDatafile.df_tokens[3], color);

				if (this_plot.plot_style == PLOT_STYLE.RGBIMAGE || this_plot.plot_style == PLOT_STYLE.RGBA_IMAGE)
				{
					/* We will autoscale the RGB components to  a total range [0:255]
					 * so we don't need to do any fancy scaling here.
					 */
					cp.yhigh = v[3];
					cp.xlow = v[4];
					cp.xhigh = v[5];
					cp.ylow = v[6]; // Alpha channel
				}

				//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				come_here_if_undefined:
					/* some may complain, but I regard this as the correct use of goto */
					++xdatum;
			} // end of whileloop - end of surface

			/* We are finished reading user input; return to C locale for internal use */
			() do {if (GlobalMembersUtil.numeric_locale != null && strcmp(GlobalMembersUtil.numeric_locale,"C")) setlocale(LC_NUMERIC,"C");} while (0)();

			if (pm3d_color_from_column != 0)
			{
				this_plot.pm3d_color_from_column = pm3d_color_from_column;
			}

			if (xdatum > 0)
			{
				this_plot.num_iso_read++; // Update last iso.
				local_this_iso.p_count = xdatum;

				/* If this is a VECTOR plot then iso->next is already */
				/* occupied by the vector tail coordinates.           */
				if (this_plot.plot_style != PLOT_STYLE.VECTOR)
					local_this_iso.next = this_plot.iso_crvs;
				this_plot.iso_crvs = local_this_iso;

				if (xdatum != pt_in_iso_crv)
					this_plot.has_grid_topology = false;

			} // Free last allocation
			else
			{
				if (this_plot.plot_style == PLOT_STYLE.VECTOR)
					GlobalMembersMisc.iso_free(local_this_iso.next);
				GlobalMembersMisc.iso_free(local_this_iso);
			}

			/*}}} */
		}

		if (dgrid3d && this_plot.num_iso_read > 0)
			GlobalMembersPlot3d.grid_nongrid_data(this_plot);

		/* This check used to be done in graph3d */
		if (GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min == DefineConstants.VERYLARGE || GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max == -DefineConstants.VERYLARGE || GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min == DefineConstants.VERYLARGE || GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max == -DefineConstants.VERYLARGE || GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min == DefineConstants.VERYLARGE || GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max == -DefineConstants.VERYLARGE)
		{
			/* FIXME: Should we set plot type to NODATA? */
			/* But in the case of 'set view map' we may not care about Z */
			GlobalMembersUtil.int_warn(DefineConstants.NO_CARET, "No usable data in this plot to auto-scale axis range");
		}

		if (this_plot.num_iso_read <= 1)
			this_plot.has_grid_topology = false;
		if (this_plot.has_grid_topology != 0 && !GlobalMembersGraph3d.hidden3d)
		{
			iso_curve new_icrvs = DefineConstants.NULL;
			int num_new_iso = this_plot.iso_crvs.p_count;
			int len_new_iso = this_plot.num_iso_read;
			int i;

			/* Now we need to set the other direction (pseudo) isolines. */
			for (i = 0; i < num_new_iso; i++)
			{
				iso_curve new_icrv = GlobalMembersMisc.iso_alloc(len_new_iso);

				new_icrv.p_count = len_new_iso;

				for (j = 0, this_iso = this_plot.iso_crvs; this_iso != DefineConstants.NULL; j++, this_iso = this_iso.next)
				{
					/* copy whole point struct to get type too.
					 * wasteful for windows, with padding */
					/* more efficient would be extra pointer to same struct */
					new_icrv.points[j] = this_iso.points[i];
				}

				new_icrv.next = new_icrvs;
				new_icrvs = new_icrv;
			}

			/* Append the new iso curves after the read ones. */
			for (this_iso = this_plot.iso_crvs; this_iso.next != DefineConstants.NULL; this_iso = this_iso.next)
				;
			this_iso.next = new_icrvs;
		}

		return retval;
	}

	/*
	 * This parses the splot command after any range specifications. To support
	 * autoscaling on the x/z axis, we want any data files to define the x/y
	 * range, then to plot any functions using that range. We thus parse the
	 * input twice, once to pick up the data files, and again to pick up the
	 * functions. Definitions are processed twice, but that won't hurt.
	 * div - okay, it doesn't hurt, but every time an option as added for
	 * datafiles, code to parse it has to be added here. Change so that
	 * we store starting-token in the plot structure.
	 */
	public static void eval_3dplots()
	{
		int i;
		surface_points[] tp_3d_ptr;
		int start_token = 0;
		int end_token;
		int begin_token;
		boolean some_data_files = false;
		boolean some_functions = false;
		boolean was_definition = false;
		int df_return = 0;
		int plot_num;
		int line_num;
		int point_num;
		/* part number of parametric function triplet: 0 = z, 1 = y, 2 = x */
		int crnt_param = 0;
		String xtitle;
		String ytitle;
		legend_key key = GlobalMembersGadgets.keyT;

		/* Free memory from previous splot.
		 * If there is an error within this function, the memory is left allocated,
		 * since we cannot call sp_free if the list is incomplete
		 */
		if (first_3dplot != null && plot3d_num > 0)
			GlobalMembersPlot3d.sp_free(first_3dplot);
		plot3d_num = 0;
		first_3dplot = DefineConstants.NULL;

		GlobalMembersAxis.x_axis = AXIS_INDEX.FIRST_X_AXIS;
		GlobalMembersAxis.y_axis = AXIS_INDEX.FIRST_Y_AXIS;
		GlobalMembersAxis.z_axis = AXIS_INDEX.FIRST_Z_AXIS;

		tp_3d_ptr = &(first_3dplot);
		plot_num = 0;
		line_num = 0; // default line type
		point_num = 0; // default point type

		/* Assume that the input data can be re-read later */
		GlobalMembersGadgets.volatile_data = false;

		xtitle = DefineConstants.NULL;
		ytitle = DefineConstants.NULL;

		begin_token = GlobalMembersCommand.c_token;

		/*** First Pass: Read through data files ***/
		/*
		 * This pass serves to set the x/yranges and to parse the command, as
		 * well as filling in every thing except the function data. That is done
		 * after the x/yrange is defined.
		 */
		GlobalMembersParse.check_for_iteration();

		while (true)
		{
			if (GlobalMembersCommand.c_token >= GlobalMembersCommand.num_tokens || GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ";") != 0)
				GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "function to plot expected");

			if (crnt_param == 0 && !was_definition)
				start_token = GlobalMembersCommand.c_token;

			if (GlobalMembersUtil.is_definition(GlobalMembersCommand.c_token) != 0)
			{
				GlobalMembersCommand.define();
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") == 0)
				{
					was_definition = true;
					continue;
				}

			}
			else
			{
				int specs = -1;
				surface_points this_plot;

				String name_str;
				boolean duplication = false;
				boolean set_title = false;
				boolean set_with = false;
				boolean set_lpstyle = false;
				boolean checked_once = false;
				boolean set_labelstyle = false;

				if (!was_definition && (!GlobalMembersGadgets.parametric || crnt_param == 0))
					start_token = GlobalMembersCommand.c_token;
				was_definition = false;

				GlobalMembersCommand.dummy_func = plot_func;
				/* WARNING: do NOT free name_str */
				/* FIXME: could also be saved in this_plot */
				name_str = GlobalMembersParse.string_or_express(DefineConstants.NULL);
				GlobalMembersCommand.dummy_func = DefineConstants.NULL;
				if (name_str != null)
				{
					/*{{{  data file to plot */
					if (GlobalMembersGadgets.parametric && crnt_param != 0)
						GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "previous parametric function not fully specified");

					if (!some_data_files)
					{
						if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
						{
							GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min = DefineConstants.VERYLARGE;
						}
						if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
						{
							GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max = -DefineConstants.VERYLARGE;
						}
						if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
						{
							GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min = DefineConstants.VERYLARGE;
						}
						if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
						{
							GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max = -DefineConstants.VERYLARGE;
						}
						some_data_files = true;
					}
					if (tp_3d_ptr != null)
						this_plot = tp_3d_ptr;
					else // no memory malloc()'d there yet
					{
						/* Allocate enough isosamples and samples */
						this_plot = GlobalMembersPlot3d.sp_alloc(0, 0, 0, 0);
						tp_3d_ptr = this_plot;
					}

					this_plot.plot_type = PLOT_TYPE.DATA3D;
					this_plot.plot_style = GlobalMembersGadgets.data_style;

					GlobalMembersDatafile.df_set_plot_mode(MODE_PLOT_TYPE.MODE_SPLOT);
					specs = GlobalMembersDatafile.df_open(name_str, DefineConstants.MAXDATACOLS, (GlobalMembersMouse.struct curve_points *)this_plot);

					if (GlobalMembersDatafile.df_matrix)
						this_plot.has_grid_topology = true;

					/* parses all datafile-specific modifiers */
					/* we will load the data after parsing title,with,... */

					/* for capture to key */
					this_plot.token = end_token = GlobalMembersCommand.c_token - 1;
					this_plot.iteration = GlobalMembersParse.iteration; // FIXME: Is this really needed?

					/* this_plot->token is temporary, for errors in get_3ddata() */

					if (specs < 3)
					{
						if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].is_timedata)
						{
							GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Need full using spec for x time data");
						}
						if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].is_timedata)
						{
							GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "Need full using spec for y time data");
						}
					}
					GlobalMembersDatafile.df_axis[0] = AXIS_INDEX.FIRST_X_AXIS;
					GlobalMembersDatafile.df_axis[1] = AXIS_INDEX.FIRST_Y_AXIS;
					GlobalMembersDatafile.df_axis[2] = AXIS_INDEX.FIRST_Z_AXIS;

					/*}}} */

				} // function to plot
				else
				{

					/*{{{  function */
					++plot_num;
					if (GlobalMembersGadgets.parametric)
					{
						/* Rotate between x/y/z axes */
						/* +2 same as -1, but beats -ve problem */
						crnt_param = (crnt_param + 2) % 3;
					}
					if (tp_3d_ptr != null)
					{
						this_plot = tp_3d_ptr;
						if (!GlobalMembersGraph3d.hidden3d)
							GlobalMembersPlot3d.sp_replace(this_plot, GlobalMembersGadgets.samples_1, GlobalMembersGraph3d.iso_samples_1, GlobalMembersGadgets.samples_2, GlobalMembersGraph3d.iso_samples_2);
						else
							GlobalMembersPlot3d.sp_replace(this_plot, GlobalMembersGraph3d.iso_samples_1, 0, 0, GlobalMembersGraph3d.iso_samples_2);

					} // no memory malloc()'d there yet
					else
					{
						/* Allocate enough isosamples and samples */
						if (!GlobalMembersGraph3d.hidden3d)
							this_plot = GlobalMembersPlot3d.sp_alloc(GlobalMembersGadgets.samples_1, GlobalMembersGraph3d.iso_samples_1, GlobalMembersGadgets.samples_2, GlobalMembersGraph3d.iso_samples_2);
						else
							this_plot = GlobalMembersPlot3d.sp_alloc(GlobalMembersGraph3d.iso_samples_1, 0, 0, GlobalMembersGraph3d.iso_samples_2);
						tp_3d_ptr = this_plot;
					}

					this_plot.plot_type = PLOT_TYPE.FUNC3D;
					this_plot.has_grid_topology = true;
					this_plot.plot_style = GlobalMembersGadgets.func_style;
					this_plot.num_iso_read = GlobalMembersGraph3d.iso_samples_2;
					/* ignore it for now */
					some_functions = true;
					end_token = GlobalMembersCommand.c_token - 1;
					/*}}} */

				} // end of IS THIS A FILE OR A FUNC block

				/* clear current title, if exist */
				if (this_plot.title != null)
				{
					//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(this_plot.title);
					this_plot.title = DefineConstants.NULL;
				}

				/* default line and point types, no palette */
				this_plot.lp_properties.use_palette = false;
				this_plot.lp_properties.l_type = line_num;
				this_plot.lp_properties.p_type = point_num;

				/* user may prefer explicit line styles */
				if (GlobalMembersGadgets.prefer_line_styles)
					GlobalMembersTerm.lp_use_properties(this_plot.lp_properties, line_num + 1);

				/* pm 25.11.2001 allow any order of options */
				while (!GlobalMembersCommand.c_token >= GlobalMembersCommand.num_tokens || GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ";") != 0 || !checked_once)
				{

					/* deal with title */
					if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "t$itle") != 0)
					{
						if (set_title)
						{
							duplication = true;
							break;
						}
						this_plot.title_no_enhanced = !key.enhanced;
						/* title can be enhanced if not explicitly disabled */
						if (GlobalMembersGadgets.parametric)
						{
							if (crnt_param != 0)
								GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "\"title\" allowed only after parametric function fully specified");
							else
							{
								if (!xtitle.equals(DefineConstants.NULL))
									xtitle = tangible.StringFunctions.changeCharacter(xtitle, 0, DefineConstants.NUL); // Remove default title .
								if (!ytitle.equals(DefineConstants.NULL))
									ytitle = tangible.StringFunctions.changeCharacter(ytitle, 0, DefineConstants.NUL); // Remove default title .
							}
						}
						GlobalMembersCommand.c_token++;

						if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "col$umnheader") != 0)
						{
							GlobalMembersDatafile.df_set_key_title_columnhead(this_plot.plot_type);
						}
						else

							///#ifdef BACKWARDS_COMPATIBLE
							// /* Annoying backwards-compatibility hack - deprecate! */
							//		    if (isanumber(c_token)) {
							//			c_token--;
							//			df_set_key_title_columnhead(this_plot->plot_type);
							//		    } else
							///#endif

							if (!(this_plot.title = GlobalMembersUtil.try_to_get_string()))
								GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "expecting \"title\" for plot");
						set_title = true;
						continue;
					}

					if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "not$itle") != 0)
					{
						if (set_title)
						{
							duplication = true;
							break;
						}
						GlobalMembersCommand.c_token++;
						if ((GlobalMembersUtil.isstring(GlobalMembersCommand.c_token) != 0 || GlobalMembersUtil.type_udv(GlobalMembersCommand.c_token) == DATA_TYPES.STRING))
							GlobalMembersUtil.try_to_get_string(); // ignore optionally given title string
						this_plot.title_is_suppressed = true;
						if (!xtitle.equals(DefineConstants.NULL))
							xtitle = tangible.StringFunctions.changeCharacter(xtitle, 0, '\0');
						if (!ytitle.equals(DefineConstants.NULL))
							ytitle = tangible.StringFunctions.changeCharacter(ytitle, 0, '\0');
						set_title = true;
						continue;
					}

					/* deal with style */
					if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "w$ith") != 0)
					{
						if (set_with)
						{
							duplication = true;
							break;
						}
						this_plot.plot_style = GlobalMembersMisc.get_style();
						if ((this_plot.plot_type == PLOT_TYPE.FUNC3D) && ((this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_ERRORBAR) || (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)))
						{
							GlobalMembersUtil.int_warn(GlobalMembersCommand.c_token, "This plot style is only for datafiles , reverting to \"points\"");
							this_plot.plot_style = PLOT_STYLE.POINTSTYLE;
						}

						if ((this_plot.plot_style | GlobalMembersGadgets.data_style) & PLOT_STYLE.PM3DSURFACE)
						{
							if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, "at") != 0)
							{
								/* option 'with pm3d [at ...]' is explicitly specified */
								GlobalMembersCommand.c_token++;
								if (GlobalMembersPm3d.get_pm3d_at_option(this_plot.pm3d_where.charAt(0)) != 0)
									return; // error
							}
						}

						if (this_plot.plot_style == PLOT_STYLE.IMAGE || this_plot.plot_style == PLOT_STYLE.RGBA_IMAGE || this_plot.plot_style == PLOT_STYLE.RGBIMAGE)
							GlobalMembersMisc.get_image_options(this_plot.image_properties);

						set_with = true;
						continue;
					}

					/* Hidden3D code by default includes points, labels and vectors	*/
					/* in the hidden3d processing. Check here if this particular	*/
					/* plot wants to be excluded.					*/
					if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "nohidden$3d") != 0)
					{
						GlobalMembersCommand.c_token++;
						this_plot.opt_out_of_hidden3d = true;
						continue;
					}

					/* "set contour" is global.  Allow individual plots to opt out */
					if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "nocon$tours") != 0)
					{
						GlobalMembersCommand.c_token++;
						this_plot.opt_out_of_contours = true;
						continue;
					}

					/* "set surface" is global.  Allow individual plots to opt out */
					if (GlobalMembersUtil.almost_equals(GlobalMembersCommand.c_token, "nosur$face") != 0)
					{
						GlobalMembersCommand.c_token++;
						this_plot.opt_out_of_surface = true;
						continue;
					}

					/* Labels can have font and text property info as plot options */
					/* In any case we must allocate one instance of the text style */
					/* that all labels in the plot will share.                     */
					if (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)
					{
						int stored_token = GlobalMembersCommand.c_token;
						if (this_plot.labels == DefineConstants.NULL)
						{
							this_plot.labels = GlobalMembersSet.new_text_label(-1);
							this_plot.labels.pos = VERT_JUSTIFY.JUST_CENTRE;
							this_plot.labels.layer = DefineConstants.LAYER_PLOTLABELS;
						}
						GlobalMembersSet.parse_label_options(this_plot.labels);
						checked_once = true;
						if (stored_token != GlobalMembersCommand.c_token)
						{
							if (set_labelstyle)
							{
								duplication = true;
								break;
							}
							else
							{
								set_labelstyle = true;
								continue;
							}
						}
					}

					/* pick up line/point specs
					 * - point spec allowed if style uses points, ie style&2 != 0
					 * - keywords are optional
					 */
					if (this_plot.plot_style == PLOT_STYLE.VECTOR)
					{
						int stored_token = GlobalMembersCommand.c_token;

						if (!checked_once)
						{
							GlobalMembersGadgets.default_arrow_style(this_plot.arrow_properties);
							this_plot.arrow_properties.lp_properties.l_type = line_num;
							checked_once = true;
						}
						GlobalMembersMisc.arrow_parse(this_plot.arrow_properties, true);
						if (stored_token != GlobalMembersCommand.c_token)
						{
							if (set_lpstyle)
							{
								duplication = true;
								break;
							}
							else
							{
								set_lpstyle = true;
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
								//ORIGINAL LINE: this_plot->lp_properties = this_plot->arrow_properties.lp_properties;
								this_plot.lp_properties.copyFrom(this_plot.arrow_properties.lp_properties);
								continue;
							}
						}
					}
					else
					{
						int stored_token = GlobalMembersCommand.c_token;
						lp_style_type lp = new lp_style_type(0, -2, 0, 0, 1.0, DefineConstants.PTSZ_DEFAULT, false, {DefineConstants.TC_DEFAULT, 0, 0.0});

						lp.l_type = line_num;
						lp.p_type = point_num;

						/* user may prefer explicit line styles */
						if (GlobalMembersGadgets.prefer_line_styles)
							GlobalMembersTerm.lp_use_properties(lp, line_num + 1);

						GlobalMembersMisc.lp_parse(lp, true, this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT);
						checked_once = true;
						if (stored_token != GlobalMembersCommand.c_token)
						{
							if (set_lpstyle)
							{
								duplication = true;
								break;
							}
							else
							{
								//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
								//ORIGINAL LINE: this_plot->lp_properties = lp;
								this_plot.lp_properties.copyFrom(lp);
								set_lpstyle = true;
								continue;
							}
						}
					}

					break; // unknown option

				} // while (!END_OF_COMMAND)

				if (duplication)
					GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "duplicated or contradicting arguments in plot options");

				/* set default values for title if this has not been specified */
				this_plot.title_is_filename = false;
				if (!set_title)
				{
					this_plot.title_no_enhanced = true; // filename or function cannot be enhanced
					if (key.auto_titles == keytitle_type.FILENAME_KEYTITLES)
					{
						GlobalMembersUtil.m_capture((this_plot.title), start_token, end_token);
						if (crnt_param == 2)
							xtitle = this_plot.title;
						else if (crnt_param == 1)
							ytitle = this_plot.title;
						this_plot.title_is_filename = true;
					}
					else
					{
						if (!xtitle.equals(DefineConstants.NULL))
							xtitle = tangible.StringFunctions.changeCharacter(xtitle, 0, '\0');
						if (!ytitle.equals(DefineConstants.NULL))
							ytitle = tangible.StringFunctions.changeCharacter(ytitle, 0, '\0');
						/*   this_plot->title = NULL;   */
					}
				}

				/* No line/point style given. As lp_parse also supplies
				 * the defaults for linewidth and pointsize, call it now
				 * to define them. */
				if (!set_lpstyle)
				{
					if (this_plot.plot_style == PLOT_STYLE.VECTOR)
					{
						this_plot.arrow_properties.lp_properties.l_type = line_num;
						GlobalMembersMisc.arrow_parse(this_plot.arrow_properties, true);
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
						//ORIGINAL LINE: this_plot->lp_properties = this_plot->arrow_properties.lp_properties;
						this_plot.lp_properties.copyFrom(this_plot.arrow_properties.lp_properties);
					}
					else
					{
						this_plot.lp_properties.l_type = line_num;
						this_plot.lp_properties.l_width = 1.0;
						this_plot.lp_properties.p_type = point_num;
						this_plot.lp_properties.p_size = GlobalMembersGadgets.pointsize;
						this_plot.lp_properties.use_palette = false;

						/* user may prefer explicit line styles */
						if (GlobalMembersGadgets.prefer_line_styles)
							GlobalMembersTerm.lp_use_properties(this_plot.lp_properties, line_num + 1);

						GlobalMembersMisc.lp_parse(this_plot.lp_properties, true, this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT);
					}

					///#ifdef BACKWARDS_COMPATIBLE
					// /* allow old-style syntax - ignore case lt 3 4 for example */
					//		if (!END_OF_COMMAND && isanumber(c_token)) {
					//		    this_plot->lp_properties.l_type =
					//			this_plot->lp_properties.p_type = int_expression() - 1;
					//
					//		    if (isanumber(c_token))
					//			this_plot->lp_properties.p_type = int_expression() - 1;
					//		}
					///#endif

				}

				/* Some low-level routines expect to find the pointflag attribute */
				/* in lp_properties (they don't have access to the full header).  */
				if (this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT != 0)
					this_plot.lp_properties.pointflag = true;

				/* Rule out incompatible line/point/style options */
				if (this_plot.plot_type == PLOT_TYPE.FUNC3D)
				{
					if ((this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT) && (this_plot.lp_properties.p_size == DefineConstants.PTSZ_VARIABLE))
						this_plot.lp_properties.p_size = 1;
				}
				if (this_plot.plot_style == PLOT_STYLE.LINES)
				{
					this_plot.opt_out_of_hidden3d = false;
				}

				if (crnt_param == 0 && this_plot.plot_style != PLOT_STYLE.PM3DSURFACE && this_plot.plot_style != PLOT_STYLE.IMAGE && this_plot.plot_style != PLOT_STYLE.RGBIMAGE && this_plot.plot_style != PLOT_STYLE.RGBA_IMAGE)
					/* don't increment the default line/point properties if
					 * this_plot is an EXPLICIT pm3d surface plot */
					/* same as above, for an (rgb)image plot */
				{
					if (this_plot.plot_style & e_PLOT_STYLE_FLAGS.PLOT_STYLE_HAS_POINT != 0)
						point_num += 1 + (GlobalMembersGraph3d.draw_contour != 0) + (GlobalMembersGraph3d.hidden3d != false);
					line_num += 1 + (GlobalMembersGraph3d.draw_contour != 0) + (GlobalMembersGraph3d.hidden3d != false);
				}

				if (this_plot.plot_style == PLOT_STYLE.IMAGE)
					this_plot.lp_properties.use_palette = true;
				if (this_plot.plot_style == PLOT_STYLE.RGBIMAGE || this_plot.plot_style == PLOT_STYLE.RGBA_IMAGE)
				{
					if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
						GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min = 0;
					if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
						GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max = 255;
				}

				/* now get the data... having to think hard here...
				 * first time through, we fill in this_plot. For second
				 * surface in file, we have to allocate another surface
				 * struct. BUT we may allocate this store only to
				 * find that it is merely some blank lines at end of file
				 * tp_3d_ptr is still pointing at next field of prev. plot,
				 * before :    prev_or_first -> this_plot -> possible_preallocated_store
				 *                tp_3d_ptr--^
				 * after  :    prev_or_first -> first -> second -> last -> possibly_more_store
				 *                                        tp_3d_ptr ----^
				 * if file is empty, tp_3d_ptr is not moved. this_plot continues
				 * to point at allocated storage, but that will be reused later
				 */

				assert this_plot == tp_3d_ptr;

				if (this_plot.plot_type == PLOT_TYPE.DATA3D)
				{
					/*{{{  read data */
					/* pointer to the plot of the first dataset (surface) in the file */
					surface_points first_dataset = this_plot;
					int this_token = this_plot.token;

					do
					{
						this_plot = tp_3d_ptr;
						assert this_plot != DefineConstants.NULL;

						/* dont move tp_3d_ptr until we are sure we
						 * have read a surface
						 */

						/* used by get_3ddata() */
						this_plot.token = this_token;

						df_return = GlobalMembersPlot3d.get_3ddata(this_plot);
						/* for second pass */
						this_plot.token = GlobalMembersCommand.c_token;
						this_plot.iteration = GlobalMembersParse.iteration;

						if (this_plot.num_iso_read == 0)
							this_plot.plot_type = PLOT_TYPE.NODATA;

						if (this_plot != first_dataset)
							/* copy (explicit) "with pm3d at ..." option from the first dataset in the file */
							this_plot.pm3d_where = first_dataset.pm3d_where;

						/* okay, we have read a surface */
						++plot_num;
						tp_3d_ptr = &(this_plot.next_sp);
						if (df_return == DefineConstants.DF_EOF)
							break;

						/* there might be another surface so allocate
						 * and prepare another surface structure
						 * This does no harm if in fact there are
						 * no more surfaces to read
						 */

						if ((this_plot = tp_3d_ptr) != DefineConstants.NULL)
						{
							if (this_plot.title != null)
							{
								//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
								free(this_plot.title);
								this_plot.title = DefineConstants.NULL;
							}
						}
						else
						{
							/* Allocate enough isosamples and samples */
							this_plot = tp_3d_ptr = GlobalMembersPlot3d.sp_alloc(0, 0, 0, 0);
						}

						this_plot.plot_type = PLOT_TYPE.DATA3D;
						this_plot.iteration = GlobalMembersParse.iteration;
						this_plot.plot_style = first_dataset.plot_style;
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
						//ORIGINAL LINE: this_plot->lp_properties = first_dataset->lp_properties;
						this_plot.lp_properties.copyFrom(first_dataset.lp_properties);
						if (this_plot.plot_style == PLOT_STYLE.LABELPOINTS)
						{
							this_plot.labels = GlobalMembersSet.new_text_label(-1);
							*(this_plot.labels) = *(first_dataset.labels);
							this_plot.labels.next = DefineConstants.NULL;
						}
					} while (df_return != DefineConstants.DF_EOF);

					GlobalMembersDatafile.df_close();
					/*}}} */

				} // not a data file
				else
				{
					tp_3d_ptr = &(this_plot.next_sp);
					this_plot.token = GlobalMembersCommand.c_token; // store for second pass
					this_plot.iteration = GlobalMembersParse.iteration;
				}

				if (GlobalMembersParse.empty_iteration())
					this_plot.plot_type = PLOT_TYPE.NODATA;

			} // !is_definition() : end of scope of this_plot

			if (crnt_param != 0)
			{
				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0)
				{
					GlobalMembersCommand.c_token++;
					continue;
				}
				else
					break;
			}

			/* Iterate-over-plot mechanisms */
			if (GlobalMembersParse.next_iteration())
			{
				GlobalMembersCommand.c_token = start_token;
				continue;
			}

			if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0)
			{
				GlobalMembersCommand.c_token++;
				GlobalMembersParse.check_for_iteration();
			}
			else
				break;

		} // while(TRUE), ie first pass


		if (GlobalMembersGadgets.parametric && crnt_param != 0)
			GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "parametric function not fully specified");


		/*** Second Pass: Evaluate the functions ***/
		/*
		 * Everything is defined now, except the function data. We expect no
		 * syntax errors, etc, since the above parsed it all. This makes the code
		 * below simpler. If axis_array[FIRST_Y_AXIS].autoscale, the yrange may still change.
		 * - eh ?  - z can still change.  x/y/z can change if we are parametric ??
		 */

		if (some_functions)
		{
			/* I've changed the controlled variable in fn plots to u_min etc since
			 * it's easier for me to think parametric - 'normal' plot is after all
			 * a special case. I was confused about x_min being both minimum of
			 * x values found, and starting value for fn plots.
			 */
			double u_min;
			double u_max;
			double u_step;
			double v_min;
			double v_max;
			double v_step;
			double u_isostep;
			double v_isostep;
			AXIS_INDEX u_axis;
			AXIS_INDEX v_axis;
			surface_points this_plot;

			/* Make these point out the right 'u' and 'v' axis. In
			 * non-parametric mode, x is used as u, and y as v */
			u_axis = GlobalMembersGadgets.parametric ? AXIS_INDEX.U_AXIS : AXIS_INDEX.FIRST_X_AXIS;
			v_axis = GlobalMembersGadgets.parametric ? AXIS_INDEX.V_AXIS : AXIS_INDEX.FIRST_Y_AXIS;

			if (!GlobalMembersGadgets.parametric)
			{
				/*{{{  check ranges */
				/* give error if xrange badly set from missing datafile error
				 * parametric fn can still set ranges
				 * if there are no fns, we'll report it later as 'nothing to plot'
				 */

				/* check that xmin -> xmax is not too small */
				GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.FIRST_X_AXIS, "x range is invalid");
				GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.FIRST_Y_AXIS, "y range is invalid");
				/*}}} */
			}
			if (GlobalMembersGadgets.parametric && !some_data_files)
			{
				/*{{{  set ranges */
				/* parametric fn can still change x/y range */
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min = DefineConstants.VERYLARGE;
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max = -DefineConstants.VERYLARGE;
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min = DefineConstants.VERYLARGE;
				if (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
					GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max = -DefineConstants.VERYLARGE;
				/*}}} */
			}

			/*{{{  figure ranges, taking logs etc into account */
			u_min = GlobalMembersAxis.axis_log_value_checked(u_axis, GlobalMembersAxis.axis_array[u_axis.getValue()].min, "x range");
			u_max = GlobalMembersAxis.axis_log_value_checked(u_axis, GlobalMembersAxis.axis_array[u_axis.getValue()].max, "x range");
			v_min = GlobalMembersAxis.axis_log_value_checked(v_axis, GlobalMembersAxis.axis_array[v_axis.getValue()].min, "y range");
			v_max = GlobalMembersAxis.axis_log_value_checked(v_axis, GlobalMembersAxis.axis_array[v_axis.getValue()].max, "y range");
			/*}}} */


			if (GlobalMembersGadgets.samples_1 < 2 || GlobalMembersGadgets.samples_2 < 2 || GlobalMembersGraph3d.iso_samples_1 < 2 || GlobalMembersGraph3d.iso_samples_2 < 2)
			{
				GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "samples or iso_samples < 2. Must be at least 2.");
			}

			/* start over */
			this_plot = first_3dplot;
			GlobalMembersCommand.c_token = begin_token;
			GlobalMembersParse.check_for_iteration();

			/* why do attributes of this_plot matter ? */
			/* FIXME HBB 20000501: I think they don't, actually. I'm
			 * taking out references to has_grid_topology in this part of
			 * the code.  It only deals with function, which always is
			 * gridded */

			if (GlobalMembersGraph3d.hidden3d)
			{
				u_step = (u_max - u_min) / (GlobalMembersGraph3d.iso_samples_1 - 1);
				v_step = (v_max - v_min) / (GlobalMembersGraph3d.iso_samples_2 - 1);
			}
			else
			{
				u_step = (u_max - u_min) / (GlobalMembersGadgets.samples_1 - 1);
				v_step = (v_max - v_min) / (GlobalMembersGadgets.samples_2 - 1);
			}

			u_isostep = (u_max - u_min) / (GlobalMembersGraph3d.iso_samples_1 - 1);
			v_isostep = (v_max - v_min) / (GlobalMembersGraph3d.iso_samples_2 - 1);


			/* Read through functions */
			while (true)
			{
				if (crnt_param == 0 && !was_definition)
					start_token = GlobalMembersCommand.c_token;

				if (GlobalMembersUtil.is_definition(GlobalMembersCommand.c_token) != 0)
				{
					GlobalMembersCommand.define();
					if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") == 0)
					{
						was_definition = true;
						continue;
					}

				}
				else
				{
					at_type at_ptr;
					String name_str;
					was_definition = false;

					GlobalMembersCommand.dummy_func = plot_func;
					name_str = GlobalMembersParse.string_or_express(at_ptr);

					if (name_str == null) // func to plot
					{
						/*{{{  evaluate function */
						iso_curve this_iso = this_plot.iso_crvs;
						int num_sam_to_use;
						int num_iso_to_use;

						/* crnt_param is used as the axis number.  As the
						 * axis array indices are ordered z, y, x, we have
						 * to count *backwards*, starting starting at 2,
						 * to properly store away contents to x, y and
						 * z. The following little gimmick does that. */
						if (GlobalMembersGadgets.parametric)
							crnt_param = (crnt_param + 2) % 3;

						plot_func.at = at_ptr;

						num_iso_to_use = GlobalMembersGraph3d.iso_samples_2;
						num_sam_to_use = GlobalMembersGraph3d.hidden3d ? GlobalMembersGraph3d.iso_samples_1 : GlobalMembersGadgets.samples_1;

						GlobalMembersPlot3d.calculate_set_of_isolines(crnt_param, false, this_iso, v_axis, v_min, v_isostep, num_iso_to_use, u_axis, u_min, u_step, num_sam_to_use, (PLOT_STYLE.PM3DSURFACE == (this_plot).plot_style || PM3D_IMPL_MODE.PM3D_IMPLICIT == GlobalMembersPm3d.pm3d.implicit || 1 == (this_plot).lp_properties.use_palette));

						if (!GlobalMembersGraph3d.hidden3d)
						{
							num_iso_to_use = GlobalMembersGraph3d.iso_samples_1;
							num_sam_to_use = GlobalMembersGadgets.samples_2;

							GlobalMembersPlot3d.calculate_set_of_isolines(crnt_param, true, this_iso, u_axis, u_min, u_isostep, num_iso_to_use, v_axis, v_min, v_step, num_sam_to_use, (PLOT_STYLE.PM3DSURFACE == (this_plot).plot_style || PM3D_IMPL_MODE.PM3D_IMPLICIT == GlobalMembersPm3d.pm3d.implicit || 1 == (this_plot).lp_properties.use_palette));
						}
						/*}}} */
					} // end of ITS A FUNCTION TO PLOT
					/* we saved it from first pass */
					GlobalMembersCommand.c_token = this_plot.token;

					/* we may have seen this one data file in multiple iterations */
					i = this_plot.iteration;
					do
					{
						this_plot = this_plot.next_sp;
					} while (this_plot != null && this_plot.token == GlobalMembersCommand.c_token && this_plot.iteration == i);

				} // !is_definition

				/* Iterate-over-plot mechanism */
				if (crnt_param == 0 && GlobalMembersParse.next_iteration())
				{
					GlobalMembersCommand.c_token = start_token;
					continue;
				}

				if (GlobalMembersUtil.equals(GlobalMembersCommand.c_token, ",") != 0)
				{
					GlobalMembersCommand.c_token++;
					if (crnt_param == 0)
						GlobalMembersParse.check_for_iteration();
				}
				else
					break;

			} // while(TRUE)


			if (GlobalMembersGadgets.parametric)
			{
				/* Now actually fix the plot triplets to be single plots. */
				GlobalMembersPlot3d.parametric_3dfixup(first_3dplot, plot_num);
			}
		} // some functions

		/* if first_3dplot is NULL, we have no functions or data at all.
		 * This can happen, if you type "splot x=5", since x=5 is a
		 * variable assignment
		 */
		if (plot_num == 0 || first_3dplot == DefineConstants.NULL)
		{
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "no functions or data to plot");
		}

		GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.FIRST_X_AXIS, "All points x value undefined");
		GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.FIRST_Y_AXIS, "All points y value undefined");
		if (GlobalMembersGraph3d.splot_map != 0)
			GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.FIRST_Z_AXIS, DefineConstants.NULL); // Suppress warning message
		else
			GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.FIRST_Z_AXIS, "All points z value undefined");

		GlobalMembersAxis.axis_revert_and_unlog_range(AXIS_INDEX.FIRST_X_AXIS);
		GlobalMembersAxis.axis_revert_and_unlog_range(AXIS_INDEX.FIRST_Y_AXIS);
		GlobalMembersAxis.axis_revert_and_unlog_range(AXIS_INDEX.FIRST_Z_AXIS);

		GlobalMembersAxis.setup_tics(AXIS_INDEX.FIRST_X_AXIS, 20);
		GlobalMembersAxis.setup_tics(AXIS_INDEX.FIRST_Y_AXIS, 20);
		GlobalMembersAxis.setup_tics(AXIS_INDEX.FIRST_Z_AXIS, 20);

		GlobalMembersPm3d.set_plot_with_palette(plot_num, MODE_PLOT_TYPE.MODE_SPLOT);
		if (GlobalMembersPm3d.is_plot_with_palette())
		{
			GlobalMembersAxis.set_cbminmax();
			GlobalMembersAxis.axis_checked_extend_empty_range(AXIS_INDEX.COLOR_AXIS, "All points of colorbox value undefined");
			GlobalMembersAxis.setup_tics(AXIS_INDEX.COLOR_AXIS, 20);
			/* axis_revert_and_unlog_range(COLOR_AXIS); */
			/* fprintf(stderr,"plot3d.c: CB_AXIS.min=%g\tCB_AXIS.max=%g\n",CB_AXIS.min,CB_AXIS.max); */
		}

		do
		{
			axis this_Renamed = GlobalMembersAxis.axis_array + AXIS_INDEX.FIRST_X_AXIS;
			if (this_Renamed.range_flags & DefineConstants.RANGE_WRITEBACK != 0)
			{
				if (this_Renamed.autoscale & e_autoscale.AUTOSCALE_MIN != 0)
					this_Renamed.set_min = this_Renamed.min;
				if (this_Renamed.autoscale & e_autoscale.AUTOSCALE_MAX != 0)
					this_Renamed.set_max = this_Renamed.max;
			}
		} while (0);

		if (plot_num == 0 || first_3dplot == DefineConstants.NULL)
		{
			GlobalMembersBf_test.int_error(GlobalMembersCommand.c_token, "no functions or data to plot");
		}
		/* Creates contours if contours are to be plotted as well. */

		if (((int)GlobalMembersGraph3d.draw_contour) != 0)
		{
			surface_points this_plot;
			for (this_plot = first_3dplot, i = 0; i < plot_num; this_plot = this_plot.next_sp, i++)
			{

				if (this_plot.contours != null)
				{
					gnuplot_contours cntrs = this_plot.contours;

					while (cntrs != null)
					{
						gnuplot_contours cntr = cntrs;
						cntrs = cntrs.next;
						//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
						free(cntr.coords);
						//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
						free(cntr);
					}
					this_plot.contours = DefineConstants.NULL;
				}

				/* Make sure this one can be contoured. */
				if (this_plot.plot_style == PLOT_STYLE.LABELPOINTS || this_plot.plot_style == PLOT_STYLE.VECTOR || this_plot.plot_style == PLOT_STYLE.IMAGE || this_plot.plot_style == PLOT_STYLE.RGBIMAGE || this_plot.plot_style == PLOT_STYLE.RGBA_IMAGE)
					continue;

				/* Allow individual surfaces to opt out of contouring */
				if (this_plot.opt_out_of_contours)
					continue;

				if (this_plot.has_grid_topology == 0)
				{
					GlobalMembersUtil.int_warn(DefineConstants.NO_CARET,"Cannot contour non grid data. Please use \"set dgrid3d\".");
				}
				else if (this_plot.plot_type == PLOT_TYPE.DATA3D)
				{
					this_plot.contours = GlobalMembersContour.contour(this_plot.num_iso_read, this_plot.iso_crvs);
				}
				else
				{
					this_plot.contours = GlobalMembersContour.contour(GlobalMembersGraph3d.iso_samples_2, this_plot.iso_crvs);
				}
			}
		} // draw_contour

		/* the following ~9 lines were moved from the end of the
		 * function to here, as do_3dplot calles term->text, which
		 * itself might process input events in mouse enhanced
		 * terminals. For redrawing to work, line capturing and
		 * setting the plot3d_num must already be done before
		 * entering do_3dplot(). Thu Jan 27 23:54:49 2000 (joze) */

		/* if we get here, all went well, so record the line for replot */
		if (GlobalMembersCommand.plot_token != -1)
		{
			/* note that m_capture also frees the old replot_line */
			tangible.RefObject<String[]> tempRef_replot_line = new tangible.RefObject<String[]>(GlobalMembersCommand.replot_line);
			GlobalMembersUtil.m_capture(tempRef_replot_line, GlobalMembersCommand.plot_token, GlobalMembersCommand.c_token - 1);
			GlobalMembersCommand.replot_line = tempRef_replot_line.argvalue;
			GlobalMembersCommand.plot_token = -1;
			GlobalMembersEval.fill_gpval_string("GPVAL_LAST_PLOT", GlobalMembersCommand.replot_line);
		}

		/* record that all went well */
		plot3d_num = plot_num;

		/* perform the plot */
		if (GlobalMembersGadgets.table_mode)
			GlobalMembersTabulate.print_3dtable(plot_num);
		else
		{
			GlobalMembersGraph3d.do_3dplot(first_3dplot, plot_num, 0);

			/* after do_3dplot(), axis_array[] and max_array[].min
			 * contain the plotting range actually used (rounded
			 * to tic marks, not only the min/max data values)
			 * --> save them now for writeback if requested
			 */
			do {AXIS_INDEX axis; for (axis = 0; axis < DefineConstants.AXIS_ARRAY_SIZE; axis++) if (GlobalMembersAxis.axis_array[axis].range_flags & DefineConstants.RANGE_WRITEBACK) {GlobalMembersAxis.set_writeback_min(axis); GlobalMembersAxis.set_writeback_max(axis);}} while (0);
			/* update GPVAL_ variables available to user */
			GlobalMembersEval.update_gpval_variables(1);

			///#ifdef VOLATILE_REFRESH
			/* Mark these plots as safe for quick refresh */
			GlobalMembersGadgets.refresh_nplots = plot_num;
			GlobalMembersGadgets.refresh_ok = 3;
			///#endif
		}
	}
	public static void grid_nongrid_data(surface_points this_plot)
	{
		int i;
		int j;
		int k;
		double x;
		double y;
		double z;
		double w;
		double dx;
		double dy;
		double xmin;
		double xmax;
		double ymin;
		double ymax;
		iso_curve old_iso_crvs = this_plot.iso_crvs;
		iso_curve icrv;
		iso_curve oicrv;
		iso_curve oicrvs;

		/* these are only needed for thin_plate_splines */
		double xx;
		double yy;
		double zz;
		double b;
		int numpoints;
		xx = DefineConstants.NULL; // save to call free() on NULL if xx has never been used

		/* Compute XY bounding box on the original data. */
		/* FIXME HBB 20010424: Does this make any sense? Shouldn't we just
		 * use whatever the x and y ranges have been found to be, and
		 * that's that? The largest difference this is going to make is if
		 * we plot a datafile that doesn't span the whole x/y range
		 * used. Do we want a dgrid3d over the actual data rectangle, or
		 * over the xrange/yrange area? */
		xmin = xmax = old_iso_crvs.points[0].x;
		ymin = ymax = old_iso_crvs.points[0].y;
		for (icrv = old_iso_crvs; icrv != DefineConstants.NULL; icrv = icrv.next)
		{
			//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: struct coordinate  *points = icrv->points;
			coordinate * points = new coordinate(icrv.points);

			for (i = 0; i < icrv.p_count; i++, points++)
			{
				/* HBB 20010424: avoid crashing for undefined input */
				if (points.type == coord_type.UNDEFINED)
					continue;
				if (xmin > points.x)
					xmin = points.x;
				if (xmax < points.x)
					xmax = points.x;
				if (ymin > points.y)
					ymin = points.y;
				if (ymax < points.y)
					ymax = points.y;
			}
		}

		dx = (xmax - xmin) / (dgrid3d_col_fineness - 1);
		dy = (ymax - ymin) / (dgrid3d_row_fineness - 1);

		/* Create the new grid structure, and compute the low pass filtering from
		 * non grid to grid structure.
		 */
		this_plot.iso_crvs = DefineConstants.NULL;
		this_plot.num_iso_read = dgrid3d_col_fineness;
		this_plot.has_grid_topology = true;

		if (dgrid3d_mode == en_dgrid3d_mode.DGRID3D_SPLINES.getValue())
		{
			GlobalMembersPlot3d.thin_plate_splines_setup(old_iso_crvs, xx, numpoints);
			yy = xx + numpoints;
			zz = yy + numpoints;
			b = zz + numpoints;
		}

		for (i = 0, x = xmin; i < dgrid3d_col_fineness; i++, x += dx)
		{
			//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
			coordinate * points = new coordinate();

			icrv = GlobalMembersMisc.iso_alloc(dgrid3d_row_fineness + 1);
			icrv.p_count = dgrid3d_row_fineness;
			icrv.next = this_plot.iso_crvs;
			this_plot.iso_crvs = icrv;
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
			//ORIGINAL LINE: points = icrv->points;
			points.copyFrom(icrv.points);

			for (j = 0, y = ymin; j < dgrid3d_row_fineness; j++, y += dy, points++)
			{
				z = w = 0.0;

				/* as soon as ->type is changed to UNDEFINED, break out of
				 * two inner loops! */
				points.type = coord_type.INRANGE;

				if (dgrid3d_mode == en_dgrid3d_mode.DGRID3D_SPLINES.getValue())
				{
					z = b[numpoints];
					for (k = 0; k < numpoints; k++)
					{
						double dx = xx[k] - x;
						double dy = yy[k] - y;
						z = z - b[k] * GlobalMembersPlot3d.splines_kernel(Math.sqrt(dx * dx + dy * dy));
					}
					z = z + b[numpoints + 1] * x + b[numpoints + 2] * y;
				} // everything, except splines
				else
				{
					for (oicrv = old_iso_crvs; oicrv != DefineConstants.NULL; oicrv = oicrv.next)
					{
						//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
						//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
						//ORIGINAL LINE: struct coordinate  *opoints = oicrv->points;
						coordinate * opoints = new coordinate(oicrv.points);
						for (k = 0; k < oicrv.p_count; k++, opoints++)
						{

							if (dgrid3d_mode == en_dgrid3d_mode.DGRID3D_QNORM.getValue())
							{
								double dist = GlobalMembersPlot3d.qnorm(Math.abs(opoints.x - x), Math.abs(opoints.y - y), dgrid3d_norm_value);

								if (dist == 0.0)
								{
									/* HBB 981209: revised flagging as undefined */
									/* Supporting all those infinities on various
									 * platforms becomes tiresome,
									 * to say the least :-(
									 * Let's just return the first z where this
									 * happens unchanged, and be done with this,
									 * period. */
									points.type = coord_type.UNDEFINED;
									z = opoints.z;
									w = 1.0;
									break; // out of inner loop
								}
								else
								{
									z += opoints.z / dist;
									w += 1.0 / dist;
								}

							} // ALL else: not spline, not qnorm!
							else
							{
								double weight = 0.0;
								double dist = GlobalMembersPlot3d.pythag((opoints.x - x) / dgrid3d_x_scale, (opoints.y - y) / dgrid3d_y_scale);

								if (dgrid3d_mode == en_dgrid3d_mode.DGRID3D_GAUSS.getValue())
								{
									weight = Math.exp(-dist * dist);
								}
								else if (dgrid3d_mode == en_dgrid3d_mode.DGRID3D_CAUCHY.getValue())
								{
									weight = 1.0 / (1.0 + dist * dist);
								}
								else if (dgrid3d_mode == en_dgrid3d_mode.DGRID3D_EXP.getValue())
								{
									weight = Math.exp(-dist);
								}
								else if (dgrid3d_mode == en_dgrid3d_mode.DGRID3D_BOX.getValue())
								{
									weight = (dist < 1.0) ? 1.0 : 0.0;
								}
								else if (dgrid3d_mode == en_dgrid3d_mode.DGRID3D_HANN.getValue())
								{
									if (dist < 1.0)
									{
										weight = 0.5 * (1 - Math.cos(2.0 * DefineConstants.M_PI * dist));
									}
								}
								z += opoints.z * weight;
								w += weight;
							}
						}

						/* PKJ: I think this is only relevant for qnorm */
						if (points.type != coord_type.INRANGE)
							break; // out of the second-inner loop as well ...
					}
				} // endif( dgrid3d_mode == DGRID3D_SPLINES )

				/* Now that we've escaped the loops safely, we know that we
				 * do have a good value in z and w, so we can proceed just as
				 * if nothing had happened at all. Nice, isn't it? */
				points.type = coord_type.INRANGE;

				/* HBB 20010424: if log x or log y axis, we don't want to
				 * log() the value again --> just store it, and trust that
				 * it's always inrange */
				points.x = x;
				points.y = y;

				/* Honor requested x and y limits */
				/* FIXME: This code section was not in 4.2.  It imperfectly    */
				/* restores the clipping behaviour of version 3.7 and earlier. */
				if ((x < GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN)) || (x > GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].max && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX)) || (y < GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN)) || (y > GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].max && !(GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX)))
					points.type = coord_type.OUTRANGE;

				if (dgrid3d_mode != en_dgrid3d_mode.DGRID3D_SPLINES.getValue())
					z = z / w;

				do
				{
					if (GlobalMembersAxis.z_axis == DefineConstants.NO_AXIS)
						break;
					if (!(z > -DefineConstants.VERYLARGE && z < DefineConstants.VERYLARGE))
					{
						points.type = coord_type.UNDEFINED;
						continue;
						break;
					}
					if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].log)
					{
						if (z < 0.0)
						{
							points.type = coord_type.UNDEFINED;
							continue;
							break;
						}
						else if (z == 0.0)
						{
							points.z = -DefineConstants.VERYLARGE;
							points.type = coord_type.OUTRANGE;
							()0;
							break;
						}
						else
						{
							points.z = (Math.log(z) / GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].log_base);
						}
					}
					else
						points.z = z;
					if (this_plot.noautoscale)
						break;
					if (points.type != coord_type.INRANGE)
						break;
					if ((int)GlobalMembersAxis.z_axis < 0)
						break;
					if (z < GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_min)
						GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_min = z;
					if (z < GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min)
					{
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].min = z;
						else
						{
							points.type = coord_type.OUTRANGE;
							()0;
							break;
						}
					}
					if (z > GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_max)
						GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].data_max = z;
					if (z > GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max)
					{
						if (GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
							GlobalMembersAxis.axis_array[GlobalMembersAxis.z_axis.getValue()].max = z;
						else
						{
							points.type = coord_type.OUTRANGE;
							()0;
						}
					}
				} while (0);

				if (this_plot.pm3d_color_from_column)
					GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Gridding of the color column is not implemented");
				else
				{
					{
						coord_type c_type_tmp = points.type;
						do
						{
							if (AXIS_INDEX.COLOR_AXIS == DefineConstants.NO_AXIS)
								break;
							if (!(z > -DefineConstants.VERYLARGE && z < DefineConstants.VERYLARGE))
							{
								c_type_tmp = coord_type.UNDEFINED;
								continue;
								break;
							}
							if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log)
							{
								if (z < 0.0)
								{
									c_type_tmp = coord_type.UNDEFINED;
									continue;
									break;
								}
								else if (z == 0.0)
								{
									points.ylow = -DefineConstants.VERYLARGE;
									c_type_tmp = coord_type.OUTRANGE;
									()0;
									break;
								}
								else
								{
									points.ylow = (Math.log(z) / GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].log_base);
								}
							}
							else
								points.ylow = z;
							if (this_plot.noautoscale)
								break;
							if (c_type_tmp != coord_type.INRANGE)
								break;
							if (AXIS_INDEX.COLOR_AXIS.getValue() < 0)
								break;
							if (z < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min)
								GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_min = z;
							if (z < GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min)
							{
								if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MIN != 0)
									GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].min = z;
								else
								{
									c_type_tmp = coord_type.OUTRANGE;
									()0;
									break;
								}
							}
							if (z > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max)
								GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].data_max = z;
							if (z > GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max)
							{
								if (GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].autoscale & e_autoscale.AUTOSCALE_MAX != 0)
									GlobalMembersAxis.axis_array[AXIS_INDEX.COLOR_AXIS.getValue()].max = z;
								else
								{
									c_type_tmp = coord_type.OUTRANGE;
									()0;
								}
							}
						} while (0);
					};
				}
			}
		}

		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(xx); // save to call free on NULL pointer if splines not used

		/* Delete the old non grid data. */
		for (oicrvs = old_iso_crvs; oicrvs != DefineConstants.NULL;)
		{
			oicrv = oicrvs;
			oicrvs = oicrvs.next;
			GlobalMembersMisc.iso_free(oicrv);
		}
	}

	/*
	 * The hardest part of this routine is collapsing the FUNC plot types in the
	 * list (which are gauranteed to occur in (x,y,z) triplets while preserving
	 * the non-FUNC type plots intact.  This means we have to work our way
	 * through various lists.  Examples (hand checked):
	 * start_plot:F1->F2->F3->NULL ==> F3->NULL
	 * start_plot:F1->F2->F3->F4->F5->F6->NULL ==> F3->F6->NULL
	 * start_plot:F1->F2->F3->D1->D2->F4->F5->F6->D3->NULL ==>
	 * F3->D1->D2->F6->D3->NULL
	 *
	 * x and y ranges now fixed in eval_3dplots
	 */
	public static void parametric_3dfixup(surface_points start_plot, int plot_num)
	{
		surface_points xp;
		surface_points new_list;
		surface_points free_list = DefineConstants.NULL;
		surface_points[] last_pointer = new_list;
		int tlen;
		int i;
		int surface;
		String new_title;

		/*
		 * Ok, go through all the plots and move FUNC3D types together.  Note:
		 * this originally was written to look for a NULL next pointer, but
		 * gnuplot wants to be sticky in grabbing memory and the right number of
		 * items in the plot list is controlled by the plot_num variable.
		 *
		 * Since gnuplot wants to do this sticky business, a free_list of
		 * surface_points is kept and then tagged onto the end of the plot list
		 * as this seems more in the spirit of the original memory behavior than
		 * simply freeing the memory.  I'm personally not convinced this sort of
		 * concern is worth it since the time spent computing points seems to
		 * dominate any garbage collecting that might be saved here...
		 */
		new_list = xp = start_plot;
		for (surface = 0; surface < plot_num; surface++)
		{
			if (xp.plot_type == PLOT_TYPE.FUNC3D)
			{
				surface_points yp = xp.next_sp;
				surface_points zp = yp.next_sp;

				/* Here's a FUNC3D parametric function defined as three parts.
				 * Go through all the points and assign the x's and y's from xp and
				 * yp to zp. min/max already done
				 */
				iso_curve xicrvs = xp.iso_crvs;
				iso_curve yicrvs = yp.iso_crvs;
				iso_curve zicrvs = zp.iso_crvs;

				plot_num -= 2;

				assert coord_type.INRANGE < coord_type.OUTRANGE && coord_type.OUTRANGE < coord_type.UNDEFINED;

				while (zicrvs != null)
				{
					//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
					//ORIGINAL LINE: struct coordinate  *xpoints = xicrvs->points;
					coordinate[] xpoints = new coordinate(xicrvs.points);
					//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
					//ORIGINAL LINE: struct coordinate  *ypoints = yicrvs->points;
					coordinate[] ypoints = new coordinate(yicrvs.points);
					//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
					//ORIGINAL LINE: struct coordinate  *zpoints = zicrvs->points;
					coordinate[] zpoints = new coordinate(zicrvs.points);

					for (i = 0; i < zicrvs.p_count; ++i)
					{
						zpoints[i].x = xpoints[i].z;
						zpoints[i].y = ypoints[i].z;
						if (zpoints[i].type < xpoints[i].type)
							zpoints[i].type = xpoints[i].type;
						if (zpoints[i].type < ypoints[i].type)
							zpoints[i].type = ypoints[i].type;

					}
					xicrvs = xicrvs.next;
					yicrvs = yicrvs.next;
					zicrvs = zicrvs.next;
				}

				/* Ok, fix up the title to include xp and yp plots. */
				if (((xp.title != null && xp.title.charAt(0) != '\0') || (yp.title != null && yp.title.charAt(0) != '\0')) && zp.title != null)
				{
					tlen = (xp.title != null ? xp.title.length() : 0) + (yp.title != null ? yp.title.length() : 0) + (zp.title != null ? zp.title.length() : 0) + 5;
					new_title = GlobalMembersAlloc.gp_alloc(tlen, "string");
					new_title = null;
					if (xp.title != null && xp.title.charAt(0) != '\0')
					{
						new_title += xp.title;
						new_title += ", "; // + 2
					}
					if (yp.title != null && yp.title.charAt(0) != '\0')
					{
						new_title += yp.title;
						new_title += ", "; // + 2
					}
					new_title += zp.title;
					//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(zp.title);
					zp.title = new_title;
				}
				/* add xp and yp to head of free list */
				assert xp.next_sp == yp;
				yp.next_sp = free_list;
				free_list = xp;

				/* add zp to tail of new_list */
				last_pointer = zp;
				last_pointer = &(zp.next_sp);
				xp = zp.next_sp;
			} // its a data plot
			else
			{
				assert last_pointer == xp; // think this is true !
				last_pointer = &(xp.next_sp);
				xp = xp.next_sp;
			}
		}

		/* Ok, append free list and write first_plot */
		last_pointer = free_list;
		first_3dplot = new_list;
	}

	/* HBB 20000508: moved these functions to the only module that uses them
	 * so they can be turned 'static' */
	/*
	 * sp_alloc() allocates a surface_points structure that can hold 'num_iso_1'
	 * iso-curves with 'num_samp_2' samples and 'num_iso_2' iso-curves with
	 * 'num_samp_1' samples.
	 * If, however num_iso_2 or num_samp_1 is zero no iso curves are allocated.
	 */
	public static surface_points sp_alloc(int num_samp_1, int num_iso_1, int num_samp_2, int num_iso_2)
	{
		lp_style_type default_lp_properties = new lp_style_type(0, -2, 0, 0, 1.0, DefineConstants.PTSZ_DEFAULT, false, {DefineConstants.TC_DEFAULT, 0, 0.0});

		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		surface_points sp = GlobalMembersAlloc.gp_alloc(sizeof(sp), "surface");
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(sp,0,sizeof(GlobalMembersMouse.struct surface_points));

		/* Initialize various fields */
		//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
		//ORIGINAL LINE: sp->lp_properties = default_lp_properties;
		sp.lp_properties.copyFrom(default_lp_properties);
		GlobalMembersGadgets.default_arrow_style((sp.arrow_properties));

		if (num_iso_2 > 0 && num_samp_1 > 0)
		{
			int i;
			iso_curve icrv;

			for (i = 0; i < num_iso_1; i++)
			{
				icrv = GlobalMembersMisc.iso_alloc(num_samp_2);
				icrv.next = sp.iso_crvs;
				sp.iso_crvs = icrv;
			}
			for (i = 0; i < num_iso_2; i++)
			{
				icrv = GlobalMembersMisc.iso_alloc(num_samp_1);
				icrv.next = sp.iso_crvs;
				sp.iso_crvs = icrv;
			}
		}

		return (sp);
	}

	/*
	 * sp_replace() updates a surface_points structure so it can hold 'num_iso_1'
	 * iso-curves with 'num_samp_2' samples and 'num_iso_2' iso-curves with
	 * 'num_samp_1' samples.
	 * If, however num_iso_2 or num_samp_1 is zero no iso curves are allocated.
	 */
	public static void sp_replace(surface_points sp, int num_samp_1, int num_iso_1, int num_samp_2, int num_iso_2)
	{
		int i;
		iso_curve icrv;
		iso_curve icrvs = sp.iso_crvs;

		while (icrvs != null)
		{
			icrv = icrvs;
			icrvs = icrvs.next;
			GlobalMembersMisc.iso_free(icrv);
		}
		sp.iso_crvs = DefineConstants.NULL;

		if (num_iso_2 > 0 && num_samp_1 > 0)
		{
			for (i = 0; i < num_iso_1; i++)
			{
				icrv = GlobalMembersMisc.iso_alloc(num_samp_2);
				icrv.next = sp.iso_crvs;
				sp.iso_crvs = icrv;
			}
			for (i = 0; i < num_iso_2; i++)
			{
				icrv = GlobalMembersMisc.iso_alloc(num_samp_1);
				icrv.next = sp.iso_crvs;
				sp.iso_crvs = icrv;
			}
		}
		else
			sp.iso_crvs = DefineConstants.NULL;
	}
	///#endif



	/* helper functions for grid_nongrid_data() */
	public static double splines_kernel(double h)
	{
		if (h > 0.0)
		{
			return h * h * Math.log(h);
		}
		return 0.0;
	}

	/* PKJ:
   This function has been hived off out of the original grid_nongrid_data().
   No changes have been made, but variables only needed locally have moved
   out of grid_nongrid_data() into this functin. */
	public static void thin_plate_splines_setup(iso_curve old_iso_crvs, double[] p_xx, int p_numpoints)
	{
		int i;
		int j;
		int k;
		double xx;
		double yy;
		double zz;
		double b;
		double[] K;
		double d;
		int numpoints;
		int indx;
		iso_curve oicrv;

		numpoints = 0;
		for (oicrv = old_iso_crvs; oicrv != DefineConstants.NULL; oicrv = oicrv.next)
		{
			numpoints += oicrv.p_count;
		}
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		xx = GlobalMembersAlloc.gp_alloc(sizeof(xx[0]) * (numpoints + 3) * (numpoints + 8), "thin plate splines in dgrid3d");
		/* the memory needed is not really (n+3)*(n+8) for now,
		   but might be if I take into account errors ... */
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		K = GlobalMembersAlloc.gp_alloc(sizeof(K[0]) * (numpoints + 3), "matrix : thin plate splines 2d");
		yy = xx + numpoints;
		zz = yy + numpoints;
		b = zz + numpoints;

		/* HBB 20010424: Count actual input points without the UNDEFINED
		 * ones, as we copy them */
		numpoints = 0;
		for (oicrv = old_iso_crvs; oicrv != DefineConstants.NULL; oicrv = oicrv.next)
		{
			//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
			//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
			//ORIGINAL LINE: struct coordinate  *opoints = oicrv->points;
			coordinate * opoints = new coordinate(oicrv.points);

			for (k = 0; k < oicrv.p_count; k++, opoints++)
			{
				/* HBB 20010424: avoid crashing for undefined input */
				if (opoints.type == coord_type.UNDEFINED)
					continue;
				xx[numpoints] = opoints.x;
				yy[numpoints] = opoints.y;
				zz[numpoints] = opoints.z;
				numpoints++;
			}
		}

		for (i = 0; i < numpoints + 3; i++)
		{
			K[i] = b + (numpoints + 3) * (i + 1);
		}

		for (i = 0; i < numpoints; i++)
		{
			for (j = i + 1; j < numpoints; j++)
			{
				double dx = xx[i] - xx[j];
				double dy = yy[i] - yy[j];
				K[i][j] = K[j][i] = -GlobalMembersPlot3d.splines_kernel(Math.sqrt(dx * dx + dy * dy));
			}
			K[i][i] = 0.0; // here will come the weights for errors
			b[i] = zz[i];
		}
		for (i = 0; i < numpoints; i++)
		{
			K[i][numpoints] = K[numpoints][i] = 1.0;
			K[i][numpoints + 1] = K[numpoints + 1][i] = xx[i];
			K[i][numpoints + 2] = K[numpoints + 2][i] = yy[i];
		}
		b[numpoints] = 0.0;
		b[numpoints + 1] = 0.0;
		b[numpoints + 2] = 0.0;
		K[numpoints][numpoints] = 0.0;
		K[numpoints][numpoints + 1] = 0.0;
		K[numpoints][numpoints + 2] = 0.0;
		K[numpoints + 1][numpoints] = 0.0;
		K[numpoints + 1][numpoints + 1] = 0.0;
		K[numpoints + 1][numpoints + 2] = 0.0;
		K[numpoints + 2][numpoints] = 0.0;
		K[numpoints + 2][numpoints + 1] = 0.0;
		K[numpoints + 2][numpoints + 2] = 0.0;
		//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		indx = GlobalMembersAlloc.gp_alloc(sizeof(indx[0]) * (numpoints + 3), "indexes lu");
		/* actually, K is *not* positive definite, but
		   has only non zero real eigenvalues ->
		   we can use an lu_decomp safely */
		GlobalMembersMatrix.lu_decomp(K, numpoints + 3, indx, d);
		GlobalMembersMatrix.lu_backsubst(K, numpoints + 3, indx, b);

		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(K);
		//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(indx);

		p_xx = xx;
		p_numpoints = numpoints;
	}
	public static double qnorm(double dist_x, double dist_y, int q)
	{
		double dist = 0.0;
		switch (q)
		{
		case 1:
			dist = dist_x + dist_y;
			break;
		case 2:
			dist = dist_x * dist_x + dist_y * dist_y;
			break;
		case 4:
			dist = dist_x * dist_x + dist_y * dist_y;
			dist *= dist;
			break;
		case 8:
			dist = dist_x * dist_x + dist_y * dist_y;
			dist *= dist;
			dist *= dist;
			break;
		case 16:
			dist = dist_x * dist_x + dist_y * dist_y;
			dist *= dist;
			dist *= dist;
			dist *= dist;
			break;
		default:
			dist = Math.pow(dist_x, (double)q) + Math.pow(dist_y, (double)q);
			break;
		}
		return dist;
	}

	/* This is from Numerical Recipes in C, 2nd ed, p70 */
	public static double pythag(double dx, double dy)
	{
		double x;
		double y;
		x = Math.abs(dx);
		y = Math.abs(dy);

		if (x > y)
		{
			return x * Math.sqrt(1.0 + (y * y) / (x * x));
		}
		if (y == 0.0)
		{
			return 0.0;
		}
		return y * Math.sqrt(1.0 + (x * x) / (y * y));
	}

	/* the curves/surfaces of the plot */
	public static surface_points first_3dplot = null;
	public static udft_entry plot_func = new udft_entry();

	public static int plot3d_num = 0;
}