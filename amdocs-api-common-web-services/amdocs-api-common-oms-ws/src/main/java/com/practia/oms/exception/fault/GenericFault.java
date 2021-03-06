package com.practia.oms.exception.fault;

import static com.practia.oms.exception.GENArchErrorMessages.GENERIC_ERROR;

public class GenericFault extends MessageFault {

	private static final long serialVersionUID = 1L;

	public GenericFault(Throwable e) {
		this.exceptionAppCode = GENERIC_ERROR.getCode();
		this.exceptionAppMessage = GENERIC_ERROR.getMessage();
		this.exceptionAppSeverity = "5";
		this.exceptionAppCause = ((Exception) e).getLocalizedMessage();
	}
}
