package com.kh.day14.b;

public class B extends Object implements A{
  @Override
  public void abc() {
    A.super.abc();  // A 인터페이스 abc()
    System.out.println("B 클래스의 abc()");
  }
}
