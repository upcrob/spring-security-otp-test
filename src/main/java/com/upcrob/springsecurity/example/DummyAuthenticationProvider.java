package com.upcrob.springsecurity.example;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class DummyAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {
		if ("testuser".equals(auth.getName())
				&& "testpassword".equals(auth.getCredentials().toString())) {
			Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
			return new UsernamePasswordAuthenticationToken(auth.getName(), auth.getCredentials(), authorities);
		}
		throw new BadCredentialsException("Invalid username or password.");
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}
}
