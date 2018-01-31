package com.practia.asm.core.user.ticket.manager.impl;

import java.rmi.RemoteException;

import org.joda.time.DateTime;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.practia.asm.core.configuration.ConfigurationLoginServices;
import com.practia.asm.core.event.ASM3Events;
import com.practia.asm.core.event.ASM3TicketEvent;
import com.practia.asm.core.user.ticket.ASM3Ticket;
import com.practia.asm.core.user.ticket.manager.ASM3TicketManager;

import amdocs.uams.exceptions.ASM3WSException;

public class ASM3TicketManagerImpl implements ASM3TicketManager, ApplicationEventPublisherAware, InitializingBean {

	private static Logger logger = LogManager.getLogger();
	
	private ApplicationEventPublisher applicationEventPublisher;
	private ASM3Ticket asm3Ticket;
	private amdocs.uams.sessions.interfaces.api.ASM3LoginServices ASM3LoginServices;
	private ConfigurationLoginServices configuration;
	private String webContextRoot;

	public ASM3TicketManagerImpl() { // default constructor
		this.asm3Ticket = new ASM3Ticket();
	}

	public void createNewTicket() throws RemoteException, ASM3WSException {
		getAsm3Ticket()
				.setTicket(
						getASM3LoginServices()
								.login(configuration.loginServicesUserId(), configuration.loginServicesPass(),
										configuration.loginServicesAppId(), configuration.loginServicesEnv())
								.toCharArray());
		// log the created ticket
		logger.info(String.format("ASM3 - TicketManager - Generate a new ticket at %s - Ticket Details %s",
				DateTime.now(), getAsm3Ticket().toString()));
	}

	public boolean isValidTicket() throws RemoteException, ASM3WSException {
		logger.info("ASM3 - TicketManager - Validating ticket at " + DateTime.now());
		boolean valid = getASM3LoginServices()
				.isValid(new StringBuilder().append(getAsm3Ticket().getTicket()).toString());
		if (!valid) {
			createNewTicket();
			getApplicationEventPublisher()
					.publishEvent(new ASM3TicketEvent(this, ASM3Events.EVENT_TYPE_NEW_TICKET, getAsm3Ticket()));

		}
		return valid;
	}

	public void relogin() throws RemoteException, ASM3WSException {
		ASM3Ticket ticket = new ASM3Ticket();
		ticket.setTicket(
				getASM3LoginServices().login(configuration.loginServicesUserId(), configuration.loginServicesPass(),
						configuration.loginServicesAppId(), configuration.loginServicesEnv()).toCharArray());
		ASM3Ticket old = getAsm3Ticket();
		// set the new ticket
		setAsm3Ticket(ticket);
		// publish the event
		getApplicationEventPublisher()
				.publishEvent(new ASM3TicketEvent(this, ASM3Events.EVENT_TYPE_NEW_TICKET, ticket));
		// logout
		getASM3LoginServices().logout(new StringBuilder().append(old.getTicket()).toString()); ///no needed logout because the ticket during 24hs
		logger.info(String.format(
				"\n - %s : BEGIN RELOGIN - \n - LOGOUT TICKET : %s at %s\n - LOGIN TICKET : %s\n - %s : END RELOGIN - ",
				getWebContextRoot(), old.toString(), DateTime.now(), getAsm3Ticket().toString(),getWebContextRoot()));
	}

	public void afterPropertiesSet() throws RemoteException, ASM3WSException {
		if (getApplicationEventPublisher() != null) {
			createNewTicket();
			getApplicationEventPublisher()
					.publishEvent(new ASM3TicketEvent(this, ASM3Events.EVENT_TYPE_INITIAL_CONTEXT, getAsm3Ticket()));
		}
	}

	public amdocs.uams.sessions.interfaces.api.ASM3LoginServices getASM3LoginServices() {
		return ASM3LoginServices;
	}

	public void setASM3LoginServices(amdocs.uams.sessions.interfaces.api.ASM3LoginServices aSM3LoginServices) {
		ASM3LoginServices = aSM3LoginServices;
	}

	public ASM3Ticket getAsm3Ticket() {
		return asm3Ticket;
	}

	public void setAsm3Ticket(ASM3Ticket asm3Ticket) {
		this.asm3Ticket = asm3Ticket;
	}

	public ApplicationEventPublisher getApplicationEventPublisher() {
		return applicationEventPublisher;
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public ConfigurationLoginServices getConfiguration() {
		return configuration;
	}

	public void setConfiguration(ConfigurationLoginServices configuration) {
		this.configuration = configuration;
	}

	public String getWebContextRoot() {
		return webContextRoot;
	}

	public void setWebContextRoot(String webContextRoot) {
		this.webContextRoot = webContextRoot;
	}
}
