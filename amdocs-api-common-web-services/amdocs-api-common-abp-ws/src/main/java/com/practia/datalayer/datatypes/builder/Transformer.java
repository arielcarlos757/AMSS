package com.practia.datalayer.datatypes.builder;

import com.practia.datalayer.datatypes.processors.Processor;
import com.practia.datalayer.datatypes.processors.impl.AccountBalanceDtProcessor;
import com.practia.datalayer.datatypes.processors.impl.ChargeAllDetailsListInfoProcessor;
import com.practia.datalayer.datatypes.processors.impl.DocListInfoProcessor;
import com.practia.datalayer.datatypes.processors.impl.InvoiceSearchResultsScreenDtProcessor;
import com.practia.datalayer.datatypes.processors.impl.LockInfoDtProcessor;
import com.practia.datalayer.datatypes.processors.impl.PaymentSearchResultsScreenDtProcessor;

import amdocs.acmarch.core.AbstractDatatype;
import amdocs.ar.datalayer.datatypes.AccountBalanceDt;
import amdocs.ar.datalayer.datatypes.InvoiceSearchResultsScreenDt;
import amdocs.ar.datalayer.datatypes.LockInfoDt;
import amdocs.ar.datalayer.datatypes.PaymentSearchResultsScreenDt;
import amdocs.bl3g.datatypes.ChargeAllDetailsListInfo;
import amdocs.bl3g.datatypes.DocListInfo;

public enum Transformer {
	ACCOUNT_BALANCE_DT(AccountBalanceDt.class,new AccountBalanceDtProcessor()),
	PAYMENT_SEARCH_RESULTS_SCREEN_DT(PaymentSearchResultsScreenDt.class, new PaymentSearchResultsScreenDtProcessor()),
	INVOICE_SEARCH_RESULTS_SCREEN_DT(InvoiceSearchResultsScreenDt.class, new InvoiceSearchResultsScreenDtProcessor()),
	LOCK_INFO_DT(LockInfoDt.class, new LockInfoDtProcessor()),
	CHARGE_ALL_DETAILS_LIST_INFO(ChargeAllDetailsListInfo.class, new ChargeAllDetailsListInfoProcessor()),
	DOC_LIST_INFO(DocListInfo.class, new DocListInfoProcessor());
	
	private final Class<?> clazz;
	private final Processor<?> processor;
	
	private Transformer(Class<?> clazz, Processor<?> processor) {
		this.clazz = clazz;
		this.processor = processor;
	};
	
	public Processor<?> processorOf(Class<?> clazz) {
		for(Transformer t : Transformer.values()) {
			if(t.clazz.equals(clazz)) {
				return t.processor;
			}
		}
		throw new IllegalArgumentException("No existe transmformacion para el dato requerido");
	}

	

	public Builder<?> builderOf(AbstractDatatype type) {
		Processor<?> p = this.processorOf(type.getClass());
		return p.process(type);
	}
}
