package com.greenfox.frontend.appenda;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
@RestController
public class AppendAContorller {

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public AppendA getAppended (@PathVariable("appendable") String appendable){
    return new AppendA(appendable + "a");
  }

}
