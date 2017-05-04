package com.greenfox.messageservice;

import org.springframework.context.annotation.Bean;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */
public interface MessageService {
  public void sendMessage(String message, String email);
}
