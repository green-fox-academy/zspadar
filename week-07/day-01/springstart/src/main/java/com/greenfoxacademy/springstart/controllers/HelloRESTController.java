package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 02..
 */
@RestController
public class HelloRESTController {

@RequestMapping(value = "/greeting")
  public Greeting greeting() {
  Greeting greeting = new Greeting(1, "Hello, World!");
  return greeting;
  }

}
