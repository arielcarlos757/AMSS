package com.practia.datalayer.datatypes.processors.impl;

import com.practia.ar.datalayer.datatypes.PaymentSearchResultsScreenDtBean;
import com.practia.datalayer.datatypes.builder.Builder;
import com.practia.datalayer.datatypes.processors.Processor;

import amdocs.acmarch.core.AbstractDatatype;
import amdocs.ar.datalayer.datatypes.PaymentSearchResultsScreenDt;

public class PaymentSearchResultsScreenDtProcessor implements Processor<PaymentSearchResultsScreenDtBean> {

	public Builder<PaymentSearchResultsScreenDtBean> process(AbstractDatatype dt) {
		PaymentSearchResultsScreenDt paymentSearchResultsScreenDt = (PaymentSearchResultsScreenDt) dt;
		return new PaymentSearchResultsScreenDtBean
					.Builder(paymentSearchResultsScreenDt.getPaginationResults())
						.paymentListItems(paymentSearchResultsScreenDt.getPaymentListItems())
							.lockInfoDt(paymentSearchResultsScreenDt.getLockInfo());
	}
}
