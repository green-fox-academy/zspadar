package com.mumin.redocalorie.controller;

import com.mumin.redocalorie.model.Meal;
import com.mumin.redocalorie.model.Response;
import com.mumin.redocalorie.model.Statistic;
import com.mumin.redocalorie.repository.MealRepository;
import com.mumin.redocalorie.repository.MealTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 06. 03..
 */
@RestController
public class MealRestController {
  @Autowired
  MealRepository mealRepository;
  @Autowired
  MealTypeRepository mealTypeRepository;

  Meal meal;

  @GetMapping(value = "/getmeals")
  public List<Meal> showList() {
    return (List<Meal>) mealRepository.findAll();
  }

  @GetMapping(value = "/getstats")
  public Statistic showStats() {
    List<Meal> mealList = (List<Meal>) mealRepository.findAll();
    return new Statistic(mealList);
  }

  @PostMapping(value = "/meal")
  public Response saveNewMeal(@RequestBody  Meal meal) {
    mealRepository.save(meal);
    return new Response("ok");
  }

  @PutMapping(value = "/meal")
  public Response updateMeal(@RequestBody Meal meal) {
    mealRepository.findOne(meal.getId());
    meal.setDate(meal.getDate());
    meal.setType(meal.getType());
    meal.setDescription(meal.getDescription());
    meal.setCalories(meal.getCalories());
    mealRepository.save(meal);
    return new Response("ok");
  }

  @DeleteMapping(value = "/meal")
  public Response deleteMeal(@RequestBody Meal meal) {
    mealRepository.delete((meal.getId()));
    return new Response("ok");
  }



}
