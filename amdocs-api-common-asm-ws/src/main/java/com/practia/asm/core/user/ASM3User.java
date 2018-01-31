package com.practia.asm.core.user;

import com.practia.asm.core.configuration.ConfigurationByCredentials;
import com.practia.asm.core.user.ticket.ASM3Ticket;

public class ASM3User {

	private ASM3Ticket asm3Ticket;
	private ConfigurationByCredentials configuration;

	public String getSecurityPrincipal() {
		return configuration.getSecurityPrincipal();
	}

	public boolean useEncryption() {
		return Boolean.valueOf(configuration.useEncryption());
	}

	public String getSecurityCredentials() {
		return configuration.getSecurityCredentials();
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
				this.asm3Ticket == null ? "null" : this.asm3Ticket.toString());
	}

	public ConfigurationByCredentials getConfiguration() {
		return configuration;
	}

	public void setConfiguration(ConfigurationByCredentials configuration) {
		this.configuration = configuration;
	}
}
