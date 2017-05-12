package com.greenfox.zspadar.reddit.model;

import java.sql.Timestamp;
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
  long id;

  String title;
  String href;
  Timestamp timestamp;
  int score;

  public Post() {
    this.timestamp = new Timestamp(System.currentTimeMillis());
    this.score = 0;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis());
    this.score = 0;
  }

  public Post(String title, String href, Timestamp timestamp, int score) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis());
    this.score = score;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getHref() {
    return href;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public int getScore() {
    return score;
  }

  public void upVote() {
    score++;
  }

  public void downVote() {
    score--;
  }

}
