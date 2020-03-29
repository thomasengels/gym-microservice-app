package com.gym.food.service.graphql.types;

public class Page{
  int size = 10;
  int index = 1;

  public int getIndex() {
    return index;
  }

  public int getSize() {
    return size;
  }

  public Page(){

  }
}
