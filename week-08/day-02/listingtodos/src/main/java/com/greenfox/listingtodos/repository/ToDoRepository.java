package com.greenfox.listingtodos.repository;

import com.greenfox.listingtodos.ToDo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zsuzsanna.padar on 2017. 05. 09..
 */
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
