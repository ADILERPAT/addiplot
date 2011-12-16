package com.addiPlot.gnuplot;

/* We keep track of the open pipe through this data structure. */
public class PipeFileDescriptor
{
  public FILE pfd_File;
  public StartupMessage pfd_Msg = new StartupMessage();
}
///#endif // PIPES 
