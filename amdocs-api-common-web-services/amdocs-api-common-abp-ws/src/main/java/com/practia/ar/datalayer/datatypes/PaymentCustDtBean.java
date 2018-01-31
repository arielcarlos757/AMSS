package com.practia.ar.datalayer.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import amdocs.ar.datalayer.datatypes.PaymentCustDt;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCustDt")
public class PaymentCustDtBean {

	private final String l3OrderID;
	private final Byte l9SmsNotify;

	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<PaymentCustDtBean> {
		private String l3OrderID;
		private Byte l9SmsNotify;

		public Builder(PaymentCustDt paymentCustDt) {
			l3OrderID = paymentCustDt.isL3OrderIDNull() ? null : paymentCustDt.getL3OrderID();
			l9SmsNotify = paymentCustDt.isL9SmsNotifyNull() ? null : paymentCustDt.getL9SmsNotify();
		}

		@Override
		public PaymentCustDtBean build() {
			return new PaymentCustDtBean(this);
		}
	}

	private PaymentCustDtBean(Builder builder) {
		l3OrderID = builder.l3OrderID;
		l9SmsNotify = builder.l9SmsNotify;
	}
}
