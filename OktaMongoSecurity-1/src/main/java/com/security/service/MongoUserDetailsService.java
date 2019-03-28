package com.security.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.security.repositry.CurrentUser;
import com.security.repositry.UserRepositry;




@Component
public class MongoUserDetailsService implements UserDetailsService{
	
  @Autowired
  private UserRepositry repository;

  @Override
  public CurrentUser loadUserByUsername(String email) throws UsernameNotFoundException{
	   com.security.repositry.User user = repository.findByEmail(email);
		 if(user == null) {
			 throw new UsernameNotFoundException("User not found"); 
			 }
		  System.out.println("loadUserByUsername::==>"+user.getUsername());
		  
		  return new CurrentUser(user);
		  
  }
  
  
  
  
}
