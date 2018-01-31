package practia.ar.sessions.interfaces.api;

import java.rmi.RemoteException;

import javax.ejb.CreateException;

import amdocs.acmarch.exceptions.ArchException;
import amdocs.ar.datalayer.datatypes.AR9BatchChargeCreditInputDt;
import amdocs.ar.datalayer.datatypes.AR9ChargeIdInfoDt;
import amdocs.ar.datalayer.datatypes.AccountIdInfoDt;
import amdocs.ar.datalayer.datatypes.AmountInfoDt;
import amdocs.ar.datalayer.datatypes.BillingArrangementIdInfoDt;
import amdocs.ar.datalayer.datatypes.BillingArrangementListItemBriefScreenDt;
import amdocs.ar.datalayer.datatypes.BillingListItemBriefScreenDt;
import amdocs.ar.datalayer.datatypes.ChargeIdInfoDt;
import amdocs.ar.datalayer.datatypes.ChargeLevelCreditDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.CreditAllocationDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.CreditAllocationListItemScreenDt;
import amdocs.ar.datalayer.datatypes.CreditDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.CreditIdInfoDt;
import amdocs.ar.datalayer.datatypes.CreditNoteListItemScreenDt;
import amdocs.ar.datalayer.datatypes.CreditNoteReversalScreenDt;
import amdocs.ar.datalayer.datatypes.CreditNoteSearchResultsScreenDt;
import amdocs.ar.datalayer.datatypes.CreditNoteSearchScreenDt;
import amdocs.ar.datalayer.datatypes.CreditNoteViewItemScreenDt;
import amdocs.ar.datalayer.datatypes.CreditReversalDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.CreditSearchResultsScreenDt;
import amdocs.ar.datalayer.datatypes.CreditSearchScreenDt;
import amdocs.ar.datalayer.datatypes.CreditTypeInfoDt;
import amdocs.ar.datalayer.datatypes.InvoiceIdInfoDt;
import amdocs.ar.datalayer.datatypes.InvoiceLevelCreditDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.InvoiceStatusInfoDt;
import amdocs.ar.datalayer.datatypes.InvoiceTypeInfoDt;
import amdocs.ar.datalayer.datatypes.LockInfoDt;
import amdocs.ar.datalayer.datatypes.PaginationInfo;
import amdocs.ar.datalayer.datatypes.PaginationResultInfo;
import amdocs.ar.general.error.ApplicationException;
import amdocs.ar.general.error.DatabaseException;
import amdocs.ar.general.error.LockingException;
import amdocs.ar.sessions.interfaces.api.ARBIRCreditServices;
import amdocs.ar.sessions.interfaces.home.ARBIRCreditServicesHome;
import amdocs.mock.ejb.APIEJBMock;

public class ARIRCreditServicesImpl extends APIEJBMock implements ARBIRCreditServices, ARBIRCreditServicesHome {

	private static final long serialVersionUID = 1L;
	
	@Override
	public ARIRCreditServicesImpl create() throws CreateException, RemoteException {
		return new ARIRCreditServicesImpl();
	}

	public void finalizeCreditNote(AccountIdInfoDt paramAccountIdInfoDt, InvoiceIdInfoDt paramInvoiceIdInfoDt,
			LockInfoDt paramLockInfoDt) throws RemoteException, ApplicationException {
	}

