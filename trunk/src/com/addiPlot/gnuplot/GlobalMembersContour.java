package com.addiPlot.gnuplot;

public class GlobalMembersContour
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
		return GlobalMembersAlloc.RCSid("$Id: contour.c,v 1.28 2008/03/30 18:08:07 sfeam Exp $");
	}
	///#endif


	/* Used to allocate the tri-diag matrix. */

	/* Variables of contour.c needed by other modules: */

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern sbyte contour_format[32];
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern en_contour_kind contour_kind;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern en_contour_levels_kind contour_levels_kind;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int contour_levels;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int contour_order;
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern int contour_pts;

	/* storage for z levels to draw contours at */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern dynarray dyn_contour_levels_list;

/*
 * Entry routine to this whole set of contouring module.
 */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define contour_levels_list ((double *)dyn_contour_levels_list.v)

	/* Prototypes of functions exported by contour.c */

	public static gnuplot_contours contour(int num_isolines, iso_curve iso_lines)
	{
		int i;
		int num_of_z_levels; // # Z contour levels.
		poly_struct p_polys;
		poly_struct p_poly;
		edge_struct p_edges;
		edge_struct * edge GPHUGE * ;
		double z = 0;
		double dz = 0;
		gnuplot_contours save_contour_list;

		/* HBB FIXME 20050804: The number of contour_levels as set by 'set
		 * cnrparam lev inc a,b,c' is almost certainly wrong if z axis is
		 * logarithmic */
		num_of_z_levels = contour_levels;
		interp_kind = contour_kind;

		contour_list = DefineConstants.NULL;

		/*
		 * Calculate min/max values :
		 */
		GlobalMembersContour.calc_min_max(num_isolines, iso_lines, x_min, y_min, z_min, x_max, y_max, z_max);

		/*
		 * Generate list of edges (p_edges) and list of triangles (p_polys):
		 */
		GlobalMembersContour.gen_triangle(num_isolines, iso_lines, p_polys, p_edges);
		crnt_cntr_pt_index = 0;

		if (contour_levels_kind == en_contour_levels_kind.LEVELS_AUTO)
		{
		dz = Math.abs(z_max - z_min);
		if (dz == 0)
			return DefineConstants.NULL; // empty z range ?
		/* Find a tic step that will generate approximately the
		 * desired number of contour levels. The "* 2" is historical.
		 * */
		dz = GlobalMembersAxis.quantize_normal_tics(dz, ((int) contour_levels + 1) * 2);
		z = Math.floor(z_min / dz) * dz;
		num_of_z_levels = (int) Math.floor((z_max - z) / dz);
		}
		for (i = 0; i < num_of_z_levels; i++)
		{
		switch (contour_levels_kind)
		{
		case LEVELS_AUTO:
			z += dz;
			break;
		case LEVELS_INCREMENTAL:
			z = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log ? (Math.log((double)dyn_contour_levels_list.v[0]) / GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log_base) : ((double)dyn_contour_levels_list.v[0])) + i * (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log ? (Math.log((double)dyn_contour_levels_list.v[1]) / GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log_base) : ((double)dyn_contour_levels_list.v[1]));
			break;
		case LEVELS_DISCRETE:
			z = (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log ? (Math.log((double)dyn_contour_levels_list.v[i]) / GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log_base) : ((double)dyn_contour_levels_list.v[i]));
			break;
		}
		contour_level = z;
		save_contour_list = contour_list;
		GlobalMembersContour.gen_contours(p_edges, z, x_min, x_max, y_min, y_max);
		if (contour_list != save_contour_list)
		{
			contour_list.isNewLevel = 1;
			String.format(contour_list.label, contour_format, (GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log ? Math.exp((z) * GlobalMembersAxis.axis_array[AXIS_INDEX.FIRST_Z_AXIS.getValue()].log_base): (z)));
			contour_list.z = z;
		}
		}

		/* Free all contouring related temporary data. */
		while (p_polys != null)
		{
		p_poly = p_polys.next;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p_polys);
		p_polys = p_poly;
		}
		while (p_edges != null)
		{
		edge GPHUGE * = p_edges.next;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p_edges);
		p_edges = edge GPHUGE * ;
		}

		return contour_list;
	}

/*
 * Solve tri diagonal linear system equation. The tri diagonal matrix is
 * defined via matrix M, right side is r, and solution X i.e. M * X = R.
 * Size of system given in n. Return TRUE if solution exist.
 */
