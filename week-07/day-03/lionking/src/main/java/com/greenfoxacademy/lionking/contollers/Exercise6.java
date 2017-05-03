package com.greenfoxacademy.lionking.contollers;

import com.greenfoxacademy.lionking.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zsuzsanna.padar on 2017. 05. 03..
 */
@Controller
public class Exercise6 {
  @RequestMapping(value = "/Exercise6")
  public String getSixthEndPoint(Model model) {

    ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    bankAccounts.add(new BankAccount("Rafiki", 55000, "chimpanzee"));
    bankAccounts.add(new BankAccount("Nala", 11000, "lion"));
    bankAccounts.add(new BankAccount("Ed", 1, "hyena"));
    bankAccounts.add(new BankAccount("Zulu", 354, "toucan"));

    model.addAttribute("bankAccounts",bankAccounts);

    return "sixthEndPoint";
  }

}
