package com.dn.Security.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
	
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.formLogin();
		http.authorizeHttpRequests().requestMatchers(HttpMethod.GET,"/couponapi/coupons")
		.hasAnyRole("ADMIN","USER")
//		.requestMatchers(HttpMethod.POST,"/couponapi/coupons")
//		.hasAnyRole("ADMIN","USER");
		.requestMatchers(HttpMethod.POST,"/couponapi/coupons")
		.hasRole("ADMIN").and()
				.csrf().disable();
		return http.build();
	}

}