/* not used any more in "contour.c", but in "spline.c" (21. Dec. 1995) ! */

	public static int solve_tri_diag(double[][] m, double[] r, double[] x, int n)
	{
		int i;
		double t;

		for (i = 1; i < n; i++) // Eliminate element m[i][i-1] (lower diagonal).
		{
		if (m[i - 1][1] == 0)
			return false;
		t = m[i][0] / m[i - 1][1]; // Find ratio between the two lines.
	/*      m[i][0] = m[i][0] - m[i-1][1] * t; */
	/* m[i][0] is not used any more (and set to 0 in the above line) */
		m[i][1] = m[i][1] - m[i - 1][2] * t;
		r[i] = r[i] - r[i - 1] * t;
		}
		/* Now do back subtitution - update the solution vector X: */
		if (m[n - 1][1] == 0)
		return false;
		x[n - 1] = r[n - 1] / m[n - 1][1]; // Find last element.
		for (i = n - 2; i >= 0; i--)
		{
		if (m[i][1] == 0)
			return false;
		x[i] = (r[i] - x[i + 1] * m[i][2]) / m[i][1];
		}
		return true;
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
	/*  #include "setshow.h" */

	/* exported variables (to be handled by the 'set' and friends): */

	public static String contour_format = "%8.3g"; // format for contour key entries
	public static en_contour_kind contour_kind = en_contour_kind.CONTOUR_KIND_LINEAR;
	public static en_contour_levels_kind contour_levels_kind = en_contour_levels_kind.LEVELS_AUTO;
	public static int contour_levels = DefineConstants.DEFAULT_CONTOUR_LEVELS;
	public static int contour_order = DefineConstants.DEFAULT_CONTOUR_ORDER;
	public static int contour_pts = DefineConstants.DEFAULT_NUM_APPROX_PTS;

	/* storage for z levels to draw contours at */
	public static dynarray dyn_contour_levels_list = new dynarray();

	public static gnuplot_contours contour_list = DefineConstants.NULL;
	public static double[] crnt_cntr = new double[DefineConstants.MAX_POINTS_PER_CNTR * 2];
	public static int crnt_cntr_pt_index = 0;
	public static double contour_level = 0.0;

	/* Linear, Cubic interp., Bspline: */
	public static en_contour_kind interp_kind = en_contour_kind.CONTOUR_KIND_LINEAR;

	public static double x_min; // Minimum values of x, y, and z
	public static double y_min;
	public static double z_min;
	public static double x_max; // Maximum values of x, y, and z
	public static double y_max;
	public static double z_max;

/*
 * Adds another point to the currently build contour.
 */

	public static void add_cntr_point(double x, double y)
	{
		int index;

		if (crnt_cntr_pt_index >= DefineConstants.MAX_POINTS_PER_CNTR - 1)
		{
		index = crnt_cntr_pt_index - 1;
		GlobalMembersContour.end_crnt_cntr();
		crnt_cntr[0] = crnt_cntr[index * 2];
		crnt_cntr[1] = crnt_cntr[index * 2 + 1];
		crnt_cntr_pt_index = 1; // Keep the last point as first of this one.
		}
		crnt_cntr[crnt_cntr_pt_index * 2] = x;
		crnt_cntr[crnt_cntr_pt_index * 2 + 1] = y;
		crnt_cntr_pt_index++;
	}

/*
 * Done with current contour - create gnuplot data structure for it.
 */
	public static void end_crnt_cntr()
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		gnuplot_contours cntr = GlobalMembersAlloc.gp_alloc(sizeof(GlobalMembersMouse.struct gnuplot_contours), "gnuplot_contour");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		cntr.coords = GlobalMembersAlloc.gp_alloc(sizeof(GlobalMembersMouse.struct coordinate) * crnt_cntr_pt_index, "contour coords");

		for (i = 0; i < crnt_cntr_pt_index; i++)
		{
		cntr.coords[i].x = crnt_cntr[i * 2];
		cntr.coords[i].y = crnt_cntr[i * 2 + 1];
		cntr.coords[i].z = contour_level;
		}
		cntr.num_pts = crnt_cntr_pt_index;

		cntr.next = contour_list;
		contour_list = cntr;
		contour_list.isNewLevel = 0;

		crnt_cntr_pt_index = 0;
	}

/*
 * Generates all contours by tracing the intersecting triangles.
 */
	public static void gen_contours(edge_struct p_edges, double z_level, double xx_min, double xx_max, double yy_min, double yy_max)
	{
		int num_active; // Number of edges marked ACTIVE.
		boolean contr_isclosed; // Is this contour a closed line?
		cntr_struct p_cntr;

		num_active = GlobalMembersContour.update_all_edges(p_edges, z_level); // Do pass 1.

		contr_isclosed = false; // Start to look for contour on boundaries.

		while (num_active > 0) // Do Pass 2.
		{
		/* Generate One contour (and update NumActive as needed): */
		p_cntr = GlobalMembersContour.gen_one_contour(p_edges, z_level, contr_isclosed, num_active);
		/* Emit it in requested format: */
		GlobalMembersContour.put_contour(p_cntr, xx_min, xx_max, yy_min, yy_max, contr_isclosed);
		}
	}

/*
 * Does pass 1, or marks the edges which are active (crosses this z_level)
 * Returns number of active edges (marked ACTIVE).
 */
	public static int update_all_edges(edge_struct p_edges, double z_level)
	{
		int count = 0;

		while (p_edges != null)
		{
		/* use the same test at both vertices to avoid roundoff errors */
		if ((p_edges.vertex[0].z >= z_level) != (p_edges.vertex[1].z >= z_level))
		{
			p_edges.is_active = true;
			count++;
		}
		else
			p_edges.is_active = false;
		p_edges = p_edges.next;
		}

		return count;
	}

/*
 * Does pass 2, or find one complete contour out of the triangulation
 * data base:
 *
 * Returns a pointer to the contour (as linked list), contr_isclosed
 * tells if the contour is a closed line or not, and num_active is
 * updated.
 */
	public static cntr_struct gen_one_contour(edge_struct p_edges, double z_level, boolean contr_isclosed, int num_active)
	{
		edge_struct pe_temp;

		if (!contr_isclosed)
		{
		/* Look for something to start with on boundary: */
		pe_temp = p_edges;
		while (pe_temp != null)
		{
			if (pe_temp.is_active && (pe_temp.position == en_edge_position.BOUNDARY))
			break;
			pe_temp = pe_temp.next;
		}
		if (pe_temp == null)
			contr_isclosed = true; // No more contours on boundary.
		else
		{
			return GlobalMembersContour.trace_contour(pe_temp, z_level, num_active, contr_isclosed);
		}
		}
		if (contr_isclosed)
		{
		/* Look for something to start with inside: */
		pe_temp = p_edges;
		while (pe_temp != null)
		{
			if (pe_temp.is_active && (pe_temp.position != en_edge_position.BOUNDARY))
			break;
			pe_temp = pe_temp.next;
		}
		if (pe_temp == null)
		{
			num_active = 0;
			fprintf(stderr, "gen_one_contour: no contour found\n");
			return DefineConstants.NULL;
		}
		else
		{
			contr_isclosed = true;
			return GlobalMembersContour.trace_contour(pe_temp, z_level, num_active, contr_isclosed);
		}
		}
		return DefineConstants.NULL; // We should never be here, but lint...
	}

