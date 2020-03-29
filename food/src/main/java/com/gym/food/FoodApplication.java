package com.gym.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.gym.food.domain")
@SpringBootApplication
public class FoodApplication {
  public static void main(String[] args) {
    SpringApplication.run(FoodApplication.class, args);
  }
}
