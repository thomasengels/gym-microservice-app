package com.gym.food.service.graphql.types;

import java.util.List;

public abstract class Page<T> {
    int size = 10;
    int index = 1;

    List<T> content;

    protected abstract List<T> getContent();

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return size;
    }
}