/*
 * Search the data base along a contour starts at the edge pe_start until
 * a boundary edge is detected or until we close the loop back to pe_start.
 * Returns a linked list of all the points on the contour
 * Also decreases num_active by the number of points on contour.
 */
	public static cntr_struct trace_contour(edge_struct pe_start, double z_level, int num_active, boolean contr_isclosed)
	{
		cntr_struct p_cntr;
		cntr_struct pc_tail;
		edge_struct * edge GPHUGE *, *p_next_edge;
		poly_struct p_poly;
		poly_struct PLastpoly = DefineConstants.NULL;
		int i;

		edge GPHUGE * = pe_start; // first edge to start contour

		/* Generate the header of the contour - the point on pe_start. */
		if (!contr_isclosed)
		{
		pe_start.is_active = false;
		num_active--;
		}
		if (edge GPHUGE * .poly[0] || edge GPHUGE * .poly[1]) // more than one point
		{

		p_cntr = pc_tail = GlobalMembersContour.update_cntr_pt(pe_start, z_level); // first point

		do
		{
			/* Find polygon to continue (Not where we came from - PLastpoly): */
			if (edge GPHUGE * .poly[0] == PLastpoly)
			p_poly = edge GPHUGE * .poly[1];
			else
			p_poly = edge GPHUGE * .poly[0];
			p_next_edge = DefineConstants.NULL; // In case of error, remains NULL.
			for (i = 0; i < 3; i++) // Test the 3 edges of the polygon:
			if (p_poly.edge[i] != edge GPHUGE *)
				if (p_poly.edge[i].is_active)
				p_next_edge = p_poly.edge[i];
			if (!p_next_edge) // Error exit
			{
			pc_tail.next = DefineConstants.NULL;
			GlobalMembersContour.free_contour(p_cntr);
			fprintf(stderr, "trace_contour: unexpected end of contour\n");
			return DefineConstants.NULL;
			}
			edge GPHUGE * = p_next_edge;
			PLastpoly = p_poly;
			edge GPHUGE * .is_active = false;
			num_active--;

			/* Do not allocate contour points on diagonal edges */
			if (edge GPHUGE * .position != en_edge_position.DIAGONAL)
			{

			pc_tail.next = GlobalMembersContour.update_cntr_pt(edge GPHUGE *, z_level);

			/* Remove nearby points */
			if (GlobalMembersContour.fuzzy_equal(pc_tail, pc_tail.next) != 0)
			{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(pc_tail.next);
			}
			else
				pc_tail = pc_tail.next;
			}
		} while ((edge GPHUGE * != pe_start) && (edge GPHUGE * .position != en_edge_position.BOUNDARY));

		pc_tail.next = DefineConstants.NULL;

		/* For closed contour the first and last point should be equal */
		if (pe_start == edge GPHUGE *)
		{
			(p_cntr.X) = (pc_tail.X);
			(p_cntr.Y) = (pc_tail.Y);
		}
		} // only one point, forget it
		else
		{
		p_cntr = DefineConstants.NULL;
		}

		return p_cntr;
	}

/*
 * Allocates one contour location and update it to to correct position
 * according to z_level and edge p_edge.
 */
	public static cntr_struct update_cntr_pt(edge_struct * edge GPHUGE UnnamedParameter1, double z_level)
	{
		double t;
		cntr_struct p_cntr;

		t = (z_level - edge GPHUGE * .vertex[0].z) / (edge GPHUGE * .vertex[1].z - edge GPHUGE * .vertex[0].z);

		/* test if t is out of interval [0:1] (should not happen but who knows ...) */
		t = (t < 0.0 ? 0.0 : t);
		t = (t > 1.0 ? 1.0 : t);

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p_cntr = GlobalMembersAlloc.gp_alloc(sizeof(cntr_struct), "contour cntr_struct");

		p_cntr.X = edge GPHUGE * .vertex[1].x * t + edge GPHUGE * .vertex[0].x * (1 - t);
		p_cntr.Y = edge GPHUGE * .vertex[1].y * t + edge GPHUGE * .vertex[0].y * (1 - t);
		return p_cntr;
	}

/* Simple routine to decide if two contour points are equal by
 * calculating the relative error (< EPSILON).  */
/* HBB 20010121: don't use absolute value 'zero' to compare to data
 * values. */
	public static int fuzzy_equal(cntr_struct p_cntr1, cntr_struct p_cntr2)
	{
		double unit_x;
		double unit_y;
		unit_x = Math.abs(x_max - x_min); // reference
		unit_y = Math.abs(y_max - y_min);
		return ((Math.abs(p_cntr1.X - p_cntr2.X) < unit_x * DefineConstants.EPSILON) && (Math.abs(p_cntr1.Y - p_cntr2.Y) < unit_y * DefineConstants.EPSILON));
	}

