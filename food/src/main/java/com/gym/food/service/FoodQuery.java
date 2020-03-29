package com.gym.food.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FoodQuery<Food> {
  Page<Food> getAll(Pageable pageRequest);
}
