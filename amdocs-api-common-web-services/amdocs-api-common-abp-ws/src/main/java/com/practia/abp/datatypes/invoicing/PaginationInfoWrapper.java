package com.practia.abp.datatypes.invoicing;

import amdocs.bl3g.datatypes.PaginationInfo;

public class PaginationInfoWrapper extends PaginationInfo {

	private static final long serialVersionUID = 1L;

	public int getPageSize() {
		return super.getPageSize();
	}

	public void setPageSize(int pageSize) {
		super.setPageSize(pageSize);
	}

	public int getPageNumber() {
		return super.getPageNumber();
	}

	public void setPageNumber(int pageNumber) {
		super.setPageNumber(pageNumber);
	}

	public int getNumberOfRows() {
		return super.getNumberOfRows();
	}

	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public PaginationInfoWrapper() {
		super();
	}

	public PaginationInfoWrapper(amdocs.bl3g.datatypes.PaginationInfo other) {
		super(other);
	}

	public static PaginationInfoWrapper convert(amdocs.bl3g.datatypes.PaginationInfo other) {
		return new PaginationInfoWrapper(other);
	}

	public static PaginationInfoWrapper[] convert(amdocs.bl3g.datatypes.PaginationInfo[] otherArr) {
		if (otherArr == null || otherArr.length == 0)
			return null;
		PaginationInfoWrapper[] ret = new PaginationInfoWrapper[otherArr.length];
		for (int i = 0; i < otherArr.length; i++) {
			ret[i] = new PaginationInfoWrapper(otherArr[i]);
		}
		return ret;
	}
	public static amdocs.bl3g.datatypes.PaginationInfo convert(PaginationInfoWrapper other) {
		if (other == null)
			return null;
		PaginationInfo paginationInfo = new PaginationInfoWrapper(other);
		return paginationInfo;
	}
}
