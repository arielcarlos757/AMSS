package com.practia.bl3g.datatypes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.bl3g.datatypes.AttributeInfo;
import amdocs.bl3g.domains.DOMAINbl1amount;
import amdocs.bl3g.domains.DOMAINbl1ba;
import amdocs.bl3g.domains.DOMAINbl1chgcd;
import amdocs.bl3g.domains.DOMAINbl1chgorg;
import amdocs.bl3g.domains.DOMAINbl1chgseq;
import amdocs.bl3g.domains.DOMAINbl1cmentseq;
import amdocs.bl3g.domains.DOMAINbl1cmenttp;
import amdocs.bl3g.domains.DOMAINbl1counter;
import amdocs.bl3g.domains.DOMAINbl1curr;
import amdocs.bl3g.domains.DOMAINbl1cust;
import amdocs.bl3g.domains.DOMAINbl1cycseq;
import amdocs.bl3g.domains.DOMAINbl1desc;
import amdocs.bl3g.domains.DOMAINbl1eventtp;
import amdocs.bl3g.domains.DOMAINbl1extid;
import amdocs.bl3g.domains.DOMAINbl1gencd;
import amdocs.bl3g.domains.DOMAINbl1offer;
import amdocs.bl3g.domains.DOMAINbl1offerins;
import amdocs.bl3g.domains.DOMAINbl1offeritm;
import amdocs.bl3g.domains.DOMAINbl1pcn;
import amdocs.bl3g.domains.DOMAINbl1reqseq;
import amdocs.bl3g.domains.DOMAINbl1revcd;
import amdocs.bl3g.domains.DOMAINbl1taxrel;
import amdocs.bl3g.domains.DOMAINbl1taxsqdep;
import amdocs.bl3g.domains.DOMAINbl1txamount;
import amdocs.bl3g.domains.DOMAINdate;
import amdocs.bl3g.domains.DOMAINgn1beid;
import amdocs.bl3g.domains.DOMAINgn1yesnoind;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeAllDetailsInfo")
public class ChargeAllDetailsInfoBean {

	@XmlElement(name = "taxSeqNo", required = false)
	private final Integer taxSeqNo;
	
	@XmlElement(name = "totalTaxAmt", required = false)
	private final Double totalTaxAmt;
	
	@XmlElement(name = "accountCurAmount", required = false)
	private final Double accountCurAmount;
	
	@XmlElement(name = "accountCurrency", required = false)
	private final String accountCurrency;
	
	@XmlElement(name = "taxRelation", required = false)
	private final Byte taxRelation;
	
	@XmlElement(name = "amountIncludeTax", required = false)
	private final Double amountIncludeTax;
	
 	@XmlElement(name = "pcn", required = true)
 	private final Long pcn;
	
	@XmlElement(name = "chargeCode", required = true)
	private final String chargeCode;
	
	@XmlElement(name = "description", required = false)
	private final String description;
	
	@XmlElement(name = "serviceReciverType", required = false)
	private final Byte serviceReciverType;
	
	@XmlElement(name = "serviceReciverId", required = false)
	private final Long serviceReciverId;
	
	@XmlElement(name = "reciverCustomerId", required = false)
	private final Long reciverCustomerId;
	
	@XmlElement(name = "baId", required = false)
	private final Long baId;
	
	@XmlElement(name = "offerId", required = false)
	private final Long offerId;
	
	@XmlElement(name = "offerItemId", required = false)
	private final Long offerItemId;
	
	@XmlElement(name = "offerInstance", required = false)
	private final Integer offerInstance;
	
	@XmlElement(name = "effectiveDate", required = false)
	private final Date effectiveDate;
	
	@XmlElement(name = "amount", required = true)
	private final Double amount;
	
	@XmlElement(name = "amountCurrency", required = false)
	private final String amountCurrency;
	
	@XmlElement(name = "chargeOrigin", required = false)
	private final String chargeOrigin;
	
	@XmlElement(name = "eventType", required = false)
	private final String eventType;
	
	@XmlElement(name = "businessEntity", required = false)
	private final Integer businessEntity;
	
	@XmlElement(name = "cycleSeqRun", required = false)
	private final Integer cycleSeqRun;
	
	@XmlElement(name = "chargeId", required = true)
	private final Long chargeId;
	
	@XmlElement(name = "correctionSeqNo", required = false)
	private final Integer correctionSeqNo;
	
	@XmlElement(name = "cycleSeqNo", required = false)
	private final Integer cycleSeqNo;
	
	@XmlElement(name = "dynamicAttributeList", required = false)
	private final AttributeInfoBean[] dynamicAttributeList;
	
