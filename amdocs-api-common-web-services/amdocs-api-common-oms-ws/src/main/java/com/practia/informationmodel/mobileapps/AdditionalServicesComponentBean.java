package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.amdocs.informationmodel.mobileapps.AdditionalService;
import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServicesComponent")
public class AdditionalServicesComponentBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "NameX9", required = true)
	private final String NameX9;
	@XmlElement(name = "ActionX9", required = false)
	private final String ActionX9;
	@XmlElement(name = "AdditionalServicesX9", required = false)
	private final AdditionalServiceBean[] AdditionalServicesX9;

	public static class Builder implements com.practia.oms.datatypes.builder.Builder<AdditionalServicesComponentBean> {

		private String NameX9;
		private String ActionX9;
		private AdditionalServiceBean[] AdditionalServicesX9;

		public Builder(String NameX9) {
			this.NameX9 = NameX9;
		}

		public Builder NameX9(String val) {
			this.NameX9 = val;
			return this;
		}

		public Builder ActionX9(String val) {
			this.ActionX9 = val;
			return this;
		}
		
		public Builder AdditionalServicesX9(AdditionalService[] val) {
			if (val == null || val.length == 0)
				return this;
			this.AdditionalServicesX9 = new AdditionalServiceBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.AdditionalServicesX9[i] = 
						new AdditionalServiceBean
						.Builder(val[i].getCIDX9(), val[i].getNameX9(), val[i].getIsMandatoryX9())
						.ActionX9(val[i].getActionX9())
						.ApIdX9(val[i].getApIdX9())
						.PriceInfoX9(val[i].getPriceInfoX9())
						.build();
			}
					
			return this;
		}

		@Override
		public AdditionalServicesComponentBean build() {
			return new AdditionalServicesComponentBean(this);
		}
	}

	private AdditionalServicesComponentBean(Builder builder) {
		this.ActionX9 = builder.ActionX9;
		this.AdditionalServicesX9 = builder.AdditionalServicesX9;
		this.NameX9 = builder.NameX9;
	}

}
