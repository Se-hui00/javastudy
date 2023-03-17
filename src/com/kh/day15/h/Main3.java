package com.kh.day15.h;

public class Main3 {
  public static void main(String[] args) {
    String str1 = "가나다";
    String str3 = "가다";

    System.out.println(str1.compareTo(str3));

    int x = 10;
    int y = 20;

    Integer x2 = x;
    Integer y2 = y;

    System.out.println(x2.compareTo(y2)); // compareTo 뒤에가 크면 음수가 나옴
  }
}
