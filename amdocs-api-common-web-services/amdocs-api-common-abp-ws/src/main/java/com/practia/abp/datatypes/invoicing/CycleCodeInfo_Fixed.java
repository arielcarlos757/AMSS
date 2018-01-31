package com.practia.abp.datatypes.invoicing;

import java.io.Serializable;
import java.util.Date;

public class CycleCodeInfo_Fixed implements Serializable, Cloneable {

	private static final long serialVersionUID = 5082957422351739946L;

	private short cycleCode;
	private short cycleCloseDay;
	private short cycleBillDay;
	private String cycleDesc;
	private byte cycleFrequency;
	private short cycleFrequencyMultiplier;
	private Date billingReference;
	private byte cyclePopulationCode;
	private String cyclePopulationDesc;
	private int cycleBusinessEntity;
	private short billPrdUpLimit;
	  
	public short getCycleCode() {
		return cycleCode;
	}
	public void setCycleCode(short cycleCode) {
		this.cycleCode = cycleCode;
	}
	public short getCycleCloseDay() {
		return cycleCloseDay;
	}
	public void setCycleCloseDay(short cycleCloseDay) {
		this.cycleCloseDay = cycleCloseDay;
	}
	public short getCycleBillDay() {
		return cycleBillDay;
	}
	public void setCycleBillDay(short cycleBillDay) {
		this.cycleBillDay = cycleBillDay;
	}
	public String getCycleDesc() {
		return cycleDesc;
	}
	public void setCycleDesc(String cycleDesc) {
		this.cycleDesc = cycleDesc;
	}
	public byte getCycleFrequency() {
		return cycleFrequency;
	}
	public void setCycleFrequency(byte cycleFrequency) {
		this.cycleFrequency = cycleFrequency;
	}
	public short getCycleFrequencyMultiplier() {
		return cycleFrequencyMultiplier;
	}
	public void setCycleFrequencyMultiplier(short cycleFrequencyMultiplier) {
		this.cycleFrequencyMultiplier = cycleFrequencyMultiplier;
	}
	public Date getBillingReference() {
		return billingReference;
	}
	public void setBillingReference(Date billingReference) {
		this.billingReference = billingReference;
	}
	public byte getCyclePopulationCode() {
		return cyclePopulationCode;
	}
	public void setCyclePopulationCode(byte cyclePopulationCode) {
		this.cyclePopulationCode = cyclePopulationCode;
	}
	public String getCyclePopulationDesc() {
		return cyclePopulationDesc;
	}
	public void setCyclePopulationDesc(String cyclePopulationDesc) {
		this.cyclePopulationDesc = cyclePopulationDesc;
	}
	public int getCycleBusinessEntity() {
		return cycleBusinessEntity;
	}
	public void setCycleBusinessEntity(int cycleBusinessEntity) {
		this.cycleBusinessEntity = cycleBusinessEntity;
	}
	public short getBillPrdUpLimit() {
		return billPrdUpLimit;
	}
	public void setBillPrdUpLimit(short billPrdUpLimit) {
		this.billPrdUpLimit = billPrdUpLimit;
	}

	public CycleCodeInfo_Fixed() {
		super();
	}
	public CycleCodeInfo_Fixed(amdocs.bl3g.datatypes.CycleCodeInfo copyFrom) {
		super();
		this.cycleCode = copyFrom.getCycleCode();
		this.cycleCloseDay = copyFrom.getCycleCloseDay();
		this.cycleBillDay = copyFrom.getCycleBillDay();
		this.cycleDesc = copyFrom.getCycleDesc();
		this.cycleFrequency = copyFrom.getCycleFrequency();
		this.cycleFrequencyMultiplier = copyFrom.getCycleFrequencyMultiplier();
		this.billingReference = copyFrom.getBillingReference();
		this.cyclePopulationCode = copyFrom.getCyclePopulationCode();
		this.cyclePopulationDesc = copyFrom.getCyclePopulationDesc();
		this.cycleBusinessEntity = copyFrom.getCycleBusinessEntity();
		this.billPrdUpLimit = copyFrom.getBillPrdUpLimit();
	}
	
	public static CycleCodeInfo_Fixed convert(amdocs.bl3g.datatypes.CycleCodeInfo other) {
		return new CycleCodeInfo_Fixed( other );
	}

}
