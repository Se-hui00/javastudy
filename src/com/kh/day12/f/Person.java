package com.kh.day12.f;

import java.util.Objects;

public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 이름이 같으면 true
//  @Override
//  public boolean equals(Object obj) {
//    boolean flag = false;
//    if (obj instanceof Person) {
//      Person person = ((Person) obj);
//      if (this.name.equals(person.name) && this.equals(age)) {
//        flag = true;
//      }
//    } else {
//      return flag;
//    }
//    return flag;
//  }

  // alt + insert -> equals
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
}






