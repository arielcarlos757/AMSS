package com.practia.abp.services.ar;

import static com.practia.datalayer.datatypes.builder.Transformer.PAYMENT_SEARCH_RESULTS_SCREEN_DT;
import java.util.concurrent.ConcurrentHashMap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.practia.abp.exception.AACWSException;
import com.practia.ar.datalayer.datatypes.PaymentSearchResultsScreenDtBean;
import com.practia.datalayer.datatypes.builder.Builder;
import com.practia.datalayer.datatypes.processors.Processor;

import amdocs.ar.datalayer.datatypes.PaginationInfo;
import amdocs.ar.datalayer.datatypes.PaymentSearchScreenDt;

@WebService(serviceName = "ARBIRPaymentServices", name = "ARBIRPaymentServices", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRPaymentServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ARBIRPaymentServices {

	private amdocs.ar.sessions.interfaces.api.ARBIRPaymentServices remote;

	private ConcurrentHashMap<String, Processor<?>> processors;

	public ARBIRPaymentServices() {
	}

	@WebMethod()
	@WebResult(name = "AR3ImmedChargePaymentResultDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRPaymentServices")
	public PaymentSearchResultsScreenDtBean searchPayments(
			@WebParam(name = "PaymentSearchScreenDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRPaymentServices") PaymentSearchScreenDt paramPaymentSearchScreenDt,
			@WebParam(name = "PaginationInfo", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRPaymentServices") PaginationInfo paramPaginationInfo)
			throws AACWSException {
		try {
			Builder<?> builder = PAYMENT_SEARCH_RESULTS_SCREEN_DT
					.builderOf(remote.searchPayments(paramPaymentSearchScreenDt, paramPaginationInfo));
			PaymentSearchResultsScreenDtBean response = (PaymentSearchResultsScreenDtBean) builder.build();
			return response;
		} catch (Throwable e) {
			throw new com.practia.abp.exception.AACWSException(e.getLocalizedMessage(), e);
		}
	}

	@WebMethod(exclude = true)
	public amdocs.ar.sessions.interfaces.api.ARBIRPaymentServices getRemote() {
		return remote;
	}

	@WebMethod(exclude = true)
	public void setRemote(amdocs.ar.sessions.interfaces.api.ARBIRPaymentServices remote) {
		this.remote = remote;
	}

	@WebMethod(exclude = true)
	public ConcurrentHashMap<String, Processor<?>> getProcessors() {
		return processors;
	}

	@WebMethod(exclude = true)
	public void setProcessors(ConcurrentHashMap<String, Processor<?>> processors) {
		this.processors = processors;
	}
}
