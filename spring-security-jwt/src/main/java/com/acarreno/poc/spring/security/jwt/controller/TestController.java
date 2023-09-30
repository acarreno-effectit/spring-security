package com.acarreno.poc.spring.security.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/test/api")
@RequiredArgsConstructor
public class TestController {

  @PostMapping("/protected")
  public ResponseEntity<String> testProtected() {

    return null;
  }

}
