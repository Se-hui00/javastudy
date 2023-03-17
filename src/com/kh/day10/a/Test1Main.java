package com.kh.day10.a;
// 도대체 무슨 말이지..?
import java.lang.*;

public class Test1Main extends Object{
  public static void main(String[] args) {
    Test1 t1 = new Test1();
    System.out.println(t1.toString());  // 객체의 문자열 출력
    Class<? extends Test1> aClass = t1.getClass();

    Test1 t2 = new Test1("케로로", 20);
  }
}








