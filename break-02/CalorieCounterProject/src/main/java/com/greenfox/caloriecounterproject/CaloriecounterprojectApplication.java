package com.greenfox.caloriecounterproject;

import com.greenfox.caloriecounterproject.model.Meal;
import com.greenfox.caloriecounterproject.model.MealType;
import com.greenfox.caloriecounterproject.repository.MealRepository;
import com.greenfox.caloriecounterproject.repository.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaloriecounterprojectApplication implements CommandLineRunner{

	@Autowired
	MealTypeRepository mealTypeRepository;

	@Autowired
	MealRepository mealRepository;
	public static void main(String[] args) {
		SpringApplication.run(CaloriecounterprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mealRepository.save(new Meal(,"Lovely ham and eggs", 243.50));
		mealRepository.save(new Meal(, "Banana", 111));
		mealRepository.save(new Meal(, "Fried Octopus", 234.6));
		mealRepository.save(new Meal(, "chips with lemonade", 256.76));
		mealRepository.save(new Meal(, "Silence of the  lambs", 1250));
		mealRepository.save(new Meal(, "Bloody Mary", 254));
	}

}
