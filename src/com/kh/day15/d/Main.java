package com.kh.day15.d;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    // hashset 객체 생성
    HashSet<String> set = new HashSet<>();

    // 추가
    set.add("사과");
    set.add("포도");
    set.add("망고");
    set.add("포도");
    System.out.println(set);

    // 검색
    System.out.println(set.contains("망고")); // true
    System.out.println(set.contains("오렌지"));  // false

    // 삭제
    set.remove("사과");
    System.out.println(set.contains("사과"));
    System.out.println(set);

    // 조회
    for (String ele : set) {
      System.out.printf("%s ",ele);
    }
  }
}


