package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amdocs.informationmodel.mobileapps.AdditionalServicesComponent;
import com.amdocs.informationmodel.mobileapps.ResponseStatus;
import com.practia.oms.datatypes.type.AbstractBeantype;
import com.practia.services.productdomain.lightweight.lib.ResponseStatusBean;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveAvailableAdditionalServicesOutput")
public class RetrieveAvailableAdditionalServicesOutputBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "ResponseStatusX9", required = true)
	private final ResponseStatusBean ResponseStatusX9;
	@XmlElement(name = "AdditionalServicesComponentsX9", required = false)
	private final AdditionalServicesComponentBean[] AdditionalServicesComponentsX9;

	public static class Builder
		implements com.practia.oms.datatypes.builder.Builder<RetrieveAvailableAdditionalServicesOutputBean> {
		
		private ResponseStatusBean ResponseStatusX9;
		private AdditionalServicesComponentBean[] AdditionalServicesComponentsX9;
		
		public Builder(ResponseStatus ResponseStatus) {
			this.ResponseStatusX9 =
					new ResponseStatusBean
						.Builder(ResponseStatus.getStatusX9())
						.RejectCodeX9(ResponseStatus.getRejectCodeX9())
						.RejectDescriptionX9(ResponseStatus.getRejectDescriptionX9())
							.build();
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
		public RetrieveAvailableAdditionalServicesOutputBean build() {
			return new RetrieveAvailableAdditionalServicesOutputBean(this);
		}
	}

	public RetrieveAvailableAdditionalServicesOutputBean(Builder builder) {
		this.AdditionalServicesComponentsX9 = builder.AdditionalServicesComponentsX9;
		this.ResponseStatusX9 = builder.ResponseStatusX9;
	}
}
