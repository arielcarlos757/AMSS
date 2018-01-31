package com.practia.oms;

import java.rmi.RemoteException;

import javax.ejb.CreateException;

import amdocs.mock.ejb.APIEJBMock;

import com.amdocs.services.common.MandatoryParameterMissingException;
import com.amdocs.services.customerdomain.customerorder.OrderingContext;
import com.amdocs.services.productdomain.lightweight.ConsultServicesRetrieveAvailableServicesResults;
import com.amdocs.services.productdomain.lightweight.ConsultServicesRetrieveFNFDetailsResults;
import com.amdocs.services.productdomain.lightweight.ConsultServicesRetrieveImplementedServicesResults;
import com.amdocs.services.productdomain.lightweight.ConsultServicesRetrieveLocationDetailsResults;
import com.amdocs.services.productdomain.lightweight.ConsultServicesRetrieveProductHeaderResults;
import com.amdocs.services.productdomain.lightweight.ConsultServicesRetrieveProductOrderStatusResults;
import com.amdocs.services.productdomain.lightweight.ConsultServicesRetrieveServiceAttributesResults;
import com.amdocs.services.productdomain.lightweight.ConsultServicesRetrieveServicesByMaskResults;
import com.amdocs.services.productdomain.lightweight.ejb.ConsultServices;
import com.amdocs.services.productdomain.lightweight.ejb.ConsultServicesHome;
import com.amdocs.services.productdomain.lightweight.lib.AttributeDataTypeMask;
import com.amdocs.services.productdomain.lightweight.lib.FNFFilterInfo;
import com.amdocs.services.productdomain.lightweight.lib.GetAttributesByComponentIDInput;
import com.amdocs.services.productdomain.lightweight.lib.GetAttributesByComponentIDOutput;
import com.amdocs.services.productdomain.lightweight.lib.ProductStatusOutput;
import com.amdocs.services.productdomain.lightweight.lib.ResponseStatus;
import com.amdocs.services.productdomain.lightweight.lib.RetrieveLocationDetailsInput;
import com.amdocs.services.productdomain.lightweight.lib.RetrieveTechnicalDetailsByAccessInput;
import com.amdocs.services.productdomain.lightweight.lib.RetrieveTechnicalDetailsByAccessOutput;
import com.amdocs.services.productdomain.lightweight.lib.ServiceFilterInfo;
import com.amdocs.services.productdomain.lightweight.lib.ServiceID;
import com.amdocs.services.productdomain.lightweight.lib.ServiceMask;
import com.amdocs.services.productdomain.lightweight.lib.ValidateAdditionalPrePaidSubscribersInput;
import com.amdocs.services.productdomain.lightweight.lib.ValidateAdditionalPrePaidSubscribersOutput;

public class ConsultServicesBean extends APIEJBMock implements ConsultServices,
		ConsultServicesHome {

	private static final long serialVersionUID = 1L;
	
	@Override
	public ConsultServices create() throws CreateException, RemoteException {
		return new ConsultServicesBean();
	}

	@Override
	public GetAttributesByComponentIDOutput GetAttributesByComponentID(
			OrderingContext arg0, GetAttributesByComponentIDInput arg1)
			throws RemoteException {
		// TODO Auto-generated method stub
		GetAttributesByComponentIDOutput dt = new GetAttributesByComponentIDOutput();
		dt.setCustomerIDX9("CustomerID mock");
		ResponseStatus responseStatus = new ResponseStatus();
		responseStatus.setStatus(false);
		responseStatus.setRejectCode("48000108");
		responseStatus.setRejectDescription("Rechazar todas las acciones de configuraci�n desdeunknowns conunknowns fallido cid");
		dt.setResponseStatusX9(responseStatus);
		dt.setServiceIDListX9(0, new ServiceID());
		return dt;
	}

	@Override
	public ConsultServicesRetrieveAvailableServicesResults retrieveAvailableServices(
			OrderingContext arg0, String arg1, String arg2,
			ServiceFilterInfo[] arg3) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultServicesRetrieveFNFDetailsResults retrieveFNFDetails(
			OrderingContext arg0, String arg1, String arg2, FNFFilterInfo[] arg3)
			throws MandatoryParameterMissingException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultServicesRetrieveImplementedServicesResults retrieveImplementedServices(
			OrderingContext arg0, String arg1, String arg2,
			ServiceFilterInfo[] arg3) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultServicesRetrieveLocationDetailsResults retrieveLocationDetails(
			OrderingContext arg0, RetrieveLocationDetailsInput arg1)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultServicesRetrieveProductHeaderResults retrieveProductHeader(
			OrderingContext arg0, String arg1)
			throws MandatoryParameterMissingException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultServicesRetrieveProductOrderStatusResults retrieveProductOrderStatus(
			OrderingContext arg0, String arg1, String arg2)
			throws MandatoryParameterMissingException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductStatusOutput retrieveProductStatus(OrderingContext arg0,
			String arg1) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultServicesRetrieveServiceAttributesResults retrieveServiceAttributes(
			OrderingContext arg0, String arg1, String arg2,
			AttributeDataTypeMask arg3)
			throws MandatoryParameterMissingException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultServicesRetrieveServicesByMaskResults retrieveServicesByMask(
			OrderingContext arg0, String arg1, String arg2, ServiceMask arg3,
			ServiceMask arg4, ServiceFilterInfo[] arg5) throws RemoteException {
                ConsultServicesRetrieveServicesByMaskResults response = new
                        ConsultServicesRetrieveServicesByMaskResults();
                ResponseStatus responseStatus = new ResponseStatus();
                responseStatus.setRejectCode("reject code mock");
                responseStatus.setRejectDescription("description mock");
                responseStatus.setStatus(false);
                response.setResponseStatus(responseStatus);
		return response;
	}

	@Override
	public RetrieveTechnicalDetailsByAccessOutput retrieveTechnicalDetailsByAccess(
			OrderingContext arg0, RetrieveTechnicalDetailsByAccessInput arg1)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValidateAdditionalPrePaidSubscribersOutput validateAdditionalPrePaidSubscribers(
			OrderingContext arg0, ValidateAdditionalPrePaidSubscribersInput arg1)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
