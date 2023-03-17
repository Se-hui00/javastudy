package com.kh.sec01_inheritancepolymorpism.EX01_Inheritance;

public class Student extends Human{
  int studentID;

  @Override
  void eat() {
    // 추가
//    super.eat();
//    System.out.println("설거지하다");
    // 전체수정
//    System.out.println("설거지하다");
    // 일부 수정
    System.out.println("맛있게 먹다");
  }
  void goToSchool() {

  }
}
