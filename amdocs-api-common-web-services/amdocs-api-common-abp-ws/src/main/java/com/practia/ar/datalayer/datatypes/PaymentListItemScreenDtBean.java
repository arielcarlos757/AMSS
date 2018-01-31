package com.practia.ar.datalayer.datatypes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import amdocs.ar.datalayer.datatypes.GenericCustDt;
import amdocs.ar.datalayer.datatypes.LockInfoDt;
import amdocs.ar.datalayer.datatypes.PartitionIdDt;
import amdocs.ar.datalayer.datatypes.PaymentCustDt;
import amdocs.ar.datalayer.datatypes.PaymentDetailsCustDt;
import amdocs.ar.domains.DOMAINar1b_acc_id;
import amdocs.ar.domains.DOMAINar1bankacct;
import amdocs.ar.domains.DOMAINar1bankcode;
import amdocs.ar.domains.DOMAINar1char3;
import amdocs.ar.domains.DOMAINar1creditcd;
import amdocs.ar.domains.DOMAINar1date7;
import amdocs.ar.domains.DOMAINar1numb12_0;
import amdocs.ar.domains.DOMAINar1numb18_2;
import amdocs.ar.domains.DOMAINar1varc15;
import amdocs.ar.domains.DOMAINar1varc4;
import amdocs.ar.domains.DOMAINar1varc4000;
import amdocs.ar.domains.DOMAINar1varc6;
import amdocs.ar.domains.DOMAINgn1beid;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentListItemScreenDt")
public class PaymentListItemScreenDtBean {
	
