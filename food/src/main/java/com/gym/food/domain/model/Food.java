package com.gym.food.domain.model;

import com.gym.common.domain.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.Entity;

@Entity
public class Food extends AbstractEntity {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private FoodType foodType;

    @PersistenceConstructor
    public Food(String name, FoodType foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public Food() {

    }
}
