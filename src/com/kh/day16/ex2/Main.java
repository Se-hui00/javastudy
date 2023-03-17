package com.kh.day16.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);   // [2, 3, 4]
    Integer ele = list.remove(2);
    System.out.println(ele);
    System.out.println(list);   // [2, 3]
  }
}


