package com.greenfox.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 05. 05..
 */
public class Nutrition {
  List<String> drinks = new ArrayList<>();
  List<String> food = new ArrayList<>();

  public void addFood(String userInput) {
    food.add(userInput);
  }
  public void addDrink(String userInput){
    drinks.add(userInput);
  }

}
