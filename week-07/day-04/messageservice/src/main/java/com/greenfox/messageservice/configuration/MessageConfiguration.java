package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.MessageService;
import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */
@Configuration
public class MessageConfiguration {

  @Primary
  @Bean
  public MessageService emailService() {
    return new EmailService();
  }

  @Bean
  public MessageService twitterService() {
    return new TwitterService();
  }

  @Bean
  public MessageProceeder messageProceeder(){
    return new MessageProceeder();
  }

}
