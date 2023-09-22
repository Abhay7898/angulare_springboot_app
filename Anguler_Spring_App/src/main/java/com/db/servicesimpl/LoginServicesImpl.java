package com.db.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.db.model.Login;
import com.db.repositry.LoginRepositryInterface;
import com.db.services.LoginServices;
import com.db.utils.StudentUtiliy;

public class LoginServicesImpl implements LoginServices {

	@Autowired
	public LoginRepositryInterface loginRepositryInterface;

	@Override
	public boolean createUser(Login login) {
		List<Login> list = loginRepositryInterface.findByUserId(login.getUserId());
		if (list.isEmpty()) {
			String setPasswordToDB = StudentUtiliy.encryption(login.getPassword());
			login.setPassword(setPasswordToDB);
			loginRepositryInterface.save(login);
			return true;
		}
		return false;
	}

	@Override
	public String login(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}
//Name : Abahay
// Password: hello@aba78
// 12abhello@aba7834cd
// ab12hello@aba7834cd
// 1h2el3l4o5@6
// *h*e*l*l*o*@*a*b*a*7*8*
