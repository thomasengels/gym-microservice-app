package com.gym.food.service.graphql.types;

public class Food {
  private String id;
  private String name;
  private String foodType;

  public Food(com.gym.food.domain.model.Food foodDAO) {
    this.id = String.valueOf(foodDAO.getId());
    this.name = foodDAO.getName();
    this.foodType = foodDAO.getFoodType().name();
  }
}
