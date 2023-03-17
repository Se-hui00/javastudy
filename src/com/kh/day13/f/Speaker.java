package com.kh.day13.f;

public class Speaker  implements Soundable{
  @Override
  public void sound() {
    System.out.println("스피커 소리");
  }
}
