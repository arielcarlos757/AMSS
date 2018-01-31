import java.util.Date;
import java.util.Locale;

import com.practia.ar.datalayer.datatypes.AccountBalanceDtBean;
import com.practia.datalayer.datatypes.builder.Builder;
import com.practia.datalayer.datatypes.builder.BuilderType;
import com.practia.datalayer.datatypes.builder.Transformer;
import com.practia.datalayer.datatypes.processors.Processor;

import amdocs.ar.datalayer.datatypes.AccountBalanceDt;
import amdocs.ar.datalayer.datatypes.PaymentSearchResultsScreenDt;
import amdocs.jf.common.messaging.FormatException;
import amdocs.jutil.messageHandling.exceptions.GeneralException;
import javax.ejb.SessionContext;


public class MyApp {

	public static void main(String[] args) throws FormatException, GeneralException {
		
//		SessionContext context = new SessionContext() 
		
		
		
		
		
		
		
		
		
		
		AccountBalanceDt account = new AccountBalanceDt();
		
		Processor<?> p = Transformer.ACCOUNT_BALANCE_DT.processorOf(account.getClass());
		Transformer.ACCOUNT_BALANCE_DT.builderOf(account);
		Builder<?> a = Transformer.ACCOUNT_BALANCE_DT.builderOf(account);
		PaymentSearchResultsScreenDt payment = new PaymentSearchResultsScreenDt();
		Builder<?> b = Transformer.PAYMENT_SEARCH_RESULTS_SCREEN_DT.builderOf(payment);
		
		
		AccountBalanceDtBean bena = (AccountBalanceDtBean)a.build();
		
		
		BuilderType<?> bt = new BuilderType<AccountBalanceDt>();
//		Builder<?> b = bt.builderOf(account);
		
		System.out.println(b.build().toString());
		
		
		
		
		
		
		
		
		String[] errorParams = {"hello!"};
		amdocs.jutil.messageHandling.MessageHandlingServices.getInstance();
		amdocs.jutil.messageHandling.MessageHandlingServices.getInstance()
			.addMessage("AR", "MANDATORY_FIELD_MISSING", "AR1Error", 4, "(AR1-000375) El archivo {0} es obligatorio.", "", Locale.getDefault());
		System.out.println(Locale.getDefault());
		Date d = new Date();
		d.setDate(15);
		d.setMonth(12);
		d.setYear(2017);
		System.out.println(d.toString());
/*		
		 MessageHandlingServices.getInstance();
		amdocs.jf.common.messaging.mhs.MessageFormatterImpl 
		impl = new amdocs.jf.common.messaging.mhs.MessageFormatterImpl(Locale.getDefault());
//		impl.formatMessage(amdocs.ar.general.error.AR9ErrorMessages.AR9_GENERAL_EXCEPTION_MESSAGE, errorParams);
		impl.formatMessage(PractiaErrorMessages.MANDATORY_FIELD_MISSING, errorParams);
//		impl.formatMessage(ACMArchErrorMessages.JF1_METHOD_CANNOT_BE_INVOKED_BY_APPLICATION, errorParams);*/
		
		// TODO Auto-generated method stub
		
		amdocs.ar.general.error.ValidationException ae = 
				new amdocs.ar.general.error.ValidationException(
						 amdocs.ar.general.error.ARErrorMessages.MANDATORY_FIELD_MISSING,
//						ACMArchErrorMessages.GN1_APPL_BOH_BE_NOT_FOUND,
						errorParams);
		System.out.println(ae.toString());
	}
}
