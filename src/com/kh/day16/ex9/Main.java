package com.kh.day16.ex9;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<Double> stack = new Stack<Double>();
    stack.push(1.1);
    stack.push(2.2);
    stack.pop();          // 맨 위에 있는 데이터를 꺼낸다 (2.2)
    stack.push(3.3);
    stack.push(4.4);

    // stack.search(A) A가 있는 인덱스 위치 반환
    System.out.println(stack.search(1.1));  // 처음 저장된 데이터가 맨 밑에
    System.out.println(stack.search(2.2));  // 데이터가 없으면 -1
    System.out.println(stack.search(3.3));  // 2
    System.out.println(stack.search(4.4));  // 마지막에 저장된 데이터가 첫번째
  }
}








