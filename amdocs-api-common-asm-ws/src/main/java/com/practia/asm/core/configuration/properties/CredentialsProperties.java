package com.practia.asm.core.configuration.properties;

import static com.practia.asm.core.configuration.properties.ConfigurationProperties.ASM3_PASSPHRASE_KEY;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.CREDENTIALS_INITIAL_CONTEXT_FACTORY;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.CREDENTIALS_PROVIDER_URL;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.CREDENTIALS_SECURITY_CREDENTIALS;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.CREDENTIALS_SECURITY_PRINCIPAL;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.LOCAL_CONTEXT;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.USE_ENCRYPTION;

import java.util.Arrays;

import com.practia.asm.core.com.security.SecurityCredentials;
import com.practia.asm.core.com.security.SecurityPrincipal;
import com.practia.asm.core.configuration.ApplicationProperties;
import com.practia.asm.core.configuration.CommonConfiguration;
import com.practia.asm.core.configuration.ConfigurationByCredentials;
import com.practia.asm.core.encryption.Crypter;
import com.practia.asm.core.encryption.EncryptionUtility;

public class CredentialsProperties extends ApplicationProperties implements ConfigurationByCredentials {
	
	private CommonConfiguration configuration;
	private SecurityCredentials securityCredentials;
	private SecurityPrincipal securityPrincipal;


	@Override
	public String getFactoryInitial() {
		return super.getProperty(CREDENTIALS_INITIAL_CONTEXT_FACTORY.propertyName());
	}

	@Override
	public String getProviderURL() {
		return super.getProperty(CREDENTIALS_PROVIDER_URL.propertyName());
	}

	@Override
	public String getSecurityCredentials() {
		return Boolean.valueOf(super.getProperty(USE_ENCRYPTION.propertyName()))?
				getCredentials():
					super.getProperty(CREDENTIALS_SECURITY_CREDENTIALS.propertyName());
	}

	@Override
	public String isLocalContext() {
		return super.getProperty(LOCAL_CONTEXT.propertyName());
	}

	@Override
	public String getSecurityPrincipal() {
		return Boolean.valueOf(super.getProperty(USE_ENCRYPTION.propertyName()))?
				getPrincipal():
					super.getProperty(CREDENTIALS_SECURITY_PRINCIPAL.propertyName());
	}
	
	@Override
	public String useEncryption() {
		return super.getProperty(USE_ENCRYPTION.propertyName());
	}

	private String getCredentials() {
		if(securityCredentials == null) {
			char[] value = super.getProperty(CREDENTIALS_SECURITY_CREDENTIALS.propertyName()).toCharArray();
			char[] decrypted = Crypter.INSTANCE
										.decrypt(
											super.getProperty(CREDENTIALS_SECURITY_CREDENTIALS.propertyName())).toCharArray();
			
			securityCredentials = new SecurityCredentials();
			securityCredentials.setDecriptedValue(new char[decrypted.length]);
			securityCredentials.setValue(new char[value.length]);
			System.arraycopy(decrypted, 
					0, securityCredentials.getDecriptedValue(), 0, decrypted.length);
			System.arraycopy(value, 
					0, securityCredentials.getValue(), 0, value.length);
			
		} else {
			char[] value = super.getProperty(CREDENTIALS_SECURITY_CREDENTIALS.propertyName()).toCharArray();
			if(!Arrays.equals(securityCredentials.getValue(), value)) {
				char[] decrypted = Crypter.INSTANCE
											.decrypt(
													super.getProperty(CREDENTIALS_SECURITY_CREDENTIALS.propertyName())).toCharArray();
				securityCredentials.setDecriptedValue(new char[decrypted.length]);
				securityCredentials.setValue(new char[value.length]);
				System.arraycopy(decrypted, 
						0, securityCredentials.getDecriptedValue(), 0, decrypted.length);
				System.arraycopy(value, 
						0, securityCredentials.getValue(), 0, value.length);
			}
		}
		return new StringBuilder().append(securityCredentials.getDecriptedValue()).toString();
	}
	
	private String getPrincipal() {
		if(securityPrincipal == null) {
			char[] value = super.getProperty(CREDENTIALS_SECURITY_PRINCIPAL.propertyName()).toCharArray();
			char[] decrypted = Crypter.INSTANCE
										.decrypt(
												super.getProperty(CREDENTIALS_SECURITY_PRINCIPAL.propertyName())).toCharArray();
			
			securityPrincipal = new SecurityPrincipal();
			securityPrincipal.setDecriptedValue(new char[decrypted.length]);
			securityPrincipal.setValue(new char[value.length]);
			System.arraycopy(decrypted, 
					0, securityPrincipal.getDecriptedValue(), 0, decrypted.length);
			System.arraycopy(value, 
					0, securityPrincipal.getValue(), 0, value.length);
			
		} else {
			char[] value = super.getProperty(CREDENTIALS_SECURITY_PRINCIPAL.propertyName()).toCharArray();
			if(!Arrays.equals(securityPrincipal.getValue(), value)) {
				char[] decrypted = Crypter.INSTANCE
											.decrypt(
												super.getProperty(CREDENTIALS_SECURITY_PRINCIPAL.propertyName())).toCharArray();
				securityPrincipal.setDecriptedValue(new char[decrypted.length]);
				securityPrincipal.setValue(new char[value.length]);
				System.arraycopy(decrypted, 
						0, securityPrincipal.getDecriptedValue(), 0, decrypted.length);
				System.arraycopy(value, 
						0, securityPrincipal.getValue(), 0, value.length);
			}
		}
		return new StringBuilder().append(securityPrincipal.getDecriptedValue()).toString();
	}
}
