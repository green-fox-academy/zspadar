package com.greenfox.groot.yondu.controller;


import com.greenfox.groot.exception.ExceptionController;
import com.greenfox.groot.yondu.model.Yondu;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
@RestController
public class YonduController {

  @GetMapping(value = "/yondu")
  public Yondu getValue(@RequestParam(value = "distance") Double distance, @RequestParam(value = "time") Double time) {
    Yondu yondu = new Yondu(distance,time);
    return yondu;
  }

  @ExceptionHandler(Exception.class)
  public ExceptionController getError(Exception e){
    return new ExceptionController("I am Yondu!");
  }

}
