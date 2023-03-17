package com.kh.day8.h;

public class Car {

  //속성 정의
  private String color;
  private int speed;

  // 객체생성방법 //Constructor
  public Car(String color) {
    this.color = color;
  }

  // 행위정의
  public void speedUp(int speed) {
    System.out.println("속도를 높이다");
    this.speed = speed;
  }
  public void speedDown(int speed) {
    System.out.println("속도를 줄이다");
    this.speed = speed;
  }

  // 속성의 접근 (getter, setter)
  public int getSpeed() {
    return speed;
  }

  public void setColor(String color) {
    this.color = color;
  }

  // 객체의 상태 //toString
  @Override
  public String toString() {
    return "Car{" +
            "color='" + color + '\'' +
            ", speed=" + speed +
            '}';
  }
}


