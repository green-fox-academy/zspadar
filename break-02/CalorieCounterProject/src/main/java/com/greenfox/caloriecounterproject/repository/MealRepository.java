package com.greenfox.caloriecounterproject.repository;

import com.greenfox.caloriecounterproject.model.Meal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zsuzsanna.padar on 2017. 06. 02..
 */
public interface MealRepository extends CrudRepository<Meal, Long> {

}
