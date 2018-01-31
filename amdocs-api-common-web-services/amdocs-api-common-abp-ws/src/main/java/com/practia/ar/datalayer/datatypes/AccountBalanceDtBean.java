package com.practia.ar.datalayer.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBalanceDt")
public class AccountBalanceDtBean {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "arBalance", required = false)
	private final Double arBalance;
	
	@XmlElement(name = "unappliedAmount", required = false)
	private final Double unappliedAmount;

	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<AccountBalanceDtBean> {

		private Double arBalance;
		private Double unappliedAmount;

		public Builder(double arBalance) {
			this.arBalance = amdocs.ar.domains.DOMAINar1numb18_2.isNull(arBalance) ? null : new Double(arBalance);
		}

		public Builder unappliedAmount(double val) {
			unappliedAmount = amdocs.ar.domains.DOMAINar1numb18_2.isNull(val) ? null : new Double(val);
			return this;
		}

		@Override
		public AccountBalanceDtBean build() {
			return new AccountBalanceDtBean(this);
		}
	}

	private AccountBalanceDtBean(Builder builder) {
		arBalance = builder.arBalance;
		unappliedAmount = builder.unappliedAmount;
	}

}
