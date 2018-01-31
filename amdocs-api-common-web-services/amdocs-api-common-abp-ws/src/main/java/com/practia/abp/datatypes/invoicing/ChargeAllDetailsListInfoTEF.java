package com.practia.abp.datatypes.invoicing;

import java.io.Serializable;

import amdocs.bl3g.datatypes.ChargeAllDetailsInfo;
import amdocs.bl3g.datatypes.ChargeAllDetailsListInfo;
import amdocs.bl3g.datatypes.PaginationInfo;
import com.amdocs.xps.core.authorization.exceptions.XPSAccessDeniedException;


public class ChargeAllDetailsListInfoTEF extends ChargeAllDetailsListInfo implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	public void setPaginationInfo(PaginationInfoTEF paginationInfo) {
		super.paginationInfo = paginationInfo;
	}

	public PaginationInfoTEF getPaginationInfo() {
		return (PaginationInfoTEF)super.paginationInfo;
	}
	
	public ChargeAllDetailsInfo[] getChargeDetailsList() {
		return super.chargeDetailsList;
	}

	public void setChargeDetailsList(ChargeAllDetailsInfo[] chargeAllDetailsInfo) {
		super.chargeDetailsList = chargeAllDetailsInfo;
	}

	public ChargeAllDetailsListInfoTEF(ChargeAllDetailsListInfo chargeAllDetailsListInfo) {
		super(chargeAllDetailsListInfo);
		this.paginationInfo = new PaginationInfoTEF(chargeAllDetailsListInfo.getPaginationInfo());
	}

	public static ChargeAllDetailsListInfoTEF[] convert(
			amdocs.bl3g.datatypes.ChargeAllDetailsListInfo[] otherArr) {
		if (otherArr == null || otherArr.length == 0)
			return null;
		ChargeAllDetailsListInfoTEF[] ret = new ChargeAllDetailsListInfoTEF[otherArr.length];
		for (int i = 0; i < otherArr.length; i++) {
			ret[i] = new ChargeAllDetailsListInfoTEF(otherArr[i]);
		}
		return ret;
	}
}
