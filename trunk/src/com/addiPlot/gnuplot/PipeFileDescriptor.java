package com.addiPlot.gnuplot;

import java.io.File;

/* We keep track of the open pipe through this data structure. */
public class PipeFileDescriptor
{
  public File pfd_File;
  public StartupMessage pfd_Msg = new StartupMessage();
}
///#endif // PIPES 
