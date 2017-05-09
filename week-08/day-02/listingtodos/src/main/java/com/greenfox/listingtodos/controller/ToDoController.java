package com.greenfox.listingtodos.controller;

import com.greenfox.listingtodos.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zsuzsanna.padar on 2017. 05. 09..
 */
@Controller
@RequestMapping(value = "/todo")
public class ToDoController {
  private ToDoRepository toDoRepository;


  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @RequestMapping(value={"/", "/list"},   method= RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("todos", toDoRepository.findAll());
    return "todo";
  }

}
