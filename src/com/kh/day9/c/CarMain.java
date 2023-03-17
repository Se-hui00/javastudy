package com.kh.day9.c;

public class CarMain {
  public static void main(String[] args) {
    Car car1 = new Car(1, "검정");
    Car car2 = new Car(2, "빨강");

    // 출고 시점의 상태
    System.out.println(car1);
    System.out.println(car2);


    for (int i = 0; i < 24; i++) {
      car1.speedUp();
    }
    System.out.println(car1);
    car1.speedUp();
    System.out.println(car1);

    for (int i = 0; i < 24; i++) {
      car1.speedDown();
    }
    System.out.println(car1);

    car1.speedDown();
    System.out.println(car1);

    car1.setColor("파랑");
    System.out.println(car1);
  }
}


