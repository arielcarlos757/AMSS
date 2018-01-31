package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.amdocs.informationmodel.mobileapps.OrderActionSummary;
import com.amdocs.informationmodel.mobileapps.ResponseStatus;
import com.practia.oms.datatypes.type.AbstractBeantype;
import com.practia.services.productdomain.lightweight.lib.ResponseStatusBean;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOrderActionSummaryOutput")
public class RetrieveOrderActionSummaryOutputBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "ResponseStatusX9", required = true)
	private ResponseStatusBean ResponseStatusX9;
	@XmlElement(name = "OrderActionSummaryX9", required = false)
	private OrderActionSummaryBean OrderActionSummaryX9;

	public static class Builder
			implements com.practia.oms.datatypes.builder.Builder<RetrieveOrderActionSummaryOutputBean> {

		private ResponseStatusBean ResponseStatusX9;
		private OrderActionSummaryBean OrderActionSummaryX9;

		public Builder(ResponseStatus ResponseStatus) {
			this.ResponseStatusX9 =
					new ResponseStatusBean
						.Builder(ResponseStatus.getStatusX9())
						.RejectCodeX9(ResponseStatus.getRejectCodeX9())
						.RejectDescriptionX9(ResponseStatus.getRejectDescriptionX9())
							.build();
		}
		
		public Builder OrderActionSummaryX9(OrderActionSummary val) {
			this.OrderActionSummaryX9 = 
					new OrderActionSummaryBean
						.Builder(val.getOrderActionHeaderX9(),val.getProductInfoX9())
						.ShippingDetailsX9(val.getShippingDetailsX9())
						.build();
			return this;
		}
		
		@Override
		public RetrieveOrderActionSummaryOutputBean build() {
			return new RetrieveOrderActionSummaryOutputBean(this);
		}
	}

	public RetrieveOrderActionSummaryOutputBean(Builder builder) {
		this.OrderActionSummaryX9 = builder.OrderActionSummaryX9;
		this.ResponseStatusX9 = builder.ResponseStatusX9;
	}

}
