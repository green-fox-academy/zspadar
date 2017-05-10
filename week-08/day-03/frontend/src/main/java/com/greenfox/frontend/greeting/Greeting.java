package com.greenfox.frontend.greeting;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
public class Greeting {
  String welcome_message;

  public Greeting(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}
