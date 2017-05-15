package com.greenfox.guardian.groot.controller;

import com.greenfox.guardian.exception.ExceptionController;
import com.greenfox.guardian.groot.model.Guardian;
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
