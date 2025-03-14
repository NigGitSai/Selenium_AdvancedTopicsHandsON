package PasswordEncryption;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class PasswordEncryptDecrypt {
	
	
	public static void main(String[] args) {
		
		String password = "Pwd@12356";
		System.out.println("Encrypted password : "+encryptPassword(password));
	}
	
	
	public static String encryptPassword(String password) 
	{
		try
		{
			 byte[] key = Arrays.copyOf(password.getBytes(StandardCharsets.UTF_8), 16);
		SecretKeySpec secretKeySpec = new SecretKeySpec(key,"AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		
		String encryptedString = Base64.getEncoder().encodeToString(cipher.doFinal(password.getBytes()));
		return encryptedString;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
			
		}
	}
	
	

}
