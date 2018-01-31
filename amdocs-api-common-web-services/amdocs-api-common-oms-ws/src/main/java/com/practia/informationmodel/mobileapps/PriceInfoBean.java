package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInfo")
public class PriceInfoBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "ValueX9", required = true)
	private final Double ValueX9;
	@XmlElement(name = "TypeX9", required = true)
	private final String TypeX9;
	@XmlElement(name = "CurrencyX9", required = true)
	private final String CurrencyX9;

	
	public static class Builder implements com.practia.oms.datatypes.builder.Builder<PriceInfoBean> {

		private Double ValueX9;
		private String TypeX9;
		private String CurrencyX9;

		public Builder(double ValueX9, String TypeX9, String CurrencyX9) {
			this.ValueX9 = ValueX9;
			this.TypeX9 = TypeX9;
			this.CurrencyX9 = CurrencyX9;
		}
		
		@Override
		public PriceInfoBean build() {
			return new PriceInfoBean(this);
		}
	}

	private PriceInfoBean(Builder builder) {
		this.CurrencyX9 = builder.CurrencyX9;
		this.TypeX9 = builder.TypeX9;
		this.ValueX9 = builder.ValueX9;
	}
}
