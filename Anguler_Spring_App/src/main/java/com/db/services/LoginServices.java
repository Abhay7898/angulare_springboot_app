package com.db.services;

import com.db.model.Login;

public interface LoginServices {
	
	public boolean createUser(Login login);
	public boolean login(String userId,String password);

}
