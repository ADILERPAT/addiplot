package com.addiPlot.gnuplot;

//C++ TO JAVA CONVERTER NOTE: Enums must be named in Java, so the following enum has been named AnonymousEnum: // produced by scanner
public enum AnonymousEnum
{
	test_palette_colors(256);

	private int intValue;
	private static java.util.HashMap<Integer, AnonymousEnum> mappings;
	private static java.util.HashMap<Integer, AnonymousEnum> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum(int value)
	{
		intValue = value;
		AnonymousEnum.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum forValue(int value)
	{
		return getMappings().get(value);
	}
}
///#if defined(MSDOS) || defined(_Windows) || defined(DOS386)
//void
//do_shell()
//{
//    screen_ok = FALSE;
//    c_token++;
//
//    if (user_shell) {
///#if defined(_Windows)
//	if (WinExec(user_shell, SW_SHOWNORMAL) <= 32)
///#elif defined(DJGPP)
//	    if (system(user_shell) == -1)
///#else
//		if (spawnl(P_WAIT, user_shell, NULL) == -1)
//		    os_error(NO_CARET, "unable to spawn shell");
//    }
//}
//
///#elif defined(AMIGA_SC_6_1)
//
//void
//do_shell()
//{
//    screen_ok = FALSE;
//    c_token++;
//
//    if (user_shell) {
//	if (system(user_shell))
//	    os_error(NO_CARET, "system() failed");
//    }
//    (void) putc('\n', stderr);
//}
//
///#elif defined(OS2)
//
//void
//do_shell()
//{
//    screen_ok = FALSE;
//    c_token++;
//
//    if (user_shell) {
//	if (system(user_shell) == -1)
//	    os_error(NO_CARET, "system() failed");
//
//    }
//    (void) putc('\n', stderr);
//}
//
///#else				// !OS2 

/* plain old Unix */

///#define EXEC "exec "

///#endif // !VMS 

///#if defined(_Windows)
///#if defined(USE_OWN_WINSYSTEM_FUNCTION)
// /* there is a system like call on MS Windows but it is a bit difficult to
//    use, so we will invoke the command interpreter and use it to execute the
//    commands */
//static int
//winsystem(const char *s)
//{
//    LPSTR comspec;
//    LPSTR execstr;
//    LPCSTR p;
//
// /* get COMSPEC environment variable */
///#ifdef WIN32
//    char envbuf[81];
//    GetEnvironmentVariable("COMSPEC", envbuf, 80);
//    if (*envbuf == NUL)
//	comspec = "\\command.com";
//    else
//	comspec = envbuf;
///#else
//    p = GetDOSEnvironment();
//    comspec = "\\command.com";
//    while (*p) {
//	if (!strncmp(p, "COMSPEC=", 8)) {
//	    comspec = p + 8;
//	    break;
//	}
//	p += strlen(p) + 1;
//    }
///#endif
// /* if the command is blank we must use command.com */
//    p = s;
//    while ((*p == ' ') || (*p == '\n') || (*p == '\r'))
//	p++;
//    if (*p == NUL) {
//	WinExec(comspec, SW_SHOWNORMAL);
//    } else {
// /* attempt to run the windows/dos program via windows */
//	if (WinExec(s, SW_SHOWNORMAL) <= 32) {
// /* attempt to run it as a dos program from command line */
//	    execstr = gp_alloc(strlen(s) + strlen(comspec) + 6,
//			       "winsystem cmdline");
//	    strcpy(execstr, comspec);
//	    strcat(execstr, " /c ");
//	    strcat(execstr, s);
//	    WinExec(execstr, SW_SHOWNORMAL);
//	    free(execstr);
//	}
//    }
//
// /* regardless of the reality return OK - the consequences of */
// /* failure include shutting down Windows */
//    return (0);			// success 
//}
///#endif // USE_OWN_WINSYSTEM_FUNCTION 
//
//void
//call_kill_pending_Pause_dialog()
//{
//    kill_pending_Pause_dialog();
//}
///#endif // _Windows 

///#ifdef GP_MACROS
/*
 * Walk through the input line looking for string variables preceded by @.
 * Replace the characters @<varname> with the contents of the string.
 * Anything inside quotes is not expanded.
 */

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define COPY_CHAR gp_input_line[o++] = *c; after_backslash = FALSE;
///#endif

/* much more than what can be useful */
//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
///#define MAX_TOTAL_LINE_LEN (1024 * MAX_LINE_LEN)
