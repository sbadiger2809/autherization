package com.security.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.lang.String;
import com.security.repositry.User;
import java.util.List;



@Repository
public interface UserRepositry extends  MongoRepository<User, String> {
	
	User findByEmail(String email);
}
