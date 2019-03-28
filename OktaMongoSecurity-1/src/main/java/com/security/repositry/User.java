package com.security.repositry;


import lombok.Data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {

	 @Id
	  public ObjectId _id;
	  private String username; 	  
	  private String password;//Not required	  
      private String email;
      private int epid;   
      private Role role;

    
}
