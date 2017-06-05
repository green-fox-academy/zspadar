package com.mumin.redocalorie.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 03..
 */
@Getter
@Setter
public class Statistic {
  private int numberOfMeals;
  private int totalCalories;

  public Statistic(List<Meal> meals) {
    this.numberOfMeals = meals.size();
    this.totalCalories = getTotalCalories(meals);
  }

  public int getTotalCalories(List<Meal> meals) {
    int calories = 0;
    for(Meal meal : meals) {
      calories += meal.getCalories();
    }
    return calories;
  }


}
