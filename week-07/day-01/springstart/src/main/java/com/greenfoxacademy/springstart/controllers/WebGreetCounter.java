package com.greenfoxacademy.springstart.controllers;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 02..
 */
@Controller("/web/greeting")
public class WebGreetCounter {
  AtomicLong counter= new AtomicLong();

    @RequestMapping(value = "/web/greeting")
    public String greeting3(@RequestParam(value = "name", defaultValue = "name", required = false) String name, Model model) {
      model.addAttribute("name", name );
      model.addAttribute("counter", counter.getAndIncrement());
      return "greeting2";
    }

  }
