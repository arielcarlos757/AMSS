package com.practia.bl3g.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import amdocs.bl3g.domains.DOMAINbl1dynatrv;
import amdocs.bl3g.domains.DOMAINbl1gencd;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeInfo")
public class AttributeInfoBean {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "attributeName", required = false)
	private final String attributeName;
	
	@XmlElement(name = "attributeValue", required = false)
	private final String attributeValue;
	
	public static class Builder implements com.practia.datalayer.datatypes.builder.Builder<AttributeInfoBean> {
		
		private String attributeName = null;
		private String attributeValue = null;
		
		public Builder attributeName(String val) 
			{this.attributeName = DOMAINbl1gencd.isNull(val) ? null : val; return this;}
		public Builder attributeValue(String val) 
			{this.attributeValue =DOMAINbl1dynatrv.isNull(val) ? null : val; return this;}
		
		public AttributeInfoBean build() {
			return new AttributeInfoBean(this);
		}
	}
	
	private AttributeInfoBean(Builder builder) {
		this.attributeName = builder.attributeName;
		this.attributeValue = builder.attributeValue;
	}
}
