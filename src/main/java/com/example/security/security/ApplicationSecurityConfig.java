package com.example.security.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ApplicationSecurityConfig {

    @Bean
    SecurityFilterChain basicFilter(HttpSecurity http) throws Exception {
        http.authorizeRequests((authz) -> authz.anyRequest().authenticated()).httpBasic();
        return http.build();
    }
}
