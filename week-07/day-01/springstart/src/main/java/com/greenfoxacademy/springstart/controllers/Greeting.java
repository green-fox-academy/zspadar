package com.greenfoxacademy.springstart.controllers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Created by zsuzsanna.padar on 2017. 05. 02..
 */
@Getter
@Setter
@AllArgsConstructor
public class Greeting {
  private long id;
  private String content;

}
