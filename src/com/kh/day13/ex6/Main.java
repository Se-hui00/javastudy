package com.kh.day13.ex6;

public class Main {
  public static void main(String[] args) {
    A aa = new A();
    aa.hello();

    B bb = new B();
    bb.hello();

    A ab = new B(); // 자동형변환 상위 -> 하위
    ab.hello();
    System.out.println(ab.name);  // 필드는 재정의가 안됨
  }
}


