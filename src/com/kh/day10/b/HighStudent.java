package com.kh.day10.b;

public class HighStudent extends Student {
  public HighStudent() {
    super();  // Student 클래스의 객체생성
    System.out.println("public Student() called!");
  }
  public void method1() {
    System.out.println("method1() of HighStudent called!"); // method1() of Person 재정의
    super.method1();  // 부모 (Student)를 불러옴
  }
}


