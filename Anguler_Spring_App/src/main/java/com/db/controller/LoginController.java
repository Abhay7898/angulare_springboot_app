package com.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.model.Login;
import com.db.model.Student;
import com.db.servicesimpl.LoginServicesImpl;
import com.db.utils.StudentUtiliy;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LoginController {

	@Autowired
	public LoginServicesImpl loginServicesImpl;

	@PostMapping("/createUser")
	public ResponseEntity<?> createUser(@RequestBody Login login) {
		log.info("CreateUser API Call");

		boolean passwordValidation = StudentUtiliy.validatePassword(login.getPassword(), login.getConfrimPassword());
		if (passwordValidation) {
			boolean result = loginServicesImpl.createUser(login);
			if (!result) {
				return new ResponseEntity<>(StudentUtiliy.SUCCEFULLY, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(StudentUtiliy.USER_ALREADY_EXISTS, HttpStatus.BAD_GATEWAY);
			}
		}
		return new ResponseEntity<>(StudentUtiliy.PASSWORD_NOT_MATCH, HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/login")
	public ResponseEntity<?> login(@Param("userName") String userName, @Param("password") String password) {
		boolean result=loginServicesImpl.login(userName, password);
		if(result) {
			return new ResponseEntity<>(StudentUtiliy.SUCCEFULLY,HttpStatus.OK);
		}
		return new ResponseEntity<>(StudentUtiliy.PLEASE_ENTER_CORRECT_INFORMATION,HttpStatus.BAD_REQUEST);
	}
}
