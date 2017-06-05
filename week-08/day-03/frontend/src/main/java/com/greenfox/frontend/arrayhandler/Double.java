package com.greenfox.frontend.arrayhandler;

/**
 * Created by zsuzsanna.padar on 2017. 06. 05..
 */
public class Double {
  int[] result;

  public Double(int[] i) {
    this.result = new int[i.length];
    for(int j = 0; j<i.length; j++) {
      result[j] = i[j] * 2;
    }
  }

  public int[] getResult() {
    return result;
  }
}
