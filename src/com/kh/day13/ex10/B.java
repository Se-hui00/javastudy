package com.kh.day13.ex10;

public class B extends A{
  B() {
    System.out.println("B 생성자1");
  }

  B(int a) {
    super(a);
    System.out.println("B 생성자2");
  }
}


