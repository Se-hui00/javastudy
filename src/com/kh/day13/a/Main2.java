package com.kh.day13.a;

public class Main2 {
  public static void main(String[] args) throws CloneNotSupportedException {
    Person p1 = new Person("케로로", 20);
    System.out.println(p1.name);
    System.out.println(p1.age);

    Person cloneOfP1 = (Person)p1.clone();
    System.out.println(cloneOfP1.name);
    System.out.println(cloneOfP1.age);

    // 주소비교
    System.out.println(p1 == cloneOfP1);

    // 내용비교
    System.out.println(p1.equals(cloneOfP1));
    System.out.println(p1.hashCode() == cloneOfP1.hashCode());
  }
}