/*
 * Generate the triangles.
 * Returns the lists (edges & polys) via pointers to their heads.
 */


	public static void gen_triangle(int num_isolines, iso_curve iso_lines, poly_struct[] p_polys, edge_struct[] p_edges)
	{
		int i;
		int j;
		int grid_x_max = iso_lines.p_count;
		edge_struct p_edge1;
		edge_struct p_edge2;
		edge_struct edge0;
		edge_struct edge1;
		edge_struct edge2;
		edge_struct pe_tail;
		edge_struct pe_tail2;
		edge_struct pe_temp;
		poly_struct pp_tail;
		poly_struct lower_tri;
		poly_struct upper_tri;
		/* HBB 980308: need to tag *each* of them as GPHUGE! */
		coordinate p_vrtx1;
		coordinate p_vrtx2;

		p_polys = pp_tail = DefineConstants.NULL; // clear lists
		p_edges = pe_tail = DefineConstants.NULL;

		p_vrtx1 = iso_lines.points; // first row of vertices
		p_edge1 = pe_tail = DefineConstants.NULL; // clear list of edges

		/* Generate edges of first row */
		for (j = 0; j < grid_x_max - 1; j++)
		GlobalMembersContour.add_edge(p_vrtx1 + j, p_vrtx1 + j + 1, p_edge1, pe_tail);

		p_edges = p_edge1; // update main list


		/*
		 * Combines vertices to edges and edges to triangles:
		 * ==================================================
		 * The edges are stored in the edge list, referenced by p_edges
		 * (pe_tail points on last edge).
		 *
		 * Temporary pointers:
		 * 1. p_edge2: Top horizontal edge list:      +-----------------------+ 2
		 * 2. p_tail : end of middle edge list:       |\  |\  |\  |\  |\  |\  |
		 *                                            |  \|  \|  \|  \|  \|  \|
		 * 3. p_edge1: Bottom horizontal edge list:   +-----------------------+ 1
		 *
		 * pe_tail2  : end of list beginning at p_edge2
		 * pe_temp   : position inside list beginning at p_edge1
		 * p_edges   : head of the master edge list (part of our output)
		 * p_vrtx1   : start of lower row of input vertices
		 * p_vrtx2   : start of higher row of input vertices
		 *
		 * The routine generates two triangle            Lower      Upper 1
		 * upper one and lower one:                     | \           ----
		 * (Nums. are edges order in polys)            0|   \1       0\   |2
		 * The polygons are stored in the polygon        ----           \ |
		 * list (*p_polys) (pp_tail points on             2
		 * last polygon).
		 *                                                        1
		 *                                                   -----------
		 * In addition, the edge lists are updated -        | \   0     |
		 * each edge has two pointers on the two            |   \       |
		 * (one active if boundary) polygons which         0|1   0\1   0|1
		 * uses it. These two pointer to polygons           |       \   |
		 * are named: poly[0], poly[1]. The diagram         |    1    \ |
		 * on the right show how they are used for the       -----------
		 * upper and lower polygons (INNER_MESH polygons only).  0
		 */

		for (i = 1; i < num_isolines; i++)
		{
		/* Read next column and gen. polys. */
		iso_lines = iso_lines.next;

		p_vrtx2 = iso_lines.points; // next row of vertices
		p_edge2 = pe_tail2 = DefineConstants.NULL; // clear top horizontal list
		pe_temp = p_edge1; // pointer in bottom list

		/*
		 * Generate edges and triagles for next row:
		 */

		/* generate first vertical edge */
		edge2 = GlobalMembersContour.add_edge(p_vrtx1, p_vrtx2, p_edges, pe_tail);

		for (j = 0; j < grid_x_max - 1; j++)
		{

			/* copy vertical edge for lower triangle */
			edge0 = edge2;

			if (pe_temp != null && pe_temp.vertex[0] == p_vrtx1 + j)
			{
			/* test lower edge */
			edge2 = pe_temp;
			pe_temp = pe_temp.next;
			}
			else
			{
			edge2 = DefineConstants.NULL; // edge is undefined
			}

			/* generate diagonal edge */
			edge1 = GlobalMembersContour.add_edge(p_vrtx1 + j + 1, p_vrtx2 + j, p_edges, pe_tail);
			if (edge1 != null)
			edge1.position = en_edge_position.DIAGONAL;

			/* generate lower triangle */
			lower_tri = GlobalMembersContour.add_poly(edge0, edge1, edge2, p_polys, pp_tail);

			/* copy diagonal edge for upper triangle */
			edge0 = edge1;

			/* generate upper edge */
			edge1 = GlobalMembersContour.add_edge(p_vrtx2 + j, p_vrtx2 + j + 1, p_edge2, pe_tail2);

			/* generate vertical edge */
			edge2 = GlobalMembersContour.add_edge(p_vrtx1 + j + 1, p_vrtx2 + j + 1, p_edges, pe_tail);

			/* generate upper triangle */
			upper_tri = GlobalMembersContour.add_poly(edge0, edge1, edge2, p_polys, pp_tail);
		}

		if (p_edge2 != null)
		{
			/* HBB 19991130 bugfix: if p_edge2 list is empty,
			 * don't change p_edges list! Crashes by access
			 * to NULL pointer pe_tail, the second time through,
			 * otherwise */
			if ((p_edges)) // Chain new edges to main list.
			{
			pe_tail.next = p_edge2;
			pe_tail = pe_tail2;
			}
			else
			{
			p_edges = p_edge2;
			pe_tail = pe_tail2;
			}
		}

		/* this row finished, move list heads up one row: */
		p_edge1 = p_edge2;
		p_vrtx1 = p_vrtx2;
		}

		/* Update the boundary flag, saved in each edge, and update indexes: */

		pe_temp = (p_edges);

		while (pe_temp != null)
		{
		if ((!(pe_temp.poly[0])) || (!(pe_temp.poly[1])))
			(pe_temp.position) = en_edge_position.BOUNDARY;
		pe_temp = pe_temp.next;
		}
	}

/*
 * Calculate minimum and maximum values
 */
	public static void calc_min_max(int num_isolines, iso_curve iso_lines, double xx_min, double yy_min, double zz_min, double xx_max, double yy_max, double zz_max)
	{
		int i;
		int j;
		int grid_x_max;
		coordinate[] vertex;

		grid_x_max = iso_lines.p_count; // number of vertices per iso_line

		xx_min = (yy_min) = (zz_min) = DefineConstants.VERYLARGE; // clear min/max values
		xx_max = (yy_max) = (zz_max) = -DefineConstants.VERYLARGE;

		for (j = 0; j < num_isolines; j++)
		{

//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
//ORIGINAL LINE: vertex = iso_lines->points;
		vertex.copyFrom(iso_lines.points);

		for (i = 0; i < grid_x_max; i++)
		{
			if (vertex[i].type != coord_type.UNDEFINED)
			{
			if (vertex[i].x > (xx_max))
				xx_max = vertex[i].x;
			if (vertex[i].y > (yy_max))
				yy_max = vertex[i].y;
			if (vertex[i].z > (zz_max))
				zz_max = vertex[i].z;
			if (vertex[i].x < (xx_min))
				xx_min = vertex[i].x;
			if (vertex[i].y < (yy_min))
				yy_min = vertex[i].y;
			if (vertex[i].z < (zz_min))
				zz_min = vertex[i].z;
			}
		}
		iso_lines = iso_lines.next;
		}

		/*
		 * fprintf(stderr," x: %g, %g\n", (*xx_min), (*xx_max));
		 * fprintf(stderr," y: %g, %g\n", (*yy_min), (*yy_max));
		 * fprintf(stderr," z: %g, %g\n", (*zz_min), (*zz_max));
		 */
	}

/*
 * Generate new edge and append it to list, but only if both vertices are
 * defined. The list is referenced by p_edge and pe_tail (p_edge points on
 * first edge and pe_tail on last one).
 * Note, the list may be empty (pe_edge==pe_tail==NULL) on entry and exit.
 */
	public static edge_struct add_edge(coordinate point0, coordinate point1, edge_struct * edge[] GPHUGE UnnamedParameter1, edge_struct[] pe_tail)
	{
		edge_struct pe_temp = DefineConstants.NULL;

	///#if 1
		if (point0.type == coord_type.INRANGE && point1.type == coord_type.INRANGE)
	///#else
	//    if (point0->type != UNDEFINED && point1->type != UNDEFINED)
	///#endif
		{
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pe_temp = GlobalMembersAlloc.gp_alloc(sizeof(edge_struct), "contour edge");

		pe_temp.poly[0] = DefineConstants.NULL; // clear links
		pe_temp.poly[1] = DefineConstants.NULL;
		pe_temp.vertex[0] = point0; // First vertex of edge.
		pe_temp.vertex[1] = point1; // Second vertex of edge.
		pe_temp.next = DefineConstants.NULL;
		pe_temp.position = en_edge_position.INNER_MESH; // default position in mesh

		if ((pe_tail))
		{
			pe_tail.next = pe_temp; // Stick new record as last one.
		}
		else
		{
			(*edge GPHUGE *) = pe_temp; // start new list if empty
		}
		pe_tail = pe_temp; // continue to last record.

		}
		return pe_temp; // returns NULL, if no edge allocated
	}

