package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amdocs.informationmodel.mobileapps.PriceInfo;
import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOffering")
public class ProductOfferingBean extends AbstractBeantype {

	private static final long serialVersionUID = 1;

	@XmlElement(name = "NameX9", required = true)
	private final String NameX9;
	@XmlElement(name = "CIDX9", required = true)
	private final String CIDX9;
	@XmlElement(name = "PriceInfoX9", required = false)
	private final PriceInfoBean[] PriceInfoX9;
	@XmlElement(name = "DescriptionX9", required = false)
	private final String DescriptionX9;
	@XmlElement(name = "IsDowngradeX9", required = false)
	private final Boolean IsDowngradeX9;
	
	public static class Builder implements com.practia.oms.datatypes.builder.Builder<ProductOfferingBean> {

		private String NameX9;
		private String CIDX9;
		private PriceInfoBean[] PriceInfoX9;
		private String DescriptionX9;
		private Boolean IsDowngradeX9;

		public Builder(String NameX9,String CIDX9) {
			  this.NameX9 = NameX9;
			  this.CIDX9 = CIDX9;
		  }

		public Builder PriceInfoX9(PriceInfo[] val) {
			if (val == null || val.length == 0)
				return this;
			this.PriceInfoX9 = new PriceInfoBean[val.length]; 
			for (int i = 0; i < val.length; i++) {
				this.PriceInfoX9[i] =
						new PriceInfoBean
						.Builder
						(val[i].getValueX9(),
								val[i].getTypeX9(),
								val[i].getCurrencyX9()).build();
						
			}
			return this;
			
		}
		
		public Builder DescriptionX9(String val) {
			this.DescriptionX9 = val;
			return this;
		}

		public Builder IsDowngradeX9(boolean val) {
			this.IsDowngradeX9 = val;
			return this;
		}

		@Override
		public ProductOfferingBean build() {
			return new ProductOfferingBean(this);
		}
	}

	private ProductOfferingBean(Builder builder) {
		  this.CIDX9 = builder.CIDX9;
		  this.DescriptionX9 = builder.DescriptionX9;
		  this.IsDowngradeX9 = builder.IsDowngradeX9;
		  this.PriceInfoX9 = builder.PriceInfoX9;
		  this.NameX9 = builder.NameX9;
	  }
}
