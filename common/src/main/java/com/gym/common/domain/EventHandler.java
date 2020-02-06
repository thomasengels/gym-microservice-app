package com.gym.common.domain;

public abstract class EventHandler<S,T extends Event> {
    public abstract void process(S entity, T event);
}
