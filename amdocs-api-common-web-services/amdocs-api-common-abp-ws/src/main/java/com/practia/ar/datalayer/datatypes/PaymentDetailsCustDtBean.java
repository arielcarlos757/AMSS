package com.practia.ar.datalayer.datatypes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import amdocs.ar.datalayer.datatypes.PaymentDetailsCustDt;
import amdocs.ar.domains.DOMAINar1bankcode;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsCustDt")
public class PaymentDetailsCustDtBean {

	@XmlElement(name = "authResponseCode", required = false)
	private final String authResponseCode;
	
	@XmlElement(name = "l3RequestMode", required = false)
	private final Byte l3RequestMode;
	
	@XmlElement(name = "requestStatus", required = false)
	private final Byte requestStatus;
	
	@XmlElement(name = "arExceptionAccInd", required = false)
	private final Byte arExceptionAccInd;
	
	@XmlElement(name = "l9Cvv", required = false)
	private final String l9Cvv;
	
	@XmlElement(name = "customerInfo", required = false)
	private final AR9CustomerInfoDtBean customerInfo;
	
	@XmlElement(name = "l9StoreId", required = false)
	private final String l9StoreId;
	
	@XmlElement(name = "l9InstallmentNo", required = false)
	private final Long l9InstallmentNo;
	
	@XmlElement(name = "l9CCToken", required = false)
	private final String l9CCToken;
	
	@XmlElement(name = "l9ExternalPaymentId", required = false)
	private final String l9ExternalPaymentId;
	
	@XmlElement(name = "l9VoucherId", required = false)
	private final String l9VoucherId;
	
	@XmlElement(name = "l9ProductLine", required = false)
	private final String l9ProductLine;
	
	@XmlElement(name = "l9CardVerifier", required = false)
	private final Byte l9CardVerifier;
	
	@XmlElement(name = "l9AttrList", required = false)
	private final String l9AttrList;
	
	@XmlElement(name = "l9Concept", required = false)
	private final String l9Concept;
	
	@XmlElement(name = "l9SubGroup", required = false)
	private final String l9SubGroup;
	
	@XmlElement(name = "l9DefCheckDueDate", required = false)
	private final Date l9DefCheckDueDate;
	
	@XmlElement(name = "l9PaymentSubMethod", required = false)
	private final String l9PaymentSubMethod;
	
	@XmlElement(name = "l9ReceiptId", required = false)
	private final String l9ReceiptId;
	
	@XmlElement(name = "l9Equipo", required = false)
	private final String l9Equipo;
	
	@XmlElement(name = "l9Group", required = false)
	private final String l9Group;
	
	@XmlElement(name = "l9InterestRate", required = false)
	private final Double l9InterestRate;
	
	@XmlElement(name = "l9CouponNumber", required = false)
	private final String l9CouponNumber;
	
	@XmlElement(name = "l9PaymentMethodDesc", required = false)
	private final String l9PaymentMethodDesc;
	
	@XmlElement(name = "sourceName", required = false)
	private final String sourceName;
	
	@XmlElement(name = "l9SalesChannel", required = false)
	private final String l9SalesChannel;
	
	@XmlElement(name = "l9TypeOfPayment", required = false)
	private final String l9TypeOfPayment;
	
	@XmlElement(name = "l9MixedPaymentIdFromCRM", required = false)
	private final Long l9MixedPaymentIdFromCRM;
	
	@XmlElement(name = "l9MixedPaymentStatus", required = false)
	private final String l9MixedPaymentStatus;
	
	@XmlElement(name = "l9DynamicAttr", required = false)
	private final String l9DynamicAttr;
	
	@XmlElement(name = "l9CreditId", required = false)
	private final Long l9CreditId;
	
	@XmlElement(name = "bankCode", required = false)
	private final String bankCode;
	
