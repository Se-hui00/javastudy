package com.kh.day16.b;

public class Dish {
  private final String color;

  public Dish(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Dish{" +
            "color='" + color + '\'' +
            '}';
  }

  public String getColor() {
    return color;
  }
}


