package com.kh.day15.a;

public class Test1 extends Thread{
  @Override
  public void run() {
    try {
      for (int j = 10; j < 20; j++) {
        Thread.sleep(200);
        System.out.println("j = " + j);
      }
    } catch (InterruptedException e) {

    }
  }
}
