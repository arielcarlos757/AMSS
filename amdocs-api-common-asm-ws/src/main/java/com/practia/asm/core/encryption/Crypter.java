package com.practia.asm.core.encryption;

import javax.crypto.Cipher;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.ASM3_PASSPHRASE_KEY;
import static com.practia.asm.core.configuration.properties.ConfigurationProperties.ALGORITHM_NAME;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import com.bea.common.security.utils.encoders.BASE64Decoder;
import com.bea.common.security.utils.encoders.BASE64Encoder;

public enum Crypter {
	INSTANCE;

	public String decrypt(String encrypted) {

		String plainTextPassword = encrypted;

		try {
			DESKeySpec keySpec = new DESKeySpec(ASM3_PASSPHRASE_KEY.propertyName().getBytes("UTF8"));
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM_NAME.propertyName());
			SecretKey key = keyFactory.generateSecret(keySpec);
			BASE64Decoder base64decoder = new BASE64Decoder();

			byte[] encrypedPwdBytes = base64decoder.decodeBuffer(encrypted);

			Cipher cipher = Cipher.getInstance(ALGORITHM_NAME.propertyName());// cipher
																				// is
																				// not
																				// thread
																				// safe
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] plainTextPwdBytes = (cipher.doFinal(encrypedPwdBytes));

			plainTextPassword = new String(plainTextPwdBytes);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error trying to encrypt the password: '" + e.getMessage() + "'");
		}

		return plainTextPassword;
	}

	public String encrypt(String plainTextPassword) {

		String crypted = plainTextPassword;

		try {
			DESKeySpec keySpec = new DESKeySpec(ASM3_PASSPHRASE_KEY.propertyName().getBytes("UTF8"));
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM_NAME.propertyName());
			SecretKey key = keyFactory.generateSecret(keySpec);
			BASE64Encoder base64encoder = new BASE64Encoder();

			// ENCODE plainTextPassword String
			byte[] cleartext = plainTextPassword.getBytes("UTF8");

			Cipher cipher = Cipher.getInstance(ALGORITHM_NAME.propertyName()); // cipher
																				// is
																				// not
																				// thread
																				// safe
			cipher.init(Cipher.ENCRYPT_MODE, key);

			crypted = base64encoder.encodeBuffer(cipher.doFinal(cleartext));

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error trying to decrypt the password: '" + e.getMessage() + "'");
		}

		return crypted;
	}
}
