package com.kh.day8.b;

import com.kh.day8.a.Calculator;    // 패키지가 달라서

import java.util.Arrays;

/*
  실행클래스: main() 메소드가 있는 클래스
 */
public class Main {
  public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.method1();
    cal.method2();
    cal.method3();

    Calculator.method4();
    Math.random();

    System.out.println("ha");
    Arrays.sort(new int[]{3,2,4});

    cal.filed1 = 10;
  }
}




