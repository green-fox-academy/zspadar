package com.greenfox.zspadar.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by zsuzsanna.padar on 2017. 05. 12..
 */
@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  
  String title;
  String href;
  int timestamp;
  int score;

  public Post() {
  }

  public Post(int id, String title, String href, int timestamp, int score) {
    this.id = id;
    this.title = title;
    this.href = href;
    this.timestamp = timestamp;
    this.score = score;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getHref() {
    return href;
  }

  public int getTimestamp() {
    return timestamp;
  }

  public int getScore() {
    return score;
  }
}
