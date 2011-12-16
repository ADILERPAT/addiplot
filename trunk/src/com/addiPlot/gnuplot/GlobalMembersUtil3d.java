package com.addiPlot.gnuplot;

public class GlobalMembersUtil3d
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
		return GlobalMembersAlloc.RCSid("$Id: util3d.c,v 1.36 2009/01/07 22:55:42 sfeam Exp $");
	}
	///#endif

/* single edge intersection algorithm */
/* Given two points, one inside and one outside the plot, return
 * the point where an edge of the plot intersects the line segment defined
 * by the two points.
 */


	/* Utility macros for vertices: */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FLAG_VERTEX_AS_UNDEFINED(v) do { (v).z = -2.0; } while (0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define VERTEX_IS_UNDEFINED(v) ((v).z == -2.0)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define V_EQUAL(a,b) ( GE(0.0, fabs((a)->x - (b)->x) + fabs((a)->y - (b)->y) + fabs((a)->z - (b)->z)) )


	/* Maps from normalized space to terminal coordinates */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define TERMCOORD(v,xvar,yvar) { xvar = ((int)((v)->x * xscaler)) + xmiddle; yvar = ((int)((v)->y * yscaler)) + ymiddle; }

	/* Prototypes of functions exported by "util3d.c" */

	public static void edge3d_intersect(coordinate[] points, int i, double ex, double ey, double ez)
	{
		int count;
		double ix = points[i - 1].x;
		double iy = points[i - 1].y;
		double iz = points[i - 1].z;
		double ox = points[i].x;
		double oy = points[i].y;
		double oz = points[i].z;
		double x; // possible intersection point
		double y;
		double z;

		if (points[i].type == coord_type.INRANGE)
		{
		/* swap points around so that ix/ix/iz are INRANGE and ox/oy/oz are OUTRANGE */
		x = ix;
		ix = ox;
		ox = x;
		y = iy;
		iy = oy;
		oy = y;
		z = iz;
		iz = oz;
		oz = z;
		}

		/* nasty degenerate cases, effectively drawing to an infinity point (?)
		   cope with them here, so don't process them as a "real" OUTRANGE point
	
		   If more than one coord is -VERYLARGE, then can't ratio the "infinities"
		   so drop out by returning FALSE */

		count = 0;
		if (ox == -DefineConstants.VERYLARGE)
		count++;
		if (oy == -DefineConstants.VERYLARGE)
		count++;
		if (oz == -DefineConstants.VERYLARGE)
		count++;

		/* either doesn't pass through 3D volume *or*
		   can't ratio infinities to get a direction to draw line, so return the INRANGE point */
		if (count > 1)
		{
		ex = ix;
		ey = iy;
		ez = iz;

		return;
		}
		if (count == 1)
		{
		ex = ix;
		ey = iy;
		ez = iz;

		if (ox == -DefineConstants.VERYLARGE)
		{
			ex = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min);
			return;
		}
		if (oy == -DefineConstants.VERYLARGE)
		{
			ey = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min);
			return;
		}
		/* obviously oz is -VERYLARGE and (ox != -VERYLARGE && oy != -VERYLARGE) */
		ez = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min);
		return;
		}
		/*
		 * Can't have case (ix == ox && iy == oy && iz == oz) as one point
		 * is INRANGE and one point is OUTRANGE.
		 */
		if (ix == ox)
		{
		if (iy == oy)
		{
			/* line parallel to z axis */

			/* assume iy in yrange, && ix in xrange */
			ex = ix; // == ox
			ey = iy; // == oy

			if ((((iz)<(oz)) ? ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) >= (iz)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) <= (oz))) : ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) >= (oz)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) <= (iz)))))
			ez = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max);
			else if ((((iz)<(oz)) ? ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) >= (iz)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) <= (oz))) : ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) >= (oz)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) <= (iz)))))
			ez = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min);
			else
			{
			GlobalMembersUtil.graph_error("error in edge3d_intersect");
			}

			return;
		}
		if (iz == oz)
		{
			/* line parallel to y axis */

			/* assume iz in zrange && ix in xrange */
			ex = ix; // == ox
			ez = iz; // == oz

			if ((((iy)<(oy)) ? ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) >= (iy)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) <= (oy))) : ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) >= (oy)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) <= (iy)))))
			ey = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max);
			else if ((((iy)<(oy)) ? ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) >= (iy)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) <= (oy))) : ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) >= (oy)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) <= (iy)))))
			ey = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min);
			else
			{
			GlobalMembersUtil.graph_error("error in edge3d_intersect");
			}

			return;
		}

		/* nasty 2D slanted line in a yz plane */


	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define INTERSECT_PLANE(cut, axis, eff, eff_axis, res_x, res_y, res_z) do { if ((((i##axis)<(o##axis)) ? (((cut)>=(i##axis)) && ((cut)<=(o##axis))) : (((cut)>=(o##axis)) && ((cut)<=(i##axis)))) && cut != i##axis && cut != o##axis) { eff = (cut - i##axis) * ((o##eff - i##eff) / (o##axis - i##axis)) + i##eff; if ((((axis_array[eff_axis].min)<(axis_array[eff_axis].max)) ? ((((eff))>=(axis_array[eff_axis].min)) && (((eff))<=(axis_array[eff_axis].max))) : ((((eff))>=(axis_array[eff_axis].max)) && (((eff))<=(axis_array[eff_axis].min))))) { *ex = res_x; *ey = res_y; *ez = res_z; return; } } } while (0)

		do
		{
			if ((((iy)<(oy)) ? ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) >= (iy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) <= (oy))) : ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) >= (oy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) <= (iy)))) && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) != iy && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) != oy)
			{
				z = ((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) - iy) * ((oz - iz) / (oy - iy)) + iz;
				if ((((y_array[z_y].min)<(y_array[z_y].max)) ? ((((z)) >= (y_array[z_y].min)) && (((z)) <= (y_array[z_y].max))) : ((((z)) >= (y_array[z_y].max)) && (((z)) <= (y_array[z_y].min)))))
				{
					ex = ix;
					ey = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min);
					ez = z;
					return;
				}
			}
		} while (0);
		do
		{
			if ((((iy)<(oy)) ? ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) >= (iy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) <= (oy))) : ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) >= (oy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) <= (iy)))) && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) != iy && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) != oy)
			{
				z = ((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) - iy) * ((oz - iz) / (oy - iy)) + iz;
				if ((((y_array[z_y].min)<(y_array[z_y].max)) ? ((((z)) >= (y_array[z_y].min)) && (((z)) <= (y_array[z_y].max))) : ((((z)) >= (y_array[z_y].max)) && (((z)) <= (y_array[z_y].min)))))
				{
					ex = ix;
					ey = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max);
					ez = z;
					return;
				}
			}
		} while (0);
		do
		{
			if ((((iz)<(oz)) ? ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) >= (iz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) <= (oz))) : ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) >= (oz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) <= (iz)))) && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) != iz && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) != oz)
			{
				y = ((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) - iz) * ((oy - iy) / (oz - iz)) + iy;
				if ((((z_array[y_z].min)<(z_array[y_z].max)) ? ((((y)) >= (z_array[y_z].min)) && (((y)) <= (z_array[y_z].max))) : ((((y)) >= (z_array[y_z].max)) && (((y)) <= (z_array[y_z].min)))))
				{
					ex = ix;
					ey = y;
					ez = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min);
					return;
				}
			}
		} while (0);
		do
		{
			if ((((iz)<(oz)) ? ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) >= (iz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) <= (oz))) : ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) >= (oz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) <= (iz)))) && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) != iz && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) != oz)
			{
				y = ((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) - iz) * ((oy - iy) / (oz - iz)) + iy;
				if ((((z_array[y_z].min)<(z_array[y_z].max)) ? ((((y)) >= (z_array[y_z].min)) && (((y)) <= (z_array[y_z].max))) : ((((y)) >= (z_array[y_z].max)) && (((y)) <= (z_array[y_z].min)))))
				{
					ex = ix;
					ey = y;
					ez = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max);
					return;
				}
			}
		} while (0);
		} // if (ix == ox)

		if (iy == oy)
		{
		/* already checked case (ix == ox && iy == oy) */
		if (oz == iz)
		{
			/* line parallel to x axis */

			/* assume inrange(iz) && inrange(iy) */
			ey = iy; // == oy
			ez = iz; // == oz

			if ((((ix)<(ox)) ? ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) >= (ix)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) <= (ox))) : ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) >= (ox)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) <= (ix)))))
			ex = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max);
			else if ((((ix)<(ox)) ? ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) >= (ix)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) <= (ox))) : ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) >= (ox)) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) <= (ix)))))
			ex = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min);
			else
			{
			GlobalMembersUtil.graph_error("error in edge3d_intersect");
			}

			return;
		}
		/* nasty 2D slanted line in an xz plane */

		do
		{
			if ((((ix)<(ox)) ? ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) >= (ix)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) <= (ox))) : ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) >= (ox)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) <= (ix)))) && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) != ix && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) != ox)
			{
				z = ((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) - ix) * ((oz - iz) / (ox - ix)) + iz;
				if ((((x_array[z_x].min)<(x_array[z_x].max)) ? ((((z)) >= (x_array[z_x].min)) && (((z)) <= (x_array[z_x].max))) : ((((z)) >= (x_array[z_x].max)) && (((z)) <= (x_array[z_x].min)))))
				{
					ex = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min);
					ey = iy;
					ez = z;
					return;
				}
			}
		} while (0);
		do
		{
			if ((((ix)<(ox)) ? ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) >= (ix)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) <= (ox))) : ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) >= (ox)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) <= (ix)))) && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) != ix && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) != ox)
			{
				z = ((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) - ix) * ((oz - iz) / (ox - ix)) + iz;
				if ((((x_array[z_x].min)<(x_array[z_x].max)) ? ((((z)) >= (x_array[z_x].min)) && (((z)) <= (x_array[z_x].max))) : ((((z)) >= (x_array[z_x].max)) && (((z)) <= (x_array[z_x].min)))))
				{
					ex = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max);
					ey = iy;
					ez = z;
					return;
				}
			}
		} while (0);
		do
		{
			if ((((iz)<(oz)) ? ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) >= (iz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) <= (oz))) : ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) >= (oz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) <= (iz)))) && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) != iz && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) != oz)
			{
				x = ((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) - iz) * ((ox - ix) / (oz - iz)) + ix;
				if ((((z_array[x_z].min)<(z_array[x_z].max)) ? ((((x)) >= (z_array[x_z].min)) && (((x)) <= (z_array[x_z].max))) : ((((x)) >= (z_array[x_z].max)) && (((x)) <= (z_array[x_z].min)))))
				{
					ex = x;
					ey = iy;
					ez = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min);
					return;
				}
			}
		} while (0);
		do
		{
			if ((((iz)<(oz)) ? ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) >= (iz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) <= (oz))) : ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) >= (oz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) <= (iz)))) && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) != iz && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) != oz)
			{
				x = ((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) - iz) * ((ox - ix) / (oz - iz)) + ix;
				if ((((z_array[x_z].min)<(z_array[x_z].max)) ? ((((x)) >= (z_array[x_z].min)) && (((x)) <= (z_array[x_z].max))) : ((((x)) >= (z_array[x_z].max)) && (((x)) <= (z_array[x_z].min)))))
				{
					ex = x;
					ey = iy;
					ez = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max);
					return;
				}
			}
		} while (0);
		} // if(iy==oy)

		if (iz == oz)
		{
		/* already checked cases (ix == ox && iz == oz) and (iy == oy
		   && iz == oz) */

		/* 2D slanted line in an xy plane */

		/* assume inrange(oz) */

		do
		{
			if ((((ix)<(ox)) ? ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) >= (ix)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) <= (ox))) : ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) >= (ox)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) <= (ix)))) && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) != ix && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) != ox)
			{
				y = ((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) - ix) * ((oy - iy) / (ox - ix)) + iy;
				if ((((x_array[y_x].min)<(x_array[y_x].max)) ? ((((y)) >= (x_array[y_x].min)) && (((y)) <= (x_array[y_x].max))) : ((((y)) >= (x_array[y_x].max)) && (((y)) <= (x_array[y_x].min)))))
				{
					ex = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min);
					ey = y;
					ez = iz;
					return;
				}
			}
		} while (0);
		do
		{
			if ((((ix)<(ox)) ? ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) >= (ix)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) <= (ox))) : ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) >= (ox)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) <= (ix)))) && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) != ix && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) != ox)
			{
				y = ((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) - ix) * ((oy - iy) / (ox - ix)) + iy;
				if ((((x_array[y_x].min)<(x_array[y_x].max)) ? ((((y)) >= (x_array[y_x].min)) && (((y)) <= (x_array[y_x].max))) : ((((y)) >= (x_array[y_x].max)) && (((y)) <= (x_array[y_x].min)))))
				{
					ex = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max);
					ey = y;
					ez = iz;
					return;
				}
			}
		} while (0);
		do
		{
			if ((((iy)<(oy)) ? ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) >= (iy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) <= (oy))) : ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) >= (oy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) <= (iy)))) && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) != iy && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) != oy)
			{
				x = ((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) - iy) * ((ox - ix) / (oy - iy)) + ix;
				if ((((y_array[x_y].min)<(y_array[x_y].max)) ? ((((x)) >= (y_array[x_y].min)) && (((x)) <= (y_array[x_y].max))) : ((((x)) >= (y_array[x_y].max)) && (((x)) <= (y_array[x_y].min)))))
				{
					ex = x;
					ey = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min);
					ez = iz;
					return;
				}
			}
		} while (0);
		do
		{
			if ((((iy)<(oy)) ? ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) >= (iy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) <= (oy))) : ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) >= (oy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) <= (iy)))) && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) != iy && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) != oy)
			{
				x = ((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) - iy) * ((ox - ix) / (oy - iy)) + ix;
				if ((((y_array[x_y].min)<(y_array[x_y].max)) ? ((((x)) >= (y_array[x_y].min)) && (((x)) <= (y_array[x_y].max))) : ((((x)) >= (y_array[x_y].max)) && (((x)) <= (y_array[x_y].min)))))
				{
					ex = x;
					ey = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max);
					ez = iz;
					return;
				}
			}
		} while (0);
		} // if(iz==oz)
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#undef INTERSECT_PLANE

		/* really nasty general slanted 3D case */

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define INTERSECT_DIAG(cut, axis, eff, eff_axis, eff2, eff2_axis, res_x, res_y, res_z) do { if ((((i##axis)<(o##axis)) ? (((cut)>=(i##axis)) && ((cut)<=(o##axis))) : (((cut)>=(o##axis)) && ((cut)<=(i##axis)))) && cut != i##axis && cut != o##axis) { eff = (cut - i##axis) * ((o##eff - i##eff) / (o##axis - i##axis)) + i##eff; eff2 = (cut - i##axis) * ((o##eff2 - i##eff2) / (o##axis - i##axis)) + i##eff2; if ((((axis_array[eff_axis].min)<(axis_array[eff_axis].max)) ? ((((eff))>=(axis_array[eff_axis].min)) && (((eff))<=(axis_array[eff_axis].max))) : ((((eff))>=(axis_array[eff_axis].max)) && (((eff))<=(axis_array[eff_axis].min)))) && (((axis_array[eff2_axis].min)<(axis_array[eff2_axis].max)) ? ((((eff2))>=(axis_array[eff2_axis].min)) && (((eff2))<=(axis_array[eff2_axis].max))) : ((((eff2))>=(axis_array[eff2_axis].max)) && (((eff2))<=(axis_array[eff2_axis].min))))) { *ex = res_x; *ey = res_y; *ez = res_z; return; } } } while (0)

		do
		{
			if ((((ix)<(ox)) ? ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) >= (ix)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) <= (ox))) : ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) >= (ox)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) <= (ix)))) && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) != ix && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) != ox)
			{
				y = ((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) - ix) * ((oy - iy) / (ox - ix)) + iy;
				y2 = ((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) - ix) * ((oy2 - iy2) / (ox - ix)) + iy2;
				if ((((x_array[y_x].min)<(x_array[y_x].max)) ? ((((y)) >= (x_array[y_x].min)) && (((y)) <= (x_array[y_x].max))) : ((((y)) >= (x_array[y_x].max)) && (((y)) <= (x_array[y_x].min)))) && (((x_array[y2_x].min)<(x_array[y2_x].max)) ? ((((y2)) >= (x_array[y2_x].min)) && (((y2)) <= (x_array[y2_x].max))) : ((((y2)) >= (x_array[y2_x].max)) && (((y2)) <= (x_array[y2_x].min)))))
				{
					ex = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min);
					ey = y;
					ez = z;
					return;
				}
			}
		} while (0);
		do
		{
			if ((((ix)<(ox)) ? ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) >= (ix)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) <= (ox))) : ((((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) >= (ox)) && (((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) <= (ix)))) && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) != ix && (x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) != ox)
			{
				y = ((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) - ix) * ((oy - iy) / (ox - ix)) + iy;
				y2 = ((x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : x_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max) - ix) * ((oy2 - iy2) / (ox - ix)) + iy2;
				if ((((x_array[y_x].min)<(x_array[y_x].max)) ? ((((y)) >= (x_array[y_x].min)) && (((y)) <= (x_array[y_x].max))) : ((((y)) >= (x_array[y_x].max)) && (((y)) <= (x_array[y_x].min)))) && (((x_array[y2_x].min)<(x_array[y2_x].max)) ? ((((y2)) >= (x_array[y2_x].min)) && (((y2)) <= (x_array[y2_x].max))) : ((((y2)) >= (x_array[y2_x].max)) && (((y2)) <= (x_array[y2_x].min)))))
				{
					ex = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max);
					ey = y;
					ez = z;
					return;
				}
			}
		} while (0);

		do
		{
			if ((((iy)<(oy)) ? ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) >= (iy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) <= (oy))) : ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) >= (oy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) <= (iy)))) && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) != iy && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) != oy)
			{
				x = ((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) - iy) * ((ox - ix) / (oy - iy)) + ix;
				x2 = ((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) - iy) * ((ox2 - ix2) / (oy - iy)) + ix2;
				if ((((y_array[x_y].min)<(y_array[x_y].max)) ? ((((x)) >= (y_array[x_y].min)) && (((x)) <= (y_array[x_y].max))) : ((((x)) >= (y_array[x_y].max)) && (((x)) <= (y_array[x_y].min)))) && (((y_array[x2_y].min)<(y_array[x2_y].max)) ? ((((x2)) >= (y_array[x2_y].min)) && (((x2)) <= (y_array[x2_y].max))) : ((((x2)) >= (y_array[x2_y].max)) && (((x2)) <= (y_array[x2_y].min)))))
				{
					ex = x;
					ey = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min);
					ez = z;
					return;
				}
			}
		} while (0);
		do
		{
			if ((((iy)<(oy)) ? ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) >= (iy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) <= (oy))) : ((((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) >= (oy)) && (((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) <= (iy)))) && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) != iy && (y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) != oy)
			{
				x = ((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) - iy) * ((ox - ix) / (oy - iy)) + ix;
				x2 = ((y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : y_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max) - iy) * ((ox2 - ix2) / (oy - iy)) + ix2;
				if ((((y_array[x_y].min)<(y_array[x_y].max)) ? ((((x)) >= (y_array[x_y].min)) && (((x)) <= (y_array[x_y].max))) : ((((x)) >= (y_array[x_y].max)) && (((x)) <= (y_array[x_y].min)))) && (((y_array[x2_y].min)<(y_array[x2_y].max)) ? ((((x2)) >= (y_array[x2_y].min)) && (((x2)) <= (y_array[x2_y].max))) : ((((x2)) >= (y_array[x2_y].max)) && (((x2)) <= (y_array[x2_y].min)))))
				{
					ex = x;
					ey = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max);
					ez = z;
					return;
				}
			}
		} while (0);

		do
		{
			if ((((iz)<(oz)) ? ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) >= (iz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) <= (oz))) : ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) >= (oz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) <= (iz)))) && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) != iz && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) != oz)
			{
				x = ((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) - iz) * ((ox - ix) / (oz - iz)) + ix;
				x2 = ((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) - iz) * ((ox2 - ix2) / (oz - iz)) + ix2;
				if ((((z_array[x_z].min)<(z_array[x_z].max)) ? ((((x)) >= (z_array[x_z].min)) && (((x)) <= (z_array[x_z].max))) : ((((x)) >= (z_array[x_z].max)) && (((x)) <= (z_array[x_z].min)))) && (((z_array[x2_z].min)<(z_array[x2_z].max)) ? ((((x2)) >= (z_array[x2_z].min)) && (((x2)) <= (z_array[x2_z].max))) : ((((x2)) >= (z_array[x2_z].max)) && (((x2)) <= (z_array[x2_z].min)))))
				{
					ex = x;
					ey = y;
					ez = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min);
					return;
				}
			}
		} while (0);
		do
		{
			if ((((iz)<(oz)) ? ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) >= (iz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) <= (oz))) : ((((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) >= (oz)) && (((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) <= (iz)))) && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) != iz && (z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) != oz)
			{
				x = ((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) - iz) * ((ox - ix) / (oz - iz)) + ix;
				x2 = ((z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : z_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max) - iz) * ((ox2 - ix2) / (oz - iz)) + ix2;
				if ((((z_array[x_z].min)<(z_array[x_z].max)) ? ((((x)) >= (z_array[x_z].min)) && (((x)) <= (z_array[x_z].max))) : ((((x)) >= (z_array[x_z].max)) && (((x)) <= (z_array[x_z].min)))) && (((z_array[x2_z].min)<(z_array[x2_z].max)) ? ((((x2)) >= (z_array[x2_z].min)) && (((x2)) <= (z_array[x2_z].max))) : ((((x2)) >= (z_array[x2_z].max)) && (((x2)) <= (z_array[x2_z].min)))))
				{
					ex = x;
					ey = y;
					ez = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].range_flags & DefineConstants.RANGE_REVERSE ? GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min : GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max);
					return;
				}
			}
		} while (0);

	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	///#undef INTERSECT_DIAG

		/* If we reach here, the inrange point is on the edge, and
		 * the line segment from the outrange point does not cross any
		 * other edges to get there. In this case, we return the inrange
		 * point as the 'edge' intersection point. This will basically draw
		 * line.
		 */
		ex = ix;
		ey = iy;
		ez = iz;
		return;
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
	public static boolean two_edge3d_intersect(coordinate[] points, int i, double[] lx, double[] ly, double[] lz)
	{
		int count;
		/* global axis_array[FIRST_{X,Y,Z}_AXIS].{min,max} */
		double ix = points[i - 1].x;
		double iy = points[i - 1].y;
		double iz = points[i - 1].z;
		double ox = points[i].x;
		double oy = points[i].y;
		double oz = points[i].z;
		double[] t = new double[6];
		double swap;
		double x; // possible intersection point
		double y;
		double z;
		double t_min;
		double t_max;

		/* nasty degenerate cases, effectively drawing to an infinity point (?)
		   cope with them here, so don't process them as a "real" OUTRANGE point
	
		   If more than one coord is -VERYLARGE, then can't ratio the "infinities"
		   so drop out by returning FALSE */

		count = 0;
		if (ix == -DefineConstants.VERYLARGE)
		count++;
		if (ox == -DefineConstants.VERYLARGE)
		count++;
		if (iy == -DefineConstants.VERYLARGE)
		count++;
		if (oy == -DefineConstants.VERYLARGE)
		count++;
		if (iz == -DefineConstants.VERYLARGE)
		count++;
		if (oz == -DefineConstants.VERYLARGE)
		count++;

		/* either doesn't pass through 3D volume *or*
		   can't ratio infinities to get a direction to draw line, so simply return(FALSE) */
		if (count > 1)
		{
		return (false);
		}

		if (ox == -DefineConstants.VERYLARGE || ix == -DefineConstants.VERYLARGE)
		{
		if (ix == -DefineConstants.VERYLARGE)
		{
			/* swap points so ix/iy/iz don't have a -VERYLARGE component */
			x = ix;
			ix = ox;
			ox = x;
			y = iy;
			iy = oy;
			oy = y;
			z = iz;
			iz = oz;
			oz = z;
		}
		/* check actually passes through the 3D graph volume */

		if (ix > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? ((((iy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && (((iy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : ((((iy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && (((iy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) ? ((((iz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) && (((iz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max))) : ((((iz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) && (((iz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)))))
		{
			lx[0] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min;
			ly[0] = iy;
			lz[0] = iz;

			lx[1] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max;
			ly[1] = iy;
			lz[1] = iz;

			return (true);
		}
		else
		{
			return (false);
		}
		}
		if (oy == -DefineConstants.VERYLARGE || iy == -DefineConstants.VERYLARGE)
		{
		if (iy == -DefineConstants.VERYLARGE)
		{
			/* swap points so ix/iy/iz don't have a -VERYLARGE component */
			x = ix;
			ix = ox;
			ox = x;
			y = iy;
			iy = oy;
			oy = y;
			z = iz;
			iz = oz;
			oz = z;
		}
		/* check actually passes through the 3D graph volume */
		if (iy > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? ((((ix)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && (((ix)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : ((((ix)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && (((ix)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) ? ((((iz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) && (((iz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max))) : ((((iz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) && (((iz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)))))
		{
			lx[0] = ix;
			ly[0] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min;
			lz[0] = iz;

			lx[1] = ix;
			ly[1] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max;
			lz[1] = iz;

			return (true);
		}
		else
		{
			return (false);
		}
		}
		if (oz == -DefineConstants.VERYLARGE || iz == -DefineConstants.VERYLARGE)
		{
		if (iz == -DefineConstants.VERYLARGE)
		{
			/* swap points so ix/iy/iz don't have a -VERYLARGE component */
			x = ix;
			ix = ox;
			ox = x;
			y = iy;
			iy = oy;
			oy = y;
			z = iz;
			iz = oz;
			oz = z;
		}
		/* check actually passes through the 3D graph volume */
		if (iz > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? ((((ix)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && (((ix)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : ((((ix)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && (((ix)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? ((((iy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && (((iy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : ((((iy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && (((iy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))))
		{
			lx[0] = ix;
			ly[0] = iy;
			lz[0] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min;

			lx[1] = ix;
			ly[1] = iy;
			lz[1] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max;

			return (true);
		}
		else
		{
			return (false);
		}
		}
		/*
		 * Quick outcode tests on the 3d graph volume
		 */

		/* test z coord first --- most surface OUTRANGE points generated
		 * between axis_array[FIRST_Z_AXIS].min and baseplane (i.e. when
		 * ticslevel is non-zero)
		 */
		if (((iz) > (oz) ? (iz) : (oz)) < GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min || ((iz) < (oz) ? (iz) : (oz)) > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)
		return (false);

		if (((ix) > (ox) ? (ix) : (ox)) < GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min || ((ix) < (ox) ? (ix) : (ox)) > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)
		return (false);

		if (((iy) > (oy) ? (iy) : (oy)) < GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min || ((iy) < (oy) ? (iy) : (oy)) > GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)
		return (false);

		/* Special horizontal/vertical, etc. cases are checked and
		 * remaining slant lines are checked separately.
		 *
		 * The slant line intersections are solved using the parametric
		 * form of the equation for a line, since if we test x/y/z min/max
		 * planes explicitly then e.g. a line passing through a corner
		 * point (x_min,y_min,z_min) actually intersects all 3 planes and
		 * hence further tests would be required to anticipate this and
		 * similar situations. */

		/* Can have case (ix == ox && iy == oy && iz == oz) as both points
		 * OUTRANGE */
		if (ix == ox && iy == oy && iz == oz)
		{
		/* but as only define single outrange point, can't intersect
		 * 3D graph volume */
		return (false);
		}

		if (ix == ox)
		{
		if (iy == oy)
		{
			/* line parallel to z axis */

			/* x and y coords must be in range, and line must span
			 * both FIRST_Z_AXIS->min and ->max.
			 *
			 * note that spanning FIRST_Z_AXIS->min implies spanning
			 * ->max as both points OUTRANGE */

			if (!(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? ((((ix)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && (((ix)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : ((((ix)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && (((ix)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))) || !(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? ((((iy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && (((iy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : ((((iy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && (((iy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))))
			{
			return (false);
			}
			if ((((iz)<(oz)) ? (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) >= (iz)) && ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) <= (oz))) : (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) >= (oz)) && ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min) <= (iz)))))
			{
			lx[0] = ix;
			ly[0] = iy;
			lz[0] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min;

			lx[1] = ix;
			ly[1] = iy;
			lz[1] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max;

			return (true);
			}
			else
			return (false);
		}
		if (iz == oz)
		{
			/* line parallel to y axis */
			if (!(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? ((((ix)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && (((ix)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : ((((ix)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && (((ix)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))) || !(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) ? ((((iz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) && (((iz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max))) : ((((iz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) && (((iz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)))))
			{
			return (false);
			}
			if ((((iy)<(oy)) ? (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) >= (iy)) && ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) <= (oy))) : (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) >= (oy)) && ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min) <= (iy)))))
			{
			lx[0] = ix;
			ly[0] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min;
			lz[0] = iz;

			lx[1] = ix;
			ly[1] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max;
			lz[1] = iz;

			return (true);
			}
			else
			return (false);
		}


		/* nasty 2D slanted line in a yz plane */
		if (!(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? ((((ox)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && (((ox)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : ((((ox)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && (((ox)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))))
			return (false);

		t[0] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min - iy) / (oy - iy);
		t[1] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max - iy) / (oy - iy);

		if (t[0] > t[1])
		{
			swap = t[0];
			t[0] = t[1];
			t[1] = swap;
		}
		t[2] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min - iz) / (oz - iz);
		t[3] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max - iz) / (oz - iz);

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

		lx[0] = ix;
		ly[0] = iy + t_min * (oy - iy);
		lz[0] = iz + t_min * (oz - iz);

		lx[1] = ix;
		ly[1] = iy + t_max * (oy - iy);
		lz[1] = iz + t_max * (oz - iz);

		/* Can only have 0 or 2 intersection points -- only need test
		 * one coord */
		if ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? ((((ly[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && (((ly[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : ((((ly[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && (((ly[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) ? ((((lz[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) && (((lz[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max))) : ((((lz[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) && (((lz[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)))))
		{
			return (true);
		}
		return (false);
		}

		if (iy == oy)
		{
		/* already checked case (ix == ox && iy == oy) */
		if (oz == iz)
		{
			/* line parallel to x axis */
			if (!(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? ((((iy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && (((iy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : ((((iy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && (((iy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))) || !(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) ? ((((iz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) && (((iz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max))) : ((((iz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) && (((iz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)))))
			{
			return (false);
			}
			if ((((ix)<(ox)) ? (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) >= (ix)) && ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) <= (ox))) : (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) >= (ox)) && ((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min) <= (ix)))))
			{
			lx[0] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min;
			ly[0] = iy;
			lz[0] = iz;

			lx[1] = GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max;
			ly[1] = iy;
			lz[1] = iz;

			return (true);
			}
			else
			return (false);
		}
		/* nasty 2D slanted line in an xz plane */

		if (!(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? ((((oy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && (((oy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : ((((oy)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && (((oy)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))))
			return (false);

		t[0] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min - ix) / (ox - ix);
		t[1] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max - ix) / (ox - ix);

		if (t[0] > t[1])
		{
			swap = t[0];
			t[0] = t[1];
			t[1] = swap;
		}
		t[2] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min - iz) / (oz - iz);
		t[3] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max - iz) / (oz - iz);

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
		ly[0] = iy;
		lz[0] = iz + t_min * (oz - iz);

		lx[1] = ix + t_max * (ox - ix);
		ly[1] = iy;
		lz[1] = iz + t_max * (oz - iz);

		/*
		 * Can only have 0 or 2 intersection points -- only need test one coord
		 */
		if ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? ((((lx[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && (((lx[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : ((((lx[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && (((lx[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) ? ((((lz[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) && (((lz[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max))) : ((((lz[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) && (((lz[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)))))
		{
			return (true);
		}
		return (false);
		}
		if (iz == oz)
		{
		/* already checked cases (ix == ox && iz == oz) and (iy == oy
		   && iz == oz) */

		/* nasty 2D slanted line in an xy plane */

		if (!(((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) ? ((((oz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) && (((oz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max))) : ((((oz)) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) && (((oz)) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)))))
			return (false);

		t[0] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min - ix) / (ox - ix);
		t[1] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max - ix) / (ox - ix);

		if (t[0] > t[1])
		{
			swap = t[0];
			t[0] = t[1];
			t[1] = swap;
		}
		t[2] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min - iy) / (oy - iy);
		t[3] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max - iy) / (oy - iy);

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
		lz[0] = iz;

		lx[1] = ix + t_max * (ox - ix);
		ly[1] = iy + t_max * (oy - iy);
		lz[1] = iz;

		/*
		 * Can only have 0 or 2 intersection points -- only need test one coord
		 */
		if ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? ((((lx[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && (((lx[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : ((((lx[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && (((lx[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? ((((ly[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && (((ly[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : ((((ly[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && (((ly[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))))
		{
			return (true);
		}
		return (false);
		}
		/* really nasty general slanted 3D case */

		/*
		   Solve parametric equation
	
		   (ix, iy, iz) + t (diff_x, diff_y, diff_z)
	
		   where 0.0 <= t <= 1.0 and
	
		   diff_x = (ox - ix);
		   diff_y = (oy - iy);
		   diff_z = (oz - iz);
		 */

		t[0] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min - ix) / (ox - ix);
		t[1] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max - ix) / (ox - ix);

		if (t[0] > t[1])
		{
		swap = t[0];
		t[0] = t[1];
		t[1] = swap;
		}
		t[2] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min - iy) / (oy - iy);
		t[3] = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max - iy) / (oy - iy);

		if (t[2] > t[3])
		{
		swap = t[2];
		t[2] = t[3];
		t[3] = swap;
		}
		t[4] = (iz == oz) ? 0.0 : (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min - iz) / (oz - iz);
		t[5] = (iz == oz) ? 1.0 : (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max - iz) / (oz - iz);

		if (t[4] > t[5])
		{
		swap = t[4];
		t[4] = t[5];
		t[5] = swap;
		}
		t_min = ((((t[0]) > (t[2]) ? (t[0]) : (t[2]))) > (((t[4]) > (0.0) ? (t[4]) : (0.0))) ? (((t[0]) > (t[2]) ? (t[0]) : (t[2]))) : (((t[4]) > (0.0) ? (t[4]) : (0.0))));
		t_max = ((((t[1]) < (t[3]) ? (t[1]) : (t[3]))) < (((t[5]) < (1.0) ? (t[5]) : (1.0))) ? (((t[1]) < (t[3]) ? (t[1]) : (t[3]))) : (((t[5]) < (1.0) ? (t[5]) : (1.0))));

		if (t_min > t_max)
		return (false);

		lx[0] = ix + t_min * (ox - ix);
		ly[0] = iy + t_min * (oy - iy);
		lz[0] = iz + t_min * (oz - iz);

		lx[1] = ix + t_max * (ox - ix);
		ly[1] = iy + t_max * (oy - iy);
		lz[1] = iz + t_max * (oz - iz);

		/*
		 * Can only have 0 or 2 intersection points -- only need test one coord
		 */
		if ((((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) ? ((((lx[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)) && (((lx[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max))) : ((((lx[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].max)) && (((lx[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_X_AXIS.getValue()].min)))) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) ? ((((ly[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)) && (((ly[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max))) : ((((ly[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].max)) && (((ly[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Y_AXIS.getValue()].min)))) && (((GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)<(GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) ? ((((lz[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)) && (((lz[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max))) : ((((lz[0])) >= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].max)) && (((lz[0])) <= (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].min)))))
		{
		return (true);
		}
		return (false);
	}

///#if 0 // HBB 990829: unused --> commented out
////void
////mat_trans(double tx, double ty, double tz, transform_matrix mat)
////{
////    mat_unit(mat);		// Make it unit matrix. 
////    mat[3][0] = tx;
////    mat[3][1] = ty;
////    mat[3][2] = tz;
////}
///#endif // commented out 

	public static void mat_scale(double sx, double sy, double sz, double[][] mat)
	{
		GlobalMembersUtil3d.mat_unit(mat); // Make it unit matrix.
		mat[0][0] = sx;
		mat[1][1] = sy;
		mat[2][2] = sz;
	}
	public static void mat_rot_x(double teta, double[][] mat)
	{
		double cos_teta;
		double sin_teta;

		teta *= DefineConstants.M_PI / 180.0;
		cos_teta = Math.cos(teta);
		sin_teta = Math.sin(teta);

		GlobalMembersUtil3d.mat_unit(mat); // Make it unit matrix.
		mat[1][1] = cos_teta;
		mat[1][2] = -sin_teta;
		mat[2][1] = sin_teta;
		mat[2][2] = cos_teta;
	}

///#if 0 // HBB 990829: unused --> commented out
////void
////mat_rot_y(double teta, transform_matrix mat)
////{
////    double cos_teta, sin_teta;
////
////    teta *= DEG2RAD;
////    cos_teta = cos(teta);
////    sin_teta = sin(teta);
////
////    mat_unit(mat);		// Make it unit matrix. 
////    mat[0][0] = cos_teta;
////    mat[0][2] = -sin_teta;
////    mat[2][0] = sin_teta;
////    mat[2][2] = cos_teta;
////}
///#endif // commented out 

	public static void mat_rot_z(double teta, double[][] mat)
	{
		double cos_teta;
		double sin_teta;

		teta *= DefineConstants.M_PI / 180.0;
		cos_teta = Math.cos(teta);
		sin_teta = Math.sin(teta);

		GlobalMembersUtil3d.mat_unit(mat); // Make it unit matrix.
		mat[0][0] = cos_teta;
		mat[0][1] = -sin_teta;
		mat[1][0] = sin_teta;
		mat[1][1] = cos_teta;
	}

/* Multiply two transform_matrix. Result can be one of two operands. */
	public static void mat_mult(double[][] mat_res, double[][] mat1, double[][] mat2)
	{
		int i;
		int j;
		int k;
		double[][] mat_res_temp = new double[4][4];

		for (i = 0; i < 4; i++)
		for (j = 0; j < 4; j++)
		{
			mat_res_temp[i][j] = 0;
			for (k = 0; k < 4; k++)
			mat_res_temp[i][j] += mat1[i][k] * mat2[k][j];
		}
		for (i = 0; i < 4; i++)
		for (j = 0; j < 4; j++)
			mat_res[i][j] = mat_res_temp[i][j];
	}

/* Performs transformation from 'user coordinates' to a normalized
 * vector in 'graph coordinates' (-1..1 in all three directions).  */
	public static void map3d_xyz(double x, double y, double z, vertex GPHUGE out)
	{
		int i;
		int j;
		double[] V = new double[4]; // Homogeneous coords. vectors.
		double[] Res = new double[4];

		/* Normalize object space to -1..1 */
		V[0] = ((x - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersGraph3d.xscale3d + GlobalMembersGraph3d.xcenter3d - 1.0);
		V[1] = ((y - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersGraph3d.yscale3d + GlobalMembersGraph3d.ycenter3d - 1.0);
		V[2] = ((z - GlobalMembersGraph3d.floor_z) * GlobalMembersGraph3d.zscale3d + GlobalMembersGraph3d.zcenter3d - 1.0);
		V[3] = 1.0;

		/* Res[] = V[] * trans_mat[][] (uses row-vectors) */
		for (i = 0; i < 4; i++)
		{
		Res[i] = GlobalMembersGraph3d.trans_mat[3][i]; // V[3] is 1. anyway
		for (j = 0; j < 3; j++)
			Res[i] += V[j] * GlobalMembersGraph3d.trans_mat[j][i];
		}

		if (Res[3] == 0)
		Res[3] = 1.0e-5;

		out.x = Res[0] / Res[3];
		out.y = Res[1] / Res[3];
		out.z = Res[2] / Res[3];
		/* store z for later color calculation */
		out.real_z = z;
		out.label = DefineConstants.NULL;
	}

/* Function to map from user 3D space to normalized 'camera' view
 * space, and from there directly to terminal coordinates */
	public static void map3d_xy(double x, double y, double z, int xt, int yt)
	{
		double xtd;
		double ytd;
		GlobalMembersUtil3d.map3d_xy_double(x, y, z, xtd, ytd);
		xt = xtd;
		yt = ytd;
	}
	public static void map3d_xy_double(double x, double y, double z, double xt, double yt)
	{
		int i;
		int j;
		double[] v = new double[4]; // Homogeneous coords. vectors.
		double[] res = new double[4];
		double w = GlobalMembersGraph3d.trans_mat[3][3];

		v[0] = ((x - GlobalMembersAxis.axis_array[GlobalMembersAxis.x_axis.getValue()].min) * GlobalMembersGraph3d.xscale3d + GlobalMembersGraph3d.xcenter3d - 1.0);
		v[1] = ((y - GlobalMembersAxis.axis_array[GlobalMembersAxis.y_axis.getValue()].min) * GlobalMembersGraph3d.yscale3d + GlobalMembersGraph3d.ycenter3d - 1.0);
		v[2] = ((z - GlobalMembersGraph3d.floor_z) * GlobalMembersGraph3d.zscale3d + GlobalMembersGraph3d.zcenter3d - 1.0);
		v[3] = 1.0;

		for (i = 0; i < 2; i++) // Dont use the third axes (z).
		{
		res[i] = GlobalMembersGraph3d.trans_mat[3][i]; // Initiate it with the weight factor
		for (j = 0; j < 3; j++)
			res[i] += v[j] * GlobalMembersGraph3d.trans_mat[j][i];
		}

		for (i = 0; i < 3; i++)
		w += v[i] * GlobalMembersGraph3d.trans_mat[i][3];
		if (w == 0)
		w = 1e-5;

		xt = ((res[0] * GlobalMembersGraph3d.xscaler / w) + GlobalMembersGraph3d.xmiddle);
		yt = ((res[1] * GlobalMembersGraph3d.yscaler / w) + GlobalMembersGraph3d.ymiddle);
	}
	public static void draw3d_line(vertex GPHUGE v1, vertex GPHUGE v2, lp_style_type lp)
	{
	///#ifndef LITE
		/* hidden3d routine can't work if no surface was drawn at all */
		if (GlobalMembersGraph3d.hidden3d && GlobalMembersGraph3d.draw_surface)
		{
		GlobalMembersHidden3d.draw_line_hidden(v1, v2, lp);
		return;
		}
	///#endif

		GlobalMembersUtil3d.draw3d_line_unconditional(v1, v2, lp, lp.l_type);

	}

/* Moved this upward, to make optional inlining in draw3d_line easier
 * for compilers */
/* HBB 20021128: removed GP_INLINE qualifier to avoid MSVC++ silliness */
	public static void draw3d_line_unconditional(vertex GPHUGE v1, vertex GPHUGE v2, lp_style_type lp, int linetype)
	{
		int x1;
		int y1;
		int x2;
		int y2;
		lp_style_type ls = lp;

		/* HBB 20020312: v2 can be NULL, if this call is coming from
		draw_line_hidden. --> redirect to point drawing routine */
		if (v2 == null)
		{
		GlobalMembersUtil3d.draw3d_point_unconditional(v1, lp);
		return;
		}

		{
			x1 = ((int)((v1).x * GlobalMembersGraph3d.xscaler)) + GlobalMembersGraph3d.xmiddle;
			y1 = ((int)((v1).y * GlobalMembersGraph3d.yscaler)) + GlobalMembersGraph3d.ymiddle;
		};
		{
			x2 = ((int)((v2).x * GlobalMembersGraph3d.xscaler)) + GlobalMembersGraph3d.xmiddle;
			y2 = ((int)((v2).y * GlobalMembersGraph3d.yscaler)) + GlobalMembersGraph3d.ymiddle;
		};

		/* User-specified line styles */
		if (GlobalMembersGadgets.prefer_line_styles && linetype >= 0)
		GlobalMembersTerm.lp_use_properties(ls, linetype + 1);

		/* The usual case of auto-generated line types */
		else
		ls.l_type = linetype;

		/* Color by Z value */
		if (ls.pm3d_color.type == DefineConstants.TC_Z)
			ls.pm3d_color.value = (v1.real_z + v2.real_z) * 0.5;

		GlobalMembersTerm.term_apply_lp_properties(ls);
		GlobalMembersGadgets.draw_clip_line(x1, y1, x2, y2);
	}

/* HBB 20000621: new routine, to allow for hiding point symbols behind
 * the surface */
	public static void draw3d_point(vertex GPHUGE v, lp_style_type lp)
	{
	///#ifndef LITE
		/* hidden3d routine can't work if no surface was drawn at all */
		if (GlobalMembersGraph3d.hidden3d && GlobalMembersGraph3d.draw_surface)
		{
		/* Draw vertex as a zero-length edge */
		GlobalMembersHidden3d.draw_line_hidden(v, DefineConstants.NULL, lp);
		return;
		}
	///#endif

		GlobalMembersUtil3d.draw3d_point_unconditional(v, lp);
	}

	/* HBB NEW 20031218: 3D polyline support */
	public static void polyline3d_start(vertex GPHUGE v1)
	{
		int x1;
		int y1;

		polyline3d_previous_vertex = v1;
	///#ifndef LITE
		if (GlobalMembersGraph3d.hidden3d && GlobalMembersGraph3d.draw_surface)
		return;
	///#endif // LITE

		/* EAM - This may now be unneeded. But I'm not sure. */
		/*       Perhaps the hidden3d code needs the move.   */
		{
			x1 = ((int)((v1).x * GlobalMembersGraph3d.xscaler)) + GlobalMembersGraph3d.xmiddle;
			y1 = ((int)((v1).y * GlobalMembersGraph3d.yscaler)) + GlobalMembersGraph3d.ymiddle;
		};
		GlobalMembersTerm.term.move(x1, y1);
	}
	public static void polyline3d_next(vertex GPHUGE v2, lp_style_type lp)
	{
		int x1;
		int y1;
		int x2;
		int y2;

		/* Copied from draw3d_line(): */
	///#ifndef LITE
		/* FIXME HBB 20031218: hidden3d mode will still create isolated
		 * edges! */
		if (GlobalMembersGraph3d.hidden3d && GlobalMembersGraph3d.draw_surface)
		{
		GlobalMembersHidden3d.draw_line_hidden(polyline3d_previous_vertex, v2, lp);
		polyline3d_previous_vertex = v2;
		return;
		}
	///#endif

		/* Copied from draw3d_line_unconditional: */
		/* If use_palette is active, polylines can't be used -->
		 * revert back to old method */
		if (lp.use_palette)
		{
		GlobalMembersUtil3d.draw3d_line_unconditional(polyline3d_previous_vertex, v2, lp, lp.l_type);
		polyline3d_previous_vertex = v2;
		return;

		}

		{
			x1 = ((int)((polyline3d_previous_vertex).x * GlobalMembersGraph3d.xscaler)) + GlobalMembersGraph3d.xmiddle;
			y1 = ((int)((polyline3d_previous_vertex).y * GlobalMembersGraph3d.yscaler)) + GlobalMembersGraph3d.ymiddle;
		};
		{
			x2 = ((int)((v2).x * GlobalMembersGraph3d.xscaler)) + GlobalMembersGraph3d.xmiddle;
			y2 = ((int)((v2).y * GlobalMembersGraph3d.yscaler)) + GlobalMembersGraph3d.ymiddle;
		};
		GlobalMembersGadgets.draw_clip_line(x1, y1, x2, y2);
		polyline3d_previous_vertex = v2;
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
	///#ifndef LITE
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

	/* HBB 990826: all that stuff referenced from other modules is now
	 * exported in graph3d.h, instead of being listed here */

	/* Prototypes for local functions */
	public static void mat_unit(double[][] mat)
	{
		int i;
		int j;

		for (i = 0; i < 4; i++)
		for (j = 0; j < 4; j++)
			if (i == j)
			mat[i][j] = 1.0;
			else
			mat[i][j] = 0.0;
	}

/* HBB 20020313: New routine, broken out of draw3d_point, to be used
 * to output a single point without any checks for hidden3d */
	public static __inline__ void draw3d_point_unconditional(vertex GPHUGE v, lp_style_type lp)
	{
		int x;
		int y;

		{
			x = ((int)((v).x * GlobalMembersGraph3d.xscaler)) + GlobalMembersGraph3d.xmiddle;
			y = ((int)((v).y * GlobalMembersGraph3d.yscaler)) + GlobalMembersGraph3d.ymiddle;
		};
		GlobalMembersTerm.term_apply_lp_properties(lp);
		/* HBB 20010822: implemented "linetype palette" for points, too */
		if (lp.use_palette)
		{
		GlobalMembersColor.set_color(GlobalMembersPm3d.cb2gray(GlobalMembersPm3d.z2cb(v.real_z)));
		}
		if (GlobalMembersGadgets.clip_point(x, y) == 0)
		(GlobalMembersTerm.term.point)(x, y, lp.p_type);
	}

	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define IN_AXIS_RANGE(val, axis) (((axis_array[axis].min)<(axis_array[axis].max)) ? ((((val))>=(axis_array[axis].min)) && (((val))<=(axis_array[axis].max))) : ((((val))>=(axis_array[axis].max)) && (((val))<=(axis_array[axis].min))))

	/* HBB NEW 20031218: tools for drawing polylines in 3D with a semantic
	 * like term->move() and term->vector() */

	/* Previous points 3D position */
	public static vertex polyline3d_previous_vertex = new vertex();
}