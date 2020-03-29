package com.gym.food.service.graphql.types;


import java.util.List;

public abstract class ContentPage<T> extends Page{
  List<T> content;

  abstract List<T> getContent();
}
