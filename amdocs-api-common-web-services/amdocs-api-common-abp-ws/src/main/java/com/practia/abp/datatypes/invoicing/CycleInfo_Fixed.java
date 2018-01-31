package com.practia.abp.datatypes.invoicing;


import java.io.Serializable;

public class CycleInfo_Fixed implements Serializable, Cloneable {

	private static final long serialVersionUID = 3001485037088882373L;

	private short cycleCode;
	private short cycleMonth;
	private short cycleYear;
	
	public short getCycleCode() {
		return cycleCode;
	}
	public void setCycleCode(short cycleCode) {
		this.cycleCode = cycleCode;
	}
	public short getCycleMonth() {
		return cycleMonth;
	}
	public void setCycleMonth(short cycleMonth) {
		this.cycleMonth = cycleMonth;
	}
	public short getCycleYear() {
		return cycleYear;
	}
	public void setCycleYear(short cycleYear) {
		this.cycleYear = cycleYear;
	}
	
	public CycleInfo_Fixed() {
		super();
	}
	public CycleInfo_Fixed(amdocs.bl3g.datatypes.CycleInfo copyFrom) {
		super();
		this.cycleCode = copyFrom.getCycleCode();
		this.cycleMonth = copyFrom.getCycleMonth();
		this.cycleYear = copyFrom.getCycleYear();
	}
	
	public static CycleInfo_Fixed convert(amdocs.bl3g.datatypes.CycleInfo other) {
		return new CycleInfo_Fixed( other );
	}
	public static CycleInfo_Fixed[] convert(amdocs.bl3g.datatypes.CycleInfo[] otherArr) {
		if(otherArr==null||otherArr.length==0)return null;
		CycleInfo_Fixed[] ret = new CycleInfo_Fixed[otherArr.length];
		for(int i=0; i<otherArr.length; i++) {
			ret[i] = new CycleInfo_Fixed( otherArr[i] );
		}
		return ret;
	}
}
