package com.greenfox.caloriecounterproject.model;

import lombok.Getter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 02..
 */
@Getter
public enum MealType {
  BREAKFAST("Breakfast"),
  ELEVENSES("Elevenses"),
  LUNCH("Lunch"),
  SNACK("Snack"),
  DINNER("Dinner"),
  MIDNIGHT_SNACK("Midnight Snack");

  private final String value;

  private MealType (String value) {
    this.value = value;
  }


}
