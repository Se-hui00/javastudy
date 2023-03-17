package com.kh.day9.a;

import java.lang.*;

public class Person extends Object {  // class : 설계도
  // 속성
  private String name;
  private int age;

  public Person(){
    super();  // 상위 클래스의 디폴트 생성자 호출
  }


  // 행위(역할 정의)
  public void smile() {
    System.out.println("웃다");
  }
  public void sleep() {
    System.out.println("자다");
    age++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;   // this : 설계도를 통해서 만들어질 실체(instance)
  }

  public int getAge() {
    return age;
  }
}


