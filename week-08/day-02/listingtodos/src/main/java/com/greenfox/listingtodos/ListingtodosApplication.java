package com.greenfox.listingtodos;

import com.greenfox.listingtodos.model.ToDo;
import com.greenfox.listingtodos.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner{
	@Autowired
	ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ListingtodosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		toDoRepository.save(new ToDo( "Start the day",true, false));
		toDoRepository.save(new ToDo( "Finish H2 workshop1", true, true));
		toDoRepository.save(new ToDo( "Finish JPA Workshop2", true, false));
		toDoRepository.save(new ToDo("Create a CRUD project", true, false));
	}


}
