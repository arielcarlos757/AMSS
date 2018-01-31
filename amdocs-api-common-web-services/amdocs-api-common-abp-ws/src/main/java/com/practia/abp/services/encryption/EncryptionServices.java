package com.practia.abp.services.encryption;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.practia.asm.core.encryption.Crypter;

@WebService(serviceName = "EncryptionServices", name = "EncryptionServices", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/EncryptionServices")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class EncryptionServices {

	@WebMethod()
	@WebResult(name = "crypted", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/EncryptionServices")
	public String encrypt(String plainTextPassword) throws Exception {
		return Crypter.INSTANCE.encrypt(plainTextPassword);
	}

	@WebMethod()
	@WebResult(name = "decrypt", targetNamespace = "http://www.telefonica.com.ar/ws/schema/amdocs/EncryptionServices")
	public String decrypt(String plainTextPassword) throws Exception {
		return Crypter.INSTANCE.decrypt(plainTextPassword);
	}
}
