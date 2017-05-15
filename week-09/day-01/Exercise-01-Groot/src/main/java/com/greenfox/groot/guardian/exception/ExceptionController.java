package com.greenfox.groot.guardian.exception;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
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
