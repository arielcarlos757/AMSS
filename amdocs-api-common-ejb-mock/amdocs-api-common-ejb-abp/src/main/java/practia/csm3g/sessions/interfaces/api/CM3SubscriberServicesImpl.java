package practia.csm3g.sessions.interfaces.api;

import amdocs.csm3g.datatypes.CM9POInfo;
import amdocs.mock.ejb.APIEJBMock;
import amdocs.csm3g.sessions.interfaces.api.CM3SubscriberServices;
import amdocs.csm3g.sessions.interfaces.home.CM3SubscriberServicesHome;
import amdocs.crossabp.datatypes.HLFServicesRestoreSubscriberInputInfo;
import amdocs.crossabp.datatypes.HLFServicesRestoreSubscriberOutputInfo;
import amdocs.csm3g.datatypes.CM3HLSubscriberServicesCreateNewSubscriberInputInfo;
import amdocs.csm3g.datatypes.CM3HLSubscriberServicesCreateNewSubscriberOutputInfo;
import amdocs.csm3g.datatypes.CM9AttributeInfo;
import amdocs.csm3g.datatypes.CM9SubInfo;
import amdocs.csm3g.datatypes.SubscriberGeneralInfo;
import amdocs.csm3g.datatypes.SubscriberServicesUpdateSubscriberInputInfo;
import amdocs.csm3g.datatypes.SubscriberServicesUpdateSubscriberOutputInfo;
import amdocs.csm3g.exceptions.CMException;
import java.rmi.RemoteException;

import javax.ejb.CreateException;

public class CM3SubscriberServicesImpl extends APIEJBMock implements CM3SubscriberServices, CM3SubscriberServicesHome {

	private static final long serialVersionUID = 1L;

	public CM3SubscriberServicesImpl create() throws CreateException, RemoteException {
		return new CM3SubscriberServicesImpl();
	}

	public CM3HLSubscriberServicesCreateNewSubscriberOutputInfo l3CreateNewSubscriber(
			CM3HLSubscriberServicesCreateNewSubscriberInputInfo paramCM3HLSubscriberServicesCreateNewSubscriberInputInfo)
			throws RemoteException, CMException {
		return null;
	}

	public SubscriberServicesUpdateSubscriberOutputInfo l9UpdateSubscriber(
			SubscriberServicesUpdateSubscriberInputInfo paramSubscriberServicesUpdateSubscriberInputInfo)
			throws RemoteException, CMException {
		return null;
	}

	public HLFServicesRestoreSubscriberOutputInfo l9RestoreSubscriber(
			HLFServicesRestoreSubscriberInputInfo paramHLFServicesRestoreSubscriberInputInfo,
			SubscriberGeneralInfo paramSubscriberGeneralInfo) throws RemoteException, CMException {
		return null;
	}

	public Object l9GetBillingOfferAttributes(CM9SubInfo paramCM9SubInfo) throws RemoteException, CMException {
		
		if("channelTest".equals(paramCM9SubInfo.getChannel())) {
			return "return String test at :" + System.currentTimeMillis();
		}
		
		CM9POInfo cm9poInfo = new CM9POInfo();
		CM9AttributeInfo zero = new CM9AttributeInfo();
		zero.setAttributeName("atributeName mock");
		zero.setAttributeValue("aAttributeValue mock");
		CM9AttributeInfo one = new CM9AttributeInfo();
		one.setAttributeName("atributeName mock");
		one.setAttributeValue("aAttributeValue mock");
		CM9AttributeInfo[] aAttributeInfo = new CM9AttributeInfo[] { zero, one };
		cm9poInfo.setAttributeInfo(aAttributeInfo);
		cm9poInfo.setOfferType("aOfferType mock");
		return cm9poInfo;
	}
}
