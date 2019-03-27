package com.example.demo.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.example.demo.repositry.CurrentUser;
import com.example.demo.repositry.Role;

@Slf4j
@Service
public class CurrentUserService {

    public boolean canAccessUser(CurrentUser currentUser, Long userId) {
        log.info("Checking if user={} has access to user={}", currentUser, userId);
        return currentUser != null
                && (currentUser.getRole() == Role.ADMIN || currentUser.getId().equals(userId));
    }

}
