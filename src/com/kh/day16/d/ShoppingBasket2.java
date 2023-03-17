package com.kh.day16.d;

public class ShoppingBasket2<T> {
  private T vegetable;

  public void put(T vegetable) {
    this.vegetable = vegetable;
  }

  public void remove() {
    this.vegetable = null;
  }

  public T get() {
    return this.vegetable;
  }
}


