package com.practia.abp.exception.fault;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang.StringUtils;
import amdocs.bl3g.exceptions.BillingException;
import amdocs.acmarch.exceptions.ACMException;

public abstract class MessageFault implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String exceptionAppCode;
	protected String exceptionAppMessage;
	protected String exceptionAppSeverity;
	protected String exceptionAppCause;

	public MessageFault() {}

	public String getExceptionAppCode() {
		return exceptionAppCode;
	}

	public void setExceptionAppCode(String exceptionAppCode) {
		this.exceptionAppCode = exceptionAppCode;
	}

	public String getExceptionAppMessage() {
		return exceptionAppMessage;
	}

	public void setExceptionAppMessage(String exceptionAppMessage) {
		this.exceptionAppMessage = exceptionAppMessage;
	}

	public String getExceptionAppSeverity() {
		return exceptionAppSeverity;
	}

	public void setExceptionAppSeverity(String exceptionAppSeverity) {
		this.exceptionAppSeverity = exceptionAppSeverity;
	}

	public String getExceptionAppCause() {
		return exceptionAppCause;
	}

	public void setExceptionAppCause(String exceptionAppCause) {
		this.exceptionAppCause = exceptionAppCause;
	}

	protected static String getAppCode(String message) {
		if (!StringUtils.isEmpty(message)) {
			Matcher m = Pattern.compile("\\(([^)]+)\\)").matcher(message);
			while(m.find()) {
				return m.group(1);
			}
		}
		return "";
	}

	protected static String getAppMessage(String message) {
		if (!StringUtils.isEmpty(message)) {
			return message.substring(message.indexOf(")") + 2, message.length());
		}
		return "";
	}
	
	public static MessageFault MessageFactory(Throwable e) {
		if(e instanceof BillingException) {
			return new BillingFault(e);
		}
		
		if(e instanceof ACMException) {
			return new AMDOCSFault(e);
		}
		return new GenericFault(e);
	}
}
