package com.practia.asm.core.enviroment.impl;

import static com.practia.asm.core.configuration.properties.ConfigurationProperties.LOCAL_CONTEXT;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.*;
import static javax.naming.Context.INITIAL_CONTEXT_FACTORY;
import static javax.naming.Context.PROVIDER_URL;
import static javax.naming.Context.SECURITY_CREDENTIALS;
import static javax.naming.Context.SECURITY_PRINCIPAL;

import java.rmi.RemoteException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.practia.asm.core.configuration.ConfigurationEnvironment;
import com.practia.asm.core.enviroment.EnvironmentServices;
import com.practia.asm.core.enviroment.EnvironmentType;
import com.practia.asm.core.user.services.ASM3UserServices;

import amdocs.uams.exceptions.ASM3WSException;

public class TicketEnvironment implements EnvironmentServices {

	private static Logger logger = LogManager.getLogger();
	private ConfigurationEnvironment configuration;
	private ASM3UserServices ASM3UserServices;
	
	public void getEnvironment(Properties properties) {
		properties.put(PROVIDER_URL, configuration.getProviderURL());
		properties.put(INITIAL_CONTEXT_FACTORY, configuration.getFactoryInitial());
		properties.put(LOCAL_CONTEXT.propertyName(), configuration.isLocalContext());
		properties.put(SECURITY_CREDENTIALS, configuration.getSecurityCredentials());
		properties.put(USE_TICKET.propertyName(), Boolean.TRUE);
		try {
			properties.put(SECURITY_PRINCIPAL,
					getASM3UserServices().getTicket());
			logger.info(String.format("- %s ", getASM3UserServices().getAsm3User().getAsm3Ticket().toString()));
		} catch (RemoteException e) {
			logger.error(String.format("Could not connect with ASM3 Services", e));
		} catch (ASM3WSException e) {
			logger.error(String.format("Could not connect with ASM3 Services - Error Code :%s - Error Desc: %s - MessageException: ",
					e.getErrorCode(),
					e.getErrorDescription(),
					e.getMessage()),e);
		}
	}
	
	public String getEnvironmentType() {
		return EnvironmentType.AMDOCS_ENVIRONMENT;
	}
	
	public ConfigurationEnvironment getConfiguration() {
		return configuration;
	}

	public void setConfiguration(ConfigurationEnvironment configuration) {
		this.configuration = configuration;
	}
	
	public ASM3UserServices getASM3UserServices() {
		return ASM3UserServices;
	}

	public void setASM3UserServices(ASM3UserServices aSM3UserServices) {
		ASM3UserServices = aSM3UserServices;
	}
}
