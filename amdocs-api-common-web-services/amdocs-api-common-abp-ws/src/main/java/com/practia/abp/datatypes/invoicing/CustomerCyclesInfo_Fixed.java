package com.practia.abp.datatypes.invoicing;


import java.io.Serializable;
import java.util.Date;

public class CustomerCyclesInfo_Fixed implements Serializable, Cloneable  {

	private static final long serialVersionUID = -34091511224479955L;

	protected CycleCodeInfo_Fixed cycleCode;
	protected short cycleMonth;
	protected short cycleYear;
	protected short cycleInstance;
	protected int cycleSeqNo;
	protected Date startDate;
	protected Date endDate;
	protected String status;
	protected String customerIdInfo;
	private short customerPartitionId;
	protected Date runDate;
	
	public CycleCodeInfo_Fixed getCycleCode() {
		return cycleCode;
	}
	public void setCycleCode(CycleCodeInfo_Fixed cycleCode) {
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
	public int getCycleSeqNo() {
		return cycleSeqNo;
	}
	public void setCycleSeqNo(int cycleSeqNo) {
		this.cycleSeqNo = cycleSeqNo;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustomerIdInfo() {
		return customerIdInfo;
	}
	public void setCustomerIdInfo(String customerIdInfo) {
		this.customerIdInfo = customerIdInfo;
	}
	public short getCustomerPartitionId() {
		return customerPartitionId;
	}
	public void setCustomerPartitionId(short customerPartitionId) {
		this.customerPartitionId = customerPartitionId;
	}
	public Date getRunDate() {
		return runDate;
	}
	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}
	
	public CustomerCyclesInfo_Fixed() {
		super();
	}
	@SuppressWarnings("deprecation")
	public CustomerCyclesInfo_Fixed(amdocs.bl3g.datatypes.CustomerCyclesInfo copyFrom) {
		super();
		this.cycleCode = CycleCodeInfo_Fixed.convert(copyFrom.getCycleCode());
		this.cycleMonth = copyFrom.getCycleMonth();
		this.cycleYear = copyFrom.getCycleYear();
		this.cycleInstance = copyFrom.getCycleInstance();
		this.cycleSeqNo = copyFrom.getCycleSeqNo();
		this.startDate = copyFrom.getStartDate();
		this.endDate = copyFrom.getEndDate();
		this.status = copyFrom.getStatus();
		this.customerIdInfo = copyFrom.getCustomerIdInfo()!=null ? String.valueOf(copyFrom.getCustomerIdInfo().getCustomerNo()) : null;
		this.customerPartitionId = copyFrom.getCustomerPartitionId();
		this.runDate = copyFrom.getRunDate();
	}
	
	public static CustomerCyclesInfo_Fixed convert(amdocs.bl3g.datatypes.CustomerCyclesInfo other) {
		return new CustomerCyclesInfo_Fixed( other );
	}
	public static CustomerCyclesInfo_Fixed[] convert(amdocs.bl3g.datatypes.CustomerCyclesInfo[] otherArr) {
		if(otherArr==null||otherArr.length==0)return null;
		CustomerCyclesInfo_Fixed[] ret = new CustomerCyclesInfo_Fixed[otherArr.length];
		for(int i=0; i<otherArr.length; i++) {
			ret[i] = new CustomerCyclesInfo_Fixed( otherArr[i] );
		}
		return ret;
	}

}
