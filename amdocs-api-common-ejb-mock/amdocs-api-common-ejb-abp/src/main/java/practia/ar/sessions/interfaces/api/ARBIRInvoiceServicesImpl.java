package practia.ar.sessions.interfaces.api;

import static amdocs.mock.ejb.Message.ADD_MESSAGE_ERROR;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.ejb.CreateException;

import amdocs.acmarch.exceptions.ACMArchErrorMessages;
import amdocs.ar.datalayer.datatypes.AccountIdInfoDt;
import amdocs.ar.datalayer.datatypes.BillingArrangementIdInfoDt;
import amdocs.ar.datalayer.datatypes.CreditAllocationDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.CreditIdInfoDt;
import amdocs.ar.datalayer.datatypes.DirectDebitInvoiceListItemScreenDt;
import amdocs.ar.datalayer.datatypes.InvoiceAccountIdInfoDt;
import amdocs.ar.datalayer.datatypes.InvoiceAllocationListItemScreenDt;
import amdocs.ar.datalayer.datatypes.InvoiceIdInfoDt;
import amdocs.ar.datalayer.datatypes.InvoiceListItemBriefScreenDt;
import amdocs.ar.datalayer.datatypes.InvoiceListItemScreenDt;
import amdocs.ar.datalayer.datatypes.InvoiceSearchResultsScreenDt;
import amdocs.ar.datalayer.datatypes.InvoiceSearchScreenDt;
import amdocs.ar.datalayer.datatypes.InvoiceStatusInfoDt;
import amdocs.ar.datalayer.datatypes.InvoiceTypeInfoDt;
import amdocs.ar.datalayer.datatypes.LockInfoDt;
import amdocs.ar.datalayer.datatypes.PaginationInfo;
import amdocs.ar.datalayer.datatypes.PaginationResultInfo;
import amdocs.ar.general.error.ARErrorMessages;
import amdocs.ar.general.error.ApplicationException;
import amdocs.ar.sessions.interfaces.api.ARBIRInvoiceServices;
import amdocs.ar.sessions.interfaces.home.ARBIRInvoiceServicesHome;
import amdocs.jutil.messageHandling.MessageHandlingServices;
import amdocs.jutil.messageHandling.exceptions.GeneralException;
import amdocs.mock.ejb.APIEJBMock;

public class ARBIRInvoiceServicesImpl extends APIEJBMock implements ARBIRInvoiceServices, ARBIRInvoiceServicesHome {

	private static final long serialVersionUID = 1L;

	@Override
	public ARBIRInvoiceServicesImpl create() throws CreateException, RemoteException {
		return new ARBIRInvoiceServicesImpl();
	}

	public DirectDebitInvoiceListItemScreenDt[] searchInvoicesByAccountId(AccountIdInfoDt paramAccountIdInfoDt,
			InvoiceStatusInfoDt paramInvoiceStatusInfoDt) throws RemoteException, ApplicationException {
		return null;
	}

	public void createInvoiceCreditAllocation(
			CreditAllocationDetailsScreenDt[] paramArrayOfCreditAllocationDetailsScreenDt,
			InvoiceIdInfoDt paramInvoiceIdInfoDt, CreditIdInfoDt paramCreditIdInfoDt, LockInfoDt paramLockInfoDt)
			throws RemoteException, ApplicationException {
	}

