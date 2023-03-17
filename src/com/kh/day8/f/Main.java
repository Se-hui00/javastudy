package com.kh.day8.f;

public class Main {
  public static void main(String[] args) {
    Person p = new Person();
    Person p2 = new Person();
    Person p3 = new Person();

    Person[] personArr = new Person[3];
    personArr[0] = p;
    personArr[1] = p2;
    personArr[2] = p3;

    for (int i = 0; i < personArr.length; i++) {
      System.out.printf("%s, %d\n", personArr[i].getName(),personArr[i].getAge());
    }
    personArr[0].setName("홍길동");
    personArr[0].setAge(20);
    personArr[1].setName("홍길이");
    personArr[1].setAge(30);
    personArr[2].setName("홍길삼");
    personArr[2].setAge(40);

    for (int i = 0; i < personArr.length; i++) {
      System.out.printf("%s,%d\n", personArr[i].getName(),personArr[i].getAge());
    }
  }
}


