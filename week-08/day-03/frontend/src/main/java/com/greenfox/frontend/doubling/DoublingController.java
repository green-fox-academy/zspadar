package com.greenfox.frontend.doubling;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
@RestController
public class DoublingController {

  @RequestMapping(value = "/doubling/{input}", method = RequestMethod.GET)
  public Doubling getReceived (@PathVariable("input") int received) {

      return new Doubling(received);


  }

}
