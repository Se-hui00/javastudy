package com.kh.day14.c;

public class Main2 {
  public static void main(String[] args) throws InterruptedException {
    //Thread.sleep(10000); // sleep 정적  // 밀리세컨즈 : 10000 -> 1초
    method1();
    method2(1);
  }

  // 일반예외 : Checked Exception
  // 반드시 예외 처리해줘야한다
  // 1. 메소드 내부에서 2. 호출한 메소드에 위임
  public static void method1(){
    try {
      for (int i = 0; i < 10; i++) {
        Thread.sleep(300);  // alt + enter 예외처리 필요함 (일반예외)
        System.out.println("i = " + i);
      }
    } catch (InterruptedException e) {

    }
  }

  public static void method2(int param){
    if (param == 1) {
    throw new IllegalArgumentException("파라미터 오류");  // unchecked exception
    }
    if (param == 2) {
//     new Exception("파라미터 오류"); // checked exception
    }
    System.out.println("param = " + param);
  }

}






