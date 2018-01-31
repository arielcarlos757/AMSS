package com.practia.abp.invoicing.datatype.mock;

import amdocs.bl3g.datatypes.ChargeAllDetailsInfo;
import amdocs.bl3g.datatypes.ChargeAllDetailsListInfo;
import amdocs.bl3g.datatypes.PaginationInfo;

public class _ChargeAllDetailsListInfo extends ChargeAllDetailsListInfo {

	private static final long serialVersionUID = 1L;
	
	public void setChargeDetailsList(ChargeAllDetailsInfo[] chargeAllDetailsInfo) {
		super.chargeDetailsList = chargeAllDetailsInfo;
	}
	
	public void setPaginationInfo(PaginationInfo paginationInfo) {
		super.paginationInfo = paginationInfo;
	}
	
	public _ChargeAllDetailsListInfo() {
		super();
	}
	
	public _ChargeAllDetailsListInfo(ChargeAllDetailsListInfo chargeAllDetailsListInfo) {
		super(chargeAllDetailsListInfo);
	}
}
