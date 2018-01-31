import java.rmi.RemoteException;

import com.practia.abp.invoicing.DocumentServicesBean;

import amdocs.acmarch.exceptions.ACMException;
import amdocs.ar.general.error.ApplicationException;
import amdocs.bl3g.datatypes.BaIdInfo;
import amdocs.bl3g.datatypes.DateLimitInfo;
import amdocs.bl3g.datatypes.DocListInfo;
import amdocs.bl3g.datatypes.LegalIdInfo;
import amdocs.bl3g.datatypes.PaginationInfo;

public class Test {

	public static void main(String[] args) throws ApplicationException, RemoteException, ACMException {
		// TODO Auto-generated method stub
		/*ARBIRAccountServicesBean bean = new ARBIRAccountServicesBean();
		AccountIdInfoDt dt = new AccountIdInfoDt();
//		dt.setAccountId();
		dt.setCmAccountNumber(null);
		AccountBalanceDt response = bean.getAccountBalance(dt);
//		System.out.println();*/
		
		
		DocumentServicesBean bean = new DocumentServicesBean();
		
		BaIdInfo info = new BaIdInfo();
		info.setBaId(7891);
		DateLimitInfo info2 = new DateLimitInfo();
		amdocs.acmarch.core.AbstractDatatype a = info2;
		System.out.println(a.getClass().getSimpleName());
		PaginationInfo info3 = new PaginationInfo();
		info3.setPageNumber(1);
		info3.setPageSize(1);
		LegalIdInfo legal = null;
//		legal.setLegalInvoiceNo(null);
//		legal.setNullAll();
		bean.getDocumentList(legal);
//		info.setNullAll();
		DocListInfo listInfo = bean.getDocumentList(info,info2, info3);
		System.out.println("response :" + listInfo.toString());
		
		
		/*
		DocumentServicesBean b = new DocumentServicesBean();
		DocIdInfo doc = new DocIdInfo();
		doc.setDocId(10);
		b.getDocumentCharges(doc, null, null, null, null);
		
		PaymentDetailsCustDt obj = new PaymentDetailsCustDt();
		obj.getBankCode();
		
		String bankCode = amdocs.ar.domains.DOMAINar1bankcode.isNull(obj.getBankCode()) ? null : obj.getBankCode();
		String l9CashierId = obj.isL9CashierIdNull() ? null : obj.getL9CashierId();

		ARBIRPaymentServicesImpl impl = new ARBIRPaymentServicesImpl();
		
		Date date = new GregorianCalendar(2017, 8, 15).getTime();
		Date date1 = new GregorianCalendar(2017, 12, 15).getTime();

		PaymentSearchScreenDt dt = new PaymentSearchScreenDt();
		dt.setAccountId(1508);
		dt.setPaymentMethod("ars");
		dt.setFromDepositDate(date);
		dt.setToDepositDate(date1);
		
		impl.searchPayments(dt, null);*/
//
//		date.set
//		date.setMonth(11);
//		date.setYear(2017);
//		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        String today = formatter.format(date);
//        String other = formatter.format(date1);
//        today.equals(other);
		/*ARBIRAccountServicesBean bean = new ARBIRAccountServicesBean();
		AccountIdInfoDt dt = new AccountIdInfoDt();
		dt.setAccountId(0);
		dt.setCmAccountNumber(null);
		AccountBalanceDt response = bean.getAccountBalance(dt);
//		System.out.println();*/
	}

}
