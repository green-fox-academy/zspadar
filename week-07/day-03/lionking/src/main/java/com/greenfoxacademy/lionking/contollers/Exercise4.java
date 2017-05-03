package com.greenfoxacademy.lionking.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zsuzsanna.padar on 2017. 05. 03..
 */
@Controller
public class Exercise4 {
  @RequestMapping(value = "/Exercise4")
  public String getFourthPoint(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "fourthEndPoint";
  }
}
