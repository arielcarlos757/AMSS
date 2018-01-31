package com.practia.asm.core.configuration;


public interface ConfigurationEnvironment {
	public abstract String getFactoryInitial();
	public abstract String getProviderURL();
	public abstract String getSecurityCredentials();
	public abstract String isLocalContext();
}
