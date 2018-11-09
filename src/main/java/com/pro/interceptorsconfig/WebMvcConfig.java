package com.pro.interceptorsconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.pro.sign.interceptors.AuthorizationInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

  @Autowired
  private AuthorizationInterceptor authorizationInterceptor;

  @Value("${proconfig.is-open-authorization-interceptor}")
  private boolean isOpenAuthorizationInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    if (isOpenAuthorizationInterceptor) {
      registry.addInterceptor(authorizationInterceptor).addPathPatterns("/pro/**").excludePathPatterns("/pro/login");
    }
  }

}
