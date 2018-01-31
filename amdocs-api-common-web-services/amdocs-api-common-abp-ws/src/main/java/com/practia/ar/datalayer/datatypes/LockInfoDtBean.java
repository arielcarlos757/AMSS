package com.practia.ar.datalayer.datatypes;

import amdocs.ar.domains.DOMAINar1numb19_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.ar.datalayer.datatypes.LockInfoDt;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockInfoDt")
public class LockInfoDtBean {

	@XmlElement(name = "accountTimestamp", required = false)
	private final Long accountTimestamp;
	
	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<LockInfoDtBean> {
		
		private Long accountTimestamp;
		
		public Builder(LockInfoDt lockInfoDt) {
			accountTimestamp = DOMAINar1numb19_0.isNull(lockInfoDt.getAccountTimestamp())? null : new Long(lockInfoDt.getAccountTimestamp());
		}
		
		@Override
		public LockInfoDtBean build() {
			return new LockInfoDtBean(this);
		}
	}
	
	private LockInfoDtBean(Builder builder) {
		accountTimestamp = builder.accountTimestamp;
	}
}
