package com.security.service;

import org.springframework.stereotype.Service;

import com.security.repositry.CurrentUser;
import com.security.repositry.Role;

@Service
public class CurrentUserService {	

	   public boolean canAccessEmployee(CurrentUser currentUser, String name) {
		   System.out.println("Checking if user={} has access to user={}"+ currentUser+""+ name);
	        return currentUser != null
	                && (currentUser.getRole() == Role.EMPLOYEE);
	                //|| currentUser.getUsername().equals(name));
	    }
}
