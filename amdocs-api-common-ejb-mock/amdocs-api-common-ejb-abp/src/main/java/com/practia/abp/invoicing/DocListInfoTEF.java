package com.practia.abp.invoicing;

import amdocs.bl3g.datatypes.DocInfo;
import amdocs.bl3g.datatypes.DocListInfo;
import amdocs.bl3g.datatypes.PaginationInfo;

public class DocListInfoTEF extends DocListInfo {

	private static final long serialVersionUID = 1L;
	
	public void setDocList(DocInfo[] docList){
		super.docList = docList;
	}
	
	public DocInfoTEF[] getDocList() {
		return DocInfoTEF.convert(super.docList);
	}
	
	public void setPaginationInfo(PaginationInfo paginationInfo) {
		super.paginationInfo = paginationInfo;
	}

	public PaginationInfoTEF getPaginationInfo() {
		return (PaginationInfoTEF)super.paginationInfo;
	}
	public DocListInfoTEF(DocListInfo docListInfo) {
		this.setDocList(DocInfoTEF.convert(docListInfo.getDocList()));
		this.setPaginationInfo(new PaginationInfoTEF(docListInfo.getPaginationInfo()));
	}
	public DocListInfoTEF() {
		super();
	}
}
