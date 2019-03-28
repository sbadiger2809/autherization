package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.controller.LoginController;
import com.security.repositry.User;
import com.security.repositry.UserRepositry;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepositry userRepositry;
	
	public User getLoginUserDetails(String email) {		
		  log.info("Getting Loginuser email", email);
		 return userRepositry.findByEmail(email);
	}

}
