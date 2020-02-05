package com.gym.food.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class Nutrient extends AbstractEntity{
    @Getter
    @Setter
    private String name;
}
