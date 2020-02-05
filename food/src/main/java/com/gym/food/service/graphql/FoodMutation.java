package com.gym.food.service.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.gym.food.domain.command.CreateFoodCommand;
import com.gym.food.domain.command.CreateFoodCommandHandler;
import com.gym.food.domain.model.Food;
import com.gym.food.service.graphql.types.CreateFoodInput;
import org.springframework.beans.factory.annotation.Autowired;

public class FoodMutation implements GraphQLMutationResolver {
    @Autowired
    private CreateFoodCommandHandler createFoodCommandHandler;

    public Food createFood(CreateFoodInput createFoodInput){
        CreateFoodCommand command = new CreateFoodCommand(createFoodInput.getName(), createFoodInput.getFoodType());
        return this.createFoodCommandHandler.handle(command);
    }
}
