package com.practia.asm.core.enviroment.impl;

import static com.practia.asm.core.configuration.properties.ConfigurationProperties.LOCAL_CONTEXT;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.USE_TICKET;
import static javax.naming.Context.INITIAL_CONTEXT_FACTORY;
import static javax.naming.Context.PROVIDER_URL;
import static javax.naming.Context.SECURITY_CREDENTIALS;
import static javax.naming.Context.SECURITY_PRINCIPAL;
import java.util.Properties;
import com.practia.asm.core.configuration.ConfigurationByCredentials;
import com.practia.asm.core.enviroment.EnvironmentServices;
import com.practia.asm.core.enviroment.EnvironmentType;
import com.practia.asm.core.user.services.ASM3UserServices;


public class CredentialsEnvironment implements EnvironmentServices {

	private ConfigurationByCredentials configuration;
	private ASM3UserServices userServices;

	@Override
	public void getEnvironment(Properties properties) {
		properties.put(PROVIDER_URL, configuration.getProviderURL());
		properties.put(INITIAL_CONTEXT_FACTORY, configuration.getFactoryInitial());
		properties.put(LOCAL_CONTEXT.propertyName(), configuration.isLocalContext());
		properties.put(USE_TICKET.propertyName(),  Boolean.FALSE);
		properties.put(SECURITY_CREDENTIALS, getUserServices().getPassword());
		properties.put(SECURITY_PRINCIPAL, getUserServices().getUser());
	}

	public String getEnvironmentType() {
		return EnvironmentType.AMDOCS_ENVIRONMENT;
	}
	
	public ConfigurationByCredentials getConfiguration() {
		return configuration;
	}

	public void setConfiguration(ConfigurationByCredentials configuration) {
		this.configuration = configuration;
	}

	public ASM3UserServices getUserServices() {
		return userServices;
	}

	public void setUserServices(ASM3UserServices userServices) {
		this.userServices = userServices;
	}
}
