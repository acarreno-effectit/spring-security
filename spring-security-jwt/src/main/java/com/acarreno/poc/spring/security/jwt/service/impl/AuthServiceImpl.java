package com.acarreno.poc.spring.security.jwt.service.impl;

import org.springframework.stereotype.Service;
import com.acarreno.poc.spring.security.jwt.model.AuthRequest;
import com.acarreno.poc.spring.security.jwt.model.AuthResponse;
import com.acarreno.poc.spring.security.jwt.model.RegisterRequest;
import com.acarreno.poc.spring.security.jwt.model.RegisterResponse;
import com.acarreno.poc.spring.security.jwt.persistence.AuthRepository;
import com.acarreno.poc.spring.security.jwt.persistence.entity.RoleType;
import com.acarreno.poc.spring.security.jwt.persistence.entity.UserEntity;
import com.acarreno.poc.spring.security.jwt.service.AuthService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

  private final AuthRepository authRepository;

  @Override
  public AuthResponse login(AuthRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RegisterResponse registerUser(RegisterRequest request) {

    UserEntity entity = UserEntity.builder().firstname(request.getFirstname())
        .lastname(request.getLastname()).username(request.getUsername())
        .password(request.getPassword()).role(RoleType.USER).build();

    entity = authRepository.save(entity);

    return RegisterResponse.builder().id(entity.getId()).build();
  }

}
