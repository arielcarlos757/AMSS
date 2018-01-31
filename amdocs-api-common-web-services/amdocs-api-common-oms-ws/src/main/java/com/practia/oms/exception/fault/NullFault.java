package com.practia.oms.exception.fault;

import static com.practia.oms.exception.GENArchErrorMessages.GENERIC_ERROR;

public class NullFault extends MessageFault {

	private static final long serialVersionUID = 1L;
	
	public NullFault(Throwable e) {
		this.exceptionAppCode = GENERIC_ERROR.getCode();
		this.exceptionAppMessage = GENERIC_ERROR.getMessage();
		this.exceptionAppSeverity = "5";
		this.exceptionAppCause = ((NullPointerException)e).getLocalizedMessage();
	}
}
