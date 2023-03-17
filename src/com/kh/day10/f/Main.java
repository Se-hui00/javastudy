package com.kh.day10.f;

public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 10;
    // x, y의 합을 구하는 메소드를 추가 정의하여 구현하시오

    // case1)
    int sum = x + y;
    System.out.println("sum = " + sum);

    // case2)
    sum = sum(x,y);
    System.out.println("sum = " + sum);

    // case3)
    int sum3 = sum(new int[]{x,y});
    System.out.println("sum3 = " + sum3);

    // case4)
    int[] values3 = new int[2];
    values3[0] = x;
    values3[1] = y;
    sum2(values3);
    System.out.println("sum = " + values3[2]);

    // case5
    A a = new A(x,y);
    int sum5 = sum(a);
    System.out.println("sum5 = " + sum5);
  }

  static int sum(int x, int y) {
    int sum = 0;
    sum = x + y;
    return sum;
    // return x + y // 표현식이 바로 올 수 있음
  }

  // 참조타입은 기본 타입이 아닌 것들
  static int sum(int[] values) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    return sum;
  }

  static void sum2(int[] values) {
    values[2] = values[0] + values[1];
  }

  static int sum(A a) {
      return a.getVal1() + a.getVal2();
  }
}





