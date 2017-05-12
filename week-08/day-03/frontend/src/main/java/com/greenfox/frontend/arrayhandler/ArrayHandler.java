package com.greenfox.frontend.arrayhandler;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
public class ArrayHandler {
  String what;
  int[] numbers;

  public ArrayHandler(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public int[] getNumbers() {
    return numbers;
  }
}
