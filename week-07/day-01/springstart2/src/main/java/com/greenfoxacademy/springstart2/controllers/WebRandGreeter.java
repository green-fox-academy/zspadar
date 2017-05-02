package com.greenfoxacademy.springstart2.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zsuzsanna.padar on 2017. 05. 02..
 */
@Controller
public class WebRandGreeter {
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};



  @RequestMapping(value = "web/randgreet")
  public String randGreeting(@RequestParam(value = "name", defaultValue = "name", required = false) String name, Model model){

    ArrayList<Greeting> greetings = new ArrayList<>();
    for(String hello: hellos) {
      greetings.add(new Greeting(hello));
    }

    model.addAttribute("name", name);
    model.addAttribute("hellos", greetings);
    return "randGreet";
  }



}
