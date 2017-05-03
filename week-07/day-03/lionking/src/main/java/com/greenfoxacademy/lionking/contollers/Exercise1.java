package com.greenfoxacademy.lionking.contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 03..
 */
@RestController
public class Exercise1 {

  @RequestMapping(value = "/Exercise1")
  public String getFirstEndPoint() {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    return "firstEndPoint";
  }

}
