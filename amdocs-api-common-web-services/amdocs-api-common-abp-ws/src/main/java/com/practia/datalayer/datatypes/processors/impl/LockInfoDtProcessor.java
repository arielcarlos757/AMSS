package com.practia.datalayer.datatypes.processors.impl;

import com.practia.ar.datalayer.datatypes.LockInfoDtBean;
import com.practia.datalayer.datatypes.builder.Builder;
import com.practia.datalayer.datatypes.processors.Processor;

import amdocs.acmarch.core.AbstractDatatype;
import amdocs.ar.datalayer.datatypes.LockInfoDt;

public class LockInfoDtProcessor implements Processor<LockInfoDtBean> {

	public Builder<LockInfoDtBean> process(AbstractDatatype dt) {
		LockInfoDt dataType = (LockInfoDt) dt;
		return new LockInfoDtBean.Builder(dataType);
	}

}