	@XmlElement(name = "l9CashierId", required = false)
	private final String l9CashierId;

	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<PaymentDetailsCustDtBean> {

		private String authResponseCode;
		private Byte l3RequestMode;
		private Byte requestStatus;
		private Byte arExceptionAccInd;
		private String l9Cvv;
		private AR9CustomerInfoDtBean customerInfo;
		private String l9StoreId;
		private Long l9InstallmentNo;
		private String l9CCToken;
		private String l9ExternalPaymentId;
		private String l9VoucherId;
		private String l9ProductLine;
		private Byte l9CardVerifier;
		private String l9AttrList;
		private String l9Concept;
		private String l9SubGroup;
		private Date l9DefCheckDueDate;
		private String l9PaymentSubMethod;
		private String l9ReceiptId;
		private String l9Equipo;
		private String l9Group;
		private Double l9InterestRate;
		private String l9CouponNumber;
		private String l9PaymentMethodDesc;
		private String sourceName;
		private String l9SalesChannel;
		private String l9TypeOfPayment;
		private Long l9MixedPaymentIdFromCRM;
		private String l9MixedPaymentStatus;
		private String l9DynamicAttr;
		private Long l9CreditId;
		private String bankCode;
		private String l9CashierId;
		
		public Builder(PaymentDetailsCustDt obj) {
			authResponseCode = obj.isAuthResponseCodeNull() ? null : obj.getAuthResponseCode();
			l3RequestMode = obj.isL3RequestModeNull() ? null : obj.getL3RequestMode();
			requestStatus = obj.isRequestStatusNull() ? null : obj.getRequestStatus();
			arExceptionAccInd = obj.isArExceptionAccIndNull() ? null : obj.getArExceptionAccInd();
			l9Cvv = obj.isL9CvvNull() ? null : obj.getL9Cvv();
			customerInfo = obj.isCustomerInfoNull() ? null : new AR9CustomerInfoDtBean.Builder(obj.getCustomerInfo()).build();
			l9StoreId = obj.isL9StoreIdNull() ? null : obj.getL9StoreId();
			l9InstallmentNo = obj.isL9InstallmentNoNull() ? null : obj.getL9InstallmentNo();
			l9CCToken = obj.isL9CCTokenNull() ? null : obj.getL9CCToken();
			l9ExternalPaymentId = obj.isL9ExternalPaymentIdNull() ? null : obj.getL9ExternalPaymentId();
			l9VoucherId = obj.isL9VoucherIdNull() ? null : obj.getL9VoucherId();
			l9ProductLine = obj.isL9ProductLineNull() ? null : obj.getL9ProductLine();
			l9CardVerifier = obj.isL9CardVerifierNull() ? null : obj.getL9CardVerifier();
			l9AttrList = obj.isL9AttrListNull() ? null : obj.getL9AttrList();
			l9Concept = obj.isL9ConceptNull() ? null : obj.getL9Concept();
			l9SubGroup = obj.isL9SubGroupNull() ? null : obj.getL9SubGroup();
			l9DefCheckDueDate = obj.isL9DefCheckDueDateNull() ? null : obj.getL9DefCheckDueDate();
			l9PaymentSubMethod = obj.isL9PaymentSubMethodNull() ? null : obj.getL9PaymentSubMethod();
			l9ReceiptId = obj.isL9ReceiptIdNull() ? null : obj.getL9ReceiptId();
			l9Equipo = obj.isL9EquipoNull() ? null : obj.getL9Equipo();
			l9Group = obj.isL9GroupNull() ? null : obj.getL9Group();
			l9InterestRate = obj.isL9InterestRateNull() ? null : obj.getL9InterestRate();
			l9CouponNumber = obj.isL9CouponNumberNull() ? null : obj.getL9CouponNumber();
			l9PaymentMethodDesc = obj.isL9PaymentMethodDescNull() ? null : obj.getL9PaymentMethodDesc();
			sourceName = obj.isSourceNameNull() ? null : obj.getSourceName();
			l9SalesChannel = obj.isL9SalesChannelNull() ? null : obj.getL9SalesChannel();
			l9TypeOfPayment = obj.isL9TypeOfPaymentNull() ? null : obj.getL9TypeOfPayment();
			l9MixedPaymentIdFromCRM = obj.isL9MixedPaymentIdFromCRMNull() ? null : obj.getL9MixedPaymentIdFromCRM();
			l9MixedPaymentStatus = obj.isL9MixedPaymentStatusNull() ? null : obj.getL9MixedPaymentStatus();
			l9DynamicAttr = obj.isL9DynamicAttrNull() ? null : obj.getL9DynamicAttr();
			l9CreditId = obj.isL9CreditIdNull() ? null : obj.getL9CreditId();
//			bankCode = DOMAINar1bankcode.isNull(obj.getBankCode()) ? null : obj.getBankCode();
//			l9CashierId = obj.isL9CashierIdNull() ? null : obj.getL9CashierId();
		}

		@Override
		public PaymentDetailsCustDtBean build() {
			return new PaymentDetailsCustDtBean(this);
		}
	}

	private PaymentDetailsCustDtBean(Builder builder) {
		authResponseCode = builder.authResponseCode;
		l3RequestMode = builder.l3RequestMode;
		requestStatus = builder.requestStatus;
		arExceptionAccInd = builder.arExceptionAccInd;
		l9Cvv = builder.l9Cvv;
		customerInfo = builder.customerInfo;
		l9StoreId = builder.l9StoreId;
		l9InstallmentNo = builder.l9InstallmentNo;
		l9CCToken = builder.l9CCToken;
		l9ExternalPaymentId = builder.l9ExternalPaymentId;
		l9VoucherId = builder.l9VoucherId;
		l9ProductLine = builder.l9ProductLine;
		l9CardVerifier = builder.l9CardVerifier;
		l9AttrList = builder.l9AttrList;
		l9Concept = builder.l9Concept;
		l9SubGroup = builder.l9SubGroup;
		l9DefCheckDueDate = builder.l9DefCheckDueDate;
		l9PaymentSubMethod = builder.l9PaymentSubMethod;
		l9ReceiptId = builder.l9ReceiptId;
		l9Equipo = builder.l9Equipo;
		l9Group = builder.l9Group;
		l9InterestRate = builder.l9InterestRate;
		l9CouponNumber = builder.l9CouponNumber;
		l9PaymentMethodDesc = builder.l9PaymentMethodDesc;
		sourceName = builder.sourceName;
		l9SalesChannel = builder.l9SalesChannel;
		l9TypeOfPayment = builder.l9TypeOfPayment;
		l9MixedPaymentIdFromCRM = builder.l9MixedPaymentIdFromCRM;
		l9MixedPaymentStatus = builder.l9MixedPaymentStatus;
		l9DynamicAttr = builder.l9DynamicAttr;
		l9CreditId = builder.l9CreditId;
		bankCode = builder.bankCode;
		l9CashierId = builder.l9CashierId;
	}
}
