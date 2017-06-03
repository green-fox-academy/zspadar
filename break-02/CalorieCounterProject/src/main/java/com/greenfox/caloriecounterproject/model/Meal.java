package com.greenfox.caloriecounterproject.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 02..
 */
@Entity
@Getter
@Setter
@Table(name = "Meal")
public class Meal {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  String mealDate;
  private String type;
  private String description;
  private double calories;


  public Meal() {
  }

  public Meal(String type, String description, double calories) {
    this.id = id;
    this.mealDate = LocalDate.now().toString();
    this.type = type;
    this.description = description;
    this.calories = calories;
  }

  public Meal(String mealDate, String type, String description, double calories) {
    this.mealDate = mealDate;
    this.type = type;
    this.description = description;
    this.calories = calories;
  }

  public void setCalories(String calories) {
    this.calories = Double.parseDouble(calories);
  }

}
