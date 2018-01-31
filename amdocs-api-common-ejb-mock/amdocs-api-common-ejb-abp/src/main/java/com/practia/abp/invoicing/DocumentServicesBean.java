package com.practia.abp.invoicing;

import static amdocs.mock.ejb.Message.ADD_MESSAGE_ERROR;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.ejb.CreateException;

import com.practia.abp.invoicing.datatype.mock._ChargeAllDetailsListInfo;
import com.practia.abp.invoicing.datatype.mock._PaginationInfo;
import com.practia.amdocs.bl3g.exceptions.B1ErrorMessages;

import amdocs.acmarch.exceptions.ACMArchErrorMessages;
import amdocs.bl3g.datatypes.AccumulationGroupIdInfo;
import amdocs.bl3g.datatypes.AttributeInfo;
import amdocs.bl3g.datatypes.BaCycleInfo;
import amdocs.bl3g.datatypes.BaIdInfo;
import amdocs.bl3g.datatypes.ChargeAccumulationListInfo;
import amdocs.bl3g.datatypes.ChargeAllDetailsInfo;
import amdocs.bl3g.datatypes.ChargeAllDetailsListExInfo;
import amdocs.bl3g.datatypes.ChargeAllDetailsListInfo;
import amdocs.bl3g.datatypes.ChargeSelectionInfo;
import amdocs.bl3g.datatypes.CustomerCyclesInfo;
import amdocs.bl3g.datatypes.CustomerCyclesListInfo;
import amdocs.bl3g.datatypes.CustomerIdInfo;
import amdocs.bl3g.datatypes.CycleControlInfo;
import amdocs.bl3g.datatypes.CycleInfo;
import amdocs.bl3g.datatypes.DateLimitInfo;
import amdocs.bl3g.datatypes.DocIdInfo;
import amdocs.bl3g.datatypes.DocInfo;
import amdocs.bl3g.datatypes.DocListInfo;
import amdocs.bl3g.datatypes.DocStatDetailsInfo;
import amdocs.bl3g.datatypes.EntityIdInfo;
import amdocs.bl3g.datatypes.FinancialActivityListInfo;
import amdocs.bl3g.datatypes.FlexibleCycleInfo;
import amdocs.bl3g.datatypes.LegalIdInfo;
import amdocs.bl3g.datatypes.PaginationInfo;
import amdocs.bl3g.datatypes.PayChannelIdInfo;
import amdocs.bl3g.datatypes.StatementIdInfo;
import amdocs.bl3g.datatypes.TaxItemListInfo;
import amdocs.bl3g.exceptions.BillingException;
import amdocs.bl3g.sessions.interfaces.api.DocumentServices;
import amdocs.bl3g.sessions.interfaces.home.DocumentServicesHome;
import amdocs.jutil.messageHandling.MessageHandlingServices;
import amdocs.jutil.messageHandling.exceptions.GeneralException;
import amdocs.mock.ejb.APIEJBMock;

public class DocumentServicesBean extends APIEJBMock implements DocumentServices, DocumentServicesHome {

	private static final long serialVersionUID = 1L;
	
