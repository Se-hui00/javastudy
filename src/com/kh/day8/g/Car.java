package com.kh.day8.g;

public class Car {

  //속성 정의
  private String color;
  private int cnt;

  // 객체생성방법




  // 행위정의
  public void run() {
    System.out.println("운전하다");
  }

  public void stop() {
    System.out.println("멈추다");
  }

  // 속성의 접근 (getter, setter)
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getCnt() {
    return cnt;
  }

  public void setCnt(int cnt) {
    this.cnt = cnt;
  }

  // 객체의 상태

}
