package com.practia.abp.services.invoicing;

import static com.practia.datalayer.datatypes.builder.Transformer.CHARGE_ALL_DETAILS_LIST_INFO;
import static com.practia.datalayer.datatypes.builder.Transformer.DOC_LIST_INFO;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.practia.abp.datatypes.invoicing.DocListInfoTEF;
import com.practia.abp.exception.GenericException;
import com.practia.bl3g.customtype.PaginationInfoCt;
import com.practia.bl3g.datatypes.ChargeAllDetailsListInfoBean;
import com.practia.bl3g.datatypes.DocListInfoBean;
import com.practia.datalayer.datatypes.builder.Builder;

import amdocs.acmarch.core.AbstractDatatype;
import amdocs.bl3g.datatypes.BaIdInfo;
import amdocs.bl3g.datatypes.ChargeSelectionInfo;
import amdocs.bl3g.datatypes.DateLimitInfo;
import amdocs.bl3g.datatypes.DocIdInfo;
import amdocs.bl3g.datatypes.EntityIdInfo;
import amdocs.bl3g.datatypes.LegalIdInfo;
import amdocs.bl3g.datatypes.PaginationInfo;
import amdocs.bl3g.datatypes.PayChannelIdInfo;
import amdocs.bl3g.exceptions.BillingException;
import amdocs.bl3g.exceptions.BillingValidateException;

@WebService(serviceName = "DocumentServices", name = "DocumentServices", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class DocumentServices {

	private amdocs.bl3g.sessions.interfaces.api.DocumentServices remote;

	public DocumentServices() {
	}

	@WebMethod()
	@WebResult(name = "ChargeAllDetailsListInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices")
	public ChargeAllDetailsListInfoBean getDocumentCharges(
			@WebParam(name = "DocIdInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") DocIdInfo paramDocIdInfo,
			@WebParam(name = "PayChannelIdInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") PayChannelIdInfo paramPayChannelIdInfo,
			@WebParam(name = "EntityIdInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") EntityIdInfo paramEntityIdInfo,
			@WebParam(name = "ChargeSelectionInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") ChargeSelectionInfo paramChargeSelectionInfo,
			@WebParam(name = "PaginationInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") PaginationInfo paramPaginationInfo)
			throws com.practia.abp.exception.AACWSException {
		try {
			Builder<?> builder = CHARGE_ALL_DETAILS_LIST_INFO.builderOf(remote.getDocumentCharges(paramDocIdInfo,
					paramPayChannelIdInfo, paramEntityIdInfo, paramChargeSelectionInfo, paramPaginationInfo));

			ChargeAllDetailsListInfoBean response = (ChargeAllDetailsListInfoBean) builder.build();
			return response;
		} catch (Throwable t) {
			throw new com.practia.abp.exception.AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod()
	@WebResult(name = "DocListInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices")
	public DocListInfoBean getDocumentList_ByBaId(
			@WebParam(name = "BaIdInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") BaIdInfo paramBaIdInfo,
			@WebParam(name = "DateLimitInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") DateLimitInfo paramDateLimitInfo,
			@WebParam(name = "PaginationInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") PaginationInfoCt paramPaginationInfo)
			throws com.practia.abp.exception.AACWSException {
		try {
			AbstractDatatype dt = remote.getDocumentList(paramBaIdInfo, paramDateLimitInfo, paramPaginationInfo);
			Builder<?> builder = DOC_LIST_INFO.builderOf(dt);
			return (DocListInfoBean) builder.build();
		} catch (Throwable t) {
			throw new com.practia.abp.exception.AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod()
	@WebResult(name = "DocListInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices")
	public DocListInfoBean getDocumentList_ByDocId(
			@WebParam(name = "DocIdInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") DocIdInfo paramDocIdInfo)
			throws com.practia.abp.exception.AACWSException {
		try {
			AbstractDatatype dt = remote.getDocumentList(paramDocIdInfo);
			Builder<?> builder = DOC_LIST_INFO.builderOf(dt);
			return (DocListInfoBean) builder.build();
		} catch (Throwable t) {
			throw new com.practia.abp.exception.AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod()
	@WebResult(name = "DocListInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices")
	public DocListInfoBean getDocumentList_ByLegalId(
			@WebParam(name = "LegalIdInfo", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_INVOICING_DocumentServices") LegalIdInfo paramLegalIdInfo)
			throws com.practia.abp.exception.AACWSException {
		try {
			AbstractDatatype dt = remote.getDocumentList(paramLegalIdInfo);
			Builder<?> builder = DOC_LIST_INFO.builderOf(dt);
			return (DocListInfoBean) builder.build();
		} catch (Throwable t) {
			throw new com.practia.abp.exception.AACWSException(t.getLocalizedMessage(), t);
		}

	}

	@WebMethod(exclude = true)
	public amdocs.bl3g.sessions.interfaces.api.DocumentServices getRemote() {
		return remote;
	}

	@WebMethod(exclude = true)
	public void setRemote(amdocs.bl3g.sessions.interfaces.api.DocumentServices remote) {
		this.remote = remote;
	}

}
