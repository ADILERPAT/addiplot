package com.addiPlot.gnuplot;

///#if defined(PIPE_IPC) || defined(WIN_IPC)

public class gpe_fifo_t
{
	public gpe_fifo_t prev;
	public gp_event_t ge = new gp_event_t();
	public gpe_fifo_t next;
}
///#endif // PIPE_IPC || WIN_IPC 
