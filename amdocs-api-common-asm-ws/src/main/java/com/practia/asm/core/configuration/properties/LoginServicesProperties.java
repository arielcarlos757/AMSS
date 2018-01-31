package com.practia.asm.core.configuration.properties;

import com.practia.asm.core.configuration.ApplicationProperties;
import com.practia.asm.core.configuration.CommonConfiguration;
import com.practia.asm.core.configuration.ConfigurationLoginServices;
import com.practia.asm.core.encryption.Crypter;
import com.practia.asm.core.encryption.EncryptionUtility;

import static com.practia.asm.core.configuration.properties.ConfigurationProperties.*;

public class LoginServicesProperties extends ApplicationProperties implements ConfigurationLoginServices {

	public String loginServicesUserId() {
		return Boolean.valueOf(super.getProperty(USE_ENCRYPTION.propertyName()))
				? Crypter.INSTANCE
						.decrypt(
								super.getProperty(LOGIN_SERVICE_USER_ID.propertyName()))
				: super.getProperty(LOGIN_SERVICE_USER_ID.propertyName());
	}

	public String loginServicesPass() {
		return Boolean.valueOf(super.getProperty(USE_ENCRYPTION.propertyName()))
				? Crypter.INSTANCE
							.decrypt(
									super.getProperty(LOGIN_SERVICE_PASS.propertyName()))
				: super.getProperty(LOGIN_SERVICE_PASS.propertyName());
	}

	public String loginServicesAppId() {
		return super.getProperty(LOGIN_SERVICE_APP_ID.propertyName());
	}

	public String loginServicesEnv() {
		return super.getProperty(LOGIN_SERVICE_ENV.propertyName());
	}

}
