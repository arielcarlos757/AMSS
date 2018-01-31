package com.practia.asm.core.encryption;

import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import com.bea.common.security.utils.encoders.BASE64Decoder;
import com.bea.common.security.utils.encoders.BASE64Encoder;

public class CrypterConsole {

	private static final String ASM3_PASSPHRASE_KEY = "ASM Configuration";
	
	public static void main(String[] args) {
		int selection;
		Scanner input = new Scanner(System.in);

		/***************************************************/

		System.out.println("Choose from these choices");
		System.out.println("-------------------------\n");
		System.out.println("1 - Encrypt a number");
		System.out.println("2 - Decrypt a number");
		System.out.println("3 - Quit");

		selection = input.nextInt();
		Scanner ss = null;
		switch (selection) {
		case 1:
			ss = new Scanner(System.in);
			System.out.print("Enter the text to encrypt : ");
			System.out.println(String.format("text : %s", CrypterConsole.encrypt(ss.nextLine())));
			ss.nextLine();
			break;
		case 2:
			ss = new Scanner(System.in);
			System.out.print("Enter the text to decrypt : ");
			System.out.println(String.format("text : %s",  CrypterConsole.decrypt(ss.nextLine())));
			ss.nextLine();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.exit(0);
		}
		System.exit(0);
	}
	
	public static String decrypt(String encrypted) {
		try {
			DESKeySpec keySpec = new DESKeySpec(ASM3_PASSPHRASE_KEY.getBytes("UTF8"));
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey key = keyFactory.generateSecret(keySpec);
			BASE64Decoder base64decoder = new BASE64Decoder();

			byte[] encrypedPwdBytes = base64decoder.decodeBuffer(encrypted);

			Cipher cipher = Cipher.getInstance("DES");// cipher is not thread
														// safe
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] plainTextPwdBytes = (cipher.doFinal(encrypedPwdBytes));

			return new String(plainTextPwdBytes);
		} catch (Exception e) {
			throw new RuntimeException("Error trying to decrypt the password.", e);
		}
	}
	
	public static String encrypt(String plainTextPassword) {
		try {
			DESKeySpec keySpec = new DESKeySpec(ASM3_PASSPHRASE_KEY.getBytes("UTF8"));
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey key = keyFactory.generateSecret(keySpec);
			BASE64Encoder base64encoder = new BASE64Encoder();

			// ENCODE plainTextPassword String
			byte[] cleartext = plainTextPassword.getBytes("UTF8");

			Cipher cipher = Cipher.getInstance("DES"); // cipher is not thread
														// safe
			cipher.init(Cipher.ENCRYPT_MODE, key);

			return base64encoder.encodeBuffer(cipher.doFinal(cleartext));
		} catch (Exception e) {
			throw new RuntimeException("Error trying to encrypt the password.", e);
		}
	}
}