/*
 * Generate new triangle and append it to list, but only if all edges are defined.
 * The list is referenced by p_poly and pp_tail (p_poly points on first ploygon
 * and pp_tail on last one).
 * Note, the list may be empty (pe_ploy==pp_tail==NULL) on entry and exit.
 */
	public static poly_struct add_poly(edge_struct edge0, edge_struct edge1, edge_struct edge2, poly_struct[] p_poly, poly_struct[] pp_tail)
	{
		poly_struct pp_temp = DefineConstants.NULL;

		if (edge0 != null && edge1 != null && edge2 != null)
		{
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pp_temp = GlobalMembersAlloc.gp_alloc(sizeof(poly_struct), "contour polygon");

		pp_temp.edge[0] = edge0; // First edge of triangle
		pp_temp.edge[1] = edge1; // Second one
		pp_temp.edge[2] = edge2; // Third one
		pp_temp.next = DefineConstants.NULL;

		if (edge0.poly[0] != null) // update edge0
			edge0.poly[1] = pp_temp;
		else
			edge0.poly[0] = pp_temp;

		if (edge1.poly[0] != null) // update edge1
			edge1.poly[1] = pp_temp;
		else
			edge1.poly[0] = pp_temp;

		if (edge2.poly[0] != null) // update edge2
			edge2.poly[1] = pp_temp;
		else
			edge2.poly[0] = pp_temp;

		if ((pp_tail)) // Stick new record as last one.
			pp_tail.next = pp_temp;
		else
			p_poly = pp_temp; // start new list if empty

		pp_tail = pp_temp; // continue to last record.

		}
		return pp_temp; // returns NULL, if no edge allocated
	}

/*
 * Calls the (hopefully) desired interpolation/approximation routine.
 */

	public static void put_contour(cntr_struct p_cntr, double xx_min, double xx_max, double yy_min, double yy_max, boolean contr_isclosed)
	{

		if (p_cntr == null)
		return; // Nothing to do if it is empty contour.

		switch (interp_kind)
		{
		case CONTOUR_KIND_LINEAR: // No interpolation/approximation.
		GlobalMembersContour.put_contour_nothing(p_cntr);
		break;
		case CONTOUR_KIND_CUBIC_SPL: // Cubic spline interpolation.
		GlobalMembersContour.put_contour_cubic(p_cntr, xx_min, xx_max, yy_min, yy_max, GlobalMembersContour.chk_contour_kind(p_cntr, contr_isclosed));

		break;
		case CONTOUR_KIND_BSPLINE: // Bspline approximation.
		GlobalMembersContour.put_contour_bspline(p_cntr, GlobalMembersContour.chk_contour_kind(p_cntr, contr_isclosed));
		break;
		}
		GlobalMembersContour.free_contour(p_cntr);
	}

/*
 * Simply puts contour coordinates in order with no interpolation or
 * approximation.
 */
	public static void put_contour_nothing(cntr_struct p_cntr)
	{
		while (p_cntr != null)
		{
		GlobalMembersContour.add_cntr_point(p_cntr.X, p_cntr.Y);
		p_cntr = p_cntr.next;
		}
		GlobalMembersContour.end_crnt_cntr();
	}

/*
 * for some reason contours are never flagged as 'isclosed'
 * if first point == last point, set flag accordingly
 *
 */

	public static int chk_contour_kind(cntr_struct p_cntr, boolean contr_isclosed)
	{
		cntr_struct pc_tail = DefineConstants.NULL;
		boolean current_contr_isclosed;

		current_contr_isclosed = contr_isclosed;

		if (!contr_isclosed)
		{
		pc_tail = p_cntr;
		while (pc_tail.next != null)
			pc_tail = pc_tail.next; // Find last point.

		/* test if first and last point are equal */
		if (GlobalMembersContour.fuzzy_equal(pc_tail, p_cntr) != 0)
			current_contr_isclosed = true;
		}
		return (current_contr_isclosed);
	}

