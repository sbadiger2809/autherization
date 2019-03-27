package com.example.demo;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	
	  @GetMapping("/gmail") 
	  public String echoTheUsersEmailAddress(Principal	  principal) {
		  return "Hey there! Your gmail address is: " +	  principal.getName(); 
		  }
	 
	 	@GetMapping("/") 
	public String roles() { 
		return "homepage2"; 
		} 
	@GetMapping("/demo") 
	public String authnticate() { 
		return "demo"; 
		} 
	
	
	
	
}
