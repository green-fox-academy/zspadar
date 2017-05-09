package com.greenfox.listingtodos.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 05. 09..
 */
@Getter
@Setter
public class ToDo {
  int id;
  String title;
  boolean isUrgent;
  boolean isDone;

  public ToDo(int id, String title, boolean isUrgent, boolean isDone) {
    this.id = id;
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }

}
