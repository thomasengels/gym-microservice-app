package com.gym.food.repository;

import com.gym.food.domain.model.Food;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface FoodRepository extends MongoRepository<Food, BigInteger> {
}
