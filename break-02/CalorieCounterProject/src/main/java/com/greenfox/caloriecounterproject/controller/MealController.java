package com.greenfox.caloriecounterproject.controller;

import com.greenfox.caloriecounterproject.model.Meal;
import com.greenfox.caloriecounterproject.model.MealType;
import com.greenfox.caloriecounterproject.model.Statistic;
import com.greenfox.caloriecounterproject.repository.MealRepository;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @GetMapping(value = "/add")
  public String showAddableMeals() {
    return "addOrEdit";
  }

  @PostMapping(value = "/add")
  public String addMeals(Model model,
      @RequestParam(value = "cancel", required = true, defaultValue = "") String cancel,
      @RequestParam("date") String date,
      @RequestParam("calories") String calories,
      @RequestParam("description") String description) {

    if (cancel.equals("")) {
      return "addOrEdit";
    } else {
      return "redirect:/";
    }


//
//
//    mealRepository.save(new Meal(date, type, description, calories));
//    model.addAttribute("newMeal", mealRepository);
//    return "redirect:/";
  }

  @DeleteMapping(value = "/delete?id")
  public String deleteMeal(@PathVariable("id") long id) {
    mealRepository.delete(id);
    return "redirect:/";
  }



}
