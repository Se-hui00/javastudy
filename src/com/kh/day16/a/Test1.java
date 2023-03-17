package com.kh.day16.a;

import java.util.*;

public class Test1 {
  public static void main(String[] args) {
    // 제너릭 타입
    Map<String, Integer> scores = new HashMap<>();// key: 이름 value: 점수

    // 추가
    scores.put("케로로",50);
    scores.put("기로로",80);
    scores.put("도로로",70);
    // 중복 키는 entry 대체
    System.out.println(scores.put("도로로",70));


    System.out.println(scores);

    // 수정
    scores.replace("도로로",100);
    System.out.println(scores);

    // 검색
    Integer val = scores.get("도로로");
    System.out.println("도로로의 점수 : " + val);

    // key 값 존재 유무 검색
    if (scores.containsKey("도로로")) {
      System.out.println("존재하는 key 입니다");
    } else {
      System.out.println("존재하지 않는 key 입니다");
    }

    // value 값 존재 유무 검색
    if (scores.containsValue(100)) {
      System.out.println("존재하는 value 입니다");
    } else {
      System.out.println("존재하지 않는 value 입니다");
    }

    // 모든 key 값 추출
    Set<String> names = scores.keySet();
    System.out.println("학생 이름 나열 : " + names);

    // 모든 value 값 추출
    Collection<Integer> values = scores.values();
    System.out.println("점수 나열 : " + values);

    // 모든 entry(key, value 함께) 추출 // 일반 for문 사용 X
    Set<Map.Entry<String, Integer>> entries = scores.entrySet();

    // 향상된 for문 사용
    for (Map.Entry<String, Integer> ele : entries) {
      String key = ele.getKey();
      Integer value = ele.getValue();
      System.out.printf("%s %d\t",key,value);
    }

    System.out.println();

    // Iterator 사용
    Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, Integer> next = iterator.next();
      String key = next.getKey();
      Integer value = next.getValue();
      System.out.printf("%s %d\t",key,value);
    }

    System.out.println();

    // 삭제
    scores.remove("도로로");
    System.out.println(scores);

    // 전체 삭제
    scores.clear();
    System.out.println("요소 갯수 : " + scores.size());

  }
}








