package com.kh.day13.b;

import java.util.Objects;

public class Person implements Cloneable{
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void smile() {
    System.out.println("스마일");
  }

  public void eat() {
    System.out.println("냠");
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
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

  // ctrl + o
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
