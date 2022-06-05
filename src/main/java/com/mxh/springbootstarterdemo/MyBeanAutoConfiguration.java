package com.mxh.springbootstarterdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanAutoConfiguration {
  @Bean
  public MyBean myBean() {
    return new MyBean();
  }
}
