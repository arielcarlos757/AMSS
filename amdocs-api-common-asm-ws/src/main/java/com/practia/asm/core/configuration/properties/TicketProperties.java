package com.practia.asm.core.configuration.properties;

import static com.practia.asm.core.configuration.properties.ConfigurationProperties.*;
import com.practia.asm.core.configuration.ConfigurationEnvironment;
import com.practia.asm.core.configuration.ApplicationProperties;

public class TicketProperties extends ApplicationProperties implements ConfigurationEnvironment {

	@Override
	public String getFactoryInitial() {
		return super.getProperty(TICKET_INITIAL_CONTEXT_FACTORY.propertyName());
	}

	@Override
	public String getProviderURL() {
		return super.getProperty(TICKET_PROVIDER_URL.propertyName());
	}

	@Override
	public String getSecurityCredentials() {
		return super.getProperty(TICKET_SECURITY_CREDENTIALS.propertyName());
	}

	@Override
	public String isLocalContext() {
		return super.getProperty(LOCAL_CONTEXT.propertyName());
	}
}
