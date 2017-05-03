package com.greenfoxacademy.lionking.contollers;

import com.greenfoxacademy.lionking.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zsuzsanna.padar on 2017. 05. 03..
 */
@Controller
public class Exercise3 {
  @RequestMapping(value = "/Exercise3")
  public String getThirdPoint(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("name",bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "thirdEndPoint";
  }
}
