package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.service.MongoUserDetailsService;

@Configuration
@EnableConfigurationProperties
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	  @Autowired
	  MongoUserDetailsService userDetailsService;
	
	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
		   System.out.println("HttpSecurity::==>");
	    http
	      .csrf().disable()
	      .authorizeRequests().anyRequest().authenticated()
	      .and().httpBasic()
	      .and().sessionManagement().disable();
	  }
	
	  @Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }
	  
	  @Override
	  public void configure(AuthenticationManagerBuilder builder) throws Exception {
	   System.out.println("AuthenticationManagerBuilder::==>");
	    builder.userDetailsService(userDetailsService);
	  }
	
		
	
	
	
	//Below without db
	// Authentication : User --> Roles
	/*
	 * protected void configure(AuthenticationManagerBuilder auth) throws Exception
	 * { auth.inMemoryAuthentication().passwordEncoder(org.springframework.security.
	 * crypto.password.NoOpPasswordEncoder.getInstance()).withUser("user1").password
	 * ("secret1") .roles("USER").and().withUser("admin1").password("secret1")
	 * .roles("USER", "ADMIN"); }
	 */
		
	// Authorization : Role -> Access
	/*
	 * protected void configure(HttpSecurity http) throws Exception {
	 * http.httpBasic().and().authorizeRequests().antMatchers("/employess/**")
	 * .hasRole("USER").antMatchers("/**").hasRole("ADMIN").and()
	 * .csrf().disable().headers().frameOptions().disable(); }
	 */
	
	

}