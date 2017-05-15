package com.greenfox.guardian.rora.controller;

import com.greenfox.guardian.rora.model.Cargo;
import com.greenfox.guardian.rora.model.Ship;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
@RestController
public class CargoController {

  @GetMapping(value = "/rocket")
  public Cargo getStatus() {
    Cargo cargo = new Cargo();
    return cargo;
  }

  @GetMapping(value = "/rocket/fill")
    public Ship fillRocket(@RequestParam (value = "caliber") String received, @RequestParam(value = "amount") int amount) {
      Ship ship = new Ship(received, amount);
      return ship;
  }


}
