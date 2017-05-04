package com.greenfoxacademy.hellobean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */

@Configuration
public class RedColorConfig {
  @Bean
  public  RedColor redColor(){
    return new RedColor();
  }

}
