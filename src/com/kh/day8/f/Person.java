package com.kh.day8.f;
import java.lang.*;

public class Person {
  private String name;
  private int age;

  public Person(){
    super();    // 부모클래스의 디폴트 생성자 호출 (Object 클래스)
  }

  // 속성의 기능을 만들어줌
  public void smile() {
    System.out.println("웃다");
  }

  public void sleep() {
    System.out.println("자다");
  }

  // get, set은 속성을 수정하거나 사용하는 용도
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}

