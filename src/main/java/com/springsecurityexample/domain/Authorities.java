package com.springsecurityexample.domain;

import org.springframework.security.core.GrantedAuthority;

public class Authorities implements GrantedAuthority{

	private static final long serialVersionUID = -471154418790091940L;
	private String username;
	private String authority;
	
	public Authorities(String username, String authority) {
		super();
		this.username = username;
		this.authority = authority;
	}

	public String getAuthority() {
		return this.authority;
	}

	public String getUsername() {
		return username;
	}

}
