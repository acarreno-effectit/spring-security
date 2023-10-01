package com.acarreno.poc.spring.security.jwt.service;

import com.acarreno.poc.spring.security.jwt.model.AuthRequest;
import com.acarreno.poc.spring.security.jwt.model.AuthResponse;
import com.acarreno.poc.spring.security.jwt.model.RegisterRequest;
import com.acarreno.poc.spring.security.jwt.model.RegisterResponse;

public interface AuthService {

  AuthResponse login(AuthRequest request);

  RegisterResponse registerUser(RegisterRequest request);

}
