package com.kh.day14.a;

public interface Soundable {
  // 상수
  int X = 10; // public static final 생략됨

  // 추상메소드

  // 자연적으로 abstract, public 붙어있기 때문에 생략가능
  void sound(); // public abstract

  // 디폴트 메소드
  // 정적 메소드
}
