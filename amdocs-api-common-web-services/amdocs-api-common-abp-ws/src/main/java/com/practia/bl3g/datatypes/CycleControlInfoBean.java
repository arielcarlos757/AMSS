package com.practia.bl3g.datatypes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import amdocs.bl3g.domains.DOMAINbl1cyccd;
import amdocs.bl3g.domains.DOMAINbl1cycinst;
import amdocs.bl3g.domains.DOMAINbl1cycseq;
import amdocs.bl3g.domains.DOMAINbl1cycsts;
import amdocs.bl3g.domains.DOMAINbl1prdkey;
import amdocs.bl3g.domains.DOMAINbl1reqseq;
import amdocs.bl3g.domains.DOMAINgn1date;
import amdocs.bl3g.domains.DOMAINgn1month;
import amdocs.bl3g.domains.DOMAINgn1year;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CycleControlInfo")
public class CycleControlInfoBean {

	@XmlElement(name = "cycleNo", required = false)
	private final Integer cycleNo;
	
	@XmlElement(name = "cycleCode", required = false)
	private final Short cycleCode;
	
	@XmlElement(name = "cycleMonth", required = false)
	private final Short cycleMonth;
	
	@XmlElement(name = "cycleYear", required = false)
	private final Short cycleYear;
	
	@XmlElement(name = "cycleInstance", required = false)
	private final Short cycleInstance;
	
	@XmlElement(name = "startDate", required = false)
	private final Date startDate;
	
	@XmlElement(name = "endDate", required = false)
	private final Date endDate;
	
	@XmlElement(name = "runDate", required = false)
	private final Date runDate;
	
	@XmlElement(name = "status", required = false)
	private final String status;
	
	@XmlElement(name = "cycleSeqRun", required = false)
	private final Integer cycleSeqRun;
	
	@XmlElement(name = "periodKey", required = false)
	private final Integer periodKey;
	
	
	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<CycleControlInfoBean> {

		private Integer cycleNo = null;
		private Short cycleCode = null;
		private Short cycleMonth = null;
		private Short cycleYear = null;
		private Short cycleInstance = null;
		private Date startDate = null;
		private Date endDate = null;
		private Date runDate = null;
		private String status = null;
		private Integer cycleSeqRun = null;
		private Integer periodKey = null;
		
		public Builder() {}
		
		public Builder cycleNo(int val)
			{this.cycleNo = DOMAINbl1cycseq.isNull(val) ? null : val; return this;}
		public Builder cycleCode(short val)
			{this.cycleCode = DOMAINbl1cyccd.isNull(val) ? null : val; return this;}
		public Builder cycleMonth(short val)
			{this.cycleMonth = DOMAINgn1month.isNull(val) ? null : val; return this;}
		public Builder cycleYear(short val)
			{this.cycleYear = DOMAINgn1year.isNull(val) ? null : val; return this;}
		public Builder cycleInstance(short val)
			{this.cycleInstance = DOMAINbl1cycinst.isNull(val) ? null : val; return this;}
		public Builder startDate(Date val)
			{this.startDate = DOMAINgn1date.isNull(val) ? null : val; return this;}
		public Builder endDate(Date val)
			{this.endDate = DOMAINgn1date.isNull(val) ? null : val; return this;}		
		public Builder runDate(Date val)
			{this.runDate = DOMAINgn1date.isNull(val) ? null : val; return this;}
		public Builder status(String val)
			{this.status = DOMAINbl1cycsts.isNull(val) ? null : val; return this;}
		public Builder cycleSeqRun(int val)
			{this.cycleSeqRun = DOMAINbl1reqseq.isNull(val) ? null : val; return this;}
		public Builder periodKey(int val)
			{this.periodKey = DOMAINbl1prdkey.isNull(val) ? null : val; return this;}
		
		@Override
		public CycleControlInfoBean build() {
			return new CycleControlInfoBean(this);
		}
	}
	
	private CycleControlInfoBean(Builder builder) {
		this.cycleNo = builder.cycleNo;
		this.cycleCode = builder.cycleCode;
		this.cycleMonth = builder.cycleMonth;
		this.cycleYear = builder.cycleYear;
		this.cycleInstance = builder.cycleInstance;
		this.startDate = builder.startDate;
		this.endDate = builder.endDate;
		this.runDate = builder.runDate;
		this.status = builder.status;
		this.cycleSeqRun = builder.cycleSeqRun;
		this.periodKey = builder.periodKey;
	}
}
