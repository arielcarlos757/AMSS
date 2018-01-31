package com.practia.abp.services.cm;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import amdocs.csm3g.datatypes.CM9POInfo;
import amdocs.csm3g.datatypes.CM9SubInfo;

@WebService(serviceName = "CM3SubscriberServices", name = "CM3SubscriberServices", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_CM_CM3SubscriberServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class CM3SubscriberServices {

	private static String ERROR_L9_GET_BILLING_OFFER_ATTRIBUTE = "Error while trying to get CM9POInfo from l9GetBillingOfferAttributes";

	public CM3SubscriberServices() {
	} // default constructor

	private amdocs.csm3g.sessions.interfaces.api.CM3SubscriberServices remote;

	@WebMethod()
	@WebResult(name = "CM9POInfo", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_CM_CM3SubscriberServices")
	public CM9POInfo l9GetBillingOfferAttributes(CM9SubInfo paramCM9SubInfo)
			throws com.practia.abp.exception.AACWSException {
		try {
			Object o = remote.l9GetBillingOfferAttributes(paramCM9SubInfo);
			if ((o instanceof String) | !(o instanceof CM9POInfo) | (o == null)) {
				throw new com.practia.abp.exception.AACWSException(ERROR_L9_GET_BILLING_OFFER_ATTRIBUTE,
						new Exception(ERROR_L9_GET_BILLING_OFFER_ATTRIBUTE));
			}
			return (CM9POInfo) o;
		} catch (Throwable t) {
			throw new com.practia.abp.exception.AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod(exclude = true)
	public amdocs.csm3g.sessions.interfaces.api.CM3SubscriberServices getRemote() {
		return remote;
	}

	@WebMethod(exclude = true)
	public void setRemote(amdocs.csm3g.sessions.interfaces.api.CM3SubscriberServices remote) {
		this.remote = remote;
	}
}
