package com.springsecurityexample.domain;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Users implements UserDetails{
	private static final long serialVersionUID = -2348683738628406111L;
	private String username;
	private String password;
	private Set<Authorities> authorities;
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}
	public String getPassword() {
		return this.password;
	}
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	

}
