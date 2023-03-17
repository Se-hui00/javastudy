package com.kh.day13.f.ex3;

public class Main {
  public static void main(String[] args) {

    A a = new A() {
      @Override
      void abc() {
        System.out.println("방가");
      }
    };

    a.abc();
  }
}
