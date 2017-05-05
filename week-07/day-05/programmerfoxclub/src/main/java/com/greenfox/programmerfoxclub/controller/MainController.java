package com.greenfox.programmerfoxclub.controller;

import com.greenfox.programmerfoxclub.model.Fox;
import com.greenfox.programmerfoxclub.model.Nutrition;
import com.greenfox.programmerfoxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */
@Controller
public class MainController {
  @Autowired
  Fox fox;
  Nutrition nutrition;
  Trick tricks;


  @RequestMapping(value = "/")
  public String index(Model model){
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping(value = "/nutritionStore")
  public String nutritionStore(Model model){
    model.addAttribute("fox", fox);
    model.addAttribute("nutrition", nutrition);
    return "nutritionStore";
  }
  @PostMapping(value = "/addNutrition")
  public String addNutrition(@RequestParam("Food") String food, @RequestParam("Drink") String drink ) {
    fox.setDrink(drink);
    fox.setFood(food);
    return "redirect:/";
  }
  @RequestMapping(value = "/trickCenter")
  public String trickCenter(Model model) {
    model.addAttribute("fox", fox);
    model.addAttribute("tricks", tricks);
    return "trickCenter";
  }

  @PostMapping(value = "/addTrick")
  public String  addTricks(Model model, @RequestParam(value = "tricks", required = false, defaultValue = "gh") String trick){
    tricks.addTrick(trick);
    model.addAttribute("tricks", tricks);
    return "redirect:/";
  }

  @PostMapping(value = "/learnTrick")
  public String  learnTricks(Model model, @RequestParam(value = "Trick", required = false, defaultValue = "gh") String trick){
    fox.addTrick(trick);
    model.addAttribute("Trick", trick);
    return "redirect:/";
  }


}
