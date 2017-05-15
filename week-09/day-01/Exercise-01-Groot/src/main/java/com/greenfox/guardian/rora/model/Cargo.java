package com.greenfox.guardian.rora.model;

import org.springframework.stereotype.Service;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
@Service
public class Cargo {
  int caliber25;
  int caliber30;
  int caliber50;
  String shipstatus;
  boolean ready;


  public Cargo() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.shipstatus = "empty";
    this.ready = false;
  }

  public int getCaliber25() {
    return caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
