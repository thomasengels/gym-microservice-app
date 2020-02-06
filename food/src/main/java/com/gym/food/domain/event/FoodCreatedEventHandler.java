package com.gym.food.domain.event;

import com.gym.common.domain.EventHandler;
import com.gym.food.domain.model.Food;
import org.springframework.stereotype.Component;

@Component
public class FoodCreatedEventHandler extends EventHandler<Food, FoodCreatedEvent> {
    @Override
    public void process(Food entity, FoodCreatedEvent event) {

    }
}
