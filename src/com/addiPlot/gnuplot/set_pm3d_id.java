package com.addiPlot.gnuplot;

public enum set_pm3d_id
{
	S_PM3D_INVALID,
	S_PM3D_AT,
	S_PM3D_INTERPOLATE,
	S_PM3D_SCANSFORWARD,
	S_PM3D_SCANSBACKWARD,
	S_PM3D_SCANS_AUTOMATIC,
	S_PM3D_DEPTH,
	S_PM3D_FLUSH,
	S_PM3D_FTRIANGLES,
	S_PM3D_NOFTRIANGLES,
	S_PM3D_CLIP_1IN,
	S_PM3D_CLIP_4IN,
	S_PM3D_MAP,
	S_PM3D_HIDDEN,
	S_PM3D_NOHIDDEN,
	S_PM3D_SOLID,
	S_PM3D_NOTRANSPARENT,
	S_PM3D_NOSOLID,
	S_PM3D_TRANSPARENT,
	S_PM3D_IMPLICIT,
	S_PM3D_NOEXPLICIT,
	S_PM3D_NOIMPLICIT,
	S_PM3D_EXPLICIT,
	S_PM3D_WHICH_CORNER;

	public int getValue()
	{
		return this.ordinal();
	}

	public static set_pm3d_id forValue(int value)
	{
		return values()[value];
	}
}