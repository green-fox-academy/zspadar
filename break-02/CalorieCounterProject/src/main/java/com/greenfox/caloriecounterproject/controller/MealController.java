package com.greenfox.caloriecounterproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zsuzsanna.padar on 2017. 06. 02..
 */
@Controller
public class MealController {
  @GetMapping(value = "/")
  public String showIndexPage() {
    return "index";
  }

}
