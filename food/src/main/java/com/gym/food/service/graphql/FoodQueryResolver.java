package com.gym.food.service.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gym.food.service.FoodQueryService;
import com.gym.food.service.graphql.types.Food;
import com.gym.food.service.graphql.types.FoodPage;
import com.gym.food.service.graphql.types.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class FoodQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private FoodQueryService<Food> foodQueryService;

    public FoodPage getAll(Page page){
        Pageable pageable = null;
        if(page != null){
            pageable = PageRequest.of(page.getIndex(), page.getSize());
        }
        else {
            pageable = PageRequest.of(0, Integer.MAX_VALUE);
        }

        org.springframework.data.domain.Page<Food> pageableFood = foodQueryService.getAll(pageable);
        return new FoodPage(pageableFood.getContent(), pageableFood.getSize(), pageableFood.getNumber());
    }
}
