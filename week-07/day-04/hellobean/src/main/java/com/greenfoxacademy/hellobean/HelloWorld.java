package com.greenfoxacademy.hellobean;

import org.springframework.context.annotation.Bean;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */

public class HelloWorld {
  private String message;

  public void setMessage(String message){
    this.message  = message;
  }

  public String getMessage(){
    System.out.println("Your message: " + message);
    return message;
  }
}