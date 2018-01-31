package com.practia.oms.datatypes.transform;

import com.amdocs.datatypes.DataType;
import com.amdocs.informationmodel.mobileapps.CreateOrderForMobileAppsOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveAvailableAdditionalServicesOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveOrderActionSummaryOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductInfoOutput;
import com.amdocs.informationmodel.mobileapps.RetrieveProductOfferingForReplaceOutput;
import com.amdocs.informationmodel.mobileapps.SearchOrderActionOutput;
import com.amdocs.informationmodel.mobileapps.SubmitOrderOutput;
import com.practia.informationmodel.mobileapps.CreateOrderForMobileAppsOutputBean;
import com.practia.informationmodel.mobileapps.RetrieveAvailableAdditionalServicesOutputBean;
import com.practia.informationmodel.mobileapps.RetrieveOrderActionSummaryOutputBean;
import com.practia.informationmodel.mobileapps.RetrieveProductInfoOutputBean;
import com.practia.informationmodel.mobileapps.RetrieveProductOfferingForReplaceOutputBean;
import com.practia.informationmodel.mobileapps.SearchOrderActionOutputBean;
import com.practia.informationmodel.mobileapps.SubmitOrderOutputBean;
import com.practia.oms.datatypes.builder.Builder;
import com.practia.oms.datatypes.processor.Processor;

public enum Transformer implements Processor {

	SEARCH_ORDER_ACTION_OUTPUT("SearchOrderActionOutput") {
		@SuppressWarnings("unchecked")
		public SearchOrderActionOutputBean process(DataType dt) {
			Builder<SearchOrderActionOutputBean> builder = new SearchOrderActionOutputBean.Builder(
					((SearchOrderActionOutput) dt).getResponseStatusX9())
							.OrderActionHeaderX9(((SearchOrderActionOutput) dt).getOrderActionHeaderX9());
			return builder.build();
		}
	},
	RETRIEVE_PRODUCT_OFFERING_FOR_REPLACE_OUTPUT("RetrieveProductOfferingForReplaceOutput") {
		@SuppressWarnings("unchecked")
		public RetrieveProductOfferingForReplaceOutputBean process(DataType dt) {
			Builder<RetrieveProductOfferingForReplaceOutputBean> builder = new RetrieveProductOfferingForReplaceOutputBean.Builder(
					((RetrieveProductOfferingForReplaceOutput) dt).getResponseStatusX9())
							.ProductOfferingsX9(((RetrieveProductOfferingForReplaceOutput) dt).getProductOfferingsX9());
			return builder.build();
		}
	},
	SUBMIT_ORDER_OUTPUT("SubmitOrderOutput") {
		@SuppressWarnings("unchecked")
		public SubmitOrderOutputBean process(DataType dt) {
			Builder<SubmitOrderOutputBean> builder = new SubmitOrderOutputBean.Builder(
					((SubmitOrderOutput) dt).getResponseStatusX9());
			return builder.build();
		}
	},
	CREATE_ORDER_FOR_MOBILEAPPS_OUTPUT("CreateOrderForMobileAppsOutput") {
		@SuppressWarnings("unchecked")
		public CreateOrderForMobileAppsOutputBean process(DataType dt) {
			Builder<CreateOrderForMobileAppsOutputBean> builder = new CreateOrderForMobileAppsOutputBean.Builder(
					((CreateOrderForMobileAppsOutput) dt).getResponseStatusX9())
							.OrderActionIDX9(((CreateOrderForMobileAppsOutput) dt).getOrderActionIDX9())
							.OrderIDX9(((CreateOrderForMobileAppsOutput) dt).getOrderIDX9());
			return builder.build();
		}
	},
	RETRIEVE_PRODUCTINFO_OUTPUT("RetrieveProductInfoOutput") {
		@SuppressWarnings("unchecked")
		public RetrieveProductInfoOutputBean process(DataType dt) {
			Builder<RetrieveProductInfoOutputBean> builder = new RetrieveProductInfoOutputBean.Builder(
					((RetrieveProductInfoOutput) dt).getResponseStatusX9())
							.ProductInfoX9(((RetrieveProductInfoOutput) dt).getProductInfoX9());
			return builder.build();
		}
	},
	RETRIEVE_AVAILABLE_ADDITIONAL_SERVICES_OUTPUT("RetrieveAvailableAdditionalServicesOutput") {
		@SuppressWarnings("unchecked")
		public RetrieveAvailableAdditionalServicesOutputBean process(DataType dt) {
			Builder<RetrieveAvailableAdditionalServicesOutputBean> builder = new RetrieveAvailableAdditionalServicesOutputBean.Builder(
					((RetrieveAvailableAdditionalServicesOutput) dt).getResponseStatusX9())
							.AdditionalServicesComponentsX9(((RetrieveAvailableAdditionalServicesOutput) dt)
									.getAdditionalServicesComponentsX9());
			return builder.build();
		}
	},
	RETRIEVE_ORDER_ACTION_SUMMARY_OUTPUT("RetrieveOrderActionSummaryOutput") {
		@SuppressWarnings("unchecked")
		public RetrieveOrderActionSummaryOutputBean process(DataType dt) {
			Builder<RetrieveOrderActionSummaryOutputBean> builder = new RetrieveOrderActionSummaryOutputBean.Builder(
					((RetrieveOrderActionSummaryOutput) dt).getResponseStatusX9())
							.OrderActionSummaryX9(((RetrieveOrderActionSummaryOutput) dt).getOrderActionSummaryX9());
			return builder.build();
		}
	};

	private final String dataType;

	Transformer(String dataType) {
		this.dataType = dataType;
	}
}
