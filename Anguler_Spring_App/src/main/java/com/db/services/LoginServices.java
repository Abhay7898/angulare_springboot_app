package com.db.services;

import com.db.Model.Login;

public interface LoginServices {
	
	public Login createUser(Login login);
	public Login login(Login login);

}
