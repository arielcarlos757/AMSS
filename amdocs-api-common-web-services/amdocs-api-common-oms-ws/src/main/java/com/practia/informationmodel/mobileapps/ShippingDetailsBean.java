package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDetailsBean")
public class ShippingDetailsBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "DeliveryMethodX9", required = true)
	private final String DeliveryMethodX9;
	@XmlElement(name = "StoreIDX9", required = false)
	private final String StoreIDX9;
	@XmlElement(name = "ShipmentAddressX9", required = false)
	private final String ShipmentAddressX9;
	
	public static class Builder implements com.practia.oms.datatypes.builder.Builder<ShippingDetailsBean> {

		private String DeliveryMethodX9;
		private String StoreIDX9 = null;
		private String ShipmentAddressX9 = null;

		public Builder(String DeliveryMethodX9) {
			this.DeliveryMethodX9 = DeliveryMethodX9;
		}

		public Builder StoreIDX9(String val) 
			{ this.StoreIDX9 = val; return this; }

		public Builder ShipmentAddressX9(String val) 
			{this.ShipmentAddressX9 = val; return this;}

		@Override
		public ShippingDetailsBean build() {
			return new ShippingDetailsBean(this);
		}
	}

	private ShippingDetailsBean(Builder builder) {
		this.DeliveryMethodX9 = builder.DeliveryMethodX9;
		this.ShipmentAddressX9 = builder.ShipmentAddressX9;
		this.StoreIDX9 = builder.StoreIDX9;
	}
}
