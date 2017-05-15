package com.greenfox.groot.guardian.controller;

import com.greenfox.groot.guardian.exception.ExceptionController;
import com.greenfox.groot.guardian.model.Guardian;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
@RestController
public class GuardianController {

  @GetMapping(value = "/groot")
  public Guardian getValue(@RequestParam (value = "message") String message ){
   Guardian guardian = new Guardian(message);
    return guardian;
  }

  @ExceptionHandler(Exception.class)
  public ExceptionController getError(Exception e){
    return new ExceptionController("I am Groot!");
  }

}
