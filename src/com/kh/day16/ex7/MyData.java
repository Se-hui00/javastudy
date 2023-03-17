package com.kh.day16.ex7;
// 파라미터를 정해주지 않으면 제일 상위 타입인 오브젝트로 변환됨
public class MyData implements Comparable<MyData>{
  String str;


  public MyData(String str) {
    this.str = str;
  }

//  @Override
//  public int compareTo(MyData o) {
//    return 0; // 덮어쓰게됨
//  }


  // 값을 add할 때 비교하는 메소드
  @Override
  public int compareTo(MyData o) {
    return str.compareTo(o.str);
  }

  @Override
  public String toString() {
    return str;
  }
}




