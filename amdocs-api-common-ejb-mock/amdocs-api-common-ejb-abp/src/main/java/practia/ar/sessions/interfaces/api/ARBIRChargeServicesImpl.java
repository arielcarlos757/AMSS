package practia.ar.sessions.interfaces.api;

import java.rmi.RemoteException;

import javax.ejb.CreateException;

import amdocs.ar.datalayer.datatypes.AR3AccountInfoDt;
import amdocs.ar.datalayer.datatypes.AR3CreateChargeRequestDt;
import amdocs.ar.datalayer.datatypes.AR3DepositListDt;
import amdocs.ar.datalayer.datatypes.AR3ImmedChargePaymentResultDt;
import amdocs.ar.datalayer.datatypes.AR3PaymentRequestDt;
import amdocs.ar.datalayer.datatypes.AR3PaymentsFeedbackDt;
import amdocs.ar.datalayer.datatypes.AR9MixedPaymentResultDt;
import amdocs.ar.datalayer.datatypes.CmChargesSearchResultsDt;
import amdocs.ar.datalayer.datatypes.DebitSearchResultsScreenDt;
import amdocs.ar.datalayer.datatypes.DebitSearchScreenDt;
import amdocs.ar.datalayer.datatypes.InvoiceAccountIdInfoDt;
import amdocs.ar.datalayer.datatypes.InvoiceIdInfoDt;
import amdocs.ar.datalayer.datatypes.InvoiceLevelCreditDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.PaginationInfo;
import amdocs.ar.general.error.ApplicationException;
import amdocs.ar.sessions.interfaces.api.ARBIRChargeServices;
import amdocs.ar.sessions.interfaces.home.ARBIRChargeServicesHome;
import amdocs.mock.ejb.APIEJBMock;

public class ARBIRChargeServicesImpl extends APIEJBMock implements ARBIRChargeServices, ARBIRChargeServicesHome {

	private static final long serialVersionUID = 1L;

	@Override
	public ARBIRChargeServicesImpl create() throws CreateException, RemoteException {
		return new ARBIRChargeServicesImpl();
	}

	public DebitSearchResultsScreenDt searchDebits(DebitSearchScreenDt paramDebitSearchScreenDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		return null;
	}

	/**
	 * @deprecated
	 */
	public CmChargesSearchResultsDt searchChargesByInvoice(InvoiceIdInfoDt paramInvoiceIdInfoDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		return null;
	}

	public CmChargesSearchResultsDt searchChargesByInvoiceAndAccount(InvoiceAccountIdInfoDt paramInvoiceAccountIdInfoDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		return null;
	}

	public AR3ImmedChargePaymentResultDt l3CreateImmediateChargePayment(AR3AccountInfoDt paramAR3AccountInfoDt,
			AR3CreateChargeRequestDt[] paramArrayOfAR3CreateChargeRequestDt,
			AR3PaymentRequestDt[] paramArrayOfAR3PaymentRequestDt) throws RemoteException, ApplicationException {
		AR3ImmedChargePaymentResultDt response = new AR3ImmedChargePaymentResultDt();
		AR3PaymentsFeedbackDt zero = new AR3PaymentsFeedbackDt();
		zero.setPaymentId(123);
		zero.setPaymentMethod("mock method");
		zero.setCheckNo("aCheckNo Mock");
		zero.setAuthResponseCode("aAuthResponseCode mock");
		zero.setCreditCardNumber("aCreditCardNumber mock");
		AR3PaymentsFeedbackDt[] paymentsFeedbackItems = new AR3PaymentsFeedbackDt[] { zero };
		AR3DepositListDt aAR3DepositListDt_zero = new AR3DepositListDt();
		aAR3DepositListDt_zero.setInvoiceId(13245346L);
		aAR3DepositListDt_zero.setDepositId(78979L);
		aAR3DepositListDt_zero.setDepositDesignation("deposit designation");
		aAR3DepositListDt_zero.setL3DepositType("aL3DepositType mock");
		aAR3DepositListDt_zero.setDepositBalance(4561.38);
		AR3DepositListDt[] ar3depositfeedbackitems = new AR3DepositListDt[] { aAR3DepositListDt_zero };
		AR9MixedPaymentResultDt aAR9MixedPaymentResultDt_zero = new AR9MixedPaymentResultDt();
		aAR9MixedPaymentResultDt_zero.setL9MixedPayErrorCode("aL9MixedPayErrorCode mock");
		aAR9MixedPaymentResultDt_zero.setL9MixedPaymentStatus("aL9MixedPaymentStatus mock");
		AR9MixedPaymentResultDt[] ar9MixedPaymentResultDt = new AR9MixedPaymentResultDt[] {aAR9MixedPaymentResultDt_zero};
		response.setPaymentsFeedbackItems(paymentsFeedbackItems);
		response.setAr3depositfeedbackitems(ar3depositfeedbackitems);
		response.setAr9MixedPaymentResultDt(ar9MixedPaymentResultDt);
		response.setCreditId(12313454646L);
		return response;
	}

	public void l9CreateImmediateCharge(AR3AccountInfoDt paramAR3AccountInfoDt,
			AR3CreateChargeRequestDt[] paramArrayOfAR3CreateChargeRequestDt, InvoiceIdInfoDt paramInvoiceIdInfoDt,
			InvoiceLevelCreditDetailsScreenDt paramInvoiceLevelCreditDetailsScreenDt)
			throws RemoteException, ApplicationException {
	}
}
