package com.kh.day14.a;

// ctrl + o
public class Radio implements Soundable, SmartPower {
  @Override
  public void sound() {
    System.out.println("음악이 나오다");
  }

  @Override
  public void on() {
    System.out.println("전원을 키다");
  }

  @Override
  public void off() {
    System.out.println("전원을 끄다");
  }

  public void TuneChannel() {
    System.out.println("주파수를 맞추다");
  }
}


