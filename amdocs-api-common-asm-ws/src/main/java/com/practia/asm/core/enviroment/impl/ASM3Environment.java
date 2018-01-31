package com.practia.asm.core.enviroment.impl;

import static com.practia.asm.core.configuration.properties.ConfigurationProperties.LOCAL_CONTEXT;
import static javax.naming.Context.*;
import java.util.Properties;

import com.practia.asm.core.configuration.ConfigurationByCredentials;
import com.practia.asm.core.enviroment.EnvironmentServices;
import com.practia.asm.core.enviroment.EnvironmentType;

public class ASM3Environment implements EnvironmentServices {

	private ConfigurationByCredentials configuration;

	public void getEnvironment(Properties properties) {
		properties.put(PROVIDER_URL, configuration.getProviderURL());
		properties.put(INITIAL_CONTEXT_FACTORY, configuration.getFactoryInitial());
		properties.put(LOCAL_CONTEXT.propertyName(), configuration.isLocalContext());
		properties.put(SECURITY_CREDENTIALS, configuration.getSecurityCredentials());
		properties.put(SECURITY_PRINCIPAL, configuration.getSecurityPrincipal());
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
}
