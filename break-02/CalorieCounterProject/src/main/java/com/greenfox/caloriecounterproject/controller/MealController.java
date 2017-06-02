package com.greenfox.caloriecounterproject.controller;

import com.greenfox.caloriecounterproject.model.Meal;
import com.greenfox.caloriecounterproject.model.Statistic;
import com.greenfox.caloriecounterproject.repository.MealRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zsuzsanna.padar on 2017. 06. 02..
 */
@Controller
public class MealController {
  @Autowired
  MealRepository mealRepository;

  @GetMapping(value = "/")
  public String showIndexPage(Model model) {
    List<Meal> meals = (List<Meal>) mealRepository.findAll();
    model.addAttribute("yourMeals",meals);
    model.addAttribute("statistic",new Statistic(meals));
    return "index";
  }

}
