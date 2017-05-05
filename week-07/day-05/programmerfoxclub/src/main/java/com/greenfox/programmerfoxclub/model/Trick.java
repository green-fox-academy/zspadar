package com.greenfox.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 05. 05..
 */
public class Trick {
  List<String> tricks = new ArrayList();

  public Trick(){
    tricks.add("Can eat unlimited amount of toltottkaposzta");
    tricks.add("protographic memory");
    tricks.add("power sleep");
  }


  public  void addTrick(String userInput) {
    tricks.add(userInput);
  }



}
