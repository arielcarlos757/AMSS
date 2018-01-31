package com.practia.abp.datatypes.invoicing;

import java.io.Serializable;

public class PaginationInfo_Fixed implements Cloneable, Serializable {
	public PaginationInfo_Fixed() {
		super();
	}

	private static final long serialVersionUID = -4267242026382543203L;

	private int pageSize;
	private int pageNumber;
	protected int numberOfRows;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public PaginationInfo_Fixed(amdocs.bl3g.datatypes.PaginationInfo copyFrom) {
		super();
		this.pageSize = copyFrom.getPageSize();
		this.pageNumber = copyFrom.getPageNumber();
		this.numberOfRows = copyFrom.getNumberOfRows();
	}

	public static PaginationInfo_Fixed convert(amdocs.bl3g.datatypes.PaginationInfo other) {
		return new PaginationInfo_Fixed(other);
	}

	public static PaginationInfo_Fixed[] convert(amdocs.bl3g.datatypes.PaginationInfo[] otherArr) {
		if (otherArr == null || otherArr.length == 0)
			return null;
		PaginationInfo_Fixed[] ret = new PaginationInfo_Fixed[otherArr.length];
		for (int i = 0; i < otherArr.length; i++) {
			ret[i] = new PaginationInfo_Fixed(otherArr[i]);
		}
		return ret;
	}
}