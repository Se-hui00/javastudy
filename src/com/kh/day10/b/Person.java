package com.kh.day10.b;

public class Person {
  public Person() {
    super();  // Object 클래스의 객체생성
    System.out.println("public Person() called!");
  }

  public void method1() {
    System.out.println("method1() of Person called!");  // method1() of Student 재정의
  }
}


