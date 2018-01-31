package com.practia.asm.core.configuration.properties;



import static com.practia.asm.core.configuration.properties.ConfigurationProperties.USE_TICKET;

import com.practia.asm.core.configuration.ApplicationProperties;
import com.practia.asm.core.configuration.CommonConfiguration;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.ENVIRONMENT_TYPE;
public class CommonConfigurationProperties extends ApplicationProperties implements CommonConfiguration {
	
	@Override
	public String useTicket() {
		return getProperty(USE_TICKET.propertyName());
	}
	
	@Override
	public String environmentType() {
		return getProperty(ENVIRONMENT_TYPE.propertyName());
	}
}
