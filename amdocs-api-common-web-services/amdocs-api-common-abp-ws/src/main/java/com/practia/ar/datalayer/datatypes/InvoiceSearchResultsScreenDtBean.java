package com.practia.ar.datalayer.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import amdocs.ar.datalayer.datatypes.InvoiceListItemScreenDt;
import amdocs.ar.datalayer.datatypes.LockInfoDt;
import amdocs.ar.datalayer.datatypes.PaginationResultInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceSearchResultsScreenDt")
public class InvoiceSearchResultsScreenDtBean {

	private static final Long serialVersionUID = 1L;
	
	@XmlElement(name = "paginationResults", required = false)
	private final PaginationResultInfoBean paginationResults;
	
	@XmlElement(name = "invoiceListItems", required = false)
	private final InvoiceListItemScreenDtBean[] invoiceListItems;
	
	@XmlElement(name = "lockInfo", required = false)
	private final LockInfoDtBean lockInfo;
	
	public static class Builder
		implements com.practia.datalayer.datatypes.builder.Builder<InvoiceSearchResultsScreenDtBean> {
		
		private PaginationResultInfoBean paginationResults = null;
		private InvoiceListItemScreenDtBean[] invoiceListItems  = null;
		private LockInfoDtBean lockInfo = null;
		
		public Builder() {}
		
		public Builder invoiceListItems(InvoiceListItemScreenDt[] val) {
			if (val == null || val.length == 0)
				return this;
			this.invoiceListItems = new InvoiceListItemScreenDtBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.invoiceListItems[i] = 
						new InvoiceListItemScreenDtBean
							.Builder(val[i].getInvoiceId(), val[i].getTaxAmount(), val[i].getAmount(), val[i].getCoveredAmount())
								.restrictionTaxAmount(val[i].getRestrictionTaxAmount())
								.restrictionTaxAmount(val[i].getRestrictionTaxAmount())
								.dueDate(val[i].getDueDate())
								.invoiceStatus(val[i].getInvoiceStatus())
								.billingArrangementId(val[i].getBillingArrangementId())
								.cmBillingArrangementId(val[i].getCmBillingArrangementId())
								.billingInvoiceNumber(val[i].getBillingInvoiceNumber())
								.invoiceBalance(val[i].getInvoiceBalance())
								.netAmtAvailableForCredit(val[i].getNetAmtAvailableForCredit())
								.grossAmtAvailableForCredit(val[i].getGrossAmtAvailableForCredit())
								.creditNetAmount(val[i].getCreditNetAmount())
								.discountTaxAmt(val[i].getDiscountTaxAmt())
								.currency(val[i].getCurrency())
								.invoiceType(val[i].getInvoiceType())
								.disputeNetAmount(val[i].getDiscountNetAmount())
								.discountTaxAmt(val[i].getDiscountTaxAmt())
								.originalBalanceAmount(val[i].getOriginalBalanceAmount())
								.l9IssueDate(val[i].getL9IssueDate())
								.l9Cae(val[i].getL9Cae())
								.l3OrderID(val[i].getL3OrderID())
								.l9RechargeId(val[i].getL9RechargeId())
								.l9RechargeDate(val[i].getL9RechargeDate())
												.build();
			}
			return this;
		}
		
		public Builder paginationResults(PaginationResultInfo val)
			{this.paginationResults = (val == null) ? null : 
					new PaginationResultInfoBean
						.Builder(
							val.getMoreRows(),
								val.getRowCount(), 
									val.getResultsCount())
						.totalCount(val.getTotalCount())
							.build(); 
			return this;}
		
		public Builder lockInfo(LockInfoDt val) {
			this.lockInfo = (val == null) ? null :
				new LockInfoDtBean
					.Builder(val)
						.build();
			return this;
		}
		
		@Override
		public InvoiceSearchResultsScreenDtBean build() {
			return new InvoiceSearchResultsScreenDtBean(this);
		}
	}

	private InvoiceSearchResultsScreenDtBean(Builder builder) {
		this.paginationResults = builder.paginationResults;
		this.invoiceListItems = builder.invoiceListItems;
		this.lockInfo = builder.lockInfo;
	}
}
