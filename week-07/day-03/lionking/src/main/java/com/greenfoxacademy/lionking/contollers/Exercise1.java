package com.greenfoxacademy.lionking.contollers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 03..
 */
@RestController
public class Exercise1 {

  @RequestMapping(value = "/Exercise1")
  public String getFirstEndPoint(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("name",bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "firstEndPoint";
  }

}
