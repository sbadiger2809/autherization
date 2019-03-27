package com.example.demo.controller.repositry;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

;

@Document
public class Employee {
	  @Id
	    private String id;
		private String email;
	    private String pid;
	    private String role;
	    
	    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
