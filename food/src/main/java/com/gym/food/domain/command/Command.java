package com.gym.food.domain.command;

import com.gym.food.domain.model.AbstractEntity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Command extends AbstractEntity {
}
