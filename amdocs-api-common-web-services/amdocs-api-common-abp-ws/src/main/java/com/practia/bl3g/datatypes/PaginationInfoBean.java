package com.practia.bl3g.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.bl3g.domains.DOMAINbufsize;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginationInfo")
public class PaginationInfoBean {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "pageSize", required = true)
	private final Integer pageSize;
	
	@XmlElement(name = "pageNumber", required = true)
	private final Integer pageNumber;
	
	@XmlElement(name = "numberOfRows", required = false)
	private final Integer numberOfRows;

	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<PaginationInfoBean> {

		private Integer pageSize;
		private Integer pageNumber;
		// optional parameters
		private Integer numberOfRows = null;
		
		public Builder(int pageSize, int pageNumber) {
			this.pageNumber = DOMAINbufsize.isNull(pageNumber) ? null : pageNumber;
			this.pageSize = DOMAINbufsize.isNull(pageSize) ? null : pageSize;
		}
		
		public Builder numberOfRows(int val) 
			{this.numberOfRows = val; return this;}

		@Override
		public PaginationInfoBean build() {
			return new PaginationInfoBean(this);
		}
	}
	
	private PaginationInfoBean(Builder builder) {
		this.pageSize = builder.pageSize;
		this.pageNumber = builder.pageNumber;
		this.numberOfRows = builder.numberOfRows;
	}

}
