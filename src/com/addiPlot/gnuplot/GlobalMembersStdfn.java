package com.addiPlot.gnuplot;

public class GlobalMembersStdfn
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
		return GlobalMembersAlloc.RCSid("$Id: stdfn.c,v 1.17.4.1 2010/01/06 17:35:10 sfeam Exp $");
	}

///#ifdef WIN32
// /* the WIN32 API has a Sleep function that does not consume CPU cycles */
///#include <windows.h>
///#endif


/*
 * ANSI C functions
 */

/* memcpy() */

///#ifndef HAVE_MEMCPY
///#ifndef HAVE_BCOPY
// /*
//  * cheap and slow version of memcpy() in case you don't have one
//  */
//
//char *
//memcpy(char *dest, char *src, size_t len)
//{
//    while (len--)
//	*dest++ = *src++;
//
//    return dest;
//}
///#endif				// !HAVE_BCOPY 
///#endif // HAVE_MEMCPY 

/* strchr()
 * Simple and portable version, conforming to Plauger.
 * Would this be more efficient as a macro?
 */
///#ifndef HAVE_STRCHR
///#ifndef HAVE_INDEX
//
//char *
//strchr(const char *s, int c)
//{
//    do {
//	if (*s == (char) c)
//	    return s;
//    } while (*s++ != (char) 0);
//
//    return NULL;
//}
///#endif				// !HAVE_INDEX 
///#endif // HAVE_STRCHR 


/* memset ()
 *
 * Since we want to use memset, we have to map a possibly nonzero fill byte
 * to the bzero function. The following defined might seem a bit odd, but I
 * think this is the only possible way.
 */

///#ifndef HAVE_MEMSET
///#ifdef HAVE_BZERO
///#define memset(s, b, l) do {                        assert((b)==0);           bzero((s), (l));        } while(0)
//ignore
//ignore
//ignore
//ignore
///#else
///#define memset NO_MEMSET_OR_BZERO
///#endif // HAVE_BZERO 
///#endif // HAVE_MEMSET 


/* strerror() */
///#ifndef HAVE_STRERROR
//
//char *
//strerror(int no)
//{
//    static char res_str[30];
//
//    if (no > sys_nerr) {
//	sprintf(res_str, "unknown errno %d", no);
//	return res_str;
//    } else {
//	return sys_errlist[no];
//    }
//}
///#endif // HAVE_STRERROR 


/* strstr() */
///#ifndef HAVE_STRSTR
//
//char *
//strstr(const char *cs, const char *ct)
//{
//    size_t len;
//
//    if (!cs || !ct)
//	return NULL;
//
//    if (!*ct)
//	return (char *) cs;
//
//    len = strlen(ct);
//    while (*cs) {
//	if (strncmp(cs, ct, len) == 0)
//	    return (char *) cs;
//	cs++;
//    }
//
//    return NULL;
//}
///#endif // HAVE_STRSTR 


