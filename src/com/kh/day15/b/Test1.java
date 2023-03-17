package com.kh.day15.b;
// <> 참조타입만 가능 wrapper 클래스 참고
import java.util.*;

public class Test1 {
  public static void main(String[] args) {

    int x = 10;
    Integer x2  = Integer.valueOf(x);

    Integer x3 = x; // auto boxing (기본타입 -> 참조타입)
    int y = x3; // unboxing (참조타입 -> 기본타입)

    // List 계열의 ArrayList 객체 생성
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    // 추가
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(3);
    list1.add(4);
    System.out.println(list1.toString());

    // 삭제 : value of Element : 3
    list1.removeAll(List.of(3));  // 3이 모두 없어짐
    list1.remove((1));// 중복된 값이 있으면 하나만 삭제함
    System.out.println(list1.toString());

    // 수정
    list1.set(0,10);
    System.out.println(list1.toString());

    // 추가 (컬렉션) 뒤에 추가됨
    list1.addAll(List.of(20,30,40));
    System.out.println(list1.toString());

//    list1.addAll(2,List.of(25,27));
//    System.out.println(list1.toString());
//
//    // 조회
//    System.out.println(list1.get(3)); // 27
//
//    // 전체조회
//    // 1. 일반 for문
//    for (int i = 0; i < list1.size(); i++) {
//      System.out.printf("%-3d", list1.get(i));
//    }
//    System.out.println();
//
//    // 2. 향상된 for문
//    for (Integer ele : list1) {
//      System.out.printf("%-3d",ele);
//    }
//    System.out.println();
//
//    // list -> 배열로 변환
//    Object[] objects = list1.toArray();
//    for (Object ele : objects) {
//      System.out.println((Integer)ele);
//    }
//    System.out.println(Arrays.toString(objects));
//
//    // 컬렉션이 비워졌는지 여부
//    if (list1.isEmpty()) {
//      System.out.println("요소가 없다");
//    } else {
//      System.out.println("요소가 있다");
//
//      // 모든 요소를 비우기
//      list1.clear();
//      System.out.println(list1.size() == 0);
//    }

  }
}
