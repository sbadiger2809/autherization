package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity // handles CSRF
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
@Order(SecurityProperties.BASIC_AUTH_ORDER)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	  
	
	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception {
	 * auth.inMemoryAuthentication().passwordEncoder(org.springframework.security.
	 * crypto.password.NoOpPasswordEncoder.getInstance())
	 * .withUser("user1").password("secret1") .roles("USER"). and()
	 * .withUser("admin1").password("secret1").roles("USER", "ADMIN"); }
	 */

	/*
	 * // Authorization : Role -> Access protected void configure(HttpSecurity http)
	 * throws Exception { http.httpBasic().and().authorizeRequests()
	 * .antMatchers("/employess/**").hasRole("USER") .antMatchers("/test") .
	 * anyRequest().fullyAuthenticated() .and()
	 * .csrf().disable().headers().frameOptions().disable(); }
	 */

}
