package com.gym.food.repository;

import com.gym.food.domain.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
