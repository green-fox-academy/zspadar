package com.greenfox.guardian.rora.model;

import javax.validation.OverridesAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
public class Ship {

  Cargo cargo = new Cargo();

  String received;
  int amount;
  String shipstatus;
  boolean ready;

  public Ship(String received, int amount) {
    this.received = received;
    this.amount = amount;
    this.shipstatus = getPercentOfShipStatus();
    this.ready = cargo.isReady();

  }

  public String getReceived() {
    return received;
  }


  public int getAmount() {
    return amount;
  }

  public boolean isReady() {
    if(amount >= 12500){
      return true;
    } else {
      return false;
    }
  }

  public String getPercentOfShipStatus () {
    shipstatus = cargo.getShipstatus() + String.valueOf((amount * 100 / 12500)) + "%";
    return shipstatus;
  }
}
