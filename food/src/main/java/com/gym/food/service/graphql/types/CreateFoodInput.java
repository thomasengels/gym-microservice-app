package com.gym.food.service.graphql.types;

import lombok.Getter;

public class CreateFoodInput {
    @Getter
    String name;
    @Getter
    String foodType;

    public CreateFoodInput(String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

  public String getFoodType() {
    return foodType;
  }

  public String getName() {
    return name;
  }
}
