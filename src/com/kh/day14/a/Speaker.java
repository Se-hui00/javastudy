package com.kh.day14.a;

public class Speaker implements Soundable{
  @Override
  public void sound() {
    System.out.println("스피커 소리");
  }
}
