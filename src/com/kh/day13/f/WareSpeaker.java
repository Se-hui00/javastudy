package com.kh.day13.f;

public class WareSpeaker extends Speaker implements Chargable{
  @Override
  public void charge() {
    System.out.println("충전하다");
  }
}