	@XmlElement(name = "manualPolicy", required = false)
	private final Byte manualPolicy;
	
	@XmlElement(name = "chargeClassification", required = false)
	private final String chargeClassification;
	
	@XmlElement(name = "revenueCode", required = false)
	private final String revenueCode;
	
	@XmlElement(name = "prepaidIndicator", required = false)
	private final Byte prepaidIndicator;
	
	@XmlElement(name = "isCorrectable", required = false)
	private final Byte isCorrectable;
	
	@XmlElement(name = "externalReceiverType", required = false)
	private final Byte externalReceiverType;
	
	@XmlElement(name = "externalReceiverId", required = false)
	private final String externalReceiverId;

	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<ChargeAllDetailsInfoBean> {

		// required parameters
		private Long pcn;
		private String chargeCode;
		private Double amount;
		private Long chargeId;
		
		// requierd optional
		private Integer taxSeqNo = null;
		private Double totalTaxAmt = null;
		private Double accountCurAmount = null;
		private String accountCurrency = null;
		private Byte taxRelation = null;
		private Double amountIncludeTax = null;
		private String description = null;
		private Byte serviceReciverType = null;
		private Long serviceReciverId = null;
		private Long reciverCustomerId = null;
		private Long baId = null;
		private Long offerId = null;
		private Long offerItemId = null;
		private Integer offerInstance = null;
		private Date effectiveDate = null;
		private String amountCurrency = null;
		private String chargeOrigin = null;
		private String eventType = null;
		private Integer businessEntity = null;
		private Integer cycleSeqRun = null;
		private Integer correctionSeqNo = null;
		private Integer cycleSeqNo = null;
		private AttributeInfoBean[] dynamicAttributeList = null;
		private Byte manualPolicy = null;
		private String chargeClassification = null;
		private String revenueCode = null;
		private Byte prepaidIndicator = null;
		private Byte isCorrectable = null;
		private Byte externalReceiverType = null;
		private String externalReceiverId = null;

		public Builder(long pcn, String chargeCode, double amount, long chargeId) {
			this.pcn =  DOMAINbl1pcn.isNull(pcn) ? null : pcn;
			this.chargeCode = DOMAINbl1chgcd.isNull(chargeCode) ? null : chargeCode ;
			this.amount =  DOMAINbl1amount.isNull(amount) ? null : amount ;
			this.chargeId = DOMAINbl1chgseq.isNull(chargeId) ? null : chargeId;
		}
		
		public Builder taxSeqNo(int val) 
			{this.taxSeqNo = DOMAINbl1taxsqdep.isNull(val) ? null : val; return this;}
		public Builder totalTaxAmt(double val) 
			{this.totalTaxAmt = DOMAINbl1txamount.isNull(val) ? null: val;  return this;}
		public Builder accountCurAmount(double val) 
			{this.accountCurAmount = DOMAINbl1amount.isNull(val) ? null : val;  return this;}
		public Builder accountCurrency(String val) 
			{this.accountCurrency = DOMAINbl1curr.isNull(val) ? null : val;  return this;}
		public Builder taxRelation(byte val) 
			{this.taxRelation = DOMAINbl1taxrel.isNull(val) ? null : val;  return this;}
		public Builder amountIncludeTax(double val) 
			{this.amountIncludeTax = DOMAINbl1amount.isNull(val) ? null : val;  return this;}
		public Builder description(String val) 
			{this.description = DOMAINbl1desc.isNull(val) ? null : val;  return this;}
		public Builder serviceReciverType(byte val) 
			{this.serviceReciverType = DOMAINbl1cmenttp.isNull(val) ? null : val;  return this;}
		public Builder serviceReciverId(long val) 
			{this.serviceReciverId = DOMAINbl1cmentseq.isNull(val) ? null : val;  return this;}
		public Builder reciverCustomerId(long val) 
			{this.reciverCustomerId = DOMAINbl1cust.isNull(val) ? null : val;  return this;}
		public Builder baId(long val) 
			{this.baId = DOMAINbl1ba.isNull(val) ? null : val;  return this;}
		public Builder offerId(long val)
			{this.offerId = DOMAINbl1offer.isNull(val) ? null : val;  return this;}
		public Builder offerItemId(long val) 
			{this.offerItemId = DOMAINbl1offeritm.isNull(val) ? null : val;  return this;}
		public Builder offerInstance(int val) 
			{this.offerInstance = DOMAINbl1offerins.isNull(val) ? null : val;  return this;}
		public Builder effectiveDate(Date val) 
			{this.effectiveDate =  DOMAINdate.isNull(val) ? null : val;  return this;}
		public Builder amountCurrency(String val) 
			{this.amountCurrency =  DOMAINbl1curr.isNull(val) ? null : val;  return this;}
		public Builder chargeOrigin(String val) 
			{this.chargeOrigin = DOMAINbl1chgorg.isNull(val) ? null : val;  return this;}
		public Builder eventType(String val) 
			{this.eventType = DOMAINbl1eventtp.isNull(val) ? null : val;  return this;}
		public Builder businessEntity(int val) 
			{this.businessEntity =  DOMAINgn1beid.isNull(val) ? null : val;  return this;}
		public Builder cycleSeqRun(int val) 
			{this.cycleSeqRun =  DOMAINbl1reqseq.isNull(val) ? null : val;  return this;}
		public Builder chargeId(long val) 
			{this.chargeId = DOMAINbl1chgseq.isNull(val) ? null : val;  return this;}
		public Builder correctionSeqNo(int val) 
			{this.correctionSeqNo =  DOMAINbl1counter.isNull(val) ? null : val;  return this;}
		public Builder cycleSeqNo(int val) 
			{this.cycleSeqNo =  DOMAINbl1cycseq.isNull(val) ? null : val;  return this;}
		public Builder dynamicAttributeList(AttributeInfo[] val) {
			if (val == null || val.length == 0)
				this.dynamicAttributeList = null;
			this.dynamicAttributeList = new AttributeInfoBean[val.length];
			
			for (int i = 0; i < val.length; i++) {
				this.dynamicAttributeList[i] = 
						new AttributeInfoBean
							.Builder()
								.attributeName(val[i].getAttributeName())
								.attributeValue(val[i].getAttributeValue())
								.build();
			}
			return this;
		}
		public Builder manualPolicy(byte val) 
			{this.manualPolicy =  DOMAINgn1yesnoind.isNull(val) ? null : val;  return this;}
		public Builder chargeClassification(String val) 
			{this.chargeClassification = DOMAINbl1gencd.isNull(val) ? null : val;  return this;}
		public Builder revenueCode(String val) 
			{this.revenueCode = DOMAINbl1revcd.isNull(val) ? null : val;  return this;}
		public Builder prepaidIndicator(byte val) 
			{this.prepaidIndicator = DOMAINgn1yesnoind.isNull(val) ? null : val;  return this;}
		public Builder isCorrectable(byte val) 
			{this.isCorrectable =  DOMAINgn1yesnoind.isNull(val) ? null : val;  return this;}
		public Builder externalReceiverType(byte val) 
			{this.externalReceiverType = DOMAINbl1cmenttp.isNull(val) ? null : val;  return this;}
		public Builder externalReceiverId(String val) 
			{this.externalReceiverId = DOMAINbl1extid.isNull(val) ? null : val;  return this;
		
		}
		@Override
		public ChargeAllDetailsInfoBean build() {
			return new ChargeAllDetailsInfoBean(this);
		}
	}

