package com.practia.abp;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.Locale;
import amdocs.jutil.messageHandling.MessageHandlingServices;
import amdocs.jutil.messageHandling.exceptions.GeneralException;
import static amdocs.mock.ejb.Message.ADD_MESSAGE_ERROR;
import javax.ejb.CreateException;

import amdocs.ar.datalayer.datatypes.AR3BalanceTransferInfoDt;
import amdocs.ar.datalayer.datatypes.AR3BalanceTransferReasonDt;
import amdocs.ar.datalayer.datatypes.AR3BalanceTransferResultDt;
import amdocs.ar.datalayer.datatypes.AR3OrderInfoDt;
import amdocs.ar.datalayer.datatypes.AR3OrderOpenBalanceInfoDt;
import amdocs.ar.datalayer.datatypes.AccountAtbDt;
import amdocs.ar.datalayer.datatypes.AccountBalanceDt;
import amdocs.ar.datalayer.datatypes.AccountIdInfoDt;
import amdocs.ar.datalayer.datatypes.AccountListItemScreenDt;
import amdocs.ar.datalayer.datatypes.AccountLockInfoDt;
import amdocs.ar.datalayer.datatypes.AccountResultsScreenDt;
import amdocs.ar.datalayer.datatypes.AccountSearchResultsScreenDt;
import amdocs.ar.datalayer.datatypes.AccountSearchScreenDt;
import amdocs.ar.datalayer.datatypes.BackoutDt;
import amdocs.ar.datalayer.datatypes.DateDt;
import amdocs.ar.datalayer.datatypes.LastPaymentDt;
import amdocs.ar.datalayer.datatypes.LockInfoDt;
import amdocs.ar.datalayer.datatypes.LongDt;
import amdocs.ar.datalayer.datatypes.PaginationInfo;
import amdocs.ar.datalayer.datatypes.PayChannelPDt;
import amdocs.ar.datalayer.datatypes.PaymentAccountIdInfoDt;
import amdocs.ar.datalayer.datatypes.PaymentIdInfoDt;
import amdocs.ar.datalayer.datatypes.WriteOffDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.WriteOffIdInfoDt;
import amdocs.ar.datalayer.datatypes.WriteOffListItemScreenDt;
import amdocs.ar.datalayer.datatypes.WriteOffReversalDetailsScreenDt;
import amdocs.ar.datalayer.datatypes.WriteOffSearchResultsScreenDt;
import amdocs.ar.general.error.ARErrorMessages;
import amdocs.ar.general.error.ApplicationException;
import amdocs.ar.general.error.EntityKeyNotFoundException;
import amdocs.ar.general.error.ValidationException;
import amdocs.ar.sessions.interfaces.api.ARBIRAccountServices;
import amdocs.ar.sessions.interfaces.home.ARBIRAccountServicesHome;
import amdocs.jf.common.utils.StringUtils;
import amdocs.mock.ejb.APIEJBMock;

public class ARBIRAccountServicesBean extends APIEJBMock implements ARBIRAccountServices, ARBIRAccountServicesHome {

	private static final long serialVersionUID = 5853112993105848184L;

	@Override
	public ARBIRAccountServices create() throws CreateException, RemoteException {
		return new ARBIRAccountServicesBean();
	}

	@Override
	public void createWriteOff(AccountIdInfoDt arg0, WriteOffDetailsScreenDt arg1, LockInfoDt arg2)
			throws ApplicationException {
		this.logExecution("createWriteOff");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		this.dumpObj(arg2);
	}

	@Override
	public AccountResultsScreenDt findAccountById(AccountIdInfoDt arg0)
			throws ValidationException, ApplicationException {
		this.logExecution("findAccountById");
		this.dumpObj(arg0);
		return new AccountResultsScreenDt();
	}

	@Override
	public LastPaymentDt findLastPayment(AccountIdInfoDt arg0) throws ApplicationException {
		this.logExecution("findLastPayment");
		this.dumpObj(arg0);
		return new LastPaymentDt();
	}

