package com.kh.day14.c;

public class Main {
  public static void main(String[] args) {
    // ArrayIndexOutOfBoundsException
    int[] a = new int[3];
//    a[0] = 10;
//    a[3] = 20;

    // NullPointException
    a = null;
//    a[0] = 10;

    // ArithmeticException
    try {
      System.out.println(10 / 1);
    } catch (ArithmeticException e) {
      e.printStackTrace();  // 예외의 발생 경로를 추적
//      System.out.println(e.getMessage()); // / by zero
//      System.out.println(e.getCause()); // null

      // 매개변수랑 이름이 동일할 수 없음
//      ArithmeticException e2 = new ArithmeticException("나누기 오류");
//      System.out.println(e2.getMessage());
      return; // return이 있어도 finally는 실행됨
    } finally { // 오류가 없어도 실행됨
      System.out.println("final 실행!");
    }

    // Exception을 만나면 비정상적으로 프로그램 종료되기 때문에 try catch가 필요
     System.out.println("프로그램 종료");

  }
}
