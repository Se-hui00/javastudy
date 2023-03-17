package com.kh.day15.h;

import java.util.Objects;

public class Person implements Comparable{
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

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

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

  // 오름차순
  @Override
  public int compareTo(Object o) {

    int result = 0;

    if (o instanceof Person) {
    Person person = (Person)o;
      if (this.age > person.age) {
        return 1;
      } else if (this.age < person.age) {
        return -1;
      }
    }
    return result;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}




