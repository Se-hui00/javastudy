package com.kh.day11.a;

public class Person {

  private String name;
  private int age;


  public Person(int age) {
    super();
    this.age = age;
  }


  // 생성자 메소드
  public Person(String name) {
    this(1);
    this.name = name;
  }
  public void smile() {
    System.out.println("웃다");
  }

  public void sleep() {
    System.out.println("자다");
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
