package com.practia.abp.datatypes.invoicing;

import java.io.Serializable;

public class DocListInfo_Fixed implements Serializable, Cloneable {

	private static final long serialVersionUID = 3490428400829867252L;

	protected DocInfo_Fixed[] docList;
	protected PaginationInfo_Fixed paginationInfo;
	
	public DocInfo_Fixed[] getDocList() {
		return docList;
	}

	public void setDocList(DocInfo_Fixed[] docList) {
		this.docList = docList;
	}

	public PaginationInfo_Fixed getPaginationInfo() {
		return paginationInfo;
	}

	public void setPaginationInfo(PaginationInfo_Fixed paginationInfo) {
		this.paginationInfo = paginationInfo;
	}

	public DocListInfo_Fixed() {
		super();
	}

	public DocListInfo_Fixed(amdocs.bl3g.datatypes.DocListInfo copyFrom) {
		super();
		this.docList = DocInfo_Fixed.convert(copyFrom.getDocList());
		this.paginationInfo = PaginationInfo_Fixed.convert(copyFrom.getPaginationInfo());
	}

	public static DocListInfo_Fixed convert(amdocs.bl3g.datatypes.DocListInfo other) {
		return new DocListInfo_Fixed( other );
	}
	public static DocListInfo_Fixed[] convert(amdocs.bl3g.datatypes.DocListInfo[] otherArr) {
		if(otherArr==null||otherArr.length==0)return null;
		DocListInfo_Fixed[] ret = new DocListInfo_Fixed[otherArr.length];
		for(int i=0; i<otherArr.length; i++) {
			ret[i] = new DocListInfo_Fixed( otherArr[i] );
		}
		return ret;
	}

	public String toString(){
		return super.toString();
	}
}
