package com.acarreno.poc.spring.security.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.acarreno.poc.spring.security.jwt.model.AuthRegister;
import com.acarreno.poc.spring.security.jwt.model.AuthRequest;
import com.acarreno.poc.spring.security.jwt.model.AuthResponse;
import com.acarreno.poc.spring.security.jwt.service.AuthService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

  private final AuthService authService;


  @PostMapping("/login")
  public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest authRequest) {

    return ResponseEntity.ok(authService.login(authRequest));
  }

  @PostMapping("/register-user")
  public ResponseEntity<AuthResponse> registerUser(@RequestBody AuthRegister authRegister) {

    return ResponseEntity.ok(authService.registerUser(authRegister));
  }

}
