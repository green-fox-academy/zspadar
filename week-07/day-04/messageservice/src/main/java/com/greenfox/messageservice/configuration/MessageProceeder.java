package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */
@Configuration
public class MessageProceeder {
  @Autowired
  MessageService messageService;
  String message;
  String email;

  public MessageProceeder() {
    messageService = new MessageService() {
      @Override
      public void sendMessage(String message, String email) {

      }
    };
  }
  public void processMessage(String message, String email){
    messageService.sendMessage(message, email);
  }
}
