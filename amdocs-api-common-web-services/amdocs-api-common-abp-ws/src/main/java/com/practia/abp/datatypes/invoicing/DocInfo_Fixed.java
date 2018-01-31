package com.practia.abp.datatypes.invoicing;
import java.io.Serializable;
import java.util.Date;

public class DocInfo_Fixed implements Serializable, Cloneable {

	private static final long serialVersionUID = -5658259861235074451L;

	private long docId;
	private String docType;
	private byte docStatus;
	private Date billDate;
	private CycleInfo_Fixed cycleInfo;
	private CycleControlInfo_Fixed cycleControlInfo;
	private Date periodCoverageStartDate;
	private Date periodCoverageEndDate;
	private String productionType;
	private long accountNo;
	private long customerNo;
	private long baNo;
	private String documentFormat;
	private byte redirectInd;
	private int redirectOperId;
	private String printingCategory;
	private byte docProduceInd;
	private String amountCurrency;
	private Date dueDate;
	private double totalAmount;
	protected double invoiceAmount;
	protected double invoiceTaxAmount;
	protected double invoiceNetAmount;
	private String legalInvoiceNo;
	private short billFrequency;
	private byte rebillActivity;
	private String docDemandType;

	public long getDocId() {
		return docId;
	}
	public void setDocId(long docId) {
		this.docId = docId;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public byte getDocStatus() {
		return docStatus;
	}
	public void setDocStatus(byte docStatus) {
		this.docStatus = docStatus;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public CycleInfo_Fixed getCycleInfo() {
		return cycleInfo;
	}
	public void setCycleInfo(CycleInfo_Fixed cycleInfo) {
		this.cycleInfo = cycleInfo;
	}
	public CycleControlInfo_Fixed getCycleControlInfo() {
		return cycleControlInfo;
	}
	public void setCycleControlInfo(CycleControlInfo_Fixed cycleControlInfo) {
		this.cycleControlInfo = cycleControlInfo;
	}
	public Date getPeriodCoverageStartDate() {
		return periodCoverageStartDate;
	}
	public void setPeriodCoverageStartDate(Date periodCoverageStartDate) {
		this.periodCoverageStartDate = periodCoverageStartDate;
	}
	public Date getPeriodCoverageEndDate() {
		return periodCoverageEndDate;
	}
	public void setPeriodCoverageEndDate(Date periodCoverageEndDate) {
		this.periodCoverageEndDate = periodCoverageEndDate;
	}
	public String getProductionType() {
		return productionType;
	}
	public void setProductionType(String productionType) {
		this.productionType = productionType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(long customerNo) {
		this.customerNo = customerNo;
	}
	public long getBaNo() {
		return baNo;
	}
	public void setBaNo(long baNo) {
		this.baNo = baNo;
	}
	public String getDocumentFormat() {
		return documentFormat;
	}
	public void setDocumentFormat(String documentFormat) {
		this.documentFormat = documentFormat;
	}
	public byte getRedirectInd() {
		return redirectInd;
	}
	public void setRedirectInd(byte redirectInd) {
		this.redirectInd = redirectInd;
	}
	public int getRedirectOperId() {
		return redirectOperId;
	}
	public void setRedirectOperId(int redirectOperId) {
		this.redirectOperId = redirectOperId;
	}
	public String getPrintingCategory() {
		return printingCategory;
	}
	public void setPrintingCategory(String printingCategory) {
		this.printingCategory = printingCategory;
	}
	public byte getDocProduceInd() {
		return docProduceInd;
	}
	public void setDocProduceInd(byte docProduceInd) {
		this.docProduceInd = docProduceInd;
	}
	public String getAmountCurrency() {
		return amountCurrency;
	}
	public void setAmountCurrency(String amountCurrency) {
		this.amountCurrency = amountCurrency;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public double getInvoiceTaxAmount() {
		return invoiceTaxAmount;
	}
	public void setInvoiceTaxAmount(double invoiceTaxAmount) {
		this.invoiceTaxAmount = invoiceTaxAmount;
	}
	public double getInvoiceNetAmount() {
		return invoiceNetAmount;
	}
	public void setInvoiceNetAmount(double invoiceNetAmount) {
		this.invoiceNetAmount = invoiceNetAmount;
	}
	public String getLegalInvoiceNo() {
		return legalInvoiceNo;
	}
	public void setLegalInvoiceNo(String legalInvoiceNo) {
		this.legalInvoiceNo = legalInvoiceNo;
	}
	public short getBillFrequency() {
		return billFrequency;
	}
	public void setBillFrequency(short billFrequency) {
		this.billFrequency = billFrequency;
	}
	public byte getRebillActivity() {
		return rebillActivity;
	}
	public void setRebillActivity(byte rebillActivity) {
		this.rebillActivity = rebillActivity;
	}
	public String getDocDemandType() {
		return docDemandType;
	}
	public void setDocDemandType(String docDemandType) {
		this.docDemandType = docDemandType;
	}

	public DocInfo_Fixed() {
		super();
	}
	@SuppressWarnings("deprecation")
	public DocInfo_Fixed(amdocs.bl3g.datatypes.DocInfo copyFrom) {
		super();
		this.docId = copyFrom.getDocId();
		this.docType = copyFrom.getDocType();
		this.docStatus = copyFrom.getDocStatus();
		this.billDate = copyFrom.getBillDate();
		this.cycleInfo = CycleInfo_Fixed.convert(copyFrom.getCycleInfo());
		this.cycleControlInfo = CycleControlInfo_Fixed.convert(copyFrom.getCycleControlInfo());
		this.periodCoverageStartDate = copyFrom.getPeriodCoverageStartDate();
		this.periodCoverageEndDate = copyFrom.getPeriodCoverageEndDate();
		this.productionType = copyFrom.getProductionType();
		this.accountNo = copyFrom.getAccountNo();
		this.customerNo = copyFrom.getCustomerNo();
		this.baNo = copyFrom.getBaNo();
		this.documentFormat = copyFrom.getDocumentFormat();
		this.redirectInd = copyFrom.getRedirectInd();
		this.redirectOperId = copyFrom.getRedirectOperId();
		this.printingCategory = copyFrom.getPrintingCategory();
		this.docProduceInd = copyFrom.getDocProduceInd();
		this.amountCurrency = copyFrom.getAmountCurrency();
		this.dueDate = copyFrom.getDueDate();
		this.totalAmount = copyFrom.getTotalAmount();
		this.invoiceAmount = copyFrom.getInvoiceAmount();
		this.invoiceTaxAmount = copyFrom.getInvoiceTaxAmount();
		this.invoiceNetAmount = copyFrom.getInvoiceNetAmount();
		this.legalInvoiceNo = copyFrom.getLegalInvoiceNo();
		this.billFrequency = copyFrom.getBillFrequency();
		this.rebillActivity = copyFrom.getRebillActivity();
		this.docDemandType = copyFrom.getDocDemandType();
	}
	
	public static DocInfo_Fixed convert(amdocs.bl3g.datatypes.DocInfo other) {
		return new DocInfo_Fixed( other );
	}
	public static DocInfo_Fixed[] convert(amdocs.bl3g.datatypes.DocInfo[] otherArr) {
		if(otherArr==null||otherArr.length==0)return null;
		DocInfo_Fixed[] ret = new DocInfo_Fixed[otherArr.length];
		for(int i=0; i<otherArr.length; i++) {
			ret[i] = new DocInfo_Fixed( otherArr[i] );
		}
		return ret;
	}
		
}