	@Override
	public DocumentServices create() throws CreateException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeAllDetailsListInfo getCharges(CustomerIdInfo arg0, EntityIdInfo arg1, FlexibleCycleInfo arg2,
			ChargeSelectionInfo arg3, PaginationInfo arg4) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeAllDetailsListInfo getCharges(CustomerIdInfo arg0, EntityIdInfo arg1, CycleInfo arg2,
			ChargeSelectionInfo arg3, PaginationInfo arg4) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeAllDetailsListExInfo getChargesEx(CustomerIdInfo arg0, EntityIdInfo arg1, FlexibleCycleInfo arg2,
			ChargeSelectionInfo arg3, PaginationInfo arg4) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeAllDetailsListExInfo getChargesEx(CustomerIdInfo arg0, EntityIdInfo arg1, CycleInfo arg2,
			ChargeSelectionInfo arg3, PaginationInfo arg4) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerCyclesInfo[] getCycleInfo(CustomerIdInfo arg0) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaCycleInfo[] getCycleInfo(BaIdInfo arg0) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerCyclesListInfo getCycleListInfo(CustomerIdInfo arg0, DateLimitInfo arg1, PaginationInfo arg2)
			throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeAccumulationListInfo getDocumentAccumulations(DocIdInfo arg0, PayChannelIdInfo arg1,
			AccumulationGroupIdInfo arg2, PaginationInfo arg3) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeAccumulationListInfo getDocumentAccumulations(DocIdInfo arg0, PayChannelIdInfo arg1,
			AccumulationGroupIdInfo arg2, AttributeInfo[] arg3, PaginationInfo arg4)
			throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeAllDetailsListInfo getDocumentCharges(DocIdInfo arg0, PayChannelIdInfo arg1, EntityIdInfo arg2,
			PaginationInfo arg3) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeAllDetailsListInfo getDocumentCharges(DocIdInfo paramDocIdInfo, PayChannelIdInfo arg1, EntityIdInfo arg2,
			ChargeSelectionInfo arg3, PaginationInfo arg4) throws RemoteException, BillingException {
		if (paramDocIdInfo != null && paramDocIdInfo.getDocId() == 0) {
			try {
				MessageHandlingServices.getInstance().addMessage("AR", "FAILED_TO_CREATE_INSTANCE_OF_CLASS", "AR1Error",
						3, "JF1-000086 (Failed to create an instance of the {0} class.)", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "docId" , "3" };
			throw new BillingException(ACMArchErrorMessages.GN1_FAILED_TO_CREATE_INSTANCE_OF_CLASS, errorParams);
		}
		
		if (paramDocIdInfo != null && paramDocIdInfo.getDocId() == 1) {
			try {
				MessageHandlingServices.getInstance().addMessage("AR", "LOOKUP_OPRATION_FAILED", "AR1Error",
						3, "JF1-000536 (Lookup operation failed {0})", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "docId" , "3" };
			throw new BillingException(ACMArchErrorMessages.JF1_LOOKUP_OPRATION_FAILED, errorParams);
		}
		
		if (paramDocIdInfo != null && paramDocIdInfo.getDocId() == 3445670 ) {
			_PaginationInfo pagination = new _PaginationInfo();
			pagination.setPageNumber(1);
			pagination.setPageSize(1);
			pagination.setNumberOfRows(1);
			
			ChargeAllDetailsListInfo response = new _ChargeAllDetailsListInfo();
			
			ChargeAllDetailsInfo[] chargeAllDetailsInfo = new ChargeAllDetailsInfo[1];
			ChargeAllDetailsInfo one = new ChargeAllDetailsInfo();
			one.setTaxSeqNo(1);
			one.setAccountCurAmount(660);
			one.setAccountCurrency("ARS");
			one.setTaxRelation((byte)'C');
			one.setChargeCode("88");
			one.setPcn(2l);
			one.setDescription("Descripcion");
			one.setServiceReciverType((byte)'C');
			one.setServiceReciverId(7);
			one.setReciverCustomerId(78);
			one.setBaId(776);
			one.setOfferId(2);
			one.setOfferInstance(2);
			one.setOfferItemId(2);
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/09/08";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			one.setEffectiveDate(date);
			one.setAmount(500);
			one.setAccountCurrency("ARS");
			one.setChargeOrigin("AR");
			one.setEventType("OC");
			one.setBusinessEntity(90);
			one.setCycleSeqRun(9);
			one.setChargeId(45);
			one.setCorrectionSeqNo(34787);
			one.setCycleSeqNo(8);
			
			AttributeInfo[] aDynamicAttributeList = new AttributeInfo[1];
			AttributeInfo att = new AttributeInfo();
			att.setAttributeName("atributos");
			aDynamicAttributeList[0] = att;
			one.setDynamicAttributeList(aDynamicAttributeList );
			one.setManualPolicy((byte)'Y');
			one.setChargeClassification("class");
			one.setRevenueCode("OC");
			one.setPrepaidIndicator((byte)'N');
			one.setIsCorrectable((byte)0);
			one.setExternalReceiverId("34");
			one.setExternalReceiverType((byte)'C');
			
			chargeAllDetailsInfo[0] = one;
					
			((_ChargeAllDetailsListInfo)response).setChargeDetailsList(chargeAllDetailsInfo);
			((_ChargeAllDetailsListInfo)response).setPaginationInfo(pagination);
			
			ChargeAllDetailsListInfo responseTrue = new ChargeAllDetailsListInfo(response);
			return responseTrue;
			
		}
		
		if (paramDocIdInfo != null && paramDocIdInfo.getDocId() == 344574) {
			_PaginationInfo pagination = new _PaginationInfo();
			pagination.setPageNumber(1);
			pagination.setPageSize(1);
			pagination.setNumberOfRows(1);
			
			ChargeAllDetailsListInfo response = new _ChargeAllDetailsListInfo();
			
			ChargeAllDetailsInfo[] chargeAllDetailsInfo = new ChargeAllDetailsInfo[1];
			ChargeAllDetailsInfo one = new ChargeAllDetailsInfo();
			one.setTaxSeqNo(1);
			one.setAccountCurAmount(660);
			one.setAccountCurrency("ARS");
			one.setTaxRelation((byte)'C');
			one.setChargeCode("88");
			one.setPcn(2l);
			one.setDescription("Descripcion");
			one.setServiceReciverType((byte)'C');
			one.setServiceReciverId(7);
			one.setReciverCustomerId(78);
			one.setBaId(776);
			one.setOfferId(2);
			one.setOfferInstance(2);
			one.setOfferItemId(2);
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/09/08";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			one.setEffectiveDate(date);
			one.setAmount(500);
			one.setAccountCurrency("ARS");
			one.setChargeOrigin("AR");
			one.setEventType("OC");
			one.setBusinessEntity(90);
			one.setCycleSeqRun(9);
			one.setChargeId(45);
			one.setCorrectionSeqNo(34787);
			one.setCycleSeqNo(8);
			
			AttributeInfo[] aDynamicAttributeList = new AttributeInfo[1];
			AttributeInfo att = new AttributeInfo();
			att.setAttributeName("atributos");
			aDynamicAttributeList[0] = att;
			one.setDynamicAttributeList(aDynamicAttributeList );
			one.setManualPolicy((byte)'Y');
			one.setChargeClassification("class");
			one.setRevenueCode("");
			one.setPrepaidIndicator((byte)'N');
			one.setIsCorrectable((byte)0);
			one.setExternalReceiverId("34");
			one.setExternalReceiverType((byte)'C');
			chargeAllDetailsInfo[0] = one;
					
			((_ChargeAllDetailsListInfo)response).setChargeDetailsList(chargeAllDetailsInfo);
			((_ChargeAllDetailsListInfo)response).setPaginationInfo(pagination);
			
			ChargeAllDetailsListInfo responseTrue = new ChargeAllDetailsListInfo(response);
			return responseTrue;
			
		}
		
		if (paramDocIdInfo != null && paramDocIdInfo.getDocId() == 344575  ) {
			_PaginationInfo pagination = new _PaginationInfo();
			pagination.setPageNumber(1);
			pagination.setPageSize(1);
			pagination.setNumberOfRows(1);
			
			ChargeAllDetailsListInfo response = new _ChargeAllDetailsListInfo();
			
			ChargeAllDetailsInfo[] chargeAllDetailsInfo = new ChargeAllDetailsInfo[1];
			ChargeAllDetailsInfo one = new ChargeAllDetailsInfo();
			one.setTaxSeqNo(1);
			one.setAccountCurAmount(660);
			one.setAccountCurrency("ARS");
			one.setTaxRelation((byte)'C');
			one.setChargeCode("88");
			one.setPcn(2l);
			one.setDescription("Descripcion");
			one.setServiceReciverType((byte)'C');
			one.setServiceReciverId(7);
			one.setReciverCustomerId(78);
			one.setBaId(776);
			one.setOfferId(2);
			one.setOfferInstance(2);
			one.setOfferItemId(2);
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/09/08";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			one.setEffectiveDate(date);
			one.setAmount(500);
			one.setAccountCurrency("ARS");
			one.setChargeOrigin("AR");
			one.setEventType("OC");
			one.setBusinessEntity(90);
			one.setCycleSeqRun(9);
			one.setChargeId(45);
			one.setCorrectionSeqNo(34787);
			one.setCycleSeqNo(8);
			
			AttributeInfo[] aDynamicAttributeList = new AttributeInfo[1];
			AttributeInfo att = new AttributeInfo();
			att.setAttributeName("atributos");
			aDynamicAttributeList[0] = att;
			one.setDynamicAttributeList(aDynamicAttributeList );
			one.setManualPolicy((byte)'Y');
			one.setChargeClassification("class");
			one.setRevenueCode(null);
			one.setPrepaidIndicator((byte)'N');
			one.setIsCorrectable((byte)0);
			one.setExternalReceiverId("34");
			one.setExternalReceiverType((byte)'C');
			chargeAllDetailsInfo[0] = one;
					
			((_ChargeAllDetailsListInfo)response).setChargeDetailsList(chargeAllDetailsInfo);
			((_ChargeAllDetailsListInfo)response).setPaginationInfo(pagination);
			
			ChargeAllDetailsListInfo responseTrue = new ChargeAllDetailsListInfo(response);
			return responseTrue;
			
		}
		
		if (paramDocIdInfo != null && paramDocIdInfo.getDocId() == 3445676) {
			throw new RemoteException();
		}
		
		if (paramDocIdInfo != null && paramDocIdInfo.getDocId() == 344573  ) {
			_PaginationInfo pagination = new _PaginationInfo();
			pagination.setPageNumber(1);
			pagination.setPageSize(1);
			pagination.setNumberOfRows(1);
			
			ChargeAllDetailsListInfo response = new _ChargeAllDetailsListInfo();
			
			ChargeAllDetailsInfo[] chargeAllDetailsInfo = new ChargeAllDetailsInfo[1];
			ChargeAllDetailsInfo one = new ChargeAllDetailsInfo();
			one.setTaxSeqNo(1);
			one.setAccountCurAmount(660);
			one.setAccountCurrency("ARS");
			one.setTaxRelation((byte)'C');
			one.setChargeCode("88");
			one.setPcn(2l);
			one.setDescription("Descripcion");
			one.setServiceReciverType((byte)'C');
			one.setServiceReciverId(7);
			one.setReciverCustomerId(78);
			one.setBaId(776);
			one.setOfferId(2);
			one.setOfferInstance(2);
			one.setOfferItemId(2);
			one.setEffectiveDate(null);
			one.setAmount(500);
			one.setAccountCurrency("ARS");
			one.setChargeOrigin("AR");
			one.setEventType("OC");
			one.setBusinessEntity(90);
			one.setCycleSeqRun(9);
			one.setChargeId(45);
			one.setCorrectionSeqNo(34787);
			one.setCycleSeqNo(8);
			
			AttributeInfo[] aDynamicAttributeList = new AttributeInfo[1];
			AttributeInfo att = new AttributeInfo();
			att.setAttributeName("atributos");
			aDynamicAttributeList[0] = att;
			one.setDynamicAttributeList(aDynamicAttributeList );
			one.setManualPolicy((byte)'Y');
			one.setChargeClassification("class");
			one.setRevenueCode("OC");
			one.setPrepaidIndicator((byte)'N');
			one.setIsCorrectable((byte)0);
			one.setExternalReceiverId("34");
			one.setExternalReceiverType((byte)'C');
			chargeAllDetailsInfo[0] = one;
					
			((_ChargeAllDetailsListInfo)response).setChargeDetailsList(chargeAllDetailsInfo);
			((_ChargeAllDetailsListInfo)response).setPaginationInfo(pagination);
			
			ChargeAllDetailsListInfo responseTrue = new ChargeAllDetailsListInfo(response);
			return responseTrue;
			
		}		
		try {

			MessageHandlingServices.getInstance().addMessage("BL", "INVALID_DATA_NOT_FOUND_DOC_ID", "BL1Error", 4,
					"BL1-000138 (The document id does not exist.)", "", Locale.getDefault());
		} catch (GeneralException e) {
			System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
		}
		String[] errorParams = { "docId" };
		throw new BillingException(B1ErrorMessages.INVALID_DATA_NOT_FOUND_DOC_ID, errorParams);
	}

	@Override
	public ChargeAllDetailsListExInfo getDocumentChargesEx(DocIdInfo arg0, PayChannelIdInfo arg1, EntityIdInfo arg2,
			PaginationInfo arg3) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeAllDetailsListExInfo getDocumentChargesEx(DocIdInfo arg0, PayChannelIdInfo arg1, EntityIdInfo arg2,
			ChargeSelectionInfo arg3, PaginationInfo arg4) throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocListInfo getDocumentList(DocIdInfo arg0) throws RemoteException, BillingException {
		if (arg0 == null) {
			try {
				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_OBJECT_WAS_NOT_SET_DOC_ID_INFO", "BL1Error", 4,
						"BL1-000033 (BA Id Info was not set and equals null.).", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "docId" };
			throw new BillingException(B1ErrorMessages.MISSING_OBJECT_WAS_NOT_SET_DOC_ID_INFO, errorParams);
		}

     	if (arg0.getDocId() == -1061109568) {
			try {
				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_MISSING_MANDATORY_FIELD", "BL1Error", 4,
						"BL1-000014 (Field {0} is mandatory.)", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "docId" };
			throw new BillingException(B1ErrorMessages.MISSING_MISSING_MANDATORY_FIELD, errorParams);
		}

     	if (arg0.getDocId() == 344570 ) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(arg0.getDocId());
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			
    		docInfo.setBillDate(null);
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setCycleNo(9);
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus("Activo");
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}

     	if (arg0.getDocId() == 344571 ) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(arg0.getDocId());
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/04/02";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		docInfo.setBillDate(date);
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setCycleNo(0);
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus("Activo");
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}

     	if (arg0.getDocId() == 344572 ) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(arg0.getDocId());
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/04/02";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		docInfo.setBillDate(date);
    		CycleInfo c = new CycleInfo();
    		c.setCycleCode((short)8);
    		c.setCycleMonth((short)9);
    		docInfo.setCycleInfo(c);
    		
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setCycleNo(0);
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus("");
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}

     	
     	
