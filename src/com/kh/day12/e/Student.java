package com.kh.day12.e;

public class Student extends Person{

  String name = "이노스케";
  static int age = 30;

  @Override
  public void eat() {
    System.out.println("맛있게 먹다");
  }
}
