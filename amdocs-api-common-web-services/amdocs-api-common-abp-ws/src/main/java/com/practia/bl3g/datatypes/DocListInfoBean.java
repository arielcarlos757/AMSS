package com.practia.bl3g.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import amdocs.bl3g.datatypes.DocInfo;
import amdocs.bl3g.datatypes.PaginationInfo;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocListInfo")
public class DocListInfoBean {

	@XmlElement(name = "docList", required = false)
	private final DocInfoBean[] docList;
	
	@XmlElement(name = "paginationInfo", required = false)
	private final PaginationInfoBean paginationInfo;
	
	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<DocListInfoBean> {
		
		private DocInfoBean[] docList;
		private PaginationInfoBean paginationInfo;
		
		public Builder() {}
		
		public Builder paginationInfo(PaginationInfo val) 
			{ this.paginationInfo = (val == null) ? null : 
				new PaginationInfoBean.Builder(val.getPageSize(), val.getPageNumber())
					.numberOfRows(val.getNumberOfRows())
						.build();
			return this;
		}
		
		public Builder docList(DocInfo[] val) {
			if (val == null || val.length == 0)
				return this;
			this.docList = new DocInfoBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.docList[i] =
						new DocInfoBean
							.Builder()
								.docId(val[i].getDocId())
								.docType(val[i].getDocType())
								.docStatus(val[i].getDocStatus())
								.billDate(val[i].getBillDate())
								.cycleControlInfo(val[i].getCycleControlInfo())
								.periodCoverageStartDate(val[i].getPeriodCoverageStartDate())
								.periodCoverageEndDate(val[i].getPeriodCoverageEndDate())
								.productionType(val[i].getProductionType())
								.accountNo(val[i].getAccountNo())
								.customerNo(val[i].getCustomerNo())
								.baNo(val[i].getBaNo())
								.documentFormat(val[i].getDocumentFormat())
								.printingCategory(val[i].getPrintingCategory())
								.docProduceInd(val[i].getDocProduceInd())
								.amountCurrency(val[i].getAmountCurrency())
								.dueDate(val[i].getDueDate())
								.totalAmount(val[i].getTotalAmount())
								.invoiceAmount(val[i].getInvoiceAmount())
								.invoiceNetAmount(val[i].getInvoiceNetAmount())
								.invoiceTaxAmount(val[i].getInvoiceTaxAmount())
								.legalInvoiceNo(val[i].getLegalInvoiceNo())
								.billFrequency(val[i].getBillFrequency())
								.rebillActivity(val[i].getRebillActivity())
								.docDemandType(val[i].getDocDemandType())
								.build();
			}
			return this;
		}
		
		@Override
		public DocListInfoBean build() {
			return new DocListInfoBean(this);
		}
	}
	
	private DocListInfoBean(Builder builder) {
		this.docList = builder.docList;
		this.paginationInfo = builder.paginationInfo;
	}
}
