package com.kh.day15.h;

import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    TreeSet<Person> peoples = new TreeSet<>();
    peoples.add(new Person("케로로", 10));
    peoples.add(new Person("도로로", 20));
    peoples.add(new Person("기로로", 30));
    peoples.add(new Person("타마마", 25));

    System.out.println(peoples.toString());

    System.out.println("나이가 가장 많은 사람: " + peoples.last());

  }
}





