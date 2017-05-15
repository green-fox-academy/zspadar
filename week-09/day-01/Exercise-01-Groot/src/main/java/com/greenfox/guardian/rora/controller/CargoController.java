package com.greenfox.guardian.rora.controller;

import com.greenfox.guardian.rora.model.Cargo;
import com.greenfox.guardian.rora.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
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
        cargo.setCaliber25(ship.getAmount());
      } else if(received.equals(".30")) {
        cargo.setCaliber30(ship.getAmount());
      } else if(received.equals(".50")) {
        cargo.setCaliber50(ship.getAmount());
      }
      return ship;
  }


}
