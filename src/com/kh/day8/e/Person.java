package com.kh.day8.e;

public class Person {
  // 속성
  private String name;
  private int age;

  // 생성자 메소드: 객체를 생성하기 위해 호출되는 메소드
  // 1. 반환타입이 없다
  // 2. 클래스 이름과 동일하다
  // 디폴트 생성자 메소드
  // 1. 매개변수가 없고 실행문이 없다
  // 2. 개발자가 정의하지 않아도 컴파일러가 자동 추가한다
  // (단, 생성자가 하나도 없을 때)
//  public Person() {
//
//  }
   public Person() {}

  public Person(String name) {
    this.name = name;
  }

  public Person(int age) {
     this.age = age;
  }

  public Person(String name, int age) {
     this.name = name;
     this.age = age;
  }

  // 행위
  public void smile() {
    System.out.println("웃다");
  }

  public void sleep() {
    System.out.println("자다");
  }

  public void setAge(int age) {
    if (age < 1 || age > 100) {
      return;
    }
     this.age = age;
  }

  public int getAge() {
     return this.age;
  }
}


