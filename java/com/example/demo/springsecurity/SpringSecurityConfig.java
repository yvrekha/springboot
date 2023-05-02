package com.example.demo.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends  WebSecurityConfigurerAdapter {
	
	
	@Autowired
	public UserDetailsService service;
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
			
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

	    provider.setUserDetailsService(service);
	    provider.setPasswordEncoder(new BCryptPasswordEncoder());
	    
	    return provider;

}
	public void configure(HttpSecurity http) throws Exception {
 		http.authorizeRequests()
		.antMatchers("/*")
		.hasAuthority("admin")
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
		
	}
	
}