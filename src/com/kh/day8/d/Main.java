package com.kh.day8.d;

public class Main {
  public static void main(String[] args) {
    Tv tv = new Tv();
    tv.color = "빨강";
    tv.maker = "삼성";
    tv.turnOn();
    System.out.println(tv.onOff);
    tv.turnOff();
    System.out.println(tv.onOff);

    Tv tv2 = new Tv("검정","엘지");
    tv2.turnOn();

    Person p = new Person();
    p.tv = tv2;
    p.tv.turnOn();
    System.out.println(p.tv.onOff);
  }
}



