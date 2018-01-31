package com.practia.abp.datatypes.invoicing;

import java.io.Serializable;

public class AttributeInfo_Fixed implements Cloneable, Serializable {
	public AttributeInfo_Fixed() {
		super();
	}

	private static final long serialVersionUID = 306509713937682353L;

	private String attributeName;
	private String attributeValue;

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public AttributeInfo_Fixed(amdocs.bl3g.datatypes.AttributeInfo copyFrom) {
		super();
		this.attributeName = copyFrom.getAttributeName();
		this.attributeValue = copyFrom.getAttributeValue();
	}

	public static AttributeInfo_Fixed convert(amdocs.bl3g.datatypes.AttributeInfo other) {
		return new AttributeInfo_Fixed(other);
	}

	public static AttributeInfo_Fixed[] convert(amdocs.bl3g.datatypes.AttributeInfo[] otherArr) {
		if (otherArr == null || otherArr.length == 0)
			return null;
		AttributeInfo_Fixed[] ret = new AttributeInfo_Fixed[otherArr.length];
		for (int i = 0; i < otherArr.length; i++) {
			ret[i] = new AttributeInfo_Fixed(otherArr[i]);
		}
		return ret;
	}

}