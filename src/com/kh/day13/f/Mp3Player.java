package com.kh.day13.f;

public class Mp3Player extends Radio implements Chargable, SmartPower{
  public void playMp3() {
    System.out.println("mp3를 틀다");
  }

  @Override
  public void charge() {
    System.out.println("충전하다");
  }

  @Override
  public void on() {
    System.out.println("전원을 키다");
  }

  @Override
  public void off() {
    System.out.println("전원을 끄다");
  }
}
