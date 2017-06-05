package com.mumin.redocalorie;

import com.mumin.redocalorie.model.Meal;
import com.mumin.redocalorie.model.MealType;
import com.mumin.redocalorie.repository.MealRepository;
import com.mumin.redocalorie.repository.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedocalorieApplication implements CommandLineRunner{
	@Autowired
	MealRepository mealRepository;
	@Autowired
	MealTypeRepository mealTypeRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedocalorieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mealTypeRepository.save(new MealType("Breakfast"));
		mealTypeRepository.save(new MealType("Elevenses"));
		mealTypeRepository.save(new MealType("Lunch"));
		mealTypeRepository.save(new MealType("Snack"));
		mealTypeRepository.save(new MealType("Dinner"));
		mealTypeRepository.save(new MealType("Midnight Snack"));

		mealRepository.save(new Meal("2017.11.30", "Breakfast", "Banana pancakes", 455));
    mealRepository.save(new Meal("2017.01.30", "Lunch", "Stuffed cabbage", 1455));
    mealRepository.save(new Meal("2017.05.30", "Snack", "Jacked potato", 210));
    mealRepository.save(new Meal("2017.12.31", "Midnight snack", "Champagne with strawberry", 743));

	}
}
