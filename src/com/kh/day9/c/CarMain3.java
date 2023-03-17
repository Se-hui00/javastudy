package com.kh.day9.c;

public class CarMain3 {
  public static void main(String[] args) {
    Car3[] cars = new Car3[3];

    for (int i = 0; i < cars.length; i++) {
      cars[i] = new Car3("검정");
    }
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i].toString());
    }
//    Car3.number();
  }
}







