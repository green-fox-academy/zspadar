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
		mealTypeRepository.save(new MealType("Breakfast"));
		mealTypeRepository.save(new MealType("Elevenses"));
		mealTypeRepository.save(new MealType("Lunch"));
		mealTypeRepository.save(new MealType("Snack"));
		mealTypeRepository.save(new MealType("Dinner"));
		mealTypeRepository.save(new MealType("Midnight Snack"));



		mealRepository.save(new Meal("Breakfast","Lovely ham and eggs", 243.50));
		mealRepository.save(new Meal("Elevenses", "Banana", 111));
		mealRepository.save(new Meal("Lunch", "Fried Octopus", 234.6));
		mealRepository.save(new Meal("Snack", "chips with lemonade", 256.76));
		mealRepository.save(new Meal("Dinner", "Silence of the  lambs", 1250));
		mealRepository.save(new Meal("Midnight Snack", "Bloody Mary", 254));
	}

}
