package com.practia.abp.invoicing;

import amdocs.bl3g.datatypes.DocInfo;

public class DocInfoTEF extends DocInfo {

	private static final long serialVersionUID = 1L;
	
	public void setInvoiceAmount(double paraminvoiceAmount) {
		super.invoiceAmount = paraminvoiceAmount;
	}
	
	public double getInvoiceAmount() {
		return super.invoiceAmount;
	}
	
	public void setInvoiceTaxAmount(double invoiceTaxAmount) {
		super.invoiceTaxAmount = invoiceTaxAmount;
	}

	public double getInvoiceTaxAmount() {
		return super.invoiceTaxAmount;
	}
	
	public void setInvoiceNetAmount(double invoiceNetAmount) {
		super.invoiceNetAmount = invoiceNetAmount;
	}
	
	public double getInvoiceNetAmount() {
		return super.invoiceNetAmount;
	}
	
	
	public DocInfoTEF() {
		
	}
	
	public DocInfoTEF(DocInfo DocInfo) {
		super(DocInfo);
	}
	
	public static DocInfoTEF[] convert(
			DocInfo[] otherArr) {
		if (otherArr == null || otherArr.length == 0)
			return null;
		DocInfoTEF[] ret = new DocInfoTEF[otherArr.length];
		for (int i = 0; i < otherArr.length; i++) {
			ret[i] = new DocInfoTEF(otherArr[i]);
		}
		return ret;
	}
}

