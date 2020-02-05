package com.gym.food.domain.command;

import com.gym.food.domain.model.AbstractEntity;

public abstract class CommandHandler<S extends AbstractEntity, T extends Command> {
    public abstract S handle(T command);
}
