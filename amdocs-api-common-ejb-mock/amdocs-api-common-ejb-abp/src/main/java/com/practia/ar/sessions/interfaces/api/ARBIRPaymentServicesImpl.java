package com.practia.ar.sessions.interfaces.api;

import static amdocs.mock.ejb.Message.ADD_MESSAGE_ERROR;
import amdocs.acmarch.exceptions.ACMArchErrorMessages;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.ejb.CreateException;

import amdocs.ar.datalayer.datatypes.AR9CashierBalanceCheckInputDt;
import amdocs.ar.datalayer.datatypes.AR9CashierBalanceCheckOutputDt;
import amdocs.ar.datalayer.datatypes.AR9SearchMixedPaymentsInputDt;
import amdocs.ar.datalayer.datatypes.AR9SearchMixedPaymentsOutputDt;
import amdocs.ar.datalayer.datatypes.AR9SearchPaymentsInputDt;
import amdocs.ar.datalayer.datatypes.AccountIdInfoDt;
import amdocs.ar.datalayer.datatypes.AccountListItemScreenDt;
import amdocs.ar.datalayer.datatypes.AccountLockInfoDt;
import amdocs.ar.datalayer.datatypes.AmountInfoDt;
import amdocs.ar.datalayer.datatypes.CreditIdInfoDt;
import amdocs.ar.datalayer.datatypes.DirectDebitDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.DirectDebitListItemScreenDt;
import amdocs.ar.datalayer.datatypes.DirectDebitSearchResultsScreenDt;
import amdocs.ar.datalayer.datatypes.DirectDebitSearchScreenDt;
import amdocs.ar.datalayer.datatypes.DirectDebitUpdateDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.DirectDebitVoucherInfoDt;
import amdocs.ar.datalayer.datatypes.FundsTransferCreditIdsInfoDt;
import amdocs.ar.datalayer.datatypes.LockInfoDt;
import amdocs.ar.datalayer.datatypes.PaginationInfo;
import amdocs.ar.datalayer.datatypes.PaginationResultInfo;
import amdocs.ar.datalayer.datatypes.PaymentAccountIdInfoDt;
import amdocs.ar.datalayer.datatypes.PaymentApplicationItemScreenDt;
import amdocs.ar.datalayer.datatypes.PaymentBackoutDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.PaymentConfirmationDt;
import amdocs.ar.datalayer.datatypes.PaymentDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.PaymentFundsTransferApplyItemScreenDt;
import amdocs.ar.datalayer.datatypes.PaymentHistoryListItemScreenDt;
import amdocs.ar.datalayer.datatypes.PaymentIdInfoDt;
import amdocs.ar.datalayer.datatypes.PaymentListItemScreenDt;
import amdocs.ar.datalayer.datatypes.PaymentSearchResultsScreenDt;
import amdocs.ar.datalayer.datatypes.PaymentSearchScreenDt;
import amdocs.ar.datalayer.datatypes.PaymentValObjectDt;
import amdocs.ar.general.error.ARErrorMessages;
import amdocs.ar.general.error.ApplicationException;
import amdocs.ar.sessions.interfaces.api.ARBIRPaymentServices;
import amdocs.ar.sessions.interfaces.home.ARBIRPaymentServicesHome;
import amdocs.jutil.messageHandling.MessageHandlingServices;
import amdocs.jutil.messageHandling.exceptions.GeneralException;
import amdocs.mock.ejb.APIEJBMock;

public class ARBIRPaymentServicesImpl extends APIEJBMock implements ARBIRPaymentServices, ARBIRPaymentServicesHome {

	private static final long serialVersionUID = 5964128376129829145L;

