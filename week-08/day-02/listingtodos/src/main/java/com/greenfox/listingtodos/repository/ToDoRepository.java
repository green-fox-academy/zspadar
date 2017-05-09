package com.greenfox.listingtodos.repository;

import com.greenfox.listingtodos.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by zsuzsanna.padar on 2017. 05. 09..
 */
@Component
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
