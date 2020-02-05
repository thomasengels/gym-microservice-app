package com.gym.food.domain.command;

import com.gym.food.domain.event.FoodCreatedEvent;
import com.gym.food.domain.event.FoodCreatedEventHandler;
import com.gym.food.domain.model.Food;
import com.gym.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateFoodCommandHandler extends CommandHandler<Food, CreateFoodCommand>{
    private final FoodCreatedEventHandler foodCreatedEventHandler;

    private final FoodRepository foodRepository;

    @Autowired
    public CreateFoodCommandHandler(FoodCreatedEventHandler foodCreatedEventHandler, FoodRepository foodRepository) {
        this.foodCreatedEventHandler = foodCreatedEventHandler;
        this.foodRepository = foodRepository;
    }

    @Override
    public Food handle(CreateFoodCommand command) {
        Food food = new Food();
        food.setName(command.getName());
        food.setFoodType(command.getFoodType());
        this.foodCreatedEventHandler.process(food, new FoodCreatedEvent());

        return this.foodRepository.save(food);
    }
}
