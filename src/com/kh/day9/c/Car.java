package com.kh.day9.c;

public class Car {

  // 속성 : 차량번호, 운행속도, 색상
  private int number;
  private int speed;
  private String color;
  private final int SPEED_STEP = 10;

  // 생성자
  public Car(int number, String color) {
    this.number = number;
    this.color = color;
  }

  // 행위 : 가속하다, 감속하다
  public void speedUp() {
    if (this.speed + SPEED_STEP > 240) {
      return;
    }
    speed += SPEED_STEP;
  }

  public void speedDown() {
    if (this.speed - SPEED_STEP < 0) {
      return;
    }
    speed -= SPEED_STEP;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getNumber() {
    return number;
  }

  public int getSpeed() {
    return speed;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Car{" +
            "number=" + number +
            ", speed=" + speed +
            ", color='" + color + '\'' +
            '}';
  }
}