	public InvoiceSearchResultsScreenDt searchInvoices(InvoiceSearchScreenDt paramInvoiceSearchScreenDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		
		if (paramInvoiceSearchScreenDt != null && paramInvoiceSearchScreenDt.getAccountId() == 114586745 ) {
			try {
				MessageHandlingServices.getInstance().addMessage("AR", "CONNETION_FACTORY_MAY_NOT_HAVE_TRANSACTIONS", "AR1Error",
						3, "(JF1-000193) Es posible que la conexión de fábrica no posea transacciones, por lo que no se puede recuperar una conexión actualizada", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "accountId" , "3" };
			throw new ApplicationException(ACMArchErrorMessages.JF1_CONNETION_FACTORY_MAY_NOT_HAVE_TRANSACTIONS, errorParams);
		}
		
		if (paramInvoiceSearchScreenDt != null && paramInvoiceSearchScreenDt.getAccountId() == 114586744 ) {
			try {
				MessageHandlingServices.getInstance().addMessage("AR", "FW_GET_UPDATE_CONNECTION_FAILED_NO_ACTIVE_TRX", "AR1Error",
						3, "JF1-000282) No se pudo recuperar la actualización de la conexión debido a que no existe una transacción activa.", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "accountId" , "3" };
			throw new ApplicationException(ACMArchErrorMessages.JF1_FW_GET_UPDATE_CONNECTION_FAILED_NO_ACTIVE_TRX, errorParams);
		}
		
		if(paramInvoiceSearchScreenDt != null && paramInvoiceSearchScreenDt.getAccountId() == 114586734 ) {
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setResultsCount(9);
			aPaginationResults.setTotalCount(1);
			aPaginationResults.setRowCount(4);
			aPaginationResults.setMoreRows((byte)0);
			InvoiceSearchResultsScreenDt response = new InvoiceSearchResultsScreenDt();

			InvoiceListItemScreenDt invoiceListItemScreenDt = new InvoiceListItemScreenDt();
			invoiceListItemScreenDt.setAmount(56.89);
			invoiceListItemScreenDt.setTaxAmount(15);
			invoiceListItemScreenDt.setBillingArrangementId(445);
			invoiceListItemScreenDt.setCmBillingArrangementId("445");
			invoiceListItemScreenDt.setCoveredAmount(8);
			invoiceListItemScreenDt.setRestrictionAmount(0);
			
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/06/07";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			invoiceListItemScreenDt.setDueDate(date);
			invoiceListItemScreenDt.setInvoiceId(998);
			invoiceListItemScreenDt.setInvoiceStatus("pagado");
			invoiceListItemScreenDt.setBillingArrangementId(445);
			invoiceListItemScreenDt.setCmBillingArrangementId("445");
			invoiceListItemScreenDt.setBillingInvoiceNumber("998");
			invoiceListItemScreenDt.setInvoiceBalance(176.67);
			invoiceListItemScreenDt.setNetAmtAvailableForCredit(80);
			invoiceListItemScreenDt.setGrossAmtAvailableForCredit(9.0);
			invoiceListItemScreenDt.setCreditNetAmount(176.67);
			invoiceListItemScreenDt.setDiscountNetAmount(0);
			invoiceListItemScreenDt.setDiscountNetAmount(0);
			invoiceListItemScreenDt.setCurrency("ARS");
			invoiceListItemScreenDt.setInvoiceType("B");
			invoiceListItemScreenDt.setDiscountNetAmount(0);
			invoiceListItemScreenDt.setDisputeTaxAmount(0);
			invoiceListItemScreenDt.setOriginalBalanceAmount(0);
			String L9IssueDate="2017/08/07";
			Date aL9IssueDate = new Date();
			try {
				aL9IssueDate = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			invoiceListItemScreenDt.setL9IssueDate(aL9IssueDate);
			invoiceListItemScreenDt.setL3OrderID("45");
			invoiceListItemScreenDt.setL9Cae("0");
			invoiceListItemScreenDt.setL9RechargeId("77");
			String L9RechargeDate="2017/08/07";
			Date aL9RechargeDate = new Date();
			try {
				aL9RechargeDate = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			invoiceListItemScreenDt.setL9RechargeDate(aL9RechargeDate);
			LockInfoDt aLockInfo = new LockInfoDt();
			aLockInfo.setAccountTimestamp(aL9RechargeDate.getTime());
			InvoiceListItemScreenDt[] aInvoiceListItems = new InvoiceListItemScreenDt[1];
			aInvoiceListItems[0] = invoiceListItemScreenDt;
			response.setLockInfo(aLockInfo);
			response.setInvoiceListItems(aInvoiceListItems);
			response.setPaginationResults(aPaginationResults);
			return response;
		}
		
		if(paramInvoiceSearchScreenDt != null && paramInvoiceSearchScreenDt.getAccountId() == 114586743 ) {
			InvoiceSearchResultsScreenDt response = new InvoiceSearchResultsScreenDt();
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setResultsCount(0);
			aPaginationResults.setTotalCount(0);
			aPaginationResults.setRowCount(0);
			aPaginationResults.setMoreRows((byte) 0);
			response.setPaginationResults(aPaginationResults);
			InvoiceListItemScreenDt invoiceListItemScreenDt = new InvoiceListItemScreenDt();
			invoiceListItemScreenDt.setAmount(0);
			invoiceListItemScreenDt.setInvoiceId(0);
			invoiceListItemScreenDt.setTaxAmount(0);
			invoiceListItemScreenDt.setCoveredAmount(0);
			
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2000/01/01";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			invoiceListItemScreenDt.setDueDate(date);
			
			InvoiceListItemScreenDt[] aInvoiceListItems = new InvoiceListItemScreenDt[] { invoiceListItemScreenDt };
			response.setInvoiceListItems(aInvoiceListItems);
			response.setLockInfo(null);
			return response;
		}
		
		if(paramInvoiceSearchScreenDt != null && paramInvoiceSearchScreenDt.getAccountId() == 114586746 ) {
			InvoiceSearchResultsScreenDt response = new InvoiceSearchResultsScreenDt();
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setNullAll();
			aPaginationResults.setResultsCount(0);
			aPaginationResults.setTotalCount(0);
			aPaginationResults.setMoreRows((byte) 0);
			response.setPaginationResults(aPaginationResults);
			InvoiceListItemScreenDt invoiceListItemScreenDt = new InvoiceListItemScreenDt();
			invoiceListItemScreenDt.setAmount(0);
			invoiceListItemScreenDt.setInvoiceId(0);
			invoiceListItemScreenDt.setTaxAmount(0);
			invoiceListItemScreenDt.setCoveredAmount(0);
			
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2000/01/01";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			invoiceListItemScreenDt.setDueDate(date);
			
			InvoiceListItemScreenDt[] aInvoiceListItems = new InvoiceListItemScreenDt[] { invoiceListItemScreenDt };
			response.setInvoiceListItems(aInvoiceListItems);
			response.setLockInfo(null);
			return response;
		}
		
		if(paramInvoiceSearchScreenDt != null && paramInvoiceSearchScreenDt.getAccountId() == 114586747 ) {
			InvoiceSearchResultsScreenDt response = new InvoiceSearchResultsScreenDt();
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setNullAll();
			aPaginationResults.setResultsCount(0);
			aPaginationResults.setTotalCount(0);
			aPaginationResults.setMoreRows((byte) 0);
			response.setPaginationResults(aPaginationResults);
			InvoiceListItemScreenDt invoiceListItemScreenDt = new InvoiceListItemScreenDt();
			invoiceListItemScreenDt.setAmount(0);
			invoiceListItemScreenDt.setInvoiceId(0);
			invoiceListItemScreenDt.setTaxAmount(0);
			invoiceListItemScreenDt.setCoveredAmount(0);
			invoiceListItemScreenDt.setDueDate(null);
			
			InvoiceListItemScreenDt[] aInvoiceListItems = new InvoiceListItemScreenDt[] { invoiceListItemScreenDt };
			response.setInvoiceListItems(aInvoiceListItems);
			response.setLockInfo(null);
			return response;
		}
		
		if(paramInvoiceSearchScreenDt != null && paramInvoiceSearchScreenDt.getAccountId() == 114586748 ) {
			InvoiceSearchResultsScreenDt response = new InvoiceSearchResultsScreenDt();
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setNullAll();
			aPaginationResults.setResultsCount(0);
			aPaginationResults.setTotalCount(0);
			aPaginationResults.setMoreRows((byte) 0);
			response.setPaginationResults(aPaginationResults);
			InvoiceListItemScreenDt invoiceListItemScreenDt = new InvoiceListItemScreenDt();
			invoiceListItemScreenDt.setAmount(0);
			invoiceListItemScreenDt.setInvoiceId(0);
			invoiceListItemScreenDt.setTaxAmount(0);
			invoiceListItemScreenDt.setCoveredAmount(0);
			invoiceListItemScreenDt.setCurrency("");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2000/01/01";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			invoiceListItemScreenDt.setDueDate(date);
			
			InvoiceListItemScreenDt[] aInvoiceListItems = new InvoiceListItemScreenDt[] { invoiceListItemScreenDt };
			response.setInvoiceListItems(aInvoiceListItems);
			response.setLockInfo(null);
			return response;
		}

		
		try {
			MessageHandlingServices.getInstance().addMessage("AR", "CLARIFY_API_ENTITY_KEY_NOT_FOUND_EXCEPTION", "AR1Error",
					3, "(AR1-000099) No data found.", "", Locale.getDefault());
		} catch (GeneralException e) {
			System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
		}
		String[] errorParams = { "accountId" , "3" };
		throw new ApplicationException(ARErrorMessages.CLARIFY_API_ENTITY_KEY_NOT_FOUND_EXCEPTION, errorParams);
	}

	/**
	 * @deprecated
	 */
	public InvoiceAllocationListItemScreenDt[] searchCredits(InvoiceIdInfoDt paramInvoiceIdInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public InvoiceListItemBriefScreenDt[] searchCreditNoteBriefByAccountIdAndStatusAndType(
			AccountIdInfoDt paramAccountIdInfoDt, BillingArrangementIdInfoDt paramBillingArrangementIdInfoDt,
			InvoiceStatusInfoDt[] paramArrayOfInvoiceStatusInfoDt) throws RemoteException, ApplicationException {
		return null;
	}

	public InvoiceListItemBriefScreenDt[] searchInvoiceBriefByAccountIdAndStatusAndType(
			AccountIdInfoDt paramAccountIdInfoDt, BillingArrangementIdInfoDt paramBillingArrangementIdInfoDt,
			InvoiceStatusInfoDt[] paramArrayOfInvoiceStatusInfoDt, InvoiceTypeInfoDt[] paramArrayOfInvoiceTypeInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public InvoiceAllocationListItemScreenDt[] searchCreditsByAccount(
			InvoiceAccountIdInfoDt paramInvoiceAccountIdInfoDt) throws RemoteException, ApplicationException {
		return null;
	}
}