	public FundsTransferCreditIdsInfoDt transferFunds(AccountIdInfoDt paramAccountIdInfoDt,
			AmountInfoDt paramAmountInfoDt, PaymentIdInfoDt paramPaymentIdInfoDt, CreditIdInfoDt paramCreditIdInfoDt,
			PaymentFundsTransferApplyItemScreenDt[] paramArrayOfPaymentFundsTransferApplyItemScreenDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public DirectDebitSearchResultsScreenDt searchDirectDebits(DirectDebitSearchScreenDt paramDirectDebitSearchScreenDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		return null;
	}

	/**
	 * @deprecated
	 */
	public PaymentValObjectDt findPaymentByPaymentId(PaymentIdInfoDt paramPaymentIdInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	/**
	 * @deprecated
	 */
	public void updateDirectDebit(AccountListItemScreenDt paramAccountListItemScreenDt,
			DirectDebitUpdateDetailsScreenDt paramDirectDebitUpdateDetailsScreenDt,
			DirectDebitListItemScreenDt paramDirectDebitListItemScreenDt) throws RemoteException, ApplicationException {

	}

	public void updateDirectDebitDetails(AccountLockInfoDt paramAccountLockInfoDt,
			DirectDebitUpdateDetailsScreenDt paramDirectDebitUpdateDetailsScreenDt,
			DirectDebitVoucherInfoDt paramDirectDebitVoucherInfoDt) throws RemoteException, ApplicationException {
	}

	public void updateDirectDebitStatus(AccountLockInfoDt paramAccountLockInfoDt,
			DirectDebitUpdateDetailsScreenDt paramDirectDebitUpdateDetailsScreenDt,
			DirectDebitVoucherInfoDt paramDirectDebitVoucherInfoDt) throws RemoteException, ApplicationException {
	}

	public void reissueDirectDebit(AccountLockInfoDt paramAccountLockInfoDt,
			DirectDebitUpdateDetailsScreenDt paramDirectDebitUpdateDetailsScreenDt,
			DirectDebitVoucherInfoDt paramDirectDebitVoucherInfoDt) throws RemoteException, ApplicationException {
	}

	public PaymentConfirmationDt createPayment(PaymentDetailsScreenDt paramPaymentDetailsScreenDt,
			PaymentApplicationItemScreenDt[] paramArrayOfPaymentApplicationItemScreenDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public void createDepositPayment(PaymentDetailsScreenDt paramPaymentDetailsScreenDt,
			PaymentApplicationItemScreenDt[] paramArrayOfPaymentApplicationItemScreenDt)
			throws RemoteException, ApplicationException {
	}

	public PaymentSearchResultsScreenDt searchPayments(PaymentSearchScreenDt paramPaymentSearchScreenDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		
		if (paramPaymentSearchScreenDt != null && paramPaymentSearchScreenDt.getPaymentMethod().length() > 3) {
			try {
				MessageHandlingServices.getInstance().addMessage("AR", "GENERIC_FIELD_EXCEEDS_MAX_LENGTH", "AR1Error",
						4, "(AR1-000201) Error de las reglas de validacion: El campo {0} excede la longitud maxima de {1}.", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "paymentMethod" , "3" };
			throw new ApplicationException(ARErrorMessages.GENERIC_FIELD_EXCEEDS_MAX_LENGTH, errorParams);
		}
		
		if (paramPaymentSearchScreenDt != null && paramPaymentSearchScreenDt.getAccountId() == 345) {
			try {
				MessageHandlingServices.getInstance().addMessage("AR", "CONNETION_FACTORY_MAY_NOT_HAVE_TRANSACTIONS", "AR1Error",
						3, "(JF1-000193) Es posible que la conexión de fábrica no posea transacciones, por lo que no se puede recuperar una conexión actualizada.", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "paymentMethod" , "3" };
			throw new ApplicationException(ACMArchErrorMessages.JF1_CONNETION_FACTORY_MAY_NOT_HAVE_TRANSACTIONS, errorParams);
		}
		
		if (paramPaymentSearchScreenDt != null && paramPaymentSearchScreenDt.getAccountId() == 346) {
			try {
				MessageHandlingServices.getInstance().addMessage("AR", "FW_GET_UPDATE_CONNECTION_FAILED_NO_ACTIVE_TRX", "AR1Error",
						3, "(JF1-000282) No se pudo recuperar la actualización de la conexión debido a que no existe una transacción activa.", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "paymentMethod" , "3" };
			throw new ApplicationException(ACMArchErrorMessages.JF1_FW_GET_UPDATE_CONNECTION_FAILED_NO_ACTIVE_TRX, errorParams);
		}
		
		if (paramPaymentSearchScreenDt != null &&
				paramPaymentSearchScreenDt.getAccountId() == 1509 ) {
			PaymentSearchResultsScreenDt response = new PaymentSearchResultsScreenDt();
			response.setNullAll();
			PaymentListItemScreenDt aPaymentListItemScreenDt = new PaymentListItemScreenDt();
			aPaymentListItemScreenDt.setNullAll();
			aPaymentListItemScreenDt.setAccountId(paramPaymentSearchScreenDt.getAccountId());
			aPaymentListItemScreenDt.setPaymentMethod("");
			PaymentListItemScreenDt[] aPaymentListItems = new PaymentListItemScreenDt[1];
			aPaymentListItems[0] = aPaymentListItemScreenDt;
			response.setPaymentListItems(aPaymentListItems );
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setNullAll();
			aPaginationResults.setMoreRows((short)0);
			aPaginationResults.setRowCount(1);
			aPaginationResults.setTotalCount(1);
			aPaginationResults.setResultsCount(1);
			response.setPaginationResults(aPaginationResults );
			return response;	
		}

		if (paramPaymentSearchScreenDt != null &&
				paramPaymentSearchScreenDt.getAccountId() == 1510  ) {
			PaymentSearchResultsScreenDt response = new PaymentSearchResultsScreenDt();
			response.setNullAll();
			PaymentListItemScreenDt aPaymentListItemScreenDt = new PaymentListItemScreenDt();
			aPaymentListItemScreenDt.setNullAll();
			aPaymentListItemScreenDt.setAccountId(paramPaymentSearchScreenDt.getAccountId());
			aPaymentListItemScreenDt.setPaymentId(0L);
			PaymentListItemScreenDt[] aPaymentListItems = new PaymentListItemScreenDt[1];
			aPaymentListItems[0] = aPaymentListItemScreenDt;
			System.out.println(aPaymentListItems[0].toString());
			response.setPaymentListItems(aPaymentListItems);
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setMoreRows((short)0);
			aPaginationResults.setRowCount(1);
			aPaginationResults.setTotalCount(1);
			aPaginationResults.setResultsCount(1);
			response.setPaginationResults(aPaginationResults );
			return response;	
		}

		if (paramPaymentSearchScreenDt != null &&
				paramPaymentSearchScreenDt.getAccountId() == 1511  ) {
			PaymentSearchResultsScreenDt response = new PaymentSearchResultsScreenDt();
			response.setNullAll();
			PaymentListItemScreenDt aPaymentListItemScreenDt = new PaymentListItemScreenDt();
			aPaymentListItemScreenDt.setNullAll();
			aPaymentListItemScreenDt.setAccountId(paramPaymentSearchScreenDt.getAccountId());
			aPaymentListItemScreenDt.setDepositDate(null);
			PaymentListItemScreenDt[] aPaymentListItems = new PaymentListItemScreenDt[1];
			aPaymentListItems[0] = aPaymentListItemScreenDt;
			response.setPaymentListItems(aPaymentListItems );
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setNullAll();
			aPaginationResults.setMoreRows((short)0);
			aPaginationResults.setRowCount(1);
			aPaginationResults.setTotalCount(1);
			aPaginationResults.setResultsCount(1);
			response.setPaginationResults(aPaginationResults );
			return response;	
		}

		if (paramPaymentSearchScreenDt != null &&
				paramPaymentSearchScreenDt.getAccountId() == 1512) {
			PaymentSearchResultsScreenDt response = new PaymentSearchResultsScreenDt();
			response.setNullAll();
			PaymentListItemScreenDt aPaymentListItemScreenDt = new PaymentListItemScreenDt();
			aPaymentListItemScreenDt.setNullAll();
			aPaymentListItemScreenDt.setAccountId(paramPaymentSearchScreenDt.getAccountId());
			amdocs.ar.datalayer.datatypes.PaymentDetailsCustDt cust = 
					new amdocs.ar.datalayer.datatypes.PaymentDetailsCustDt();
			cust.setNullAll();
			aPaymentListItemScreenDt.setPaymentDetailsCustDt(cust);
			PaymentListItemScreenDt[] aPaymentListItems = new PaymentListItemScreenDt[1];
			aPaymentListItems[0] = aPaymentListItemScreenDt;
			response.setPaymentListItems(aPaymentListItems );
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setNullAll();
			aPaginationResults.setMoreRows((short)0);
			aPaginationResults.setRowCount(1);
			aPaginationResults.setTotalCount(1);
			aPaginationResults.setResultsCount(1);
			response.setPaginationResults(aPaginationResults );
			return response;	
		}
		
		
		if (paramPaymentSearchScreenDt != null &&
				paramPaymentSearchScreenDt.getAccountId() == 1513) {
			PaymentSearchResultsScreenDt response = new PaymentSearchResultsScreenDt();
			response.setNullAll();
			PaymentListItemScreenDt aPaymentListItemScreenDt = new PaymentListItemScreenDt();
			aPaymentListItemScreenDt.setNullAll();
			aPaymentListItemScreenDt.setAccountId(paramPaymentSearchScreenDt.getAccountId());
			aPaymentListItemScreenDt.setDepositDate(null);
			PaymentListItemScreenDt[] aPaymentListItems = new PaymentListItemScreenDt[1];
			aPaymentListItems[0] = aPaymentListItemScreenDt;
			response.setPaymentListItems(aPaymentListItems );
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setNullAll();
			aPaginationResults.setMoreRows((short)0);
			aPaginationResults.setRowCount(1);
			aPaginationResults.setTotalCount(1);
			aPaginationResults.setResultsCount(1);
			response.setPaginationResults(aPaginationResults );
			return response;	
		}
		
		Date from = new GregorianCalendar(2017, 7, 15, 0,0).getTime();
		Date to = new GregorianCalendar(2017, 11, 15, 0,0).getTime();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String _from = formatter.format(from);
        String _to = formatter.format(to);
        System.out.println(from.toString());
        System.out.println(to.toString());
        System.out.println(paramPaymentSearchScreenDt.getFromDepositDate());
        System.out.println(paramPaymentSearchScreenDt.getToDepositDate());
        
        String fromDesposit = formatter.format(paramPaymentSearchScreenDt.getFromDepositDate());
        String toDesposit = formatter.format(paramPaymentSearchScreenDt.getToDepositDate());

		if (paramPaymentSearchScreenDt != null &&
				paramPaymentSearchScreenDt.getAccountId() == 1508 &&
				(from.compareTo(paramPaymentSearchScreenDt.getFromDepositDate()) == 0 && to.compareTo(paramPaymentSearchScreenDt.getToDepositDate())== 0)) {
			PaymentSearchResultsScreenDt response = new PaymentSearchResultsScreenDt();
			response.setNullAll();
			PaymentListItemScreenDt aPaymentListItemScreenDt = new PaymentListItemScreenDt();
			aPaymentListItemScreenDt.setNullAll();
			aPaymentListItemScreenDt.setAccountId(paramPaymentSearchScreenDt.getAccountId());
			aPaymentListItemScreenDt.setPaymentId(1109568l);
			aPaymentListItemScreenDt.setDepositDate(new Date());
			aPaymentListItemScreenDt.setPaymentMethod(paramPaymentSearchScreenDt.getPaymentMethod());
			aPaymentListItemScreenDt.setOriginalAmount(8577.50);
			aPaymentListItemScreenDt.setCurrency("ARS");
			aPaymentListItemScreenDt.setCreditCardNumber(null);
			PaymentListItemScreenDt[] aPaymentListItems = new PaymentListItemScreenDt[1];
			aPaymentListItems[0] = aPaymentListItemScreenDt;
			response.setPaymentListItems(aPaymentListItems );
			PaginationResultInfo aPaginationResults = new PaginationResultInfo();
			aPaginationResults.setNullAll();
			aPaginationResults.setMoreRows((short)0);
			aPaginationResults.setRowCount(1);
			aPaginationResults.setTotalCount(1);
			aPaginationResults.setResultsCount(1);
			response.setPaginationResults(aPaginationResults );
			return response;
			
		}
		System.out.println("dummy object");
		return  new PaymentSearchResultsScreenDt();
	}

	/**
	 * @deprecated
	 */
	public PaymentHistoryListItemScreenDt[] searchPaymentHistory(PaymentIdInfoDt paramPaymentIdInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public void backoutPayment(PaymentIdInfoDt paramPaymentIdInfoDt,
			PaymentBackoutDetailsScreenDt paramPaymentBackoutDetailsScreenDt,
			AccountLockInfoDt[] paramArrayOfAccountLockInfoDt) throws RemoteException, ApplicationException {
	}

	public void createDirectDebit(AccountIdInfoDt paramAccountIdInfoDt,
			DirectDebitDetailsScreenDt paramDirectDebitDetailsScreenDt, LockInfoDt paramLockInfoDt)
			throws RemoteException, ApplicationException {
	}

	public PaymentHistoryListItemScreenDt[] searchPaymentHistory(PaymentIdInfoDt paramPaymentIdInfoDt,
			AccountIdInfoDt paramAccountIdInfoDt) throws RemoteException, ApplicationException {
		return null;
	}

	public PaymentValObjectDt findPaymentByPaymentAndAccountId(PaymentAccountIdInfoDt paramPaymentAccountIdInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public PaymentSearchResultsScreenDt l3SearchPaymentsByAccountMode(PaymentSearchScreenDt paramPaymentSearchScreenDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		return null;
	}

	public void l9BackoutByL9ExtPymId(PaymentIdInfoDt paramPaymentIdInfoDt,
			PaymentBackoutDetailsScreenDt paramPaymentBackoutDetailsScreenDt, AccountLockInfoDt paramAccountLockInfoDt)
			throws RemoteException, ApplicationException {
	}

	public void backoutByL9VoucherNumber(PaymentIdInfoDt paramPaymentIdInfoDt,
			PaymentBackoutDetailsScreenDt paramPaymentBackoutDetailsScreenDt, AccountLockInfoDt paramAccountLockInfoDt)
			throws RemoteException, ApplicationException {
	}

	public PaymentSearchResultsScreenDt l9SearchPaymentsByOrderIdAndEntityId(
			AR9SearchPaymentsInputDt paramAR9SearchPaymentsInputDt) throws RemoteException, ApplicationException {
		return null;
	}

	public AR9SearchMixedPaymentsOutputDt[] l9SearchMixedPaymentsByOrderId(
			AR9SearchMixedPaymentsInputDt paramAR9SearchMixedPaymentsInputDt)
			throws RemoteException, ApplicationException {
		return null;
	}
	@Override
	public ARBIRPaymentServicesImpl create() throws CreateException,
			RemoteException {
		return new ARBIRPaymentServicesImpl();
	}
	
	public AR9CashierBalanceCheckOutputDt checkCashierBalanceReport(
			AR9CashierBalanceCheckInputDt paramAR9CashierBalanceCheckInputDt)
			throws RemoteException, ApplicationException {
		return null;
	}

}