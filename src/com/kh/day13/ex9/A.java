package com.kh.day13.ex9;
/*
  프로그래머가 생성자를 하나라도 정의했다면 컴파일러가 자동으로 생성하지 않는다
 */

public class A {
//
//  public A() {  // 디폴트 생성자
//    super();
//  }
//
  A(int a) {  // 디폴트 생성자가 아님
    System.out.println("A 생성자");
  }
}
