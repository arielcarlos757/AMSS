package com.practia.asm.core.user.ticket.manager;

import java.rmi.RemoteException;

import amdocs.uams.exceptions.ASM3WSException;

//http://howtodoinjava.com/spring/spring-core/how-to-publish-and-listen-application-events-in-spring/
public interface ASM3TicketManager {

	public abstract void createNewTicket() throws RemoteException, ASM3WSException;

	public abstract boolean isValidTicket() throws RemoteException, ASM3WSException;
}
