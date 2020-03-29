package com.gym.food.service;

import com.gym.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FoodQueryServiceImpl implements FoodQuery {
  @Autowired
  private FoodRepository foodRepository;

  @Override
  public Page getAll(Pageable pageRequest) {
    return foodRepository.findAll(pageRequest);
  }
}
