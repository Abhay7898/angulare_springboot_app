package com.db.servicesimpl;

import java.util.List;

import com.db.model.Login;
import com.db.repositry.LoginRepositryInterface;
import com.db.services.LoginServices;

public class LoginServicesImpl implements LoginServices {
	
	public LoginRepositryInterface loginRepositryInterface;
	@Override
	public String createUser(Login login) {
		List<Login> list=loginRepositryInterface.findByUserId(login.getUserId());
		if(list.isEmpty()) {
			
		}
		return null;
	}

	@Override
	public String login(Login login) {
		
		return null;
	}
	
	
	// Name : Abahay
	// Password: hello@aba78
		//	12abhello@aba7834cd
	// 		ab12hello@aba7834cd
		// 1h2el3l4o5@6
	// *h*e*l*l*o*@*a*b*a*7*8*
	
	

}
