package com.kh.day9.d;

public class CarMain {
  public static void main(String[] args) {
    Car car1 = new Car();
    System.out.println(car1.number);
    System.out.println(Car.output);

    Car car2 = new Car();
    System.out.println(car1.number);
    System.out.println(Car.output);

    Car car3 = new Car();
    System.out.println(car1.number);
    System.out.println(Car.output);

    Car.output = 10;

    System.out.println(car1.output);
    System.out.println(car2.output);
    System.out.println(car3.output);

  }
}


