package com.greenfox.frontend.arrayhandler;

/**
 * Created by zsuzsanna.padar on 2017. 06. 05..
 */
public class Sum {
  int result;

  public Sum(int[] array) {
    result = 0;
    for (int j = 0; j< array.length; j++) {
      result += j;
    }
  }

  public int getResult() {
    return result;
  }
}