/*
 * Generate a cubic spline curve through the points (x_i,y_i) which are
 * stored in the linked list p_cntr.
 * The spline is defined as a 2d-function s(t) = (x(t),y(t)), where the
 * parameter t is the length of the linear stroke.
 */
	public static void put_contour_cubic(cntr_struct p_cntr, double xx_min, double xx_max, double yy_min, double yy_max, boolean contr_isclosed)
	{
		int num_pts;
		int num_intpol;
		double unit_x; // To define norm (x,y)-plane
		double unit_y;
		double delta_t; // Interval length t_{i+1}-t_i
		double d2x; // Second derivatives x''(t_i), y''(t_i)
		double d2y;
		cntr_struct pc_tail;

		num_pts = GlobalMembersContour.count_contour(p_cntr); // Number of points in contour.

		pc_tail = p_cntr; // Find last point.
		while (pc_tail.next != null)
		pc_tail = pc_tail.next;

		if (contr_isclosed)
		{
		/* Test if first and last point are equal (should be) */
		if (GlobalMembersContour.fuzzy_equal(pc_tail, p_cntr) == 0)
		{
			pc_tail.next = p_cntr; // Close contour list - make it circular.
			num_pts++;
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		delta_t = GlobalMembersAlloc.gp_alloc(num_pts * sizeof(double), "contour delta_t");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		d2x = GlobalMembersAlloc.gp_alloc(num_pts * sizeof(double), "contour d2x");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		d2y = GlobalMembersAlloc.gp_alloc(num_pts * sizeof(double), "contour d2y");

		/* Width and height of the grid is used as a unit length (2d-norm) */
		unit_x = xx_max - xx_min;
		unit_y = yy_max - yy_min;
		/* FIXME HBB 20010121: 'zero' should not be used as an absolute
		 * figure to compare to data */
		unit_x = (unit_x > GlobalMembersGadgets.zero != 0 ? unit_x : GlobalMembersGadgets.zero); // should not be zero
		unit_y = (unit_y > GlobalMembersGadgets.zero != 0 ? unit_y : GlobalMembersGadgets.zero);

		if (num_pts > 2)
		{
		/*
		 * Calculate second derivatives d2x[], d2y[] and interval lengths delta_t[]:
		 */
		if (GlobalMembersContour.gen_cubic_spline(num_pts, p_cntr, d2x, d2y, delta_t, contr_isclosed, unit_x, unit_y) == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(delta_t);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(d2x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(d2y);
			if (contr_isclosed)
			pc_tail.next = DefineConstants.NULL; // Un-circular list
			return;
		}
		}
		/* If following (num_pts > 1) is TRUE then exactly 2 points in contour.  */
		else if (num_pts > 1)
		{
		/* set all second derivatives to zero, interval length to 1 */
		d2x[0] = 0.;
		d2y[0] = 0.;
		d2x[1] = 0.;
		d2y[1] = 0.;
		delta_t[0] = 1.;
		} // Only one point ( ?? ) - ignore it.
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(delta_t);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(d2x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(d2y);
		if (contr_isclosed)
			pc_tail.next = DefineConstants.NULL; // Un-circular list
		return;
		}

		/* Calculate "num_intpol" interpolated values */
		num_intpol = 1 + (num_pts - 1) * contour_pts; // global: contour_pts
		GlobalMembersContour.intp_cubic_spline(num_pts, p_cntr, d2x, d2y, delta_t, num_intpol);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(delta_t);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(d2x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(d2y);

		if (contr_isclosed)
		pc_tail.next = DefineConstants.NULL; // Un-circular list

		GlobalMembersContour.end_crnt_cntr();
	}

/*
 * Find Bspline approximation for this data set.
 * Uses global variable contour_pts to determine number of samples per
 * interval, where the knot vector intervals are assumed to be uniform, and
 * global variable contour_order for the order of Bspline to use.
 */
	public static void put_contour_bspline(cntr_struct p_cntr, boolean contr_isclosed)
	{
		int num_pts;
		int order = contour_order - 1;

		num_pts = GlobalMembersContour.count_contour(p_cntr); // Number of points in contour.
		if (num_pts < 2)
		return; // Can't do nothing if empty or one points!
		/* Order must be less than number of points in curve - fix it if needed. */
		if (order > num_pts - 1)
		order = num_pts - 1;

		GlobalMembersContour.gen_bspline_approx(p_cntr, num_pts, order, contr_isclosed);
		GlobalMembersContour.end_crnt_cntr();
	}

/*
 * Free all elements in the contour list.
 */
	public static void free_contour(cntr_struct p_cntr)
	{
		cntr_struct pc_temp;

		while (p_cntr != null)
		{
		pc_temp = p_cntr;
		p_cntr = p_cntr.next;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pc_temp);
		}
	}

/*
 * Counts number of points in contour.
 */
	public static int count_contour(cntr_struct p_cntr)
	{
		int count = 0;

		while (p_cntr != null)
		{
		count++;
		p_cntr = p_cntr.next;
		}
		return count;
	}

/*
 * Find second derivatives (x''(t_i),y''(t_i)) of cubic spline interpolation
 * through list of points (x_i,y_i). The parameter t is calculated as the
 * length of the linear stroke. The number of points must be at least 3.
 * Note: For closed contours the first and last point must be equal.
 */
	public static int gen_cubic_spline(int num_pts, cntr_struct p_cntr, double[] d2x, double[] d2y, double[] delta_t, boolean contr_isclosed, double unit_x, double unit_y)
	{
		int n;
		int i;
		double norm;
		double[] m = new double[3]; // The tri-diagonal matrix is saved here.
		cntr_struct pc_temp;

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		m = GlobalMembersAlloc.gp_alloc(num_pts * sizeof(double[3]), "contour tridiag m");

		/*
		 * Calculate first differences in (d2x[i], d2y[i]) and interval lengths
		 * in delta_t[i]:
		 */
		pc_temp = p_cntr;
		for (i = 0; i < num_pts - 1; i++)
		{
		d2x[i] = pc_temp.next.X - pc_temp.X;
		d2y[i] = pc_temp.next.Y - pc_temp.Y;
		/*
		 * The norm of a linear stroke is calculated in "normal coordinates"
		 * and used as interval length:
		 */
		delta_t[i] = Math.sqrt(((d2x[i] / unit_x) * (d2x[i] / unit_x)) + ((d2y[i] / unit_y) * (d2y[i] / unit_y)));

		d2x[i] /= delta_t[i]; // first difference, with unit norm:
		d2y[i] /= delta_t[i]; //   || (d2x[i], d2y[i]) || = 1

		pc_temp = pc_temp.next;
		}

		/*
		 * Setup linear system:  m * x = b
		 */
		n = num_pts - 2; // Without first and last point
		if (contr_isclosed)
		{
		/* First and last points must be equal for closed contours */
		delta_t[num_pts - 1] = delta_t[0];
		d2x[num_pts - 1] = d2x[0];
		d2y[num_pts - 1] = d2y[0];
		n++; // Add last point (= first point)
		}
		for (i = 0; i < n; i++)
		{
		/* Matrix M, mainly tridiagonal with cyclic second index ("j = j+n mod n") */
		m[i][0] = delta_t[i]; // Off-diagonal element M_{i,i-1}
		m[i][1] = 2.* (delta_t[i] + delta_t[i + 1]); // M_{i,i}
		m[i][2] = delta_t[i + 1]; // Off-diagonal element M_{i,i+1}

		/* Right side b_x and b_y */
		d2x[i] = (d2x[i + 1] - d2x[i]) * 6.;
		d2y[i] = (d2y[i + 1] - d2y[i]) * 6.;

		/*
		 * If the linear stroke shows a cusps of more than 90 degree, the right
		 * side is reduced to avoid oscillations in the spline:
		 */
		norm = Math.sqrt(((d2x[i] / unit_x) * (d2x[i] / unit_x)) + ((d2y[i] / unit_y) * (d2y[i] / unit_y))) / 8.5;

		if (norm > 1.)
		{
			d2x[i] /= norm;
			d2y[i] /= norm;
			/* The first derivative will not be continuous */
		}
		}

		if (!contr_isclosed)
		{
		/* Third derivative is set to zero at both ends */
		m[0][1] += m[0][0]; // M_{0,0}
		m[0][0] = 0.; // M_{0,n-1}
		m[n - 1][1] += m[n - 1][2]; // M_{n-1,n-1}
		m[n - 1][2] = 0.; // M_{n-1,0}
		}
		/* Solve linear systems for d2x[] and d2y[] */


		if (GlobalMembersContour.solve_cubic_1(m, n) != 0) // Calculate Cholesky decomposition
		{
		GlobalMembersContour.solve_cubic_2(m, d2x, n); // solve M * d2x = b_x
		GlobalMembersContour.solve_cubic_2(m, d2y, n); // solve M * d2y = b_y

		} // Should not happen, but who knows ...
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(m);
		return false;
		}

		/* Shift all second derivatives one place right and abdate end points */
		for (i = n; i > 0; i--)
		{
		d2x[i] = d2x[i - 1];
		d2y[i] = d2y[i - 1];
		}
		if (contr_isclosed)
		{
		d2x[0] = d2x[n];
		d2y[0] = d2y[n];
		}
		else
		{
		d2x[0] = d2x[1]; // Third derivative is zero in
		d2y[0] = d2y[1]; //     first and last interval
		d2x[n + 1] = d2x[n];
		d2y[n + 1] = d2y[n];
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(m);
		return true;
	}

/*
 * Calculate interpolated values of the spline function (defined via p_cntr
 * and the second derivatives d2x[] and d2y[]). The number of tabulated
 * values is n. On an equidistant grid n_intpol values are calculated.
 */
	public static void intp_cubic_spline(int n, cntr_struct p_cntr, double[] d2x, double[] d2y, double[] delta_t, int n_intpol)
	{
		double t;
		double t_skip;
		double t_max;
		double x0;
		double x1;
		double x;
		double y0;
		double y1;
		double y;
		double d;
		double hx;
		double dx0;
		double dx01;
		double hy;
		double dy0;
		double dy01;
		int i;

		/* The length of the total interval */
		t_max = 0.;
		for (i = 0; i < n - 1; i++)
		t_max += delta_t[i];

		/* The distance between interpolated points */
		t_skip = (1.- 1e-7) * t_max / (n_intpol - 1);

		t = 0.; // Parameter value
		x1 = p_cntr.X;
		y1 = p_cntr.Y;
		GlobalMembersContour.add_cntr_point(x1, y1); // First point.
		t += t_skip;

		for (i = 0; i < n - 1; i++)
		{
		p_cntr = p_cntr.next;

		d = delta_t[i]; // Interval length
		x0 = x1;
		y0 = y1;
		x1 = p_cntr.X;
		y1 = p_cntr.Y;
		hx = (x1 - x0) / d;
		hy = (y1 - y0) / d;
		dx0 = (d2x[i + 1] + 2 * d2x[i]) / 6.;
		dy0 = (d2y[i + 1] + 2 * d2y[i]) / 6.;
		dx01 = (d2x[i + 1] - d2x[i]) / (6.* d);
		dy01 = (d2y[i + 1] - d2y[i]) / (6.* d);
		while (t <= delta_t[i]) // t in current interval ?
		{
			x = x0 + t * (hx + (t - d) * (dx0 + t * dx01));
			y = y0 + t * (hy + (t - d) * (dy0 + t * dy01));
			GlobalMembersContour.add_cntr_point(x, y); // next point.
			t += t_skip;
		}
		t -= delta_t[i]; // Parameter t relative to start of next interval
		}
	}

/*
 * The following two procedures solve the special linear system which arise
 * in cubic spline interpolation. If x is assumed cyclic ( x[i]=x[n+i] ) the
 * equations can be written as (i=0,1,...,n-1):
 *     m[i][0] * x[i-1] + m[i][1] * x[i] + m[i][2] * x[i+1] = b[i] .
 * In matrix notation one gets M * x = b, where the matrix M is tridiagonal
 * with additional elements in the upper right and lower left position:
 *   m[i][0] = M_{i,i-1}  for i=1,2,...,n-1    and    m[0][0] = M_{0,n-1} ,
 *   m[i][1] = M_{i, i }  for i=0,1,...,n-1
 *   m[i][2] = M_{i,i+1}  for i=0,1,...,n-2    and    m[n-1][2] = M_{n-1,0}.
 * M should be symmetric (m[i+1][0]=m[i][2]) and positiv definite.
 * The size of the system is given in n (n>=1).
 *
 * In the first procedure the Cholesky decomposition M = C^T * D * C
 * (C is upper triangle with unit diagonal, D is diagonal) is calculated.
 * Return TRUE if decomposition exist.
 */
	public static int solve_cubic_1(double[][] m, int n)
	{
		int i;
		double m_ij;
		double m_n;
		double m_nn;
		double d;

		if (n < 1)
		return false; // Dimension should be at least 1

		d = m[0][1]; // D_{0,0} = M_{0,0}
		if (d <= 0.)
		return false; // M (or D) should be positiv definite
		m_n = m[0][0]; //  M_{0,n-1}
		m_nn = m[n - 1][1]; // M_{n-1,n-1}
		for (i = 0; i < n - 2; i++)
		{
		m_ij = m[i][2]; //  M_{i,1}
		m[i][2] = m_ij / d; // C_{i,i+1}
		m[i][0] = m_n / d; // C_{i,n-1}
		m_nn -= m[i][0] * m_n; // to get C_{n-1,n-1}
		m_n = -m[i][2] * m_n; // to get C_{i+1,n-1}
		d = m[i + 1][1] - m[i][2] * m_ij; // D_{i+1,i+1}
		if (d <= 0.)
			return false; // Elements of D should be positiv
		m[i + 1][1] = d;
		}
		if (n >= 2) // Complete last column
		{
		m_n += m[n - 2][2]; // add M_{n-2,n-1}
		m[n - 2][0] = m_n / d; // C_{n-2,n-1}
		m[n - 1][1] = d = m_nn - m[n - 2][0] * m_n; // D_{n-1,n-1}
		if (d <= 0.)
			return false;
		}
		return true;
	}

/*
 * The second procedure solves the linear system, with the Choleky
 * decomposition calculated above (in m[][]) and the right side b given
 * in x[]. The solution x overwrites the right side in x[].
 */
	public static void solve_cubic_2(double[][] m, double[] x, int n)
	{
		int i;
		double x_n;

		/* Division by transpose of C : b = C^{-T} * b */
		x_n = x[n - 1];
		for (i = 0; i < n - 2; i++)
		{
		x[i + 1] -= m[i][2] * x[i]; // C_{i,i+1} * x_{i}
		x_n -= m[i][0] * x[i]; // C_{i,n-1} * x_{i}
		}
		if (n >= 2)
		x[n - 1] = x_n - m[n - 2][0] * x[n - 2]; // C_{n-2,n-1} * x_{n-1}

		/* Division by D: b = D^{-1} * b */
		for (i = 0; i < n; i++)
		x[i] /= m[i][1];

		/* Division by C: b = C^{-1} * b */
		x_n = x[n - 1];
		if (n >= 2)
		x[n - 2] -= m[n - 2][0] * x_n; // C_{n-2,n-1} * x_{n-1}
		for (i = n - 3; i >= 0; i--)
		{
		/*      C_{i,i+1} * x_{i+1} + C_{i,n-1} * x_{n-1} */
		x[i] -= m[i][2] * x[i + 1] + m[i][0] * x_n;
		}
		return;
	}

/*
 * Generate a Bspline curve defined by all the points given in linked list p:
 * Algorithm: using deBoor algorithm
 * Note: if Curvekind is open contour than Open end knot vector is assumed,
 *       else (closed contour) Float end knot vector is assumed.
 * It is assumed that num_of_points is at least 2, and order of Bspline is less
 * than num_of_points!
 */
	public static void gen_bspline_approx(cntr_struct p_cntr, int num_of_points, int order, boolean contr_isclosed)
	{
		int knot_index = 0;
		int pts_count = 1;
		double dt;
		double t;
		double next_t;
		double t_min;
		double t_max;
		double x;
		double y;
		cntr_struct pc_temp = p_cntr;
		cntr_struct pc_tail = DefineConstants.NULL;

		/* If the contour is Closed one we must update few things:
		 * 1. Make the list temporary circular, so we can close the contour.
		 * 2. Update num_of_points - increase it by "order-1" so contour will be
		 *    closed. This will evaluate order more sections to close it!
		 */
		if (contr_isclosed)
		{
		pc_tail = p_cntr;
		while (pc_tail.next != null)
			pc_tail = pc_tail.next; // Find last point.

		/* test if first and last point are equal */
		if (GlobalMembersContour.fuzzy_equal(pc_tail, p_cntr) != 0)
		{
			/* Close contour list - make it circular. */
			pc_tail.next = p_cntr.next;
			num_of_points += order - 1;
		}
		else
		{
			pc_tail.next = p_cntr;
			num_of_points += order;
		}
		}
		/* Find first (t_min) and last (t_max) t value to eval: */
		t = t_min = GlobalMembersContour.fetch_knot(contr_isclosed, num_of_points, order, order);
		t_max = GlobalMembersContour.fetch_knot(contr_isclosed, num_of_points, order, num_of_points);
		next_t = t_min + 1.0;
		knot_index = order;
		dt = 1.0 / contour_pts; // Number of points per one section.


		while (t < t_max)
		{
		if (t > next_t)
		{
			pc_temp = pc_temp.next; // Next order ctrl. pt. to blend.
			knot_index++;
			next_t += 1.0;
		}
		GlobalMembersContour.eval_bspline(t, pc_temp, num_of_points, order, knot_index, contr_isclosed, x, y); // Next pt.
		GlobalMembersContour.add_cntr_point(x, y);
		pts_count++;
		/* As we might have some real number round off problems we do      */
		/* the last point outside the loop                                 */
		if (pts_count == contour_pts * (num_of_points - order) + 1)
			break;
		t += dt;
		}

		/* Now do the last point */
		GlobalMembersContour.eval_bspline(t_max - DefineConstants.EPSILON, pc_temp, num_of_points, order, knot_index, contr_isclosed, x, y);
		GlobalMembersContour.add_cntr_point(x, y); // Complete the contour.

		if (contr_isclosed) // Update list - un-circular it.
		pc_tail.next = DefineConstants.NULL;
	}

/*
 * The routine to evaluate the B-spline value at point t using knot vector
 * from function fetch_knot(), and the control points p_cntr.
 * Returns (x, y) of approximated B-spline. Note that p_cntr points on the
 * first control point to blend with. The B-spline is of order order.
 */
	public static void eval_bspline(double t, cntr_struct p_cntr, int num_of_points, int order, int j, boolean contr_isclosed, double x, double y)
	{
		int i;
		int p;
		double ti; // Copy p_cntr into it to make it faster.
		double tikp;
		double[] dx;
		double[] dy;

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		dx = GlobalMembersAlloc.gp_alloc((order + j) * sizeof(double), "contour b_spline");
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		dy = GlobalMembersAlloc.gp_alloc((order + j) * sizeof(double), "contour b_spline");

		/* Set the dx/dy - [0] iteration step, control points (p==0 iterat.): */
		for (i = j - order; i <= j; i++)
		{
		dx[i] = p_cntr.X;
		dy[i] = p_cntr.Y;
		p_cntr = p_cntr.next;
		}

		for (p = 1; p <= order; p++) // Iteration (b-spline level) counter.
		{
		for (i = j; i >= j - order + p; i--) // Control points indexing.
		{
			ti = GlobalMembersContour.fetch_knot(contr_isclosed, num_of_points, order, i);
			tikp = GlobalMembersContour.fetch_knot(contr_isclosed, num_of_points, order, i + order + 1 - p);
			if (ti == tikp) // Should not be a problems but how knows...
			{
			}
			else
			{
			dx[i] = dx[i] * (t - ti) / (tikp - ti) + dx[i - 1] * (tikp - t) / (tikp - ti); // Calculate x.
			dy[i] = dy[i] * (t - ti) / (tikp - ti) + dy[i - 1] * (tikp - t) / (tikp - ti); // Calculate y.
			}
		}
		}
		x = dx[j];
		y = dy[j];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(dx);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(dy);
	}

/*
 * Routine to get the i knot from uniform knot vector. The knot vector
 * might be float (Knot(i) = i) or open (where the first and last "order"
 * knots are equal). contr_isclosed determines knot kind - open contour means
 * open knot vector, and closed contour selects float knot vector.
 * Note the knot vector is not exist and this routine simulates it existance
 * Also note the indexes for the knot vector starts from 0.
 */
	public static double fetch_knot(boolean contr_isclosed, int num_of_points, int order, int i)
	{
		if (!contr_isclosed)
		{
		if (i <= order)
			return 0.0;
		else if (i <= num_of_points)
			return (double)(i - order);
		else
			return (double)(num_of_points - order);
		}
		else
		{
		return (double) i;
		}
	}
}