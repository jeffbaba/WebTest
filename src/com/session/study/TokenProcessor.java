package com.session.study;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.Base64;
import java.util.Base64.Encoder;;





public class TokenProcessor {
	
	private TokenProcessor() {}
	
	private static final TokenProcessor instance = new TokenProcessor();
	
	
	public static TokenProcessor getInstance() {
		return instance;
	}
	
	public String makeToken() {
		
		String token = (System.currentTimeMillis() + new Random().nextInt(999999999))+"";
		
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte md5[] = md.digest(token.getBytes());
//			BASE64Encoder encoder = new BASE64Encoder();
//	        return encoder.encode(md5);
			Encoder encoder = Base64.getEncoder();
			String encode = encoder.encodeToString(md5);
			return encode;
			
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException();
		}
		
	}

}
