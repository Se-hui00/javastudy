package com.kh.day16.c;
// FIFO 선입선출
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    Message msg1 = new Message("문자1");
    Message msg2 = new Message("문자2");
    Message msg3 = new Message("문자3");

    Queue<Message> messages = new LinkedList<>();
    // 추가
    messages.add(msg1);
    messages.add(msg2);
    messages.add(msg3);
    System.out.println(messages);

    // 검색 without removing
    Message m1 = messages.element();
    System.out.println(m1);
    Message m2 = messages.element();
    System.out.println(m2);
    Message m3 = messages.element();
    System.out.println(m3);

    // 추출 with removing
    Message mm1 = messages.remove();
    System.out.println(mm1);
    Message mm2 = messages.remove();
    System.out.println(mm2);
    Message mm3 = messages.remove();
    System.out.println(mm3);
    System.out.println(messages.size());

    // 다 지웠기 때문에 오류남
//    System.out.println(mm4);

  }
}









