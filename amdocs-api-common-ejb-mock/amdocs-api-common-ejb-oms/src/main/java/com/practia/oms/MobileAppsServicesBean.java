package com.practia.oms;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.ejb.CreateException;

import com.amdocs.informationmodel.mobileapps.AdditionalService;
import com.amdocs.informationmodel.mobileapps.AdditionalServicesComponent;
import com.amdocs.informationmodel.mobileapps.Attribute;
import com.amdocs.informationmodel.mobileapps.CreateOrderForMobileAppsInput;
import com.amdocs.informationmodel.mobileapps.CreateOrderForMobileAppsOutput;
import com.amdocs.informationmodel.mobileapps.EquipmentDetails;
import com.amdocs.informationmodel.mobileapps.OrderActionHeader;
import com.amdocs.informationmodel.mobileapps.OrderActionSummary;
import com.amdocs.informationmodel.mobileapps.PriceInfo;
import com.amdocs.informationmodel.mobileapps.ProductInfo;
import com.amdocs.informationmodel.mobileapps.ProductOffering;
import com.amdocs.informationmodel.mobileapps.ResponseStatus;
import com.amdocs.informationmodel.mobileapps.RetrieveAvailableAdditionalServicesInput;
import com.amdocs.informationmodel.mobileapps.RetrieveAvailableAdditionalServicesOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveAvailableOTTServicesInput;
import com.amdocs.informationmodel.mobileapps.RetrieveAvailableOTTServicesOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveDeviceInfoInput;
import com.amdocs.informationmodel.mobileapps.RetrieveDeviceInfoOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveImplementedOTTServicesInput;
import com.amdocs.informationmodel.mobileapps.RetrieveImplementedOTTServicesOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveOTTOrderSummaryInput;
import com.amdocs.informationmodel.mobileapps.RetrieveOTTOrderSummaryOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveOrderActionSummaryInput;
import com.amdocs.informationmodel.mobileapps.RetrieveOrderActionSummaryOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductInfoInput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductInfoOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductOfferingDetailsInput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductOfferingDetailsOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductOfferingForReplaceInput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductOfferingForReplaceOutput;
import com.amdocs.informationmodel.mobileapps.SearchOrderActionInput;
import com.amdocs.informationmodel.mobileapps.SearchOrderActionOutput;
import com.amdocs.informationmodel.mobileapps.ShippingDetails;
import com.amdocs.informationmodel.mobileapps.SubmitOrderInput;
import com.amdocs.informationmodel.mobileapps.SubmitOrderOutput;
import com.amdocs.services.common.ApplicationContext;
import com.amdocs.services.common.SalesContext;
import com.amdocs.services.customerdomain.customerorder.OrderingContext;
import com.amdocs.services.mobileapps.ejb.MobileAppsServices;
import com.amdocs.services.mobileapps.ejb.MobileAppsServicesHome;

import amdocs.mock.ejb.APIEJBMock;

public class MobileAppsServicesBean extends APIEJBMock implements MobileAppsServices, MobileAppsServicesHome {

	private static final long serialVersionUID = 1L;
	
	@Override
	public MobileAppsServices create() throws CreateException, RemoteException {
		return new MobileAppsServicesBean();
	}

