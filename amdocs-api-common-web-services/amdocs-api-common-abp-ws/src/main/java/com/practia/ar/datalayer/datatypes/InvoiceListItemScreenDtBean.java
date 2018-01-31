package com.practia.ar.datalayer.datatypes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.ar.domains.DOMAINar1amount;
import amdocs.ar.domains.DOMAINar1b_bilarg;
import amdocs.ar.domains.DOMAINar1bl_invno;
import amdocs.ar.domains.DOMAINar1char3;
import amdocs.ar.domains.DOMAINar1date7;
import amdocs.ar.domains.DOMAINar1numb18_2;
import amdocs.ar.domains.DOMAINar1varc10;
import amdocs.ar.domains.DOMAINar1varc30;
import amdocs.ar.domains.DOMAINar1varc6;
import amdocs.ar.domains.DOMAINar1vban;
import amdocs.ar.domains.DOMAINdate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceListItemScreenDt")
public class InvoiceListItemScreenDtBean {

	private static final Long serialVersionUID = 1L;

	@XmlElement(name = "invoiceId", required = true)
	private final Long invoiceId;

	@XmlElement(name = "taxAmount", required = true)
	private final Double taxAmount;

	@XmlElement(name = "amount", required = true)
	private final Double amount;

	@XmlElement(name = "coveredAmount", required = true)
	private final Double coveredAmount;

	@XmlElement(name = "restrictionAmount", required = false)
	private final Double restrictionAmount;

	@XmlElement(name = "restrictionTaxAmount", required = false)
	private final Double restrictionTaxAmount;

	@XmlElement(name = "dueDate", required = true)
	private final Date dueDate;

	@XmlElement(name = "invoiceStatus", required = false)
	private final String invoiceStatus;

	@XmlElement(name = "billingArrangementId", required = false)
	private final Long billingArrangementId;

	@XmlElement(name = "cmBillingArrangementId", required = false)
	private final String cmBillingArrangementId;

	@XmlElement(name = "billingInvoiceNumber", required = false)
	private final String billingInvoiceNumber;

	@XmlElement(name = "invoiceBalance", required = false)
	private final Double invoiceBalance;

	@XmlElement(name = "netAmtAvailableForCredit", required = false)
	private final Double netAmtAvailableForCredit;

	@XmlElement(name = "grossAmtAvailableForCredit", required = false)
	private final Double grossAmtAvailableForCredit;

	@XmlElement(name = "", required = false)
	private final Double creditNetAmount;

	@XmlElement(name = "", required = false)
	private final Double discountNetAmount;

	@XmlElement(name = "discountTaxAmt", required = false)
	private final Double discountTaxAmt;

	@XmlElement(name = "currency", required = false)
	private final String currency;

	@XmlElement(name = "invoiceType", required = false)
	private final String invoiceType;

	@XmlElement(name = "disputeNetAmount", required = false)
	private final Double disputeNetAmount;

	@XmlElement(name = "disputeTaxAmount", required = false)
	private final Double disputeTaxAmount;

	@XmlElement(name = "originalBalanceAmount", required = false)
	private final Double originalBalanceAmount;

	@XmlElement(name = "", required = false)
	private final Date l9IssueDate;

	@XmlElement(name = "l9RechargeId", required = false)
	private final String l9RechargeId;

	@XmlElement(name = "l9RechargeDate", required = false)
	private final Date l9RechargeDate;

	@XmlElement(name = "l3OrderID", required = false)
	private final String l3OrderID;

	@XmlElement(name = "l9Cae", required = false)
	private final String l9Cae;

