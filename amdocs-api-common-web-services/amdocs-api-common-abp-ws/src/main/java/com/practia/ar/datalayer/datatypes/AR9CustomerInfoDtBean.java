package com.practia.ar.datalayer.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.ar.datalayer.datatypes.AR9CustomerInfoDt;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AR9CustomerInfoDt")
public class AR9CustomerInfoDtBean {

	@XmlElement(name = "customerId", required = false)
	private final Integer customerId;
	
	@XmlElement(name = "customerName", required = false)
	private final String customerName;
	
	@XmlElement(name = "customerAddress", required = false)
	private final String customerAddress;
	
	@XmlElement(name = "taxCategory", required = false)
	private final String taxCategory;
	
	@XmlElement(name = "idType", required = false)
	private final String idType;
	
	@XmlElement(name = "idValue", required = false)
	private final String idValue;
	
	@XmlElement(name = "province", required = false)
	private final String province;
	
	@XmlElement(name = "cpa", required = false)
	private final String cpa;
	
	@XmlElement(name = "addressComments", required = false)
	private final String addressComments;
	
	@XmlElement(name = "region", required = false)
	private final String region;
	
	@XmlElement(name = "taxFreeZoneIndicator", required = false)
	private final String taxFreeZoneIndicator;
	
	@XmlElement(name = "municipalityCode", required = false)
	private final String municipalityCode;
	
	@XmlElement(name = "taxFreeZone", required = false)
	private final String taxFreeZone;

	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<AR9CustomerInfoDtBean> {
		private Integer customerId;
		private String customerName;
		private String customerAddress;
		private String taxCategory;
		private String idType;
		private String idValue;
		private String province;
		private String cpa;
		private String addressComments;
		private String region;
		private String taxFreeZoneIndicator;
		private String municipalityCode;
		private String taxFreeZone;

		public Builder(AR9CustomerInfoDt ar9CustomerInfoDt) {
			this.customerId = ar9CustomerInfoDt.isCustomerIdNull() ? null
					: new Integer(ar9CustomerInfoDt.getCustomerId());
			this.customerName = ar9CustomerInfoDt.isCustomerNameNull() ? null : ar9CustomerInfoDt.getCustomerName();
			this.customerAddress = ar9CustomerInfoDt.isCustomerNameNull() ? null
					: ar9CustomerInfoDt.getCustomerAddress();
			this.taxCategory = ar9CustomerInfoDt.isCustomerNameNull() ? null : ar9CustomerInfoDt.getTaxCategory();
			this.idType = ar9CustomerInfoDt.isCustomerNameNull() ? null : ar9CustomerInfoDt.getIdType();
			this.idValue = ar9CustomerInfoDt.isCustomerNameNull() ? null : ar9CustomerInfoDt.getIdValue();
			this.province = ar9CustomerInfoDt.isCustomerNameNull() ? null : ar9CustomerInfoDt.getProvince();
			this.cpa = ar9CustomerInfoDt.isCustomerNameNull() ? null : ar9CustomerInfoDt.getCpa();
			this.addressComments = ar9CustomerInfoDt.isCustomerNameNull() ? null
					: ar9CustomerInfoDt.getAddressComments();
			this.region = ar9CustomerInfoDt.isCustomerNameNull() ? null : ar9CustomerInfoDt.getRegion();
			this.taxFreeZoneIndicator = ar9CustomerInfoDt.isCustomerNameNull() ? null
					: ar9CustomerInfoDt.getTaxFreeZoneIndicator();
			this.municipalityCode = ar9CustomerInfoDt.isCustomerNameNull() ? null
					: ar9CustomerInfoDt.getMunicipalityCode();
			this.taxFreeZone = ar9CustomerInfoDt.isCustomerNameNull() ? null : ar9CustomerInfoDt.getTaxFreeZone();
		}

		@Override
		public AR9CustomerInfoDtBean build() {
			return new AR9CustomerInfoDtBean(this);
		}
	}

	private AR9CustomerInfoDtBean(Builder builder) {
		customerId = builder.customerId;
		customerName = builder.customerName;
		customerAddress = builder.customerAddress;
		taxCategory = builder.taxCategory;
		idType = builder.idType;
		idValue = builder.idValue;
		province = builder.province;
		cpa = builder.cpa;
		addressComments = builder.addressComments;
		region = builder.region;
		taxFreeZoneIndicator = builder.taxFreeZoneIndicator;
		municipalityCode = builder.municipalityCode;
		taxFreeZone = builder.taxFreeZone;
	}
}
