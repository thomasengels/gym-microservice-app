package com.gym.food.service.graphql.types;


import java.util.List;

public class FoodPage extends Page<Food> {
    private List<Food> content;

    @Override
    protected List<Food> getContent() {
        return this.content;
    }

    public FoodPage(List<Food> content, int size, int index) {
        this.content = content;
        this.size = size;
        this.index = index;
    }
}
