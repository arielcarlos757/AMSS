package com.practia.abp.services.ar;

import java.rmi.RemoteException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import amdocs.ar.datalayer.datatypes.AR3AccountInfoDt;
import amdocs.ar.datalayer.datatypes.AR3CreateChargeRequestDt;
import amdocs.ar.datalayer.datatypes.AR3ImmedChargePaymentResultDt;
import amdocs.ar.datalayer.datatypes.AR3PaymentRequestDt;

@WebService(serviceName = "ARBIRChargeServices", name = "ARBIRChargeServices", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRChargeServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ARBIRChargeServices {

	private amdocs.ar.sessions.interfaces.api.ARBIRChargeServices remote;

	public ARBIRChargeServices() {
	}

	@WebMethod()
	@WebResult(name = "AR3ImmedChargePaymentResultDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRChargeServices")
	public AR3ImmedChargePaymentResultDt l3CreateImmediateChargePayment(
			@WebParam(name = "AR3AccountInfoDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRChargeServices") AR3AccountInfoDt paramAR3AccountInfoDt,
			@WebParam(name = "AR3CreateChargeRequestDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRChargeServices") AR3CreateChargeRequestDt[] paramArrayOfAR3CreateChargeRequestDt,
			@WebParam(name = "AR3PaymentRequestDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRChargeServices") AR3PaymentRequestDt[] paramArrayOfAR3PaymentRequestDt)
			throws com.practia.abp.exception.AACWSException {
		try {
			return remote.l3CreateImmediateChargePayment(paramAR3AccountInfoDt, paramArrayOfAR3CreateChargeRequestDt,
					paramArrayOfAR3PaymentRequestDt);
		} catch (Throwable t) {
			throw new com.practia.abp.exception.AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod(exclude = true)
	public amdocs.ar.sessions.interfaces.api.ARBIRChargeServices getRemote() {
		return remote;
	}

	@WebMethod(exclude = true)
	public void setRemote(amdocs.ar.sessions.interfaces.api.ARBIRChargeServices remote) {
		this.remote = remote;
	}
}
