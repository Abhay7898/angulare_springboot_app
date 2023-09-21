package com.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.model.Login;
import com.db.servicesimpl.LoginServicesImpl;

@RestController
public class LoginController {
	
	
	@Autowired
	public LoginServicesImpl loginServicesImpl;
	
	@PutMapping
	public ResponseEntity<?> createUser(Login login) {
		return  loginServicesImpl.createUser(login);
	}
	
	public ResponseEntity<?> login(String usereId,String password) {
		return null;
	}
}