	public static class Builder
			implements com.practia.datalayer.datatypes.builder.Builder<InvoiceListItemScreenDtBean> {
		// requiered parameters
		private Long invoiceId;
		private Double taxAmount;
		private Double amount;
		private Double coveredAmount;
		// optional parameters
		private Double restrictionAmount = null;
		private Double restrictionTaxAmount = null;
		private Date dueDate = null;
		private String invoiceStatus = null;
		private Long billingArrangementId = null;
		private String cmBillingArrangementId = null;
		private String billingInvoiceNumber = null;
		private Double invoiceBalance = null;
		private Double netAmtAvailableForCredit = null;
		private Double grossAmtAvailableForCredit = null;
		private Double creditNetAmount = null;
		private Double discountNetAmount = null;
		private Double discountTaxAmt = null;
		private String currency = null;
		private String invoiceType = null;
		private Double disputeNetAmount = null;
		private Double disputeTaxAmount = null;
		private Double originalBalanceAmount = null;
		private Date l9IssueDate = null;
		private String l9RechargeId = null;
		private Date l9RechargeDate = null;
		private String l3OrderID = null;
		private String l9Cae = null;

		public Builder(long invoiceId, double taxAmount, double amount, double coveredAmount) {
			this.invoiceId = invoiceId;
			this.taxAmount = taxAmount;
			this.amount = amount;
			this.coveredAmount = coveredAmount;
		}
		
		public Builder restrictionTaxAmount(double val) 
			{ this.restrictionTaxAmount = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public Builder dueDate(Date val) 
			{ this.dueDate = DOMAINar1date7.isNull(val) ? null : val; return this;}
		public  Builder invoiceStatus(String val) 
			{this.invoiceStatus = DOMAINar1varc6.isNull(val) ? null : val; return this;}
		public  Builder billingArrangementId(long val)
			{ this.billingArrangementId = DOMAINar1b_bilarg.isNull(val) ? null : val; return this;}
		public  Builder cmBillingArrangementId(String val)
			{ this.cmBillingArrangementId = DOMAINar1vban.isNull(val) ? null : val; return this;}
		public  Builder billingInvoiceNumber(String val) 
			{ this.billingInvoiceNumber = DOMAINar1bl_invno.isNull(val) ? null : val; return this;}
		public  Builder invoiceBalance(double val)
			{ this.invoiceBalance = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public  Builder netAmtAvailableForCredit(double val)
			{ this.netAmtAvailableForCredit = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public  Builder grossAmtAvailableForCredit(double val)
			{ this.grossAmtAvailableForCredit = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public  Builder creditNetAmount(double val)
			{ this.creditNetAmount = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public  Builder discountNetAmount(double val)
			{ this.discountNetAmount = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public  Builder discountTaxAmt(double val)
			{ this.discountTaxAmt = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public  Builder currency(String val)
			{this.currency = DOMAINar1char3.isNull(val) ? null : val; return this;}
		public  Builder invoiceType(String val)
			{this.invoiceType = DOMAINar1varc6.isNull(val) ? null : val; return this;}
		public  Builder disputeNetAmount(double val)
			{this.disputeNetAmount = DOMAINar1amount.isNull(val) ? null : val; return this;}
		public  Builder disputeTaxAmount(double val)
			{this.disputeTaxAmount = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public  Builder originalBalanceAmount(double val)
			{this.originalBalanceAmount = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public Builder l9IssueDate(Date val)
			{this.l9IssueDate = DOMAINdate.isNull(val) ? null : val; return this;}
		public  Builder l9RechargeId(String val)
			{this.l9RechargeId = DOMAINar1varc30.isNull(val) ? null : val; return this;}
		public  Builder l9RechargeDate(Date val)
			{this.l9RechargeDate = DOMAINar1date7.isNull(val) ? null : val; return this;}
		public  Builder l3OrderID(String val)
			{this.l3OrderID = DOMAINar1varc10.isNull(val) ? null : val; return this;}
		public  Builder l9Cae(String val)
			{this.l9Cae = DOMAINar1varc30.isNull(val) ? null : val; return this;}

		@Override
		public InvoiceListItemScreenDtBean build() {
			return new InvoiceListItemScreenDtBean(this);
		}
	}

	private InvoiceListItemScreenDtBean(Builder builder) {
		invoiceId = builder.invoiceId;
		taxAmount = builder.taxAmount;
		amount = builder.amount;
		coveredAmount = builder.coveredAmount;
		restrictionAmount = builder.restrictionAmount;
		restrictionTaxAmount = builder.restrictionTaxAmount;
		dueDate = builder.dueDate;
		invoiceStatus = builder.invoiceStatus;
		billingArrangementId = builder.billingArrangementId;
		cmBillingArrangementId = builder.cmBillingArrangementId;
		billingInvoiceNumber = builder.billingInvoiceNumber;
		invoiceBalance = builder.invoiceBalance;
		netAmtAvailableForCredit = builder.netAmtAvailableForCredit;
		grossAmtAvailableForCredit = builder.grossAmtAvailableForCredit;
		creditNetAmount = builder.creditNetAmount;
		discountNetAmount = builder.discountNetAmount;
		discountTaxAmt = builder.discountTaxAmt;
		currency = builder.currency;
		invoiceType = builder.invoiceType;
		disputeNetAmount = builder.discountNetAmount;
		disputeTaxAmount = builder.discountTaxAmt;
		originalBalanceAmount = builder.originalBalanceAmount;
		l9IssueDate = builder.l9IssueDate;
		l9RechargeId = builder.l9RechargeId;
		l9RechargeDate = builder.l9RechargeDate;
		l3OrderID = builder.l3OrderID;
		l9Cae = builder.l9Cae;
	}
}
