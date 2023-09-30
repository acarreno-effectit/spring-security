package com.acarreno.poc.spring.security.jwt.service.impl;

import org.springframework.stereotype.Service;
import com.acarreno.poc.spring.security.jwt.model.AuthRegister;
import com.acarreno.poc.spring.security.jwt.model.AuthRequest;
import com.acarreno.poc.spring.security.jwt.model.AuthResponse;
import com.acarreno.poc.spring.security.jwt.service.AuthService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {


  @Override
  public AuthResponse login(AuthRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public AuthResponse registerUser(AuthRegister request) {
    // TODO Auto-generated method stub
    return null;
  }

}
