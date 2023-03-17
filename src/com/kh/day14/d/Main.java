package com.kh.day14.d;
/*
  일반예외 :checked exception
 */
public class Main {
  public static void main(String[] args){
    try {
      method3();
    } catch (InterruptedException e) {

    }

    try {
      deposit(0);
    } catch (UserException1 e1) {
      System.out.println(e1.getMessage());  // 예외가 가지고 있는 메세지 열기
    } catch (UserException2 e2) {
      System.out.println(e2.getMessage());
    }
  }

  static void method3() throws InterruptedException {
    method2();
  }

  static void method2() throws InterruptedException {
    method1();
  }

  static void method1() throws InterruptedException {
    for (int i = 0; i < 10; i++) {
      System.out.println("i = " + i);
      Thread.sleep(100);
    }
  }

  static void deposit(int money) throws UserException1, UserException2 {
    if (money > 40_000) {
      throw new UserException1("1회 입금은 4만원을 초과할 수 없습니다");
    }
    if (money < 1) {
      throw new UserException2("1원 이상 입금 가능합니다");
    }
    System.out.println("입금처리");
  }
}

