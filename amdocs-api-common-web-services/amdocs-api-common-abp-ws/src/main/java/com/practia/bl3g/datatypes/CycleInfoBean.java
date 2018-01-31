package com.practia.bl3g.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.bl3g.domains.DOMAINbl1cyccd;
import amdocs.bl3g.domains.DOMAINgn1month;
import amdocs.bl3g.domains.DOMAINgn1year;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CycleInfo")
public class CycleInfoBean {

	@XmlElement(name = "cycleCode", required = false)
	private final Short cycleCode;

	@XmlElement(name = "cycleMonth", required = false)
	private final Short cycleMonth;

	@XmlElement(name = "cycleYear", required = false)
	private final Short cycleYear;

	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<CycleInfoBean> {

		private Short cycleCode = null;
		private Short cycleMonth = null;
		private Short cycleYear = null;
		
		public Builder() {}
		
		public Builder cycleCode(short val)
			{this.cycleCode = DOMAINbl1cyccd.isNull(val) ? null :  val; return this;}
		public Builder cycleMonth(short val)
			{this.cycleMonth = DOMAINgn1month.isNull(val) ? null :  val; return this;}
		public Builder cycleYear(short val)
			{this.cycleYear = DOMAINgn1year.isNull(val) ? null :  val; return this;}

		@Override
		public CycleInfoBean build() {
			return new CycleInfoBean(this);
		}
	}

	private CycleInfoBean(Builder builder) {
		this.cycleCode = builder.cycleCode;
		this.cycleMonth = builder.cycleMonth;
		this.cycleYear = builder.cycleYear;
	}

}
