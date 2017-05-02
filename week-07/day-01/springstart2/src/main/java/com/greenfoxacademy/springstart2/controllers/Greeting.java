package com.greenfoxacademy.springstart2.controllers;

import java.awt.Color;
import java.util.Random;

/**
 * Created by zsuzsanna.padar on 2017. 05. 02..
 */

public class Greeting {
  public String name;
  public String color;

  public Greeting(String name) {
    this.name = name;
    this.color = getColor();
  }

  private String getColor() {
    Random randomGenerator = new Random();
    int red = randomGenerator.nextInt(256);
    int green = randomGenerator.nextInt(256);
    int blue = randomGenerator.nextInt(256);

    return String.format("#%02x%02x%02x", red, green, blue);
  }

}
