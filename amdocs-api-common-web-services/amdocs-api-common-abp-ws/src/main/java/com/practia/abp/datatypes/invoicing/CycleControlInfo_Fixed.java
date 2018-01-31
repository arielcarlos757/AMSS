package com.practia.abp.datatypes.invoicing;

import java.io.Serializable;
import java.util.Date;

public class CycleControlInfo_Fixed implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 5135465130341640807L;

	private int cycleNo;
	private short cycleCode;
	private short cycleMonth;
	private short cycleYear;
	private short cycleInstance;
	private Date startDate;
	private Date endDate;
	private Date runDate;
	private String status;
	private int cycleSeqRun;
	private int periodKey;
	
	public int getCycleNo() {
		return cycleNo;
	}
	public void setCycleNo(int cycleNo) {
		this.cycleNo = cycleNo;
	}
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
	public short getCycleInstance() {
		return cycleInstance;
	}
	public void setCycleInstance(short cycleInstance) {
		this.cycleInstance = cycleInstance;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getRunDate() {
		return runDate;
	}
	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCycleSeqRun() {
		return cycleSeqRun;
	}
	public void setCycleSeqRun(int cycleSeqRun) {
		this.cycleSeqRun = cycleSeqRun;
	}
	public int getPeriodKey() {
		return periodKey;
	}
	public void setPeriodKey(int periodKey) {
		this.periodKey = periodKey;
	}

	
	public CycleControlInfo_Fixed() {
		super();
	}
	@SuppressWarnings("deprecation")
	public CycleControlInfo_Fixed(amdocs.bl3g.datatypes.CycleControlInfo copyFrom) {
		super();
		this.cycleNo = copyFrom.getCycleNo();
		this.cycleCode = copyFrom.getCycleCode();
		this.cycleMonth = copyFrom.getCycleMonth();
		this.cycleYear = copyFrom.getCycleYear();
		this.cycleInstance = copyFrom.getCycleInstance();
		this.startDate = copyFrom.getStartDate();
		this.endDate = copyFrom.getEndDate();
		this.runDate = copyFrom.getRunDate();
		this.status = copyFrom.getStatus();
		this.cycleSeqRun = copyFrom.getCycleSeqRun();
		this.periodKey = copyFrom.getPeriodKey();
	}
	
	public static CycleControlInfo_Fixed convert(amdocs.bl3g.datatypes.CycleControlInfo other) {
		return new CycleControlInfo_Fixed( other );
	}
	public static CycleControlInfo_Fixed[] convert(amdocs.bl3g.datatypes.CycleControlInfo[] otherArr) {
		if(otherArr==null||otherArr.length==0)return null;
		CycleControlInfo_Fixed[] ret = new CycleControlInfo_Fixed[otherArr.length];
		for(int i=0; i<otherArr.length; i++) {
			ret[i] = new CycleControlInfo_Fixed( otherArr[i] );
		}
		return ret;
	}
}
