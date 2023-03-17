package com.kh.day10.i.pack02;

import com.kh.day10.i.pack01.A;

public class D extends A{
  void def() {
    System.out.println(this.a); // 상속되어 있어서 this 접근 가능
    System.out.println(this.b); // 다른패키지라 하더라도 상속관계이기 때문에 접근 가능
//    System.out.println(this.c);
//    System.out.println(this.d);
  }
}


