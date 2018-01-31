package com.practia.asm.core.user.services;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import com.practia.asm.core.configuration.ConfigurationByCredentials;
import com.practia.asm.core.encryption.EncryptionUtility;
import com.practia.asm.core.event.ASM3TicketEvent;
import com.practia.asm.core.user.ASM3User;
import com.practia.asm.core.user.ticket.ASM3Ticket;

import amdocs.uams.exceptions.ASM3WSException;

@Component
public class ASM3UserServices implements ApplicationListener<ASM3TicketEvent> {

	private static Logger logger = LogManager.getLogger();
	private ASM3User asm3User;
	private String webContextRoot;

	public ASM3UserServices() { // default constructor
		this.asm3User = new ASM3User();
	}

	public ASM3User getAsm3User() {
		return asm3User;
	}

	public void setAsm3User(ASM3User asm3User) {
		this.asm3User = asm3User;
	}

	public String getUser() {
		return asm3User.getSecurityPrincipal();
	}

	public String getPassword() {
		return asm3User.getSecurityCredentials(); 
	}

	public String getTicket() throws RemoteException, ASM3WSException {
		return new StringBuilder().append(getAsm3User().getAsm3Ticket().getTicket()).toString();
	}

	@Override
	public void onApplicationEvent(ASM3TicketEvent event) {
		ASM3TicketEvent asm3TicketEvent = (ASM3TicketEvent) event;
		ASM3Ticket t = asm3TicketEvent.getAsm3Ticket();
		getAsm3User().setAsm3Ticket(t);
		logger.info(String.format(
				"User Services listening a new event in context - %s - Ticket Details %s - Event Triggered - %s",
				getWebContextRoot(), t.toString(), asm3TicketEvent.toString()));
	}

	public String getWebContextRoot() {
		return webContextRoot;
	}

	public void setWebContextRoot(String webContextRoot) {
		this.webContextRoot = webContextRoot;
	}
}
