package com.practia.datalayer.datatypes.processors.impl;

import com.practia.ar.datalayer.datatypes.InvoiceSearchResultsScreenDtBean;
import com.practia.datalayer.datatypes.builder.Builder;
import com.practia.datalayer.datatypes.processors.Processor;

import amdocs.acmarch.core.AbstractDatatype;
import amdocs.ar.datalayer.datatypes.InvoiceSearchResultsScreenDt;

public class InvoiceSearchResultsScreenDtProcessor implements Processor<InvoiceSearchResultsScreenDtBean> {

	public Builder<InvoiceSearchResultsScreenDtBean> process(AbstractDatatype dt) {
		InvoiceSearchResultsScreenDt dataType = (InvoiceSearchResultsScreenDt) dt;
		return new InvoiceSearchResultsScreenDtBean
					.Builder()
						.paginationResults(dataType.getPaginationResults())
							.invoiceListItems(dataType.getInvoiceListItems())
								.lockInfo(dataType.getLockInfo());
	}
}
