package com.kh.day14.i;

public class A {
  void abc(double score) throws ScoreException {
    if (score >= 3.0) {
      System.out.println("장학금 대상자입니다");
    } else {
      System.out.println("학점 미달입니다");
    }
  }
}
