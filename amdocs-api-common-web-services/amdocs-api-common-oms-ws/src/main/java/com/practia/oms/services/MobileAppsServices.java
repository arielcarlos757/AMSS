package com.practia.oms.services;

import static com.practia.oms.datatypes.transform.Transformer.CREATE_ORDER_FOR_MOBILEAPPS_OUTPUT;
import static com.practia.oms.datatypes.transform.Transformer.RETRIEVE_ORDER_ACTION_SUMMARY_OUTPUT;
import static com.practia.oms.datatypes.transform.Transformer.RETRIEVE_PRODUCTINFO_OUTPUT;
import static com.practia.oms.datatypes.transform.Transformer.SEARCH_ORDER_ACTION_OUTPUT;
import static com.practia.oms.datatypes.transform.Transformer.RETRIEVE_PRODUCT_OFFERING_FOR_REPLACE_OUTPUT;
import static com.practia.oms.datatypes.transform.Transformer.RETRIEVE_AVAILABLE_ADDITIONAL_SERVICES_OUTPUT;
import static com.practia.oms.datatypes.transform.Transformer.SUBMIT_ORDER_OUTPUT;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.amdocs.informationmodel.mobileapps.CreateOrderForMobileAppsInput;
import com.amdocs.informationmodel.mobileapps.RetrieveAvailableAdditionalServicesInput;
import com.amdocs.informationmodel.mobileapps.RetrieveOrderActionSummaryInput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductInfoInput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductOfferingForReplaceInput;
import com.amdocs.informationmodel.mobileapps.SearchOrderActionInput;
import com.amdocs.informationmodel.mobileapps.SubmitOrderInput;
import com.amdocs.services.customerdomain.customerorder.OrderingContext;
import com.practia.informationmodel.mobileapps.CreateOrderForMobileAppsOutputBean;
import com.practia.informationmodel.mobileapps.RetrieveAvailableAdditionalServicesOutputBean;
import com.practia.informationmodel.mobileapps.RetrieveOrderActionSummaryOutputBean;
import com.practia.informationmodel.mobileapps.RetrieveProductInfoOutputBean;
import com.practia.informationmodel.mobileapps.RetrieveProductOfferingForReplaceOutputBean;
import com.practia.informationmodel.mobileapps.SearchOrderActionOutputBean;
import com.practia.informationmodel.mobileapps.SubmitOrderOutputBean;
import com.practia.asm.core.user.services.ASM3UserServices;
import com.practia.oms.exception.AACWSException;

