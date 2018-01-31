package com.practia.asm.core.event;

import org.springframework.context.ApplicationEvent;

import com.practia.asm.core.user.ticket.ASM3Ticket;


// http://howtodoinjava.com/spring/spring-core/how-to-publish-and-listen-application-events-in-spring/
public class ASM3TicketEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	private ASM3Events eventType;
	private ASM3Ticket asm3Ticket;

	public ASM3TicketEvent(Object source, ASM3Events eventType, ASM3Ticket asm3Ticket) {
		super(source);
		this.asm3Ticket = asm3Ticket;
		this.eventType = eventType;
	}

	public ASM3Events getEventType() {
		return eventType;
	}

	public void setEventType(ASM3Events eventType) {
		this.eventType = eventType;
	}

	public ASM3Ticket getAsm3Ticket() {
		return asm3Ticket;
	}

	public void setAsm3Ticket(ASM3Ticket asm3Ticket) {
		this.asm3Ticket = asm3Ticket;
	}
	
	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName() + "=[%s]", 
			getEventType()
				);
	}
}
