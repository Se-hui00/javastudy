package com.kh.day16.ex7;

import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    MyData md1 = new MyData("자바 프로그램");
    MyData md2 = new MyData("반가워");
    MyData md3 = new MyData("감사합니다");
    TreeSet<MyData> treeSet = new TreeSet<>();
    treeSet.add(md1);
    treeSet.add(md2);
    treeSet.add(md3);
    System.out.println(treeSet);

    treeSet.add(md3); // 추가하지 못하고 덮어씀
    System.out.println(treeSet);



  }
}
