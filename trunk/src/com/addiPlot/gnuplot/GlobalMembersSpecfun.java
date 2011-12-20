package com.addiPlot.gnuplot;

import com.addiPlot.gnuplot.tangible.MathFunctions;

public class GlobalMembersSpecfun
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
	//	return GlobalMembersAlloc.RCSid("$Id: specfun.c,v 1.37.2.1 2010/02/24 04:16:48 sfeam Exp $");
	//}

	///#ifndef GAMMA
	//
	// /* Provide GAMMA function for those who do not already have one */
	//
	//int             sgngam;
	//
	//static int
	//ISNAN(double x)
	//{
	//    volatile double a = x;
	//
	//    if (a != a)
	//        return 1;
	//    return 0;
	//}
	//
	//static int
	//ISFINITE(double x)
	//{
	//    volatile double a = x;
	//
	//    if (a < DBL_MAX)
	//        return 1;
	//    return 0;
	//}
	//
	//double
	//lngamma(double x)
	//{
	// /* A[]: Stirling's formula expansion of log gamma
	//  * B[], C[]: log gamma function between 2 and 3
	//  */
	///#ifdef UNK
	//    static const double   A[] = {
	//	8.11614167470508450300E-4,
	//	-5.95061904284301438324E-4,
	//	7.93650340457716943945E-4,
	//	-2.77777777730099687205E-3,
	//	8.33333333333331927722E-2
	//    };
	//    static const double   B[] = {
	//	-1.37825152569120859100E3,
	//	-3.88016315134637840924E4,
	//	-3.31612992738871184744E5,
	//	-1.16237097492762307383E6,
	//	-1.72173700820839662146E6,
	//	-8.53555664245765465627E5
	//    };
	//    static const double   C[] = {
	// /* 1.00000000000000000000E0, */
	//	-3.51815701436523470549E2,
	//	-1.70642106651881159223E4,
	//	-2.20528590553854454839E5,
	//	-1.13933444367982507207E6,
	//	-2.53252307177582951285E6,
	//	-2.01889141433532773231E6
	//    };
	// /* log( sqrt( 2*pi ) ) */
	//    static const double   LS2PI = 0.91893853320467274178;
	///#define MAXLGM 2.556348e305
	///#endif // UNK 
	//
	///#ifdef DEC
	//    static const unsigned short A[] = {
	//	0035524, 0141201, 0034633, 0031405,
	//	0135433, 0176755, 0126007, 0045030,
	//	0035520, 0006371, 0003342, 0172730,
	//	0136066, 0005540, 0132605, 0026407,
	//	0037252, 0125252, 0125252, 0125132
	//    };
	//    static const unsigned short B[] = {
	//	0142654, 0044014, 0077633, 0035410,
	//	0144027, 0110641, 0125335, 0144760,
	//	0144641, 0165637, 0142204, 0047447,
	//	0145215, 0162027, 0146246, 0155211,
	//	0145322, 0026110, 0010317, 0110130,
	//	0145120, 0061472, 0120300, 0025363
	//    };
	//    static const unsigned short C[] = {
	// /*0040200,0000000,0000000,0000000*/
	//	0142257, 0164150, 0163630, 0112622,
	//	0143605, 0050153, 0156116, 0135272,
	//	0144527, 0056045, 0145642, 0062332,
	//	0145213, 0012063, 0106250, 0001025,
	//	0145432, 0111254, 0044577, 0115142,
	//	0145366, 0071133, 0050217, 0005122
	//    };
	// /* log( sqrt( 2*pi ) ) */
	//    static const unsigned short LS2P[] = {040153, 037616, 041445, 0172645,};
	///#define LS2PI *(double *)LS2P
	///#define MAXLGM 2.035093e36
	///#endif // DEC 
	//
	///#ifdef IBMPC
	//    static const unsigned short A[] = {
	//	0x6661, 0x2733, 0x9850, 0x3f4a,
	//	0xe943, 0xb580, 0x7fbd, 0xbf43,
	//	0x5ebb, 0x20dc, 0x019f, 0x3f4a,
	//	0xa5a1, 0x16b0, 0xc16c, 0xbf66,
	//	0x554b, 0x5555, 0x5555, 0x3fb5
	//    };
	//    static const unsigned short B[] = {
	//	0x6761, 0x8ff3, 0x8901, 0xc095,
	//	0xb93e, 0x355b, 0xf234, 0xc0e2,
	//	0x89e5, 0xf890, 0x3d73, 0xc114,
	//	0xdb51, 0xf994, 0xbc82, 0xc131,
	//	0xf20b, 0x0219, 0x4589, 0xc13a,
	//	0x055e, 0x5418, 0x0c67, 0xc12a
	//    };
	//    static const unsigned short C[] = {
	// /*0x0000,0x0000,0x0000,0x3ff0,*/
	//	0x12b2, 0x1cf3, 0xfd0d, 0xc075,
	//	0xd757, 0x7b89, 0xaa0d, 0xc0d0,
	//	0x4c9b, 0xb974, 0xeb84, 0xc10a,
	//	0x0043, 0x7195, 0x6286, 0xc131,
	//	0xf34c, 0x892f, 0x5255, 0xc143,
	//	0xe14a, 0x6a11, 0xce4b, 0xc13e
	//    };
	// /* log( sqrt( 2*pi ) ) */
	//    static const unsigned short LS2P[] = {
	//	0xbeb5, 0xc864, 0x67f1, 0x3fed
	//    };
	///#define LS2PI *(double *)LS2P
	///#define MAXLGM 2.556348e305
	///#endif // IBMPC 
	//
	///#ifdef MIEEE
	//    static const unsigned short A[] = {
	//	0x3f4a, 0x9850, 0x2733, 0x6661,
	//	0xbf43, 0x7fbd, 0xb580, 0xe943,
	//	0x3f4a, 0x019f, 0x20dc, 0x5ebb,
	//	0xbf66, 0xc16c, 0x16b0, 0xa5a1,
	//	0x3fb5, 0x5555, 0x5555, 0x554b
	//    };
	//    static const unsigned short B[] = {
	//	0xc095, 0x8901, 0x8ff3, 0x6761,
	//	0xc0e2, 0xf234, 0x355b, 0xb93e,
	//	0xc114, 0x3d73, 0xf890, 0x89e5,
	//	0xc131, 0xbc82, 0xf994, 0xdb51,
	//	0xc13a, 0x4589, 0x0219, 0xf20b,
	//	0xc12a, 0x0c67, 0x5418, 0x055e
	//    };
	//    static const unsigned short C[] = {
	//	0xc075, 0xfd0d, 0x1cf3, 0x12b2,
	//	0xc0d0, 0xaa0d, 0x7b89, 0xd757,
	//	0xc10a, 0xeb84, 0xb974, 0x4c9b,
	//	0xc131, 0x6286, 0x7195, 0x0043,
	//	0xc143, 0x5255, 0x892f, 0xf34c,
	//	0xc13e, 0xce4b, 0x6a11, 0xe14a
	//    };
	// /* log( sqrt( 2*pi ) ) */
	//    static const unsigned short LS2P[] = {
	//	0x3fed, 0x67f1, 0xc864, 0xbeb5
	//    };
	///#define LS2PI *(double *)LS2P
	///#define MAXLGM 2.556348e305
	///#endif // MIEEE 
	//
	//    static const double LOGPI = 1.1447298858494001741434273513530587116472948129153;
	//
	//    double          p, q, u, w, z;
	//    int             i;
	//
	//    sgngam = 1;
	///#ifdef NANS
	//    if (ISNAN(x))
	//        return (x);
	///#endif
	//
	///#ifdef INFINITIES
	//    if (!ISFINITE((x)))
	//        return (DBL_MAX * DBL_MAX);
	///#endif
	//
	//    if (x < -34.0) {
	//        q = -x;
	//        w = lngamma(q);            // note this modifies sgngam! 
	//        p = floor(q);
	//        if (p == q) {
	//	lgsing:
	///#ifdef INFINITIES
	//            mtherr("lngamma", MTHERR_SING);
	//            return (DBL_MAX * DBL_MAX);
	///#else
	//            goto loverf;
	///#endif
	//        }
	//        i = p;
	//        if ((i & 1) == 0)
	//            sgngam = -1;
	//        else
	//            sgngam = 1;
	//        z = q - p;
	//        if (z > 0.5) {
	//            p += 1.0;
	//            z = p - q;
	//        }
	//        z = q * sin(PI * z);
	//        if (z == 0.0)
	//            goto lgsing;
	// /*      z = log(PI) - log( z ) - w;*/
	//        z = LOGPI - log(z) - w;
	//        return (z);
	//    }
	//    if (x < 13.0) {
	//        z = 1.0;
	//        p = 0.0;
	//        u = x;
	//        while (u >= 3.0) {
	//            p -= 1.0;
	//            u = x + p;
	//            z *= u;
	//        }
	//        while (u < 2.0) {
	//            if (u == 0.0)
	//                goto lgsing;
	//            z /= u;
	//            p += 1.0;
	//            u = x + p;
	//        }
	//        if (z < 0.0) {
	//            sgngam = -1;
	//            z = -z;
	//        } else
	//            sgngam = 1;
	//        if (u == 2.0)
	//            return (log(z));
	//        p -= 2.0;
	//        x = x + p;
	//        p = x * polevl(x, B, 5) / p1evl(x, C, 6);
	//        return (log(z) + p);
	//    }
	//    if (x > MAXLGM) {
	///#ifdef INFINITIES
	//        return (sgngam * (DBL_MAX * DBL_MAX));
	///#else
	//    loverf:
	//        mtherr("lngamma", MTHERR_OVERFLOW);
	//        return (sgngam * MAXNUM);
	///#endif
	//    }
	//    q = (x - 0.5) * log(x) - x + LS2PI;
	//    if (x > 1.0e8)
	//        return (q);
	//
	//    p = 1.0 / (x * x);
	//    if (x >= 1000.0)
	//        q += ((7.9365079365079365079365e-4 * p
	//               - 2.7777777777777777777778e-3) * p
	//              + 0.0833333333333333333333) / x;
	//    else
	//        q += polevl(p, A, 4) / x;
	//    return (q);
	//}
	//
	///#define GAMMA(x) lngamma ((x))
	// /* HBB 20030816: must override name of sgngam so f_gamma() uses it */
	///#define signgam sgngam
	//
	///#endif // !GAMMA 

	///#endif

	/* GNUPLOT - specfun.c */

	/*[
	 * Copyright 1986 - 1993, 1998, 2004   Thomas Williams, Colin Kelley
	 *
	 * Permission to use, copy, and distribute this software and its
	 * documentation for any purpose with or without fee is hereby granted,
	 * provided that the above copyright notice appear in all copies and
	 * that both that copyright notice and this permission notice appear
	 * in supporting documentation.
	 *
	 * Permission to modify the software is granted, but not the right to
	 * distribute the complete modified source code.  Modifications are to
	 * be distributed as patches to the released version.  Permission to
	 * distribute binaries produced by compiling modified sources is granted,
	 * provided you
	 *   1. distribute the corresponding source modifications from the
	 *    released version in the form of a patch file along with the binaries,
	 *   2. add special version identification to distinguish your version
	 *    in addition to the base release version number,
	 *   3. provide your name and address as the primary contact for the
	 *    support of your modified version, and
	 *   4. retain our contact information in regard to use of the base
	 *    software.
	 * Permission to distribute the released version of the source code along
	 * with corresponding source modifications in the form of a patch file is
	 * granted with same provisions 2 through 4 for binary distributions.
	 *
	 * This software is provided "as is" without express or implied warranty
	 * to the extent permitted by applicable law.
	]*/

	/*
	 * AUTHORS
	 *
	 *   Original Software:
	 *   Jos van der Woude, jvdwoude@hut.nl
	 *
	 */

	/* FIXME:
	 * plain comparisons of floating point numbers!
	 */

	/*
	 * $Id: specfun.h,v 1.8 2004/04/13 17:24:01 broeker Exp $
	 */

	/* GNUPLOT - specfun.h */

	/*[
	 * Copyright 1999, 2004   Thomas Williams, Colin Kelley
	 *
	 * Permission to use, copy, and distribute this software and its
	 * documentation for any purpose with or without fee is hereby granted,
	 * provided that the above copyright notice appear in all copies and
	 * that both that copyright notice and this permission notice appear
	 * in supporting documentation.
	 *
	 * Permission to modify the software is granted, but not the right to
	 * distribute the complete modified source code.  Modifications are to
	 * be distributed as patches to the released version.  Permission to
	 * distribute binaries produced by compiling modified sources is granted,
	 * provided you
	 *   1. distribute the corresponding source modifications from the
	 *    released version in the form of a patch file along with the binaries,
	 *   2. add special version identification to distinguish your version
	 *    in addition to the base release version number,
	 *   3. provide your name and address as the primary contact for the
	 *    support of your modified version, and
	 *   4. retain our contact information in regard to use of the base
	 *    software.
	 * Permission to distribute the released version of the source code along
	 * with corresponding source modifications in the form of a patch file is
	 * granted with same provisions 2 through 4 for binary distributions.
	 *
	 * This software is provided "as is" without express or implied warranty
	 * to the extent permitted by applicable law.
	]*/


	/* #if... / #include / #define collection: */

	///#ifdef HAVE_CONFIG_H
	///#define EAM_OBJECTS 1
	///#define EXTERNAL_X11_WINDOW 1
	///#define GIF_ANIMATION 1
	///#define GNUPLOT_HISTORY 1
	///#define GP_FIT_ERRVARS 1
	///#define GP_MACROS 1
	///#define HAVE_ATEXIT 1
	///#define HAVE_BCOPY 1
	///#define HAVE_BZERO 1
	///#define HAVE_CAIROPDF 1
	///#define HAVE_DECL_SIGNGAM 1
	///#define HAVE_DIRENT_H 1
	///#define HAVE_ERF 1
	///#define HAVE_ERFC 1
	///#define HAVE_ERRNO_H 1
	///#define HAVE_FLOAT_H 1
	///#define HAVE_GAMMA 1
	///#define HAVE_GD_GIF 1
	///#define HAVE_GD_H 1
	///#define HAVE_GD_JPEG 1
	///#define HAVE_GD_PNG 1
	///#define HAVE_GD_TTF 1
	///#define HAVE_GETCWD 1
	///#define HAVE_INDEX 1
	///#define HAVE_INTTYPES_H 1
	///#define HAVE_ISNAN 1
	///#define HAVE_LGAMMA 1
	///#define HAVE_LIBGD 1
	///#define HAVE_LIBM 1
	///#define HAVE_LIBREADLINE 1
	///#define HAVE_LIBZ 1
	///#define HAVE_LIMITS_H 1
	///#define HAVE_LOCALE_H 1
	///#define HAVE_MALLOC_H 1
	///#define HAVE_MATH_H 1
	///#define HAVE_MEMCPY 1
	///#define HAVE_MEMMOVE 1
	///#define HAVE_MEMORY_H 1
	///#define HAVE_MEMSET 1
	///#define HAVE_ON_EXIT 1
	///#define HAVE_PCLOSE 1
	///#define HAVE_POLL 1
	///#define HAVE_POLL_H 1
	///#define HAVE_POPEN 1
	///#define HAVE_READLINE_HISTORY_H 1
	///#define HAVE_READLINE_READLINE_H 1
	///#define HAVE_READLINE_TILDE_H 1
	///#define HAVE_RINDEX 1
	///#define HAVE_SELECT 1
	///#define HAVE_SETVBUF 1
	///#define HAVE_SGTTY_H 1
	///#define HAVE_SIGSETJMP 1
	///#define HAVE_SLEEP 1
	///#define HAVE_SNPRINTF 1
	///#define HAVE_STDBOOL_H 1
	///#define HAVE_STDINT_H 1
	///#define HAVE_STDLIB_H 1
	///#define HAVE_STPCPY 1
	///#define HAVE_STRCASECMP 1
	///#define HAVE_STRCHR 1
	///#define HAVE_STRCSPN 1
	///#define HAVE_STRDUP 1
	///#define HAVE_STRERROR 1
	///#define HAVE_STRINGIZE 1
	///#define HAVE_STRINGS_H 1
	///#define HAVE_STRING_H 1
	///#define HAVE_STRNCASECMP 1
	///#define HAVE_STRRCHR 1
	///#define HAVE_STRSTR 1
	///#define HAVE_STRUCT_EXCEPTION_IN_MATH_H 1
	///#define HAVE_SYSINFO 1
	///#define HAVE_SYS_IOCTL_H 1
	///#define HAVE_SYS_PARAM_H 1
	///#define HAVE_SYS_SELECT_H 1
	///#define HAVE_SYS_SOCKET_H 1
	///#define HAVE_SYS_STAT_H 1
	///#define HAVE_SYS_TIMEB_H 1
	///#define HAVE_SYS_TIME_H 1
	///#define HAVE_SYS_TYPES_H 1
	///#define HAVE_SYS_UTSNAME_H 1
	///#define HAVE_TCGETATTR 1
	///#define HAVE_TERMIOS_H 1
	///#define HAVE_TIME_H 1
	///#define HAVE_TIME_T_IN_TIME_H 1
	///#define HAVE_UNISTD_H 1
	///#define HAVE_USLEEP 1
	///#define HAVE_VALUES_H 1
	///#define HAVE_VFPRINTF 1
	///#define HAVE__BOOL 1
	///#define HIDDEN3D_QUADTREE 1
	///#define HIDDEN3D_VAR_PTSIZE 1
	///#define PACKAGE "gnuplot"
	///#define PACKAGE_BUGREPORT ""
	///#define PACKAGE_NAME "gnuplot"
	///#define PACKAGE_STRING "gnuplot 4.4.0"
	///#define PACKAGE_TARNAME "gnuplot"
	///#define PACKAGE_URL ""
	///#define PACKAGE_VERSION "4.4.0"
	///#define PIPES 1
	///#define PIPE_IPC 1
	///#define PROTOTYPES 1
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define RETSIGTYPE void
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SELECT_TYPE_ARG1 int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SELECT_TYPE_ARG234 (fd_set *)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SELECT_TYPE_ARG5 (struct timeval *)
	///#define STDC_HEADERS 1
	///#define USE_MOUSE 1
	///#define USE_X11_MULTIBYTE 1
	///#define VERSION "4.4.0"
	///#define VOLATILE_REFRESH 1
	///#define X11 1
	///#define __PROTOTYPES 1
	///#ifndef __cplusplus
	///#endif
	///#endif
	///#if defined(AMIGA_SC_6_1) || defined(AMIGA_AC_5) || defined(__amigaos__)
	///#ifndef __amigaos__
	///#define OS "Amiga"
	///#define HELPFILE "S:gnuplot.gih"
	///#define HOME     "GNUPLOT"
	///#define SHELL    "NewShell"
	///#define DIRSEP2  ':'
	///#define PATHSEP  ';'
	///#endif
	///#ifndef AMIGA
	///#define AMIGA
	///#endif
	///#ifdef AMIGA_SC_6_1
	///#define S_IFIFO S_IREAD
	///#endif
	///#endif // Amiga 
	///#ifdef DOS386
	///#define OS       "DOS 386"
	///#define HELPFILE "gnuplot.gih"
	///#define HOME     "GNUPLOT"
	///#define PLOTRC   "gnuplot.ini"
	///#define SHELL    "\\command.com"
	///#define DIRSEP1  '\\'
	///#define PATHSEP  ';'
	///#endif // DOS386 
	///#if defined(__NeXT__) || defined(NEXT)
	///#ifndef NEXT
	///#define NEXT
	///#endif
	///#endif // NeXT 
	///#ifdef OS2
	///#define OS       "OS/2"
	///#define HELPFILE "gnuplot.gih"
	///#define HOME     "GNUPLOT"
	///#define PLOTRC   "gnuplot.ini"
	///#define SHELL    "c:\\os2\\cmd.exe"
	///#define DIRSEP1  '\\'
	///#define PATHSEP  ';'
	///#define GNUPLOT_HISTORY_FILE "~\\gnuplot_history"
	///#endif // OS/2 
	///#ifdef OSK
	///#define OS    "OS-9"
	///#define SHELL "/dd/cmds/shell"
	///#endif // OS-9 
	///#if defined(vms) || defined(VMS)
	///#define OS "VMS"
	///#ifndef VMS
	///#define VMS
	///#endif
	///#define HOME   "sys$login:"
	///#define PLOTRC "gnuplot.ini"
	///#ifdef NO_GIH
	///#define HELPFILE "GNUPLOT$HELP"
	///#endif
	///#if !defined(VAXCRTL) && !defined(DECCRTL)
	///#define VAXCRTL VAXCRTL_AND_DECCRTL_UNDEFINED
	///#define DECCRTL VAXCRTL_AND_DECCRTL_UNDEFINED
	///#endif
	///#ifdef __DECC
	///#include <starlet.h>
	///#endif  // __DECC 
	///#endif // VMS 
	///#if defined(_WINDOWS) || defined(_Windows)
	///#ifndef _Windows
	///#define _Windows
	///#endif
	///#ifdef WIN32
	///#define OS "MS-Windows 32 bit"
	///#define far
	///#define S_IFIFO  _S_IFIFO
	///#else
	///#define OS "MS-Windows"
	///#ifndef WIN16
	///#define WIN16
	///#endif
	///#endif // WIN32 
	///#define HOME    "GNUPLOT"
	///#define PLOTRC  "gnuplot.ini"
	///#define SHELL   "\\command.com"
	///#define DIRSEP1 '\\'
	///#define PATHSEP ';'
	///#define GNUPLOT_HISTORY_FILE "~\\gnuplot_history"
	///#endif // _WINDOWS 
	///#if defined(MSDOS) && !defined(_Windows)
	///#if !defined(DOS32) && !defined(DOS16)
	///#define DOS16
	///#endif
	///#define OS       "MS-DOS"
	///#define HELPFILE "gnuplot.gih"
	///#define HOME     "GNUPLOT"
	///#define PLOTRC   "gnuplot.ini"
	///#define SHELL    "\\command.com"
	///#define DIRSEP1  '\\'
	///#define PATHSEP  ';'
	///#ifdef __DJGPP__
	///#define DIRSEP2 '/'
	///#endif
	///#define GNUPLOT_HISTORY_FILE "~\\gnuplot.his"
	///#endif // MSDOS 
	///#ifndef OS
	///#define OS "non-recognized OS"
	///#endif
	///#ifndef HELPFILE
	///#define HELPFILE "docs/gnuplot.gih"
	///#endif
	///#ifndef HOME
	///#define HOME "HOME"
	///#endif
	///#ifndef PLOTRC
	///#define PLOTRC ".gnuplot"
	///#endif
	///#ifndef SHELL
	///#define SHELL "/bin/sh"
	///#endif
	///#ifndef DIRSEP1
	///#define DIRSEP1 '/'
	///#endif
	///#ifndef DIRSEP2
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define DIRSEP2 NUL
	///#endif
	///#ifndef PATHSEP
	///#define PATHSEP ':'
	///#endif
	///#ifdef PROTOTYPES
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define __PROTO(proto) proto
	///#else
	///#define __PROTO(proto) ()
	///#endif
	///#if defined(MSDOS) || defined(DOS386)
	///#ifdef DJGPP
	///#include <dos.h>
	///#include <dir.h>              // HBB: for setdisk() 
	///#else
	///#include <process.h>
	///#endif                         // !DJGPP 
	///#ifdef __ZTC__
	///#define HAVE_SLEEP 1
	///#define P_WAIT 0
	///#elif defined(__TURBOC__)
	///#include <dos.h>		// for sleep() prototype 
	///#ifndef _Windows
	///#define HAVE_SLEEP 1
	///#include <conio.h>
	///#include <dir.h>            // setdisk() 
	///#endif                       // _Windows 
	///#ifdef WIN32
	///#define HAVE_SLEEP 1
	///#endif
	///#else                         // must be MSC 
	///#if !defined(__EMX__) && !defined(DJGPP)
	///#ifdef __MSC__
	///#include <direct.h>        // for _chdrive() 
	///#endif                      // __MSC__ 
	///#endif                       // !__EMX__ && !DJGPP 
	///#endif                        // !ZTC 
	///#endif // MSDOS 
	///#ifdef __WATCOMC__
	///#include <direct.h>
	///#include <dos.h>
	///#define HAVE_GETCWD 1
	///#define GP_EXCEPTION_NAME _exception
	///#endif
	///#ifdef apollo
	///#ifndef APOLLO
	///#define APOLLO
	///#endif
	///#define GPR
	///#endif
	///#if defined(APOLLO) || defined(alliant)
	///#endif
	///#ifdef sequent
	///#endif
	///#ifdef unixpc
	///#ifndef UNIXPC
	///#define UNIXPC
	///#endif
	///#endif
	///#if (defined(__TURBOC__) && defined(MSDOS)) || defined(WIN16)
	///#define GPHUGE huge
	///#define GPFAR far
	///#else // not TurboC || WIN16 
	///#define GPHUGE
	///#define GPFAR
	///#endif // not TurboC || WIN16 
	///#if defined(DOS16) || defined(WIN16)
	///#define COORDVAL_FLOAT 1
	///#else
	///#endif
	///#ifdef DOS16
	///#define MAX_NUM_VAR	3
	///#else
	///#define MAX_NUM_VAR 12
	///#endif
	///#ifdef VMS
	///#define DEFAULT_COMMENTS_CHARS "#!"
	///#define is_system(c) ((c) == '$')
	///#define BACKUP_FILESYSTEM 1
	///#else // not VMS 
	///#define DEFAULT_COMMENTS_CHARS "#"
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define is_system(c) ((c) == '!')
	///#endif // not VMS 
	///#ifndef RETSIGTYPE
	///#define RETSIGTYPE void
	///#endif
	///#ifndef SIGFUNC_NO_INT_ARG
	///#else
	///#endif
	///#ifdef HAVE_SIGSETJMP
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SETJMP(env, save_signals) sigsetjmp(env, save_signals)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define LONGJMP(env, retval) siglongjmp(env, retval)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define JMP_BUF sigjmp_buf
	///#else
	///#define SETJMP(env, save_signals) setjmp(env)
	///#define LONGJMP(env, retval) longjmp(env, retval)
	///#define JMP_BUF jmp_buf
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define generic void
	///#ifndef SORTFUNC_ARGS
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define SORTFUNC_ARGS const generic *
	///#endif
	///#ifdef HAVE_STRINGIZE
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CONCAT(x,y) x##y
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define CONCAT3(x,y,z) x##y##z
	///#else
	///#define CONCAT(x,y) x//
	///#define CONCAT3(x,y,z) x//
	///#endif
	///#if defined(_Windows) && !defined(WINDOWS_NO_GUI)
	///#include "win/wtext.h"
	///#endif
	///#ifndef GP_EXCEPTION_NAME
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_EXCEPTION_NAME exception
	///#endif
	///#ifndef GP_MATHERR
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_MATHERR matherr
	///#endif
	///#ifdef HAVE_STRUCT_EXCEPTION_IN_MATH_H
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define STRUCT_EXCEPTION_P_X struct GP_EXCEPTION_NAME *x
	///#else
	///#define STRUCT_EXCEPTION_P_X // nothing 
	///#endif
	///#ifndef GP_INLINE
	///#ifdef __GNUC__
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GP_INLINE __inline__
	///#else
	///#define GP_INLINE //nothing
	///#endif
	///#endif
	///#if HAVE_STDBOOL_H
	///#else
	///#if ! HAVE__BOOL
	///#ifdef __cplusplus
	///#else
	///#endif
	///#endif
	///#define bool _Bool
	///#define false 0
	///#define true 1
	///#define __bool_true_false_are_defined 1
	///#endif
	///#if defined(__SUNPRO_CC) && !defined(bool)
	///#define bool unsigned char
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define TRUE true
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define FALSE false
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define TBOOLEAN bool
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
	///#define STACK_DEPTH 100
	///#define MAX_AT_LEN 150
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define is_jump(operator) ((operator) >=(int)JUMP && (operator) <(int)SF_START)
	///#ifdef __ZTC__
	///#else
	///#endif
	///#ifdef APOLLO
	///#endif

	/* Type definitions */

	/* Variables of specfun.c needed by other modules: */

	/* Prototypes of functions exported by specfun.c */

	/* These are the more 'special' function built into the stack machine */
	public static void f_erf(argument arg)
	{
		value a = new value();
		double x;

		x = GlobalMembersEval.real(GlobalMembersEval.pop(a));
		x = MathFunctions.erf(x);
		GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, x, 0.0));
	}
	public static void f_erfc(argument arg)
	{
		value a = new value();
		double x;

		x = GlobalMembersEval.real(GlobalMembersEval.pop(a));
		x = MathFunctions.erfc(x);
		GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, x, 0.0));
	}
	public static void f_ibeta(argument arg)
	{
		value a = new value();
		double x;
		double arg1;
		double arg2;

		x = GlobalMembersEval.real(GlobalMembersEval.pop(a));
		arg2 = GlobalMembersEval.real(GlobalMembersEval.pop(a));
		arg1 = GlobalMembersEval.real(GlobalMembersEval.pop(a));

		x = GlobalMembersSpecfun.ibeta(arg1, arg2, x);
		if (x == -1.0)
		{
			GlobalMembersEval.undefined = true;
			GlobalMembersEval.push(GlobalMembersEval.Ginteger(a, 0));
		}
		else
			GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, x, 0.0));
	}
	public static void f_igamma(argument arg)
	{
		value a = new value();
		double x;
		double arg1;

		x = GlobalMembersEval.real(GlobalMembersEval.pop(a));
		arg1 = GlobalMembersEval.real(GlobalMembersEval.pop(a));

		x = GlobalMembersSpecfun.igamma(arg1, x);
		if (x == -1.0)
		{
			GlobalMembersEval.undefined = true;
			GlobalMembersEval.push(GlobalMembersEval.Ginteger(a, 0));
		}
		else
			GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, x, 0.0));
	}
	public static void f_gamma(argument arg)
	{
		double y;
		value a = new value();

		y = MathFunctions.lgamma(GlobalMembersEval.real(GlobalMembersEval.pop(a)));
		if (y > -DefineConstants.E_MINEXP)
		{
			GlobalMembersEval.undefined = true;
			GlobalMembersEval.push(GlobalMembersEval.Ginteger(a, 0));
		}
		else
			GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, signgam * GlobalMembersEval.gp_exp(y), 0.0));
	}
	public static void f_lgamma(argument arg)
	{
		value a = new value();

		GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, MathFunctions.lgamma(GlobalMembersEval.real(GlobalMembersEval.pop(a))), 0.0));
	}

	///#ifndef BADRAND

	public static void f_rand(argument arg)
	{
		value a = new value();

		GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, GlobalMembersSpecfun.ranf(GlobalMembersEval.pop(a)), 0.0));
	}

	/* ----------------------------------------------------------------
   Following to specfun.c made by John Grosh (jgrosh@arl.mil)
   on 28 OCT 1992.
   ---------------------------------------------------------------- */

	public static void f_normal(argument arg)
	{ // Normal or Gaussian Probability Function
		value a = new value();
		double x;

		/* ref. Abramowitz and Stegun 1964, "Handbook of Mathematical
		   Functions", Applied Mathematics Series, vol 55,
		   Chapter 26, page 934, Eqn. 26.2.29 and Jos van der Woude
		   code found above */

		x = GlobalMembersEval.real(GlobalMembersEval.pop(a));

		x = 0.5 * DefineConstants.SQRT_TWO * x;
		x = 0.5 * MathFunctions.erfc(-x); /* by using erfc instead of erf, we
					   can get accurate values for -38 <
					   arg < -8 */
		GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, x, 0.0));
	}
	public static void f_inverse_normal(argument arg)
	{ // Inverse normal distribution function
		value a = new value();
		double x;

		x = GlobalMembersEval.real(GlobalMembersEval.pop(a));

		if (x <= 0.0 || x >= 1.0)
		{
			GlobalMembersEval.undefined = true;
			GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, 0.0, 0.0));
		}
		else
		{
			GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, GlobalMembersSpecfun.inverse_normal_func(x), 0.0));
		}
	}
	public static void f_inverse_erf(argument arg)
	{ // Inverse error function
		value a = new value();
		double x;

		x = GlobalMembersEval.real(GlobalMembersEval.pop(a));

		if (Math.abs(x) >= 1.0)
		{
			GlobalMembersEval.undefined = true;
			GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, 0.0, 0.0));
		}
		else
		{
			GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, GlobalMembersSpecfun.inverse_error_func(x), 0.0));
		}
	}
	public static void f_lambertw(argument arg)
	{
		value a = new value();
		double x;

		x = GlobalMembersEval.real(GlobalMembersEval.pop(a));

		x = GlobalMembersSpecfun.lambertw(x);
		if (x <= -1)
			/* Error return from lambertw --> flag 'undefined' */
			GlobalMembersEval.undefined = true;

		GlobalMembersEval.push(GlobalMembersEval.Gcomplex(a, x, 0.0));
	}
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static String[] mtherr_ermsg = {"unknown", "domain", "singularity", "overflow", "underflow", "total loss of precision", "partial loss of precision"};


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
	///#define NO_CARET (-1)
	///#define DATAFILE (-2)
	///#if 0 // UNUSED
	///#endif
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define isstringvalue(c_token) (isstring(c_token) || type_udv(c_token)==STRING)
	///#if defined(VA_START) && defined(STDC_HEADERS)
	///#else
	///#endif

	///#define ITMAX 200

	///#ifdef FLT_EPSILON
	///#define MACHEPS FLT_EPSILON	// 1.0E-08 
	///#else
	///#define MACHEPS 1.0E-08
	///#endif

	///#ifndef E_MINEXP
	/* AS239 value, e^-88 = 2^-127 */
	///#define E_MINEXP (-88.0)
	///#endif
	///#ifndef E_MAXEXP
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define E_MAXEXP (-E_MINEXP)
	///#endif

	///#ifdef FLT_MAX
	///#define OFLOW   FLT_MAX		// 1.0E+37 
	///#else
	///#define OFLOW 1.0E+37
	///#endif

	/* AS239 value for igamma(a,x>=XBIG) = 1.0 */
	///#define XBIG 1.0E+08

	/*
	 * Mathematical constants
	 */
	///#define LNPI 1.14472988584940016
	///#define LNSQRT2PI 0.9189385332046727
	///#ifdef PI
	///#undef PI
	///#endif
	///#define PI 3.14159265358979323846
	///#define PNT68 0.6796875
	///#define SQRT_TWO 1.41421356237309504880168872420969809

	/* Prefer lgamma */
	///#ifndef GAMMA
	///#ifdef HAVE_LGAMMA
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GAMMA(x) lgamma (x)
	///#elif defined(HAVE_GAMMA)
	///#define GAMMA(x) gamma (x)
	///#else
	///#undef GAMMA
	///#endif
	///#endif

	///#if defined(GAMMA) && !HAVE_DECL_SIGNGAM
	//extern int signgam;		// this is not always declared in math.h 
	///#endif

	/* Local function declarations, not visible outside this file */
	public static int mtherr(String name, int code)
	{
		//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
		//	static String ermsg[7] = { "unknown", "domain", "singularity", "overflow", "underflow", "total loss of precision", "partial loss of precision" };

		/* Display string passed by calling program,
		 * which is supposed to be the name of the
		 * function in which the error occurred:
		 */
		System.out.printf("\n%s ", name);

		/* Set global error message word */
		merror = code;

		/* Display error message defined by the code argument.  */
		if ((code <= 0) || (code >= 7))
			code = 0;
		System.out.printf("%s error\n", mtherr_ermsg[code]);

		/* Return to calling program */
		return (0);
	}

	/*                                                      polevl.c
	 *                                                      p1evl.c
	 *
	 *      Evaluate polynomial
	 *
	 *
	 *
	 * SYNOPSIS:
	 *
	 * int N;
	 * double x, y, coef[N+1], polevl[];
	 *
	 * y = polevl( x, coef, N );
	 *
	 *
	 *
	 * DESCRIPTION:
	 *
	 * Evaluates polynomial of degree N:
	 *
	 *                     2          N
	 * y  =  C  + C x + C x  +...+ C x
	 *        0    1     2          N
	 *
	 * Coefficients are stored in reverse order:
	 *
	 * coef[0] = C  , ..., coef[N] = C  .
	 *            N                   0
	 *
	 *  The function p1evl() assumes that coef[N] = 1.0 and is
	 * omitted from the array.  Its calling arguments are
	 * otherwise the same as polevl().
	 *
	 *
	 * SPEED:
	 *
	 * In the interest of speed, there are no checks for out
	 * of bounds arithmetic.  This routine is used by most of
	 * the functions in the library.  Depending on available
	 * equipment features, the user may wish to rewrite the
	 * program in microcode or assembly language.
	 *
	 */

	/*
Cephes Math Library Release 2.1:  December, 1988
Copyright 1984, 1987, 1988 by Stephen L. Moshier
Direct inquiries to 30 Frost Street, Cambridge, MA 02140
	 */
	public static double polevl(double x, double[] coef, int N)
	{
		double ans;
		int i;
		
		int index = 0; //final double * p;

		//p = coef;
		ans = coef[index]; index++; //ans = *p++;
		i = N;

		do {
			ans = ans * x + coef[index]; index++;
		} while ((--i) != 0);

		return (ans);
	}

	/*                                          N
	 * Evaluate polynomial when coefficient of x  is 1.0.
	 * Otherwise same as polevl.
	 */
	public static double p1evl(double x, double[] coef, int N)
	{
		double ans;
		//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged.
		int index = 0; //final double * p;
		int i;

		//p = coef;
		ans = x + coef[index]; index++;//ans = x + *p++;
		i = N - 1;

		do {
			ans = ans * x + coef[index]; index++;;
		} while ((--i) != 0);

		return (ans);
	}
	public static double confrac(double a, double b, double x)
	{
		double Alo = 0.0;
		double Ahi;
		double Aev;
		double Aod;
		double Blo = 1.0;
		double Bhi = 1.0;
		double Bod = 1.0;
		double Bev = 1.0;
		double f;
		double fold;
		double Apb = a + b;
		double d;
		int i;
		int j;

		/* Set up continued fraction expansion evaluation. */
		Ahi = GlobalMembersEval.gp_exp(MathFunctions.lgamma(Apb) + a * Math.log(x) + b * Math.log(1.0 - x) - MathFunctions.lgamma(a + 1.0) - MathFunctions.lgamma(b));

		/*
		 * Continued fraction loop begins here. Evaluation continues until
		 * maximum iterations are exceeded, or convergence achieved.
		 */
		for (i = 0, j = 1, f = Ahi; i <= DefineConstants.ITMAX; i++, j++)
		{
			d = a + j + i;
			Aev = -(a + i) * (Apb + i) * x / d / (d - 1.0);
			Aod = j * (b - j) * x / d / (d + 1.0);
			Alo = Bev * Ahi + Aev * Alo;
			Blo = Bev * Bhi + Aev * Blo;
			Ahi = Bod * Alo + Aod * Ahi;
			Bhi = Bod * Blo + Aod * Bhi;

			if (Math.abs(Bhi) < DefineConstants.MACHEPS)
				Bhi = 0.0;

			if (Bhi != 0.0)
			{
				fold = f;
				f = Ahi / Bhi;
				if (Math.abs(f - fold) < Math.abs(f) * DefineConstants.MACHEPS)
					return f;
			}
		}

		return -1.0;
	}

	///#else // BADRAND 
	//
	// /* Use only to observe the effect of a "bad" random number generator. */
	//void f_rand(union argument *arg)
	//{
	//    struct value a;
	//
	//    (void) arg;				// avoid -Wunused warning 
	//    static unsigned int y = 0;
	//    unsigned int maxran = 1000;
	//
	//    (void) real(pop(&a));
	//    y = (781 * y + 387) % maxran;
	//
	//    push(Gcomplex(&a, (double) y / maxran, 0.0));
	//}
	//
	///#endif // BADRAND 

	/* ** ibeta.c
	 *
	 *   DESCRIBE  Approximate the incomplete beta function Ix(a, b).
	 *
	 *                           _
	 *                          |(a + b)     /x  (a-1)         (b-1)
	 *             Ix(a, b) = -_-------_--- * |  t     * (1 - t)     dt (a,b > 0)
	 *                        |(a) * |(b)   /0
	 *
	 *
	 *
	 *   CALL      p = ibeta(a, b, x)
	 *
	 *             double    a    > 0
	 *             double    b    > 0
	 *             double    x    [0, 1]
	 *
	 *   WARNING   none
	 *
	 *   RETURN    double    p    [0, 1]
	 *                            -1.0 on error condition
	 *
	 *   XREF      lngamma()
	 *
	 *   BUGS      This approximation is only accurate on the domain
	 *             x < (a-1)/(a+b-2)
	 *
	 *   REFERENCE The continued fraction expansion as given by
	 *             Abramowitz and Stegun (1964) is used.
	 *
	 * Copyright (c) 1992 Jos van der Woude, jvdwoude@hut.nl
	 *
	 * Note: this function was translated from the Public Domain Fortran
	 *       version available from http://lib.stat.cmu.edu/apstat/xxx
	 *
	 */

	public static double ibeta(double a, double b, double x)
	{
		/* Test for admissibility of arguments */
		if (a <= 0.0 || b <= 0.0)
			return -1.0;
		if (x < 0.0 || x > 1.0)
			return -1.0;

		/* If x equals 0 or 1, return x as prob */
		if (x == 0.0 || x == 1.0)
			return x;

		/* Swap a, b if necessary for more efficient evaluation */
		if (a < x * (a + b))
		{
			double temp = GlobalMembersSpecfun.confrac(b, a, 1.0 - x);
			return (temp < 0.0) ? temp : 1.0 - temp;
		}
		else
		{
			return GlobalMembersSpecfun.confrac(a, b, x);
		}
	}

	/* ** igamma.c
	 *
	 *   DESCRIBE  Approximate the incomplete gamma function P(a, x).
	 *
	 *                         1     /x  -t   (a-1)
	 *             P(a, x) = -_--- * |  e  * t     dt      (a > 0)
	 *                       |(a)   /0
	 *
	 *   CALL      p = igamma(a, x)
	 *
	 *             double    a    >  0
	 *             double    x    >= 0
	 *
	 *   WARNING   none
	 *
	 *   RETURN    double    p    [0, 1]
	 *                            -1.0 on error condition
	 *
	 *   XREF      lngamma()
	 *
	 *   BUGS      Values 0 <= x <= 1 may lead to inaccurate results.
	 *
	 *   REFERENCE ALGORITHM AS239  APPL. STATIST. (1988) VOL. 37, NO. 3
	 *
	 * Copyright (c) 1992 Jos van der Woude, jvdwoude@hut.nl
	 *
	 * Note: this function was translated from the Public Domain Fortran
	 *       version available from http://lib.stat.cmu.edu/apstat/239
	 *
	 */

	public static double igamma(double a, double x)
	{
		double arg;
		double aa;
		double an;
		double b;
		int i;

		/* Check that we have valid values for a and x */
		if (x < 0.0 || a <= 0.0)
			return -1.0;

		/* Deal with special cases */
		if (x == 0.0)
			return 0.0;
		if (x > DefineConstants.XBIG)
			return 1.0;

		/* Check value of factor arg */
		arg = a * Math.log(x) - x - MathFunctions.lgamma(a + 1.0);
		/* HBB 20031006: removed a spurious check here */
		arg = GlobalMembersEval.gp_exp(arg);

		/* Choose infinite series or continued fraction. */

		if ((x > 1.0) && (x >= a + 2.0))
		{
			/* Use a continued fraction expansion */
			double pn1;
			double pn2;
			double pn3;
			double pn4;
			double pn5;
			double pn6;
			double rn;
			double rnold;

			aa = 1.0 - a;
			b = aa + x + 1.0;
			pn1 = 1.0;
			pn2 = x;
			pn3 = x + 1.0;
			pn4 = x * b;
			rnold = pn3 / pn4;

			for (i = 1; i <= DefineConstants.ITMAX; i++)
			{

				aa++;
				b += 2.0;
				an = aa * (double) i;

				pn5 = b * pn3 - an * pn1;
				pn6 = b * pn4 - an * pn2;

				if (pn6 != 0.0)
				{

					rn = pn5 / pn6;
					if (Math.abs(rnold - rn) <= ((DefineConstants.MACHEPS) < (DefineConstants.MACHEPS * rn) ? (DefineConstants.MACHEPS) : (DefineConstants.MACHEPS * rn)))
						return 1.0 - arg * rn * a;

					rnold = rn;
				}
				pn1 = pn3;
				pn2 = pn4;
				pn3 = pn5;
				pn4 = pn6;

				/* Re-scale terms in continued fraction if terms are large */
				if (Math.abs(pn5) >= DefineConstants.OFLOW)
				{

					pn1 /= DefineConstants.OFLOW;
					pn2 /= DefineConstants.OFLOW;
					pn3 /= DefineConstants.OFLOW;
					pn4 /= DefineConstants.OFLOW;
				}
			}
		}
		else
		{
			/* Use Pearson's series expansion. */

			for (i = 0, aa = a, an = b = 1.0; i <= DefineConstants.ITMAX; i++)
			{

				aa++;
				an *= x / aa;
				b += an;
				if (an < b * DefineConstants.MACHEPS)
					return arg * b;
			}
		}
		return -1.0;
	}

	/***********************************************************************
     double ranf(double init)
                Random number generator as a Function
     Returns a random floating point number from a uniform distribution
     over 0 - 1 (endpoints of this interval are not returned) using a
     large integer generator.
     This is a transcription from Pascal to Fortran of routine
     Uniform_01 from the paper
     L'Ecuyer, P. and Cote, S. "Implementing a Random Number Package
     with Splitting Facilities." ACM Transactions on Mathematical
     Software, 17:98-111 (1991)

               Generate Large Integer
     Returns a random integer following a uniform distribution over
     (1, 2147483562) using the generator.
     This is a transcription from Pascal to Fortran of routine
     Random from the paper
     L'Ecuyer, P. and Cote, S. "Implementing a Random Number Package
     with Splitting Facilities." ACM Transactions on Mathematical
     Software, 17:98-111 (1991)
	 ***********************************************************************/
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static int ranf_firsttime = 1;
	//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
	private static int ranf_seed1;
	private static int seed2;
	public static double ranf(value init)
	{
		int k;
		int z;
		//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
		//	static int firsttime = 1;
		//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
		//	static int seed1, seed2;
		final int Xm1 = 2147483563;
		final int Xm2 = 2147483399;
		final int Xa1 = 40014;
		final int Xa2 = 40692;


		/* (Re)-Initialize seeds if necessary */
		if (GlobalMembersEval.real(init) < 0.0 || ranf_firsttime == 1)
		{
			ranf_firsttime = 0;
			ranf_seed1 = 1234567890;
			seed2 = 1234567890;
		}

		/* Construct new seed values from input parameter */
		/* FIXME: Ideally we should allow all 64 bits of seed to be set */
		if (GlobalMembersEval.real(init) > 0.0)
		{
			if (GlobalMembersEval.real(init) >= (double)(017777777777))
				GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Illegal seed value");
			if (GlobalMembersEval.imag(init) >= (double)(017777777777))
				GlobalMembersBf_test.int_error(DefineConstants.NO_CARET, "Illegal seed value");
			ranf_seed1 = (int)GlobalMembersEval.real(init);
			seed2 = (int)GlobalMembersEval.imag(init);
			if (seed2 == 0)
				seed2 = ranf_seed1;
		}
		GlobalMembersFit.a((stderr,"ranf: seed = %lo %lo        %ld %ld\n", ranf_seed1,seed2));

		/* Generate pseudo random integers */
		k = ranf_seed1 / 53668;
		ranf_seed1 = Xa1 * (ranf_seed1 - k * 53668) - k * 12211;
		if (ranf_seed1 < 0)
			ranf_seed1 += Xm1;
		k = seed2 / 52774;
		seed2 = Xa2 * (seed2 - k * 52774) - k * 3791;
		if (seed2 < 0)
			seed2 += Xm2;
		z = ranf_seed1 - seed2;
		if (z < 1)
			z += (Xm1 - 1);

		/*
		 * 4.656613057E-10 is 1/Xm1.  Xm1 is set at the top of this file and is
		 * currently 2147483563. If Xm1 changes, change this also.
		 */
		return (double) 4.656613057E-10 * z;
	}

	/*
Cephes Math Library Release 2.8:  June, 2000
Copyright 1984, 1987, 1988, 1992, 2000 by Stephen L. Moshier
	 */

	///#ifndef HAVE_ERFC
	// /*                                                     erfc.c
	//  *
	//  *      Complementary error function
	//  *
	//  *
	//  *
	//  * SYNOPSIS:
	//  *
	//  * double x, y, erfc();
	//  *
	//  * y = erfc( x );
	//  *
	//  *
	//  *
	//  * DESCRIPTION:
	//  *
	//  *
	//  *  1 - erf(x) =
	//  *
	//  *                           inf.
	//  *                             -
	//  *                  2         | |          2
	//  *   erfc(x)  =  --------     |    exp( - t  ) dt
	//  *               sqrt(pi)   | |
	//  *                           -
	//  *                            x
	//  *
	//  *
	//  * For small x, erfc(x) = 1 - erf(x); otherwise rational
	//  * approximations are computed.
	//  *
	//  *
	//  *
	//  * ACCURACY:
	//  *
	//  *                      Relative error:
	//  * arithmetic   domain     # trials      peak         rms
	//  *    DEC       0, 9.2319   12000       5.1e-16     1.2e-16
	//  *    IEEE      0,26.6417   30000       5.7e-14     1.5e-14
	//  *
	//  *
	//  * ERROR MESSAGES:
	//  *
	//  *   message         condition              value returned
	//  * erfc underflow    x > 9.231948545 (DEC)       0.0
	//  *
	//  *
	//  */
	//
	//static double
	//erfc(double a)
	//{
	///#ifdef UNK
	//    static const double   P[] = {
	//	2.46196981473530512524E-10,
	//	5.64189564831068821977E-1,
	//	7.46321056442269912687E0,
	//	4.86371970985681366614E1,
	//	1.96520832956077098242E2,
	//	5.26445194995477358631E2,
	//	9.34528527171957607540E2,
	//	1.02755188689515710272E3,
	//	5.57535335369399327526E2
	//    };
	//    static const double   Q[] = {
	// /* 1.00000000000000000000E0,*/
	//	1.32281951154744992508E1,
	//	8.67072140885989742329E1,
	//	3.54937778887819891062E2,
	//	9.75708501743205489753E2,
	//	1.82390916687909736289E3,
	//	2.24633760818710981792E3,
	//	1.65666309194161350182E3,
	//	5.57535340817727675546E2
	//    };
	//    static const double   R[] = {
	//	5.64189583547755073984E-1,
	//	1.27536670759978104416E0,
	//	5.01905042251180477414E0,
	//	6.16021097993053585195E0,
	//	7.40974269950448939160E0,
	//	2.97886665372100240670E0
	//    };
	//    static const double   S[] = {
	// /* 1.00000000000000000000E0,*/
	//	2.26052863220117276590E0,
	//	9.39603524938001434673E0,
	//	1.20489539808096656605E1,
	//	1.70814450747565897222E1,
	//	9.60896809063285878198E0,
	//	3.36907645100081516050E0
	//    };
	///#endif // UNK 
	//
	///#ifdef DEC
	//    static const unsigned short P[] = {
	//	0030207, 0054445, 0011173, 0021706,
	//	0040020, 0067272, 0030661, 0122075,
	//	0040756, 0151236, 0173053, 0067042,
	//	0041502, 0106175, 0062555, 0151457,
	//	0042104, 0102525, 0047401, 0003667,
	//	0042403, 0116176, 0011446, 0075303,
	//	0042551, 0120723, 0061641, 0123275,
	//	0042600, 0070651, 0007264, 0134516,
	//	0042413, 0061102, 0167507, 0176625
	//    };
	//    static const unsigned short Q[] = {
	// /*0040200,0000000,0000000,0000000,*/
	//	0041123, 0123257, 0165741, 0017142,
	//	0041655, 0065027, 0173413, 0115450,
	//	0042261, 0074011, 0021573, 0004150,
	//	0042563, 0166530, 0013662, 0007200,
	//	0042743, 0176427, 0162443, 0105214,
	//	0043014, 0062546, 0153727, 0123772,
	//	0042717, 0012470, 0006227, 0067424,
	//	0042413, 0061103, 0003042, 0013254
	//    };
	//    static const unsigned short R[] = {
	//	0040020, 0067272, 0101024, 0155421,
	//	0040243, 0037467, 0056706, 0026462,
	//	0040640, 0116017, 0120665, 0034315,
	//	0040705, 0020162, 0143350, 0060137,
	//	0040755, 0016234, 0134304, 0130157,
	//	0040476, 0122700, 0051070, 0015473
	//    };
	//    static const unsigned short S[] = {
	// /*0040200,0000000,0000000,0000000,*/
	//	0040420, 0126200, 0044276, 0070413,
	//	0041026, 0053051, 0007302, 0063746,
	//	0041100, 0144203, 0174051, 0061151,
	//	0041210, 0123314, 0126343, 0177646,
	//	0041031, 0137125, 0051431, 0033011,
	//	0040527, 0117362, 0152661, 0066201
	//    };
	///#endif // DEC 
	//
	///#ifdef IBMPC
	//    static const unsigned short P[] = {
	//	0x6479, 0xa24f, 0xeb24, 0x3df0,
	//	0x3488, 0x4636, 0x0dd7, 0x3fe2,
	//	0x6dc4, 0xdec5, 0xda53, 0x401d,
	//	0xba66, 0xacad, 0x518f, 0x4048,
	//	0x20f7, 0xa9e0, 0x90aa, 0x4068,
	//	0xcf58, 0xc264, 0x738f, 0x4080,
	//	0x34d8, 0x6c74, 0x343a, 0x408d,
	//	0x972a, 0x21d6, 0x0e35, 0x4090,
	//	0xffb3, 0x5de8, 0x6c48, 0x4081
	//    };
	//    static const unsigned short Q[] = {
	// /*0x0000,0x0000,0x0000,0x3ff0,*/
	//	0x23cc, 0xfd7c, 0x74d5, 0x402a,
	//	0x7365, 0xfee1, 0xad42, 0x4055,
	//	0x610d, 0x246f, 0x2f01, 0x4076,
	//	0x41d0, 0x02f6, 0x7dab, 0x408e,
	//	0x7151, 0xfca4, 0x7fa2, 0x409c,
	//	0xf4ff, 0xdafa, 0x8cac, 0x40a1,
	//	0xede2, 0x0192, 0xe2a7, 0x4099,
	//	0x42d6, 0x60c4, 0x6c48, 0x4081
	//    };
	//    static const unsigned short R[] = {
	//	0x9b62, 0x5042, 0x0dd7, 0x3fe2,
	//	0xc5a6, 0xebb8, 0x67e6, 0x3ff4,
	//	0xa71a, 0xf436, 0x1381, 0x4014,
	//	0x0c0c, 0x58dd, 0xa40e, 0x4018,
	//	0x960e, 0x9718, 0xa393, 0x401d,
	//	0x0367, 0x0a47, 0xd4b8, 0x4007
	//    };
	//    static const unsigned short S[] = {
	// /*0x0000,0x0000,0x0000,0x3ff0,*/
	//	0xce21, 0x0917, 0x1590, 0x4002,
	//	0x4cfd, 0x21d8, 0xcac5, 0x4022,
	//	0x2c4d, 0x7f05, 0x1910, 0x4028,
	//	0x7ff5, 0x959c, 0x14d9, 0x4031,
	//	0x26c1, 0xaa63, 0x37ca, 0x4023,
	//	0x2d90, 0x5ab6, 0xf3de, 0x400a
	//    };
	///#endif // IBMPC 
	//
	///#ifdef MIEEE
	//    static const unsigned short P[] = {
	//	0x3df0, 0xeb24, 0xa24f, 0x6479,
	//	0x3fe2, 0x0dd7, 0x4636, 0x3488,
	//	0x401d, 0xda53, 0xdec5, 0x6dc4,
	//	0x4048, 0x518f, 0xacad, 0xba66,
	//	0x4068, 0x90aa, 0xa9e0, 0x20f7,
	//	0x4080, 0x738f, 0xc264, 0xcf58,
	//	0x408d, 0x343a, 0x6c74, 0x34d8,
	//	0x4090, 0x0e35, 0x21d6, 0x972a,
	//	0x4081, 0x6c48, 0x5de8, 0xffb3
	//    };
	//    static const unsigned short Q[] = {
	//	0x402a, 0x74d5, 0xfd7c, 0x23cc,
	//	0x4055, 0xad42, 0xfee1, 0x7365,
	//	0x4076, 0x2f01, 0x246f, 0x610d,
	//	0x408e, 0x7dab, 0x02f6, 0x41d0,
	//	0x409c, 0x7fa2, 0xfca4, 0x7151,
	//	0x40a1, 0x8cac, 0xdafa, 0xf4ff,
	//	0x4099, 0xe2a7, 0x0192, 0xede2,
	//	0x4081, 0x6c48, 0x60c4, 0x42d6
	//    };
	//    static const unsigned short R[] = {
	//	0x3fe2, 0x0dd7, 0x5042, 0x9b62,
	//	0x3ff4, 0x67e6, 0xebb8, 0xc5a6,
	//	0x4014, 0x1381, 0xf436, 0xa71a,
	//	0x4018, 0xa40e, 0x58dd, 0x0c0c,
	//	0x401d, 0xa393, 0x9718, 0x960e,
	//	0x4007, 0xd4b8, 0x0a47, 0x0367
	//    };
	//    static const unsigned short S[] = {
	//	0x4002, 0x1590, 0x0917, 0xce21,
	//	0x4022, 0xcac5, 0x21d8, 0x4cfd,
	//	0x4028, 0x1910, 0x7f05, 0x2c4d,
	//	0x4031, 0x14d9, 0x959c, 0x7ff5,
	//	0x4023, 0x37ca, 0xaa63, 0x26c1,
	//	0x400a, 0xf3de, 0x5ab6, 0x2d90
	//    };
	///#endif // MIEEE 
	//
	//    double p, q, x, y, z;
	//
	//    if (a < 0.0)
	//        x = -a;
	//    else
	//        x = a;
	//
	//    if (x < 1.0)
	//        return (1.0 - erf(a));
	//
	//    z = -a * a;
	//
	//    if (z < DBL_MIN_10_EXP) {
	//    under:
	//        mtherr("erfc", MTHERR_UNDERFLOW);
	//        if (a < 0)
	//            return (2.0);
	//        else
	//            return (0.0);
	//    }
	//    z = exp(z);
	//
	//    if (x < 8.0) {
	//        p = polevl(x, P, 8);
	//        q = p1evl(x, Q, 8);
	//    } else {
	//        p = polevl(x, R, 5);
	//        q = p1evl(x, S, 6);
	//    }
	//    y = (z * p) / q;
	//
	//    if (a < 0)
	//        y = 2.0 - y;
	//
	//    if (y == 0.0)
	//        goto under;
	//
	//    return (y);
	//}
	///#endif // !HAVE_ERFC 

	///#ifndef HAVE_ERF
	// /*                                                     erf.c
	//  *
	//  *      Error function
	//  *
	//  *
	//  *
	//  * SYNOPSIS:
	//  *
	//  * double x, y, erf();
	//  *
	//  * y = erf( x );
	//  *
	//  *
	//  *
	//  * DESCRIPTION:
	//  *
	//  * The integral is
	//  *
	//  *                           x
	//  *                            -
	//  *                 2         | |          2
	//  *   erf(x)  =  --------     |    exp( - t  ) dt.
	//  *              sqrt(pi)   | |
	//  *                          -
	//  *                           0
	//  *
	//  * The magnitude of x is limited to 9.231948545 for DEC
	//  * arithmetic; 1 or -1 is returned outside this range.
	//  *
	//  * For 0 <= |x| < 1, erf(x) = x * P4(x**2)/Q5(x**2); otherwise
	//  * erf(x) = 1 - erfc(x).
	//  *
	//  *
	//  *
	//  * ACCURACY:
	//  *
	//  *                      Relative error:
	//  * arithmetic   domain     # trials      peak         rms
	//  *    DEC       0,1         14000       4.7e-17     1.5e-17
	//  *    IEEE      0,1         30000       3.7e-16     1.0e-16
	//  *
	//  */
	//
	//static double
	//erf(double x)
	//{
	//
	///#ifdef UNK
	//    static const double   T[] = {
	//	9.60497373987051638749E0,
	//	9.00260197203842689217E1,
	//	2.23200534594684319226E3,
	//	7.00332514112805075473E3,
	//	5.55923013010394962768E4
	//    };
	//    static const double   U[] = {
	// /* 1.00000000000000000000E0,*/
	//	3.35617141647503099647E1,
	//	5.21357949780152679795E2,
	//	4.59432382970980127987E3,
	//	2.26290000613890934246E4,
	//	4.92673942608635921086E4
	//    };
	///#endif
	//
	///#ifdef DEC
	//    static const unsigned short T[] = {
	//	0041031, 0126770, 0170672, 0166101,
	//	0041664, 0006522, 0072360, 0031770,
	//	0043013, 0100025, 0162641, 0126671,
	//	0043332, 0155231, 0161627, 0076200,
	//	0044131, 0024115, 0021020, 0117343
	//    };
	//    static const unsigned short U[] = {
	// /*0040200,0000000,0000000,0000000,*/
	//	0041406, 0037461, 0177575, 0032714,
	//	0042402, 0053350, 0123061, 0153557,
	//	0043217, 0111227, 0032007, 0164217,
	//	0043660, 0145000, 0004013, 0160114,
	//	0044100, 0071544, 0167107, 0125471
	//    };
	///#endif
	//
	///#ifdef IBMPC
	//    static const unsigned short T[] = {
	//	0x5d88, 0x1e37, 0x35bf, 0x4023,
	//	0x067f, 0x4e9e, 0x81aa, 0x4056,
	//	0x35b7, 0xbcb4, 0x7002, 0x40a1,
	//	0xef90, 0x3c72, 0x5b53, 0x40bb,
	//	0x13dc, 0xa442, 0x2509, 0x40eb
	//    };
	//    static const unsigned short U[] = {
	// /*0x0000,0x0000,0x0000,0x3ff0,*/
	//	0xa6ba, 0x3fef, 0xc7e6, 0x4040,
	//	0x3aee, 0x14c6, 0x4add, 0x4080,
	//	0xfd12, 0xe680, 0xf252, 0x40b1,
	//	0x7c0a, 0x0101, 0x1940, 0x40d6,
	//	0xf567, 0x9dc8, 0x0e6c, 0x40e8
	//    };
	///#endif
	//
	///#ifdef MIEEE
	//    static const unsigned short T[] = {
	//	0x4023, 0x35bf, 0x1e37, 0x5d88,
	//	0x4056, 0x81aa, 0x4e9e, 0x067f,
	//	0x40a1, 0x7002, 0xbcb4, 0x35b7,
	//	0x40bb, 0x5b53, 0x3c72, 0xef90,
	//	0x40eb, 0x2509, 0xa442, 0x13dc
	//    };
	//    static const unsigned short U[] = {
	//	0x4040, 0xc7e6, 0x3fef, 0xa6ba,
	//	0x4080, 0x4add, 0x14c6, 0x3aee,
	//	0x40b1, 0xf252, 0xe680, 0xfd12,
	//	0x40d6, 0x1940, 0x0101, 0x7c0a,
	//	0x40e8, 0x0e6c, 0x9dc8, 0xf567
	//    };
	///#endif
	//
	//    double y, z;
	//
	//    if (fabs(x) > 1.0)
	//        return (1.0 - erfc(x));
	//    z = x * x;
	//    y = x * polevl(z, T, 4) / p1evl(z, U, 5);
	//    return (y);
	//}
	///#endif // !HAVE_ERF 

	/* ----------------------------------------------------------------
   Following function for the inverse error function is taken from
   NIST on 16. May 2002.
   Use Newton-Raphson correction also for range -1 to -y0 and
   add 3rd cycle to improve convergence -  E A Merritt 21.10.2003
   ----------------------------------------------------------------
	 */

	public static double inverse_error_func(double y)
	{
		double x = 0.0; // The output
		double z = 0.0; // Intermadiate variable
		double y0 = 0.7; // Central range variable

		/* Coefficients in rational approximations. */
		double[] a = {0.886226899, -1.645349621, 0.914624893, -0.140543331};
		double[] b = {-2.118377725, 1.442710462, -0.329097515, 0.012229801};
		double[] c = {-1.970840454, -1.624906493, 3.429567803, 1.641345311};
		double[] d = {3.543889200, 1.637067800};

		if ((y < -1.0) || (1.0 < y))
		{
			System.out.print("inverse_error_func: The value out of the range of the function");
			x = Math.log(-1.0);
			return (x);
		}
		else if ((y == -1.0) || (1.0 == y))
		{
			x = -y * Math.log(0.0);
			return (x);
		}
		else if ((-1.0 < y) && (y < -y0))
		{
			z = Math.sqrt(-Math.log((1.0 + y) / 2.0));
			x = -(((c[3] * z + c[2]) * z + c[1]) * z + c[0]) / ((d[1] * z + d[0]) * z + 1.0);
		}
		else
		{
			if ((-y0 <= y) && (y <= y0))
			{
				z = y * y;
				x = y * (((a[3] * z + a[2]) * z + a[1]) * z + a[0]) / ((((b[3] * z + b[3]) * z + b[1]) * z + b[0]) * z + 1.0);
			}
			else if ((y0 < y) && (y < 1.0))
			{
				z = Math.sqrt(-Math.log((1.0 - y) / 2.0));
				x = (((c[3] * z + c[2]) * z + c[1]) * z + c[0]) / ((d[1] * z + d[0]) * z + 1.0);
			}
		}
		/* Three steps of Newton-Raphson correction to full accuracy. OK - four */
		x = x - (MathFunctions.erf(x) - y) / (2.0 / Math.sqrt(DefineConstants.PI) * GlobalMembersEval.gp_exp(-x * x));
		x = x - (MathFunctions.erf(x) - y) / (2.0 / Math.sqrt(DefineConstants.PI) * GlobalMembersEval.gp_exp(-x * x));
		x = x - (MathFunctions.erf(x) - y) / (2.0 / Math.sqrt(DefineConstants.PI) * GlobalMembersEval.gp_exp(-x * x));
		x = x - (MathFunctions.erf(x) - y) / (2.0 / Math.sqrt(DefineConstants.PI) * GlobalMembersEval.gp_exp(-x * x));

		return (x);
	}
	///#endif

	///#ifdef DEC
	//static unsigned short s2p[] = {0040440, 0066230, 0177661, 0034055};
	///#define s2pi *(double *)s2p
	///#endif

	///#ifdef IBMPC
	//static unsigned short s2p[] = {0x2706, 0x1ff6, 0x0d93, 0x4004};
	///#define s2pi *(double *)s2p
	///#endif

	///#ifdef MIEEE
	//static unsigned short s2p[] = {
	//    0x4004, 0x0d93, 0x1ff6, 0x2706
	//};
	///#define s2pi *(double *)s2p
	///#endif

	public static double inverse_normal_func(double y0)
	{
		/* approximation for 0 <= |y - 0.5| <= 3/8 */
		///#ifdef UNK
		double[] P0 = {-5.99633501014107895267E1, 9.80010754185999661536E1, -5.66762857469070293439E1, 1.39312609387279679503E1, -1.23916583867381258016E0};
		double[] Q0 = {1.95448858338141759834E0, 4.67627912898881538453E0, 8.63602421390890590575E1, -2.25462687854119370527E2, 2.00260212380060660359E2, -8.20372256168333339912E1, 1.59056225126211695515E1, -1.18331621121330003142E0};
		/* 1.00000000000000000000E0,*/
		///#endif
		///#ifdef DEC
		//    static const unsigned short P0[20] = {
		//	0141557, 0155170, 0071360, 0120550,
		//	0041704, 0000214, 0172417, 0067307,
		//	0141542, 0132204, 0040066, 0156723,
		//	0041136, 0163161, 0157276, 0007747,
		//	0140236, 0116374, 0073666, 0051764,
		//    };
		//    static const unsigned short Q0[32] = {
		// /*0040200,0000000,0000000,0000000,*/
		//	0040372, 0026256, 0110403, 0123707,
		//	0040625, 0122024, 0020277, 0026661,
		//	0041654, 0134161, 0124134, 0007244,
		//	0142141, 0073162, 0133021, 0131371,
		//	0042110, 0041235, 0043516, 0057767,
		//	0141644, 0011417, 0036155, 0137305,
		//	0041176, 0076556, 0004043, 0125430,
		//	0140227, 0073347, 0152776, 0067251,
		//    };
		///#endif
		///#ifdef IBMPC
		//    static const unsigned short P0[20] = {
		//	0x142d, 0x0e5e, 0xfb4f, 0xc04d,
		//	0xedd9, 0x9ea1, 0x8011, 0x4058,
		//	0xdbba, 0x8806, 0x5690, 0xc04c,
		//	0xc1fd, 0x3bd7, 0xdcce, 0x402b,
		//	0xca7e, 0x8ef6, 0xd39f, 0xbff3,
		//    };
		//    static const unsigned short Q0[36] = {
		// /*0x0000,0x0000,0x0000,0x3ff0,*/
		//	0x74f9, 0xd220, 0x4595, 0x3fff,
		//	0xe5b6, 0x8417, 0xb482, 0x4012,
		//	0x81d4, 0x350b, 0x970e, 0x4055,
		//	0x365f, 0x56c2, 0x2ece, 0xc06c,
		//	0xcbff, 0xa8e9, 0x0853, 0x4069,
		//	0xb7d9, 0xe78d, 0x8261, 0xc054,
		//	0x7563, 0xc104, 0xcfad, 0x402f,
		//	0xcdd5, 0xfabf, 0xeedc, 0xbff2,
		//    };
		///#endif
		///#ifdef MIEEE
		//    static const unsigned short P0[20] = {
		//	0xc04d, 0xfb4f, 0x0e5e, 0x142d,
		//	0x4058, 0x8011, 0x9ea1, 0xedd9,
		//	0xc04c, 0x5690, 0x8806, 0xdbba,
		//	0x402b, 0xdcce, 0x3bd7, 0xc1fd,
		//	0xbff3, 0xd39f, 0x8ef6, 0xca7e,
		//    };
		//    static const unsigned short Q0[32] = {
		// /*0x3ff0,0x0000,0x0000,0x0000,*/
		//	0x3fff, 0x4595, 0xd220, 0x74f9,
		//	0x4012, 0xb482, 0x8417, 0xe5b6,
		//	0x4055, 0x970e, 0x350b, 0x81d4,
		//	0xc06c, 0x2ece, 0x56c2, 0x365f,
		//	0x4069, 0x0853, 0xa8e9, 0xcbff,
		//	0xc054, 0x8261, 0xe78d, 0xb7d9,
		//	0x402f, 0xcfad, 0xc104, 0x7563,
		//	0xbff2, 0xeedc, 0xfabf, 0xcdd5,
		//    };
		///#endif

		/* Approximation for interval z = sqrt(-2 log y ) between 2 and 8
		 * i.e., y between exp(-2) = .135 and exp(-32) = 1.27e-14.
		 */
		///#ifdef UNK
		double[] P1 = {4.05544892305962419923E0, 3.15251094599893866154E1, 5.71628192246421288162E1, 4.40805073893200834700E1, 1.46849561928858024014E1, 2.18663306850790267539E0, -1.40256079171354495875E-1, -3.50424626827848203418E-2, -8.57456785154685413611E-4};
		double[] Q1 = {1.57799883256466749731E1, 4.53907635128879210584E1, 4.13172038254672030440E1, 1.50425385692907503408E1, 2.50464946208309415979E0, -1.42182922854787788574E-1, -3.80806407691578277194E-2, -9.33259480895457427372E-4};
		/*  1.00000000000000000000E0,*/
		///#endif
		///#ifdef DEC
		//    static const unsigned short P1[36] = {
		//	0040601, 0143074, 0150744, 0073326,
		//	0041374, 0031554, 0113253, 0146016,
		//	0041544, 0123272, 0012463, 0176771,
		//	0041460, 0051160, 0103560, 0156511,
		//	0041152, 0172624, 0117772, 0030755,
		//	0040413, 0170713, 0151545, 0176413,
		//	0137417, 0117512, 0022154, 0131671,
		//	0137017, 0104257, 0071432, 0007072,
		//	0135540, 0143363, 0063137, 0036166,
		//    };
		//    static const unsigned short Q1[32] = {
		// /*0040200,0000000,0000000,0000000,*/
		//	0041174, 0075325, 0004736, 0120326,
		//	0041465, 0110044, 0047561, 0045567,
		//	0041445, 0042321, 0012142, 0030340,
		//	0041160, 0127074, 0166076, 0141051,
		//	0040440, 0046055, 0040745, 0150400,
		//	0137421, 0114146, 0067330, 0010621,
		//	0137033, 0175162, 0025555, 0114351,
		//	0135564, 0122773, 0145750, 0030357,
		//    };
		///#endif
		///#ifdef IBMPC
		//    static const unsigned short P1[36] = {
		//	0x8edb, 0x9a3c, 0x38c7, 0x4010,
		//	0x7982, 0x92d5, 0x866d, 0x403f,
		//	0x7fbf, 0x42a6, 0x94d7, 0x404c,
		//	0x1ba9, 0x10ee, 0x0a4e, 0x4046,
		//	0x463e, 0x93ff, 0x5eb2, 0x402d,
		//	0xbfa1, 0x7a6c, 0x7e39, 0x4001,
		//	0x9677, 0x448d, 0xf3e9, 0xbfc1,
		//	0x41c7, 0xee63, 0xf115, 0xbfa1,
		//	0xe78f, 0x6ccb, 0x18de, 0xbf4c,
		//    };
		//    static const unsigned short Q1[32] = {
		// /*0x0000,0x0000,0x0000,0x3ff0,*/
		//	0xd41b, 0xa13b, 0x8f5a, 0x402f,
		//	0x296f, 0x89ee, 0xb204, 0x4046,
		//	0x461c, 0x228c, 0xa89a, 0x4044,
		//	0xd845, 0x9d87, 0x15c7, 0x402e,
		//	0xba20, 0xa83c, 0x0985, 0x4004,
		//	0x0232, 0xcddb, 0x330c, 0xbfc2,
		//	0xb31d, 0x456d, 0x7f4e, 0xbfa3,
		//	0x061e, 0x797d, 0x94bf, 0xbf4e,
		//    };
		///#endif
		///#ifdef MIEEE
		//    static const unsigned short P1[36] = {
		//	0x4010, 0x38c7, 0x9a3c, 0x8edb,
		//	0x403f, 0x866d, 0x92d5, 0x7982,
		//	0x404c, 0x94d7, 0x42a6, 0x7fbf,
		//	0x4046, 0x0a4e, 0x10ee, 0x1ba9,
		//	0x402d, 0x5eb2, 0x93ff, 0x463e,
		//	0x4001, 0x7e39, 0x7a6c, 0xbfa1,
		//	0xbfc1, 0xf3e9, 0x448d, 0x9677,
		//	0xbfa1, 0xf115, 0xee63, 0x41c7,
		//	0xbf4c, 0x18de, 0x6ccb, 0xe78f,
		//    };
		//    static const unsigned short Q1[32] = {
		// /*0x3ff0,0x0000,0x0000,0x0000,*/
		//	0x402f, 0x8f5a, 0xa13b, 0xd41b,
		//	0x4046, 0xb204, 0x89ee, 0x296f,
		//	0x4044, 0xa89a, 0x228c, 0x461c,
		//	0x402e, 0x15c7, 0x9d87, 0xd845,
		//	0x4004, 0x0985, 0xa83c, 0xba20,
		//	0xbfc2, 0x330c, 0xcddb, 0x0232,
		//	0xbfa3, 0x7f4e, 0x456d, 0xb31d,
		//	0xbf4e, 0x94bf, 0x797d, 0x061e,
		//    };
		///#endif

		/* Approximation for interval z = sqrt(-2 log y ) between 8 and 64
		 * i.e., y between exp(-32) = 1.27e-14 and exp(-2048) = 3.67e-890.
		 */

		///#ifdef UNK
		double[] P2 = {3.23774891776946035970E0, 6.91522889068984211695E0, 3.93881025292474443415E0, 1.33303460815807542389E0, 2.01485389549179081538E-1, 1.23716634817820021358E-2, 3.01581553508235416007E-4, 2.65806974686737550832E-6, 6.23974539184983293730E-9};
		double[] Q2 = {6.02427039364742014255E0, 3.67983563856160859403E0, 1.37702099489081330271E0, 2.16236993594496635890E-1, 1.34204006088543189037E-2, 3.28014464682127739104E-4, 2.89247864745380683936E-6, 6.79019408009981274425E-9};
		/*  1.00000000000000000000E0,*/
		///#endif
		///#ifdef DEC
		//    static const unsigned short P2[36] = {
		//	0040517, 0033507, 0036236, 0125641,
		//	0040735, 0044616, 0014473, 0140133,
		//	0040574, 0012567, 0114535, 0102541,
		//	0040252, 0120340, 0143474, 0150135,
		//	0037516, 0051057, 0115361, 0031211,
		//	0036512, 0131204, 0101511, 0125144,
		//	0035236, 0016627, 0043160, 0140216,
		//	0033462, 0060512, 0060141, 0010641,
		//	0031326, 0062541, 0101304, 0077706,
		//    };
		//    static const unsigned short Q2[32] = {
		// /*0040200,0000000,0000000,0000000,*/
		//	0040700, 0143322, 0132137, 0040501,
		//	0040553, 0101155, 0053221, 0140257,
		//	0040260, 0041071, 0052573, 0010004,
		//	0037535, 0066472, 0177261, 0162330,
		//	0036533, 0160475, 0066666, 0036132,
		//	0035253, 0174533, 0027771, 0044027,
		//	0033502, 0016147, 0117666, 0063671,
		//	0031351, 0047455, 0141663, 0054751,
		//    };
		///#endif
		///#ifdef IBMPC
		//    static const unsigned short P2[36] = {
		//	0xd574, 0xe793, 0xe6e8, 0x4009,
		//	0x780b, 0xc327, 0xa931, 0x401b,
		//	0xb0ac, 0xf32b, 0x82ae, 0x400f,
		//	0x9a0c, 0x18e7, 0x541c, 0x3ff5,
		//	0x2651, 0xf35e, 0xca45, 0x3fc9,
		//	0x354d, 0x9069, 0x5650, 0x3f89,
		//	0x1812, 0xe8ce, 0xc3b2, 0x3f33,
		//	0x2234, 0x4c0c, 0x4c29, 0x3ec6,
		//	0x8ff9, 0x3058, 0xccac, 0x3e3a,
		//    };
		//    static const unsigned short Q2[32] = {
		// /*0x0000,0x0000,0x0000,0x3ff0,*/
		//	0xe828, 0x568b, 0x18da, 0x4018,
		//	0x3816, 0xaad2, 0x704d, 0x400d,
		//	0x6200, 0x2aaf, 0x0847, 0x3ff6,
		//	0x3c9b, 0x5fd6, 0xada7, 0x3fcb,
		//	0xc78b, 0xadb6, 0x7c27, 0x3f8b,
		//	0x2903, 0x65ff, 0x7f2b, 0x3f35,
		//	0xccf7, 0xf3f6, 0x438c, 0x3ec8,
		//	0x6b3d, 0xb876, 0x29e5, 0x3e3d,
		//    };
		///#endif
		///#ifdef MIEEE
		//    static const unsigned short P2[36] = {
		//	0x4009, 0xe6e8, 0xe793, 0xd574,
		//	0x401b, 0xa931, 0xc327, 0x780b,
		//	0x400f, 0x82ae, 0xf32b, 0xb0ac,
		//	0x3ff5, 0x541c, 0x18e7, 0x9a0c,
		//	0x3fc9, 0xca45, 0xf35e, 0x2651,
		//	0x3f89, 0x5650, 0x9069, 0x354d,
		//	0x3f33, 0xc3b2, 0xe8ce, 0x1812,
		//	0x3ec6, 0x4c29, 0x4c0c, 0x2234,
		//	0x3e3a, 0xccac, 0x3058, 0x8ff9,
		//    };
		//    static const unsigned short Q2[32] = {
		// /*0x3ff0,0x0000,0x0000,0x0000,*/
		//	0x4018, 0x18da, 0x568b, 0xe828,
		//	0x400d, 0x704d, 0xaad2, 0x3816,
		//	0x3ff6, 0x0847, 0x2aaf, 0x6200,
		//	0x3fcb, 0xada7, 0x5fd6, 0x3c9b,
		//	0x3f8b, 0x7c27, 0xadb6, 0xc78b,
		//	0x3f35, 0x7f2b, 0x65ff, 0x2903,
		//	0x3ec8, 0x438c, 0xf3f6, 0xccf7,
		//	0x3e3d, 0x29e5, 0xb876, 0x6b3d,
		//    };
		///#endif

		double x;
		double y;
		double z;
		double y2;
		double x0;
		double x1;
		int code;

		if (y0 <= 0.0)
		{
			GlobalMembersSpecfun.mtherr("inverse_normal_func", DefineConstants.MTHERR_DOMAIN);
			return (-DefineConstants.DBL_MAX);
		}
		if (y0 >= 1.0)
		{
			GlobalMembersSpecfun.mtherr("inverse_normal_func", DefineConstants.MTHERR_DOMAIN);
			return (DefineConstants.DBL_MAX);
		}
		code = 1;
		y = y0;
		if (y > (1.0 - 0.13533528323661269189)) // 0.135... = exp(-2)
		{
			y = 1.0 - y;
			code = 0;
		}
		if (y > 0.13533528323661269189)
		{
			y = y - 0.5;
			y2 = y * y;
			x = y + y * (y2 * GlobalMembersSpecfun.polevl(y2, P0, 4) / GlobalMembersSpecfun.p1evl(y2, Q0, 8));
			x = x * s2pi;
			return (x);
		}
		x = Math.sqrt(-2.0 * Math.log(y));
		x0 = x - Math.log(x) / x;

		z = 1.0 / x;
		if (x < 8.0) // y > exp(-32) = 1.2664165549e-14
			x1 = z * GlobalMembersSpecfun.polevl(z, P1, 8) / GlobalMembersSpecfun.p1evl(z, Q1, 8);
		else
			x1 = z * GlobalMembersSpecfun.polevl(z, P2, 8) / GlobalMembersSpecfun.p1evl(z, Q2, 8);
		x = x0 - x1;
		if (code != 0)
			x = -x;
		return (x);
	}

	/* Implementation of Lamberts W-function which is defined as
	 * w(x)*e^(w(x))=x
	 * Implementation by Gunter Kuhnle, gk@uni-leipzig.de
	 * Algorithm originally developed by
	 * KEITH BRIGGS, DEPARTMENT OF PLANT SCIENCES,
	 * e-mail:kmb28@cam.ac.uk
	 * http://epidem13.plantsci.cam.ac.uk/~kbriggs/W-ology.html */

	public static double lambertw(double x)
	{
		double p;
		double e;
		double t;
		double w;
		double eps;
		int i;

		eps = DefineConstants.MACHEPS;

		if (x < -Math.exp(-1))
			return -1; // error, value undefined

		if (Math.abs(x) <= eps)
			return x;

		if (x < 1)
		{
			p = Math.sqrt(2.0 * (Math.exp(1.0) * x + 1.0));
			w = -1.0 + p - p * p / 3.0 + 11.0 / 72.0 * p * p * p;
		}
		else
		{
			w = Math.log(x);
		}

		if (x > 3)
		{
			w = w - Math.log(w);
		}
		for (i = 0; i < 20; i++)
		{
			e = GlobalMembersEval.gp_exp(w);
			t = w * e - x;
			t = t / (e * (w + 1.0) - 0.5 * (w + 2.0) * t / (w + 1.0));
			w = w - t;
			if (Math.abs(t) < eps * (1.0 + Math.abs(w)))
				return w;
		}
		return -1; // error: iteration didn't converge
	}
	///#ifndef GAMMA
	//static int ISNAN __PROTO((double x));
	//static int ISFINITE __PROTO((double x));
	//static double lngamma __PROTO((double z));
	///#endif
	///#ifndef HAVE_ERF
	//static double erf __PROTO((double a));
	///#endif
	///#ifndef HAVE_ERFC
	//static double erfc __PROTO((double a));
	///#endif

	/* Macros to configure routines taken from CEPHES: */

	/* Unknown arithmetic, invokes coefficients given in
	 * normal decimal format.  Beware of range boundary
	 * problems (MACHEP, MAXLOG, etc. in const.c) and
	 * roundoff problems in pow.c:
	 * (Sun SPARCstation)
	 */
	///#define UNK 1

	/* Define to support tiny denormal numbers, else undefine. */
	///#define DENORMAL 1

	/* Define to ask for infinity support, else undefine. */
	///#define INFINITIES 1

	/* Define to ask for support of numbers that are Not-a-Number,
	   else undefine.  This may automatically define INFINITIES in some files. */
	///#define NANS 1

	/* Define to distinguish between -0.0 and +0.0.  */
	///#define MINUSZERO 1

	/*
	Cephes Math Library Release 2.0:  April, 1987
	Copyright 1984, 1987 by Stephen L. Moshier
	Direct inquiries to 30 Frost Street, Cambridge, MA 02140
	 */

	public static int merror = 0;

	/* Notice: the order of appearance of the following messages cannot be bound
	 * to error codes defined in mconf.h or math.h or similar, as these files are
	 * not available on every platform. Thus, enumerate them explicitly.
	 */
	///#define MTHERR_DOMAIN 1
	///#define MTHERR_SING 2
	///#define MTHERR_OVERFLOW 3
	///#define MTHERR_UNDERFLOW 4
	///#define MTHERR_TLPREC 5
	///#define MTHERR_PLPREC 6

	/*                                                      ndtri.c
	 *
	 *      Inverse of Normal distribution function
	 *
	 *
	 *
	 * SYNOPSIS:
	 *
	 * double x, y, ndtri();
	 *
	 * x = ndtri( y );
	 *
	 *
	 *
	 * DESCRIPTION:
	 *
	 * Returns the argument, x, for which the area under the
	 * Gaussian probability density function (integrated from
	 * minus infinity to x) is equal to y.
	 *
	 *
	 * For small arguments 0 < y < exp(-2), the program computes
	 * z = sqrt( -2.0 * log(y) );  then the approximation is
	 * x = z - log(z)/z  - (1/z) P(1/z) / Q(1/z).
	 * There are two rational functions P/Q, one for 0 < y < exp(-32)
	 * and the other for y up to exp(-2).  For larger arguments,
	 * w = y - 0.5, and  x/sqrt(2pi) = w + w**3 R(w**2)/S(w**2)).
	 *
	 *
	 * ACCURACY:
	 *
	 *                      Relative error:
	 * arithmetic   domain        # trials      peak         rms
	 *    DEC      0.125, 1         5500       9.5e-17     2.1e-17
	 *    DEC      6e-39, 0.135     3500       5.7e-17     1.3e-17
	 *    IEEE     0.125, 1        20000       7.2e-16     1.3e-16
	 *    IEEE     3e-308, 0.135   50000       4.6e-16     9.8e-17
	 *
	 *
	 * ERROR MESSAGES:
	 *
	 *   message         condition    value returned
	 * ndtri domain       x <= 0        -DBL_MAX
	 * ndtri domain       x >= 1         DBL_MAX
	 *
	 */

	/*
	Cephes Math Library Release 2.8:  June, 2000
	Copyright 1984, 1987, 1989, 2000 by Stephen L. Moshier
	 */

	///#ifdef UNK
	/* sqrt(2pi) */
	public static double s2pi = 2.50662827463100050242E0;
}