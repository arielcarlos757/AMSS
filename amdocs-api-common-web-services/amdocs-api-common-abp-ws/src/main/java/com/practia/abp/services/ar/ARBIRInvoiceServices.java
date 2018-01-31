package com.practia.abp.services.ar;

import static com.practia.datalayer.datatypes.builder.Transformer.DOC_LIST_INFO;
import static com.practia.datalayer.datatypes.builder.Transformer.INVOICE_SEARCH_RESULTS_SCREEN_DT;

import java.rmi.RemoteException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.practia.ar.datalayer.datatypes.InvoiceSearchResultsScreenDtBean;
import com.practia.datalayer.datatypes.builder.Builder;
import amdocs.acmarch.core.AbstractDatatype;
import amdocs.ar.datalayer.datatypes.InvoiceSearchScreenDt;
import amdocs.ar.datalayer.datatypes.PaginationInfo;

@WebService(serviceName = "ARBIRInvoiceServices", name = "ARBIRInvoiceServices", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRInvoiceServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ARBIRInvoiceServices {

	private amdocs.ar.sessions.interfaces.api.ARBIRInvoiceServices remote;

	public ARBIRInvoiceServices() {
	}

	@WebMethod()
	@WebResult(name = "InvoiceSearchResultsScreenDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRInvoiceServices")
	public InvoiceSearchResultsScreenDtBean searchInvoices(
			@WebParam(name = "InvoiceSearchScreenDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRInvoiceServices") InvoiceSearchScreenDt paramInvoiceSearchScreenDt,
			@WebParam(name = "PaginationInfo", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRInvoiceServices") PaginationInfo paramPaginationInfo)
			throws RemoteException, com.practia.abp.exception.AACWSException {
		try {
			AbstractDatatype dt = remote.searchInvoices(paramInvoiceSearchScreenDt, paramPaginationInfo);
			Builder<?> builder = INVOICE_SEARCH_RESULTS_SCREEN_DT.builderOf(dt);
			return (InvoiceSearchResultsScreenDtBean) builder.build();
		} catch (Throwable e) {
			throw new com.practia.abp.exception.AACWSException(e.getLocalizedMessage(),e);
		}
	}

	@WebMethod(exclude = true)
	public amdocs.ar.sessions.interfaces.api.ARBIRInvoiceServices getRemote() {
		return remote;
	}

	@WebMethod(exclude = true)
	public void setRemote(amdocs.ar.sessions.interfaces.api.ARBIRInvoiceServices remote) {
		this.remote = remote;
	}
}
