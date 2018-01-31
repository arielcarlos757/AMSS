package com.practia.oms.services;

import com.practia.oms.exception.AACWSException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.amdocs.services.customerdomain.customerorder.OrderingContext;
import com.amdocs.services.productdomain.lightweight.ConsultServicesRetrieveServicesByMaskResults;
import com.amdocs.services.productdomain.lightweight.lib.ServiceFilterInfo;
import com.amdocs.services.productdomain.lightweight.lib.ServiceMask;

import amdocs.ar.general.error.ApplicationException;

@WebService(serviceName = "ConsultServices", name = "ConsultServices", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_OMS_DocumentServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ConsultServices {

	private com.amdocs.services.productdomain.lightweight.ejb.ConsultServices remote;

	@WebMethod()
	@WebResult(name = "ConsultServicesRetrieveServicesByMaskResults", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_ConsultServices")
	public ConsultServicesRetrieveServicesByMaskResults retrieveServicesByMask(
			@WebParam(name = "OrderingContext", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_ConsultServices") OrderingContext paramOrderingContext,
			@WebParam(name = "String1", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_ConsultServices") String paramString1,
			@WebParam(name = "String2", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_ConsultServices") String paramString2,
			@WebParam(name = "ServiceMask1", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_ConsultServices") ServiceMask paramServiceMask1,
			@WebParam(name = "ServiceMask2", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_ConsultServices") ServiceMask paramServiceMask2,
			@WebParam(name = "ServiceFilterInfo", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_ConsultServices") ServiceFilterInfo[] paramArrayOfServiceFilterInfo)
			throws AACWSException {
		try {
			return remote.retrieveServicesByMask(paramOrderingContext, paramString1, paramString2, paramServiceMask1,
					paramServiceMask2, paramArrayOfServiceFilterInfo);
		} catch (Throwable t) {
			throw new AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod(exclude = true)
	public com.amdocs.services.productdomain.lightweight.ejb.ConsultServices getRemote() {
		return remote;
	}

	@WebMethod(exclude = true)
	public void setRemote(com.amdocs.services.productdomain.lightweight.ejb.ConsultServices remote) {
		this.remote = remote;
	}
}
