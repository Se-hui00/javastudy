package com.kh.day15.h;

import java.util.TreeSet;

public class Main2 {
  public static void main(String[] args) {
    TreeSet<Person> person1 = new TreeSet<Person>(new MyComparator1());
    person1.add(new Person("케로로", 10));
    person1.add(new Person("도로로", 20));
    person1.add(new Person("기로로", 30));
    person1.add(new Person("타마마", 40));
    System.out.println(person1);


    TreeSet<Person> person2 = new TreeSet<Person>(new MyComparator2());
    person2.add(new Person("케로로", 10));
    person2.add(new Person("도로로", 20));
    person2.add(new Person("기로로", 30));
    person2.add(new Person("타마마", 25));
    System.out.println(person2);
  }
}



