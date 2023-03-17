package com.kh.day10.i.pack01;

public class A {
  public int a; // 동일클래스 + 동일패키지 + 다른패키지
  protected int b;  // 동일클래스 + 동일패키지 + 다른패키지라도 상속관계에 있으면 접근 가능
  int c;  // 동일클래스 + 동일패키지
  private int d;  // 동일클래스

  void abc() {
    System.out.println(this.a);
    System.out.println(this.b);
    System.out.println(this.c);
    System.out.println(this.d);
  }
}


