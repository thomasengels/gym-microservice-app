package com.gym.food.service.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.gym.food.domain.command.CreateFoodCommand;
import com.gym.food.domain.command.CreateFoodCommandHandler;
import com.gym.food.service.graphql.types.CreateFoodInput;
import com.gym.food.service.graphql.types.Food;
import org.springframework.stereotype.Service;

@Service
public class MutationResolver implements GraphQLMutationResolver {
  private final CreateFoodCommandHandler createFoodCommandHandler;

  public MutationResolver(CreateFoodCommandHandler createFoodCommandHandler) {
    this.createFoodCommandHandler = createFoodCommandHandler;
  }

  public Food createFood(CreateFoodInput createFoodInput) {
    CreateFoodCommand command = new CreateFoodCommand(createFoodInput.getName(), createFoodInput.getFoodType());
    com.gym.food.domain.model.Food foodDAO =  this.createFoodCommandHandler.handle(command);
    return new Food(foodDAO);
  }
}
