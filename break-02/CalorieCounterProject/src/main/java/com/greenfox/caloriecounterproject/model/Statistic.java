package com.greenfox.caloriecounterproject.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 02..
 */
@Getter
@Setter
public class Statistic {
  private int mealNumber;
  private double totalCalories;

  public Statistic() {

  }

  public Statistic(List<Meal> meals) {
    this.mealNumber = returnTotalMeals(meals);
    this.totalCalories = returnTotalCalories(meals);
  }

  public int returnTotalMeals(List<Meal> meals) {
    return meals.size();
  }

  public double returnTotalCalories(List<Meal> meals) {
    double calorie = 0.0;
    for(Meal meal : meals) {
      calorie += meal.getCalories();
    }
    return calorie;
  }

}
