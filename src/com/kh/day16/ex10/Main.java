package com.kh.day16.ex10;
// FIFO
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.offer("땡큐");  // 추가
    queue.offer("베리");
    queue.offer("감사");
    queue.poll();           // 가장 먼저 저장된 값을 반환하고 제거
    queue.offer("방가");

    System.out.println(queue.peek()); // 가장 먼저 저장된 값을 반환
    System.out.println(queue.poll()); // 가장 먼저 저장된 값을 반환하고 제거
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }
}




