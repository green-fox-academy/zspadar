package com.mumin.redocalorie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 03..
 */
@Entity
@Table(name = "Meals")
@Getter
@Setter
public class Meal {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String date;
  String type;
  String description;
  int calories;

  public Meal() {
  }

  public Meal(Long id) {
    this.id = id;
  }

  public Meal(String date, String type, String description, int calories) {
    this.date = date;
    this.type = type;
    this.description = description;
    this.calories = calories;
  }
}
