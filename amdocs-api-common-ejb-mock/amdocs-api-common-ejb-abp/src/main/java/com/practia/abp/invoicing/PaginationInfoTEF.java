package com.practia.abp.invoicing;

import amdocs.bl3g.datatypes.PaginationInfo;

public class PaginationInfoTEF extends PaginationInfo {

	private static final long serialVersionUID = 1L;

	public int getNumberOfRows() {
		return super.numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		super.numberOfRows = numberOfRows;
	}

	public PaginationInfoTEF(PaginationInfo paginationInfo) {
		super(paginationInfo);
	}
	
	public PaginationInfoTEF() {
		super();
	}
	
}
