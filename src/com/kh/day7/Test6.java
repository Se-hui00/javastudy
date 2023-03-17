package com.kh.day7;

public class Test6 {
  public static void main(String[] args) {
    String name = "홍길동";
    System.out.println(name);
    System.out.println(name.toString());  // 편리함을 위해 toString()이 생략되어 있음
    System.out.println(System.identityHashCode(name)); // 매개값의 메모리주소

    String name2 = "홍길동";
    System.out.println(System.identityHashCode(name2));

    String name3 = new String("홍길동");
    System.out.println(System.identityHashCode(name3));

    String name4 = new String("홍길동");
    System.out.println(System.identityHashCode(name4));
    // new라는 키워드를 사용하면 주소값이 다름

    String name5 = "홍길동";
    System.out.println(System.identityHashCode(name2));

  }
}


