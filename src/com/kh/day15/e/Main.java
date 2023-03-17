package com.kh.day15.e;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    HashSet<Person> persons = new HashSet<>();

    // set은 동일한 객체가 있으면 덮어쓴다
    persons.add(new Person("케로로", 12));
    persons.add(new Person("도로로", 17));
    persons.add(new Person("기로로", 15));
    persons.add(new Person("기로로", 15));

    // 저장한 순서대로 나오지 않음
    System.out.printf("%s %d", persons.toString(), persons.size());

    // iterator 사용하여 요소를 순차적으로 접근
    Iterator<Person> persons2 = persons.iterator();
    while (persons2.hasNext()) {
      Person person = persons2.next();
      System.out.println(person);
    }

    // 향상된 for문을 사용하여 요소를 순차적으로 접근
    for (Person person:persons) {
      System.out.println(person);
    }
  }
}


