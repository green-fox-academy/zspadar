package com.greenfox.frontend.greeting;

import com.greenfox.frontend.exception.ExceptionController;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
@RestController
public class GreetingController {

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeting getNameAndTitle(@RequestParam("name") String name, @RequestParam("title") String title) {
    return new Greeting("Oh, hi there " + name + ", " + "my dear " + title + "!");
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ExceptionController getError(MissingServletRequestParameterException ex){
    String name = ex.getParameterName();
    return new ExceptionController("Please provide a " + name + "!");
  }

}
