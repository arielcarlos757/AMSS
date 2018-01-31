package com.practia.asm.core.encryption;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.bea.common.security.utils.encoders.BASE64Decoder;
import com.bea.common.security.utils.encoders.BASE64Encoder;
import weblogic.apache.xerces.impl.dv.util.Base64;

public class EncryptionUtility {

/*	private static Logger logger = LogManager.getLogger();
	private static final String ASM3_PASSPHRASE_KEY = "ASM Configuration";
	private static final String ASM3_PASSPHRASE_KEY_AES= "bad8deadcafef00d";

	public synchronized String decrypt(String passphrase, String encrypted) {
		logger.info("decrypting..");
		try {
			logger.info("decrypting..");
			DESKeySpec keySpec = new DESKeySpec(passphrase.getBytes("UTF8"));
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey key = keyFactory.generateSecret(keySpec);
			BASE64Decoder base64decoder = new BASE64Decoder();

			byte[] encrypedPwdBytes = base64decoder.decodeBuffer(encrypted);

			Cipher cipher = Cipher.getInstance("DES");// cipher is not thread
			cipher.init(Cipher.DECRYPT_MODE, key);
			// safe
			byte[] plainTextPwdBytes = cipher.doFinal(encrypedPwdBytes);
			logger.info("decrypting..finish");
			return new String(plainTextPwdBytes);
		} catch (Exception e) {
			logger.info("Error trying to decrypt the password.", e);
			throw new RuntimeException("Error trying to decrypt the password.", e);
		}
	}

	public synchronized String decrypt(String encrypted) {
		logger.info("decrypting..");
		try {
			DESKeySpec keySpec = new DESKeySpec(ASM3_PASSPHRASE_KEY.toString().getBytes("UTF8"));
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey key = keyFactory.generateSecret(keySpec);
			BASE64Decoder base64decoder = new BASE64Decoder();

			byte[] encrypedPwdBytes = base64decoder.decodeBuffer(encrypted);

			Cipher cipher = Cipher.getInstance("DES");// cipher is not thread
														// safe
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] plainTextPwdBytes = cipher.doFinal(encrypedPwdBytes);
			logger.info("decrypting..finish");
			return new String(plainTextPwdBytes);
		} catch (Exception e) {
			logger.info("Error trying to decrypt the password.", e);
			throw new RuntimeException("Error trying to decrypt the password.", e);
		}
	}

	public synchronized String encrypt(String passphrase, String plainTextPassword) {
		logger.info("encrypt..");
		try {
			DESKeySpec keySpec = new DESKeySpec(passphrase.getBytes("UTF8"));
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey key = keyFactory.generateSecret(keySpec);
			BASE64Encoder base64encoder = new BASE64Encoder();

			// ENCODE plainTextPassword String
			byte[] cleartext = plainTextPassword.getBytes("UTF8");

			Cipher cipher = Cipher.getInstance("DES"); // cipher is not thread
														// safe
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] u = cipher.update(cleartext);
			cipher.doFinal();
			String encrypted = base64encoder.encodeBuffer(u);
			return encrypted;

		} catch (Exception e) {
			logger.error("Error trying to encrypt the password.", e);
			throw new RuntimeException("Error trying to encrypt the password.", e);
		}
	}

	public synchronized String encrypt(String plainTextPassword) {
		logger.info("encrypt..");
		try {
			DESKeySpec keySpec = new DESKeySpec(ASM3_PASSPHRASE_KEY.toString().getBytes("UTF8"));
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey key = keyFactory.generateSecret(keySpec);
			BASE64Encoder base64encoder = new BASE64Encoder();

			// ENCODE plainTextPassword String
			byte[] cleartext = plainTextPassword.getBytes("UTF8");

			Cipher cipher = Cipher.getInstance("DES"); // cipher is not thread
														// safe
			cipher.init(Cipher.ENCRYPT_MODE, key);

			byte[] u = cipher.update(cleartext);
			cipher.doFinal();
			String encrypted = base64encoder.encodeBuffer(u);
			return encrypted;
		} catch (Exception e) {
			logger.error("Error trying to encrypt the password.", e);
			throw new RuntimeException("Error trying to encrypt the password.", e);
		}
	}*/

/*	public synchronized String decryptAES(String encData) {
		try {
			SecretKeySpec skeySpec = new SecretKeySpec(ASM3_PASSPHRASE_KEY_AES.toString().getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");

			cipher.init(Cipher.DECRYPT_MODE, skeySpec);

//			System.out.println("Base64 decoded: " + Base64.decode(encData.getBytes()).length);
			byte[] original = cipher.doFinal(Base64.decode(encData.getBytes()));
			return new String(original).trim();
		} catch (Exception e) {
			logger.error("Error trying to encrypt the password.", e);
			throw new RuntimeException("Error trying to encrypt the password.", e);
		}
	}

	public synchronized String encryptAES(String data) {
		try {
			SecretKeySpec skeySpec = new SecretKeySpec(ASM3_PASSPHRASE_KEY_AES.toString().getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");

			cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

			byte[] original = Base64.encode(cipher.doFinal(data.getBytes()));
			return new String(original);
		} catch (Exception e) {
			logger.error("Error trying to encrypt the password.", e);
			throw new RuntimeException("Error trying to encrypt the password.", e);
		}
	}*/
}
