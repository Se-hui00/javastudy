package com.kh.day13.ex11;

import java.util.Objects;

public class Main {
  public static void main(String[] args) {
    A a1 = new A(3);
    A a2 = new A(3);
    System.out.println(a1.equals(a2));
    System.out.println(a1 == a2);

    System.out.println(Objects.hash("케로로", 20));
    System.out.println(Objects.hash("케로로", 20));

    System.out.println(a1.hashCode() == a2.hashCode());
  }
}


