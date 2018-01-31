
package com.practia.abp.services.ar;

import static com.practia.datalayer.datatypes.builder.Transformer.ACCOUNT_BALANCE_DT;
//import static com.practia.abp.datatypes.transform.Transformer.ACCOUNT_BALANCE_DT;

import java.util.concurrent.ConcurrentHashMap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.practia.ar.datalayer.datatypes.AccountBalanceDtBean;
import com.practia.datalayer.datatypes.builder.Builder;
import com.practia.datalayer.datatypes.processors.Processor;

import amdocs.ar.datalayer.datatypes.AccountBalanceDt;
import amdocs.ar.datalayer.datatypes.AccountIdInfoDt;

@WebService(serviceName = "ARBIRAccountServices", name = "ARBIRAccountServices", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRAccountServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ARBIRAccountServices {

	public ARBIRAccountServices() {

	}

	private ConcurrentHashMap<String, Processor<?>> processors;
	
	private amdocs.ar.sessions.interfaces.api.ARBIRAccountServices remote;

	@WebMethod()
	@WebResult(name = "AccountBalanceDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRAccountServices")
	public AccountBalanceDtBean getAccountBalance(
			@WebParam(name = "AccountIdInfoDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRAccountServices") AccountIdInfoDt paramAccountIdInfoDt)
			throws com.practia.abp.exception.AACWSException {
		try {
			AccountBalanceDt dataType = remote.getAccountBalance(paramAccountIdInfoDt);
			Builder<?> builder = ACCOUNT_BALANCE_DT.builderOf(dataType);
			return (AccountBalanceDtBean)builder.build();
			
//			return ACCOUNT_BALANCE_DT
//					.process(remote
//								.getAccountBalance(paramAccountIdInfoDt));
		} catch (Throwable t) {
			throw new com.practia.abp.exception.AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod(exclude = true)
	public ConcurrentHashMap<String, Processor<?>> getProcessors() {
		return processors;
	}

	@WebMethod(exclude = true)
	public void setProcessors(ConcurrentHashMap<String, Processor<?>> processors) {
		this.processors = processors;
	}


	@WebMethod(exclude = true)
	public amdocs.ar.sessions.interfaces.api.ARBIRAccountServices getRemote() {
		return remote;
	}

	@WebMethod(exclude = true)
	public void setRemote(amdocs.ar.sessions.interfaces.api.ARBIRAccountServices remote) {
		this.remote = remote;
	}
}
