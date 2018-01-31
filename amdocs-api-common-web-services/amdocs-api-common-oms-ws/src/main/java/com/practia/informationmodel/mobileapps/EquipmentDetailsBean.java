package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.amdocs.informationmodel.mobileapps.Attribute;
import com.amdocs.informationmodel.mobileapps.PriceInfo;
import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDetails")
public class EquipmentDetailsBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "TypeX9", required = true)
	private String TypeX9;
	@XmlElement(name = "DescriptionX9", required = false)
	private String DescriptionX9;
	@XmlElement(name = "AttributesX9", required = false)
	private AttributeBean[] AttributesX9;
	@XmlElement(name = "PriceInfoX9", required = false)
	private PriceInfoBean[] PriceInfoX9;

	public static class Builder implements com.practia.oms.datatypes.builder.Builder<EquipmentDetailsBean> {

		private String TypeX9;
		private String DescriptionX9;
		private AttributeBean[] AttributesX9;
		private PriceInfoBean[] PriceInfoX9;

		public Builder(String type) {
			this.TypeX9 = type;
		}

		public Builder DescriptionX9(String val) {
			this.DescriptionX9 = val;
			return this;
		}

		public Builder PriceInfoX9(PriceInfo[] val) {
			if (val == null || val.length == 0)
				return this;
			this.PriceInfoX9 = new PriceInfoBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.PriceInfoX9[i] = new PriceInfoBean.Builder(val[i].getValueX9(), val[i].getTypeX9(),
						val[i].getCurrencyX9()).build();
			}

			return this;
		}

		public Builder AttributesX9(Attribute[] val) {
			if (val == null || val.length == 0)
				return this;
			this.AttributesX9 = new AttributeBean[val.length];
			for (int i = 0; i < val.length; i++) {
				this.AttributesX9[i] = new AttributeBean.Builder(val[i].getNameX9(), val[i].getValueX9()).build();
			}

			return this;
		}

		public Builder PriceInfoX9(String val) {
			this.DescriptionX9 = val;
			return this;
		}

		@Override
		public EquipmentDetailsBean build() {
			return new EquipmentDetailsBean(this);
		}
	}
	
	private EquipmentDetailsBean(Builder builder) {
		this.AttributesX9 = builder.AttributesX9;
		this.DescriptionX9 = builder.DescriptionX9;
		this.TypeX9 = builder.TypeX9;
	}
}
