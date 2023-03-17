package com.kh.day15.a;
// thread 3개 (main, Test1, Test2)
public class Main {
  public static void main(String[] args) {

    // 별도의 thread 구현
//    for (int j = 10; j < 20; j++) {
//      System.out.println("j = " + j);
//    }

    // extends Thread 사용
    Test1 t1 = new Test1();
    t1.start();

    Test2 t2 = new Test2();
    t2.start();

    // implements Runnable 사용
    Runnable r3 = new Test3();
    Thread t3 = new Thread(r3);
    t3.start();

    // 메인 스레드는 다른 스레드가 하나라도 있다면 프로세스는 종료하지 않는다
    // ctrl + alt + t
    try {
      for (int i = 0; i < 10; i++) {
        Thread.sleep(300);
        System.out.println("i = " + i);
      }
    } catch (InterruptedException e) {

    }
  }
}


