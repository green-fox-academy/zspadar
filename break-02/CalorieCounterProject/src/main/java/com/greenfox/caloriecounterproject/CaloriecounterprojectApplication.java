package com.greenfox.caloriecounterproject;

import com.greenfox.caloriecounterproject.model.Meal;
import com.greenfox.caloriecounterproject.model.MealType;
import com.greenfox.caloriecounterproject.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaloriecounterprojectApplication implements CommandLineRunner{

	MealType type;

	@Autowired
	MealRepository mealRepository;
	public static void main(String[] args) {
		SpringApplication.run(CaloriecounterprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mealRepository.save(new Meal(type.BREAKFAST,"Lovely ham and eggs", 243.50));
		mealRepository.save(new Meal(type.ELEVENSES, "Banana", 111));
		mealRepository.save(new Meal(type.LUNCH, "Fried Octopus", 234.6));
		mealRepository.save(new Meal(type.SNACK, "chips with lemonade", 256.76));
		mealRepository.save(new Meal(type.DINNER, "Silence of the  lambs", 1250));
		mealRepository.save(new Meal(type.MIDNIGHT_SNACK, "Bloody Mary", 254));
	}

}
