package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.amdocs.informationmodel.mobileapps.PriceInfo;
import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalService")
public class AdditionalServiceBean extends AbstractBeantype {

	private static final long serialVersionUID = 1;

	@XmlElement(name = "ApIdX9", required = false)
	private final String ApIdX9;
	@XmlElement(name = "CIDX9", required = true)
	private final String CIDX9;
	@XmlElement(name = "PriceInfoX9", required = false)
	private final PriceInfoBean[] PriceInfoX9;
	@XmlElement(name = "NameX9", required = true)
	private final String NameX9;
	@XmlElement(name = "DescriptionX9", required = false)
	private final String DescriptionX9;
	@XmlElement(name = "ActionX9", required = false)
	private final String ActionX9;
	@XmlElement(name = "IsMandatoryX9", required = true)
	private final Boolean IsMandatoryX9;

	
	public static class Builder implements com.practia.oms.datatypes.builder.Builder<AdditionalServiceBean> {
		
		private String ApIdX9;
		private String CIDX9;
		private PriceInfoBean[] PriceInfoX9;
		private String NameX9;
		private String DescriptionX9;
		private String ActionX9;
		private Boolean IsMandatoryX9;

		public Builder(String CIDX9, String NameX9, boolean IsMandatoryX9) {
			this.CIDX9 = CIDX9;
			this.NameX9 = NameX9;
			this.IsMandatoryX9 = IsMandatoryX9;
		}

		public Builder PriceInfoX9(PriceInfo[] val) {
			if (val == null || val.length == 0)
				return this;
			this.PriceInfoX9 = new PriceInfoBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.PriceInfoX9[i] = 
						new PriceInfoBean
							.Builder(val[i].getValueX9(), 
										val[i].getTypeX9(), 
											val[i].getCurrencyX9()).build();
			}
			return this;
		}
		
		public Builder DescriptionX9(String val) {
			this.DescriptionX9 = val;
			return this;
		}
		
		public Builder ApIdX9(String val) {
			this.ApIdX9 = val;
			return this;
		}
		
		public Builder ActionX9(String val) {
			this.ActionX9 = val;
			return this;
		}
		
		
		@Override
		public AdditionalServiceBean build() {
			return new AdditionalServiceBean(this);
		}
	}
	
	private AdditionalServiceBean(Builder builder) {
		this.ActionX9 = builder.ActionX9;
		this.ApIdX9 = builder.ApIdX9;
		this.CIDX9 = builder.CIDX9;
		this.DescriptionX9 = builder.DescriptionX9;
		this.NameX9 = builder.NameX9;
		this.IsMandatoryX9 = builder.IsMandatoryX9;
		this.PriceInfoX9 = builder.PriceInfoX9;
	}
}
