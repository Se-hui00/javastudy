package com.kh.day16.a;

import java.util.*;

public class Test2 {
  public static void main(String[] args) {
    TreeMap<String, Integer> scores = new TreeMap<>();

    scores.put("케로로60", 60);
    scores.put("케로로30", 30);
    scores.put("케로로90", 90);
    scores.put("케로로20", 20);
    scores.put("케로로50", 50);

    System.out.println(scores); // 앞에서부터 차례대로 비교하고 오름차순으로 정렬

    System.out.println(scores.firstKey());
    System.out.println(scores.firstEntry());  // Entry 추출

    // value 값만 추출
    Map.Entry<String, Integer> ele = scores.firstEntry();
    Integer value = ele.getValue();
    System.out.println(value);

    // value 값만 추출 (간단!!)
    System.out.println(scores.firstEntry().getValue());

    // 매개변수로 입력된 key 값보다 작은 key 값 중 가장 큰 key 값 리턴
    System.out.println(scores.lowerKey("케로로60"));

    // 매개변수로 입력된 key 값보다 작은 key 값 중 가장 큰 entry 값 리턴
    System.out.println(scores.lowerEntry("케로로60"));

    // 매개변수로 입력된 key 값보다 큰 key 값 중 가장 작은 key 값 리턴
    System.out.println(scores.higherKey("케로로60"));

    // 매개변수로 입력된 key 값보다 큰 key 값 중 가장 작은 entry 리턴
    System.out.println(scores.higherEntry("케로로60"));

    // Map 원소 중 가장 작은 key 값을 갖는 엔트리를 리턴
//    Map.Entry<String, Integer> firstEntry = scores.pollFirstEntry();
//    System.out.println(firstEntry);
//    System.out.println(scores);

    // toKey 미만의 값을 잦는 모든 엔트리를 포함한 Map 객체 리턴 (toKey 미포함)
    SortedMap<String, Integer> headMap = scores.headMap("케로로60"); // false 생략
    // toKey 이하는 true를 포함
//    SortedMap<String, Integer> headMap = scores.headMap("케로로60", true);
    System.out.println(headMap);

    // 매개값 이상 (from key 포함)   // false를 포함하면 초과
    SortedMap<String, Integer> tailMap = scores.tailMap("케로로60", false);
    System.out.println(tailMap);

    // 30 이상 60 미만
    NavigableMap<String, Integer> subMap = scores.subMap("케로로30", true, "케로로60", false);
    System.out.println(subMap);

    // 내림차순
    NavigableMap<String, Integer> descendingMap = scores.descendingMap();
    System.out.println(descendingMap);

    // 다시 오름차순
    NavigableMap<String, Integer> descendingMap2 = descendingMap.descendingMap();
    System.out.println(descendingMap2);

    // key 내림차순
    NavigableSet<String> names = scores.descendingKeySet();
    System.out.println(names);

  }
}








