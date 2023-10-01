package com.acarreno.poc.spring.security.jwt.persistence.entity;

import java.util.Collection;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(schema = "security", name = "user",
    uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
public class UserEntity implements UserDetails {

  private static final long serialVersionUID = 4768195682753368683L;

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid2")
  @Column(name = "id", nullable = false, unique = true)
  private String id;

  @Column(name = "username", nullable = false, unique = true)
  private String username;

  @Column(name = "password", nullable = false, unique = true)
  private String password;

  @Column(name = "firstname", nullable = false, unique = true)
  private String firstname;

  @Column(name = "lastname", nullable = false, unique = true)
  private String lastname;

  @Enumerated(EnumType.STRING)
  @Column(name = "role", nullable = false, unique = true)
  private RoleType role;

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
