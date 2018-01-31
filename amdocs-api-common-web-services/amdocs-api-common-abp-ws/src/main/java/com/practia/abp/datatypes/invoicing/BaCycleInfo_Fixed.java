package com.practia.abp.datatypes.invoicing;

import java.io.Serializable;
import java.util.Date;

public class BaCycleInfo_Fixed implements Serializable, Cloneable {

	private static final long serialVersionUID = -7185648652513514793L;

	protected CycleCodeInfo_Fixed cycleCode;
	protected short cycleMonth;
	protected short cycleYear;
	protected short cycleInstance;
	protected int cycleSeqNo;
	protected Date startDate;
	protected Date endDate;
	protected String status;
	protected long baCustomer;
	private short baCustomerPartitionId;
	protected long[] payerCustomerIds;

	public CycleCodeInfo_Fixed getCycleCode() {
		return this.cycleCode;
	}

	public void setCycleCode(CycleCodeInfo_Fixed cycleCode) {
		this.cycleCode = cycleCode;
	}

	public short getCycleMonth() {
		return this.cycleMonth;
	}

	public void setCycleMonth(short cycleMonth) {
		this.cycleMonth = cycleMonth;
	}

	public short getCycleYear() {
		return this.cycleYear;
	}

	public void setCycleYear(short cycleYear) {
		this.cycleYear = cycleYear;
	}

	public short getCycleInstance() {
		return this.cycleInstance;
	}

	public void setCycleInstance(short cycleInstance) {
		this.cycleInstance = cycleInstance;
	}

	public int getCycleSeqNo() {
		return this.cycleSeqNo;
	}

	public void setCycleSeqNo(int cycleSeqNo) {
		this.cycleSeqNo = cycleSeqNo;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getBaCustomer() {
		return this.baCustomer;
	}

	public void setBaCustomer(long baCustomer) {
		this.baCustomer = baCustomer;
	}

	public short getBaCustomerPartitionId() {
		return this.baCustomerPartitionId;
	}

	public void setBaCustomerPartitionId(short baCustomerPartitionId) {
		this.baCustomerPartitionId = baCustomerPartitionId;
	}

	public long[] payerCustomerIds() {
		return this.payerCustomerIds;
	}

	public void setPayerCustomers(long[] payerCustomerIds) {
		this.payerCustomerIds = payerCustomerIds;
	}

	public BaCycleInfo_Fixed() {
		super();
	}

	@SuppressWarnings("deprecation")
	public BaCycleInfo_Fixed(amdocs.bl3g.datatypes.BaCycleInfo copyFrom) {
		super();
		this.cycleCode = new CycleCodeInfo_Fixed(copyFrom.getCycleCode());
		this.cycleMonth = copyFrom.getCycleMonth();
		this.cycleYear = copyFrom.getCycleYear();
		this.cycleInstance = copyFrom.getCycleInstance();
		this.cycleSeqNo = copyFrom.getCycleSeqNo();
		this.startDate = copyFrom.getStartDate();
		this.endDate = copyFrom.getEndDate();
		this.status = copyFrom.getStatus();
		this.baCustomer = copyFrom.getBaCustomer();
		this.baCustomerPartitionId = copyFrom.getBaCustomerPartitionId();
		amdocs.bl3g.datatypes.CustomerIdInfo[] customerIdInfoArr = copyFrom.getPayerCustomers();
		if (customerIdInfoArr != null && customerIdInfoArr.length > 0) {
			this.payerCustomerIds = new long[customerIdInfoArr.length];
			for (int i = 0; i < customerIdInfoArr.length; i++) {
				this.payerCustomerIds[i] = customerIdInfoArr[i].getCustomerNo();
			}
		} else {
			this.payerCustomerIds = null;
		}
	}

	public static BaCycleInfo_Fixed convert(amdocs.bl3g.datatypes.BaCycleInfo other) {
		return new BaCycleInfo_Fixed(other);
	}

	public static BaCycleInfo_Fixed[] convert(amdocs.bl3g.datatypes.BaCycleInfo[] otherArr) {
		if (otherArr == null || otherArr.length == 0)
			return null;
		BaCycleInfo_Fixed[] ret = new BaCycleInfo_Fixed[otherArr.length];
		for (int i = 0; i < otherArr.length; i++) {
			ret[i] = new BaCycleInfo_Fixed(otherArr[i]);
		}
		return ret;
	}

}