	private ChargeAllDetailsInfoBean(Builder builder) {
		taxSeqNo = builder.taxSeqNo;
		totalTaxAmt = builder.totalTaxAmt;
		accountCurAmount = builder.accountCurAmount;
		accountCurrency = builder.accountCurrency;
		taxRelation = builder.taxRelation;
		amountIncludeTax = builder.amountIncludeTax;
		pcn = builder.pcn;
		chargeCode = builder.chargeCode;
		description = builder.description;
		serviceReciverType = builder.serviceReciverType;
		serviceReciverId = builder.serviceReciverId;
		reciverCustomerId = builder.reciverCustomerId;
		baId = builder.baId;
		offerId = builder.offerId;
		offerItemId = builder.offerItemId;
		offerInstance = builder.offerInstance;
		effectiveDate = builder.effectiveDate;
		amount = builder.amount;
		amountCurrency = builder.amountCurrency;
		chargeOrigin = builder.chargeOrigin;
		eventType = builder.eventType;
		businessEntity = builder.businessEntity;
		cycleSeqRun = builder.cycleSeqRun;
		chargeId = builder.chargeId;
		correctionSeqNo = builder.correctionSeqNo;
		cycleSeqNo = builder.cycleSeqNo;
		dynamicAttributeList = builder.dynamicAttributeList;
		manualPolicy = builder.manualPolicy;
		chargeClassification = builder.chargeClassification;
		revenueCode = builder.revenueCode;
		prepaidIndicator = builder.prepaidIndicator;
		isCorrectable = builder.isCorrectable;
		externalReceiverType = builder.externalReceiverType;
		externalReceiverId = builder.externalReceiverId;
	}
}
