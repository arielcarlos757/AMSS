package com.practia.abp.services.ar;

import java.rmi.RemoteException;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import amdocs.ar.datalayer.datatypes.CreditNoteSearchResultsScreenDt;
import amdocs.ar.datalayer.datatypes.CreditNoteSearchScreenDt;
import amdocs.ar.datalayer.datatypes.PaginationInfo;
import amdocs.ar.general.error.ApplicationException;

@WebService(serviceName = "ARBIRCreditServices", name = "ARBIRCreditServices", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRCreditServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ARBIRCreditServices {

	private amdocs.ar.sessions.interfaces.api.ARBIRCreditServices remote;
	
	public ARBIRCreditServices(){}
	
	@WebMethod()
	@WebResult(name = "CreditNoteSearchResultsScreenDt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_AR_ARBIRCreditServices")
	public CreditNoteSearchResultsScreenDt searchCreditNotes(CreditNoteSearchScreenDt paramCreditNoteSearchScreenDt,
			PaginationInfo paramPaginationInfo) throws RemoteException, ApplicationException {
		return remote.searchCreditNotes(paramCreditNoteSearchScreenDt, paramPaginationInfo);
	}

	@WebMethod(exclude = true)
	public amdocs.ar.sessions.interfaces.api.ARBIRCreditServices getRemote() {
		return remote;
	}

	@WebMethod(exclude = true)
	public void setRemote(amdocs.ar.sessions.interfaces.api.ARBIRCreditServices remote) {
		this.remote = remote;
	}
}