///#ifdef __PUREC__
// /*
//  * a substitute for PureC's buggy sscanf.
//  * this uses the normal sscanf and fixes the following bugs:
//  * - whitespace in format matches whitespace in string, but doesn't
//  *   require any. ( "%f , %f" scans "1,2" correctly )
//  * - the ignore value feature works (*). this created an address error
//  *   in PureC.
//  */
//
///#include <stdarg.h>
//
//int
//purec_sscanf(const char *string, const char *format,...)
//{
//    va_list args;
//    int cnt = 0;
//    char onefmt[256];
//    char buffer[256];
//    const char *f = format;
//    const char *s = string;
//    char *f2;
//    char ch;
//    int ignore;
//    void *p;
//    int *ip;
//    int pos;
//
//    va_start(args, format);
//    while (*f && *s) {
//	ch = *f++;
//	if (ch != '%') {
//	    if (isspace((unsigned char) ch)) {
// /* match any number of whitespace */
//		while (isspace((unsigned char) *s))
//		    s++;
//	    } else {
// /* match exactly the character ch */
//		if (*s != ch)
//		    goto finish;
//		s++;
//	    }
//	} else {
// /* we have got a '%' */
//	    ch = *f++;
//	    if (ch == '%') {
// /* match exactly % */
//		if (*s != ch)
//		    goto finish;
//		s++;
//	    } else {
//		f2 = onefmt;
//		*f2++ = '%';
//		*f2++ = ch;
//		ignore = 0;
//		if (ch == '*') {
//		    ignore = 1;
//		    ch = f2[-1] = *f++;
//		}
//		while (isdigit((unsigned char) ch)) {
//		    ch = *f2++ = *f++;
//		}
//		if (ch == 'l' || ch == 'L' || ch == 'h') {
//		    ch = *f2++ = *f++;
//		}
//		switch (ch) {
//		case '[':
//		    while (ch && ch != ']') {
//			ch = *f2++ = *f++;
//		    }
//		    if (!ch)
//			goto error;
//		    break;
//		case 'e':
//		case 'f':
//		case 'g':
//		case 'd':
//		case 'o':
//		case 'i':
//		case 'u':
//		case 'x':
//		case 'c':
//		case 's':
//		case 'p':
//		case 'n':	// special case handled below 
//		    break;
//		default:
//		    goto error;
//		}
//		if (ch != 'n') {
//		    strcpy(f2, "%n");
//		    if (ignore) {
//			p = buffer;
//		    } else {
//			p = va_arg(args, void *);
//		    }
//		    switch (sscanf(s, onefmt, p, &pos)) {
//		    case EOF:
//			goto error;
//		    case 0:
//			goto finish;
//		    }
//		    if (!ignore)
//			cnt++;
//		    s += pos;
//		} else {
//		    if (!ignore) {
//			ip = va_arg(args, int *);
//			*ip = (int) (s - string);
//		    }
//		}
//	    }
//	}
//    }
//
//    if (!*f)
//	goto finish;
//
//  error:
//    cnt = EOF;
//  finish:
//    va_end(args);
//    return cnt;
//}
//
// /* use the substitute now. I know this is dirty trick, but it works. */
///#define sscanf purec_sscanf
//
///#endif // __PUREC__ 


/*
 * POSIX functions
 */

///#ifndef HAVE_SLEEP
// /* The implementation below does not even come close
//  * to what is required by POSIX.1, but I suppose
//  * it doesn't really matter on these systems. lh
//  */
//
//
///#ifdef AMIGA_SC_6_1
///#include <proto/dos.h>
///#endif
//
//unsigned int
//sleep(unsigned int delay)
//{
///#if defined(MSDOS) || defined(_Windows) || defined(DOS386) || defined(AMIGA_AC_5)
///#if !(defined(__TURBOC__) || defined(__EMX__) || defined(DJGPP)) || defined(_Windows)	// Turbo C already has sleep() 
// /* kludge to provide sleep() for msc 5.1 */
//    unsigned long time_is_up;
//
//    time_is_up = time(NULL) + (unsigned long) delay;
//    while (time(NULL) < time_is_up)
// /* wait //Tangible continue code after comment*/
// ;
///#endif // !__TURBOC__ ... 
///#endif // MSDOS ... 
//
///#ifdef AMIGA_SC_6_1
//    Delay(50 * delay);
///#endif
//
///#ifdef WIN32
//    Sleep((DWORD) delay * 1000);
///#endif
//
//    return 0;
//}
//
///#endif // HAVE_SLEEP 


/*
 * Other common functions
 */

/*****************************************************************
    portable implementation of strnicmp (hopefully)
*****************************************************************/
///#ifndef HAVE_STRCASECMP
///#ifndef HAVE_STRICMP
//
// /* return (see MSVC documentation and strcasecmp()):
//  *  -1  if str1 < str2
//  *   0  if str1 == str2
//  *   1  if str1 > str2
//  */
//int
//gp_stricmp(const char *s1, const char *s2)
//{
//    unsigned char c1, c2;
//
//    do {
//	c1 = *s1++;
//	if (islower(c1))
//	    c1 = toupper(c1);
//	c2 = *s2++;
//	if (islower(c2))
//	    c2 = toupper(c2);
//    } while (c1 == c2 && c1 && c2);
//
//    if (c1 == c2)
//	return 0;
//    if (c1 == '\0' || c1 > c2)
//	return 1;
//    return -1;
//}
///#endif				// !HAVE_STRCASECMP 
///#endif // !HAVE_STRNICMP 

