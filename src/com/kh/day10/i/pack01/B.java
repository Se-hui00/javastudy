package com.kh.day10.i.pack01;

public class B {
  void bcd() {
    A a = new A();
    System.out.println(a.a);
    System.out.println(a.b);
    System.out.println(a.c);
    //System.out.println(a.d);  // private : 다른 클래스에서 접근불가
  }
}


