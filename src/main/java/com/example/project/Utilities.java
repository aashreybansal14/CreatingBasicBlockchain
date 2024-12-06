package com.example.project;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Utilities {
    protected String encryptDataSHA256(String data){
        try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");	        
			//Apply sha256 to our data, 
			byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8)); 
			StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
			for (byte b:hash) {
				hexString.append(String.format("%02x", b));
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
    }
}
