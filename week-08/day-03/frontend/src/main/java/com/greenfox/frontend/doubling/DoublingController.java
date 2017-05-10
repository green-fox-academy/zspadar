package com.greenfox.frontend.doubling;

import com.greenfox.frontend.exception.ExceptionController;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

  @ExceptionHandler(MissingServletRequestParameterException.class)
    public ExceptionController getError(MissingServletRequestParameterException ex){
    return new ExceptionController("Please provide an input!");
  }


}
