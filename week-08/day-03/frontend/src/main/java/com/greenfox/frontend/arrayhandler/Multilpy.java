package com.greenfox.frontend.arrayhandler;

/**
 * Created by zsuzsanna.padar on 2017. 06. 05..
 */
public class Multilpy {
  int result;

  public Multilpy(int[] i) {
    this.result = result;
    result = 1;
    for(int j = 0; j<i.length; j++) {
      result *=j;
    }
  }

  public int getResult() {
    return result;
  }
}
