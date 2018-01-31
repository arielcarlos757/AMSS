package com.practia.bl3g.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.bl3g.datatypes.ChargeAllDetailsInfo;
import amdocs.bl3g.datatypes.PaginationInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeAllDetailsListInfo")
public class ChargeAllDetailsListInfoBean {

	@XmlElement(name = "chargeAllDetailsInfo", required = false)
	private final ChargeAllDetailsInfoBean[] chargeDetailsList;
	
	@XmlElement(name = "paginationInfo", required = false)
	private final PaginationInfoBean paginationInfo;
	
	public static class Builder
		implements com.practia.datalayer.datatypes.builder.Builder<ChargeAllDetailsListInfoBean> {
		
		private ChargeAllDetailsInfoBean[] chargeDetailsList = null;
		private PaginationInfoBean paginationInfo = null;
		
		public Builder() {}
		
		public Builder paginationInfo(PaginationInfo val) {
			this.paginationInfo = (val == null) ? null :
				new PaginationInfoBean.Builder(val.getPageSize(), val.getPageNumber())
						.numberOfRows(val.getNumberOfRows())
							.build();
			return this;
		}
		
		public Builder chargeDetailsList(ChargeAllDetailsInfo[] val) {
			if (val == null || val.length == 0)
				return this;
			
			this.chargeDetailsList = new ChargeAllDetailsInfoBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.chargeDetailsList[i] =
						new ChargeAllDetailsInfoBean
							.Builder(val[i].getPcn(), val[i].getChargeCode(), val[i].getAmount(), val[i].getChargeId())
								.taxSeqNo(val[i].getTaxSeqNo())
								.totalTaxAmt(val[i].getTotalTaxAmt())
								.accountCurAmount(val[i].getAccountCurAmount())
								.taxRelation(val[i].getTaxRelation())
								.amountIncludeTax(val[i].getAmountIncludeTax())
								.description(val[i].getDescription())
								.serviceReciverId(val[i].getServiceReciverId())
								.reciverCustomerId(val[i].getReciverCustomerId())
								.baId(val[i].getBaId())
								.offerId(val[i].getOfferId())
								.offerItemId(val[i].getOfferItemId())
								.offerInstance(val[i].getOfferInstance())
								.effectiveDate(val[i].getEffectiveDate())
								.amountCurrency(val[i].getAccountCurrency())
								.chargeOrigin(val[i].getChargeOrigin())
								.eventType(val[i].getEventType())
								.businessEntity(val[i].getBusinessEntity())
								.cycleSeqRun(val[i].getCycleSeqRun())
								.chargeId(val[i].getChargeId())
								.correctionSeqNo(val[i].getCorrectionSeqNo())
								.cycleSeqNo(val[i].getCycleSeqNo())
								.dynamicAttributeList(val[i].getDynamicAttributeList())
								.manualPolicy(val[i].getManualPolicy())
								.chargeClassification(val[i].getChargeClassification())
								.revenueCode(val[i].getRevenueCode())
								.prepaidIndicator(val[i].getPrepaidIndicator())
								.isCorrectable(val[i].getIsCorrectable())
								.externalReceiverType(val[i].getExternalReceiverType())
								.externalReceiverId(val[i].getExternalReceiverId())
								.build();
			}
			return this;
		}
		
		@Override
		public ChargeAllDetailsListInfoBean build() {
			return new ChargeAllDetailsListInfoBean(this);
		}
	}
	
	private ChargeAllDetailsListInfoBean(Builder builder) {
		this.chargeDetailsList = builder.chargeDetailsList;
		this.paginationInfo = builder.paginationInfo;
	}
}
