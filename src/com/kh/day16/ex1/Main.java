package com.kh.day16.ex1;
// p.712
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    System.out.println(list1);

    List<Integer> list2 = Arrays.asList(1, 2);  // 크기가 고정됨, 배열처럼 사용
//    list2.add(3); // 요소의 길이 추가 불가  // 런타임 오류 발생
//    list2.remove(1);  // 요소의 길이 축소 불가 // 런타임 오류 발생

    // 검색 가능
    Integer integer = list2.get(1);
    System.out.println(integer);

    // 수정 가능
    list2.set(1,3);
    System.out.println(list2);
  }
}


