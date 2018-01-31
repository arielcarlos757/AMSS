package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amdocs.informationmodel.mobileapps.ProductInfo;
import com.amdocs.informationmodel.mobileapps.ResponseStatus;
import com.practia.oms.datatypes.type.AbstractBeantype;
import com.practia.services.productdomain.lightweight.lib.ResponseStatusBean;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductInfoOutput")
public class RetrieveProductInfoOutputBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "ResponseStatusX9", required = true)
	private final ResponseStatusBean ResponseStatusX9;
	@XmlElement(name = "ProductInfoX9", required = true)
	private final ProductInfoBean ProductInfoX9;
	
	public static class Builder
		implements com.practia.oms.datatypes.builder.Builder<RetrieveProductInfoOutputBean> {
	
		private ResponseStatusBean ResponseStatusX9;
		private ProductInfoBean ProductInfoX9;
		
		public Builder(ResponseStatus ResponseStatus) {
			this.ResponseStatusX9 =
					new ResponseStatusBean
						.Builder(ResponseStatus.getStatusX9())
						.RejectCodeX9(ResponseStatus.getRejectCodeX9())
						.RejectDescriptionX9(ResponseStatus.getRejectDescriptionX9())
							.build();
		}

		public Builder ProductInfoX9(ProductInfo val) {
			this.ProductInfoX9 = 
					new ProductInfoBean
						.Builder(val.getProductServiceIDX9(), val.getProductOfferingX9())
						.AdditionalServicesComponentsX9(val.getAdditionalServicesComponentsX9())
						.EquipmentDetailsX9(val.getEquipmentDetailsX9())
						.build();
			return this;
		}
		
		@Override
		public RetrieveProductInfoOutputBean build(){
			return new RetrieveProductInfoOutputBean(this);
		}
	}
	
	public RetrieveProductInfoOutputBean(Builder builder) {
		this.ResponseStatusX9 = builder.ResponseStatusX9;
		this.ProductInfoX9 = builder.ProductInfoX9;
	}
}
