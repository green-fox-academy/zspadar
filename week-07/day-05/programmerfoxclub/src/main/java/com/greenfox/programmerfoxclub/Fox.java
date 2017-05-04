package com.greenfox.programmerfoxclub;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */
public class Fox {
  String name;
  List<String> trickList;
  String food;
  String drink;

  public Fox() {
    this.trickList = new ArrayList<>();
    trickList.add("photographic memory");
    trickList.add("fly");
    trickList.add("can eat unlimited amount of toltottkaposzta");
    this.name = "Mr. Green";
    this.drink = "lemonade";
    this.food = "pizza";
  }

  public int getTrickListSize() {
    return trickList.size();
  }

  public String getName() {
    return name;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public List<String> getTrickList() {
    return trickList;
  }

}
