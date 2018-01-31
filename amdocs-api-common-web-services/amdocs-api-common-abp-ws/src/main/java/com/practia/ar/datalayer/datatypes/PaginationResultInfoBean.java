package com.practia.ar.datalayer.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.ar.domains.DOMAINar1numb2_0;
import amdocs.ar.domains.DOMAINar1numb9_0;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginationResultInfo")
public class PaginationResultInfoBean {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "totalCount", required = false)
	private Integer totalCount;
	@XmlElement(name = "moreRows", required = true)
	private Short moreRows;
	@XmlElement(name = "rowCount", required = true)
	private Integer rowCount;
	@XmlElement(name = "resultsCount", required = true)
	private Integer resultsCount;
	
	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<PaginationResultInfoBean> {
		private Integer totalCount;
		private Short moreRows;
		private Integer rowCount;
		private Integer resultsCount;
		
		public Builder(short moreRows, int rowCount, int resultsCount) {
			this.moreRows = DOMAINar1numb2_0.isNull(moreRows) ? null : moreRows;
			this.rowCount = DOMAINar1numb9_0.isNull(rowCount) ? null : rowCount;
			this.resultsCount = DOMAINar1numb9_0.isNull(resultsCount) ? null : resultsCount;
		}
		
		public Builder totalCount(int val)
			{this.totalCount = DOMAINar1numb9_0.isNull(val) ? null : val; return this;}
		
		@Override
		public PaginationResultInfoBean build() {
			return new PaginationResultInfoBean(this);
		}
	}
	
	private PaginationResultInfoBean(Builder builder) {
		this.totalCount = builder.totalCount;
		this.moreRows = builder.moreRows;
		this.rowCount = builder.rowCount;
		this.resultsCount = builder.resultsCount;
	}
}
