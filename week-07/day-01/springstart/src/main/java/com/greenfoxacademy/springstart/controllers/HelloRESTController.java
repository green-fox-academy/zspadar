package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 02..
 */
@RestController
public class HelloRESTController {


  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name) {
  Greeting greeting = new Greeting(1, String.format("Hello, %s,", name));
  return greeting;
  }



}
