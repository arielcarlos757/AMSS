package com.practia.informationmodel.mobileapps;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderActionHeader")
public class OrderActionHeaderBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OrderActionIDX9", required = true)
	private final String OrderActionIDX9;
	@XmlElement(name = "StatusX9", required = true)
	private final String StatusX9;
	@XmlElement(name = "DateX9", required = true)
	private final Date DateX9;
	@XmlElement(name = "SalesChannelX9", required = true)
	private final String SalesChannelX9;
	@XmlElement(name = "ProductServiceIDX9", required = true)
	private final String ProductServiceIDX9;
	@XmlElement(name = "ActionX9", required = true)
	private final String ActionX9;
	
	public static class Builder implements com.practia.oms.datatypes.builder.Builder<AbstractBeantype> {

		private String OrderActionIDX9;
		private String StatusX9;
		private Date DateX9;
		private String SalesChannelX9;
		private String ProductServiceIDX9;
		private String ActionX9;

		public Builder(String OrderActionIDX9,
				String StatusX9,Date DateX9,String SalesChannelX9,
				String ProductServiceIDX9,String ActionX9) {
//			this.OrderActionIDX9 = org.apache.commons.lang.StringUtils.isEmpty(OrderActionIDX9)? null : OrderActionIDX9;
//			this.StatusX9 = org.apache.commons.lang.StringUtils.isEmpty(StatusX9) ? null : StatusX9;
			this.OrderActionIDX9 = OrderActionIDX9;
			this.StatusX9 = StatusX9;
			this.DateX9 = DateX9;
			this.SalesChannelX9 = SalesChannelX9;
			this.ProductServiceIDX9 = ProductServiceIDX9;
			this.ActionX9 = ActionX9;
		}
		
		
		public OrderActionHeaderBean build() {
			return new OrderActionHeaderBean(this);
		}
	}

	private OrderActionHeaderBean(Builder builder) {
		this.ActionX9 = builder.ActionX9;
		this.DateX9 = builder.DateX9;
		this.OrderActionIDX9 = builder.OrderActionIDX9;
		this.ProductServiceIDX9 = builder.ProductServiceIDX9;
		this.SalesChannelX9 = builder.SalesChannelX9;
		this.StatusX9 = builder.StatusX9;
	}
}




