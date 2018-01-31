package com.practia.ar.datalayer.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.ar.datalayer.datatypes.LockInfoDt;
import amdocs.ar.datalayer.datatypes.PaginationResultInfo;
import amdocs.ar.datalayer.datatypes.PaymentListItemScreenDt;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSearchResultsScreenDt")
public class PaymentSearchResultsScreenDtBean {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "paginationResultInfo", required = true)
	private final PaginationResultInfoBean paginationResultInfo;
	@XmlElement(name = "paymentListItemScreen", required = false)
	private final PaymentListItemScreenDtBean[] paymentListItems;
	@XmlElement(name = "lockInfo", required = false)
	private final LockInfoDtBean lockInfoDt;

	public static class Builder
			implements com.practia.datalayer.datatypes.builder.Builder<PaymentSearchResultsScreenDtBean> {

		// Required parameters
		private PaginationResultInfoBean paginationResultInfo;
		// Optional parameters - initialized to default values
		private PaymentListItemScreenDtBean paymentListItems[] = null; 
		private LockInfoDtBean lockInfoDt = null;

		public Builder(PaginationResultInfo paginationResultInfo) {
			this.paginationResultInfo = paginationResultInfo == null ? null
					: new PaginationResultInfoBean.Builder(paginationResultInfo.getMoreRows(),
							paginationResultInfo.getRowCount(), paginationResultInfo.getResultsCount()).build();
		}

		public Builder paymentListItems(PaymentListItemScreenDt[] val) {
			if (val == null || val.length == 0)
				return this;
			this.paymentListItems = new PaymentListItemScreenDtBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.paymentListItems[i] = new PaymentListItemScreenDtBean
								.Builder()
									.creditCardType(val[i].getCreditCardType())
									.creditCardNumber(val[i].getCreditCardNumber())
									.originalAmount(val[i].getOriginalAmount())
									.originalConvertedAmount(val[i].getOriginalConvertedAmount())
									.ccExpiryDate(val[i].getCcExpiryDate())
									.bankCode(val[i].getBankCode())
									.bankAccountNumber(val[i].getBankAccountNumber())
									.checkNo(val[i].getCheckNo())
									.directDebitVoucher(val[i].getDirectDebitVoucher())
									.creditId(val[i].getCreditId())
									.lockInfo(val[i].getLockInfo())
									.accountId(val[i].getAccountId())
									.accountCurrency(val[i].getAccountCurrency())
									.be(val[i].getBe())
									.paymentId(val[i].getPaymentId())
									.paymentMethod(val[i].getPaymentMethod())
									.amount(val[i].getAmount())
									.currency(val[i].getCurrency())
									.depositDate(val[i].getDepositDate())
									.memoText(val[i].getMemoText())
									.authorizationId(val[i].getAuthorizationId())
									.depositChoice(val[i].getDepositChoice())
									.paymentSourceId(val[i].getPaymentSourceId())
									.paymentSourceType(val[i].getPaymentSourceType())
									.paymentCustDt(val[i].getPaymentCustDt())
									.paymentDetailsCustDt(val[i].getPaymentDetailsCustDt())
									.genericCustDt(val[i].getGenericCustDt())
									.build();
			}
			return this;
		}
		

		public Builder lockInfoDt(LockInfoDt val) {
			this.lockInfoDt = (val == null) ? null :
				new LockInfoDtBean.Builder(val).build();
			return this;
		}
		
		@Override
		public PaymentSearchResultsScreenDtBean build() {
			return new PaymentSearchResultsScreenDtBean(this);
		}
	}

	private PaymentSearchResultsScreenDtBean(Builder builder) {
		this.paymentListItems = builder.paymentListItems;
		this.paginationResultInfo = builder.paginationResultInfo;
		this.lockInfoDt = builder.lockInfoDt;
	}
}
