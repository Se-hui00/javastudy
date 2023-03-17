package com.kh.day15.h;

import java.util.TreeSet;

public class Main4 {
  public static void main(String[] args) {
    TreeSet<Person> persons = new TreeSet<>(new MyComparator3());

    persons.add(new Person("케로로",20));
    persons.add(new Person("케로로",10));
    persons.add(new Person("케로로",15));
    persons.add(new Person("케로다",15));

    System.out.println(persons);
  }
}

