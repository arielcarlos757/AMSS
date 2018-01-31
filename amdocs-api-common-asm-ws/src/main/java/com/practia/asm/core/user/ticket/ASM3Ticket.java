package com.practia.asm.core.user.ticket;

import org.joda.time.DateTime;

public class ASM3Ticket {

	private char[] ticket;
	private DateTime created;

	public ASM3Ticket() {
		this.created = DateTime.now();
	}

	public ASM3Ticket(char[] ticket) {
		this.ticket = ticket;
	}

	public char[] getTicket() {
		return ticket;
	}

	public void setTicket(char[] ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName() + "=[ticket=%s];created=[%s]]",
			this.ticket == null || this.ticket.length == 0? "null" : this.ticket.toString(),
					this.created.toString());
	}
}
