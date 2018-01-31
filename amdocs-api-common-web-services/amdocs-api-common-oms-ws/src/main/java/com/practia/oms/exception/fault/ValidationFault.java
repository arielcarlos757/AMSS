package com.practia.oms.exception.fault;

import java.rmi.RemoteException;

public class ValidationFault extends MessageFault {

	private static final long serialVersionUID = 1L;
	

	public ValidationFault(Throwable e) {
		this.exceptionAppCode = getMessageErrorCode(e.getMessage());
		this.exceptionAppMessage = getMessageError(e.getMessage());
		this.exceptionAppSeverity = "5";
		this.exceptionAppCause = ((RemoteException)e).getLocalizedMessage();
	}
	
	private String getMessageErrorCode(String msg) {
		return org.apache.commons.lang.StringUtils.isEmpty(msg) ?
				null :
				msg.substring(0, msg.indexOf(" "));
	}
	
	private String getMessageError(String msg) {
		return org.apache.commons.lang.StringUtils.isEmpty(msg) ?
				null :
				msg.substring(msg.indexOf(" "), msg.length());
	}
}
