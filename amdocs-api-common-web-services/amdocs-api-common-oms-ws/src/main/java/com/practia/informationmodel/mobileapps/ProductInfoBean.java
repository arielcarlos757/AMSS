package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amdocs.informationmodel.mobileapps.AdditionalServicesComponent;
import com.amdocs.informationmodel.mobileapps.EquipmentDetails;
import com.amdocs.informationmodel.mobileapps.ProductOffering;
import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfo")
public class ProductInfoBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "ProductServiceIDX9", required = true)
	private String ProductServiceIDX9;
	@XmlElement(name = "ProductOfferingX9", required = true)
	private ProductOfferingBean ProductOfferingX9;
	@XmlElement(name = "EquipmentDetailsX9", required = false)
	private EquipmentDetailsBean[] EquipmentDetailsX9;
	@XmlElement(name = "AdditionalServicesComponentsX9", required = false)
	private AdditionalServicesComponentBean[] AdditionalServicesComponentsX9;

	public static class Builder implements com.practia.oms.datatypes.builder.Builder<ProductInfoBean> {
		private String ProductServiceIDX9;
		private ProductOfferingBean ProductOfferingX9;
		private EquipmentDetailsBean[] EquipmentDetailsX9;
		private AdditionalServicesComponentBean[] AdditionalServicesComponentsX9;

		public Builder(String ProductServiceIDX9, ProductOffering ProductOfferingX9) {
			this.ProductServiceIDX9 = ProductServiceIDX9;
			this.ProductOfferingX9 = new ProductOfferingBean.Builder(ProductOfferingX9.getNameX9(),
					ProductOfferingX9.getCIDX9()).DescriptionX9(ProductOfferingX9.getDescriptionX9())
							.IsDowngradeX9(ProductOfferingX9.getIsDowngradeX9()).build();
		}

		public Builder EquipmentDetailsX9(EquipmentDetails[] val) {
			if (val == null || val.length == 0)
				return this;
			this.EquipmentDetailsX9 = new EquipmentDetailsBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.EquipmentDetailsX9[i] = new EquipmentDetailsBean.Builder(val[i].getTypeX9())
						.AttributesX9(val[i].getAttributesX9()).DescriptionX9(val[i].getDescriptionX9())
						.PriceInfoX9(val[i].getPriceInfoX9()).build();
			}
			return this;
		}

		public Builder AdditionalServicesComponentsX9(AdditionalServicesComponent[] val) {
			if (val == null || val.length == 0)
				return this;
			this.AdditionalServicesComponentsX9 = new AdditionalServicesComponentBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.AdditionalServicesComponentsX9[i] = new AdditionalServicesComponentBean.Builder(val[i].getNameX9())
						.ActionX9(val[i].getActionX9()).AdditionalServicesX9(val[i].getAdditionalServicesX9()).build();
			}
			return this;
		}

		@Override
		public ProductInfoBean build() {
			return new ProductInfoBean(this);
		}
	}

	private ProductInfoBean(Builder builder) {
		this.AdditionalServicesComponentsX9 = builder.AdditionalServicesComponentsX9;
		this.EquipmentDetailsX9 = builder.EquipmentDetailsX9;
		this.ProductOfferingX9 = builder.ProductOfferingX9;
		this.ProductServiceIDX9 = builder.ProductServiceIDX9;
	}
}
