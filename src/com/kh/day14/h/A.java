package com.kh.day14.h;

public class A {
  void abc() {
    bcd();
  }
  void bcd() {
    try {
      Thread.sleep(1000);
      Class.forName("java.lang.Object");
    } catch (InterruptedException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
