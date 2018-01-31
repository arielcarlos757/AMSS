package com.practia.abp.datatypes.invoicing;

import amdocs.bl3g.datatypes.DocListInfo;
import com.practia.abp.datatypes.invoicing.DocInfoTEF;

public class DocListInfoTEF extends DocListInfo {

	private static final long serialVersionUID = 1L;
	
	public void setDocList(DocInfoTEF[] docList){
		super.docList = docList;
	}
	
	public DocInfoTEF[] getDocList() {
		return DocInfoTEF.convert(super.docList);
	}
	
	public void setPaginationInfo(PaginationInfoTEF paginationInfo) {
		super.paginationInfo = paginationInfo;
	}

	public PaginationInfoTEF getPaginationInfo() {
		return (PaginationInfoTEF)super.paginationInfo;
	}
	public DocListInfoTEF(DocListInfo docListInfo) {
		this.setDocList(DocInfoTEF.convert(docListInfo.getDocList()));
		this.setPaginationInfo(new PaginationInfoTEF(docListInfo.getPaginationInfo()));
	}
}
