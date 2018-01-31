package com.practia.informationmodel.mobileapps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribute")
public class AttributeBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "NameX9", required = true)
	private String NameX9;
	@XmlElement(name = "ValueX9", required = true)
	private String ValueX9;

	public static class Builder implements com.practia.oms.datatypes.builder.Builder<AttributeBean> {

		private String NameX9;
		private String ValueX9;

		public Builder(String NameX9, String ValueX9) {
			this.NameX9 = NameX9;
			this.ValueX9 = ValueX9;
		}

		@Override
		public AttributeBean build() {
			return new AttributeBean(this);
		}
	}

	private AttributeBean(Builder builder) {
		this.NameX9 = builder.NameX9;
		this.ValueX9 = builder.ValueX9;
	}

}