@WebService(serviceName = "MobileAppsServices", name = "MobileAppsServices", targetNamespace = "http://www.movistar.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class MobileAppsServices {

	private com.amdocs.services.mobileapps.ejb.MobileAppsServices remote;
	private ASM3UserServices ASM3UserServices;

	@WebMethod()
	@WebResult(name = "SearchOrderActionOutput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices")
	public SearchOrderActionOutputBean searchOrderAction(
			@WebParam(name = "OrderingContext", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") OrderingContext paramOrderingContext,
			@WebParam(name = "SearchOrderActionInput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") SearchOrderActionInput paramSearchOrderActionInput)
			throws AACWSException {
		try {
			if(paramOrderingContext != null)
				paramOrderingContext.setSecurityToken(ASM3UserServices.getTicket());

			return SEARCH_ORDER_ACTION_OUTPUT
										.process(remote
													.searchOrderAction(paramOrderingContext, 
															    paramSearchOrderActionInput));
		} catch (Throwable t) {
			throw new AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod()
	@WebResult(name = "RetrieveOrderActionSummaryOutput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices")
	public RetrieveOrderActionSummaryOutputBean retrieveOrderActionSummary(
			@WebParam(name = "OrderingContext", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") OrderingContext paramOrderingContext,
			@WebParam(name = "RetrieveOrderActionSummaryInput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") RetrieveOrderActionSummaryInput paramRetrieveOrderActionSummaryInput)
			throws AACWSException {
		try {
			if(paramOrderingContext != null)
				paramOrderingContext.setSecurityToken(ASM3UserServices.getTicket());

			return RETRIEVE_ORDER_ACTION_SUMMARY_OUTPUT
													.process(remote
															.retrieveOrderActionSummary(paramOrderingContext,
																	    paramRetrieveOrderActionSummaryInput));
		} catch (Throwable t) {
			throw new AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod()
	@WebResult(name = "RetrieveAvailableAdditionalServicesOutput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices")
	public RetrieveAvailableAdditionalServicesOutputBean retrieveAvailableAdditionalServices(
			@WebParam(name = "OrderingContext", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") OrderingContext paramOrderingContext,
			@WebParam(name = "RetrieveAvailableAdditionalServicesInput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") RetrieveAvailableAdditionalServicesInput paramRetrieveAvailableAdditionalServicesInput)
			throws AACWSException {
		try {
			if(paramOrderingContext != null)
				paramOrderingContext.setSecurityToken(ASM3UserServices.getTicket());

			return RETRIEVE_AVAILABLE_ADDITIONAL_SERVICES_OUTPUT
															.process(remote
																		.retrieveAvailableAdditionalServices(paramOrderingContext,
																					paramRetrieveAvailableAdditionalServicesInput));
		} catch (Throwable t) {
			throw new AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod()
	@WebResult(name = "RetrieveProductInfoOutput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices")
	public RetrieveProductInfoOutputBean retrieveProductInfo(
			@WebParam(name = "OrderingContext", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") OrderingContext paramOrderingContext,
			@WebParam(name = "RetrieveProductInfoInput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") RetrieveProductInfoInput paramRetrieveProductInfoInput)
			throws AACWSException {
		try {
			if(paramOrderingContext != null)
				paramOrderingContext.setSecurityToken(ASM3UserServices.getTicket());

			return RETRIEVE_PRODUCTINFO_OUTPUT
										.process(remote
													.retrieveProductInfo(paramOrderingContext,
																paramRetrieveProductInfoInput));
		} catch (Throwable t) {
			throw new AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod()
	@WebResult(name = "CreateOrderForMobileAppsOutput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices")
	public CreateOrderForMobileAppsOutputBean createOrder(
			@WebParam(name = "OrderingContext", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") OrderingContext paramOrderingContext,
			@WebParam(name = "CreateOrderForMobileAppsInput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") CreateOrderForMobileAppsInput paramCreateOrderForMobileAppsInput)
			throws AACWSException {
		try {
			if(paramOrderingContext != null)
				paramOrderingContext.setSecurityToken(ASM3UserServices.getTicket());

			return CREATE_ORDER_FOR_MOBILEAPPS_OUTPUT
												.process(remote
															.createOrder(paramOrderingContext,
														   paramCreateOrderForMobileAppsInput));
		} catch (Throwable t) {
			throw new AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod()
	@WebResult(name = "SubmitOrderOutput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices")
	public SubmitOrderOutputBean submitOrder(
			@WebParam(name = "OrderingContext", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") OrderingContext paramOrderingContext,
			@WebParam(name = "SubmitOrderInput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") SubmitOrderInput paramSubmitOrderInput)
			throws AACWSException {
		try {
			if(paramOrderingContext != null)
				paramOrderingContext.setSecurityToken(ASM3UserServices.getTicket());
			
			return SUBMIT_ORDER_OUTPUT
									.process(remote
												.submitOrder(paramOrderingContext, 
															paramSubmitOrderInput));
		} catch (Throwable t) {
			throw new AACWSException(t.getLocalizedMessage(), t);
		}
	}

	@WebMethod()
	@WebResult(name = "RetrieveProductOfferingForReplaceOutput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices")
	public RetrieveProductOfferingForReplaceOutputBean retrieveProductOfferingForReplace(
			@WebParam(name = "OrderingContext", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") OrderingContext paramOrderingContext,
			@WebParam(name = "RetrieveProductOfferingForReplaceInput", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/AMDOCS_OMS_MobileAppsServices") RetrieveProductOfferingForReplaceInput paramRetrieveProductOfferingForReplaceInput)
			throws AACWSException {
		try {
			if(paramOrderingContext != null)
				paramOrderingContext.setSecurityToken(ASM3UserServices.getTicket());
			return RETRIEVE_PRODUCT_OFFERING_FOR_REPLACE_OUTPUT
														.process(remote
																	.retrieveProductOfferingForReplace(paramOrderingContext,
																				paramRetrieveProductOfferingForReplaceInput));
		} catch (Throwable t) {
			throw new AACWSException(t.getLocalizedMessage(), t);
		}

	}

	@WebMethod(exclude = true)
	public com.amdocs.services.mobileapps.ejb.MobileAppsServices getRemote() {
		return remote;
	}

	@WebMethod(exclude = true)
	public void setRemote(com.amdocs.services.mobileapps.ejb.MobileAppsServices remote) {
		this.remote = remote;
	}

	@WebMethod(exclude = true)
	public ASM3UserServices getASM3UserServices() {
		return ASM3UserServices;
	}

	@WebMethod(exclude = true)
	public void setASM3UserServices(ASM3UserServices aSM3UserServices) {
		ASM3UserServices = aSM3UserServices;
	}
}
