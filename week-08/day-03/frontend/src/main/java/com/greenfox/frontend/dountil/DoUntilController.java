package com.greenfox.frontend.dountil;

import com.greenfox.frontend.exception.ExceptionController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
@RestController
public class DoUntilController {

  @RequestMapping(value="/dountil/{what}", method = RequestMethod.POST)
  public Response getUntil(@PathVariable("what") String what, @RequestBody DoUntil doUntil) {
    Response response = new Response();
    if (what.equals("sum")) {
      response.sumIt(doUntil.getUntil());
    }
    else if (what.equals("factor")){
      response.factorIt(doUntil.getUntil());
    }
    return response;
  }

  @ExceptionHandler(Exception.class)
  public ExceptionController getError(){
    return new ExceptionController("Please provide a number!");
  }





}
