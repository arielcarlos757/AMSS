import java.rmi.RemoteException;

import com.amdocs.services.mobileapps.ejb.MobileAppsServicesBean;
import com.practia.oms.exception.fault.ValidationFault;

public class Test {

	public static void main(String[] args) {
		
		com.amdocs.services.mobileapps.ejb.MobileAppsServicesBean bean = new
				com.amdocs.services.mobileapps.ejb.MobileAppsServicesBean();
		bean.toString();
		// TODO Auto-generated method stub
//		ValidationFault v = new ValidationFault(
//				new RemoteException(
//		String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SearchOrderActionInput")));
	}

}
