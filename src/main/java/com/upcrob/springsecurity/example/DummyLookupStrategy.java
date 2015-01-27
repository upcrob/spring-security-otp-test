package com.upcrob.springsecurity.example;

import java.util.Map;

import com.upcrob.springsecurity.otp.LookupStrategy;

/**
 * Dummy lookup strategy that returns a user's email address.
 * Normally, an instance of JdbcLookupStrategy or LdapLookupStrategy
 * (or an implementation that looks in another external resource) would
 * be used.  To keep this example app simple, we're using an in-memory
 * map here.
 */
public class DummyLookupStrategy implements LookupStrategy {
	private Map<String, String> users;
	
	@Override
	public String lookup(String username) {
		return users.get(username);
	}
	
	public void setUsers(Map<String, String> users) {
		this.users = users;
	}
}
