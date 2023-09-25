package com.acarreno.poc.spring.security.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return buildSecurityFilterChainWithForm(http);
  }

  // ------------------------
  // Different configurations
  // ------------------------

  private SecurityFilterChain buildSecurityFilterChainWithForm(HttpSecurity http) throws Exception {
    return http
        .csrf(csrf -> csrf.disable()).authorizeHttpRequests(authRequest -> authRequest
            .requestMatchers("/public/**").permitAll().anyRequest().authenticated())
        .formLogin(withDefaults()).build();
  }
}
