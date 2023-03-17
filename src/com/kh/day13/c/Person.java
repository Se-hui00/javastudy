package com.kh.day13.c;
// 하위 개념 확장 불가 (상속 불가)
final public class Person {
  final String name;

  public Person(String name) {
    this.name = name;
  }

  // 하위 개냠에서 메소드 재정의 불가
  final public void eat() {
    System.out.println("념념");
  }
}