/*****************************************************************
    portable implementation of strnicmp (hopefully)
*****************************************************************/

///#ifndef HAVE_STRNCASECMP
///#ifndef HAVE_STRNICMP
//
//int
//gp_strnicmp(const char *s1, const char *s2, size_t n)
//{
//    unsigned char c1, c2;
//
//    if (n == 0)
//	return 0;
//
//    do {
//	c1 = *s1++;
//	if (islower(c1))
//	    c1 = toupper(c1);
//	c2 = *s2++;
//	if (islower(c2))
//	    c2 = toupper(c2);
//    } while (c1 == c2 && c1 && c2 && --n > 0);
//
//    if (n == 0 || c1 == c2)
//	return 0;
//    if (c1 == '\0' || c1 > c2)
//	return 1;
//    return -1;
//}
///#endif				// !HAVE_STRNCASECMP 
///#endif // !HAVE_STRNICMP 


/* Safe, '\0'-terminated version of strncpy()
 * safe_strncpy(dest, src, n), where n = sizeof(dest)
 * This is basically the old fit.c(copy_max) function
 */
	///#endif

	/* GNUPLOT - stdfn.c */

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


	/* This module collects various functions, which were previously scattered
	 * all over the place. In a future implementation of gnuplot, each of
	 * these functions will probably reside in their own file in a subdirectory.
	 * - Lars Hecking
	 */

	/*
	 * $Id: stdfn.h,v 1.32.4.1 2010/01/06 17:35:10 sfeam Exp $
	 */

	/* GNUPLOT - stdfn.h */

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

	/* get prototypes or declarations for string and stdlib functions and deal
	   with missing functions like strchr. */

	/* we will assume the ANSI/Posix/whatever situation as default.
	   the header file is called string.h and the index functions are called
	   strchr, strrchr. Exceptions have to be listed explicitly */



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
	//char * memcpy __PROTO((char *, char *, size_t));
	///#endif
	///#endif // HAVE_BCOPY 

	///#ifndef HAVE_STRCHR
	///#ifdef strchr
	///#undef strchr
	///#endif
	///#ifdef HAVE_INDEX
	///#define strchr index
	///#else
	//char *strchr __PROTO((const char *, int));
	///#endif
	///#ifdef strrchr
	///#undef strrchr
	///#endif
	///#ifdef HAVE_RINDEX
	///#define strrchr rindex
	///#endif
	///#endif
	///#ifndef HAVE_STRCSPN
	//size_t gp_strcspn __PROTO((const char *, const char *));
	///#define strcspn gp_strcspn
	///#endif

	///#ifndef HAVE_STRSTR
	//char *strstr __PROTO((const char *, const char *));
	///#endif

	///#ifndef HAVE_STDLIB_H
	///#ifdef HAVE_MALLOC_H
	///#include <malloc.h>
	///#else
	//void free();
	//char *malloc();
	//char *realloc();
	///#endif // HAVE_MALLOC_H 
	//char *getenv();
	//int system();
	//double atof();
	//int atoi();
	//long atol();
	//double strtod();
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
	///#undef EXIT_FAILURE
	///#endif
	///#ifdef  EXIT_SUCCESS
	///#undef EXIT_SUCCESS
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

	/* Deal with varargs functions */
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
	//extern int errno;
	///#endif
	///#ifndef HAVE_STRERROR
	//char *strerror __PROTO((int));
	//extern int sys_nerr;
	//extern char *sys_errlist[];
	///#endif

	///#ifdef HAVE_SYS_TYPES_H
	///#endif

	///#ifdef HAVE_SYS_STAT_H

	/* This is all taken from GNU fileutils lib/filemode.h */

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
	///#undef S_ISBLK
	///#undef S_ISCHR
	///#undef S_ISDIR
	///#undef S_ISFIFO
	///#undef S_ISLNK
	///#undef S_ISMPB
	///#undef S_ISMPC
	///#undef S_ISNWK
	///#undef S_ISREG
	///#undef S_ISSOCK
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

	/* ctime etc, should also define time_t and struct tm */
	///#ifdef HAVE_TIME_H
	///#endif

	///#ifndef HAVE_TIME_T_IN_TIME_H
	///#define time_t long
	///#endif

	///#if defined(PIPES) && (defined(VMS) || (defined(OSK) && defined(_ANSI_EXT))) || defined(PIPES) && defined(AMIGA_SC_6_1)
	//FILE *popen __PROTO((char *, char *));
	//int pclose __PROTO((FILE *));
	///#endif

	///#ifdef HAVE_FLOAT_H
	///#endif

	/* Some older platforms, namely SunOS 4.x, don't define this. */
	///#ifndef DBL_EPSILON
	///#define DBL_EPSILON 2.2204460492503131E-16
	///#endif

	///#ifdef HAVE_LOCALE_H
	///#endif

	///#ifdef HAVE_MATH_H
	///#endif

	/* Normally in <math.h> */
	///#ifndef M_PI
	///#define M_PI 3.14159265358979323846
	///#endif
	///#ifndef M_PI_2
	///#define M_PI_2 1.57079632679489661923
	///#endif
	///#ifndef M_LN10
	///#define M_LN10 2.3025850929940456840e0
	///#endif

	/* Use definitions from float.h and math.h if we found them */
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
	//int gp_stricmp __PROTO((const char *, const char *));
	///#define strcasecmp gp_stricmp
	///#endif
	///#endif

	///#ifndef HAVE_STRNCASECMP
	///#ifdef HAVE_STRNICMP
	///#define strncasecmp strnicmp
	///#else
	//int gp_strnicmp __PROTO((const char *, const char *, size_t));
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

	/* sleep delay time, where delay is a double value */
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

	/* Misc. defines */

	/* Null character */
	///#define NUL ('\0')

	/* Definitions for debugging */
	/* #define NDEBUG */

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


	/* HBB 20010223: moved this whole block from syscfg.h to here. It
	 * needs both "syscfg.h" and <float.h> to have been #include'd before
	 * this, since it relies on stuff like DBL_MAX */

	/* There is a bug in the NEXT OS. This is a workaround. Lookout for
	 * an OS correction to cancel the following dinosaur
	 *
	 * Hm, at least with my setup (compiler version 3.1, system 3.3p1),
	 * DBL_MAX is defined correctly and HUGE and HUGE_VAL are both defined
	 * as 1e999. I have no idea to which OS version the bugfix below
	 * applies, at least wrt. HUGE, it is inconsistent with the current
	 * version. Since we are using DBL_MAX anyway, most of this isn't
	 * really needed anymore.
	 */

	///#if defined ( NEXT ) && NX_CURRENT_COMPILER_RELEASE<310
	///#if defined ( DBL_MAX)
	///#undef DBL_MAX
	///#endif
	///#define DBL_MAX 1.7976931348623157e+308
	///#undef HUGE
	///#define HUGE    DBL_MAX
	///#undef HUGE_VAL
	///#define HUGE_VAL DBL_MAX
	///#endif // NEXT && NX_CURRENT_COMPILER_RELEASE<310 

	/*
	 * Note about VERYLARGE:  This is the upper bound double (or float, if PC)
	 * numbers. This flag indicates very large numbers. It doesn't have to
	 * be the absolutely biggest number on the machine.
	 * If your machine doesn't have HUGE, or float.h,
	 * define VERYLARGE here.
	 *
	 * example:
	#define VERYLARGE 1e37
	 *
	 * To get an appropriate value for VERYLARGE, we can use DBL_MAX (or
	 * FLT_MAX on PCs), HUGE or HUGE_VAL. DBL_MAX is usually defined in
	 * float.h and is the largest possible double value. HUGE and HUGE_VAL
	 * are either DBL_MAX or +Inf (IEEE special number), depending on the
	 * compiler. +Inf may cause problems with some buggy fp
	 * implementations, so we better avoid that. The following should work
	 * better than the previous setup (which used HUGE in preference to
	 * DBL_MAX).
	 */
	/* Now define VERYLARGE. This is usually DBL_MAX/2 - 1. On MS-DOS however
	 * we use floats for memory considerations and thus use FLT_MAX.
	 */

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
	/* as a last resort */
	///#define VERYLARGE (1e37)
	/* #  warning "using last resort 1e37 as VERYLARGE define, please check your headers" */
	/* Maybe add a note somewhere in the install docs instead */
	///#endif // HUGE 
	///#endif // VERYLARGE 

	/* _POSIX_PATH_MAX is too small for practical purposes */
	///#ifdef HAVE_SYS_PARAM_H
	///#endif
	///#ifndef PATH_MAX
	///#ifndef MAXPATHLEN
	///#define PATH_MAX 1024
	///#else
	///#define PATH_MAX MAXPATHLEN
	///#endif
	///#endif

	/* Concatenate a path name and a file name. The file name
	 * may or may not end with a "directory separation" character.
	 * Path must not be NULL, but can be empty
	 */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define PATH_CONCAT(path,file) { char *p = path; p += strlen(path); if (p!=path) p--; if (*p && (*p != DIRSEP1) && (*p != DIRSEP2)) { if (*p) p++; *p++ = DIRSEP1; *p = NUL; } strcat (path, file); }

	///#ifndef inrange
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define inrange(z,min,max) (((min)<(max)) ? (((z)>=(min)) && ((z)<=(max))) : (((z)>=(max)) && ((z)<=(min))))
	///#endif

	/* HBB 20030117: new macro to simplify clipping operations in the
	 * presence of possibly reverted axes */
	///#ifndef cliptorange
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define cliptorange(z,min,max) do { if ((min) < (max)) { if ((z) > (max)) (z) = (max); else if ((z) < (min)) (z) = (min); } else { if ((z) > (min)) (z) = (min); else if ((z) < (max)) (z) = (max); } } while (0)
	///#endif

	/* both min/max and MIN/MAX are defined by some compilers.
	 * we are now on GPMIN / GPMAX
	 */
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GPMAX(a,b) ( (a) > (b) ? (a) : (b) )
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	///#define GPMIN(a,b) ( (a) < (b) ? (a) : (b) )

	/* Prototypes from "stdfn.c" */

	public static String safe_strncpy(String d, String s, int n)
	{
		String ret;

		ret = strncpy(d, s, n);
		if (s.length() >= n)
		d = tangible.StringFunctions.changeCharacter(d, n > 0 ? n - 1 : 0, DefineConstants.NUL);

		return ret;
	}

