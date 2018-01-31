package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amdocs.informationmodel.mobileapps.ResponseStatus;
import com.practia.oms.datatypes.type.AbstractBeantype;
import com.practia.services.productdomain.lightweight.lib.ResponseStatusBean;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitOrderOutput")
public class SubmitOrderOutputBean extends AbstractBeantype {

	@XmlElement(name = "ResponseStatusX9", required = true)
	private final ResponseStatusBean ResponseStatusX9;
	
	public static class Builder
		implements com.practia.oms.datatypes.builder.Builder<SubmitOrderOutputBean> {
		
		private ResponseStatusBean ResponseStatusX9;
		
		public Builder(ResponseStatus ResponseStatus) {
			this.ResponseStatusX9 =
					new ResponseStatusBean
						.Builder(ResponseStatus.getStatusX9())
						.RejectCodeX9(ResponseStatus.getRejectCodeX9())
						.RejectDescriptionX9(ResponseStatus.getRejectDescriptionX9())
							.build();
		}

		@Override
		public SubmitOrderOutputBean build() {
			return new SubmitOrderOutputBean(this);
		}
	}

	public SubmitOrderOutputBean(Builder builder) {
		this.ResponseStatusX9 = builder.ResponseStatusX9;
	}
}
