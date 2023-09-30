package com.acarreno.poc.spring.security.jwt.persistence.entity;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntity implements UserDetails {

  private static final long serialVersionUID = 4768195682753368683L;

  private String id;
  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private String role;


  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public boolean isAccountNonExpired() {
    return Boolean.TRUE;
  }

  @Override
  public boolean isAccountNonLocked() {
    return Boolean.TRUE;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return Boolean.TRUE;
  }

  @Override
  public boolean isEnabled() {
    return Boolean.TRUE;
  }

}