	@Override
	public CreateOrderForMobileAppsOutput createOrder(OrderingContext arg0, CreateOrderForMobileAppsInput arg1)
			throws RemoteException {
		if(arg0 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "OrderingContext"));
		}

		if(arg1 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "RetrieveAvailableAdditionalServicesInput"));
		}
		
		if(arg0 != null && (((ApplicationContext)arg0).getLocaleString() == null || "".equals(((ApplicationContext)arg0).getLocaleString()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "LocaleString"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSalesChannel() == null || "".equals(((SalesContext)arg0).getSalesChannel()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SalesChannel"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSecurityToken() == null || "".equals(((SalesContext)arg0).getSecurityToken()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SecurityToken"));
		}

		if("1145678810".equals(arg1.getProductServiceIDX9())) {
			CreateOrderForMobileAppsOutput response =
					new CreateOrderForMobileAppsOutput();
			ResponseStatus status = new ResponseStatus();
			status.setRejectCodeX9("0");
			status.setStatusX9(true);
			status.setRejectDescriptionX9("success");
			
			response.setResponseStatusX9(status );
			
			response.setOrderActionIDX9("add");
			response.setOrderIDX9("1");
			return response;
		}
		
		if("1145678813".equals(arg1.getProductServiceIDX9())) {
			CreateOrderForMobileAppsOutput response =
					new CreateOrderForMobileAppsOutput();
			ResponseStatus status = new ResponseStatus();
			status.setRejectCodeX9("0");
			status.setStatusX9(true);
			status.setRejectDescriptionX9("success");
			
			response.setResponseStatusX9(status );
			
			response.setOrderActionIDX9("change");
			response.setOrderIDX9("4");
			return response;
		}
		
		if("1145678812".equals(arg1.getProductServiceIDX9())) {
			CreateOrderForMobileAppsOutput response =
					new CreateOrderForMobileAppsOutput();
			ResponseStatus status = new ResponseStatus();
			status.setRejectCodeX9("0");
			status.setStatusX9(true);
			status.setRejectDescriptionX9("success");
			
			response.setResponseStatusX9(status );
			
			response.setOrderActionIDX9("change");
			response.setOrderIDX9("3");
			return response;
		}
		
		if("1145678811".equals(arg1.getProductServiceIDX9())) {
			CreateOrderForMobileAppsOutput response =
					new CreateOrderForMobileAppsOutput();
			ResponseStatus status = new ResponseStatus();
			status.setRejectCodeX9("0");
			status.setStatusX9(true);
			status.setRejectDescriptionX9("success");
			
			response.setResponseStatusX9(status );
			
			response.setOrderActionIDX9("delete");
			response.setOrderIDX9("2");
			return response;
		}
		
		if("1145678815".equals(arg1.getProductServiceIDX9())){
			throw new RemoteException(
					String.format("1000026 Create order: Failed. Order could not be created. Please try later or contact your system administrator.", arg1.getProductServiceIDX9()));
		}
		
		if("1145678816".equals(arg1.getProductServiceIDX9())){
			throw new RemoteException(
					String.format("48009253 Equipment is not available in SAP"));
		}
		
		throw new RemoteException(
				String.format("1000375 The following assigned products were not retrieved: %s.", arg1.getProductServiceIDX9()));

	}

	@Override
	public RetrieveAvailableAdditionalServicesOutput retrieveAvailableAdditionalServices(OrderingContext arg0,
			RetrieveAvailableAdditionalServicesInput arg1) throws RemoteException {
		
		if(arg0 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "OrderingContext"));
		}

		if(arg1 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "RetrieveAvailableAdditionalServicesInput"));
		}
		
		if(arg0 != null && (((ApplicationContext)arg0).getLocaleString() == null || "".equals(((ApplicationContext)arg0).getLocaleString()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "LocaleString"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSalesChannel() == null || "".equals(((SalesContext)arg0).getSalesChannel()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SalesChannel"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSecurityToken() == null || "".equals(((SalesContext)arg0).getSecurityToken()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SecurityToken"));
		}

		if(arg1 != null && (arg1.getProductServiceIDX9() == null || "".equals(arg1.getProductServiceIDX9()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "ProductServiceIDX9"));
		}
		
		if("1154889722 ".equals(arg1.getProductServiceIDX9())) {
			throw new RemoteException(
					String.format("48009252 %s was not retrieved from Sales Engine.", arg1.getProductServiceIDX9()));
		}

		if("1154889720".equals(arg1.getProductServiceIDX9())) {
			RetrieveAvailableAdditionalServicesOutput response = 
					new RetrieveAvailableAdditionalServicesOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setStatusX9(true);
			responseStatus.setRejectDescriptionX9("success");
			
			response.setResponseStatusX9(responseStatus);
			return response;
		}
		
		if("1154889719".equals(arg1.getProductServiceIDX9())) {
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setStatusX9(true);
			responseStatus.setRejectDescriptionX9("success");
			
			AdditionalServicesComponent[] additionalServices = new AdditionalServicesComponent[1];
			additionalServices[0] = new AdditionalServicesComponent();
			additionalServices[0].setNameX9("Voice&SMS");
			AdditionalService[] services = new AdditionalService[1];
			services[0] = new AdditionalService();
			services[0].setCIDX9("999");
			services[0].setNameX9("Voice&SMS");
			services[0].setDescriptionX9("Free 500 sms and 100 min voice");
			services[0].setIsMandatoryX9(true);
			
			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(260.00);
			priceInfo[0].setTypeX9("RC");
			priceInfo[0].setCurrencyX9("ARS");
			services[0].setPriceInfoX9(priceInfo);
			
			additionalServices[0].setAdditionalServicesX9(services);
			RetrieveAvailableAdditionalServicesOutput response = 
					new RetrieveAvailableAdditionalServicesOutput();

			response.setResponseStatusX9(responseStatus);
			response.setAdditionalServicesComponentsX9(additionalServices);
			return response;
		}
		
		throw new RemoteException(
				String.format("1000375 The following assigned products were not retrieved: %s.", arg1.getProductServiceIDX9()));
	}

	@Override
	public RetrieveDeviceInfoOutput retrieveDeviceInfo(OrderingContext arg0, RetrieveDeviceInfoInput arg1)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetrieveOrderActionSummaryOutput retrieveOrderActionSummary(OrderingContext arg0,
			RetrieveOrderActionSummaryInput arg1) throws RemoteException {
		if(arg0 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "OrderingContext"));
		}

		if(arg1 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "RetrieveOrderActionSummaryInput"));
		}
		
		if(arg0 != null && (((ApplicationContext)arg0).getLocaleString() == null || "".equals(((ApplicationContext)arg0).getLocaleString()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "LocaleString"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSalesChannel() == null || "".equals(((SalesContext)arg0).getSalesChannel()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SalesChannel"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSecurityToken() == null || "".equals(((SalesContext)arg0).getSecurityToken()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SecurityToken"));
		}

		if(arg1 != null && (arg1.getOrderActionIDX9() == null || "".equals(arg1.getOrderActionIDX9()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "getOrderActionIDX9"));
		}
		
		if("58".equals(arg1.getOrderActionIDX9())) {
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setRejectDescriptionX9("none");
			responseStatus.setStatusX9(true);
			
			OrderActionSummary order = new OrderActionSummary();
			OrderActionHeader orderActionHeader = new OrderActionHeader();
			orderActionHeader.setOrderActionIDX9(arg1.getOrderActionIDX9());
			orderActionHeader.setProductServiceIDX9("1166764532");
			orderActionHeader.setActionX9("Provide");
			orderActionHeader.setStatusX9("Done");
			orderActionHeader.setSalesChannelX9("CC");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/09/09";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			orderActionHeader.setDateX9(date);
			
			ShippingDetails shippingDetails = new ShippingDetails();
			shippingDetails.setDeliveryMethodX9("IS");
			order.setShippingDetailsX9(shippingDetails);
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9("1166764532");
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("NombreProducto");
			productOffering.setCIDX9("CatalogID");
			
			productInfo.setProductOfferingX9(productOffering);
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("nombre");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setCIDX9("44553");
			additionalServices[0].setNameX9("nombre");
			additionalServices[0].setIsMandatoryX9(true);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
					
					
			productInfo.setAdditionalServicesComponentsX9(additionals );
			EquipmentDetails[] details = new EquipmentDetails[1];
			details[0] = new EquipmentDetails();
			details[0].setTypeX9("Device");
			productInfo.setEquipmentDetailsX9(details);
			Attribute[] attributes = new Attribute[1];
			attributes[0] = new Attribute();
			attributes[0].setNameX9("nombre");
			attributes[0].setValueX9("valor");
			details[0].setAttributesX9(attributes);
			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(267.78);
			priceInfo[0].setTypeX9("RC");
			priceInfo[0].setCurrencyX9("ARS");
			
			
			details[0].setPriceInfoX9(priceInfo );
			
			
			RetrieveOrderActionSummaryOutput response = new RetrieveOrderActionSummaryOutput();
			
			order.setProductInfoX9(productInfo);
			order.setOrderActionHeaderX9(orderActionHeader);
			response.setResponseStatusX9(responseStatus);
			response.setOrderActionSummaryX9(order);
			return response;
		}
		
		if("57".equals(arg1.getOrderActionIDX9())) {
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setRejectDescriptionX9("none");
			responseStatus.setStatusX9(true);
			
			OrderActionSummary order = new OrderActionSummary();
			OrderActionHeader orderActionHeader = new OrderActionHeader();
			orderActionHeader.setOrderActionIDX9(arg1.getOrderActionIDX9());
			orderActionHeader.setProductServiceIDX9("1166764531");
			orderActionHeader.setActionX9("Provide");
			orderActionHeader.setStatusX9("Delivery");
			orderActionHeader.setSalesChannelX9("CC");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/09/09";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			orderActionHeader.setDateX9(date);
			
			ShippingDetails shippingDetails = new ShippingDetails();
			shippingDetails.setDeliveryMethodX9("SP");
			order.setShippingDetailsX9(shippingDetails);
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9("1166764531");
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("NombreProducto");
			productOffering.setCIDX9("CatalogID");
			
			productInfo.setProductOfferingX9(productOffering);
			
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("nombre");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setCIDX9("44553");
			additionalServices[0].setNameX9("nombre");
			additionalServices[0].setIsMandatoryX9(false);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
					
					
			productInfo.setAdditionalServicesComponentsX9(additionals );
			EquipmentDetails[] details = new EquipmentDetails[1];
			details[0] = new EquipmentDetails();
			details[0].setTypeX9("Device");
			productInfo.setEquipmentDetailsX9(details);
			Attribute[] attributes = new Attribute[1];
			attributes[0] = new Attribute();
			attributes[0].setNameX9("nombre");
			attributes[0].setValueX9("valor");
			details[0].setAttributesX9(attributes);
			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(189.99);
			priceInfo[0].setTypeX9("RC");
			priceInfo[0].setCurrencyX9("ARS");
			
			
			details[0].setPriceInfoX9(priceInfo );
			
			
			RetrieveOrderActionSummaryOutput response = new RetrieveOrderActionSummaryOutput();
			order.setProductInfoX9(productInfo);
			order.setOrderActionHeaderX9(orderActionHeader);
			response.setResponseStatusX9(responseStatus);
			response.setOrderActionSummaryX9(order);
			return response;
		}
		
		if("59".equals(arg1.getOrderActionIDX9())) {
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setRejectDescriptionX9("none");
			responseStatus.setStatusX9(true);
			
			OrderActionSummary order = new OrderActionSummary();
			OrderActionHeader orderActionHeader = new OrderActionHeader();
			orderActionHeader.setOrderActionIDX9(null);
			orderActionHeader.setProductServiceIDX9("1166764531");
			orderActionHeader.setActionX9("Provide");
			orderActionHeader.setStatusX9("Delivery");
			orderActionHeader.setSalesChannelX9("CC");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/09/09";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			orderActionHeader.setDateX9(date);
			
			ShippingDetails shippingDetails = new ShippingDetails();
			shippingDetails.setDeliveryMethodX9("SP");
			order.setShippingDetailsX9(shippingDetails);
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9("1166764531");
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("NombreProducto");
			productOffering.setCIDX9("CatalogID");
			
			productInfo.setProductOfferingX9(productOffering);
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("nombre");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setCIDX9("44553");
			additionalServices[0].setNameX9("nombre");
			additionalServices[0].setIsMandatoryX9(false);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
					
					
			productInfo.setAdditionalServicesComponentsX9(additionals );
			EquipmentDetails[] details = new EquipmentDetails[1];
			details[0] = new EquipmentDetails();
			details[0].setTypeX9("Device");
			productInfo.setEquipmentDetailsX9(details);
			Attribute[] attributes = new Attribute[1];
			attributes[0] = new Attribute();
			attributes[0].setNameX9("nombre");
			attributes[0].setValueX9("valor");
			details[0].setAttributesX9(attributes);
			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(189.99);
			priceInfo[0].setTypeX9("RC");
			priceInfo[0].setCurrencyX9("ARS");
			
			
			details[0].setPriceInfoX9(priceInfo );
			
			
			RetrieveOrderActionSummaryOutput response = new RetrieveOrderActionSummaryOutput();
			
			order.setProductInfoX9(productInfo);
			order.setOrderActionHeaderX9(orderActionHeader);
			response.setResponseStatusX9(responseStatus);
			response.setOrderActionSummaryX9(order);
			return response;
		}
		
		if("60".equals(arg1.getOrderActionIDX9())) {
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setRejectDescriptionX9("none");
			responseStatus.setStatusX9(true);
			
			OrderActionSummary order = new OrderActionSummary();
			OrderActionHeader orderActionHeader = new OrderActionHeader();
			orderActionHeader.setOrderActionIDX9(arg1.getOrderActionIDX9());
			orderActionHeader.setProductServiceIDX9("1166764531");
			orderActionHeader.setActionX9("Provide");
			orderActionHeader.setStatusX9("Delivery");
			orderActionHeader.setSalesChannelX9("CC");
			orderActionHeader.setDateX9(null);
			
			ShippingDetails shippingDetails = new ShippingDetails();
			shippingDetails.setDeliveryMethodX9("SP");
			order.setShippingDetailsX9(shippingDetails);
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9("1166764531");
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("NombreProducto");
			productOffering.setCIDX9("CatalogID");
			
			productInfo.setProductOfferingX9(productOffering);
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("nombre");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setCIDX9("44553");
			additionalServices[0].setNameX9("nombre");
			additionalServices[0].setIsMandatoryX9(false);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
					
					
			productInfo.setAdditionalServicesComponentsX9(additionals );
			EquipmentDetails[] details = new EquipmentDetails[1];
			details[0] = new EquipmentDetails();
			details[0].setTypeX9("Device");
			productInfo.setEquipmentDetailsX9(details);
			Attribute[] attributes = new Attribute[1];
			attributes[0] = new Attribute();
			attributes[0].setNameX9("nombre");
			attributes[0].setValueX9("valor");
			details[0].setAttributesX9(attributes);
			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(189.99);
			priceInfo[0].setTypeX9("RC");
			priceInfo[0].setCurrencyX9("ARS");
			
			
			details[0].setPriceInfoX9(priceInfo );
			
			
			RetrieveOrderActionSummaryOutput response = new RetrieveOrderActionSummaryOutput();
			order.setProductInfoX9(productInfo);
			order.setOrderActionHeaderX9(orderActionHeader);
			response.setResponseStatusX9(responseStatus);
			response.setOrderActionSummaryX9(order);
			return response;
		}
		
		if("61".equals(arg1.getOrderActionIDX9())) {
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setRejectDescriptionX9("none");
			responseStatus.setStatusX9(true);
			
			OrderActionSummary order = new OrderActionSummary();
			OrderActionHeader orderActionHeader = new OrderActionHeader();
			orderActionHeader.setOrderActionIDX9(null);
			orderActionHeader.setProductServiceIDX9("1166764531");
			orderActionHeader.setActionX9("Provide");
			orderActionHeader.setStatusX9("Delivery");
			orderActionHeader.setSalesChannelX9("CC");
			orderActionHeader.setDateX9(null);
			
			ShippingDetails shippingDetails = new ShippingDetails();
			shippingDetails.setDeliveryMethodX9("SP");
			order.setShippingDetailsX9(shippingDetails);
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9("1166764531");
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("NombreProducto");
			productOffering.setCIDX9("CatalogID");
			
			productInfo.setProductOfferingX9(productOffering);
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("nombre");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setCIDX9("44553");
			additionalServices[0].setNameX9("nombre");
			additionalServices[0].setIsMandatoryX9(false);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
					
					
			productInfo.setAdditionalServicesComponentsX9(additionals );
			EquipmentDetails[] details = new EquipmentDetails[1];
			details[0] = new EquipmentDetails();
			details[0].setTypeX9("Device");
			productInfo.setEquipmentDetailsX9(details);
			Attribute[] attributes = new Attribute[1];
			attributes[0] = new Attribute();
			attributes[0].setNameX9("nombre");
			attributes[0].setValueX9("valor");
			details[0].setAttributesX9(attributes);
			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(189.99);
			priceInfo[0].setTypeX9("RC");
			priceInfo[0].setCurrencyX9("ARS");
			
			
			details[0].setPriceInfoX9(priceInfo );
			
			
			RetrieveOrderActionSummaryOutput response = new RetrieveOrderActionSummaryOutput();
			
			order.setProductInfoX9(productInfo);
			order.setOrderActionHeaderX9(orderActionHeader);
			response.setResponseStatusX9(responseStatus);
			response.setOrderActionSummaryX9(order);
			return response;
		}
		
		if("62".equals(arg1.getOrderActionIDX9())) {
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setRejectDescriptionX9("none");
			responseStatus.setStatusX9(true);
			
			OrderActionSummary order = new OrderActionSummary();
			OrderActionHeader orderActionHeader = new OrderActionHeader();
			orderActionHeader.setOrderActionIDX9(arg1.getOrderActionIDX9());
			orderActionHeader.setProductServiceIDX9("1166764531");
			orderActionHeader.setActionX9("Provide");
			orderActionHeader.setStatusX9("Delivery");
			orderActionHeader.setSalesChannelX9("CC");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/09/09";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			orderActionHeader.setDateX9(date);
			
			ShippingDetails shippingDetails = new ShippingDetails();
			shippingDetails.setDeliveryMethodX9("SP");
			order.setShippingDetailsX9(shippingDetails);
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9("1166764531");
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("NombreProducto");
			productOffering.setCIDX9("CatalogID");
			
			productInfo.setProductOfferingX9(productOffering);
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("nombre");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setCIDX9("44553");
			additionalServices[0].setNameX9("nombre");
			additionalServices[0].setIsMandatoryX9(false);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
					
					
			productInfo.setAdditionalServicesComponentsX9(additionals );
			EquipmentDetails[] details = new EquipmentDetails[1];
			details[0] = new EquipmentDetails();
			details[0].setTypeX9("Device");
			productInfo.setEquipmentDetailsX9(details);
			Attribute[] attributes = new Attribute[1];
			attributes[0] = new Attribute();
			attributes[0].setNameX9("nombre");
			attributes[0].setValueX9("valor");
			details[0].setAttributesX9(attributes);
			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(0);
			priceInfo[0].setTypeX9("RC");
			priceInfo[0].setCurrencyX9("ARS");
			
			
			details[0].setPriceInfoX9(priceInfo );
			
			
			RetrieveOrderActionSummaryOutput response = new RetrieveOrderActionSummaryOutput();
			
			order.setProductInfoX9(productInfo);
			order.setOrderActionHeaderX9(orderActionHeader);
			response.setResponseStatusX9(responseStatus);
			response.setOrderActionSummaryX9(order);
			return response;
		}
		
		if("63".equals(arg1.getOrderActionIDX9())) {
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setRejectDescriptionX9("none");
			responseStatus.setStatusX9(true);
			
			OrderActionSummary order = new OrderActionSummary();
			OrderActionHeader orderActionHeader = new OrderActionHeader();
			orderActionHeader.setOrderActionIDX9(arg1.getOrderActionIDX9());
			orderActionHeader.setProductServiceIDX9("1166764531");
			orderActionHeader.setActionX9("Provide");
			orderActionHeader.setStatusX9("Delivery");
			orderActionHeader.setSalesChannelX9("CC");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			orderActionHeader.setDateX9(null);
			
			ShippingDetails shippingDetails = new ShippingDetails();
			shippingDetails.setDeliveryMethodX9("SP");
			order.setShippingDetailsX9(shippingDetails);
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9("1166764531");
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("NombreProducto");
			productOffering.setCIDX9("CatalogID");
			
			productInfo.setProductOfferingX9(productOffering);
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("nombre");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setCIDX9("44553");
			additionalServices[0].setNameX9("nombre");
			additionalServices[0].setIsMandatoryX9(false);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
					
					
			productInfo.setAdditionalServicesComponentsX9(additionals );
			EquipmentDetails[] details = new EquipmentDetails[1];
			details[0] = new EquipmentDetails();
			details[0].setTypeX9("Device");
			productInfo.setEquipmentDetailsX9(details);
			Attribute[] attributes = new Attribute[1];
			attributes[0] = new Attribute();
			attributes[0].setNameX9("nombre");
			attributes[0].setValueX9("valor");
			details[0].setAttributesX9(attributes);
			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setTypeX9("RC");
			priceInfo[0].setCurrencyX9("ARS");
			
			
			details[0].setPriceInfoX9(priceInfo );
			
			
			RetrieveOrderActionSummaryOutput response = new RetrieveOrderActionSummaryOutput();
			
			order.setProductInfoX9(productInfo);
			order.setOrderActionHeaderX9(orderActionHeader);
			response.setResponseStatusX9(responseStatus);
			response.setOrderActionSummaryX9(order);
			return response;
		}
		
		throw new RemoteException(
				String.format("1000685 The %s order action was not found.", arg1.getOrderActionIDX9()));
	}

	@Override
	public RetrieveProductInfoOutput retrieveProductInfo(OrderingContext arg0, RetrieveProductInfoInput arg1)
			throws RemoteException {
		if(arg0 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "OrderingContext"));
		}

		if(arg1 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "RetrieveAvailableAdditionalServicesInput"));
		}
		
		if(arg0 != null && (((ApplicationContext)arg0).getLocaleString() == null || "".equals(((ApplicationContext)arg0).getLocaleString()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "LocaleString"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSalesChannel() == null || "".equals(((SalesContext)arg0).getSalesChannel()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SalesChannel"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSecurityToken() == null || "".equals(((SalesContext)arg0).getSecurityToken()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SecurityToken"));
		}

		if(arg1 != null && (arg1.getProductServiceIDX9() == null || "".equals(arg1.getProductServiceIDX9()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "ProductServiceIDX9"));
		}

		if("1156784422".equals(arg1.getProductServiceIDX9())) {
			throw new RemoteException(
					String.format("48009252 %s was not retrieved from Sales Engine.", arg1.getProductServiceIDX9()));
		}
		
		if("1156784421".equals(arg1.getProductServiceIDX9())) {
			throw new RemoteException(
					String.format("1000375 The following assigned products were not retrieved: %s.", arg1.getProductServiceIDX9()));
		}
		
		if("1156784420".equals(arg1.getProductServiceIDX9())) {
			RetrieveProductInfoOutput response = 
					new RetrieveProductInfoOutput();
			
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setStatusX9(true);
			responseStatus.setRejectDescriptionX9("success");
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9(arg1.getProductServiceIDX9());
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("Voice");
			productOffering.setDescriptionX9("unlimited voice service");
			productOffering.setCIDX9("34567");
			
			productInfo.setProductOfferingX9(productOffering);

			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(200);
			priceInfo[0].setTypeX9("RC");
			priceInfo[0].setCurrencyX9("ARS");
			
			Attribute[] attributes = new Attribute[1];
			attributes[0] = new Attribute();
			attributes[0].setNameX9("nombre");
			attributes[0].setValueX9("valor");
			
			EquipmentDetails[] details = new EquipmentDetails[1];
			details[0] = new EquipmentDetails();
			details[0].setTypeX9("Device");
			details[0].setAttributesX9(attributes);
			
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("Data");
			additionals[0].setActionX9("Provide");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setCIDX9("445");
			additionalServices[0].setNameX9("Data");
			additionalServices[0].setDescriptionX9("2 gb data");
			additionalServices[0].setIsMandatoryX9(true);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
			
			
			productInfo.setEquipmentDetailsX9(details);
			productInfo.setAdditionalServicesComponentsX9(additionals);
			
			response.setResponseStatusX9(responseStatus);
			response.setProductInfoX9(productInfo);
			return response;
		}
		
		if("1156784423".equals(arg1.getProductServiceIDX9())) {
			RetrieveProductInfoOutput response = 
					new RetrieveProductInfoOutput();
			
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setStatusX9(true);
			responseStatus.setRejectDescriptionX9("success");
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9(arg1.getProductServiceIDX9());
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("Voice");
			productOffering.setCIDX9("34567");
			
			productInfo.setProductOfferingX9(productOffering);
			
			response.setResponseStatusX9(responseStatus);
			response.setProductInfoX9(productInfo);
			return response;
		}
		
		if("1156784424".equals(arg1.getProductServiceIDX9())) {
			RetrieveProductInfoOutput response = 
					new RetrieveProductInfoOutput();
			
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setStatusX9(true);
			responseStatus.setRejectDescriptionX9("success");
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9(arg1.getProductServiceIDX9());
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("Voice");
			productOffering.setCIDX9("34567");
			
			productInfo.setProductOfferingX9(productOffering);

			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(0.1);
			priceInfo[0].setCurrencyX9("ARS");
			
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("Data");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setApIdX9("334");
			additionalServices[0].setCIDX9("445");
			additionalServices[0].setNameX9("Data");
			additionalServices[0].setDescriptionX9("2 gb data");
			additionalServices[0].setActionX9("provide");
			additionalServices[0].setIsMandatoryX9(true);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
			
			productInfo.setAdditionalServicesComponentsX9(additionals);
			
			response.setResponseStatusX9(responseStatus);
			response.setProductInfoX9(productInfo);
			return response;
		}
		
		if("1156784425".equals(arg1.getProductServiceIDX9())) {
			RetrieveProductInfoOutput response = 
					new RetrieveProductInfoOutput();
			
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setStatusX9(true);
			responseStatus.setRejectDescriptionX9("success");
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9(arg1.getProductServiceIDX9());
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("Voice");
			productOffering.setCIDX9("34567");
			
			productInfo.setProductOfferingX9(productOffering);

			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setCurrencyX9("ARS");
			priceInfo[0].setTypeX9("RC");
			
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("Data");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setApIdX9("334");
			additionalServices[0].setCIDX9("445");
			additionalServices[0].setNameX9("Data");
			additionalServices[0].setDescriptionX9("2 gb data");
			additionalServices[0].setActionX9("provide");
			additionalServices[0].setIsMandatoryX9(true);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
			
			productInfo.setAdditionalServicesComponentsX9(additionals);
			
			response.setResponseStatusX9(responseStatus);
			response.setProductInfoX9(productInfo);
			return response;
		}
		
		
		if("1156784426".equals(arg1.getProductServiceIDX9())) {
			RetrieveProductInfoOutput response = 
					new RetrieveProductInfoOutput();
			
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setRejectCodeX9("0");
			responseStatus.setStatusX9(true);
			responseStatus.setRejectDescriptionX9("success");
			
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductServiceIDX9(arg1.getProductServiceIDX9());
			
			ProductOffering productOffering = new ProductOffering();
			productOffering.setNameX9("Voice");
			productOffering.setCIDX9("34567");
			
			productInfo.setProductOfferingX9(productOffering);

			PriceInfo[] priceInfo = new PriceInfo[1];
			priceInfo[0] = new PriceInfo();
			priceInfo[0].setValueX9(0.1);
			priceInfo[0].setCurrencyX9("ARS");
			priceInfo[0].setTypeX9("RC");
			
			AdditionalServicesComponent[] additionals = new AdditionalServicesComponent[1];
			additionals[0] = new AdditionalServicesComponent();
			additionals[0].setNameX9("Data");
			
			AdditionalService[] additionalServices = new AdditionalService[1];
			additionalServices[0] = new AdditionalService();
			additionalServices[0].setApIdX9("334");
			additionalServices[0].setCIDX9("445");
			additionalServices[0].setNameX9("Data");
			additionalServices[0].setDescriptionX9("2 gb data");
			additionalServices[0].setActionX9("provide");
			additionalServices[0].setIsMandatoryX9(true);
			
			additionals[0].setAdditionalServicesX9(additionalServices);
			
			productInfo.setAdditionalServicesComponentsX9(additionals);
			
			response.setResponseStatusX9(responseStatus);
			response.setProductInfoX9(productInfo);
			return response;
		}
		
		throw new RemoteException(
				String.format("1000375 The following assigned products were not retrieved: %s.", arg1.getProductServiceIDX9()));
	}

	@Override
	public RetrieveProductOfferingDetailsOutput retrieveProductOfferingDetails(OrderingContext arg0,
			RetrieveProductOfferingDetailsInput arg1) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetrieveProductOfferingForReplaceOutput retrieveProductOfferingForReplace(OrderingContext arg0,
			RetrieveProductOfferingForReplaceInput arg1) throws RemoteException {
		if(arg0 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "OrderingContext"));
		}

		if(arg1 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "RetrieveProductOfferingForReplaceInput"));
		}
		
		if(arg0 != null && (((ApplicationContext)arg0).getLocaleString() == null || "".equals(((ApplicationContext)arg0).getLocaleString()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "LocaleString"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSalesChannel() == null || "".equals(((SalesContext)arg0).getSalesChannel()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SalesChannel"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSecurityToken() == null || "".equals(((SalesContext)arg0).getSecurityToken()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SecurityToken"));
		}

		if(arg1 != null && (arg1.getProductServiceIDX9() == null || "".equals(arg1.getProductServiceIDX9()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "ProductServiceIDX9"));
		}

		if("1154889735".equals(arg1.getProductServiceIDX9())) {
			throw new RemoteException(
					String.format("48009252 %s was not retrieved from Sales Engine.", arg1.getProductServiceIDX9()));
		}
		
		if("1154889734".equals(arg1.getProductServiceIDX9())) {
			throw new RemoteException(
					"98 A technical failure occurred. Check the log file for details.");
		}
		if("1154889731".equals(arg1.getProductServiceIDX9())) {
			RetrieveProductOfferingForReplaceOutput response 
					= new RetrieveProductOfferingForReplaceOutput();
			ResponseStatus rStatus = new ResponseStatus();
			rStatus.setRejectDescriptionX9("success");
			rStatus.setStatusX9(true);
			rStatus.setRejectCodeX9("0");
			response.setResponseStatusX9(rStatus );
			
			ProductOffering[] offerings = new ProductOffering[1];
			offerings[0] = new ProductOffering();
			offerings[0].setCIDX9("345E42");
			offerings[0].setDescriptionX9("Free 500 sms");
			offerings[0].setNameX9("SMS");
			offerings[0].setIsDowngradeX9(true);
			PriceInfo[] prices =new PriceInfo[1];
			prices[0] = new PriceInfo();
			prices[0].setCurrencyX9("ARS");
			prices[0].setValueX9(50.00);
			prices[0].setTypeX9("OC");
			offerings[0].setPriceInfoX9(prices);
			response.setProductOfferingsX9(offerings);
			return response;
		}
		
		if("1154889732".equals(arg1.getProductServiceIDX9())) {
			RetrieveProductOfferingForReplaceOutput response 
					= new RetrieveProductOfferingForReplaceOutput();
			ResponseStatus rStatus = new ResponseStatus();
			rStatus.setRejectDescriptionX9("success");
			rStatus.setStatusX9(true);
			rStatus.setRejectCodeX9("0");
			response.setResponseStatusX9(rStatus );
			
			ProductOffering[] offerings = new ProductOffering[1];
			offerings[0] = new ProductOffering();
			offerings[0].setCIDX9("345E42");
			offerings[0].setNameX9("SMS");
			response.setProductOfferingsX9(offerings);
			return response;
		}
		throw new RemoteException(
				String.format("1000375 The following assigned products were not retrieved: %s.", arg1.getProductServiceIDX9()));

	}

	@Override
	public SearchOrderActionOutput searchOrderAction(OrderingContext arg0, SearchOrderActionInput arg1)
			throws RemoteException {
		
		if(arg0 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "OrderingContext"));
		}

		if(arg1 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SearchOrderActionInput"));
		}
		
		if(arg0 != null && (((ApplicationContext)arg0).getLocaleString() == null || "".equals(((ApplicationContext)arg0).getLocaleString()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "LocaleString"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSalesChannel() == null || "".equals(((SalesContext)arg0).getSalesChannel()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SalesChannel"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSecurityToken() == null || "".equals(((SalesContext)arg0).getSecurityToken()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SecurityToken"));
		}

		if(arg1 != null && (arg1.getProductServiceIDX9() == null || "".equals(arg1.getProductServiceIDX9()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "ProductServiceIDX9"));
		}
		
		if(arg1 != null &&
				"114586733".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			OrderActionHeader order = new OrderActionHeader();
			order.setProductServiceIDX9("114586734");
			order.setOrderActionIDX9("778");
			order.setActionX9("Provide");
			order.setStatusX9("Done");
			order.setSalesChannelX9("CC");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/10/30";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			order.setDateX9(date);
			OrderActionHeader[] OrderActionHeaderX9 = new OrderActionHeader[]{
					order	
			};
			response.setOrderActionHeaderX9(OrderActionHeaderX9);
			return response;
		}
		
		if(arg1 != null &&
				"114586734".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			
			OrderActionHeader order = new OrderActionHeader();
			order.setProductServiceIDX9("114586734");
			order.setOrderActionIDX9("778");
			order.setActionX9("Change");
			order.setStatusX9("Cancelled");
			order.setSalesChannelX9("MS");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/10/31";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			order.setDateX9(date);
			OrderActionHeader[] OrderActionHeaderX9 = new OrderActionHeader[]{
					order	
			};
			response.setOrderActionHeaderX9(OrderActionHeaderX9);
			return response;
		}
		
		if(arg1 != null &&
				"114586735".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			return response;
		}
		
		if(arg1 != null &&
				"114586736".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			
			OrderActionHeader order = new OrderActionHeader();
			order.setProductServiceIDX9("114586734");
			order.setOrderActionIDX9("0");
			order.setActionX9("Change");
			order.setStatusX9("Cancelled");
			order.setSalesChannelX9("MS");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/10/31";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			order.setDateX9(date);
			OrderActionHeader[] OrderActionHeaderX9 = new OrderActionHeader[]{
					order	
			};
			response.setOrderActionHeaderX9(OrderActionHeaderX9);
			return response;
		}
		
		if(arg1 != null &&
				"114586737".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			
			OrderActionHeader order = new OrderActionHeader();
			order.setProductServiceIDX9("114586734");
			order.setOrderActionIDX9("0");
			order.setActionX9("Change");
			order.setStatusX9("Cancelled");
			order.setSalesChannelX9("MS");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/10/31";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			order.setDateX9(date);
			OrderActionHeader[] OrderActionHeaderX9 = new OrderActionHeader[]{
					order	
			};
			response.setOrderActionHeaderX9(OrderActionHeaderX9);
			return response;
		}
		
		if(arg1 != null &&
				"114586738".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			OrderActionHeader order = new OrderActionHeader();
			order.setProductServiceIDX9("45");
			order.setOrderActionIDX9(null);
			order.setActionX9("Provide");
			order.setStatusX9("");
			order.setSalesChannelX9("67");
			Date date = new Date();
			order.setDateX9(date);
			OrderActionHeader[] OrderActionHeaderX9 = new OrderActionHeader[]{
					order	
			};
			response.setOrderActionHeaderX9(OrderActionHeaderX9);
			return response;
		}
		
		if(arg1 != null &&
				"114586739".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			OrderActionHeader order = new OrderActionHeader();
			order.setProductServiceIDX9("45");
			order.setOrderActionIDX9("unavailable");
			order.setActionX9("Provide");
			order.setStatusX9(null);
			order.setSalesChannelX9("67");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/08/09";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			order.setDateX9(date);
			OrderActionHeader[] OrderActionHeaderX9 = new OrderActionHeader[]{
					order	
			};
			response.setOrderActionHeaderX9(OrderActionHeaderX9);
			return response;
		}
		
		if(arg1 != null &&
				"114586740".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			
			OrderActionHeader order = new OrderActionHeader();
			order.setProductServiceIDX9("114586734");
			order.setOrderActionIDX9("0");
			order.setActionX9("Change");
			order.setStatusX9("Cancelled");
			order.setSalesChannelX9("MS");
			order.setDateX9(null);
			OrderActionHeader[] OrderActionHeaderX9 = new OrderActionHeader[]{
					order	
			};
			response.setOrderActionHeaderX9(OrderActionHeaderX9);
			return response;
		}
		
		if(arg1 != null &&
				"114586741".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			
			OrderActionHeader order = new OrderActionHeader();
			order.setProductServiceIDX9("114586734");
			order.setOrderActionIDX9("0");
			order.setActionX9(null);
			order.setStatusX9("Cancelled");
			order.setSalesChannelX9("MS");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/10/31";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			order.setDateX9(date);
			OrderActionHeader[] OrderActionHeaderX9 = new OrderActionHeader[]{
					order	
			};
			response.setOrderActionHeaderX9(OrderActionHeaderX9);
			return response;
		}
		if(arg1 != null &&
				"114586742".equals(arg1.getProductServiceIDX9())) {
			SearchOrderActionOutput response = new SearchOrderActionOutput();
			ResponseStatus responseStatus = new ResponseStatus();
			responseStatus.setStatusX9(true);
			response.setResponseStatusX9(responseStatus);
			
			OrderActionHeader order = new OrderActionHeader();
			order.setProductServiceIDX9("114586734");
			order.setOrderActionIDX9("0");
			order.setActionX9(null);
			order.setStatusX9("Cancelled");
			order.setSalesChannelX9("MS");
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			String cunvertCurrentDate="2017/10/31";
			Date date = new Date();
			try {
				date = df.parse(cunvertCurrentDate);
			} catch (ParseException e) {
				System.out.println(e);
			}
			order.setDateX9(date);
			OrderActionHeader[] OrderActionHeaderX9 = new OrderActionHeader[]{
					order	
			};
			response.setOrderActionHeaderX9(OrderActionHeaderX9);
			return response;
		}
		
		throw new NullPointerException();
	}

	@Override
	public SubmitOrderOutput submitOrder(OrderingContext arg0, SubmitOrderInput arg1) throws RemoteException {
		if(arg0 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "OrderingContext"));
		}

		if(arg1 == null) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SearchOrderActionInput"));
		}
		
		if(arg0 != null && (((ApplicationContext)arg0).getLocaleString() == null || "".equals(((ApplicationContext)arg0).getLocaleString()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "LocaleString"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSalesChannel() == null || "".equals(((SalesContext)arg0).getSalesChannel()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SalesChannel"));
		}

		if(arg0 != null && (((SalesContext)arg0).getSecurityToken() == null || "".equals(((SalesContext)arg0).getSecurityToken()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "SecurityToken"));
		}

		if(arg1 != null && (arg1.getOrderIDX9() == null || "".equals(arg1.getOrderIDX9()))) {
			throw new RemoteException(
					String.format("2000011 Operation Input: %s is missing a mandatory parameter.", "OrderIDX9"));
		}
		if("101".equals(arg1.getOrderIDX9())) {
			throw new RemoteException(
					String.format("1000392 Order action %s cannot be updated, because it is being amended.", arg1.getOrderIDX9()));
		}
		
		if("102".equals(arg1.getOrderIDX9())) {
			throw new RemoteException(
					String.format("1000226 The %s attribute in the component is not allowed to be changed.", 
						arg1.getOrderIDX9()));
		}

		if("103".equals(arg1.getOrderIDX9())) {
			throw new RemoteException(
					String.format("1000196 Step cannot be activated since the order action for %s is cancelled.", arg1.getOrderIDX9()));
		}

		if("104".equals(arg1.getOrderIDX9())) {
			throw new RemoteException(
					String.format("1000197 Step cannot be activated since the order action for %s is completed.", arg1.getOrderIDX9()));
		}

		if("105".equals(arg1.getOrderIDX9())) {
			throw new RemoteException(
					String.format("1000200 Step cannot be activated since the order for %s is cancelled.", arg1.getOrderIDX9()));
		}

		if("106".equals(arg1.getOrderIDX9())) {
			throw new RemoteException(
					String.format("1000386 Order %s cannot be updated because it is already completed.", arg1.getOrderIDX9()));
		}

		if("107".equals(arg1.getOrderIDX9())) {
			throw new RemoteException(
					String.format("1000195 Step cannot be activated since the order for %s is submitted.", arg1.getOrderIDX9()));
		}
		
		if("108".equals(arg1.getOrderIDX9())) {
			throw new RemoteException(
					String.format("1000176 Order %s is being handled by %s. Operation cannot be performed.", arg1.getOrderIDX9()
							, arg0.getSalesChannel()));
		}


		
		if("100".equals(arg1.getOrderIDX9())) {
			SubmitOrderOutput response = new SubmitOrderOutput();
			ResponseStatus status = new ResponseStatus();
			status.setRejectCodeX9("0");
			status.setRejectDescriptionX9("submitted");
			status.setStatusX9(true);
			response.setResponseStatusX9(status );
			return response;
		}
		
		if("99".equals(arg1.getOrderIDX9())) {
			SubmitOrderOutput response = new SubmitOrderOutput();
			ResponseStatus status = new ResponseStatus();
			status.setRejectCodeX9("9999");
			status.setRejectDescriptionX9("submitted");
			status.setStatusX9(false);
			response.setResponseStatusX9(status);
			return response;
		}
		
		
		throw new RemoteException(
				String.format("1000626 Order %s cannot be found.", arg1.getOrderIDX9()));
	}
	
	@Override
	public RetrieveImplementedOTTServicesOutput retrieveImplementedOTTServices(OrderingContext paramOrderingContext, RetrieveImplementedOTTServicesInput paramRetrieveImplementedOTTServicesInput)
			    throws RemoteException{
		  return null;
	  }

	@Override
	public RetrieveAvailableOTTServicesOutput retrieveAvailableOTTServices(OrderingContext paramOrderingContext, RetrieveAvailableOTTServicesInput paramRetrieveAvailableOTTServicesInput)
			    throws RemoteException {
		return null;
	}
	
	@Override
	public RetrieveOTTOrderSummaryOutput retrieveOTTOrderSummary(OrderingContext paramOrderingContext, RetrieveOTTOrderSummaryInput paramRetrieveOTTOrderSummaryInput)
			    throws RemoteException {
		  return null;
	  }
			  
}
