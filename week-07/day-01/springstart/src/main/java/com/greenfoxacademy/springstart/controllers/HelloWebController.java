package com.greenfoxacademy.springstart.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by zsuzsanna.padar on 2017. 05. 02..
 */
@Controller("/web/greeting1")
public class HelloWebController {
  @RequestMapping(value = "/web/greeting1")
  public String greeting2(Model model) {
    model.addAttribute("name", " World");
    return "greeting";
  }

}
