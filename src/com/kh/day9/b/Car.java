package com.kh.day9.b;

public class Car {
  private int num;
  private int speed;
  private String color;

  public void speedUp() {
    System.out.println("속도를 올립니다");
    this.speed += 10;
  }

  public void speedDown() {
    System.out.println("속도를 내립니다");
    this.speed -= 10;
  }

  public int getNum() {
    System.out.println("차량번호는 수정이 불가능합니다");
    return num = 2356;
  }

  public int getSpeed() {
    return speed;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    return "Car{" +
            "num=" + num +
            ", speed=" + speed +
            ", color='" + color + '\'' +
            '}';
  }
}
