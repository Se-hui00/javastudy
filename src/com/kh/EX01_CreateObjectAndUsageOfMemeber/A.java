package com.kh.EX01_CreateObjectAndUsageOfMemeber;

public class A {
  // 필드
  int m = 3;

  // 기본 생성자 메소드
  public A(){}


  // 메소드
  void print() {
    System.out.println("객체 생성 및 활용");
  }

  // 재정의  // 재정의를 하지 않으면 object 클래스의 toString을 돌려줌
  @Override // 재정의 할 때 권장
  public String toString() {
    return "test";
  }
}





