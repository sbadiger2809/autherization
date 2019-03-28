package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.controller.repositry.CurrentUser;
import com.example.demo.controller.repositry.Role;
import com.example.demo.controller.repositry.Users;







@Service
public class CurrentUserService {
	
	public boolean canAccessUser(Users currentUser, String name) {
       System.out.println("Checking if user={} has access to user={}"+ currentUser+""+ name);
        return currentUser != null
                && (currentUser.getRole() == Role.ADMIN && currentUser.getUsername().equals(name));
    }
	
	
	public boolean canAccessTest( String name) {
	       System.out.println("Checking if user={} has access to user={}"+ name);
	        return  (name.equals("sai"));
	    }
	
	   public boolean canAccessUserTest(CurrentUser currentUser, String name) {
		   System.out.println("Checking if user={} has access to user={}"+ currentUser+""+ name);
	        return currentUser != null
	                && (currentUser.getRole() == Role.ADMIN || currentUser.getUsername().equals(name));
	    }
}
