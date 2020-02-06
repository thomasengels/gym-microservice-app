package com.gym.common.domain;

public abstract class CommandHandler<S extends AbstractEntity, T extends Command> {
    public abstract S handle(T command);
}
