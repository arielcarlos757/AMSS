package com.practia.abp.exception.fault;

import amdocs.acmarch.exceptions.ACMException;

public class AMDOCSFault extends MessageFault {

	private static final long serialVersionUID = 1L;

	public AMDOCSFault(Throwable e) {
		this.exceptionAppCode = super.getAppCode(((ACMException) e).getMessage());
		this.exceptionAppMessage = super.getAppMessage(((ACMException) e).getMessage());
		this.exceptionAppSeverity = String.valueOf(((ACMException) e).getSeverity());
		this.exceptionAppCause = ((ACMException) e).getMessageRepository().messageId;
	}
}
