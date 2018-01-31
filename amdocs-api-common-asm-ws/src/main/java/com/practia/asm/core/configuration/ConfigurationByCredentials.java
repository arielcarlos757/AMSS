package com.practia.asm.core.configuration;

public interface ConfigurationByCredentials extends ConfigurationEnvironment {
	public abstract String getSecurityPrincipal();
	public abstract String useEncryption();
}
