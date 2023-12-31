package com.acarreno.poc.spring.security.jwt.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterRequest {

  private String username;
  private String password;
  private String firstname;
  private String lastname;

}