	@Override
	public WriteOffListItemScreenDt findWriteOffById(WriteOffIdInfoDt arg0) throws ApplicationException {
		this.logExecution("findWriteOffById");
		this.dumpObj(arg0);
		return new WriteOffListItemScreenDt();
	}

	@Override
	public AccountBalanceDt getAccountBalance(AccountIdInfoDt arg0) throws ApplicationException {

		
		if (arg0 != null && arg0.getAccountId() == -1061109568) {
			try {
				MessageHandlingServices.getInstance().addMessage("AR", "MANDATORY_FIELD_MISSING", "BL1Error", 4,
						"(AR1-000375) El archivo {0} es obligatorio.", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { "Account Id" };
			throw new ValidationException(ARErrorMessages.MANDATORY_FIELD_MISSING, errorParams);
		}

		if (arg0 != null && arg0.getAccountId() == 0) {
			try {
				MessageHandlingServices.getInstance().addMessage("AR", "GUI_FINDER_ACCOUNT_DOES_NOT_EXIST", "AR1Error",
						3, "(AR1-000203) no existe ninguna cuenta con ID {0}.", "", Locale.getDefault());
			} catch (GeneralException e) {
				System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
			}
			String[] errorParams = { Long.toString(arg0.getAccountId()) };
			throw new ApplicationException(ARErrorMessages.GUI_FINDER_ACCOUNT_DOES_NOT_EXIST, errorParams);
		}

		if (arg0 != null && arg0.getAccountId() == 800) {
			AccountBalanceDt dt = new AccountBalanceDt();
			dt.setNullAll();
			return dt;
		}

		if (arg0 != null && arg0.getAccountId() == 678) {
			AccountBalanceDt dt = new AccountBalanceDt();
			dt.setNullAll();
			dt.setArBalance(678.50);
			return dt;
		}

		if (arg0 != null && arg0.getAccountId() == 799) {
			AccountBalanceDt dt = new AccountBalanceDt();
			dt.setNullAll();
			dt.setUnappliedAmount(799);
			return dt;
		}

		if (arg0 != null && arg0.getAccountId() == 400) {
			AccountBalanceDt dt = new AccountBalanceDt();
			dt.setNullAll();
			dt.setArBalance(1250.1);
			dt.setUnappliedAmount(1250.1);
			return dt;
		}

		try {
			MessageHandlingServices.getInstance().addMessage("AR", "GUI_FINDER_ACCOUNT_DOES_NOT_EXIST", "AR1Error", 3,
					"(AR1-000203) no existe ninguna cuenta con ID {0}.", "", Locale.getDefault());
		} catch (GeneralException e) {
			System.out.println(ADD_MESSAGE_ERROR.value() + " : " + e.getLocalizedMessage());
		}
		String[] errorParams = { Long.toString(arg0.getAccountId()) };
		throw new ApplicationException(ARErrorMessages.GUI_FINDER_ACCOUNT_DOES_NOT_EXIST, errorParams);
	}

	@Override
	public AccountAtbDt[] getAtbInfo(AccountIdInfoDt arg0) throws ApplicationException {
		this.logExecution("getAtbInfo");
		this.dumpObj(arg0);
		AccountAtbDt[] arr = new AccountAtbDt[2];
		arr[0] = new AccountAtbDt();
		arr[1] = new AccountAtbDt();
		return arr;
	}

	@Override
	public AccountAtbDt[] getAtbInfoCalendarMonths(AccountIdInfoDt arg0, LongDt arg1) throws ApplicationException {
		this.logExecution("getAtbInfoCalendarMonths");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		AccountAtbDt[] arr = new AccountAtbDt[3];
		arr[0] = new AccountAtbDt();
		arr[1] = new AccountAtbDt();
		arr[2] = new AccountAtbDt();
		return arr;
	}

	@Override
	public AccountAtbDt[] getAtbInfoMultipleBuckets(AccountIdInfoDt arg0, LongDt arg1, LongDt arg2)
			throws ApplicationException {
		this.logExecution("getAtbInfoMultipleBuckets");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		this.dumpObj(arg2);
		AccountAtbDt[] arr = new AccountAtbDt[3];
		arr[0] = new AccountAtbDt();
		arr[1] = new AccountAtbDt();
		arr[2] = new AccountAtbDt();
		return arr;
	}

	@Override
	public AccountAtbDt[] getAtbInfoWithCreationDate(AccountIdInfoDt arg0) throws ApplicationException {
		this.logExecution("getAtbInfoWithCreationDate");
		this.dumpObj(arg0);
		AccountAtbDt[] arr = new AccountAtbDt[4];
		arr[0] = new AccountAtbDt();
		arr[1] = new AccountAtbDt();
		arr[2] = new AccountAtbDt();
		arr[3] = new AccountAtbDt();
		return arr;
	}

	@Override
	public AccountAtbDt[] getAtbInfoWithCreationDateCalendarMonths(AccountIdInfoDt arg0, LongDt arg1)
			throws ApplicationException {
		this.logExecution("getAtbInfoWithCreationDateCalendarMonths");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		AccountAtbDt[] arr = new AccountAtbDt[2];
		arr[0] = new AccountAtbDt();
		arr[1] = new AccountAtbDt();
		return arr;
	}

	@Override
	public AccountAtbDt[] getAtbInfoWithCreationDateMultipleBuckets(AccountIdInfoDt arg0, LongDt arg1, LongDt arg2)
			throws ApplicationException {
		this.logExecution("getAtbInfoWithCreationDateMultipleBuckets");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		this.dumpObj(arg2);
		AccountAtbDt[] arr = new AccountAtbDt[2];
		arr[0] = new AccountAtbDt();
		arr[1] = new AccountAtbDt();
		return arr;
	}

	@Override
	public AR3OrderOpenBalanceInfoDt[] l3CheckOrderOpenBalance(AR3OrderInfoDt arg0) throws ApplicationException {
		this.logExecution("l3CheckOrderOpenBalance");
		this.dumpObj(arg0);
		AR3OrderOpenBalanceInfoDt[] arr = new AR3OrderOpenBalanceInfoDt[2];
		arr[0] = new AR3OrderOpenBalanceInfoDt();
		arr[1] = new AR3OrderOpenBalanceInfoDt();
		return arr;
	}

	@Override
	public AR3BalanceTransferResultDt l3TransferBalance(AR3BalanceTransferInfoDt arg0, AR3BalanceTransferInfoDt[] arg1,
			AR3BalanceTransferReasonDt arg2) throws ApplicationException {
		this.logExecution("l3TransferBalance");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		this.dumpObj(arg2);
		return new AR3BalanceTransferResultDt();
	}

	@Override
	public void reverseWriteOff(AccountIdInfoDt arg0, WriteOffIdInfoDt arg1, WriteOffReversalDetailsScreenDt arg2,
			LockInfoDt arg3) throws ApplicationException {
		this.logExecution("reverseWriteOff");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		this.dumpObj(arg2);
		this.dumpObj(arg3);
	}

	@SuppressWarnings("deprecation")
	@Override
	public AccountListItemScreenDt searchAccountById(AccountIdInfoDt arg0)
			throws EntityKeyNotFoundException, ApplicationException {
		this.logExecution("searchAccountById");
		this.dumpObj(arg0);
		if (arg0 != null && arg0.getAccountId() == 1234) {
			AccountListItemScreenDt item = new AccountListItemScreenDt();
			item.setNameLine1("NameLine1_1");
			item.setNameLine2("NameLine2_1");
			item.setAccountId(1234);
			item.setArBalance(56.26359401121059);
			item.setCmAccountNumber("CmAccountNumber_1");
			item.setAcctBalPolicy((byte) 96);
			item.setDocumentType("DocumentType_1");
			item.setCurrency("Currency_1");
			LockInfoDt aLockInfo = new LockInfoDt();
			aLockInfo.setAccountTimestamp(24);
			item.setLockInfo(aLockInfo);
			item.setWriteOffStatus((byte) 6);
			item.setBe(35);
			item.setBalanceUpdateDate(new Date(2014 - 1900, 1 - 1, 6, 5, 16, 52));
			item.setCollectionIndicator((byte) 30);
			item.setCollectionIndUpdateDate(new Date(2014 - 1900, 1 - 1, 18, 5, 16, 52));
			return item;
		} else if (arg0 != null) {
			AccountListItemScreenDt item = new AccountListItemScreenDt();
			item.setNameLine1("WALTER NUNEZ");
			item.setNameLine2("");
			item.setAccountId(arg0.getAccountId());
			item.setArBalance(0.0);
			item.setCmAccountNumber(arg0.getCmAccountNumber());
			item.setAcctBalPolicy((byte) 73);
			item.setDocumentType("B");
			item.setCurrency("ARS");
			LockInfoDt aLockInfo = new LockInfoDt();
			aLockInfo.setAccountTimestamp(0);
			item.setLockInfo(aLockInfo);
			item.setWriteOffStatus((byte) 82);
			item.setBe(0);
			item.setBalanceUpdateDate(null);
			item.setCollectionIndicator((byte) 78);
			item.setCollectionIndUpdateDate(null);
			return item;
		} else {
			return new AccountListItemScreenDt();
		}
	}

	@Override
	public AccountLockInfoDt[] searchAccountLockInfo(PaymentIdInfoDt arg0) throws ApplicationException {
		this.logExecution("searchAccountLockInfo");
		this.dumpObj(arg0);
		AccountLockInfoDt[] arr = new AccountLockInfoDt[2];
		arr[0] = new AccountLockInfoDt();
		arr[1] = new AccountLockInfoDt();
		return arr;
	}

	@Override
	public AccountLockInfoDt[] searchAccountLockInfoByPaymentAndAccountId(PaymentAccountIdInfoDt arg0)
			throws ApplicationException {
		this.logExecution("searchAccountLockInfoByPaymentAndAccountId");
		this.dumpObj(arg0);
		AccountLockInfoDt[] arr = new AccountLockInfoDt[2];
		arr[0] = new AccountLockInfoDt();
		arr[1] = new AccountLockInfoDt();
		return arr;
	}

	@Override
	public AccountSearchResultsScreenDt searchAccounts(AccountSearchScreenDt arg0, PaginationInfo arg1)
			throws ApplicationException {
		this.logExecution("searchAccounts");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		return new AccountSearchResultsScreenDt();
	}

	@Override
	public BackoutDt[] searchBackoutsByAccountId(AccountIdInfoDt arg0, DateDt arg1, DateDt arg2)
			throws ApplicationException {
		this.logExecution("searchBackoutsByAccountId");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		this.dumpObj(arg2);
		BackoutDt[] arr = new BackoutDt[2];
		arr[0] = new BackoutDt();
		arr[1] = new BackoutDt();
		return arr;
	}

	@Override
	public AccountSearchResultsScreenDt searchByAccountIds(AccountIdInfoDt[] arg0) throws ApplicationException {
		this.logExecution("searchByAccountIds");
		this.dumpObj(arg0);
		return new AccountSearchResultsScreenDt();
	}

	@Override
	public PayChannelPDt[] searchPcnsByAccountId(AccountIdInfoDt arg0) throws ApplicationException {
		this.logExecution("searchPcnsByAccountId");
		this.dumpObj(arg0);
		PayChannelPDt[] arr = new PayChannelPDt[2];
		arr[0] = new PayChannelPDt();
		arr[1] = new PayChannelPDt();
		return arr;
	}

	@Override
	public WriteOffSearchResultsScreenDt searchWriteOffs(AccountIdInfoDt arg0, PaginationInfo arg1)
			throws ApplicationException {
		this.logExecution("searchWriteOffs");
		this.dumpObj(arg0);
		this.dumpObj(arg1);
		return new WriteOffSearchResultsScreenDt();
	}

}