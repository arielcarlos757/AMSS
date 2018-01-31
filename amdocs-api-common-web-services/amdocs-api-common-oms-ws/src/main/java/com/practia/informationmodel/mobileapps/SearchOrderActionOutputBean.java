package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amdocs.informationmodel.mobileapps.OrderActionHeader;
import com.amdocs.informationmodel.mobileapps.ResponseStatus;
import com.practia.oms.datatypes.type.AbstractBeantype;
import com.practia.services.productdomain.lightweight.lib.ResponseStatusBean;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOrderActionOutput")
public class SearchOrderActionOutputBean extends AbstractBeantype {
	
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "ResponseStatusX9", required = true)
	private final ResponseStatusBean ResponseStatusX9;
	@XmlElement(name = "OrderActionHeaderX9", required = false)
	private final OrderActionHeaderBean[] OrderActionHeaderX9;
		
	public static class Builder implements com.practia.oms.datatypes.builder.Builder<SearchOrderActionOutputBean> {

		private ResponseStatusBean ResponseStatusX9;
		private OrderActionHeaderBean[] OrderActionHeaderX9;
		
		public Builder(ResponseStatus responseStatus) {
			this.ResponseStatusX9 =
						new ResponseStatusBean
							.Builder(responseStatus.getStatusX9())
								.RejectCodeX9(responseStatus.getRejectCodeX9())
								.RejectDescriptionX9(responseStatus.getRejectDescriptionX9())
									.build();
		}
	
		public Builder OrderActionHeaderX9(OrderActionHeader[] val) {
			if(val == null || val.length == 0)
				return this;
			this.OrderActionHeaderX9 = new OrderActionHeaderBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.OrderActionHeaderX9[i] =
					new OrderActionHeaderBean
						.Builder(val[i].getOrderActionIDX9(), val[i].getStatusX9(), 
								val[i].getDateX9(), val[i].getSalesChannelX9(), 
								val[i].getProductServiceIDX9(), val[i].getActionX9())    
						.build();
					
			}
			return this;
		}
		
		@Override
		public SearchOrderActionOutputBean build() {
			return new SearchOrderActionOutputBean(this);
		}
	}
	
	private SearchOrderActionOutputBean(Builder builder) {
		this.OrderActionHeaderX9 = builder.OrderActionHeaderX9;
		this.ResponseStatusX9 = builder.ResponseStatusX9;
	}
	
}
