package com.kh.day12.a;
// p.305 6번
public class A {
  static int a; // this 접근불가

  // 정적 초기화 블럭
  // 멤버 정적 필드 초기화하는 용도 : 복잡한 수식을 필요로 할 때
  static{
//    int x = 10;
//    int y = 10;
//    a = x + y;
    a = 8;
  }
}
