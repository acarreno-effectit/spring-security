package com.acarreno.poc.spring.security.jwt.service;

import com.acarreno.poc.spring.security.jwt.model.AuthRegister;
import com.acarreno.poc.spring.security.jwt.model.AuthRequest;
import com.acarreno.poc.spring.security.jwt.model.AuthResponse;

public interface AuthService {

  AuthResponse login(AuthRequest request);

  AuthResponse registerUser(AuthRegister request);

}
