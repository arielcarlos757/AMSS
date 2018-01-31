package com.practia.asm.core.configuration.properties;

import static com.practia.asm.core.configuration.properties.ConfigurationProperties.ASM3_INITIAL_CONTEXT_FACTORY;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.ASM3_PROVIDER_URL;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.ASM3_SECURITY_CREDENTIALS;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.ASM3_SECURITY_PRINCIPAL;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.LOCAL_CONTEXT;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.USE_ENCRYPTION;
import com.practia.asm.core.configuration.ApplicationProperties;
import com.practia.asm.core.configuration.ConfigurationByCredentials;
import com.practia.asm.core.encryption.Crypter;
import com.practia.asm.core.encryption.EncryptionUtility;

public class ASM3Properties extends ApplicationProperties implements ConfigurationByCredentials {

	private EncryptionUtility crypter;

	@Override
	public String getFactoryInitial() {
		return super.getProperty(ASM3_INITIAL_CONTEXT_FACTORY.propertyName());
	}

	@Override
	public String getProviderURL() {
		return super.getProperty(ASM3_PROVIDER_URL.propertyName());
	}

	@Override
	public String getSecurityCredentials() {
		return useEncryption(super.getProperty(ASM3_SECURITY_CREDENTIALS.propertyName()));
	}

	@Override
	public String isLocalContext() {
		return super.getProperty(LOCAL_CONTEXT.propertyName());
	}

	@Override
	public String getSecurityPrincipal() {
		return useEncryption(super.getProperty(ASM3_SECURITY_PRINCIPAL.propertyName()));
	}

	@Override
	public String useEncryption() {
		return super.getProperty(USE_ENCRYPTION.propertyName());
	}

	public EncryptionUtility getCrypter() {
		return crypter;
	}

	public void setCrypter(EncryptionUtility crypter) {
		this.crypter = crypter;
	}

	private String useEncryption(String text) {
		return Boolean.valueOf(useEncryption()) ? Crypter.INSTANCE.decrypt(text) : text;
	}
}
