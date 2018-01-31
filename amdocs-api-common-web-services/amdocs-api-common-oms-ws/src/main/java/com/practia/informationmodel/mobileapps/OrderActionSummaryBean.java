package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amdocs.informationmodel.mobileapps.OrderActionHeader;
import com.amdocs.informationmodel.mobileapps.ProductInfo;
import com.amdocs.informationmodel.mobileapps.ShippingDetails;
import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderActionSummary")
public class OrderActionSummaryBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "OrderActionHeaderX9", required = true)
	private final OrderActionHeaderBean OrderActionHeaderX9;
	@XmlElement(name = "ShippingDetailsX9", required = false)
	private final ShippingDetailsBean ShippingDetailsX9;
	@XmlElement(name = "ProductInfoX9", required = true)
	private final ProductInfoBean ProductInfoX9;

	public static class Builder implements com.practia.oms.datatypes.builder.Builder<OrderActionSummaryBean> {

		private OrderActionHeaderBean OrderActionHeaderX9;
		private ShippingDetailsBean ShippingDetailsX9;
		private ProductInfoBean ProductInfoX9;

//		public Builder(OrderActionHeader OrderActionHeader) {
//			this.OrderActionHeaderX9 = new OrderActionHeaderBean.Builder(OrderActionHeader.getOrderActionIDX9(),
//					OrderActionHeader.getStatusX9(), OrderActionHeader.getDateX9(),
//					OrderActionHeader.getSalesChannelX9(), OrderActionHeader.getProductServiceIDX9(),
//					OrderActionHeader.getActionX9()).build();
//		}

		public Builder(OrderActionHeader OrderActionHeader, ProductInfo productInfoX92) {
			this.OrderActionHeaderX9 = new OrderActionHeaderBean.Builder(OrderActionHeader.getOrderActionIDX9(),
					OrderActionHeader.getStatusX9(), OrderActionHeader.getDateX9(),
					OrderActionHeader.getSalesChannelX9(), OrderActionHeader.getProductServiceIDX9(),
					OrderActionHeader.getActionX9()).build();
			this.ProductInfoX9 = 
					new ProductInfoBean
						.Builder(productInfoX92.getProductServiceIDX9(), productInfoX92.getProductOfferingX9())
						.AdditionalServicesComponentsX9(productInfoX92.getAdditionalServicesComponentsX9())
						.EquipmentDetailsX9(productInfoX92.getEquipmentDetailsX9())
						.build();
		}

		public Builder ShippingDetailsX9(ShippingDetails val) {
			this.ShippingDetailsX9 = new ShippingDetailsBean.Builder(val.getDeliveryMethodX9())
					.StoreIDX9(val.getStoreIDX9()).ShipmentAddressX9(val.getShipmentAddressX9()).build();
			return this;
		}

//		public Builder ProductInfoX9(ProductInfo val) {
//			this.ProductInfoX9 = 
//					new ProductInfoBean
//						.Builder(val.getProductServiceIDX9(), val.getProductOfferingX9())
//						.AdditionalServicesComponentsX9(val.getAdditionalServicesComponentsX9())
//						.EquipmentDetailsX9(val.getEquipmentDetailsX9())
//						.build();
//			return this;
//		}
		
		@Override
		public OrderActionSummaryBean build() {
			return new OrderActionSummaryBean(this);
		}
	}

	public OrderActionSummaryBean(Builder builder) {
		this.OrderActionHeaderX9 = builder.OrderActionHeaderX9;
		this.ProductInfoX9 = builder.ProductInfoX9;
		this.ShippingDetailsX9 = builder.ShippingDetailsX9;
	}

}
