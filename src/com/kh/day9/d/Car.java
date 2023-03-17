package com.kh.day9.d;
// static 사용법
public class Car {
  int number; // 인스턴스 멤버
  static int output;  // 생산량    // 동적 멤버

  public Car() {
    System.out.println("Car() 호출됨");
    number ++;
    output++;
  }

  public void method1() {
    System.out.println("method1() 호출됨");
    System.out.println(number);
    System.out.println(output);
    method2();
  }
  public static void method2() {
    System.out.println("method1() 호출됨");
    //System.out.println(number);
    System.out.println(output);
    method2();
  }
}

/*
배열 5개..

 */





