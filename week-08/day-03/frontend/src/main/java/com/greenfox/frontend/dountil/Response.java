package com.greenfox.frontend.dountil;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
public class Response {
  int result;

  public Response() {

  }

  public Response(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public int sumIt(int until) {
    int result = 0;
    for(int i = until; i > 0 ; i--) {
      result += i;
    }
    return result;
  }

  public  int factorIt(int until) {

    if (until  == 1) {
      return 1;
    } else {
      return result = until * factorIt(until - 1);
    }
  }
}
