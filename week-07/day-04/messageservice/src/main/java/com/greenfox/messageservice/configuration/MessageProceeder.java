package com.greenfox.messageservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */
@Configuration
public class MessageProceeder {
  @Bean
  public MessageProceeder messageProceeder(){
    return new MessageProceeder();
  }

}