///#ifndef HAVE_STRCSPN
// /*
//  * our own substitute for strcspn()
//  * return the length of the inital segment of str1
//  * consisting of characters not in str2
//  * returns strlen(str1) if none of the characters
//  * from str2 are in str1
//  * based in misc.c(instring) */
//size_t
//gp_strcspn(const char *str1, const char *str2)
//{
//    char *s;
//    size_t pos;
//
//    if (!str1 || !str2)
//	return 0;
//    pos = strlen(str1);
//    while (*str2++)
//	if (s = strchr(str1, *str2))
//	    if ((s - str1) < pos)
//		pos = s - str1;
//    return (pos);
//}
///#endif // !HAVE_STRCSPN 

	///#ifndef HAVE_SLEEP
	//unsigned int sleep __PROTO((unsigned int));
	///#endif

	public static double gp_strtod(String str, tangible.RefObject<String[]> endptr)
	{
	///#if (0) // replace with test for platforms with broken strtod()
	//    int used;
	//    double d;
	//    int n = sscanf(str, "%lf%n", &d, &used);
	//    if (n < 1)
	//	*endptr = (char *)str;
	//    else
	//	*endptr = (char *)(str + used);
	//    return d;
	///#else
		return strtod(str,endptr.argvalue);
	///#endif
	}

/* Implement portable generation of a NaN value. */


	public static double not_a_number()
	{
	///#ifdef __MSC__
	//	unsigned long lnan[2]={0xffffffff, 0x7fffffff};
	//    return *( double* )lnan;
	///#else
		return Double.parseDouble("NaN");
	///#endif
	}
}