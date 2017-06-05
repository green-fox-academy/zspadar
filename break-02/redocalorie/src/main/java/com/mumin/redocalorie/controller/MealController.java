package com.mumin.redocalorie.controller;

import com.mumin.redocalorie.model.Meal;
import com.mumin.redocalorie.model.MealType;
import com.mumin.redocalorie.model.Statistic;
import com.mumin.redocalorie.repository.MealRepository;
import com.mumin.redocalorie.repository.MealTypeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zsuzsanna.padar on 2017. 06. 03..
 */
@Controller
public class MealController {
  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  @GetMapping(value = "/")
  public String showIndexPage(Model model) {
    List<Meal> mealList = (List<Meal>) mealRepository.findAll();
    model.addAttribute("meals", mealList);
    model.addAttribute("statistics", new Statistic(mealList));
    return "index";
  }

  @GetMapping(value = "/add")
  public String getAddPage(Model model) {
    Meal meal = new Meal();
    List<MealType> mealTypes = (List<MealType>) mealTypeRepository.findAll();
    model.addAttribute("meal", meal);
    model.addAttribute("mealType", mealTypes);
    model.addAttribute("errors", "");
    return "add";
  }

  @PostMapping(value = "/add")
  public String addNewMeal(Model model, @RequestParam("date") String date,
      @RequestParam("type") String type,
      @RequestParam("description") String description,
      @RequestParam("calories") String calories) {
    Meal meal = new Meal();
    meal.setDate(date);
    meal.setType(type);
    meal.setDescription(description);
    meal.setCalories(Integer.parseInt(calories));

    List<String> errors = new ArrayList<>();
    if(meal.getDate().equals("")) {
      errors.add("date");
    }
    if(meal.getType().equals("")) {
      errors.add(" type");
    }
    if(meal.getCalories() == 0) {
      errors.add("calories");
    }

    if(errors.size()== 0) {
      mealRepository.save(meal);
      return "redirect:/";
    } else {
      model.addAttribute("meal", meal);
      model.addAttribute("errors", String.join(", ", errors));
      List<MealType> mealTypes = (List<MealType>) mealTypeRepository.findAll();
      model.addAttribute("mealType", mealTypes);
      return "add";
    }

  }

  @GetMapping(value = "/edit")
  public String getEditPage(Model model, @RequestParam(value = "id", required = true) String id) {
    Meal meal = mealRepository.findOne(Long.parseLong(id));
    List<MealType> mealTypes = (List<MealType>) mealTypeRepository.findAll();
    model.addAttribute("meal", meal);
    model.addAttribute("mealType", mealTypes);
    model.addAttribute("errors", "");
    return "edit";
  }

  @PostMapping(value = "/edit")
  public String addNewMeal(Model model,
      @RequestParam(value = "id", required = true) String id,
      @RequestParam("date") String date,
      @RequestParam("type") String type,
      @RequestParam("description") String description,
      @RequestParam("calories") String calories) {
    Meal meal = mealRepository.findOne(Long.parseLong(id));
    meal.setDate(date);
    meal.setType(type);
    meal.setDescription(description);
    meal.setCalories(Integer.parseInt(calories));

    List<String> errors = new ArrayList<>();
    if(meal.getDate().equals("")) {
      errors.add("date");
    }
    if(meal.getType().equals("")) {
      errors.add(" type");
    }
    if(meal.getCalories() == 0) {
      errors.add("calories");
    }

    if(errors.size()== 0) {
      mealRepository.save(meal);
      return "redirect:/";
    } else {
      model.addAttribute("meal", meal);
      model.addAttribute("errors", String.join(", ", errors));
      List<MealType> mealTypes = (List<MealType>) mealTypeRepository.findAll();
      model.addAttribute("mealType", mealTypes);
      return "edit";
    }

  }



  @GetMapping(value = "/delete")
  public String deleteById (@RequestParam(value = "id", required = true) String id){
    mealRepository.delete(Long.parseLong(id));
    return "redirect:/";
  }

}
