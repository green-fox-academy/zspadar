package com.greenfox.listingtodos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zsuzsanna.padar on 2017. 05. 09..
 */
@Controller
@RequestMapping(value = "/todo")
public class ToDoController {

  @RequestMapping(value = "/", method= RequestMethod.GET)
  @ResponseBody
  public String list2(Model model) {
    return "This is my first todo!";
  }

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo!";
  }
}
