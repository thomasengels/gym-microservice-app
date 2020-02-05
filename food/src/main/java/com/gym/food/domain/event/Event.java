package com.gym.food.domain.event;

import com.gym.food.domain.model.AbstractEntity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Event extends AbstractEntity {
}
