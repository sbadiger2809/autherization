package com.example.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.service.UserService;

import javax.validation.Valid;
import java.util.NoSuchElementException;

@RestController
@Slf4j
public class UserController {

    private final UserService userService;
    

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;      
    }
   

    @PreAuthorize("@currentUserServiceImpl.canAccessUser(principal, #id)")
    @RequestMapping("/user/{id}")
    public String getUserPage(@PathVariable String id) {
        log.info("Getting user page for user={}", id);
       return "sucess";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/user/create", method = RequestMethod.GET)
    public String getUserCreatePage() {
        log.info("Getting user create form");
        return "sucess";
    }
    
    @GetMapping("/employess/{empId}")
	public String retrieveCoursesForStudent(@PathVariable String empId) {
		return "employee";
	}
    
    @GetMapping("/employess/{empId}")
	public String testrole(@PathVariable String empId) {
		return "roletests";
	}

}
