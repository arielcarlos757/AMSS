package com.practia.bl3g.customtype;

import amdocs.bl3g.datatypes.PaginationInfo;

public class PaginationInfoCt extends PaginationInfo {

	private static final long serialVersionUID = 1L;

	public int getNumberOfRows() {
		return super.numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		super.numberOfRows = numberOfRows;
	}
	
	public PaginationInfoCt() {}
	
	public PaginationInfoCt(PaginationInfo paginationInfo) {
		super(paginationInfo);
	}
}
