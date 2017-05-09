package com.greenfox.listingtodos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by zsuzsanna.padar on 2017. 05. 09..
 */
@Entity
@Getter
@Setter
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;

  String title;
  boolean isUrgent;
  boolean isDone;
  public ToDo(){
  }

  public ToDo( String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }

  @Override
  public String toString() {
    return id + ": " + title;
  }

}