	@XmlElement(name = "creditCardType", required = false)
	private final String creditCardType;
	@XmlElement(name = "creditCardNumber", required = false)
	private final String creditCardNumber;
	@XmlElement(name = "originalAmount", required = false)
	private final Double originalAmount;
	@XmlElement(name = "originalConvertedAmount", required = false)
	private final Double originalConvertedAmount;
	@XmlElement(name = "ccExpiryDate", required = false)
	private final String ccExpiryDate;
	@XmlElement(name = "bankCode", required = false)
	private final String bankCode;
	@XmlElement(name = "bankAccountNumber", required = false)
	private final String bankAccountNumber;
	@XmlElement(name = "checkNo", required = false)
	private final String checkNo;
	@XmlElement(name = "directDebitVoucher", required = false)
	private final Long directDebitVoucher;
	@XmlElement(name = "creditId", required = false)
	private final Long creditId;
	@XmlElement(name = "lockInfo", required = false)
	private final LockInfoDtBean lockInfo;
	@XmlElement(name = "be", required = false)
	private final Integer be;
	@XmlElement(name = "partitions", required = false)
	private final PartitionIdDt partitions;
	@XmlElement(name = "paymentAmount", required = false)
	private final Double paymentAmount;
	@XmlElement(name = "l3OrderID", required = false)
	private final String l3OrderID;
	@XmlElement(name = "l9ExchangePaymentIndicator", required = false)
	private final Byte l9ExchangePaymentIndicator;
	@XmlElement(name = "paymentId", required = false)
	private final Long paymentId;
	@XmlElement(name = "paymentMethod", required = false)
	private final String paymentMethod;
	@XmlElement(name = "amount", required = false)
	private final Double amount;
	@XmlElement(name = "currency", required = false)
	private final String currency;
	@XmlElement(name = "accountId", required = false)
	private final Long accountId;
	@XmlElement(name = "depositDate", required = false)
	private final Date depositDate;
	@XmlElement(name = "memoText", required = false)
	private final String memoText;
	@XmlElement(name = "accountCurrency", required = false)
	private final String accountCurrency;
	@XmlElement(name = "authorizationId", required = false)
	private final Long authorizationId;
	@XmlElement(name = "depositChoice", required = false)
	private final String depositChoice;
	@XmlElement(name = "paymentSourceType", required = false)
	private final String paymentSourceType;
	@XmlElement(name = "paymentSourceId", required = false)
	private final String paymentSourceId;
	@XmlElement(name = "paymentCustDt", required = false)
	private final PaymentCustDtBean paymentCustDt;
	@XmlElement(name = "paymentDetailsCustDt", required = false)
	private final PaymentDetailsCustDtBean paymentDetailsCustDt;
	@XmlElement(name = "genericCustDt", required = false)
	private final GenericCustDt genericCustDt;
	
	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<PaymentListItemScreenDtBean> {
		
		private String creditCardType;
		private String creditCardNumber;
		private Double originalAmount;
		private Double originalConvertedAmount;
		private String ccExpiryDate;
		private String bankCode;
		private String bankAccountNumber;
		private String checkNo;
		private Long directDebitVoucher;
		private Long creditId;
		private LockInfoDtBean lockInfo;
		private Integer be;
		private PartitionIdDt partitions;
		private Double paymentAmount;
		private String l3OrderID;
		private Byte l9ExchangePaymentIndicator;
		private Long paymentId;
		private String paymentMethod;
		private Double amount;
		private String currency;
		private Long accountId;
		private Date depositDate;
		private String memoText;
		private String accountCurrency;
		private Long authorizationId;
		private String depositChoice;
		private String paymentSourceType;
		private String paymentSourceId;
		private PaymentCustDtBean paymentCustDt;
		private PaymentDetailsCustDtBean paymentDetailsCustDt;
		private GenericCustDt genericCustDt;
		
		public Builder() {}
		
		public Builder creditCardType(String val) 
			{this.creditCardType = DOMAINar1char3.isNull(val) ? null : val; return this;}
		public Builder creditCardNumber(String val)
			{this.creditCardNumber = DOMAINar1creditcd.isNull(val) ? null : val; return this;}
		public Builder originalAmount(double val)
			{this.originalAmount = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public Builder originalConvertedAmount(double val)
			{this.originalConvertedAmount = DOMAINar1numb18_2.isNull(val) ? null : val; return this;}
		public Builder ccExpiryDate(String val)
			{this.ccExpiryDate = DOMAINar1varc6.isNull(val) ? null : val; return this;}
		public Builder bankCode(String val) 
			{this.bankCode= DOMAINar1bankcode.isNull(val) ? null : val; return this;}
		public Builder bankAccountNumber(String val)
			{this.bankAccountNumber= DOMAINar1bankacct.isNull(val) ? null : val; return this;}
		public Builder checkNo(String val)
			{this.checkNo= DOMAINar1varc15.isNull(val) ? null : val; return this;}
		public Builder directDebitVoucher(long val)
			{this.directDebitVoucher= DOMAINar1numb12_0.isNull(val) ? null : val; return this;}
		public Builder creditId(long val)
			{this.creditId= DOMAINar1numb12_0.isNull(val) ? null : val; return this;}
		public Builder lockInfo(LockInfoDt val)
			{this.lockInfo = (val == null) ? null : new LockInfoDtBean.Builder(val).build(); return this;}
		public Builder be(int val)
			{this.be = DOMAINgn1beid.isNull(val) ? null : new Integer(val); return this;}
		public Builder accountId(long val)
			{this.accountId = DOMAINar1b_acc_id.isNull(val) ? null : new Long(val); return this;} 
		public Builder accountCurrency(String val) 
			{this.accountCurrency = DOMAINar1char3.isNull(val) ? null : val; return this;}
		public Builder paymentId(long val)
			{this.paymentId = DOMAINar1numb12_0.isNull(val) ?  null : val; return this;}
		public Builder paymentMethod(String val )
			{this.paymentMethod = DOMAINar1char3.isNull(val) ? null : val; return this;}
		public Builder amount(double val)
			{this.amount = DOMAINar1numb18_2.isNull(val) ? null : new Double(val); return this;}
		public Builder currency(String val)
			{this.currency = DOMAINar1char3.isNull(val) ? null : val; return this;}
		public Builder depositDate(Date val)
			{this.depositDate = DOMAINar1date7.isNull(val) ? null : val; return this;}
		public Builder memoText(String val)
			{this.memoText = DOMAINar1varc4000.isNull(val) ? null : val; return this;}
		public Builder authorizationId(long val)
			{this.authorizationId = DOMAINar1numb12_0.isNull(val) ? null : val; return this;}
		public Builder depositChoice(String val)
			{this.depositChoice = DOMAINar1char3.isNull(val) ? null : val; return this;}
		public Builder paymentSourceType(String val)
			{this.paymentSourceType = DOMAINar1varc4.isNull(val) ? null : val; return this;}
		public Builder paymentSourceId(String val)
			{this.paymentSourceId = DOMAINar1varc15.isNull(val) ?  null: val; return this;}
		public Builder paymentCustDt(PaymentCustDt val)
			{this.paymentCustDt = (val == null) ?  null : new PaymentCustDtBean.Builder(val).build(); return this;}
		public Builder paymentDetailsCustDt(PaymentDetailsCustDt val)
			{this.paymentDetailsCustDt = (val == null) ?  null : new PaymentDetailsCustDtBean.Builder(val).build(); return this;}
		public Builder genericCustDt(GenericCustDt val)
			{this.genericCustDt = (val == null) ? null : val; return this;}

		@Override
		public PaymentListItemScreenDtBean build() {
			return new PaymentListItemScreenDtBean(this);
		}
	}
	
	private PaymentListItemScreenDtBean(Builder builder) {
		this.creditCardType = builder.creditCardType;
		this.creditCardNumber = builder.creditCardNumber;
		this.originalAmount = builder.originalAmount;
		this.originalConvertedAmount = builder.originalConvertedAmount;
		this.ccExpiryDate = builder.ccExpiryDate;
		this.bankCode = builder.bankCode;
		this.bankAccountNumber = builder.bankAccountNumber;
		this.checkNo = builder.checkNo;
		this.directDebitVoucher = builder.directDebitVoucher;
		this.creditId = builder.creditId;
		this.lockInfo = builder.lockInfo;
		this.be = builder.be;
		this.partitions = builder.partitions;
		this.paymentAmount = builder.paymentAmount;
		this.l3OrderID = builder.l3OrderID;
		this.l9ExchangePaymentIndicator = builder.l9ExchangePaymentIndicator;
		this.paymentId = builder.paymentId;
		this.paymentMethod = builder.paymentMethod;
		this.amount = builder.amount;
		this.currency = builder.currency;
		this.accountId = builder.accountId;
		this.depositDate = builder.depositDate;
		this.memoText = builder.memoText;
		this.accountCurrency = builder.accountCurrency;
		this.authorizationId = builder.authorizationId;
		this.depositChoice = builder.depositChoice;
		this.paymentSourceType = builder.paymentSourceType;
		this.paymentSourceId = builder.paymentSourceId;
		this.paymentCustDt = builder.paymentCustDt;
		this.paymentDetailsCustDt = builder.paymentDetailsCustDt;
		this.genericCustDt = builder.genericCustDt;
	}

}
