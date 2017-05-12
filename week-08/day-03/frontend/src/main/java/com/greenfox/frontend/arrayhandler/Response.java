package com.greenfox.frontend.arrayhandler;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
public class Response {
  int result;

  public Response () {
  }

  public int getResult() {
    return result;
  }

  public int sumIt(int[] numbers) {
    result = 0;
    for(int i = numbers.length; i > 0; i--) {
      result += numbers[i];
    }
    return result;
  }

  public int multiplyIt(int[] numbers) {
    result = 0;
    for(int i = numbers.length; i > 0; i--) {
      result *= numbers[i];
    }
    return result;
  }

  public int[] doubleIt(int[] numbers) {
    re
  }


}
