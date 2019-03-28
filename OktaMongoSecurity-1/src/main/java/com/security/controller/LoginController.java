package com.security.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.security.repositry.User;
import com.security.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	 @GetMapping("/user") 
	  public User getUser(Principal	  principal) {
		 String email = principal.getName();
		  log.info("Getting Loginuser Details", email);	
		  System.out.println("Getting Loginuser Details"+ email);
		  return userService.getLoginUserDetails(email);
	 }
	 
	
	//@PreAuthorize("hasAuthority('EMPLOYEE')") 
	 @PreAuthorize("@currentUserService.canAccessEmployee(principal, #name)") 
	  @GetMapping("/demo/{name}") 
	  public String echoTheUsersEmailAddress(@PathVariable String name  ) {
		  return "only for Employee:sucess "+name ; 
		  }
	 
}
