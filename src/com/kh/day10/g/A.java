package com.kh.day10.g;

public class A {

  void averageScore(int ... values) { // 가변변수
    double result = 0.0;
    int sum= 0;
    for (int value: values) {
      sum += value;
    }
    result = (double) sum/ values.length;
    System.out.println(result);
  }
}


