package com.greenfox.listingtodos;

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

	}


}
