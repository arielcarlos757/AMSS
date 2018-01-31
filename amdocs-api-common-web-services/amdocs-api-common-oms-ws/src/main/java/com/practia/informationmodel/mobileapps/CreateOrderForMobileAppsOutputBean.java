package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amdocs.informationmodel.mobileapps.ResponseStatus;
import com.practia.oms.datatypes.type.AbstractBeantype;
import com.practia.services.productdomain.lightweight.lib.ResponseStatusBean;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderForMobileAppsOutput")
public class CreateOrderForMobileAppsOutputBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "ResponseStatusX9", required = true)
	private final ResponseStatusBean ResponseStatusX9;
	@XmlElement(name = "OrderIDX9", required = true)
	private final String OrderIDX9;
	@XmlElement(name = "OrderActionIDX9", required = true)
	private final String OrderActionIDX9;

	public static class Builder
			implements com.practia.oms.datatypes.builder.Builder<CreateOrderForMobileAppsOutputBean> {

		private ResponseStatusBean ResponseStatusX9;
		private String OrderIDX9;
		private String OrderActionIDX9;

		public Builder(ResponseStatus ResponseStatus) {
			this.ResponseStatusX9 =
					new ResponseStatusBean
						.Builder(ResponseStatus.getStatusX9())
						.RejectCodeX9(ResponseStatus.getRejectCodeX9())
						.RejectDescriptionX9(ResponseStatus.getRejectDescriptionX9())
							.build();
		}
		
		
		public Builder OrderIDX9(String val)
			{this.OrderIDX9 = val; return this;}
		
		public Builder OrderActionIDX9(String val)
			{this.OrderActionIDX9 = val; return this;}
		
		@Override
		public CreateOrderForMobileAppsOutputBean build() {
			return new CreateOrderForMobileAppsOutputBean(this);
		}
	}

	public CreateOrderForMobileAppsOutputBean(Builder builder) {
		this.ResponseStatusX9 = builder.ResponseStatusX9;
		this.OrderIDX9 = builder.OrderIDX9;
		this.OrderActionIDX9 = builder.OrderActionIDX9;
	}
}
