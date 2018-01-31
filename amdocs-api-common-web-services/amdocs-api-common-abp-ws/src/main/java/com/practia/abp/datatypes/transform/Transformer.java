package com.practia.abp.datatypes.transform;

import com.practia.ar.datalayer.datatypes.AccountBalanceDtBean;

import amdocs.acmarch.core.AbstractDatatype;
import amdocs.ar.datalayer.datatypes.AccountBalanceDt;

public enum Transformer {

	/*ACCOUNT_BALANCE_DT("AccountBalanceDt") {

		public AccountBalanceDtBean process(AbstractDatatype dt) {
			AccountBalanceDt account = (AccountBalanceDt) dt;
			return new AccountBalanceDtBean
						.Builder(account.getArBalance())
							.unappliedAmount(account.getUnappliedAmount())
								.build();
		}
	},
	PAYMENT_SEARCH_RESULTS_SCREEN_DT("PaymentSearchResultsScreenDt") {

	},
	INVOICE_SEARCH_RESULTS_SCREEN_DT("InvoiceSearchResultsScreenDt") {

	},
	LOCK_INFO_DT("LockInfoDt") {

	},
	CHARGE_ALL_DETAILS_LIST_INFO("ChargeAllDetailsListInfo") {

	},
	DOC_LIST_INFO("DocListInfo") {

	};

	private final String dataType;

	Transformer(String dataType) {
		this.dataType = dataType;
	}*/
}
