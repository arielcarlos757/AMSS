package com.practia.services.productdomain.lightweight.lib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.practia.oms.datatypes.type.AbstractBeantype;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStatus")
public class ResponseStatusBean extends AbstractBeantype {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "StatusX9", required = true)
	private final Boolean StatusX9;
	@XmlElement(name = "RejectCodeX9")
	private final String RejectCodeX9;
	@XmlElement(name = "RejectDescriptionX9")
	private final String RejectDescriptionX9;

	
	public static class Builder implements com.practia.oms.datatypes.builder.Builder<ResponseStatusBean> {

		private Boolean StatusX9;
		private String RejectCodeX9 = null;
		private String RejectDescriptionX9 = null;

		public Builder(boolean Status) {
			this.StatusX9 = Boolean.valueOf(Status);
		}
		
		public Builder RejectCodeX9(String val) 
			{ this.RejectCodeX9 = org.apache.commons.lang.StringUtils.isEmpty(val) ? null : val; return this; }
		
		public Builder RejectDescriptionX9(String val) 
			{ this.RejectDescriptionX9 = org.apache.commons.lang.StringUtils.isEmpty(val) ? null : val; return this; }
	
		
		public ResponseStatusBean build() {
			return new ResponseStatusBean(this);
		}
	}

	private ResponseStatusBean(Builder builder) {
		this.RejectCodeX9 = builder.RejectCodeX9;
		this.RejectDescriptionX9 = builder.RejectDescriptionX9;
		this.StatusX9 = builder.StatusX9;
	}
}
