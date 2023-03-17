package com.kh.day13.ex10;

public class A {
  A() {
    System.out.println("A 생성자1");
  }

  A(int a) {
    this();
    System.out.println("A 생성자2");
  }
}
