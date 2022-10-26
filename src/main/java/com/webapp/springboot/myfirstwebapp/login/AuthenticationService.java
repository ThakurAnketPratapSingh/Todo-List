package com.webapp.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("Anket");
		boolean isValidPassword=password.equalsIgnoreCase("anshu");
		return isValidUserName && isValidPassword;
	}

}
