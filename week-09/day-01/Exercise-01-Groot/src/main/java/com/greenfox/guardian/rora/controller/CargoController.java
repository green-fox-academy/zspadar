package com.greenfox.guardian.rora.controller;

import com.greenfox.guardian.rora.model.Cargo;
import org.springframework.web.bind.annotation.GetMapping;
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

  @GetMapping(value = "/rocket/fill") {
    public Cargo fillRocket() {
      Cargo
    }
  }


}
