package com.acarreno.poc.spring.security.jwt.filter;

import java.io.IOException;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
      FilterChain filterChain) throws ServletException, IOException {

    final String token = getTokenByRequest(request);

    if (null == token) {
      filterChain.doFilter(request, response);
      return;
    }

  }

  /**
   * 
   * @param request
   * @return
   */
  private String getTokenByRequest(HttpServletRequest request) {

    String authorization = request.getHeader(HttpHeaders.AUTHORIZATION);

    if (!authorization.isBlank() && authorization.startsWith("Bearer ")) {
      return authorization.substring(7);
    }

    return null;
  }

}
