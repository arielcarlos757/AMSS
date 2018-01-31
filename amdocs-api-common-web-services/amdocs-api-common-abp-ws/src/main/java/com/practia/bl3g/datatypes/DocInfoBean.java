package com.practia.bl3g.datatypes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.bl3g.datatypes.CycleControlInfo;
import amdocs.bl3g.datatypes.CycleInfo;
import amdocs.bl3g.domains.DOMAINbl1account;
import amdocs.bl3g.domains.DOMAINbl1amount;
import amdocs.bl3g.domains.DOMAINbl1ba;
import amdocs.bl3g.domains.DOMAINbl1billfreq;
import amdocs.bl3g.domains.DOMAINbl1boddoctp;
import amdocs.bl3g.domains.DOMAINbl1curr;
import amdocs.bl3g.domains.DOMAINbl1cust;
import amdocs.bl3g.domains.DOMAINbl1docfmt;
import amdocs.bl3g.domains.DOMAINbl1docno;
import amdocs.bl3g.domains.DOMAINbl1docprod;
import amdocs.bl3g.domains.DOMAINbl1docsts;
import amdocs.bl3g.domains.DOMAINbl1doctp;
import amdocs.bl3g.domains.DOMAINbl1gencd;
import amdocs.bl3g.domains.DOMAINbl1invno;
import amdocs.bl3g.domains.DOMAINbl1prodtp;
import amdocs.bl3g.domains.DOMAINbl1txamount;
import amdocs.bl3g.domains.DOMAINgn1date;
import amdocs.bl3g.domains.DOMAINgn1yesnoind;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocInfo")
public class DocInfoBean {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "docId", required = false)
	private final Long docId;
	
	@XmlElement(name = "docType", required = false)
	private final String docType;
	
	@XmlElement(name = "docStatus", required = false)
	private final Byte docStatus;
	
	@XmlElement(name = "billDate", required = false)
	private final Date billDate;
	
	@XmlElement(name = "cycleInfo", required = false)
	private final CycleInfoBean cycleInfo;
	
	@XmlElement(name = "cycleControlInfo", required = false)
	private final CycleControlInfoBean cycleControlInfo;
	
	@XmlElement(name = "periodCoverageStartDate", required = false)
	private final Date periodCoverageStartDate;
	
	@XmlElement(name = "periodCoverageEndDate", required = false)
	private final Date periodCoverageEndDate;
	
	@XmlElement(name = "productionType", required = false)
	private final String productionType;
	
	@XmlElement(name = "accountNo", required = false)
	private final Long accountNo;
	
	@XmlElement(name = "customerNo", required = false)
	private final Long customerNo;
	
	@XmlElement(name = "baNo", required = false)
	private final Long baNo;
	
	@XmlElement(name = "documentFormat", required = false)
	private final String documentFormat;
	
	@XmlElement(name = "printingCategory", required = false)
	private final String printingCategory;
	
	@XmlElement(name = "docProduceInd", required = false)
	private final Byte docProduceInd;
	
	@XmlElement(name = "amountCurrency", required = false)
	private final String amountCurrency;
	
	@XmlElement(name = "dueDate", required = false)
	private final Date dueDate;
	
	@XmlElement(name = "totalAmount", required = false)
	private final Double totalAmount;
	
	@XmlElement(name = "invoiceAmount", required = false)
	private final Double invoiceAmount;
	
	@XmlElement(name = "invoiceTaxAmount", required = false)
	private final Double invoiceTaxAmount;
	
	@XmlElement(name = "invoiceNetAmount", required = false)
	private final Double invoiceNetAmount;
	
	@XmlElement(name = "legalInvoiceNo", required = false)
	private final String legalInvoiceNo;
	
	@XmlElement(name = "billFrequency", required = false)
	private final Short billFrequency;
	
	@XmlElement(name = "rebillActivity", required = false)
	private final Byte rebillActivity;
	
	@XmlElement(name = "docDemandType", required = false)
	private final String docDemandType;

	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<DocInfoBean> {

		private Long docId = null;
		private String docType = null;
		private Byte docStatus = null;
		private Date billDate = null;
		private CycleInfoBean cycleInfo = null;
		private CycleControlInfoBean cycleControlInfo = null;
		private Date periodCoverageStartDate = null;
		private Date periodCoverageEndDate = null;
		private String productionType = null;
		private Long accountNo = null;
		private Long customerNo = null;
		private Long baNo = null;
		private String documentFormat = null;
//		private Byte redirectInd = null;
//		private Integer redirectOperId = null;
		private String printingCategory = null;
		private Byte docProduceInd = null;
		private String amountCurrency = null;
		private Date dueDate = null;
		private Double totalAmount = null;
		private Double invoiceAmount = null;
		private Double invoiceTaxAmount = null;
		private Double invoiceNetAmount = null;
		private String legalInvoiceNo = null;
		private Short billFrequency = null;
		private Byte rebillActivity = null;
		private String docDemandType = null;

		public Builder docId(long val) 
			{this.docId = DOMAINbl1docno.isNull(val) ? null : val; return this;}
		public Builder docType(String val) 
			{this.docType = DOMAINbl1doctp.isNull(val) ? null : val; return this;}
		public Builder docStatus(byte val) 
			{this.docStatus = DOMAINbl1docsts.isNull(val) ? null : val; return this;}
		public Builder billDate(Date val) 
			{this.billDate = DOMAINgn1date.isNull(val) ? null : val; return this;}
		public Builder cycleInfo(CycleInfo val) {
			this.cycleInfo = (val == null) ? null : 
				new CycleInfoBean
						.Builder()
						.cycleCode(val.getCycleCode())
						.cycleMonth(val.getCycleMonth())
						.cycleYear(val.getCycleMonth())
							.build(); 
			return this;
		}
		public Builder cycleControlInfo(CycleControlInfo val) {
			this.cycleControlInfo = (val == null) ? null : 
			new CycleControlInfoBean
					.Builder()
						.cycleCode(val.getCycleCode())
						.cycleInstance(val.getCycleInstance())
						.cycleMonth(val.getCycleMonth())
						.cycleNo(val.getCycleNo())
						.cycleSeqRun(val.getCycleSeqRun())
						.cycleYear(val.getCycleYear())
						.endDate(val.getEndDate())
						.periodKey(val.getPeriodKey())
						.runDate(val.getRunDate())
						.startDate(val.getStartDate())
						.status(val.getStatus())
							.build(); 
			return this;
		}
		public Builder periodCoverageStartDate(Date val) 
			{this.periodCoverageStartDate = DOMAINgn1date.isNull(val) ? null : val; return this; }
		public Builder periodCoverageEndDate(Date val) 
			{this.periodCoverageEndDate = DOMAINgn1date.isNull(val) ? null : val; return this; }
		public Builder productionType(String val) 
			{this.productionType = DOMAINbl1prodtp.isNull(val) ? null : val; return this;}
		public Builder accountNo(long val) 
			{this.accountNo = DOMAINbl1account.isNull(val) ? null : val; return this; }
		public Builder customerNo(long val) 
			{this.customerNo = DOMAINbl1cust.isNull(val) ? null : val; return this; }
		public Builder baNo(long val) 
			{this.baNo = DOMAINbl1ba.isNull(val) ? null : val; return this; }
		public Builder documentFormat(String val) 
			{this.documentFormat = DOMAINbl1docfmt.isNull(val) ? null : val; return this; }
		public Builder printingCategory(String val) 
			{this.printingCategory = DOMAINbl1gencd.isNull(val) ? null : val; return this; }
		public Builder docProduceInd(byte val) 
			{this.docProduceInd = DOMAINbl1docprod.isNull(val) ? null : val; return this; }
		public Builder amountCurrency(String val) 
			{this.amountCurrency = DOMAINbl1curr.isNull(val) ? null : val; return this; }
		public Builder dueDate(Date val) 
			{this.dueDate = DOMAINgn1date.isNull(val) ? null : val; return this; }
		public Builder totalAmount(double val) 
			{this.totalAmount = DOMAINbl1amount.isNull(val) ? null : val; return this; }
		public Builder invoiceAmount(double val) 
			{this.invoiceAmount = DOMAINbl1amount.isNull(val) ? null : val; return this; }
		public Builder invoiceTaxAmount(double val) 
			{this.invoiceTaxAmount = DOMAINbl1txamount.isNull(val) ? null : val; return this; }
		public Builder invoiceNetAmount(double val) 
			{this.invoiceNetAmount = DOMAINbl1amount.isNull(val) ? null : val; return this; } 
		public Builder legalInvoiceNo(String val) 
			{this.legalInvoiceNo = DOMAINbl1invno.isNull(val) ? null : val; return this; }
		public Builder billFrequency(short val) 
			{this.billFrequency = DOMAINbl1billfreq.isNull(val) ? null : val; return this; }
		public Builder rebillActivity(byte val) 
			{this.rebillActivity = DOMAINgn1yesnoind.isNull(val) ? null : val; return this; }
		public Builder docDemandType(String val) 
			{this.docDemandType = DOMAINbl1boddoctp.isNull(val) ? null : val; return this; }
		
		
		@Override
		public DocInfoBean build() {
			return new DocInfoBean(this);
		}
	}

	private DocInfoBean(Builder builder) {
		this.docId = builder.docId;
		this.docType = builder.docType;
		this.docStatus = builder.docStatus;
		this.billDate = builder.billDate;
		this.cycleInfo = builder.cycleInfo;
		this.cycleControlInfo = builder.cycleControlInfo;
		this.periodCoverageStartDate = builder.periodCoverageStartDate;
		this.periodCoverageEndDate = builder.periodCoverageEndDate;
		this.productionType = builder.productionType;
		this.accountNo = builder.accountNo;
		this.customerNo = builder.customerNo;
		this.baNo = builder.baNo;
		this.documentFormat = builder.documentFormat;
		this.printingCategory = builder.printingCategory;
		this.docProduceInd = builder.docProduceInd;
		this.amountCurrency = builder.amountCurrency;
		this.dueDate = builder.dueDate;
		this.totalAmount = builder.totalAmount;
		this.invoiceAmount = builder.invoiceAmount;
		this.invoiceTaxAmount = builder.invoiceTaxAmount;
		this.invoiceNetAmount = builder.invoiceNetAmount;
		this.legalInvoiceNo = builder.legalInvoiceNo;
		this.billFrequency = builder.billFrequency;
		this.rebillActivity = builder.rebillActivity;
		this.docDemandType = builder.docDemandType;
	}
}
