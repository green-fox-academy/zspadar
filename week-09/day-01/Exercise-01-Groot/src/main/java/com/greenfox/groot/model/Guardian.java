package com.greenfox.groot.model;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
public class Guardian {
  String received;
  String translated;

  public Guardian() {
  }

  public Guardian(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }
  
}
