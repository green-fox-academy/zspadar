package com.greenfox.messageservice.service;

import com.greenfox.messageservice.MessageService;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */
public class EmailService implements MessageService {
  @Override
  public void sendMessage(String message, String email){
    System.out.println("Email sent to " + email + " with message:" + message);
  }

}
