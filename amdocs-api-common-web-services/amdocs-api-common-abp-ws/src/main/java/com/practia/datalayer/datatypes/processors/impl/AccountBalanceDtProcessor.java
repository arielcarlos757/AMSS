package com.practia.datalayer.datatypes.processors.impl;

import com.practia.ar.datalayer.datatypes.AccountBalanceDtBean;
import com.practia.datalayer.datatypes.builder.Builder;
import com.practia.datalayer.datatypes.processors.Processor;

import amdocs.acmarch.core.AbstractDatatype;
import amdocs.ar.datalayer.datatypes.AccountBalanceDt;

public class AccountBalanceDtProcessor implements Processor<AccountBalanceDtBean> {

	public Builder<AccountBalanceDtBean> process(AbstractDatatype dt) {
	AccountBalanceDt account = (AccountBalanceDt)dt; 
	return new AccountBalanceDtBean.Builder(account.getArBalance()).unappliedAmount(account.getUnappliedAmount());	
	}
}
