package com.greenfox.frontend.exception;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */

public class ExceptionController {
  private String error;

  public ExceptionController(String error) {
    this.error= error;
  }

  public String getError() {
    return error;
  }
}
