package com.kh.day12.f;

public class Main2 {
  public static void main(String[] args) {
    Person p1 = new Person("케로로", 20);
    Person p2 = new Person("케로로", 20);

    System.out.println(p1 == p2);
    System.out.println(p1.equals(p2));


  }
}
