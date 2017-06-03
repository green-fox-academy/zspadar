package com.greenfox.caloriecounterproject.controller;

import com.greenfox.caloriecounterproject.model.Meal;
import com.greenfox.caloriecounterproject.model.MealType;
import com.greenfox.caloriecounterproject.model.Statistic;
import com.greenfox.caloriecounterproject.repository.MealRepository;
import com.greenfox.caloriecounterproject.repository.MealTypeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zsuzsanna.padar on 2017. 06. 02..
 */
@Controller
public class MealController {
  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  @GetMapping(value = "/")
  public String showIndexPage(Model model) {
    List<Meal> meals = (List<Meal>) mealRepository.findAll();
    model.addAttribute("yourMeals", meals);
    model.addAttribute("statistic", new Statistic(meals));
    return "index";
  }

  @GetMapping(value = "/addEdit")
  public String showAddableMeals(Model model, @RequestParam(value = "id", required = true, defaultValue = "0") String id) {
    List<MealType> mealTypes = (List<MealType>) mealTypeRepository.findAll();
    model.addAttribute("mealTypes", mealTypes);

    Meal meal;

    model.addAttribute("id", id);
    if (id.equals("0")) {
      meal = new Meal();
    } else {
      meal = mealRepository.findOne(Long.parseLong(id));
    }

    model.addAttribute("meal", meal);

    model.addAttribute("errors", "");

    return "addOrEdit";
  }

  @PostMapping(value = "/addEdit")
  public String addMeals(Model model,
      @RequestParam(value = "cancel", required = true, defaultValue = "") String cancel,
      @RequestParam(value = "id", required = true, defaultValue = "0") String id,
      @RequestParam("date") String date,
      @RequestParam("calories") String calories,
      @RequestParam("type") String type,
      @RequestParam("description") String description) {

    List<String> errors = new ArrayList<>();

    List<MealType> mealTypes = (List<MealType>) mealTypeRepository.findAll();
    model.addAttribute("mealTypes", mealTypes);

    Meal meal;
    if (id.equals("0")) {
      meal = new Meal();
    } else {
      meal = mealRepository.findOne(Long.parseLong(id));
    }
    meal.setType(type);
    meal.setCalories(calories);
    meal.setDescription(description);
    meal.setMealDate(date);

    if (meal.getCalories() == 0.0) {
      errors.add("calories");
    }
    if (meal.getMealDate().equals("")) {
      errors.add("date");
    }

    if (errors.size() == 0) {
      mealRepository.save(meal);
      return "redirect:/";
    } else {
      model.addAttribute("meal", meal);
      model.addAttribute("errors", String.join(", ", errors));
      return "addOrEdit";
    }
  }

  @GetMapping(value = "/delete")
  public String deleteMeal(@RequestParam("id") String id) {
    mealRepository.delete(Long.parseLong(id));
    return "redirect:/";
  }



}
