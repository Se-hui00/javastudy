package com.kh.day14.b;

public interface A {
  default void abc() {
    System.out.println("A 인터페이스 abc()");
  }
}