     	if (arg0.getDocId() == 344573 ) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(arg0.getDocId());
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/04/02";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		docInfo.setBillDate(date);
    		CycleInfo c = new CycleInfo();
    		c.setCycleCode((short)8);
    		c.setCycleMonth((short)9);
    		docInfo.setCycleInfo(c);
    		
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setCycleNo(0);
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus(null);
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}
     	
     	if (arg0.getDocId() == 344566 ) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(arg0.getDocId());
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/04/02";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		docInfo.setBillDate(date);
    		CycleInfo c = new CycleInfo();
    		c.setCycleCode((short)8);
    		c.setCycleMonth((short)9);
    		docInfo.setCycleInfo(c);
    		
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setCycleNo(9);
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus("Activo");
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}

     	try {
			MessageHandlingServices.getInstance().addMessage("BL", "INVALID_DATA_NOT_FOUND_DOC_ID", "BL1Error", 4,
					"BL1-000138 (The document id does not exist.)", "", Locale.getDefault());
		} catch (GeneralException e) {
			System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
		}
		String[] errorParams = { "docId" };
		throw new BillingException(B1ErrorMessages.INVALID_DATA_NOT_FOUND_DOC_ID, errorParams);
	}

	@Override
	public DocListInfo getDocumentList(LegalIdInfo arg0) throws RemoteException, BillingException {
		if (arg0 == null) {
			try {

				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_OBJECT_WAS_NOT_SET_LEGAL_ID_INFO", "BL1Error", 4,
						"BL1-000055 (Legal Id Info was not set and equals null.)", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "BaId" };
			throw new BillingException(B1ErrorMessages.MISSING_OBJECT_WAS_NOT_SET_LEGAL_ID_INFO, errorParams);
		}
     	

     	if ("".equals(arg0.getLegalInvoiceNo())) {
			try {

				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_MISSING_MANDATORY_FIELD", "BL1Error", 4,
						"BL1-000014 (Field {0} is mandatory.)", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "legalId" };
			throw new BillingException(B1ErrorMessages.MISSING_MISSING_MANDATORY_FIELD, errorParams);
		}
     	
     	if ("344570".equals(arg0.getLegalInvoiceNo())) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(Long.parseLong(arg0.getLegalInvoiceNo()));
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			
    		docInfo.setBillDate(null);
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setCycleNo(9);
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus("Activo");
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}

     	if ("344571".equals(arg0.getLegalInvoiceNo())) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(Long.parseLong(arg0.getLegalInvoiceNo()));
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/04/02";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		docInfo.setBillDate(date);
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setNullAll();
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus("Activo");
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}

     	if ("344572".equals(arg0.getLegalInvoiceNo()) ) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(Long.parseLong(arg0.getLegalInvoiceNo()));
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/04/02";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		docInfo.setBillDate(date);
    		CycleInfo c = new CycleInfo();
    		c.setCycleCode((short)8);
    		c.setCycleMonth((short)9);
    		docInfo.setCycleInfo(c);
    		
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setCycleNo(0);
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus("");
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}

     	
     	
     	if ("344573".equals(arg0.getLegalInvoiceNo())) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(Long.parseLong(arg0.getLegalInvoiceNo()));
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/04/02";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		docInfo.setBillDate(date);
    		CycleInfo c = new CycleInfo();
    		c.setCycleCode((short)8);
    		c.setCycleMonth((short)9);
    		docInfo.setCycleInfo(c);
    		
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setCycleNo(0);
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus(null);
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}
     	
     	if ("344566".equals(arg0.getLegalInvoiceNo()) ) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setDocId(Long.parseLong(arg0.getLegalInvoiceNo()));
    		docInfo.setDocType("Factura");
    		docInfo.setDocStatus((byte)1);
    		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/04/02";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		docInfo.setBillDate(date);
    		CycleInfo c = new CycleInfo();
    		c.setCycleCode((short)8);
    		c.setCycleMonth((short)9);
    		docInfo.setCycleInfo(c);
    		
    		CycleControlInfo aCycleControlInfo = new CycleControlInfo();
    		aCycleControlInfo.setCycleNo(9);
    		aCycleControlInfo.setCycleYear((short)17);
    		aCycleControlInfo.setCycleCode((short)8);
    		String startDate="2017/06/23";
    		String endDate="2017/07/23";
    		String runDate ="2017/06/10";
			Date edate = new Date();
			Date sdate = new Date();
			Date aRunDate = new Date();
			try {
				sdate = df.parse(startDate);
				edate = df.parse(endDate);
				aRunDate = df.parse(runDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
    		aCycleControlInfo.setStartDate(sdate);
    		aCycleControlInfo.setEndDate(edate);
    		aCycleControlInfo.setRunDate(aRunDate);
    		aCycleControlInfo.setCycleSeqRun(1);
    		aCycleControlInfo.setStatus("Activo");
    		aCycleControlInfo.setPeriodKey(17);
			docInfo.setCycleControlInfo(aCycleControlInfo );
			String PeriodCoverageEndDate = "2017/01/04";
			String PeriodCoverageStartDate = "2017/12/12";
			String DueDate="2017/15/06";
			Date aPeriodCoverageEndDate= new Date();
			Date aPeriodCoverageStartDate= new Date();
			Date aDueDate = new Date();
			try {
				aPeriodCoverageEndDate = df.parse(PeriodCoverageEndDate);
				aPeriodCoverageStartDate = df.parse(PeriodCoverageStartDate);
				aDueDate = df.parse(DueDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			docInfo.setPeriodCoverageEndDate(aPeriodCoverageEndDate);
			docInfo.setPeriodCoverageStartDate(aPeriodCoverageStartDate);
			docInfo.setProductionType("Tipo");
			docInfo.setAccountNo(345);
			docInfo.setCustomerNo(1234);
			docInfo.setBaNo(333345);
			docInfo.setDocumentFormat("Electronico");
			docInfo.setPrintingCategory("0");
			docInfo.setDocProduceInd((byte)0);
			docInfo.setAmountCurrency("123");
			docInfo.setDueDate(aDueDate);
			docInfo.setTotalAmount(234);
			docInfo.setInvoiceAmount(234);
			docInfo.setInvoiceTaxAmount(12);
			docInfo.setInvoiceNetAmount(214);
			docInfo.setLegalInvoiceNo("344566");
			docInfo.setBillFrequency((short)8);
			docInfo.setRebillActivity((byte)9);
			docInfo.setDocDemandType("No");
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
     	}

     	try {
			MessageHandlingServices.getInstance().addMessage("BL", "INVALID_DATA_NOT_FOUND_LEGAL_ID", "BL1Error", 4,
					"BL1-000140 (The legal id does not exist.)", "", Locale.getDefault());
		} catch (GeneralException e) {
			System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
		}
		String[] errorParams = { "legalInvoiceNo" };
		throw new BillingException(B1ErrorMessages.INVALID_DATA_NOT_FOUND_LEGAL_ID, errorParams);

     }
	

	@Override
	public DocListInfo getDocumentList(BaIdInfo arg0, DateLimitInfo arg1, PaginationInfo arg2)
			throws RemoteException, BillingException {
		
     	if (arg0 == null) {
			try {

				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_OBJECT_WAS_NOT_SET_BA_ID_INFO", "BL1Error", 4,
						"BL1-000033 (BA Id Info was not set and equals null.).", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "BaId" };
			throw new BillingException(B1ErrorMessages.MISSING_OBJECT_WAS_NOT_SET_BA_ID_INFO, errorParams);
		}
     	
     	if (arg2 == null ) {
			try {

				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_OBJECT_WAS_NOT_SET_PAGINATION_INFO", "BL1Error", 4,
						"BL1-000059 (Pagination Info was not set and equals null.)", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "paginationInfo" };
			throw new BillingException(B1ErrorMessages.MISSING_OBJECT_WAS_NOT_SET_PAGINATION_INFO, errorParams);
		}

     	if (arg0.getBaId() == -1061109568) {
			try {

				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_MISSING_MANDATORY_FIELD", "BL1Error", 4,
						"BL1-000014 (Field {0} is mandatory.)", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "baId" };
			throw new BillingException(B1ErrorMessages.MISSING_MISSING_MANDATORY_FIELD, errorParams);
		}
     	
     	if (arg2.getPageSize() == -1061109568) {
			try {

				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_MISSING_MANDATORY_FIELD", "BL1Error", 4,
						"BL1-000014 (Field {0} is mandatory.)", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "pageSize" };
			throw new BillingException(B1ErrorMessages.MISSING_MISSING_MANDATORY_FIELD, errorParams);
		}
     	
     	if (arg2.getPageNumber() == -1061109568) {
			try {

				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_MISSING_MANDATORY_FIELD", "BL1Error", 4,
						"BL1-000014 (Field {0} is mandatory.)", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "pageNumber" };
			throw new BillingException(B1ErrorMessages.MISSING_MISSING_MANDATORY_FIELD, errorParams);
		}
		
    	if (arg2.getPageNumber() == -1061109568) {
			try {

				MessageHandlingServices.getInstance().addMessage("BL", "MISSING_MISSING_MANDATORY_FIELD", "BL1Error", 4,
						"BL1-000047 (Doc Id Info was not set and equals null.)", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "pageNumber" };
			throw new BillingException(B1ErrorMessages.MISSING_MISSING_MANDATORY_FIELD, errorParams);
		}

    	if (arg0.getBaId() == 789) {
    		DocInfoTEF docInfo = new DocInfoTEF();
    		docInfo.setInvoiceNetAmount(1);
    		docInfo.setInvoiceTaxAmount(1);
    		docInfo.setDocType("doc type:mock document list");
    		docInfo.setBaNo(arg0.getBaId());
    		
    		DocInfo pos0 = new DocInfo(docInfo);

    		DocInfo[] docInfos = new DocInfo[1];
    		docInfos[0] = pos0;
    		
    		PaginationInfoTEF paginationAux = new PaginationInfoTEF();
    		paginationAux.setPageNumber(1);
    		paginationAux.setPageSize(1);
    		paginationAux.setNumberOfRows(1);
    		
    		PaginationInfo p = new PaginationInfo(paginationAux);
    		
    		DocListInfoTEF list  = new DocListInfoTEF();
    		list.setDocList(docInfos);
    		list.setPaginationInfo(p);
    		
    		DocListInfo resp = new DocListInfo(list); 
    		return resp;
		} 
		try {

			MessageHandlingServices.getInstance().addMessage("BL", "INVALID_DATA_NOT_FOUND_BA_ID", "BL1Error", 4,
					"BL1-000139 (The BA id does not exist.)", "", Locale.getDefault());
		} catch (GeneralException e) {
			System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
		}
		String[] errorParams = { "pageNumber" };
		throw new BillingException(B1ErrorMessages.INVALID_DATA_NOT_FOUND_BA_ID, errorParams);
		
		
	}

	@Override
	public DocStatDetailsInfo getDocumentStatements(BaIdInfo arg0, DocIdInfo arg1)
			throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinancialActivityListInfo getFinancialActivities(DocIdInfo arg0, PaginationInfo arg1)
			throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaxItemListInfo getStatementTaxSummary(StatementIdInfo arg0, PaginationInfo arg1)
			throws RemoteException, BillingException {
		// TODO Auto-generated method stub
		return null;
	}

}
