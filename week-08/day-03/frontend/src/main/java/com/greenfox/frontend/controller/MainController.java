package com.greenfox.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String render(){
    return "index";
  }

}
