package com.addiPlot.gnuplot;

public class GlobalMembersAmiga
{


	/* Needed to check for the required Dos version. */
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern struct DosLibrary *DOSBase;

	/* This data structure keeps track of the pipes that are still open. */
	public static PipeFileDescriptor[] OpenPipes = new PipeFileDescriptor[DefineConstants.MAX_OPEN_PIPES];

	/* The address of the process that calls popen or pclose. */
	public static Process ThisProcess;

	/* Are we called for the first time? */
	public static int FirstCall = 1;


	/* Prototypes for the functions below. */
	public static FILE popen(String command, String mode)
	{
		UBYTE[] PipeName = new UBYTE[16];
		int ProcAddress;
		UBYTE HexDigit = new UBYTE();
		UBYTE NextChar;
		CommandLineInterface ThisCli;
		PipeFileDescriptor PipeToUse;
		int PipeNumToUse;
		int ChildPipeMode;
		BPTR ChildPipe = new BPTR();
		FILE ParentPipe;
		Process ChildProcess;
		TagItem[] NewProcTags = {{NP_Entry, (Tag) GlobalMembersAmiga.ChildEntry}, {NP_Cli, 1}, {NP_StackSize, 4096}, {NP_Input, null}, {NP_Output, null}, {NP_CloseInput, 0}, {NP_CloseOutput, 0}, {TAG_DONE, 0}};

		/* Test whether we're using the right Dos version. */
		if (DOSBase.dl_lib.lib_Version < DefineConstants.DOS_VERSION)
		{
		errno = EPIPE;
		return null;
		}

		/* If we're called for the first time, install exit trap and do some
		 * initialisation stuff.
		 */
		if (FirstCall != 0)
		{
		/* Initialise pipe file descriptor table. */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(OpenPipes, 0, sizeof(OpenPipes));

		/* Install our exit trap. */
		if (atexit(GlobalMembersAmiga.CleanUpPipes) != 0)
		{
			errno = EPIPE;
			return null;
		}
		FirstCall = 0;
		}

		/* If we don't know our process' address yet, we should get it now. */
		if (ThisProcess == null)
		ThisProcess = (GlobalMembersMouse.struct Process *) FindTask(null);

		/* Get our Cli structure. */
		ThisCli = Cli();

		/* Now try to find an empty slot in the pipe file descriptor table.
		 * Return NULL if no slot is available.
		 */
		for (PipeNumToUse = 0; PipeNumToUse < DefineConstants.MAX_OPEN_PIPES; PipeNumToUse++)
		if (OpenPipes[PipeNumToUse].pfd_File == null)
			break;
		if (PipeNumToUse >= DefineConstants.MAX_OPEN_PIPES)
		{
		errno = EMFILE;
		return null;
		}
		PipeToUse = OpenPipes[PipeNumToUse];

		/* Check if the specified mode is valid. */
		if (strcmp(mode, "r") == 0)
		ChildPipeMode = MODE_NEWFILE;
		else if (strcmp(mode, "w") == 0)
		ChildPipeMode = MODE_OLDFILE;
		else
		{
		errno = EINVAL;
		return null;
		}

		/* Make a unique file name for the pipe that we are about to open. The
		 * file name has the following format: "PIPE:XXXXXXXX_Y", where
		 * XXXXXXXX is the address of our process in hex, Y is the number of the
		 * slot in the pipe descriptor table that we will use. The code is
		 * equivalent to
		 * sprintf (PipeNameWriter, "PIPE:%08lX_%1d", ThisProcess, PipeNumToUse);
		 * but it doesn't need sprintf and therefore makes programs that don't
		 * use printf a lot shorter.
		 */
		PipeName = "PIPE:00000000_0";
		NextChar = PipeName + 12;
		ProcAddress = (int) ThisProcess;
		while (ProcAddress != 0)
		{
		HexDigit = (UBYTE) ProcAddress & 0xf;
		HexDigit = HexDigit < 10 ? HexDigit + '0' : HexDigit - 10 + 'A';
		NextChar--= HexDigit;
		ProcAddress >>= 4;
		}
		/* If MAX_OPEN_PIPES > 10, this will have to be modified. */
		PipeName[14] = ((UBYTE) PipeNumToUse) + '0';

		/* Create tags for the child process. */
		if (ThisProcess.pr_CLI)
		NewProcTags[2].ti_Data = ThisCli.cli_DefaultStack << 2;
		else
		NewProcTags[2].ti_Data = ThisProcess.pr_StackSize;

		/* Open both ends of the pipe. The child's side is opened with Open (),
		 * while the parent's side is opened with fopen ().
		 */
		ChildPipe = Open(PipeName, ChildPipeMode);
		ParentPipe = fopen(PipeName, mode);
		if (ChildPipeMode == MODE_NEWFILE)
		{
		NewProcTags[3].ti_Data = Input();
		NewProcTags[4].ti_Data = ChildPipe;
		NewProcTags[5].ti_Data = 0;
		NewProcTags[6].ti_Data = 1;
		}
		else
		{
		NewProcTags[3].ti_Data = ChildPipe;
		NewProcTags[4].ti_Data = Output();
		NewProcTags[5].ti_Data = 1;
		NewProcTags[6].ti_Data = 0;
		}
		if (ChildPipe == null || ParentPipe == null)
		{
		errno = EPIPE;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto cleanup;
		}

		/* Now generate a entry in the pipe file descriptor table. */
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		PipeToUse.pfd_Msg.sm_Cmd = malloc(command.length() + 1);
		if (PipeToUse.pfd_Msg.sm_Cmd == null)
		{
		errno = ENOMEM;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto cleanup;
		}
		PipeToUse.pfd_Msg.sm_Cmd = command;
		PipeToUse.pfd_Msg.sm_Msg.mn_ReplyPort = CreateMsgPort();
		if (PipeToUse.pfd_Msg.sm_Msg.mn_ReplyPort == null)
		{
		errno = ENOMEM;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto cleanup;
		}
		PipeToUse.pfd_Msg.sm_Msg.mn_Node.ln_Type = NT_MESSAGE;
		PipeToUse.pfd_Msg.sm_Msg.mn_Node.ln_Pri = 0;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		PipeToUse.pfd_Msg.sm_Msg.mn_Length = sizeof(GlobalMembersMouse.struct StartupMessage);
		PipeToUse.pfd_File = ParentPipe;

		/* Now create the child process. */
		ChildProcess = CreateNewProc(NewProcTags);
		if (ChildProcess == null)
		{
		errno = ENOMEM;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto cleanup;
		}

		/* Pass the startup message to the child process. */
		PutMsg(ChildProcess.pr_MsgPort, (GlobalMembersMouse.struct Message *) PipeToUse.pfd_Msg);

		/* This is the normal exit point for the function. */
		return ParentPipe;

		/* This code is only executed if there was an error. In this case the
		 * allocated resources must be freed. The code is actually clearer (at
		 * least in my opinion) and more concise by using goto than by using a
		 * function (global variables or function parameters needed) or a lot
		 * of if-constructions (code gets blown up unnecessarily).
		 */
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	  cleanup:
		if (PipeToUse.pfd_Msg.sm_Msg.mn_ReplyPort == null)
		DeleteMsgPort(PipeToUse.pfd_Msg.sm_Msg.mn_ReplyPort);
		if (ParentPipe != null)
		fclose(ParentPipe);
		if (ChildPipe != null)
		Close(ChildPipe);
		return null;
	}
	public static int pclose(FILE stream)
	{
	  int PipeToClose;

	  /* Test whether we're using the right Dos version. */
	  if (DOSBase.dl_lib.lib_Version < DefineConstants.DOS_VERSION)
	  {
		errno = EPIPE;
		return -1;
	  }

	  /* Test whether this is the first call to this module or not. If so,
	   * pclose has been called before popen and we return with an error
	   * because the initialisation has yet to be done.
	   */
	  if (FirstCall != 0)
	  {
		errno = EBADF;
		return -1;
	  }

	  /* Search for the correct table entry and close the associated file. */
	  for (PipeToClose = 0; PipeToClose < DefineConstants.MAX_OPEN_PIPES; PipeToClose++)
		if (OpenPipes[PipeToClose].pfd_File == stream)
			break;
	  if (PipeToClose >= DefineConstants.MAX_OPEN_PIPES)
	  {
		errno = EBADF;
		return -1;
	  }
	  fclose(stream);

	  /* Now wait for the child to terminate and get its exit status. */
	  WaitPort(OpenPipes[PipeToClose].pfd_Msg.sm_Msg.mn_ReplyPort);
	  OpenPipes[PipeToClose].pfd_File = null;

	  /* Free the allocates resources. */
	  DeleteMsgPort(OpenPipes[PipeToClose].pfd_Msg.sm_Msg.mn_ReplyPort);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(OpenPipes[PipeToClose].pfd_Msg.sm_Cmd);

	  return OpenPipes[PipeToClose].pfd_Msg.sm_RetCode;
	}
	public static void CleanUpPipes()
	{
	  int Count;
	  FILE Pipe;

	  /* Close each open pipe. */
	  for (Count = 0; Count < DefineConstants.MAX_OPEN_PIPES; Count++)
	  {
		Pipe = OpenPipes[Count].pfd_File;
		if (Pipe != null)
		  GlobalMembersAmiga.pclose(Pipe);
	  }
	}
	public static int __saveds ChildEntry()
	{
		Process ChildProc;
		StartupMessage StartUpMessage;
		int ReturnCode;
		DosLibrary DOSBase;
		TagItem[] SysTags = {{SYS_Asynch, 0}, {SYS_UserShell, 1}, {TAG_DONE, 0}};

		/* We need to open this library, because we don't inherit it from our
		 * parent process.
		 */
		DOSBase = (GlobalMembersMouse.struct DosLibrary *) OpenLibrary("dos.library", DefineConstants.DOS_VERSION);

		/* Get the childs process structure. */
		ChildProc = (GlobalMembersMouse.struct Process *) FindTask(null);

		/* Wait for the startup message from the parent. */
		WaitPort(ChildProc.pr_MsgPort);
		StartUpMessage = (GlobalMembersMouse.struct StartupMessage *) GetMsg(ChildProc.pr_MsgPort);

		/* Now run the command and return the result. */
		if (DOSBase != null)
		ReturnCode = System(StartUpMessage.sm_Cmd, SysTags);
		else
		ReturnCode = 10000;
		StartUpMessage.sm_RetCode = ReturnCode;

		/* Tell the parent that we are done. */
		ReplyMsg((GlobalMembersMouse.struct Message *) StartUpMessage);

		if (DOSBase != null)
		CloseLibrary((GlobalMembersMouse.struct Library *) DOSBase);

		return 0;
	}
}