package com.kh.day16.b;
// LIFO 후입선출 // 나중에 입력된 데이터가 먼저 출력
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Dish dish1 = new Dish("노랑");
    Dish dish2 = new Dish("파랑");
    Dish dish3 = new Dish("빨강");

    Stack<Dish> dishes = new Stack<>();

    // 저장
    dishes.push(dish1); // 순서 3
    dishes.push(dish2); // 순서 2
    dishes.push(dish3); // 순서 1

    System.out.println(dishes);

    // 추출 (peak) without removing
    // 가장 상위에 있는 원솟값 리턴(데이터는 변화 없음)
    Dish first1 = dishes.peek();
    System.out.println(first1);
    System.out.println(dishes);

    // 검색
    int position = dishes.search(dish3);  // 못 찾으면 -1
    System.out.println(position);

    // 추출 (pop) with removing
    Dish first2 = dishes.pop();  // 마지막에 저장된 값이 지워짐
    System.out.println(first2);
    System.out.println(dishes);

    // 삭제
    dishes.clear();
    System.out.println(dishes.size());
  }
}





