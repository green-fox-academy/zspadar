package com.greenfox.frontend.greeting;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
public class Greeting {
  String name;
  String title;

  public Greeting(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public String getTitle() {
    return title;
  }

  public String getNameAndTitle(String name, String title) {
    return "O, hi there, " + name + ", " + "my dear " + title +" !";
  }
}
