package com.kh.day8.c;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3= new Person();
    Person p4 = new Person();

    System.out.println(System.identityHashCode(p1));
    System.out.println(System.identityHashCode(p2));
    System.out.println(System.identityHashCode(p3));
    System.out.println(System.identityHashCode(p4));

    p1.name = "홍길동";
    p1.age = 30;
    p2.smile();
    p1.sleep();

    p2.name = "동동이";
    p2.age = 20;
    p2.smile();
    p2.sleep();

    p2.name = "오동동";
    p3.age = 20;
    p2.smile();
    p2.sleep();

    if (p2 == p3) {
      System.out.println("길다");
    } else {
      System.out.println("다르다");
    }
    if (p2.age == p3.age) {
      System.out.println("나이가 같다");
    } else {
      System.out.println("나이가 다르다");
    }

    Car[] car = new Car[4];
    car[0] = new Car();
    car[1] = new Car();
    car[2] = new Car();
    car[3] = new Car();

    for (int i = 0; i < car.length; i++) {
      car[i].run();
    }

    p1.car = new Car();
    p2.car.run();
    p2.car.stop();
  }
}



