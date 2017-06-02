package com.greenfox.caloriecounterproject.model;

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
@Table(name = "mealType")
@Getter
@Setter
public class MealType {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String type;

  public MealType() {
  }

  public MealType(String type) {
    this.type = type;
  }
}
