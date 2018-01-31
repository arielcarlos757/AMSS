package com.practia.oms.exception;

import javax.xml.ws.WebFault;

import com.practia.oms.exception.fault.MessageFault;

@WebFault(name="AACWSException")
public class AACWSException extends Exception {

	public static final long serialVersionUID = 1L;
	
	public MessageFault messageFault;

	public AACWSException(String message, Throwable aNestedException) { 
		super(message,aNestedException);
		this.messageFault = MessageFault.MessageFactory(aNestedException);
	}

	public MessageFault getMessageFault() {
		return messageFault;
	}

	public void setMessageFault(MessageFault messageFault) {
		this.messageFault = messageFault;
	}
}
