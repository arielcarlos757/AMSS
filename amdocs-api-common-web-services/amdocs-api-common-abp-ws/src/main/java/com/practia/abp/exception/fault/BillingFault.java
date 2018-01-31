package com.practia.abp.exception.fault;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import amdocs.acmarch.exceptions.ACMException;

public class BillingFault  extends MessageFault {

	private static final long serialVersionUID = 1L;

	public BillingFault(Throwable e) {
		this.exceptionAppCode = getAppCode(((ACMException) e).getMessage(), ((ACMException) e).getMessageRepository().applicationName);
		this.exceptionAppMessage = getAppMessage(((ACMException) e).getMessage());
		this.exceptionAppSeverity = String.valueOf(((ACMException) e).getSeverity());
		this.exceptionAppCause = ((ACMException) e).getMessageRepository().messageId;
	}
	
	protected static String getAppCode(String message, String appName) {
		if("BL".equals(appName)) {
			return message.substring(0, 
					message.indexOf(" "));
		}
		if (!StringUtils.isEmpty(message)) {
			return message.substring(message.indexOf("(") + 1, 
					message.indexOf(")"));
		}
		return "";
	}
	
	
	protected static String getAppCode(String message) {
		if (!StringUtils.isEmpty(message)) {
			return message.substring(message.indexOf("(") + 1, 
					message.indexOf(")"));
		}
		return "";
	}
	
	protected static String getAppMessage(String message) {
		if (!StringUtils.isEmpty(message)) {
			Matcher m = Pattern.compile("\\(([^)]+)\\)").matcher(message);
			while(m.find()) {
				return m.group(1);
			}
		}
		return "";
	}
}
