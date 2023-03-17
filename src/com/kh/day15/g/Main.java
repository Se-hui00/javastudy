package com.kh.day15.g;
// 이진트리를 사용하기 때문에 검색 속도 향상
// 왼쪽 자식 노드: 부모보다 적은 값
// 오른쪽 자식 노드: 부모보다 큰 값
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    TreeSet<Integer> treeSet = new TreeSet<>();

    // 6,3,9,2,5
    treeSet.add(6);
    treeSet.add(3);
    treeSet.add(9);
    treeSet.add(2);
    treeSet.add(5);

    // 메소드로 바로 추출 가능
    System.out.println("최소값 = " + treeSet.first());
    System.out.println("최대값 = " + treeSet.last());

  }
}

