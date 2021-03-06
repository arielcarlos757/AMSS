package com.practia.abp.exception;

import static com.practia.abp.exception.GENArchErrorMessages.GENERIC_ERROR;
import javax.xml.ws.WebFault;

@WebFault(name="GenericException", targetNamespace="http://error.general.ar.amdocs")
public class GenericException extends Exception {

	private static final long serialVersionUID = 1L;

	public GenericException(final Throwable cause) {
		super(GENERIC_ERROR.getFormattedMessage(), cause);
	}
}
