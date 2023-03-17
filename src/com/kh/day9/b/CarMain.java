package com.kh.day9.b;

import com.kh.day9.b.Car;

public class CarMain {
  public static void main(String[] args) {

    Car c = new Car();
    c.setColor("blue");
    c.setSpeed(120);

    System.out.println(c.toString());

    System.out.println(c.getSpeed());
    c.speedUp();
    System.out.println(c.getSpeed());
    c.speedDown();
    System.out.println(c.getSpeed());

  }
}
