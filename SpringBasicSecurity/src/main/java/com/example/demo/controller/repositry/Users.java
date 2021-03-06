package com.example.demo.controller.repositry;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Users {
	@Id
	  public ObjectId _id;

	  public String username;
	  public String password;
	   private Role role;
	   
	  public Users() {}

	  public Users(ObjectId _id, String username, String password,Role role) {
	    this._id = _id;
	    this.username = username;
	    this.password = password;
	    this.role=role;
	  }

	  public void set_id(ObjectId _id) { this._id = _id; }

	  public String get_id() { return this._id.toHexString(); }

	  public void setPassword(String password) { this.password = password; }

	  public String getPassword() { return password; }

	  public void setUsername(String username) { this.username = username; }

	  public String getUsername() { return username; }

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	  
	  
	  
	}

