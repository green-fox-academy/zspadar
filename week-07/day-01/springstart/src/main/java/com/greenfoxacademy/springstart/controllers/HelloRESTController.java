package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 02..
 */
@RestController
public class HelloRESTController {
  AtomicLong id = new AtomicLong();


  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name) {
    Greeting greeting = new Greeting(id.getAndIncrement(), String.format("Hello, %s", name));
    return greeting;
  }


}
