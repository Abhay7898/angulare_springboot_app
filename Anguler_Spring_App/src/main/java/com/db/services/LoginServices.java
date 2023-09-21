package com.db.services;

import com.db.model.Login;

public interface LoginServices {
	
	public String createUser(Login login);
	public String login(Login login);

}
