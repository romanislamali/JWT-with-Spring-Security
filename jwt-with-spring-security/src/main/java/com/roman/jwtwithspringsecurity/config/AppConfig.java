package com.roman.jwtwithspringsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.builder().username("roman").password(passwordEncoder().encode("roman")).roles("ADMIN").build();
        UserDetails user1 = User.builder().username("tajnur").password(passwordEncoder().encode("tajnur")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user, user1);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}