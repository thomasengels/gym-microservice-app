package com.gym.food.domain.command;

import com.fasterxml.jackson.annotation.JsonValue;
import com.gym.common.domain.Command;
import com.gym.food.domain.model.FoodType;

import javax.persistence.Entity;

@Entity
public class CreateFoodCommand extends Command {
    @JsonValue
    private String name;
    @JsonValue
    private FoodType foodType;

    public CreateFoodCommand(){}

    public CreateFoodCommand(String name, String foodType) {
        super();
        this.name = name;
        this.foodType = FoodType.valueOf(foodType);
    }

    public String getName() {
        return name;
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
