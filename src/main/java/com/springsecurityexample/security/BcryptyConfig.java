package com.springsecurityexample.security;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptyConfig {
	@Test
	public void bcryptTest (){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode("1");
		System.out.println(encodedPassword);
	}
}
