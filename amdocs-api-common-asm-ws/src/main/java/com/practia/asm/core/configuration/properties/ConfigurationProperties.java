package com.practia.asm.core.configuration.properties;

public enum ConfigurationProperties {
	ASM3_INITIAL_CONTEXT_FACTORY("ASM3.java.naming.factory.initial"),
	ASM3_PROVIDER_URL("ASM3.java.naming.provider.url"),
	ASM3_SECURITY_PRINCIPAL("ASM3.java.naming.security.principal"),
	ASM3_SECURITY_CREDENTIALS("ASM3.java.naming.security.credentials"),
	ENVIRONMENT_TYPE("environment.type"),
	// CREDENTIAL
	CREDENTIALS_INITIAL_CONTEXT_FACTORY("CREDENTIALS.java.naming.factory.initial"),
	CREDENTIALS_PROVIDER_URL("CREDENTIALS.java.naming.provider.url"),
	CREDENTIALS_SECURITY_PRINCIPAL("CREDENTIALS.java.naming.security.principal"),
	CREDENTIALS_SECURITY_CREDENTIALS("CREDENTIALS.java.naming.security.credentials"),
	// TICKET
	TICKET_INITIAL_CONTEXT_FACTORY("java.naming.factory.initial"),
	TICKET_PROVIDER_URL("java.naming.provider.url"),
	TICKET_SECURITY_CREDENTIALS("java.naming.security.credentials"),
	// CREDENTIALS TO LOGIN IN ASM
	LOGIN_SERVICE_USER_ID("direct.login.wrapper.userId"),
	LOGIN_SERVICE_PASS("direct.login.wrapper.password"),
	LOGIN_SERVICE_APP_ID("direct.login.wrapper.appId"),
	LOGIN_SERVICE_ENV("direct.login.wrapper.env"),
	// COMMON TO ALL
	USE_ENCRYPTION("use.encryption"),
	ASM3_PASSPHRASE_KEY("ASM Configuration"),
	ALGORITHM_NAME("DES"),
	ENVIRONMENT_BY_TICKET("ticket"),
	ENVIRONMENT_BY_CREDENTIALS("credentials"),
	LOCAL_CONTEXT("flag.local.context"),
	ENCODING("UTF8"),
	USE_TICKET("flag.use.asm.ticket");
	
	private final String property;
	
	ConfigurationProperties(final String property) {
		this.property = property;
	}
	
	public String propertyName(){
		return this.property;
	}
}
