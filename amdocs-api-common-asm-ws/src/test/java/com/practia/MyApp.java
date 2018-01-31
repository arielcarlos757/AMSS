package com.practia;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

import com.bea.common.security.utils.encoders.BASE64Decoder;
import com.bea.common.security.utils.encoders.BASE64Encoder;
import com.practia.asm.core.encryption.Crypter;
import com.practia.asm.core.encryption.EncryptionUtility;

import weblogic.apache.xerces.impl.dv.util.Base64;


public class MyApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Log"  + DateTime.now());
//		System.out.println(EnvironmentType.ASM);
//		new Environment();
		EncryptionUtility eu = new EncryptionUtility();
//		String pass = eu.decrypt("+qIQRykap13jax5R2WCJYA==");
	/*	String enc = eu.encrypt("amssdesa1");
		String pass = eu.decrypt("/XphaVskJWo=");*/
//		String pass = eu.encrypt("amsstest1");
	/*	System.out.println(pass);
		System.out.println(enc);*/
//		System.out.println(MyApp.encrypt_data("amssdesa1"));
//		System.out.println(MyApp.decrypt_data("R+N2iQepTwFJfQAVsHT04A=="));
		/*GenericObjectPoolConfig c = new GenericObjectPoolConfig();
		c.setMinIdle(2);
		c.setMaxIdle(5);
		c.setMaxTotal(20);
		
		GenericObjectPool<Cipher> pool;
		CipherFactory factory = 
				new CipherFactoryImpl(
					c,
					"DES",
					Cipher.ENCRYPT_MODE,); 
		pool = new GenericObjectPool<Cipher>(factory, config);*/
//		System.out.println(Crypter.INSTANCE.encrypt("welcome1"));
//		System.out.println(Crypter.INSTANCE.decrypt("QwpT0hzH5FMA0Uiz7/i+dg=="));
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		String cunvertCurrentDate="2000/01/01";
		Date date = new Date();
		try {
			date = df.parse(cunvertCurrentDate);
			System.out.println(date);
		} catch (ParseException e) {
			System.out.println(e);
		}
		
				
		
	}
	  public static synchronized String decrypt( String passphrase, String encrypted ){
	        
	        String plainTextPassword = encrypted;
	        
	        try {
	            DESKeySpec keySpec = new DESKeySpec( passphrase.getBytes("UTF8"));
	            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
	            SecretKey key = keyFactory.generateSecret(keySpec);
	            BASE64Decoder base64decoder = new BASE64Decoder();
	            
	            byte[] encrypedPwdBytes = base64decoder.decodeBuffer(encrypted);
	            
	            Cipher cipher = Cipher.getInstance("DES");// cipher is not thread safe
	            cipher.init(Cipher.DECRYPT_MODE, key);
	            byte[] plainTextPwdBytes = (cipher.doFinal(encrypedPwdBytes));
	            
	            plainTextPassword = new String( plainTextPwdBytes );
	            
	        } catch ( Exception e ){
	            e.printStackTrace();
	            throw new RuntimeException("Error trying to encrypt the password: '"+e.getMessage()+"'");
	        }
	        
	        return plainTextPassword;
	    }
	    
	    public static synchronized String encrypt( String passphrase, String plainTextPassword ){
	        
	        String crypted = plainTextPassword;
	        
	        try {
	            DESKeySpec keySpec = new DESKeySpec( passphrase.getBytes("UTF8") );
	            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
	            SecretKey key = keyFactory.generateSecret(keySpec);
	            BASE64Encoder base64encoder = new BASE64Encoder();
	            
	            // ENCODE plainTextPassword String
	            byte[] cleartext = plainTextPassword.getBytes("UTF8");      
	    
	            Cipher cipher = Cipher.getInstance("DES"); // cipher is not thread safe
	            cipher.init(Cipher.ENCRYPT_MODE, key);
	            
	            crypted =  base64encoder.encodeBuffer(cipher.doFinal(cleartext));
	            
	        } catch ( Exception e ){
	            e.printStackTrace();
	            throw new RuntimeException("Error trying to decrypt the password: '"+e.getMessage()+"'");
	        }
	        
	        return crypted;
	    }
	    
	
	private static String decrypt_data(String encData) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
	    String key = "ASM Configuration";
	    SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "AES");
	    Cipher cipher = Cipher.getInstance("AES");

	    cipher.init(Cipher.DECRYPT_MODE, skeySpec);

	    System.out.println("Base64 decoded: "
	            + Base64.decode(encData.getBytes()).length);
	    byte[] original = cipher .doFinal(Base64.decode(encData.getBytes()));
	    return new String(original).trim();
	}

	private static String encrypt_data(String data)
	        throws Exception {
	    String key = "ASM Configuration";
	    SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "AES");
	    Cipher cipher = Cipher.getInstance("AES");

	    cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

	    System.out.println("Base64 encoded: "
	            + Base64.encode(data.getBytes()).length);

	    byte[] original = Base64.encode(cipher.doFinal(data.getBytes()));
	    return new String(original);
	}
	
}
