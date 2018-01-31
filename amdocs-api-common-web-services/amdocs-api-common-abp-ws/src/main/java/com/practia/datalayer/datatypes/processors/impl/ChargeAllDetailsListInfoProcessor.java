package com.practia.datalayer.datatypes.processors.impl;

import com.practia.bl3g.datatypes.ChargeAllDetailsListInfoBean;
import com.practia.datalayer.datatypes.builder.Builder;
import com.practia.datalayer.datatypes.processors.Processor;

import amdocs.acmarch.core.AbstractDatatype;
import amdocs.bl3g.datatypes.ChargeAllDetailsListInfo;

public class ChargeAllDetailsListInfoProcessor implements Processor<ChargeAllDetailsListInfoBean> {

	public Builder<ChargeAllDetailsListInfoBean> process(AbstractDatatype dt) {
		ChargeAllDetailsListInfo dataType = (ChargeAllDetailsListInfo) dt;
		return new ChargeAllDetailsListInfoBean
					.Builder()
						.chargeDetailsList(dataType.getChargeDetailsList())
							.paginationInfo(dataType.getPaginationInfo());
	}
}
