package com.example.demo.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.repositry.User;
import com.example.demo.repositry.UserRepository;

import java.util.Collection;
import java.util.Optional;

@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
 
    public Optional<User> getUserByEmail(String email) {
        log.debug("Getting user by email={}", email.replaceFirst("@.*", "@***"));
        return userRepository.findOneByEmail(email);
    }

	/*
	 * public Optional<User> getUserById(String id) { log.debug("Getting user={}",
	 * id); return Optional.ofNullable(userRepository.findOne(id)); }
	 */

  

}
