package com.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.security.service.MongoUserDetailsService;



@EnableOAuth2Sso
@Configuration 
@EnableConfigurationProperties
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Autowired
	  MongoUserDetailsService userDetailsService;
	
	 @Override  
	    protected void configure(HttpSecurity http) throws Exception {  
	        http.authorizeRequests()  
	               .anyRequest().authenticated();  // authenticate
	    }  
	 
	 @Override
	  public void configure(AuthenticationManagerBuilder builder) throws Exception {
	   System.out.println("AuthenticationManagerBuilder::==>");
	    builder.userDetailsService(userDetailsService);
	  }
}
