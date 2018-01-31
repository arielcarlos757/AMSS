package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amdocs.informationmodel.mobileapps.ProductOffering;
import com.amdocs.informationmodel.mobileapps.ResponseStatus;
import com.practia.oms.datatypes.type.AbstractBeantype;
import com.practia.services.productdomain.lightweight.lib.ResponseStatusBean;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductOfferingForReplaceOutput")
public class RetrieveProductOfferingForReplaceOutputBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "ResponseStatusX9", required = true)
	private final ResponseStatusBean ResponseStatusX9;
	@XmlElement(name = "ProductOfferingsX9", required = true)
	private final ProductOfferingBean[] ProductOfferingsX9;
	
	public static class Builder
		implements com.practia.oms.datatypes.builder.Builder<RetrieveProductOfferingForReplaceOutputBean> {
		
		private ResponseStatusBean ResponseStatusX9;
		private ProductOfferingBean[] ProductOfferingsX9;
		
		public Builder(ResponseStatus ResponseStatus) {
			this.ResponseStatusX9 =
					new ResponseStatusBean
						.Builder(ResponseStatus.getStatusX9())
						.RejectCodeX9(ResponseStatus.getRejectCodeX9())
						.RejectDescriptionX9(ResponseStatus.getRejectDescriptionX9())
							.build();
		}
		
		public Builder ProductOfferingsX9(ProductOffering[] val) {
			if (val == null || val.length == 0)
				return this;
			this.ProductOfferingsX9 = new ProductOfferingBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.ProductOfferingsX9[i] = new ProductOfferingBean.Builder(val[i].getNameX9(),
						val[i].getCIDX9()).DescriptionX9(val[i].getDescriptionX9())
						.IsDowngradeX9(val[i].getIsDowngradeX9())
						.PriceInfoX9(val[i].getPriceInfoX9())
						.build();
			}
			return this;
		}
		
		@Override
		public RetrieveProductOfferingForReplaceOutputBean build() {
			return new RetrieveProductOfferingForReplaceOutputBean(this);
		}
	}
	
	public RetrieveProductOfferingForReplaceOutputBean(Builder builder) {
		this.ProductOfferingsX9 = builder.ProductOfferingsX9;
		this.ResponseStatusX9 = builder.ResponseStatusX9;
	}
}
