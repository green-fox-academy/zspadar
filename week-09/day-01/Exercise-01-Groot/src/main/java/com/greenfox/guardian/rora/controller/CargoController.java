package com.greenfox.guardian.rora.controller;

import com.greenfox.guardian.exception.ExceptionController;
import com.greenfox.guardian.rora.model.Cargo;
import com.greenfox.guardian.rora.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
@RestController
public class CargoController {
  @Autowired
  Cargo cargo;

  @GetMapping(value = "/rocket")
  public Cargo getStatus() {
    return cargo;
  }

  @GetMapping(value = "/rocket/fill")
    public Ship fillRocket(@RequestParam (value = "caliber") String received, @RequestParam(value = "amount") int amount) {
      Ship ship = new Ship(received, amount);
      if(received.equals(".25")) {
        cargo.setCaliber25(ship.getAmount() + amount);
      } else if(received.equals(".30")) {
        cargo.setCaliber30(ship.getAmount() + amount);
      } else if(received.equals(".50")) {
        cargo.setCaliber50(ship.getAmount() + amount);
      }
      if((cargo.getCaliber25() + cargo.getCaliber30() + cargo.getCaliber50()) < 12500) {
        cargo.setShipstatus(ship.getShipstatus());
      } else if ((cargo.getCaliber25() + cargo.getCaliber30() + cargo.getCaliber50()) == 12500) {
        cargo.setShipstatus("full");
      } else if ((cargo.getCaliber25() + cargo.getCaliber30() + cargo.getCaliber50()) > 12500) {
        cargo.setShipstatus("overloaded");
      }
      if(cargo.getShipstatus().equals("full")) {
        cargo.setReady(true);
      }
      return ship;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ExceptionController setError (MissingServletRequestParameterException ex) {
    return new ExceptionController("Missing parameter.");
  }

}