	public CreditAllocationListItemScreenDt[] searchCreditAllocations(AccountIdInfoDt paramAccountIdInfoDt,
			CreditIdInfoDt[] paramArrayOfCreditIdInfoDt, CreditTypeInfoDt paramCreditTypeInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public BillingListItemBriefScreenDt[] searchInvoiceByStatusAndType(AccountIdInfoDt paramAccountIdInfoDt,
			InvoiceStatusInfoDt[] paramArrayOfInvoiceStatusInfoDt, InvoiceTypeInfoDt[] paramArrayOfInvoiceTypeInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public void deleteCredit(AccountIdInfoDt paramAccountIdInfoDt,
			CreditNoteViewItemScreenDt[] paramArrayOfCreditNoteViewItemScreenDt, LockInfoDt paramLockInfoDt)
			throws RemoteException, ApplicationException {
	}

	public void createPaymentAllocation(CreditIdInfoDt paramCreditIdInfoDt, AmountInfoDt paramAmountInfoDt,
			InvoiceIdInfoDt paramInvoiceIdInfoDt,
			CreditAllocationDetailsScreenDt[] paramArrayOfCreditAllocationDetailsScreenDt)
			throws RemoteException, ApplicationException {
	}

	public InvoiceLevelCreditDetailsScreenDt createInvoiceLevelCredit(InvoiceIdInfoDt paramInvoiceIdInfoDt1,
			AccountIdInfoDt paramAccountIdInfoDt, InvoiceIdInfoDt paramInvoiceIdInfoDt2,
			InvoiceLevelCreditDetailsScreenDt paramInvoiceLevelCreditDetailsScreenDt,
			CreditAllocationDetailsScreenDt[] paramArrayOfCreditAllocationDetailsScreenDt, LockInfoDt paramLockInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public void reverseCredit(AccountIdInfoDt paramAccountIdInfoDt, CreditIdInfoDt paramCreditIdInfoDt,
			CreditReversalDetailsScreenDt paramCreditReversalDetailsScreenDt, LockInfoDt paramLockInfoDt)
			throws RemoteException, ApplicationException {
	}

	public ChargeLevelCreditDetailsScreenDt createChargeLevelCredit(ChargeIdInfoDt paramChargeIdInfoDt,
			AccountIdInfoDt paramAccountIdInfoDt, InvoiceIdInfoDt paramInvoiceIdInfoDt,
			ChargeLevelCreditDetailsScreenDt paramChargeLevelCreditDetailsScreenDt,
			CreditAllocationDetailsScreenDt[] paramArrayOfCreditAllocationDetailsScreenDt, LockInfoDt paramLockInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public CreditNoteSearchResultsScreenDt searchCreditNotes(CreditNoteSearchScreenDt paramCreditNoteSearchScreenDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		CreditNoteSearchResultsScreenDt response = new CreditNoteSearchResultsScreenDt();
		CreditNoteListItemScreenDt one = new CreditNoteListItemScreenDt();
		one.setAccountLevelCredits("aAccountLevelCredits");
		one.setAmount(123);
		one.setBillingInvoiceNumber("aBillingInvoiceNumber");
		one.setChargeLevelCredits("aChargeLevelCredits");
		one.setCreditNoteExtract((byte)8);
		one.setInvoiceStatus("aInvoiceStatus");
		CreditNoteListItemScreenDt[] aCreditNoteListItems = new CreditNoteListItemScreenDt[]{one};
		response.setCreditNoteListItems(aCreditNoteListItems);
		PaginationResultInfo aPaginationResults = new PaginationResultInfo();
		aPaginationResults.setResultsCount(1);
		aPaginationResults.setTotalCount(1);
		aPaginationResults.setRowCount(1);
		aPaginationResults.setMoreRows((byte)1);
		response.setPaginationResults(aPaginationResults );
		return response;
	}

	public CreditDetailsScreenDt createCredit(AccountIdInfoDt paramAccountIdInfoDt,
			InvoiceIdInfoDt paramInvoiceIdInfoDt, BillingArrangementIdInfoDt paramBillingArrangementIdInfoDt,
			CreditDetailsScreenDt paramCreditDetailsScreenDt,
			CreditAllocationDetailsScreenDt[] paramArrayOfCreditAllocationDetailsScreenDt, LockInfoDt paramLockInfoDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public CreditSearchResultsScreenDt searchCredits(CreditSearchScreenDt paramCreditSearchScreenDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		return null;
	}

	public BillingArrangementListItemBriefScreenDt[] searchBillingArrangementBriefByAccountId(
			AccountIdInfoDt paramAccountIdInfoDt) throws RemoteException, ApplicationException {
		return null;
	}

	public CreditNoteViewItemScreenDt[] searchCreditNoteCredits(AccountIdInfoDt paramAccountIdInfoDt,
			InvoiceIdInfoDt paramInvoiceIdInfoDt) throws RemoteException, ApplicationException {
		return null;
	}

	public void createCreditAllocation(InvoiceIdInfoDt paramInvoiceIdInfoDt, AmountInfoDt paramAmountInfoDt,
			CreditIdInfoDt[] paramArrayOfCreditIdInfoDt,
			CreditAllocationDetailsScreenDt[] paramArrayOfCreditAllocationDetailsScreenDt, LockInfoDt paramLockInfoDt)
			throws RemoteException, ApplicationException {
	}

	public void deleteCreditNote(AccountIdInfoDt paramAccountIdInfoDt, InvoiceIdInfoDt paramInvoiceIdInfoDt,
			LockInfoDt paramLockInfoDt, CreditNoteReversalScreenDt paramCreditNoteReversalScreenDt)
			throws RemoteException, ApplicationException {
	}

	public void finalizeCreditNote(AccountIdInfoDt paramAccountIdInfoDt, InvoiceIdInfoDt paramInvoiceIdInfoDt,
			boolean paramBoolean, LockInfoDt paramLockInfoDt) throws RemoteException, ApplicationException {
	};

	public ChargeLevelCreditDetailsScreenDt l9CreateChargeLevelCredit(AR9ChargeIdInfoDt paramAR9ChargeIdInfoDt,
			ChargeLevelCreditDetailsScreenDt paramChargeLevelCreditDetailsScreenDt)
			throws RemoteException, ApplicationException {
		return null;
	}

	public ChargeLevelCreditDetailsScreenDt[] l9CreateChargeLevelCreditBatch(
			AR9BatchChargeCreditInputDt[] paramArrayOfAR9BatchChargeCreditInputDt)
			throws RemoteException, ApplicationException, LockingException, DatabaseException, ArchException {
		return null;
	}

}
