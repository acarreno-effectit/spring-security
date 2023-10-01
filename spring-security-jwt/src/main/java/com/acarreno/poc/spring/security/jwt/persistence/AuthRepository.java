package com.acarreno.poc.spring.security.jwt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.acarreno.poc.spring.security.jwt.persistence.entity.UserEntity;

public interface AuthRepository extends JpaRepository<UserEntity, String> {

}
