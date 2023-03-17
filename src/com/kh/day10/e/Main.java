package com.kh.day10.e;

import java.util.Arrays;

// 중요해옹!!
public class Main {
  public static void main(String[] args) {
    A a = new A();

    int m = 5;
    int[] n = {1,2,3};

    m = a.abc(m);
    a.bcd(n);

    System.out.println(m);  // 5
    System.out.println(Arrays.toString(n));  // [4,5,6]
  }
}


