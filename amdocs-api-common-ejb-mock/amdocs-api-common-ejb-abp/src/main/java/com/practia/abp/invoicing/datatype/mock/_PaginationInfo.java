package com.practia.abp.invoicing.datatype.mock;

import amdocs.bl3g.datatypes.PaginationInfo;

public class _PaginationInfo extends PaginationInfo {

	private static final long serialVersionUID = 1L;

	public void setNumberOfRows(int numberOfRows) {
		super.numberOfRows = numberOfRows;
	}

	public _PaginationInfo() {
		super();
	}

	public _PaginationInfo(PaginationInfo paginationInfo) {
		super(paginationInfo);
	}
}
