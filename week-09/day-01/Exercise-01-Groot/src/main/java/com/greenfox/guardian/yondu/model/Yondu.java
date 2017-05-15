package com.greenfox.guardian.yondu.model;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
public class Yondu {
  Double distance;
  Double time;
  Double speed;

  public Yondu() {
  }

  public Yondu(Double distance, Double time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance / time;
  }

  public Double getDistance() {
    return distance;
  }

  public Double getTime() {
    return time;
  }

  public Double getSpeed() {
    return speed;
  }
}
